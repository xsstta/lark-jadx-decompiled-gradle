package com.ss.android.lark.qrcode.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.p028b.C0745a;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/QRCodeScanLayout;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dstRect", "Landroid/graphics/RectF;", "getDstRect", "()Landroid/graphics/RectF;", "loopDuration", "getLoopDuration", "()I", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "scanningBitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "getScanningBitmap", "()Landroid/graphics/Bitmap;", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "calculateAlpha", "factor", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class QRCodeScanLayout extends View {

    /* renamed from: a */
    private final Bitmap f130796a;

    /* renamed from: b */
    private final Paint f130797b;

    /* renamed from: c */
    private final RectF f130798c;

    /* renamed from: d */
    private final int f130799d;

    /* renamed from: e */
    private long f130800e;

    public QRCodeScanLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public QRCodeScanLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final RectF getDstRect() {
        return this.f130798c;
    }

    public final int getLoopDuration() {
        return this.f130799d;
    }

    public final Paint getPaint() {
        return this.f130797b;
    }

    public final Bitmap getScanningBitmap() {
        return this.f130796a;
    }

    public final long getStartTime() {
        return this.f130800e;
    }

    public final void setStartTime(long j) {
        this.f130800e = j;
    }

    /* renamed from: a */
    private final int m204996a(float f) {
        return C69029a.m265652a(C0745a.m3625a(((double) 3) * Math.sin(((double) f) * 3.141592653589793d), 0.0d, 1.0d) * ((double) 255));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f130800e == 0) {
            this.f130800e = SystemClock.uptimeMillis();
        }
        int width = getWidth();
        Bitmap bitmap = this.f130796a;
        Intrinsics.checkExpressionValueIsNotNull(bitmap, "scanningBitmap");
        Bitmap bitmap2 = this.f130796a;
        Intrinsics.checkExpressionValueIsNotNull(bitmap2, "scanningBitmap");
        float f = (float) width;
        float height = (((float) bitmap.getHeight()) / ((float) bitmap2.getWidth())) * f;
        float uptimeMillis = (1.0f / ((float) this.f130799d)) * ((float) ((SystemClock.uptimeMillis() - this.f130800e) % ((long) this.f130799d)));
        float height2 = (((float) getHeight()) - height) * uptimeMillis;
        this.f130797b.setAlpha(m204996a(uptimeMillis));
        this.f130798c.top = height2;
        this.f130798c.bottom = height + height2;
        this.f130798c.right = f;
        canvas.drawBitmap(this.f130796a, (Rect) null, this.f130798c, this.f130797b);
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QRCodeScanLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f130796a = BitmapFactory.decodeResource(context.getResources(), R.drawable.qr_scanning);
        this.f130797b = new Paint();
        this.f130798c = new RectF();
        this.f130799d = 3000;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QRCodeScanLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
