package com.example.examplemod;

import org.dimdev.riftloader.listener.InitializationListener;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

public class ExampleModCore implements InitializationListener {
    override fun onInitialization() {
        MixinBootstrap.init(); // not needed for much longer
        Mixins.addConfiguration("mixins.examplemod.json");
    }
}
