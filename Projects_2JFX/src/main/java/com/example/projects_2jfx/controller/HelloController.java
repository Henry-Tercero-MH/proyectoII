package com.example.projects_2jfx.controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import com.example.projects_2jfx.model.Titulo;

import static com.example.projects_2jfx.utils.VariablesGlobales.Preguntas;
import static com.example.projects_2jfx.utils.VariablesGlobales.vTitulo;


public class HelloController {
    @FXML
    ImageView btnSalir;
    @FXML
    ImageView btnRegresarInicio;
    @FXML
    ImageView btnActivar;

    @FXML
  ImageView btnClonar;
    @FXML
    ImageView btnEvaluar;
    @FXML
    ImageView btnTop_3;
    @FXML
    ImageView btnAgregarTitulo;
    @FXML
    ImageView btnEliminar;
    @FXML
    ImageView btnAgregaCuestionario;
    @FXML
    ImageView btnRegresar;
    @FXML
    ImageView btnSiguiente;
    @FXML
    ImageView btnNuevaPregunta;
    //paneles
@FXML
    Pane paneActivar;
    @FXML
    Pane panePrincipal;
    @FXML
    Pane paneAgregarPregunta;
    @FXML
    Pane paneTop_3;
    //tabla y columnas
    //table view tvTitulos, inicia
    @FXML
    TableView<Titulo> tvTitulos;
    @FXML
    TableColumn<Titulo, Integer> tcId;
    @FXML
    TableColumn<Titulo, String> tcTitulo;
    @FXML
    TableColumn<Titulo, String> tcDescripcion;
    //finaliza table view tvtitulos
    //inicia table view tvpreguntas
    @FXML
    TableView<Titulo> tvPreguntas;
    @FXML
    TableColumn<Titulo, Integer> tcPregunta;
    @FXML
    TableColumn<Titulo, String> tcTiempoLimite;
    @FXML
    TableColumn<Titulo, String> tcPunteo;
    @FXML
    TableView<Titulo> tvTitulos2;
    @FXML
    TableColumn<Titulo, Integer> tcId2;
    @FXML
    TableColumn<Titulo, String> tcTitulo2;
    @FXML
    TableColumn<Titulo, String> tcDescripcion2;
    @FXML
    TextField txtTitulo;
    @FXML
    TextField txtDescripcion;
    @FXML
    TextField txtTitulo2;
    @FXML
    TextField txtMostrarTitulo;
    @FXML
    TextField txtMostrarDescripcion;

