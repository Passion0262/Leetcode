package javaguide;

public class variable {
    public boolean canJump(int[] nums) {
        int maxDis = 0;
        int length = nums.length;
        for (int i=0;i<length;i++){
            if (maxDis<i){
                return false;
            }
            maxDis = Math.max(i+nums[i],maxDis);
        }
        return maxDis >= length-1;
    }

    public static <E> void printArray( E[] inputArray )
    {
        for ( E element : inputArray ){
            System.out.printf( "%s", element );
        }
        System.out.println();
    }

    public void testString(){
        // 在堆中创建字符串对象”Java“
        // 将字符串对象”Java“的引用保存在字符串常量池中
        String s1 = "Javass";

        // 直接返回字符串常量池中字符串对象”Java“对应的引用
        String s2 = s1.intern();

        // 会在堆中在单独创建一个字符串对象
        String s3 = new String("Java");

        // 直接返回字符串常量池中字符串对象”Java“对应的引用
        String s4 = s3.intern();

        // s1 和 s2 指向的是堆中的同一个对象
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

    }


    public static void main(String[] args) {
        String a = new String("ab"); // a 为一个引用
        String aa = "ab"; // 放在常量池中
        String aaa = "ab";
        System.out.println(a.equals(aa));
        System.out.println(System.identityHashCode(aa));
        System.out.println(System.identityHashCode(aaa));
    }
}
