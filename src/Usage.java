public class Usage {

    public static <C extends Model> void process (OuterWrapper<C, InnerWrapper<C>> wrapper) {
        ;
    }

    public static void main(String[] args) {
        process(new RealOuterWrapper());
    }
}
