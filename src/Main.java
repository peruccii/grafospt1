import graphs.Graph;

public class Main {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<String>();
        graph.addVertice("John Doe");
        graph.addVertice("Mark Zuckerberg");
        graph.addVertice("Steve Jobs");
        graph.addVertice("Bill Gates");

        graph.addEdge(2.0, "John Doe", "Mark Zuckerberg");
        graph.addEdge(3.0, "Mark Zuckerberg", "Steve Jobs");
        graph.addEdge(1.0, "Steve Jobs", "Bill Gates");
        graph.addEdge(1.0, "John Doe", "Bill Gates");
        graph.addEdge(1.0, "Bill Gates", "John Doe");

        graph.searchLarge();
    }
}