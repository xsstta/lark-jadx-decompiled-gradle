package com.ss.android.lark.search.redesign.filter.typeselect;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.search.impl.p2592b.p2593a.C53341a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001aB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$TypeSelectViewHolder;", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectData;", "singleMode", "", "(Z)V", "onTypeFilterClick", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;", "getOnTypeFilterClick", "()Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;", "setOnTypeFilterClick", "(Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;)V", "getSingleMode", "()Z", "setSingleMode", "onBindViewHolder", "", "holderSelect", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "IOnTypeFilterClickListener", "TypeSelectViewHolder", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.filter.typeselect.a */
public final class TypeSelectAdapter extends LarkRecyclerViewBaseAdapter<TypeSelectViewHolder, TypeSelectData> {

    /* renamed from: a */
    private IOnTypeFilterClickListener f132721a;

    /* renamed from: b */
    private boolean f132722b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;", "", "onTypeFilterClick", "", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.filter.typeselect.a$a */
    public interface IOnTypeFilterClickListener {
        /* renamed from: a */
        void mo183328a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$TypeSelectViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mNameTV", "Landroid/widget/TextView;", "getMNameTV", "()Landroid/widget/TextView;", "mTypeCB", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "getMTypeCB", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "mTypeRB", "getMTypeRB", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.filter.typeselect.a$b */
    public static final class TypeSelectViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final UDCheckBox f132723a;

        /* renamed from: b */
        private final UDCheckBox f132724b;

        /* renamed from: c */
        private final TextView f132725c;

        /* renamed from: a */
        public final UDCheckBox mo183389a() {
            return this.f132723a;
        }

        /* renamed from: b */
        public final UDCheckBox mo183390b() {
            return this.f132724b;
        }

        /* renamed from: c */
        public final TextView mo183391c() {
            return this.f132725c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TypeSelectViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.type_cb);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.type_cb)");
            this.f132723a = (UDCheckBox) findViewById;
            View findViewById2 = view.findViewById(R.id.type_rb);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.type_rb)");
            this.f132724b = (UDCheckBox) findViewById2;
            View findViewById3 = view.findViewById(R.id.type_name_tv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.type_name_tv)");
            this.f132725c = (TextView) findViewById3;
        }
    }

    /* renamed from: a */
    public final IOnTypeFilterClickListener mo183384a() {
        return this.f132721a;
    }

    /* renamed from: b */
    public final boolean mo183388b() {
        return this.f132722b;
    }

    public TypeSelectAdapter(boolean z) {
        this.f132722b = z;
    }

    /* renamed from: a */
    public final void mo183386a(IOnTypeFilterClickListener aVar) {
        this.f132721a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$onBindViewHolder$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.filter.typeselect.a$c */
    public static final class View$OnClickListenerC53755c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectData f132726a;

        /* renamed from: b */
        final /* synthetic */ TypeSelectAdapter f132727b;

        /* renamed from: c */
        final /* synthetic */ TypeSelectViewHolder f132728c;

        /* renamed from: d */
        final /* synthetic */ int f132729d;

        View$OnClickListenerC53755c(TypeSelectData bVar, TypeSelectAdapter aVar, TypeSelectViewHolder bVar2, int i) {
            this.f132726a = bVar;
            this.f132727b = aVar;
            this.f132728c = bVar2;
            this.f132729d = i;
        }

        public final void onClick(View view) {
            if (!this.f132727b.mo183388b()) {
                this.f132728c.mo183389a().setChecked(this.f132726a.mo183396b());
            } else if (!((TypeSelectData) this.f132727b.getItem(this.f132729d)).mo183396b()) {
                List<TypeSelectData> items = this.f132727b.getItems();
                Intrinsics.checkExpressionValueIsNotNull(items, "getItems()");
                for (TypeSelectData bVar : items) {
                    bVar.mo183395a(false);
                }
                ((TypeSelectData) this.f132727b.getItem(this.f132729d)).mo183395a(true);
                this.f132728c.mo183390b().setChecked(this.f132726a.mo183396b());
                this.f132727b.notifyDataSetChanged();
            } else {
                return;
            }
            this.f132728c.mo183389a().setChecked(!this.f132728c.mo183389a().isChecked());
            this.f132728c.mo183390b().setChecked(true ^ this.f132728c.mo183390b().isChecked());
            IOnTypeFilterClickListener a = this.f132727b.mo183384a();
            if (a != null) {
                a.mo183328a(this.f132729d);
            }
        }
    }

    /* renamed from: a */
    public TypeSelectViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new TypeSelectViewHolder(C53341a.m206455a(viewGroup, R.layout.type_select_item, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(TypeSelectViewHolder bVar, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(bVar, "holderSelect");
        TypeSelectData bVar2 = (TypeSelectData) getItem(i);
        if (bVar2 != null) {
            bVar.mo183391c().setText(bVar2.mo183393a());
            UDCheckBox b = bVar.mo183390b();
            int i3 = 8;
            if (this.f132722b) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            b.setVisibility(i2);
            UDCheckBox a = bVar.mo183389a();
            if (!this.f132722b) {
                i3 = 0;
            }
            a.setVisibility(i3);
            bVar.mo183389a().setClickable(false);
            bVar.mo183390b().setClickable(false);
            bVar.mo183389a().setChecked(bVar2.mo183396b());
            bVar.mo183390b().setChecked(bVar2.mo183396b());
            bVar.itemView.setOnClickListener(new View$OnClickListenerC53755c(bVar2, this, bVar, i));
        }
    }
}
