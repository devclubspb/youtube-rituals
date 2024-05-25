public class YouTubeRituals {
    public static void main(String[] args) throws InterruptedException {
        // Наш зритель
        var viewer = new YouTubeViewer("goodman");
        // Наш канал
        var channel = new YouTubeChannel("devclubspb");
        // Подписаться на наш канал
        viewer.subscribeTo(channel);
        // Для текущего видео
        var video = channel.getCurrentVideo();
        // Поставить на видео лайк или дизлайк
        viewer.like(video);
//        viewer.dislike(video);
        // Оставить под видео комментарий с вопросом или фидбеком
        viewer.commentOn(video, "Thanks for the interesting video!");
        // От автора видео
        var author = video.getAuthor();
        // Спасибо
        author.thank(viewer);
        // Продолжаем
        Thread.sleep(3_000L);
    }
}
