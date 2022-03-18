package com.bytedance.ee.bear.middleground.comment.card;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2;
import com.bytedance.ee.bear.middleground.comment.control.ICommentFunction;
import com.bytedance.ee.bear.middleground.comment.control.ICommentListeners;
import com.bytedance.ee.bear.middleground.comment.export.ICommentPermission;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.middleground.comment.widget.NoTopFadingEdgeRecyclerView;
import com.bytedance.ee.bear.widgets.viewpager.AbstractC11870c;
import com.bytedance.ee.bear.widgets.viewpager.C11864a;
import com.bytedance.ee.bear.widgets.viewpager.VerticalViewPager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Z[B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u001cJ\u000e\u00107\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u001bJ\b\u0010:\u001a\u00020\u0013H\u0002J\u000e\u0010;\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\u001bJ.\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020@2\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0013\u0018\u00010BH\u0002J\b\u0010C\u001a\u00020\u001bH\u0016J\u0010\u0010D\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u001bH\u0016J\u0010\u0010E\u001a\u0004\u0018\u00010\u001c2\u0006\u0010F\u001a\u00020\u001bJ^\u0010G\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u00162\u0006\u0010H\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001305J\u000e\u0010I\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\tJ\"\u0010K\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001b2\b\b\u0002\u0010J\u001a\u00020\tH\u0002J\u0018\u0010L\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u001bH\u0016J\u0018\u0010N\u001a\u00020\u00022\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u001bH\u0017J\u0006\u0010R\u001a\u00020\tJ\u0006\u0010S\u001a\u00020\u0013J\u000e\u0010T\u001a\u00020\u00132\u0006\u0010U\u001a\u00020VJ\u0010\u0010W\u001a\u00020\u00132\u0006\u0010X\u001a\u00020\tH\u0002J\u001c\u0010Y\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00162\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u000e\u0010&\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X.¢\u0006\u0002\n\u0000R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u000e\u00102\u001a\u000203X.¢\u0006\u0002\n\u0000R \u00104\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001305X.¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter2;", "Lcom/bytedance/ee/bear/widgets/viewpager/VerticalPagerAdapter;", "Lcom/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter2$ViewHolder;", "()V", "actionControl", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;", "activity", "Landroid/app/Activity;", "banSwitch", "", "getBanSwitch", "()Z", "setBanSwitch", "(Z)V", "cards", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean;", "clickLink", "Lkotlin/Function0;", "", "commentIdToItemIdMap", "", "", "", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "currentPagers", "", "Landroidx/recyclerview/widget/RecyclerView;", "isPortrait", "itemIdCounter", "getItemIdCounter", "()J", "setItemIdCounter", "(J)V", "justShow", "getJustShow", "setJustShow", "language", "lastToastTime", "mIListeners", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "onClickEmpty", "getOnClickEmpty", "()Lkotlin/jvm/functions/Function0;", "setOnClickEmpty", "(Lkotlin/jvm/functions/Function0;)V", "onResolve", "getOnResolve", "setOnResolve", "per", "Lcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;", "switchItem", "Lkotlin/Function2;", "userId", "detectVisibleItem", "recyclerView", "position", "detectVisibleItemInternal", "findEditViewPosition", "currentIndex", "findScrollToPostionFromFeed", "commentBean", "adapter", "Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter2;", "callback", "Lkotlin/Function1;", "getItemCount", "getItemId", "getView", "postion", "initPage", "IListeners", "notifyDataChange", "forceContentDiff", "notifyItemPageDataChanged", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onEditStatus", "resetAllRvPadding", "resetRvPosition", "vp", "Lcom/bytedance/ee/bear/widgets/viewpager/VerticalViewPager;", "toastNoMoreComment", "onTop", "updateData", "Companion", "ViewHolder", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.card.f */
public final class CommentPagerAdapter2 extends AbstractC11870c<ViewHolder> {

    /* renamed from: d */
    public static final Companion f24646d = new Companion(null);

    /* renamed from: a */
    public ICommentFunction f24647a;

    /* renamed from: b */
    public final Map<Integer, RecyclerView> f24648b = new LinkedHashMap();

    /* renamed from: c */
    public Function2<? super Integer, ? super Boolean, Unit> f24649c;

    /* renamed from: e */
    private List<CommentBean> f24650e;

    /* renamed from: f */
    private Config f24651f;

    /* renamed from: g */
    private Activity f24652g;

    /* renamed from: h */
    private ICommentPermission f24653h;

    /* renamed from: i */
    private String f24654i;

    /* renamed from: j */
    private String f24655j;

    /* renamed from: k */
    private ICommentListeners f24656k;

    /* renamed from: l */
    private Function0<Unit> f24657l;

    /* renamed from: m */
    private boolean f24658m = true;

    /* renamed from: n */
    private Function0<Unit> f24659n;

    /* renamed from: o */
    private Function0<Unit> f24660o;

    /* renamed from: p */
    private boolean f24661p;

    /* renamed from: q */
    private boolean f24662q;

    /* renamed from: r */
    private final Map<String, Long> f24663r = new LinkedHashMap();

    /* renamed from: s */
    private long f24664s;

    /* renamed from: t */
    private long f24665t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter2$Companion;", "", "()V", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter2$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)V", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.f$b */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final RecyclerView f24666a;

        /* renamed from: a */
        public final RecyclerView mo34874a() {
            return this.f24666a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view, RecyclerView recyclerView) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            this.f24666a = recyclerView;
        }
    }

    /* renamed from: a */
    public final Function0<Unit> mo34856a() {
        return this.f24660o;
    }

    /* renamed from: a */
    public final void mo34863a(boolean z) {
        this.f24661p = z;
    }

    /* renamed from: a */
    public final void mo34861a(String str, List<CommentBean> list) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(list, "cards");
        this.f24655j = str;
        this.f24650e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<CommentBean> list = this.f24650e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.f$c */
    public static final class RunnableC9174c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommentPagerAdapter2 f24667a;

        /* renamed from: b */
        final /* synthetic */ int f24668b;

        RunnableC9174c(CommentPagerAdapter2 fVar, int i) {
            this.f24667a = fVar;
            this.f24668b = i;
        }

        public final void run() {
            int i = this.f24668b;
            VerticalViewPager f = this.f24667a.mo45594f();
            Intrinsics.checkExpressionValueIsNotNull(f, "verticalViewPager");
            if (i == f.getCurrentItem()) {
                this.f24667a.mo34873e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.f$f */
    public static final class RunnableC9177f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f24671a;

        /* renamed from: b */
        final /* synthetic */ CardAdapter2 f24672b;

        /* renamed from: c */
        final /* synthetic */ CommentBean f24673c;

        RunnableC9177f(RecyclerView recyclerView, CardAdapter2 cardAdapter2, CommentBean commentBean) {
            this.f24671a = recyclerView;
            this.f24672b = cardAdapter2;
            this.f24673c = commentBean;
        }

        public final void run() {
            this.f24671a.scrollToPosition(this.f24672b.getItemCount() - 1);
            this.f24673c.setCurrentReplyId("");
        }
    }

    public CommentPagerAdapter2() {
        setHasStableIds(true);
    }

    /* renamed from: b */
    public final boolean mo34867b() {
        return this.f24661p;
    }

    /* renamed from: c */
    public final void mo34868c() {
        Iterator<T> it = this.f24648b.values().iterator();
        while (it.hasNext()) {
            it.next().setPadding(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.f$d */
    public static final class RunnableC9175d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommentPagerAdapter2 f24669a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f24670b;

        RunnableC9175d(CommentPagerAdapter2 fVar, RecyclerView recyclerView) {
            this.f24669a = fVar;
            this.f24670b = recyclerView;
        }

        public final void run() {
            RecyclerView recyclerView = this.f24670b;
            Map<Integer, RecyclerView> map = this.f24669a.f24648b;
            VerticalViewPager f = this.f24669a.mo45594f();
            Intrinsics.checkExpressionValueIsNotNull(f, "verticalViewPager");
            if (Intrinsics.areEqual(recyclerView, map.get(Integer.valueOf(f.getCurrentItem())))) {
                this.f24669a.mo34873e();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter2$onCreateViewHolder$5", "Lcom/bytedance/ee/bear/widgets/viewpager/DampLayout$OnHeaderOrFooterListener;", "onBottom", "", "onTop", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.f$k */
    public static final class C9183k implements C11864a.AbstractC11866a {

        /* renamed from: a */
        final /* synthetic */ CommentPagerAdapter2 f24683a;

        @Override // com.bytedance.ee.bear.widgets.viewpager.C11864a.AbstractC11866a
        /* renamed from: a */
        public void mo34882a() {
            VerticalViewPager f = this.f24683a.mo45594f();
            Intrinsics.checkExpressionValueIsNotNull(f, "verticalViewPager");
            int currentItem = f.getCurrentItem();
            if (currentItem > 0 && !this.f24683a.mo34867b()) {
                CommentPagerAdapter2.m37961b(this.f24683a).invoke(Integer.valueOf(currentItem - 1), true);
            }
            if (currentItem == 0 && !this.f24683a.mo34867b()) {
                this.f24683a.mo34871d(true);
            }
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.C11864a.AbstractC11866a
        /* renamed from: b */
        public void mo34883b() {
            int itemCount = this.f24683a.getItemCount() - 1;
            VerticalViewPager f = this.f24683a.mo45594f();
            Intrinsics.checkExpressionValueIsNotNull(f, "verticalViewPager");
            int currentItem = f.getCurrentItem();
            if (currentItem < itemCount && !this.f24683a.mo34867b()) {
                CommentPagerAdapter2.m37961b(this.f24683a).invoke(Integer.valueOf(currentItem + 1), true);
            }
            if (currentItem == itemCount) {
                this.f24683a.mo34871d(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9183k(CommentPagerAdapter2 fVar) {
            this.f24683a = fVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34872d() {
        /*
            r6 = this;
            r0 = 0
            java.util.List<com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean> r1 = r6.f24650e     // Catch:{ Exception -> 0x0051 }
            if (r1 == 0) goto L_0x0059
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x0051 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x000b:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0051 }
            com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean r2 = (com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean) r2     // Catch:{ Exception -> 0x0051 }
            java.util.List r2 = r2.getComment_list()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r3 = "it.comment_list"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ Exception -> 0x0051 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ Exception -> 0x0051 }
            boolean r3 = r2 instanceof java.util.Collection     // Catch:{ Exception -> 0x0051 }
            r4 = 1
            if (r3 == 0) goto L_0x0032
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ Exception -> 0x0051 }
            boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x0051 }
            if (r3 == 0) goto L_0x0032
        L_0x0030:
            r2 = 0
            goto L_0x004e
        L_0x0032:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x0036:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0051 }
            com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean$CommentDetail r3 = (com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean.CommentDetail) r3     // Catch:{ Exception -> 0x0051 }
            java.lang.String r5 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)     // Catch:{ Exception -> 0x0051 }
            boolean r3 = r3.isEditStatus()     // Catch:{ Exception -> 0x0051 }
            if (r3 == 0) goto L_0x0036
            r2 = 1
        L_0x004e:
            if (r2 == 0) goto L_0x000b
            return r4
        L_0x0051:
            r1 = move-exception
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r2 = "CommentPagerAdapter"
            com.bytedance.ee.log.C13479a.m54761a(r2, r1)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.comment.card.CommentPagerAdapter2.mo34872d():boolean");
    }

    /* renamed from: e */
    public final void mo34873e() {
        Map<Integer, RecyclerView> map = this.f24648b;
        VerticalViewPager f = mo45594f();
        Intrinsics.checkExpressionValueIsNotNull(f, "verticalViewPager");
        RecyclerView recyclerView = map.get(Integer.valueOf(f.getCurrentItem()));
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (findFirstVisibleItemPosition != -1 && findLastVisibleItemPosition != -1 && findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        ((CardAdapter2) adapter).onItemVisible(findFirstVisibleItemPosition, findLastVisibleItemPosition);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2");
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    /* renamed from: b */
    public final void mo34865b(Function0<Unit> function0) {
        this.f24660o = function0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.f$e */
    public static final class C9176e extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ Ref.BooleanRef $fromFeedAndShouldScrollTo;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9176e(Ref.BooleanRef booleanRef) {
            super(1);
            this.$fromFeedAndShouldScrollTo = booleanRef;
        }

        public final void invoke(int i) {
            this.$fromFeedAndShouldScrollTo.element = true;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter2$onCreateViewHolder$4", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.f$j */
    public static final class C9182j extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ CommentPagerAdapter2 f24682a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9182j(CommentPagerAdapter2 fVar) {
            this.f24682a = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i == 0) {
                C13479a.m54764b("CommentPagerAdapter", "detectVisibleItem onScrollStateChanged to SCROLL_STATE_IDLE");
                this.f24682a.mo34857a(recyclerView);
            }
        }
    }

    /* renamed from: a */
    public final void mo34862a(Function0<Unit> function0) {
        this.f24659n = function0;
    }

    /* renamed from: b */
    public final void mo34866b(boolean z) {
        this.f24662q = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.f$g */
    public static final class C9178g extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ CommentBean $commentBean;
        final /* synthetic */ RecyclerView $recyclerView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9178g(RecyclerView recyclerView, CommentBean commentBean) {
            super(1);
            this.$recyclerView = recyclerView;
            this.$commentBean = commentBean;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final int i) {
            this.$recyclerView.postDelayed(new Runnable(this) {
                /* class com.bytedance.ee.bear.middleground.comment.card.CommentPagerAdapter2.C9178g.RunnableC91791 */

                /* renamed from: a */
                final /* synthetic */ C9178g f24674a;

                {
                    this.f24674a = r1;
                }

                public final void run() {
                    this.f24674a.$recyclerView.scrollToPosition(i);
                    this.f24674a.$commentBean.setCurrentReplyId("");
                }
            }, 200);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ICommentFunction m37958a(CommentPagerAdapter2 fVar) {
        ICommentFunction eVar = fVar.f24647a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionControl");
        }
        return eVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ Function2 m37961b(CommentPagerAdapter2 fVar) {
        Function2<? super Integer, ? super Boolean, Unit> kVar = fVar.f24649c;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchItem");
        }
        return kVar;
    }

    /* renamed from: c */
    public final void mo34869c(int i) {
        mo45594f().post(new RunnableC9174c(this, i));
    }

    /* renamed from: a */
    public final RecyclerView mo34854a(int i) {
        return this.f24648b.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo34857a(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        mo45594f().post(new RunnableC9175d(this, recyclerView));
    }

    /* renamed from: d */
    public final void mo34871d(boolean z) {
        int i;
        if (System.currentTimeMillis() - this.f24665t > ((long) 2000)) {
            this.f24665t = System.currentTimeMillis();
            Activity activity = this.f24652g;
            if (activity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
            }
            Activity activity2 = activity;
            if (z) {
                i = R.string.Doc_Comment_IsFirstComment;
            } else {
                i = R.string.Doc_Comment_NoMoreComments;
            }
            Toast.showText(activity2, i);
        }
    }

    /* renamed from: b */
    public final int mo34864b(int i) {
        CommentBean commentBean;
        List<CommentBean.CommentDetail> comment_list;
        try {
            List<CommentBean> list = this.f24650e;
            if (list == null || (commentBean = list.get(i)) == null || (comment_list = commentBean.getComment_list()) == null) {
                return -2;
            }
            int i2 = 0;
            for (T t : comment_list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t2 = t;
                CommentPagerAdapter2 fVar = this;
                Intrinsics.checkExpressionValueIsNotNull(t2, "commentDetail");
                if (t2.isEditStatus()) {
                    return i2;
                }
                i2 = i3;
            }
            return -2;
        } catch (Exception e) {
            C13479a.m54761a("CommentPagerAdapter", e);
            return -2;
        }
    }

    /* renamed from: c */
    public final void mo34870c(boolean z) {
        int i;
        Iterator<T> it = this.f24648b.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            List<CommentBean> list = this.f24650e;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (intValue < i) {
                RecyclerView recyclerView = this.f24648b.get(Integer.valueOf(intValue));
                if (recyclerView != null) {
                    m37959a(recyclerView, intValue, z);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        String str;
        boolean z;
        Long l;
        CommentBean commentBean;
        List<CommentBean> list = this.f24650e;
        if (list == null || (commentBean = list.get(i)) == null) {
            str = null;
        } else {
            str = commentBean.getComment_id();
        }
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.f24663r.containsKey(str)) {
                    l = this.f24663r.get(str);
                } else {
                    long j = this.f24664s;
                    this.f24664s = 1 + j;
                    this.f24663r.put(str, Long.valueOf(j));
                    l = Long.valueOf(j);
                }
                if (l == null) {
                    Intrinsics.throwNpe();
                }
                return l.longValue();
            }
        }
        C13479a.m54758a("CardAdapter2", "commentId is empty!");
        return -1;
    }

    /* renamed from: a */
    public final void mo34860a(VerticalViewPager verticalViewPager) {
        RecyclerView.LayoutManager layoutManager;
        Intrinsics.checkParameterIsNotNull(verticalViewPager, "vp");
        RecyclerView recyclerView = this.f24648b.get(Integer.valueOf(verticalViewPager.getCurrentItem()));
        LinearLayoutManager linearLayoutManager = null;
        if (recyclerView != null) {
            layoutManager = recyclerView.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = layoutManager;
        }
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager2 != null) {
            linearLayoutManager2.scrollToPositionWithOffset(0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "x", "", "y", "onTouchiew"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.f$h */
    public static final class C9180h implements PointRecoderRecyclerView.AbstractC58964a {

        /* renamed from: a */
        final /* synthetic */ CommentPagerAdapter2 f24676a;

        C9180h(CommentPagerAdapter2 fVar) {
            this.f24676a = fVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView.AbstractC58964a
        public final void onTouchiew(float f, float f2) {
            CommentPagerAdapter2.m37958a(this.f24676a).mo34629a(f2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.f$i */
    public static final class View$OnTouchListenerC9181i implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CommentPagerAdapter2 f24677a;

        /* renamed from: b */
        final /* synthetic */ Ref.LongRef f24678b;

        /* renamed from: c */
        final /* synthetic */ Ref.FloatRef f24679c;

        /* renamed from: d */
        final /* synthetic */ Ref.FloatRef f24680d;

        /* renamed from: e */
        final /* synthetic */ NoTopFadingEdgeRecyclerView f24681e;

        View$OnTouchListenerC9181i(CommentPagerAdapter2 fVar, Ref.LongRef longRef, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, NoTopFadingEdgeRecyclerView noTopFadingEdgeRecyclerView) {
            this.f24677a = fVar;
            this.f24678b = longRef;
            this.f24679c = floatRef;
            this.f24680d = floatRef2;
            this.f24681e = noTopFadingEdgeRecyclerView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Function0<Unit> a;
            if (motionEvent.getAction() == 0) {
                this.f24678b.element = System.currentTimeMillis();
                Ref.FloatRef floatRef = this.f24679c;
                Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
                floatRef.element = motionEvent.getX();
                this.f24680d.element = motionEvent.getY();
            }
            if (motionEvent.getAction() != 1 || view.getId() == 0) {
                return false;
            }
            float f = (float) 5;
            if (Math.abs(this.f24679c.element - motionEvent.getX()) > f || Math.abs(this.f24680d.element - motionEvent.getY()) > f || this.f24681e.getScrollState() == 1 || System.currentTimeMillis() - this.f24678b.element >= ((long) LocationRequest.PRIORITY_INDOOR) || (a = this.f24677a.mo34856a()) == null) {
                return false;
            }
            a.invoke();
            return false;
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        this.f24648b.values().remove(bVar.mo34874a());
        this.f24648b.put(Integer.valueOf(i), bVar.mo34874a());
        m37959a(bVar.mo34874a(), i, false);
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Activity activity = this.f24652g;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
        }
        NoTopFadingEdgeRecyclerView noTopFadingEdgeRecyclerView = new NoTopFadingEdgeRecyclerView(activity);
        noTopFadingEdgeRecyclerView.mo200037a(false);
        Activity activity2 = this.f24652g;
        if (activity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
        }
        noTopFadingEdgeRecyclerView.setLayoutManager(new CommentPagerAdapter2$onCreateViewHolder$1(this, activity2));
        noTopFadingEdgeRecyclerView.setOverScrollMode(2);
        Config fVar = this.f24651f;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        }
        String str = this.f24655j;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userId");
        }
        ICommentListeners fVar2 = this.f24656k;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIListeners");
        }
        ICommentFunction eVar = this.f24647a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionControl");
        }
        Function0<Unit> function0 = this.f24657l;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickLink");
        }
        noTopFadingEdgeRecyclerView.setAdapter(new CardAdapter2(fVar, str, fVar2, eVar, function0));
        noTopFadingEdgeRecyclerView.setTouchViewListener(new C9180h(this));
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = BitmapDescriptorFactory.HUE_RED;
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        floatRef2.element = BitmapDescriptorFactory.HUE_RED;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = 0;
        noTopFadingEdgeRecyclerView.setVerticalFadingEdgeEnabled(true);
        noTopFadingEdgeRecyclerView.setFadingEdgeLength(C13749l.m55738a(16));
        noTopFadingEdgeRecyclerView.setOnTouchListener(new View$OnTouchListenerC9181i(this, longRef, floatRef, floatRef2, noTopFadingEdgeRecyclerView));
        if (noTopFadingEdgeRecyclerView.getItemAnimator() instanceof SimpleItemAnimator) {
            RecyclerView.ItemAnimator itemAnimator = noTopFadingEdgeRecyclerView.getItemAnimator();
            if (itemAnimator != null) {
                ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            }
        }
        noTopFadingEdgeRecyclerView.setItemAnimator(null);
        noTopFadingEdgeRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        noTopFadingEdgeRecyclerView.addOnScrollListener(new C9182j(this));
        VerticalViewPager f = mo45594f();
        if (f != null) {
            f.setUserInputEnabled(false);
        }
        Activity activity3 = this.f24652g;
        if (activity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
        }
        C11864a aVar = new C11864a(activity3);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aVar.setOnHeaderOrFooterListener(new C9183k(this));
        NoTopFadingEdgeRecyclerView noTopFadingEdgeRecyclerView2 = noTopFadingEdgeRecyclerView;
        aVar.mo45577a(noTopFadingEdgeRecyclerView2);
        return new ViewHolder(aVar, noTopFadingEdgeRecyclerView2);
    }

    /* renamed from: a */
    private final void m37960a(CommentBean commentBean, CardAdapter2 cardAdapter2, Function1<? super Integer, Unit> function1) {
        if (!TextUtils.isEmpty(commentBean.getCurrentReplyId())) {
            int itemCount = cardAdapter2.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                if (TextUtils.equals(commentBean.getCurrentReplyId(), cardAdapter2.getData().get(i).getReply_id())) {
                    cardAdapter2.setCurrentReplyId(commentBean.getCurrentReplyId());
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(i));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m37959a(androidx.recyclerview.widget.RecyclerView r13, int r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 523
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.comment.card.CommentPagerAdapter2.m37959a(androidx.recyclerview.widget.RecyclerView, int, boolean):void");
    }

    /* renamed from: a */
    public final void mo34859a(Config fVar, Activity activity, ICommentPermission hVar, String str, ICommentListeners fVar2, ICommentFunction eVar, Function0<Unit> function0, Function2<? super Integer, ? super Boolean, Unit> kVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(hVar, "per");
        Intrinsics.checkParameterIsNotNull(str, "language");
        Intrinsics.checkParameterIsNotNull(fVar2, "IListeners");
        Intrinsics.checkParameterIsNotNull(eVar, "actionControl");
        Intrinsics.checkParameterIsNotNull(function0, "clickLink");
        Intrinsics.checkParameterIsNotNull(kVar, "switchItem");
        this.f24651f = fVar;
        this.f24652g = activity;
        this.f24653h = hVar;
        this.f24654i = str;
        this.f24656k = fVar2;
        this.f24647a = eVar;
        this.f24657l = function0;
        Resources resources = fVar.mo35279a().getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "config.activity.resources");
        if (resources.getConfiguration().orientation != 2) {
            z = true;
        } else {
            z = false;
        }
        this.f24658m = z;
        this.f24649c = kVar;
    }
}
