
public class VideoEncoder implements VideoEncoderaAble {
    @Override          //add override notation to say we have override interface method
    public  void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
