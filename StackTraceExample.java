public class StackTraceExample {

    public static void main(String[] args) {
        StackTraceExample stackTraceExample = new StackTraceExample();
        stackTraceExample.firstFunction();
    }

     public void firstFunction() {
        System.out.println("firstFunction");
        secondFunction();
    }

    private void secondFunction() {
        System.out.println("secondFunction");
        thirdFunction();
    }

    private void thirdFunction() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace.length);
        for (int i = 0; i < stackTrace.length; i ++) {
            System.out.println("Element : " + i);
            System.out.println(stackTrace[i].getClassName());
            System.out.println(stackTrace[i].getMethodName());
            System.out.println(stackTrace[i].getLineNumber());
            System.out.println();
        }
    }


}