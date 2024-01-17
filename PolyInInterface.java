interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Hello");
    }
    // default lets us add methods to interface without any necessity of implementing int the class, we can still use it using the object of the class
    default void record4K(){
        greet();
        System.out.println("Record video in 4K");
    }
}
interface Wifi{
    String[] getNetworks();
    void connectToWifi(String network);
}
class Phone{
    void callNumber(int num){
        System.out.println("Calling "+num);
    }
    void pickCall(int num){
        System.out.println("Connecting to "+num);
    }
}
class Smartphone extends Phone implements Wifi,Camera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording a video");
    }
    public String[] getNetworks(){
        String []arr = {"Luffy","Zoro","Sanji"};
        return arr;
    }
    // if we override the method in our class then this method will be implemented
    // public void record4K(){
    //     System.out.println("click photo and record video in 4K");
    // } 
    public void connectToWifi(String network){
        System.out.println("Connecting to "+network);
    }
}
class PolyInInterface{
    public static void main(String args[]){
        Wifi w = new Smartphone(); // dynamic method dispatch in interface, you can say that this is a wifi but use for wifi only
        // w.takeSnap(); gives error
        w.connectToWifi("Luffy"); // does not give error
    }
}