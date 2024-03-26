## if-else
```java
if(condition){
    // 代码块1
}else{
    // 代码块2
}
```

```java
// 单双分支
if(age > 18){
	System.out.println("好的，您18岁了");
}else{
	System.out.println("别骗我了，你18岁了");
}
```

```java
// 闰年
Scanner sc = new Scanner(System.in);
int year = sc.nextInt();
if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
    System.out.println(year + "是闰年");
}else{
    System.out.println(year + "不是闰年");
}
```

```java
// 多分支
if(condition1){
    // 代码块1
}else if(condition2){
    // 代码块2
}else if(condition3){
    // 代码块3    
}else{
    // 代码块4 【多分支结构的else可以没有】
}
```
嵌套分支最好不要超过三层。


```java
// switch 分支
// 注意 ，没有break后，之后的程序都会执行
switch(表达式){
    case 常量1: 代码块1;break;
    case 常量2: 代码块2;break;
    case 常量3: 代码块3;break;
    default:代码块4;
}
```

switch注意事项
1. 表达式和case的变量应**类型一致**，或可以**自动转换**
2. 表达式的返回值必须是（byte,short,int,char,enum，String）中的
3. case中的值必须是常量或常量表达式，不可以为变量
4. default可选，可无
5. 一定要写break


## for      循环控制
## while    循环控制
## do-while 循环控制

## 多重循环控制

## break需求
## break中lable的是使用

```java
lable1:
for(int i = 0; i < 10; i++){
    label2:
    for(int j = 0; j < 10; j++){
        System.out.println(i + " " +j);
        if(i == 3 && j == 4){
            break lable1; // 直接退出主循环
            //break; 等同于 break label2;
        }
    }
}
```

## 字符串比较的两种写法
```java
name.equals("yyf");
"yyf".equals(name); //[推荐] 避免空指针异常
```

## continue
