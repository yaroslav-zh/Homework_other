package coder;

public class Post {
    private String title;
    private String detailsLink;
    private String author;
    private String athorDetailsLink;
    private String dateOfCreate;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetailsLink() {
        return detailsLink;
    }

    public void setDetailsLink(String detailsLink) {
        this.detailsLink = detailsLink;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAthorDetailsLink() {
        return athorDetailsLink;
    }

    public void setAthorDetailsLink(String athorDetailsLink) {
        this.athorDetailsLink = athorDetailsLink;
    }

    public String getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(String dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", detailsLink='" + detailsLink + '\'' +
                ", author='" + author + '\'' +
                ", athorDetailsLink='" + athorDetailsLink + '\'' +
                ", dateOfCreate='" + dateOfCreate + '\'' +
                '}';
    }
}
