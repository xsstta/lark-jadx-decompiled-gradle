package com.ss.android.lark.mine.impl.index.v2.container;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.SidebarInfo;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/container/MineContainerModel;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "hostViewModel", "Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "(Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;)V", "mSettingDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ISettingDependency;", "getMSettingDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$ISettingDependency;", "mSettingDependency$delegate", "Lkotlin/Lazy;", "mTenantChangeListener", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ITenantInfoListener;", "sideBarInfoCallBack", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/mine/dto/SidebarInfo;", "onCreate", "", "onDestroy", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MineContainerModel extends Widget {

    /* renamed from: a */
    public final HostViewModel f115334a;

    /* renamed from: b */
    private final AbstractC45399a.AbstractC45419t f115335b = new C45675b(this);

    /* renamed from: c */
    private final IGetDataCallback<List<SidebarInfo>> f115336c = new C45676c(this);

    /* renamed from: d */
    private final Lazy f115337d = LazyKt.lazy(C45674a.INSTANCE);

    /* renamed from: a */
    private final AbstractC45399a.AbstractC45417r m181097a() {
        return (AbstractC45399a.AbstractC45417r) this.f115337d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ISettingDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.container.MineContainerModel$a */
    static final class C45674a extends Lambda implements Function0<AbstractC45399a.AbstractC45417r> {
        public static final C45674a INSTANCE = new C45674a();

        C45674a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45417r invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133456o();
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        a.mo133461t().mo133521a(this.f115335b);
        AbstractC45399a a2 = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MineModule.getDependency()");
        a2.mo133456o().mo133487b(this.f115336c);
        m181097a().mo133486a(this.f115336c);
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: r */
    public void mo122001r() {
        super.mo122001r();
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        a.mo133461t().mo133522b(this.f115335b);
        AbstractC45399a a2 = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MineModule.getDependency()");
        a2.mo133456o().mo133490c(this.f115336c);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/container/MineContainerModel$sideBarInfoCallBack$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/mine/dto/SidebarInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sidebarInfos", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.container.MineContainerModel$c */
    public static final class C45676c implements IGetDataCallback<List<? extends SidebarInfo>> {

        /* renamed from: a */
        final /* synthetic */ MineContainerModel f115339a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45676c(MineContainerModel mineContainerModel) {
            this.f115339a = mineContainerModel;
        }

        /* renamed from: a */
        public void onSuccess(List<SidebarInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "sidebarInfos");
            this.f115339a.f115334a.getSidebarInfoList().mo5926a(new ArrayList(list));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo;", "kotlin.jvm.PlatformType", "", "onTenantDataChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.container.MineContainerModel$b */
    static final class C45675b implements AbstractC45399a.AbstractC45419t {

        /* renamed from: a */
        final /* synthetic */ MineContainerModel f115338a;

        C45675b(MineContainerModel mineContainerModel) {
            this.f115338a = mineContainerModel;
        }

        @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45419t
        /* renamed from: a */
        public final void mo160262a(List<TenantInfo> list) {
            this.f115338a.f115334a.getTenentInfos().mo5926a(list);
        }
    }

    public MineContainerModel(HostViewModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "hostViewModel");
        this.f115334a = aVar;
    }
}
