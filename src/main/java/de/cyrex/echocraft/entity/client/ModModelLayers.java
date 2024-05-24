package de.cyrex.echocraft.entity.client;

import de.cyrex.echocraft.EchoCraft;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(EchoCraft.MOD_ID, "porcupine"), "main");
}
