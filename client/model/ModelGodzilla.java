package anonmine.beastmod.client.model;


import java.util.HashMap;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import anonmine.beastmod.client.mca.clientlibrary.MCAModelRenderer;
import anonmine.beastmod.common.mca.commonlibrary.MCAVersionChecker;
import anonmine.beastmod.common.mca.commonlibrary.animation.AnimationHandler;
import anonmine.beastmod.common.mca.commonlibrary.math.Matrix4f;
import anonmine.beastmod.common.mca.commonlibrary.math.Quaternion;
import anonmine.beastmod.common.entity.giantmonster.EntityGodzilla;

public class ModelGodzilla extends ModelBase {
	public final int MCA_MIN_REQUESTED_VERSION = 1;
	public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

	MCAModelRenderer Bone;
	MCAModelRenderer fingerBone1_L;
	MCAModelRenderer fingerBone1_R;
	MCAModelRenderer fingerBone2_L;
	MCAModelRenderer fingerBone2_R;
	MCAModelRenderer fingerBone3_L;
	MCAModelRenderer fingerBone3_R;
	MCAModelRenderer fingerBone4_L;
	MCAModelRenderer fingerBone4_R;
	MCAModelRenderer footBoneBotLeft;
	MCAModelRenderer footBoneBotLeft_001;
	MCAModelRenderer footBoneBotRight;
	MCAModelRenderer footBoneBotRight_001;
	MCAModelRenderer footBoneUp_IK_L;
	MCAModelRenderer footBoneUp_IK_R;
	MCAModelRenderer footBoneUpLeft;
	MCAModelRenderer footBoneUpRight;
	MCAModelRenderer handBone1_L;
	MCAModelRenderer handBone1_R;
	MCAModelRenderer handBone2_L;
	MCAModelRenderer handBone2_R;
	MCAModelRenderer handBone3_L;
	MCAModelRenderer handBone3_R;
	MCAModelRenderer handBone4_L;
	MCAModelRenderer handBone4_R;
	MCAModelRenderer headBone;
	MCAModelRenderer headBoneAll;
	MCAModelRenderer hipsLeftBone;
	MCAModelRenderer hipsRightBone;
	MCAModelRenderer jawBone;
	MCAModelRenderer knee_Poll_L;
	MCAModelRenderer knee_Poll_R;
	MCAModelRenderer lowerArmBone_L;
	MCAModelRenderer lowerArmBone_R;
	MCAModelRenderer lowerBodyBone;
	MCAModelRenderer lowerLegBoneLeft;
	MCAModelRenderer lowerLegBoneRight;
	MCAModelRenderer middleBodyBone;
	MCAModelRenderer neckBone0;
	MCAModelRenderer neckBone1;
	MCAModelRenderer neckBone2;
	MCAModelRenderer neckBone3;
	MCAModelRenderer tailBone1;
	MCAModelRenderer tailBone2;
	MCAModelRenderer tailBone3;
	MCAModelRenderer tailBone4;
	MCAModelRenderer tailBone5;
	MCAModelRenderer tailBone6;
	MCAModelRenderer tailBone7;
	MCAModelRenderer tailBone8;
	MCAModelRenderer tailBone_IK;
	MCAModelRenderer thighBoneLeft;
	MCAModelRenderer thighBoneRight;
	MCAModelRenderer upArmBone_L;
	MCAModelRenderer upArmBone_R;
	MCAModelRenderer upperBodyBone;
	MCAModelRenderer upperBodyBone_L;
	MCAModelRenderer upperBodyBone_R;
	MCAModelRenderer bellyLeftFront;
	MCAModelRenderer bellyLeftFrontmirror;
	MCAModelRenderer bellyLeftLeft;
	MCAModelRenderer bellyLeftLeftmirror;
	MCAModelRenderer cheekLeftLow;
	MCAModelRenderer cheekLeftLowmirror;
	MCAModelRenderer cheekLeftUp;
	MCAModelRenderer cheekLeftUpmirror;
	MCAModelRenderer chestLeftBot;
	MCAModelRenderer chestLeftBotmirror;
	MCAModelRenderer chestLeftLeft;
	MCAModelRenderer chestLeftLeftmirror;
	MCAModelRenderer chestLeftMid;
	MCAModelRenderer chestLeftMidmirror;
	MCAModelRenderer chestLeftTop;
	MCAModelRenderer chestLeftTopmirror;
	MCAModelRenderer crochLeft;
	MCAModelRenderer crochLeftmirror;
	MCAModelRenderer eyebrowLeft;
	MCAModelRenderer eyebrowLeftmirror;
	MCAModelRenderer eyesMid;
	MCAModelRenderer finger1;
	MCAModelRenderer finger1mirror;
	MCAModelRenderer finger2;
	MCAModelRenderer finger2mirror;
	MCAModelRenderer finger3;
	MCAModelRenderer finger3mirror;
	MCAModelRenderer finger4;
	MCAModelRenderer finger4mirror;
	MCAModelRenderer footLeftBase;
	MCAModelRenderer footLeftBasemirror;
	MCAModelRenderer footLeftNail1;
	MCAModelRenderer footLeftNail1mirror;
	MCAModelRenderer footLeftNail2;
	MCAModelRenderer footLeftNail2mirror;
	MCAModelRenderer footLeftNail3;
	MCAModelRenderer footLeftNail3mirror;
	MCAModelRenderer footLeftUp;
	MCAModelRenderer footRightUp;
	MCAModelRenderer handBase;
	MCAModelRenderer handBasemirror;
	MCAModelRenderer handNail1;
	MCAModelRenderer handNail1mirror;
	MCAModelRenderer handNail2;
	MCAModelRenderer handNail2mirror;
	MCAModelRenderer handNail3;
	MCAModelRenderer handNail3mirror;
	MCAModelRenderer handNail4;
	MCAModelRenderer handNail4mirror;
	MCAModelRenderer headScaleLeftLeft1;
	MCAModelRenderer headScaleLeftLeft1mirror;
	MCAModelRenderer headScaleLeftLeft2;
	MCAModelRenderer headScaleLeftLeft2mirror;
	MCAModelRenderer headScaleLeftUp1;
	MCAModelRenderer headScaleLeftUp1mirror;
	MCAModelRenderer headScaleLeftUp2;
	MCAModelRenderer headScaleLeftUp2mirror;
	MCAModelRenderer headTooth1;
	MCAModelRenderer headTooth1mirror;
	MCAModelRenderer headTooth2;
	MCAModelRenderer headTooth2mirror;
	MCAModelRenderer headTooth3;
	MCAModelRenderer headTooth3mirror;
	MCAModelRenderer headTooth4;
	MCAModelRenderer headTooth4mirror;
	MCAModelRenderer headTooth5;
	MCAModelRenderer headTooth5mirror;
	MCAModelRenderer headTooth6;
	MCAModelRenderer headTooth6mirror;
	MCAModelRenderer headTooth7;
	MCAModelRenderer headTooth7mirror;
	MCAModelRenderer jawLeftbot;
	MCAModelRenderer jawLeftbotmirror;
	MCAModelRenderer jawLeftUp;
	MCAModelRenderer jawLeftUpmirror;
	MCAModelRenderer jawMidDown;
	MCAModelRenderer jawMidUp;
	MCAModelRenderer jawtooth1;
	MCAModelRenderer jawtooth1mirror;
	MCAModelRenderer jawtooth2;
	MCAModelRenderer jawtooth2mirror;
	MCAModelRenderer jawtooth3;
	MCAModelRenderer jawtooth3mirror;
	MCAModelRenderer jawtooth4;
	MCAModelRenderer jawtooth4mirror;
	MCAModelRenderer jawtooth5;
	MCAModelRenderer jawtooth5mirror;
	MCAModelRenderer jawtooth6;
	MCAModelRenderer jawtooth6mirror;
	MCAModelRenderer jawtooth7;
	MCAModelRenderer kneeLeft;
	MCAModelRenderer kneeLeftmirror;
	MCAModelRenderer lowerArmFront;
	MCAModelRenderer lowerArmFrontmirror;
	MCAModelRenderer lowerArmRear;
	MCAModelRenderer lowerArmRearmirror;
	MCAModelRenderer lowerBodyScaleLeftMid;
	MCAModelRenderer lowerBodyScaleLeftMidmirror;
	MCAModelRenderer lowerBodyScaleLeftUp1;
	MCAModelRenderer lowerBodyScaleLeftUp1mirror;
	MCAModelRenderer lowerBodyScaleLeftUp2;
	MCAModelRenderer lowerBodyScaleLeftUp2mirror;
	MCAModelRenderer lowerBodySpine1;
	MCAModelRenderer lowerBodySpine2;
	MCAModelRenderer lowerLeggLeftFront;
	MCAModelRenderer lowerLeggLeftFrontmirror;
	MCAModelRenderer lowerLeggLeftRear;
	MCAModelRenderer lowerLeggLeftRearmirror;
	MCAModelRenderer middleBodyScaleLeftMid1;
	MCAModelRenderer middleBodyScaleLeftMid1mirror;
	MCAModelRenderer middleBodyScaleLeftMid2;
	MCAModelRenderer middleBodyScaleLeftMid2mirror;
	MCAModelRenderer middleBodyScaleLeftUp1;
	MCAModelRenderer middleBodyScaleLeftUp1mirror;
	MCAModelRenderer middleBodyScaleLeftUp2;
	MCAModelRenderer middleBodyScaleLeftUp2mirror;
	MCAModelRenderer middleBodySpine1;
	MCAModelRenderer middleBodySpine2;
	MCAModelRenderer middleBodySpine3;
	MCAModelRenderer middleBodySpineLeft1;
	MCAModelRenderer middleBodySpineLeft1mirror;
	MCAModelRenderer middleBodySpineLeft2;
	MCAModelRenderer middleBodySpineLeft2mirror;
	MCAModelRenderer nazFrontMid;
	MCAModelRenderer nazLeftDown;
	MCAModelRenderer nazLeftDownmirror;
	MCAModelRenderer nazLeftFront;
	MCAModelRenderer nazLeftFrontmirror;
	MCAModelRenderer nazLeftUp;
	MCAModelRenderer nazLeftUpmirror;
	MCAModelRenderer nazUpMid;
	MCAModelRenderer neck1ScaleLeftDown;
	MCAModelRenderer neck1ScaleLeftDownmirror;
	MCAModelRenderer neck1ScaleLeftMid;
	MCAModelRenderer neck1ScaleLeftMidmirror;
	MCAModelRenderer neck1ScaleLeftUp;
	MCAModelRenderer neck1ScaleLeftUpmirror;
	MCAModelRenderer neck2LeftBot;
	MCAModelRenderer neck2LeftBotmirror;
	MCAModelRenderer neck2ScaleLeftBot1;
	MCAModelRenderer neck2ScaleLeftBot1mirror;
	MCAModelRenderer neck2ScaleLeftBot2;
	MCAModelRenderer neck2ScaleLeftBot2mirror;
	MCAModelRenderer neck2ScaleLeftMid;
	MCAModelRenderer neck2ScaleLeftMidmirror;
	MCAModelRenderer neck2ScaleLeftUp;
	MCAModelRenderer neck2ScaleLeftUpmirror;
	MCAModelRenderer neck2Spine1;
	MCAModelRenderer neck2Spine2;
	MCAModelRenderer neck3ScaleLeftBot;
	MCAModelRenderer neck3ScaleLeftBotmirror;
	MCAModelRenderer neck3ScaleLeftMid;
	MCAModelRenderer neck3ScaleLeftMidmirror;
	MCAModelRenderer neck3ScaleLeftTop;
	MCAModelRenderer neck3ScaleLeftTopmirror;
	MCAModelRenderer neck3Spine;
	MCAModelRenderer shoulderLeftFront;
	MCAModelRenderer shoulderLeftFrontmirror;
	MCAModelRenderer shoulderLeftRear;
	MCAModelRenderer shoulderLeftRearmirror;
	MCAModelRenderer tail1LeftBot;
	MCAModelRenderer tail1LeftBotmirror;
	MCAModelRenderer tail1LeftMid;
	MCAModelRenderer tail1LeftMidmirror;
	MCAModelRenderer tail1LeftUp;
	MCAModelRenderer tail1LeftUpmirror;
	MCAModelRenderer tail2LeftBot;
	MCAModelRenderer tail2LeftBotmirror;
	MCAModelRenderer tail2LeftMid;
	MCAModelRenderer tail2LeftMidmirror;
	MCAModelRenderer tail2LeftUp;
	MCAModelRenderer tail2LeftUpmirror;
	MCAModelRenderer tail3Left;
	MCAModelRenderer tail3Leftmirror;
	MCAModelRenderer tailEnd1;
	MCAModelRenderer tailEnd2;
	MCAModelRenderer tailEnd3;
	MCAModelRenderer tailEnd4;
	MCAModelRenderer tailEnd5;
	MCAModelRenderer thighLeftFront;
	MCAModelRenderer thighLeftFrontmirror;
	MCAModelRenderer thighLeftRear;
	MCAModelRenderer thighLeftRearmirror;
	MCAModelRenderer toeLeft1;
	MCAModelRenderer toeLeft1mirror;
	MCAModelRenderer toeLeft2;
	MCAModelRenderer toeLeft2mirror;
	MCAModelRenderer toeLeft3;
	MCAModelRenderer toeLeft3mirror;
	MCAModelRenderer toeLeft4;
	MCAModelRenderer toeLeft4mirror;
	MCAModelRenderer upperArmFront;
	MCAModelRenderer upperArmFrontmirror;
	MCAModelRenderer upperArmRear;
	MCAModelRenderer upperArmRearmirror;
	MCAModelRenderer upperBodyScaleMid;
	MCAModelRenderer upperBodyScaleMidmirror;
	MCAModelRenderer upperBodyScaleTop;
	MCAModelRenderer upperBodyScaleTopmirror;
	MCAModelRenderer upperBodySpine;
	MCAModelRenderer upperBodySpineLeft;
	MCAModelRenderer upperBodySpineLeftmirror;
	MCAModelRenderer waistLeft;
	MCAModelRenderer waistLeftmirror;
	public ModelGodzilla()
	{
		MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

		textureWidth = 2048;
		textureHeight = 2048;


		Bone = new MCAModelRenderer(this, "Bone", 0 , 0);
		Bone.setInitialRotationPoint (-0.0F,263.8F,124.7F);
		Bone.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.9271258F,0.0F,0.0F,0.3747502F)).transpose());
		parts.put(Bone.boxName,Bone);
		
		fingerBone1_L = new MCAModelRenderer(this, "fingerBone1_L", 0 , 0);
		fingerBone1_L.setInitialRotationPoint (-0.0F,0.0F,40.9F);
		fingerBone1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3871822F,-0.0562461F,-0.0208056F,0.9200508F)).transpose());
		parts.put(fingerBone1_L.boxName,fingerBone1_L);
		
		fingerBone1_R = new MCAModelRenderer(this, "fingerBone1_R", 0 , 0);
		fingerBone1_R.setInitialRotationPoint (0.0F,0.0F,40.9F);
		fingerBone1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.4195391F,0.056948F,0.0187996F,0.9057541F)).transpose());
		parts.put(fingerBone1_R.boxName,fingerBone1_R);
		
		fingerBone2_L = new MCAModelRenderer(this, "fingerBone2_L", 0 , 0);
		fingerBone2_L.setInitialRotationPoint (0.0F,0.0F,39.1F);
		fingerBone2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3798525F,0.0486469F,0.0102663F,0.92371F)).transpose());
		parts.put(fingerBone2_L.boxName,fingerBone2_L);
		
		fingerBone2_R = new MCAModelRenderer(this, "fingerBone2_R", 0 , 0);
		fingerBone2_R.setInitialRotationPoint (0.0F,0.0F,39.1F);
		fingerBone2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.5302668F,-0.0496817F,-0.0019107F,0.8463719F)).transpose());
		parts.put(fingerBone2_R.boxName,fingerBone2_R);
		
		fingerBone3_L = new MCAModelRenderer(this, "fingerBone3_L", 0 , 0);
		fingerBone3_L.setInitialRotationPoint (-0.0F,0.0F,39.4F);
		fingerBone3_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3464335F,0.0926548F,-0.1837909F,0.9152157F)).transpose());
		parts.put(fingerBone3_L.boxName,fingerBone3_L);
		
		fingerBone3_R = new MCAModelRenderer(this, "fingerBone3_R", 0 , 0);
		fingerBone3_R.setInitialRotationPoint (0.0F,0.0F,39.4F);
		fingerBone3_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.4704729F,-0.0661658F,0.1949002F,0.8580741F)).transpose());
		parts.put(fingerBone3_R.boxName,fingerBone3_R);
		
		fingerBone4_L = new MCAModelRenderer(this, "fingerBone4_L", 0 , 0);
		fingerBone4_L.setInitialRotationPoint (-0.0F,-0.0F,37.5F);
		fingerBone4_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.461544F,0.1433789F,-0.0886127F,0.8709578F)).transpose());
		parts.put(fingerBone4_L.boxName,fingerBone4_L);
		
		fingerBone4_R = new MCAModelRenderer(this, "fingerBone4_R", 0 , 0);
		fingerBone4_R.setInitialRotationPoint (-0.0F,-0.0F,37.5F);
		fingerBone4_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2316091F,-0.1169848F,0.1213437F,0.9580958F)).transpose());
		parts.put(fingerBone4_R.boxName,fingerBone4_R);
		
		footBoneBotLeft = new MCAModelRenderer(this, "footBoneBotLeft", 0 , 0);
		footBoneBotLeft.setInitialRotationPoint (-0.0F,-0.0F,43.4F);
		footBoneBotLeft.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3000032F,0.0365884F,-0.1000374F,0.9479725F)).transpose());
		parts.put(footBoneBotLeft.boxName,footBoneBotLeft);
		
		footBoneBotLeft_001 = new MCAModelRenderer(this, "footBoneBotLeft_001", 0 , 0);
		footBoneBotLeft_001.setInitialRotationPoint (-0.0F,-0.0F,24.2F);
		footBoneBotLeft_001.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0188527F,0.0110385F,0.0528049F,0.9983659F)).transpose());
		parts.put(footBoneBotLeft_001.boxName,footBoneBotLeft_001);
		
		footBoneBotRight = new MCAModelRenderer(this, "footBoneBotRight", 0 , 0);
		footBoneBotRight.setInitialRotationPoint (-0.0F,0.0F,43.4F);
		footBoneBotRight.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.21835F,-0.0279539F,0.102785F,0.9700398F)).transpose());
		parts.put(footBoneBotRight.boxName,footBoneBotRight);
		
		footBoneBotRight_001 = new MCAModelRenderer(this, "footBoneBotRight_001", 0 , 0);
		footBoneBotRight_001.setInitialRotationPoint (0.0F,-0.0F,24.2F);
		footBoneBotRight_001.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.021004F,-0.013137F,-0.0523223F,0.998323F)).transpose());
		parts.put(footBoneBotRight_001.boxName,footBoneBotRight_001);
		
		footBoneUpLeft = new MCAModelRenderer(this, "footBoneUpLeft", 0 , 0);
		footBoneUpLeft.setInitialRotationPoint (-0.0F,0.0F,171.7F);
		footBoneUpLeft.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0947911F,0.6776471F,-0.7291154F,0.0141366F)).transpose());
		parts.put(footBoneUpLeft.boxName,footBoneUpLeft);
		
		footBoneUpRight = new MCAModelRenderer(this, "footBoneUpRight", 0 , 0);
		footBoneUpRight.setInitialRotationPoint (0.0F,-0.0F,171.7F);
		footBoneUpRight.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1032076F,-0.7018361F,0.7045047F,0.0211523F)).transpose());
		parts.put(footBoneUpRight.boxName,footBoneUpRight);
		
		handBone1_L = new MCAModelRenderer(this, "handBone1_L", 0 , 0);
		handBone1_L.setInitialRotationPoint (-0.0F,0.0F,68.2F);
		handBone1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.176308F,0.1358248F,0.1031669F,0.969445F)).transpose());
		parts.put(handBone1_L.boxName,handBone1_L);
		
		handBone1_R = new MCAModelRenderer(this, "handBone1_R", 0 , 0);
		handBone1_R.setInitialRotationPoint (0.0F,-0.0F,68.2F);
		handBone1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1763081F,-0.1358248F,-0.1031669F,0.969445F)).transpose());
		parts.put(handBone1_R.boxName,handBone1_R);
		
		handBone2_L = new MCAModelRenderer(this, "handBone2_L", 0 , 0);
		handBone2_L.setInitialRotationPoint (0.0F,0.0F,68.2F);
		handBone2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1206511F,-0.0033507F,0.2462258F,0.9616678F)).transpose());
		parts.put(handBone2_L.boxName,handBone2_L);
		
		handBone2_R = new MCAModelRenderer(this, "handBone2_R", 0 , 0);
		handBone2_R.setInitialRotationPoint (-0.0F,-0.0F,68.2F);
		handBone2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.120651F,0.0033507F,-0.2462258F,0.9616678F)).transpose());
		parts.put(handBone2_R.boxName,handBone2_R);
		
		handBone3_L = new MCAModelRenderer(this, "handBone3_L", 0 , 0);
		handBone3_L.setInitialRotationPoint (-0.0F,0.0F,68.2F);
		handBone3_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.00863F,-0.1475125F,0.2495097F,0.9570321F)).transpose());
		parts.put(handBone3_L.boxName,handBone3_L);
		
		handBone3_R = new MCAModelRenderer(this, "handBone3_R", 0 , 0);
		handBone3_R.setInitialRotationPoint (-0.0F,-0.0F,68.2F);
		handBone3_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0086299F,0.1475126F,-0.2495097F,0.9570321F)).transpose());
		parts.put(handBone3_R.boxName,handBone3_R);
		
		handBone4_L = new MCAModelRenderer(this, "handBone4_L", 0 , 0);
		handBone4_L.setInitialRotationPoint (-0.0F,0.0F,68.2F);
		handBone4_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3178568F,-0.0856836F,0.2003461F,0.9227605F)).transpose());
		parts.put(handBone4_L.boxName,handBone4_L);
		
		handBone4_R = new MCAModelRenderer(this, "handBone4_R", 0 , 0);
		handBone4_R.setInitialRotationPoint (-0.0F,-0.0F,68.2F);
		handBone4_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3178569F,0.0856836F,-0.200346F,0.9227604F)).transpose());
		parts.put(handBone4_R.boxName,handBone4_R);
		
		headBone = new MCAModelRenderer(this, "headBone", 0 , 0);
		headBone.setInitialRotationPoint (0.0F,0.0F,14.0F);
		headBone.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0345636F,-0.0F,0.0F,0.9994025F)).transpose());
		parts.put(headBone.boxName,headBone);
		
		headBoneAll = new MCAModelRenderer(this, "headBoneAll", 0 , 0);
		headBoneAll.setInitialRotationPoint (-0.0F,-0.0F,11.6F);
		headBoneAll.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1962058F,-0.0F,0.0F,0.9805627F)).transpose());
		parts.put(headBoneAll.boxName,headBoneAll);
		
		hipsLeftBone = new MCAModelRenderer(this, "hipsLeftBone", 0 , 0);
		hipsLeftBone.setInitialRotationPoint (-0.0F,0.0F,40.2F);
		hipsLeftBone.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.484904F,-0.4954148F,0.7202005F,0.0272699F)).transpose());
		parts.put(hipsLeftBone.boxName,hipsLeftBone);
		
		hipsRightBone = new MCAModelRenderer(this, "hipsRightBone", 0 , 0);
		hipsRightBone.setInitialRotationPoint (-0.0F,-0.0F,40.2F);
		hipsRightBone.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.6370561F,-0.2733623F,0.676294F,0.2491169F)).transpose());
		parts.put(hipsRightBone.boxName,hipsRightBone);
		
		jawBone = new MCAModelRenderer(this, "jawBone", 0 , 0);
		jawBone.setInitialRotationPoint (0.0F,0.0F,14.0F);
		jawBone.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2679889F,-0.0F,0.0F,0.963422F)).transpose());
		parts.put(jawBone.boxName,jawBone);
		
		lowerArmBone_L = new MCAModelRenderer(this, "lowerArmBone_L", 0 , 0);
		lowerArmBone_L.setInitialRotationPoint (-0.0F,0.0F,33.0F);
		lowerArmBone_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1952315F,0.0454006F,-0.1376966F,0.969981F)).transpose());
		parts.put(lowerArmBone_L.boxName,lowerArmBone_L);
		
		lowerArmBone_R = new MCAModelRenderer(this, "lowerArmBone_R", 0 , 0);
		lowerArmBone_R.setInitialRotationPoint (-0.0F,-0.0F,33.0F);
		lowerArmBone_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.135691F,-0.0715625F,-0.1737444F,0.9727691F)).transpose());
		parts.put(lowerArmBone_R.boxName,lowerArmBone_R);
		
		lowerBodyBone = new MCAModelRenderer(this, "lowerBodyBone", 0 , 0);
		lowerBodyBone.setInitialRotationPoint (-0.0F,0.0F,40.2F);
		lowerBodyBone.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.7136928F,0.0F,0.0F,0.7004589F)).transpose());
		parts.put(lowerBodyBone.boxName,lowerBodyBone);
		
		lowerLegBoneLeft = new MCAModelRenderer(this, "lowerLegBoneLeft", 0 , 0);
		lowerLegBoneLeft.setInitialRotationPoint (0.0F,-0.0F,150.6F);
		lowerLegBoneLeft.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6533664F,-0.0246528F,0.0144748F,0.7565019F)).transpose());
		parts.put(lowerLegBoneLeft.boxName,lowerLegBoneLeft);
		
		lowerLegBoneRight = new MCAModelRenderer(this, "lowerLegBoneRight", 0 , 0);
		lowerLegBoneRight.setInitialRotationPoint (0.0F,-0.0F,150.6F);
		lowerLegBoneRight.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6533667F,0.0246529F,-0.0144748F,0.7565016F)).transpose());
		parts.put(lowerLegBoneRight.boxName,lowerLegBoneRight);
		
		middleBodyBone = new MCAModelRenderer(this, "middleBodyBone", 0 , 0);
		middleBodyBone.setInitialRotationPoint (-0.0F,0.0F,105.4F);
		middleBodyBone.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0459431F,0.0F,0.0F,0.9989441F)).transpose());
		parts.put(middleBodyBone.boxName,middleBodyBone);
		
		neckBone0 = new MCAModelRenderer(this, "neckBone0", 0 , 0);
		neckBone0.setInitialRotationPoint (0.0F,0.0F,16.3F);
		neckBone0.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.009296F,-0.0013668F,-2.43e-05F,0.9999559F)).transpose());
		parts.put(neckBone0.boxName,neckBone0);
		
		neckBone1 = new MCAModelRenderer(this, "neckBone1", 0 , 0);
		neckBone1.setInitialRotationPoint (0.0F,0.0F,26.6F);
		neckBone1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1670073F,-0.0F,-3e-07F,0.9859557F)).transpose());
		parts.put(neckBone1.boxName,neckBone1);
		
		neckBone2 = new MCAModelRenderer(this, "neckBone2", 0 , 0);
		neckBone2.setInitialRotationPoint (-0.0F,0.0F,30.6F);
		neckBone2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.042294F,0.001312F,-0.0003839F,0.9991043F)).transpose());
		parts.put(neckBone2.boxName,neckBone2);
		
		neckBone3 = new MCAModelRenderer(this, "neckBone3", 0 , 0);
		neckBone3.setInitialRotationPoint (-0.0F,0.0F,93.6F);
		neckBone3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1565399F,0.0F,0.0F,0.9876717F)).transpose());
		parts.put(neckBone3.boxName,neckBone3);
		
		tailBone1 = new MCAModelRenderer(this, "tailBone1", 0 , 0);
		tailBone1.setInitialRotationPoint (-0.0F,0.0F,40.2F);
		tailBone1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6837238F,0.001235F,-0.0026474F,0.7297351F)).transpose());
		parts.put(tailBone1.boxName,tailBone1);
		
		tailBone2 = new MCAModelRenderer(this, "tailBone2", 0 , 0);
		tailBone2.setInitialRotationPoint (0.0F,-0.0F,132.3F);
		tailBone2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1935165F,-0.0055416F,0.0022892F,0.9810787F)).transpose());
		parts.put(tailBone2.boxName,tailBone2);
		
		tailBone3 = new MCAModelRenderer(this, "tailBone3", 0 , 0);
		tailBone3.setInitialRotationPoint (0.0F,-0.0F,114.9F);
		tailBone3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.227182F,0.0045968F,0.0017533F,0.9738399F)).transpose());
		parts.put(tailBone3.boxName,tailBone3);
		
		tailBone4 = new MCAModelRenderer(this, "tailBone4", 0 , 0);
		tailBone4.setInitialRotationPoint (-0.0F,-0.0F,107.5F);
		tailBone4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0541823F,-0.0F,-0.0F,0.9985311F)).transpose());
		parts.put(tailBone4.boxName,tailBone4);
		
		tailBone5 = new MCAModelRenderer(this, "tailBone5", 0 , 0);
		tailBone5.setInitialRotationPoint (-0.0F,-0.0F,98.6F);
		tailBone5.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.06518F,-0.0002284F,0.0108087F,0.997815F)).transpose());
		parts.put(tailBone5.boxName,tailBone5);
		
		tailBone6 = new MCAModelRenderer(this, "tailBone6", 0 , 0);
		tailBone6.setInitialRotationPoint (0.0F,0.0F,125.6F);
		tailBone6.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.005862F,-0.0006141F,0.0159691F,0.9998552F)).transpose());
		parts.put(tailBone6.boxName,tailBone6);
		
		tailBone7 = new MCAModelRenderer(this, "tailBone7", 0 , 0);
		tailBone7.setInitialRotationPoint (-0.0F,-0.0F,105.5F);
		tailBone7.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0014699F,0.0002852F,0.0060376F,0.9999807F)).transpose());
		parts.put(tailBone7.boxName,tailBone7);
		
		tailBone8 = new MCAModelRenderer(this, "tailBone8", 0 , 0);
		tailBone8.setInitialRotationPoint (0.0F,-0.0F,83.8F);
		tailBone8.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0031099F,0.0002838F,-0.0001598F,0.9999952F)).transpose());
		parts.put(tailBone8.boxName,tailBone8);
		
		thighBoneLeft = new MCAModelRenderer(this, "thighBoneLeft", 0 , 0);
		thighBoneLeft.setInitialRotationPoint (0.0F,0.0F,98.6F);
		thighBoneLeft.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.4943305F,0.5025707F,-0.7089949F,0.0196531F)).transpose());
		parts.put(thighBoneLeft.boxName,thighBoneLeft);
		
		thighBoneRight = new MCAModelRenderer(this, "thighBoneRight", 0 , 0);
		thighBoneRight.setInitialRotationPoint (-0.0F,-0.0F,98.6F);
		thighBoneRight.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6485001F,0.2763882F,-0.663029F,0.2518925F)).transpose());
		parts.put(thighBoneRight.boxName,thighBoneRight);
		
		upArmBone_L = new MCAModelRenderer(this, "upArmBone_L", 0 , 0);
		upArmBone_L.setInitialRotationPoint (0.0F,-0.0F,79.0F);
		upArmBone_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2375989F,-0.0511231F,0.006459F,0.9699957F)).transpose());
		parts.put(upArmBone_L.boxName,upArmBone_L);
		
		upArmBone_R = new MCAModelRenderer(this, "upArmBone_R", 0 , 0);
		upArmBone_R.setInitialRotationPoint (-0.0F,-0.0F,79.0F);
		upArmBone_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3169767F,0.0151119F,0.2832141F,0.9050344F)).transpose());
		parts.put(upArmBone_R.boxName,upArmBone_R);
		
		upperBodyBone = new MCAModelRenderer(this, "upperBodyBone", 0 , 0);
		upperBodyBone.setInitialRotationPoint (-0.0F,-0.0F,74.7F);
		upperBodyBone.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1872801F,0.0F,0.0F,0.9823067F)).transpose());
		parts.put(upperBodyBone.boxName,upperBodyBone);
		
		upperBodyBone_L = new MCAModelRenderer(this, "upperBodyBone_L", 0 , 0);
		upperBodyBone_L.setInitialRotationPoint (-0.0F,0.0F,93.6F);
		upperBodyBone_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7315949F,0.2230363F,0.6440963F,0.0127932F)).transpose());
		parts.put(upperBodyBone_L.boxName,upperBodyBone_L);
		
		upperBodyBone_R = new MCAModelRenderer(this, "upperBodyBone_R", 0 , 0);
		upperBodyBone_R.setInitialRotationPoint (-0.0F,0.0F,93.6F);
		upperBodyBone_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7315949F,-0.2230363F,-0.6440963F,0.0127932F)).transpose());
		parts.put(upperBodyBone_R.boxName,upperBodyBone_R);
		
		handBone1_L.addChild(fingerBone1_L);
		handBone1_R.addChild(fingerBone1_R);
		handBone2_L.addChild(fingerBone2_L);
		handBone2_R.addChild(fingerBone2_R);
		handBone3_L.addChild(fingerBone3_L);
		handBone3_R.addChild(fingerBone3_R);
		handBone4_L.addChild(fingerBone4_L);
		handBone4_R.addChild(fingerBone4_R);
		footBoneUpLeft.addChild(footBoneBotLeft);
		footBoneBotLeft.addChild(footBoneBotLeft_001);
		footBoneUpRight.addChild(footBoneBotRight);
		footBoneBotRight.addChild(footBoneBotRight_001);
		lowerLegBoneLeft.addChild(footBoneUpLeft);
		lowerLegBoneRight.addChild(footBoneUpRight);
		lowerArmBone_L.addChild(handBone1_L);
		lowerArmBone_R.addChild(handBone1_R);
		lowerArmBone_L.addChild(handBone2_L);
		lowerArmBone_R.addChild(handBone2_R);
		lowerArmBone_L.addChild(handBone3_L);
		lowerArmBone_R.addChild(handBone3_R);
		lowerArmBone_L.addChild(handBone4_L);
		lowerArmBone_R.addChild(handBone4_R);
		headBoneAll.addChild(headBone);
		neckBone0.addChild(headBoneAll);
		Bone.addChild(hipsLeftBone);
		Bone.addChild(hipsRightBone);
		headBoneAll.addChild(jawBone);
		upArmBone_L.addChild(lowerArmBone_L);
		upArmBone_R.addChild(lowerArmBone_R);
		Bone.addChild(lowerBodyBone);
		thighBoneLeft.addChild(lowerLegBoneLeft);
		thighBoneRight.addChild(lowerLegBoneRight);
		lowerBodyBone.addChild(middleBodyBone);
		neckBone1.addChild(neckBone0);
		neckBone2.addChild(neckBone1);
		neckBone3.addChild(neckBone2);
		upperBodyBone.addChild(neckBone3);
		Bone.addChild(tailBone1);
		tailBone1.addChild(tailBone2);
		tailBone2.addChild(tailBone3);
		tailBone3.addChild(tailBone4);
		tailBone4.addChild(tailBone5);
		tailBone5.addChild(tailBone6);
		tailBone6.addChild(tailBone7);
		tailBone7.addChild(tailBone8);
		hipsLeftBone.addChild(thighBoneLeft);
		hipsRightBone.addChild(thighBoneRight);
		upperBodyBone_L.addChild(upArmBone_L);
		upperBodyBone_R.addChild(upArmBone_R);
		middleBodyBone.addChild(upperBodyBone);
		upperBodyBone.addChild(upperBodyBone_L);
		upperBodyBone.addChild(upperBodyBone_R);
		
		bellyLeftFront = new MCAModelRenderer(this, "bellyLeftFront", 898 , 858);
		bellyLeftFront.mirror = false;
		bellyLeftFront.addBox (-9.0F,-60.0F,-19.0F,18,120,38);
		bellyLeftFront.setInitialRotationPoint (-19.0F,100.5F,32.7F);
		bellyLeftFront.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.5375098F,-0.4535025F,-0.513936F,0.4912111F)).transpose());
		bellyLeftFront.setTextureSize( 2048 , 2048 );
		parts.put(bellyLeftFront.boxName,bellyLeftFront);
		middleBodyBone.addChild(bellyLeftFront);
		
		bellyLeftFrontmirror = new MCAModelRenderer(this, "bellyLeftFrontmirror", 898 , 858);
		bellyLeftFrontmirror.mirror = true;
		bellyLeftFrontmirror.addBox (-9.0F,-60.0F,-19.0F,18,120,38);
		bellyLeftFrontmirror.setInitialRotationPoint (19.0F,100.5F,32.7F);
		bellyLeftFrontmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.5375102F,0.4535028F,0.5139357F,0.4912111F)).transpose());
		bellyLeftFrontmirror.setTextureSize( 2048 , 2048 );
		parts.put(bellyLeftFrontmirror.boxName,bellyLeftFrontmirror);
		middleBodyBone.addChild(bellyLeftFrontmirror);
		
		bellyLeftLeft = new MCAModelRenderer(this, "bellyLeftLeft", 0 , 606);
		bellyLeftLeft.mirror = false;
		bellyLeftLeft.addBox (-10.0F,-23.0F,-75.0F,20,46,150);
		bellyLeftLeft.setInitialRotationPoint (-39.0F,77.8F,38.3F);
		bellyLeftLeft.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2492566F,-0.9682263F,-0.0157873F,0.0126369F)).transpose());
		bellyLeftLeft.setTextureSize( 2048 , 2048 );
		parts.put(bellyLeftLeft.boxName,bellyLeftLeft);
		middleBodyBone.addChild(bellyLeftLeft);
		
		bellyLeftLeftmirror = new MCAModelRenderer(this, "bellyLeftLeftmirror", 0 , 606);
		bellyLeftLeftmirror.mirror = true;
		bellyLeftLeftmirror.addBox (-10.0F,-23.0F,-75.0F,20,46,150);
		bellyLeftLeftmirror.setInitialRotationPoint (39.0F,77.8F,38.3F);
		bellyLeftLeftmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2492505F,0.968228F,0.0157887F,0.0126366F)).transpose());
		bellyLeftLeftmirror.setTextureSize( 2048 , 2048 );
		parts.put(bellyLeftLeftmirror.boxName,bellyLeftLeftmirror);
		middleBodyBone.addChild(bellyLeftLeftmirror);
		
		cheekLeftLow = new MCAModelRenderer(this, "cheekLeftLow", 712 , 70);
		cheekLeftLow.mirror = false;
		cheekLeftLow.addBox (-12.0F,-4.0F,-12.0F,24,8,24);
		cheekLeftLow.setInitialRotationPoint (-20.1F,4.9F,8.4F);
		cheekLeftLow.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.6307195F,-0.7668067F,-0.0250949F,0.1164935F)).transpose());
		cheekLeftLow.setTextureSize( 2048 , 2048 );
		parts.put(cheekLeftLow.boxName,cheekLeftLow);
		headBone.addChild(cheekLeftLow);
		
		cheekLeftLowmirror = new MCAModelRenderer(this, "cheekLeftLowmirror", 712 , 70);
		cheekLeftLowmirror.mirror = true;
		cheekLeftLowmirror.addBox (-12.0F,-4.0F,-12.0F,24,8,24);
		cheekLeftLowmirror.setInitialRotationPoint (20.1F,4.9F,8.4F);
		cheekLeftLowmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.6307195F,0.7668067F,0.0250947F,0.1164936F)).transpose());
		cheekLeftLowmirror.setTextureSize( 2048 , 2048 );
		parts.put(cheekLeftLowmirror.boxName,cheekLeftLowmirror);
		headBone.addChild(cheekLeftLowmirror);
		
		cheekLeftUp = new MCAModelRenderer(this, "cheekLeftUp", 808 , 76);
		cheekLeftUp.mirror = false;
		cheekLeftUp.addBox (-7.0F,-10.0F,-12.0F,14,20,24);
		cheekLeftUp.setInitialRotationPoint (-9.2F,-3.0F,14.5F);
		cheekLeftUp.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5115846F,0.82963F,-0.2186203F,0.0469093F)).transpose());
		cheekLeftUp.setTextureSize( 2048 , 2048 );
		parts.put(cheekLeftUp.boxName,cheekLeftUp);
		headBone.addChild(cheekLeftUp);
		
		cheekLeftUpmirror = new MCAModelRenderer(this, "cheekLeftUpmirror", 808 , 76);
		cheekLeftUpmirror.mirror = true;
		cheekLeftUpmirror.addBox (-7.0F,-10.0F,-12.0F,14,20,24);
		cheekLeftUpmirror.setInitialRotationPoint (9.2F,-3.0F,14.5F);
		cheekLeftUpmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5115852F,-0.8296296F,0.2186203F,0.0469089F)).transpose());
		cheekLeftUpmirror.setTextureSize( 2048 , 2048 );
		parts.put(cheekLeftUpmirror.boxName,cheekLeftUpmirror);
		headBone.addChild(cheekLeftUpmirror);
		
		chestLeftBot = new MCAModelRenderer(this, "chestLeftBot", 484 , 800);
		chestLeftBot.mirror = false;
		chestLeftBot.addBox (-22.0F,-22.0F,-19.0F,44,44,38);
		chestLeftBot.setInitialRotationPoint (-16.4F,81.1F,49.1F);
		chestLeftBot.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1863017F,-0.4680808F,-0.8628395F,0.0412312F)).transpose());
		chestLeftBot.setTextureSize( 2048 , 2048 );
		parts.put(chestLeftBot.boxName,chestLeftBot);
		upperBodyBone.addChild(chestLeftBot);
		
		chestLeftBotmirror = new MCAModelRenderer(this, "chestLeftBotmirror", 484 , 800);
		chestLeftBotmirror.mirror = true;
		chestLeftBotmirror.addBox (-22.0F,-22.0F,-19.0F,44,44,38);
		chestLeftBotmirror.setInitialRotationPoint (16.7F,81.1F,49.1F);
		chestLeftBotmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1863006F,0.4680833F,0.8628384F,0.041232F)).transpose());
		chestLeftBotmirror.setTextureSize( 2048 , 2048 );
		parts.put(chestLeftBotmirror.boxName,chestLeftBotmirror);
		upperBodyBone.addChild(chestLeftBotmirror);
		
		chestLeftLeft = new MCAModelRenderer(this, "chestLeftLeft", 610 , 724);
		chestLeftLeft.mirror = false;
		chestLeftLeft.addBox (-26.0F,-24.0F,-25.0F,52,48,50);
		chestLeftLeft.setInitialRotationPoint (3.5F,-34.0F,63.8F);
		chestLeftLeft.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0362004F,-0.5547286F,0.3433092F,0.7570367F)).transpose());
		chestLeftLeft.setTextureSize( 2048 , 2048 );
		parts.put(chestLeftLeft.boxName,chestLeftLeft);
		upperBodyBone_L.addChild(chestLeftLeft);
		
		chestLeftLeftmirror = new MCAModelRenderer(this, "chestLeftLeftmirror", 610 , 724);
		chestLeftLeftmirror.mirror = true;
		chestLeftLeftmirror.addBox (-26.0F,-24.0F,-25.0F,52,48,50);
		chestLeftLeftmirror.setInitialRotationPoint (2.4F,-37.0F,62.2F);
		chestLeftLeftmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0255959F,0.6083835F,-0.3452472F,0.7141559F)).transpose());
		chestLeftLeftmirror.setTextureSize( 2048 , 2048 );
		parts.put(chestLeftLeftmirror.boxName,chestLeftLeftmirror);
		upperBodyBone_R.addChild(chestLeftLeftmirror);
		
		chestLeftMid = new MCAModelRenderer(this, "chestLeftMid", 378 , 682);
		chestLeftMid.mirror = false;
		chestLeftMid.addBox (-25.0F,-26.0F,-33.0F,50,52,66);
		chestLeftMid.setInitialRotationPoint (-13.1F,52.9F,66.2F);
		chestLeftMid.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1911266F,-0.2683609F,-0.9423134F,0.0591489F)).transpose());
		chestLeftMid.setTextureSize( 2048 , 2048 );
		parts.put(chestLeftMid.boxName,chestLeftMid);
		upperBodyBone.addChild(chestLeftMid);
		
		chestLeftMidmirror = new MCAModelRenderer(this, "chestLeftMidmirror", 378 , 682);
		chestLeftMidmirror.mirror = true;
		chestLeftMidmirror.addBox (-25.0F,-26.0F,-33.0F,50,52,66);
		chestLeftMidmirror.setInitialRotationPoint (13.1F,52.9F,66.2F);
		chestLeftMidmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1911263F,0.2683605F,0.9423136F,0.0591491F)).transpose());
		chestLeftMidmirror.setTextureSize( 2048 , 2048 );
		parts.put(chestLeftMidmirror.boxName,chestLeftMidmirror);
		upperBodyBone.addChild(chestLeftMidmirror);
		
		chestLeftTop = new MCAModelRenderer(this, "chestLeftTop", 510 , 610);
		chestLeftTop.mirror = false;
		chestLeftTop.addBox (-34.0F,-17.0F,-19.0F,68,34,38);
		chestLeftTop.setInitialRotationPoint (-28.8F,36.1F,96.4F);
		chestLeftTop.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1939317F,0.0921309F,0.9752648F,0.0525446F)).transpose());
		chestLeftTop.setTextureSize( 2048 , 2048 );
		parts.put(chestLeftTop.boxName,chestLeftTop);
		upperBodyBone.addChild(chestLeftTop);
		
		chestLeftTopmirror = new MCAModelRenderer(this, "chestLeftTopmirror", 510 , 610);
		chestLeftTopmirror.mirror = true;
		chestLeftTopmirror.addBox (-34.0F,-17.0F,-19.0F,68,34,38);
		chestLeftTopmirror.setInitialRotationPoint (28.8F,36.1F,96.4F);
		chestLeftTopmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1939319F,-0.0921299F,-0.9752649F,0.0525451F)).transpose());
		chestLeftTopmirror.setTextureSize( 2048 , 2048 );
		parts.put(chestLeftTopmirror.boxName,chestLeftTopmirror);
		upperBodyBone.addChild(chestLeftTopmirror);
		
		crochLeft = new MCAModelRenderer(this, "crochLeft", 0 , 802);
		crochLeft.mirror = false;
		crochLeft.addBox (-27.0F,-54.0F,-57.0F,54,108,114);
		crochLeft.setInitialRotationPoint (-21.2F,79.4F,63.0F);
		crochLeft.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0395408F,-0.2072499F,0.9773151F,0.0184157F)).transpose());
		crochLeft.setTextureSize( 2048 , 2048 );
		parts.put(crochLeft.boxName,crochLeft);
		lowerBodyBone.addChild(crochLeft);
		
		crochLeftmirror = new MCAModelRenderer(this, "crochLeftmirror", 0 , 802);
		crochLeftmirror.mirror = true;
		crochLeftmirror.addBox (-27.0F,-54.0F,-57.0F,54,108,114);
		crochLeftmirror.setInitialRotationPoint (21.2F,79.4F,63.0F);
		crochLeftmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0395413F,0.2072461F,-0.9773159F,0.0184141F)).transpose());
		crochLeftmirror.setTextureSize( 2048 , 2048 );
		parts.put(crochLeftmirror.boxName,crochLeftmirror);
		lowerBodyBone.addChild(crochLeftmirror);
		
		eyebrowLeft = new MCAModelRenderer(this, "eyebrowLeft", 860 , 66);
		eyebrowLeft.mirror = false;
		eyebrowLeft.addBox (-12.0F,-7.0F,-10.0F,24,14,20);
		eyebrowLeft.setInitialRotationPoint (-5.0F,-11.1F,19.4F);
		eyebrowLeft.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2839356F,0.2284877F,0.9256938F,0.101317F)).transpose());
		eyebrowLeft.setTextureSize( 2048 , 2048 );
		parts.put(eyebrowLeft.boxName,eyebrowLeft);
		headBone.addChild(eyebrowLeft);
		
		eyebrowLeftmirror = new MCAModelRenderer(this, "eyebrowLeftmirror", 860 , 66);
		eyebrowLeftmirror.mirror = true;
		eyebrowLeftmirror.addBox (-12.0F,-7.0F,-10.0F,24,14,20);
		eyebrowLeftmirror.setInitialRotationPoint (5.0F,-11.1F,19.4F);
		eyebrowLeftmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2839354F,-0.2284876F,-0.9256938F,0.1013169F)).transpose());
		eyebrowLeftmirror.setTextureSize( 2048 , 2048 );
		parts.put(eyebrowLeftmirror.boxName,eyebrowLeftmirror);
		headBone.addChild(eyebrowLeftmirror);
		
		eyesMid = new MCAModelRenderer(this, "eyesMid", 948 , 66);
		eyesMid.mirror = false;
		eyesMid.addBox (-18.0F,-1.0F,-1.0F,36,2,2);
		eyesMid.setInitialRotationPoint (-0.0F,-7.4F,23.2F);
		eyesMid.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(4e-07F,0.1537264F,0.9881135F,0.0F)).transpose());
		eyesMid.setTextureSize( 2048 , 2048 );
		parts.put(eyesMid.boxName,eyesMid);
		headBone.addChild(eyesMid);
		
		finger1 = new MCAModelRenderer(this, "finger1", 124 , 1153);
		finger1.mirror = false;
		finger1.addBox (-10.0F,-4.0F,-4.0F,20,8,8);
		finger1.setInitialRotationPoint (-0.9F,-0.9F,9.3F);
		finger1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1487451F,-0.633971F,-0.1855205F,0.7358925F)).transpose());
		finger1.setTextureSize( 2048 , 2048 );
		parts.put(finger1.boxName,finger1);
		fingerBone3_L.addChild(finger1);
		
		finger1mirror = new MCAModelRenderer(this, "finger1mirror", 124 , 1153);
		finger1mirror.mirror = true;
		finger1mirror.addBox (-10.0F,-4.0F,-4.0F,20,8,8);
		finger1mirror.setInitialRotationPoint (1.0F,0.6F,9.3F);
		finger1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1522682F,0.6349958F,0.1822696F,0.7351004F)).transpose());
		finger1mirror.setTextureSize( 2048 , 2048 );
		parts.put(finger1mirror.boxName,finger1mirror);
		fingerBone3_R.addChild(finger1mirror);
		
		finger2 = new MCAModelRenderer(this, "finger2", 124 , 1153);
		finger2.mirror = false;
		finger2.addBox (-10.0F,-4.0F,-4.0F,20,8,8);
		finger2.setInitialRotationPoint (-0.3F,-1.9F,6.3F);
		finger2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.224396F,-0.6456301F,-0.3162552F,0.6578684F)).transpose());
		finger2.setTextureSize( 2048 , 2048 );
		parts.put(finger2.boxName,finger2);
		fingerBone2_L.addChild(finger2);
		
		finger2mirror = new MCAModelRenderer(this, "finger2mirror", 124 , 1153);
		finger2mirror.mirror = true;
		finger2mirror.addBox (-10.0F,-4.0F,-4.0F,20,8,8);
		finger2mirror.setInitialRotationPoint (-0.1F,-0.4F,6.2F);
		finger2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2282455F,0.6460809F,0.3131645F,0.6575801F)).transpose());
		finger2mirror.setTextureSize( 2048 , 2048 );
		parts.put(finger2mirror.boxName,finger2mirror);
		fingerBone2_R.addChild(finger2mirror);
		
		finger3 = new MCAModelRenderer(this, "finger3", 124 , 1153);
		finger3.mirror = false;
		finger3.addBox (-10.0F,-4.0F,-4.0F,20,8,8);
		finger3.setInitialRotationPoint (-0.3F,-2.4F,2.4F);
		finger3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1702945F,-0.684248F,-0.171077F,0.6881403F)).transpose());
		finger3.setTextureSize( 2048 , 2048 );
		parts.put(finger3.boxName,finger3);
		fingerBone1_L.addChild(finger3);
		
		finger3mirror = new MCAModelRenderer(this, "finger3mirror", 124 , 1153);
		finger3mirror.mirror = true;
		finger3mirror.addBox (-10.0F,-4.0F,-4.0F,20,8,8);
		finger3mirror.setInitialRotationPoint (0.5F,-0.9F,2.2F);
		finger3mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1740918F,0.6853409F,0.1684047F,0.6867604F)).transpose());
		finger3mirror.setTextureSize( 2048 , 2048 );
		parts.put(finger3mirror.boxName,finger3mirror);
		fingerBone1_R.addChild(finger3mirror);
		
		finger4 = new MCAModelRenderer(this, "finger4", 145 , 1200);
		finger4.mirror = false;
		finger4.addBox (-11.0F,-8.0F,-7.0F,22,16,14);
		finger4.setInitialRotationPoint (-1.8F,0.5F,28.4F);
		finger4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0977771F,-0.6899114F,0.2036941F,0.6877286F)).transpose());
		finger4.setTextureSize( 2048 , 2048 );
		parts.put(finger4.boxName,finger4);
		handBone4_L.addChild(finger4);
		
		finger4mirror = new MCAModelRenderer(this, "finger4mirror", 145 , 1200);
		finger4mirror.mirror = true;
		finger4mirror.addBox (-11.0F,-8.0F,-7.0F,22,16,14);
		finger4mirror.setInitialRotationPoint (1.7F,1.6F,27.7F);
		finger4mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1000133F,0.6881611F,-0.2077622F,0.6879438F)).transpose());
		finger4mirror.setTextureSize( 2048 , 2048 );
		parts.put(finger4mirror.boxName,finger4mirror);
		handBone4_R.addChild(finger4mirror);
		
		footLeftBase = new MCAModelRenderer(this, "footLeftBase", 1459 , 1096);
		footLeftBase.mirror = false;
		footLeftBase.addBox (-31.0F,-16.0F,-30.0F,62,32,60);
		footLeftBase.setInitialRotationPoint (-3.3F,4.0F,5.6F);
		footLeftBase.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0948325F,0.0355328F,-0.0182676F,0.9946912F)).transpose());
		footLeftBase.setTextureSize( 2048 , 2048 );
		parts.put(footLeftBase.boxName,footLeftBase);
		footBoneBotLeft.addChild(footLeftBase);
		
		footLeftBasemirror = new MCAModelRenderer(this, "footLeftBasemirror", 1459 , 1096);
		footLeftBasemirror.mirror = true;
		footLeftBasemirror.addBox (-31.0F,-16.0F,-30.0F,62,32,60);
		footLeftBasemirror.setInitialRotationPoint (3.3F,4.0F,5.6F);
		footLeftBasemirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0948353F,-0.0355326F,0.0182654F,0.994691F)).transpose());
		footLeftBasemirror.setTextureSize( 2048 , 2048 );
		parts.put(footLeftBasemirror.boxName,footLeftBasemirror);
		footBoneBotRight.addChild(footLeftBasemirror);
		
		footLeftNail1 = new MCAModelRenderer(this, "footLeftNail1", 1657 , 1275);
		footLeftNail1.mirror = false;
		footLeftNail1.addBox (-6.0F,-6.0F,-11.0F,12,12,22);
		footLeftNail1.setInitialRotationPoint (-48.4F,-0.5F,13.0F);
		footLeftNail1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0024966F,-0.3914396F,0.0656131F,0.9178582F)).transpose());
		footLeftNail1.setTextureSize( 2048 , 2048 );
		parts.put(footLeftNail1.boxName,footLeftNail1);
		footBoneBotLeft.addChild(footLeftNail1);
		
		footLeftNail1mirror = new MCAModelRenderer(this, "footLeftNail1mirror", 1657 , 1275);
		footLeftNail1mirror.mirror = true;
		footLeftNail1mirror.addBox (-6.0F,-6.0F,-11.0F,12,12,22);
		footLeftNail1mirror.setInitialRotationPoint (48.4F,-0.5F,13.0F);
		footLeftNail1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0024973F,0.3914394F,-0.0656136F,0.9178583F)).transpose());
		footLeftNail1mirror.setTextureSize( 2048 , 2048 );
		parts.put(footLeftNail1mirror.boxName,footLeftNail1mirror);
		footBoneBotRight.addChild(footLeftNail1mirror);
		
		footLeftNail2 = new MCAModelRenderer(this, "footLeftNail2", 1657 , 1275);
		footLeftNail2.mirror = false;
		footLeftNail2.addBox (-6.0F,-6.0F,-11.0F,12,12,22);
		footLeftNail2.setInitialRotationPoint (-15.9F,6.4F,26.8F);
		footLeftNail2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0151914F,-0.1261715F,-0.037514F,0.9911825F)).transpose());
		footLeftNail2.setTextureSize( 2048 , 2048 );
		parts.put(footLeftNail2.boxName,footLeftNail2);
		footBoneBotLeft_001.addChild(footLeftNail2);
		
		footLeftNail2mirror = new MCAModelRenderer(this, "footLeftNail2mirror", 1657 , 1275);
		footLeftNail2mirror.mirror = true;
		footLeftNail2mirror.addBox (-6.0F,-6.0F,-11.0F,12,12,22);
		footLeftNail2mirror.setInitialRotationPoint (15.9F,6.4F,26.8F);
		footLeftNail2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0151897F,0.126171F,0.0375136F,0.9911827F)).transpose());
		footLeftNail2mirror.setTextureSize( 2048 , 2048 );
		parts.put(footLeftNail2mirror.boxName,footLeftNail2mirror);
		footBoneBotRight_001.addChild(footLeftNail2mirror);
		
		footLeftNail3 = new MCAModelRenderer(this, "footLeftNail3", 1657 , 1275);
		footLeftNail3.mirror = false;
		footLeftNail3.addBox (-6.0F,-6.0F,-11.0F,12,12,22);
		footLeftNail3.setInitialRotationPoint (15.6F,3.9F,24.2F);
		footLeftNail3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0313077F,0.100715F,-0.096848F,0.9896953F)).transpose());
		footLeftNail3.setTextureSize( 2048 , 2048 );
		parts.put(footLeftNail3.boxName,footLeftNail3);
		footBoneBotLeft_001.addChild(footLeftNail3);
		
		footLeftNail3mirror = new MCAModelRenderer(this, "footLeftNail3mirror", 1657 , 1275);
		footLeftNail3mirror.mirror = true;
		footLeftNail3mirror.addBox (-6.0F,-6.0F,-11.0F,12,12,22);
		footLeftNail3mirror.setInitialRotationPoint (-15.6F,3.9F,24.2F);
		footLeftNail3mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0313079F,-0.1007155F,0.096846F,0.9896955F)).transpose());
		footLeftNail3mirror.setTextureSize( 2048 , 2048 );
		parts.put(footLeftNail3mirror.boxName,footLeftNail3mirror);
		footBoneBotRight_001.addChild(footLeftNail3mirror);
		
		footLeftUp = new MCAModelRenderer(this, "footLeftUp", 1454 , 971);
		footLeftUp.mirror = false;
		footLeftUp.addBox (-27.0F,-23.0F,-35.0F,54,46,70);
		footLeftUp.setInitialRotationPoint (-0.5F,14.5F,23.4F);
		footLeftUp.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0025734F,-0.0583467F,-0.0778103F,0.9952561F)).transpose());
		footLeftUp.setTextureSize( 2048 , 2048 );
		parts.put(footLeftUp.boxName,footLeftUp);
		footBoneUpLeft.addChild(footLeftUp);
		
		footRightUp = new MCAModelRenderer(this, "footRightUp", 1454 , 971);
		footRightUp.mirror = true;
		footRightUp.addBox (-27.0F,-23.0F,-35.0F,54,46,70);
		footRightUp.setInitialRotationPoint (0.5F,14.5F,23.4F);
		footRightUp.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0025743F,0.0583466F,0.0778122F,0.9952559F)).transpose());
		footRightUp.setTextureSize( 2048 , 2048 );
		parts.put(footRightUp.boxName,footRightUp);
		footBoneUpRight.addChild(footRightUp);
		
		handBase = new MCAModelRenderer(this, "handBase", 4 , 1150);
		handBase.mirror = false;
		handBase.addBox (-22.0F,-8.0F,-14.0F,44,16,28);
		handBase.setInitialRotationPoint (3.9F,0.2F,18.1F);
		handBase.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0709434F,-0.6157921F,0.0595973F,0.7824419F)).transpose());
		handBase.setTextureSize( 2048 , 2048 );
		parts.put(handBase.boxName,handBase);
		handBone3_L.addChild(handBase);
		
		handBasemirror = new MCAModelRenderer(this, "handBasemirror", 4 , 1150);
		handBasemirror.mirror = true;
		handBasemirror.addBox (-22.0F,-8.0F,-14.0F,44,16,28);
		handBasemirror.setInitialRotationPoint (-4.2F,1.4F,18.0F);
		handBasemirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.06848F,0.614439F,-0.0635749F,0.7834114F)).transpose());
		handBasemirror.setTextureSize( 2048 , 2048 );
		parts.put(handBasemirror.boxName,handBasemirror);
		handBone3_R.addChild(handBasemirror);
		
		handNail1 = new MCAModelRenderer(this, "handNail1", 62 , 1204);
		handNail1.mirror = false;
		handNail1.addBox (-3.0F,-1.0F,-1.0F,6,2,2);
		handNail1.setInitialRotationPoint (0.2F,-1.4F,22.8F);
		handNail1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0728475F,-0.6334531F,-0.2368699F,0.7330233F)).transpose());
		handNail1.setTextureSize( 2048 , 2048 );
		parts.put(handNail1.boxName,handNail1);
		fingerBone3_L.addChild(handNail1);
		
		handNail1mirror = new MCAModelRenderer(this, "handNail1mirror", 62 , 1204);
		handNail1mirror.mirror = true;
		handNail1mirror.addBox (-3.0F,-1.0F,-1.0F,6,2,2);
		handNail1mirror.setInitialRotationPoint (-0.1F,0.3F,22.7F);
		handNail1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0763512F,0.6347197F,0.2336124F,0.7326164F)).transpose());
		handNail1mirror.setTextureSize( 2048 , 2048 );
		parts.put(handNail1mirror.boxName,handNail1mirror);
		fingerBone3_R.addChild(handNail1mirror);
		
		handNail2 = new MCAModelRenderer(this, "handNail2", 62 , 1204);
		handNail2.mirror = false;
		handNail2.addBox (-6.0F,-1.0F,-1.0F,12,2,2);
		handNail2.setInitialRotationPoint (-0.7F,-1.9F,19.1F);
		handNail2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1462993F,-0.6561564F,-0.3615857F,0.6459963F)).transpose());
		handNail2.setTextureSize( 2048 , 2048 );
		parts.put(handNail2.boxName,handNail2);
		fingerBone2_L.addChild(handNail2);
		
		handNail2mirror = new MCAModelRenderer(this, "handNail2mirror", 62 , 1204);
		handNail2mirror.mirror = true;
		handNail2mirror.addBox (-6.0F,-1.0F,-1.0F,12,2,2);
		handNail2mirror.setInitialRotationPoint (0.3F,-0.3F,19.1F);
		handNail2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1501628F,0.6568729F,0.3585508F,0.6460731F)).transpose());
		handNail2mirror.setTextureSize( 2048 , 2048 );
		parts.put(handNail2mirror.boxName,handNail2mirror);
		fingerBone2_R.addChild(handNail2mirror);
		
		handNail3 = new MCAModelRenderer(this, "handNail3", 62 , 1204);
		handNail3.mirror = false;
		handNail3.addBox (-6.0F,-1.0F,-1.0F,12,2,2);
		handNail3.setInitialRotationPoint (-1.5F,-1.5F,11.5F);
		handNail3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1918089F,-0.7058234F,-0.0056174F,0.6819026F)).transpose());
		handNail3.setTextureSize( 2048 , 2048 );
		parts.put(handNail3.boxName,handNail3);
		fingerBone1_L.addChild(handNail3);
		
		handNail3mirror = new MCAModelRenderer(this, "handNail3mirror", 62 , 1204);
		handNail3mirror.mirror = true;
		handNail3mirror.addBox (-6.0F,-1.0F,-1.0F,12,2,2);
		handNail3mirror.setInitialRotationPoint (1.6F,0.0F,11.4F);
		handNail3mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.187922F,0.7064005F,0.0026228F,0.6824052F)).transpose());
		handNail3mirror.setTextureSize( 2048 , 2048 );
		parts.put(handNail3mirror.boxName,handNail3mirror);
		fingerBone1_R.addChild(handNail3mirror);
		
		handNail4 = new MCAModelRenderer(this, "handNail4", 124 , 1153);
		handNail4.mirror = false;
		handNail4.addBox (-10.0F,-4.0F,-4.0F,20,8,8);
		handNail4.setInitialRotationPoint (-0.3F,0.4F,6.4F);
		handNail4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0943089F,-0.7013724F,0.0519108F,0.704619F)).transpose());
		handNail4.setTextureSize( 2048 , 2048 );
		parts.put(handNail4.boxName,handNail4);
		fingerBone4_L.addChild(handNail4);
		
		handNail4mirror = new MCAModelRenderer(this, "handNail4mirror", 124 , 1153);
		handNail4mirror.mirror = true;
		handNail4mirror.addBox (-10.0F,-4.0F,-4.0F,20,8,8);
		handNail4mirror.setInitialRotationPoint (0.4F,1.8F,6.3F);
		handNail4mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0908903F,0.7012412F,-0.0554968F,0.7049254F)).transpose());
		handNail4mirror.setTextureSize( 2048 , 2048 );
		parts.put(handNail4mirror.boxName,handNail4mirror);
		fingerBone4_R.addChild(handNail4mirror);
		
		headScaleLeftLeft1 = new MCAModelRenderer(this, "headScaleLeftLeft1", 844 , 170);
		headScaleLeftLeft1.mirror = false;
		headScaleLeftLeft1.addBox (-7.0F,-7.0F,-17.0F,14,14,34);
		headScaleLeftLeft1.setInitialRotationPoint (-18.2F,-10.1F,1.4F);
		headScaleLeftLeft1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2200859F,-0.9692662F,0.0542769F,0.0956F)).transpose());
		headScaleLeftLeft1.setTextureSize( 2048 , 2048 );
		parts.put(headScaleLeftLeft1.boxName,headScaleLeftLeft1);
		headBone.addChild(headScaleLeftLeft1);
		
		headScaleLeftLeft1mirror = new MCAModelRenderer(this, "headScaleLeftLeft1mirror", 844 , 170);
		headScaleLeftLeft1mirror.mirror = true;
		headScaleLeftLeft1mirror.addBox (-7.0F,-7.0F,-17.0F,14,14,34);
		headScaleLeftLeft1mirror.setInitialRotationPoint (18.2F,-10.1F,1.4F);
		headScaleLeftLeft1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2200857F,0.9692662F,-0.0542768F,0.0955997F)).transpose());
		headScaleLeftLeft1mirror.setTextureSize( 2048 , 2048 );
		parts.put(headScaleLeftLeft1mirror.boxName,headScaleLeftLeft1mirror);
		headBone.addChild(headScaleLeftLeft1mirror);
		
		headScaleLeftLeft2 = new MCAModelRenderer(this, "headScaleLeftLeft2", 816 , 218);
		headScaleLeftLeft2.mirror = false;
		headScaleLeftLeft2.addBox (-6.0F,-9.0F,-17.0F,12,18,34);
		headScaleLeftLeft2.setInitialRotationPoint (-20.3F,-9.5F,-13.5F);
		headScaleLeftLeft2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2350312F,-0.960784F,-0.1047803F,0.1033223F)).transpose());
		headScaleLeftLeft2.setTextureSize( 2048 , 2048 );
		parts.put(headScaleLeftLeft2.boxName,headScaleLeftLeft2);
		headBone.addChild(headScaleLeftLeft2);
		
		headScaleLeftLeft2mirror = new MCAModelRenderer(this, "headScaleLeftLeft2mirror", 816 , 218);
		headScaleLeftLeft2mirror.mirror = true;
		headScaleLeftLeft2mirror.addBox (-6.0F,-9.0F,-17.0F,12,18,34);
		headScaleLeftLeft2mirror.setInitialRotationPoint (20.3F,-9.5F,-13.5F);
		headScaleLeftLeft2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2350309F,0.9607841F,0.1047805F,0.1033223F)).transpose());
		headScaleLeftLeft2mirror.setTextureSize( 2048 , 2048 );
		parts.put(headScaleLeftLeft2mirror.boxName,headScaleLeftLeft2mirror);
		headBone.addChild(headScaleLeftLeft2mirror);
		
		headScaleLeftUp1 = new MCAModelRenderer(this, "headScaleLeftUp1", 904 , 182);
		headScaleLeftUp1.mirror = false;
		headScaleLeftUp1.addBox (-12.0F,-9.0F,-18.0F,24,18,36);
		headScaleLeftUp1.setInitialRotationPoint (-8.6F,-14.7F,0.5F);
		headScaleLeftUp1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.087812F,0.1837752F,0.9730897F,0.1077599F)).transpose());
		headScaleLeftUp1.setTextureSize( 2048 , 2048 );
		parts.put(headScaleLeftUp1.boxName,headScaleLeftUp1);
		headBone.addChild(headScaleLeftUp1);
		
		headScaleLeftUp1mirror = new MCAModelRenderer(this, "headScaleLeftUp1mirror", 904 , 182);
		headScaleLeftUp1mirror.mirror = true;
		headScaleLeftUp1mirror.addBox (-12.0F,-9.0F,-18.0F,24,18,36);
		headScaleLeftUp1mirror.setInitialRotationPoint (8.6F,-14.7F,0.5F);
		headScaleLeftUp1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.087812F,-0.1837756F,-0.9730896F,0.10776F)).transpose());
		headScaleLeftUp1mirror.setTextureSize( 2048 , 2048 );
		parts.put(headScaleLeftUp1mirror.boxName,headScaleLeftUp1mirror);
		headBone.addChild(headScaleLeftUp1mirror);
		
		headScaleLeftUp2 = new MCAModelRenderer(this, "headScaleLeftUp2", 908 , 236);
		headScaleLeftUp2.mirror = false;
		headScaleLeftUp2.addBox (-13.0F,-7.0F,-16.0F,26,14,32);
		headScaleLeftUp2.setInitialRotationPoint (-9.8F,-17.5F,-21.7F);
		headScaleLeftUp2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.109438F,-0.0056582F,0.9834089F,0.1445621F)).transpose());
		headScaleLeftUp2.setTextureSize( 2048 , 2048 );
		parts.put(headScaleLeftUp2.boxName,headScaleLeftUp2);
		headBone.addChild(headScaleLeftUp2);
		
		headScaleLeftUp2mirror = new MCAModelRenderer(this, "headScaleLeftUp2mirror", 908 , 236);
		headScaleLeftUp2mirror.mirror = true;
		headScaleLeftUp2mirror.addBox (-13.0F,-7.0F,-16.0F,26,14,32);
		headScaleLeftUp2mirror.setInitialRotationPoint (9.8F,-17.5F,-21.7F);
		headScaleLeftUp2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.109438F,0.005658F,-0.983409F,0.144562F)).transpose());
		headScaleLeftUp2mirror.setTextureSize( 2048 , 2048 );
		parts.put(headScaleLeftUp2mirror.boxName,headScaleLeftUp2mirror);
		headBone.addChild(headScaleLeftUp2mirror);
		
		headTooth1 = new MCAModelRenderer(this, "headTooth1", 995 , 0);
		headTooth1.mirror = false;
		headTooth1.addBox (-1.0F,-1.0F,-1.0F,2,2,2);
		headTooth1.setInitialRotationPoint (-1.4F,9.1F,46.0F);
		headTooth1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.026137F,-0.0550537F,0.9981402F,0.0014418F)).transpose());
		headTooth1.setTextureSize( 2048 , 2048 );
		parts.put(headTooth1.boxName,headTooth1);
		headBone.addChild(headTooth1);
		
		headTooth1mirror = new MCAModelRenderer(this, "headTooth1mirror", 995 , 0);
		headTooth1mirror.mirror = true;
		headTooth1mirror.addBox (-1.0F,-1.0F,-1.0F,2,2,2);
		headTooth1mirror.setInitialRotationPoint (1.4F,9.1F,46.0F);
		headTooth1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0261374F,-0.0550539F,0.9981403F,-0.0014418F)).transpose());
		headTooth1mirror.setTextureSize( 2048 , 2048 );
		parts.put(headTooth1mirror.boxName,headTooth1mirror);
		headBone.addChild(headTooth1mirror);
		
		headTooth2 = new MCAModelRenderer(this, "headTooth2", 995 , 0);
		headTooth2.mirror = false;
		headTooth2.addBox (-1.0F,-1.0F,-1.0F,2,2,2);
		headTooth2.setInitialRotationPoint (-4.6F,9.2F,45.3F);
		headTooth2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.026137F,-0.0550537F,0.9981402F,0.0014418F)).transpose());
		headTooth2.setTextureSize( 2048 , 2048 );
		parts.put(headTooth2.boxName,headTooth2);
		headBone.addChild(headTooth2);
		
		headTooth2mirror = new MCAModelRenderer(this, "headTooth2mirror", 995 , 0);
		headTooth2mirror.mirror = true;
		headTooth2mirror.addBox (-1.0F,-1.0F,-1.0F,2,2,2);
		headTooth2mirror.setInitialRotationPoint (4.6F,9.2F,45.3F);
		headTooth2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0261374F,-0.0550539F,0.9981403F,-0.0014418F)).transpose());
		headTooth2mirror.setTextureSize( 2048 , 2048 );
		parts.put(headTooth2mirror.boxName,headTooth2mirror);
		headBone.addChild(headTooth2mirror);
		
		headTooth3 = new MCAModelRenderer(this, "headTooth3", 995 , 0);
		headTooth3.mirror = false;
		headTooth3.addBox (-1.0F,-1.0F,-1.0F,2,2,2);
		headTooth3.setInitialRotationPoint (-7.4F,9.5F,42.6F);
		headTooth3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.026137F,-0.0550537F,0.9981402F,0.0014418F)).transpose());
		headTooth3.setTextureSize( 2048 , 2048 );
		parts.put(headTooth3.boxName,headTooth3);
		headBone.addChild(headTooth3);
		
		headTooth3mirror = new MCAModelRenderer(this, "headTooth3mirror", 995 , 0);
		headTooth3mirror.mirror = true;
		headTooth3mirror.addBox (-1.0F,-1.0F,-1.0F,2,2,2);
		headTooth3mirror.setInitialRotationPoint (7.4F,9.5F,42.6F);
		headTooth3mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0261374F,-0.0550539F,0.9981403F,-0.0014418F)).transpose());
		headTooth3mirror.setTextureSize( 2048 , 2048 );
		parts.put(headTooth3mirror.boxName,headTooth3mirror);
		headBone.addChild(headTooth3mirror);
		
		headTooth4 = new MCAModelRenderer(this, "headTooth4", 995 , 0);
		headTooth4.mirror = false;
		headTooth4.addBox (-1.0F,-2.0F,-1.0F,2,4,2);
		headTooth4.setInitialRotationPoint (-8.9F,8.9F,38.8F);
		headTooth4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3674426F,0.0633523F,-0.9278251F,0.0106376F)).transpose());
		headTooth4.setTextureSize( 2048 , 2048 );
		parts.put(headTooth4.boxName,headTooth4);
		headBone.addChild(headTooth4);
		
		headTooth4mirror = new MCAModelRenderer(this, "headTooth4mirror", 995 , 0);
		headTooth4mirror.mirror = true;
		headTooth4mirror.addBox (-1.0F,-2.0F,-1.0F,2,4,2);
		headTooth4mirror.setInitialRotationPoint (8.8F,8.9F,38.8F);
		headTooth4mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3671962F,-0.0611144F,0.9281205F,0.0049345F)).transpose());
		headTooth4mirror.setTextureSize( 2048 , 2048 );
		parts.put(headTooth4mirror.boxName,headTooth4mirror);
		headBone.addChild(headTooth4mirror);
		
		headTooth5 = new MCAModelRenderer(this, "headTooth5", 995 , 0);
		headTooth5.mirror = false;
		headTooth5.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		headTooth5.setInitialRotationPoint (-9.4F,8.8F,34.9F);
		headTooth5.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3496758F,0.0515845F,-0.9352507F,0.0192877F)).transpose());
		headTooth5.setTextureSize( 2048 , 2048 );
		parts.put(headTooth5.boxName,headTooth5);
		headBone.addChild(headTooth5);
		
		headTooth5mirror = new MCAModelRenderer(this, "headTooth5mirror", 995 , 0);
		headTooth5mirror.mirror = true;
		headTooth5mirror.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		headTooth5mirror.setInitialRotationPoint (9.4F,8.1F,34.8F);
		headTooth5mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3496754F,-0.0515863F,0.9352508F,0.0192886F)).transpose());
		headTooth5mirror.setTextureSize( 2048 , 2048 );
		parts.put(headTooth5mirror.boxName,headTooth5mirror);
		headBone.addChild(headTooth5mirror);
		
		headTooth6 = new MCAModelRenderer(this, "headTooth6", 995 , 0);
		headTooth6.mirror = false;
		headTooth6.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		headTooth6.setInitialRotationPoint (-9.4F,7.9F,30.9F);
		headTooth6.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3404621F,0.013252F,-0.9391252F,0.0442024F)).transpose());
		headTooth6.setTextureSize( 2048 , 2048 );
		parts.put(headTooth6.boxName,headTooth6);
		headBone.addChild(headTooth6);
		
		headTooth6mirror = new MCAModelRenderer(this, "headTooth6mirror", 995 , 0);
		headTooth6mirror.mirror = true;
		headTooth6mirror.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		headTooth6mirror.setInitialRotationPoint (9.3F,7.9F,30.9F);
		headTooth6mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3457449F,0.0464581F,0.9355192F,0.0557322F)).transpose());
		headTooth6mirror.setTextureSize( 2048 , 2048 );
		parts.put(headTooth6mirror.boxName,headTooth6mirror);
		headBone.addChild(headTooth6mirror);
		
		headTooth7 = new MCAModelRenderer(this, "headTooth7", 995 , 0);
		headTooth7.mirror = false;
		headTooth7.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		headTooth7.setInitialRotationPoint (-11.3F,7.4F,26.9F);
		headTooth7.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.4017349F,0.0570063F,0.9139271F,0.0098244F)).transpose());
		headTooth7.setTextureSize( 2048 , 2048 );
		parts.put(headTooth7.boxName,headTooth7);
		headBone.addChild(headTooth7);
		
		headTooth7mirror = new MCAModelRenderer(this, "headTooth7mirror", 995 , 0);
		headTooth7mirror.mirror = true;
		headTooth7mirror.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		headTooth7mirror.setInitialRotationPoint (11.3F,7.4F,26.9F);
		headTooth7mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4017221F,0.0570384F,0.9139316F,-0.0097516F)).transpose());
		headTooth7mirror.setTextureSize( 2048 , 2048 );
		parts.put(headTooth7mirror.boxName,headTooth7mirror);
		headBone.addChild(headTooth7mirror);
		
		jawLeftbot = new MCAModelRenderer(this, "jawLeftbot", 896 , 70);
		jawLeftbot.mirror = false;
		jawLeftbot.addBox (-6.0F,-6.0F,-26.0F,12,12,52);
		jawLeftbot.setInitialRotationPoint (-12.5F,7.9F,24.9F);
		jawLeftbot.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2291418F,0.2342577F,-0.938812F,0.1060636F)).transpose());
		jawLeftbot.setTextureSize( 2048 , 2048 );
		parts.put(jawLeftbot.boxName,jawLeftbot);
		jawBone.addChild(jawLeftbot);
		
		jawLeftbotmirror = new MCAModelRenderer(this, "jawLeftbotmirror", 896 , 70);
		jawLeftbotmirror.mirror = true;
		jawLeftbotmirror.addBox (-6.0F,-6.0F,-26.0F,12,12,52);
		jawLeftbotmirror.setInitialRotationPoint (12.5F,7.9F,24.9F);
		jawLeftbotmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2291417F,-0.2342591F,0.9388117F,0.1060629F)).transpose());
		jawLeftbotmirror.setTextureSize( 2048 , 2048 );
		parts.put(jawLeftbotmirror.boxName,jawLeftbotmirror);
		jawBone.addChild(jawLeftbotmirror);
		
		jawLeftUp = new MCAModelRenderer(this, "jawLeftUp", 928 , 134);
		jawLeftUp.mirror = false;
		jawLeftUp.addBox (-6.0F,-6.0F,-18.0F,12,12,36);
		jawLeftUp.setInitialRotationPoint (-15.5F,6.4F,14.2F);
		jawLeftUp.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2452344F,0.0824119F,-0.9579254F,0.124287F)).transpose());
		jawLeftUp.setTextureSize( 2048 , 2048 );
		parts.put(jawLeftUp.boxName,jawLeftUp);
		jawBone.addChild(jawLeftUp);
		
		jawLeftUpmirror = new MCAModelRenderer(this, "jawLeftUpmirror", 928 , 134);
		jawLeftUpmirror.mirror = true;
		jawLeftUpmirror.addBox (-6.0F,-6.0F,-18.0F,12,12,36);
		jawLeftUpmirror.setInitialRotationPoint (15.5F,6.4F,14.2F);
		jawLeftUpmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2452343F,-0.082413F,0.9579255F,0.1242861F)).transpose());
		jawLeftUpmirror.setTextureSize( 2048 , 2048 );
		parts.put(jawLeftUpmirror.boxName,jawLeftUpmirror);
		jawBone.addChild(jawLeftUpmirror);
		
		jawMidDown = new MCAModelRenderer(this, "jawMidDown", 676 , 0);
		jawMidDown.mirror = false;
		jawMidDown.addBox (-6.0F,-5.0F,-24.0F,12,10,48);
		jawMidDown.setInitialRotationPoint (-0.0F,15.7F,29.3F);
		jawMidDown.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(1e-07F,-0.4151401F,0.9097575F,-1e-07F)).transpose());
		jawMidDown.setTextureSize( 2048 , 2048 );
		parts.put(jawMidDown.boxName,jawMidDown);
		jawBone.addChild(jawMidDown);
		
		jawMidUp = new MCAModelRenderer(this, "jawMidUp", 736 , 0);
		jawMidUp.mirror = false;
		jawMidUp.addBox (-6.0F,-5.0F,-30.0F,12,10,60);
		jawMidUp.setInitialRotationPoint (0.0F,7.6F,21.5F);
		jawMidUp.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(1e-07F,-0.1998491F,0.9798267F,-0.0F)).transpose());
		jawMidUp.setTextureSize( 2048 , 2048 );
		parts.put(jawMidUp.boxName,jawMidUp);
		jawBone.addChild(jawMidUp);
		
		jawtooth1 = new MCAModelRenderer(this, "jawtooth1", 995 , 0);
		jawtooth1.mirror = false;
		jawtooth1.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		jawtooth1.setInitialRotationPoint (-0.6F,-8.8F,45.1F);
		jawtooth1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2603396F,-0.2004423F,0.9413227F,0.0771878F)).transpose());
		jawtooth1.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth1.boxName,jawtooth1);
		jawBone.addChild(jawtooth1);
		
		jawtooth1mirror = new MCAModelRenderer(this, "jawtooth1mirror", 995 , 0);
		jawtooth1mirror.mirror = true;
		jawtooth1mirror.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		jawtooth1mirror.setInitialRotationPoint (1.6F,-8.8F,45.1F);
		jawtooth1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2634707F,0.1854014F,-0.9441773F,0.0688385F)).transpose());
		jawtooth1mirror.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth1mirror.boxName,jawtooth1mirror);
		jawBone.addChild(jawtooth1mirror);
		
		jawtooth2 = new MCAModelRenderer(this, "jawtooth2", 995 , 0);
		jawtooth2.mirror = false;
		jawtooth2.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		jawtooth2.setInitialRotationPoint (-3.3F,-8.7F,44.9F);
		jawtooth2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0705145F,-0.1473415F,0.9825862F,0.0885593F)).transpose());
		jawtooth2.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth2.boxName,jawtooth2);
		jawBone.addChild(jawtooth2);
		
		jawtooth2mirror = new MCAModelRenderer(this, "jawtooth2mirror", 995 , 0);
		jawtooth2mirror.mirror = true;
		jawtooth2mirror.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		jawtooth2mirror.setInitialRotationPoint (4.0F,-8.4F,44.8F);
		jawtooth2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0705144F,0.1473414F,-0.9825861F,0.0885596F)).transpose());
		jawtooth2mirror.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth2mirror.boxName,jawtooth2mirror);
		jawBone.addChild(jawtooth2mirror);
		
		jawtooth3 = new MCAModelRenderer(this, "jawtooth3", 995 , 0);
		jawtooth3.mirror = false;
		jawtooth3.addBox (-1.0F,-2.0F,-1.0F,2,4,2);
		jawtooth3.setInitialRotationPoint (-4.9F,-9.5F,42.9F);
		jawtooth3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0243394F,-0.2011774F,0.976061F,0.078995F)).transpose());
		jawtooth3.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth3.boxName,jawtooth3);
		jawBone.addChild(jawtooth3);
		
		jawtooth3mirror = new MCAModelRenderer(this, "jawtooth3mirror", 995 , 0);
		jawtooth3mirror.mirror = true;
		jawtooth3mirror.addBox (-1.0F,-2.0F,-1.0F,2,4,2);
		jawtooth3mirror.setInitialRotationPoint (5.2F,-8.7F,42.3F);
		jawtooth3mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0243392F,0.2011775F,-0.976061F,0.0789951F)).transpose());
		jawtooth3mirror.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth3mirror.boxName,jawtooth3mirror);
		jawBone.addChild(jawtooth3mirror);
		
		jawtooth4 = new MCAModelRenderer(this, "jawtooth4", 995 , 0);
		jawtooth4.mirror = false;
		jawtooth4.addBox (-1.0F,-2.0F,-1.0F,2,4,2);
		jawtooth4.setInitialRotationPoint (-5.8F,-7.8F,40.2F);
		jawtooth4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4871764F,-0.1526624F,0.8393199F,0.1868035F)).transpose());
		jawtooth4.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth4.boxName,jawtooth4);
		jawBone.addChild(jawtooth4);
		
		jawtooth4mirror = new MCAModelRenderer(this, "jawtooth4mirror", 995 , 0);
		jawtooth4mirror.mirror = true;
		jawtooth4mirror.addBox (-1.0F,-2.0F,-1.0F,2,4,2);
		jawtooth4mirror.setInitialRotationPoint (7.0F,-7.8F,38.8F);
		jawtooth4mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4871765F,0.1526623F,-0.8393198F,0.1868035F)).transpose());
		jawtooth4mirror.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth4mirror.boxName,jawtooth4mirror);
		jawBone.addChild(jawtooth4mirror);
		
		jawtooth5 = new MCAModelRenderer(this, "jawtooth5", 995 , 0);
		jawtooth5.mirror = false;
		jawtooth5.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		jawtooth5.setInitialRotationPoint (-7.0F,-6.9F,36.7F);
		jawtooth5.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5419984F,-0.1332377F,0.8041356F,0.2045764F)).transpose());
		jawtooth5.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth5.boxName,jawtooth5);
		jawBone.addChild(jawtooth5);
		
		jawtooth5mirror = new MCAModelRenderer(this, "jawtooth5mirror", 995 , 0);
		jawtooth5mirror.mirror = true;
		jawtooth5mirror.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		jawtooth5mirror.setInitialRotationPoint (7.6F,-6.2F,35.4F);
		jawtooth5mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5419986F,0.1332376F,-0.8041354F,0.2045765F)).transpose());
		jawtooth5mirror.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth5mirror.boxName,jawtooth5mirror);
		jawBone.addChild(jawtooth5mirror);
		
		jawtooth6 = new MCAModelRenderer(this, "jawtooth6", 995 , 0);
		jawtooth6.mirror = false;
		jawtooth6.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		jawtooth6.setInitialRotationPoint (-8.6F,-4.7F,33.4F);
		jawtooth6.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3677258F,-0.2729567F,0.8642271F,0.2082878F)).transpose());
		jawtooth6.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth6.boxName,jawtooth6);
		jawBone.addChild(jawtooth6);
		
		jawtooth6mirror = new MCAModelRenderer(this, "jawtooth6mirror", 995 , 0);
		jawtooth6mirror.mirror = true;
		jawtooth6mirror.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		jawtooth6mirror.setInitialRotationPoint (9.4F,-3.2F,31.1F);
		jawtooth6mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3986276F,0.1853291F,-0.8883649F,0.1325036F)).transpose());
		jawtooth6mirror.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth6mirror.boxName,jawtooth6mirror);
		jawBone.addChild(jawtooth6mirror);
		
		jawtooth7 = new MCAModelRenderer(this, "jawtooth7", 995 , 0);
		jawtooth7.mirror = false;
		jawtooth7.addBox (-1.0F,-3.0F,-1.0F,2,6,2);
		jawtooth7.setInitialRotationPoint (-10.9F,-4.1F,29.8F);
		jawtooth7.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4273893F,0.1154265F,-0.8950837F,0.0532952F)).transpose());
		jawtooth7.setTextureSize( 2048 , 2048 );
		parts.put(jawtooth7.boxName,jawtooth7);
		jawBone.addChild(jawtooth7);
		
		kneeLeft = new MCAModelRenderer(this, "kneeLeft", 1093 , 1036);
		kneeLeft.mirror = false;
		kneeLeft.addBox (-33.0F,-27.0F,-46.0F,66,54,92);
		kneeLeft.setInitialRotationPoint (0.2F,27.3F,130.8F);
		kneeLeft.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.000444F,0.4044748F,-0.9141941F,0.025475F)).transpose());
		kneeLeft.setTextureSize( 2048 , 2048 );
		parts.put(kneeLeft.boxName,kneeLeft);
		thighBoneLeft.addChild(kneeLeft);
		
		kneeLeftmirror = new MCAModelRenderer(this, "kneeLeftmirror", 1093 , 1036);
		kneeLeftmirror.mirror = true;
		kneeLeftmirror.addBox (-33.0F,-27.0F,-46.0F,66,54,92);
		kneeLeftmirror.setInitialRotationPoint (-0.2F,27.3F,130.8F);
		kneeLeftmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0004451F,-0.4044755F,0.9141939F,0.0254757F)).transpose());
		kneeLeftmirror.setTextureSize( 2048 , 2048 );
		parts.put(kneeLeftmirror.boxName,kneeLeftmirror);
		thighBoneRight.addChild(kneeLeftmirror);
		
		lowerArmFront = new MCAModelRenderer(this, "lowerArmFront", 0 , 1088);
		lowerArmFront.mirror = false;
		lowerArmFront.addBox (-32.0F,-14.0F,-12.0F,64,28,24);
		lowerArmFront.setInitialRotationPoint (0.2F,-3.3F,34.0F);
		lowerArmFront.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2772411F,-0.6328253F,0.276555F,0.6679723F)).transpose());
		lowerArmFront.setTextureSize( 2048 , 2048 );
		parts.put(lowerArmFront.boxName,lowerArmFront);
		lowerArmBone_L.addChild(lowerArmFront);
		
		lowerArmFrontmirror = new MCAModelRenderer(this, "lowerArmFrontmirror", 0 , 1088);
		lowerArmFrontmirror.mirror = true;
		lowerArmFrontmirror.addBox (-32.0F,-14.0F,-12.0F,64,28,24);
		lowerArmFrontmirror.setInitialRotationPoint (-0.1F,-2.6F,34.0F);
		lowerArmFrontmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2738128F,0.6322283F,-0.2800591F,0.6684915F)).transpose());
		lowerArmFrontmirror.setTextureSize( 2048 , 2048 );
		parts.put(lowerArmFrontmirror.boxName,lowerArmFrontmirror);
		lowerArmBone_R.addChild(lowerArmFrontmirror);
		
		lowerArmRear = new MCAModelRenderer(this, "lowerArmRear", 177 , 1080);
		lowerArmRear.mirror = false;
		lowerArmRear.addBox (-36.0F,-9.0F,-11.0F,72,18,22);
		lowerArmRear.setInitialRotationPoint (9.7F,-0.7F,33.0F);
		lowerArmRear.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1412822F,-0.7133282F,-0.094425F,0.6799163F)).transpose());
		lowerArmRear.setTextureSize( 2048 , 2048 );
		parts.put(lowerArmRear.boxName,lowerArmRear);
		lowerArmBone_L.addChild(lowerArmRear);
		
		lowerArmRearmirror = new MCAModelRenderer(this, "lowerArmRearmirror", 177 , 1080);
		lowerArmRearmirror.mirror = true;
		lowerArmRearmirror.addBox (-36.0F,-9.0F,-11.0F,72,18,22);
		lowerArmRearmirror.setInitialRotationPoint (-9.5F,0.1F,32.9F);
		lowerArmRearmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1443048F,0.7146122F,0.0910253F,0.6783952F)).transpose());
		lowerArmRearmirror.setTextureSize( 2048 , 2048 );
		parts.put(lowerArmRearmirror.boxName,lowerArmRearmirror);
		lowerArmBone_R.addChild(lowerArmRearmirror);
		
		lowerBodyScaleLeftMid = new MCAModelRenderer(this, "lowerBodyScaleLeftMid", 498 , 180);
		lowerBodyScaleLeftMid.mirror = false;
		lowerBodyScaleLeftMid.addBox (-7.0F,-39.0F,-56.0F,14,78,112);
		lowerBodyScaleLeftMid.setInitialRotationPoint (-65.0F,-26.6F,45.7F);
		lowerBodyScaleLeftMid.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3343458F,-0.9342113F,-0.1151024F,0.0470506F)).transpose());
		lowerBodyScaleLeftMid.setTextureSize( 2048 , 2048 );
		parts.put(lowerBodyScaleLeftMid.boxName,lowerBodyScaleLeftMid);
		lowerBodyBone.addChild(lowerBodyScaleLeftMid);
		
		lowerBodyScaleLeftMidmirror = new MCAModelRenderer(this, "lowerBodyScaleLeftMidmirror", 498 , 180);
		lowerBodyScaleLeftMidmirror.mirror = true;
		lowerBodyScaleLeftMidmirror.addBox (-7.0F,-39.0F,-56.0F,14,78,112);
		lowerBodyScaleLeftMidmirror.setInitialRotationPoint (65.0F,-26.6F,45.7F);
		lowerBodyScaleLeftMidmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3343432F,0.9342121F,0.1151029F,0.0470509F)).transpose());
		lowerBodyScaleLeftMidmirror.setTextureSize( 2048 , 2048 );
		parts.put(lowerBodyScaleLeftMidmirror.boxName,lowerBodyScaleLeftMidmirror);
		lowerBodyBone.addChild(lowerBodyScaleLeftMidmirror);
		
		lowerBodyScaleLeftUp1 = new MCAModelRenderer(this, "lowerBodyScaleLeftUp1", 800 , 588);
		lowerBodyScaleLeftUp1.mirror = false;
		lowerBodyScaleLeftUp1.addBox (-20.0F,-13.0F,-34.0F,40,26,68);
		lowerBodyScaleLeftUp1.setInitialRotationPoint (-20.8F,-70.7F,79.1F);
		lowerBodyScaleLeftUp1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2011277F,-0.9774708F,-0.0029862F,0.0639496F)).transpose());
		lowerBodyScaleLeftUp1.setTextureSize( 2048 , 2048 );
		parts.put(lowerBodyScaleLeftUp1.boxName,lowerBodyScaleLeftUp1);
		lowerBodyBone.addChild(lowerBodyScaleLeftUp1);
		
		lowerBodyScaleLeftUp1mirror = new MCAModelRenderer(this, "lowerBodyScaleLeftUp1mirror", 800 , 588);
		lowerBodyScaleLeftUp1mirror.mirror = true;
		lowerBodyScaleLeftUp1mirror.addBox (-20.0F,-13.0F,-34.0F,40,26,68);
		lowerBodyScaleLeftUp1mirror.setInitialRotationPoint (20.8F,-70.7F,79.1F);
		lowerBodyScaleLeftUp1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2011276F,0.9774708F,0.0029859F,0.06395F)).transpose());
		lowerBodyScaleLeftUp1mirror.setTextureSize( 2048 , 2048 );
		parts.put(lowerBodyScaleLeftUp1mirror.boxName,lowerBodyScaleLeftUp1mirror);
		lowerBodyBone.addChild(lowerBodyScaleLeftUp1mirror);
		
		lowerBodyScaleLeftUp2 = new MCAModelRenderer(this, "lowerBodyScaleLeftUp2", 764 , 682);
		lowerBodyScaleLeftUp2.mirror = false;
		lowerBodyScaleLeftUp2.addBox (-29.0F,-10.0F,-36.0F,58,20,72);
		lowerBodyScaleLeftUp2.setInitialRotationPoint (-23.3F,-63.6F,11.6F);
		lowerBodyScaleLeftUp2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2494127F,-0.9634624F,-0.0071288F,0.0973788F)).transpose());
		lowerBodyScaleLeftUp2.setTextureSize( 2048 , 2048 );
		parts.put(lowerBodyScaleLeftUp2.boxName,lowerBodyScaleLeftUp2);
		lowerBodyBone.addChild(lowerBodyScaleLeftUp2);
		
		lowerBodyScaleLeftUp2mirror = new MCAModelRenderer(this, "lowerBodyScaleLeftUp2mirror", 764 , 682);
		lowerBodyScaleLeftUp2mirror.mirror = true;
		lowerBodyScaleLeftUp2mirror.addBox (-29.0F,-10.0F,-36.0F,58,20,72);
		lowerBodyScaleLeftUp2mirror.setInitialRotationPoint (23.3F,-63.6F,11.6F);
		lowerBodyScaleLeftUp2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2494126F,0.9634624F,0.0071287F,0.0973787F)).transpose());
		lowerBodyScaleLeftUp2mirror.setTextureSize( 2048 , 2048 );
		parts.put(lowerBodyScaleLeftUp2mirror.boxName,lowerBodyScaleLeftUp2mirror);
		lowerBodyBone.addChild(lowerBodyScaleLeftUp2mirror);
		
		lowerBodySpine1 = new MCAModelRenderer(this, "lowerBodySpine1", 1924 , 422);
		lowerBodySpine1.mirror = false;
		lowerBodySpine1.addBox (-1.0F,-30.0F,-30.0F,2,60,60);
		lowerBodySpine1.setInitialRotationPoint (0.0F,-94.6F,49.7F);
		lowerBodySpine1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(4e-07F,0.4698922F,0.8827239F,6e-07F)).transpose());
		lowerBodySpine1.setTextureSize( 2048 , 2048 );
		parts.put(lowerBodySpine1.boxName,lowerBodySpine1);
		lowerBodyBone.addChild(lowerBodySpine1);
		
		lowerBodySpine2 = new MCAModelRenderer(this, "lowerBodySpine2", 1924 , 422);
		lowerBodySpine2.mirror = false;
		lowerBodySpine2.addBox (-1.0F,-30.0F,-30.0F,2,60,60);
		lowerBodySpine2.setInitialRotationPoint (0.0F,-83.5F,11.6F);
		lowerBodySpine2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(4e-07F,0.4698922F,0.8827239F,6e-07F)).transpose());
		lowerBodySpine2.setTextureSize( 2048 , 2048 );
		parts.put(lowerBodySpine2.boxName,lowerBodySpine2);
		lowerBodyBone.addChild(lowerBodySpine2);
		
		lowerLeggLeftFront = new MCAModelRenderer(this, "lowerLeggLeftFront", 1455 , 764);
		lowerLeggLeftFront.mirror = false;
		lowerLeggLeftFront.addBox (-24.0F,-70.0F,-33.0F,48,140,66);
		lowerLeggLeftFront.setInitialRotationPoint (-1.4F,-0.0F,84.1F);
		lowerLeggLeftFront.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0003684F,0.8147979F,-0.5797372F,-0.0030114F)).transpose());
		lowerLeggLeftFront.setTextureSize( 2048 , 2048 );
		parts.put(lowerLeggLeftFront.boxName,lowerLeggLeftFront);
		lowerLegBoneLeft.addChild(lowerLeggLeftFront);
		
		lowerLeggLeftFrontmirror = new MCAModelRenderer(this, "lowerLeggLeftFrontmirror", 1455 , 764);
		lowerLeggLeftFrontmirror.mirror = true;
		lowerLeggLeftFrontmirror.addBox (-24.0F,-70.0F,-33.0F,48,140,66);
		lowerLeggLeftFrontmirror.setInitialRotationPoint (1.4F,-0.0F,84.1F);
		lowerLeggLeftFrontmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0003698F,0.8147979F,-0.5797371F,0.0030117F)).transpose());
		lowerLeggLeftFrontmirror.setTextureSize( 2048 , 2048 );
		parts.put(lowerLeggLeftFrontmirror.boxName,lowerLeggLeftFrontmirror);
		lowerLegBoneRight.addChild(lowerLeggLeftFrontmirror);
		
		lowerLeggLeftRear = new MCAModelRenderer(this, "lowerLeggLeftRear", 1459 , 581);
		lowerLeggLeftRear.mirror = false;
		lowerLeggLeftRear.addBox (-35.0F,-70.0F,-20.0F,70,140,40);
		lowerLeggLeftRear.setInitialRotationPoint (-1.4F,-0.0F,84.1F);
		lowerLeggLeftRear.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0003684F,0.8147979F,-0.5797372F,-0.0030113F)).transpose());
		lowerLeggLeftRear.setTextureSize( 2048 , 2048 );
		parts.put(lowerLeggLeftRear.boxName,lowerLeggLeftRear);
		lowerLegBoneLeft.addChild(lowerLeggLeftRear);
		
		lowerLeggLeftRearmirror = new MCAModelRenderer(this, "lowerLeggLeftRearmirror", 1459 , 581);
		lowerLeggLeftRearmirror.mirror = true;
		lowerLeggLeftRearmirror.addBox (-35.0F,-70.0F,-20.0F,70,140,40);
		lowerLeggLeftRearmirror.setInitialRotationPoint (1.4F,-0.0F,84.1F);
		lowerLeggLeftRearmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0003698F,0.8147979F,-0.5797371F,0.0030117F)).transpose());
		lowerLeggLeftRearmirror.setTextureSize( 2048 , 2048 );
		parts.put(lowerLeggLeftRearmirror.boxName,lowerLeggLeftRearmirror);
		lowerLegBoneRight.addChild(lowerLeggLeftRearmirror);
		
		middleBodyScaleLeftMid1 = new MCAModelRenderer(this, "middleBodyScaleLeftMid1", 550 , 4);
		middleBodyScaleLeftMid1.mirror = false;
		middleBodyScaleLeftMid1.addBox (-7.0F,-39.0F,-49.0F,14,78,98);
		middleBodyScaleLeftMid1.setInitialRotationPoint (-53.6F,-22.4F,79.0F);
		middleBodyScaleLeftMid1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3127786F,-0.9420083F,0.0844591F,0.0875019F)).transpose());
		middleBodyScaleLeftMid1.setTextureSize( 2048 , 2048 );
		parts.put(middleBodyScaleLeftMid1.boxName,middleBodyScaleLeftMid1);
		middleBodyBone.addChild(middleBodyScaleLeftMid1);
		
		middleBodyScaleLeftMid1mirror = new MCAModelRenderer(this, "middleBodyScaleLeftMid1mirror", 550 , 4);
		middleBodyScaleLeftMid1mirror.mirror = true;
		middleBodyScaleLeftMid1mirror.addBox (-7.0F,-39.0F,-49.0F,14,78,98);
		middleBodyScaleLeftMid1mirror.setInitialRotationPoint (53.6F,-22.4F,79.0F);
		middleBodyScaleLeftMid1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3127776F,0.9420087F,-0.0844594F,0.0875019F)).transpose());
		middleBodyScaleLeftMid1mirror.setTextureSize( 2048 , 2048 );
		parts.put(middleBodyScaleLeftMid1mirror.boxName,middleBodyScaleLeftMid1mirror);
		middleBodyBone.addChild(middleBodyScaleLeftMid1mirror);
		
		middleBodyScaleLeftMid2 = new MCAModelRenderer(this, "middleBodyScaleLeftMid2", 524 , 414);
		middleBodyScaleLeftMid2.mirror = false;
		middleBodyScaleLeftMid2.addBox (-7.0F,-37.0F,-59.0F,14,74,118);
		middleBodyScaleLeftMid2.setInitialRotationPoint (-52.6F,-31.0F,26.7F);
		middleBodyScaleLeftMid2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3475623F,-0.9265282F,0.0212072F,0.1424649F)).transpose());
		middleBodyScaleLeftMid2.setTextureSize( 2048 , 2048 );
		parts.put(middleBodyScaleLeftMid2.boxName,middleBodyScaleLeftMid2);
		middleBodyBone.addChild(middleBodyScaleLeftMid2);
		
		middleBodyScaleLeftMid2mirror = new MCAModelRenderer(this, "middleBodyScaleLeftMid2mirror", 524 , 414);
		middleBodyScaleLeftMid2mirror.mirror = true;
		middleBodyScaleLeftMid2mirror.addBox (-7.0F,-37.0F,-59.0F,14,74,118);
		middleBodyScaleLeftMid2mirror.setInitialRotationPoint (52.6F,-31.0F,26.7F);
		middleBodyScaleLeftMid2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3475614F,0.9265285F,-0.0212074F,0.1424654F)).transpose());
		middleBodyScaleLeftMid2mirror.setTextureSize( 2048 , 2048 );
		parts.put(middleBodyScaleLeftMid2mirror.boxName,middleBodyScaleLeftMid2mirror);
		middleBodyBone.addChild(middleBodyScaleLeftMid2mirror);
		
		middleBodyScaleLeftUp1 = new MCAModelRenderer(this, "middleBodyScaleLeftUp1", 788 , 486);
		middleBodyScaleLeftUp1.mirror = false;
		middleBodyScaleLeftUp1.addBox (-20.0F,-12.0F,-39.0F,40,24,78);
		middleBodyScaleLeftUp1.setInitialRotationPoint (-15.9F,-60.2F,73.0F);
		middleBodyScaleLeftUp1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0436845F,0.1411488F,0.9820711F,0.1170685F)).transpose());
		middleBodyScaleLeftUp1.setTextureSize( 2048 , 2048 );
		parts.put(middleBodyScaleLeftUp1.boxName,middleBodyScaleLeftUp1);
		middleBodyBone.addChild(middleBodyScaleLeftUp1);
		
		middleBodyScaleLeftUp1mirror = new MCAModelRenderer(this, "middleBodyScaleLeftUp1mirror", 788 , 486);
		middleBodyScaleLeftUp1mirror.mirror = true;
		middleBodyScaleLeftUp1mirror.addBox (-20.0F,-12.0F,-39.0F,40,24,78);
		middleBodyScaleLeftUp1mirror.setInitialRotationPoint (15.9F,-60.2F,73.0F);
		middleBodyScaleLeftUp1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0436847F,-0.1411488F,-0.9820711F,0.1170684F)).transpose());
		middleBodyScaleLeftUp1mirror.setTextureSize( 2048 , 2048 );
		parts.put(middleBodyScaleLeftUp1mirror.boxName,middleBodyScaleLeftUp1mirror);
		middleBodyBone.addChild(middleBodyScaleLeftUp1mirror);
		
		middleBodyScaleLeftUp2 = new MCAModelRenderer(this, "middleBodyScaleLeftUp2", 792 , 588);
		middleBodyScaleLeftUp2.mirror = false;
		middleBodyScaleLeftUp2.addBox (-24.0F,-13.0F,-34.0F,48,26,68);
		middleBodyScaleLeftUp2.setInitialRotationPoint (-13.4F,-69.5F,24.3F);
		middleBodyScaleLeftUp2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0948446F,0.1555708F,0.9748421F,0.128394F)).transpose());
		middleBodyScaleLeftUp2.setTextureSize( 2048 , 2048 );
		parts.put(middleBodyScaleLeftUp2.boxName,middleBodyScaleLeftUp2);
		middleBodyBone.addChild(middleBodyScaleLeftUp2);
		
		middleBodyScaleLeftUp2mirror = new MCAModelRenderer(this, "middleBodyScaleLeftUp2mirror", 792 , 588);
		middleBodyScaleLeftUp2mirror.mirror = true;
		middleBodyScaleLeftUp2mirror.addBox (-24.0F,-13.0F,-34.0F,48,26,68);
		middleBodyScaleLeftUp2mirror.setInitialRotationPoint (13.4F,-69.5F,24.3F);
		middleBodyScaleLeftUp2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0948446F,-0.1555712F,-0.9748421F,0.1283942F)).transpose());
		middleBodyScaleLeftUp2mirror.setTextureSize( 2048 , 2048 );
		parts.put(middleBodyScaleLeftUp2mirror.boxName,middleBodyScaleLeftUp2mirror);
		middleBodyBone.addChild(middleBodyScaleLeftUp2mirror);
		
		middleBodySpine1 = new MCAModelRenderer(this, "middleBodySpine1", 1900 , 278);
		middleBodySpine1.mirror = false;
		middleBodySpine1.addBox (-1.0F,-36.0F,-36.0F,2,72,72);
		middleBodySpine1.setInitialRotationPoint (-0.0F,-87.9F,101.8F);
		middleBodySpine1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(4e-07F,0.5209208F,0.8536052F,8e-07F)).transpose());
		middleBodySpine1.setTextureSize( 2048 , 2048 );
		parts.put(middleBodySpine1.boxName,middleBodySpine1);
		middleBodyBone.addChild(middleBodySpine1);
		
		middleBodySpine2 = new MCAModelRenderer(this, "middleBodySpine2", 1900 , 278);
		middleBodySpine2.mirror = false;
		middleBodySpine2.addBox (-1.0F,-36.0F,-36.0F,2,72,72);
		middleBodySpine2.setInitialRotationPoint (-0.0F,-108.3F,43.8F);
		middleBodySpine2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(4e-07F,0.4755327F,0.8796982F,7e-07F)).transpose());
		middleBodySpine2.setTextureSize( 2048 , 2048 );
		parts.put(middleBodySpine2.boxName,middleBodySpine2);
		middleBodyBone.addChild(middleBodySpine2);
		
		middleBodySpine3 = new MCAModelRenderer(this, "middleBodySpine3", 1924 , 422);
		middleBodySpine3.mirror = false;
		middleBodySpine3.addBox (-1.0F,-30.0F,-30.0F,2,60,60);
		middleBodySpine3.setInitialRotationPoint (-0.0F,-99.9F,-28.1F);
		middleBodySpine3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(5e-07F,0.3480245F,0.9374855F,7e-07F)).transpose());
		middleBodySpine3.setTextureSize( 2048 , 2048 );
		parts.put(middleBodySpine3.boxName,middleBodySpine3);
		middleBodyBone.addChild(middleBodySpine3);
		
		middleBodySpineLeft1 = new MCAModelRenderer(this, "middleBodySpineLeft1", 1900 , 278);
		middleBodySpineLeft1.mirror = false;
		middleBodySpineLeft1.addBox (-1.0F,-36.0F,-36.0F,2,72,72);
		middleBodySpineLeft1.setInitialRotationPoint (-31.3F,-49.5F,94.5F);
		middleBodySpineLeft1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1241027F,0.5176976F,0.8147858F,0.2295906F)).transpose());
		middleBodySpineLeft1.setTextureSize( 2048 , 2048 );
		parts.put(middleBodySpineLeft1.boxName,middleBodySpineLeft1);
		middleBodyBone.addChild(middleBodySpineLeft1);
		
		middleBodySpineLeft1mirror = new MCAModelRenderer(this, "middleBodySpineLeft1mirror", 1900 , 278);
		middleBodySpineLeft1mirror.mirror = true;
		middleBodySpineLeft1mirror.addBox (-1.0F,-36.0F,-36.0F,2,72,72);
		middleBodySpineLeft1mirror.setInitialRotationPoint (31.3F,-49.5F,94.5F);
		middleBodySpineLeft1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1241032F,-0.5177022F,-0.8147834F,0.2295884F)).transpose());
		middleBodySpineLeft1mirror.setTextureSize( 2048 , 2048 );
		parts.put(middleBodySpineLeft1mirror.boxName,middleBodySpineLeft1mirror);
		middleBodyBone.addChild(middleBodySpineLeft1mirror);
		
		middleBodySpineLeft2 = new MCAModelRenderer(this, "middleBodySpineLeft2", 1924 , 422);
		middleBodySpineLeft2.mirror = false;
		middleBodySpineLeft2.addBox (-1.0F,-30.0F,-30.0F,2,60,60);
		middleBodySpineLeft2.setInitialRotationPoint (-41.0F,-69.0F,48.2F);
		middleBodySpineLeft2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0810611F,0.4311552F,0.8779268F,0.1917783F)).transpose());
		middleBodySpineLeft2.setTextureSize( 2048 , 2048 );
		parts.put(middleBodySpineLeft2.boxName,middleBodySpineLeft2);
		middleBodyBone.addChild(middleBodySpineLeft2);
		
		middleBodySpineLeft2mirror = new MCAModelRenderer(this, "middleBodySpineLeft2mirror", 1924 , 422);
		middleBodySpineLeft2mirror.mirror = true;
		middleBodySpineLeft2mirror.addBox (-1.0F,-30.0F,-30.0F,2,60,60);
		middleBodySpineLeft2mirror.setInitialRotationPoint (41.0F,-69.0F,48.2F);
		middleBodySpineLeft2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0810615F,-0.4311607F,-0.8779244F,0.1917768F)).transpose());
		middleBodySpineLeft2mirror.setTextureSize( 2048 , 2048 );
		parts.put(middleBodySpineLeft2mirror.boxName,middleBodySpineLeft2mirror);
		middleBodyBone.addChild(middleBodySpineLeft2mirror);
		
		nazFrontMid = new MCAModelRenderer(this, "nazFrontMid", 995 , 0);
		nazFrontMid.mirror = false;
		nazFrontMid.addBox (-3.0F,-7.0F,-4.0F,6,14,8);
		nazFrontMid.setInitialRotationPoint (-0.0F,1.5F,44.5F);
		nazFrontMid.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.004602F,-0.7070917F,0.0046019F,0.7070919F)).transpose());
		nazFrontMid.setTextureSize( 2048 , 2048 );
		parts.put(nazFrontMid.boxName,nazFrontMid);
		headBone.addChild(nazFrontMid);
		
		nazLeftDown = new MCAModelRenderer(this, "nazLeftDown", 820 , 4);
		nazLeftDown.mirror = false;
		nazLeftDown.addBox (-3.0F,-7.0F,-16.0F,6,14,32);
		nazLeftDown.setInitialRotationPoint (-9.2F,0.6F,26.3F);
		nazLeftDown.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1205718F,-0.0289131F,-0.9891682F,0.078568F)).transpose());
		nazLeftDown.setTextureSize( 2048 , 2048 );
		parts.put(nazLeftDown.boxName,nazLeftDown);
		headBone.addChild(nazLeftDown);
		
		nazLeftDownmirror = new MCAModelRenderer(this, "nazLeftDownmirror", 820 , 4);
		nazLeftDownmirror.mirror = true;
		nazLeftDownmirror.addBox (-3.0F,-7.0F,-16.0F,6,14,32);
		nazLeftDownmirror.setInitialRotationPoint (9.2F,0.6F,26.3F);
		nazLeftDownmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1205722F,0.0289103F,0.9891683F,0.0785669F)).transpose());
		nazLeftDownmirror.setTextureSize( 2048 , 2048 );
		parts.put(nazLeftDownmirror.boxName,nazLeftDownmirror);
		headBone.addChild(nazLeftDownmirror);
		
		nazLeftFront = new MCAModelRenderer(this, "nazLeftFront", 971 , 0);
		nazLeftFront.mirror = false;
		nazLeftFront.addBox (-3.0F,-7.0F,-3.0F,6,14,6);
		nazLeftFront.setInitialRotationPoint (-4.6F,1.6F,42.3F);
		nazLeftFront.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5306986F,-0.0253819F,-0.8468866F,0.0223116F)).transpose());
		nazLeftFront.setTextureSize( 2048 , 2048 );
		parts.put(nazLeftFront.boxName,nazLeftFront);
		headBone.addChild(nazLeftFront);
		
		nazLeftFrontmirror = new MCAModelRenderer(this, "nazLeftFrontmirror", 971 , 0);
		nazLeftFrontmirror.mirror = true;
		nazLeftFrontmirror.addBox (-3.0F,-7.0F,-3.0F,6,14,6);
		nazLeftFrontmirror.setInitialRotationPoint (4.6F,1.6F,42.3F);
		nazLeftFrontmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.530699F,0.0253812F,0.8468865F,0.0223102F)).transpose());
		nazLeftFrontmirror.setTextureSize( 2048 , 2048 );
		parts.put(nazLeftFrontmirror.boxName,nazLeftFrontmirror);
		headBone.addChild(nazLeftFrontmirror);
		
		nazLeftUp = new MCAModelRenderer(this, "nazLeftUp", 864 , 0);
		nazLeftUp.mirror = false;
		nazLeftUp.addBox (-4.0F,-2.0F,-16.0F,8,4,32);
		nazLeftUp.setInitialRotationPoint (-6.2F,-6.6F,26.4F);
		nazLeftUp.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1063604F,-0.0595847F,-0.9200554F,0.3723376F)).transpose());
		nazLeftUp.setTextureSize( 2048 , 2048 );
		parts.put(nazLeftUp.boxName,nazLeftUp);
		headBone.addChild(nazLeftUp);
		
		nazLeftUpmirror = new MCAModelRenderer(this, "nazLeftUpmirror", 864 , 0);
		nazLeftUpmirror.mirror = true;
		nazLeftUpmirror.addBox (-4.0F,-2.0F,-16.0F,8,4,32);
		nazLeftUpmirror.setInitialRotationPoint (6.2F,-6.6F,26.4F);
		nazLeftUpmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1063603F,0.0595838F,0.9200555F,0.3723376F)).transpose());
		nazLeftUpmirror.setTextureSize( 2048 , 2048 );
		parts.put(nazLeftUpmirror.boxName,nazLeftUpmirror);
		headBone.addChild(nazLeftUpmirror);
		
		nazUpMid = new MCAModelRenderer(this, "nazUpMid", 888 , 0);
		nazUpMid.mirror = false;
		nazUpMid.addBox (-6.0F,-5.0F,-28.0F,12,10,56);
		nazUpMid.setInitialRotationPoint (-0.0F,-10.8F,17.5F);
		nazUpMid.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(1e-07F,0.1537261F,0.9881135F,1e-07F)).transpose());
		nazUpMid.setTextureSize( 2048 , 2048 );
		parts.put(nazUpMid.boxName,nazUpMid);
		headBone.addChild(nazUpMid);
		
		neck1ScaleLeftDown = new MCAModelRenderer(this, "neck1ScaleLeftDown", 641 , 214);
		neck1ScaleLeftDown.mirror = false;
		neck1ScaleLeftDown.addBox (-8.0F,-19.0F,-19.0F,16,38,38);
		neck1ScaleLeftDown.setInitialRotationPoint (-15.3F,14.5F,3.9F);
		neck1ScaleLeftDown.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2402966F,-0.966403F,0.0352476F,0.0841457F)).transpose());
		neck1ScaleLeftDown.setTextureSize( 2048 , 2048 );
		parts.put(neck1ScaleLeftDown.boxName,neck1ScaleLeftDown);
		neckBone0.addChild(neck1ScaleLeftDown);
		
		neck1ScaleLeftDownmirror = new MCAModelRenderer(this, "neck1ScaleLeftDownmirror", 641 , 214);
		neck1ScaleLeftDownmirror.mirror = true;
		neck1ScaleLeftDownmirror.addBox (-8.0F,-19.0F,-19.0F,16,38,38);
		neck1ScaleLeftDownmirror.setInitialRotationPoint (15.3F,14.5F,3.9F);
		neck1ScaleLeftDownmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2402961F,0.9664031F,-0.0352479F,0.0841458F)).transpose());
		neck1ScaleLeftDownmirror.setTextureSize( 2048 , 2048 );
		parts.put(neck1ScaleLeftDownmirror.boxName,neck1ScaleLeftDownmirror);
		neckBone0.addChild(neck1ScaleLeftDownmirror);
		
		neck1ScaleLeftMid = new MCAModelRenderer(this, "neck1ScaleLeftMid", 746 , 188);
		neck1ScaleLeftMid.mirror = false;
		neck1ScaleLeftMid.addBox (-7.0F,-13.0F,-19.0F,14,26,38);
		neck1ScaleLeftMid.setInitialRotationPoint (-23.5F,-10.0F,-6.2F);
		neck1ScaleLeftMid.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1581766F,-0.9798216F,-0.0092739F,0.1218354F)).transpose());
		neck1ScaleLeftMid.setTextureSize( 2048 , 2048 );
		parts.put(neck1ScaleLeftMid.boxName,neck1ScaleLeftMid);
		neckBone0.addChild(neck1ScaleLeftMid);
		
		neck1ScaleLeftMidmirror = new MCAModelRenderer(this, "neck1ScaleLeftMidmirror", 746 , 188);
		neck1ScaleLeftMidmirror.mirror = true;
		neck1ScaleLeftMidmirror.addBox (-7.0F,-13.0F,-19.0F,14,26,38);
		neck1ScaleLeftMidmirror.setInitialRotationPoint (23.5F,-10.0F,-6.2F);
		neck1ScaleLeftMidmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1581765F,0.9798217F,0.009274F,0.1218356F)).transpose());
		neck1ScaleLeftMidmirror.setTextureSize( 2048 , 2048 );
		parts.put(neck1ScaleLeftMidmirror.boxName,neck1ScaleLeftMidmirror);
		neckBone0.addChild(neck1ScaleLeftMidmirror);
		
		neck1ScaleLeftUp = new MCAModelRenderer(this, "neck1ScaleLeftUp", 908 , 236);
		neck1ScaleLeftUp.mirror = false;
		neck1ScaleLeftUp.addBox (-13.0F,-8.0F,-16.0F,26,16,32);
		neck1ScaleLeftUp.setInitialRotationPoint (-9.0F,-24.7F,-8.2F);
		neck1ScaleLeftUp.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0599703F,0.1178691F,0.9788626F,0.1560082F)).transpose());
		neck1ScaleLeftUp.setTextureSize( 2048 , 2048 );
		parts.put(neck1ScaleLeftUp.boxName,neck1ScaleLeftUp);
		neckBone0.addChild(neck1ScaleLeftUp);
		
		neck1ScaleLeftUpmirror = new MCAModelRenderer(this, "neck1ScaleLeftUpmirror", 908 , 236);
		neck1ScaleLeftUpmirror.mirror = true;
		neck1ScaleLeftUpmirror.addBox (-13.0F,-8.0F,-16.0F,26,16,32);
		neck1ScaleLeftUpmirror.setInitialRotationPoint (9.0F,-24.7F,-8.2F);
		neck1ScaleLeftUpmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.05997F,-0.1178691F,-0.9788626F,0.1560079F)).transpose());
		neck1ScaleLeftUpmirror.setTextureSize( 2048 , 2048 );
		parts.put(neck1ScaleLeftUpmirror.boxName,neck1ScaleLeftUpmirror);
		neckBone0.addChild(neck1ScaleLeftUpmirror);
		
		neck2LeftBot = new MCAModelRenderer(this, "neck2LeftBot", 656 , 616);
		neck2LeftBot.mirror = false;
		neck2LeftBot.addBox (-12.0F,-19.0F,-33.0F,24,38,66);
		neck2LeftBot.setInitialRotationPoint (-10.8F,31.5F,-12.6F);
		neck2LeftBot.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2565456F,-0.9411496F,-0.187351F,0.1154184F)).transpose());
		neck2LeftBot.setTextureSize( 2048 , 2048 );
		parts.put(neck2LeftBot.boxName,neck2LeftBot);
		neckBone1.addChild(neck2LeftBot);
		
		neck2LeftBotmirror = new MCAModelRenderer(this, "neck2LeftBotmirror", 656 , 616);
		neck2LeftBotmirror.mirror = true;
		neck2LeftBotmirror.addBox (-12.0F,-19.0F,-33.0F,24,38,66);
		neck2LeftBotmirror.setInitialRotationPoint (10.8F,31.5F,-12.6F);
		neck2LeftBotmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2565454F,0.9411497F,0.1873514F,0.1154185F)).transpose());
		neck2LeftBotmirror.setTextureSize( 2048 , 2048 );
		parts.put(neck2LeftBotmirror.boxName,neck2LeftBotmirror);
		neckBone1.addChild(neck2LeftBotmirror);
		
		neck2ScaleLeftBot1 = new MCAModelRenderer(this, "neck2ScaleLeftBot1", 520 , 0);
		neck2ScaleLeftBot1.mirror = false;
		neck2ScaleLeftBot1.addBox (-13.0F,-17.0F,-19.0F,26,34,38);
		neck2ScaleLeftBot1.setInitialRotationPoint (-14.3F,15.7F,0.3F);
		neck2ScaleLeftBot1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.188542F,-0.9584187F,0.0698264F,0.2025087F)).transpose());
		neck2ScaleLeftBot1.setTextureSize( 2048 , 2048 );
		parts.put(neck2ScaleLeftBot1.boxName,neck2ScaleLeftBot1);
		neckBone1.addChild(neck2ScaleLeftBot1);
		
		neck2ScaleLeftBot1mirror = new MCAModelRenderer(this, "neck2ScaleLeftBot1mirror", 520 , 0);
		neck2ScaleLeftBot1mirror.mirror = true;
		neck2ScaleLeftBot1mirror.addBox (-13.0F,-17.0F,-19.0F,26,34,38);
		neck2ScaleLeftBot1mirror.setInitialRotationPoint (14.3F,15.7F,0.3F);
		neck2ScaleLeftBot1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.188542F,0.9584187F,-0.0698262F,0.2025091F)).transpose());
		neck2ScaleLeftBot1mirror.setTextureSize( 2048 , 2048 );
		parts.put(neck2ScaleLeftBot1mirror.boxName,neck2ScaleLeftBot1mirror);
		neckBone1.addChild(neck2ScaleLeftBot1mirror);
		
		neck2ScaleLeftBot2 = new MCAModelRenderer(this, "neck2ScaleLeftBot2", 510 , 370);
		neck2ScaleLeftBot2.mirror = false;
		neck2ScaleLeftBot2.addBox (-13.0F,-21.0F,-20.0F,26,42,40);
		neck2ScaleLeftBot2.setInitialRotationPoint (-17.8F,15.4F,-18.4F);
		neck2ScaleLeftBot2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0857874F,-0.9531778F,-0.0320379F,0.288212F)).transpose());
		neck2ScaleLeftBot2.setTextureSize( 2048 , 2048 );
		parts.put(neck2ScaleLeftBot2.boxName,neck2ScaleLeftBot2);
		neckBone1.addChild(neck2ScaleLeftBot2);
		
		neck2ScaleLeftBot2mirror = new MCAModelRenderer(this, "neck2ScaleLeftBot2mirror", 510 , 370);
		neck2ScaleLeftBot2mirror.mirror = true;
		neck2ScaleLeftBot2mirror.addBox (-13.0F,-21.0F,-20.0F,26,42,40);
		neck2ScaleLeftBot2mirror.setInitialRotationPoint (17.8F,15.4F,-18.4F);
		neck2ScaleLeftBot2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0857874F,0.9531778F,0.0320378F,0.288212F)).transpose());
		neck2ScaleLeftBot2mirror.setTextureSize( 2048 , 2048 );
		parts.put(neck2ScaleLeftBot2mirror.boxName,neck2ScaleLeftBot2mirror);
		neckBone1.addChild(neck2ScaleLeftBot2mirror);
		
		neck2ScaleLeftMid = new MCAModelRenderer(this, "neck2ScaleLeftMid", 750 , 252);
		neck2ScaleLeftMid.mirror = false;
		neck2ScaleLeftMid.addBox (-7.0F,-18.0F,-19.0F,14,36,38);
		neck2ScaleLeftMid.setInitialRotationPoint (-27.0F,-15.1F,-12.6F);
		neck2ScaleLeftMid.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1016094F,-0.9810678F,0.0620495F,0.1527458F)).transpose());
		neck2ScaleLeftMid.setTextureSize( 2048 , 2048 );
		parts.put(neck2ScaleLeftMid.boxName,neck2ScaleLeftMid);
		neckBone1.addChild(neck2ScaleLeftMid);
		
		neck2ScaleLeftMidmirror = new MCAModelRenderer(this, "neck2ScaleLeftMidmirror", 750 , 252);
		neck2ScaleLeftMidmirror.mirror = true;
		neck2ScaleLeftMidmirror.addBox (-7.0F,-18.0F,-19.0F,14,36,38);
		neck2ScaleLeftMidmirror.setInitialRotationPoint (27.0F,-15.1F,-12.6F);
		neck2ScaleLeftMidmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1016093F,0.9810679F,-0.0620496F,0.1527459F)).transpose());
		neck2ScaleLeftMidmirror.setTextureSize( 2048 , 2048 );
		parts.put(neck2ScaleLeftMidmirror.boxName,neck2ScaleLeftMidmirror);
		neckBone1.addChild(neck2ScaleLeftMidmirror);
		
		neck2ScaleLeftUp = new MCAModelRenderer(this, "neck2ScaleLeftUp", 876 , 284);
		neck2ScaleLeftUp.mirror = false;
		neck2ScaleLeftUp.addBox (-15.0F,-8.0F,-22.0F,30,16,44);
		neck2ScaleLeftUp.setInitialRotationPoint (-13.1F,-32.7F,-8.7F);
		neck2ScaleLeftUp.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0713902F,0.1102992F,0.9790951F,0.1552753F)).transpose());
		neck2ScaleLeftUp.setTextureSize( 2048 , 2048 );
		parts.put(neck2ScaleLeftUp.boxName,neck2ScaleLeftUp);
		neckBone1.addChild(neck2ScaleLeftUp);
		
		neck2ScaleLeftUpmirror = new MCAModelRenderer(this, "neck2ScaleLeftUpmirror", 876 , 284);
		neck2ScaleLeftUpmirror.mirror = true;
		neck2ScaleLeftUpmirror.addBox (-15.0F,-8.0F,-22.0F,30,16,44);
		neck2ScaleLeftUpmirror.setInitialRotationPoint (13.1F,-32.7F,-8.7F);
		neck2ScaleLeftUpmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0713904F,-0.1102994F,-0.979095F,0.1552756F)).transpose());
		neck2ScaleLeftUpmirror.setTextureSize( 2048 , 2048 );
		parts.put(neck2ScaleLeftUpmirror.boxName,neck2ScaleLeftUpmirror);
		neckBone1.addChild(neck2ScaleLeftUpmirror);
		
		neck2Spine1 = new MCAModelRenderer(this, "neck2Spine1", 1984 , 0);
		neck2Spine1.mirror = false;
		neck2Spine1.addBox (-1.0F,-12.0F,-15.0F,2,24,30);
		neck2Spine1.setInitialRotationPoint (-0.0F,-42.3F,3.4F);
		neck2Spine1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(1e-07F,0.5981399F,0.8013917F,4e-07F)).transpose());
		neck2Spine1.setTextureSize( 2048 , 2048 );
		parts.put(neck2Spine1.boxName,neck2Spine1);
		neckBone1.addChild(neck2Spine1);
		
		neck2Spine2 = new MCAModelRenderer(this, "neck2Spine2", 1988 , 54);
		neck2Spine2.mirror = false;
		neck2Spine2.addBox (-1.0F,-14.0F,-14.0F,2,28,28);
		neck2Spine2.setInitialRotationPoint (-0.0F,-54.9F,-24.1F);
		neck2Spine2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(2e-07F,0.526018F,0.8504735F,3e-07F)).transpose());
		neck2Spine2.setTextureSize( 2048 , 2048 );
		parts.put(neck2Spine2.boxName,neck2Spine2);
		neckBone1.addChild(neck2Spine2);
		
		neck3ScaleLeftBot = new MCAModelRenderer(this, "neck3ScaleLeftBot", 530 , 452);
		neck3ScaleLeftBot.mirror = false;
		neck3ScaleLeftBot.addBox (-13.0F,-25.0F,-15.0F,26,50,30);
		neck3ScaleLeftBot.setInitialRotationPoint (-28.7F,2.0F,-20.7F);
		neck3ScaleLeftBot.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1030032F,-0.9718746F,0.0053668F,0.2117109F)).transpose());
		neck3ScaleLeftBot.setTextureSize( 2048 , 2048 );
		parts.put(neck3ScaleLeftBot.boxName,neck3ScaleLeftBot);
		neckBone2.addChild(neck3ScaleLeftBot);
		
		neck3ScaleLeftBotmirror = new MCAModelRenderer(this, "neck3ScaleLeftBotmirror", 530 , 452);
		neck3ScaleLeftBotmirror.mirror = true;
		neck3ScaleLeftBotmirror.addBox (-13.0F,-25.0F,-15.0F,26,50,30);
		neck3ScaleLeftBotmirror.setInitialRotationPoint (28.7F,2.0F,-20.7F);
		neck3ScaleLeftBotmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1030031F,0.9718747F,-0.0053669F,0.2117107F)).transpose());
		neck3ScaleLeftBotmirror.setTextureSize( 2048 , 2048 );
		parts.put(neck3ScaleLeftBotmirror.boxName,neck3ScaleLeftBotmirror);
		neckBone2.addChild(neck3ScaleLeftBotmirror);
		
		neck3ScaleLeftMid = new MCAModelRenderer(this, "neck3ScaleLeftMid", 736 , 326);
		neck3ScaleLeftMid.mirror = false;
		neck3ScaleLeftMid.addBox (-7.0F,-20.0F,-22.0F,14,40,44);
		neck3ScaleLeftMid.setInitialRotationPoint (-36.0F,-33.0F,-15.2F);
		neck3ScaleLeftMid.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1904578F,-0.9376013F,0.1882131F,0.2218232F)).transpose());
		neck3ScaleLeftMid.setTextureSize( 2048 , 2048 );
		parts.put(neck3ScaleLeftMid.boxName,neck3ScaleLeftMid);
		neckBone2.addChild(neck3ScaleLeftMid);
		
		neck3ScaleLeftMidmirror = new MCAModelRenderer(this, "neck3ScaleLeftMidmirror", 736 , 326);
		neck3ScaleLeftMidmirror.mirror = true;
		neck3ScaleLeftMidmirror.addBox (-7.0F,-20.0F,-22.0F,14,40,44);
		neck3ScaleLeftMidmirror.setInitialRotationPoint (36.0F,-33.0F,-15.2F);
		neck3ScaleLeftMidmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1904577F,0.9376013F,-0.1882132F,0.2218233F)).transpose());
		neck3ScaleLeftMidmirror.setTextureSize( 2048 , 2048 );
		parts.put(neck3ScaleLeftMidmirror.boxName,neck3ScaleLeftMidmirror);
		neckBone2.addChild(neck3ScaleLeftMidmirror);
		
		neck3ScaleLeftTop = new MCAModelRenderer(this, "neck3ScaleLeftTop", 852 , 344);
		neck3ScaleLeftTop.mirror = false;
		neck3ScaleLeftTop.addBox (-16.0F,-8.0F,-27.0F,32,16,54);
		neck3ScaleLeftTop.setInitialRotationPoint (-14.7F,-56.0F,-12.5F);
		neck3ScaleLeftTop.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0164803F,0.3104133F,0.9440633F,0.1100749F)).transpose());
		neck3ScaleLeftTop.setTextureSize( 2048 , 2048 );
		parts.put(neck3ScaleLeftTop.boxName,neck3ScaleLeftTop);
		neckBone2.addChild(neck3ScaleLeftTop);
		
		neck3ScaleLeftTopmirror = new MCAModelRenderer(this, "neck3ScaleLeftTopmirror", 852 , 344);
		neck3ScaleLeftTopmirror.mirror = true;
		neck3ScaleLeftTopmirror.addBox (-16.0F,-8.0F,-27.0F,32,16,54);
		neck3ScaleLeftTopmirror.setInitialRotationPoint (14.7F,-56.0F,-12.5F);
		neck3ScaleLeftTopmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0164804F,-0.3104137F,-0.9440631F,0.1100748F)).transpose());
		neck3ScaleLeftTopmirror.setTextureSize( 2048 , 2048 );
		parts.put(neck3ScaleLeftTopmirror.boxName,neck3ScaleLeftTopmirror);
		neckBone2.addChild(neck3ScaleLeftTopmirror);
		
		neck3Spine = new MCAModelRenderer(this, "neck3Spine", 1972 , 110);
		neck3Spine.mirror = false;
		neck3Spine.addBox (-1.0F,-18.0F,-18.0F,2,36,36);
		neck3Spine.setInitialRotationPoint (0.0F,-74.7F,-3.4F);
		neck3Spine.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F,0.6800897F,0.733129F,5e-07F)).transpose());
		neck3Spine.setTextureSize( 2048 , 2048 );
		parts.put(neck3Spine.boxName,neck3Spine);
		neckBone2.addChild(neck3Spine);
		
		shoulderLeftFront = new MCAModelRenderer(this, "shoulderLeftFront", 880 , 774);
		shoulderLeftFront.mirror = false;
		shoulderLeftFront.addBox (-25.0F,-20.0F,-11.0F,50,40,22);
		shoulderLeftFront.setInitialRotationPoint (-5.5F,-0.3F,62.1F);
		shoulderLeftFront.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.100293F,-0.6891202F,-0.1827234F,0.6940222F)).transpose());
		shoulderLeftFront.setTextureSize( 2048 , 2048 );
		parts.put(shoulderLeftFront.boxName,shoulderLeftFront);
		upperBodyBone_L.addChild(shoulderLeftFront);
		
		shoulderLeftFrontmirror = new MCAModelRenderer(this, "shoulderLeftFrontmirror", 880 , 774);
		shoulderLeftFrontmirror.mirror = true;
		shoulderLeftFrontmirror.addBox (-25.0F,-20.0F,-11.0F,50,40,22);
		shoulderLeftFrontmirror.setInitialRotationPoint (12.9F,-3.7F,60.9F);
		shoulderLeftFrontmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0558799F,0.7276342F,0.1881187F,0.6572955F)).transpose());
		shoulderLeftFrontmirror.setTextureSize( 2048 , 2048 );
		parts.put(shoulderLeftFrontmirror.boxName,shoulderLeftFrontmirror);
		upperBodyBone_R.addChild(shoulderLeftFrontmirror);
		
		shoulderLeftRear = new MCAModelRenderer(this, "shoulderLeftRear", 796 , 780);
		shoulderLeftRear.mirror = false;
		shoulderLeftRear.addBox (-7.0F,-30.0F,-28.0F,14,60,56);
		shoulderLeftRear.setInitialRotationPoint (26.5F,16.2F,61.3F);
		shoulderLeftRear.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.5387701F,0.3668593F,0.4951979F,0.5743867F)).transpose());
		shoulderLeftRear.setTextureSize( 2048 , 2048 );
		parts.put(shoulderLeftRear.boxName,shoulderLeftRear);
		upperBodyBone_L.addChild(shoulderLeftRear);
		
		shoulderLeftRearmirror = new MCAModelRenderer(this, "shoulderLeftRearmirror", 796 , 780);
		shoulderLeftRearmirror.mirror = true;
		shoulderLeftRearmirror.addBox (-7.0F,-30.0F,-28.0F,14,60,56);
		shoulderLeftRearmirror.setInitialRotationPoint (-15.8F,17.2F,58.8F);
		shoulderLeftRearmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.5316136F,-0.4236257F,-0.5285066F,0.5085362F)).transpose());
		shoulderLeftRearmirror.setTextureSize( 2048 , 2048 );
		parts.put(shoulderLeftRearmirror.boxName,shoulderLeftRearmirror);
		upperBodyBone_R.addChild(shoulderLeftRearmirror);
		
		tail1LeftBot = new MCAModelRenderer(this, "tail1LeftBot", 1101 , 44);
		tail1LeftBot.mirror = false;
		tail1LeftBot.addBox (-40.0F,-41.0F,-85.0F,80,82,170);
		tail1LeftBot.setInitialRotationPoint (-8.3F,-24.5F,36.3F);
		tail1LeftBot.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.4377093F,-0.8968273F,0.0405452F,0.0496733F)).transpose());
		tail1LeftBot.setTextureSize( 2048 , 2048 );
		parts.put(tail1LeftBot.boxName,tail1LeftBot);
		tailBone1.addChild(tail1LeftBot);
		
		tail1LeftBotmirror = new MCAModelRenderer(this, "tail1LeftBotmirror", 1101 , 44);
		tail1LeftBotmirror.mirror = true;
		tail1LeftBotmirror.addBox (-40.0F,-41.0F,-85.0F,80,82,170);
		tail1LeftBotmirror.setInitialRotationPoint (8.1F,-24.4F,36.4F);
		tail1LeftBotmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.4354627F,0.8977504F,-0.0381485F,0.054416F)).transpose());
		tail1LeftBotmirror.setTextureSize( 2048 , 2048 );
		parts.put(tail1LeftBotmirror.boxName,tail1LeftBotmirror);
		tailBone1.addChild(tail1LeftBotmirror);
		
		tail1LeftMid = new MCAModelRenderer(this, "tail1LeftMid", 1431 , 18);
		tail1LeftMid.mirror = false;
		tail1LeftMid.addBox (-17.0F,-36.0F,-62.0F,34,72,124);
		tail1LeftMid.setInitialRotationPoint (-48.4F,13.4F,59.8F);
		tail1LeftMid.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0457306F,0.073382F,0.9756393F,0.2016228F)).transpose());
		tail1LeftMid.setTextureSize( 2048 , 2048 );
		parts.put(tail1LeftMid.boxName,tail1LeftMid);
		tailBone1.addChild(tail1LeftMid);
		
		tail1LeftMidmirror = new MCAModelRenderer(this, "tail1LeftMidmirror", 1431 , 18);
		tail1LeftMidmirror.mirror = true;
		tail1LeftMidmirror.addBox (-17.0F,-36.0F,-62.0F,34,72,124);
		tail1LeftMidmirror.setInitialRotationPoint (47.7F,13.6F,60.3F);
		tail1LeftMidmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0509698F,-0.0742979F,-0.974836F,0.2039035F)).transpose());
		tail1LeftMidmirror.setTextureSize( 2048 , 2048 );
		parts.put(tail1LeftMidmirror.boxName,tail1LeftMidmirror);
		tailBone1.addChild(tail1LeftMidmirror);
		
		tail1LeftUp = new MCAModelRenderer(this, "tail1LeftUp", 1623 , 0);
		tail1LeftUp.mirror = false;
		tail1LeftUp.addBox (-29.0F,-13.0F,-58.0F,58,26,116);
		tail1LeftUp.setInitialRotationPoint (-19.8F,57.3F,54.3F);
		tail1LeftUp.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0423092F,-0.0083591F,-0.9729952F,0.2267606F)).transpose());
		tail1LeftUp.setTextureSize( 2048 , 2048 );
		parts.put(tail1LeftUp.boxName,tail1LeftUp);
		tailBone1.addChild(tail1LeftUp);
		
		tail1LeftUpmirror = new MCAModelRenderer(this, "tail1LeftUpmirror", 1623 , 0);
		tail1LeftUpmirror.mirror = true;
		tail1LeftUpmirror.addBox (-29.0F,-13.0F,-58.0F,58,26,116);
		tail1LeftUpmirror.setInitialRotationPoint (19.0F,57.4F,54.5F);
		tail1LeftUpmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0473573F,0.0070719F,0.9733792F,0.2241437F)).transpose());
		tail1LeftUpmirror.setTextureSize( 2048 , 2048 );
		parts.put(tail1LeftUpmirror.boxName,tail1LeftUpmirror);
		tailBone1.addChild(tail1LeftUpmirror);
		
		tail2LeftBot = new MCAModelRenderer(this, "tail2LeftBot", 1072 , 348);
		tail2LeftBot.mirror = false;
		tail2LeftBot.addBox (-36.0F,-33.0F,-73.0F,72,66,146);
		tail2LeftBot.setInitialRotationPoint (-2.6F,-11.3F,35.4F);
		tail2LeftBot.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4441907F,0.8954922F,0.0272425F,0.006795F)).transpose());
		tail2LeftBot.setTextureSize( 2048 , 2048 );
		parts.put(tail2LeftBot.boxName,tail2LeftBot);
		tailBone2.addChild(tail2LeftBot);
		
		tail2LeftBotmirror = new MCAModelRenderer(this, "tail2LeftBotmirror", 1072 , 348);
		tail2LeftBotmirror.mirror = true;
		tail2LeftBotmirror.addBox (-36.0F,-33.0F,-73.0F,72,66,146);
		tail2LeftBotmirror.setInitialRotationPoint (1.6F,-11.3F,35.4F);
		tail2LeftBotmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4459421F,-0.894642F,-0.0246122F,0.0120697F)).transpose());
		tail2LeftBotmirror.setTextureSize( 2048 , 2048 );
		parts.put(tail2LeftBotmirror.boxName,tail2LeftBotmirror);
		tailBone2.addChild(tail2LeftBotmirror);
		
		tail2LeftMid = new MCAModelRenderer(this, "tail2LeftMid", 1362 , 296);
		tail2LeftMid.mirror = false;
		tail2LeftMid.addBox (-16.0F,-36.0F,-63.0F,32,72,126);
		tail2LeftMid.setInitialRotationPoint (-31.5F,12.7F,52.2F);
		tail2LeftMid.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0311055F,-0.0734999F,0.987815F,0.1336109F)).transpose());
		tail2LeftMid.setTextureSize( 2048 , 2048 );
		parts.put(tail2LeftMid.boxName,tail2LeftMid);
		tailBone2.addChild(tail2LeftMid);
		
		tail2LeftMidmirror = new MCAModelRenderer(this, "tail2LeftMidmirror", 1362 , 296);
		tail2LeftMidmirror.mirror = true;
		tail2LeftMidmirror.addBox (-16.0F,-36.0F,-63.0F,32,72,126);
		tail2LeftMidmirror.setInitialRotationPoint (30.8F,12.6F,51.9F);
		tail2LeftMidmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0253641F,0.0742366F,-0.9882192F,0.1314098F)).transpose());
		tail2LeftMidmirror.setTextureSize( 2048 , 2048 );
		parts.put(tail2LeftMidmirror.boxName,tail2LeftMidmirror);
		tailBone2.addChild(tail2LeftMidmirror);
		
		tail2LeftUp = new MCAModelRenderer(this, "tail2LeftUp", 1552 , 214);
		tail2LeftUp.mirror = false;
		tail2LeftUp.addBox (-24.0F,-13.0F,-63.0F,48,26,126);
		tail2LeftUp.setInitialRotationPoint (-15.1F,48.0F,64.8F);
		tail2LeftUp.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0074782F,0.061854F,-0.9855345F,0.1576065F)).transpose());
		tail2LeftUp.setTextureSize( 2048 , 2048 );
		parts.put(tail2LeftUp.boxName,tail2LeftUp);
		tailBone2.addChild(tail2LeftUp);
		
		tail2LeftUpmirror = new MCAModelRenderer(this, "tail2LeftUpmirror", 1552 , 214);
		tail2LeftUpmirror.mirror = true;
		tail2LeftUpmirror.addBox (-24.0F,-13.0F,-63.0F,48,26,126);
		tail2LeftUpmirror.setInitialRotationPoint (14.6F,47.9F,64.6F);
		tail2LeftUpmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0132261F,-0.0609304F,0.98519F,0.159729F)).transpose());
		tail2LeftUpmirror.setTextureSize( 2048 , 2048 );
		parts.put(tail2LeftUpmirror.boxName,tail2LeftUpmirror);
		tailBone2.addChild(tail2LeftUpmirror);
		
		tail3Left = new MCAModelRenderer(this, "tail3Left", 1666 , 427);
		tail3Left.mirror = false;
		tail3Left.addBox (-35.5F,-31.5F,-57.5F,71,63,115);
		tail3Left.setInitialRotationPoint (-6.0F,-2.4F,32.7F);
		tail3Left.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5925173F,0.8014248F,0.0803548F,0.0135945F)).transpose());
		tail3Left.setTextureSize( 2048 , 2048 );
		parts.put(tail3Left.boxName,tail3Left);
		tailBone3.addChild(tail3Left);
		
		tail3Leftmirror = new MCAModelRenderer(this, "tail3Leftmirror", 1666 , 427);
		tail3Leftmirror.mirror = true;
		tail3Leftmirror.addBox (-35.5F,-31.5F,-57.5F,71,63,115);
		tail3Leftmirror.setInitialRotationPoint (6.0F,-2.4F,32.7F);
		tail3Leftmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.592525F,-0.8014191F,-0.0803542F,0.0135931F)).transpose());
		tail3Leftmirror.setTextureSize( 2048 , 2048 );
		parts.put(tail3Leftmirror.boxName,tail3Leftmirror);
		tailBone3.addChild(tail3Leftmirror);
		
		tailEnd1 = new MCAModelRenderer(this, "tailEnd1", 1696 , 605);
		tailEnd1.mirror = false;
		tailEnd1.addBox (-25.0F,-26.0F,-63.0F,50,52,126);
		tailEnd1.setInitialRotationPoint (0.0F,-2.8F,28.8F);
		tailEnd1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3824915F,-0.9234133F,0.0293358F,0.0121501F)).transpose());
		tailEnd1.setTextureSize( 2048 , 2048 );
		parts.put(tailEnd1.boxName,tailEnd1);
		tailBone4.addChild(tailEnd1);
		
		tailEnd2 = new MCAModelRenderer(this, "tailEnd2", 1720 , 783);
		tailEnd2.mirror = false;
		tailEnd2.addBox (-21.0F,-21.0F,-61.0F,42,42,122);
		tailEnd2.setInitialRotationPoint (-0.0F,1.6F,48.7F);
		tailEnd2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3826574F,0.9238141F,0.0109692F,0.004544F)).transpose());
		tailEnd2.setTextureSize( 2048 , 2048 );
		parts.put(tailEnd2.boxName,tailEnd2);
		tailBone5.addChild(tailEnd2);
		
		tailEnd3 = new MCAModelRenderer(this, "tailEnd3", 1740 , 947);
		tailEnd3.mirror = false;
		tailEnd3.addBox (-16.0F,-16.0F,-61.0F,32,32,122);
		tailEnd3.setInitialRotationPoint (-0.0F,-1.2F,36.2F);
		tailEnd3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.382634F,0.9238295F,-0.0105483F,-0.0043693F)).transpose());
		tailEnd3.setTextureSize( 2048 , 2048 );
		parts.put(tailEnd3.boxName,tailEnd3);
		tailBone6.addChild(tailEnd3);
		
		tailEnd4 = new MCAModelRenderer(this, "tailEnd4", 1792 , 1101);
		tailEnd4.mirror = false;
		tailEnd4.addBox (-12.0F,-12.0F,-52.0F,24,24,104);
		tailEnd4.setInitialRotationPoint (-0.0F,3.3F,33.6F);
		tailEnd4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3826782F,0.9238663F,0.0049314F,0.0020428F)).transpose());
		tailEnd4.setTextureSize( 2048 , 2048 );
		parts.put(tailEnd4.boxName,tailEnd4);
		tailBone7.addChild(tailEnd4);
		
		tailEnd5 = new MCAModelRenderer(this, "tailEnd5", 1816 , 1229);
		tailEnd5.mirror = false;
		tailEnd5.addBox (-6.0F,-6.0F,-52.0F,12,12,104);
		tailEnd5.setInitialRotationPoint (-0.0F,-0.8F,48.1F);
		tailEnd5.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3824854F,0.9234171F,0.0293015F,0.0121363F)).transpose());
		tailEnd5.setTextureSize( 2048 , 2048 );
		parts.put(tailEnd5.boxName,tailEnd5);
		tailBone8.addChild(tailEnd5);
		
		thighLeftFront = new MCAModelRenderer(this, "thighLeftFront", 1096 , 593);
		thighLeftFront.mirror = false;
		thighLeftFront.addBox (-31.0F,-70.0F,-49.0F,62,140,98);
		thighLeftFront.setInitialRotationPoint (6.0F,10.5F,68.0F);
		thighLeftFront.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0020918F,0.6395246F,-0.7649643F,0.0763776F)).transpose());
		thighLeftFront.setTextureSize( 2048 , 2048 );
		parts.put(thighLeftFront.boxName,thighLeftFront);
		thighBoneLeft.addChild(thighLeftFront);
		
		thighLeftFrontmirror = new MCAModelRenderer(this, "thighLeftFrontmirror", 1096 , 593);
		thighLeftFrontmirror.mirror = true;
		thighLeftFrontmirror.addBox (-31.0F,-70.0F,-49.0F,62,140,98);
		thighLeftFrontmirror.setInitialRotationPoint (-6.0F,10.5F,68.0F);
		thighLeftFrontmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0020918F,-0.6395246F,0.7649643F,0.0763775F)).transpose());
		thighLeftFrontmirror.setTextureSize( 2048 , 2048 );
		parts.put(thighLeftFrontmirror.boxName,thighLeftFrontmirror);
		thighBoneRight.addChild(thighLeftFrontmirror);
		
		thighLeftRear = new MCAModelRenderer(this, "thighLeftRear", 1096 , 831);
		thighLeftRear.mirror = false;
		thighLeftRear.addBox (-46.0F,-60.0F,-42.0F,92,120,84);
		thighLeftRear.setInitialRotationPoint (7.1F,37.8F,65.7F);
		thighLeftRear.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0019085F,0.7223154F,-0.6883036F,0.0670445F)).transpose());
		thighLeftRear.setTextureSize( 2048 , 2048 );
		parts.put(thighLeftRear.boxName,thighLeftRear);
		thighBoneLeft.addChild(thighLeftRear);
		
		thighLeftRearmirror = new MCAModelRenderer(this, "thighLeftRearmirror", 1096 , 831);
		thighLeftRearmirror.mirror = true;
		thighLeftRearmirror.addBox (-46.0F,-60.0F,-42.0F,92,120,84);
		thighLeftRearmirror.setInitialRotationPoint (-7.1F,37.8F,65.7F);
		thighLeftRearmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0019079F,-0.7223151F,0.688304F,0.0670438F)).transpose());
		thighLeftRearmirror.setTextureSize( 2048 , 2048 );
		parts.put(thighLeftRearmirror.boxName,thighLeftRearmirror);
		thighBoneRight.addChild(thighLeftRearmirror);
		
		toeLeft1 = new MCAModelRenderer(this, "toeLeft1", 1653 , 1196);
		toeLeft1.mirror = false;
		toeLeft1.addBox (-11.0F,-10.0F,-16.0F,22,20,32);
		toeLeft1.setInitialRotationPoint (-40.3F,5.3F,4.1F);
		toeLeft1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0361048F,-0.3417369F,0.0676311F,0.9366634F)).transpose());
		toeLeft1.setTextureSize( 2048 , 2048 );
		parts.put(toeLeft1.boxName,toeLeft1);
		footBoneBotLeft.addChild(toeLeft1);
		
		toeLeft1mirror = new MCAModelRenderer(this, "toeLeft1mirror", 1653 , 1196);
		toeLeft1mirror.mirror = true;
		toeLeft1mirror.addBox (-11.0F,-10.0F,-16.0F,22,20,32);
		toeLeft1mirror.setInitialRotationPoint (40.3F,5.3F,4.1F);
		toeLeft1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0361053F,0.3417364F,-0.0676316F,0.9366636F)).transpose());
		toeLeft1mirror.setTextureSize( 2048 , 2048 );
		parts.put(toeLeft1mirror.boxName,toeLeft1mirror);
		footBoneBotRight.addChild(toeLeft1mirror);
		
		toeLeft2 = new MCAModelRenderer(this, "toeLeft2", 1555 , 1197);
		toeLeft2.mirror = false;
		toeLeft2.addBox (-11.0F,-10.0F,-26.0F,22,20,52);
		toeLeft2.setInitialRotationPoint (-11.8F,10.6F,5.6F);
		toeLeft2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0133318F,-0.1511788F,-0.0307317F,0.9879386F)).transpose());
		toeLeft2.setTextureSize( 2048 , 2048 );
		parts.put(toeLeft2.boxName,toeLeft2);
		footBoneBotLeft_001.addChild(toeLeft2);
		
		toeLeft2mirror = new MCAModelRenderer(this, "toeLeft2mirror", 1555 , 1197);
		toeLeft2mirror.mirror = true;
		toeLeft2mirror.addBox (-11.0F,-10.0F,-26.0F,22,20,52);
		toeLeft2mirror.setInitialRotationPoint (11.8F,10.6F,5.6F);
		toeLeft2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0133303F,0.1511786F,0.0307311F,0.9879388F)).transpose());
		toeLeft2mirror.setTextureSize( 2048 , 2048 );
		parts.put(toeLeft2mirror.boxName,toeLeft2mirror);
		footBoneBotRight_001.addChild(toeLeft2mirror);
		
		toeLeft3 = new MCAModelRenderer(this, "toeLeft3", 1555 , 1197);
		toeLeft3.mirror = false;
		toeLeft3.addBox (-11.0F,-10.0F,-26.0F,22,20,52);
		toeLeft3.setInitialRotationPoint (11.7F,6.6F,2.9F);
		toeLeft3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0313077F,0.1007156F,-0.0968477F,0.9896953F)).transpose());
		toeLeft3.setTextureSize( 2048 , 2048 );
		parts.put(toeLeft3.boxName,toeLeft3);
		footBoneBotLeft_001.addChild(toeLeft3);
		
		toeLeft3mirror = new MCAModelRenderer(this, "toeLeft3mirror", 1555 , 1197);
		toeLeft3mirror.mirror = true;
		toeLeft3mirror.addBox (-11.0F,-10.0F,-26.0F,22,20,52);
		toeLeft3mirror.setInitialRotationPoint (-11.7F,6.6F,2.9F);
		toeLeft3mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0313079F,-0.1007157F,0.0968461F,0.9896954F)).transpose());
		toeLeft3mirror.setTextureSize( 2048 , 2048 );
		parts.put(toeLeft3mirror.boxName,toeLeft3mirror);
		footBoneBotRight_001.addChild(toeLeft3mirror);
		
		toeLeft4 = new MCAModelRenderer(this, "toeLeft4", 1657 , 1275);
		toeLeft4.mirror = false;
		toeLeft4.addBox (-6.0F,-6.0F,-11.0F,12,12,22);
		toeLeft4.setInitialRotationPoint (32.7F,-7.4F,-3.3F);
		toeLeft4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0313077F,0.100715F,-0.096848F,0.9896953F)).transpose());
		toeLeft4.setTextureSize( 2048 , 2048 );
		parts.put(toeLeft4.boxName,toeLeft4);
		footBoneBotLeft_001.addChild(toeLeft4);
		
		toeLeft4mirror = new MCAModelRenderer(this, "toeLeft4mirror", 1657 , 1275);
		toeLeft4mirror.mirror = true;
		toeLeft4mirror.addBox (-6.0F,-6.0F,-11.0F,12,12,22);
		toeLeft4mirror.setInitialRotationPoint (-32.7F,-7.4F,-3.3F);
		toeLeft4mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0313079F,-0.1007155F,0.096846F,0.9896955F)).transpose());
		toeLeft4mirror.setTextureSize( 2048 , 2048 );
		parts.put(toeLeft4mirror.boxName,toeLeft4mirror);
		footBoneBotRight_001.addChild(toeLeft4mirror);
		
		upperArmFront = new MCAModelRenderer(this, "upperArmFront", 0 , 1024);
		upperArmFront.mirror = false;
		upperArmFront.addBox (-28.0F,-16.0F,-16.0F,56,32,32);
		upperArmFront.setInitialRotationPoint (4.9F,-4.8F,10.7F);
		upperArmFront.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2388699F,-0.7308441F,0.3000595F,0.5645993F)).transpose());
		upperArmFront.setTextureSize( 2048 , 2048 );
		parts.put(upperArmFront.boxName,upperArmFront);
		upArmBone_L.addChild(upperArmFront);
		
		upperArmFrontmirror = new MCAModelRenderer(this, "upperArmFrontmirror", 0 , 1024);
		upperArmFrontmirror.mirror = true;
		upperArmFrontmirror.addBox (-28.0F,-16.0F,-16.0F,56,32,32);
		upperArmFrontmirror.setInitialRotationPoint (-4.9F,-4.6F,10.6F);
		upperArmFrontmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2353183F,0.7300269F,-0.3033369F,0.5653961F)).transpose());
		upperArmFrontmirror.setTextureSize( 2048 , 2048 );
		parts.put(upperArmFrontmirror.boxName,upperArmFrontmirror);
		upArmBone_R.addChild(upperArmFrontmirror);
		
		upperArmRear = new MCAModelRenderer(this, "upperArmRear", 176 , 1026);
		upperArmRear.mirror = false;
		upperArmRear.addBox (-29.0F,-12.0F,-15.0F,58,24,30);
		upperArmRear.setInitialRotationPoint (17.7F,-2.0F,20.2F);
		upperArmRear.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1218154F,-0.8164069F,-0.1620202F,0.5407313F)).transpose());
		upperArmRear.setTextureSize( 2048 , 2048 );
		parts.put(upperArmRear.boxName,upperArmRear);
		upArmBone_L.addChild(upperArmRear);
		
		upperArmRearmirror = new MCAModelRenderer(this, "upperArmRearmirror", 176 , 1026);
		upperArmRearmirror.mirror = true;
		upperArmRearmirror.addBox (-29.0F,-12.0F,-15.0F,58,24,30);
		upperArmRearmirror.setInitialRotationPoint (-17.7F,-1.7F,20.2F);
		upperArmRearmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1249428F,0.8175194F,0.1585948F,0.5393505F)).transpose());
		upperArmRearmirror.setTextureSize( 2048 , 2048 );
		parts.put(upperArmRearmirror.boxName,upperArmRearmirror);
		upArmBone_R.addChild(upperArmRearmirror);
		
		upperBodyScaleMid = new MCAModelRenderer(this, "upperBodyScaleMid", 710 , 422);
		upperBodyScaleMid.mirror = false;
		upperBodyScaleMid.addBox (-7.0F,-23.0F,-32.0F,14,46,64);
		upperBodyScaleMid.setInitialRotationPoint (-42.3F,-35.4F,49.0F);
		upperBodyScaleMid.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.333176F,-0.9382474F,0.0663592F,0.0654387F)).transpose());
		upperBodyScaleMid.setTextureSize( 2048 , 2048 );
		parts.put(upperBodyScaleMid.boxName,upperBodyScaleMid);
		upperBodyBone.addChild(upperBodyScaleMid);
		
		upperBodyScaleMidmirror = new MCAModelRenderer(this, "upperBodyScaleMidmirror", 710 , 422);
		upperBodyScaleMidmirror.mirror = true;
		upperBodyScaleMidmirror.addBox (-7.0F,-23.0F,-32.0F,14,46,64);
		upperBodyScaleMidmirror.setInitialRotationPoint (42.3F,-35.4F,49.0F);
		upperBodyScaleMidmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3331751F,0.9382477F,-0.0663593F,0.0654384F)).transpose());
		upperBodyScaleMidmirror.setTextureSize( 2048 , 2048 );
		parts.put(upperBodyScaleMidmirror.boxName,upperBodyScaleMidmirror);
		upperBodyBone.addChild(upperBodyScaleMidmirror);
		
		upperBodyScaleTop = new MCAModelRenderer(this, "upperBodyScaleTop", 820 , 414);
		upperBodyScaleTop.mirror = false;
		upperBodyScaleTop.addBox (-21.0F,-6.0F,-30.0F,42,12,60);
		upperBodyScaleTop.setInitialRotationPoint (-12.2F,-64.1F,36.1F);
		upperBodyScaleTop.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0859113F,0.0569699F,0.9863209F,0.1286269F)).transpose());
		upperBodyScaleTop.setTextureSize( 2048 , 2048 );
		parts.put(upperBodyScaleTop.boxName,upperBodyScaleTop);
		upperBodyBone.addChild(upperBodyScaleTop);
		
		upperBodyScaleTopmirror = new MCAModelRenderer(this, "upperBodyScaleTopmirror", 820 , 414);
		upperBodyScaleTopmirror.mirror = true;
		upperBodyScaleTopmirror.addBox (-21.0F,-6.0F,-30.0F,42,12,60);
		upperBodyScaleTopmirror.setInitialRotationPoint (12.2F,-63.9F,36.0F);
		upperBodyScaleTopmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0831063F,-0.0561195F,-0.9859058F,0.1339169F)).transpose());
		upperBodyScaleTopmirror.setTextureSize( 2048 , 2048 );
		parts.put(upperBodyScaleTopmirror.boxName,upperBodyScaleTopmirror);
		upperBodyBone.addChild(upperBodyScaleTopmirror);
		
		upperBodySpine = new MCAModelRenderer(this, "upperBodySpine", 1948 , 182);
		upperBodySpine.mirror = false;
		upperBodySpine.addBox (-1.0F,-24.0F,-24.0F,2,48,48);
		upperBodySpine.setInitialRotationPoint (-0.0F,-85.7F,49.6F);
		upperBodySpine.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(3e-07F,0.4632936F,0.8862048F,4e-07F)).transpose());
		upperBodySpine.setTextureSize( 2048 , 2048 );
		parts.put(upperBodySpine.boxName,upperBodySpine);
		upperBodyBone.addChild(upperBodySpine);
		
		upperBodySpineLeft = new MCAModelRenderer(this, "upperBodySpineLeft", 1948 , 182);
		upperBodySpineLeft.mirror = false;
		upperBodySpineLeft.addBox (-1.0F,-24.0F,-24.0F,2,48,48);
		upperBodySpineLeft.setInitialRotationPoint (-31.3F,-61.6F,48.3F);
		upperBodySpineLeft.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.166477F,0.4837363F,0.7997685F,0.3140939F)).transpose());
		upperBodySpineLeft.setTextureSize( 2048 , 2048 );
		parts.put(upperBodySpineLeft.boxName,upperBodySpineLeft);
		upperBodyBone.addChild(upperBodySpineLeft);
		
		upperBodySpineLeftmirror = new MCAModelRenderer(this, "upperBodySpineLeftmirror", 1948 , 182);
		upperBodySpineLeftmirror.mirror = true;
		upperBodySpineLeftmirror.addBox (-1.0F,-24.0F,-24.0F,2,48,48);
		upperBodySpineLeftmirror.setInitialRotationPoint (31.3F,-61.6F,48.3F);
		upperBodySpineLeftmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1664773F,-0.4837385F,-0.7997676F,0.3140928F)).transpose());
		upperBodySpineLeftmirror.setTextureSize( 2048 , 2048 );
		parts.put(upperBodySpineLeftmirror.boxName,upperBodySpineLeftmirror);
		upperBodyBone.addChild(upperBodySpineLeftmirror);
		
		waistLeft = new MCAModelRenderer(this, "waistLeft", 0 , 352);
		waistLeft.mirror = false;
		waistLeft.addBox (-7.0F,-38.0F,-89.0F,14,76,178);
		waistLeft.setInitialRotationPoint (-65.5F,36.7F,29.3F);
		waistLeft.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0331161F,-0.9961119F,0.0765414F,0.0283887F)).transpose());
		waistLeft.setTextureSize( 2048 , 2048 );
		parts.put(waistLeft.boxName,waistLeft);
		middleBodyBone.addChild(waistLeft);
		
		waistLeftmirror = new MCAModelRenderer(this, "waistLeftmirror", 0 , 352);
		waistLeftmirror.mirror = true;
		waistLeftmirror.addBox (-7.0F,-38.0F,-89.0F,14,76,178);
		waistLeftmirror.setInitialRotationPoint (65.5F,36.7F,29.3F);
		waistLeftmirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0331158F,0.9961118F,-0.0765428F,0.0283902F)).transpose());
		waistLeftmirror.setTextureSize( 2048 , 2048 );
		parts.put(waistLeftmirror.boxName,waistLeftmirror);
		middleBodyBone.addChild(waistLeftmirror);
		
    }
    

	@Override
	public void render(Entity oldEntity, float time, float limbSwingDistance, float custom, float headYRot, float headXRot, float yTrans) 
	{
		EntityGodzilla entity = (EntityGodzilla)oldEntity;

		//Render every non-child part

		Bone.render(yTrans);

		AnimationHandler.performAnimationInModel(parts, entity);
	}

	@Override
	public void setRotationAngles(float time, float limbSwingDistance, float custom, float headYRot, float headXRot, float yTrans, Entity oldEntity) {}

	public MCAModelRenderer getModelRendererFromName(String name)
	{
		return parts.get(name) != null ? parts.get(name) : null;
	}

}
