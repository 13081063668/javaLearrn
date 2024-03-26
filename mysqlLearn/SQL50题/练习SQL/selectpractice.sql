#1查询01课程比02课程成绩高的学生信息以及课程分数
select 
c.*,
a.s_score as s1,
b.s_score as s2
from
score as a,score as b,student as c
where a.c_id='1'
and b.c_id='2'
and a.s_id=b.s_id
and c.s_id=a.s_id
and a.s_score>b.s_score

#长形数据变成宽型数据
select 
	a.s_id,
	max(case when a.c_id='01' then a.s_score else null end ) as s1,
	max(case when a.c_id='02' then a.s_score else null end ) as s2,
	max(case when a.c_id='03' then a.s_score else null end ) as s3
FROM
	score a
GROUP BY
	a.s_id
#方法2
select
	s.*,
	t.s1,t.s2
from
	(
	select 
	a.s_id,
	max(case when a.c_id='01' then a.s_score else null end ) as s1,
	max(case when a.c_id='02' then a.s_score else null end ) as s2,
	max(case when a.c_id='03' then a.s_score else null end ) as s3
FROM
	score as a
GROUP BY
	a.s_id
	)t, Student s
	where t.s1>t.s2
	and t.s_id=s.s_id

#2.查询01比02课程低的学生
select
	s.*,
	t.s1,t.s2
from
	(
	select 
	a.s_id,
	max(case when a.c_id='01' then a.s_score else null end ) as s1,
	max(case when a.c_id='02' then a.s_score else null end ) as s2,
	max(case when a.c_id='03' then a.s_score else null end ) as s3
FROM
	score as a
GROUP BY
	a.s_id
	)t, Student s
	where t.s1<t.s2
	and t.s_id=s.s_id
	
	#3.查询平均成绩大于60分的同学的学生编号和学生姓名和平均分
	select
		a.s_id,
		b.s_name,
		avg(a.s_score) avg_s
		
	from 
		score a left JOIN student b
		on a.s_id=b.s_id
	GROUP BY
	a.s_id
	having 
	avg_s>=60;
	#方法2
	select
		a.s_id,
		(select s_name from student where s_id=a.s_id)s_name,
		avg(a.s_score) avg_s
		
	from 
		score a 
	GROUP BY
	a.s_id
	having 
	avg_s>=60;
	#4.查询平均成绩小于60分的同学的学生编号和学生姓名和平均分
	select
		b.s_id,
		b.s_name,
		ifnull (avg(a.s_score),0) avg_s	
	from 
		score a right JOIN student b
		on a.s_id=b.s_id
	GROUP BY
	b.s_id
	having 	avg_s<60
#5.查询所有同学的学生编号、学生姓名、选课总数、所有课程的总成绩
select
	b.s_id,
	b.s_name,
	count(a.c_id) cot_s,
	IFNULL(sum(a.s_score),0) sum_s
from
	score a
right join
	student b
on a.s_id=b.s_id
group by 
	a.s_id

#6.查询“李”姓老师的数量
select t_id,t_name, count(t_id) cont from teacher where t_name LIKE '李%'

#7查询学过“张三”老师授课的学生信息
select
 a.*
 from
 student a,teacher b,course c,score d
 where 
 d.s_id=a.s_id
 and c.t_id=b.t_id
 and d.c_id=c.c_id
 and b.t_name='张三'
#8查询没有学过“张三”的授课的学生信息
select * from student where s_id not in(
select
 d.s_id
 from
teacher b,course c,score d
 where 
		 c.t_id=b.t_id
 and d.c_id=c.c_id
 and b.t_name='张三');
#方法2
-- select * from student where not exits(
-- select
--  student.s_id
--  from
-- (select
--  d.s_id
--  from
-- teacher b,course c,score d
--  where 
-- 		 c.t_id=b.t_id
--  and d.c_id=c.c_id
--  and b.t_name='张三')t,student
--  where t.s_id=student.s_id);
#9查询学过编号为‘1’并且也学过编号为‘02’的课程的同学的信息
select 
c.*
from
score as a,score as b,student as c
where a.c_id='1'
and b.c_id='2'
and a.s_id=b.s_id
and c.s_id=a.s_id

#10查询学过编号01但是没有学过02的同学信息
select student.* from
(select
	a.s_id,
	MAX(case when c_id='1' then s_score end)s01,
	max(case when c_id='2' then s_score end)s02
from
	score a
	group by a.s_id) t,student
	where
	t.s_id=student.s_id
	and t.s01 is not null#或者写的>=0
	and t.s02 is null
