package com.ss.android.vc.meeting.module.meetingdialog.labs.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;

public class LabsSeekBar extends SeekBar {

    /* renamed from: a */
    Paint f156538a = new Paint();

    /* renamed from: b */
    int f156539b = 0;

    /* renamed from: c */
    int f156540c = 30;

    public int getMin_() {
        return this.f156539b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo215460a() {
        this.f156538a.setAntiAlias(true);
        this.f156538a.setColor(C60773o.m236126d(R.color.static_white));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public synchronized void setDefault(int i) {
        this.f156540c = i;
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        mo215462b(canvas);
        mo215461a(canvas);
    }

    public LabsSeekBar(Context context) {
        super(context);
        mo215460a();
    }

    public synchronized void setMin(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            super.setMin(i);
        }
        this.f156539b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo215461a(Canvas canvas) {
        Drawable thumb = getThumb();
        if (thumb != null) {
            int save = canvas.save();
            canvas.translate((float) (getPaddingLeft() - getThumbOffset()), (float) getPaddingTop());
            thumb.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo215462b(Canvas canvas) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 29) {
            drawable = getCurrentDrawable();
        } else {
            drawable = getProgressDrawable();
        }
        if (drawable != null) {
            int save = canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            drawable.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public LabsSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo215460a();
    }
}
