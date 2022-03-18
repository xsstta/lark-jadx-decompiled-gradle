package com.ss.android.lark.chatsetting.impl.chat_function;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionBinder;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import com.ss.android.lark.widget.chat_function_view.OnItemUpdateListener;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005:\u00011B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u001d\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0015J\u001d\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010#J\u001d\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010*\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0015J\u0014\u0010+\u001a\u00020\u00132\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0-J\u000e\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u0011J\u000e\u00100\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000fR\u0010\u0010\b\u001a\u00028\u0001X\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionAdapter;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "B", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "mContext", "Landroid/content/Context;", "binder", "onItemClickListener", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionAdapter$OnItemClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionAdapter$OnItemClickListener;)V", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "itemList", "", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "onItemUpdateListener", "Lcom/ss/android/lark/widget/chat_function_view/OnItemUpdateListener;", "addItem", "", "position", "", "item", "bindOnClickListener", "viewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;)V", "findItemPosition", "getHightestPriorityBadgeMenu", "getItemById", "id", "getItemByPosition", "getItemCount", "getPositionById", "onBindViewHolder", "holder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "removeItem", "removeItemById", "setItems", "items", "", "setOnMenuItemUpdateListener", "listener", "updateItem", "OnItemClickListener", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.a.a */
public final class ChatFunctionAdapter<VH extends RecyclerView.ViewHolder, B extends IChatFunctionBinder<VH>> extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    public final B f89001a;

    /* renamed from: b */
    public final OnItemClickListener f89002b;

    /* renamed from: c */
    private final List<IChatFunctionItem> f89003c = new ArrayList();

    /* renamed from: d */
    private OnItemUpdateListener f89004d;

    /* renamed from: e */
    private final Context f89005e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionAdapter$OnItemClickListener;", "", "onItemClick", "", "item", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.a$a */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo127548a(IChatFunctionItem dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f89003c.size();
    }

    /* renamed from: a */
    public final IChatFunctionItem mo127542a() {
        int i;
        ChatFunctionBadge b;
        IChatFunctionItem dVar = null;
        for (IChatFunctionItem dVar2 : this.f89003c) {
            ChatFunctionBadge b2 = dVar2.mo127574b();
            if (b2 != null && (b2.mo197615b() || b2.mo197616c() > 0)) {
                if (dVar != null) {
                    if (dVar == null || (b = dVar.mo127574b()) == null) {
                        i = 0;
                    } else {
                        i = b.mo197617d();
                    }
                    if (b2.mo197617d() <= i) {
                    }
                }
                dVar = dVar2;
            }
        }
        return dVar;
    }

    /* renamed from: b */
    private final int m133938b(IChatFunctionItem dVar) {
        return this.f89003c.indexOf(dVar);
    }

    /* renamed from: a */
    public final void mo127545a(OnItemUpdateListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        this.f89004d = fVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionAdapter$bindOnClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.a$b */
    public static final class C34502b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatFunctionAdapter f89006a;

        /* renamed from: b */
        final /* synthetic */ IChatFunctionItem f89007b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView.ViewHolder f89008c;

        /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: B extends com.ss.android.lark.widget.chat_function_view.b<VH> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f89006a.f89002b.mo127548a(this.f89007b);
            this.f89006a.f89001a.mo129900b(this.f89008c, this.f89007b);
        }

        C34502b(ChatFunctionAdapter aVar, IChatFunctionItem dVar, RecyclerView.ViewHolder viewHolder) {
            this.f89006a = aVar;
            this.f89007b = dVar;
            this.f89008c = viewHolder;
        }
    }

    /* renamed from: a */
    public final int mo127541a(int i) {
        IChatFunctionItem b = mo127547b(i);
        if (b != null) {
            return m133938b(b);
        }
        return -1;
    }

    /* renamed from: b */
    public final IChatFunctionItem mo127547b(int i) {
        IChatFunctionItem dVar;
        boolean z;
        List<IChatFunctionItem> list = this.f89003c;
        ListIterator<IChatFunctionItem> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                dVar = null;
                break;
            }
            dVar = listIterator.previous();
            if (dVar.mo127572a() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo127544a(IChatFunctionItem dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "item");
        IChatFunctionItem b = mo127547b(dVar.mo127572a());
        if (b != null) {
            int b2 = m133938b(b);
            this.f89003c.set(b2, dVar);
            notifyItemChanged(b2);
            OnItemUpdateListener fVar = this.f89004d;
            if (fVar != null) {
                fVar.onItemUpdated(dVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo127546a(List<? extends IChatFunctionItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        this.f89003c.clear();
        this.f89003c.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private final void m133937a(VH vh, IChatFunctionItem dVar) {
        vh.itemView.setOnClickListener(new C34502b(this, dVar, vh));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i) {
        Intrinsics.checkParameterIsNotNull(vh, "holder");
        m133937a(vh, this.f89003c.get(i));
        this.f89001a.mo127550a(vh, this.f89003c.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        B b = this.f89001a;
        LayoutInflater from = LayoutInflater.from(this.f89005e);
        Intrinsics.checkExpressionValueIsNotNull(from, "LayoutInflater.from(mContext)");
        return (VH) b.mo127552b(viewGroup, from);
    }

    /* renamed from: a */
    public final void mo127543a(int i, IChatFunctionItem dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "item");
        if (i >= 0 && i <= this.f89003c.size()) {
            this.f89003c.add(i, dVar);
            notifyItemInserted(i);
        }
    }

    public ChatFunctionAdapter(Context context, B b, OnItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(b, "binder");
        Intrinsics.checkParameterIsNotNull(aVar, "onItemClickListener");
        this.f89005e = context;
        this.f89001a = b;
        this.f89002b = aVar;
    }
}
