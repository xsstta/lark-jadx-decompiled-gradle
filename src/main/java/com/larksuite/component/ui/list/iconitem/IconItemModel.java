package com.larksuite.component.ui.list.iconitem;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0012B7\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/larksuite/component/ui/list/iconitem/IconItemModel;", "", "icon", "Landroid/graphics/drawable/Drawable;", "title", "", "subTitle", "iconRightMargin", "", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getIconRightMargin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubTitle", "()Ljava/lang/String;", "getTitle", "Builder", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.list.iconitem.b */
public final class IconItemModel {

    /* renamed from: a */
    private final Drawable f62740a;

    /* renamed from: b */
    private final String f62741b;

    /* renamed from: c */
    private final String f62742c;

    /* renamed from: d */
    private final Integer f62743d;

    public IconItemModel() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: a */
    public final Drawable mo89827a() {
        return this.f62740a;
    }

    /* renamed from: b */
    public final String mo89828b() {
        return this.f62741b;
    }

    /* renamed from: c */
    public final String mo89829c() {
        return this.f62742c;
    }

    /* renamed from: d */
    public final Integer mo89830d() {
        return this.f62743d;
    }

    public IconItemModel(Drawable drawable, String str, String str2, Integer num) {
        this.f62740a = drawable;
        this.f62741b = str;
        this.f62742c = str2;
        this.f62743d = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IconItemModel(Drawable drawable, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : drawable, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }
}
