package com.design.pattern.creational.factory;

public class ShapeFactory {
	
	   //use getShape method to get object of type shape 
	   public Shape getShape(ShapeType shapeType){
	      if(shapeType == ShapeType.NULL){
	         return null;
	      }		
	      if(shapeType==ShapeType.CIRCLE){
	         return new Circle();
	         
	      } else if(shapeType== ShapeType.RECTANGE){
	         return new Rectangle();
	         
	      } else if(shapeType==ShapeType.SQUARE){
	         return new Square();
	      }
	      
	      return null;
	   }
	}