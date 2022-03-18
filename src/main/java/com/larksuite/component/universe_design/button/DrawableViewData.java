package com.larksuite.component.universe_design.button;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/larksuite/component/universe_design/button/DrawableViewData;", "", "drawable", "Landroid/graphics/drawable/Drawable;", "callback", "Landroid/graphics/drawable/Drawable$Callback;", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable$Callback;)V", "getCallback", "()Landroid/graphics/drawable/Drawable$Callback;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "universe-ui-button_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.button.c */
public final class DrawableViewData {

    /* renamed from: a */
    private Drawable f63105a;

    /* renamed from: b */
    private final Drawable.Callback f63106b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawableViewData)) {
            return false;
        }
        DrawableViewData cVar = (DrawableViewData) obj;
        return Intrinsics.areEqual(this.f63105a, cVar.f63105a) && Intrinsics.areEqual(this.f63106b, cVar.f63106b);
    }

    public int hashCode() {
        Drawable drawable = this.f63105a;
        int i = 0;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        Drawable.Callback callback = this.f63106b;
        if (callback != null) {
            i = callback.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "DrawableViewData(drawable=" + this.f63105a + ", callback=" + this.f63106b + ")";
    }

    /* renamed from: a */
    public final Drawable mo90332a() {
        return this.f63105a;
    }

    public DrawableViewData(Drawable drawable, Drawable.Callback callback) {
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        this.f63105a = drawable;
        this.f63106b = callback;
    }
}
