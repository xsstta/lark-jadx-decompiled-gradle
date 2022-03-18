package com.larksuite.component.ui.list.iconitem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.list.IComponentBinder;
import com.larksuite.component.ui.tag.TagsDrawable;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/larksuite/component/ui/list/iconitem/IconItemTagBinder;", "Lcom/larksuite/component/ui/list/IComponentBinder;", "Lcom/larksuite/component/ui/list/iconitem/IconItemView;", "Lcom/larksuite/component/ui/list/iconitem/IconItemTagModel;", "()V", "bind", "", "view", "model", "unbind", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.list.iconitem.c */
public final class IconItemTagBinder implements IComponentBinder<IconItemView, IconItemTagModel> {
    /* renamed from: a */
    public void mo88913a(IconItemView iconItemView) {
        Intrinsics.checkParameterIsNotNull(iconItemView, "view");
        TextView textView = iconItemView.f62737c;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo88915a(IconItemView iconItemView, IconItemTagModel dVar) {
        Intrinsics.checkParameterIsNotNull(iconItemView, "view");
        Intrinsics.checkParameterIsNotNull(dVar, "model");
        TextView textView = iconItemView.f62737c;
        textView.setVisibility(8);
        String b = dVar.mo89834b();
        if (b != null) {
            Intrinsics.checkExpressionValueIsNotNull(textView, "tagView");
            textView.setText(b);
            textView.setTextColor(ContextCompat.getColor(iconItemView.getContext(), dVar.mo89836d()));
            textView.setVisibility(0);
        }
        Context context = iconItemView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        TagsDrawable.Builder aVar = new TagsDrawable.Builder(context);
        if (dVar.mo89835c()) {
            aVar.mo90077a(new TagsDrawable.TagModel.Builder(context).mo90117b(100).mo90114a(ContextCompat.getDrawable(context, R.drawable.icon_right_arrow)).mo90124g());
            Intrinsics.checkExpressionValueIsNotNull(textView, "tagView");
            textView.setVisibility(0);
        }
        Drawable a = dVar.mo89833a();
        if (a != null) {
            aVar.mo90077a(new TagsDrawable.TagModel.Builder(context).mo90117b(0).mo90114a(a).mo90124g());
            Intrinsics.checkExpressionValueIsNotNull(textView, "tagView");
            textView.setVisibility(0);
        }
        textView.setCompoundDrawables(null, null, aVar.mo90087g(), null);
    }
}
