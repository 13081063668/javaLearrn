# 第一章
## Java概述

程序：计算机执行某些操作或解决某一问题的有序指令的集合。

Java技术体系平台：
1. Java SE（Java Standard Editnion）
2. Java EE(Java Enterprise Editnion)
3. Java ME(Java Micro Editnion)

Java语言的重要特点：
1. 面向对象（oop）
2. 健壮，强类型机制、异常处理、垃圾的自动收集
3. 可跨平台的(JVM)
4. 解释型的（javascript、PHP、Java 其他编译型【C、C++】）

Java核心机制-Java虚拟机（JVM Java Virtual Machine）
1. JVM是一个虚拟的计算机，拥有指令集并使用不同的存储区域。负责执行指令、管理数据、内存、寄存器，包含在JDK中。
2. 对于不同的平台，有不同的JVM。
3. Java虚拟机机制屏蔽了底层运行平台的差异，实现了跨平台。

JDK基本介绍
1. 全称Java Development Kit，Java开发工具包
2. JDK = JRE + Java开发工具【java,javac,javadoc,javap等】

JRE基本介绍
1. 全称 Java Runtime Envirment,Java 运行环境。
   JRE = JVM + Java的核心库。
2. 包括JVM 核心库 java程序的使用者只需要JRE就可以了

Java开发注意事项和细节
1. 拓展名为.java
2. 入口为main()
    public static void main(String[] args){...}
3. 严格区分大小写。
4. 分号结束。
5. 一个源文件智能有一个public类，其他类个数不限【每一个类都对应一个class文件】。
6. 文件名使用文件中的public类名相同！
7. main方法可以下载非public类中。

注释
1. 单行注释 `// 注释`
2. 多行注释 `/* 注释 */`
3. 文档注释 `javadoc -d C:\Users\子非\javaLearn\javaCode\doc -author -version JavaDoc.java`

Java代码规范
1. 类、方法的注释，以JavaDoc的方式来写
2. 非JavaDoc的注释，是给代码维护者看的
3. 选中，Tab为右移，Shift+Tab为左移
4. 运算符等两边加空格
5. 源文件 UTF-8 
6. 行宽不超过80
7. 代码编写风格 次行风格和行尾风格【√】

路径
1. 相对路径
2. 绝对路径

常用dos命令
1. dir 查看目录
2. cd 换盘 cd /D c:
3. ../ 上一级
4. 切换根目录 cd /
5. 自己目录 tree
6. windows 清屏 cls
7. windows 推出 exit


