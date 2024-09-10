package graphs;

import java.util.ArrayList;

public class Vertice<TIPO> {
    private TIPO data;
    private ArrayList<Edge<TIPO>> edgesInput;
    private ArrayList<Edge<TIPO>> edgesOutput;


    public Vertice(TIPO valor) {
        this.data = valor;
        this.edgesInput = new ArrayList<Edge<TIPO>>();
        this.edgesOutput = new ArrayList<Edge<TIPO>>();
    }


    public TIPO getData() {
        return data;
    }

    public void setData(TIPO data) {
        this.data = data;
    }

    public void addEdgesInput(Edge<TIPO> edge) {
        this.edgesInput.add(edge);
    }

    public void addEdgesOutput(Edge<TIPO> edge) {
        this.edgesOutput.add(edge);
    }

    public ArrayList<Edge<TIPO>> getEdgesInput() {
        return edgesInput;
    }

    public void setEdgesInput(ArrayList<Edge<TIPO>> edgesInput) {
        this.edgesInput = edgesInput;
    }

    public ArrayList<Edge<TIPO>> getEdgesOutput() {
        return edgesOutput;
    }

    public void setEdgesOutput(ArrayList<Edge<TIPO>> edgesOutput) {
        this.edgesOutput = edgesOutput;
    }
}