#11查询没有学全所有课程的同学信息
select 
	a.*,
	count(b.c_id) cnt
from
	student a
	left join
	score b
on a.s_id=b.s_id
group by 
a.s_id
having 
count(b.c_id)<(select count(c_id) from course)


#12查询至少有1门课与01所学的相同的同学信息
select DISTINCT
	a.*
	from
	student a
	left join
	score b
on a.s_id=b.s_id
where b.c_id in
(select c_id from score where s_id='1')
and a.s_id<>'1'

#13查询和‘1’号学生学习课程完全相同的其他学生的信息
select s2.s_id,student.s_name
from score as s1 
join score as s2 
on s1.c_id = s2.c_id
join student on student.s_id = s2.s_id
and s1.s_id = '01'
and s2.s_id != '01'
group by s2.s_id,student.s_id
having count(s2.c_id) = (select count(*) from score where s_id = '01')
-- 14、查询没学过"张三"老师讲授的任一门课程的学生姓名 
select a.s_name from student a where a.s_id not in (
    select s_id from score where c_id = 
                (select c_id from course where t_id =(
                    select t_id from teacher where t_name = '张三')) 
                group by s_id);
 
-- 15、查询两门及其以上不及格课程的同学的学号，姓名及其平均成绩 
select a.s_id,a.s_name,ROUND(AVG(b.s_score)) from 
    student a 
    left join score b on a.s_id = b.s_id
    where a.s_id in(
            select s_id from score where s_score<60 GROUP BY  s_id having count(1)>=2)
    GROUP BY a.s_id,a.s_name
 
-- 16、检索"01"课程分数小于60，按分数降序排列的学生信息
select a.*,b.c_id,b.s_score from 
    student a,score b 
    where a.s_id = b.s_id and b.c_id='01' and b.s_score<60 ORDER BY b.s_score DESC;
 
-- 17、按平均成绩从高到低显示所有学生的所有课程的成绩以及平均成绩
select a.s_id,(select s_score from score where s_id=a.s_id and c_id='01') as 语文,
                (select s_score from score where s_id=a.s_id and c_id='02') as 数学,
                (select s_score from score where s_id=a.s_id and c_id='03') as 英语,
            round(avg(s_score),2) as 平均分 from score a  GROUP BY a.s_id ORDER BY 平均分 DESC;
-- 18.查询各科成绩最高分、最低分和平均分：以如下形式显示：课程ID，课程name，最高分，最低分，平均分，及格率，中等率，优良率，优秀率
-- 及格为>=60，中等为：70-80，优良为：80-90，优秀为：>=90
-- round 函数主要是进行数值的小数点保留
-- 1、round(x,d)  x指要处理的数，d是指保留几位小数。这里有个值得注意的地方是，d可以是负数，这时是指定小数点左边的d位整数位为0,同时小数位均为0；
-- 2、round(x)  ,其实就是round(x,0),也就是默认d为0；
select a.c_id,b.c_name,
			MAX(s_score),
			MIN(s_score),
			AVG(s_score),
    ROUND(100*(SUM(case when a.s_score>=60 and a.s_score<=90 then 1 else 0 end)/SUM(case when a.s_score then 1 else 0 end)),2) as 及格率,
    ROUND(100*(SUM(case when a.s_score>=70 and a.s_score<=80 then 1 else 0 end)/SUM(case when a.s_score then 1 else 0 end)),2) as 中等率,
    ROUND(100*(SUM(case when a.s_score>=80 and a.s_score<=90 then 1 else 0 end)/SUM(case when a.s_score then 1 else 0 end)),2) as 优良率,
    ROUND(100*(SUM(case when a.s_score>=90 then 1 else 0 end)/SUM(case when a.s_score then 1 else 0 end)),2) as 优秀率
    from score a left join course b on a.c_id = b.c_id GROUP BY a.c_id
-- 19、按各科成绩进行排序，并显示排名

	-- 开窗函数：rank的使用	
		select 
		b.*,a.c_id,a.s_score,
		rank() over(partition by c_id order by s_score desc)rk
		from 
			score a,student b
		where a.s_id=b.s_id;
		
-- 20、查询学生的总成绩并进行排名


select
	t.*,
	rank() over(order by sum desc)rk
	from (
		select s_id,sum(s_score) sum
		from 
		score
		GROUP BY
		s_id
	)t
	
	
-- 21、查询不同老师所教不同课程平均分从高到低显示 
    select a.t_id,c.t_name,a.c_id,ROUND(avg(s_score),2) as avg_score from course a
        left join score b on a.c_id=b.c_id 
        left join teacher c on a.t_id=c.t_id
        GROUP BY a.c_id,a.t_id,c.t_name ORDER BY avg_score DESC;
