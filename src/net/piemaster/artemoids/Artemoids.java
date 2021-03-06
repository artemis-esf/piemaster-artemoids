package net.piemaster.artemoids;

import net.piemaster.artemoids.states.GameplayState;
import net.piemaster.artemoids.states.MainMenuState;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Artemoids extends StateBasedGame
{
	public static final int MAINMENUSTATE = 0;
	public static final int GAMEPLAYSTATE = 1;

	public Artemoids()
	{
		super("Artemoids");
		
		this.addState(new MainMenuState(MAINMENUSTATE));
		this.addState(new GameplayState(GAMEPLAYSTATE));
		this.enterState(MAINMENUSTATE);
	}

	public static void main(String[] args) throws SlickException
	{
		AppGameContainer app = new AppGameContainer(new Artemoids());

		app.setDisplayMode(800, 600, false);
		app.start();
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException
	{
		container.setTargetFrameRate(100);
		
//		this.getState(MAINMENUSTATE).init(gameContainer, this);
//		this.getState(GAMEPLAYSTATE).init(gameContainer, this);
	}
}