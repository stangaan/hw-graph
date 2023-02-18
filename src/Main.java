import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node a = new Node(null, "a");
        Node b = new Node(null, "b");
        Node v = new Node(null, "v");
        Node g = new Node(null, "g");
        Node d = new Node(null, "d");
        Node e = new Node(null, "e");
        Node ch = new Node(null, "ch");
        Node z = new Node(null, "z");
        Node i = new Node(null, "i");
        Node k = new Node(null, "k");

        a.setRight(b);
        a.setRight(v);
        a.setRight(d);
        a.setRight(e);
        b.setRight(e);
        b.setRight(v);
        v.setRight(ch);
        g.setRight(z);
        g.setRight(b);
        d.setRight(i);
        d.setRight(g);
        e.setRight(k);
        ch.setRight(k);
        ch.setRight(z);
        z.setRight(k);
        i.setRight(k);

        ListGraph A = new ListGraph(null,"A");
        ListGraph B = new ListGraph(null,"B");
        ListGraph V = new ListGraph(null,"V");
        ListGraph G = new ListGraph(null,"G");
        ListGraph D = new ListGraph(null,"D");
        ListGraph E = new ListGraph(null,"E");
        ListGraph CH = new ListGraph(null,"CH");
        ListGraph Z = new ListGraph(null,"Z");
        ListGraph I = new ListGraph(null,"I");
        ListGraph K = new ListGraph(null,"K");

        List<ListGraph> LinksForA = new ArrayList<>();
        LinksForA.add(B);
        LinksForA.add(V);
        LinksForA.add(G);
        LinksForA.add(D);

        List<ListGraph> LinksForB = new ArrayList<>();
        LinksForB.add(E);
        LinksForB.add(V);

        List<ListGraph> LinksForV = new ArrayList<>();
        LinksForV.add(CH);

        List<ListGraph> LinksForG = new ArrayList<>();
        LinksForG.add(B);
        LinksForG.add(Z);

        List<ListGraph> LinksForD = new ArrayList<>();
        LinksForD.add(G);
        LinksForD.add(I);

        List<ListGraph> LinksForE = new ArrayList<>();
        LinksForE.add(K);

        List<ListGraph> LinksForCH = new ArrayList<>();
        LinksForCH.add(K);
        LinksForCH.add(Z);

        List<ListGraph> LinksForZ = new ArrayList<>();
        LinksForZ.add(K);

        List<ListGraph> LinksForI = new ArrayList<>();
        LinksForI.add(K);


    }
}