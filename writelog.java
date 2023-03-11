
import java.io.IOException;
import java.util.logging.*;

public class writelog {
    
    public static void records(String S) throws IOException
    {
        Logger logger = Logger.getLogger(interfaceData.class.getName());
        /*ConsoleHandler ch = new ConsoleHandler();*/
        FileHandler fh = new FileHandler("logger.txt", true);
        /*logger.addHandler(ch);*/
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        /*ch.setFormatter(sFormat);*/
        fh.setFormatter(sFormat);

        logger.info(S);
    }
}
