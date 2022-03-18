package com.ss.android.lark.pin.impl.v3.binder.holderview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\"#B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/holderview/VoteOptionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/pin/impl/v3/binder/holderview/VoteOptionAdapter$VoteOptionViewHolder;", "context", "Landroid/content/Context;", "optionList", "", "", "(Landroid/content/Context;Ljava/util/List;)V", "mContext", "mOptionList", "onClickListener", "Landroid/view/View$OnClickListener;", "getOnClickListener", "()Landroid/view/View$OnClickListener;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "getOnLongClickListener", "()Landroid/view/View$OnLongClickListener;", "setOnLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "ellipsizeOptionList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "VoteOptionViewHolder", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.w */
public final class VoteOptionAdapter extends RecyclerView.Adapter<VoteOptionViewHolder> {

    /* renamed from: a */
    public static final Companion f128405a = new Companion(null);

    /* renamed from: b */
    private final Context f128406b;

    /* renamed from: c */
    private final List<CharSequence> f128407c;

    /* renamed from: d */
    private View.OnClickListener f128408d;

    /* renamed from: e */
    private View.OnLongClickListener f128409e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/holderview/VoteOptionAdapter$Companion;", "", "()V", "ELLIPSIZED_OPTION", "", "OPTION_SIZE_LIMIT", "", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.w$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/holderview/VoteOptionAdapter$VoteOptionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/pin/impl/v3/binder/holderview/VoteOptionAdapter;Landroid/view/View;)V", "optionContentTV", "Landroid/widget/TextView;", "getOptionContentTV", "()Landroid/widget/TextView;", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.w$b */
    public final class VoteOptionViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ VoteOptionAdapter f128410a;

        /* renamed from: b */
        private final TextView f128411b;

        /* renamed from: a */
        public final TextView mo177613a() {
            return this.f128411b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public VoteOptionViewHolder(VoteOptionAdapter wVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f128410a = wVar;
            View findViewById = view.findViewById(R.id.vote_option_tv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.vote_option_tv)");
            this.f128411b = (TextView) findViewById;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f128407c.size();
    }

    /* renamed from: a */
    public final void mo177610a(View.OnClickListener onClickListener) {
        this.f128408d = onClickListener;
    }

    /* renamed from: a */
    public final void mo177611a(View.OnLongClickListener onLongClickListener) {
        this.f128409e = onLongClickListener;
    }

    /* renamed from: a */
    private final List<CharSequence> m200213a(List<CharSequence> list) {
        int i;
        if (list.size() >= 3) {
            i = 3;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(list.get(i2));
        }
        if (list.size() > 3) {
            arrayList.add("...");
        }
        return arrayList;
    }

    public VoteOptionAdapter(Context context, List<CharSequence> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "optionList");
        this.f128406b = context;
        this.f128407c = m200213a(list);
    }

    /* renamed from: a */
    public VoteOptionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f128406b).inflate(R.layout.item_vote_option, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mCon…te_option, parent, false)");
        return new VoteOptionViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(VoteOptionViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        C25649b.m91857a(bVar.mo177613a(), LarkFont.BODY1);
        bVar.mo177613a().setText(this.f128407c.get(i));
        View.OnClickListener onClickListener = this.f128408d;
        if (onClickListener != null) {
            bVar.itemView.setOnClickListener(onClickListener);
        }
        View.OnLongClickListener onLongClickListener = this.f128409e;
        if (onLongClickListener != null) {
            bVar.itemView.setOnLongClickListener(onLongClickListener);
        }
    }
}
