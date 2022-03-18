package com.ss.android.lark.contact.feat.common;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005RL\u0010\u0006\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/contact/feat/common/ItemViewHolder;", "Value", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "dataBinder", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "pos", "", "getDataBinder", "()Lkotlin/jvm/functions/Function2;", "setDataBinder", "(Lkotlin/jvm/functions/Function2;)V", "getItemView", "()Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.common.e */
public class ItemViewHolder<Value> extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private Function2<? super Value, ? super Integer, Unit> f91601a;

    /* renamed from: b */
    private final View f91602b;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super Value, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.k<Value, java.lang.Integer, kotlin.Unit> */
    /* renamed from: a */
    public final Function2<Value, Integer, Unit> mo130758a() {
        return (Function2<? super Value, ? super Integer, Unit>) this.f91601a;
    }

    /* renamed from: a */
    public final void mo130759a(Function2<? super Value, ? super Integer, Unit> kVar) {
        this.f91601a = kVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f91602b = view;
    }
}
