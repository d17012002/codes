import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class javaAdv {
    public static void main(String[] args) {
        PrinterJob job = PrinterJob.getPrinterJob();

        if (job.printDialog()) {
            System.out.println("Printer is available.");
        } else {
            try {
                throw new PrinterException("No printers are available.");
            } catch (PrinterException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
