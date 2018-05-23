public class ProxyImagen implements Imagen{

   private RealImagen realImagen;
   private String ruta;

   public ProxyImagen(String ruta){
      this.ruta = ruta;
   }

   @Override
   public void mostrar() {
      if(ruta == null){
         ruta = new RealImagen(ruta);
      }
      realImagen.display();
   }
}
