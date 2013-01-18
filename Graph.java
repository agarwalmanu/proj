import java.util.List;

public class Graph {
  private final List<Vertex> vertexes;
  private final List<Edge> edges;

  public Graph(List<Vertex> vertexes, List<Edge> edges) {
    this.vertexes = vertexes;
    this.edges = edges;
  }
  public void addver(Vertex a)
  {
      vertexes.add(a);
  }
  public void addedge(Edge a)
  {
      edges.add(a);
  }
  public Vertex returnverte(String name2)
  {
      for(Vertex ver : vertexes)
      {
          if(ver.getName().equalsIgnoreCase(name2))
          {
              return ver;
          }
      }
      return null;
  }
  public List<Vertex> getVertexes() {
    return vertexes;
  }

  public List<Edge> getEdges() {
    return edges;
  }
  
  
  
} 