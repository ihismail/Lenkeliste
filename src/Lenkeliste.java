public class Lenkeliste <T> implements Liste<T> {
    Node HODE;
    private class Node {
        T INNHOLD;
        Node NESTE;

        public Node(T INNHOLD) {
            this.INNHOLD = INNHOLD;
        }

        //hodet har ikke innhold
        public Node() {}
    }

    public Lenkeliste() {
        HODE = new Node();
    }

    int ANT_ELM;

    public int stoerrelse() {
        return ANT_ELM;
    }

    public void leggTil(T x) {
        Node denne = HODE.neste;
        while(denne!=null) {
            denne = denne.neste;
        }
        Node ny = new Node(T);
        denne.neste = ny;
        ANT_ELM++;
    }

    public T hent() {}

    public T fjern() {}
}
