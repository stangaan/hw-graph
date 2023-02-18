import java.util.List;

public class ListGraph {
    List<ListGraph>links;
    String value;

    public ListGraph(List<ListGraph> links, String value) {
        this.links = links;
        this.value = value;
    }

    public List<ListGraph> getLinks() {
        return links;
    }

    public void setLinks(List<ListGraph> links) {
        this.links = links;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
