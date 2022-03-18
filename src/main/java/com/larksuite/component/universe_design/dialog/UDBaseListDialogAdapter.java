package com.larksuite.component.universe_design.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\b\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0004J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\tJ\u0014\u0010\"\u001a\u00020\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0$J\u0010\u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\u0011J\u0010\u0010'\u001a\u00020\u00142\b\b\u0001\u0010(\u001a\u00020\tJ\u000e\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter$UDDialogListItemViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hasTitle", "", "mItemHeight", "", "mItemLayoutRes", "mItemTextColorRes", "mItemTextSize", "mItems", "", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder$ListItem;", "mOnItemClickListener", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemClick", "setHasTitle", "value", "setItemHeight", "itemHeight", "setItemLayoutRes", "layoutRes", "setItems", "items", "", "setOnItemClickListener", "listener", "setTextColor", "textColor", "setTextSize", "textSize", "UDDialogListItemViewHolder", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.dialog.a */
public class UDBaseListDialogAdapter extends RecyclerView.Adapter<UDDialogListItemViewHolder> {

    /* renamed from: a */
    private final List<UDBaseListDialogBuilder.ListItem> f63290a = new ArrayList();

    /* renamed from: b */
    public UDListDialogController.OnItemClickListener f63291b;

    /* renamed from: c */
    private int f63292c = R.layout.ud_action_panel_default_item;

    /* renamed from: d */
    private int f63293d = -1;

    /* renamed from: e */
    private int f63294e = -1;

    /* renamed from: f */
    private int f63295f = -1;

    /* renamed from: g */
    private boolean f63296g = true;

    /* renamed from: h */
    private final Context f63297h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter$UDDialogListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.a$a */
    public static class UDDialogListItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TextView f63298a;

        /* renamed from: a */
        public TextView mo90865a() {
            return this.f63298a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UDDialogListItemViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.ud_dialog_content_item_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.ud_dialog_content_item_tv");
            this.f63298a = textView;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f63290a.size();
    }

    /* renamed from: a */
    public final void mo90858a(UDListDialogController.OnItemClickListener aVar) {
        this.f63291b = aVar;
    }

    /* renamed from: b */
    public final void mo90861b(int i) {
        this.f63292c = i;
    }

    /* renamed from: c */
    public final void mo90862c(int i) {
        this.f63293d = i;
    }

    /* renamed from: d */
    public final void mo90863d(int i) {
        this.f63294e = i;
    }

    /* renamed from: e */
    public final void mo90864e(int i) {
        this.f63295f = i;
    }

    /* renamed from: a */
    public final void mo90860a(boolean z) {
        this.f63296g = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.a$b */
    public static final class View$OnClickListenerC25748b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDBaseListDialogAdapter f63299a;

        /* renamed from: b */
        final /* synthetic */ int f63300b;

        View$OnClickListenerC25748b(UDBaseListDialogAdapter aVar, int i) {
            this.f63299a = aVar;
            this.f63300b = i;
        }

        public final void onClick(View view) {
            UDListDialogController.OnItemClickListener aVar = this.f63299a.f63291b;
            if (aVar != null) {
                aVar.onItemClick(this.f63300b);
            }
        }
    }

    /* renamed from: a */
    public final void mo90859a(List<UDBaseListDialogBuilder.ListItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        this.f63290a.clear();
        this.f63290a.addAll(list);
        notifyDataSetChanged();
    }

    public UDBaseListDialogAdapter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f63297h = context;
    }

    /* renamed from: b */
    public UDDialogListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f63297h).inflate(this.f63292c, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mCon…LayoutRes, parent, false)");
        return new UDDialogListItemViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(UDDialogListItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        UDBaseListDialogBuilder.ListItem aVar2 = this.f63290a.get(i);
        TextView a = aVar.mo90865a();
        a.setText(aVar2.mo90882a());
        if (aVar2.mo90884c() == 0 && aVar2.mo90883b() == 0) {
            Context context = this.f63297h;
            int i2 = this.f63294e;
            if (i2 == -1) {
                i2 = R.color.text_title;
            }
            a.setTextColor(UDColorUtils.getColor(context, i2));
        } else if (aVar2.mo90883b() != 0) {
            a.setTextColor(UDColorUtils.getColor(this.f63297h, aVar2.mo90883b()));
        } else {
            mo90863d(aVar2.mo90884c());
        }
        int i3 = this.f63293d;
        if (i3 > 0) {
            a.setTextSize((float) i3);
        }
        aVar.itemView.setOnClickListener(new View$OnClickListenerC25748b(this, i));
        if (this.f63295f > 0) {
            View view = aVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            view.getLayoutParams().height = (int) UDDimenUtils.m93308a(this.f63297h, this.f63295f);
        }
        boolean z = this.f63296g;
        int i4 = R.drawable.ud_bg_action_panel_item_corners_below;
        if (z) {
            View view2 = aVar.itemView;
            if (i != getItemCount() - 1) {
                i4 = R.drawable.ud_bg_action_panel_item_rectangle;
            }
            view2.setBackgroundResource(i4);
        } else if (getItemCount() == 1) {
            aVar.itemView.setBackgroundResource(R.drawable.ud_bg_action_panel_item_corners);
        } else if (i == 0) {
            aVar.itemView.setBackgroundResource(R.drawable.ud_bg_action_panel_item_corners_above);
        } else if (i == getItemCount() - 1) {
            aVar.itemView.setBackgroundResource(R.drawable.ud_bg_action_panel_item_corners_below);
        } else {
            aVar.itemView.setBackgroundResource(R.drawable.ud_bg_action_panel_item_rectangle);
        }
    }
}
