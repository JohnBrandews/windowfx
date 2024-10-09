package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
//	StackPane root = new StackPane();
		try {
		Parent root = FXMLLoader.load(getClass().getResource("/application/ViewOne.fxml"));
		Scene scene = new Scene(root);
//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//it allows us to link multiple scenes to this css
		String css = this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		primaryStage.setScene(scene);
		primaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	} 
	}
	
		
		
//		Image icon = new Image("image.png");
//		Image image = new Image("image.png");
//		ImageView imageview = new ImageView(image);
//		root.getChildren().add(imageview);
//		Text text = new Text();
//		text.setText("welcome");
//		text.setX(100);
//		text.setY(100);
//		text.setFont(Font.font("Verdana",50));
//		root.getChildren().add(text);
//		Line line = new Line();
//		line.setStartX(200);
//		line.setStartY(200);
//		line.setEndX(500);
//		line.setEndY(200);
//		line.setStrokeWidth(5);
//		line.setStroke(Color.RED); 
//		root.getChildren().add(line);
//		Rectangle rectangle = new Rectangle();
//		rectangle.setWidth(100);
//		rectangle.setHeight(100);
//		rectangle.setX(300);
//		rectangle.setY(300);
//		root.getChildren().add(rectangle);
//		primaryStage.getIcons().add(icon);
//		primaryStage.setWidth(600);
//		primaryStage.setHeight(600);
//		primaryStage.setScene(scene);
//		primaryStage.setTitle("hello");
//		primaryStage.show();
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
