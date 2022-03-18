package com.bytedance.ee.bear.wikiv2.home.viewall;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.list.cache.C8213o;
import com.bytedance.ee.bear.list.preload.ListTitleView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\"J\u0014\u0010#\u001a\u00020\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\"R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cachedRelationIds", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "enable", "", "getEnable", "()Z", "setEnable", "(Z)V", "leanmode", "Lcom/bytedance/ee/bear/contract/leanmode/LeanMode;", "spaceList", "", "Lcom/bytedance/ee/bear/list/cache/WikiSpace;", "spaceListAdapter", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView$SpaceListAdapter;", "viewDelegate", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView$ViewDelegate;", "getViewDelegate", "()Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView$ViewDelegate;", "setViewDelegate", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView$ViewDelegate;)V", "notifyDataSetChanged", "", "setCacheRelationIds", "cacheRelationSpaceIds", "", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "SpaceListAdapter", "ViewDelegate", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiSpaceListRvView extends RecyclerView {

    /* renamed from: a */
    public final List<C8213o> f33011a = new ArrayList();

    /* renamed from: b */
    public final AbstractC5197b f33012b;

    /* renamed from: c */
    public HashSet<String> f33013c;

    /* renamed from: d */
    private final SpaceListAdapter f33014d;

    /* renamed from: e */
    private boolean f33015e;

    /* renamed from: f */
    private ViewDelegate f33016f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0011¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView$SpaceListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView$SpaceListAdapter$SpaceListViewHolder;", "Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView;", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "hasCached", "", "Lcom/bytedance/ee/bear/list/cache/WikiSpace;", "SpaceListViewHolder", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListRvView$a */
    private final class SpaceListAdapter extends RecyclerView.Adapter<SpaceListViewHolder> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView$SpaceListAdapter$SpaceListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView$SpaceListAdapter;Landroid/view/View;)V", "contentView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getContentView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setContentView", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "itemExternalNotice", "Landroidx/appcompat/widget/AppCompatImageView;", "getItemExternalNotice", "()Landroidx/appcompat/widget/AppCompatImageView;", "setItemExternalNotice", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "itemIcon", "getItemIcon", "setItemIcon", "itemName", "Lcom/bytedance/ee/bear/list/preload/ListTitleView;", "getItemName", "()Lcom/bytedance/ee/bear/list/preload/ListTitleView;", "setItemName", "(Lcom/bytedance/ee/bear/list/preload/ListTitleView;)V", "listItem", "Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/SwipeMenuLayout;", "getListItem", "()Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/SwipeMenuLayout;", "setListItem", "(Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/SwipeMenuLayout;)V", "updateTime", "Landroid/widget/TextView;", "getUpdateTime", "()Landroid/widget/TextView;", "setUpdateTime", "(Landroid/widget/TextView;)V", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListRvView$a$a */
        public final class SpaceListViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            final /* synthetic */ SpaceListAdapter f33018a;

            /* renamed from: b */
            private SwipeMenuLayout f33019b;

            /* renamed from: c */
            private ConstraintLayout f33020c;

            /* renamed from: d */
            private ListTitleView f33021d;

            /* renamed from: e */
            private AppCompatImageView f33022e;

            /* renamed from: f */
            private TextView f33023f;

            /* renamed from: g */
            private AppCompatImageView f33024g;

            /* renamed from: a */
            public final SwipeMenuLayout mo46918a() {
                return this.f33019b;
            }

            /* renamed from: b */
            public final ConstraintLayout mo46919b() {
                return this.f33020c;
            }

            /* renamed from: c */
            public final ListTitleView mo46920c() {
                return this.f33021d;
            }

            /* renamed from: d */
            public final AppCompatImageView mo46921d() {
                return this.f33022e;
            }

            /* renamed from: e */
            public final TextView mo46922e() {
                return this.f33023f;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SpaceListViewHolder(SpaceListAdapter aVar, View view) {
                super(view);
                Intrinsics.checkParameterIsNotNull(view, "itemView");
                this.f33018a = aVar;
                View findViewById = view.findViewById(R.id.list_item);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.list_item)");
                this.f33019b = (SwipeMenuLayout) findViewById;
                View findViewById2 = view.findViewById(R.id.item_content);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.item_content)");
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById2;
                this.f33020c = constraintLayout;
                View findViewById3 = constraintLayout.findViewById(R.id.item_name);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "contentView.findViewById(R.id.item_name)");
                this.f33021d = (ListTitleView) findViewById3;
                View findViewById4 = this.f33020c.findViewById(R.id.item_icon);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "contentView.findViewById(R.id.item_icon)");
                this.f33022e = (AppCompatImageView) findViewById4;
                View findViewById5 = this.f33020c.findViewById(R.id.update_time);
                Intrinsics.checkExpressionValueIsNotNull(findViewById5, "contentView.findViewById(R.id.update_time)");
                this.f33023f = (TextView) findViewById5;
                View findViewById6 = this.f33020c.findViewById(R.id.item_external_notice);
                Intrinsics.checkExpressionValueIsNotNull(findViewById6, "contentView.findViewById….id.item_external_notice)");
                this.f33024g = (AppCompatImageView) findViewById6;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return WikiSpaceListRvView.this.f33011a.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SpaceListAdapter() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListRvView$a$b */
        public static final class View$OnClickListenerC12297b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SpaceListAdapter f33025a;

            /* renamed from: b */
            final /* synthetic */ C8213o f33026b;

            /* renamed from: c */
            final /* synthetic */ int f33027c;

            View$OnClickListenerC12297b(SpaceListAdapter aVar, C8213o oVar, int i) {
                this.f33025a = aVar;
                this.f33026b = oVar;
                this.f33027c = i;
            }

            public final void onClick(View view) {
                ViewDelegate viewDelegate = WikiSpaceListRvView.this.getViewDelegate();
                if (viewDelegate != null) {
                    viewDelegate.mo46924a(this.f33026b, this.f33027c);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo46917a(C8213o oVar) {
            Intrinsics.checkParameterIsNotNull(oVar, "$this$hasCached");
            return WikiSpaceListRvView.this.f33013c.contains(oVar.mo32176a());
        }

        /* renamed from: a */
        public SpaceListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_doc_recycler_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…cler_item, parent, false)");
            return new SpaceListViewHolder(this, inflate);
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0064  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListRvView.SpaceListAdapter.SpaceListViewHolder r7, int r8) {
            /*
            // Method dump skipped, instructions count: 191
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListRvView.SpaceListAdapter.onBindViewHolder(com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListRvView$a$a, int):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListRvView$ViewDelegate;", "", "onSpaceItemClick", "", "space", "Lcom/bytedance/ee/bear/list/cache/WikiSpace;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListRvView$b */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo46924a(C8213o oVar, int i);
    }

    public final boolean getEnable() {
        return this.f33015e;
    }

    public final ViewDelegate getViewDelegate() {
        return this.f33016f;
    }

    /* renamed from: a */
    public final void mo46908a() {
        this.f33014d.notifyDataSetChanged();
    }

    public final void setEnable(boolean z) {
        this.f33015e = z;
    }

    public final void setViewDelegate(ViewDelegate bVar) {
        this.f33016f = bVar;
    }

    public final void setCacheRelationIds(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "cacheRelationSpaceIds");
        this.f33013c.clear();
        this.f33013c.addAll(list);
    }

    public final void setData(List<? extends C8213o> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f33011a.clear();
        this.f33011a.addAll(list);
        this.f33014d.notifyDataSetChanged();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiSpaceListRvView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        SpaceListAdapter aVar = new SpaceListAdapter();
        this.f33014d = aVar;
        this.f33012b = (AbstractC5197b) KoinJavaComponent.m268613a(AbstractC5197b.class, null, null, 6, null);
        this.f33013c = new HashSet<>();
        this.f33015e = true;
        setLayoutManager(new LinearLayoutManager(getContext()));
        setAdapter(aVar);
    }
}
