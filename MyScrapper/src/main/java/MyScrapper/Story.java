package MyScrapper;

public class Story {
    private String title;
    private String subTitle;
    private String body;

    public Story(String title, String subTitle, String body) {
        this.title = title;
        this.subTitle = subTitle;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
