package adrsoft.scool.club;


import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import javax.swing.JLabel;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

/**
 * Clase instanciadora de las normas del club del usuario. Depende de a que club pertenezca,
 * aparecerán unas normas u otras.
 * @author adrSoft
 * @version vAlpha10
 *
 */
public class Normas extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private int mIdClub;
    private JTextArea textArea;

    /**
	 * Constructor de la clase con un argumento, idClub, que es el club del usuario activo.
	 * @author adrSoft
	 * @version vAlpha10
	 * @param idClub = Identificador del club al que pertenece el usuario activo.
	 */
	public Normas(int idClub) {
	    this.mIdClub = idClub;
	    ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).setNorthPane(null);
		init();
		
	}

	
	/**
	 * Inicializador de los componentes en el JFrame.
	 * @author adrSoft
	 * @version vAlpha10
	 */
	private void init() {
	    getContentPane().setBackground(UIManager.getColor("textHighlight"));
		setBounds(100, 100, 710, 300);
		((javax.swing.plaf.basic.BasicInternalFrameUI) 
				getUI()).setNorthPane(null);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Verdana", Font.PLAIN, 15));
		textArea.setBackground(new Color(153, 204, 255));
		
		JLabel lblNormas = new JLabel("Normas");
		lblNormas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNormas.setForeground(Color.BLUE);
		lblNormas.setFont(new Font("Verdana", Font.BOLD, 20));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 616, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNormas, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNormas, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		rellenarInfo();
	}

	/**
	 * Método encargado de rellenar las normas del club del usuario.
	 * <br>
	 * Dependiendo del parámetro idClub recogido en el constructor, mostrará unas normas u otras.
	 * 
	 * @author adrSoft
	 * @version vAlpha10
	 */
	private void rellenarInfo() {
	    textArea.setEditable(false);
	   
	    String ajedrez = "Normas del club Jaque Mate:\n\n\t\t- Sé respetuoso con todo el mundo.\n\n\t\t- Cuida el material que manejas.\n\n\t\t- No te alteres por el resultado de las partidas. Es solo un juego.\n\n\t\t- Hazte responsable de tus obligaciones relacionadas con tu rango.\n\n\t\t- Disfruta!!";
	    String lectura = "Normas del club MundoLibro:\n\n\t\t- Respeta a todas las personas.\n\n\t\t- Cuida bien los libros, son tus amigos!\n\n\t\t- Si te llevas un libro, hazselo saber a su propietario.\n\n\t\t- Lleva un registro concienzudo de las entradsa y salidas de libros.\n\n\t\t- Respeta las criticas de los demás.";
	    String videojuegos = "Normas del club ExtraLife:\n\n\t\t- Sé respetuoso con las demás personas. Tratalas como te gustaría que te tratasen a tí.\n\n\t\t- No te ofusques con los juegos. No son más que eso, juegos.\n\n\t\t- No incites al malestar a las demás personas. \n\n\t\t- Si quieres llevarte algun juego, actializa la hoja de inventario y comunicaselo al presidente y al propietario. \n\n\t\t- Disfruta!";
	    String atletismo = "Normas del club MundoLibro:\n\n\t\t- Respeta a todo el mundo.\n\n\t\t- Ayuda a los lesionados.\n\n\t\t- Duchate una vez acabada la actividad física. \n\n\t\t- Habla con tu superior si quieres retar a alguien a una carrera.";
	    
	   switch(mIdClub){
	       case 1:	    
	    textArea.setText(ajedrez);
		   break;
	       case 2:
		   textArea.setText(atletismo);
		   break;
	       case 3:
		   textArea.setText(videojuegos);
		   break;
	       case 4:
		   textArea.setText(lectura);
		   break;
	       
	   }
	    
	}
}
