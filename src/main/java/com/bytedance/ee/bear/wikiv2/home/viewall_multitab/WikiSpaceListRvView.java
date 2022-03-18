package com.bytedance.ee.bear.wikiv2.home.viewall_multitab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.list.preload.ListTitleView;
import com.bytedance.ee.bear.wikiv2.home.api.SpaceBean;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\"J\u0014\u0010#\u001a\u00020\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\"R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cachedRelationIds", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "enable", "", "getEnable", "()Z", "setEnable", "(Z)V", "leanmode", "Lcom/bytedance/ee/bear/contract/leanmode/LeanMode;", "spaceList", "", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "spaceListAdapter", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$SpaceListAdapter;", "viewDelegate", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$ViewDelegate;", "getViewDelegate", "()Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$ViewDelegate;", "setViewDelegate", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$ViewDelegate;)V", "notifyDataSetChanged", "", "setCacheRelationIds", "cacheRelationSpaceIds", "", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "SpaceListAdapter", "ViewDelegate", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiSpaceListRvView extends RecyclerView {

    /* renamed from: a */
    public final List<SpaceBean> f33045a = new ArrayList();

    /* renamed from: b */
    public final AbstractC5197b f33046b;

    /* renamed from: c */
    public HashSet<String> f33047c;

    /* renamed from: d */
    private final SpaceListAdapter f33048d;

    /* renamed from: e */
    private boolean f33049e;

    /* renamed from: f */
    private ViewDelegate f33050f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ \u0010\r\u001a\u00020\b2\u000e\u0010\u000e\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J \u0010\u0010\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\n\u0010\u0014\u001a\u00020\u0015*\u00020\u000b¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$SpaceListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$SpaceListAdapter$SpaceListViewHolder;", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView;", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView;)V", "getItemCount", "", "notifyDiffDataSetChange", "", "olds", "", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "news", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "hasCached", "", "DiffCallback", "SpaceListViewHolder", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListRvView$a */
    private final class SpaceListAdapter extends RecyclerView.Adapter<SpaceListViewHolder> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$SpaceListAdapter$SpaceListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$SpaceListAdapter;Landroid/view/View;)V", "contentView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getContentView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setContentView", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "itemExternalNotice", "Landroidx/appcompat/widget/AppCompatImageView;", "getItemExternalNotice", "()Landroidx/appcompat/widget/AppCompatImageView;", "setItemExternalNotice", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "itemIcon", "getItemIcon", "setItemIcon", "itemName", "Lcom/bytedance/ee/bear/list/preload/ListTitleView;", "getItemName", "()Lcom/bytedance/ee/bear/list/preload/ListTitleView;", "setItemName", "(Lcom/bytedance/ee/bear/list/preload/ListTitleView;)V", "listItem", "Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/SwipeMenuLayout;", "getListItem", "()Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/SwipeMenuLayout;", "setListItem", "(Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/SwipeMenuLayout;)V", "updateTime", "Landroid/widget/TextView;", "getUpdateTime", "()Landroid/widget/TextView;", "setUpdateTime", "(Landroid/widget/TextView;)V", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListRvView$a$b */
        public final class SpaceListViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            final /* synthetic */ SpaceListAdapter f33055a;

            /* renamed from: b */
            private SwipeMenuLayout f33056b;

            /* renamed from: c */
            private ConstraintLayout f33057c;

            /* renamed from: d */
            private ListTitleView f33058d;

            /* renamed from: e */
            private AppCompatImageView f33059e;

            /* renamed from: f */
            private TextView f33060f;

            /* renamed from: g */
            private AppCompatImageView f33061g;

            /* renamed from: a */
            public final SwipeMenuLayout mo46959a() {
                return this.f33056b;
            }

            /* renamed from: b */
            public final ConstraintLayout mo46960b() {
                return this.f33057c;
            }

            /* renamed from: c */
            public final ListTitleView mo46961c() {
                return this.f33058d;
            }

            /* renamed from: d */
            public final AppCompatImageView mo46962d() {
                return this.f33059e;
            }

            /* renamed from: e */
            public final TextView mo46963e() {
                return this.f33060f;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SpaceListViewHolder(SpaceListAdapter aVar, View view) {
                super(view);
                Intrinsics.checkParameterIsNotNull(view, "itemView");
                this.f33055a = aVar;
                View findViewById = view.findViewById(R.id.list_item);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.list_item)");
                this.f33056b = (SwipeMenuLayout) findViewById;
                View findViewById2 = view.findViewById(R.id.item_content);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.item_content)");
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById2;
                this.f33057c = constraintLayout;
                View findViewById3 = constraintLayout.findViewById(R.id.item_name);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "contentView.findViewById(R.id.item_name)");
                this.f33058d = (ListTitleView) findViewById3;
                View findViewById4 = this.f33057c.findViewById(R.id.item_icon);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "contentView.findViewById(R.id.item_icon)");
                this.f33059e = (AppCompatImageView) findViewById4;
                View findViewById5 = this.f33057c.findViewById(R.id.update_time);
                Intrinsics.checkExpressionValueIsNotNull(findViewById5, "contentView.findViewById(R.id.update_time)");
                this.f33060f = (TextView) findViewById5;
                View findViewById6 = this.f33057c.findViewById(R.id.item_external_notice);
                Intrinsics.checkExpressionValueIsNotNull(findViewById6, "contentView.findViewById….id.item_external_notice)");
                this.f33061g = (AppCompatImageView) findViewById6;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$SpaceListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "olds", "", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "news", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$SpaceListAdapter;Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListRvView$a$a */
        public final class DiffCallback extends C1374g.AbstractC1376a {

            /* renamed from: a */
            final /* synthetic */ SpaceListAdapter f33052a;

            /* renamed from: b */
            private final List<SpaceBean> f33053b;

            /* renamed from: c */
            private final List<SpaceBean> f33054c;

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
            /* renamed from: b */
            public boolean mo7383b(int i, int i2) {
                return true;
            }

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
            /* renamed from: a */
            public int mo7380a() {
                return this.f33053b.size();
            }

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
            /* renamed from: b */
            public int mo7382b() {
                return this.f33054c.size();
            }

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
            /* renamed from: a */
            public boolean mo7381a(int i, int i2) {
                return Intrinsics.areEqual(this.f33053b.get(i).space_id, this.f33054c.get(i2).space_id);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.ee.bear.wikiv2.home.api.SpaceBean> */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.bytedance.ee.bear.wikiv2.home.api.SpaceBean> */
            /* JADX WARN: Multi-variable type inference failed */
            public DiffCallback(SpaceListAdapter aVar, List<? extends SpaceBean> list, List<? extends SpaceBean> list2) {
                Intrinsics.checkParameterIsNotNull(list, "olds");
                Intrinsics.checkParameterIsNotNull(list2, "news");
                this.f33052a = aVar;
                this.f33053b = list;
                this.f33054c = list2;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return WikiSpaceListRvView.this.f33045a.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SpaceListAdapter() {
        }

        /* renamed from: a */
        public final boolean mo46958a(SpaceBean spaceBean) {
            Intrinsics.checkParameterIsNotNull(spaceBean, "$this$hasCached");
            return WikiSpaceListRvView.this.f33047c.contains(spaceBean.space_id);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListRvView$a$c */
        public static final class View$OnClickListenerC12309c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SpaceListAdapter f33062a;

            /* renamed from: b */
            final /* synthetic */ SpaceBean f33063b;

            /* renamed from: c */
            final /* synthetic */ int f33064c;

            View$OnClickListenerC12309c(SpaceListAdapter aVar, SpaceBean spaceBean, int i) {
                this.f33062a = aVar;
                this.f33063b = spaceBean;
                this.f33064c = i;
            }

            public final void onClick(View view) {
                ViewDelegate viewDelegate = WikiSpaceListRvView.this.getViewDelegate();
                if (viewDelegate != null) {
                    viewDelegate.mo46965a(this.f33063b, this.f33064c);
                }
            }
        }

        /* renamed from: a */
        public SpaceListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_doc_recycler_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…cler_item, parent, false)");
            return new SpaceListViewHolder(this, inflate);
        }

        /* renamed from: a */
        public final void mo46957a(List<? extends SpaceBean> list, List<? extends SpaceBean> list2) {
            Intrinsics.checkParameterIsNotNull(list, "olds");
            Intrinsics.checkParameterIsNotNull(list2, "news");
            C1374g.m6297a(new DiffCallback(this, list, list2)).mo7412a(this);
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x005c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListRvView.SpaceListAdapter.SpaceListViewHolder r7, int r8) {
            /*
            // Method dump skipped, instructions count: 183
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListRvView.SpaceListAdapter.onBindViewHolder(com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListRvView$a$b, int):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceListRvView$ViewDelegate;", "", "onSpaceItemClick", "", "space", "Lcom/bytedance/ee/bear/wikiv2/home/api/SpaceBean;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceListRvView$b */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo46965a(SpaceBean spaceBean, int i);
    }

    public final boolean getEnable() {
        return this.f33049e;
    }

    public final ViewDelegate getViewDelegate() {
        return this.f33050f;
    }

    /* renamed from: a */
    public final void mo46948a() {
        this.f33048d.notifyDataSetChanged();
    }

    public final void setEnable(boolean z) {
        this.f33049e = z;
    }

    public final void setViewDelegate(ViewDelegate bVar) {
        this.f33050f = bVar;
    }

    public final void setCacheRelationIds(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "cacheRelationSpaceIds");
        this.f33047c.clear();
        this.f33047c.addAll(list);
    }

    public final void setData(List<? extends SpaceBean> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f33048d.mo46957a(this.f33045a, list);
        this.f33045a.clear();
        this.f33045a.addAll(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiSpaceListRvView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        SpaceListAdapter aVar = new SpaceListAdapter();
        this.f33048d = aVar;
        this.f33046b = (AbstractC5197b) KoinJavaComponent.m268613a(AbstractC5197b.class, null, null, 6, null);
        this.f33047c = new HashSet<>();
        this.f33049e = true;
        setLayoutManager(new LinearLayoutManager(getContext()));
        setAdapter(aVar);
    }
}
