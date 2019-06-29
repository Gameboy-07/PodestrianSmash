package PodSmash;

import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.imageio.ImageIO;

import metrics.Dimension;

public class Picture  {
	
	private static Image image;
	private static boolean didLoad = false;
	private int width;
	private int height;
	
	public static void loadImage(String fileName){
		Image i = null;
		try {
			i = ImageIO.read(Picture.class.getResource(fileName));
			image = i;
			didLoad = true;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void loadDimensions(){
		if(didLoad){
			width = image.getWidth((ImageObserver) this);
			height = image.getHeight((ImageObserver) this);
		}
	}
	
	public boolean didLoad(){
		return didLoad;
	}
	
	public Image getImage(){
		return image;
	}
	
	public Dimension getDimensions(){
		return new Dimension(width, height);
	}
	
	
}
