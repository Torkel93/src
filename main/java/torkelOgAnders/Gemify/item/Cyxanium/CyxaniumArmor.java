package torkelOgAnders.Gemify.item.Cyxanium;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CyxaniumArmor extends ItemArmor {

	public CyxaniumArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armourType) {
		super(armorMaterial, renderIndex, armourType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {

		if (this.armorType == 2) {
			return "gf:textures/models/armor/cyxaniumarmor2.png";
		}
		return "gf:textures/models/armor/cyxaniumarmor1.png";
	}
}
