package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 建立并初始化数组 b，得到一个与输入数组等长的全零数组。通过一个 for 循环，从左到右将 a 数组的元素，从右到左地赋值到 b 数组中，最后输出数组 b 得到结果
        // 解法1
//        int a[] = {1, 2, 3, 4, 5};
//        int b[] = new int[5];
//
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i];
//        }
//        for (int i = 0; i < a.length; i++) {
//            b[a.length - i - 1] = a[i];
//        }
//        System.out.println(Arrays.toString(b));

        // 解法2
        /**
         * 时间复杂度：
         *      包含了一个for循环，执行的次数是数组长度的一半，时间复杂度变成了O(n/2)。根据复杂度与具体的常系数无关的性质，这段代码的时间复杂度也就是O(n)
         * 空间复杂度：
         *      空间方面，定义了一个变量tmp，它与数组长度无关，也就是说，不管输入量是多少，tmp的空间占有依旧是一个变量，因此，空间复杂度和输入数组无关，即空间复杂度为O(1)
         */
//        int a[] = {1, 2, 3, 4, 5};
//        int tmp = 0;
//        for (int i = 0; i < a.length / 2; i++) {
//            tmp = a[i];
//            a[i] = a[a.length - i - 1];  // 交换位置
//            a[a.length - i - 1] = tmp;
//        }
//        System.out.println(Arrays.toString(a));

        // 求最大值
        /**
         * 因为代码的结构上需要使用一个 for 循环，对数组所有元素处理一遍，所以时间复杂度为 O(n)。
         */
//        int a[] = {1, 4, 3};
//        int max = -1;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > max){
//                max = a[i];
//            }
//        }
//        System.out.println(max);
        int a[] = { 1, 3, 4, 3, 4, 1, 3 };
        int val_max = -1;
        int time_max = 0;
        int time_tmp = 0;
        for (int i = 0; i < a.length; i++) {
            time_tmp = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    time_tmp += 1;
                }
                if (time_tmp > time_max) {
                    time_max = time_tmp;
                    val_max = a[i];
                }
            }
        }
        System.out.println(val_max);
    }
}
