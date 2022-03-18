package com.ss.android.lark.mine.impl.index.v2.list.wallet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.common.hitpoint.RedPacketHitPoint;
import com.ss.android.lark.mine.impl.index.v2.list.base.BaseSubComponent;
import com.ss.android.lark.mine.impl.statistics.MineHitPoint;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/wallet/WalletSubComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/BaseSubComponent;", "mContext", "Landroid/content/Context;", "mDependency", "Lcom/ss/android/lark/mine/impl/index/v2/list/wallet/WalletSubComponent$IDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/mine/impl/index/v2/list/wallet/WalletSubComponent$IDependency;)V", "getMContext", "()Landroid/content/Context;", "sidebarType", "", "getSidebarType", "()I", "enable", "", "init", "", "onCreate", "Companion", "IDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WalletSubComponent extends BaseSubComponent {

    /* renamed from: b */
    public static final Companion f115438b = new Companion(null);

    /* renamed from: a */
    public final IDependency f115439a;

    /* renamed from: c */
    private final Context f115440c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/wallet/WalletSubComponent$IDependency;", "", "openWallet", "", "context", "Landroid/content/Context;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.wallet.WalletSubComponent$b */
    public interface IDependency {
        /* renamed from: a */
        void mo160813a(Context context);
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: a */
    public int mo160827a() {
        return CommonCode.StatusCode.API_CLIENT_EXPIRED;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/wallet/WalletSubComponent$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.wallet.WalletSubComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public final Context mo160877f() {
        return this.f115440c;
    }

    /* renamed from: g */
    private final void m181234g() {
        View K = mo141184K();
        if (K != null) {
            K.setOnClickListener(new View$OnClickListenerC45718c(this));
        }
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: b */
    public boolean mo160829b() {
        boolean z;
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        boolean a2 = a.mo133439a();
        AbstractC45399a a3 = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "MineModule.getDependency()");
        boolean e = a3.mo133446e();
        AbstractC45399a a4 = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "MineModule.getDependency()");
        boolean b = a4.mo133442b();
        AbstractC45399a a5 = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a5, "MineModule.getDependency()");
        AbstractC45399a.AbstractC45410k q = a5.mo133458q();
        Intrinsics.checkExpressionValueIsNotNull(q, "MineModule.getDependency().loginDependency");
        boolean a6 = q.mo133500a();
        AbstractC45399a a7 = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a7, "MineModule.getDependency()");
        boolean a8 = a7.mo133451j().mo133481a("hongbao.enable");
        if (!b || a6 || a8) {
            z = true;
        } else {
            z = false;
        }
        if (!e || a2 || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        mo141188a(LayoutInflater.from(this.f115440c).inflate(R.layout.sidebar_wallet, (ViewGroup) null));
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        m181234g();
        Log.m165389i("Mine_WalletSubComponent", "init wallet sub component on " + getLifecycle().getCurrentState().name() + " is enable: " + mo160829b());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.wallet.WalletSubComponent$c */
    public static final class View$OnClickListenerC45718c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WalletSubComponent f115441a;

        View$OnClickListenerC45718c(WalletSubComponent walletSubComponent) {
            this.f115441a = walletSubComponent;
        }

        public final void onClick(View view) {
            Statistics.sendEvent("wallet_open");
            RedPacketHitPoint.Companion aVar = RedPacketHitPoint.f114994a;
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            AbstractC45399a.AbstractC45411l z = a.mo133467z();
            AbstractC45399a a2 = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MineModule.getDependency()");
            AbstractC45399a.AbstractC45412m A = a2.mo133433A();
            Intrinsics.checkExpressionValueIsNotNull(A, "MineModule.getDependency().moneyDependency");
            boolean a3 = z.mo133476a(A.mo133478a());
            AbstractC45399a a4 = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a4, "MineModule.getDependency()");
            AbstractC45399a.AbstractC45411l z2 = a4.mo133467z();
            AbstractC45399a a5 = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a5, "MineModule.getDependency()");
            AbstractC45399a.AbstractC45412m A2 = a5.mo133433A();
            Intrinsics.checkExpressionValueIsNotNull(A2, "MineModule.getDependency().moneyDependency");
            aVar.mo160278a(a3, z2.mo133477b(A2.mo133478a()));
            AbstractC45399a a6 = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a6, "MineModule.getDependency()");
            a6.mo133433A().mo133479a(this.f115441a.mo160877f());
            MineHitPoint.m181467a("wallet");
            IDependency bVar = this.f115441a.f115439a;
            if (bVar != null) {
                bVar.mo160813a(this.f115441a.mo160877f());
            }
        }
    }

    public WalletSubComponent(Context context, IDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f115440c = context;
        this.f115439a = bVar;
    }
}
