//package project
        import javafx.application.Application;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.layout.StackPane;
        import javafx.stage.Stage;
        import javax.swing.*;	// extended package of java
        import javafx.application.Platform;
        import javafx.embed.swing.JFXPanel;
        import javafx.scene.web.WebView;


/**
 *
 *
 */



public class pro extends JFrame implements Runnable  {	//using funtions of jframe

    private JFXPanel panel ;

    public void run(){
        setTitle("Search"); 		//set title of window
        setBounds(0 , 0 , 1950 , 1050 ); 	//size of frame
        setVisible(true); //make visible true

        panel = new JFXPanel();
        add(panel); //add panel to frame;

        Platform.runLater( () -> {
            WebView view = new WebView();
            view.getEngine().load("http://www.google.com");
            panel.setScene(new Scene(view));
            //webengine.load("http://stackoverflow.com");
            //primaryStage.setScene(new Scene(webview, 800, 800));
        });
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SwingUtilities.invokeLater(new pro());	

    }



    /**
     * @param args the command line arguments
     */


}

