package bouncing.balls;
// Imported packages
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class BouncingBalls extends Application {
    // Creating balls from Ball class
    Ball ball1 = new Ball();
    Ball ball2 = new Ball();
    Ball ball3 = new Ball();
    Ball ball4 = new Ball();
    Ball ball5 = new Ball();
    Ball ball6 = new Ball();
    Ball ball7 = new Ball();
    Ball ball8 = new Ball();
    Ball ball9 = new Ball();
    Ball ball10 = new Ball();
    
    Pane pane = new Pane(); // Creating a pane to add elements
    // Creating buttons and etting their text
    Button start = new Button("Start");
    Button pause = new Button("Pause");
    Button changeColor = new Button("Change Color");
    Button changeRadius = new Button("Change Radius");
    
    HBox buttons = new HBox(20);    // Creating HBox to order elements
    Random randomValue = new Random();  // Creating an object from random class to generate random values
    @Override
    public void start(Stage primaryStage) {
        buttons.getChildren().addAll(start,pause,changeColor,changeRadius); // Order buttons horizontally
        buttons.setPadding(new Insets(570,0,0,105));    // Set buttons position
        pane.getChildren().addAll(ball1.getBall(),ball2.getBall(),ball3.getBall(),ball4.getBall(),
                ball5.getBall(),ball6.getBall(),ball7.getBall(),ball8.getBall(),ball9.getBall(),
                ball10.getBall(),buttons);  // Add elements to pane
        // Event handler for start button 
        start.setOnAction(e->{
            // Play timeline to move balls
            ball1.getTimeline().play();
            ball2.getTimeline().play();
            ball3.getTimeline().play();
            ball4.getTimeline().play();
            ball5.getTimeline().play();
            ball6.getTimeline().play();
            ball7.getTimeline().play();
            ball8.getTimeline().play();
            ball9.getTimeline().play();
            ball10.getTimeline().play();
        });
        // Event handler for pause button 
        pause.setOnAction(e->{
            // Stop timeline
            ball1.getTimeline().stop();
            ball2.getTimeline().stop();
            ball3.getTimeline().stop();
            ball4.getTimeline().stop();
            ball5.getTimeline().stop();
            ball6.getTimeline().stop();
            ball7.getTimeline().stop();
            ball8.getTimeline().stop();
            ball9.getTimeline().stop();
            ball10.getTimeline().stop(); 
        });
        // Event handler for Change Color button 
        changeColor.setOnAction(e->{
            // Change balls color randomly
            ball1.getBall().setFill(Color.rgb(randomValue.nextInt(255),randomValue.nextInt(255),randomValue.nextInt(255)));
            ball2.getBall().setFill(Color.rgb(randomValue.nextInt(255),randomValue.nextInt(255),randomValue.nextInt(255)));
            ball3.getBall().setFill(Color.rgb(randomValue.nextInt(255),randomValue.nextInt(255),randomValue.nextInt(255)));
            ball4.getBall().setFill(Color.rgb(randomValue.nextInt(255),randomValue.nextInt(255),randomValue.nextInt(255)));
            ball5.getBall().setFill(Color.rgb(randomValue.nextInt(255),randomValue.nextInt(255),randomValue.nextInt(255)));
            ball6.getBall().setFill(Color.rgb(randomValue.nextInt(255),randomValue.nextInt(255),randomValue.nextInt(255)));
            ball7.getBall().setFill(Color.rgb(randomValue.nextInt(255),randomValue.nextInt(255),randomValue.nextInt(255)));
            ball8.getBall().setFill(Color.rgb(randomValue.nextInt(255),randomValue.nextInt(255),randomValue.nextInt(255)));
            ball9.getBall().setFill(Color.rgb(randomValue.nextInt(255),randomValue.nextInt(255),randomValue.nextInt(255)));
            ball10.getBall().setFill(Color.rgb(randomValue.nextInt(255),randomValue.nextInt(255),randomValue.nextInt(255)));
        });
        // Event handler for Change Radius button 
        changeRadius.setOnAction(e->{
            // Change balls radius randomly
            ball1.getBall().setRadius(randomValue.nextInt(50)+10);
            ball2.getBall().setRadius(randomValue.nextInt(50)+10);
            ball3.getBall().setRadius(randomValue.nextInt(50)+10);
            ball4.getBall().setRadius(randomValue.nextInt(50)+10);
            ball5.getBall().setRadius(randomValue.nextInt(50)+10);
            ball6.getBall().setRadius(randomValue.nextInt(50)+10);
            ball7.getBall().setRadius(randomValue.nextInt(50)+10);
            ball8.getBall().setRadius(randomValue.nextInt(50)+10);
            ball9.getBall().setRadius(randomValue.nextInt(50)+10);
            ball10.getBall().setRadius(randomValue.nextInt(50)+10);
        });
        Scene scene = new Scene(pane, 600, 600);    // Create a scene and set size
        primaryStage.setTitle("Bouncing Ball"); // Set a window title 
        primaryStage.setScene(scene);   // Add scene to the stage
        primaryStage.show();    // Show stage
        primaryStage.setResizable(false);   // Make stage unresizable
    }
    public static void main(String[] args) {
        launch(args);
    }}