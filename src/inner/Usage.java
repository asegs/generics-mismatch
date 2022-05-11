package inner;

public class Usage {
    public static <C extends Model> void processInner (Wrapper<C,C> wrapper) {
        ;
    }

    public static void main(String[] args) {
        processInner(new RealWrapper());
    }
}
