package com.tt.miniapp.view.lark.dotsloader;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

public abstract class DotsLoaderBaseView extends View {

    /* renamed from: a */
    protected int f169517a = ParticipantRepo.f117150c;

    /* renamed from: b */
    protected float[] f169518b;

    /* renamed from: c */
    protected Paint f169519c;

    /* renamed from: d */
    protected Paint f169520d;

    /* renamed from: e */
    protected Paint f169521e;

    /* renamed from: f */
    protected Paint f169522f;

    /* renamed from: g */
    protected boolean f169523g = true;

    /* renamed from: h */
    protected int f169524h = 1;

    /* renamed from: i */
    protected int f169525i = getResources().getColor(17170432);

    /* renamed from: j */
    protected int f169526j = 30;

    /* renamed from: k */
    protected boolean f169527k = true;

    /* renamed from: l */
    private boolean f169528l;

    /* renamed from: m */
    private int f169529m = getResources().getColor(R.color.loader_selected);

    /* renamed from: n */
    private int f169530n = 0;

    /* renamed from: o */
    private int f169531o = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo233610a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo233612b() {
        Paint paint = new Paint();
        this.f169519c = paint;
        paint.setAntiAlias(true);
        this.f169519c.setStyle(Paint.Style.FILL);
        this.f169519c.setColor(this.f169525i);
        Paint paint2 = new Paint();
        this.f169520d = paint2;
        paint2.setAntiAlias(true);
        this.f169520d.setStyle(Paint.Style.FILL);
        this.f169520d.setColor(this.f169529m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo233613c() {
        if (this.f169527k) {
            if (!this.f169528l) {
                this.f169530n = C67199a.m261867a(this.f169529m, 0.7f);
                this.f169531o = C67199a.m261867a(this.f169529m, 0.5f);
                this.f169528l = true;
            }
            Paint paint = new Paint();
            this.f169521e = paint;
            paint.setAntiAlias(true);
            this.f169521e.setStyle(Paint.Style.FILL);
            this.f169521e.setColor(this.f169530n);
            Paint paint2 = new Paint();
            this.f169522f = paint2;
            paint2.setAntiAlias(true);
            this.f169522f.setStyle(Paint.Style.FILL);
            this.f169522f.setColor(this.f169531o);
        }
    }

    public void setRadius(int i) {
        this.f169526j = i;
        mo233610a();
    }

    public void setDefaultColor(int i) {
        this.f169525i = i;
        Paint paint = this.f169519c;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setFirstShadowColor(int i) {
        this.f169530n = i;
        if (i != 0) {
            this.f169528l = true;
            mo233613c();
        }
    }

    public void setSecondShadowColor(int i) {
        this.f169531o = i;
        if (i != 0) {
            this.f169528l = true;
            mo233613c();
        }
    }

    public void setSelectedColor(int i) {
        this.f169529m = i;
        Paint paint = this.f169520d;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public DotsLoaderBaseView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo233611a(AttributeSet attributeSet) {
        Context context = getContext();
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.loader_animDur, R.attr.loader_circleRadius, R.attr.loader_defaultColor, R.attr.loader_firstShadowColor, R.attr.loader_secondShadowColor, R.attr.loader_selectedColor, R.attr.loader_showRunningShadow}, 0, 0);
        this.f169525i = obtainStyledAttributes.getColor(2, resources.getColor(R.color.loader_defalut));
        this.f169529m = obtainStyledAttributes.getColor(5, resources.getColor(R.color.loader_selected));
        this.f169526j = obtainStyledAttributes.getDimensionPixelSize(1, 30);
        this.f169517a = obtainStyledAttributes.getInt(0, ParticipantRepo.f117150c);
        this.f169527k = obtainStyledAttributes.getBoolean(6, true);
        this.f169530n = obtainStyledAttributes.getColor(3, 0);
        this.f169531o = obtainStyledAttributes.getColor(4, 0);
        obtainStyledAttributes.recycle();
    }

    public DotsLoaderBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DotsLoaderBaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
