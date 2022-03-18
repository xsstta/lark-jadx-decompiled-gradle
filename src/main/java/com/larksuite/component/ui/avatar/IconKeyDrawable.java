package com.larksuite.component.ui.avatar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.AbstractC0776c;
import androidx.core.graphics.drawable.C0778e;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.entity.C38824b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001J$\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001J8\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001J@\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u000bJQ\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u000b2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010&J\u0012\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010*\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/larksuite/component/ui/avatar/IconKeyDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "delegate", "height", "", "isCircular", "", "mColorFilter", "Landroid/graphics/ColorFilter;", "width", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "getIntrinsicWidth", "getOpacity", "isSizeValid", "setAlpha", "alpha", "setBounds", "bounds", "Landroid/graphics/Rect;", "setCircular", "setColorFilter", "colorFilter", "setIcon", "key", "", "placeHolder", "fsUnit", "isDocIcon", "color", "(Ljava/lang/String;Ljava/lang/String;IILandroid/graphics/drawable/Drawable;ZLjava/lang/Integer;)Lcom/larksuite/component/ui/avatar/IconKeyDrawable;", "setTintList", "tint", "Landroid/content/res/ColorStateList;", "updateDelegate", "drawable", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.o */
public final class IconKeyDrawable extends Drawable {

    /* renamed from: a */
    private Drawable f62440a;

    /* renamed from: b */
    private int f62441b = -1;

    /* renamed from: c */
    private int f62442c = -1;

    /* renamed from: d */
    private ColorFilter f62443d;

    /* renamed from: e */
    private boolean f62444e;

    /* renamed from: f */
    private final Context f62445f;

    /* renamed from: a */
    private final boolean m91574a() {
        if (this.f62441b <= 0 || this.f62442c <= 0) {
            return false;
        }
        return true;
    }

    public int getOpacity() {
        Drawable drawable = this.f62440a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f62440a;
        if (m91574a()) {
            return this.f62442c;
        }
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f62440a;
        if (m91574a()) {
            return this.f62441b;
        }
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return super.getIntrinsicWidth();
    }

