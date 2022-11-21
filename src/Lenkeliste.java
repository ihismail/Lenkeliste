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
        if(ANT_ELM>0) {
            Node FJERNET = HODE.NESTE;
            ANT_ELM--;
            if(FJERNET.NESTE!=null) {
                HODE.NESTE = FJERNET.NESTE;
            } else {return FJERNET.innhold();}
        } else {return null;}
        return null;
    }
}
