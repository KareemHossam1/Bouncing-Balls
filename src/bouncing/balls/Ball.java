package bouncing.balls;
// Imported packages
import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
public class Ball {
    Random randomValue = new Random();  // Creating an object from random class to generate random values
    Circle ball = new Circle(); // Create a circle
    Timeline moveBall;  // Create a timeline to move balls
    public Ball(){
        ball.setCenterX(randomValue.nextInt(480)+60);//Set center X randomly(480&+60 not to make the ball be outside the window)
        ball.setCenterY(randomValue.nextInt(480)+60);//Set center Y randomly(480&+60 not to make the ball be outside the window)
        ball.setRadius(randomValue.nextInt(50)+10);//Set Radius randomly(50&+10 not to make the ball be outside the window)
        ball.setStroke(Color.BLACK);    // Make a stroke for balls
        ball.setFill(Color.rgb(randomValue.nextInt(255), randomValue.nextInt(255), randomValue.nextInt(255)));// Set balls color randomly
        moveBall = new Timeline(new KeyFrame(Duration.seconds(1),e->{   // Set duration to 1 second
            ball.setCenterX(randomValue.nextInt(480)+60);//Change center X randomly(480&+60 not to make the ball be outside the window)
            ball.setCenterY(randomValue.nextInt(480)+60);//Change center Y randomly(480&+60 not to make the ball be outside the window)
        }));
        moveBall.setCycleCount(Timeline.INDEFINITE);    // Set timeline cycle count
        moveBall.play();    // Play timeline
    }
    // A method to return the ball circle
    public Circle getBall(){
        return ball;
    } 
    // A method to return the timeline
    public Timeline getTimeline(){
        return moveBall;
    }}