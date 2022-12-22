public class Lenkeliste <T> implements Liste<T> {
    Node HODE;
    protected class Node {
        T INNHOLD;
        Node NESTE;

        public Node(T INNHOLD) {
            this.INNHOLD = INNHOLD;
        }

        //hodet har ikke innhold
        public Node() {}

        public T innhold(){
            return INNHOLD;
        }
    }

    public Lenkeliste() {
        HODE = new Node();
    }

    int ANT_ELM;

    public int stoerrelse() {
        return ANT_ELM;
    }

    public void leggTil(T x) {
        Node denne = HODE;
        while(denne.NESTE!=null) {
            denne = denne.NESTE;
        }
        denne.NESTE = new Node(x);
        ANT_ELM++;
    }

    public T hent() {
        return HODE.NESTE.innhold();
    }

    public T fjern() {
        if(HODE.NESTE!=null) {
            Node midl = HODE.NESTE;
            HODE.NESTE = midl.NESTE;
            ANT_ELM--;
            return midl.innhold();
        } else {throw new UgyldigListeindeks(-1);}
    }
}
