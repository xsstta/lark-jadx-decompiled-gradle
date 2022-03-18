package com.bytedance.ee.bear.rn.middleground.business.base;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.BinderPushListener;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.rn.RnBaseProtocol;
import com.bytedance.ee.bear.rn.RnSyncManager;
import com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocObserver;
import com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol;
import com.bytedance.ee.bear.rn.middleground.common.C10732b;
import com.bytedance.ee.bear.rn.p528a.p529a.C10626c;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\f\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J6\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u0012\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\bH\u0002J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u001e\u0010\u001e\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u001f\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseSDK;", "Lcom/bytedance/ee/bear/rn/RnBaseProtocol;", "()V", "mBinderPushListener", "Lcom/bytedance/ee/bear/contract/BinderPushListener;", "mRealObserver", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "enterInSuite", "", "offlineDoc", "", "Lcom/bytedance/ee/bear/contract/offline/OfflineDoc;", "exitFromSuite", "preloadSubBlock", ShareHitPoint.f121869d, "", "token", "dataToken", "dataType", "registerListPushListener", "observer", "tag", "setNetworkState", "networkState", "", "turnOnWebSocket", "action", "turnOnWebSocketFlowable", "Lio/reactivex/Flowable;", "unRegisterListPushListener", "unWatchDocs", "watchDocs", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a */
public final class BaseSDK implements RnBaseProtocol {

    /* renamed from: a */
    public static final Companion f28646a = new Companion(null);

    /* renamed from: b */
    private BinderPushListener f28647b;

