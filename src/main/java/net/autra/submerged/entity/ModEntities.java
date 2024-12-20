package net.autra.submerged.entity;

import net.autra.submerged.Submerged;
import net.autra.submerged.entity.custom.SharkEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<SharkEntity> SHARK = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Submerged.MOD_ID, "shark"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SharkEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());

    public static void registerModEntities() {
        Submerged.LOGGER.info("Registering mod entities");
    }
}