-- 22、查询所有课程的成绩第2名到第3名的学生信息及该课程成绩
						select
							a.*,t.c_id ,t.s_score
							from
							student a
							left join
							(
								select
								a.c_id,a.s_id,a.s_score,
								rank() over(order by s_score desc)rk
						from
							score a
								)t
						on a.s_id=t.s_id
						where
						rk in(2,3)
						order by  s_score asc
				
						select c.*,a.c_id,a.s_score 
						from score a 
            left join score b on a.c_id = b.c_id and a.s_score<b.s_score
						join student c on a.s_id=c.s_id
            group by a.s_id,a.c_id,a.s_score 
						HAVING COUNT(b.s_id)<4 and COUNT(b.s_id)>1
            ORDER BY a.c_id asc,a.s_score DESC
 
-- 23、统计各科成绩各分数段人数：课程编号,课程名称,[100-85],[85-70],[70-60],[0-60]及所占百分比
 
 select a.c_id, b.c_name, 
sum(case when a.s_score>=85 then 1 else 0 end) as '[100-85]人数',
sum(case when a.s_score>=70 and a.s_score<85 then 1 else 0 end) as '[85-70]人数',
sum(case when a.s_score>=60 and a.s_score<70 then 1 else 0 end) as '[70-60]人数',
sum(case when a.s_score<60 then 1 else 0 end) as '[60-0]人数',
sum(case when a.s_score>=85 then 1 else 0 end)/count(a.s_id) as '[100-85]百分比',
sum(case when a.s_score>=70 and a.s_score<85 then 1 else 0 end)/count(a.s_id) as '[85-70]百分比',
sum(case when a.s_score>=60 and a.s_score<70 then 1 else 0 end)/count(a.s_id) as '[70-60]百分比',
sum(case when a.s_score<60 then 1 else 0 end)/count(a.s_id) as '[60-0]百分比'
from score as a inner join course as b on a.c_id=b.c_id
group by a.c_id;
 

-- 24、查询学生平均成绩及其名次 
-- 记得不要占用函数的名字（系统自带函数）
        select
				t.*,
				rank() over(order by avg_s desc) rk
				from
				(
				select
					s_id,avg(s_score) avg_s
					from
					score
					GROUP BY
					s_id
				)t
-- 25、查询各科成绩前三名的记录
            -- 1.选出b表比a表成绩大的所有组
            -- 2.选出比当前id成绩大的 小于三个的
        select a.s_id,a.c_id,a.s_score from score a 
            left join score b on a.c_id = b.c_id and a.s_score<b.s_score
            group by a.s_id,a.c_id,a.s_score HAVING COUNT(b.s_id)<3
            ORDER BY a.c_id asc,a.s_score DESC
 
-- 26、查询每门课程被选修的学生数 
 
        select c_id,count(s_id)as 人数 from score a GROUP BY c_id
 
-- 27、查询出只有两门课程的全部学生的学号和姓名 
        select s_id,s_name from student where s_id in(
                select s_id from score GROUP BY s_id HAVING COUNT(c_id)=2);
 
-- 28、查询男生、女生人数 
        select s_sex,COUNT(s_sex) as 人数  from student GROUP BY s_sex
 
-- 29、查询名字中含有"风"字的学生信息
 
        select * from student where s_name like '%风%';
 
-- 30、查询同名同性学生名单，并统计同名人数 
 
        select a.s_name,a.s_sex,count(*) from student a  JOIN 
                    student b on a.s_id !=b.s_id and a.s_name = b.s_name and a.s_sex = b.s_sex
        GROUP BY a.s_name,a.s_sex
 
 
 
-- 31、查询1990年出生的学生名单
 
        select s_name from student where s_birth like '1990%'
 
-- 32、查询每门课程的平均成绩，结果按平均成绩降序排列，平均成绩相同时，按课程编号升序排列 
 
    select c_id,ROUND(AVG(s_score),2) as avg_score from score GROUP BY c_id ORDER BY avg_score DESC,c_id ASC
 
-- 33、查询平均成绩大于等于85的所有学生的学号、姓名和平均成绩 
 
    select a.s_id,b.s_name,ROUND(avg(a.s_score),2) as avg_score from score a
        left join student b on a.s_id=b.s_id GROUP BY s_id HAVING avg_score>=85
 
-- 34、查询课程名称为"数学"，且分数低于60的学生姓名和分数 
 
        select a.s_name,b.s_score from score b LEFT JOIN student a on a.s_id=b.s_id where b.c_id=(
                    select c_id from course where c_name ='数学') and b.s_score<60
 