    /* renamed from: c */
    private JSDocObserver f28648c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseSDK$Companion;", "", "()V", "DOZE_WEB_SOCKET_CLOSE", "", "DOZE_WEB_SOCKET_OPEN", "VC_WEB_SOCKET_CLOSE", "VC_WEB_SOCKET_OPEN", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$b */
    static final class C10677b extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10677b(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$c */
    static final class C10678c extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10678c(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$d */
    static final class C10679d extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10679d(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$e */
    public static final class C10680e extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10680e(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$g */
    public static final class C10682g extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10682g(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$h */
    public static final class C10683h extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10683h(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$i */
    public static final class C10684i extends Lambda implements Function0<AbstractC68307f<String>> {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10684i(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC68307f<String> invoke() {
            return RnSyncManager.f28587a.mo40373a(this.$jsonString, 4000);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$j */
    public static final class C10685j extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10685j(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$k */
    static final class C10686k extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10686k(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$l */
    static final class C10687l extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10687l(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    /* renamed from: a */
    private final void m44352a() {
        this.f28647b = null;
        JSDocObserver aVar = this.f28648c;
        this.f28648c = null;
        if (aVar != null) {
            RnSyncManager.f28587a.mo40386b(aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/rn/middleground/business/base/BaseSDK$registerListPushListener$realObserver$1", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "onReceive", "", "jsDocResponse", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocResponse;", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.a$f */
    public static final class C10681f implements JSDocObserver {

        /* renamed from: a */
        final /* synthetic */ BinderPushListener f28649a;

        C10681f(BinderPushListener binderPushListener) {
            this.f28649a = binderPushListener;
        }

        @Override // com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocObserver
        /* renamed from: a */
        public void mo40267a(C10626c cVar, JSONObject jSONObject) {
            String str;
            String str2 = null;
            if (cVar != null) {
                str = cVar.mo40279c();
            } else {
                str = null;
            }
            if (str != null) {
                if (jSONObject != null) {
                    str2 = jSONObject.getString("business");
                }
                if (Intrinsics.areEqual("base", str2) && Intrinsics.areEqual(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("operation"), "listUpdate")) {
                    this.f28649a.onChange(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("body").getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).toJSONString());
                }
            }
        }
    }

    /* renamed from: a */
    private final void m44353a(String str) {
        BaseProtocol.PushList fVar = new BaseProtocol.PushList();
        fVar.mo40559a(new BaseProtocol.Body.PushList("registerList", str));
        AbstractC68307f<String> a = C10732b.m44451a(new C10680e(fVar.mo40449a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    /* renamed from: b */
    private final void m44354b(String str) {
        BaseProtocol.PushList fVar = new BaseProtocol.PushList();
        fVar.mo40559a(new BaseProtocol.Body.PushList("unRegisterList", str));
        AbstractC68307f<String> a = C10732b.m44451a(new C10685j(fVar.mo40449a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    /* renamed from: c */
    public void mo40458c(@ConnectionService.NetworkState.NetworkType int i) {
        BaseProtocol.SetNetworkState hVar = new BaseProtocol.SetNetworkState();
        hVar.mo40559a(new BaseProtocol.Body.SetNetworkState(new BaseProtocol.Body.SetNetworkState.Data(Integer.valueOf(i)), null, 2, null));
        AbstractC68307f<String> a = C10732b.m44451a(new C10682g(hVar.mo40452a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    /* renamed from: a */
    public void mo40456a(int i) {
        BaseProtocol.TurnOnOffWebSocket iVar = new BaseProtocol.TurnOnOffWebSocket();
        iVar.mo40559a(new BaseProtocol.Body.TurnOnOffWebSocket(Integer.valueOf(i)));
        AbstractC68307f<String> a = C10732b.m44451a(new C10683h(iVar.mo40453a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    /* renamed from: b */
    public AbstractC68307f<String> mo40457b(int i) {
        BaseProtocol.TurnOnOffWebSocket iVar = new BaseProtocol.TurnOnOffWebSocket();
        iVar.mo40559a(new BaseProtocol.Body.TurnOnOffWebSocket(Integer.valueOf(i)));
        return C10732b.m44451a(new C10684i(iVar.mo40453a()));
    }

    @Override // com.bytedance.ee.bear.rn.RnBaseProtocol
    /* renamed from: b */
    public void mo40310b(List<? extends OfflineDoc> list) {
        Intrinsics.checkParameterIsNotNull(list, "offlineDoc");
        BaseProtocol.ExitFromSuite bVar = new BaseProtocol.ExitFromSuite();
        bVar.mo40559a(new BaseProtocol.Body.Watch(list));
        AbstractC68307f<String> a = C10732b.m44451a(new C10678c(bVar.mo40444a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnBaseProtocol
    /* renamed from: a */
    public void mo40307a(List<? extends OfflineDoc> list) {
        Intrinsics.checkParameterIsNotNull(list, "offlineDoc");
        BaseProtocol.EnterInSuite aVar = new BaseProtocol.EnterInSuite();
        aVar.mo40559a(new BaseProtocol.Body.Watch(list));
        AbstractC68307f<String> a = C10732b.m44451a(new C10677b(aVar.mo40443a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnBaseProtocol
    /* renamed from: b */
    public void mo40309b(BinderPushListener binderPushListener, String str) {
        Intrinsics.checkParameterIsNotNull(binderPushListener, "observer");
        Intrinsics.checkParameterIsNotNull(str, "tag");
        m44354b(str);
        m44352a();
    }

    @Override // com.bytedance.ee.bear.rn.RnBaseProtocol
    /* renamed from: a */
    public void mo40305a(BinderPushListener binderPushListener, String str) {
        Intrinsics.checkParameterIsNotNull(binderPushListener, "observer");
        Intrinsics.checkParameterIsNotNull(str, "tag");
        m44352a();
        m44353a(str);
        this.f28647b = binderPushListener;
        C10681f fVar = new C10681f(binderPushListener);
        this.f28648c = fVar;
        RnSyncManager.f28587a.mo40380a(fVar);
    }

    @Override // com.bytedance.ee.bear.rn.RnBaseProtocol
    /* renamed from: b */
    public void mo40311b(List<? extends OfflineDoc> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "offlineDoc");
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        BaseProtocol.UnWatchDocs jVar = new BaseProtocol.UnWatchDocs(str);
        jVar.mo40559a(new BaseProtocol.Body.Watch(list));
        AbstractC68307f<String> a = C10732b.m44451a(new C10686k(jVar.mo40454a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnBaseProtocol
    /* renamed from: a */
    public void mo40308a(List<? extends OfflineDoc> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "offlineDoc");
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        BaseProtocol.WatchDocs kVar = new BaseProtocol.WatchDocs(str);
        kVar.mo40559a(new BaseProtocol.Body.Watch(list));
        AbstractC68307f<String> a = C10732b.m44451a(new C10687l(kVar.mo40455a()));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnBaseProtocol
    /* renamed from: a */
    public void mo40306a(String str, String str2, List<String> list, String str3) {
        BaseProtocol.PreloadSubBlock eVar = new BaseProtocol.PreloadSubBlock();
        eVar.mo40559a(new BaseProtocol.Body.PreloadSubBlock(str, str2, list, str3));
        AbstractC68307f<String> a = C10732b.m44451a(new C10679d(eVar.mo40448a()));
        if (a != null) {
            a.mo238036k();
        }
    }
}
