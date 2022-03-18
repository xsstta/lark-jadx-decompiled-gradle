package com.larksuite.component.ui.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0017J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/larksuite/component/ui/avatar/IconLoadRequest;", "", "context", "Landroid/content/Context;", "iIconLoader", "Lcom/larksuite/component/ui/avatar/IIconLoader;", "(Landroid/content/Context;Lcom/larksuite/component/ui/avatar/IIconLoader;)V", "entityId", "", "errorHolder", "Landroid/graphics/drawable/Drawable;", "fsUnit", "height", "", "key", "loadCallback", "Lcom/larksuite/component/ui/avatar/ILoadCallback;", "placeHolder", "width", "applyTo", "", "target", "Landroid/widget/ImageView;", "Lcom/larksuite/component/ui/avatar/IIconTarget;", "drawable", "iconKey", "listener", "size", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.p */
public final class IconLoadRequest {

    /* renamed from: a */
    public Drawable f62462a;

    /* renamed from: b */
    public ILoadCallback f62463b;

    /* renamed from: c */
    private int f62464c;

    /* renamed from: d */
    private int f62465d;

    /* renamed from: e */
    private String f62466e;

    /* renamed from: f */
    private String f62467f;

    /* renamed from: g */
    private String f62468g;

    /* renamed from: h */
    private final Context f62469h;

    /* renamed from: i */
    private final IIconLoader f62470i;

    /* renamed from: b */
    public final IconLoadRequest mo89053b(String str) {
        IconLoadRequest pVar = this;
        pVar.f62467f = str;
        return pVar;
    }

    /* renamed from: c */
    public final IconLoadRequest mo89054c(String str) {
        IconLoadRequest pVar = this;
        pVar.f62468g = str;
        return pVar;
    }

    /* renamed from: a */
    public final IconLoadRequest mo89049a(Drawable drawable) {
        IconLoadRequest pVar = this;
        pVar.f62462a = drawable;
        return pVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/ui/avatar/IconLoadRequest$applyTo$1", "Lcom/larksuite/component/ui/avatar/ILoadCallback;", "onError", "", "e", "", "onSuccess", "drawable", "Landroid/graphics/drawable/Drawable;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.avatar.p$a */
    public static final class C25626a implements ILoadCallback {

        /* renamed from: a */
        final /* synthetic */ IconLoadRequest f62471a;

        /* renamed from: b */
        final /* synthetic */ IIconTarget f62472b;

        @Override // com.larksuite.component.ui.avatar.ILoadCallback
        /* renamed from: a */
        public void mo89030a(Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(drawable, "drawable");
            this.f62472b.mo89029a(drawable);
            ILoadCallback nVar = this.f62471a.f62463b;
            if (nVar != null) {
                nVar.mo89030a(drawable);
            }
        }

        @Override // com.larksuite.component.ui.avatar.ILoadCallback
        /* renamed from: a */
        public void mo89031a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "e");
            if (this.f62471a.f62462a != null) {
                IIconTarget mVar = this.f62472b;
                Drawable drawable = this.f62471a.f62462a;
                if (drawable == null) {
                    Intrinsics.throwNpe();
                }
                mVar.mo89029a(drawable);
            }
            ILoadCallback nVar = this.f62471a.f62463b;
            if (nVar != null) {
                nVar.mo89031a(th);
            }
        }

        C25626a(IconLoadRequest pVar, IIconTarget mVar) {
            this.f62471a = pVar;
            this.f62472b = mVar;
        }
    }

    /* renamed from: a */
    public final IconLoadRequest mo89050a(String str) {
        IconLoadRequest pVar = this;
        pVar.f62466e = str;
        return pVar;
    }

    /* renamed from: a */
    public final void mo89051a(ImageView imageView) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(imageView, "target");
        String str = this.f62466e;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            imageView.setImageDrawable(this.f62462a);
        } else {
            this.f62470i.mo89027a(this.f62469h, str, this.f62467f, this.f62468g, this.f62464c, this.f62465d, imageView);
        }
    }

    /* renamed from: a */
    public final void mo89052a(IIconTarget mVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(mVar, "target");
        String str = this.f62466e;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mVar.mo89029a(this.f62462a);
        } else {
            this.f62470i.mo89028a(this.f62469h, str, this.f62467f, this.f62468g, this.f62464c, this.f62465d, new C25626a(this, mVar));
        }
    }

    /* renamed from: a */
    public final IconLoadRequest mo89048a(int i, int i2) {
        IconLoadRequest pVar = this;
        pVar.f62464c = i;
        pVar.f62465d = i2;
        return pVar;
    }

    public IconLoadRequest(Context context, IIconLoader lVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(lVar, "iIconLoader");
        this.f62469h = context;
        this.f62470i = lVar;
    }
}
