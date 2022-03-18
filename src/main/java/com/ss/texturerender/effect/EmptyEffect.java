package com.ss.texturerender.effect;

public class EmptyEffect extends AbsEffect {
    @Override // com.ss.texturerender.effect.AbsEffect
    public EffectTexture process(EffectTexture effectTexture, FrameBuffer frameBuffer) {
        return null;
    }

    public EmptyEffect() {
        super(6);
        this.mOrder = 101;
    }
}
