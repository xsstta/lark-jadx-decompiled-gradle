package com.ss.android.lark.chat.preview.components.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.p1960c.C38821a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.span.C59153c;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002=>BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJR\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020\fH\u0016J4\u00109\u001a\u00020\u00072\u0006\u00106\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u000e\u0010<\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006?"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/CenterSpaceRemoteImageSpan;", "Landroid/text/style/ImageSpan;", "context", "Landroid/content/Context;", "key", "", "mWidth", "", "mHeight", "marginLeft", "marginRight", "placeHolder", "Landroid/graphics/drawable/Drawable;", "drawableColor", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "(Landroid/content/Context;Ljava/lang/String;IIIILandroid/graphics/drawable/Drawable;Lcom/ss/android/lark/chat/entity/preview/ThemeColor;)V", "getContext", "()Landroid/content/Context;", "getDrawableColor", "()Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "getKey", "()Ljava/lang/String;", "listener", "Lcom/ss/android/lark/chat/preview/components/view/CenterSpaceRemoteImageSpan$OnImageReadyListener;", "getListener", "()Lcom/ss/android/lark/chat/preview/components/view/CenterSpaceRemoteImageSpan$OnImageReadyListener;", "setListener", "(Lcom/ss/android/lark/chat/preview/components/view/CenterSpaceRemoteImageSpan$OnImageReadyListener;)V", "getMHeight", "()I", "getMWidth", "getMarginLeft", "getMarginRight", "picShow", "", "getPicShow", "()Z", "setPicShow", "(Z)V", "getPlaceHolder", "()Landroid/graphics/drawable/Drawable;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getDrawable", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "setOnImageReadyListener", "OnImageReadyListener", "RemoteDrawableTarget", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.view.a */
public final class CenterSpaceRemoteImageSpan extends ImageSpan {

    /* renamed from: a */
    private boolean f88233a;

    /* renamed from: b */
    private OnImageReadyListener f88234b;

    /* renamed from: c */
    private final Context f88235c;

    /* renamed from: d */
    private final String f88236d;

    /* renamed from: e */
    private final int f88237e;

    /* renamed from: f */
    private final int f88238f;

    /* renamed from: g */
    private final int f88239g;

    /* renamed from: h */
    private final int f88240h;

    /* renamed from: i */
    private final Drawable f88241i;

    /* renamed from: j */
    private final ThemeColor f88242j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/CenterSpaceRemoteImageSpan$OnImageReadyListener;", "", "onImageReady", "", "onLoadFailed", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.a$a */
    public interface OnImageReadyListener {
        /* renamed from: a */
        void mo126341a();

        /* renamed from: b */
        void mo126342b();
    }

    /* renamed from: b */
    public final OnImageReadyListener mo126335b() {
        return this.f88234b;
    }

    /* renamed from: c */
    public final Context mo126336c() {
        return this.f88235c;
    }

    /* renamed from: d */
    public final ThemeColor mo126337d() {
        return this.f88242j;
    }

    /* renamed from: a */
    public final boolean mo126334a() {
        return this.f88233a;
    }

    public Drawable getDrawable() {
        Context context;
        if (TextUtils.isEmpty(this.f88236d)) {
            Drawable drawable = super.getDrawable();
            Intrinsics.checkExpressionValueIsNotNull(drawable, "super.getDrawable()");
            return drawable;
        }
        if (!this.f88233a && (context = this.f88235c) != null) {
            IRequestCreator with = ImageLoader.with(context);
            String str = this.f88236d;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            with.load(new C38824b(str)).placeholder(this.f88241i).centerCrop().dontAnimate(false).into(new RemoteDrawableTarget(new WeakReference(this), this.f88237e, this.f88238f));
        }
        Drawable drawable2 = super.getDrawable();
        Intrinsics.checkExpressionValueIsNotNull(drawable2, "super.getDrawable()");
        return drawable2;
    }

    /* renamed from: a */
    public final void mo126333a(boolean z) {
        this.f88233a = z;
    }

