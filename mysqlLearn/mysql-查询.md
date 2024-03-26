### 表名和字段
1. 学生表Student(s_id, s_name, s_birth, s_sex)
2. 课程表Course(c_id, c_name, t_id)
3. 教师表Teacher(t_id, t_name)
4. 成绩表(s_id, c_id, s_score)
---
### 问题和答案
1. 查询`"01"`课程比`02`课程成绩高的学生的信息及课程分数
    - 自连接
    ```sql
        select
            c.*,
            a.s_score s01,
            b.s_score s02
        from
            score a, score b, student c
        where 
            a.c_id = "01"
        and b.c_id = "02"
        and a.s_id = b.s_id
        and c.s_id = a.s_id
        and a.s_score>b.s_score;
    ``` 
    - 把长型数据编程宽型数据
    >   将  01 01 80
            01 02 90
            01 03 99  
        变为01 80 90 99
    ```sql
        select 
            s.*,
            t.s01,
            t.s02
        from
            (select 
                a.s_id,
                max(case when a.c_id="01" then a.s_score else null end) s01,
                max(case when a.c_id="02" then a.s_score else null end) s02
            from
                score a
            group by
                a.s_id) t, Student s
        where 
            t.s01 > t.s02
        and t.s_id=s.s_id;

    ```
2. 查询`"01"`课程比`"02"`成绩低的学生的信息及课程分数
    > 将上面大于等于(>) 修改为 小于(<)
3. 查询平均成绩大于60分的同学和学生编号和学生姓名的平均成绩
    - 子查询 avg group s_id having
    ```sql
        select
            a.s_id,
            (select s_name from student s where s.s_id=a.s_id) s_name,
            avg(a.s_score) avg_s
        from
            score a
        group by a.s_id
        having avg(a.s_score) >= 60;
    ```
    - 两个表连接
    ```sql
        select
            a.s_id,
            s.s_name,
            avg(a.s_score) avg_s
        from
            score a, student s
        where
            a.s_id=s.s_id
        group by a.s_id
        having avg(a.s_score) >= 60;
    ```
4. 查询平均成绩小于60分的同学和学生编号和学生姓名的平均成绩
    > 将上面大于等于(>=) 修改为 小于(<)
    - 如何查到无成绩的
    ```sql
        select
            a.s_id,
            s.s_name,
            ifnull(avg(a.s_score), 0) avg_s
        from
            score a
        right join
            student s
        on
            a.s_id=s.s_id
        group by 
            s.s_id
        having 
            ifnull(avg(a.s_score), 0) < 60;
    ```
5. 查询所有同学的学生编号、学生姓名、选课总数、所有课程的总成绩
    ```sql
        select
            a.s_id,
            b.s_name,
            count(a.c_id) cnt_s,
            sum(a.s_score) sum_s
        from
            score a
        inner join
            student b
        on 
            a.s_id=b.s_id
        group by
            a.s_id;
    ```
    - 选出未选课的人
    ```sql
        select
            b.s_id,
            b.s_name,
            count(a.c_id) cnt_s,
            ifnull(sum(a.s_score), 0) sum_s
        from
            score a
        right join
            student b
        on 
            a.s_id=b.s_id
        group by
            b.s_id,
            b.s_name;
    ```
6. 查询“李”姓老是的数量
    ```sql
        select count(*) cnt_t from teacher t where t.t_name like "李%";
    ```
7. 查询上过“张三”老师授课的学生
    ```sql
        select
            c.*
        from
            course a, score b, student c, teacher d
        where
            d.t_id=a.t_id
        and a.c_id=b.c_id
        and b.s_id=c.s_id
        and d.t_name="张三";
    ```
8. 查询没上过“张三”老师授课的学生
    - not in
    ```sql
        select * from student where s_id not in(
            select
                b.s_id
            from
                course a, score b,  teacher d
            where
                d.t_id=a.t_id
            and a.c_id=b.c_id
            and d.t_name="张三");
    ```
    - not exists
    ```sql
        select * from student where not exists(
            select 1 from 
                (select
                    b.s_id
                from
                    course a, score b,  teacher d
                where
                    d.t_id=a.t_id
                and a.c_id=b.c_id
                and d.t_name="张三") t
        where t.s_id=student.s_id);
    ```
9. 查询学过编号为`"01"`并且也学过编号为`"02"`课程的学生信息
    ```sql
        --- 自连接
        select
            c.*
        from
            score a, score b, student c
        where 
            a.c_id="01"
        and b.c_id="02"
        and a.s_id=c.s_id
        and b.s_id=c.s_id;
        --- 长数据转宽数据，自己写的，不知道对不对
        select 
            s.*
        from 
            (select
                a.s_id,
                max(case when a.c_id="01" then a.s_score else null end) s01,
                max(case when a.c_id="02" then a.s_score else null end) s02
            from
                score a
            group by
                a.s_id) t, student s
        where t.s_id=s.s_id
        and t.s01 is not null
        and t.s02 is not null;
        
    ```
10. 查询学过编号为`"01"`但没学过编号为`"02"`课程的学生信息
     ```sql
        --- 长数据转宽数据，自己写的，不知道对不对
        select 
            s.*
        from 
            (select
                a.s_id,
                max(case when a.c_id="01" then a.s_score else null end) s01,
                max(case when a.c_id="02" then a.s_score else null end) s02
            from
                score a
            group by
                a.s_id) t, student s
        where t.s_id=s.s_id
        and t.s01 is not null
        and t.s02 is null;
        
    ```
11. 查询没有学全所有课程的同学的信息
    ```sql
        --- 长转宽，自己写(这样没有8号， 因为其在score中没有数据)
        select
            s.*
        from
            (select
                a.s_id,
                count(a.c_id) cnt_s
            from
                score a
            group by
                a.s_id) t, student s, (select count(1) cnt_c from course) c
        where t.s_id=s.s_id
        and t.cnt_s < c.cnt_c;
        --- 左连接
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
            count(b.c_id) < (select count(1) from course);
        --- 
    ```
12. 查询至少有一门与学号为`"06"`的同学所学相同的同学的信息
    ```sql
        --- 自己写
        select * from student s, (
            select
                b.s_id
            from
                score a, score b
            where
                a.s_id="06"
            and a.s_id!=b.s_id
            and a.c_id=b.c_id
            group by
                b.s_id) t
        where s.s_id=t.s_id;
        --- 左连接 + distinct 去重
        select
            distinct a.*
        from
            student a
        left join
            score b
        on a.s_id=b.s_id 
        where c_id in 
            (select c_id from score where s_id="06");
        --- 左连接 + group by去重
        select
            a.*
        from
            student a
        left join
            score b
        on a.s_id=b.s_id 
        where c_id in 
            (select c_id from score where s_id="06")
        group by 1, 2, 3, 4;
    ```
13. 查询和`"01"`号同学学习课程完全相同的其他同学的信息
    ```sql
        
    ```