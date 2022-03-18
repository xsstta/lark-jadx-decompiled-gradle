package com.larksuite.component.universe_design.colorpicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/universe_design/colorpicker/UDBackgroundAdapter;", "Lcom/larksuite/component/universe_design/colorpicker/UDBaseColorPickerAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "itemImage", "Landroid/graphics/drawable/Drawable;", "onItemBind", "", "view", "Lcom/larksuite/component/universe_design/colorpicker/UDColorItemView;", "itemUD", "Lcom/larksuite/component/universe_design/colorpicker/UDColorItem;", "onItemClicked", "universe-ui-colorpicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.colorpicker.a */
public final class UDBackgroundAdapter extends UDBaseColorPickerAdapter {

    /* renamed from: c */
    private final Drawable f63158c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDBackgroundAdapter(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63158c = UDIconUtils.getIconDrawable(context, R.drawable.ic_color_picker_item_text);
    }

    @Override // com.larksuite.component.universe_design.colorpicker.UDBaseColorPickerAdapter
    /* renamed from: a */
    public void mo90404a(UDColorItemView uDColorItemView, UDColorItem dVar) {
        Intrinsics.checkParameterIsNotNull(uDColorItemView, "view");
        Intrinsics.checkParameterIsNotNull(dVar, "itemUD");
        uDColorItemView.getOuterArea().setBackground(mo90406a());
    }

    @Override // com.larksuite.component.universe_design.colorpicker.UDBaseColorPickerAdapter
    /* renamed from: b */
    public void mo90405b(UDColorItemView uDColorItemView, UDColorItem dVar) {
        Drawable drawable;
        Intrinsics.checkParameterIsNotNull(uDColorItemView, "view");
        Intrinsics.checkParameterIsNotNull(dVar, "itemUD");
        FrameLayout outerArea = uDColorItemView.getOuterArea();
        if (uDColorItemView.isSelected()) {
            drawable = mo90406a();
        } else {
            drawable = null;
        }
        outerArea.setBackground(drawable);
        uDColorItemView.getInnerArea().setBackground(UDIconUtils.getIconDrawable(mo90413c(), (int) R.drawable.bg_color_picker_text_inner, dVar.mo90416a()));
        uDColorItemView.getItemImage().setImageDrawable(this.f63158c);
    }
}
