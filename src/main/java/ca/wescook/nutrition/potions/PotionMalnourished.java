package ca.wescook.nutrition.potions;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.util.ResourceLocation;

public class PotionMalnourished extends PotionCustom {

	PotionMalnourished(boolean visibility, ResourceLocation icon) {
		super(visibility, icon);
	}

	// Multiply effect based on amplifier
	@Override
	public double getAttributeModifierAmount(int amplifier, AttributeModifier modifier) {
		// Reduce health
		if (modifier.getID().equals(ModPotions.MALNOURISHMENT_HEALTH))
			return 0 - (amplifier + 1) * 2D; // 2 = one heart

		return 0D;
	}
}
