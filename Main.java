class Cpu{
int price=10000;

class Processor{
int core=7;
String manufacturer="intel";
}

static class Ram{
String memory="12 gb";
String manufacturer="ibm";
}
}
public class Main{
    
public static void main(String args[]){
    Cpu cpu=new Cpu();
    Cpu.Processor processor =cpu.new Processor();
    Cpu.Ram ramobj=new Cpu.Ram();
    System.out.println("The details of PROCESSOR");
    System.out.println("Price:"+cpu.price);
    System.out.println("Number of cores:"+processor.core);
  System.out.println("Manufacturer:"+processor.manufacturer);
  System.out.println(" ");
  System.out.println("The details of RAM");
  System.out.println("Memory:"+ramobj.memory);  
  System.out.println("Manufacturer:"+ramobj.manufacturer);
}
    
    
}