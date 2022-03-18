package com.bytedance.ee.bear.list.homepage.banner;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.list.ColumnCountUtil;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.banner.BannerAdapter;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView.Delegate;
import com.bytedance.ee.bear.service.C10917c;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010/\u001a\u000200H\u0016J\r\u00101\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012J\b\u00102\u001a\u000200H\u0016J\b\u00103\u001a\u000204H&J\b\u00105\u001a\u000200H\u0014J\b\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u0002002\u0006\u00109\u001a\u000207H\u0016J\u0012\u0010:\u001a\u0002002\b\u0010;\u001a\u0004\u0018\u00010\u001fH\u0016J\u0015\u0010<\u001a\u0002002\u0006\u0010=\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010>J$\u0010?\u001a\u0002002\u001a\u0010@\u001a\u0016\u0012\u0004\u0012\u00020B\u0018\u00010Aj\n\u0012\u0004\u0012\u00020B\u0018\u0001`CH\u0016J\u0010\u0010D\u001a\u0002002\u0006\u0010E\u001a\u000207H\u0016R\u000e\u0010\r\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X.¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/banner/BaseBannerView;", "A", "Lcom/bytedance/ee/bear/list/homepage/banner/BannerAdapter;", "VD", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "mServiceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Landroid/content/Context;Landroid/view/View;Lcom/bytedance/ee/bear/service/ServiceContext;)V", "K_INTERNEL_CLICK", "", "lastClickTime", "mAdapter", "getMAdapter", "()Lcom/bytedance/ee/bear/list/homepage/banner/BannerAdapter;", "setMAdapter", "(Lcom/bytedance/ee/bear/list/homepage/banner/BannerAdapter;)V", "Lcom/bytedance/ee/bear/list/homepage/banner/BannerAdapter;", "getMContext", "()Landroid/content/Context;", "mMoreView", "Lcom/bytedance/ee/bear/list/homepage/banner/BannerMoreView;", "getMMoreView", "()Lcom/bytedance/ee/bear/list/homepage/banner/BannerMoreView;", "setMMoreView", "(Lcom/bytedance/ee/bear/list/homepage/banner/BannerMoreView;)V", "mNetState", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "getMRootView", "()Landroid/view/View;", "setMRootView", "(Landroid/view/View;)V", "mRvList", "Landroidx/recyclerview/widget/RecyclerView;", "getMRvList", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRvList", "(Landroidx/recyclerview/widget/RecyclerView;)V", "getMServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "mTvTitle", "Landroid/widget/TextView;", "mViewDelegate", "create", "", "createAdapter", "destroy", "getTitleRes", "", "initView", "isValidClick", "", "setBannerVisible", "visible", "setNetState", "state", "setViewDelegate", "viewDelegate", "(Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;)V", "showList", "list", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/list/dto/Document;", "Lkotlin/collections/ArrayList;", "showMore", "show", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.homepage.banner.e */
public abstract class BaseBannerView<A extends BannerAdapter, VD extends IBannerContract.IView.Delegate> implements IBannerContract.IView<VD> {

    /* renamed from: a */
    protected BannerMoreView f22877a;

    /* renamed from: b */
    protected RecyclerView f22878b;

    /* renamed from: c */
    protected A f22879c;

    /* renamed from: d */
    public IBannerContract.IView.Delegate f22880d;

    /* renamed from: e */
    private TextView f22881e;

    /* renamed from: f */
    private ConnectionService.NetworkState f22882f;

    /* renamed from: g */
    private final long f22883g = 800;

    /* renamed from: h */
    private long f22884h;

    /* renamed from: i */
    private final Context f22885i;

    /* renamed from: j */
    private View f22886j;

    /* renamed from: k */
    private final C10917c f22887k;

    /* renamed from: e */
    public abstract String mo33128e();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        mo33124b();
    }

    /* renamed from: f */
    public final Context mo33129f() {
        return this.f22885i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final View mo33130g() {
        return this.f22886j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C10917c mo33131h() {
        return this.f22887k;
    }

    /* renamed from: d */
    public A mo33127d() {
        return (A) new BannerAdapter(this.f22887k);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f22880d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final A mo33119a() {
        A a = this.f22879c;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        return a;
    }

    /* renamed from: c */
    public final boolean mo33126c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f22884h < this.f22883g) {
            return false;
        }
        this.f22884h = uptimeMillis;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33124b() {
        View findViewById = this.f22886j.findViewById(R.id.list_banner_rv_list);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.list_banner_rv_list)");
        this.f22878b = (RecyclerView) findViewById;
        View findViewById2 = this.f22886j.findViewById(R.id.list_banner_tv_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R.id.list_banner_tv_title)");
        this.f22881e = (TextView) findViewById2;
        View findViewById3 = this.f22886j.findViewById(R.id.list_banner_more);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.findViewById(R.id.list_banner_more)");
        this.f22877a = (BannerMoreView) findViewById3;
        TextView textView = this.f22881e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTitle");
        }
        textView.setText(mo33128e());
        int a = ColumnCountUtil.f21740a.mo31471a(this.f22885i);
        RecyclerView recyclerView = this.f22878b;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvList");
        }
        recyclerView.addItemDecoration(new BannerListItemDecoration(a));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f22885i, a, 1, false);
        A d = mo33127d();
        this.f22879c = d;
        if (d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        d.mo70668a(new C8470a(this));
        RecyclerView recyclerView2 = this.f22878b;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvList");
        }
        recyclerView2.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView3 = this.f22878b;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvList");
        }
        recyclerView3.setItemAnimator(null);
        RecyclerView recyclerView4 = this.f22878b;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvList");
        }
        A a2 = this.f22879c;
        if (a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView4.setAdapter(a2);
        BannerMoreView bannerMoreView = this.f22877a;
        if (bannerMoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMoreView");
        }
        bannerMoreView.setOnClickListener(new View$OnClickListenerC8471b(this));
    }

    /* renamed from: a */
    public void mo33120a(ConnectionService.NetworkState networkState) {
        this.f22882f = networkState;
    }

    /* renamed from: a */
    public void setViewDelegate(VD vd) {
        Intrinsics.checkParameterIsNotNull(vd, "viewDelegate");
        this.f22880d = vd;
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView
    /* renamed from: b */
    public void mo33125b(boolean z) {
        int i;
        View view = this.f22886j;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u000e\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "A", "Lcom/bytedance/ee/bear/list/homepage/banner/BannerAdapter;", "VD", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.e$b */
    public static final class View$OnClickListenerC8471b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseBannerView f22889a;

        View$OnClickListenerC8471b(BaseBannerView eVar) {
            this.f22889a = eVar;
        }

        public final void onClick(View view) {
            IBannerContract.IView.Delegate aVar;
            if (this.f22889a.mo33126c() && (aVar = this.f22889a.f22880d) != null) {
                aVar.mo33114a();
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView
    /* renamed from: a */
    public void mo33122a(ArrayList<Document> arrayList) {
        A a = this.f22879c;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        a.mo70690f(arrayList);
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView
    /* renamed from: a */
    public void mo33123a(boolean z) {
        int i;
        BannerMoreView bannerMoreView = this.f22877a;
        if (bannerMoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMoreView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        bannerMoreView.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u000528\u0010\u0006\u001a4\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \t*\u0004\u0018\u00010\n0\n \t*\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0007¨\u0006\u00010\u0007¨\u0006\u00012\u000e\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\f0\f2\u0006\u0010\r\u001a\u00020\u000eH\n¢\u0006\u0002\b\u000f"}, d2 = {"<anonymous>", "", "A", "Lcom/bytedance/ee/bear/list/homepage/banner/BannerAdapter;", "VD", "Lcom/bytedance/ee/bear/list/homepage/banner/IBannerContract$IView$Delegate;", "<anonymous parameter 0>", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "kotlin.jvm.PlatformType", "Lcom/chad/library/adapter/base/BaseViewHolder;", "<anonymous parameter 1>", "Landroid/view/View;", "position", "", "onItemClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.homepage.banner.e$a */
    public static final class C8470a implements BaseQuickAdapter.AbstractC20911a {

        /* renamed from: a */
        final /* synthetic */ BaseBannerView f22888a;

        C8470a(BaseBannerView eVar) {
            this.f22888a = eVar;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.AbstractC20911a
        public final void onItemClick(BaseQuickAdapter<Object, C20923c> baseQuickAdapter, View view, int i) {
            IBannerContract.IView.Delegate aVar = this.f22888a.f22880d;
            if (aVar != null) {
                aVar.mo33115a((Document) this.f22888a.mo33119a().mo70685d(i), i);
            }
        }
    }

    public BaseBannerView(Context context, View view, C10917c cVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(cVar, "mServiceContext");
        this.f22885i = context;
        this.f22886j = view;
        this.f22887k = cVar;
    }
}
