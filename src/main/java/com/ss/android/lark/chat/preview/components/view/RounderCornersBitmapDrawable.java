package com.ss.android.lark.chat.preview.components.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.widget.span.C59153c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00102\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\b\u00103\u001a\u00020.H\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u001f\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001b¨\u00064"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/RounderCornersBitmapDrawable;", "Landroid/graphics/drawable/BitmapDrawable;", "res", "Landroid/content/res/Resources;", "srcDrawable", "borderProperty", "Lcom/ss/android/lark/widget/span/BorderProperty;", "outWidth", "", "outHeight", "(Landroid/content/res/Resources;Landroid/graphics/drawable/BitmapDrawable;Lcom/ss/android/lark/widget/span/BorderProperty;II)V", "borderPaint", "Landroid/graphics/Paint;", "getBorderPaint", "()Landroid/graphics/Paint;", "setBorderPaint", "(Landroid/graphics/Paint;)V", "borderRadius", "getBorderRadius", "()I", "setBorderRadius", "(I)V", "borderRectF", "Landroid/graphics/RectF;", "getBorderRectF", "()Landroid/graphics/RectF;", "setBorderRectF", "(Landroid/graphics/RectF;)V", "borderWidth", "getBorderWidth", "setBorderWidth", "imageRectF", "getImageRectF", "setImageRectF", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "getRes", "()Landroid/content/res/Resources;", "viewRectF", "getViewRectF", "setViewRectF", "clipImage", "", "canvas", "Landroid/graphics/Canvas;", "draw", "drawBorder", "init", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.view.c */
public final class RounderCornersBitmapDrawable extends BitmapDrawable {

    /* renamed from: a */
    private RectF f88247a = new RectF();

    /* renamed from: b */
    private RectF f88248b = new RectF();

    /* renamed from: c */
    private RectF f88249c = new RectF();

    /* renamed from: d */
    private Path f88250d = new Path();

    /* renamed from: e */
    private Paint f88251e = new Paint();

    /* renamed from: f */
    private int f88252f;

    /* renamed from: g */
    private int f88253g;

    /* renamed from: h */
    private final Resources f88254h;

    /* renamed from: i */
    private final BitmapDrawable f88255i;

    /* renamed from: j */
    private final C59153c f88256j;

    /* renamed from: k */
    private final int f88257k;

    /* renamed from: l */
    private final int f88258l;

    /* renamed from: a */
    private final void m132456a() {
        this.f88247a.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f88257k, (float) this.f88258l);
        float f = (((float) this.f88252f) * 1.0f) / ((float) 2);
        this.f88249c.set(this.f88247a);
        this.f88249c.inset(f, f);
        this.f88248b.set(this.f88247a);
        RectF rectF = this.f88248b;
        int i = this.f88252f;
        rectF.inset((float) i, (float) i);
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Bitmap bitmap = getBitmap();
        Intrinsics.checkExpressionValueIsNotNull(bitmap, "bitmap");
        if (!bitmap.isRecycled()) {
            m132456a();
            m132457a(canvas);
            m132458b(canvas);
        }
    }

    /* renamed from: b */
    private final void m132458b(Canvas canvas) {
        this.f88251e.setAntiAlias(true);
        this.f88251e.setStyle(Paint.Style.STROKE);
        this.f88251e.setColor(this.f88256j.mo201080a());
        this.f88251e.setStrokeWidth((float) this.f88256j.mo201081b());
        this.f88250d.reset();
        Path path = this.f88250d;
        RectF rectF = this.f88249c;
        int i = this.f88253g;
        path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
        canvas.drawPath(this.f88250d, this.f88251e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m132457a(android.graphics.Canvas r9) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.preview.components.view.RounderCornersBitmapDrawable.m132457a(android.graphics.Canvas):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RounderCornersBitmapDrawable(Resources resources, BitmapDrawable bitmapDrawable, C59153c cVar, int i, int i2) {
        super(resources, bitmapDrawable.getBitmap());
        Intrinsics.checkParameterIsNotNull(resources, "res");
        Intrinsics.checkParameterIsNotNull(bitmapDrawable, "srcDrawable");
        Intrinsics.checkParameterIsNotNull(cVar, "borderProperty");
        this.f88254h = resources;
        this.f88255i = bitmapDrawable;
        this.f88256j = cVar;
        this.f88257k = i;
        this.f88258l = i2;
        this.f88252f = cVar.mo201081b();
        this.f88253g = cVar.mo201082c();
    }
}
