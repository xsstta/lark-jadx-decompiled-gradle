package com.bytedance.ee.bear.rn;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.domain.AbstractC6307e;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0017¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/rn/RnSyncManager$init$4", "Lcom/bytedance/ee/bear/contract/BinderISendDataCallback$Stub;", "onReceiveData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RnSyncManager$init$4 extends BinderISendDataCallback.Stub {
    RnSyncManager$init$4() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.RnSyncManager$init$4$b */
    static final class C10624b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C10624b f28544a = new C10624b();

        C10624b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("RnSyncManager", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.RnSyncManager$init$4$a */
    static final class C10623a<T> implements Consumer<String> {

        /* renamed from: a */
        public static final C10623a f28543a = new C10623a();

        C10623a() {
        }

        /* renamed from: a */
        public final void accept(String str) {
            C13479a.m54764b("RnSyncManager", "domainCharacteristicConfig result = " + str);
            RnSyncManager.f28587a.mo40393j();
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5098d
    public void onReceiveData(String str) {
        try {
            if (Intrinsics.areEqual(JSONObject.parseObject(str).getString("action"), "fetchDomainConfig")) {
                C13479a.m54764b("RnSyncManager", "onReceiveData()...action = fetchDomainConfig");
                ((AbstractC6307e) KoinJavaComponent.m268613a(AbstractC6307e.class, null, null, 6, null)).mo17336b().mo238001b(C10623a.f28543a, C10624b.f28544a);
            }
        } catch (Exception e) {
            C13479a.m54761a("RnSyncManager", e);
        }
    }
}
