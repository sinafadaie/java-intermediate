//make private method to reduce coupling
//make method and variable with alt+enter

public class Browser {
    public void navigate(String address){
       String ip =  findIpAddress(address) ;//just create method with write method name here
                                            //and intelj write it itself below(red light)
       String html = sendHttpRequest(ip);
       System.out.println(html);
    }

    private String sendHttpRequest(String ip) {  //private to reduce coupling its not useful in main method
        return "<html> <html>";
    } //make them private,its inside

    private String findIpAddress(String address) { //private
        return "127.0.0.1";
    }  //make them private,its inside
}
