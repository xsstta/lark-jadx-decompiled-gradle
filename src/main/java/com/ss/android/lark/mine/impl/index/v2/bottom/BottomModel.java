package com.ss.android.lark.mine.impl.index.v2.bottom;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.C45424b;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u000fR#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomModel;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "viewModel", "Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomViewModel;", "(Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomViewModel;)V", "mOnCallDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IOnCallDependency;", "kotlin.jvm.PlatformType", "getMOnCallDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IOnCallDependency;", "mOnCallDependency$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomViewModel;", "getOnCallChatId", "", "onCallId", "", "longitude", "", "latitude", "getSOSPhoneNum", "isOnCallNeedLocation", "", "load", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BottomModel extends Widget {

    /* renamed from: a */
    public static final Companion f115300a = new Companion(null);

    /* renamed from: b */
    private final Lazy f115301b = LazyKt.lazy(C45663e.INSTANCE);

    /* renamed from: c */
    private final BottomViewModel f115302c;

    /* renamed from: g */
    private final AbstractC45399a.AbstractC45414o m181051g() {
        return (AbstractC45399a.AbstractC45414o) this.f115301b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/bottom/BottomModel$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public final BottomViewModel mo160787f() {
        return this.f115302c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IOnCallDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomModel$e */
    static final class C45663e extends Lambda implements Function0<AbstractC45399a.AbstractC45414o> {
        public static final C45663e INSTANCE = new C45663e();

        C45663e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45414o invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133457p();
        }
    }

    /* renamed from: a */
    public final void mo160783a() {
        m181051g().mo133494a(new C45662d(this));
    }

    /* renamed from: b */
    public final String mo160786b() {
        C45424b b = this.f115302c.getOnCallInfo().mo5927b();
        if (b != null) {
            return b.f115007d;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo121985c() {
        C45424b b = this.f115302c.getOnCallInfo().mo5927b();
        if (b != null) {
            return b.f115008e;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/bottom/BottomModel$getOnCallChatId$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomModel$b */
    public static final class C45660b implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ BottomModel f115303a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45660b(BottomModel bottomModel) {
            this.f115303a = bottomModel;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            this.f115303a.mo160787f().getOnCallChatId().mo5926a(str);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("MINE_V2_Bottom_Model", "get onCall chat Id failed: " + errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/bottom/BottomModel$getOnCallChatId$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomModel$c */
    public static final class C45661c implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ BottomModel f115304a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45661c(BottomModel bottomModel) {
            this.f115304a = bottomModel;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            this.f115304a.mo160787f().getOnCallChatId().mo5926a(str);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("MINE_V2_Bottom_Model", "get onCall chat Id failed: " + errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/bottom/BottomModel$load$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/mine/dto/HomeOnCall;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.bottom.BottomModel$d */
    public static final class C45662d implements IGetDataCallback<List<? extends C45424b>> {

        /* renamed from: a */
        final /* synthetic */ BottomModel f115305a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45662d(BottomModel bottomModel) {
            this.f115305a = bottomModel;
        }

        /* renamed from: a */
        public void onSuccess(List<? extends C45424b> list) {
            if (!CollectionUtils.isEmpty(list)) {
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                this.f115305a.mo160787f().getOnCallInfo().mo5926a((C45424b) list.get(0));
                return;
            }
            this.f115305a.mo160787f().getOnCallInfo().mo5926a((C45424b) null);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("MINE_V2_Bottom_Model", "getHomeCallInfo error : " + errorResult);
            this.f115305a.mo160787f().getOnCallInfo().mo5926a((C45424b) null);
        }
    }

    public BottomModel(BottomViewModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewModel");
        this.f115302c = aVar;
    }

    /* renamed from: a */
    public final void mo160784a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "onCallId");
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        a.mo133457p().mo133496a(str, new C45660b(this));
    }

    /* renamed from: a */
    public final void mo160785a(String str, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(str, "onCallId");
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        a.mo133457p().mo133495a(str, f, f2, new C45661c(this));
    }
}
