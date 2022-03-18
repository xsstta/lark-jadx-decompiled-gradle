package com.larksuite.component.universe_design.colorpicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.colorpicker.UDColorPicker;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0014\u001a\u00020\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0018\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\fH&J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\fH&J\u0015\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\fH\u0000¢\u0006\u0002\b'J\u0015\u0010(\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0013H\u0000¢\u0006\u0002\b)J\u0014\u0010*\u001a\u00020\u00152\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0,J\u0010\u0010-\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/larksuite/component/universe_design/colorpicker/UDBaseColorPickerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/larksuite/component/universe_design/colorpicker/UDBaseColorPickerAdapter$UDColorPickerItemViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "itemClickListener", "Lcom/larksuite/component/universe_design/colorpicker/UDColorPicker$OnColorItemClickListener;", "items", "Ljava/util/ArrayList;", "Lcom/larksuite/component/universe_design/colorpicker/UDColorItem;", "Lkotlin/collections/ArrayList;", "outerBackground", "Landroid/graphics/drawable/Drawable;", "getOuterBackground", "()Landroid/graphics/drawable/Drawable;", "selectPosition", "", "clear", "", "getCurrentSelectItem", "getCurrentSelectItem$universe_ui_colorpicker_release", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemBind", "view", "Lcom/larksuite/component/universe_design/colorpicker/UDColorItemView;", "itemUD", "onItemClicked", "selectItem", "item", "selectItem$universe_ui_colorpicker_release", "selectItemPosition", "selectItemPosition$universe_ui_colorpicker_release", "setItemList", "colorItems", "", "setOnItemClickListener", "UDColorPickerItemViewHolder", "universe-ui-colorpicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.colorpicker.b */
public abstract class UDBaseColorPickerAdapter extends RecyclerView.Adapter<UDColorPickerItemViewHolder> {

    /* renamed from: a */
    public UDColorPicker.OnColorItemClickListener f63159a;

    /* renamed from: b */
    public int f63160b = -1;

    /* renamed from: c */
    private final Drawable f63161c;

    /* renamed from: d */
    private final ArrayList<UDColorItem> f63162d = new ArrayList<>();

    /* renamed from: e */
    private final Context f63163e;

    /* renamed from: a */
    public abstract void mo90404a(UDColorItemView uDColorItemView, UDColorItem dVar);

    /* renamed from: b */
    public abstract void mo90405b(UDColorItemView uDColorItemView, UDColorItem dVar);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/colorpicker/UDBaseColorPickerAdapter$UDColorPickerItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "colorPickerItemView", "Lcom/larksuite/component/universe_design/colorpicker/UDColorItemView;", "getColorPickerItemView", "()Lcom/larksuite/component/universe_design/colorpicker/UDColorItemView;", "universe-ui-colorpicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.colorpicker.b$a */
    public static final class UDColorPickerItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final UDColorItemView f63164a;

        /* renamed from: a */
        public final UDColorItemView mo90414a() {
            return this.f63164a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UDColorPickerItemViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.color_picker_item_view);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(\n …d.color_picker_item_view)");
            this.f63164a = (UDColorItemView) findViewById;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Drawable mo90406a() {
        return this.f63161c;
    }

    /* renamed from: c */
    public final Context mo90413c() {
        return this.f63163e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f63162d.size();
    }

    /* renamed from: b */
    public final UDColorItem mo90412b() {
        int i = this.f63160b;
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return this.f63162d.get(this.f63160b);
    }

    /* renamed from: a */
    public final void mo90409a(UDColorPicker.OnColorItemClickListener aVar) {
        this.f63159a = aVar;
    }

    public UDBaseColorPickerAdapter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63163e = context;
        this.f63161c = UDIconUtils.getIconDrawable(context, R.drawable.bg_color_picker_item_selected);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.colorpicker.b$b */
    public static final class View$OnClickListenerC25731b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDBaseColorPickerAdapter f63165a;

        /* renamed from: b */
        final /* synthetic */ int f63166b;

        /* renamed from: c */
        final /* synthetic */ UDColorItem f63167c;

        /* renamed from: d */
        final /* synthetic */ UDColorPickerItemViewHolder f63168d;

        View$OnClickListenerC25731b(UDBaseColorPickerAdapter bVar, int i, UDColorItem dVar, UDColorPickerItemViewHolder aVar) {
            this.f63165a = bVar;
            this.f63166b = i;
            this.f63167c = dVar;
            this.f63168d = aVar;
        }

        public final void onClick(View view) {
            int i = this.f63165a.f63160b;
            this.f63165a.f63160b = this.f63166b;
            UDColorPicker.OnColorItemClickListener aVar = this.f63165a.f63159a;
            if (aVar != null) {
                aVar.mo90399a(this.f63166b, this.f63167c);
            }
            this.f63165a.mo90404a(this.f63168d.mo90414a(), this.f63167c);
            this.f63165a.notifyItemChanged(i);
        }
    }

    /* renamed from: a */
    public final void mo90408a(int i) {
        if (i >= 0 && i < getItemCount()) {
            int i2 = this.f63160b;
            this.f63160b = i;
            notifyItemChanged(i2);
            notifyItemChanged(this.f63160b);
        }
    }

    /* renamed from: a */
    public final void mo90411a(List<? extends UDColorItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "colorItems");
        this.f63162d.clear();
        this.f63162d.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public UDColorPickerItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ud_layout_color_picker_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new UDColorPickerItemViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(UDColorPickerItemViewHolder aVar, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        UDColorItem dVar = this.f63162d.get(i);
        Intrinsics.checkExpressionValueIsNotNull(dVar, "items[position]");
        UDColorItem dVar2 = dVar;
        aVar.itemView.setOnClickListener(new View$OnClickListenerC25731b(this, i, dVar2, aVar));
        UDColorItemView a = aVar.mo90414a();
        if (i == this.f63160b) {
            z = true;
        } else {
            z = false;
        }
        a.setSelected(z);
        mo90405b(aVar.mo90414a(), dVar2);
    }
}
