package Lab305;

public class DatabaseConnection {

    private String connectionString ;
    private boolean connected ;

    public DatabaseConnection(String connectionString) {

        this.connectionString = connectionString ;
        connected = false ;
    }

    public boolean isConnected() {

        return this.connected ;
    }

    public void connect() {
        if (connected == false) {

            connected = true ;
            System.out.println("Connected to " + this.connectionString) ;

        }

        else {
            System.out.println("Already connected.") ;
        }

    }

    public void disconnect() {

        if (connected == true) {

            connected = false ;
            System.out.println("Disconnected") ;
        }

        else {

            System.out.println("Already disconnected") ;
        }

    }

}
