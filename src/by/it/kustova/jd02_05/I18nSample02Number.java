package by.it.kustova.jd02_05;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class I18nSample02Number {
    public static void main(String[] args) {
        NumberFormat nfGe = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        double iGe = 0, iUs = 0, iFr = 0;
        String str = "1.234,5";
        try {
            iGe = nfGe.parse(str).doubleValue();
            iUs = nfUs.parse(str).doubleValue();
        } catch (ParseException e) {
            System.err.print("Error position: " + e.getErrorOffset());
        }
        System.out.printf("iGe= %f\niUS = %f\n", iGe, iUs);

        String sUs = nfUs.format(iGe);
        String sFr = nfFr.format(iGe);
        System.out.println("\nUs" + sUs + "\nFr " + sFr);
    }
}