package com.ss.android.ad.splash.core.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public class SSRenderSurfaceView extends SSSurfaceView implements SurfaceHolder.Callback {

    /* renamed from: c */
    private static ArrayList<SurfaceHolder$CallbackC27408g> f68385c = new ArrayList<>();

    /* renamed from: a */
    private AbstractC27376a f68386a;

    /* renamed from: b */
    private SurfaceHolder$CallbackC27408g f68387b;

    public View getView() {
        return this;
    }

    /* renamed from: a */
    private void m99854a() {
        SurfaceHolder$CallbackC27408g gVar = new SurfaceHolder$CallbackC27408g(this);
        this.f68387b = gVar;
        f68385c.add(gVar);
    }

    public SSRenderSurfaceView(Context context) {
        super(context);
        m99854a();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        AbstractC27376a aVar = this.f68386a;
        if (aVar != null) {
            aVar.mo97760a(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC27376a aVar = this.f68386a;
        if (aVar != null) {
            aVar.mo97762b(surfaceHolder);
        }
    }

    /* renamed from: a */
    public void mo97754a(AbstractC27376a aVar) {
        this.f68386a = aVar;
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<SurfaceHolder$CallbackC27408g> it = f68385c.iterator();
        while (it.hasNext()) {
            SurfaceHolder$CallbackC27408g next = it.next();
            if (next.mo97888a() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f68387b);
    }

    public SSRenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m99854a();
    }

    public SSRenderSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m99854a();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AbstractC27376a aVar = this.f68386a;
        if (aVar != null) {
            aVar.mo97761a(surfaceHolder, i, i2, i3);
        }
    }
}
