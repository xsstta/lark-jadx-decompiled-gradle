package com.larksuite.component.ui.list.iconitem;

import android.graphics.drawable.Drawable;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0013B3\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/ui/list/iconitem/IconItemTagModel;", "", "icon", "Landroid/graphics/drawable/Drawable;", "text", "", "showRightArrow", "", "textColorRes", "", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;ZI)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getShowRightArrow", "()Z", "getText", "()Ljava/lang/String;", "getTextColorRes", "()I", "Builder", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.list.iconitem.d */
public final class IconItemTagModel {

    /* renamed from: a */
    private final Drawable f62744a;

    /* renamed from: b */
    private final String f62745b;

    /* renamed from: c */
    private final boolean f62746c;

    /* renamed from: d */
    private final int f62747d;

    public IconItemTagModel() {
        this(null, null, false, 0, 15, null);
    }

    /* renamed from: a */
    public final Drawable mo89833a() {
        return this.f62744a;
    }

    /* renamed from: b */
    public final String mo89834b() {
        return this.f62745b;
    }

    /* renamed from: c */
    public final boolean mo89835c() {
        return this.f62746c;
    }

    /* renamed from: d */
    public final int mo89836d() {
        return this.f62747d;
    }

    public IconItemTagModel(Drawable drawable, String str, boolean z, int i) {
        this.f62744a = drawable;
        this.f62745b = str;
        this.f62746c = z;
        this.f62747d = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IconItemTagModel(Drawable drawable, String str, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : drawable, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? R.color.lkui_N500 : i);
    }
}
