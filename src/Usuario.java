public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.desligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(13);
        System.out.println(smartTv.toString());

    }
}
