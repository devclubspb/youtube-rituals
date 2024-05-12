public class YouTubeViewer {
    private final String username;

    public YouTubeViewer(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void subscribeTo(YouTubeChannel channel) {
        channel.subscribedBy(this);
    }

    public void like(YouTubeVideo video) {
        video.likedBy(this);
    }

    public void dislike(YouTubeVideo video) {
        video.dislikedBy(this);
    }

    public void commentOn(YouTubeVideo video, String comment) {
        video.commentedBy(this, comment);
    }
}