    /* renamed from: a */
    public final void mo89038a(boolean z) {
        this.f62444e = z;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f62443d = colorFilter;
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f62440a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public IconKeyDrawable(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f62445f = context;
    }

    public void setBounds(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "bounds");
        super.setBounds(rect);
        Drawable drawable = this.f62440a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
        Drawable drawable = this.f62440a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Drawable drawable = this.f62440a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
        Drawable drawable2 = this.f62440a;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/larksuite/component/ui/avatar/IconKeyDrawable$setIcon$5$1$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "", "drawable", "avatar-badge_release", "com/larksuite/component/ui/avatar/IconKeyDrawable$$special$$inlined$let$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.avatar.o$a */
    public static final class C25624a extends C38818i<Drawable> {

        /* renamed from: a */
        final /* synthetic */ IconKeyDrawable f62446a;

        /* renamed from: b */
        final /* synthetic */ int f62447b;

        /* renamed from: c */
        final /* synthetic */ int f62448c;

        /* renamed from: d */
        final /* synthetic */ Drawable f62449d;

        /* renamed from: e */
        final /* synthetic */ String f62450e;

        /* renamed from: f */
        final /* synthetic */ boolean f62451f;

        /* renamed from: g */
        final /* synthetic */ Integer f62452g;

        /* renamed from: h */
        final /* synthetic */ String f62453h;

        /* renamed from: d_ */
        public void mo49248a(Drawable drawable) {
            Integer num = this.f62452g;
            if (num != null && (num == null || num.intValue() != 0)) {
                if (drawable != null) {
                    drawable.mutate();
                }
                if (drawable != null) {
                    drawable.setTint(this.f62452g.intValue());
                }
            }
            this.f62446a.mo89037a(drawable);
        }

        C25624a(IconKeyDrawable oVar, int i, int i2, Drawable drawable, String str, boolean z, Integer num, String str2) {
            this.f62446a = oVar;
            this.f62447b = i;
            this.f62448c = i2;
            this.f62449d = drawable;
            this.f62450e = str;
            this.f62451f = z;
            this.f62452g = num;
            this.f62453h = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/larksuite/component/ui/avatar/IconKeyDrawable$setIcon$5$1$2", "Lcom/larksuite/component/ui/avatar/IIconTarget;", "setIcon", "", "drawable", "Landroid/graphics/drawable/Drawable;", "avatar-badge_release", "com/larksuite/component/ui/avatar/IconKeyDrawable$$special$$inlined$let$lambda$2"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.avatar.o$b */
    public static final class C25625b implements IIconTarget {

        /* renamed from: a */
        final /* synthetic */ IconKeyDrawable f62454a;

        /* renamed from: b */
        final /* synthetic */ int f62455b;

        /* renamed from: c */
        final /* synthetic */ int f62456c;

        /* renamed from: d */
        final /* synthetic */ Drawable f62457d;

        /* renamed from: e */
        final /* synthetic */ String f62458e;

        /* renamed from: f */
        final /* synthetic */ boolean f62459f;

        /* renamed from: g */
        final /* synthetic */ Integer f62460g;

        /* renamed from: h */
        final /* synthetic */ String f62461h;

        @Override // com.larksuite.component.ui.avatar.IIconTarget
        /* renamed from: a */
        public void mo89029a(Drawable drawable) {
            Integer num = this.f62460g;
            if (num != null && (num == null || num.intValue() != 0)) {
                if (drawable != null) {
                    drawable.mutate();
                }
                if (drawable != null) {
                    drawable.setTint(this.f62460g.intValue());
                }
            }
            this.f62454a.mo89037a(drawable);
        }

        C25625b(IconKeyDrawable oVar, int i, int i2, Drawable drawable, String str, boolean z, Integer num, String str2) {
            this.f62454a = oVar;
            this.f62455b = i;
            this.f62456c = i2;
            this.f62457d = drawable;
            this.f62458e = str;
            this.f62459f = z;
            this.f62460g = num;
            this.f62461h = str2;
        }
    }

    /* renamed from: a */
    public final void mo89037a(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable) || (drawable instanceof AbstractC0776c) || !this.f62444e) {
            this.f62440a = drawable;
        } else {
            AbstractC0776c a = C0778e.m3793a(this.f62445f.getResources(), ((BitmapDrawable) drawable).getBitmap());
            Intrinsics.checkExpressionValueIsNotNull(a, "RoundedBitmapDrawableFac…sources, drawable.bitmap)");
            a.mo4309a(true);
            this.f62440a = a;
        }
        Drawable drawable2 = this.f62440a;
        if (drawable2 != null) {
            drawable2.setColorFilter(this.f62443d);
        }
        Drawable drawable3 = this.f62440a;
        if (drawable3 != null) {
            drawable3.setCallback(getCallback());
        }
        Drawable drawable4 = this.f62440a;
        if (drawable4 != null) {
            drawable4.invalidateSelf();
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public final IconKeyDrawable mo89032a(String str, Drawable drawable) {
        IconKeyDrawable oVar = this;
        oVar.mo89036a(str, null, drawable);
        return oVar;
    }

    /* renamed from: a */
    public final IconKeyDrawable mo89036a(String str, String str2, Drawable drawable) {
        IconKeyDrawable oVar = this;
        oVar.mo89033a(str, str2, -1, -1, drawable);
        return oVar;
    }

    /* renamed from: a */
    public final IconKeyDrawable mo89033a(String str, String str2, int i, int i2, Drawable drawable) {
        IconKeyDrawable oVar = this;
        oVar.mo89035a(str, str2, i, i2, drawable, false, null);
        return oVar;
    }

    /* renamed from: a */
    public final IconKeyDrawable mo89034a(String str, String str2, int i, int i2, Drawable drawable, boolean z) {
        IconKeyDrawable oVar = this;
        oVar.mo89035a(str, str2, i, i2, drawable, z, 0);
        return oVar;
    }

    /* renamed from: a */
    public final IconKeyDrawable mo89035a(String str, String str2, int i, int i2, Drawable drawable, boolean z, Integer num) {
        IconKeyDrawable oVar = this;
        oVar.f62441b = i;
        oVar.f62442c = i2;
        oVar.mo89037a(drawable);
        if (str != null) {
            if (!z) {
                ImageLoader.with(oVar.f62445f).load(new C38824b(str)).asDrawable().into(new C25624a(oVar, i, i2, drawable, str, z, num, str2));
            } else if (LarkAvatar.f62479e.mo89061b()) {
                IconLoader.f62473a.mo89055a(oVar.f62445f).mo89050a(str).mo89053b("").mo89054c(str2).mo89048a(i, i2).mo89049a(drawable).mo89052a(new C25625b(oVar, i, i2, drawable, str, z, num, str2));
            }
        }
        return oVar;
    }
}
