package anonmine.beastmod.common.animations.godzilla;

import java.util.HashMap;

import anonmine.beastmod.common.mca.commonlibrary.IMCAnimatedEntity;
import anonmine.beastmod.common.mca.commonlibrary.animation.AnimationHandler;
import anonmine.beastmod.common.mca.commonlibrary.animation.Channel;

public class AnimationHandlerGodzilla extends AnimationHandler {
	/** Map with all the animations. */
	public static HashMap<String, Channel> animChannels = new HashMap<String, Channel>();
	static
	{
	//animChannels.put("loop", new ChannelLoop("loop", 1.0F, 1, Channel.LOOP));
		//animChannels.put("linear", new ChannelLinear("linear", 1.0F, 1, Channel.LINEAR));
		animChannels.put("roar", new ChannelRoar("roar", 1.0F, 1, Channel.LINEAR));
	}
	public AnimationHandlerGodzilla(IMCAnimatedEntity entity) {
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
	}
}