package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.shape.Line;
import view.DisplayPath;
import view.MainView;

import java.awt.event.ActionListener;

public class Controller implements EventHandler<ActionEvent>{

    public Parent setMainView(){
        MainView mainView = new MainView();


        mainView.getNo29button().setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                DisplayPath display = new DisplayPath();
                mainView.getBackLayout().setCenter(display.buildView("29"));
            }
        });

        Parent parent = mainView.buildView();
        return parent;
    }
    @Override
    public void handle(ActionEvent event){

    }
}
