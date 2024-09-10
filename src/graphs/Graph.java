package graphs;

import java.util.ArrayList;

public class Graph<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Edge<TIPO>> edges;

    public Graph() {
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.edges = new ArrayList<Edge<TIPO>>();
    }

    public void addVertice(TIPO data) {
        Vertice<TIPO> newVertice = new Vertice<TIPO>(data);
        this.vertices.add(newVertice);
    }

    public void addEdge(Double weight, TIPO Databegin, TIPO Dataend) {
        Vertice<TIPO> begin = this.getVertice(Databegin);
        Vertice<TIPO> end = this.getVertice(Dataend);

        Edge<TIPO> edge = new Edge<TIPO>(weight, begin, end);
        begin.addEdgesOutput(edge);
        end.addEdgesInput(edge);
        this.edges.add(edge);
    }

    public Vertice<TIPO> getVertice(TIPO data) {
        Vertice<TIPO> vertice = null;
        for ( int i=0 ; i < this.vertices.size(); i++ ) {
            if ( this.vertices.get(i).getData().equals(data) ) {
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }

    public void searchLarge() {
        ArrayList<Vertice<TIPO>> marcados = new  ArrayList<Vertice<TIPO>>();
        ArrayList<Vertice<TIPO>> queue = new  ArrayList<Vertice<TIPO>>();

        Vertice<TIPO> moment = this.vertices.get(0);
        marcados.add(moment);
        System.out.println(moment.getData());
        queue.add(moment);

        while(queue.size() > 0 ) {
            Vertice<TIPO> visited = queue.get(0);
            for ( int i=0 ; i < visited.getEdgesOutput().size() ; i++ ) {
                Vertice<TIPO> next = visited.getEdgesOutput().get(i).getEnd();
                if (!marcados.contains(next)) {
                    marcados.add(next);
                    System.out.println(next.getData());
                    queue.add(next);
                }
            }
            queue.remove(0);
        }
    }
}
