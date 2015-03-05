
package anonmine.beastmod.client.model;

import java.util.HashMap;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import anonmine.beastmod.client.mca.clientlibrary.MCAModelRenderer;
import anonmine.beastmod.common.entity.giantmonster.EntityTarantula;
import anonmine.beastmod.common.mca.commonlibrary.MCAVersionChecker;
import anonmine.beastmod.common.mca.commonlibrary.animation.AnimationHandler;
import anonmine.beastmod.common.mca.commonlibrary.math.Matrix4f;
import anonmine.beastmod.common.mca.commonlibrary.math.Quaternion;



public class ModelTarantula extends ModelBase {
	public final int MCA_MIN_REQUESTED_VERSION = 1;
	public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

	MCAModelRenderer Bone;
	MCAModelRenderer Bone_Chelicera_L;
	MCAModelRenderer Bone_Chelicera_R;
	MCAModelRenderer Bone_Fang_L;
	MCAModelRenderer Bone_Fang_R;
	MCAModelRenderer Bone_Legg1_Femur_L;
	MCAModelRenderer Bone_Legg1_Femur_R;
	MCAModelRenderer Bone_Legg1_IK_L;
	MCAModelRenderer Bone_Legg1_IK_R;
	MCAModelRenderer Bone_Legg1_Metatarsus_L;
	MCAModelRenderer Bone_Legg1_Metatarsus_R;
	MCAModelRenderer Bone_Legg1_Patella_L;
	MCAModelRenderer Bone_Legg1_Patella_R;
	MCAModelRenderer Bone_Legg1_Tarsus_L;
	MCAModelRenderer Bone_Legg1_Tarsus_R;
	MCAModelRenderer Bone_Legg1_Tibia_L;
	MCAModelRenderer Bone_Legg1_Tibia_R;
	MCAModelRenderer Bone_Legg1_Trochanter_L;
	MCAModelRenderer Bone_Legg1_Trochanter_R;
	MCAModelRenderer Bone_Legg2_Femur_L;
	MCAModelRenderer Bone_Legg2_Femur_R;
	MCAModelRenderer Bone_Legg2_IK_L;
	MCAModelRenderer Bone_Legg2_IK_R;
	MCAModelRenderer Bone_Legg2_Metatarsus_L;
	MCAModelRenderer Bone_Legg2_Metatarsus_R;
	MCAModelRenderer Bone_Legg2_Patella_L;
	MCAModelRenderer Bone_Legg2_Patella_R;
	MCAModelRenderer Bone_Legg2_Tarsus_L;
	MCAModelRenderer Bone_Legg2_Tarsus_R;
	MCAModelRenderer Bone_Legg2_Tibia_L;
	MCAModelRenderer Bone_Legg2_Tibia_R;
	MCAModelRenderer Bone_Legg2_Trochanter_L;
	MCAModelRenderer Bone_Legg2_Trochanter_R;
	MCAModelRenderer Bone_Legg3_Femur_L;
	MCAModelRenderer Bone_Legg3_Femur_R;
	MCAModelRenderer Bone_Legg3_IK_L;
	MCAModelRenderer Bone_Legg3_IK_R;
	MCAModelRenderer Bone_Legg3_Metatarsus_L;
	MCAModelRenderer Bone_Legg3_Metatarsus_R;
	MCAModelRenderer Bone_Legg3_Patella_L;
	MCAModelRenderer Bone_Legg3_Patella_R;
	MCAModelRenderer Bone_Legg3_Tarsus_L;
	MCAModelRenderer Bone_Legg3_Tarsus_R;
	MCAModelRenderer Bone_Legg3_Tibia_L;
	MCAModelRenderer Bone_Legg3_Tibia_R;
	MCAModelRenderer Bone_Legg3_Trochanter_L;
	MCAModelRenderer Bone_Legg3_Trochanter_R;
	MCAModelRenderer Bone_Legg4_Femur_L;
	MCAModelRenderer Bone_Legg4_Femur_R;
	MCAModelRenderer Bone_Legg4_IK_L;
	MCAModelRenderer Bone_Legg4_IK_R;
	MCAModelRenderer Bone_Legg4_Metatarsus_L;
	MCAModelRenderer Bone_Legg4_Metatarsus_R;
	MCAModelRenderer Bone_Legg4_Patella_L;
	MCAModelRenderer Bone_Legg4_Patella_R;
	MCAModelRenderer Bone_Legg4_Tarsus_L;
	MCAModelRenderer Bone_Legg4_Tarsus_R;
	MCAModelRenderer Bone_Legg4_Tibia_L;
	MCAModelRenderer Bone_Legg4_Tibia_R;
	MCAModelRenderer Bone_Legg4_Trochanter_L;
	MCAModelRenderer Bone_Legg4_Trochanter_R;
	MCAModelRenderer BoneAbdomen;
	MCAModelRenderer BoneCarapace;
	MCAModelRenderer BoneJoin;
	MCAModelRenderer Legg1_Pole_L;
	MCAModelRenderer Legg1_Pole_R;
	MCAModelRenderer Legg2_Pole_L;
	MCAModelRenderer Legg2_Pole_R;
	MCAModelRenderer Legg3_Pole_L;
	MCAModelRenderer Legg3_Pole_R;
	MCAModelRenderer Legg4_Pole_L;
	MCAModelRenderer Legg4_Pole_R;
	MCAModelRenderer MasterBone;
	MCAModelRenderer Pedipalp0_L;
	MCAModelRenderer Pedipalp0_R;
	MCAModelRenderer Pedipalp1_L;
	MCAModelRenderer Pedipalp1_R;
	MCAModelRenderer Pedipalp2_L;
	MCAModelRenderer Pedipalp2_R;
	MCAModelRenderer Pedipalp3_L;
	MCAModelRenderer Pedipalp3_R;
	MCAModelRenderer Pedipalp4_L;
	MCAModelRenderer Pedipalp4_R;
	MCAModelRenderer Abdomen10_L;
	MCAModelRenderer Abdomen10_R;
	MCAModelRenderer Abdomen11_L;
	MCAModelRenderer Abdomen11_R;
	MCAModelRenderer Abdomen1_L;
	MCAModelRenderer Abdomen1_R;
	MCAModelRenderer Abdomen2_L;
	MCAModelRenderer Abdomen2_R;
	MCAModelRenderer Abdomen3_L;
	MCAModelRenderer Abdomen3_R;
	MCAModelRenderer Abdomen4_L;
	MCAModelRenderer Abdomen4_R;
	MCAModelRenderer Abdomen5_L;
	MCAModelRenderer Abdomen5_R;
	MCAModelRenderer Abdomen6_L;
	MCAModelRenderer Abdomen6_R;
	MCAModelRenderer Abdomen7_L;
	MCAModelRenderer Abdomen7_R;
	MCAModelRenderer Abdomen8_L;
	MCAModelRenderer Abdomen8_R;
	MCAModelRenderer Abdomen9_L;
	MCAModelRenderer Abdomen9_R;
	MCAModelRenderer AbdomenBottom;
	MCAModelRenderer Carapace0_L;
	MCAModelRenderer Carapace0_R;
	MCAModelRenderer Carapace1_L;
	MCAModelRenderer Carapace1_R;
	MCAModelRenderer Carapace2_L;
	MCAModelRenderer Carapace2_R;
	MCAModelRenderer Carapace3_L;
	MCAModelRenderer Carapace3_R;
	MCAModelRenderer Carapace4_L;
	MCAModelRenderer Carapace4_R;
	MCAModelRenderer CarapaceBack;
	MCAModelRenderer Chelicera_L;
	MCAModelRenderer Chelicera_R;
	MCAModelRenderer Eye1;
	MCAModelRenderer Eye1mirror;
	MCAModelRenderer Eye2;
	MCAModelRenderer Eye2mirror;
	MCAModelRenderer Eye3;
	MCAModelRenderer Eye3mirror;
	MCAModelRenderer Eye4;
	MCAModelRenderer Eye4mirror;
	MCAModelRenderer fang0_L;
	MCAModelRenderer fang0_R;
	MCAModelRenderer fang1_L;
	MCAModelRenderer fang1_R;
	MCAModelRenderer fang2_L;
	MCAModelRenderer fang2_R;
	MCAModelRenderer fang3_L;
	MCAModelRenderer fang3_R;
	MCAModelRenderer Legg1_Femur_L;
	MCAModelRenderer Legg1_Femur_R;
	MCAModelRenderer Legg1_Join1_L;
	MCAModelRenderer Legg1_Join1_R;
	MCAModelRenderer Legg1_Join2_L;
	MCAModelRenderer Legg1_Join2_R;
	MCAModelRenderer Legg1_Join3_L;
	MCAModelRenderer Legg1_Join3_R;
	MCAModelRenderer Legg1_Join4_L;
	MCAModelRenderer Legg1_Join4_R;
	MCAModelRenderer Legg1_Join5_L;
	MCAModelRenderer Legg1_Join5_R;
	MCAModelRenderer Legg1_Metatarsus_L;
	MCAModelRenderer Legg1_Metatarsus_R;
	MCAModelRenderer Legg1_Patella_L;
	MCAModelRenderer Legg1_Patella_R;
	MCAModelRenderer Legg1_Tarsus_L;
	MCAModelRenderer Legg1_Tarsus_R;
	MCAModelRenderer Legg1_Tibia_L;
	MCAModelRenderer Legg1_Tibia_R;
	MCAModelRenderer Legg1_Trochanter_L;
	MCAModelRenderer Legg1_Trochanter_R;
	MCAModelRenderer Legg2_Femur_L;
	MCAModelRenderer Legg2_Femur_R;
	MCAModelRenderer Legg2_Join1_L;
	MCAModelRenderer Legg2_Join1_R;
	MCAModelRenderer Legg2_Join2_L;
	MCAModelRenderer Legg2_Join2_R;
	MCAModelRenderer Legg2_Join3_L;
	MCAModelRenderer Legg2_Join3_R;
	MCAModelRenderer Legg2_Join4_L;
	MCAModelRenderer Legg2_Join4_R;
	MCAModelRenderer Legg2_Join5_L;
	MCAModelRenderer Legg2_Join5_R;
	MCAModelRenderer Legg2_Metatarsus_L;
	MCAModelRenderer Legg2_Metatarsus_R;
	MCAModelRenderer Legg2_Patella_L;
	MCAModelRenderer Legg2_Patella_R;
	MCAModelRenderer Legg2_Tarsus_L;
	MCAModelRenderer Legg2_Tarsus_R;
	MCAModelRenderer Legg2_Tibia_L;
	MCAModelRenderer Legg2_Tibia_R;
	MCAModelRenderer Legg2_Trochanter_L;
	MCAModelRenderer Legg2_Trochanter_R;
	MCAModelRenderer Legg3_Femur_L;
	MCAModelRenderer Legg3_Femur_R;
	MCAModelRenderer Legg3_Join1_L;
	MCAModelRenderer Legg3_Join1_R;
	MCAModelRenderer Legg3_Join2_L;
	MCAModelRenderer Legg3_Join2_R;
	MCAModelRenderer Legg3_Join3_L;
	MCAModelRenderer Legg3_Join3_R;
	MCAModelRenderer Legg3_Join4_L;
	MCAModelRenderer Legg3_Join4_R;
	MCAModelRenderer Legg3_Join5_L;
	MCAModelRenderer Legg3_Join5_R;
	MCAModelRenderer Legg3_Metatarsus_L;
	MCAModelRenderer Legg3_Metatarsus_R;
	MCAModelRenderer Legg3_Patella_L;
	MCAModelRenderer Legg3_Patella_R;
	MCAModelRenderer Legg3_Tarsus_L;
	MCAModelRenderer Legg3_Tarsus_R;
	MCAModelRenderer Legg3_Tibia_L;
	MCAModelRenderer Legg3_Tibia_R;
	MCAModelRenderer Legg3_Trochanter_L;
	MCAModelRenderer Legg3_Trochanter_R;
	MCAModelRenderer Legg4_Femur_L;
	MCAModelRenderer Legg4_Femur_R;
	MCAModelRenderer Legg4_Join1_L;
	MCAModelRenderer Legg4_Join1_R;
	MCAModelRenderer Legg4_Join2_L;
	MCAModelRenderer Legg4_Join2_R;
	MCAModelRenderer Legg4_Join3_L;
	MCAModelRenderer Legg4_Join3_R;
	MCAModelRenderer Legg4_Join4_L;
	MCAModelRenderer Legg4_Join4_R;
	MCAModelRenderer Legg4_Join5_L;
	MCAModelRenderer Legg4_Join5_R;
	MCAModelRenderer Legg4_Metatarsus_L;
	MCAModelRenderer Legg4_Metatarsus_R;
	MCAModelRenderer Legg4_Patella_L;
	MCAModelRenderer Legg4_Patella_R;
	MCAModelRenderer Legg4_Tarsus_L;
	MCAModelRenderer Legg4_Tarsus_R;
	MCAModelRenderer Legg4_Tibia_L;
	MCAModelRenderer Legg4_Tibia_R;
	MCAModelRenderer Legg4_Trochanter_L;
	MCAModelRenderer Legg4_Trochanter_R;
	MCAModelRenderer Pedipalps0_L;
	MCAModelRenderer Pedipalps0_R;
	MCAModelRenderer Pedipalps12_L;
	MCAModelRenderer Pedipalps12_R;
	MCAModelRenderer Pedipalps1_L;
	MCAModelRenderer Pedipalps1_R;
	MCAModelRenderer Pedipalps23_L;
	MCAModelRenderer Pedipalps23_R;
	MCAModelRenderer Pedipalps2_L;
	MCAModelRenderer Pedipalps2_R;
	MCAModelRenderer Pedipalps34_L;
	MCAModelRenderer Pedipalps34_R;
	MCAModelRenderer Pedipalps3_L;
	MCAModelRenderer Pedipalps3_R;
	MCAModelRenderer PedipalpsEnd1_L;
	MCAModelRenderer PedipalpsEnd1_R;
	MCAModelRenderer PedipalpsEnd2_L;
	MCAModelRenderer PedipalpsEnd2_R;
	MCAModelRenderer Spinneret_L;
	MCAModelRenderer Spinneret_R;
	MCAModelRenderer torso;
	public ModelTarantula()
	{
		MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

		textureWidth = 256;
		textureHeight = 256;


		Bone = new MCAModelRenderer(this, "Bone", 0 , 0);
		Bone.setInitialRotationPoint (-0.0F,-27.3F,43.2F);
		Bone.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-1.0F,-0.0F,0.0F,0.0F)).transpose());
		parts.put(Bone.boxName,Bone);
		
		Bone_Chelicera_L = new MCAModelRenderer(this, "Bone_Chelicera_L", 0 , 0);
		Bone_Chelicera_L.setInitialRotationPoint (-4.5F,-4.8F,41.8F);
		Bone_Chelicera_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0267126F,0.374153F,0.9269196F,0.010781F)).transpose());
		parts.put(Bone_Chelicera_L.boxName,Bone_Chelicera_L);
		
		Bone_Chelicera_R = new MCAModelRenderer(this, "Bone_Chelicera_R", 0 , 0);
		Bone_Chelicera_R.setInitialRotationPoint (4.5F,-4.8F,41.8F);
		Bone_Chelicera_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0117209F,0.3749223F,0.9266087F,0.026314F)).transpose());
		parts.put(Bone_Chelicera_R.boxName,Bone_Chelicera_R);
		
		Bone_Fang_L = new MCAModelRenderer(this, "Bone_Fang_L", 0 , 0);
		Bone_Fang_L.setInitialRotationPoint (0.0F,0.0F,9.0F);
		Bone_Fang_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(7.42e-05F,-0.7014612F,0.6769739F,0.2228422F)).transpose());
		parts.put(Bone_Fang_L.boxName,Bone_Fang_L);
		
		Bone_Fang_R = new MCAModelRenderer(this, "Bone_Fang_R", 0 , 0);
		Bone_Fang_R.setInitialRotationPoint (0.0F,0.0F,9.0F);
		Bone_Fang_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2784638F,-0.6438211F,0.7126701F,0.0073256F)).transpose());
		parts.put(Bone_Fang_R.boxName,Bone_Fang_R);
		
		Bone_Legg1_Femur_L = new MCAModelRenderer(this, "Bone_Legg1_Femur_L", 0 , 0);
		Bone_Legg1_Femur_L.setInitialRotationPoint (0.0F,-0.0F,20.3F);
		Bone_Legg1_Femur_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.386616F,-0.0473367F,-0.0249069F,0.9206883F)).transpose());
		parts.put(Bone_Legg1_Femur_L.boxName,Bone_Legg1_Femur_L);
		
		Bone_Legg1_Femur_R = new MCAModelRenderer(this, "Bone_Legg1_Femur_R", 0 , 0);
		Bone_Legg1_Femur_R.setInitialRotationPoint (-0.0F,0.0F,20.3F);
		Bone_Legg1_Femur_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1884203F,0.3408965F,0.5804336F,0.7151114F)).transpose());
		parts.put(Bone_Legg1_Femur_R.boxName,Bone_Legg1_Femur_R);
		
		Bone_Legg1_Metatarsus_L = new MCAModelRenderer(this, "Bone_Legg1_Metatarsus_L", 0 , 0);
		Bone_Legg1_Metatarsus_L.setInitialRotationPoint (0.0F,0.0F,16.8F);
		Bone_Legg1_Metatarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0759588F,0.0131327F,-0.0176724F,0.9968679F)).transpose());
		parts.put(Bone_Legg1_Metatarsus_L.boxName,Bone_Legg1_Metatarsus_L);
		
		Bone_Legg1_Metatarsus_R = new MCAModelRenderer(this, "Bone_Legg1_Metatarsus_R", 0 , 0);
		Bone_Legg1_Metatarsus_R.setInitialRotationPoint (-0.0F,-0.0F,16.8F);
		Bone_Legg1_Metatarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0004684F,0.0770842F,-0.0844612F,0.9934406F)).transpose());
		parts.put(Bone_Legg1_Metatarsus_R.boxName,Bone_Legg1_Metatarsus_R);
		
		Bone_Legg1_Patella_L = new MCAModelRenderer(this, "Bone_Legg1_Patella_L", 0 , 0);
		Bone_Legg1_Patella_L.setInitialRotationPoint (-0.0F,-0.0F,15.1F);
		Bone_Legg1_Patella_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.5001146F,-0.0208862F,-0.007815F,0.8656721F)).transpose());
		parts.put(Bone_Legg1_Patella_L.boxName,Bone_Legg1_Patella_L);
		
		Bone_Legg1_Patella_R = new MCAModelRenderer(this, "Bone_Legg1_Patella_R", 0 , 0);
		Bone_Legg1_Patella_R.setInitialRotationPoint (0.0F,0.0F,15.1F);
		Bone_Legg1_Patella_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.4241787F,-0.2657504F,-0.7229731F,0.4761924F)).transpose());
		parts.put(Bone_Legg1_Patella_R.boxName,Bone_Legg1_Patella_R);
		
		Bone_Legg1_Tarsus_L = new MCAModelRenderer(this, "Bone_Legg1_Tarsus_L", 0 , 0);
		Bone_Legg1_Tarsus_L.setInitialRotationPoint (-0.0F,0.0F,16.3F);
		Bone_Legg1_Tarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1168938F,-0.0571881F,0.0710316F,0.9889489F)).transpose());
		parts.put(Bone_Legg1_Tarsus_L.boxName,Bone_Legg1_Tarsus_L);
		
		Bone_Legg1_Tarsus_R = new MCAModelRenderer(this, "Bone_Legg1_Tarsus_R", 0 , 0);
		Bone_Legg1_Tarsus_R.setInitialRotationPoint (-0.0F,0.0F,16.3F);
		Bone_Legg1_Tarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0564232F,-0.1158867F,0.2034013F,0.9705743F)).transpose());
		parts.put(Bone_Legg1_Tarsus_R.boxName,Bone_Legg1_Tarsus_R);
		
		Bone_Legg1_Tibia_L = new MCAModelRenderer(this, "Bone_Legg1_Tibia_L", 0 , 0);
		Bone_Legg1_Tibia_L.setInitialRotationPoint (0.0F,-0.0F,12.2F);
		Bone_Legg1_Tibia_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3379013F,0.031249F,-0.01751F,0.9404997F)).transpose());
		parts.put(Bone_Legg1_Tibia_L.boxName,Bone_Legg1_Tibia_L);
		
		Bone_Legg1_Tibia_R = new MCAModelRenderer(this, "Bone_Legg1_Tibia_R", 0 , 0);
		Bone_Legg1_Tibia_R.setInitialRotationPoint (0.0F,-0.0F,12.2F);
		Bone_Legg1_Tibia_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2049176F,0.2704861F,-0.5312091F,0.7763137F)).transpose());
		parts.put(Bone_Legg1_Tibia_R.boxName,Bone_Legg1_Tibia_R);
		
		Bone_Legg1_Trochanter_L = new MCAModelRenderer(this, "Bone_Legg1_Trochanter_L", 0 , 0);
		Bone_Legg1_Trochanter_L.setInitialRotationPoint (-4.0F,6.4F,25.4F);
		Bone_Legg1_Trochanter_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.4938387F,0.0378267F,-0.8684716F,0.0212071F)).transpose());
		parts.put(Bone_Legg1_Trochanter_L.boxName,Bone_Legg1_Trochanter_L);
		
		Bone_Legg1_Trochanter_R = new MCAModelRenderer(this, "Bone_Legg1_Trochanter_R", 0 , 0);
		Bone_Legg1_Trochanter_R.setInitialRotationPoint (4.0F,6.4F,25.4F);
		Bone_Legg1_Trochanter_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4839388F,0.1103657F,-0.861439F,0.1074494F)).transpose());
		parts.put(Bone_Legg1_Trochanter_R.boxName,Bone_Legg1_Trochanter_R);
		
		Bone_Legg2_Femur_L = new MCAModelRenderer(this, "Bone_Legg2_Femur_L", 0 , 0);
		Bone_Legg2_Femur_L.setInitialRotationPoint (-0.0F,-0.0F,20.3F);
		Bone_Legg2_Femur_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3866158F,-0.0473367F,-0.0249069F,0.9206884F)).transpose());
		parts.put(Bone_Legg2_Femur_L.boxName,Bone_Legg2_Femur_L);
		
		Bone_Legg2_Femur_R = new MCAModelRenderer(this, "Bone_Legg2_Femur_R", 0 , 0);
		Bone_Legg2_Femur_R.setInitialRotationPoint (-0.0F,0.0F,20.3F);
		Bone_Legg2_Femur_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1313817F,0.3666765F,0.6186653F,0.6823053F)).transpose());
		parts.put(Bone_Legg2_Femur_R.boxName,Bone_Legg2_Femur_R);
		
		Bone_Legg2_Metatarsus_L = new MCAModelRenderer(this, "Bone_Legg2_Metatarsus_L", 0 , 0);
		Bone_Legg2_Metatarsus_L.setInitialRotationPoint (0.0F,-0.0F,16.8F);
		Bone_Legg2_Metatarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.075959F,0.0131327F,-0.0176723F,0.9968678F)).transpose());
		parts.put(Bone_Legg2_Metatarsus_L.boxName,Bone_Legg2_Metatarsus_L);
		
		Bone_Legg2_Metatarsus_R = new MCAModelRenderer(this, "Bone_Legg2_Metatarsus_R", 0 , 0);
		Bone_Legg2_Metatarsus_R.setInitialRotationPoint (0.0F,0.0F,16.8F);
		Bone_Legg2_Metatarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0602391F,0.0480994F,-0.0630914F,0.9950262F)).transpose());
		parts.put(Bone_Legg2_Metatarsus_R.boxName,Bone_Legg2_Metatarsus_R);
		
		Bone_Legg2_Patella_L = new MCAModelRenderer(this, "Bone_Legg2_Patella_L", 0 , 0);
		Bone_Legg2_Patella_L.setInitialRotationPoint (0.0F,0.0F,15.1F);
		Bone_Legg2_Patella_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.5001145F,-0.0208862F,-0.0078151F,0.8656721F)).transpose());
		parts.put(Bone_Legg2_Patella_L.boxName,Bone_Legg2_Patella_L);
		
		Bone_Legg2_Patella_R = new MCAModelRenderer(this, "Bone_Legg2_Patella_R", 0 , 0);
		Bone_Legg2_Patella_R.setInitialRotationPoint (0.0F,-0.0F,15.1F);
		Bone_Legg2_Patella_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3791398F,0.3268102F,0.8532975F,0.1460532F)).transpose());
		parts.put(Bone_Legg2_Patella_R.boxName,Bone_Legg2_Patella_R);
		
		Bone_Legg2_Tarsus_L = new MCAModelRenderer(this, "Bone_Legg2_Tarsus_L", 0 , 0);
		Bone_Legg2_Tarsus_L.setInitialRotationPoint (-0.0F,-0.0F,16.3F);
		Bone_Legg2_Tarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1165785F,-0.0541108F,0.0750767F,0.9888604F)).transpose());
		parts.put(Bone_Legg2_Tarsus_L.boxName,Bone_Legg2_Tarsus_L);
		
		Bone_Legg2_Tarsus_R = new MCAModelRenderer(this, "Bone_Legg2_Tarsus_R", 0 , 0);
		Bone_Legg2_Tarsus_R.setInitialRotationPoint (-0.0F,0.0F,16.3F);
		Bone_Legg2_Tarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0531901F,-0.1172606F,0.2072936F,0.9697681F)).transpose());
		parts.put(Bone_Legg2_Tarsus_R.boxName,Bone_Legg2_Tarsus_R);
		
		Bone_Legg2_Tibia_L = new MCAModelRenderer(this, "Bone_Legg2_Tibia_L", 0 , 0);
		Bone_Legg2_Tibia_L.setInitialRotationPoint (0.0F,-0.0F,12.2F);
		Bone_Legg2_Tibia_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3379016F,0.0312489F,-0.0175099F,0.9404996F)).transpose());
		parts.put(Bone_Legg2_Tibia_L.boxName,Bone_Legg2_Tibia_L);
		
		Bone_Legg2_Tibia_R = new MCAModelRenderer(this, "Bone_Legg2_Tibia_R", 0 , 0);
		Bone_Legg2_Tibia_R.setInitialRotationPoint (-0.0F,0.0F,12.2F);
		Bone_Legg2_Tibia_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0386192F,0.3371394F,-0.6495758F,0.6803653F)).transpose());
		parts.put(Bone_Legg2_Tibia_R.boxName,Bone_Legg2_Tibia_R);
		
		Bone_Legg2_Trochanter_L = new MCAModelRenderer(this, "Bone_Legg2_Trochanter_L", 0 , 0);
		Bone_Legg2_Trochanter_L.setInitialRotationPoint (-4.6F,6.4F,20.2F);
		Bone_Legg2_Trochanter_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.6552817F,0.0358967F,-0.7541399F,0.0242972F)).transpose());
		parts.put(Bone_Legg2_Trochanter_L.boxName,Bone_Legg2_Trochanter_L);
		
		Bone_Legg2_Trochanter_R = new MCAModelRenderer(this, "Bone_Legg2_Trochanter_R", 0 , 0);
		Bone_Legg2_Trochanter_R.setInitialRotationPoint (4.6F,6.4F,20.2F);
		Bone_Legg2_Trochanter_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5430226F,0.3681999F,-0.6590929F,0.3676302F)).transpose());
		parts.put(Bone_Legg2_Trochanter_R.boxName,Bone_Legg2_Trochanter_R);
		
		Bone_Legg3_Femur_L = new MCAModelRenderer(this, "Bone_Legg3_Femur_L", 0 , 0);
		Bone_Legg3_Femur_L.setInitialRotationPoint (-0.0F,-0.0F,20.3F);
		Bone_Legg3_Femur_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.386616F,-0.0473368F,-0.0249069F,0.9206883F)).transpose());
		parts.put(Bone_Legg3_Femur_L.boxName,Bone_Legg3_Femur_L);
		
		Bone_Legg3_Femur_R = new MCAModelRenderer(this, "Bone_Legg3_Femur_R", 0 , 0);
		Bone_Legg3_Femur_R.setInitialRotationPoint (0.0F,-0.0F,20.3F);
		Bone_Legg3_Femur_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0016884F,-0.3894995F,-0.7903463F,0.4729059F)).transpose());
		parts.put(Bone_Legg3_Femur_R.boxName,Bone_Legg3_Femur_R);
		
		Bone_Legg3_Metatarsus_L = new MCAModelRenderer(this, "Bone_Legg3_Metatarsus_L", 0 , 0);
		Bone_Legg3_Metatarsus_L.setInitialRotationPoint (-0.0F,0.0F,16.8F);
		Bone_Legg3_Metatarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0759587F,0.0131326F,-0.0176721F,0.9968679F)).transpose());
		parts.put(Bone_Legg3_Metatarsus_L.boxName,Bone_Legg3_Metatarsus_L);
		
		Bone_Legg3_Metatarsus_R = new MCAModelRenderer(this, "Bone_Legg3_Metatarsus_R", 0 , 0);
		Bone_Legg3_Metatarsus_R.setInitialRotationPoint (0.0F,0.0F,16.8F);
		Bone_Legg3_Metatarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.072952F,-0.0249037F,-0.0089217F,0.9969846F)).transpose());
		parts.put(Bone_Legg3_Metatarsus_R.boxName,Bone_Legg3_Metatarsus_R);
		
		Bone_Legg3_Patella_L = new MCAModelRenderer(this, "Bone_Legg3_Patella_L", 0 , 0);
		Bone_Legg3_Patella_L.setInitialRotationPoint (0.0F,-0.0F,15.1F);
		Bone_Legg3_Patella_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.5001145F,-0.0208862F,-0.007815F,0.8656721F)).transpose());
		parts.put(Bone_Legg3_Patella_L.boxName,Bone_Legg3_Patella_L);
		
		Bone_Legg3_Patella_R = new MCAModelRenderer(this, "Bone_Legg3_Patella_R", 0 , 0);
		Bone_Legg3_Patella_R.setInitialRotationPoint (-0.0F,-0.0F,15.1F);
		Bone_Legg3_Patella_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4554365F,-0.2076728F,-0.603717F,0.6204639F)).transpose());
		parts.put(Bone_Legg3_Patella_R.boxName,Bone_Legg3_Patella_R);
		
		Bone_Legg3_Tarsus_L = new MCAModelRenderer(this, "Bone_Legg3_Tarsus_L", 0 , 0);
		Bone_Legg3_Tarsus_L.setInitialRotationPoint (0.0F,0.0F,16.3F);
		Bone_Legg3_Tarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1151853F,-0.0408835F,0.0924229F,0.9881898F)).transpose());
		parts.put(Bone_Legg3_Tarsus_L.boxName,Bone_Legg3_Tarsus_L);
		
		Bone_Legg3_Tarsus_R = new MCAModelRenderer(this, "Bone_Legg3_Tarsus_R", 0 , 0);
		Bone_Legg3_Tarsus_R.setInitialRotationPoint (-0.0F,-0.0F,16.3F);
		Bone_Legg3_Tarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1243463F,-0.0068659F,0.1159993F,0.9854111F)).transpose());
		parts.put(Bone_Legg3_Tarsus_R.boxName,Bone_Legg3_Tarsus_R);
		
		Bone_Legg3_Tibia_L = new MCAModelRenderer(this, "Bone_Legg3_Tibia_L", 0 , 0);
		Bone_Legg3_Tibia_L.setInitialRotationPoint (0.0F,-0.0F,12.2F);
		Bone_Legg3_Tibia_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3379013F,0.0312491F,-0.0175101F,0.9404998F)).transpose());
		parts.put(Bone_Legg3_Tibia_L.boxName,Bone_Legg3_Tibia_L);
		
		Bone_Legg3_Tibia_R = new MCAModelRenderer(this, "Bone_Legg3_Tibia_R", 0 , 0);
		Bone_Legg3_Tibia_R.setInitialRotationPoint (-0.0F,0.0F,12.2F);
		Bone_Legg3_Tibia_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2533346F,-0.2257768F,0.336019F,0.8785998F)).transpose());
		parts.put(Bone_Legg3_Tibia_R.boxName,Bone_Legg3_Tibia_R);
		
		Bone_Legg3_Trochanter_L = new MCAModelRenderer(this, "Bone_Legg3_Trochanter_L", 0 , 0);
		Bone_Legg3_Trochanter_L.setInitialRotationPoint (-7.0F,6.4F,14.7F);
		Bone_Legg3_Trochanter_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.7965215F,0.0460486F,-0.6026108F,0.0171212F)).transpose());
		parts.put(Bone_Legg3_Trochanter_L.boxName,Bone_Legg3_Trochanter_L);
		
		Bone_Legg3_Trochanter_R = new MCAModelRenderer(this, "Bone_Legg3_Trochanter_R", 0 , 0);
		Bone_Legg3_Trochanter_R.setInitialRotationPoint (7.0F,6.4F,14.7F);
		Bone_Legg3_Trochanter_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.7685055F,0.2082405F,0.5679127F,0.2085918F)).transpose());
		parts.put(Bone_Legg3_Trochanter_R.boxName,Bone_Legg3_Trochanter_R);
		
		Bone_Legg4_Femur_L = new MCAModelRenderer(this, "Bone_Legg4_Femur_L", 0 , 0);
		Bone_Legg4_Femur_L.setInitialRotationPoint (-0.0F,0.0F,20.3F);
		Bone_Legg4_Femur_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3866156F,-0.0473369F,-0.024907F,0.9206885F)).transpose());
		parts.put(Bone_Legg4_Femur_L.boxName,Bone_Legg4_Femur_L);
		
		Bone_Legg4_Femur_R = new MCAModelRenderer(this, "Bone_Legg4_Femur_R", 0 , 0);
		Bone_Legg4_Femur_R.setInitialRotationPoint (0.0F,-0.0F,20.3F);
		Bone_Legg4_Femur_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2150695F,-0.3247423F,-0.6741683F,0.6275226F)).transpose());
		parts.put(Bone_Legg4_Femur_R.boxName,Bone_Legg4_Femur_R);
		
		Bone_Legg4_Metatarsus_L = new MCAModelRenderer(this, "Bone_Legg4_Metatarsus_L", 0 , 0);
		Bone_Legg4_Metatarsus_L.setInitialRotationPoint (0.0F,0.0F,16.8F);
		Bone_Legg4_Metatarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0759585F,0.0131325F,-0.0176722F,0.9968679F)).transpose());
		parts.put(Bone_Legg4_Metatarsus_L.boxName,Bone_Legg4_Metatarsus_L);
		
		Bone_Legg4_Metatarsus_R = new MCAModelRenderer(this, "Bone_Legg4_Metatarsus_R", 0 , 0);
		Bone_Legg4_Metatarsus_R.setInitialRotationPoint (-0.0F,-0.0F,16.8F);
		Bone_Legg4_Metatarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0356086F,-0.0683682F,0.0234619F,0.9967485F)).transpose());
		parts.put(Bone_Legg4_Metatarsus_R.boxName,Bone_Legg4_Metatarsus_R);
		
		Bone_Legg4_Patella_L = new MCAModelRenderer(this, "Bone_Legg4_Patella_L", 0 , 0);
		Bone_Legg4_Patella_L.setInitialRotationPoint (-0.0F,0.0F,15.1F);
		Bone_Legg4_Patella_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.500114F,-0.0208863F,-0.007815F,0.8656724F)).transpose());
		parts.put(Bone_Legg4_Patella_L.boxName,Bone_Legg4_Patella_L);
		
		Bone_Legg4_Patella_R = new MCAModelRenderer(this, "Bone_Legg4_Patella_R", 0 , 0);
		Bone_Legg4_Patella_R.setInitialRotationPoint (-0.0F,0.0F,15.1F);
		Bone_Legg4_Patella_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3897382F,0.3140942F,0.8403917F,0.2078243F)).transpose());
		parts.put(Bone_Legg4_Patella_R.boxName,Bone_Legg4_Patella_R);
		
		Bone_Legg4_Tarsus_L = new MCAModelRenderer(this, "Bone_Legg4_Tarsus_L", 0 , 0);
		Bone_Legg4_Tarsus_L.setInitialRotationPoint (0.0F,0.0F,16.3F);
		Bone_Legg4_Tarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1169668F,-0.057911F,0.0700802F,0.9889661F)).transpose());
		parts.put(Bone_Legg4_Tarsus_L.boxName,Bone_Legg4_Tarsus_L);
		
		Bone_Legg4_Tarsus_R = new MCAModelRenderer(this, "Bone_Legg4_Tarsus_R", 0 , 0);
		Bone_Legg4_Tarsus_R.setInitialRotationPoint (0.0F,0.0F,16.3F);
		Bone_Legg4_Tarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.097491F,0.0829638F,0.0455988F,0.9907236F)).transpose());
		parts.put(Bone_Legg4_Tarsus_R.boxName,Bone_Legg4_Tarsus_R);
		
		Bone_Legg4_Tibia_L = new MCAModelRenderer(this, "Bone_Legg4_Tibia_L", 0 , 0);
		Bone_Legg4_Tibia_L.setInitialRotationPoint (-0.0F,-0.0F,12.2F);
		Bone_Legg4_Tibia_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3379008F,0.0312492F,-0.0175102F,0.9404998F)).transpose());
		parts.put(Bone_Legg4_Tibia_L.boxName,Bone_Legg4_Tibia_L);
		
		Bone_Legg4_Tibia_R = new MCAModelRenderer(this, "Bone_Legg4_Tibia_R", 0 , 0);
		Bone_Legg4_Tibia_R.setInitialRotationPoint (-0.0F,0.0F,12.2F);
		Bone_Legg4_Tibia_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0674913F,-0.3325636F,0.5421306F,0.7687268F)).transpose());
		parts.put(Bone_Legg4_Tibia_R.boxName,Bone_Legg4_Tibia_R);
		
		Bone_Legg4_Trochanter_L = new MCAModelRenderer(this, "Bone_Legg4_Trochanter_L", 0 , 0);
		Bone_Legg4_Trochanter_L.setInitialRotationPoint (-5.9F,6.4F,7.8F);
		Bone_Legg4_Trochanter_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.8803838F,0.0197404F,-0.4722668F,0.038714F)).transpose());
		parts.put(Bone_Legg4_Trochanter_L.boxName,Bone_Legg4_Trochanter_L);
		
		Bone_Legg4_Trochanter_R = new MCAModelRenderer(this, "Bone_Legg4_Trochanter_R", 0 , 0);
		Bone_Legg4_Trochanter_R.setInitialRotationPoint (5.9F,6.4F,7.8F);
		Bone_Legg4_Trochanter_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.8774176F,0.0880211F,0.461872F,0.0952102F)).transpose());
		parts.put(Bone_Legg4_Trochanter_R.boxName,Bone_Legg4_Trochanter_R);
		
		BoneAbdomen = new MCAModelRenderer(this, "BoneAbdomen", 0 , 0);
		BoneAbdomen.setInitialRotationPoint (-0.0F,0.0F,4.1F);
		BoneAbdomen.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(1e-07F,-0.0F,0.0F,1.0F)).transpose());
		parts.put(BoneAbdomen.boxName,BoneAbdomen);
		
		BoneCarapace = new MCAModelRenderer(this, "BoneCarapace", 0 , 0);
		BoneCarapace.setInitialRotationPoint (-0.0F,-0.0F,16.0F);
		BoneCarapace.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.7071067F,-0.0F,0.0F,0.7071069F)).transpose());
		parts.put(BoneCarapace.boxName,BoneCarapace);
		
		BoneJoin = new MCAModelRenderer(this, "BoneJoin", 0 , 0);
		BoneJoin.setInitialRotationPoint (-0.0F,-0.0F,16.0F);
		BoneJoin.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-1e-07F,0.7071069F,0.7071066F,1e-07F)).transpose());
		parts.put(BoneJoin.boxName,BoneJoin);
		
		MasterBone = new MCAModelRenderer(this, "MasterBone", 0 , 0);
		MasterBone.setInitialRotationPoint (-0.0F,-8.0F,0.0F);
		MasterBone.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0F,0.7071069F,0.7071066F,0.0F)).transpose());
		parts.put(MasterBone.boxName,MasterBone);
		
		Pedipalp0_L = new MCAModelRenderer(this, "Pedipalp0_L", 0 , 0);
		Pedipalp0_L.setInitialRotationPoint (-5.3F,9.3F,32.6F);
		Pedipalp0_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3269513F,-0.0235201F,0.9447134F,-0.0081399F)).transpose());
		parts.put(Pedipalp0_L.boxName,Pedipalp0_L);
		
		Pedipalp0_R = new MCAModelRenderer(this, "Pedipalp0_R", 0 , 0);
		Pedipalp0_R.setInitialRotationPoint (5.3F,9.3F,32.6F);
		Pedipalp0_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3257818F,0.0362864F,-0.9443092F,0.0288046F)).transpose());
		parts.put(Pedipalp0_R.boxName,Pedipalp0_R);
		
		Pedipalp1_L = new MCAModelRenderer(this, "Pedipalp1_L", 0 , 0);
		Pedipalp1_L.setInitialRotationPoint (0.0F,0.0F,11.7F);
		Pedipalp1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3910275F,-0.0744096F,-0.0362191F,0.9166509F)).transpose());
		parts.put(Pedipalp1_L.boxName,Pedipalp1_L);
		
		Pedipalp1_R = new MCAModelRenderer(this, "Pedipalp1_R", 0 , 0);
		Pedipalp1_R.setInitialRotationPoint (-0.0F,0.0F,11.7F);
		Pedipalp1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3241725F,0.2309795F,0.3507275F,0.8476738F)).transpose());
		parts.put(Pedipalp1_R.boxName,Pedipalp1_R);
		
		Pedipalp2_L = new MCAModelRenderer(this, "Pedipalp2_L", 0 , 0);
		Pedipalp2_L.setInitialRotationPoint (-0.0F,-0.0F,20.7F);
		Pedipalp2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3709152F,-0.0971136F,-0.0497966F,0.9222316F)).transpose());
		parts.put(Pedipalp2_L.boxName,Pedipalp2_L);
		
		Pedipalp2_R = new MCAModelRenderer(this, "Pedipalp2_R", 0 , 0);
		Pedipalp2_R.setInitialRotationPoint (0.0F,0.0F,20.7F);
		Pedipalp2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.3783797F,-0.0619513F,-0.2831027F,0.8791154F)).transpose());
		parts.put(Pedipalp2_R.boxName,Pedipalp2_R);
		
		Pedipalp3_L = new MCAModelRenderer(this, "Pedipalp3_L", 0 , 0);
		Pedipalp3_L.setInitialRotationPoint (-0.0F,-0.0F,11.6F);
		Pedipalp3_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.42056F,-0.0278647F,0.0099464F,0.9067822F)).transpose());
		parts.put(Pedipalp3_L.boxName,Pedipalp3_L);
		
		Pedipalp3_R = new MCAModelRenderer(this, "Pedipalp3_R", 0 , 0);
		Pedipalp3_R.setInitialRotationPoint (-0.0F,0.0F,11.6F);
		Pedipalp3_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.4133086F,0.0826026F,-0.1756614F,0.8896607F)).transpose());
		parts.put(Pedipalp3_R.boxName,Pedipalp3_R);
		
		Pedipalp4_L = new MCAModelRenderer(this, "Pedipalp4_L", 0 , 0);
		Pedipalp4_L.setInitialRotationPoint (-0.0F,0.0F,12.9F);
		Pedipalp4_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0694646F,-0.0549251F,0.0621309F,0.9941316F)).transpose());
		parts.put(Pedipalp4_L.boxName,Pedipalp4_L);
		
		Pedipalp4_R = new MCAModelRenderer(this, "Pedipalp4_R", 0 , 0);
		Pedipalp4_R.setInitialRotationPoint (0.0F,0.0F,12.9F);
		Pedipalp4_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.056994F,0.0677774F,0.0498667F,0.9948222F)).transpose());
		parts.put(Pedipalp4_R.boxName,Pedipalp4_R);
		
		MasterBone.addChild(Bone);
		BoneCarapace.addChild(Bone_Chelicera_L);
		BoneCarapace.addChild(Bone_Chelicera_R);
		Bone_Chelicera_L.addChild(Bone_Fang_L);
		Bone_Chelicera_R.addChild(Bone_Fang_R);
		Bone_Legg1_Trochanter_L.addChild(Bone_Legg1_Femur_L);
		Bone_Legg1_Trochanter_R.addChild(Bone_Legg1_Femur_R);
		Bone_Legg1_Tibia_L.addChild(Bone_Legg1_Metatarsus_L);
		Bone_Legg1_Tibia_R.addChild(Bone_Legg1_Metatarsus_R);
		Bone_Legg1_Femur_L.addChild(Bone_Legg1_Patella_L);
		Bone_Legg1_Femur_R.addChild(Bone_Legg1_Patella_R);
		Bone_Legg1_Metatarsus_L.addChild(Bone_Legg1_Tarsus_L);
		Bone_Legg1_Metatarsus_R.addChild(Bone_Legg1_Tarsus_R);
		Bone_Legg1_Patella_L.addChild(Bone_Legg1_Tibia_L);
		Bone_Legg1_Patella_R.addChild(Bone_Legg1_Tibia_R);
		BoneCarapace.addChild(Bone_Legg1_Trochanter_L);
		BoneCarapace.addChild(Bone_Legg1_Trochanter_R);
		Bone_Legg2_Trochanter_L.addChild(Bone_Legg2_Femur_L);
		Bone_Legg2_Trochanter_R.addChild(Bone_Legg2_Femur_R);
		Bone_Legg2_Tibia_L.addChild(Bone_Legg2_Metatarsus_L);
		Bone_Legg2_Tibia_R.addChild(Bone_Legg2_Metatarsus_R);
		Bone_Legg2_Femur_L.addChild(Bone_Legg2_Patella_L);
		Bone_Legg2_Femur_R.addChild(Bone_Legg2_Patella_R);
		Bone_Legg2_Metatarsus_L.addChild(Bone_Legg2_Tarsus_L);
		Bone_Legg2_Metatarsus_R.addChild(Bone_Legg2_Tarsus_R);
		Bone_Legg2_Patella_L.addChild(Bone_Legg2_Tibia_L);
		Bone_Legg2_Patella_R.addChild(Bone_Legg2_Tibia_R);
		BoneCarapace.addChild(Bone_Legg2_Trochanter_L);
		BoneCarapace.addChild(Bone_Legg2_Trochanter_R);
		Bone_Legg3_Trochanter_L.addChild(Bone_Legg3_Femur_L);
		Bone_Legg3_Trochanter_R.addChild(Bone_Legg3_Femur_R);
		Bone_Legg3_Tibia_L.addChild(Bone_Legg3_Metatarsus_L);
		Bone_Legg3_Tibia_R.addChild(Bone_Legg3_Metatarsus_R);
		Bone_Legg3_Femur_L.addChild(Bone_Legg3_Patella_L);
		Bone_Legg3_Femur_R.addChild(Bone_Legg3_Patella_R);
		Bone_Legg3_Metatarsus_L.addChild(Bone_Legg3_Tarsus_L);
		Bone_Legg3_Metatarsus_R.addChild(Bone_Legg3_Tarsus_R);
		Bone_Legg3_Patella_L.addChild(Bone_Legg3_Tibia_L);
		Bone_Legg3_Patella_R.addChild(Bone_Legg3_Tibia_R);
		BoneCarapace.addChild(Bone_Legg3_Trochanter_L);
		BoneCarapace.addChild(Bone_Legg3_Trochanter_R);
		Bone_Legg4_Trochanter_L.addChild(Bone_Legg4_Femur_L);
		Bone_Legg4_Trochanter_R.addChild(Bone_Legg4_Femur_R);
		Bone_Legg4_Tibia_L.addChild(Bone_Legg4_Metatarsus_L);
		Bone_Legg4_Tibia_R.addChild(Bone_Legg4_Metatarsus_R);
		Bone_Legg4_Femur_L.addChild(Bone_Legg4_Patella_L);
		Bone_Legg4_Femur_R.addChild(Bone_Legg4_Patella_R);
		Bone_Legg4_Metatarsus_L.addChild(Bone_Legg4_Tarsus_L);
		Bone_Legg4_Metatarsus_R.addChild(Bone_Legg4_Tarsus_R);
		Bone_Legg4_Patella_L.addChild(Bone_Legg4_Tibia_L);
		Bone_Legg4_Patella_R.addChild(Bone_Legg4_Tibia_R);
		BoneCarapace.addChild(Bone_Legg4_Trochanter_L);
		BoneCarapace.addChild(Bone_Legg4_Trochanter_R);
		BoneJoin.addChild(BoneAbdomen);
		Bone.addChild(BoneCarapace);
		Bone.addChild(BoneJoin);
		BoneCarapace.addChild(Pedipalp0_L);
		BoneCarapace.addChild(Pedipalp0_R);
		Pedipalp0_L.addChild(Pedipalp1_L);
		Pedipalp0_R.addChild(Pedipalp1_R);
		Pedipalp1_L.addChild(Pedipalp2_L);
		Pedipalp1_R.addChild(Pedipalp2_R);
		Pedipalp2_L.addChild(Pedipalp3_L);
		Pedipalp2_R.addChild(Pedipalp3_R);
		Pedipalp3_L.addChild(Pedipalp4_L);
		Pedipalp3_R.addChild(Pedipalp4_R);
		
		Abdomen10_L = new MCAModelRenderer(this, "Abdomen10_L", 142 , 98);
		Abdomen10_L.mirror = false;
		Abdomen10_L.addBox (-8.5F,-9.0F,-4.0F,17,18,8);
		Abdomen10_L.setInitialRotationPoint (14.1F,-2.3F,20.5F);
		Abdomen10_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.7097718F,0.0482957F,0.7025184F,0.0189588F)).transpose());
		Abdomen10_L.setTextureSize( 256 , 256 );
		parts.put(Abdomen10_L.boxName,Abdomen10_L);
		BoneAbdomen.addChild(Abdomen10_L);
		
		Abdomen10_R = new MCAModelRenderer(this, "Abdomen10_R", 142 , 98);
		Abdomen10_R.mirror = true;
		Abdomen10_R.addBox (-8.5F,-9.0F,-4.0F,17,18,8);
		Abdomen10_R.setInitialRotationPoint (-14.1F,-2.3F,20.5F);
		Abdomen10_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.7097715F,-0.0482962F,-0.7025185F,0.0189621F)).transpose());
		Abdomen10_R.setTextureSize( 256 , 256 );
		parts.put(Abdomen10_R.boxName,Abdomen10_R);
		BoneAbdomen.addChild(Abdomen10_R);
		
		Abdomen11_L = new MCAModelRenderer(this, "Abdomen11_L", 142 , 124);
		Abdomen11_L.mirror = false;
		Abdomen11_L.addBox (-8.5F,-5.5F,-4.0F,17,11,8);
		Abdomen11_L.setInitialRotationPoint (10.0F,2.9F,34.5F);
		Abdomen11_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.5698258F,0.0405712F,0.8203403F,0.02635F)).transpose());
		Abdomen11_L.setTextureSize( 256 , 256 );
		parts.put(Abdomen11_L.boxName,Abdomen11_L);
		BoneAbdomen.addChild(Abdomen11_L);
		
		Abdomen11_R = new MCAModelRenderer(this, "Abdomen11_R", 142 , 124);
		Abdomen11_R.mirror = true;
		Abdomen11_R.addBox (-8.5F,-5.5F,-4.0F,17,11,8);
		Abdomen11_R.setInitialRotationPoint (-10.0F,2.9F,34.5F);
		Abdomen11_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.5698254F,-0.0405711F,-0.8203405F,0.0263536F)).transpose());
		Abdomen11_R.setTextureSize( 256 , 256 );
		parts.put(Abdomen11_R.boxName,Abdomen11_R);
		BoneAbdomen.addChild(Abdomen11_R);
		
		Abdomen1_L = new MCAModelRenderer(this, "Abdomen1_L", 98 , 155);
		Abdomen1_L.mirror = false;
		Abdomen1_L.addBox (-6.0F,-9.0F,-4.0F,12,18,8);
		Abdomen1_L.setInitialRotationPoint (4.7F,-10.0F,-0.4F);
		Abdomen1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0609396F,0.9470843F,-0.2995458F,0.0979284F)).transpose());
		Abdomen1_L.setTextureSize( 256 , 256 );
		parts.put(Abdomen1_L.boxName,Abdomen1_L);
		BoneAbdomen.addChild(Abdomen1_L);
		
		Abdomen1_R = new MCAModelRenderer(this, "Abdomen1_R", 98 , 155);
		Abdomen1_R.mirror = true;
		Abdomen1_R.addBox (-6.0F,-9.0F,-4.0F,12,18,8);
		Abdomen1_R.setInitialRotationPoint (-4.7F,-10.0F,-0.4F);
		Abdomen1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0609391F,-0.9470844F,0.2995459F,0.097928F)).transpose());
		Abdomen1_R.setTextureSize( 256 , 256 );
		parts.put(Abdomen1_R.boxName,Abdomen1_R);
		BoneAbdomen.addChild(Abdomen1_R);
		
		Abdomen2_L = new MCAModelRenderer(this, "Abdomen2_L", 98 , 132);
		Abdomen2_L.mirror = false;
		Abdomen2_L.addBox (-7.0F,-7.5F,-4.0F,14,15,8);
		Abdomen2_L.setInitialRotationPoint (5.1F,-18.2F,9.0F);
		Abdomen2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.101476F,0.7813774F,-0.6062537F,0.1077421F)).transpose());
		Abdomen2_L.setTextureSize( 256 , 256 );
		parts.put(Abdomen2_L.boxName,Abdomen2_L);
		BoneAbdomen.addChild(Abdomen2_L);
		
		Abdomen2_R = new MCAModelRenderer(this, "Abdomen2_R", 98 , 132);
		Abdomen2_R.mirror = true;
		Abdomen2_R.addBox (-7.0F,-7.5F,-4.0F,14,15,8);
		Abdomen2_R.setInitialRotationPoint (-5.1F,-18.2F,9.0F);
		Abdomen2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1014759F,-0.7813772F,0.6062541F,0.1077423F)).transpose());
		Abdomen2_R.setTextureSize( 256 , 256 );
		parts.put(Abdomen2_R.boxName,Abdomen2_R);
		BoneAbdomen.addChild(Abdomen2_R);
		
		Abdomen3_L = new MCAModelRenderer(this, "Abdomen3_L", 98 , 58);
		Abdomen3_L.mirror = false;
		Abdomen3_L.addBox (-7.0F,-7.5F,-4.0F,14,15,8);
		Abdomen3_L.setInitialRotationPoint (5.1F,-18.2F,21.5F);
		Abdomen3_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1488233F,0.6205936F,-0.7605658F,0.1193939F)).transpose());
		Abdomen3_L.setTextureSize( 256 , 256 );
		parts.put(Abdomen3_L.boxName,Abdomen3_L);
		BoneAbdomen.addChild(Abdomen3_L);
		
		Abdomen3_R = new MCAModelRenderer(this, "Abdomen3_R", 98 , 58);
		Abdomen3_R.mirror = true;
		Abdomen3_R.addBox (-7.0F,-7.5F,-4.0F,14,15,8);
		Abdomen3_R.setInitialRotationPoint (-5.1F,-18.2F,21.5F);
		Abdomen3_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1488231F,-0.6205934F,0.7605661F,0.1193937F)).transpose());
		Abdomen3_R.setTextureSize( 256 , 256 );
		parts.put(Abdomen3_R.boxName,Abdomen3_R);
		BoneAbdomen.addChild(Abdomen3_R);
		
		Abdomen4_L = new MCAModelRenderer(this, "Abdomen4_L", 98 , 104);
		Abdomen4_L.mirror = false;
		Abdomen4_L.addBox (-7.0F,-10.0F,-4.0F,14,20,8);
		Abdomen4_L.setInitialRotationPoint (5.2F,-10.6F,34.1F);
		Abdomen4_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1745215F,0.4041344F,-0.8945794F,0.077107F)).transpose());
		Abdomen4_L.setTextureSize( 256 , 256 );
		parts.put(Abdomen4_L.boxName,Abdomen4_L);
		BoneAbdomen.addChild(Abdomen4_L);
		
		Abdomen4_R = new MCAModelRenderer(this, "Abdomen4_R", 98 , 104);
		Abdomen4_R.mirror = true;
		Abdomen4_R.addBox (-7.0F,-10.0F,-4.0F,14,20,8);
		Abdomen4_R.setInitialRotationPoint (-5.2F,-10.6F,34.1F);
		Abdomen4_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1745213F,-0.4041338F,0.8945798F,0.0771068F)).transpose());
		Abdomen4_R.setTextureSize( 256 , 256 );
		parts.put(Abdomen4_R.boxName,Abdomen4_R);
		BoneAbdomen.addChild(Abdomen4_R);
		
		Abdomen5_L = new MCAModelRenderer(this, "Abdomen5_L", 98 , 81);
		Abdomen5_L.mirror = false;
		Abdomen5_L.addBox (-7.0F,-7.5F,-4.0F,14,15,8);
		Abdomen5_L.setInitialRotationPoint (4.9F,-0.6F,40.7F);
		Abdomen5_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1721663F,0.1297973F,-0.971853F,0.0949377F)).transpose());
		Abdomen5_L.setTextureSize( 256 , 256 );
		parts.put(Abdomen5_L.boxName,Abdomen5_L);
		BoneAbdomen.addChild(Abdomen5_L);
		
		Abdomen5_R = new MCAModelRenderer(this, "Abdomen5_R", 98 , 81);
		Abdomen5_R.mirror = true;
		Abdomen5_R.addBox (-7.0F,-7.5F,-4.0F,14,15,8);
		Abdomen5_R.setInitialRotationPoint (-4.9F,-0.6F,40.7F);
		Abdomen5_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1721659F,-0.1297963F,0.9718533F,0.0949375F)).transpose());
		Abdomen5_R.setTextureSize( 256 , 256 );
		parts.put(Abdomen5_R.boxName,Abdomen5_R);
		BoneAbdomen.addChild(Abdomen5_R);
		
		Abdomen6_L = new MCAModelRenderer(this, "Abdomen6_L", 151 , 0);
		Abdomen6_L.mirror = false;
		Abdomen6_L.addBox (-7.0F,-7.5F,-4.0F,14,15,8);
		Abdomen6_L.setInitialRotationPoint (12.0F,-11.6F,11.0F);
		Abdomen6_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3927928F,0.7047955F,-0.4402851F,0.3938609F)).transpose());
		Abdomen6_L.setTextureSize( 256 , 256 );
		parts.put(Abdomen6_L.boxName,Abdomen6_L);
		BoneAbdomen.addChild(Abdomen6_L);
		
		Abdomen6_R = new MCAModelRenderer(this, "Abdomen6_R", 151 , 0);
		Abdomen6_R.mirror = true;
		Abdomen6_R.addBox (-7.0F,-7.5F,-4.0F,14,15,8);
		Abdomen6_R.setInitialRotationPoint (-12.0F,-11.6F,11.0F);
		Abdomen6_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3927923F,-0.7047956F,0.4402854F,0.3938607F)).transpose());
		Abdomen6_R.setTextureSize( 256 , 256 );
		parts.put(Abdomen6_R.boxName,Abdomen6_R);
		BoneAbdomen.addChild(Abdomen6_R);
		
		Abdomen7_L = new MCAModelRenderer(this, "Abdomen7_L", 151 , 23);
		Abdomen7_L.mirror = false;
		Abdomen7_L.addBox (-7.0F,-7.5F,-4.0F,14,15,8);
		Abdomen7_L.setInitialRotationPoint (12.7F,-12.3F,20.6F);
		Abdomen7_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4532387F,0.5034585F,-0.6233826F,0.3905106F)).transpose());
		Abdomen7_L.setTextureSize( 256 , 256 );
		parts.put(Abdomen7_L.boxName,Abdomen7_L);
		BoneAbdomen.addChild(Abdomen7_L);
		
		Abdomen7_R = new MCAModelRenderer(this, "Abdomen7_R", 151 , 23);
		Abdomen7_R.mirror = true;
		Abdomen7_R.addBox (-7.0F,-7.5F,-4.0F,14,15,8);
		Abdomen7_R.setInitialRotationPoint (-12.7F,-12.3F,20.6F);
		Abdomen7_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4532382F,-0.5034586F,0.623383F,0.3905104F)).transpose());
		Abdomen7_R.setTextureSize( 256 , 256 );
		parts.put(Abdomen7_R.boxName,Abdomen7_R);
		BoneAbdomen.addChild(Abdomen7_R);
		
		Abdomen8_L = new MCAModelRenderer(this, "Abdomen8_L", 151 , 46);
		Abdomen8_L.mirror = false;
		Abdomen8_L.addBox (-7.0F,-9.0F,-4.0F,14,18,8);
		Abdomen8_L.setInitialRotationPoint (11.1F,-6.0F,31.9F);
		Abdomen8_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4895446F,0.3031534F,-0.7311449F,0.3658842F)).transpose());
		Abdomen8_L.setTextureSize( 256 , 256 );
		parts.put(Abdomen8_L.boxName,Abdomen8_L);
		BoneAbdomen.addChild(Abdomen8_L);
		
		Abdomen8_R = new MCAModelRenderer(this, "Abdomen8_R", 151 , 46);
		Abdomen8_R.mirror = true;
		Abdomen8_R.addBox (-7.0F,-9.0F,-4.0F,14,18,8);
		Abdomen8_R.setInitialRotationPoint (-11.1F,-6.0F,31.9F);
		Abdomen8_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4895444F,-0.3031534F,0.7311452F,0.3658841F)).transpose());
		Abdomen8_R.setTextureSize( 256 , 256 );
		parts.put(Abdomen8_R.boxName,Abdomen8_R);
		BoneAbdomen.addChild(Abdomen8_R);
		
		Abdomen9_L = new MCAModelRenderer(this, "Abdomen9_L", 142 , 72);
		Abdomen9_L.mirror = false;
		Abdomen9_L.addBox (-8.5F,-9.0F,-4.0F,17,18,8);
		Abdomen9_L.setInitialRotationPoint (11.0F,-3.8F,5.8F);
		Abdomen9_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.8623375F,-0.0600667F,-0.5027579F,-0.0008258F)).transpose());
		Abdomen9_L.setTextureSize( 256 , 256 );
		parts.put(Abdomen9_L.boxName,Abdomen9_L);
		BoneAbdomen.addChild(Abdomen9_L);
		
		Abdomen9_R = new MCAModelRenderer(this, "Abdomen9_R", 142 , 72);
		Abdomen9_R.mirror = true;
		Abdomen9_R.addBox (-8.5F,-9.0F,-4.0F,17,18,8);
		Abdomen9_R.setInitialRotationPoint (-11.0F,-3.8F,5.8F);
		Abdomen9_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.8623373F,0.0600665F,0.5027581F,-0.0008258F)).transpose());
		Abdomen9_R.setTextureSize( 256 , 256 );
		parts.put(Abdomen9_R.boxName,Abdomen9_R);
		BoneAbdomen.addChild(Abdomen9_R);
		
		AbdomenBottom = new MCAModelRenderer(this, "AbdomenBottom", 89 , 1);
		AbdomenBottom.mirror = false;
		AbdomenBottom.addBox (-10.5F,-22.0F,-5.0F,21,44,10);
		AbdomenBottom.setInitialRotationPoint (0.0F,4.4F,21.2F);
		AbdomenBottom.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7071068F,-2e-07F,2e-07F,0.7071067F)).transpose());
		AbdomenBottom.setTextureSize( 256 , 256 );
		parts.put(AbdomenBottom.boxName,AbdomenBottom);
		BoneAbdomen.addChild(AbdomenBottom);
		
		Carapace0_L = new MCAModelRenderer(this, "Carapace0_L", 58 , 91);
		Carapace0_L.mirror = false;
		Carapace0_L.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Carapace0_L.setInitialRotationPoint (-1.9F,-13.2F,33.2F);
		Carapace0_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0679943F,0.4875921F,-0.869724F,0.0347971F)).transpose());
		Carapace0_L.setTextureSize( 256 , 256 );
		parts.put(Carapace0_L.boxName,Carapace0_L);
		BoneCarapace.addChild(Carapace0_L);
		
		Carapace0_R = new MCAModelRenderer(this, "Carapace0_R", 58 , 91);
		Carapace0_R.mirror = true;
		Carapace0_R.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Carapace0_R.setInitialRotationPoint (1.9F,-13.2F,33.2F);
		Carapace0_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0679947F,-0.4875919F,0.8697241F,0.0347979F)).transpose());
		Carapace0_R.setTextureSize( 256 , 256 );
		parts.put(Carapace0_R.boxName,Carapace0_R);
		BoneCarapace.addChild(Carapace0_R);
		
		Carapace1_L = new MCAModelRenderer(this, "Carapace1_L", 58 , 91);
		Carapace1_L.mirror = false;
		Carapace1_L.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Carapace1_L.setInitialRotationPoint (-4.5F,-13.2F,31.8F);
		Carapace1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2585499F,0.4678404F,-0.8331838F,0.1417109F)).transpose());
		Carapace1_L.setTextureSize( 256 , 256 );
		parts.put(Carapace1_L.boxName,Carapace1_L);
		BoneCarapace.addChild(Carapace1_L);
		
		Carapace1_R = new MCAModelRenderer(this, "Carapace1_R", 58 , 91);
		Carapace1_R.mirror = true;
		Carapace1_R.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Carapace1_R.setInitialRotationPoint (4.5F,-13.2F,31.8F);
		Carapace1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.2585502F,-0.4678404F,0.8331838F,0.141711F)).transpose());
		Carapace1_R.setTextureSize( 256 , 256 );
		parts.put(Carapace1_R.boxName,Carapace1_R);
		BoneCarapace.addChild(Carapace1_R);
		
		Carapace2_L = new MCAModelRenderer(this, "Carapace2_L", 58 , 119);
		Carapace2_L.mirror = false;
		Carapace2_L.addBox (-6.0F,-10.0F,-4.0F,12,20,8);
		Carapace2_L.setInitialRotationPoint (-8.3F,-11.4F,26.6F);
		Carapace2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.4801946F,0.50883F,-0.7043085F,0.1202277F)).transpose());
		Carapace2_L.setTextureSize( 256 , 256 );
		parts.put(Carapace2_L.boxName,Carapace2_L);
		BoneCarapace.addChild(Carapace2_L);
		
		Carapace2_R = new MCAModelRenderer(this, "Carapace2_R", 58 , 119);
		Carapace2_R.mirror = true;
		Carapace2_R.addBox (-6.0F,-10.0F,-4.0F,12,20,8);
		Carapace2_R.setInitialRotationPoint (8.3F,-11.4F,26.6F);
		Carapace2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.4801947F,-0.5088301F,0.7043085F,0.1202279F)).transpose());
		Carapace2_R.setTextureSize( 256 , 256 );
		parts.put(Carapace2_R.boxName,Carapace2_R);
		BoneCarapace.addChild(Carapace2_R);
		
		Carapace3_L = new MCAModelRenderer(this, "Carapace3_L", 58 , 119);
		Carapace3_L.mirror = false;
		Carapace3_L.addBox (-6.0F,-10.0F,-4.0F,12,20,8);
		Carapace3_L.setInitialRotationPoint (-10.4F,-10.1F,21.4F);
		Carapace3_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.6270426F,0.3939143F,-0.5774556F,0.3437938F)).transpose());
		Carapace3_L.setTextureSize( 256 , 256 );
		parts.put(Carapace3_L.boxName,Carapace3_L);
		BoneCarapace.addChild(Carapace3_L);
		
		Carapace3_R = new MCAModelRenderer(this, "Carapace3_R", 58 , 119);
		Carapace3_R.mirror = true;
		Carapace3_R.addBox (-6.0F,-10.0F,-4.0F,12,20,8);
		Carapace3_R.setInitialRotationPoint (10.4F,-10.1F,21.4F);
		Carapace3_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.6270427F,-0.3939144F,0.5774556F,0.3437938F)).transpose());
		Carapace3_R.setTextureSize( 256 , 256 );
		parts.put(Carapace3_R.boxName,Carapace3_R);
		BoneCarapace.addChild(Carapace3_R);
		
		Carapace4_L = new MCAModelRenderer(this, "Carapace4_L", 58 , 119);
		Carapace4_L.mirror = false;
		Carapace4_L.addBox (-6.0F,-10.0F,-4.0F,12,20,8);
		Carapace4_L.setInitialRotationPoint (-9.1F,-10.6F,14.8F);
		Carapace4_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.7375453F,0.2007318F,-0.4273923F,0.4827727F)).transpose());
		Carapace4_L.setTextureSize( 256 , 256 );
		parts.put(Carapace4_L.boxName,Carapace4_L);
		BoneCarapace.addChild(Carapace4_L);
		
		Carapace4_R = new MCAModelRenderer(this, "Carapace4_R", 58 , 119);
		Carapace4_R.mirror = true;
		Carapace4_R.addBox (-6.0F,-10.0F,-4.0F,12,20,8);
		Carapace4_R.setInitialRotationPoint (9.1F,-10.6F,14.8F);
		Carapace4_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.7375455F,-0.2007318F,0.4273922F,0.4827726F)).transpose());
		Carapace4_R.setTextureSize( 256 , 256 );
		parts.put(Carapace4_R.boxName,Carapace4_R);
		BoneCarapace.addChild(Carapace4_R);
		
		CarapaceBack = new MCAModelRenderer(this, "CarapaceBack", 58 , 147);
		CarapaceBack.mirror = false;
		CarapaceBack.addBox (-6.0F,-13.0F,-4.0F,12,26,8);
		CarapaceBack.setInitialRotationPoint (0.0F,-13.4F,13.4F);
		CarapaceBack.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.7986852F,-1e-07F,-0.0F,0.6017491F)).transpose());
		CarapaceBack.setTextureSize( 256 , 256 );
		parts.put(CarapaceBack.boxName,CarapaceBack);
		BoneCarapace.addChild(CarapaceBack);
		
		Chelicera_L = new MCAModelRenderer(this, "Chelicera_L", 61 , 71);
		Chelicera_L.mirror = false;
		Chelicera_L.addBox (-3.5F,-6.5F,-3.5F,7,13,7);
		Chelicera_L.setInitialRotationPoint (-0.6F,-0.8F,4.3F);
		Chelicera_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6545973F,0.0964403F,-0.0898646F,0.7443964F)).transpose());
		Chelicera_L.setTextureSize( 256 , 256 );
		parts.put(Chelicera_L.boxName,Chelicera_L);
		Bone_Chelicera_L.addChild(Chelicera_L);
		
		Chelicera_R = new MCAModelRenderer(this, "Chelicera_R", 61 , 71);
		Chelicera_R.mirror = true;
		Chelicera_R.addBox (-3.5F,-6.5F,-3.5F,7,13,7);
		Chelicera_R.setInitialRotationPoint (0.7F,-0.7F,4.3F);
		Chelicera_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6502123F,-0.1225549F,0.1195771F,0.7402064F)).transpose());
		Chelicera_R.setTextureSize( 256 , 256 );
		parts.put(Chelicera_R.boxName,Chelicera_R);
		Bone_Chelicera_R.addChild(Chelicera_R);
		
		Eye1 = new MCAModelRenderer(this, "Eye1", 0 , 0);
		Eye1.mirror = false;
		Eye1.addBox (-0.5F,-0.5F,-0.5F,1,1,1);
		Eye1.setInitialRotationPoint (-1.4F,-14.1F,39.6F);
		Eye1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1360108F,-0.6001759F,0.7881207F,0.0124724F)).transpose());
		Eye1.setTextureSize( 256 , 256 );
		parts.put(Eye1.boxName,Eye1);
		BoneCarapace.addChild(Eye1);
		
		Eye1mirror = new MCAModelRenderer(this, "Eye1mirror", 0 , 0);
		Eye1mirror.mirror = true;
		Eye1mirror.addBox (-0.5F,-0.5F,-0.5F,1,1,1);
		Eye1mirror.setInitialRotationPoint (1.4F,-14.1F,39.6F);
		Eye1mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1360109F,0.6001762F,-0.7881206F,0.0124706F)).transpose());
		Eye1mirror.setTextureSize( 256 , 256 );
		parts.put(Eye1mirror.boxName,Eye1mirror);
		BoneCarapace.addChild(Eye1mirror);
		
		Eye2 = new MCAModelRenderer(this, "Eye2", 0 , 0);
		Eye2.mirror = false;
		Eye2.addBox (-0.5F,-0.5F,-0.5F,1,1,1);
		Eye2.setInitialRotationPoint (-4.6F,-13.3F,40.1F);
		Eye2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1360108F,-0.6001759F,0.7881207F,0.0124724F)).transpose());
		Eye2.setTextureSize( 256 , 256 );
		parts.put(Eye2.boxName,Eye2);
		BoneCarapace.addChild(Eye2);
		
		Eye2mirror = new MCAModelRenderer(this, "Eye2mirror", 0 , 0);
		Eye2mirror.mirror = true;
		Eye2mirror.addBox (-0.5F,-0.5F,-0.5F,1,1,1);
		Eye2mirror.setInitialRotationPoint (4.6F,-13.3F,40.1F);
		Eye2mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1360109F,0.6001762F,-0.7881206F,0.0124706F)).transpose());
		Eye2mirror.setTextureSize( 256 , 256 );
		parts.put(Eye2mirror.boxName,Eye2mirror);
		BoneCarapace.addChild(Eye2mirror);
		
		Eye3 = new MCAModelRenderer(this, "Eye3", 0 , 0);
		Eye3.mirror = false;
		Eye3.addBox (-0.5F,-0.5F,-0.5F,1,1,1);
		Eye3.setInitialRotationPoint (-2.8F,-12.9F,40.4F);
		Eye3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1360108F,-0.6001759F,0.7881207F,0.0124724F)).transpose());
		Eye3.setTextureSize( 256 , 256 );
		parts.put(Eye3.boxName,Eye3);
		BoneCarapace.addChild(Eye3);
		
		Eye3mirror = new MCAModelRenderer(this, "Eye3mirror", 0 , 0);
		Eye3mirror.mirror = true;
		Eye3mirror.addBox (-0.5F,-0.5F,-0.5F,1,1,1);
		Eye3mirror.setInitialRotationPoint (2.8F,-12.9F,40.4F);
		Eye3mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1360109F,0.6001762F,-0.7881206F,0.0124706F)).transpose());
		Eye3mirror.setTextureSize( 256 , 256 );
		parts.put(Eye3mirror.boxName,Eye3mirror);
		BoneCarapace.addChild(Eye3mirror);
		
		Eye4 = new MCAModelRenderer(this, "Eye4", 0 , 0);
		Eye4.mirror = false;
		Eye4.addBox (-0.5F,-0.5F,-0.5F,1,1,1);
		Eye4.setInitialRotationPoint (-1.4F,-12.8F,40.7F);
		Eye4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1360108F,-0.6001759F,0.7881207F,0.0124724F)).transpose());
		Eye4.setTextureSize( 256 , 256 );
		parts.put(Eye4.boxName,Eye4);
		BoneCarapace.addChild(Eye4);
		
		Eye4mirror = new MCAModelRenderer(this, "Eye4mirror", 0 , 0);
		Eye4mirror.mirror = true;
		Eye4mirror.addBox (-0.5F,-0.5F,-0.5F,1,1,1);
		Eye4mirror.setInitialRotationPoint (1.4F,-12.8F,40.7F);
		Eye4mirror.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1360109F,0.6001762F,-0.7881206F,0.0124706F)).transpose());
		Eye4mirror.setTextureSize( 256 , 256 );
		parts.put(Eye4mirror.boxName,Eye4mirror);
		BoneCarapace.addChild(Eye4mirror);
		
		fang0_L = new MCAModelRenderer(this, "fang0_L", 68 , 56);
		fang0_L.mirror = false;
		fang0_L.addBox (-2.0F,-2.5F,-2.0F,4,5,4);
		fang0_L.setInitialRotationPoint (0.3F,0.2F,2.4F);
		fang0_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0949419F,0.7638727F,-0.6280609F,0.1141229F)).transpose());
		fang0_L.setTextureSize( 256 , 256 );
		parts.put(fang0_L.boxName,fang0_L);
		Bone_Fang_L.addChild(fang0_L);
		
		fang0_R = new MCAModelRenderer(this, "fang0_R", 68 , 56);
		fang0_R.mirror = true;
		fang0_R.addBox (-2.0F,-2.5F,-2.0F,4,5,4);
		fang0_R.setInitialRotationPoint (-0.4F,-0.0F,2.4F);
		fang0_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1864452F,0.7468292F,-0.6270307F,0.1196533F)).transpose());
		fang0_R.setTextureSize( 256 , 256 );
		parts.put(fang0_R.boxName,fang0_R);
		Bone_Fang_R.addChild(fang0_R);
		
		fang1_L = new MCAModelRenderer(this, "fang1_L", 68 , 65);
		fang1_L.mirror = false;
		fang1_L.addBox (-1.5F,-1.5F,-1.5F,3,3,3);
		fang1_L.setInitialRotationPoint (0.3F,-0.5F,5.3F);
		fang1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0697744F,0.6203328F,-0.7701619F,0.1310323F)).transpose());
		fang1_L.setTextureSize( 256 , 256 );
		parts.put(fang1_L.boxName,fang1_L);
		Bone_Fang_L.addChild(fang1_L);
		
		fang1_R = new MCAModelRenderer(this, "fang1_R", 68 , 65);
		fang1_R.mirror = true;
		fang1_R.addBox (-1.5F,-1.5F,-1.5F,3,3,3);
		fang1_R.setInitialRotationPoint (0.1F,-0.6F,5.3F);
		fang1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1582457F,0.6038541F,-0.7656901F,0.1550389F)).transpose());
		fang1_R.setTextureSize( 256 , 256 );
		parts.put(fang1_R.boxName,fang1_R);
		Bone_Fang_R.addChild(fang1_R);
		
		fang2_L = new MCAModelRenderer(this, "fang2_L", 64 , 56);
		fang2_L.mirror = false;
		fang2_L.addBox (-1.0F,-1.0F,-1.0F,2,2,2);
		fang2_L.setInitialRotationPoint (0.1F,-0.3F,7.6F);
		fang2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0612248F,0.5696475F,-0.8083711F,0.1352386F)).transpose());
		fang2_L.setTextureSize( 256 , 256 );
		parts.put(fang2_L.boxName,fang2_L);
		Bone_Fang_L.addChild(fang2_L);
		
		fang2_R = new MCAModelRenderer(this, "fang2_R", 64 , 56);
		fang2_R.mirror = true;
		fang2_R.addBox (-1.0F,-1.0F,-1.0F,2,2,2);
		fang2_R.setInitialRotationPoint (0.1F,-0.3F,7.6F);
		fang2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1479737F,0.5534894F,-0.8028516F,0.1648713F)).transpose());
		fang2_R.setTextureSize( 256 , 256 );
		parts.put(fang2_R.boxName,fang2_R);
		Bone_Fang_R.addChild(fang2_R);
		
		fang3_L = new MCAModelRenderer(this, "fang3_L", 64 , 64);
		fang3_L.mirror = false;
		fang3_L.addBox (-0.5F,-2.0F,-0.5F,1,4,1);
		fang3_L.setInitialRotationPoint (-0.0F,-0.1F,9.4F);
		fang3_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0573653F,0.5464953F,-0.8241996F,0.1369204F)).transpose());
		fang3_L.setTextureSize( 256 , 256 );
		parts.put(fang3_L.boxName,fang3_L);
		Bone_Fang_L.addChild(fang3_L);
		
		fang3_R = new MCAModelRenderer(this, "fang3_R", 64 , 64);
		fang3_R.mirror = true;
		fang3_R.addBox (-0.5F,-2.0F,-0.5F,1,4,1);
		fang3_R.setInitialRotationPoint (0.1F,-0.1F,9.4F);
		fang3_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1432387F,0.5305004F,-0.818224F,0.1690012F)).transpose());
		fang3_R.setTextureSize( 256 , 256 );
		parts.put(fang3_R.boxName,fang3_R);
		Bone_Fang_R.addChild(fang3_R);
		
		Legg1_Femur_L = new MCAModelRenderer(this, "Legg1_Femur_L", 29 , 84);
		Legg1_Femur_L.mirror = false;
		Legg1_Femur_L.addBox (-3.5F,-8.0F,-3.5F,7,16,7);
		Legg1_Femur_L.setInitialRotationPoint (0.1F,0.5F,6.9F);
		Legg1_Femur_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7684455F,-0.0372281F,0.0233348F,0.6384053F)).transpose());
		Legg1_Femur_L.setTextureSize( 256 , 256 );
		parts.put(Legg1_Femur_L.boxName,Legg1_Femur_L);
		Bone_Legg1_Femur_L.addChild(Legg1_Femur_L);
		
		Legg1_Femur_R = new MCAModelRenderer(this, "Legg1_Femur_R", 29 , 84);
		Legg1_Femur_R.mirror = true;
		Legg1_Femur_R.addBox (-3.5F,-8.0F,-3.5F,7,16,7);
		Legg1_Femur_R.setInitialRotationPoint (0.5F,0.0F,6.9F);
		Legg1_Femur_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5090196F,0.5768819F,-0.4739617F,0.4283301F)).transpose());
		Legg1_Femur_R.setTextureSize( 256 , 256 );
		parts.put(Legg1_Femur_R.boxName,Legg1_Femur_R);
		Bone_Legg1_Femur_R.addChild(Legg1_Femur_R);
		
		Legg1_Join1_L = new MCAModelRenderer(this, "Legg1_Join1_L", 52 , 56);
		Legg1_Join1_L.mirror = false;
		Legg1_Join1_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg1_Join1_L.setInitialRotationPoint (0.6F,-1.1F,19.6F);
		Legg1_Join1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7605764F,-0.0327965F,-0.0096638F,0.6483477F)).transpose());
		Legg1_Join1_L.setTextureSize( 256 , 256 );
		parts.put(Legg1_Join1_L.boxName,Legg1_Join1_L);
		Bone_Legg1_Trochanter_L.addChild(Legg1_Join1_L);
		
		Legg1_Join1_R = new MCAModelRenderer(this, "Legg1_Join1_R", 52 , 56);
		Legg1_Join1_R.mirror = true;
		Legg1_Join1_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg1_Join1_R.setInitialRotationPoint (-0.9F,-0.9F,19.6F);
		Legg1_Join1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7479057F,0.1420744F,-0.083885F,0.6429738F)).transpose());
		Legg1_Join1_R.setTextureSize( 256 , 256 );
		parts.put(Legg1_Join1_R.boxName,Legg1_Join1_R);
		Bone_Legg1_Trochanter_R.addChild(Legg1_Join1_R);
		
		Legg1_Join2_L = new MCAModelRenderer(this, "Legg1_Join2_L", 52 , 56);
		Legg1_Join2_L.mirror = false;
		Legg1_Join2_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg1_Join2_L.setInitialRotationPoint (0.1F,0.7F,15.6F);
		Legg1_Join2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4502858F,-0.0295418F,-0.0351409F,0.8917035F)).transpose());
		Legg1_Join2_L.setTextureSize( 256 , 256 );
		parts.put(Legg1_Join2_L.boxName,Legg1_Join2_L);
		Bone_Legg1_Femur_L.addChild(Legg1_Join2_L);
		
		Legg1_Join2_R = new MCAModelRenderer(this, "Legg1_Join2_R", 52 , 56);
		Legg1_Join2_R.mirror = true;
		Legg1_Join2_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg1_Join2_R.setInitialRotationPoint (0.7F,0.1F,15.6F);
		Legg1_Join2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.292728F,0.3434201F,-0.6148033F,0.6468307F)).transpose());
		Legg1_Join2_R.setTextureSize( 256 , 256 );
		parts.put(Legg1_Join2_R.boxName,Legg1_Join2_R);
		Bone_Legg1_Femur_R.addChild(Legg1_Join2_R);
		
		Legg1_Join3_L = new MCAModelRenderer(this, "Legg1_Join3_L", 52 , 56);
		Legg1_Join3_L.mirror = false;
		Legg1_Join3_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg1_Join3_L.setInitialRotationPoint (-0.2F,0.4F,13.1F);
		Legg1_Join3_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5353335F,-0.0252331F,0.0122416F,0.844175F)).transpose());
		Legg1_Join3_L.setTextureSize( 256 , 256 );
		parts.put(Legg1_Join3_L.boxName,Legg1_Join3_L);
		Bone_Legg1_Patella_L.addChild(Legg1_Join3_L);
		
		Legg1_Join3_R = new MCAModelRenderer(this, "Legg1_Join3_R", 52 , 56);
		Legg1_Join3_R.mirror = true;
		Legg1_Join3_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg1_Join3_R.setInitialRotationPoint (-0.0F,0.4F,13.1F);
		Legg1_Join3_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5298436F,-0.0805545F,0.1540314F,0.8300911F)).transpose());
		Legg1_Join3_R.setTextureSize( 256 , 256 );
		parts.put(Legg1_Join3_R.boxName,Legg1_Join3_R);
		Bone_Legg1_Patella_R.addChild(Legg1_Join3_R);
		
		Legg1_Join4_L = new MCAModelRenderer(this, "Legg1_Join4_L", 52 , 56);
		Legg1_Join4_L.mirror = false;
		Legg1_Join4_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg1_Join4_L.setInitialRotationPoint (-0.1F,0.6F,16.9F);
		Legg1_Join4_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6670134F,-0.0512376F,0.0276689F,0.7427667F)).transpose());
		Legg1_Join4_L.setTextureSize( 256 , 256 );
		parts.put(Legg1_Join4_L.boxName,Legg1_Join4_L);
		Bone_Legg1_Tibia_L.addChild(Legg1_Join4_L);
		
		Legg1_Join4_R = new MCAModelRenderer(this, "Legg1_Join4_R", 52 , 56);
		Legg1_Join4_R.mirror = true;
		Legg1_Join4_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg1_Join4_R.setInitialRotationPoint (-0.6F,0.1F,16.9F);
		Legg1_Join4_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4940095F,-0.4510964F,0.5224454F,0.5286942F)).transpose());
		Legg1_Join4_R.setTextureSize( 256 , 256 );
		parts.put(Legg1_Join4_R.boxName,Legg1_Join4_R);
		Bone_Legg1_Tibia_R.addChild(Legg1_Join4_R);
		
		Legg1_Join5_L = new MCAModelRenderer(this, "Legg1_Join5_L", 52 , 56);
		Legg1_Join5_L.mirror = false;
		Legg1_Join5_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg1_Join5_L.setInitialRotationPoint (-0.5F,0.9F,16.2F);
		Legg1_Join5_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7913567F,-0.0530829F,0.0441905F,0.6074405F)).transpose());
		Legg1_Join5_L.setTextureSize( 256 , 256 );
		parts.put(Legg1_Join5_L.boxName,Legg1_Join5_L);
		Bone_Legg1_Metatarsus_L.addChild(Legg1_Join5_L);
		
		Legg1_Join5_R = new MCAModelRenderer(this, "Legg1_Join5_R", 52 , 56);
		Legg1_Join5_R.mirror = true;
		Legg1_Join5_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg1_Join5_R.setInitialRotationPoint (-1.0F,0.3F,16.2F);
		Legg1_Join5_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.522112F,-0.5970438F,0.4561978F,0.4035112F)).transpose());
		Legg1_Join5_R.setTextureSize( 256 , 256 );
		parts.put(Legg1_Join5_R.boxName,Legg1_Join5_R);
		Bone_Legg1_Metatarsus_R.addChild(Legg1_Join5_R);
		
		Legg1_Metatarsus_L = new MCAModelRenderer(this, "Legg1_Metatarsus_L", 31 , 146);
		Legg1_Metatarsus_L.mirror = false;
		Legg1_Metatarsus_L.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg1_Metatarsus_L.setInitialRotationPoint (-0.3F,0.6F,7.8F);
		Legg1_Metatarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7124615F,-0.0473752F,0.0502622F,0.6983036F)).transpose());
		Legg1_Metatarsus_L.setTextureSize( 256 , 256 );
		parts.put(Legg1_Metatarsus_L.boxName,Legg1_Metatarsus_L);
		Bone_Legg1_Metatarsus_L.addChild(Legg1_Metatarsus_L);
		
		Legg1_Metatarsus_R = new MCAModelRenderer(this, "Legg1_Metatarsus_R", 31 , 146);
		Legg1_Metatarsus_R.mirror = true;
		Legg1_Metatarsus_R.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg1_Metatarsus_R.setInitialRotationPoint (-0.6F,0.2F,7.8F);
		Legg1_Metatarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4697293F,-0.5377724F,0.5247653F,0.4634401F)).transpose());
		Legg1_Metatarsus_R.setTextureSize( 256 , 256 );
		parts.put(Legg1_Metatarsus_R.boxName,Legg1_Metatarsus_R);
		Bone_Legg1_Metatarsus_R.addChild(Legg1_Metatarsus_R);
		
		Legg1_Patella_L = new MCAModelRenderer(this, "Legg1_Patella_L", 29 , 107);
		Legg1_Patella_L.mirror = false;
		Legg1_Patella_L.addBox (-3.5F,-6.0F,-3.5F,7,12,7);
		Legg1_Patella_L.setInitialRotationPoint (0.1F,1.3F,6.5F);
		Legg1_Patella_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6761311F,-0.0075666F,-0.005165F,0.7367244F)).transpose());
		Legg1_Patella_L.setTextureSize( 256 , 256 );
		parts.put(Legg1_Patella_L.boxName,Legg1_Patella_L);
		Bone_Legg1_Patella_L.addChild(Legg1_Patella_L);
		
		Legg1_Patella_R = new MCAModelRenderer(this, "Legg1_Patella_R", 29 , 107);
		Legg1_Patella_R.mirror = true;
		Legg1_Patella_R.addBox (-3.5F,-6.0F,-3.5F,7,12,7);
		Legg1_Patella_R.setInitialRotationPoint (-0.6F,1.2F,6.5F);
		Legg1_Patella_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6644111F,-0.1255714F,0.1499719F,0.7213171F)).transpose());
		Legg1_Patella_R.setTextureSize( 256 , 256 );
		parts.put(Legg1_Patella_R.boxName,Legg1_Patella_R);
		Bone_Legg1_Patella_R.addChild(Legg1_Patella_R);
		
		Legg1_Tarsus_L = new MCAModelRenderer(this, "Legg1_Tarsus_L", 31 , 166);
		Legg1_Tarsus_L.mirror = false;
		Legg1_Tarsus_L.addBox (-2.5F,-4.5F,-2.5F,5,9,5);
		Legg1_Tarsus_L.setInitialRotationPoint (0.2F,1.1F,5.6F);
		Legg1_Tarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7128173F,0.0332133F,0.0398638F,0.6994278F)).transpose());
		Legg1_Tarsus_L.setTextureSize( 256 , 256 );
		parts.put(Legg1_Tarsus_L.boxName,Legg1_Tarsus_L);
		Bone_Legg1_Tarsus_L.addChild(Legg1_Tarsus_L);
		
		Legg1_Tarsus_R = new MCAModelRenderer(this, "Legg1_Tarsus_R", 31 , 166);
		Legg1_Tarsus_R.mirror = true;
		Legg1_Tarsus_R.addBox (-2.5F,-4.5F,-2.5F,5,9,5);
		Legg1_Tarsus_R.setInitialRotationPoint (-1.1F,0.2F,5.6F);
		Legg1_Tarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5529003F,-0.4511321F,0.3844396F,0.5856513F)).transpose());
		Legg1_Tarsus_R.setTextureSize( 256 , 256 );
		parts.put(Legg1_Tarsus_R.boxName,Legg1_Tarsus_R);
		Bone_Legg1_Tarsus_R.addChild(Legg1_Tarsus_R);
		
		Legg1_Tibia_L = new MCAModelRenderer(this, "Legg1_Tibia_L", 31 , 126);
		Legg1_Tibia_L.mirror = false;
		Legg1_Tibia_L.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg1_Tibia_L.setInitialRotationPoint (-0.2F,1.2F,8.6F);
		Legg1_Tibia_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7015594F,-0.0318585F,0.0416739F,0.7106777F)).transpose());
		Legg1_Tibia_L.setTextureSize( 256 , 256 );
		parts.put(Legg1_Tibia_L.boxName,Legg1_Tibia_L);
		Bone_Legg1_Tibia_L.addChild(Legg1_Tibia_L);
		
		Legg1_Tibia_R = new MCAModelRenderer(this, "Legg1_Tibia_R", 31 , 126);
		Legg1_Tibia_R.mirror = true;
		Legg1_Tibia_R.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg1_Tibia_R.setInitialRotationPoint (-1.2F,0.1F,8.6F);
		Legg1_Tibia_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5035337F,-0.4895416F,0.4894702F,0.5169349F)).transpose());
		Legg1_Tibia_R.setTextureSize( 256 , 256 );
		parts.put(Legg1_Tibia_R.boxName,Legg1_Tibia_R);
		Bone_Legg1_Tibia_R.addChild(Legg1_Tibia_R);
		
		Legg1_Trochanter_L = new MCAModelRenderer(this, "Legg1_Trochanter_L", 28 , 56);
		Legg1_Trochanter_L.mirror = false;
		Legg1_Trochanter_L.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Legg1_Trochanter_L.setInitialRotationPoint (0.1F,-0.7F,9.1F);
		Legg1_Trochanter_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7108061F,0.0130768F,0.0112166F,0.703177F)).transpose());
		Legg1_Trochanter_L.setTextureSize( 256 , 256 );
		parts.put(Legg1_Trochanter_L.boxName,Legg1_Trochanter_L);
		Bone_Legg1_Trochanter_L.addChild(Legg1_Trochanter_L);
		
		Legg1_Trochanter_R = new MCAModelRenderer(this, "Legg1_Trochanter_R", 28 , 56);
		Legg1_Trochanter_R.mirror = true;
		Legg1_Trochanter_R.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Legg1_Trochanter_R.setInitialRotationPoint (-0.3F,-0.7F,9.1F);
		Legg1_Trochanter_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7052746F,0.0895137F,-0.1124457F,0.6942125F)).transpose());
		Legg1_Trochanter_R.setTextureSize( 256 , 256 );
		parts.put(Legg1_Trochanter_R.boxName,Legg1_Trochanter_R);
		Bone_Legg1_Trochanter_R.addChild(Legg1_Trochanter_R);
		
		Legg2_Femur_L = new MCAModelRenderer(this, "Legg2_Femur_L", 29 , 84);
		Legg2_Femur_L.mirror = false;
		Legg2_Femur_L.addBox (-3.5F,-8.0F,-3.5F,7,16,7);
		Legg2_Femur_L.setInitialRotationPoint (0.1F,0.6F,6.8F);
		Legg2_Femur_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7686921F,-0.0361343F,0.0175965F,0.638355F)).transpose());
		Legg2_Femur_L.setTextureSize( 256 , 256 );
		parts.put(Legg2_Femur_L.boxName,Legg2_Femur_L);
		Bone_Legg2_Femur_L.addChild(Legg2_Femur_L);
		
		Legg2_Femur_R = new MCAModelRenderer(this, "Legg2_Femur_R", 29 , 84);
		Legg2_Femur_R.mirror = true;
		Legg2_Femur_R.addBox (-3.5F,-8.0F,-3.5F,7,16,7);
		Legg2_Femur_R.setInitialRotationPoint (0.4F,-0.4F,6.8F);
		Legg2_Femur_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2071708F,0.7411237F,-0.6115742F,0.1838288F)).transpose());
		Legg2_Femur_R.setTextureSize( 256 , 256 );
		parts.put(Legg2_Femur_R.boxName,Legg2_Femur_R);
		Bone_Legg2_Femur_R.addChild(Legg2_Femur_R);
		
		Legg2_Join1_L = new MCAModelRenderer(this, "Legg2_Join1_L", 52 , 56);
		Legg2_Join1_L.mirror = false;
		Legg2_Join1_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg2_Join1_L.setInitialRotationPoint (0.7F,-1.1F,19.5F);
		Legg2_Join1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.760515F,-0.0361865F,-0.0144218F,0.6481509F)).transpose());
		Legg2_Join1_L.setTextureSize( 256 , 256 );
		parts.put(Legg2_Join1_L.boxName,Legg2_Join1_L);
		Bone_Legg2_Trochanter_L.addChild(Legg2_Join1_L);
		
		Legg2_Join1_R = new MCAModelRenderer(this, "Legg2_Join1_R", 52 , 56);
		Legg2_Join1_R.mirror = true;
		Legg2_Join1_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg2_Join1_R.setInitialRotationPoint (-1.3F,0.1F,19.5F);
		Legg2_Join1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6329542F,0.4231673F,-0.321867F,0.5627611F)).transpose());
		Legg2_Join1_R.setTextureSize( 256 , 256 );
		parts.put(Legg2_Join1_R.boxName,Legg2_Join1_R);
		Bone_Legg2_Trochanter_R.addChild(Legg2_Join1_R);
		
		Legg2_Join2_L = new MCAModelRenderer(this, "Legg2_Join2_L", 52 , 56);
		Legg2_Join2_L.mirror = false;
		Legg2_Join2_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg2_Join2_L.setInitialRotationPoint (0.1F,0.8F,15.6F);
		Legg2_Join2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4502835F,-0.030818F,-0.0408347F,0.8914188F)).transpose());
		Legg2_Join2_L.setTextureSize( 256 , 256 );
		parts.put(Legg2_Join2_L.boxName,Legg2_Join2_L);
		Bone_Legg2_Femur_L.addChild(Legg2_Join2_L);
		
		Legg2_Join2_R = new MCAModelRenderer(this, "Legg2_Join2_R", 52 , 56);
		Legg2_Join2_R.mirror = true;
		Legg2_Join2_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg2_Join2_R.setInitialRotationPoint (0.5F,-0.6F,15.6F);
		Legg2_Join2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1121886F,0.4371659F,-0.8334691F,0.3187931F)).transpose());
		Legg2_Join2_R.setTextureSize( 256 , 256 );
		parts.put(Legg2_Join2_R.boxName,Legg2_Join2_R);
		Bone_Legg2_Femur_R.addChild(Legg2_Join2_R);
		
		Legg2_Join3_L = new MCAModelRenderer(this, "Legg2_Join3_L", 52 , 56);
		Legg2_Join3_L.mirror = false;
		Legg2_Join3_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg2_Join3_L.setInitialRotationPoint (-0.4F,0.4F,13.0F);
		Legg2_Join3_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5353792F,-0.0306141F,0.0099786F,0.8439977F)).transpose());
		Legg2_Join3_L.setTextureSize( 256 , 256 );
		parts.put(Legg2_Join3_L.boxName,Legg2_Join3_L);
		Bone_Legg2_Patella_L.addChild(Legg2_Join3_L);
		
		Legg2_Join3_R = new MCAModelRenderer(this, "Legg2_Join3_R", 52 , 56);
		Legg2_Join3_R.mirror = true;
		Legg2_Join3_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg2_Join3_R.setInitialRotationPoint (-0.1F,0.5F,13.0F);
		Legg2_Join3_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4849477F,-0.2288856F,0.3944601F,0.7462161F)).transpose());
		Legg2_Join3_R.setTextureSize( 256 , 256 );
		parts.put(Legg2_Join3_R.boxName,Legg2_Join3_R);
		Bone_Legg2_Patella_R.addChild(Legg2_Join3_R);
		
		Legg2_Join4_L = new MCAModelRenderer(this, "Legg2_Join4_L", 52 , 56);
		Legg2_Join4_L.mirror = false;
		Legg2_Join4_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg2_Join4_L.setInitialRotationPoint (-0.4F,0.6F,16.8F);
		Legg2_Join4_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6668867F,-0.0570229F,0.0283875F,0.7424317F)).transpose());
		Legg2_Join4_L.setTextureSize( 256 , 256 );
		parts.put(Legg2_Join4_L.boxName,Legg2_Join4_L);
		Bone_Legg2_Tibia_L.addChild(Legg2_Join4_L);
		
		Legg2_Join4_R = new MCAModelRenderer(this, "Legg2_Join4_R", 52 , 56);
		Legg2_Join4_R.mirror = true;
		Legg2_Join4_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg2_Join4_R.setInitialRotationPoint (-0.7F,-0.2F,16.8F);
		Legg2_Join4_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2464768F,-0.6222799F,0.7028765F,0.2407937F)).transpose());
		Legg2_Join4_R.setTextureSize( 256 , 256 );
		parts.put(Legg2_Join4_R.boxName,Legg2_Join4_R);
		Bone_Legg2_Tibia_R.addChild(Legg2_Join4_R);
		
		Legg2_Join5_L = new MCAModelRenderer(this, "Legg2_Join5_L", 52 , 56);
		Legg2_Join5_L.mirror = false;
		Legg2_Join5_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg2_Join5_L.setInitialRotationPoint (-1.0F,0.8F,16.1F);
		Legg2_Join5_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7912216F,-0.0588841F,0.0447233F,0.6070428F)).transpose());
		Legg2_Join5_L.setTextureSize( 256 , 256 );
		parts.put(Legg2_Join5_L.boxName,Legg2_Join5_L);
		Bone_Legg2_Metatarsus_L.addChild(Legg2_Join5_L);
		
		Legg2_Join5_R = new MCAModelRenderer(this, "Legg2_Join5_R", 52 , 56);
		Legg2_Join5_R.mirror = true;
		Legg2_Join5_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg2_Join5_R.setInitialRotationPoint (-1.2F,-0.4F,16.1F);
		Legg2_Join5_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2231236F,-0.7613875F,0.5842525F,0.1707452F)).transpose());
		Legg2_Join5_R.setTextureSize( 256 , 256 );
		parts.put(Legg2_Join5_R.boxName,Legg2_Join5_R);
		Bone_Legg2_Metatarsus_R.addChild(Legg2_Join5_R);
		
		Legg2_Metatarsus_L = new MCAModelRenderer(this, "Legg2_Metatarsus_L", 31 , 146);
		Legg2_Metatarsus_L.mirror = false;
		Legg2_Metatarsus_L.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg2_Metatarsus_L.setInitialRotationPoint (-0.7F,0.5F,7.7F);
		Legg2_Metatarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.712375F,-0.0530704F,0.0514885F,0.6978928F)).transpose());
		Legg2_Metatarsus_L.setTextureSize( 256 , 256 );
		parts.put(Legg2_Metatarsus_L.boxName,Legg2_Metatarsus_L);
		Bone_Legg2_Metatarsus_L.addChild(Legg2_Metatarsus_L);
		
		Legg2_Metatarsus_R = new MCAModelRenderer(this, "Legg2_Metatarsus_R", 31 , 146);
		Legg2_Metatarsus_R.mirror = true;
		Legg2_Metatarsus_R.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg2_Metatarsus_R.setInitialRotationPoint (-0.9F,-0.2F,7.7F);
		Legg2_Metatarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2009417F,-0.6855022F,0.6716761F,0.196368F)).transpose());
		Legg2_Metatarsus_R.setTextureSize( 256 , 256 );
		parts.put(Legg2_Metatarsus_R.boxName,Legg2_Metatarsus_R);
		Bone_Legg2_Metatarsus_R.addChild(Legg2_Metatarsus_R);
		
		Legg2_Patella_L = new MCAModelRenderer(this, "Legg2_Patella_L", 29 , 107);
		Legg2_Patella_L.mirror = false;
		Legg2_Patella_L.addBox (-3.5F,-6.0F,-3.5F,7,12,7);
		Legg2_Patella_L.setInitialRotationPoint (-0.0F,1.3F,6.5F);
		Legg2_Patella_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6760921F,-0.0124621F,-0.008351F,0.7366644F)).transpose());
		Legg2_Patella_L.setTextureSize( 256 , 256 );
		parts.put(Legg2_Patella_L.boxName,Legg2_Patella_L);
		Bone_Legg2_Patella_L.addChild(Legg2_Patella_L);
		
		Legg2_Patella_R = new MCAModelRenderer(this, "Legg2_Patella_R", 29 , 107);
		Legg2_Patella_R.mirror = true;
		Legg2_Patella_R.addBox (-3.5F,-6.0F,-3.5F,7,12,7);
		Legg2_Patella_R.setInitialRotationPoint (-1.1F,0.8F,6.5F);
		Legg2_Patella_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5998868F,-0.3120556F,0.3592853F,0.6431729F)).transpose());
		Legg2_Patella_R.setTextureSize( 256 , 256 );
		parts.put(Legg2_Patella_R.boxName,Legg2_Patella_R);
		Bone_Legg2_Patella_R.addChild(Legg2_Patella_R);
		
		Legg2_Tarsus_L = new MCAModelRenderer(this, "Legg2_Tarsus_L", 31 , 166);
		Legg2_Tarsus_L.mirror = false;
		Legg2_Tarsus_L.addBox (-2.5F,-4.5F,-2.5F,5,9,5);
		Legg2_Tarsus_L.setInitialRotationPoint (-0.3F,1.1F,5.6F);
		Legg2_Tarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7131124F,0.0273827F,0.0397345F,0.699387F)).transpose());
		Legg2_Tarsus_L.setTextureSize( 256 , 256 );
		parts.put(Legg2_Tarsus_L.boxName,Legg2_Tarsus_L);
		Bone_Legg2_Tarsus_L.addChild(Legg2_Tarsus_L);
		
		Legg2_Tarsus_R = new MCAModelRenderer(this, "Legg2_Tarsus_R", 31 , 166);
		Legg2_Tarsus_R.mirror = true;
		Legg2_Tarsus_R.addBox (-2.5F,-4.5F,-2.5F,5,9,5);
		Legg2_Tarsus_R.setInitialRotationPoint (-1.1F,-0.3F,5.6F);
		Legg2_Tarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3156406F,-0.6400394F,0.5959961F,0.3681157F)).transpose());
		Legg2_Tarsus_R.setTextureSize( 256 , 256 );
		parts.put(Legg2_Tarsus_R.boxName,Legg2_Tarsus_R);
		Bone_Legg2_Tarsus_R.addChild(Legg2_Tarsus_R);
		
		Legg2_Tibia_L = new MCAModelRenderer(this, "Legg2_Tibia_L", 31 , 126);
		Legg2_Tibia_L.mirror = false;
		Legg2_Tibia_L.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg2_Tibia_L.setInitialRotationPoint (-0.5F,1.1F,8.5F);
		Legg2_Tibia_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7015697F,-0.0376729F,0.0421199F,0.7103568F)).transpose());
		Legg2_Tibia_L.setTextureSize( 256 , 256 );
		parts.put(Legg2_Tibia_L.boxName,Legg2_Tibia_L);
		Bone_Legg2_Tibia_L.addChild(Legg2_Tibia_L);
		
		Legg2_Tibia_R = new MCAModelRenderer(this, "Legg2_Tibia_R", 31 , 126);
		Legg2_Tibia_R.mirror = true;
		Legg2_Tibia_R.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg2_Tibia_R.setInitialRotationPoint (-1.0F,-0.7F,8.5F);
		Legg2_Tibia_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2379244F,-0.6610633F,0.6682075F,0.244716F)).transpose());
		Legg2_Tibia_R.setTextureSize( 256 , 256 );
		parts.put(Legg2_Tibia_R.boxName,Legg2_Tibia_R);
		Bone_Legg2_Tibia_R.addChild(Legg2_Tibia_R);
		
		Legg2_Trochanter_L = new MCAModelRenderer(this, "Legg2_Trochanter_L", 28 , 56);
		Legg2_Trochanter_L.mirror = false;
		Legg2_Trochanter_L.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Legg2_Trochanter_L.setInitialRotationPoint (0.3F,-0.7F,9.1F);
		Legg2_Trochanter_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7108591F,0.0093407F,0.0067227F,0.7032403F)).transpose());
		Legg2_Trochanter_L.setTextureSize( 256 , 256 );
		parts.put(Legg2_Trochanter_L.boxName,Legg2_Trochanter_L);
		Bone_Legg2_Trochanter_L.addChild(Legg2_Trochanter_L);
		
		Legg2_Trochanter_R = new MCAModelRenderer(this, "Legg2_Trochanter_R", 28 , 56);
		Legg2_Trochanter_R.mirror = true;
		Legg2_Trochanter_R.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Legg2_Trochanter_R.setInitialRotationPoint (-0.8F,-0.1F,9.1F);
		Legg2_Trochanter_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6138777F,0.3585545F,-0.3683898F,0.5990676F)).transpose());
		Legg2_Trochanter_R.setTextureSize( 256 , 256 );
		parts.put(Legg2_Trochanter_R.boxName,Legg2_Trochanter_R);
		Bone_Legg2_Trochanter_R.addChild(Legg2_Trochanter_R);
		
		Legg3_Femur_L = new MCAModelRenderer(this, "Legg3_Femur_L", 29 , 84);
		Legg3_Femur_L.mirror = false;
		Legg3_Femur_L.addBox (-3.5F,-8.0F,-3.5F,7,16,7);
		Legg3_Femur_L.setInitialRotationPoint (-0.7F,0.5F,6.9F);
		Legg3_Femur_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7683712F,-0.0375475F,0.0249844F,0.6384134F)).transpose());
		Legg3_Femur_L.setTextureSize( 256 , 256 );
		parts.put(Legg3_Femur_L.boxName,Legg3_Femur_L);
		Bone_Legg3_Femur_L.addChild(Legg3_Femur_L);
		
		Legg3_Femur_R = new MCAModelRenderer(this, "Legg3_Femur_R", 29 , 84);
		Legg3_Femur_R.mirror = true;
		Legg3_Femur_R.addBox (-3.5F,-8.0F,-3.5F,7,16,7);
		Legg3_Femur_R.setInitialRotationPoint (-0.8F,-0.2F,6.9F);
		Legg3_Femur_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1874595F,-0.7460978F,0.6211247F,0.1496704F)).transpose());
		Legg3_Femur_R.setTextureSize( 256 , 256 );
		parts.put(Legg3_Femur_R.boxName,Legg3_Femur_R);
		Bone_Legg3_Femur_R.addChild(Legg3_Femur_R);
		
		Legg3_Join1_L = new MCAModelRenderer(this, "Legg3_Join1_L", 52 , 56);
		Legg3_Join1_L.mirror = false;
		Legg3_Join1_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg3_Join1_L.setInitialRotationPoint (-0.1F,-1.1F,19.6F);
		Legg3_Join1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7605838F,-0.0318146F,-0.0082832F,0.6484069F)).transpose());
		Legg3_Join1_L.setTextureSize( 256 , 256 );
		parts.put(Legg3_Join1_L.boxName,Legg3_Join1_L);
		Bone_Legg3_Trochanter_L.addChild(Legg3_Join1_L);
		
		Legg3_Join1_R = new MCAModelRenderer(this, "Legg3_Join1_R", 52 , 56);
		Legg3_Join1_R.mirror = true;
		Legg3_Join1_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg3_Join1_R.setInitialRotationPoint (0.8F,-0.8F,19.6F);
		Legg3_Join1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7330529F,-0.2052694F,0.2086581F,0.6139705F)).transpose());
		Legg3_Join1_R.setTextureSize( 256 , 256 );
		parts.put(Legg3_Join1_R.boxName,Legg3_Join1_R);
		Bone_Legg3_Trochanter_R.addChild(Legg3_Join1_R);
		
		Legg3_Join2_L = new MCAModelRenderer(this, "Legg3_Join2_L", 52 , 56);
		Legg3_Join2_L.mirror = false;
		Legg3_Join2_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg3_Join2_L.setInitialRotationPoint (-0.6F,0.7F,15.7F);
		Legg3_Join2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4502816F,-0.0291694F,-0.0334801F,0.8917817F)).transpose());
		Legg3_Join2_L.setTextureSize( 256 , 256 );
		parts.put(Legg3_Join2_L.boxName,Legg3_Join2_L);
		Bone_Legg3_Femur_L.addChild(Legg3_Join2_L);
		
		Legg3_Join2_R = new MCAModelRenderer(this, "Legg3_Join2_R", 52 , 56);
		Legg3_Join2_R.mirror = true;
		Legg3_Join2_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg3_Join2_R.setInitialRotationPoint (-0.8F,-0.4F,15.7F);
		Legg3_Join2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.116884F,-0.435825F,0.8810394F,0.1420013F)).transpose());
		Legg3_Join2_R.setTextureSize( 256 , 256 );
		parts.put(Legg3_Join2_R.boxName,Legg3_Join2_R);
		Bone_Legg3_Femur_R.addChild(Legg3_Join2_R);
		
		Legg3_Join3_L = new MCAModelRenderer(this, "Legg3_Join3_L", 52 , 56);
		Legg3_Join3_L.mirror = false;
		Legg3_Join3_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg3_Join3_L.setInitialRotationPoint (-0.8F,0.4F,13.2F);
		Legg3_Join3_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5353339F,-0.0236782F,0.0129238F,0.8442097F)).transpose());
		Legg3_Join3_L.setTextureSize( 256 , 256 );
		parts.put(Legg3_Join3_L.boxName,Legg3_Join3_L);
		Bone_Legg3_Patella_L.addChild(Legg3_Join3_L);
		
		Legg3_Join3_R = new MCAModelRenderer(this, "Legg3_Join3_R", 52 , 56);
		Legg3_Join3_R.mirror = true;
		Legg3_Join3_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg3_Join3_R.setInitialRotationPoint (0.1F,-0.9F,13.2F);
		Legg3_Join3_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2751395F,0.459815F,-0.7116826F,0.4542868F)).transpose());
		Legg3_Join3_R.setTextureSize( 256 , 256 );
		parts.put(Legg3_Join3_R.boxName,Legg3_Join3_R);
		Bone_Legg3_Patella_R.addChild(Legg3_Join3_R);
		
		Legg3_Join4_L = new MCAModelRenderer(this, "Legg3_Join4_L", 52 , 56);
		Legg3_Join4_L.mirror = false;
		Legg3_Join4_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg3_Join4_L.setInitialRotationPoint (-0.7F,0.7F,16.9F);
		Legg3_Join4_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6670505F,-0.0495597F,0.0274705F,0.7428545F)).transpose());
		Legg3_Join4_L.setTextureSize( 256 , 256 );
		parts.put(Legg3_Join4_L.boxName,Legg3_Join4_L);
		Bone_Legg3_Tibia_L.addChild(Legg3_Join4_L);
		
		Legg3_Join4_R = new MCAModelRenderer(this, "Legg3_Join4_R", 52 , 56);
		Legg3_Join4_R.mirror = true;
		Legg3_Join4_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg3_Join4_R.setInitialRotationPoint (-0.4F,-1.0F,16.9F);
		Legg3_Join4_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1082727F,0.6600637F,-0.7285784F,0.1475345F)).transpose());
		Legg3_Join4_R.setTextureSize( 256 , 256 );
		parts.put(Legg3_Join4_R.boxName,Legg3_Join4_R);
		Bone_Legg3_Tibia_R.addChild(Legg3_Join4_R);
		
		Legg3_Join5_L = new MCAModelRenderer(this, "Legg3_Join5_L", 52 , 56);
		Legg3_Join5_L.mirror = false;
		Legg3_Join5_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg3_Join5_L.setInitialRotationPoint (-1.2F,1.0F,16.2F);
		Legg3_Join5_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7913929F,-0.0513984F,0.0440464F,0.6075489F)).transpose());
		Legg3_Join5_L.setTextureSize( 256 , 256 );
		parts.put(Legg3_Join5_L.boxName,Legg3_Join5_L);
		Bone_Legg3_Metatarsus_L.addChild(Legg3_Join5_L);
		
		Legg3_Join5_R = new MCAModelRenderer(this, "Legg3_Join5_R", 52 , 56);
		Legg3_Join5_R.mirror = true;
		Legg3_Join5_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg3_Join5_R.setInitialRotationPoint (-0.5F,-1.4F,16.2F);
		Legg3_Join5_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1564388F,0.7774758F,-0.5980613F,0.1156768F)).transpose());
		Legg3_Join5_R.setTextureSize( 256 , 256 );
		parts.put(Legg3_Join5_R.boxName,Legg3_Join5_R);
		Bone_Legg3_Metatarsus_R.addChild(Legg3_Join5_R);
		
		Legg3_Metatarsus_L = new MCAModelRenderer(this, "Legg3_Metatarsus_L", 31 , 146);
		Legg3_Metatarsus_L.mirror = false;
		Legg3_Metatarsus_L.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg3_Metatarsus_L.setInitialRotationPoint (-1.0F,0.6F,7.8F);
		Legg3_Metatarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7124842F,-0.0457228F,0.0499103F,0.6984159F)).transpose());
		Legg3_Metatarsus_L.setTextureSize( 256 , 256 );
		parts.put(Legg3_Metatarsus_L.boxName,Legg3_Metatarsus_L);
		Bone_Legg3_Metatarsus_L.addChild(Legg3_Metatarsus_L);
		
		Legg3_Metatarsus_R = new MCAModelRenderer(this, "Legg3_Metatarsus_R", 31 , 146);
		Legg3_Metatarsus_R.mirror = true;
		Legg3_Metatarsus_R.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg3_Metatarsus_R.setInitialRotationPoint (-0.5F,-1.0F,7.8F);
		Legg3_Metatarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1413728F,0.6998107F,-0.6873213F,0.1336712F)).transpose());
		Legg3_Metatarsus_R.setTextureSize( 256 , 256 );
		parts.put(Legg3_Metatarsus_R.boxName,Legg3_Metatarsus_R);
		Bone_Legg3_Metatarsus_R.addChild(Legg3_Metatarsus_R);
		
		Legg3_Patella_L = new MCAModelRenderer(this, "Legg3_Patella_L", 29 , 107);
		Legg3_Patella_L.mirror = false;
		Legg3_Patella_L.addBox (-3.5F,-6.0F,-3.5F,7,12,7);
		Legg3_Patella_L.setInitialRotationPoint (-0.6F,1.3F,6.7F);
		Legg3_Patella_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6761408F,-0.0061457F,-0.0042405F,0.7367346F)).transpose());
		Legg3_Patella_L.setTextureSize( 256 , 256 );
		parts.put(Legg3_Patella_L.boxName,Legg3_Patella_L);
		Bone_Legg3_Patella_L.addChild(Legg3_Patella_L);
		
		Legg3_Patella_R = new MCAModelRenderer(this, "Legg3_Patella_R", 29 , 107);
		Legg3_Patella_R.mirror = true;
		Legg3_Patella_R.addBox (-3.5F,-6.0F,-3.5F,7,12,7);
		Legg3_Patella_R.setInitialRotationPoint (1.0F,-1.1F,6.7F);
		Legg3_Patella_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3673415F,0.5676834F,-0.6125326F,0.4093893F)).transpose());
		Legg3_Patella_R.setTextureSize( 256 , 256 );
		parts.put(Legg3_Patella_R.boxName,Legg3_Patella_R);
		Bone_Legg3_Patella_R.addChild(Legg3_Patella_R);
		
		Legg3_Tarsus_L = new MCAModelRenderer(this, "Legg3_Tarsus_L", 31 , 166);
		Legg3_Tarsus_L.mirror = false;
		Legg3_Tarsus_L.addBox (-2.5F,-4.5F,-2.5F,5,9,5);
		Legg3_Tarsus_L.setInitialRotationPoint (-0.4F,1.2F,5.7F);
		Legg3_Tarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7127331F,0.0349073F,0.0399032F,0.699429F)).transpose());
		Legg3_Tarsus_L.setTextureSize( 256 , 256 );
		parts.put(Legg3_Tarsus_L.boxName,Legg3_Tarsus_L);
		Bone_Legg3_Tarsus_L.addChild(Legg3_Tarsus_L);
		
		Legg3_Tarsus_R = new MCAModelRenderer(this, "Legg3_Tarsus_R", 31 , 166);
		Legg3_Tarsus_R.mirror = true;
		Legg3_Tarsus_R.addBox (-2.5F,-4.5F,-2.5F,5,9,5);
		Legg3_Tarsus_R.setInitialRotationPoint (-0.3F,-1.3F,5.7F);
		Legg3_Tarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.0773977F,0.7093786F,-0.7005626F,0.0019242F)).transpose());
		Legg3_Tarsus_R.setTextureSize( 256 , 256 );
		parts.put(Legg3_Tarsus_R.boxName,Legg3_Tarsus_R);
		Bone_Legg3_Tarsus_R.addChild(Legg3_Tarsus_R);
		
		Legg3_Tibia_L = new MCAModelRenderer(this, "Legg3_Tibia_L", 31 , 126);
		Legg3_Tibia_L.mirror = false;
		Legg3_Tibia_L.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg3_Tibia_L.setInitialRotationPoint (-0.9F,1.3F,8.6F);
		Legg3_Tibia_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7015544F,-0.030173F,0.0415519F,0.7107633F)).transpose());
		Legg3_Tibia_L.setTextureSize( 256 , 256 );
		parts.put(Legg3_Tibia_L.boxName,Legg3_Tibia_L);
		Bone_Legg3_Tibia_L.addChild(Legg3_Tibia_L);
		
		Legg3_Tibia_R = new MCAModelRenderer(this, "Legg3_Tibia_R", 31 , 126);
		Legg3_Tibia_R.mirror = true;
		Legg3_Tibia_R.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg3_Tibia_R.setInitialRotationPoint (-0.2F,-1.5F,8.6F);
		Legg3_Tibia_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1352119F,0.6890584F,-0.7006857F,0.1263164F)).transpose());
		Legg3_Tibia_R.setTextureSize( 256 , 256 );
		parts.put(Legg3_Tibia_R.boxName,Legg3_Tibia_R);
		Bone_Legg3_Tibia_R.addChild(Legg3_Tibia_R);
		
		Legg3_Trochanter_L = new MCAModelRenderer(this, "Legg3_Trochanter_L", 28 , 56);
		Legg3_Trochanter_L.mirror = false;
		Legg3_Trochanter_L.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Legg3_Trochanter_L.setInitialRotationPoint (-0.7F,-0.7F,9.1F);
		Legg3_Trochanter_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7107957F,0.0141586F,0.0125223F,0.7031445F)).transpose());
		Legg3_Trochanter_L.setTextureSize( 256 , 256 );
		parts.put(Legg3_Trochanter_L.boxName,Legg3_Trochanter_L);
		Bone_Legg3_Trochanter_L.addChild(Legg3_Trochanter_L);
		
		Legg3_Trochanter_R = new MCAModelRenderer(this, "Legg3_Trochanter_R", 28 , 56);
		Legg3_Trochanter_R.mirror = true;
		Legg3_Trochanter_R.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Legg3_Trochanter_R.setInitialRotationPoint (1.0F,-0.2F,9.1F);
		Legg3_Trochanter_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.671476F,-0.2335604F,0.2058292F,0.672461F)).transpose());
		Legg3_Trochanter_R.setTextureSize( 256 , 256 );
		parts.put(Legg3_Trochanter_R.boxName,Legg3_Trochanter_R);
		Bone_Legg3_Trochanter_R.addChild(Legg3_Trochanter_R);
		
		Legg4_Femur_L = new MCAModelRenderer(this, "Legg4_Femur_L", 29 , 84);
		Legg4_Femur_L.mirror = false;
		Legg4_Femur_L.addBox (-3.5F,-8.0F,-3.5F,7,16,7);
		Legg4_Femur_L.setInitialRotationPoint (-0.1F,0.7F,6.8F);
		Legg4_Femur_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.76862F,-0.0364466F,0.0192352F,0.6383768F)).transpose());
		Legg4_Femur_L.setTextureSize( 256 , 256 );
		parts.put(Legg4_Femur_L.boxName,Legg4_Femur_L);
		Bone_Legg4_Femur_L.addChild(Legg4_Femur_L);
		
		Legg4_Femur_R = new MCAModelRenderer(this, "Legg4_Femur_R", 29 , 84);
		Legg4_Femur_R.mirror = true;
		Legg4_Femur_R.addBox (-3.5F,-8.0F,-3.5F,7,16,7);
		Legg4_Femur_R.setInitialRotationPoint (-0.7F,-0.2F,6.8F);
		Legg4_Femur_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4596641F,-0.6171018F,0.5186965F,0.3726233F)).transpose());
		Legg4_Femur_R.setTextureSize( 256 , 256 );
		parts.put(Legg4_Femur_R.boxName,Legg4_Femur_R);
		Bone_Legg4_Femur_R.addChild(Legg4_Femur_R);
		
		Legg4_Join1_L = new MCAModelRenderer(this, "Legg4_Join1_L", 52 , 56);
		Legg4_Join1_L.mirror = false;
		Legg4_Join1_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg4_Join1_L.setInitialRotationPoint (0.6F,-1.1F,19.4F);
		Legg4_Join1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7605426F,-0.035209F,-0.013053F,0.6482013F)).transpose());
		Legg4_Join1_L.setTextureSize( 256 , 256 );
		parts.put(Legg4_Join1_L.boxName,Legg4_Join1_L);
		Bone_Legg4_Trochanter_L.addChild(Legg4_Join1_L);
		
		Legg4_Join1_R = new MCAModelRenderer(this, "Legg4_Join1_R", 52 , 56);
		Legg4_Join1_R.mirror = true;
		Legg4_Join1_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg4_Join1_R.setInitialRotationPoint (-0.3F,-1.2F,19.4F);
		Legg4_Join1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7587067F,-0.0634508F,0.0967836F,0.6410702F)).transpose());
		Legg4_Join1_R.setTextureSize( 256 , 256 );
		parts.put(Legg4_Join1_R.boxName,Legg4_Join1_R);
		Bone_Legg4_Trochanter_R.addChild(Legg4_Join1_R);
		
		Legg4_Join2_L = new MCAModelRenderer(this, "Legg4_Join2_L", 52 , 56);
		Legg4_Join2_L.mirror = false;
		Legg4_Join2_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg4_Join2_L.setInitialRotationPoint (-0.0F,0.9F,15.5F);
		Legg4_Join2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4502812F,-0.0304554F,-0.0391946F,0.8915062F)).transpose());
		Legg4_Join2_L.setTextureSize( 256 , 256 );
		parts.put(Legg4_Join2_L.boxName,Legg4_Join2_L);
		Bone_Legg4_Femur_L.addChild(Legg4_Join2_L);
		
		Legg4_Join2_R = new MCAModelRenderer(this, "Legg4_Join2_R", 52 , 56);
		Legg4_Join2_R.mirror = true;
		Legg4_Join2_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg4_Join2_R.setInitialRotationPoint (-0.8F,-0.3F,15.5F);
		Legg4_Join2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2768361F,-0.3564315F,0.7612823F,0.4655831F)).transpose());
		Legg4_Join2_R.setTextureSize( 256 , 256 );
		parts.put(Legg4_Join2_R.boxName,Legg4_Join2_R);
		Bone_Legg4_Femur_R.addChild(Legg4_Join2_R);
		
		Legg4_Join3_L = new MCAModelRenderer(this, "Legg4_Join3_L", 52 , 56);
		Legg4_Join3_L.mirror = false;
		Legg4_Join3_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg4_Join3_L.setInitialRotationPoint (-0.4F,0.4F,12.9F);
		Legg4_Join3_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5353459F,-0.0290626F,0.0106208F,0.844066F)).transpose());
		Legg4_Join3_L.setTextureSize( 256 , 256 );
		parts.put(Legg4_Join3_L.boxName,Legg4_Join3_L);
		Bone_Legg4_Patella_L.addChild(Legg4_Join3_L);
		
		Legg4_Join3_R = new MCAModelRenderer(this, "Legg4_Join3_R", 52 , 56);
		Legg4_Join3_R.mirror = true;
		Legg4_Join3_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg4_Join3_R.setInitialRotationPoint (0.6F,0.0F,12.9F);
		Legg4_Join3_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4947409F,0.2066232F,-0.2925875F,0.7917898F)).transpose());
		Legg4_Join3_R.setTextureSize( 256 , 256 );
		parts.put(Legg4_Join3_R.boxName,Legg4_Join3_R);
		Bone_Legg4_Patella_R.addChild(Legg4_Join3_R);
		
		Legg4_Join4_L = new MCAModelRenderer(this, "Legg4_Join4_L", 52 , 56);
		Legg4_Join4_L.mirror = false;
		Legg4_Join4_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg4_Join4_L.setInitialRotationPoint (-0.5F,0.5F,16.8F);
		Legg4_Join4_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.666916F,-0.0553647F,0.0281842F,0.7425385F)).transpose());
		Legg4_Join4_L.setTextureSize( 256 , 256 );
		parts.put(Legg4_Join4_L.boxName,Legg4_Join4_L);
		Bone_Legg4_Tibia_L.addChild(Legg4_Join4_L);
		
		Legg4_Join4_R = new MCAModelRenderer(this, "Legg4_Join4_R", 52 , 56);
		Legg4_Join4_R.mirror = true;
		Legg4_Join4_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg4_Join4_R.setInitialRotationPoint (0.3F,-0.6F,16.8F);
		Legg4_Join4_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3503534F,0.5701773F,-0.615007F,0.4170333F)).transpose());
		Legg4_Join4_R.setTextureSize( 256 , 256 );
		parts.put(Legg4_Join4_R.boxName,Legg4_Join4_R);
		Bone_Legg4_Tibia_R.addChild(Legg4_Join4_R);
		
		Legg4_Join5_L = new MCAModelRenderer(this, "Legg4_Join5_L", 52 , 56);
		Legg4_Join5_L.mirror = false;
		Legg4_Join5_L.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg4_Join5_L.setInitialRotationPoint (-1.0F,0.7F,16.1F);
		Legg4_Join5_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7912573F,-0.0572226F,0.0445752F,0.6071661F)).transpose());
		Legg4_Join5_L.setTextureSize( 256 , 256 );
		parts.put(Legg4_Join5_L.boxName,Legg4_Join5_L);
		Bone_Legg4_Metatarsus_L.addChild(Legg4_Join5_L);
		
		Legg4_Join5_R = new MCAModelRenderer(this, "Legg4_Join5_R", 52 , 56);
		Legg4_Join5_R.mirror = true;
		Legg4_Join5_R.addBox (-2.0F,-2.0F,-2.0F,4,4,4);
		Legg4_Join5_R.setInitialRotationPoint (0.4F,-1.1F,16.1F);
		Legg4_Join5_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4185855F,0.6739094F,-0.5175047F,0.3206573F)).transpose());
		Legg4_Join5_R.setTextureSize( 256 , 256 );
		parts.put(Legg4_Join5_R.boxName,Legg4_Join5_R);
		Bone_Legg4_Metatarsus_R.addChild(Legg4_Join5_R);
		
		Legg4_Metatarsus_L = new MCAModelRenderer(this, "Legg4_Metatarsus_L", 31 , 146);
		Legg4_Metatarsus_L.mirror = false;
		Legg4_Metatarsus_L.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg4_Metatarsus_L.setInitialRotationPoint (-0.7F,0.4F,7.6F);
		Legg4_Metatarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7123963F,-0.0514386F,0.0511404F,0.6980188F)).transpose());
		Legg4_Metatarsus_L.setTextureSize( 256 , 256 );
		parts.put(Legg4_Metatarsus_L.boxName,Legg4_Metatarsus_L);
		Bone_Legg4_Metatarsus_L.addChild(Legg4_Metatarsus_L);
		
		Legg4_Metatarsus_R = new MCAModelRenderer(this, "Legg4_Metatarsus_R", 31 , 146);
		Legg4_Metatarsus_R.mirror = true;
		Legg4_Metatarsus_R.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg4_Metatarsus_R.setInitialRotationPoint (0.2F,-0.8F,7.6F);
		Legg4_Metatarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3769321F,0.606697F,-0.5948813F,0.3687239F)).transpose());
		Legg4_Metatarsus_R.setTextureSize( 256 , 256 );
		parts.put(Legg4_Metatarsus_R.boxName,Legg4_Metatarsus_R);
		Bone_Legg4_Metatarsus_R.addChild(Legg4_Metatarsus_R);
		
		Legg4_Patella_L = new MCAModelRenderer(this, "Legg4_Patella_L", 29 , 107);
		Legg4_Patella_L.mirror = false;
		Legg4_Patella_L.addBox (-3.5F,-6.0F,-3.5F,7,12,7);
		Legg4_Patella_L.setInitialRotationPoint (-0.1F,1.3F,6.4F);
		Legg4_Patella_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6760947F,-0.0110498F,-0.0074347F,0.7366944F)).transpose());
		Legg4_Patella_L.setTextureSize( 256 , 256 );
		parts.put(Legg4_Patella_L.boxName,Legg4_Patella_L);
		Bone_Legg4_Patella_L.addChild(Legg4_Patella_L);
		
		Legg4_Patella_R = new MCAModelRenderer(this, "Legg4_Patella_R", 29 , 107);
		Legg4_Patella_R.mirror = true;
		Legg4_Patella_R.addBox (-3.5F,-6.0F,-3.5F,7,12,7);
		Legg4_Patella_R.setInitialRotationPoint (0.9F,0.9F,6.4F);
		Legg4_Patella_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6333832F,0.236764F,-0.2396206F,0.6966711F)).transpose());
		Legg4_Patella_R.setTextureSize( 256 , 256 );
		parts.put(Legg4_Patella_R.boxName,Legg4_Patella_R);
		Bone_Legg4_Patella_R.addChild(Legg4_Patella_R);
		
		Legg4_Tarsus_L = new MCAModelRenderer(this, "Legg4_Tarsus_L", 31 , 166);
		Legg4_Tarsus_L.mirror = false;
		Legg4_Tarsus_L.addBox (-2.5F,-4.5F,-2.5F,5,9,5);
		Legg4_Tarsus_L.setInitialRotationPoint (-0.3F,1.0F,5.5F);
		Legg4_Tarsus_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7130308F,0.0290547F,0.0397728F,0.6994005F)).transpose());
		Legg4_Tarsus_L.setTextureSize( 256 , 256 );
		parts.put(Legg4_Tarsus_L.boxName,Legg4_Tarsus_L);
		Bone_Legg4_Tarsus_L.addChild(Legg4_Tarsus_L);
		
		Legg4_Tarsus_R = new MCAModelRenderer(this, "Legg4_Tarsus_R", 31 , 166);
		Legg4_Tarsus_R.mirror = true;
		Legg4_Tarsus_R.addBox (-2.5F,-4.5F,-2.5F,5,9,5);
		Legg4_Tarsus_R.setInitialRotationPoint (0.7F,-0.8F,5.5F);
		Legg4_Tarsus_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3703471F,0.6100018F,-0.6313639F,0.3035134F)).transpose());
		Legg4_Tarsus_R.setTextureSize( 256 , 256 );
		parts.put(Legg4_Tarsus_R.boxName,Legg4_Tarsus_R);
		Bone_Legg4_Tarsus_R.addChild(Legg4_Tarsus_R);
		
		Legg4_Tibia_L = new MCAModelRenderer(this, "Legg4_Tibia_L", 31 , 126);
		Legg4_Tibia_L.mirror = false;
		Legg4_Tibia_L.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg4_Tibia_L.setInitialRotationPoint (-0.5F,1.0F,8.4F);
		Legg4_Tibia_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7015615F,-0.0360055F,0.0419936F,0.7104587F)).transpose());
		Legg4_Tibia_L.setTextureSize( 256 , 256 );
		parts.put(Legg4_Tibia_L.boxName,Legg4_Tibia_L);
		Bone_Legg4_Tibia_L.addChild(Legg4_Tibia_L);
		
		Legg4_Tibia_R = new MCAModelRenderer(this, "Legg4_Tibia_R", 31 , 126);
		Legg4_Tibia_R.mirror = true;
		Legg4_Tibia_R.addBox (-2.5F,-7.5F,-2.5F,5,15,5);
		Legg4_Tibia_R.setInitialRotationPoint (0.8F,-0.8F,8.4F);
		Legg4_Tibia_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3864678F,0.5866281F,-0.5973374F,0.3869084F)).transpose());
		Legg4_Tibia_R.setTextureSize( 256 , 256 );
		parts.put(Legg4_Tibia_R.boxName,Legg4_Tibia_R);
		Bone_Legg4_Tibia_R.addChild(Legg4_Tibia_R);
		
		Legg4_Trochanter_L = new MCAModelRenderer(this, "Legg4_Trochanter_L", 28 , 56);
		Legg4_Trochanter_L.mirror = false;
		Legg4_Trochanter_L.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Legg4_Trochanter_L.setInitialRotationPoint (0.2F,-0.7F,8.9F);
		Legg4_Trochanter_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7108537F,0.0104039F,0.0080105F,0.7032174F)).transpose());
		Legg4_Trochanter_L.setTextureSize( 256 , 256 );
		parts.put(Legg4_Trochanter_L.boxName,Legg4_Trochanter_L);
		Bone_Legg4_Trochanter_L.addChild(Legg4_Trochanter_L);
		
		Legg4_Trochanter_R = new MCAModelRenderer(this, "Legg4_Trochanter_R", 28 , 56);
		Legg4_Trochanter_R.mirror = true;
		Legg4_Trochanter_R.addBox (-4.0F,-10.0F,-4.0F,8,20,8);
		Legg4_Trochanter_R.setInitialRotationPoint (0.0F,-0.7F,8.9F);
		Legg4_Trochanter_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7035327F,-0.1022629F,0.0830124F,0.6983503F)).transpose());
		Legg4_Trochanter_R.setTextureSize( 256 , 256 );
		parts.put(Legg4_Trochanter_R.boxName,Legg4_Trochanter_R);
		Bone_Legg4_Trochanter_R.addChild(Legg4_Trochanter_R);
		
		Pedipalps0_L = new MCAModelRenderer(this, "Pedipalps0_L", 0 , 56);
		Pedipalps0_L.mirror = false;
		Pedipalps0_L.addBox (-3.5F,-6.5F,-3.5F,7,13,7);
		Pedipalps0_L.setInitialRotationPoint (-0.1F,3.0F,5.8F);
		Pedipalps0_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6970617F,-0.0324705F,0.0166573F,0.7160819F)).transpose());
		Pedipalps0_L.setTextureSize( 256 , 256 );
		parts.put(Pedipalps0_L.boxName,Pedipalps0_L);
		Pedipalp0_L.addChild(Pedipalps0_L);
		
		Pedipalps0_R = new MCAModelRenderer(this, "Pedipalps0_R", 0 , 56);
		Pedipalps0_R.mirror = true;
		Pedipalps0_R.addBox (-3.5F,-6.5F,-3.5F,7,13,7);
		Pedipalps0_R.setInitialRotationPoint (0.3F,3.0F,5.8F);
		Pedipalps0_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6952528F,0.0597003F,-0.0446458F,0.714889F)).transpose());
		Pedipalps0_R.setTextureSize( 256 , 256 );
		parts.put(Pedipalps0_R.boxName,Pedipalps0_R);
		Pedipalp0_R.addChild(Pedipalps0_R);
		
		Pedipalps12_L = new MCAModelRenderer(this, "Pedipalps12_L", 0 , 160);
		Pedipalps12_L.mirror = false;
		Pedipalps12_L.addBox (-1.5F,-2.5F,-1.5F,3,5,3);
		Pedipalps12_L.setInitialRotationPoint (0.7F,-0.3F,21.6F);
		Pedipalps12_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4247923F,0.0026744F,-0.0346905F,0.904622F)).transpose());
		Pedipalps12_L.setTextureSize( 256 , 256 );
		parts.put(Pedipalps12_L.boxName,Pedipalps12_L);
		Pedipalp1_L.addChild(Pedipalps12_L);
		
		Pedipalps12_R = new MCAModelRenderer(this, "Pedipalps12_R", 0 , 160);
		Pedipalps12_R.mirror = true;
		Pedipalps12_R.addBox (-1.5F,-2.5F,-1.5F,3,5,3);
		Pedipalps12_R.setInitialRotationPoint (-0.7F,0.3F,21.6F);
		Pedipalps12_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3936014F,0.1597836F,-0.313477F,0.8492818F)).transpose());
		Pedipalps12_R.setTextureSize( 256 , 256 );
		parts.put(Pedipalps12_R.boxName,Pedipalps12_R);
		Pedipalp1_R.addChild(Pedipalps12_R);
		
		Pedipalps1_L = new MCAModelRenderer(this, "Pedipalps1_L", 0 , 76);
		Pedipalps1_L.mirror = false;
		Pedipalps1_L.addBox (-3.5F,-11.0F,-3.5F,7,22,7);
		Pedipalps1_L.setInitialRotationPoint (0.2F,2.1F,11.3F);
		Pedipalps1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6598349F,-0.0072272F,0.0249928F,0.7509601F)).transpose());
		Pedipalps1_L.setTextureSize( 256 , 256 );
		parts.put(Pedipalps1_L.boxName,Pedipalps1_L);
		Pedipalp1_L.addChild(Pedipalps1_L);
		
		Pedipalps1_R = new MCAModelRenderer(this, "Pedipalps1_R", 0 , 76);
		Pedipalps1_R.mirror = true;
		Pedipalps1_R.addBox (-3.5F,-11.0F,-3.5F,7,22,7);
		Pedipalps1_R.setInitialRotationPoint (1.3F,1.6F,11.3F);
		Pedipalps1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6070457F,0.2587171F,-0.3099433F,0.6844679F)).transpose());
		Pedipalps1_R.setTextureSize( 256 , 256 );
		parts.put(Pedipalps1_R.boxName,Pedipalps1_R);
		Pedipalp1_R.addChild(Pedipalps1_R);
		
		Pedipalps23_L = new MCAModelRenderer(this, "Pedipalps23_L", 0 , 160);
		Pedipalps23_L.mirror = false;
		Pedipalps23_L.addBox (-1.5F,-2.5F,-1.5F,3,5,3);
		Pedipalps23_L.setInitialRotationPoint (0.2F,-0.5F,12.2F);
		Pedipalps23_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5553248F,0.0283125F,-0.095486F,0.8256484F)).transpose());
		Pedipalps23_L.setTextureSize( 256 , 256 );
		parts.put(Pedipalps23_L.boxName,Pedipalps23_L);
		Pedipalp2_L.addChild(Pedipalps23_L);
		
		Pedipalps23_R = new MCAModelRenderer(this, "Pedipalps23_R", 0 , 160);
		Pedipalps23_R.mirror = true;
		Pedipalps23_R.addBox (-1.5F,-2.5F,-1.5F,3,5,3);
		Pedipalps23_R.setInitialRotationPoint (-0.2F,-0.5F,12.2F);
		Pedipalps23_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.5558804F,-0.0136226F,0.0736277F,0.8278832F)).transpose());
		Pedipalps23_R.setTextureSize( 256 , 256 );
		parts.put(Pedipalps23_R.boxName,Pedipalps23_R);
		Pedipalp2_R.addChild(Pedipalps23_R);
		
		Pedipalps2_L = new MCAModelRenderer(this, "Pedipalps2_L", 0 , 105);
		Pedipalps2_L.mirror = false;
		Pedipalps2_L.addBox (-3.0F,-5.5F,-3.0F,6,11,6);
		Pedipalps2_L.setInitialRotationPoint (0.7F,-0.0F,5.9F);
		Pedipalps2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6822335F,-0.0452036F,0.0020735F,0.7297326F)).transpose());
		Pedipalps2_L.setTextureSize( 256 , 256 );
		parts.put(Pedipalps2_L.boxName,Pedipalps2_L);
		Pedipalp2_L.addChild(Pedipalps2_L);
		
		Pedipalps2_R = new MCAModelRenderer(this, "Pedipalps2_R", 0 , 105);
		Pedipalps2_R.mirror = true;
		Pedipalps2_R.addBox (-3.0F,-5.5F,-3.0F,6,11,6);
		Pedipalps2_R.setInitialRotationPoint (-0.7F,-0.0F,5.9F);
		Pedipalps2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6808009F,0.0632229F,-0.0213644F,0.7294222F)).transpose());
		Pedipalps2_R.setTextureSize( 256 , 256 );
		parts.put(Pedipalps2_R.boxName,Pedipalps2_R);
		Pedipalp2_R.addChild(Pedipalps2_R);
		
		Pedipalps34_L = new MCAModelRenderer(this, "Pedipalps34_L", 0 , 160);
		Pedipalps34_L.mirror = false;
		Pedipalps34_L.addBox (-1.5F,-2.5F,-1.5F,3,5,3);
		Pedipalps34_L.setInitialRotationPoint (-0.1F,-0.2F,12.9F);
		Pedipalps34_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6577044F,0.0002643F,-0.0738188F,0.7496504F)).transpose());
		Pedipalps34_L.setTextureSize( 256 , 256 );
		parts.put(Pedipalps34_L.boxName,Pedipalps34_L);
		Pedipalp3_L.addChild(Pedipalps34_L);
		
		Pedipalps34_R = new MCAModelRenderer(this, "Pedipalps34_R", 0 , 160);
		Pedipalps34_R.mirror = true;
		Pedipalps34_R.addBox (-1.5F,-2.5F,-1.5F,3,5,3);
		Pedipalps34_R.setInitialRotationPoint (0.1F,-0.1F,12.9F);
		Pedipalps34_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6495187F,-0.1034447F,0.1905121F,0.7287865F)).transpose());
		Pedipalps34_R.setTextureSize( 256 , 256 );
		parts.put(Pedipalps34_R.boxName,Pedipalps34_R);
		Pedipalp3_R.addChild(Pedipalps34_R);
		
		Pedipalps3_L = new MCAModelRenderer(this, "Pedipalps3_L", 0 , 122);
		Pedipalps3_L.mirror = false;
		Pedipalps3_L.addBox (-3.0F,-5.5F,-3.0F,6,11,6);
		Pedipalps3_L.setInitialRotationPoint (0.4F,0.1F,7.0F);
		Pedipalps3_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6923189F,0.0054769F,-0.0426737F,0.720308F)).transpose());
		Pedipalps3_L.setTextureSize( 256 , 256 );
		parts.put(Pedipalps3_L.boxName,Pedipalps3_L);
		Pedipalp3_L.addChild(Pedipalps3_L);
		
		Pedipalps3_R = new MCAModelRenderer(this, "Pedipalps3_R", 0 , 122);
		Pedipalps3_R.mirror = true;
		Pedipalps3_R.addBox (-3.0F,-5.5F,-3.0F,6,11,6);
		Pedipalps3_R.setInitialRotationPoint (-0.5F,-0.0F,7.0F);
		Pedipalps3_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.682887F,-0.1140237F,0.1551485F,0.7046935F)).transpose());
		Pedipalps3_R.setTextureSize( 256 , 256 );
		parts.put(Pedipalps3_R.boxName,Pedipalps3_R);
		Pedipalp3_R.addChild(Pedipalps3_R);
		
		PedipalpsEnd1_L = new MCAModelRenderer(this, "PedipalpsEnd1_L", 0 , 154);
		PedipalpsEnd1_L.mirror = false;
		PedipalpsEnd1_L.addBox (-1.5F,-1.5F,-1.5F,3,3,3);
		PedipalpsEnd1_L.setInitialRotationPoint (0.2F,-0.3F,12.4F);
		PedipalpsEnd1_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7099581F,0.0771726F,-0.0838551F,0.694962F)).transpose());
		PedipalpsEnd1_L.setTextureSize( 256 , 256 );
		parts.put(PedipalpsEnd1_L.boxName,PedipalpsEnd1_L);
		Pedipalp4_L.addChild(PedipalpsEnd1_L);
		
		PedipalpsEnd1_R = new MCAModelRenderer(this, "PedipalpsEnd1_R", 0 , 154);
		PedipalpsEnd1_R.mirror = true;
		PedipalpsEnd1_R.addBox (-1.5F,-1.5F,-1.5F,3,3,3);
		PedipalpsEnd1_R.setInitialRotationPoint (-0.1F,-0.3F,12.4F);
		PedipalpsEnd1_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.705763F,-0.1090567F,0.1150565F,0.6904833F)).transpose());
		PedipalpsEnd1_R.setTextureSize( 256 , 256 );
		parts.put(PedipalpsEnd1_R.boxName,PedipalpsEnd1_R);
		Pedipalp4_R.addChild(PedipalpsEnd1_R);
		
		PedipalpsEnd2_L = new MCAModelRenderer(this, "PedipalpsEnd2_L", 0 , 139);
		PedipalpsEnd2_L.mirror = false;
		PedipalpsEnd2_L.addBox (-2.5F,-5.0F,-2.5F,5,10,5);
		PedipalpsEnd2_L.setInitialRotationPoint (0.2F,-0.5F,6.2F);
		PedipalpsEnd2_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.709958F,0.0771727F,-0.0838557F,0.694962F)).transpose());
		PedipalpsEnd2_L.setTextureSize( 256 , 256 );
		parts.put(PedipalpsEnd2_L.boxName,PedipalpsEnd2_L);
		Pedipalp4_L.addChild(PedipalpsEnd2_L);
		
		PedipalpsEnd2_R = new MCAModelRenderer(this, "PedipalpsEnd2_R", 0 , 139);
		PedipalpsEnd2_R.mirror = true;
		PedipalpsEnd2_R.addBox (-2.5F,-5.0F,-2.5F,5,10,5);
		PedipalpsEnd2_R.setInitialRotationPoint (-0.2F,-0.5F,6.2F);
		PedipalpsEnd2_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7057633F,-0.1090566F,0.1150564F,0.6904832F)).transpose());
		PedipalpsEnd2_R.setTextureSize( 256 , 256 );
		parts.put(PedipalpsEnd2_R.boxName,PedipalpsEnd2_R);
		Pedipalp4_R.addChild(PedipalpsEnd2_R);
		
		Spinneret_L = new MCAModelRenderer(this, "Spinneret_L", 71 , 0);
		Spinneret_L.mirror = false;
		Spinneret_L.addBox (-1.5F,-5.0F,-1.5F,3,10,3);
		Spinneret_L.setInitialRotationPoint (4.9F,6.0F,48.1F);
		Spinneret_L.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1423819F,-0.6687189F,0.7296871F,-0.0099577F)).transpose());
		Spinneret_L.setTextureSize( 256 , 256 );
		parts.put(Spinneret_L.boxName,Spinneret_L);
		BoneAbdomen.addChild(Spinneret_L);
		
		Spinneret_R = new MCAModelRenderer(this, "Spinneret_R", 71 , 0);
		Spinneret_R.mirror = true;
		Spinneret_R.addBox (-1.5F,-5.0F,-1.5F,3,10,3);
		Spinneret_R.setInitialRotationPoint (-4.9F,6.0F,48.1F);
		Spinneret_R.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1423816F,-0.668719F,0.7296871F,0.0099574F)).transpose());
		Spinneret_R.setTextureSize( 256 , 256 );
		parts.put(Spinneret_R.boxName,Spinneret_R);
		BoneAbdomen.addChild(Spinneret_R);
		
		torso = new MCAModelRenderer(this, "torso", 0 , 0);
		torso.mirror = false;
		torso.addBox (-13.5F,-19.5F,-8.5F,27,39,17);
		torso.setInitialRotationPoint (0.0F,-1.0F,19.4F);
		torso.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.7071068F,-1e-07F,-0.0F,0.7071067F)).transpose());
		torso.setTextureSize( 256 , 256 );
		parts.put(torso.boxName,torso);
		BoneCarapace.addChild(torso);
		
    }
    

	@Override
	public void render(Entity oldEntity, float time, float limbSwingDistance, float custom, float headYRot, float headXRot, float yTrans) 
	{
		EntityTarantula entity = (EntityTarantula)oldEntity;

		//Render every non-child part
		if (limbSwingDistance > 0.001f){
			//System.out.println("LimbSwing = " + limbSwingDistance + entity.hasHome());
			if (!entity.getAnimationHandler().isAnimationActive("walking")){
				entity.getAnimationHandler().activateAnimation("walking", 0);
			}
		}
		else 
			if (entity.getAnimationHandler().isAnimationActive("walking")){
				entity.getAnimationHandler().stopAnimation("walking");
			}
		MasterBone.render(yTrans);

		AnimationHandler.performAnimationInModel(parts, entity);
	}

	@Override
	public void setRotationAngles(float time, float limbSwingDistance, float custom, float headYRot, float headXRot, float yTrans, Entity oldEntity) {}

	public MCAModelRenderer getModelRendererFromName(String name)
	{
		return parts.get(name) != null ? parts.get(name) : null;
	}

}
