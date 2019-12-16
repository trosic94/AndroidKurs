package mojeKlase;

public class Zadatak1 {
    enum semafor {CRVENO,ZUTO_CRVENO,ZELENO,ZUTO_ZELENO};


    public static void main(String[] args) {
        semafor trenutnaBoja = semafor.CRVENO;
        switch  (trenutnaBoja)
        {
            case CRVENO: trenutnaBoja = semafor.ZUTO_CRVENO;
            break;
            case ZUTO_CRVENO: trenutnaBoja = semafor.ZELENO;
            break;
            case ZELENO:trenutnaBoja = semafor.ZUTO_ZELENO;
            break;
            default:trenutnaBoja = semafor.CRVENO;
        }
        System.out.println(trenutnaBoja);
        ifCheck();
    }
    static void ifCheck(){
        semafor trenutnaBoja = semafor.CRVENO;
        if (trenutnaBoja.equals(semafor.CRVENO))
        {
            trenutnaBoja = semafor.ZUTO_CRVENO;
        }
        else if (trenutnaBoja.equals(semafor.ZUTO_CRVENO))
        {
            trenutnaBoja = semafor.ZELENO;
        }
        else if (trenutnaBoja.equals(semafor.ZELENO))
        {
            trenutnaBoja = semafor.ZUTO_ZELENO;
        }
        else
        {
            trenutnaBoja = semafor.CRVENO;
        }
        System.out.println(trenutnaBoja);
    }



}
