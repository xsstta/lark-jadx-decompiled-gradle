package com.bytedance.ee.bear.middleground.comment.card;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter;
import com.bytedance.ee.bear.middleground.comment.control.ICommentFunction;
import com.bytedance.ee.bear.middleground.comment.control.ICommentListeners;
import com.bytedance.ee.bear.middleground.comment.export.ICommentPermission;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.Reaction;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b;
import com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13743h;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 <2\u00020\u0001:\u0001<B\u0005¢\u0006\u0002\u0010\u0002J \u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0016J\u000e\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)J\u000e\u0010'\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0013J\b\u0010*\u001a\u00020\u000eH\u0002J\b\u0010+\u001a\u00020\u0013H\u0016J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020&H\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010)2\u0006\u0010/\u001a\u00020\u0013JD\u00100\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0018\u00102\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020&H\u0016J\b\u00107\u001a\u00020\u000eH\u0016J\u000e\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u000204J,\u00109\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00132\b\b\u0002\u0010:\u001a\u0002042\b\b\u0002\u00108\u001a\u000204H\u0002J\u001c\u0010;\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006="}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter;", "Lcom/bytedance/ee/bear/widgets/viewpager/FixPageTransformerPagerAdapter;", "()V", "actionControl", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;", "activity", "Landroid/app/Activity;", "cachePagers", "", "Landroid/view/View;", "cards", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean;", "clickLink", "Lkotlin/Function0;", "", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "currentPagers", "", "", "language", "", "mIListeners", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "per", "Lcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;", "userId", "viewPager", "Lcom/bytedance/ee/bear/widgets/viewpager/FixPageTransformerViewPager;", "getViewPager", "()Lcom/bytedance/ee/bear/widgets/viewpager/FixPageTransformerViewPager;", "setViewPager", "(Lcom/bytedance/ee/bear/widgets/viewpager/FixPageTransformerViewPager;)V", "destroyItem", "container", "Landroid/view/ViewGroup;", "position", "obj", "", "detectVisibleItem", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "detectVisibleItemInternal", "getCount", "getItemPosition", "view", "getView", "postion", "initPage", "IListeners", "instantiateItem", "isViewFromObject", "", "p0", "p1", "notifyDataSetChanged", "forceContentDiff", "notifyItemPageDataChanged", "isInit", "updateData", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.card.e */
public final class CommentPagerAdapter extends AbstractC11869b {

    /* renamed from: d */
    public static final Companion f24624d = new Companion(null);

    /* renamed from: a */
    public ICommentFunction f24625a;

    /* renamed from: b */
    public final Map<Integer, View> f24626b = new LinkedHashMap();

    /* renamed from: c */
    public FixPageTransformerViewPager f24627c;

    /* renamed from: e */
    private List<CommentBean> f24628e;

    /* renamed from: f */
    private Config f24629f;

    /* renamed from: g */
    private Activity f24630g;

    /* renamed from: h */
    private ICommentPermission f24631h;

    /* renamed from: i */
    private String f24632i;

    /* renamed from: j */
    private String f24633j;

    /* renamed from: k */
    private ICommentListeners f24634k;

    /* renamed from: l */
    private Function0<Unit> f24635l;

    /* renamed from: m */
    private final List<View> f24636m = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter$Companion;", "", "()V", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter$notifyItemPageDataChanged$1", "Lcom/bytedance/ee/util/ui/RecyclerItemsDiff$IChangePayload;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "getChangePayload", "", "oldItem", "newItem", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.e$f */
    public static final class C9171f implements C13743h.AbstractC13744a<CommentBean.CommentDetail> {
        C9171f() {
        }

        /* renamed from: a */
        public Object mo34848a(CommentBean.CommentDetail commentDetail, CommentBean.CommentDetail commentDetail2) {
            String str;
            String str2;
            List<Reaction> list;
            List<Reaction> list2;
            Boolean bool;
            Bundle bundle = new Bundle();
            Boolean bool2 = null;
            if (commentDetail != null) {
                str = commentDetail.getContent();
            } else {
                str = null;
            }
            String str3 = str;
            if (commentDetail2 != null) {
                str2 = commentDetail2.getContent();
            } else {
                str2 = null;
            }
            if (!TextUtils.equals(str3, str2) || (commentDetail2 != null && commentDetail2.getModify() == 1 && (commentDetail == null || commentDetail.getUpdate_timestamp() != commentDetail2.getUpdate_timestamp()))) {
                bundle.putInt("TEXT", 1);
            }
            if (commentDetail != null) {
                list = commentDetail.getReaction();
            } else {
                list = null;
            }
            if (commentDetail2 != null) {
                list2 = commentDetail2.getReaction();
            } else {
                list2 = null;
            }
            if (!Objects.equals(list, list2)) {
                bundle.putInt("REACTION", 1);
            }
            if (commentDetail != null) {
                bool = Boolean.valueOf(commentDetail.isSending());
            } else {
                bool = null;
            }
            if (commentDetail2 != null) {
                bool2 = Boolean.valueOf(commentDetail2.isSending());
            }
            if (!Objects.equals(bool, bool2)) {
                bundle.putInt("SENDINGSTATUS", 1);
            }
            return bundle;
        }
    }

