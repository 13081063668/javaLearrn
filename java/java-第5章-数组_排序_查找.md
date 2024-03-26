# 第五章 数组的使用
## 数组初始化
### 动态初始化

```java
int a[] = new int[5];// 创建了一个长度为5，名字为a的int数组
int []b; //或int b[];
b = new int[5]; // 可以先声明，再分配内存
```

### 静态初始化

```java
int a[] = {1,2,3,4,5};
```

### 数组细节
1. 多个相同数据类型的集合
2. 可以是任何数据类型，但不能混用
3. 数组创建后有默认值
```java
/*
 * int short byte long 0
 * float double 0.0
 * char \u0000
 * boolean false
 * String null
*/
```
4. 使用数组的步骤，A.声明数组并分配内存 B.赋值 C.使用数组
5. 下标从0开始
6. 不可超过数组的长度取值，如
```java
int a[] = new int[5];
System.out.println(a[5]);// 会报错“下标越界异常”
```
7. 数组为引用类型

### 数组赋值机制
1. 基本数据类型赋值，是互不影响的，赋值方式是拷贝
```java
int n1 = 10; // n1 = 10;
int n2 = n1; // n2 = 10;
n1 = 20;     // n1 = 20; n2 = 10;n1变化不影响n2，同时n2也不影响n1
```
2. 数组在默认情况下为引用传递，赋的值是地址
```java
int arr1[] = {1,2,3};
int arr2[] = arr1;
arr1[0] = 4;// 修改后 arr2[0]也等于4，同时arr2的变化也会影响arr1
System.out.println(arr2[0]);
```

3. 数组拷贝
```java
int arr1[] = {1,2,3};
int arr2[] = new int[arr1.length];
for(int i = 0; i < arr1.length; i++){
    arr2[i] = arr1[i];
}
```

### 数组反转
```java
int arr1[] = {1,2,3,4,5};
int tmp = 0;
int len = arr1.length;
for(int i = 0; i < len/2; i ++){
    arr1[i] ^= arr1[len - i - 1];
    arr1[len - i - 1] ^= arr1[i];
    arr1[i] ^= arr1[len - i - 1];
}
for(int i = 0; i < len; i ++){
    System.out.println(arr1[i]);
}
```

### 数组添加（数组扩容）
```java
int []arr = {1,2,3};
int []arrNew = new int[arr.length + 1];
for(int i = 0;i > arr.length; i++){
    arrNew[i] = arr[i];
}
arrNew[arr.length - 1] = newNum;
arr = arrNew;
```

### 数组缩减
```java
int []arr = {1,2,3,4,5};
int []arrNew = new int[arr.length - 1];
for(int i = 0;i > arrNew.length; i++){
    arrNew[i] = arr[i];
}
arr = arrNew;
```

## 排序
排序是将多个数据，按照指定的顺序进行排列的过程
1. 内部排序
> 在内存中排序
2. 外部排序
> 数据量过大，无法全部加载到内存

### 冒泡排序
依次比较相邻的值，逆序则交换

## 查找
### 顺序查找 SeqSearch.java
```java
String strs[] = {"yyf","yyf1","yyf2"};
Scanner sc = new Scanner(System.in);
String findName = sc.next();
int idx = -1;
for(int i = 0; i <strs.length; i++){
    if(strs[i].equals(findName)){
        
        idx = i;
        break;
    }
}
if(idx == -1){
    System.out.println("找到了第" + i + "个人" + str[i])
}else{
    System.out.println("抱歉，找不到"+ findName + "这个人")
}
```
### 二分查找（要求数组有序）

## 多维数组
```java
// 二维数组 TwoDementional.java
int [][] arr = {{0,0,0,0,0},
                {1,0,-1,0,0},
                {0,1,-1,0,0},
                {0,0,1,0,0},
                {0,0,0,1,0}
            };
// 二位数组遍历
for(int i = 0; i < arr.length; i++){
    for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + "\t");
    }
    System.out.println();
}
```

1. 声明和分配空间
```java
类型 [][] 数组名 = new 类型[大小][大小];
```
2. 二维数组动态初始化
```java
int[][] arr1;
arr1 = new int[2][3];
int [][]arr2 = new int[2][3];
```
3. 在二维数组中的每一个一维数组长度可能不相等
```java
int [][] arr = new int[3][];
arr[i] = new int[n];
```
4. 定义一个
```java
int [][]arr = {{1,1,1},{2,2,2},{3}}
// 第三维只有一个元素
```

### 二维数组使用注意事项
1. 一维数组的两种声明方式
```java
int []a;
int b[];
```
2. 二维数组的三种声明方式
```java
int[][] a;
int[] b[];
int c[][];
```
3. 二维数组是多个一维数组组成的，其每个一位的长度可以相同，也可以不同
```java
int [][]a = {{1,2,3},{4,5,6}};
int [][]b = {{1},{2,3},{4,5,6}};
```

```java
int []x,y[];// 这是声明了x为一维数组，y为二维数组
```

```java
// 判断
String strs[] = {'a','a','a'};// × char -> String
String strs[] = {"a","a","a"};// √
String strs[] = new String{"a","a","a"};// ×
String strs[] = new String[]{"a","a","a"};// √
String strs[] = new String[3]{"a","a","a"};// ×

```