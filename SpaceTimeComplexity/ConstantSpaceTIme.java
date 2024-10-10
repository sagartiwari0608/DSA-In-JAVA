package SpaceTimeComplexity;

class ConstantSpaceTime {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(a[0]); // this is always going to return first element and hence this code has time
                                  // complexity of O(1)
        a[0] = a[0] + 10;
        int num = a[0]; // here we are initialising one more variable which is int and will take 4
                        // bytes. but still it will be 4 bytes only no matter how mnay times we go ahead
                        // and run this program.
        // hence this is also a constant space complexity and can be mentioned as
        // constant space complexity o(1).
        System.out.println(num);
    }
}