    /* renamed from: a */
    public final void mo34837a(String str, List<CommentBean> list) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(list, "cards");
        this.f24633j = str;
        this.f24628e = list;
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b
    /* renamed from: a */
    public boolean mo18482a(View view, Object obj) {
        Intrinsics.checkParameterIsNotNull(view, "p0");
        Intrinsics.checkParameterIsNotNull(obj, "p1");
        return Intrinsics.areEqual(view, obj);
    }

    /* renamed from: a */
    public final void mo34838a(boolean z) {
        C13479a.m54764b("CommentPagerAdapter", "notifyDataSetChanged:");
        Iterator<T> it = this.f24626b.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            List<CommentBean> list = this.f24628e;
            if (intValue < (list != null ? list.size() : 0)) {
                View view = this.f24626b.get(Integer.valueOf(intValue));
                if (view != null) {
                    m37935a((RecyclerView) view, intValue, false, z);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                }
            }
        }
        super.mo34842c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.e$g */
    public static final class RunnableC9172g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f24643a;

        /* renamed from: b */
        final /* synthetic */ CardAdapter f24644b;

        RunnableC9172g(RecyclerView recyclerView, CardAdapter cardAdapter) {
            this.f24643a = recyclerView;
            this.f24644b = cardAdapter;
        }

