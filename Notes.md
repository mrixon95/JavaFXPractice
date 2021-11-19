## JavaFX notes

**Stage** is a top level JavaFX container to hold our GUI applications

JavaFX GUI has a stage, scene, scene-graph and various nodes

The stage is our window and similar to JFrame.

Scene is a drawing surface for graphical content similar to JPanel in swing

Scene-graph is a hierarchical tree data structures to hold and arrange nodes.

Need a root node to create a scene.

Scene is added to stage

Nodes can be images, button



Need to override start method which is inherited from Application class.

launch method is a static method inherited from Application

Behind the scenes our start method will be called

Scene needs root node to be passed in to the constructor 

root are layout managers, dictates how the nodes eg. images, button, text fields etc. are laid out.

Need to set the scene before we show the stage

Scene is container for nodes





Need to override start method.

```java
public static void main(String[] args) {
        launch(args);
    }
```



Start method will automatically be called.



```java
Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);
        Stage stage = new Stage();

        Text text = new Text(); // text object

        text.setText("WHOOAA!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.LIMEGREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.1);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
        );
        triangle.setFill(Color.YELLOW);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        Image image = new Image("pizza.JPG");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);

        root.getChildren().add(text); // add text node to root node
        root.getChildren().add(line); // add line node to root node
        root.getChildren().add(rectangle); // add line node to root node
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();

```



```java
@Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("icon.jpg"); // will look in your src folder. Hence only need file name
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("WOOWWW TITLE BLAH");
        primaryStage.setWidth(420);
        primaryStage.setHeight(420);
        primaryStage.setResizable(false);
//        primaryStage.setX(50);
//        primaryStage.setY(50);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("You can't escape unless you pres q");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));


        primaryStage.setScene(scene);
        primaryStage.show();
    }
```

