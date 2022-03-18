package com.bytedance.ee.bear.rn.middleground.business.filedelete;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.bytedance.ee.bear.rn.AbstractC10638e;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/filedelete/FileDeletePushSDK;", "Lcom/bytedance/ee/bear/rn/RnFileDeleteProtocol;", "tagPrefix", "", "tagSuffix", "(Ljava/lang/String;Ljava/lang/String;)V", "mBinderPushListener", "Lcom/bytedance/ee/bear/rn/RnFileDeleteProtocol$RnFileDeleteObserver;", "mPropertyFilter", "Lcom/alibaba/fastjson/serializer/PropertyPreFilter;", "mRealObserver", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "mReferenceCounter", "Lcom/bytedance/ee/bear/rn/middleground/common/ReferenceCounter;", "getJsonString", ShareHitPoint.f121869d, "registerPushListener", "", "observer", "registerPushListenerInternal", "unRegisterPushListener", "unRegisterPushListenerInternal", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.middleground.business.b.a */
public final class FileDeletePushSDK implements AbstractC10638e {

    /* renamed from: c */
    public static final Companion f28633c = new Companion(null);

    /* renamed from: a */
    public final String f28634a;

    /* renamed from: b */
    public final String f28635b;

    /* renamed from: d */
    private AbstractC10638e.AbstractC10639a f28636d;

    /* renamed from: e */
    private JSDocObserver f28637e;

    /* renamed from: f */
    private final ReferenceCounter f28638f;

    /* renamed from: g */
    private PropertyPreFilter f28639g = new SimplePropertyPreFilter(BaseProtocol.Body.ReliablePushList.class, ShareHitPoint.f121869d, "tag", "serviceType");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/filedelete/FileDeletePushSDK$Companion;", "", "()V", "TAG", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.b.a$c */
    public static final class C10675c extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10675c(String str) {
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
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.b.a$d */
    public static final class C10676d extends Lambda implements Function0 {
        final /* synthetic */ String $jsonString;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10676d(String str) {
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
    private final void m44332b() {
        AbstractC68307f<String> a = C10732b.m44451a(new C10675c(m44331a("registerList")));
        if (a != null) {
            a.mo238036k();
        }
    }

    /* renamed from: c */
    private final void m44333c() {
        AbstractC68307f<String> a = C10732b.m44451a(new C10676d(m44331a("unRegisterList")));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.rn.AbstractC10638e
    /* renamed from: a */
    public void mo40334a() {
        if (this.f28638f.mo40557b() <= 0) {
            m44333c();
        }
        this.f28636d = null;
        JSDocObserver aVar = this.f28637e;
        this.f28637e = null;
        if (aVar != null) {
            RnSyncManager.f28587a.mo40386b(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.rn.AbstractC10638e
    /* renamed from: a */
    public void mo40335a(AbstractC10638e.AbstractC10639a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        if (this.f28638f.mo40556a() <= 1) {
            m44332b();
        }
        this.f28636d = aVar;
        C10674b bVar = new C10674b(this, aVar);
        this.f28637e = bVar;
        RnSyncManager.f28587a.mo40380a(bVar);
    }

    /* renamed from: a */
    private final String m44331a(String str) {
        BaseProtocol.FileDeleteList cVar = new BaseProtocol.FileDeleteList();
        cVar.mo40559a(new BaseProtocol.Body.FileDeletePushList(str, this.f28634a + this.f28635b, this.f28634a + this.f28635b, "DELETE"));
        String a = cVar.mo40445a(this.f28639g).mo40446a();
        C13479a.m54772d("FileDeletePushSDK", "getJsonString: " + a);
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/rn/middleground/business/filedelete/FileDeletePushSDK$registerPushListener$realObserver$1", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "onReceive", "", "jsDocResponse", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocResponse;", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.b.a$b */
    public static final class C10674b implements JSDocObserver {

        /* renamed from: a */
        final /* synthetic */ FileDeletePushSDK f28640a;

        /* renamed from: b */
        final /* synthetic */ AbstractC10638e.AbstractC10639a f28641b;

        C10674b(FileDeletePushSDK aVar, AbstractC10638e.AbstractC10639a aVar2) {
            this.f28640a = aVar;
            this.f28641b = aVar2;
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
                    if (Intrinsics.areEqual(str3, this.f28640a.f28634a + this.f28640a.f28635b)) {
                        this.f28641b.mo26203a(jSONObject.toJSONString());
                    }
                }
            }
        }
    }

    public FileDeletePushSDK(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tagPrefix");
        Intrinsics.checkParameterIsNotNull(str2, "tagSuffix");
        this.f28634a = str;
        this.f28635b = str2;
        this.f28638f = new ReferenceCounter("base:" + str + ':' + str2);
    }
}
