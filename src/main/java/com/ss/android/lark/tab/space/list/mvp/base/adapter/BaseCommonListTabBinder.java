package com.ss.android.lark.tab.space.list.mvp.base.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.tab.space.list.mvp.base.OnItemListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\u000e\u001a\u00028\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0002\u0010\u0011J5\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&¢\u0006\u0002\u0010\u001aR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/BaseCommonListTabBinder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VD", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/HighColorDelegate;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "is24HourTime", "", "()Z", "set24HourTime", "(Z)V", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onBindViewHolder", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "itemListener", "Lcom/ss/android/lark/tab/space/list/mvp/base/OnItemListener;", "position", "", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;Lcom/ss/android/lark/tab/space/list/mvp/base/OnItemListener;I)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a.a */
public abstract class BaseCommonListTabBinder<VH extends RecyclerView.ViewHolder, VD extends BaseListViewData> extends HighColorDelegate<VH, VD> {

    /* renamed from: b */
    private boolean f136487b = true;

    /* renamed from: a */
    public abstract VH mo188518a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo188519a(VH vh, VD vd, OnItemListener<VD> onItemListener, int i);

    /* renamed from: a */
    public boolean mo188521a() {
        return this.f136487b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseCommonListTabBinder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public void mo188520a(boolean z) {
        this.f136487b = z;
    }
}
