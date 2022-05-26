import javax.swing.*;
//JOptionPane
public class PersonaMain {
    public static void main(String[] args) {
    JOptionPane v = new JOptionPane();
    String laVariable="";
    Persona tipo= new Persona();
    laVariable=tipo.imprimir();
    System.out.println(laVariable);
    v.showMessageDialog(null, laVariable);
    System.exit(0);

}
    }
