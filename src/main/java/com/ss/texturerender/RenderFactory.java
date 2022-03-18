package com.ss.texturerender;

import com.ss.texturerender.effect.EffectConfig;
import com.ss.texturerender.overlay.OverlayVideoTextureRenderer;

class RenderFactory {
    RenderFactory() {
    }

    public static TextureRenderer createRender(EffectConfig effectConfig, int i) {
        if ((i & 4) > 0) {
            return new OverlayVideoTextureRenderer(effectConfig, i);
        }
        return new VideoTextureRenderer(effectConfig, i);
    }
}
