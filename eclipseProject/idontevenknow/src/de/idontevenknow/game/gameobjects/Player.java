package de.idontevenknow.game.gameobjects;


import de.idontevenknow.engine.physic.PhysicComponent;
import de.idontevenknow.engine.render.RenderComponent;
import de.idontevenknow.input.InputComponent;

public class Player extends GameObject{
    
	public Player(){
		components.add(new RenderComponent());
		components.add(new PhysicComponent(0,0,10,10,1,1,4));
		components.add(new InputComponent());
	}
}
