public class MeasureTime{
// EJEMPLOS PARA VER VELOCIDAD DE METODO
  public void printHello(){
    System.out.println("Hello");
  }

  public int factorial(int num){
    if (num <= 1)
      return num;
    else
      return num * factorial(num - 1);
  }

  // MAIN
  public static void main(String[] args){
    long startTime, endTime, duration;
    MeasureTime t = new MeasureTime();
    //System.nanoTime();

    startTime = System.nanoTime();
    System.out.println(t.factorial(5));
    endTime = System.nanoTime();
    duration = (endTime - startTime);
    System.out.println(duration);

    startTime = System.nanoTime();
    t.printHello();
    endTime = System.nanoTime();
    duration = (endTime - startTime);
    System.out.println(duration);

    startTime = System.nanoTime();
    System.out.println(t.factorial(30));
    endTime = System.nanoTime();
    duration = (endTime - startTime);
    System.out.println(duration);
  }
}
