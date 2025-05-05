public class idman {
    private int pushupsayisi;
    private int situpsayisi;
    private int burpeesayisi;
    private int squatsayisi;


    public idman(int situpsayisi, int pushupsayisi, int squatsayisi, int burpeesayisi){
        this.burpeesayisi=burpeesayisi;
        this.pushupsayisi=pushupsayisi;
        this.situpsayisi=situpsayisi;
        this.squatsayisi=squatsayisi;

    }
    public int getPushupsayisi() {
        return pushupsayisi;
    }


    public void setPushupsayisi(int pushupsayisi) {
        this.pushupsayisi = pushupsayisi;
    }

    public int getSitupsayisi() {
        return situpsayisi;
    }

    public void setSitupsayisi(int situpsayisi) {
        this.situpsayisi = situpsayisi;
    }

    public int getBurpeesayisi() {
        return burpeesayisi;
    }

    public void setBurpeesayisi(int burpeesayisi) {
        this.burpeesayisi = burpeesayisi;
    }

    public int getSquatsayisi() {
        return squatsayisi;
    }

    public void setSquatsayisi(int squatsayisi) {
        this.squatsayisi = squatsayisi;
    }
    public void hareketyap(String hareketturu, int sayi){
        if (hareketturu.equals("burpee")){
            burpeeyap(sayi);
        }
        else if(hareketturu.equals("pushup")){
            pushupyap(sayi);
        }
        else if(hareketturu.equals("situp")){
            situpyap(sayi);
        }
        else if(hareketturu.equals("squat")){
            squatyap(sayi);
        }
        else{
            System.out.println("geçersiz hareket");
        }


    }
    public void burpeeyap(int sayi){
        if(burpeesayisi == 0){
            System.out.println("burpee kalmadı");
        }
        if(burpeesayisi - sayi < 0 ){
            System.out.println("hedefleneni geçtin");
        }
        else{
            burpeesayisi -= sayi;
            System.out.println("kalan burpee sayısı: " + burpeesayisi);
        }
    }
    public void situpyap(int sayi){
        if(situpsayisi == 0){
            System.out.println("situp kalmadı");
        }
        if(situpsayisi - sayi < 0 ){
            System.out.println("hedefleneni geçtin");
        }
        else{
            situpsayisi -= sayi;
            System.out.println("kalan situp sayısı: " + situpsayisi);
        }

    }
    public void squatyap(int sayi){
        if(squatsayisi == 0){
            System.out.println("squat kalmadı");
        }
        if(squatsayisi - sayi < 0 ){
            System.out.println("hedefleneni geçtin");
        }
        else{
            squatsayisi -= sayi;
            System.out.println("kalan squat sayısı: " + squatsayisi);
        }
    }

    public void pushupyap(int sayi){
        if(pushupsayisi == 0){
            System.out.println("pushup kalmadı");
        }
        if(pushupsayisi - sayi < 0 ){
            System.out.println("hedefleneni geçtin");
        }
        else{
            pushupsayisi -= sayi;
            System.out.println("kalan situp sayısı: " + pushupsayisi);
        }
    }
    public boolean idmanbittimi(){
        return (burpeesayisi==0) &&  (pushupsayisi==0) && (situpsayisi==0) && (squatsayisi==0)
    }


}
