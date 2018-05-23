public class RealImagen implements Imagen {

   private String ruta;

   public RealImage(String ruta){
      this.ruta = ruta;
      loadFromDisk(ruta);
   }

   @Override
   public void mostrar() {
      System.out.println("Mostrando " + ruta);
   }

   private void cargarDisco(String ruta){
      System.out.println("Cargando " + ruta);
   }
}