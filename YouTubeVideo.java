public class YouTubeVideo {
    private final String title;

    public YouTubeVideo(String title) {
        this.title = title;
    }

    public void likedBy(YouTubeViewer viewer) {
        System.out.println(viewer.getUsername() + ", you liked \"" + title + "\"!");
    }

    public void dislikedBy(YouTubeViewer viewer) {
        System.out.println(viewer.getUsername() + ", you disliked \"" + title + "\"!");
    }

    public void commentedBy(YouTubeViewer viewer, String comment) {
        System.out.println(viewer.getUsername() + ", you commented on \"" + title + "\"!");
    }

    public YouTubeAuthor getAuthor() {
        return new YouTubeAuthor();
    }
}
