/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casaspropietarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author daw
 */
public class FXMLDocumentController implements Initializable {

    Propietario p;
    @FXML
    private TextField txtNombrePropietario;
    @FXML
    private TextField txtApellidoPropietario;
    @FXML
    private TextField txtEdadPropietario;
    @FXML
    private TextField txtDniPropietario;
    @FXML
    private TextField txtRefVivienda;
    @FXML
    private TextField txtDireccionVivienda;
    @FXML
    private TextField txtLocalidadVivienda;
    @FXML
    private TextField txtPaisVivenda;
    @FXML
    private TextField txtValorVivienda;
    @FXML
    private Button btnEnviarDatosPropietario;
    @FXML
    private Button btnEnviarDatosVivienda;
    @FXML
    private Button btnMostrarDatos;
    @FXML
    private TextArea txaMostrarResultado;
    @FXML
    private MenuItem menuItemCSV;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        p = new Propietario();
    }

    @FXML
    private void enviarDatosPropietario(ActionEvent event) {
        p.setNombre(txtNombrePropietario.getText());
        p.setApellidos(txtApellidoPropietario.getText());
        p.setEdad(Integer.parseInt(txtEdadPropietario.getText()));
        p.setDni(txtDniPropietario.getText());
        p.setVivienda(txtRefVivienda.getText());
        txtNombrePropietario.clear();
        txtApellidoPropietario.clear();
        txtEdadPropietario.clear();
        txtDniPropietario.clear();
        txtRefVivienda.clear();
        p.introducirUsuario();
    }

    @FXML
    private void enviarDatosVivienda(ActionEvent event) {
    }

    @FXML
    private void mostrarDatos(ActionEvent event) {
        txaMostrarResultado.clear();
        for (int i = 0; i < p.propietarios.size(); i++) {
            txaMostrarResultado.setText(txaMostrarResultado.getText() + p.propietarios.get(i) + "\n");

        }
    }

    @FXML
    private void guardarComoCSV(ActionEvent event) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("texto_txt.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);
        pw.format(txaMostrarResultado.getText());
        pw.close();
    }

    @FXML
    private void abrirArchivoTXT(ActionEvent event) {
        File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("texto_txt.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         ArrayList<Propietario> linea = new ArrayList<>();
         while((linea=br.readLine())!=null)
            txaMostrarResultado.setText(linea);
      }
      catch(Exception e){
         e.printStackTrace();
      }
//      finally{
//         // En el finally cerramos el fichero, para asegurarnos
//         // que se cierra tanto si todo va bien como si salta 
//         // una excepcion.
//         try{                    
//            if( null != fr ){   
//               fr.close();     
//            }                  
//         }catch (Exception e2){ 
//            e2.printStackTrace();
//         }
//      }
    }

}
