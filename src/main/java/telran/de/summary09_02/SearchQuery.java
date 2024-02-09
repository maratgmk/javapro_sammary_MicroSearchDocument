package telran.de.summary09_02;

public class SearchQuery {
    private final String query;

    public SearchQuery(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    @Override
    public String toString() {
        return "SearchQuery{" +
                "query='" + query + '\'' +
                '}';
    }
}
