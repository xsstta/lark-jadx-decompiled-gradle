package com.ss.android.lark.tab.manager.view;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.tab.manager.entity.ChatTabOrderData;
import com.ss.android.lark.tab.manager.view.TabItemTouchCallback;
import com.ss.android.lark.tab.statistics.ChatTabHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002-.B\u000f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cJ\u001c\u0010\u001d\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u001c\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0011H\u0016J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0016J\b\u0010'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020\u001eH\u0002J\u0014\u0010)\u001a\u00020\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030+J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0013¨\u0006/"}, d2 = {"Lcom/ss/android/lark/tab/manager/view/TabOrderListAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/tab/manager/view/TabOrderListAdapter$TabItemViewHolder;", "Lcom/ss/android/lark/tab/manager/entity/ChatTabOrderData;", "Lcom/ss/android/lark/tab/manager/view/TabItemTouchCallback$ItemTouchAdapterImpl;", "callback", "Lcom/ss/android/lark/tab/manager/view/TabOrderListAdapter$ITabOrderListCallback;", "(Lcom/ss/android/lark/tab/manager/view/TabOrderListAdapter$ITabOrderListCallback;)V", "getCallback", "()Lcom/ss/android/lark/tab/manager/view/TabOrderListAdapter$ITabOrderListCallback;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differ$delegate", "Lkotlin/Lazy;", "tabStatus", "", "tabStatus$annotations", "()V", "autoOpenDrag", "", "getItemCount", "getItemId", "", "position", "getItemViewType", "getTabListIds", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemMove", "fromPosition", "toPosition", "onStartDrag", "reportTabDragEvent", "submitList", "collection", "", "updateTabStatus", "ITabOrderListCallback", "TabItemViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TabOrderListAdapter extends LarkRecyclerViewBaseAdapter<TabItemViewHolder, ChatTabOrderData> implements TabItemTouchCallback.ItemTouchAdapterImpl {

    /* renamed from: a */
    private int f136390a = 1;

    /* renamed from: b */
    private final Lazy f136391b = LazyKt.lazy(new C55275b(this));

    /* renamed from: c */
    private final ITabOrderListCallback f136392c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/tab/manager/view/TabOrderListAdapter$ITabOrderListCallback;", "", "onTabClick", "", "id", "", "onTabDeleted", "onTabOrderChanged", "ids", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.view.TabOrderListAdapter$a */
    public interface ITabOrderListCallback {
        /* renamed from: a */
        void mo188328a(long j);

        /* renamed from: a */
        void mo188329a(List<Long> list);

        /* renamed from: b */
        void mo188330b(long j);
    }

    /* renamed from: e */
    private final C1356d<ChatTabOrderData> m214344e() {
        return (C1356d) this.f136391b.getValue();
    }

    @Override // com.ss.android.lark.tab.manager.view.TabItemTouchCallback.ItemTouchAdapterImpl
    /* renamed from: b */
    public void mo188357b() {
        m214345f();
    }

    /* renamed from: d */
    public final ITabOrderListCallback mo188363d() {
        return this.f136392c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/tab/manager/view/TabOrderListAdapter$TabItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/tab/manager/view/TabOrderListAdapter;Landroid/view/View;)V", "mDeleteIcon", "Landroid/widget/ImageView;", "getMDeleteIcon", "()Landroid/widget/ImageView;", "setMDeleteIcon", "(Landroid/widget/ImageView;)V", "mIcon", "getMIcon", "setMIcon", "mTitle", "Landroid/widget/TextView;", "getMTitle", "()Landroid/widget/TextView;", "setMTitle", "(Landroid/widget/TextView;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public final class TabItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ TabOrderListAdapter f136393a;
        @BindView(7532)
        public ImageView mDeleteIcon;
        @BindView(7828)
        public ImageView mIcon;
        @BindView(9006)
        public TextView mTitle;

        /* renamed from: a */
        public final ImageView mo188364a() {
            ImageView imageView = this.mIcon;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            }
            return imageView;
        }

        /* renamed from: b */
        public final TextView mo188365b() {
            TextView textView = this.mTitle;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitle");
            }
            return textView;
        }

        /* renamed from: c */
        public final ImageView mo188366c() {
            ImageView imageView = this.mDeleteIcon;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeleteIcon");
            }
            return imageView;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TabItemViewHolder(TabOrderListAdapter tabOrderListAdapter, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f136393a = tabOrderListAdapter;
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: f */
    private final void m214345f() {
        ChatTabHitPoint.f136619a.mo188725b(ChatTabHitPoint.ChatTabExtraParam.Click.DRAG_DOC.plus(ChatTabHitPoint.ChatTabExtraParam.Target.IM_CHAT_DOC_PAGE_MANAGE_VIEW));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public int getItemCount() {
        return m214344e().mo7374a().size();
    }

    public final class TabItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private TabItemViewHolder f136394a;

        @Override // butterknife.Unbinder
        public void unbind() {
            TabItemViewHolder tabItemViewHolder = this.f136394a;
            if (tabItemViewHolder != null) {
                this.f136394a = null;
                tabItemViewHolder.mIcon = null;
                tabItemViewHolder.mTitle = null;
                tabItemViewHolder.mDeleteIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public TabItemViewHolder_ViewBinding(TabItemViewHolder tabItemViewHolder, View view) {
            this.f136394a = tabItemViewHolder;
            tabItemViewHolder.mIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.icon, "field 'mIcon'", ImageView.class);
            tabItemViewHolder.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
            tabItemViewHolder.mDeleteIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.delete_icon, "field 'mDeleteIcon'", ImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/ss/android/lark/tab/manager/entity/ChatTabOrderData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.view.TabOrderListAdapter$b */
    static final class C55275b extends Lambda implements Function0<C1356d<ChatTabOrderData>> {
        final /* synthetic */ TabOrderListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55275b(TabOrderListAdapter tabOrderListAdapter) {
            super(0);
            this.this$0 = tabOrderListAdapter;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1356d<ChatTabOrderData> invoke() {
            return new C1356d<>(this.this$0, new C1374g.AbstractC1378c<ChatTabOrderData>() {
                /* class com.ss.android.lark.tab.manager.view.TabOrderListAdapter.C55275b.C552761 */

                /* renamed from: a */
                public boolean areItemsTheSame(ChatTabOrderData chatTabOrderData, ChatTabOrderData chatTabOrderData2) {
                    Intrinsics.checkParameterIsNotNull(chatTabOrderData, "oldItem");
                    Intrinsics.checkParameterIsNotNull(chatTabOrderData2, "newItem");
                    return C26247a.m94980a((AbstractC26248b) chatTabOrderData, (AbstractC26248b) chatTabOrderData2);
                }

                /* renamed from: b */
                public boolean areContentsTheSame(ChatTabOrderData chatTabOrderData, ChatTabOrderData chatTabOrderData2) {
                    Intrinsics.checkParameterIsNotNull(chatTabOrderData, "oldItem");
                    Intrinsics.checkParameterIsNotNull(chatTabOrderData2, "newItem");
                    return C26247a.m94983b(chatTabOrderData, chatTabOrderData2);
                }
            });
        }
    }

    @Override // com.ss.android.lark.tab.manager.view.TabItemTouchCallback.ItemTouchAdapterImpl
    /* renamed from: a */
    public boolean mo188356a() {
        if (this.f136390a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final List<Long> mo188362c() {
        List<ChatTabOrderData> a = m214344e().mo7374a();
        Intrinsics.checkExpressionValueIsNotNull(a, "differ.currentList");
        List<ChatTabOrderData> list = a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getId()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo188359a(int i) {
        this.f136390a = i;
    }

    /* renamed from: a */
    public final void mo188361a(List<ChatTabOrderData> list) {
        Intrinsics.checkParameterIsNotNull(list, "collection");
        m214344e().mo7376a(list);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.view.TabOrderListAdapter$c */
    public static final class View$OnClickListenerC55277c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TabOrderListAdapter f136395a;

        /* renamed from: b */
        final /* synthetic */ ChatTabOrderData f136396b;

        View$OnClickListenerC55277c(TabOrderListAdapter tabOrderListAdapter, ChatTabOrderData chatTabOrderData) {
            this.f136395a = tabOrderListAdapter;
            this.f136396b = chatTabOrderData;
        }

        public final void onClick(View view) {
            ITabOrderListCallback d = this.f136395a.mo188363d();
            if (d != null) {
                d.mo188328a(this.f136396b.getId());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.view.TabOrderListAdapter$d */
    public static final class View$OnClickListenerC55278d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TabOrderListAdapter f136397a;

        /* renamed from: b */
        final /* synthetic */ ChatTabOrderData f136398b;

        View$OnClickListenerC55278d(TabOrderListAdapter tabOrderListAdapter, ChatTabOrderData chatTabOrderData) {
            this.f136397a = tabOrderListAdapter;
            this.f136398b = chatTabOrderData;
        }

        public final void onClick(View view) {
            ITabOrderListCallback d = this.f136397a.mo188363d();
            if (d != null) {
                d.mo188330b(this.f136398b.getTabId());
            }
        }
    }

    public TabOrderListAdapter(ITabOrderListCallback aVar) {
        this.f136392c = aVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return m214344e().mo7374a().get(i).getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return m214344e().mo7374a().get(i).getUnmovable() ? 1 : 0;
    }

    /* renamed from: a */
    public TabItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_chat_tab_order_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new TabItemViewHolder(this, inflate);
    }

    @Override // com.ss.android.lark.tab.manager.view.TabItemTouchCallback.ItemTouchAdapterImpl
    /* renamed from: a */
    public void mo188355a(int i, int i2) {
        List<ChatTabOrderData> a = m214344e().mo7374a();
        Intrinsics.checkExpressionValueIsNotNull(a, "differ.currentList");
        List<ChatTabOrderData> mutableList = CollectionsKt.toMutableList((Collection) a);
        Collections.swap(mutableList, i, i2);
        m214344e().mo7376a(mutableList);
        ITabOrderListCallback aVar = this.f136392c;
        if (aVar != null) {
            List<ChatTabOrderData> list = mutableList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().getTabId()));
            }
            aVar.mo188329a(arrayList);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(TabItemViewHolder tabItemViewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(tabItemViewHolder, "holder");
        ChatTabOrderData chatTabOrderData = m214344e().mo7374a().get(i);
        Drawable icon = chatTabOrderData.getIcon();
        if (icon != null) {
            tabItemViewHolder.mo188364a().setImageDrawable(icon);
        }
        tabItemViewHolder.mo188365b().setText(chatTabOrderData.getName());
        if (this.f136390a == 1) {
            tabItemViewHolder.mo188366c().setVisibility(8);
        } else if (!chatTabOrderData.getDeletable()) {
            tabItemViewHolder.mo188366c().setVisibility(8);
        } else {
            tabItemViewHolder.mo188366c().setVisibility(0);
        }
        tabItemViewHolder.mo188366c().getDrawable().setTint(UIHelper.getColor(R.color.icon_n3));
        tabItemViewHolder.mo188366c().setOnClickListener(new View$OnClickListenerC55277c(this, chatTabOrderData));
        tabItemViewHolder.itemView.setOnClickListener(new View$OnClickListenerC55278d(this, chatTabOrderData));
    }
}
