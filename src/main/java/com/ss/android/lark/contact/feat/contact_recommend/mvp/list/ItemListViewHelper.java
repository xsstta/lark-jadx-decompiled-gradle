package com.ss.android.lark.contact.feat.contact_recommend.mvp.list;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2048a;
import com.p078b.p079a.C2052c;
import com.ss.android.lark.contact.feat.common.C35432i;
import com.ss.android.lark.contact.feat.common.ItemCell;
import com.ss.android.lark.contact.feat.common.ItemData;
import com.ss.android.lark.contact.feat.common.ItemViewHolder;
import com.ss.android.lark.contact.feat.common.MultiItemData;
import com.ss.android.lark.contact.feat.common.SimpleItemListAdapter;
import com.ss.android.lark.contact.feat.common.SingleItemData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ItemListViewHelper;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "listAdapter", "Lcom/ss/android/lark/contact/feat/common/SimpleItemListAdapter;", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/ss/android/lark/contact/feat/common/SimpleItemListAdapter;)V", "defaultItemCount", "", "itemHeight", "rvSkeletonScreen", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "skeletonLayoutResId", "topMargin", "Lcom/ss/android/lark/contact/feat/common/TopMarginDecoration;", "hideSkeleton", "", "showMultiItems", "dataList", "", "Lcom/ss/android/lark/contact/feat/common/MultiItemData;", "showSingleItem", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/contact/feat/common/SingleItemData;", "showSkeleton", "updateItem", "itemData", "Lcom/ss/android/lark/contact/feat/common/ItemData;", "Binding", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.b.a.j */
public final class ItemListViewHelper {

    /* renamed from: g */
    public static final Companion f91539g = new Companion(null);

    /* renamed from: a */
    public C2048a f91540a;

    /* renamed from: b */
    public C35432i f91541b;

    /* renamed from: c */
    public int f91542c;

    /* renamed from: d */
    public final int f91543d;

    /* renamed from: e */
    public final int f91544e = 15;

    /* renamed from: f */
    public final RecyclerView f91545f;

