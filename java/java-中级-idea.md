## idea的安装 
!官网[www.jebrains.com]

# idea的使用技巧和经验
1. 设置字体 File->Setting->Editor->Font->Size(设置为18)
2. 调整背景颜色 File->Setting->Editor->ColorScheme(设置为Darcula)
3. 字符集设置 File->Setting->Editor->File Encodings(设置Global Encoding 设置为 UTF-8)

## idea 常用快捷键
1. 删除当前行 Ctrl + X(将就一下)
2. 复制当前行 Ctrl + D
3. 补全代码 Alt + /
4. 注释 Ctrl + /
5. 导入改行需要的类 Alt + Enter
6. 快速格式化 Ctrl + Alt + L
7. run Ctrl + Shift + F10
8. 生成构造器 Alt + Inster
9. 查看类的层级关系 Crtl + H
10. 将光标放在方法上，使用Crtl + B（或者Ctrl + 左键点击） 跳转到方法
11. 自动分配变量名 使用 .var
## 模板快捷键
File->Settings->Editor->Live templates(增加模板)
1. 输出语句 sout
2. for循环快捷 fori

# 包
## 包的三个作用
1. 区分相同名字的类
2. 类很多的时候，可以较好的管理
3. 可以控制访问范围

## 包的基本语法
    package com.yyf;
说明：
1. package 关键字，表示打包
2. com.yyf 表示包名

## 包的命名
### 命名规则
只能包含数字、字母、下划线、小圆点，但 不可数字开头，不能是关键字或保留字
### 命名规范
一般是小写字母
com.公司名.项目名.业务模块名

## 使用细节
1. package的作用是声明当前类所在的包，需要放在类的最上面，一个类中最多一个package
2. import指令放在package下面，再类定义前面，无顺序要求

## 访问修饰符
java提供了四种访问控制修饰符好控制方法和属性（成员变量）的访问权限（范围）：
1. 公开级别：public，对外公开
2. 保护级别：protected，对子类和同一个包公开
3. 默认级别：无修饰符，对同一个包公开
4. 私有级别：private，只有类本身可以访问，不对外公开

## 面向对象的三大特征 - 封装 继承 多态
### 封装
封装，就是把抽象出来的数据【属性】和对数据的操作封装再一起，数据被保护在内部，程序的其他部分只有通过被授权的操作，方法，才能对数据进行操作
好处：
1. 隐藏实现细节
2. 可以对数据进行验证，保证安全合理

### 继承
继承关键字 extends
