package singleton;

public class SingletonThreadSafe {
    private SingletonThreadSafe() {
        System.out.println("인스턴스 생성");
    }

    private static class LazyHolder {
        private static final SingletonThreadSafe INSTANCE = new SingletonThreadSafe();
    }

    public static SingletonThreadSafe getInstance() {
        return LazyHolder.INSTANCE;
    }

}
