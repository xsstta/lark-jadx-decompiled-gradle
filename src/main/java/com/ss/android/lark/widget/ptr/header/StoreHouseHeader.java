package com.ss.android.lark.widget.ptr.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Transformation;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.widget.ptr.AbstractC58934a;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.ptr.p2961a.C58935a;
import com.ss.android.lark.widget.ptr.p2962b.C58937a;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;

public class StoreHouseHeader extends View implements AbstractC58934a {

    /* renamed from: a */
    public ArrayList<C58954b> f145961a = new ArrayList<>();

    /* renamed from: b */
    public float f145962b = 1.0f;

    /* renamed from: c */
    public float f145963c = 0.4f;

    /* renamed from: d */
    public int f145964d = 1000;

    /* renamed from: e */
    public int f145965e = 1000;

    /* renamed from: f */
    public int f145966f = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;

    /* renamed from: g */
    private int f145967g = -1;

    /* renamed from: h */
    private float f145968h = 1.0f;

    /* renamed from: i */
    private int f145969i = -1;

    /* renamed from: j */
    private float f145970j = 0.7f;

    /* renamed from: k */
    private int f145971k = -1;

    /* renamed from: l */
    private float f145972l = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: m */
    private int f145973m = 0;

    /* renamed from: n */
    private int f145974n = 0;

    /* renamed from: o */
    private int f145975o = 0;

    /* renamed from: p */
    private int f145976p = 0;

    /* renamed from: q */
    private float f145977q = 0.4f;

    /* renamed from: r */
    private Transformation f145978r = new Transformation();

    /* renamed from: s */
    private boolean f145979s = false;

    /* renamed from: t */
    private RunnableC58943a f145980t = new RunnableC58943a();

    /* renamed from: u */
    private int f145981u = -1;

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: b */
    public void mo166240b(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
    }

    public int getLoadingAniDuration() {
        return this.f145964d;
    }

    public float getScale() {
        return this.f145968h;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.ptr.header.StoreHouseHeader$a */
    public class RunnableC58943a implements Runnable {

        /* renamed from: b */
        private int f145983b;

        /* renamed from: c */
        private int f145984c;

        /* renamed from: d */
        private int f145985d;

        /* renamed from: e */
        private int f145986e;

        /* renamed from: f */
        private boolean f145987f;

        /* renamed from: b */
        public void mo199959b() {
            this.f145987f = false;
            StoreHouseHeader.this.removeCallbacks(this);
        }

        /* renamed from: a */
        public void mo199958a() {
            this.f145987f = true;
            this.f145983b = 0;
            this.f145986e = StoreHouseHeader.this.f145964d / StoreHouseHeader.this.f145961a.size();
            this.f145984c = StoreHouseHeader.this.f145965e / this.f145986e;
            this.f145985d = (StoreHouseHeader.this.f145961a.size() / this.f145984c) + 1;
            run();
        }

        public void run() {
            int i = this.f145983b % this.f145984c;
            for (int i2 = 0; i2 < this.f145985d; i2++) {
                int i3 = (this.f145984c * i2) + i;
                if (i3 <= this.f145983b) {
                    C58954b bVar = StoreHouseHeader.this.f145961a.get(i3 % StoreHouseHeader.this.f145961a.size());
                    bVar.setFillAfter(false);
                    bVar.setFillEnabled(true);
                    bVar.setFillBefore(false);
                    bVar.setDuration((long) StoreHouseHeader.this.f145966f);
                    bVar.mo200020a(StoreHouseHeader.this.f145962b, StoreHouseHeader.this.f145963c);
                }
            }
            this.f145983b++;
            if (this.f145987f) {
                StoreHouseHeader.this.postDelayed(this, (long) this.f145986e);
            }
        }

        private RunnableC58943a() {
            this.f145987f = true;
        }
    }

    /* renamed from: b */
    private void m228792b() {
        this.f145979s = true;
        this.f145980t.mo199958a();
        invalidate();
    }

    /* renamed from: c */
    private void m228793c() {
        this.f145979s = false;
        this.f145980t.mo199959b();
    }

    private int getBottomOffset() {
        return getPaddingBottom() + C58937a.m228778a(10.0f);
    }

    private int getTopOffset() {
        return getPaddingTop() + C58937a.m228778a(10.0f);
    }

    /* renamed from: a */
    private void m228791a() {
        C58937a.m228779a(getContext());
        this.f145967g = C58937a.m228778a(1.0f);
        this.f145969i = C58937a.m228778a(40.0f);
        this.f145971k = C58937a.f145946a / 2;
    }

    private void setProgress(float f) {
        this.f145972l = f;
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: c */
    public void mo166241c(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m228792b();
    }

    public void setScale(float f) {
        this.f145968h = f;
    }

    public void setLoadingAniDuration(int i) {
        this.f145964d = i;
        this.f145965e = i;
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166237a(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m228793c();
        for (int i = 0; i < this.f145961a.size(); i++) {
            this.f145961a.get(i).mo200021a(this.f145971k);
        }
    }

    public StoreHouseHeader(Context context) {
        super(context);
        m228791a();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f145972l;
        int save = canvas.save();
        int size = this.f145961a.size();
        for (int i = 0; i < size; i++) {
            canvas.save();
            C58954b bVar = this.f145961a.get(i);
            float f2 = ((float) this.f145975o) + bVar.f146043a.x;
            float f3 = ((float) this.f145976p) + bVar.f146043a.y;
            if (this.f145979s) {
                bVar.getTransformation(getDrawingTime(), this.f145978r);
                canvas.translate(f2, f3);
            } else {
                float f4 = BitmapDescriptorFactory.HUE_RED;
                if (f == BitmapDescriptorFactory.HUE_RED) {
                    bVar.mo200021a(this.f145971k);
                } else {
                    float f5 = this.f145970j;
                    float f6 = ((1.0f - f5) * ((float) i)) / ((float) size);
                    float f7 = (1.0f - f5) - f6;
                    if (f == 1.0f || f >= 1.0f - f7) {
                        canvas.translate(f2, f3);
                        bVar.mo200019a(this.f145977q);
                    } else {
                        if (f > f6) {
                            f4 = Math.min(1.0f, (f - f6) / f5);
                        }
                        float f8 = 1.0f - f4;
                        float f9 = f2 + (bVar.f146044b * f8);
                        float f10 = f3 + (((float) (-this.f145969i)) * f8);
                        Matrix matrix = new Matrix();
                        matrix.postRotate(360.0f * f4);
                        matrix.postScale(f4, f4);
                        matrix.postTranslate(f9, f10);
                        bVar.mo200019a(this.f145977q * f4);
                        canvas.concat(matrix);
                    }
                }
            }
            bVar.mo200022a(canvas);
            canvas.restore();
        }
        if (this.f145979s) {
            invalidate();
        }
        canvas.restoreToCount(save);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166238a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z) {
        m228793c();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getTopOffset() + this.f145974n + getBottomOffset(), 1073741824));
        this.f145975o = (getMeasuredWidth() - this.f145973m) / 2;
        this.f145976p = getTopOffset();
        this.f145969i = getTopOffset();
    }

    public StoreHouseHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m228791a();
    }

    public StoreHouseHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m228791a();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166239a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z, byte b, C58935a aVar) {
        setProgress(Math.min(1.0f, aVar.mo199934y()));
        invalidate();
    }
}
