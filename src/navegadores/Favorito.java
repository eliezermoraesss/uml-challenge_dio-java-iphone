package navegadores;

public class Favorito {

    private String url;

    public Favorito() {
    }

    public Favorito(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Favorito{" +
                "url='" + url + '\'' +
                '}';
    }
}
