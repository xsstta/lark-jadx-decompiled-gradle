package com.ss.android.lark.filedetail.impl.folder.manage.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.ss.android.lark.filedetail.impl.folder.manage.drawable.extra.IAddExtraVideoAction;
import com.ss.android.lark.filedetail.impl.folder.manage.drawable.property.DrawableProperty;
import com.ss.android.lark.filedetail.impl.folder.manage.drawable.property.ExtraVideoProperty;
import com.ss.android.lark.widget.span.C59153c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/ExtraVideoDrawable;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/BaseBorderDrawable;", "drawableParams", "Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/property/DrawableProperty;", "borderParams", "Lcom/ss/android/lark/widget/span/BorderProperty;", "videoParams", "Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/property/ExtraVideoProperty;", "extraAction", "Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/extra/IAddExtraVideoAction;", "(Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/property/DrawableProperty;Lcom/ss/android/lark/widget/span/BorderProperty;Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/property/ExtraVideoProperty;Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/extra/IAddExtraVideoAction;)V", "getBorderParams", "()Lcom/ss/android/lark/widget/span/BorderProperty;", "getDrawableParams", "()Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/property/DrawableProperty;", "playRect", "Landroid/graphics/Rect;", "videoBgPaint", "Landroid/graphics/Paint;", "videoBgRectF", "Landroid/graphics/RectF;", "getVideoParams", "()Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/property/ExtraVideoProperty;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.drawable.b */
public final class ExtraVideoDrawable extends BaseBorderDrawable {

    /* renamed from: a */
    private final RectF f98212a = new RectF();

    /* renamed from: b */
    private final Paint f98213b = new Paint();

    /* renamed from: c */
    private final Rect f98214c = new Rect();

    /* renamed from: d */
    private final DrawableProperty f98215d;

    /* renamed from: e */
    private final C59153c f98216e;

    /* renamed from: f */
    private final ExtraVideoProperty f98217f;

    /* renamed from: g */
    private final IAddExtraVideoAction f98218g;

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.drawable.BaseBorderDrawable
    /* renamed from: c */
    public DrawableProperty mo139932c() {
        return this.f98215d;
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.drawable.BaseBorderDrawable
    /* renamed from: d */
    public C59153c mo139933d() {
        return this.f98216e;
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.drawable.BaseBorderDrawable
    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.draw(canvas);
        if (mo139932c().mo139952d()) {
            this.f98218g.mo139939a(canvas, mo139930a(), mo139931b(), mo139933d(), this.f98217f, this.f98212a, this.f98213b);
            this.f98218g.mo139938a(canvas, mo139930a(), mo139931b(), this.f98217f, this.f98214c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtraVideoDrawable(DrawableProperty aVar, C59153c cVar, ExtraVideoProperty extraVideoProperty, IAddExtraVideoAction bVar) {
        super(aVar, cVar);
        Intrinsics.checkParameterIsNotNull(aVar, "drawableParams");
        Intrinsics.checkParameterIsNotNull(cVar, "borderParams");
        Intrinsics.checkParameterIsNotNull(extraVideoProperty, "videoParams");
        Intrinsics.checkParameterIsNotNull(bVar, "extraAction");
        this.f98215d = aVar;
        this.f98216e = cVar;
        this.f98217f = extraVideoProperty;
        this.f98218g = bVar;
    }
}
