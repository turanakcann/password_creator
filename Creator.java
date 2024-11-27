import java.security.SecureRandom;

public class Creator {
    private static final String BUYUK_HARFLER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String KUCUK_HARFLER = "abcdefghijklmnopqrstuvwxyz";
    private static final String RAKAMLAR = "0123456789";
    private static final String OZEL_KARAKTERLER = "!@#$%^&*()-_=+[]{}|;:,.<>?/";
    
    private static final String TUM_KARAKTERLER = BUYUK_HARFLER + KUCUK_HARFLER + RAKAMLAR + OZEL_KARAKTERLER;
    private static final SecureRandom random = new SecureRandom();
    
    Creator(int length){
        StringBuilder parola = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(TUM_KARAKTERLER.length());
            parola.append(TUM_KARAKTERLER.charAt(index));
        }
        
        System.err.println("Yeni parolanız: " + parola);
    }
}

