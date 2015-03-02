package anonmine.beastmod.common.animations.test;

import anonmine.beastmod.common.mca.commonlibrary.animation.Channel;
import anonmine.beastmod.common.mca.commonlibrary.animation.KeyFrame;
import anonmine.beastmod.common.mca.commonlibrary.math.Quaternion;
import anonmine.beastmod.common.mca.commonlibrary.math.Vector3f;

public class ChannelStill extends Channel {
	public ChannelStill(String _name, float _fps, int _totalFrames, byte _mode) {
		super(_name, _fps, _totalFrames, _mode);
	}

	@Override
	protected void initializeAllFrames() {
		KeyFrame frame0 = new KeyFrame();
		frame0.modelRenderersRotations.put("Base", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame0.modelRenderersRotations.put("second", new Quaternion(0.42261827F, 0.0F, 0.0F, 0.90630776F));
		frame0.modelRenderersRotations.put("last", new Quaternion(0.25038F, 0.0F, 0.0F, 0.96814764F));
		frame0.modelRenderersTranslations.put("Base", new Vector3f(0.0F, 0.0F, 0.0F));
		frame0.modelRenderersTranslations.put("second", new Vector3f(0.0F, 8.0F, 0.0F));
		frame0.modelRenderersTranslations.put("last", new Vector3f(0.0F, 8.0F, 0.0F));
		keyFrames.put(0, frame0);

		KeyFrame frame6 = new KeyFrame();
		frame6.modelRenderersRotations.put("Base", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame6.modelRenderersRotations.put("second", new Quaternion(0.42261827F, 0.0F, 0.0F, 0.90630776F));
		frame6.modelRenderersRotations.put("last", new Quaternion(0.25038F, 0.0F, 0.0F, 0.96814764F));
		frame6.modelRenderersTranslations.put("Base", new Vector3f(0.0F, 0.0F, 0.0F));
		frame6.modelRenderersTranslations.put("second", new Vector3f(0.0F, 8.0F, 0.0F));
		frame6.modelRenderersTranslations.put("last", new Vector3f(0.0F, 8.0F, 0.0F));
		keyFrames.put(6, frame6);

		KeyFrame frame10 = new KeyFrame();
		frame10.modelRenderersRotations.put("Base", new Quaternion(0.0F, 0.0F, 0.0F, 1.0F));
		frame10.modelRenderersRotations.put("second", new Quaternion(0.42261827F, 0.0F, 0.0F, 0.90630776F));
		frame10.modelRenderersRotations.put("last", new Quaternion(0.25038F, 0.0F, 0.0F, 0.96814764F));
		frame10.modelRenderersTranslations.put("Base", new Vector3f(0.0F, 0.0F, 0.0F));
		frame10.modelRenderersTranslations.put("second", new Vector3f(0.0F, 8.0F, 0.0F));
		frame10.modelRenderersTranslations.put("last", new Vector3f(0.0F, 8.0F, 0.0F));
		keyFrames.put(10, frame10);

	}
}