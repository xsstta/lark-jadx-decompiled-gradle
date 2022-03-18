package pl.droidsonroids.gif;

import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import pl.droidsonroids.gif.GifTextureView;

/* renamed from: pl.droidsonroids.gif.j */
class TextureView$SurfaceTextureListenerC70166j implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    private final GifTextureView.AbstractC70142a f175284a;

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    TextureView$SurfaceTextureListenerC70166j(GifTextureView.AbstractC70142a aVar) {
        this.f175284a = aVar;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        Canvas lockCanvas = surface.lockCanvas(null);
        this.f175284a.mo247249a(lockCanvas);
        surface.unlockCanvasAndPost(lockCanvas);
        surface.release();
    }
}
