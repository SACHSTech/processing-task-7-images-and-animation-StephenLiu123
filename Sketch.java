import processing.core.PApplet;
import processing.core.PImage;

/**
 * A program that has a spaceship fly across a galaxy with planets
 * @author Stephen Liu
 * 
 */

public class Sketch extends PApplet {

  // Declare variables

  PImage imgBG;
  PImage imgSpaceship;
  PImage imgPlanet;

  float spaceshipX = 10;
  float spaceshipY = 200;
  float spaceshipSPD = 3;

  float circleX = 50;
  float circleY = 50;
  float circleSPD = 2;

  int radian;
  float planetX;
  float planetY;
  

	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

    // Load background into program
    imgBG = loadImage("C:/Users/Steph/github-classroom/SACHSTech/processing-task-7-images-and-animation-StephenLiu123/SpaceBG.jpg");

    // Load spaceship into program
    imgSpaceship = loadImage("C:/Users/Steph/github-classroom/SACHSTech/processing-task-7-images-and-animation-StephenLiu123/Spaceship.png");

    // Load planet into program
    imgPlanet = loadImage("C:/Users/Steph/github-classroom/SACHSTech/processing-task-7-images-and-animation-StephenLiu123/Planet.png");
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Draw background
  image(imgBG, 0, 0);

  // Draw spaceship and make it move
  image(imgSpaceship, spaceshipX, spaceshipY);
  imgSpaceship.resize(200,200);
   spaceshipX += spaceshipSPD;
   spaceshipY += 0;

   // Add collision detection to spaceship
   if(spaceshipX < 0 || spaceshipX > 600){
    spaceshipSPD *= -1;
   }
   // Draw circle 
   fill(140, 236, 255);
   ellipse(circleX, circleY, 100, 100);

   // Make circle move and add collision detection
   circleX += circleSPD;
   circleY += circleSPD;
   if(circleX < 40 || circleY > 570){
    circleSPD *= -1;
   }

   // Draw planet and make planet move
   imgPlanet.resize(300, 300);
   radian += 1;
   planetX += (float) (100 * Math.sin(radian));
   planetY += (float) (100 * Math.cos(radian));
   image(imgPlanet, planetX, planetY);

   }
  }

   
    
    
   
  
  

