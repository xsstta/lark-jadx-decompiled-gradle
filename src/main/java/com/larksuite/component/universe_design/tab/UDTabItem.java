package com.larksuite.component.universe_design.tab;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0000X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabItem;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "customView", "", "getCustomView$universe_ui_tab_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "icon", "Landroid/graphics/drawable/Drawable;", "getIcon$universe_ui_tab_release", "()Landroid/graphics/drawable/Drawable;", "title", "", "getTitle$universe_ui_tab_release", "()Ljava/lang/CharSequence;", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDTabItem extends View {

    /* renamed from: a */
    private final CharSequence f63586a;

    /* renamed from: b */
    private final Drawable f63587b;

    /* renamed from: c */
    private final Integer f63588c;

    public final Integer getCustomView$universe_ui_tab_release() {
        return this.f63588c;
    }

    public final Drawable getIcon$universe_ui_tab_release() {
        return this.f63587b;
    }

    public final CharSequence getTitle$universe_ui_tab_release() {
        return this.f63586a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDTabItem(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842754, 16842994, 16843087});
        this.f63586a = obtainStyledAttributes.getText(2);
        this.f63587b = obtainStyledAttributes.getDrawable(0);
        this.f63588c = Integer.valueOf(obtainStyledAttributes.getResourceId(1, 0));
        obtainStyledAttributes.recycle();
    }
}
