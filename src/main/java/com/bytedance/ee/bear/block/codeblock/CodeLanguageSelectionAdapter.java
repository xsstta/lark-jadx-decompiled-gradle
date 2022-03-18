package com.bytedance.ee.bear.block.codeblock;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0016\u0010\u0018\u001a\u00020\u00112\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\u0010\u0010\u0019\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionAdapter$ViewHolder;", "()V", "codeLanguageList", "", "", "selectedChangeListener", "Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionAdapter$OnSelectedChangeListener;", "getSelectedChangeListener", "()Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionAdapter$OnSelectedChangeListener;", "setSelectedChangeListener", "(Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionAdapter$OnSelectedChangeListener;)V", "selectedCodeLanguage", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCodeLanguageList", "setSelectedCodeLanguage", "OnSelectedChangeListener", "ViewHolder", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.block.codeblock.b */
public final class CodeLanguageSelectionAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private List<String> f14403a;

    /* renamed from: b */
    private String f14404b;

    /* renamed from: c */
    private OnSelectedChangeListener f14405c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionAdapter$OnSelectedChangeListener;", "", "onSelectCodeLanguage", "", "codeLanguage", "", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.codeblock.b$a */
    public interface OnSelectedChangeListener {
        /* renamed from: a */
        void mo19226a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionAdapter;Landroid/view/View;)V", "codeLanguageType", "Landroid/widget/TextView;", "getCodeLanguageType", "()Landroid/widget/TextView;", "divider", "getDivider", "()Landroid/view/View;", "selectedIcon", "Landroid/widget/ImageView;", "getSelectedIcon", "()Landroid/widget/ImageView;", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.codeblock.b$b */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CodeLanguageSelectionAdapter f14406a;

        /* renamed from: b */
        private final TextView f14407b;

        /* renamed from: c */
        private final ImageView f14408c;

        /* renamed from: d */
        private final View f14409d;

        /* renamed from: a */
        public final TextView mo19227a() {
            return this.f14407b;
        }

        /* renamed from: b */
        public final ImageView mo19228b() {
            return this.f14408c;
        }

        /* renamed from: c */
        public final View mo19229c() {
            return this.f14409d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CodeLanguageSelectionAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f14406a = bVar;
            View findViewById = view.findViewById(R.id.code_language_type);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.code_language_type)");
            this.f14407b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.selected_icon);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.selected_icon)");
            this.f14408c = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.divider)");
            this.f14409d = findViewById3;
        }
    }

    /* renamed from: a */
    public final OnSelectedChangeListener mo19220a() {
        return this.f14405c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.f14403a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo19222a(OnSelectedChangeListener aVar) {
        this.f14405c = aVar;
    }

    /* renamed from: a */
    public final void mo19224a(String str) {
        this.f14404b = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionAdapter$onBindViewHolder$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.codeblock.b$c */
    public static final class View$OnClickListenerC4899c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CodeLanguageSelectionAdapter f14410a;

        /* renamed from: b */
        final /* synthetic */ ViewHolder f14411b;

        /* renamed from: c */
        final /* synthetic */ int f14412c;

        View$OnClickListenerC4899c(CodeLanguageSelectionAdapter bVar, ViewHolder bVar2, int i) {
            this.f14410a = bVar;
            this.f14411b = bVar2;
            this.f14412c = i;
        }

        public final void onClick(View view) {
            String obj = this.f14411b.mo19227a().getText().toString();
            this.f14411b.mo19228b().setVisibility(0);
            OnSelectedChangeListener a = this.f14410a.mo19220a();
            if (a != null) {
                a.mo19226a(obj);
            }
            this.f14410a.mo19224a(obj);
            this.f14410a.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo19225a(List<String> list) {
        this.f14403a = list;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.code_language_selection_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        List<String> list = this.f14403a;
        if (list != null) {
            bVar.mo19227a().setText(list.get(i));
            ImageView b = bVar.mo19228b();
            int i3 = 0;
            if (TextUtils.equals(list.get(i), this.f14404b)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            b.setVisibility(i2);
            View c = bVar.mo19229c();
            if (i == getItemCount() - 1) {
                i3 = 8;
            }
            c.setVisibility(i3);
            bVar.itemView.setOnClickListener(new View$OnClickListenerC4899c(this, bVar, i));
        }
    }
}
