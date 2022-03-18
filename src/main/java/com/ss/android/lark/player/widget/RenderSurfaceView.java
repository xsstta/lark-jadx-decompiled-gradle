package com.ss.android.lark.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.p2513c.AbstractC52107b;
import java.lang.ref.WeakReference;

public class RenderSurfaceView extends SurfaceView {

    /* renamed from: a */
    public AbstractC52131a f129344a;

    /* renamed from: com.ss.android.lark.player.widget.RenderSurfaceView$a */
    public interface AbstractC52131a {
        /* renamed from: a */
        void mo178578a(AbstractC52132b bVar);

        /* renamed from: a */
        void mo178579a(AbstractC52132b bVar, int i, int i2);

        /* renamed from: a */
        void mo178580a(AbstractC52132b bVar, int i, int i2, int i3);
    }

    /* renamed from: com.ss.android.lark.player.widget.RenderSurfaceView$b */
    public interface AbstractC52132b {
        /* renamed from: a */
        void mo178581a(AbstractC52107b bVar);
    }

    public AbstractC52131a getRenderCallback() {
        return this.f129344a;
    }

    public void setRenderCallback(AbstractC52131a aVar) {
        this.f129344a = aVar;
    }

    /* renamed from: com.ss.android.lark.player.widget.RenderSurfaceView$d */
    private class SurfaceHolder$CallbackC52134d implements SurfaceHolder.Callback {
        private SurfaceHolder$CallbackC52134d() {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            Log.m165379d("RenderSurfaceView", "<---surfaceCreated---->");
            if (RenderSurfaceView.this.f129344a != null) {
                RenderSurfaceView.this.f129344a.mo178579a(new C52133c(surfaceHolder), 0, 0);
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Log.m165379d("RenderSurfaceView", "***surfaceDestroyed***");
            if (RenderSurfaceView.this.f129344a != null) {
                RenderSurfaceView.this.f129344a.mo178578a(new C52133c(surfaceHolder));
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Log.m165379d("RenderSurfaceView", "surfaceChanged : width = " + i2 + " height = " + i3);
            if (RenderSurfaceView.this.f129344a != null) {
                RenderSurfaceView.this.f129344a.mo178580a(new C52133c(surfaceHolder), i, i2, i3);
            }
        }
    }

    public RenderSurfaceView(Context context) {
        this(context, null);
    }

    /* renamed from: com.ss.android.lark.player.widget.RenderSurfaceView$c */
    private static final class C52133c implements AbstractC52132b {

        /* renamed from: a */
        private WeakReference<SurfaceHolder> f129345a;

        public C52133c(SurfaceHolder surfaceHolder) {
            this.f129345a = new WeakReference<>(surfaceHolder);
        }

        @Override // com.ss.android.lark.player.widget.RenderSurfaceView.AbstractC52132b
        /* renamed from: a */
        public void mo178581a(AbstractC52107b bVar) {
            if (bVar != null && this.f129345a.get() != null) {
                bVar.mo178490a(this.f129345a.get());
            }
        }
    }

    public RenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getHolder().addCallback(new SurfaceHolder$CallbackC52134d());
    }
}
