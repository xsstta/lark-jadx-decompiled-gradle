package com.ss.android.lark.profile.func.medal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.v3.userprofile.p2537d.C52743a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/SunshineImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "paint", "Landroid/graphics/Paint;", "radius", "", "sunshineDrawable", "Landroid/graphics/drawable/Drawable;", "xfermode", "Landroid/graphics/PorterDuffXfermode;", "drawSunshineDrawable", "", "canvas", "Landroid/graphics/Canvas;", "rotationDegrees", "onDraw", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SunshineImageView extends AppCompatImageView {

    /* renamed from: a */
    private final Drawable f129775a;

    /* renamed from: b */
    private final int f129776b;

    /* renamed from: c */
    private final PorterDuffXfermode f129777c;

    /* renamed from: d */
    private final Paint f129778d;

    public SunshineImageView(Context context) {
        this(context, null, 2, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = this.f129775a;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f129775a.getIntrinsicHeight());
        int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight(), null);
        canvas.translate(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        for (int i = 0; i < 24; i++) {
            m203049a(canvas, i * 15);
        }
        this.f129778d.setXfermode(this.f129777c);
        canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f129776b, this.f129778d);
        this.f129778d.setXfermode(null);
        canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f129776b, this.f129778d);
        canvas.restoreToCount(saveLayer);
    }

    /* renamed from: a */
    private final void m203049a(Canvas canvas, int i) {
        float f = (float) i;
        canvas.rotate(f);
        canvas.translate(((float) (-this.f129775a.getIntrinsicWidth())) / 2.0f, -((float) this.f129775a.getIntrinsicHeight()));
        this.f129775a.draw(canvas);
        canvas.translate(((float) this.f129775a.getIntrinsicWidth()) / 2.0f, (float) this.f129775a.getIntrinsicHeight());
        canvas.rotate(-f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SunshineImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.ic_sunshine);
        if (drawable == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(drawable, "ContextCompat.getDrawabl…R.drawable.ic_sunshine)!!");
        this.f129775a = drawable;
        this.f129776b = C52743a.m204272a(SmActions.ACTION_RINGING_ENTRY);
        this.f129777c = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#1DDDFFFB"));
        paint.setStyle(Paint.Style.FILL);
        this.f129778d = paint;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SunshineImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
