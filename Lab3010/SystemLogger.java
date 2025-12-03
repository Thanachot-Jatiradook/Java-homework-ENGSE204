package Lab3010;

public class SystemLogger {

    private static int currentLogLevel = 1 ;

    private static String getLevelName(int level) {

        switch (level) {

            case 1: return "INFO" ;
            case 2: return "DEBUG" ;
            case 3: return "ERROR" ;
            default: return "UNKNOWN" ;

        }

    }

    public static void setLogLevel(int nLevel) {

        if (nLevel >= 1 && nLevel <= 3) {

            currentLogLevel = nLevel ;
            System.out.println("Log level set to " + getLevelName(nLevel)) ;

        }

        else {

            System.out.println("Invalid Log Level") ;

        }

    }

    public static void log(int mLevel, String m) {

        if (mLevel >= currentLogLevel) {

            System.out.println("[" + getLevelName(mLevel) + "]:" + m) ;

        }

    }
    
}