    /* renamed from: h */
    private final SimpleItemListAdapter f91546h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ItemListViewHelper$Companion;", "", "()V", "TAG", "", "newBinding", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ItemListViewHelper$Binding;", "context", "Landroid/content/Context;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.a.j$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Binding mo130708a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new Binding(context);
        }
    }

    /* renamed from: b */
    public final void mo130703b() {
        C2048a aVar = this.f91540a;
        if (aVar != null) {
            aVar.mo10130b();
        }
    }

    /* renamed from: a */
    public final void mo130699a() {
        this.f91545f.post(new RunnableC35419c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.a.j$c */
    public static final class RunnableC35419c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ItemListViewHelper f91552a;

        RunnableC35419c(ItemListViewHelper jVar) {
            this.f91552a = jVar;
        }

        public final void run() {
            int i;
            int i2;
            C35432i iVar = this.f91552a.f91541b;
            if (iVar != null) {
                iVar.mo130762a(false);
            }
            C2048a aVar = this.f91552a.f91540a;
            if (aVar != null) {
                aVar.mo10129a();
                return;
            }
            if (this.f91552a.f91543d > 0) {
                i = (this.f91552a.f91545f.getHeight() / this.f91552a.f91543d) + 1;
            } else {
                i = this.f91552a.f91544e;
            }
            if (i <= 0) {
                i = this.f91552a.f91544e;
            }
            C2048a.C2050a a = C2052c.m8960a(this.f91552a.f91545f).mo10132a(this.f91552a.f91545f.getAdapter());
            if (this.f91552a.f91542c >= 0) {
                i2 = this.f91552a.f91542c;
            } else {
                i2 = R.layout.contact_item_simple_skeleton;
            }
            this.f91552a.f91540a = a.mo10139e(i2).mo10133a(true).mo10138d(20).mo10137c(R.color.a60_white).mo10131a(i).mo10135b(1000).mo10136b(true).mo10134a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0014\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018JH\u0010\u0019\u001a\u00020\u0000\"\b\b\u0000\u0010\u001a*\u00020\b\"\u000e\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001a0\n2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u001a0\u00072\u0016\u0010\u001d\u001a\u0012\u0012\u0006\b\u0001\u0012\u0002H\u001a\u0012\u0006\b\u0001\u0012\u0002H\u001b0\tJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rJ\u0010\u0010 \u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u000fRj\u0010\u0005\u001a^\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u001c\u0012\u001a\u0012\u0006\b\u0001\u0012\u00020\b\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\n0\t0\u0006j.\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u001c\u0012\u001a\u0012\u0006\b\u0001\u0012\u00020\b\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\n0\t`\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ItemListViewHelper$Binding;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cellItemMap", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/ss/android/lark/contact/feat/common/ItemData;", "Lcom/ss/android/lark/contact/feat/common/ItemCell;", "Lcom/ss/android/lark/contact/feat/common/ItemViewHolder;", "Lkotlin/collections/HashMap;", "itemListAdapter", "Lcom/ss/android/lark/contact/feat/common/SimpleItemListAdapter;", "skeletonResId", "", "topMarginDecoration", "Lcom/ss/android/lark/contact/feat/common/TopMarginDecoration;", "addTopMargin", "topMarginDp", "bgColor", "bind", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ItemListViewHelper;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "registerItemCell", "Value", "VH", "clazz", "cell", "setAdapter", "adapter", "setSkeletonLayout", "layoutResId", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.a.j$a */
    public static final class Binding {

        /* renamed from: a */
        private SimpleItemListAdapter f91547a;

        /* renamed from: b */
        private C35432i f91548b;

        /* renamed from: c */
        private HashMap<Class<? extends ItemData>, ItemCell<? extends ItemData, ? extends ItemViewHolder<? extends ItemData>>> f91549c = new HashMap<>();

        /* renamed from: d */
        private int f91550d;

        /* renamed from: e */
        private final Context f91551e;

        /* renamed from: a */
        public final Binding mo130704a(int i) {
            this.f91550d = i;
            return this;
        }

        public Binding(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f91551e = context;
        }

        /* renamed from: a */
        public final ItemListViewHelper mo130707a(RecyclerView recyclerView) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f91551e));
            SimpleItemListAdapter gVar = this.f91547a;
            if (gVar == null) {
                gVar = new SimpleItemListAdapter();
                this.f91547a = gVar;
            }
            for (Map.Entry<Class<? extends ItemData>, ItemCell<? extends ItemData, ? extends ItemViewHolder<? extends ItemData>>> entry : this.f91549c.entrySet()) {
                gVar.mo130754a(entry.getKey(), entry.getValue());
            }
            recyclerView.setAdapter(gVar);
            C35432i iVar = this.f91548b;
            if (iVar != null) {
                recyclerView.addItemDecoration(iVar);
            }
            SimpleItemListAdapter gVar2 = this.f91547a;
            if (gVar2 == null) {
                Intrinsics.throwNpe();
            }
            ItemListViewHelper jVar = new ItemListViewHelper(recyclerView, gVar2);
            jVar.f91541b = this.f91548b;
            jVar.f91542c = this.f91550d;
            return jVar;
        }

        /* renamed from: a */
        public final Binding mo130705a(int i, int i2) {
            this.f91548b = new C35432i(this.f91551e, i, i2);
            return this;
        }

        /* renamed from: a */
        public final <Value extends ItemData, VH extends ItemViewHolder<Value>> Binding mo130706a(Class<? extends Value> cls, ItemCell<? extends Value, ? extends VH> cVar) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            Intrinsics.checkParameterIsNotNull(cVar, "cell");
            this.f91549c.put(cls, cVar);
            return this;
        }
    }

    /* renamed from: a */
    public final void mo130700a(ItemData dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "itemData");
        this.f91546h.mo130760a(dVar);
    }

    /* renamed from: a */
    public final void mo130701a(SingleItemData hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C35432i iVar = this.f91541b;
        if (iVar != null) {
            iVar.mo130762a(false);
        }
        this.f91546h.mo130761a(CollectionsKt.listOf(hVar));
    }

    /* renamed from: a */
    public final void mo130702a(List<? extends MultiItemData> list) {
        Intrinsics.checkParameterIsNotNull(list, "dataList");
        C35432i iVar = this.f91541b;
        if (iVar != null) {
            iVar.mo130762a(true);
        }
        this.f91546h.mo130761a(list);
    }

    public ItemListViewHelper(RecyclerView recyclerView, SimpleItemListAdapter gVar) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(gVar, "listAdapter");
        this.f91545f = recyclerView;
        this.f91546h = gVar;
        this.f91543d = UIUtils.dp2px(recyclerView.getContext(), 68.0f);
    }
}
