public class Stabel<T> extends Lenkeliste<T> {

    @Override
    public void leggTil(T x) {
        Node NY = new Node(x);
        NY.NESTE = HODE.NESTE;
        HODE.NESTE = NY;
        ANT_ELM++;
    }
}
