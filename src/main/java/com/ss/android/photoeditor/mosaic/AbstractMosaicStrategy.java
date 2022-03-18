package com.ss.android.photoeditor.mosaic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.ss.android.photoeditor.mosaic.p3011a.C59739b;
import com.ss.android.photoeditor.mosaic.v2.AbstractC59760a;
import com.ss.android.photoeditor.p3010b.C59610b;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMosaicStrategy {

    /* renamed from: a */
    protected Bitmap f148282a;

    /* renamed from: b */
    protected Bitmap f148283b;

    /* renamed from: c */
    protected Canvas f148284c;

    /* renamed from: d */
    protected AbstractC59760a f148285d;

    /* renamed from: e */
    protected RectF f148286e;

    /* renamed from: f */
    protected RectF f148287f;

    /* renamed from: g */
    protected RectF f148288g;

    /* renamed from: h */
    protected SelectionMode f148289h;

    /* renamed from: i */
    protected List<C59739b> f148290i = new ArrayList();

    /* renamed from: j */
    protected OrcState f148291j = OrcState.UNINITIALIZED;

    /* renamed from: k */
    protected Matrix f148292k = new Matrix();

    /* renamed from: l */
    protected AbstractC59722a f148293l;

    /* renamed from: m */
    protected Context f148294m;

    /* renamed from: n */
    private boolean f148295n = false;

    public enum Effect {
        NORMAL_MOSAIC,
        GAUSSIAN_BLUR
    }

    public enum OrcState {
        UNINITIALIZED,
        INITIALIZED
    }

    public enum SelectionMode {
        PATH,
        RECT
    }

    /* renamed from: com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy$a */
    public interface AbstractC59722a {
        /* renamed from: a */
        void mo203361a(Bitmap bitmap, boolean z);
    }

    /* renamed from: a */
    public abstract void mo203346a(int i);

    /* renamed from: a */
    public abstract void mo203349a(MotionEvent motionEvent);

    /* renamed from: c */
    public void mo203356c() {
        this.f148295n = true;
    }

    /* renamed from: e */
    public abstract void mo203359e();

    /* renamed from: a */
    public SelectionMode mo203345a() {
        return this.f148289h;
    }

    /* renamed from: d */
    public boolean mo203358d() {
        return this.f148295n;
    }

    /* renamed from: b */
    public boolean mo203355b() {
        if (this.f148291j == OrcState.INITIALIZED) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo203360f() {
        C59610b.m231208a(this.f148283b);
        C59610b.m231208a(this.f148282a);
    }

    /* renamed from: b */
    public void mo203354b(RectF rectF) {
        this.f148287f = rectF;
    }

    /* renamed from: c */
    public void mo203357c(RectF rectF) {
        this.f148288g = rectF;
    }

    /* renamed from: a */
    public void mo203347a(Bitmap bitmap) {
        this.f148282a = bitmap;
    }

    public AbstractMosaicStrategy(Context context) {
        this.f148294m = context;
    }

    /* renamed from: a */
    public void mo203348a(RectF rectF) {
        this.f148286e = rectF;
    }

    /* renamed from: a */
    public void mo203350a(SelectionMode selectionMode) {
        this.f148289h = selectionMode;
    }

    /* renamed from: a */
    public void mo203351a(AbstractC59722a aVar) {
        this.f148293l = aVar;
    }

    /* renamed from: a */
    public void mo203352a(AbstractC59760a aVar) {
        this.f148285d = aVar;
    }

    /* renamed from: a */
    public void mo203353a(List<C59739b> list) {
        if (list != null) {
            this.f148290i = list;
            this.f148291j = OrcState.INITIALIZED;
        }
    }
}
