package pboif2.pkg10119079.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan20TargetSaldoTabungan {

    public static void main(String[] args) {
        int  saldoTarget, i;
        double bunga, saldoAkhir, sBunga, saldoAwal;
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        saldoAwal = 3500000;
        bunga = 8;
        saldoTarget = 6000000;
        saldoAkhir = 0;
        i=1;
        sBunga = bunga/100;
        
        System.out.println("Saldo Awal    : RP "+saldoAwal);
        System.out.println("Bunga/Bulan(%): "+bunga);
        System.out.println("Saldo Target  : Rp "+saldoTarget);
        
        while(saldoAkhir < saldoTarget){
        saldoAkhir = (saldoAwal*sBunga) + saldoAwal;
        System.out.println("Saldo di bulan ke-" + i + kursIndonesia.format(saldoAkhir));
        saldoAwal = saldoAkhir;
        i++;
    }
        
        
       
        
    }
    
}
