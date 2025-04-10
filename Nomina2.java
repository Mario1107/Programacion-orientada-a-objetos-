import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nomina2 {

  public static void main(String[] args)throws Exception{

    int numEmpleados;
    Empleado[] empleados = new Empleado[50];
    String cedula, apellido, nombre;
    double horas, sueldo;
    double total = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Ingrese el numero de empleados: ");
    numEmpleados = Integer.valueOf(br.readLine()).intValue();

    for (int i = 0; i < numEmpleados; i++){

      System.out.println("Ingrese la cedula del empleado: ");
      cedula = br.readLine();

      System.out.println("Ingrese el apellido del empleado: ");
      apellido = br.readLine();

      System.out.println("Ingrese el nombre del empleado: ");
      nombre = br.readLine();

      System.out.println("Ingrese las horas trabajadas del empleado: ");
      horas = Double.valueOf(br.readLine()).doubleValue();

      System.out.println("Ingrese el sueldo por hora del empleado: ");
      sueldo = Double.valueOf(br.readLine()).doubleValue();

      Empleado unEmpleado = new Empleado(cedula, apellido, nombre, horas,sueldo);
      
      empleados[i] = unEmpleado;


      }
    for (int i = 0; i < numEmpleados; i++){

      total = total + empleados[i].calcularSueldo();
    }
    System.out.println("La nomina total es: " + total);
  }

}