-- 35、查询所有学生的课程及分数情况； 
 
 
        select a.s_id,a.s_name,
                    SUM(case c.c_name when '语文' then b.s_score else 0 end) as '语文',
                    SUM(case c.c_name when '数学' then b.s_score else 0 end) as '数学',
                    SUM(case c.c_name when '英语' then b.s_score else 0 end) as '英语',
                    SUM(b.s_score) as  '总分'
        from student a left join score b on a.s_id = b.s_id 
        left join course c on b.c_id = c.c_id 
        GROUP BY a.s_id,a.s_name
 
 
 -- 36、查询任何一门课程成绩在70分以上的姓名、课程名称和分数； 
            select a.s_name,b.c_name,c.s_score from course b left join score c on b.c_id = c.c_id
                left join student a on a.s_id=c.s_id where c.s_score>=70
 
 
 
-- 37、查询不及格的课程
        select a.s_id,a.c_id,b.c_name,a.s_score from score a left join course b on a.c_id = b.c_id
            where a.s_score<60 
 
-- 38、查询课程编号为01且课程成绩在80分以上的学生的学号和姓名； 
        select a.s_id,b.s_name from score a LEFT JOIN student b on a.s_id = b.s_id
            where a.c_id = '01' and a.s_score>80
 
-- 39、求每门课程的学生人数 
        select count(*) from score GROUP BY c_id;
 
-- 40、查询选修"张三"老师所授课程的学生中，成绩最高的学生信息及其成绩
 
 
        -- 查询老师id   
        select c_id from course c,teacher d where c.t_id=d.t_id and d.t_name='张三'
        -- 查询最高分（可能有相同分数）
        select MAX(s_score) from score where c_id='02'
        -- 查询信息
        select a.*,b.s_score,b.c_id,c.c_name from student a
            LEFT JOIN score b on a.s_id = b.s_id
            LEFT JOIN course c on b.c_id=c.c_id
            where b.c_id =(select c_id from course c,teacher d where c.t_id=d.t_id and d.t_name='张三')
            and b.s_score in (select MAX(s_score) from score where c_id='02')
-- 41、查询不同课程成绩相同的学生的学生编号、课程编号、学生成绩 
    select DISTINCT b.s_id,b.c_id,b.s_score from score a,score b where a.c_id != b.c_id and a.s_score = b.s_score
-- 42、查询每门功成绩最好的前两名 
        -- 牛逼的写法
    select a.s_id,a.c_id,a.s_score from score a
        where (select COUNT(1) from score b where b.c_id=a.c_id and b.s_score>=a.s_score)<=2 ORDER BY a.c_id
-- 43、统计每门课程的学生选修人数（超过5人的课程才统计）。要求输出课程号和选修人数，查询结果按人数降序排列，若人数相同，按课程号升序排列  
        select c_id,count(*) as total from score GROUP BY c_id HAVING total>5 ORDER BY total,c_id ASC
-- 44、检索至少选修两门课程的学生学号 
        select s_id,count(*) as sel from score GROUP BY s_id HAVING sel>=2
-- 45、查询选修了全部课程的学生信息 
        select * from student where s_id in(        
            select s_id from score GROUP BY s_id HAVING count(*)=(select count(*) from course))
-- 46、查询各学生的年龄
    -- 按照出生日期来算，当前月日 < 出生年月的月日则，年龄减一
    select s_birth,(DATE_FORMAT(NOW(),'%Y')-DATE_FORMAT(s_birth,'%Y') - 
                (case when DATE_FORMAT(NOW(),'%m%d')>DATE_FORMAT(s_birth,'%m%d') then 0 else 1 end)) as age
        from student;
 
 
-- 47、查询本周过生日的学生
    select * from student where WEEK(DATE_FORMAT(NOW(),'%Y%m%d'))=WEEK(s_birth)
    select * from student where YEARWEEK(s_birth)=YEARWEEK(DATE_FORMAT(NOW(),'%Y%m%d'))
 
    select WEEK(DATE_FORMAT(NOW(),'%Y%m%d'))
 
-- 48、查询下周过生日的学生
    select * from student where WEEK(DATE_FORMAT(NOW(),'%Y%m%d'))+1 =WEEK(s_birth)
 
-- 49、查询本月过生日的学生
 
    select * from student where MONTH(DATE_FORMAT(NOW(),'%Y%m%d')) =MONTH(s_birth)
 
-- 50、查询下月过生日的学生
    select * from student where MONTH(DATE_FORMAT(NOW(),'%Y%m%d'))+1 =MONTH(s_birth)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	