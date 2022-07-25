public class Envio {

  String tipo;
  int precio;
  

  Envio(String tipo, Integer precio) {
    this.tipo = tipo;
    this.precio = precio;
  }

  String getTipoEnvio() {
    return this.tipo;
  }
  
  int getPrecioEnvio() {
    return this.precio;
  }
}  

class GuardarEnvioDB {
    void guardarEnvioDB (Envio Envio) {}
}