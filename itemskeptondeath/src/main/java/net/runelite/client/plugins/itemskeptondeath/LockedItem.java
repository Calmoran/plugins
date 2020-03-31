/*
 * Copyright (c) 2019, TheStonedTurtle <https://github.com/TheStonedTurtle>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.itemskeptondeath;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import lombok.AllArgsConstructor;
import net.runelite.api.ItemID;

/**
 * A locked item will be kept in its unbroken state upon dying with it past level 20 Wildy but its locked status will be lost.
 * Only certain untradeable items can be combined with a Trouver parchment by talking to Perdu and paying a fee.
 * <p>
 * View the Trouver parchment wiki page for more information: https://oldschool.runescape.wiki/w/Trouver_parchment
 */
@AllArgsConstructor
public enum LockedItem
{
	LOCKED_INFERNAL_CAPE(ItemID.INFERNAL_CAPE_L, ItemID.INFERNAL_CAPE),
	LOCKED_INFERNAL_MAX_CAPE(ItemID.INFERNAL_MAX_CAPE_L, ItemID.INFERNAL_MAX_CAPE),
	LOCKED_FIRE_CAPE(ItemID.FIRE_CAPE_L, ItemID.FIRE_CAPE),
	LOCKED_FIRE_MAX_CAPE(ItemID.FIRE_MAX_CAPE_L, ItemID.FIRE_MAX_CAPE),
	LOCKED_AVAS_ASSEMBLER(ItemID.AVAS_ASSEMBLER_L, ItemID.AVAS_ASSEMBLER),
	LOCKED_ASSEMBLER_MAX_CAPE(ItemID.ASSEMBLER_MAX_CAPE_L, ItemID.ASSEMBLER_MAX_CAPE),
	LOCKED_IMBUED_SARADOMIN_CAPE(ItemID.IMBUED_SARADOMIN_CAPE_L, ItemID.IMBUED_SARADOMIN_CAPE),
	LOCKED_IMBUED_SARADOMIN_MAX_CAPE(ItemID.IMBUED_SARADOMIN_MAX_CAPE_L, ItemID.IMBUED_SARADOMIN_MAX_CAPE),
	LOCKED_IMBUED_GUTHIX_CAPE(ItemID.IMBUED_GUTHIX_CAPE_L, ItemID.IMBUED_GUTHIX_CAPE),
	LOCKED_IMBUED_GUTHIX_MAX_CAPE(ItemID.IMBUED_GUTHIX_MAX_CAPE_L, ItemID.IMBUED_GUTHIX_MAX_CAPE),
	LOCKED_IMBUED_ZAMORAK_CAPE(ItemID.IMBUED_ZAMORAK_CAPE_L, ItemID.IMBUED_ZAMORAK_CAPE),
	LOCKED_IMBUED_ZAMORAK_MAX_CAPE(ItemID.IMBUED_ZAMORAK_MAX_CAPE_L, ItemID.IMBUED_ZAMORAK_MAX_CAPE),
	LOCKED_BRONZE_DEFENDER(ItemID.BRONZE_DEFENDER_L, ItemID.BRONZE_DEFENDER),
	LOCKED_IRON_DEFENDER(ItemID.IRON_DEFENDER_L, ItemID.IRON_DEFENDER),
	LOCKED_STEEL_DEFENDER(ItemID.STEEL_DEFENDER_L, ItemID.STEEL_DEFENDER),
	LOCKED_BLACK_DEFENDER(ItemID.BLACK_DEFENDER_L, ItemID.BLACK_DEFENDER),
	LOCKED_MITHRIL_DEFENDER(ItemID.MITHRIL_DEFENDER_L, ItemID.MITHRIL_DEFENDER),
	LOCKED_ADAMANT_DEFENDER(ItemID.ADAMANT_DEFENDER_L, ItemID.ADAMANT_DEFENDER),
	LOCKED_RUNE_DEFENDER(ItemID.RUNE_DEFENDER_L, ItemID.RUNE_DEFENDER),
	LOCKED_DRAGON_DEFENDER(ItemID.DRAGON_DEFENDER_L, ItemID.DRAGON_DEFENDER),
	LOCKED_AVERNIC_DEFENDER(ItemID.AVERNIC_DEFENDER_L, ItemID.AVERNIC_DEFENDER),
	LOCKED_SARADOMIN_HALO(ItemID.SARADOMIN_HALO_L, ItemID.SARADOMIN_HALO),
	LOCKED_ZAMORAK_HALO(ItemID.ZAMORAK_HALO_L, ItemID.ZAMORAK_HALO),
	LOCKED_GUTHIX_HALO(ItemID.GUTHIX_HALO_L, ItemID.GUTHIX_HALO),
	LOCKED_ARMADYL_HALO(ItemID.ARMADYL_HALO_L, ItemID.ARMADYL_HALO),
	LOCKED_BANDOS_HALO(ItemID.BANDOS_HALO_L, ItemID.BANDOS_HALO),
	LOCKED_SEREN_HALO(ItemID.SEREN_HALO_L, ItemID.SEREN_HALO),
	LOCKED_ANCIENT_HALO(ItemID.ANCIENT_HALO_L, ItemID.ANCIENT_HALO),
	LOCKED_BRASSICA_HALO(ItemID.BRASSICA_HALO_L, ItemID.BRASSICA_HALO),
	LOCKED_HEALER_HAT(ItemID.HEALER_HAT_L, ItemID.HEALER_HAT),
	LOCKED_FIGHTER_HAT(ItemID.FIGHTER_HAT_L, ItemID.FIGHTER_HAT),
	LOCKED_RANGER_HAT(ItemID.RANGER_HAT_L, ItemID.RANGER_HAT),
	LOCKED_RUNNER_HAT(ItemID.RUNNER_HAT_L, ItemID.RUNNER_HAT),
	LOCKED_FIGHTER_TORSO(ItemID.FIGHTER_TORSO_L, ItemID.FIGHTER_TORSO),
	LOCKED_PENANCE_SKIRT(ItemID.PENANCE_SKIRT_L, ItemID.PENANCE_SKIRT),
	LOCKED_VOID_KNIGHT_TOP(ItemID.VOID_KNIGHT_TOP_L, ItemID.VOID_KNIGHT_TOP),
	LOCKED_ELITE_VOID_TOP(ItemID.ELITE_VOID_TOP_L, ItemID.ELITE_VOID_TOP),
	LOCKED_VOID_KNIGHT_ROBE(ItemID.VOID_KNIGHT_ROBE_L, ItemID.VOID_KNIGHT_ROBE),
	LOCKED_ELITE_VOID_ROBE(ItemID.ELITE_VOID_ROBE_L, ItemID.ELITE_VOID_ROBE),
	LOCKED_VOID_KNIGHT_MACE(ItemID.VOID_KNIGHT_MACE_L, ItemID.VOID_KNIGHT_MACE),
	LOCKED_VOID_KNIGHT_GLOVES(ItemID.VOID_KNIGHT_GLOVES_L, ItemID.VOID_KNIGHT_GLOVES),
	LOCKED_VOID_MAGE_HELM(ItemID.VOID_MAGE_HELM_L, ItemID.VOID_MAGE_HELM),
	LOCKED_VOID_RANGER_HELM(ItemID.VOID_RANGER_HELM_L, ItemID.VOID_RANGER_HELM),
	LOCKED_VOID_MELEE_HELM(ItemID.VOID_MELEE_HELM_L, ItemID.VOID_MELEE_HELM),
	LOCKED_GOLD_DECORATIVE_SWORD(ItemID.DECORATIVE_SWORD_L, ItemID.DECORATIVE_SWORD_4508),
	LOCKED_GOLD_DECORATIVE_BODY(ItemID.DECORATIVE_ARMOUR_L, ItemID.DECORATIVE_ARMOUR_4509),
	LOCKED_GOLD_DECORATIVE_LEGS(ItemID.DECORATIVE_ARMOUR_L_24159, ItemID.DECORATIVE_ARMOUR_4510),
	LOCKED_GOLD_DECORATIVE_HELM(ItemID.DECORATIVE_HELM_L, ItemID.DECORATIVE_HELM_4511),
	LOCKED_GOLD_DECORATIVE_SHIELD(ItemID.DECORATIVE_SHIELD_L, ItemID.DECORATIVE_SHIELD_4512),
	LOCKED_GOLD_DECORATIVE_SKIRT(ItemID.DECORATIVE_ARMOUR_L_24162, ItemID.DECORATIVE_ARMOUR_11895),
	LOCKED_DECORATIVE_MAGE_HAT(ItemID.DECORATIVE_ARMOUR_L_24165, ItemID.DECORATIVE_ARMOUR_11898),
	LOCKED_DECORATIVE_MAGE_ROBE_TOP(ItemID.DECORATIVE_ARMOUR_L_24163, ItemID.DECORATIVE_ARMOUR_11896),
	LOCKED_DECORATIVE_MAGE_ROBE_LEGS(ItemID.DECORATIVE_ARMOUR_L_24164, ItemID.DECORATIVE_ARMOUR_11897),
	LOCKED_DECORATIVE_RANGE_TOP(ItemID.DECORATIVE_ARMOUR_L_24166, ItemID.DECORATIVE_ARMOUR_11899),
	LOCKED_DECORATIVE_RANGE_BOTTOM(ItemID.DECORATIVE_ARMOUR_L_24167, ItemID.DECORATIVE_ARMOUR_11900),
	LOCKED_DECORATIVE_RANGE_QUIVER(ItemID.DECORATIVE_ARMOUR_L_24168, ItemID.DECORATIVE_ARMOUR_11901),
	LOCKED_RUNE_POUCH(ItemID.RUNE_POUCH_L, ItemID.RUNE_POUCH),
	;

	final private int lockedID;
	final private int baseID;

	private final static Map<Integer, Integer> ITEMS;

	static
	{
		final ImmutableMap.Builder<Integer, Integer> builder = new ImmutableMap.Builder<>();

		for (final LockedItem item : values())
		{
			builder.put(item.lockedID, item.baseID);
		}

		ITEMS = builder.build();
	}

	@Nullable
	public static Integer getBaseIdFromLockedId(final int itemID)
	{
		return ITEMS.get(itemID);
	}
}
