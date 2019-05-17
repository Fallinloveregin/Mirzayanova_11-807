public class AudioTrack implements Comparable<AudioTrack> {
    int duration;
    String title;
    String author;

    public int getDuration() {
        return this.duration;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public AudioTrack(int duration, String title, String author) {
        this.duration = duration;
        this.title = title;
        this.author = author;
    }

    public AudioTrack(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    @Override
    public int compareTo(AudioTrack o) {
        return duration - o.duration;
    }
}