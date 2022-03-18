package com.bytedance.ee.bear.rn.middleground.business.base;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.bear.rn.RnSyncManager;
import com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocObserver;
import com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol;
import com.bytedance.ee.bear.rn.middleground.common.C10732b;
import com.bytedance.ee.bear.rn.middleground.common.ReferenceCounter;
import com.bytedance.ee.bear.rn.p528a.p529a.C10626c;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/ReliableBasePushSDK;", "Lcom/bytedance/ee/bear/rn/RnPushProtocol;", "tagPrefix", "", "tagSuffix", "messageBoxVersion", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;)V", "mBinderPushListener", "Lcom/bytedance/ee/bear/rn/RnPushProtocol$RnPushObserver;", "mMessageBoxVersion", "mPropertyFilter", "Lcom/alibaba/fastjson/serializer/PropertyPreFilter;", "mRealObserver", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "mReferenceCounter", "Lcom/bytedance/ee/bear/rn/middleground/common/ReferenceCounter;", "getJsonString", ShareHitPoint.f121869d, "registerPushListener", "", "observer", "registerPushListenerInternal", "unRegisterPushListener", "unRegisterPushListenerInternal", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.b */
public final class ReliableBasePushSDK implements RnPushProtocol {

    /* renamed from: c */
    public static final Companion f28650c = new Companion(null);

    /* renamed from: a */
    public final String f28651a;

    /* renamed from: b */
    public final String f28652b;

    /* renamed from: d */
    private RnPushProtocol.AbstractC10622a f28653d;

    /* renamed from: e */
    private JSDocObserver f28654e;

    /* renamed from: f */
    private int f28655f;

    /* renamed from: g */
    private final ReferenceCounter f28656g;

    /* renamed from: h */
    private PropertyPreFilter f28657h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/ReliableBasePushSDK$Companion;", "", "()V", "TAG", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.b$c */
    public static final class C10689c extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10689c(String str) {
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
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.b$d */
    public static final class C10690d extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10690d(String str) {
            super(0);
            this.$jsonString = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager.m44275d(this.$jsonString);
            return null;
        }
    }

    /* renamed from: b */
    private final void m44367b() {
        AbstractC68307f<String> a = C10732b.m44451a(new C10689c(m44366a("registerList")));
        if (a != null) {
            a.mo238036k();
        }
    }

    /* renamed from: c */
    private final void m44368c() {
        AbstractC68307f<String> a = C10732b.m44451a(new C10690d(m44366a("unRegisterList")));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnPushProtocol
    /* renamed from: a */
    public void mo40241a() {
        if (this.f28656g.mo40557b() <= 0) {
            m44368c();
        }
        this.f28653d = null;
        JSDocObserver aVar = this.f28654e;
        this.f28654e = null;
        if (aVar != null) {
            RnSyncManager.f28587a.mo40386b(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.rn.RnPushProtocol
    /* renamed from: a */
    public void mo40242a(RnPushProtocol.AbstractC10622a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        if (this.f28656g.mo40556a() <= 1) {
            m44367b();
        }
        this.f28653d = aVar;
        C10688b bVar = new C10688b(this, aVar);
        this.f28654e = bVar;
        RnSyncManager.f28587a.mo40380a(bVar);
    }

    /* renamed from: a */
    private final String m44366a(String str) {
        BaseProtocol.ReliablePushList gVar = new BaseProtocol.ReliablePushList();
        gVar.mo40559a(new BaseProtocol.Body.ReliablePushList(str, this.f28651a + this.f28652b, this.f28651a + this.f28652b, this.f28655f));
        String a = gVar.mo40450a(this.f28657h).mo40451a();
        C13479a.m54772d("ReliableBasePushSDK", "getJsonString: " + a);
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/rn/middleground/business/base/ReliableBasePushSDK$registerPushListener$realObserver$1", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "onReceive", "", "jsDocResponse", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocResponse;", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.b$b */
    public static final class C10688b implements JSDocObserver {

        /* renamed from: a */
        final /* synthetic */ ReliableBasePushSDK f28658a;

        /* renamed from: b */
        final /* synthetic */ RnPushProtocol.AbstractC10622a f28659b;

        C10688b(ReliableBasePushSDK bVar, RnPushProtocol.AbstractC10622a aVar) {
            this.f28658a = bVar;
            this.f28659b = aVar;
        }

        @Override // com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocObserver
        /* renamed from: a */
        public void mo40267a(C10626c cVar, JSONObject jSONObject) {
            String str;
            String str2;
            String str3 = null;
            if (cVar != null) {
                str = cVar.mo40279c();
            } else {
                str = null;
            }
            if (str != null) {
                if (jSONObject != null) {
                    str2 = jSONObject.getString("business");
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual("base", str2)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (jSONObject2 != null) {
                        str3 = jSONObject2.getString("operation");
                    }
                    if (Intrinsics.areEqual(str3, this.f28658a.f28651a + this.f28658a.f28652b)) {
                        this.f28659b.didReceivePush(jSONObject.toJSONString());
                    }
                }
            }
        }
    }

    public ReliableBasePushSDK(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tagPrefix");
        Intrinsics.checkParameterIsNotNull(str2, "tagSuffix");
        this.f28651a = str;
        this.f28652b = str2;
        this.f28656g = new ReferenceCounter("base:" + str + ':' + str2);
        this.f28657h = new SimplePropertyPreFilter(BaseProtocol.Body.ReliablePushList.class, ShareHitPoint.f121869d, "tag", "serviceType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReliableBasePushSDK(String str, String str2, int i) {
        this(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "tagPrefix");
        Intrinsics.checkParameterIsNotNull(str2, "tagSuffix");
        this.f28655f = i;
        this.f28657h = new SimplePropertyPreFilter(BaseProtocol.Body.ReliablePushList.class, ShareHitPoint.f121869d, "tag", "serviceType", "messageBoxVersion");
    }
}