    @FXML
    TextField txtDescripcion2;
    public HelloController() {
    }
    public void initializePreguntas(){

        tcPregunta.setCellValueFactory( new PropertyValueFactory<Titulo, Integer>("pregunta"));
        tcTiempoLimite.setCellValueFactory( new PropertyValueFactory<Titulo, String>("tiempoLimite"));
        tcPunteo.setCellValueFactory( new PropertyValueFactory<Titulo, String>("punteo"));

        ObservableList<Titulo> data=FXCollections.observableArrayList(Preguntas);
        tvPreguntas.setItems(data);



    }
    public void initialize(){

        tcId.setCellValueFactory( new PropertyValueFactory<Titulo, Integer>("id"));
        tcTitulo.setCellValueFactory( new PropertyValueFactory<Titulo, String>("titulo"));
        tcDescripcion.setCellValueFactory( new PropertyValueFactory<Titulo, String>("descripcion"));

        ObservableList<Titulo> data=FXCollections.observableArrayList(vTitulo);
        tvTitulos.setItems(data);



    }
    public void initialize1(){

        tcId2.setCellValueFactory( new PropertyValueFactory<Titulo, Integer>("id"));
        tcTitulo2.setCellValueFactory( new PropertyValueFactory<Titulo, String>("titulo"));
        tcDescripcion2.setCellValueFactory( new PropertyValueFactory<Titulo, String>("descripcion"));

        ObservableList<Titulo> data1=FXCollections.observableArrayList(vTitulo);
        tvTitulos2.setItems(data1);



    }
    public void initialize2(){
        txtMostrarTitulo.setText(String.valueOf(new PropertyValueFactory<Titulo,String>("titulo")));
        tcDescripcion2.setCellValueFactory( new PropertyValueFactory<Titulo, String>("descripcion"));
        // 1. obtener datos de la GUI




    }
    public void  onClickMenu(MouseEvent actionEvent){
        //llama panel pricipal
        panePrincipal.toFront();
        //llama pane agregar un cuestionario al darle click al icono de agregar
       if( actionEvent.getSource()==btnAgregaCuestionario){
           paneActivar.toFront();

       }
       //regresa al pane principal
       if (actionEvent.getSource()==btnRegresar){
           panePrincipal.toFront();
       }
//
        if (actionEvent.getSource()==btnRegresarInicio){
            paneAgregarPregunta.toFront();
        }
        if (actionEvent.getSource()==btnNuevaPregunta){
            paneTop_3.toFront();
        }

        if (actionEvent.getSource()==btnSalir){
           Platform.exit();
System.exit(0);
        }
    }
    public void onClickAgregarTitulo(MouseEvent mouseEvent){

        // 1. obtener datos de la GUI
        String nombre = txtTitulo.getText();
        String descipcion = txtDescripcion.getText();


        // 2. crear la instancia del modelo pelicula
        Titulo ListaTitulo= new Titulo(nombre,descipcion);

        // 3. guardarlo en el arreglo
        if(!vTitulo.contains(ListaTitulo)){
            vTitulo.add(ListaTitulo);
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("La persona existe");
            alert.showAndWait();
        }
        // 4. limpiar los campos
        txtTitulo.setText("");
        txtDescripcion.setText("");



        //5. visualizar el arreglo en vista

        ObservableList<Titulo> data=FXCollections.observableArrayList(vTitulo);
        tvTitulos.setItems(data);
paneAgregarPregunta.toFront();


    }
    public void onClickAgregarPregunt(MouseEvent mouseEvent){

        // 1. obtener datos de la GUI
        String nombre = txtMostrarTitulo.getText();
        String descipcion = txtMostrarDescripcion.getText();


        // 2. crear la instancia del modelo pelicula
        Titulo ListaTitulo= new Titulo(nombre,descipcion);

        // 3. guardarlo en el arreglo
        if(!vTitulo.contains(ListaTitulo)){
            vTitulo.add(ListaTitulo);
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("La persona existe");
            alert.showAndWait();
        }
        // 4. limpiar los campos
        txtTitulo.setText("");
        txtDescripcion.setText("");



        //5. visualizar el arreglo en vista

        ObservableList<Titulo> data=FXCollections.observableArrayList(vTitulo);
        tvTitulos.setItems(data);
        paneAgregarPregunta.toFront();

    }
    public void onClickseleccionar(MouseEvent event){
        Titulo titulo= tvTitulos.getSelectionModel().getSelectedItem();
        if (titulo!=null){
            txtTitulo.setText(titulo.getTitulo());
            txtDescripcion.setText(titulo.getDescripcion());


        }

    }
    public void onClickAgregarPregunta(MouseEvent eventos){



    }

    public void onClickeliminar(MouseEvent evento){

        Titulo t= tvTitulos.getSelectionModel().getSelectedItem();
        if (t!=null){

            txtTitulo.setText(t.getTitulo());
            txtDescripcion.setText(t.getDescripcion());


        }
        if (t==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Seleccione la Fila que desea eliminar!");
            alert.showAndWait();
        }else{
           vTitulo.remove(t);
            tvTitulos.refresh();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("El pin: "+(tvTitulos.getSelectionModel().getSelectedItem()).getId()+" Se Elimino con Exito!");
            alert.showAndWait();
            }
            ObservableList<Titulo> data=FXCollections.observableArrayList(vTitulo);
        tvTitulos.setItems(data);
    }


    public void onClickMostrarDatos(MouseEvent mouseEvent) {
       
        // Cargar objetos en la tabla
       initialize1();


        }


    }
