public class Principal {
    abstract class Envio {
        abstract int precio();
        abstract String tiempoDeEnvio();
    }

    abstract class Municipal extends Envio {
    @Override
    int precio() {
        return 5000;
    }
    String tiempoDeEnvio() {  
        return "Tiempo envio 12 horas";
        } 
    }

    abstract class Intermunicipal extends Envio {
    @Override
    int precio() {
        return 15000;
    }            
    String tiempoDeEnvio() {    
        return "Tiempo envio 36 horas";
        } 
    }

    abstract class Internacional extends Envio {
    @Override
    int precio() {
        return 25000;
    }            
    String tiempoDeEnvio() {     
        return "Tiempo envio 90 horas";
        } 
    }
    
public void main(String[] args) {
        Envio[] arrayEnvio = {
        new Municipal() {},
        new Intermunicipal() {},
        new Internacional() {}
        };
        
        imprimirTiempoDeEnvio(arrayEnvio);
    }

public static void imprimirTiempoDeEnvio(Envio[] arrayEnvio) {
    for (Envio Envio : arrayEnvio) {
        System.out.println(Envio.tiempoDeEnvio());
        }
    }
}
