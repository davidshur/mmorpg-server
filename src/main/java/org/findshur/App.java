package org.findshur;

/**
 * Main class.
 *
 * This class must be run in order to get the server(s) going.
 * Only then will clients be able to connect.
 *
 */
public class App {

    public static void main( String[] args ) {
        GameServer gameServer = new GameServer(9000);
        new Thread(gameServer).start();

        try {
            Thread.sleep(20 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stopping server.");
        gameServer.stop();
    }
}
