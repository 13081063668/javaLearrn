
# 第二章

## 变量

变量相当于内存中一个数据存储空间的表示。
1. 声明变量 `int a;`
2. 赋值 `a = 60; 或 int a = 60;`
3. 输出语句 `System.out.println(a)`

## 浮点数

1. 单精度浮点数 float   4字节    
2. 双精度浮点数 double  8字节

3. Java浮点型常量默认为double类型，如果声明为float类型的话应在数字后面加上f或F，例：`float a = 1.1f;` `float b = 1.2F;`
4. 可以使用`.125` 代替`0.125`
5. 科学计数法 `5.12e2` 【512.0】，`5.12e-2`【0.0512】
6. 通常情况下使用double，double精度更高
7. 浮点数使用陷阱,运行结果为小数的结果进行相等判断要小心，要使用两个值的差值的绝对值在某个精度范围内即为相等

    double num1 = 2.7;  
    double num2 = 8.1 / 3;  
    System.out.println(num1);  
    System.out.println(num2);  
    System.out.println(num1 == num2); // false
    System.out.println(Math.abs(num1 - num2) < 0.000000001);    //true
   
## Java API 文档(Application Programming Interface,应用程序编程接口) [中文在线文档](https://www.matools.com/api)


## 字符类型 char
字符类型的细节：
1. 字符常量使用单引号引起来
2. 换行符应使用\转义，如'\n'
3. Java中，char的本质是一个整数，是unicode码对应的字符
4. 给char赋值整数，会按照unicode码对应的字符输出
5. char可以相当于整数运算，例如：'a' + 10 = 107

字符编码表：
1. ASCII（128字符） 'A' = 65 'a' = 97
2. Unicode（两个字节表示一个符号）
3. utf-8（字符一个字节，汉字三个字节）
4. gbk（字符一个字节，汉字儿个字节）
5. gb2312（gb2312 < gbk）
6. big5 码（繁体中文、台湾、香港）


## 布尔类型 boolean

介绍：
1. 只有true和false
2. 占一个字节
3. 用于逻辑运算
4. 不可以使用0，或1代替true，或false

## 基本数据类型转换

### 自动转换
小精度可自动转换为大精度
char->int->long->float->double
byte->short->int->long->float->double

自动转换细节：
1. 多种类型数据混合运算时候，系统会将所有的数据转化成其中容量最大的那种数据类型，然后再进行计算
2. (byte,short) 和char之间不可自动转换
3. 当把数赋值给byte时，先判断该数是否在byte的范围内，如果在就可以 直接赋值，判断范围！变量赋值，判断类型！
4. byte,short,char 他们三者可以计算， 在计算时首先会转换成int类型
5. boolean类型不参与数据自动转换
6. 表达式计算结果自动提升为操作数中最大的类型

### 强制转换

细节：
1. 当进行数据大——>小，就需要强制类型转换
2. 强制符号，只针对最近的操作数有效如`int x = (int)10*3.5`中，只会对10进行强制转换，该代码会报错；可以使用小括号提升优先级修改为`int x = (int)(10*3.5)` 这样强制转换的就是表达式的结果了
3. char可以保存int的常量值，但不可以保存int的变量值
4. byte和short类型在进行运算时，当作int类型处理


## 基本数据类型和String类型的转换

### 基本数据类型 转 String类型
    int n1 = 100;
    float f1 = 1.1f;
    double d1 = 1.11;
    boolean b1 = true;
    String s1 = n1 + "";
    String s2 = f1 + "";
    String s3 = d1 + "";
    String s4 = b1 + "";
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    // 基本数据类型变量 + ""  => 转换为String类型

### String类型 转 基本数据类型
    Integer.parseInt(str);
    Double.parseDouble(str);
    Float.parseFloat(str);
    Long.parseLong(str);
    Byte.parseByte(str);
    Boolean.parseBoolean("false");
    Short.parseShort(str);
    // xxx.parsexxx() 使用基本数据类型对应的包装类的相应方法

    //把字符串 转 char，含义指从字符串中取出某个字符
    System.out.println(str.charAt(0)); // 第0个字符

注意事项：
1. 将String 转 基本数据类型时，确保String要能够转成对应的类型，例如将"hello"转成整型变量就是错误的
2. 格式不正确会抛出异常，程序就会终止