    /* renamed from: a */
    public final void mo126332a(OnImageReadyListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f88234b = aVar;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/CenterSpaceRemoteImageSpan$RemoteDrawableTarget;", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/drawable/Drawable;", "drawableSpanRef", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/chat/preview/components/view/CenterSpaceRemoteImageSpan;", "imageWidth", "", "imageHeight", "(Ljava/lang/ref/WeakReference;II)V", "getDrawableSpanRef", "()Ljava/lang/ref/WeakReference;", "getImageHeight", "()I", "getImageWidth", "onLoadFailed", "", "errorDrawable", "onResourceReady", "resource", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.a$b */
    public static final class RemoteDrawableTarget extends C38818i<Drawable> {

        /* renamed from: a */
        private final WeakReference<CenterSpaceRemoteImageSpan> f88243a;

        /* renamed from: b */
        private final int f88244b;

        /* renamed from: c */
        private final int f88245c;

        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
        /* renamed from: a */
        public void mo49247a(Drawable drawable) {
            OnImageReadyListener b;
            Intrinsics.checkParameterIsNotNull(drawable, "errorDrawable");
            super.mo49247a(drawable);
            CenterSpaceRemoteImageSpan aVar = this.f88243a.get();
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(aVar, "drawableSpanRef.get() ?: return");
                drawable.setBounds(0, 0, this.f88244b, this.f88245c);
                C38821a.m153224a(aVar, "mDrawable", drawable);
                C38821a.m153224a(aVar, "mDrawableRef", null);
                if (!aVar.mo126334a() && (b = aVar.mo126335b()) != null) {
                    b.mo126342b();
                }
                aVar.mo126333a(true);
            }
        }

        /* renamed from: h_ */
        public void mo49248a(Drawable drawable) {
            Context c;
            Resources resources;
            ThemeColor d;
            Context context;
            Intrinsics.checkParameterIsNotNull(drawable, "resource");
            super.mo49248a((Object) drawable);
            CenterSpaceRemoteImageSpan aVar = this.f88243a.get();
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(aVar, "drawableSpanRef.get() ?: return");
                CenterSpaceRemoteImageSpan aVar2 = this.f88243a.get();
                if (!(aVar2 == null || (d = aVar2.mo126337d()) == null)) {
                    drawable.mutate();
                    ColorUtils aVar3 = ColorUtils.f87906a;
                    CenterSpaceRemoteImageSpan aVar4 = this.f88243a.get();
                    if (aVar4 != null) {
                        context = aVar4.mo126336c();
                    } else {
                        context = null;
                    }
                    if (context == null) {
                        Intrinsics.throwNpe();
                    }
                    drawable.setTint(aVar3.mo125874a(d, context));
                }
                CenterSpaceRemoteImageSpan aVar5 = this.f88243a.get();
                if (!(aVar5 == null || (c = aVar5.mo126336c()) == null || (resources = c.getResources()) == null)) {
                    drawable = new RounderCornersBitmapDrawable(resources, (BitmapDrawable) drawable, new C59153c(0, 0, UIHelper.dp2px(2.0f)), this.f88244b, this.f88245c);
                }
                drawable.setBounds(0, 0, this.f88244b, this.f88245c);
                C38821a.m153224a(aVar, "mDrawable", drawable);
                C38821a.m153224a(aVar, "mDrawableRef", null);
                aVar.mo126333a(true);
                OnImageReadyListener b = aVar.mo126335b();
                if (b != null) {
                    b.mo126341a();
                }
            }
        }

        public RemoteDrawableTarget(WeakReference<CenterSpaceRemoteImageSpan> weakReference, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(weakReference, "drawableSpanRef");
            this.f88243a = weakReference;
            this.f88244b = i;
            this.f88245c = i2;
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Rect bounds = getDrawable().getBounds();
        Intrinsics.checkExpressionValueIsNotNull(bounds, "d.bounds");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return this.f88239g + this.f88237e + this.f88240h;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CenterSpaceRemoteImageSpan(Context context, String str, int i, int i2, int i3, int i4, Drawable drawable, ThemeColor themeColor) {
        super(drawable);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(drawable, "placeHolder");
        this.f88235c = context;
        this.f88236d = str;
        this.f88237e = i;
        this.f88238f = i2;
        this.f88239g = i3;
        this.f88240h = i4;
        this.f88241i = drawable;
        this.f88242j = themeColor;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        float f2 = ((float) this.f88239g) + f;
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i7 = i5 - i3;
        int i8 = fontMetricsInt.bottom - fontMetricsInt.top;
        if (i7 > i8) {
            i6 = (i7 - i8) / 2;
        } else {
            i6 = 0;
        }
        canvas.save();
        canvas.translate(f2, (float) (i3 + i6 + ((i7 - getDrawable().getBounds().height()) / 2)));
        getDrawable().draw(canvas);
        canvas.restore();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CenterSpaceRemoteImageSpan(android.content.Context r11, java.lang.String r12, int r13, int r14, int r15, int r16, android.graphics.drawable.Drawable r17, com.ss.android.lark.chat.entity.preview.ThemeColor r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x000b
            r0 = 0
            com.ss.android.lark.chat.entity.preview.ThemeColor r0 = (com.ss.android.lark.chat.entity.preview.ThemeColor) r0
            r9 = r0
            goto L_0x000d
        L_0x000b:
            r9 = r18
        L_0x000d:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.preview.components.view.CenterSpaceRemoteImageSpan.<init>(android.content.Context, java.lang.String, int, int, int, int, android.graphics.drawable.Drawable, com.ss.android.lark.chat.entity.preview.ThemeColor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
