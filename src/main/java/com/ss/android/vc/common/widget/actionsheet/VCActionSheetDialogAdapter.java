package com.ss.android.vc.common.widget.actionsheet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.actionsheet.VCActionSheetController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0007J\u0014\u0010\u001d\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001fJ\u0010\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\"\u001a\u00020\u00122\b\b\u0001\u0010#\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter$VCDialogListItemViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mItemHeight", "", "mItemLayoutRes", "mItemTextColorRes", "mItemTextSize", "mItems", "", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter$ActionSheetData;", "mOnItemClickListener", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetController$OnItemClickListener;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemHeight", "itemHeight", "setItemLayoutRes", "layoutRes", "setItems", "items", "", "setOnItemClickListener", "listener", "setTextColor", "textColor", "setTextSize", "textSize", "ActionSheetData", "VCDialogListItemViewHolder", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.widget.a.c */
public final class VCActionSheetDialogAdapter extends RecyclerView.Adapter<VCDialogListItemViewHolder> {

    /* renamed from: a */
    public VCActionSheetController.OnItemClickListener f152183a;

    /* renamed from: b */
    private final List<ActionSheetData> f152184b = new ArrayList();

    /* renamed from: c */
    private int f152185c = R.layout.vc_action_sheet_item;

    /* renamed from: d */
    private int f152186d = -1;

    /* renamed from: e */
    private int f152187e = -1;

    /* renamed from: f */
    private int f152188f = -1;

    /* renamed from: g */
    private final Context f152189g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter$ActionSheetData;", "", "icon", "", "content", "", "isSelected", "", "(ILjava/lang/String;Z)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getIcon", "()I", "setIcon", "(I)V", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.a.c$a */
    public static final class ActionSheetData {

        /* renamed from: a */
        private int f152190a;

        /* renamed from: b */
        private String f152191b;

        /* renamed from: c */
        private boolean f152192c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionSheetData)) {
                return false;
            }
            ActionSheetData aVar = (ActionSheetData) obj;
            return this.f152190a == aVar.f152190a && Intrinsics.areEqual(this.f152191b, aVar.f152191b) && this.f152192c == aVar.f152192c;
        }

        public int hashCode() {
            int i = this.f152190a * 31;
            String str = this.f152191b;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.f152192c;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return hashCode + i2;
        }

        public String toString() {
            return "ActionSheetData(icon=" + this.f152190a + ", content=" + this.f152191b + ", isSelected=" + this.f152192c + ")";
        }

        /* renamed from: a */
        public final int mo208597a() {
            return this.f152190a;
        }

        /* renamed from: b */
        public final String mo208599b() {
            return this.f152191b;
        }

        /* renamed from: c */
        public final boolean mo208600c() {
            return this.f152192c;
        }

        /* renamed from: a */
        public final void mo208598a(boolean z) {
            this.f152192c = z;
        }

        public ActionSheetData(int i, String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f152190a = i;
            this.f152191b = str;
            this.f152192c = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter$VCDialogListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "iconEnd", "Lcom/ss/android/vc/common/widget/IconFontView;", "getIconEnd", "()Lcom/ss/android/vc/common/widget/IconFontView;", "setIconEnd", "(Lcom/ss/android/vc/common/widget/IconFontView;)V", "iconStart", "Landroid/widget/ImageView;", "getIconStart", "()Landroid/widget/ImageView;", "setIconStart", "(Landroid/widget/ImageView;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.a.c$b */
    public static final class VCDialogListItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TextView f152193a;

        /* renamed from: b */
        private ImageView f152194b;

        /* renamed from: c */
        private IconFontView f152195c;

        /* renamed from: a */
        public final TextView mo208604a() {
            return this.f152193a;
        }

        /* renamed from: b */
        public final ImageView mo208605b() {
            return this.f152194b;
        }

        /* renamed from: c */
        public final IconFontView mo208606c() {
            return this.f152195c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public VCDialogListItemViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.vc_dialog_content_item_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.vc_dialog_content_item_tv");
            this.f152193a = textView;
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.vc_icon_sheet_start);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "itemView.vc_icon_sheet_start");
            this.f152194b = appCompatImageView;
            IconFontView iconFontView = (IconFontView) view.findViewById(R.id.vc_icon_sheet_end);
            Intrinsics.checkExpressionValueIsNotNull(iconFontView, "itemView.vc_icon_sheet_end");
            this.f152195c = iconFontView;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f152184b.size();
    }

    /* renamed from: a */
    public final void mo208590a(int i) {
        this.f152185c = i;
    }

    /* renamed from: b */
    public final void mo208594b(int i) {
        this.f152186d = i;
    }

    /* renamed from: c */
    public final void mo208595c(int i) {
        this.f152187e = i;
    }

    /* renamed from: d */
    public final void mo208596d(int i) {
        this.f152188f = i;
    }

    /* renamed from: a */
    public final void mo208591a(VCActionSheetController.OnItemClickListener aVar) {
        this.f152183a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.a.c$c */
    public static final class View$OnClickListenerC60827c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VCActionSheetDialogAdapter f152196a;

        /* renamed from: b */
        final /* synthetic */ int f152197b;

        View$OnClickListenerC60827c(VCActionSheetDialogAdapter cVar, int i) {
            this.f152196a = cVar;
            this.f152197b = i;
        }

        public final void onClick(View view) {
            VCActionSheetController.OnItemClickListener aVar = this.f152196a.f152183a;
            if (aVar != null) {
                aVar.mo208588a(this.f152197b);
            }
        }
    }

    public VCActionSheetDialogAdapter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f152189g = context;
    }

    /* renamed from: a */
    public final void mo208593a(List<ActionSheetData> list) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        this.f152184b.clear();
        this.f152184b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public VCDialogListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f152189g).inflate(this.f152185c, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mCon…LayoutRes, parent, false)");
        return new VCDialogListItemViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(VCDialogListItemViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        if (i == 0) {
            bVar.itemView.setBackgroundResource(R.drawable.vc_bg_action_panel_item_start);
        } else if (i == getItemCount() - 1) {
            bVar.itemView.setBackgroundResource(R.drawable.vc_bg_action_panel_item_end);
        } else {
            bVar.itemView.setBackgroundResource(R.drawable.vc_bg_action_panel_item);
        }
        ActionSheetData aVar = this.f152184b.get(i);
        bVar.mo208604a().setText(aVar.mo208599b());
        bVar.mo208605b().setImageDrawable(C60773o.m236128f(aVar.mo208597a()));
        if (aVar.mo208600c()) {
            C60752f.m236079a((View) bVar.mo208606c());
        } else {
            C60752f.m236081b((View) bVar.mo208606c());
        }
        bVar.itemView.setOnClickListener(new View$OnClickListenerC60827c(this, i));
        if (this.f152186d > 0) {
            bVar.mo208604a().setTextSize((float) this.f152186d);
        }
        if (this.f152188f > 0) {
            View view = bVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            view.getLayoutParams().height = (int) UDDimenUtils.m93308a(this.f152189g, this.f152188f);
        }
        if (this.f152187e != -1) {
            bVar.mo208604a().setTextColor(UDColorUtils.getColor(this.f152189g, this.f152187e));
        }
    }
}
