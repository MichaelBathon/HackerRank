import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

/**
 * Created by michaelbathon on 2/20/16.
 */

class Volume {
    double volume;

    public double main(int a){
        return Math.pow(a,3);
    }

    public double main(int l, int b, int h){
        return l * b * h;
    }

    public double main(double radius){
        double pie = Math.PI;
        double rCubed = Math.pow(radius,3);
        double twoThirds = (2d/3d);
        volume = twoThirds*pie*rCubed;

        return volume;
    }

    public double main(double radius, double height){
        return (Math.PI)*(Math.pow(radius, 2))*height;
    }

}

class Display {
    public void display(double volume){
        System.out.printf("%.3f\n", volume);
    }
}




class Calculate{
    Scanner scan;
    Display output;

    Calculate() throws IOException{
        scan = new Scanner(System.in);
        output = new Display();
        if(scan==null)
            throw new IOException("Exception thrown");
    }

    public int getINTVal() throws java.lang.NumberFormatException {
        int num = scan.nextInt();
        if(num <= 0){
            throw new java.lang.NumberFormatException("All the values must be positive");
        }
        else
        return num;
    }

    public double getDoubleVal() throws java.lang.NumberFormatException {
        double num = scan.nextDouble();
        if(num <= 0){
            throw new java.lang.NumberFormatException("All the values must be positive");
        }
        else
        return num;
    }

    public static Volume get_Vol() {
        return new Volume();
    }

}




public class CalculateVolumeSolution {

    public static void main(String[] args){
        Do_Not_Terminate.forbidExit();
        try{
            Calculate cal=new Calculate();
            int T=cal.getINTVal();
            while(T-->0){
                double volume = 0.0d;
                int ch=cal.getINTVal();
                if(ch==1){
                    int a=cal.getINTVal();
                    volume=Calculate.get_Vol().main(a);
                }else if(ch==2){
                    int l=cal.getINTVal();
                    int b=cal.getINTVal();
                    int h=cal.getINTVal();
                    volume=Calculate.get_Vol().main(l,b,h);
                }else if(ch==3){
                    double r=cal.getDoubleVal();
                    volume=Calculate.get_Vol().main(r);
                }else if(ch==4){
                    double r=cal.getDoubleVal();
                    double h=cal.getDoubleVal();
                    volume=Calculate.get_Vol().main(r,h);
                }
                cal.output.display(volume);
            }
        }
        catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}
/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {
    public static class ExitTrappedException extends SecurityException {}

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}

