package com.ss.android.lark.main.app.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1396o;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/main/app/tab/MainTabPreviewAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ss/android/lark/main/app/tab/MainTabPreviewItem;", "Lcom/ss/android/lark/main/app/tab/MainTabPreviewViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.f */
public final class MainTabPreviewAdapter extends AbstractC1396o<MainTabPreviewItem, MainTabPreviewViewHolder> {
    public MainTabPreviewAdapter() {
        super(new C1374g.AbstractC1378c<MainTabPreviewItem>() {
            /* class com.ss.android.lark.main.app.tab.MainTabPreviewAdapter.C443611 */

            /* renamed from: b */
            public boolean areContentsTheSame(MainTabPreviewItem gVar, MainTabPreviewItem gVar2) {
                Intrinsics.checkParameterIsNotNull(gVar, "oldItem");
                Intrinsics.checkParameterIsNotNull(gVar2, "newItem");
                return false;
            }

            /* renamed from: a */
            public boolean areItemsTheSame(MainTabPreviewItem gVar, MainTabPreviewItem gVar2) {
                Intrinsics.checkParameterIsNotNull(gVar, "oldItem");
                Intrinsics.checkParameterIsNotNull(gVar2, "newItem");
                return Intrinsics.areEqual(gVar.mo157602a(), gVar2.mo157602a());
            }
        });
    }

    /* renamed from: a */
    public MainTabPreviewViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.main_nav_editor_main_tab_preview_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "newItemView");
        return new MainTabPreviewViewHolder(inflate, viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(MainTabPreviewViewHolder hVar, int i) {
        Intrinsics.checkParameterIsNotNull(hVar, "holder");
        MainTabPreviewItem gVar = (MainTabPreviewItem) getItem(i);
        Drawable c = gVar.mo157604c();
        if (gVar.mo157605d()) {
            c.mutate();
            Context context = hVar.mo157608c().getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "holder.parent.context");
            c.setTint(UDColorUtils.getColor(context, R.color.icon_n3));
        }
        hVar.mo157606a().setImageDrawable(c);
        hVar.mo157607b().setText(gVar.mo157603b());
        View view = hVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "it");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(view.getLayoutParams());
        layoutParams.width = hVar.mo157608c().getMeasuredWidth() / getItemCount();
        view.setLayoutParams(layoutParams);
    }
}
