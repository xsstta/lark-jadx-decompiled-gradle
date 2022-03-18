package com.larksuite.component.ui.tag;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\r\u001a\u00020\u000eR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/ui/tag/MyStateListDrawable;", "Landroid/graphics/drawable/StateListDrawable;", "()V", "dataMap", "Ljava/util/HashMap;", "", "Landroid/graphics/drawable/Drawable;", "Lkotlin/collections/HashMap;", "addState", "", "stateSet", "drawable", "findDrawable", "stateCount", "", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.tag.e */
public final class MyStateListDrawable extends StateListDrawable {

    /* renamed from: a */
    private final HashMap<int[], Drawable> f62928a = new HashMap<>(2);

    /* renamed from: a */
    public final int mo90060a() {
        return this.f62928a.size();
    }

    /* renamed from: a */
    public final Drawable mo90061a(int[] iArr) {
        if (iArr != null) {
            return this.f62928a.get(iArr);
        }
        return null;
    }

    public void addState(int[] iArr, Drawable drawable) {
        super.addState(iArr, drawable);
        if (iArr != null && drawable != null) {
            this.f62928a.put(iArr, drawable);
        }
    }
}
