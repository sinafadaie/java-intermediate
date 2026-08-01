//nw we create all our object in main,
//and injecting to other classes

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        var encoder = new VideoEncoder();
        var database = new VideoDatabase();
        System.out.println("this address from the object in main: " + database);

        var emailService = new EmailService();
        var processor = new VideoProcessor(encoder,database,emailService);
        processor.process(video);
    }
}
