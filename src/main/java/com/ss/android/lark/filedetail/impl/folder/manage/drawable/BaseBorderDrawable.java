package com.ss.android.lark.filedetail.impl.folder.manage.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.filedetail.impl.folder.manage.drawable.property.DrawableProperty;
import com.ss.android.lark.widget.span.C59153c;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020!H\u0016J\u0012\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/BaseBorderDrawable;", "Landroid/graphics/drawable/Drawable;", "drawableParams", "Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/property/DrawableProperty;", "borderParams", "Lcom/ss/android/lark/widget/span/BorderProperty;", "(Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/property/DrawableProperty;Lcom/ss/android/lark/widget/span/BorderProperty;)V", "borderPaint", "Landroid/graphics/Paint;", "getBorderParams", "()Lcom/ss/android/lark/widget/span/BorderProperty;", "borderRectF", "Landroid/graphics/RectF;", "getDrawableParams", "()Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/property/DrawableProperty;", "imagePaint", "imageRectF", "matrix", "Landroid/graphics/Matrix;", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "viewRectF", "getViewRectF", "()Landroid/graphics/RectF;", "clipImage", "", "canvas", "Landroid/graphics/Canvas;", "draw", "drawBorder", "getOpacity", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.drawable.a */
public class BaseBorderDrawable extends Drawable {

    /* renamed from: a */
    private final Path f98203a = new Path();

    /* renamed from: b */
    private final RectF f98204b = new RectF();

    /* renamed from: c */
    private final RectF f98205c = new RectF();

    /* renamed from: d */
    private final Paint f98206d = new Paint(2);

    /* renamed from: e */
    private final Matrix f98207e = new Matrix();

    /* renamed from: f */
    private final RectF f98208f = new RectF();

    /* renamed from: g */
    private final Paint f98209g = new Paint();

    /* renamed from: h */
    private final DrawableProperty f98210h;

    /* renamed from: i */
    private final C59153c f98211i;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: a */
    public final Path mo139930a() {
        return this.f98203a;
    }

    /* renamed from: b */
    public final RectF mo139931b() {
        return this.f98204b;
    }

    /* renamed from: c */
    public DrawableProperty mo139932c() {
        return this.f98210h;
    }

    /* renamed from: d */
    public C59153c mo139933d() {
        return this.f98211i;
    }

    /* renamed from: b */
    private final void m150557b(Canvas canvas) {
        float b = ((float) mo139933d().mo201081b()) / ((float) 2);
        this.f98208f.set(this.f98204b);
        this.f98208f.inset(b, b);
        this.f98209g.setAntiAlias(true);
        this.f98209g.setStyle(Paint.Style.STROKE);
        this.f98209g.setColor(mo139933d().mo201080a());
        this.f98209g.setStrokeWidth((float) mo139933d().mo201081b());
        this.f98203a.reset();
        this.f98203a.addRoundRect(this.f98208f, (float) mo139933d().mo201082c(), (float) mo139933d().mo201082c(), Path.Direction.CW);
        canvas.drawPath(this.f98203a, this.f98209g);
    }

    public void draw(Canvas canvas) {
        float f;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        float e = mo139932c().mo139953e();
        float f2 = (float) 0;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (e < f2) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = mo139932c().mo139953e();
        }
        if (mo139932c().mo139955f() >= f2) {
            f3 = mo139932c().mo139955f();
        }
        this.f98204b.set(f, f3, mo139932c().mo139950b() - f, mo139932c().mo139951c());
        m150556a(canvas);
        m150557b(canvas);
    }

    /* renamed from: a */
    private final void m150556a(Canvas canvas) {
        if (mo139932c().mo139949a() instanceof BitmapDrawable) {
            Drawable a = mo139932c().mo139949a();
            if (a != null) {
                Bitmap bitmap = ((BitmapDrawable) a).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f98205c.set(this.f98204b);
                    this.f98205c.inset((float) mo139933d().mo201081b(), (float) mo139933d().mo201081b());
                    this.f98207e.reset();
                    if (mo139932c().mo139956g() != BitmapDescriptorFactory.HUE_RED) {
                        this.f98207e.setScale(mo139932c().mo139956g(), mo139932c().mo139956g());
                    }
                    this.f98207e.postTranslate(mo139932c().mo139953e(), mo139932c().mo139955f());
                    int saveCount = canvas.getSaveCount();
                    canvas.save();
                    this.f98203a.reset();
                    this.f98203a.addRoundRect(this.f98205c, (float) mo139933d().mo201082c(), (float) mo139933d().mo201082c(), Path.Direction.CW);
                    canvas.clipPath(this.f98203a);
                    canvas.drawBitmap(bitmap, this.f98207e, this.f98206d);
                    canvas.restoreToCount(saveCount);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        }
    }

    public BaseBorderDrawable(DrawableProperty aVar, C59153c cVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "drawableParams");
        Intrinsics.checkParameterIsNotNull(cVar, "borderParams");
        this.f98210h = aVar;
        this.f98211i = cVar;
    }
}