        public final void run() {
            this.f24643a.scrollToPosition(this.f24644b.getItemCount() - 1);
        }
    }

    /* renamed from: b */
    public final FixPageTransformerViewPager mo34840b() {
        FixPageTransformerViewPager fixPageTransformerViewPager = this.f24627c;
        if (fixPageTransformerViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        return fixPageTransformerViewPager;
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b
    /* renamed from: c */
    public void mo34842c() {
        C13479a.m54764b("CommentPagerAdapter", "notifyDataSetChanged:");
        mo34838a(false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.e$b */
    public static final class RunnableC9167b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommentPagerAdapter f24637a;

        /* renamed from: b */
        final /* synthetic */ int f24638b;

        RunnableC9167b(CommentPagerAdapter eVar, int i) {
            this.f24637a = eVar;
            this.f24638b = i;
        }

        public final void run() {
            if (this.f24638b == this.f24637a.mo34840b().getCurrentItem()) {
                this.f24637a.mo34843d();
            }
        }
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b
    /* renamed from: a */
    public int mo18476a() {
        List<CommentBean> list = this.f24628e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.e$c */
    public static final class RunnableC9168c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommentPagerAdapter f24639a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f24640b;

        RunnableC9168c(CommentPagerAdapter eVar, RecyclerView recyclerView) {
            this.f24639a = eVar;
            this.f24640b = recyclerView;
        }

        public final void run() {
            if (Intrinsics.areEqual(this.f24640b, this.f24639a.f24626b.get(Integer.valueOf(this.f24639a.mo34840b().getCurrentItem())))) {
                this.f24639a.mo34843d();
            }
        }
    }

    /* renamed from: d */
    public final void mo34843d() {
        StringBuilder sb = new StringBuilder();
        sb.append("detectVisibleItemInternal ");
        FixPageTransformerViewPager fixPageTransformerViewPager = this.f24627c;
        if (fixPageTransformerViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        sb.append(fixPageTransformerViewPager.getCurrentItem());
        C13479a.m54764b("CommentPagerAdapter", sb.toString());
        Map<Integer, View> map = this.f24626b;
        FixPageTransformerViewPager fixPageTransformerViewPager2 = this.f24627c;
        if (fixPageTransformerViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        View view = map.get(Integer.valueOf(fixPageTransformerViewPager2.getCurrentItem()));
        if (!(view instanceof RecyclerView)) {
            view = null;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (findFirstVisibleItemPosition != -1 && findLastVisibleItemPosition != -1 && findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        ((CardAdapter) adapter).onItemVisible(findFirstVisibleItemPosition, findLastVisibleItemPosition);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter");
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter$instantiateItem$recyclerView$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.e$e */
    public static final class C9170e extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ CommentPagerAdapter f24642a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9170e(CommentPagerAdapter eVar) {
            this.f24642a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i == 0) {
                C13479a.m54764b("CommentPagerAdapter", "detectVisibleItem onScrollStateChanged to SCROLL_STATE_IDLE");
                this.f24642a.mo34834a(recyclerView);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter$notifyItemPageDataChanged$itemsDiff$1", "Lcom/bytedance/ee/util/ui/RecyclerItemsDiff$ItemComparable;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.e$h */
    public static final class C9173h implements C13743h.AbstractC13745b<CommentBean.CommentDetail> {

        /* renamed from: a */
        final /* synthetic */ boolean f24645a;

        C9173h(boolean z) {
            this.f24645a = z;
        }

        /* renamed from: a */
        public boolean mo34851a(CommentBean.CommentDetail commentDetail, CommentBean.CommentDetail commentDetail2) {
            String reply_id;
            String str;
            if (commentDetail == null || (reply_id = commentDetail.getReply_id()) == null) {
                return false;
            }
            if (commentDetail2 != null) {
                str = commentDetail2.getReply_id();
            } else {
                str = null;
            }
            return reply_id.equals(str);
        }

        /* renamed from: b */
        public boolean mo34853b(CommentBean.CommentDetail commentDetail, CommentBean.CommentDetail commentDetail2) {
            boolean z;
            if (this.f24645a) {
                return false;
            }
            if (commentDetail != null) {
                z = commentDetail.equals(commentDetail2);
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ICommentFunction m37934a(CommentPagerAdapter eVar) {
        ICommentFunction eVar2 = eVar.f24625a;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionControl");
        }
        return eVar2;
    }

    /* renamed from: b */
    public final void mo34841b(int i) {
        FixPageTransformerViewPager fixPageTransformerViewPager = this.f24627c;
        if (fixPageTransformerViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        fixPageTransformerViewPager.post(new RunnableC9167b(this, i));
    }

    /* renamed from: a */
    public final RecyclerView mo34833a(int i) {
        View view = this.f24626b.get(Integer.valueOf(i));
        if (!(view instanceof RecyclerView)) {
            view = null;
        }
        return (RecyclerView) view;
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b
    /* renamed from: a */
    public int mo18477a(Object obj) {
        int i;
        Intrinsics.checkParameterIsNotNull(obj, "view");
        Iterator<T> it = this.f24626b.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (Intrinsics.areEqual(this.f24626b.get(Integer.valueOf(intValue)), obj)) {
                List<CommentBean> list = this.f24628e;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                if (intValue < i) {
                    return intValue;
                }
            }
        }
        return -2;
    }

    /* renamed from: a */
    public final void mo34834a(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        FixPageTransformerViewPager fixPageTransformerViewPager = this.f24627c;
        if (fixPageTransformerViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        fixPageTransformerViewPager.post(new RunnableC9168c(this, recyclerView));
    }

    /* renamed from: a */
    public final void mo34836a(FixPageTransformerViewPager fixPageTransformerViewPager) {
        Intrinsics.checkParameterIsNotNull(fixPageTransformerViewPager, "<set-?>");
        this.f24627c = fixPageTransformerViewPager;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "x", "", "y", "onTouchiew"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.e$d */
    public static final class C9169d implements PointRecoderRecyclerView.AbstractC58964a {

        /* renamed from: a */
        final /* synthetic */ CommentPagerAdapter f24641a;

        C9169d(CommentPagerAdapter eVar) {
            this.f24641a = eVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView.AbstractC58964a
        public final void onTouchiew(float f, float f2) {
            CommentPagerAdapter.m37934a(this.f24641a).mo34629a(f2);
        }
    }

    /* renamed from: b */
    public View mo18478a(ViewGroup viewGroup, int i) {
        PointRecoderRecyclerView pointRecoderRecyclerView;
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        if (!this.f24636m.isEmpty()) {
            View remove = this.f24636m.remove(0);
            if (remove != null) {
                pointRecoderRecyclerView = (RecyclerView) remove;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
        } else {
            Activity activity = this.f24630g;
            if (activity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
            }
            PointRecoderRecyclerView pointRecoderRecyclerView2 = new PointRecoderRecyclerView(activity);
            pointRecoderRecyclerView2.mo200037a(false);
            Activity activity2 = this.f24630g;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
            }
            pointRecoderRecyclerView2.setLayoutManager(new CommentPagerAdapter$instantiateItem$recyclerView$1(this, activity2));
            pointRecoderRecyclerView2.setOverScrollMode(2);
            Config fVar = this.f24629f;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
            }
            String str = this.f24632i;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("language");
            }
            String str2 = this.f24633j;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userId");
            }
            ICommentListeners fVar2 = this.f24634k;
            if (fVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIListeners");
            }
            ICommentFunction eVar = this.f24625a;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionControl");
            }
            Function0<Unit> function0 = this.f24635l;
            if (function0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clickLink");
            }
            pointRecoderRecyclerView2.setAdapter(new CardAdapter(fVar, str, str2, fVar2, eVar, false, function0));
            pointRecoderRecyclerView2.setTouchViewListener(new C9169d(this));
            pointRecoderRecyclerView2.setItemAnimator(null);
            pointRecoderRecyclerView2.addOnScrollListener(new C9170e(this));
            pointRecoderRecyclerView = pointRecoderRecyclerView2;
        }
        this.f24626b.put(Integer.valueOf(i), pointRecoderRecyclerView);
        ViewGroup viewGroup2 = (ViewGroup) pointRecoderRecyclerView.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(pointRecoderRecyclerView);
        }
        m37935a(pointRecoderRecyclerView, i, true, true);
        RecyclerView recyclerView = pointRecoderRecyclerView;
        viewGroup.addView(recyclerView);
        return recyclerView;
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.AbstractC11869b
    /* renamed from: a */
    public void mo18479a(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        viewGroup.removeView((View) obj);
        this.f24626b.remove(Integer.valueOf(i));
        this.f24636m.add(obj);
    }

    /* renamed from: a */
    private final void m37935a(RecyclerView recyclerView, int i, boolean z, boolean z2) {
        boolean z3;
        C13479a.m54772d("CommentPagerAdapter", "notifyItemPageDataChanged: position = " + i);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            CardAdapter cardAdapter = (CardAdapter) adapter;
            List<CommentBean> list = this.f24628e;
            if (list != null) {
                CommentBean commentBean = list.get(i);
                List<CommentBean.CommentDetail> comment_list = commentBean.getComment_list();
                if (comment_list == null || cardAdapter.getItemCount() <= 0 || cardAdapter.getItemCount() >= comment_list.size() || z) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                cardAdapter.setQuote(commentBean.getQuote());
                cardAdapter.setParentToken(commentBean.getParentToken());
                cardAdapter.setParentType(commentBean.getParentType());
                C13743h hVar = new C13743h(cardAdapter.getData(), comment_list, new C9173h(z2));
                hVar.mo50704a(new C9171f());
                C1374g.C1377b a = C1374g.m6298a(hVar, false);
                Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(itemsDiff, false)");
                a.mo7412a(cardAdapter);
                Intrinsics.checkExpressionValueIsNotNull(comment_list, "commentList");
                cardAdapter.setData(comment_list);
                if (z3) {
                    String str = this.f24633j;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userId");
                    }
                    CommentBean.CommentDetail commentDetail = comment_list.get(CollectionsKt.getLastIndex(comment_list));
                    Intrinsics.checkExpressionValueIsNotNull(commentDetail, "commentList[commentList.lastIndex]");
                    if (TextUtils.equals(str, commentDetail.getUser_id())) {
                        recyclerView.postDelayed(new RunnableC9172g(recyclerView, cardAdapter), 200);
                        return;
                    }
                }
                if (!TextUtils.isEmpty(commentBean.getCurrentReplyId())) {
                    int itemCount = cardAdapter.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        if (TextUtils.equals(commentBean.getCurrentReplyId(), cardAdapter.getData().get(i2).getReply_id())) {
                            recyclerView.scrollToPosition(i2);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean>");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter");
    }

    /* renamed from: a */
    public final void mo34835a(Config fVar, Activity activity, ICommentPermission hVar, String str, ICommentListeners fVar2, ICommentFunction eVar, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(hVar, "per");
        Intrinsics.checkParameterIsNotNull(str, "language");
        Intrinsics.checkParameterIsNotNull(fVar2, "IListeners");
        Intrinsics.checkParameterIsNotNull(eVar, "actionControl");
        Intrinsics.checkParameterIsNotNull(function0, "clickLink");
        this.f24629f = fVar;
        this.f24630g = activity;
        this.f24631h = hVar;
        this.f24632i = str;
        this.f24634k = fVar2;
        this.f24625a = eVar;
        this.f24635l = function0;
    }
}
