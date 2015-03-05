package anonmine.beastmod.common.animations.tarantula;

import java.util.HashMap;

import anonmine.beastmod.common.mca.commonlibrary.IMCAnimatedEntity;
import anonmine.beastmod.common.mca.commonlibrary.animation.AnimationHandler;
import anonmine.beastmod.common.mca.commonlibrary.animation.Channel;

public class AnimationHandlerTarantula extends AnimationHandler {
	/** Map with all the animations. */
	public static HashMap<String, Channel> animChannels = new HashMap<String, Channel>();
	static
	{
	//animChannels.put("loop", new ChannelLoop("loop", 1.0F, 1, Channel.LOOP));
		//animChannels.put("linear", new ChannelLinear("linear", 1.0F, 1, Channel.LINEAR));
		animChannels.put("walking", new ChannelWalking("walking", 20.0F, 32, Channel.LOOP));
	}
	public AnimationHandlerTarantula(IMCAnimatedEntity entity) {
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
	public void fireAnimationEventClientSide(Channel anim, float prevFrame,
			float frame) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fireAnimationEventServerSide(Channel anim, float prevFrame,
			float frame) {
		// TODO Auto-generated method stub
		
	}
}