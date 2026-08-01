//we have three coupling point here
//Video itself is just a data container
//its have not any algorithem or something that have high probability to change in future
//its not have any point to decouple from video.
//but VideoEncoder,VideoDatabase,EmailService can decoupled
//they have high probability to change in future
//---------------------------------
//we should create all object in main
//and create fields to store that objects in video processor
//normally when we inject a object to a class, save that object in a field
//this instead of creating object in current class
//actually this object is exactly the object we created in main
//in main we create it on heap
//and in this class save the heap address in a field
//look at the address printing below (they are same(the object address in main))
//we just transfer that object to this class(inject it)

public class VideoProcessor {
    private VideoEncoderaAble videoEncoder ;
    private VideoDatabaseAble database;
    private EmailServiceAble emailService;

    public VideoProcessor(VideoEncoderaAble videoEncoder,
                          VideoDatabaseAble database,
                          EmailServiceAble emailService) {
        this.videoEncoder = videoEncoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {

        //var encoder = new VideoEncoder();    **we should inject it from Main
        videoEncoder.encode(video);
        System.out.println("this addres from videoprocessor: " + database);

        //var database = new VideoDatabase();
        database.store(video);

        //var emailService = new EmailService();
        emailService.sendEmail(video.getUser());
    }
}

