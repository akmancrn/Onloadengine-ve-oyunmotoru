package com.example.onegame;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.engine.camera.*;
import org.anddev.andengine.engine.camera.Camera;
import org.anddev.andengine.entity.primitive.*;
import org.anddev.andengine.entity.primitive.Line;
import org.anddev.andengine.entity.scene.*;
import org.anddev.andengine.entity.*;
import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.engine.options.EngineOptions.ScreenOrientation;
import org.anddev.andengine.engine.options.resolutionpolicy.FillResolutionPolicy;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.entity.scene.background.ColorBackground;
import org.anddev.andengine.entity.util.*;
import org.anddev.andengine.ui.activity.BaseGameActivity;


public class MainActivity extends BaseGameActivity {

	private static final int CAMERA_WIDTH =800;
	private static final int CAMERA_HEIGHT =480;
	private Camera camera;
	private Engine engine;
	private Scene sahne;

	@Override
	public Engine onLoadEngine() {
		// TODO Auto-generated method stub
		camera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		final EngineOptions engineoptions = new EngineOptions(true, ScreenOrientation.LANDSCAPE, new FillResolutionPolicy(), camera);
		engineoptions.getTouchOptions().setRunOnUpdateThread(true);
		engine = new Engine(engineoptions);
		return engine;
	}

	@Override
	public void onLoadResources() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Scene onLoadScene() {
		// TODO Auto-generated method stub
		this.engine.registerUpdateHandler(new FPSLogger());
		this.sahne = new Scene();
		sahne.setBackground(new ColorBackground(0.09804f,0.6274f, 0.8784f));
		//We are making up line
		Line line = new Line(20, 20, 780, 20);
		Rectangle rectangle = new Rectangle(20, 40, 760, 420);
		
		this.sahne.attachChild(line);
		this.sahne.attachChild(rectangle);
		
		
		return this.sahne;
	}

	@Override
	public void onLoadComplete() {
		// TODO Auto-generated method stub
		
	}
}
