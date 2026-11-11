package exercise_9.enumerate;

import static jdk.internal.org.jline.utils.Status.getStatus;

/**
 * Podatke koji pristizu u web aplikaciju je potrebno koristiti za kreiranje objekata tipa Server.
 * Drugim recima, tekst koji pristize je potrebno parsirati i iz njega izvuci pojedinacne informacije, odnosno ID, naziv i status servera.
 * Polje ID je potrebno predstaviti int tipom.
 * Polje name je potrebno predstaviti String tipom.
 * Za polje status je potrebno kreirati enumeraciju sa statusima servera(Stopped, Running, Unknown)
 * Nakon kreiranja objekta tipa Server i postavljanje vrednosti njegovih svojstava, potrebno je na izlazu ispisati njegove podatke,
 * odnosno vrednosti njegovih svojstava.
 */

public class Server {
    public enum ServerStatus{Stopped, Running, Unknown}

    public int id;
    public String name;
    public ServerStatus status;

    public Server(String pars){
        String[] parsArray = pars.split("&");

        this.id = Integer.parseInt(parsArray[0].split("=")[1]);
        this.name = parsArray[1].split("=")[1].toString();
        this.status = getStatus(parsArray[2].split("=")[1].toString());
    }

    public ServerStatus getStatus(String status) {
        ServerStatus res = ServerStatus.Unknown;

        try {
            res = ServerStatus.valueOf(status);
        } catch (Exception e){
            System.out.println("There is an error.");
        }
        return res;
    }

    @Override
    public String toString(){
        return "Server id: " + this.id + "\nServer name: " + this.name + "\nServer status: " + this.status + "\n";
    }
}
