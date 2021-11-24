package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Ventana1Controller {

	@FXML
	Button bUno;

	@FXML
	Label lTexto;

	@FXML
	TextField tfTexto;

	String textoOriginal = null;

	ArrayList<String> l = new ArrayList<>();
	int elementoSeleccionado = 0;

	@FXML
	public void initialize(){
		l.add("Uno");
		l.add("Dos");
		l.add("Tres");
	}

	@FXML
	private void onButtonAbrirClicked() {
		System.out.println("Botón pulsado");
		bUno.setStyle("-fx-background-color: blue;");
		if (elementoSeleccionado < l.size()){
			lTexto.setText(l.get(elementoSeleccionado));
			elementoSeleccionado++;
		} else {
			lTexto.setText(tfTexto.getText());
		}
	}

	@FXML
	private void onMouseEntered(){
		if (textoOriginal == null) {
			textoOriginal = bUno.getText();
		}
		System.out.println("El botón ha entrado");
		bUno.setText("Esto furula");
	}

	@FXML
	private void onMouseExited(){
		System.out.println("El botón ha salido");
		bUno.setText(textoOriginal);
	}
}