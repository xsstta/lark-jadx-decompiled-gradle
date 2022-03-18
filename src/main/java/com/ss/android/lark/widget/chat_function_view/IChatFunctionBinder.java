package com.ss.android.lark.widget.chat_function_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&¢\u0006\u0002\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "onBindViewHolder", "", "viewHolder", "item", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onItemClicked", "", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;)Z", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.chat_function_view.b */
public abstract class IChatFunctionBinder<VH extends RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final Context f143609a;

    /* renamed from: a */
    public abstract void mo127550a(VH vh, IChatFunctionItem dVar);

    /* renamed from: b */
    public abstract VH mo127552b(ViewGroup viewGroup, LayoutInflater layoutInflater);

    /* renamed from: c */
    public final Context mo197618c() {
        return this.f143609a;
    }

    public IChatFunctionBinder(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f143609a = context;
    }

    /* renamed from: b */
    public boolean mo129900b(VH vh, IChatFunctionItem dVar) {
        Intrinsics.checkParameterIsNotNull(vh, "viewHolder");
        Intrinsics.checkParameterIsNotNull(dVar, "item");
        dVar.mo127575c().mo127580a(this.f143609a);
        return true;
    }
}
