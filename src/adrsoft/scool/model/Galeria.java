package adrsoft.scool.model;

import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Clase encargada de cargar las fotos para luego manipularlas desde la 
 * clase Fotos del paquete adrsoft.scool.club
 * 
 * @author apegna
 *@version vAlpha10
 */
public class Galeria {

    private ArrayList<ImageIcon> fotos = new ArrayList<ImageIcon>();
    private ImageIcon nofoto;
    private int club;

    /**
     * Constructor vacio.
     * @author adrSoft
     * @version vAlpha10
     * @param club2 
     */
    public Galeria(int club2){
    	this.club=club2;
        cargarFotos();
      
    }

    /**
     * M�todo encargado de cargar las fotos desde la carpeta "fotos".
     * @author adrSoft
     * @version vAlpha10
     */
    private void cargarFotos() {
    	
    	switch(club){
    	case 1:
    		nofoto = new javax.swing.ImageIcon(getClass().getResource("/fotos/nophoto.jpg"));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/0.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/1.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/2.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/3.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/4.jpg")));
	        break;
    	case 2: 
    		nofoto = new javax.swing.ImageIcon(getClass().getResource("/fotos/nophoto.jpg"));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/0.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/1.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/2.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/3.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/4.jpg")));
	        break;
    	case 3:
    		nofoto = new javax.swing.ImageIcon(getClass().getResource("/fotos/nophoto.jpg"));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/videojuegos/a.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/videojuegos/b.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/videojuegos/c.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/videojuegos/d.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/videojuegos/e.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/videojuegos/f.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/videojuegos/g.jpg")));
	        break;
    	case 4:
    		nofoto = new javax.swing.ImageIcon(getClass().getResource("/fotos/nophoto.jpg"));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/0.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/1.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/2.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/3.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/4.jpg")));
	        break;
    	}
	    	nofoto = new javax.swing.ImageIcon(getClass().getResource("/fotos/nophoto.jpg"));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/0.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/1.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/2.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/3.jpg")));
	        fotos.add(new javax.swing.ImageIcon(getClass().getResource("/fotos/clubs/lectura/4.jpg")));

	}


    /**
     * Devuelve una imagen de tama�o 100x100 como una vista previa
     * @author adrSoft
     * @param num = Indice de la foto elegida
     * @version vAlpha10
     * 
     */
    public Icon getPreview(int num){
        if( num>=0 & num<fotos.size() )
        {
            Image mini = fotos.get(num).getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING);
            return new ImageIcon(mini);
        }
        else
        {
            Image mini = nofoto.getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING);
            return new ImageIcon(mini);
        }
    }

   
    /**
     * Devuelve la foto original. Si el tama�o es mayor que el contenedor, lo redimensiona.
     * @author adrSoft
     * @param num = Indice de la foto elegida
     * @param d = Dimensi�n de la foto
     * @version vAlpha10
     * 
     */
   public Icon getFoto(int num, Dimension d){
        if( num>=0 & num<fotos.size() )
        {
            //si la foto es mas grande que el contendor -> redimensionar
            if(fotos.get(num).getIconWidth()>d.getWidth()){
                float v = getValor(fotos.get(num).getIconWidth(),d.width);
                return Disminuir(fotos.get(num),v);
            }else if(fotos.get(num).getIconHeight()>d.getHeight()){
                float v = getValor(fotos.get(num).getIconHeight(),d.height);
                return Disminuir(fotos.get(num),v);
            }else{
                return fotos.get(num);
            }
        }
        else
        {
            Image mini = nofoto.getImage().getScaledInstance(400, 400, Image.SCALE_AREA_AVERAGING);
            return new ImageIcon(mini);
        }
    }

   
   /**
    * Redimensiona la imagen para que quepa en el contenedor pero manteniendo sus proporciones.
    * @author adrSoft
    * @param i = Imagen a tratar.
    * @param v = Valor de redimensionado 
    * @version vAlpha10
    * 
    */
    private ImageIcon Disminuir(ImageIcon i, float v){
        int valEscalaX = (int) (i.getIconWidth() * v );
        int valEscalaY = (int) (i.getIconHeight() * v );
        Image mini = i.getImage().getScaledInstance(valEscalaX, valEscalaY, Image.SCALE_AREA_AVERAGING);
        return new ImageIcon(mini);
     }

    
    /**
     * Devuelve el valor de escalado para redimensionar la imagen.
     * @author adrSoft
     * @version vAlpha10
     * @param a
     * @param b
     */
    private float getValor(int a, int b){
        return Math.abs((a/new Float(b))-2f);
    }
}