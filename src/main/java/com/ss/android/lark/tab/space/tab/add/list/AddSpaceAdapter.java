package com.ss.android.lark.tab.space.tab.add.list;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1374g;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.tab.space.tab.add.common.AddSpaceItemBinder;
import com.ss.android.lark.tab.space.tab.add.common.IItemBinder;
import com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001aB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/tab/space/tab/add/common/AddSpaceItemBinder$AddSpaceViewHolder;", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "context", "Landroid/content/Context;", "itemClickListener", "Lcom/ss/android/lark/tab/space/tab/add/common/IItemBinder$OnItemClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/tab/space/tab/add/common/IItemBinder$OnItemClickListener;)V", "binder", "Lcom/ss/android/lark/tab/space/tab/add/common/AddSpaceItemBinder;", "getContext", "()Landroid/content/Context;", "diff", "", "collection", "", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "DiffCallback", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.tab.add.list.a */
public final class AddSpaceAdapter extends LarkRecyclerViewBaseAdapter<AddSpaceItemBinder.AddSpaceViewHolder, SpaceSelectViewData> {

    /* renamed from: a */
    public static final Companion f136563a = new Companion(null);

    /* renamed from: b */
    private final AddSpaceItemBinder f136564b;

    /* renamed from: c */
    private final Context f136565c;

    /* renamed from: d */
    private final IItemBinder.OnItemClickListener<SpaceSelectViewData> f136566d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceAdapter$Companion;", "", "()V", "AVATAR_MINI_SIZE_IN_DP", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldData", "", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "newData", "(Ljava/util/List;Ljava/util/List;)V", "mNewData", "mOldData", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.a$b */
    private static final class DiffCallback extends C1374g.AbstractC1376a {

        /* renamed from: a */
        private List<SpaceSelectViewData> f136567a;

        /* renamed from: b */
        private List<SpaceSelectViewData> f136568b;

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public int mo7380a() {
            return this.f136567a.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public int mo7382b() {
            return this.f136568b.size();
        }

        public DiffCallback(List<SpaceSelectViewData> list, List<SpaceSelectViewData> list2) {
            Intrinsics.checkParameterIsNotNull(list, "oldData");
            Intrinsics.checkParameterIsNotNull(list2, "newData");
            this.f136567a = list;
            this.f136568b = list2;
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public boolean mo7381a(int i, int i2) {
            return this.f136567a.get(i).isItemSame(this.f136568b.get(i2));
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public boolean mo7383b(int i, int i2) {
            return this.f136567a.get(i).isContentSame(this.f136568b.get(i2));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Collection<com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData>] */
    @Override // com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public void diff(Collection<? extends SpaceSelectViewData> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "collection");
        ArrayList arrayList = new ArrayList(collection);
        if (this.items.size() == 0) {
            this.items.addAll(arrayList);
            notifyDataSetChanged();
            return;
        }
        List list = this.items;
        Intrinsics.checkExpressionValueIsNotNull(list, "items");
        C1374g.C1377b a = C1374g.m6298a(new DiffCallback(list, arrayList), false);
        Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(D…list),\n            false)");
        a.mo7412a(this);
        this.items.clear();
        this.items.addAll(arrayList);
    }

    /* renamed from: a */
    public AddSpaceItemBinder.AddSpaceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return this.f136564b.mo188552a(viewGroup);
    }

    public AddSpaceAdapter(Context context, IItemBinder.OnItemClickListener<SpaceSelectViewData> aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f136565c = context;
        this.f136566d = aVar;
        setHasStableIds(true);
        this.f136564b = new AddSpaceItemBinder(context, aVar, false, 4, null);
    }

    /* renamed from: a */
    public void onBindViewHolder(AddSpaceItemBinder.AddSpaceViewHolder addSpaceViewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(addSpaceViewHolder, "holder");
        SpaceSelectViewData spaceSelectViewData = (SpaceSelectViewData) getItem(i);
        AddSpaceItemBinder addSpaceItemBinder = this.f136564b;
        Intrinsics.checkExpressionValueIsNotNull(spaceSelectViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        addSpaceItemBinder.mo188554a(addSpaceViewHolder, spaceSelectViewData);
    }
}
