package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}
//java에는 GC(garbage collection)이 있어서 아무도 참조하지 않는 인스턴스를 자동으로 메모리에서 제거함