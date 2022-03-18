package com.ss.texturerender;

import android.content.Context;
import android.view.Surface;
import com.ss.texturerender.effect.EffectConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class TextureRenderManager {
    private static TextureRenderManager mManager;
    private Context mContext;
    private ReentrantLock mListLock = new ReentrantLock();
    private List<TextureRenderer> mRenderers = new ArrayList();
    private String mTextureError = null;

    public Context getContext() {
        return this.mContext;
    }

    public String getTextureError() {
        return this.mTextureError;
    }

    public synchronized void release() {
        releaseRenderers();
        mManager = null;
    }

    private TextureRenderManager() {
    }

    public static synchronized TextureRenderManager getManager() {
        TextureRenderManager textureRenderManager;
        synchronized (TextureRenderManager.class) {
            if (mManager == null) {
                mManager = new TextureRenderManager();
            }
            textureRenderManager = mManager;
        }
        return textureRenderManager;
    }

    private void releaseRenderers() {
        if (this.mRenderers.size() != 0) {
            this.mListLock.lock();
            Iterator<TextureRenderer> it = this.mRenderers.iterator();
            while (it.hasNext()) {
                TextureRenderer next = it.next();
                TextureRenderLog.m256492d("TextureRenderManager", "render = " + next + ", call release");
                next.release();
                it.remove();
                TextureRenderLog.m256492d("TextureRenderManager", "release : remove render =" + next + "size = " + this.mRenderers.size());
            }
            this.mListLock.unlock();
        }
    }

    public void setContext(Context context) {
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
    }

    public synchronized boolean isSRRenderAvaiable(int i) {
        boolean z = false;
        if (this.mRenderers.size() == 0) {
            return false;
        }
        this.mListLock.lock();
        Iterator<TextureRenderer> it = this.mRenderers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TextureRenderer next = it.next();
            if (next.getEffectConfig().isOpenSR() && next.texType() == i && (next.texType() & 4) == 0) {
                z = true;
                break;
            }
        }
        this.mListLock.unlock();
        return z;
    }

    public synchronized VideoSurface genAvaiableSurface(boolean z, int i) {
        EffectConfig effectConfig;
        effectConfig = new EffectConfig();
        effectConfig.setOpenSR(z);
        return genAvaiableSurface(effectConfig, i);
    }

    public boolean clearSurface(Surface surface, boolean z) {
        if (surface == null) {
            TextureRenderLog.m256492d("TextureRenderManager", "invalid parameter");
            return false;
        }
        TextureRenderer renderer = getRenderer(new EffectConfig(), 2);
        if (renderer != null) {
            return renderer.clearSurface(surface, z);
        }
        TextureRenderLog.m256492d("TextureRenderManager", "couldn't get a renderer return");
        return false;
    }

    private VideoSurface genRenderSurface(EffectConfig effectConfig, int i) {
        TextureRenderer createRender = RenderFactory.createRender(effectConfig, i);
        TextureRenderLog.m256492d("TextureRenderManager", "new TextureRenderer use:" + createRender);
        if (createRender.getState() != -1) {
            VideoSurface genOffscreenSurface = createRender.genOffscreenSurface();
            if (genOffscreenSurface == null) {
                this.mTextureError = createRender.getErrorReason();
                createRender.release();
                return null;
            }
            this.mListLock.lock();
            this.mRenderers.add(createRender);
            TextureRenderLog.m256492d("TextureRenderManager", "add render = " + createRender + ", effectconfig= " + effectConfig + ", texType =" + i + ",size = " + this.mRenderers.size());
            this.mListLock.unlock();
            return genOffscreenSurface;
        }
        this.mTextureError = createRender.getErrorReason();
        createRender.release();
        return null;
    }

    public synchronized boolean isEffectAvailable(EffectConfig effectConfig, int i) {
        boolean z = false;
        if (this.mRenderers.size() == 0) {
            return false;
        }
        this.mListLock.lock();
        Iterator<TextureRenderer> it = this.mRenderers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TextureRenderer next = it.next();
            if (next.getEffectConfig().isSubSet(effectConfig) && next.texType() == i && (next.texType() & 4) == 0) {
                z = true;
                break;
            }
        }
        this.mListLock.unlock();
        return z;
    }

    private TextureRenderer getRenderer(EffectConfig effectConfig, int i) {
        TextureRenderer textureRenderer;
        TextureRenderer textureRenderer2;
        this.mListLock.lock();
        Iterator<TextureRenderer> it = this.mRenderers.iterator();
        while (true) {
            textureRenderer = null;
            if (!it.hasNext()) {
                textureRenderer2 = null;
                break;
            }
            textureRenderer2 = it.next();
            if (textureRenderer2.texType() == i) {
                if (textureRenderer2.getState() >= 1) {
                    break;
                }
                TextureRenderLog.m256492d("TextureRenderManager", "remove render =" + textureRenderer2 + " state = " + textureRenderer2.getState());
                textureRenderer2.release();
                it.remove();
            }
        }
        if (textureRenderer2 == null) {
            TextureRenderer createRender = RenderFactory.createRender(effectConfig, i);
            if (createRender.getState() != -1) {
                this.mRenderers.add(createRender);
                TextureRenderLog.m256492d("TextureRenderManager", "add render = " + createRender + ", effectconfig= " + effectConfig + ", texType =" + i + ",size = " + this.mRenderers.size());
                textureRenderer = createRender;
            } else {
                this.mTextureError = createRender.getErrorReason();
                createRender.release();
            }
        } else {
            textureRenderer = textureRenderer2;
        }
        this.mListLock.unlock();
        return textureRenderer;
    }

    public synchronized VideoSurface genAvaiableSurface(EffectConfig effectConfig, int i) {
        if (this.mRenderers.size() == 0) {
            return genRenderSurface(effectConfig, i);
        }
        this.mListLock.lock();
        Iterator<TextureRenderer> it = this.mRenderers.iterator();
        VideoSurface videoSurface = null;
        while (it.hasNext()) {
            TextureRenderer next = it.next();
            EffectConfig effectConfig2 = next.getEffectConfig();
            if (!effectConfig2.isSubSet(effectConfig)) {
                TextureRenderLog.m256492d("TextureRenderManager", "render type is mis match = " + effectConfig2 + ", " + effectConfig);
            } else if ((effectConfig2.isOpenSR() || effectConfig2.isOpenSharpen()) && next.texType() != i) {
                TextureRenderLog.m256492d("TextureRenderManager", "sr/sharpen but tex type is mis match = " + next.texType() + ", " + i);
            } else if ((i & 4) != (next.texType() & 4)) {
                continue;
            } else {
                TextureRenderLog.m256492d("TextureRenderManager", "TextureRenderer use:" + next);
                videoSurface = next.genOffscreenSurface();
                if (videoSurface == null && next.getState() < 1) {
                    TextureRenderLog.m256492d("TextureRenderManager", "remove render =" + next + " state = " + next.getState());
                    next.release();
                    it.remove();
                } else if (videoSurface != null) {
                    this.mListLock.unlock();
                    return videoSurface;
                }
            }
        }
        this.mListLock.unlock();
        if (videoSurface != null) {
            return null;
        }
        return genRenderSurface(effectConfig, i);
    }

    public synchronized void asyncInitSR(int i, int i2, String str, String str2, String str3) {
        if (!isSRRenderAvaiable(i)) {
            VideoSurface genAvaiableSurface = genAvaiableSurface(true, i);
            if (genAvaiableSurface != null) {
                genAvaiableSurface.setSuperResolutionInitConfig(i2, str, str2, str3);
                genAvaiableSurface.release();
            }
        }
    }

    public synchronized void asyncInitSR(int i, int i2, String str, String str2, String str3, int i3, int i4) {
        asyncInitSR(i, i2, str, str2, str3, i3, i4, null);
    }

    public synchronized void asyncInitSR(int i, int i2, String str, String str2, String str3, int i3, int i4, String str4) {
        if (!isSRRenderAvaiable(i)) {
            VideoSurface genAvaiableSurface = genAvaiableSurface(true, i);
            if (genAvaiableSurface != null) {
                genAvaiableSurface.setSuperResolutionInitConfig(i2, str, str2, str3, i3, i4, str4);
                genAvaiableSurface.release();
            }
        }
    }
}
