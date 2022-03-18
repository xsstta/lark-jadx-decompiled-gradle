package com.larksuite.component.ui.list.iconitem;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.list.IComponentBinder;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/larksuite/component/ui/list/iconitem/IconItemBinder;", "Lcom/larksuite/component/ui/list/IComponentBinder;", "Lcom/larksuite/component/ui/list/iconitem/IconItemView;", "Lcom/larksuite/component/ui/list/iconitem/IconItemModel;", "()V", "bind", "", "view", "model", "unbind", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.list.iconitem.a */
public final class IconItemBinder implements IComponentBinder<IconItemView, IconItemModel> {
    /* renamed from: a */
    public void mo88913a(IconItemView iconItemView) {
        Intrinsics.checkParameterIsNotNull(iconItemView, "view");
        ImageView imageView = iconItemView.f62735a;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = iconItemView.f62736b;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = iconItemView.f62738d;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo88915a(IconItemView iconItemView, IconItemModel bVar) {
        Intrinsics.checkParameterIsNotNull(iconItemView, "view");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        ImageView imageView = iconItemView.f62735a;
        imageView.setVisibility(8);
        TextView textView = iconItemView.f62736b;
        textView.setVisibility(8);
        TextView textView2 = iconItemView.f62738d;
        textView2.setVisibility(8);
        Drawable a = bVar.mo89827a();
        if (a != null) {
            imageView.setImageDrawable(a);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "iconView");
            imageView.setVisibility(0);
        }
        String b = bVar.mo89828b();
        if (b != null) {
            Intrinsics.checkExpressionValueIsNotNull(textView, "titleView");
            textView.setText(b);
            textView.setVisibility(0);
        }
        String c = bVar.mo89829c();
        if (c != null) {
            Intrinsics.checkExpressionValueIsNotNull(textView2, "subTitleView");
            textView2.setText(c);
            textView2.setVisibility(0);
        }
        Integer d = bVar.mo89830d();
        if (d != null) {
            int intValue = d.intValue();
            LinearLayout linearLayout = iconItemView.f62739e;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.mTextWrapper");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(intValue);
                LinearLayout linearLayout2 = iconItemView.f62739e;
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.mTextWrapper");
                linearLayout2.setLayoutParams(marginLayoutParams);
                iconItemView.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
