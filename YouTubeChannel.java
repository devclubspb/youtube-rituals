public class YouTubeChannel {
    private final String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void subscribedBy(YouTubeViewer viewer) {
        System.out.println(viewer.getUsername() + ", you're subscribed to " + channelName + "!");
    }

    public YouTubeVideo getCurrentVideo() {
        return new YouTubeVideo("Interesting topic ~/ Current video");
    }
}
