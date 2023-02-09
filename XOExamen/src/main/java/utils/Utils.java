package utils;

import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Utils {

    public static void showErrorMessage(String message, Component parent) {
        javax.swing.JOptionPane.showMessageDialog(parent, message, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    public static void showInfoMessage(String message, Component parent) {
        javax.swing.JOptionPane.showMessageDialog(parent, message, "Info", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    public static void setTimeout(Runnable runnable, int delay) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        executor.schedule(runnable, delay, TimeUnit.MILLISECONDS);
    }

}
