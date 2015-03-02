package anonmine.beastmod.common.animations.test;

import java.util.HashMap;

import anonmine.beastmod.common.mca.commonlibrary.IMCAnimatedEntity;
import anonmine.beastmod.common.mca.commonlibrary.animation.AnimationHandler;
import anonmine.beastmod.common.mca.commonlibrary.animation.Channel;

public class AnimationHandlerTest extends AnimationHandler {
	/** Map with all the animations. */
	public static HashMap<String, Channel> animChannels = new HashMap<String, Channel>();
	static
	{
		animChannels.put("still", new ChannelStill("still", 5.0F, 10, Channel.LINEAR));
	}
	public AnimationHandlerTest(IMCAnimatedEntity entity) {
		super(entity);
	}

	@Override
	public void activateAnimation(String name, float startingFrame) {
		super.activateAnimation(animChannels, name, startingFrame);
	}

	@Override
	public void stopAnimation(String name) {
		super.stopAnimation(animChannels, name);
	}

	@Override
	public void fireAnimationEventClientSide(Channel anim, float prevFrame, float frame) {
	}

	@Override
	public void fireAnimationEventServerSide(Channel anim, float prevFrame, float frame) {
	}}