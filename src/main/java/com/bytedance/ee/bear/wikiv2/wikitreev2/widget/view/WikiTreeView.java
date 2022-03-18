package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1363f;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7732b;
import com.bytedance.ee.bear.wikiv2.common.widget.InterceptableRecyclerView;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.WikNodeType;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12478g;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiUIList;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.AbstractC12562a;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemDirView;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.oubowu.stickyitemdecoration.AbstractC26971a;
import com.oubowu.stickyitemdecoration.C26972b;
import com.oubowu.stickyitemdecoration.StickyHeadContainer;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 P2\u00020\u0001:\u0003PQRB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u000207J\u0010\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020\u001eJ\b\u0010;\u001a\u000205H\u0002J\u000e\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\bJ\u000e\u0010>\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\bJ\u0012\u0010?\u001a\u00020\u000e2\b\u0010@\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010A\u001a\u000205H\u0014J\u0006\u0010B\u001a\u000205J\u000e\u0010C\u001a\u0002052\u0006\u0010@\u001a\u00020\bJ\u000e\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020/J\u000e\u0010F\u001a\u0002052\u0006\u0010=\u001a\u00020\bJ\u0018\u0010G\u001a\u0002052\b\u0010@\u001a\u0004\u0018\u00010\b2\u0006\u0010H\u001a\u00020\u000eJ\u001e\u0010I\u001a\u0002052\u0006\u0010@\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u000eJ\u0016\u0010L\u001a\u0002052\u0006\u0010@\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u000eJ\u001a\u0010N\u001a\u0002052\b\u0010=\u001a\u0004\u0018\u00010\b2\b\u0010O\u001a\u0004\u0018\u00010\bR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R$\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010,\u001a\u00060-R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006S"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "disableToken", "", "getDisableToken", "()Ljava/lang/String;", "setDisableToken", "(Ljava/lang/String;)V", "enableMenuClick", "", "getEnableMenuClick", "()Z", "setEnableMenuClick", "(Z)V", "enableRootClick", "getEnableRootClick", "setEnableRootClick", "enableSwipeMenu", "getEnableSwipeMenu", "setEnableSwipeMenu", "value", "focusToken", "getFocusToken", "setFocusToken", "indicatorPadding", "", "getIndicatorPadding", "()I", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "listener", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView$IListener;", "getListener", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView$IListener;", "setListener", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView$IListener;)V", "oldFocus", "scrollToRunnable", "Ljava/lang/Runnable;", "wikiAdapter", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView$WikiAdapter;", "wikiUIList", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;", "getWikiUIList", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;", "setWikiUIList", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;)V", "addHeader", "", "view", "Landroid/view/View;", "getViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "initView", "isFocus", "wikiToken", "isItemEnable", "isValidUid", "uid", "onDetachedFromWindow", "removeHeader", "scrollItemToCenter", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setItemFocus", "setItemLoading", "isLoading", "setMenuEnable", "menuId", "enable", "setSwipeMenuOpen", "isOpen", "updateTitle", "newTitle", "Companion", "IListener", "WikiAdapter", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiTreeView extends FrameLayout {

    /* renamed from: b */
    public static final Companion f33609b = new Companion(null);

    /* renamed from: a */
    public final WikiAdapter f33610a = new WikiAdapter();

    /* renamed from: c */
    private final LinearLayoutManager f33611c = new LinearLayoutManager(getContext());

    /* renamed from: d */
    private WikiUIList f33612d = WikiUIList.f33506b.mo47600a();

    /* renamed from: e */
    private IListener f33613e;

    /* renamed from: f */
    private String f33614f = "";

    /* renamed from: g */
    private boolean f33615g;

    /* renamed from: h */
    private boolean f33616h = true;

    /* renamed from: i */
    private boolean f33617i;

    /* renamed from: j */
    private final int f33618j;

    /* renamed from: k */
    private String f33619k;

    /* renamed from: l */
    private String f33620l;

    /* renamed from: m */
    private Runnable f33621m;

    /* renamed from: n */
    private HashMap f33622n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H&¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView$IListener;", "", "onExpandChange", "", "node", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/UITreeNode;", "isExpand", "", "onFocusChanged", "newFocus", "", "onItemClick", "onMenuItemClick", "menuId", "", "onSwipeChanged", "isSwipe", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$b */
    public interface IListener {
        /* renamed from: a */
        void mo47742a(C12478g gVar);

        /* renamed from: a */
        void mo47743a(C12478g gVar, int i);

        /* renamed from: a */
        void mo47744a(C12478g gVar, boolean z);

        /* renamed from: a */
        void mo47745a(String str);

        /* renamed from: b */
        void mo47746b(C12478g gVar, boolean z);
    }

    /* renamed from: b */
    public View mo47764b(int i) {
        if (this.f33622n == null) {
            this.f33622n = new HashMap();
        }
        View view = (View) this.f33622n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f33622n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getDisableToken() {
        return this.f33614f;
    }

    public final boolean getEnableMenuClick() {
        return this.f33616h;
    }

    public final boolean getEnableRootClick() {
        return this.f33617i;
    }

    public final boolean getEnableSwipeMenu() {
        return this.f33615g;
    }

    public final String getFocusToken() {
        return this.f33619k;
    }

    public final int getIndicatorPadding() {
        return this.f33618j;
    }

    public final IListener getListener() {
        return this.f33613e;
    }

    public final WikiUIList getWikiUIList() {
        return this.f33612d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView$scrollItemToCenter$1", "Ljava/lang/Runnable;", "run", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$f */
    public static final class RunnableC12561f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WikiTreeView f33639a;

        /* renamed from: b */
        final /* synthetic */ String f33640b;

        public void run() {
            this.f33639a.mo47761a(this.f33640b);
        }

        RunnableC12561f(WikiTreeView wikiTreeView, String str) {
            this.f33639a = wikiTreeView;
            this.f33640b = str;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f33621m;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView$initView$2", "Lcom/oubowu/stickyitemdecoration/OnStickyChangeListener;", "onInVisible", "", "onScrollable", "offset", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$e */
    public static final class C12560e implements AbstractC26971a {

        /* renamed from: a */
        final /* synthetic */ WikiTreeView f33638a;

        @Override // com.oubowu.stickyitemdecoration.AbstractC26971a
        /* renamed from: a */
        public void mo44891a() {
            ((StickyHeadContainer) this.f33638a.mo47764b(R.id.sticky_head_container)).mo95873a();
            StickyHeadContainer stickyHeadContainer = (StickyHeadContainer) this.f33638a.mo47764b(R.id.sticky_head_container);
            Intrinsics.checkExpressionValueIsNotNull(stickyHeadContainer, "sticky_head_container");
            stickyHeadContainer.setVisibility(4);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12560e(WikiTreeView wikiTreeView) {
            this.f33638a = wikiTreeView;
        }

        @Override // com.oubowu.stickyitemdecoration.AbstractC26971a
        /* renamed from: a */
        public void mo44892a(int i) {
            ((StickyHeadContainer) this.f33638a.mo47764b(R.id.sticky_head_container)).mo95874a(i);
            StickyHeadContainer stickyHeadContainer = (StickyHeadContainer) this.f33638a.mo47764b(R.id.sticky_head_container);
            Intrinsics.checkExpressionValueIsNotNull(stickyHeadContainer, "sticky_head_container");
            stickyHeadContainer.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo47759a() {
        C13479a.m54764b("Wiki_WikiTreeRvView", "removeHeader. ");
        this.f33610a.mo70702p();
        this.f33610a.notifyDataSetChanged();
    }

    /* renamed from: b */
    private final void m52142b() {
        ((StickyHeadContainer) mo47764b(R.id.sticky_head_container)).setDataCallback(new C12559d(this));
        C26972b bVar = new C26972b((StickyHeadContainer) mo47764b(R.id.sticky_head_container), WikNodeType.ROOT.getValue());
        bVar.mo95886a(new C12560e(this));
        ((InterceptableRecyclerView) mo47764b(R.id.recycler_view)).addItemDecoration(bVar);
        InterceptableRecyclerView interceptableRecyclerView = (InterceptableRecyclerView) mo47764b(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(interceptableRecyclerView, "recycler_view");
        interceptableRecyclerView.setItemAnimator(new C1363f());
        InterceptableRecyclerView interceptableRecyclerView2 = (InterceptableRecyclerView) mo47764b(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(interceptableRecyclerView2, "recycler_view");
        interceptableRecyclerView2.setLayoutManager(this.f33611c);
        InterceptableRecyclerView interceptableRecyclerView3 = (InterceptableRecyclerView) mo47764b(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(interceptableRecyclerView3, "recycler_view");
        interceptableRecyclerView3.setAdapter(this.f33610a);
        C7732b.m30927a((InterceptableRecyclerView) mo47764b(R.id.recycler_view), "bear_wiki_tree_view");
    }

    public final void setEnableMenuClick(boolean z) {
        this.f33616h = z;
    }

    public final void setEnableRootClick(boolean z) {
        this.f33617i = z;
    }

    public final void setEnableSwipeMenu(boolean z) {
        this.f33615g = z;
    }

    public final void setListener(IListener bVar) {
        this.f33613e = bVar;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J\u0015\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0014J.\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0014J\u0014\u0010 \u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView$WikiAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/UITreeNode;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView;)V", "bindItemView", "", "view", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikItemLeafView;", "node", "bindNoneView", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikItemNoneView;", "bindRootView", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikItemRootView;", "convert", "holder", "getDefItemViewType", "", "position", "getItemHeight", "getItemHeight$wiki_implv2_release", "notifyDiffDataSetChange", "olds", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;", "news", "oldFocus", "", "newFocus", "onCreateDefViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDefNewData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$c */
    public final class WikiAdapter extends BaseQuickAdapter<C12478g, C20923c> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public WikiAdapter() {
            super(0);
        }

        /* renamed from: b */
        public final int mo33373b(int i) {
            return C13655e.m55410a(50.0f);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isExpand", "", "onExpandClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$c$d */
        public static final class C12556d implements WikItemDirView.AbstractC12512a {

            /* renamed from: a */
            final /* synthetic */ WikiAdapter f33630a;

            /* renamed from: b */
            final /* synthetic */ C12478g f33631b;

            C12556d(WikiAdapter cVar, C12478g gVar) {
                this.f33630a = cVar;
                this.f33631b = gVar;
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemDirView.AbstractC12512a
            /* renamed from: a */
            public final void mo47664a(boolean z) {
                IListener listener = WikiTreeView.this.getListener();
                if (listener != null) {
                    listener.mo47744a(this.f33631b, z);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isExpand", "", "onExpandClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$c$e */
        public static final class C12557e implements WikItemDirView.AbstractC12512a {

            /* renamed from: a */
            final /* synthetic */ WikiAdapter f33632a;

            /* renamed from: b */
            final /* synthetic */ C12478g f33633b;

            C12557e(WikiAdapter cVar, C12478g gVar) {
                this.f33632a = cVar;
                this.f33633b = gVar;
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemDirView.AbstractC12512a
            /* renamed from: a */
            public final void mo47664a(boolean z) {
                IListener listener = WikiTreeView.this.getListener();
                if (listener != null) {
                    listener.mo47744a(this.f33633b, z);
                }
            }
        }

        /* renamed from: a */
        public final void mo47789a(List<C12478g> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f51214t = list;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onItemClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$c$a */
        public static final class C12553a implements WikItemLeafView.AbstractC12517a {

            /* renamed from: a */
            final /* synthetic */ WikiAdapter f33624a;

            /* renamed from: b */
            final /* synthetic */ C12478g f33625b;

            C12553a(WikiAdapter cVar, C12478g gVar) {
                this.f33624a = cVar;
                this.f33625b = gVar;
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView.AbstractC12517a
            public final void onItemClick(View view) {
                WikiTreeView wikiTreeView = WikiTreeView.this;
                String str = this.f33625b.f33440b;
                Intrinsics.checkExpressionValueIsNotNull(str, "node.wiki_token");
                wikiTreeView.setItemFocus(str);
                IListener listener = WikiTreeView.this.getListener();
                if (listener != null) {
                    listener.mo47742a(this.f33625b);
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* renamed from: a */
        public int mo32796a(int i) {
            return WikiTreeView.this.getWikiUIList().mo47593a().get(i).f33453o;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onItemClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$c$f */
        public static final class C12558f implements WikItemLeafView.AbstractC12517a {

            /* renamed from: a */
            final /* synthetic */ WikiAdapter f33634a;

            /* renamed from: b */
            final /* synthetic */ C12478g f33635b;

            /* renamed from: c */
            final /* synthetic */ WikItemRootView f33636c;

            C12558f(WikiAdapter cVar, C12478g gVar, WikItemRootView wikItemRootView) {
                this.f33634a = cVar;
                this.f33635b = gVar;
                this.f33636c = wikItemRootView;
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView.AbstractC12517a
            public final void onItemClick(View view) {
                if (WikiTreeView.this.getEnableRootClick()) {
                    WikiTreeView wikiTreeView = WikiTreeView.this;
                    String str = this.f33635b.f33440b;
                    Intrinsics.checkExpressionValueIsNotNull(str, "node.wiki_token");
                    wikiTreeView.setItemFocus(str);
                    IListener listener = WikiTreeView.this.getListener();
                    if (listener != null) {
                        listener.mo47742a(this.f33635b);
                        return;
                    }
                    return;
                }
                IListener listener2 = WikiTreeView.this.getListener();
                if (listener2 != null) {
                    listener2.mo47744a(this.f33635b, !this.f33636c.mo47656d());
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "menuId", "", "menuItem", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$c$b */
        public static final class C12554b implements AbstractC12562a.AbstractC12563a {

            /* renamed from: a */
            final /* synthetic */ WikiAdapter f33626a;

            /* renamed from: b */
            final /* synthetic */ C12478g f33627b;

            C12554b(WikiAdapter cVar, C12478g gVar) {
                this.f33626a = cVar;
                this.f33627b = gVar;
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.AbstractC12562a.AbstractC12563a
            /* renamed from: a */
            public final void mo47790a(int i, View view) {
                IListener listener = WikiTreeView.this.getListener();
                if (listener != null) {
                    listener.mo47743a(this.f33627b, i);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "isOpen", "", "onUserSwipeMenu"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$c$c */
        public static final class C12555c implements AbstractC12562a.AbstractC12564b {

            /* renamed from: a */
            final /* synthetic */ WikiAdapter f33628a;

            /* renamed from: b */
            final /* synthetic */ C12478g f33629b;

            C12555c(WikiAdapter cVar, C12478g gVar) {
                this.f33628a = cVar;
                this.f33629b = gVar;
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.AbstractC12562a.AbstractC12564b
            /* renamed from: a */
            public final void mo47791a(View view, boolean z) {
                IListener listener = WikiTreeView.this.getListener();
                if (listener != null) {
                    listener.mo47746b(this.f33629b, z);
                }
            }
        }

        /* renamed from: a */
        private final void m52160a(WikItemNoneView wikItemNoneView, C12478g gVar) {
            wikItemNoneView.setTile(TreeKt.m52180a(gVar.mo47513c()));
            wikItemNoneView.mo47668a(gVar.f33451m, WikiTreeView.this.getWikiUIList().mo47595b());
        }

        /* access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* renamed from: a */
        public C20923c mo32344a(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            if (i == WikNodeType.ROOT.getValue()) {
                return new C20923c(new WikItemRootView(WikiTreeView.this.getContext()));
            }
            if (i == WikNodeType.NONE.getValue()) {
                return new C20923c(new WikItemNoneView(WikiTreeView.this.getContext()));
            }
            if (i == WikNodeType.DIR.getValue()) {
                return new C20923c(new WikItemDirView(WikiTreeView.this.getContext()));
            }
            return new C20923c(new WikItemLeafView(WikiTreeView.this.getContext()));
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m52159a(com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView r7, com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12478g r8) {
            /*
            // Method dump skipped, instructions count: 233
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView.WikiAdapter.m52159a(com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView, com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.g):void");
        }

        /* renamed from: a */
        public final void mo47787a(WikItemRootView wikItemRootView, C12478g gVar) {
            Intrinsics.checkParameterIsNotNull(wikItemRootView, "view");
            Intrinsics.checkParameterIsNotNull(gVar, "node");
            wikItemRootView.setIconPadding(WikiTreeView.this.getIndicatorPadding());
            wikItemRootView.setSwipeMenuEnable(false);
            wikItemRootView.setTile(TreeKt.m52182b(gVar.mo47513c()));
            wikItemRootView.setTitleStyle(Typeface.DEFAULT_BOLD);
            boolean c = gVar.mo47513c();
            WikiTreeView wikiTreeView = WikiTreeView.this;
            String str = gVar.f33440b;
            Intrinsics.checkExpressionValueIsNotNull(str, "node.wiki_token");
            Pair<Integer, Integer> a = TreeKt.m52181a(c, wikiTreeView.mo47767c(str));
            wikItemRootView.mo47671b(a.getFirst().intValue(), a.getSecond().intValue());
            wikItemRootView.setExpand(gVar.f33452n);
            if (WikiTreeView.this.getEnableRootClick()) {
                wikItemRootView.setFocus(TextUtils.equals(gVar.f33440b, WikiTreeView.this.getFocusToken()));
            }
            wikItemRootView.setExpandClickListener(new C12557e(this, gVar));
            wikItemRootView.setItemClickListener(new C12558f(this, gVar, wikItemRootView));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16806a(C20923c cVar, C12478g gVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "holder");
            Intrinsics.checkParameterIsNotNull(gVar, "node");
            View view = cVar.itemView;
            if (view != null) {
                WikItemLeafView wikItemLeafView = (WikItemLeafView) view;
                wikItemLeafView.mo47657e();
                int itemViewType = cVar.getItemViewType();
                if (itemViewType == WikNodeType.ROOT.getValue()) {
                    if (wikItemLeafView != null) {
                        mo47787a((WikItemRootView) wikItemLeafView, gVar);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemRootView");
                } else if (itemViewType != WikNodeType.NONE.getValue()) {
                    m52159a(wikItemLeafView, gVar);
                } else if (wikItemLeafView != null) {
                    m52160a((WikItemNoneView) wikItemLeafView, gVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemNoneView");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView");
            }
        }

        /* renamed from: a */
        public final void mo47786a(WikiUIList kVar, WikiUIList kVar2, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(kVar, "olds");
            Intrinsics.checkParameterIsNotNull(kVar2, "news");
            C1374g.C1377b a = C1374g.m6297a(new WikiDiffCallback(kVar, kVar2, str, str2));
            Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(W…ews, oldFocus, newFocus))");
            a.mo7413a(new WikiListUpdateCallback(this));
        }
    }

    public final void setDisableToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33614f = str;
    }

    public final void setWikiUIList(WikiUIList kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "<set-?>");
        this.f33612d = kVar;
    }

    /* renamed from: d */
    private final boolean m52143d(String str) {
        if (!TextUtils.isEmpty(str)) {
            WikiUIList kVar = this.f33612d;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            if (kVar.mo47596b(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo47766b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        if (TextUtils.isEmpty(this.f33614f) || !TextUtils.equals(this.f33614f, str)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo47767c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        if (TextUtils.isEmpty(this.f33619k) || !TextUtils.equals(this.f33619k, str)) {
            return false;
        }
        return true;
    }

    public final void setFocusToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.f33620l = this.f33619k;
        this.f33619k = str;
        IListener bVar = this.f33613e;
        if (bVar != null) {
            bVar.mo47745a(str);
        }
    }

    public final void setItemFocus(String str) {
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        if (this.f33612d.mo47598d(str)) {
            setFocusToken(str);
            this.f33610a.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pos", "", "onDataChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView$d */
    public static final class C12559d implements StickyHeadContainer.AbstractC26970a {

        /* renamed from: a */
        final /* synthetic */ WikiTreeView f33637a;

        C12559d(WikiTreeView wikiTreeView) {
            this.f33637a = wikiTreeView;
        }

        @Override // com.oubowu.stickyitemdecoration.StickyHeadContainer.AbstractC26970a
        public final void onDataChange(int i) {
            WikiAdapter cVar = this.f33637a.f33610a;
            WikItemRootView wikItemRootView = (WikItemRootView) this.f33637a.mo47764b(R.id.sticky_head);
            Intrinsics.checkExpressionValueIsNotNull(wikItemRootView, "sticky_head");
            cVar.mo47787a(wikItemRootView, this.f33637a.getWikiUIList().mo47593a().get(i));
        }
    }

    /* renamed from: a */
    public final RecyclerView.ViewHolder mo47758a(int i) {
        int i2;
        View childAt;
        if (i < 0) {
            return null;
        }
        int c = i + this.f33610a.mo70678c();
        int findFirstVisibleItemPosition = this.f33611c.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1 || (i2 = c - findFirstVisibleItemPosition) < 0 || (childAt = ((InterceptableRecyclerView) mo47764b(R.id.recycler_view)).getChildAt(i2)) == null) {
            return null;
        }
        return ((InterceptableRecyclerView) mo47764b(R.id.recycler_view)).getChildViewHolder(childAt);
    }

    public final void setData(WikiUIList kVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(kVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        WikiUIList kVar2 = this.f33612d;
        this.f33612d = kVar;
        this.f33610a.mo47789a(kVar.mo47593a());
        if (this.f33612d.mo47595b() >= 8 || kVar2.mo47595b() >= 8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f33610a.notifyDataSetChanged();
        } else {
            this.f33610a.mo47786a(kVar2, this.f33612d, this.f33620l, this.f33619k);
        }
    }

    /* renamed from: a */
    public final void mo47760a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        C13479a.m54764b("Wiki_WikiTreeRvView", "addHeader. ");
        this.f33610a.mo70661a(view);
        this.f33610a.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo47761a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        if (m52143d(str)) {
            int c = this.f33612d.mo47597c(str) + this.f33610a.mo70678c();
            int height = getHeight();
            if (height > 0) {
                this.f33611c.scrollToPositionWithOffset(c, (height / 2) - (this.f33610a.mo33373b(c) / 2));
                return;
            }
            C13479a.m54764b("Wiki_WikiTreeRvView", "WikiTreeRvView.scrollToCenter(), total height is 0, post delay");
            Runnable runnable = this.f33621m;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            RunnableC12561f fVar = new RunnableC12561f(this, str);
            this.f33621m = fVar;
            post(fVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiTreeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f33618j = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_3);
        this.f33619k = "";
        this.f33620l = "";
        LayoutInflater.from(context).inflate(R.layout.wiki_tree_view, this);
        m52142b();
    }

    /* renamed from: b */
    public final void mo47765b(String str, boolean z) {
        RecyclerView.ViewHolder a;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        if (m52143d(str) && (a = mo47758a(this.f33612d.mo47597c(str))) != null && (a.itemView instanceof AbstractC12562a)) {
            View view = a.itemView;
            if (view != null) {
                AbstractC12562a aVar = (AbstractC12562a) view;
                if (z) {
                    aVar.mo47667a();
                } else {
                    aVar.mo47670b();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.ISwipeMenuItem");
            }
        }
    }

    /* renamed from: a */
    public final void mo47762a(String str, String str2) {
        if (str != null && this.f33612d.mo47598d(str)) {
            this.f33612d.mo47594a(str, str2);
            this.f33610a.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo47763a(String str, boolean z) {
        if (m52143d(str)) {
            WikiUIList kVar = this.f33612d;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            RecyclerView.ViewHolder a = mo47758a(kVar.mo47597c(str));
            if (a != null && (a.itemView instanceof WikItemDirView)) {
                View view = a.itemView;
                if (view != null) {
                    ((WikItemDirView) view).setLoading(z);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemDirView");
            }
        }
    }
}
