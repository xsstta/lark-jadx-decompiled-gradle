package com.ss.android.lark.money.redpacket.cover;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.ui.loading.LKUILoadingView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.money.redpacket.cover.IRedPacketCoverContract;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverListResponse;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002,-B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\"H\u0002J\b\u0010(\u001a\u00020\"H\u0002J\b\u0010)\u001a\u00020\"H\u0016J\u0012\u0010*\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010+\u001a\u00020\"H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView;", "Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IView;", "context", "Landroid/content/Context;", "viewDependency", "Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView$ViewDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView$ViewDependency;)V", "coverThemeRv", "Landroidx/recyclerview/widget/RecyclerView;", "getCoverThemeRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setCoverThemeRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "lastSelectedCoverId", "", "getLastSelectedCoverId", "()J", "lastSelectedCoverId$delegate", "Lkotlin/Lazy;", "loadingView", "Lcom/larksuite/component/ui/loading/LKUILoadingView;", "getLoadingView", "()Lcom/larksuite/component/ui/loading/LKUILoadingView;", "setLoadingView", "(Lcom/larksuite/component/ui/loading/LKUILoadingView;)V", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "viewDelegate", "Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IView$Delegate;", "create", "", "destroy", "initCoverRecyclerView", "coverListResponse", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "initLoadingView", "initTitleBar", "initView", "setViewDelegate", "showDefaultOnly", "ICoverThemeDependency", "ViewDependency", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RedPacketCoverView implements IRedPacketCoverContract.IView {

    /* renamed from: a */
    public final ViewDependency f120966a;

    /* renamed from: b */
    private IRedPacketCoverContract.IView.Delegate f120967b;

    /* renamed from: c */
    private final Lazy f120968c = LazyKt.lazy(new C48055d(this));
    @BindView(6503)
    public RecyclerView coverThemeRv;

    /* renamed from: d */
    private final Context f120969d;
    @BindView(6874)
    public LKUILoadingView loadingView;
    @BindView(7363)
    public CommonTitleBar titleBar;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView$ICoverThemeDependency;", "", "selectedCoverId", "", "getSelectedCoverId", "()J", "goToCoverPreviewActivity", "", "cover", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.RedPacketCoverView$a */
    public interface ICoverThemeDependency {
        /* renamed from: a */
        long mo168260a();

        /* renamed from: a */
        void mo168261a(RedPacketCover redPacketCover);
    }

    /* renamed from: c */
    public final long mo168259c() {
        return ((Number) this.f120968c.getValue()).longValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView$ViewDependency;", "", "()V", "currentCoverId", "", "getCurrentCoverId", "()J", "goToCoverPreviewActivity", "", "cover", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "coverListResponse", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "injectView", "view", "Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.RedPacketCoverView$b */
    public static abstract class ViewDependency {

        /* renamed from: a */
        private final long f120970a = -1;

        /* renamed from: a */
        public void mo168253a(RedPacketCover redPacketCover, RedPacketCoverListResponse redPacketCoverListResponse) {
            Intrinsics.checkParameterIsNotNull(redPacketCover, "cover");
            Intrinsics.checkParameterIsNotNull(redPacketCoverListResponse, "coverListResponse");
        }

        /* renamed from: a */
        public void mo168254a(RedPacketCoverView redPacketCoverView) {
            Intrinsics.checkParameterIsNotNull(redPacketCoverView, "view");
        }

        /* renamed from: a */
        public long mo168252a() {
            return this.f120970a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"com/ss/android/lark/money/redpacket/cover/RedPacketCoverView$initCoverRecyclerView$1", "Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView$ICoverThemeDependency;", "selectedCoverId", "", "getSelectedCoverId", "()J", "goToCoverPreviewActivity", "", "cover", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.RedPacketCoverView$c */
    public static final class C48054c implements ICoverThemeDependency {

        /* renamed from: a */
        final /* synthetic */ RedPacketCoverView f120971a;

        /* renamed from: b */
        final /* synthetic */ RedPacketCoverListResponse f120972b;

        @Override // com.ss.android.lark.money.redpacket.cover.RedPacketCoverView.ICoverThemeDependency
        /* renamed from: a */
        public long mo168260a() {
            return this.f120971a.mo168259c();
        }

        @Override // com.ss.android.lark.money.redpacket.cover.RedPacketCoverView.ICoverThemeDependency
        /* renamed from: a */
        public void mo168261a(RedPacketCover redPacketCover) {
            Intrinsics.checkParameterIsNotNull(redPacketCover, "cover");
            this.f120971a.f120966a.mo168253a(redPacketCover, this.f120972b);
        }

        C48054c(RedPacketCoverView redPacketCoverView, RedPacketCoverListResponse redPacketCoverListResponse) {
            this.f120971a = redPacketCoverView;
            this.f120972b = redPacketCoverListResponse;
        }
    }

    @Override // com.ss.android.lark.money.redpacket.cover.IRedPacketCoverContract.IView
    /* renamed from: a */
    public void mo168255a() {
        m189647d();
        m189648e();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f120966a.mo168254a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.RedPacketCoverView$d */
    static final class C48055d extends Lambda implements Function0<Long> {
        final /* synthetic */ RedPacketCoverView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48055d(RedPacketCoverView redPacketCoverView) {
            super(0);
            this.this$0 = redPacketCoverView;
        }

        /* Return type fixed from 'long' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return this.this$0.f120966a.mo168252a();
        }
    }

    /* renamed from: e */
    private final void m189648e() {
        LKUILoadingView lKUILoadingView = this.loadingView;
        if (lKUILoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        }
        lKUILoadingView.playAnimation();
    }

    @Override // com.ss.android.lark.money.redpacket.cover.IRedPacketCoverContract.IView
    /* renamed from: b */
    public void mo168258b() {
        mo168257a(new RedPacketCoverListResponse());
    }

    /* renamed from: d */
    private final void m189647d() {
        CommonTitleBar commonTitleBar = this.titleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftImageDrawable(UDIconUtils.getIconDrawable(this.f120969d, CommonTitleBarConstants.ICON_BACK, UDColorUtils.getColor(this.f120969d, R.color.static_white)));
    }

    /* renamed from: a */
    public void setViewDelegate(IRedPacketCoverContract.IView.Delegate aVar) {
        this.f120967b = aVar;
    }

    @Override // com.ss.android.lark.money.redpacket.cover.IRedPacketCoverContract.IView
    /* renamed from: a */
    public void mo168257a(RedPacketCoverListResponse redPacketCoverListResponse) {
        Intrinsics.checkParameterIsNotNull(redPacketCoverListResponse, "coverListResponse");
        LKUILoadingView lKUILoadingView = this.loadingView;
        if (lKUILoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        }
        lKUILoadingView.cancelAnimation();
        LKUILoadingView lKUILoadingView2 = this.loadingView;
        if (lKUILoadingView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        }
        lKUILoadingView2.setVisibility(8);
        RecyclerView recyclerView = this.coverThemeRv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverThemeRv");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f120969d));
        RecyclerView recyclerView2 = this.coverThemeRv;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverThemeRv");
        }
        recyclerView2.setAdapter(new CoverThemeAdapter(redPacketCoverListResponse, new C48054c(this, redPacketCoverListResponse)));
        RecyclerView recyclerView3 = this.coverThemeRv;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverThemeRv");
        }
        recyclerView3.setVisibility(0);
    }

    public RedPacketCoverView(Context context, ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        this.f120969d = context;
        this.f120966a = bVar;
    }
}
