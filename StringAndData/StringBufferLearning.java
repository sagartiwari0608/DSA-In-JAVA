package StringAndData;

class StringBufferLearning {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hi there! this string is now supposedly more than 16 so lets see the length now");
        System.out.println(buffer);
        String str = buffer.toString();
        System.out.println(str);
        System.out.println(buffer.capacity());
    }

}