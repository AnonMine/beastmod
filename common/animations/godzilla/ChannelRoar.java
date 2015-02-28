
package anonmine.beastmod.common.animations.godzilla;

import anonmine.beastmod.common.mca.commonlibrary.animation.*;
import anonmine.beastmod.common.mca.commonlibrary.math.*;

public class ChannelRoar extends Channel {
	public ChannelRoar(String _name, float _fps, int _totalFrames, byte _mode) {
		super(_name, _fps, _totalFrames, _mode);
	}

	@Override
	protected void initializeAllFrames() {

		KeyFrame frame0 = new KeyFrame();
		frame0.modelRenderersRotations.put("Bone", new Quaternion(0.9271258F,0.0F,0.0F,0.3747502F));
		frame0.modelRenderersTranslations.put("Bone", new Vector3f(-0.0F,263.8F,124.7F));
		frame0.modelRenderersRotations.put("fingerBone1_L", new Quaternion(0.3871822F,-0.0562461F,-0.0208056F,0.9200508F));
		frame0.modelRenderersTranslations.put("fingerBone1_L", new Vector3f(-0.0F,0.0F,40.9F));
		frame0.modelRenderersRotations.put("fingerBone1_R", new Quaternion(0.4195391F,0.056948F,0.0187996F,0.9057541F));
		frame0.modelRenderersTranslations.put("fingerBone1_R", new Vector3f(0.0F,0.0F,40.9F));
		frame0.modelRenderersRotations.put("fingerBone2_L", new Quaternion(0.3798525F,0.0486469F,0.0102663F,0.92371F));
		frame0.modelRenderersTranslations.put("fingerBone2_L", new Vector3f(0.0F,0.0F,39.1F));
		frame0.modelRenderersRotations.put("fingerBone2_R", new Quaternion(0.5302668F,-0.0496817F,-0.0019107F,0.8463719F));
		frame0.modelRenderersTranslations.put("fingerBone2_R", new Vector3f(0.0F,0.0F,39.1F));
		frame0.modelRenderersRotations.put("fingerBone3_L", new Quaternion(0.3464335F,0.0926548F,-0.1837909F,0.9152157F));
		frame0.modelRenderersTranslations.put("fingerBone3_L", new Vector3f(-0.0F,0.0F,39.4F));
		frame0.modelRenderersRotations.put("fingerBone3_R", new Quaternion(0.4704729F,-0.0661658F,0.1949002F,0.8580741F));
		frame0.modelRenderersTranslations.put("fingerBone3_R", new Vector3f(0.0F,0.0F,39.4F));
		frame0.modelRenderersRotations.put("fingerBone4_L", new Quaternion(-0.461544F,0.1433789F,-0.0886127F,0.8709578F));
		frame0.modelRenderersTranslations.put("fingerBone4_L", new Vector3f(-0.0F,-0.0F,37.5F));
		frame0.modelRenderersRotations.put("fingerBone4_R", new Quaternion(-0.2316091F,-0.1169848F,0.1213437F,0.9580958F));
		frame0.modelRenderersTranslations.put("fingerBone4_R", new Vector3f(-0.0F,-0.0F,37.5F));
		frame0.modelRenderersRotations.put("footBoneBotLeft", new Quaternion(-0.3000032F,0.0365884F,-0.1000374F,0.9479725F));
		frame0.modelRenderersTranslations.put("footBoneBotLeft", new Vector3f(-0.0F,-0.0F,43.4F));
		frame0.modelRenderersRotations.put("footBoneBotLeft_001", new Quaternion(-0.0188527F,0.0110385F,0.0528049F,0.9983659F));
		frame0.modelRenderersTranslations.put("footBoneBotLeft_001", new Vector3f(-0.0F,-0.0F,24.2F));
		frame0.modelRenderersRotations.put("footBoneBotRight", new Quaternion(-0.21835F,-0.0279539F,0.102785F,0.9700398F));
		frame0.modelRenderersTranslations.put("footBoneBotRight", new Vector3f(-0.0F,0.0F,43.4F));
		frame0.modelRenderersRotations.put("footBoneBotRight_001", new Quaternion(0.021004F,-0.013137F,-0.0523223F,0.998323F));
		frame0.modelRenderersTranslations.put("footBoneBotRight_001", new Vector3f(0.0F,-0.0F,24.2F));
		frame0.modelRenderersRotations.put("footBoneUpLeft", new Quaternion(0.0947911F,0.6776471F,-0.7291154F,0.0141366F));
		frame0.modelRenderersTranslations.put("footBoneUpLeft", new Vector3f(-0.0F,0.0F,171.7F));
		frame0.modelRenderersRotations.put("footBoneUpRight", new Quaternion(0.1032076F,-0.7018361F,0.7045047F,0.0211523F));
		frame0.modelRenderersTranslations.put("footBoneUpRight", new Vector3f(0.0F,-0.0F,171.7F));
		frame0.modelRenderersRotations.put("handBone1_L", new Quaternion(-0.176308F,0.1358248F,0.1031669F,0.969445F));
		frame0.modelRenderersTranslations.put("handBone1_L", new Vector3f(-0.0F,0.0F,68.2F));
		frame0.modelRenderersRotations.put("handBone1_R", new Quaternion(-0.1763081F,-0.1358248F,-0.1031669F,0.969445F));
		frame0.modelRenderersTranslations.put("handBone1_R", new Vector3f(0.0F,-0.0F,68.2F));
		frame0.modelRenderersRotations.put("handBone2_L", new Quaternion(-0.1206511F,-0.0033507F,0.2462258F,0.9616678F));
		frame0.modelRenderersTranslations.put("handBone2_L", new Vector3f(0.0F,0.0F,68.2F));
		frame0.modelRenderersRotations.put("handBone2_R", new Quaternion(-0.120651F,0.0033507F,-0.2462258F,0.9616678F));
		frame0.modelRenderersTranslations.put("handBone2_R", new Vector3f(-0.0F,-0.0F,68.2F));
		frame0.modelRenderersRotations.put("handBone3_L", new Quaternion(-0.00863F,-0.1475125F,0.2495097F,0.9570321F));
		frame0.modelRenderersTranslations.put("handBone3_L", new Vector3f(-0.0F,0.0F,68.2F));
		frame0.modelRenderersRotations.put("handBone3_R", new Quaternion(-0.0086299F,0.1475126F,-0.2495097F,0.9570321F));
		frame0.modelRenderersTranslations.put("handBone3_R", new Vector3f(-0.0F,-0.0F,68.2F));
		frame0.modelRenderersRotations.put("handBone4_L", new Quaternion(0.3178568F,-0.0856836F,0.2003461F,0.9227605F));
		frame0.modelRenderersTranslations.put("handBone4_L", new Vector3f(-0.0F,0.0F,68.2F));
		frame0.modelRenderersRotations.put("handBone4_R", new Quaternion(0.3178569F,0.0856836F,-0.200346F,0.9227604F));
		frame0.modelRenderersTranslations.put("handBone4_R", new Vector3f(-0.0F,-0.0F,68.2F));
		frame0.modelRenderersRotations.put("headBone", new Quaternion(-0.0345636F,-0.0F,-0.0F,0.9994025F));
		frame0.modelRenderersTranslations.put("headBone", new Vector3f(-0.0F,-0.0F,14.0F));
		frame0.modelRenderersRotations.put("headBoneAll", new Quaternion(-0.1962058F,0.0F,0.0F,0.9805627F));
		frame0.modelRenderersTranslations.put("headBoneAll", new Vector3f(0.0F,-0.0F,11.6F));
		frame0.modelRenderersRotations.put("hipsLeftBone", new Quaternion(-0.484904F,-0.4954148F,0.7202005F,0.0272699F));
		frame0.modelRenderersTranslations.put("hipsLeftBone", new Vector3f(-0.0F,0.0F,40.2F));
		frame0.modelRenderersRotations.put("hipsRightBone", new Quaternion(0.6370561F,-0.2733623F,0.676294F,0.2491169F));
		frame0.modelRenderersTranslations.put("hipsRightBone", new Vector3f(-0.0F,-0.0F,40.2F));
		frame0.modelRenderersRotations.put("jawBone", new Quaternion(-0.2679889F,-0.0F,0.0F,0.963422F));
		frame0.modelRenderersTranslations.put("jawBone", new Vector3f(-0.0F,-0.0F,14.0F));
		frame0.modelRenderersRotations.put("lowerArmBone_L", new Quaternion(0.1952315F,0.0454006F,-0.1376966F,0.969981F));
		frame0.modelRenderersTranslations.put("lowerArmBone_L", new Vector3f(-0.0F,0.0F,33.0F));
		frame0.modelRenderersRotations.put("lowerArmBone_R", new Quaternion(0.135691F,-0.0715625F,-0.1737444F,0.9727691F));
		frame0.modelRenderersTranslations.put("lowerArmBone_R", new Vector3f(-0.0F,-0.0F,33.0F));
		frame0.modelRenderersRotations.put("lowerBodyBone", new Quaternion(0.7136928F,0.0F,0.0F,0.7004589F));
		frame0.modelRenderersTranslations.put("lowerBodyBone", new Vector3f(-0.0F,0.0F,40.2F));
		frame0.modelRenderersRotations.put("lowerLegBoneLeft", new Quaternion(-0.6533664F,-0.0246528F,0.0144748F,0.7565019F));
		frame0.modelRenderersTranslations.put("lowerLegBoneLeft", new Vector3f(0.0F,-0.0F,150.6F));
		frame0.modelRenderersRotations.put("lowerLegBoneRight", new Quaternion(-0.6533667F,0.0246529F,-0.0144748F,0.7565016F));
		frame0.modelRenderersTranslations.put("lowerLegBoneRight", new Vector3f(0.0F,-0.0F,150.6F));
		frame0.modelRenderersRotations.put("middleBodyBone", new Quaternion(-0.0459431F,0.0F,0.0F,0.9989441F));
		frame0.modelRenderersTranslations.put("middleBodyBone", new Vector3f(-0.0F,0.0F,105.4F));
		frame0.modelRenderersRotations.put("neckBone0", new Quaternion(-0.046527F,-0.0004653F,-0.0001736F,0.9989169F));
		frame0.modelRenderersTranslations.put("neckBone0", new Vector3f(0.0F,0.0F,16.3F));
		frame0.modelRenderersRotations.put("neckBone1", new Quaternion(-0.1454825F,-0.0F,2e-07F,0.9893609F));
		frame0.modelRenderersTranslations.put("neckBone1", new Vector3f(-0.0F,-0.0F,26.6F));
		frame0.modelRenderersRotations.put("neckBone2", new Quaternion(0.0411985F,0.0004957F,2.95e-05F,0.9991509F));
		frame0.modelRenderersTranslations.put("neckBone2", new Vector3f(-0.0F,0.0F,30.6F));
		frame0.modelRenderersRotations.put("neckBone3", new Quaternion(0.1565399F,0.0F,0.0F,0.9876717F));
		frame0.modelRenderersTranslations.put("neckBone3", new Vector3f(-0.0F,0.0F,93.6F));
		frame0.modelRenderersRotations.put("tailBone1", new Quaternion(-0.6837238F,0.001235F,-0.0026474F,0.7297351F));
		frame0.modelRenderersTranslations.put("tailBone1", new Vector3f(-0.0F,0.0F,40.2F));
		frame0.modelRenderersRotations.put("tailBone2", new Quaternion(-0.1935165F,-0.0055416F,0.0022892F,0.9810787F));
		frame0.modelRenderersTranslations.put("tailBone2", new Vector3f(0.0F,-0.0F,132.3F));
		frame0.modelRenderersRotations.put("tailBone3", new Quaternion(-0.227182F,0.0045968F,0.0017533F,0.9738399F));
		frame0.modelRenderersTranslations.put("tailBone3", new Vector3f(0.0F,-0.0F,114.9F));
		frame0.modelRenderersRotations.put("tailBone4", new Quaternion(-0.0541823F,-0.0F,-0.0F,0.9985311F));
		frame0.modelRenderersTranslations.put("tailBone4", new Vector3f(-0.0F,-0.0F,107.5F));
		frame0.modelRenderersRotations.put("tailBone5", new Quaternion(-0.06518F,-0.0002284F,0.0108087F,0.997815F));
		frame0.modelRenderersTranslations.put("tailBone5", new Vector3f(-0.0F,-0.0F,98.6F));
		frame0.modelRenderersRotations.put("tailBone6", new Quaternion(0.005862F,-0.0006141F,0.0159691F,0.9998552F));
		frame0.modelRenderersTranslations.put("tailBone6", new Vector3f(0.0F,0.0F,125.6F));
		frame0.modelRenderersRotations.put("tailBone7", new Quaternion(-0.0014699F,0.0002852F,0.0060376F,0.9999807F));
		frame0.modelRenderersTranslations.put("tailBone7", new Vector3f(-0.0F,-0.0F,105.5F));
		frame0.modelRenderersRotations.put("tailBone8", new Quaternion(-0.0031099F,0.0002838F,-0.0001598F,0.9999952F));
		frame0.modelRenderersTranslations.put("tailBone8", new Vector3f(0.0F,-0.0F,83.8F));
		frame0.modelRenderersRotations.put("thighBoneLeft", new Quaternion(0.4943305F,0.5025707F,-0.7089949F,0.0196531F));
		frame0.modelRenderersTranslations.put("thighBoneLeft", new Vector3f(0.0F,0.0F,98.6F));
		frame0.modelRenderersRotations.put("thighBoneRight", new Quaternion(-0.6485001F,0.2763882F,-0.663029F,0.2518925F));
		frame0.modelRenderersTranslations.put("thighBoneRight", new Vector3f(-0.0F,-0.0F,98.6F));
		frame0.modelRenderersRotations.put("upArmBone_L", new Quaternion(0.2375989F,-0.0511231F,0.006459F,0.9699957F));
		frame0.modelRenderersTranslations.put("upArmBone_L", new Vector3f(0.0F,-0.0F,79.0F));
		frame0.modelRenderersRotations.put("upArmBone_R", new Quaternion(0.3169767F,0.0151119F,0.2832141F,0.9050344F));
		frame0.modelRenderersTranslations.put("upArmBone_R", new Vector3f(-0.0F,-0.0F,79.0F));
		frame0.modelRenderersRotations.put("upperBodyBone", new Quaternion(-0.1872801F,0.0F,0.0F,0.9823067F));
		frame0.modelRenderersTranslations.put("upperBodyBone", new Vector3f(-0.0F,-0.0F,74.7F));
		frame0.modelRenderersRotations.put("upperBodyBone_L", new Quaternion(-0.7315949F,0.2230363F,0.6440963F,0.0127932F));
		frame0.modelRenderersTranslations.put("upperBodyBone_L", new Vector3f(-0.0F,0.0F,93.6F));
		frame0.modelRenderersRotations.put("upperBodyBone_R", new Quaternion(-0.7315949F,-0.2230363F,-0.6440963F,0.0127932F));
		frame0.modelRenderersTranslations.put("upperBodyBone_R", new Vector3f(-0.0F,0.0F,93.6F));
		keyFrames.put(30,frame0);

	}
}
