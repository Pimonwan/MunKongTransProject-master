package view;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;



public class MainView {
    DisplayPath dis = new DisplayPath();


    protected Button no510button = new Button("สาย 510");
    protected Button no29button = new Button("สาย 29");
    protected Button no134button = new Button("สาย 134");
    protected Button no555button = new Button("สาย 555");
    protected Button no191button = new Button("สาย 191");
    protected Label chooseBusNoLabel = new Label("เลือกสายรถเมล์");
    protected VBox buttonLayout = new VBox(15);
    protected BorderPane backLayout = new BorderPane();
    protected Label searchLabel = new Label("ค้นหาสายรถเมล์จากป้าย");
    protected GridPane chooseBusNoLayout = new GridPane();
    protected GridPane searchLayout = new GridPane();
    protected TextField searchTextField = new TextField();
    protected TextArea searchResultArea = new TextArea();

    public Parent buildView(){
        chooseBusNoLayout.setPadding(new Insets(0,10,10,10));
        chooseBusNoLayout.setVgap(20);
        chooseBusNoLayout.setHgap(30);

        //set chooseLayout
        GridPane.setConstraints(chooseBusNoLabel,0,0);
        GridPane.setConstraints(buttonLayout,0,1);
        no29button.setPrefSize(120,70);
        no134button.setPrefSize(120,70);
        no510button.setPrefSize(120,70);
        no191button.setPrefSize(120,70);
        no555button.setPrefSize(120,70);
        buttonLayout.getChildren().addAll(no29button,no134button,no191button,no510button,no555button);
        buttonLayout.setAlignment(Pos.CENTER);
        chooseBusNoLayout.getChildren().addAll(chooseBusNoLabel,buttonLayout);


        //set searchLayout
        GridPane.setConstraints(searchLabel,0,0);
        GridPane.setConstraints(searchTextField,0,1);
        GridPane.setConstraints(searchResultArea,0,2);
        searchTextField.setPrefWidth(21);
        searchResultArea.setPrefSize(21,430);
        searchResultArea.setDisable(true);
        searchLayout.setVgap(20);
        searchLayout.getChildren().addAll(searchLabel,searchTextField,searchResultArea);

        //Main Layout
        backLayout.setPadding(new Insets(10,20,10,10));
        backLayout.setLeft(chooseBusNoLayout);
        backLayout.setRight(searchLayout);

        return backLayout;

    }


    public Button getNo510button() {
        System.out.println("510");
        return no510button;
    }
    public Button getNo29button() {
        System.out.println("29");
        return no29button;
    }
    public Button getNo134button() {
        System.out.println("134");
        return no510button;
    }
    public Button getNo555button() {
        System.out.println("555");
        return no510button;
    }
    public Button getNo191button() {
        System.out.println("191");
        return no510button;
    }

    public BorderPane getBackLayout(){
        return backLayout;
    }

}
