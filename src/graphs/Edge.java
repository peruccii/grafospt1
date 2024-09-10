package graphs;

public class Edge<TIPO> {
    private Double weight;
    private Vertice<TIPO> begin;
    private Vertice<TIPO> end;

    public Edge(Double weight, Vertice<TIPO> begin, Vertice<TIPO> end) {
        this.weight = weight;
        this.begin = begin;
        this.end = end;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Vertice<TIPO> getBegin() {
        return begin;
    }

    public void setBegin(Vertice<TIPO> begin) {
        this.begin = begin;
    }

    public Vertice<TIPO> getEnd() {
        return end;
    }

    public void setEnd(Vertice<TIPO> end) {
        this.end = end;
    }
}
