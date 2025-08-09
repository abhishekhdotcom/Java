package Ed_v27_Interfaces.multipleinterfaces;

public class Test {
    public static void main(String[] args) {
        // Smartphone class object
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.takePhoto();
        smartPhone.recordVideo();

        smartPhone.MakeCall("6299180716");
        smartPhone.endCall();

        smartPhone.playMusic();
        smartPhone.stopMusic();
    }
}
