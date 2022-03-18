package com.bytedance.ee.bear.rn;

import com.bytedance.ee.bear.contract.BinderPushListener;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J6\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\nH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH&J\u0012\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0014H&J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00182\u0006\u0010\u0016\u001a\u00020\u0014H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH&J\u001e\u0010\u001a\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\nH&J\u001e\u0010\u001b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/rn/RnBaseProtocol;", "", "enterInSuite", "", "offlineDoc", "", "Lcom/bytedance/ee/bear/contract/offline/OfflineDoc;", "exitFromSuite", "preloadSubBlock", ShareHitPoint.f121869d, "", "token", "dataToken", "dataType", "registerListPushListener", "observer", "Lcom/bytedance/ee/bear/contract/BinderPushListener;", "tag", "setNetworkState", "networkState", "", "turnOnWebSocket", "action", "turnOnWebSocketFlowable", "Lio/reactivex/Flowable;", "unRegisterListPushListener", "unWatchDocs", "watchDocs", "rn-bridge-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.b */
public interface RnBaseProtocol {
    /* renamed from: a */
    void mo40305a(BinderPushListener binderPushListener, String str);

    /* renamed from: a */
    void mo40306a(String str, String str2, List<String> list, String str3);

    /* renamed from: a */
    void mo40307a(List<? extends OfflineDoc> list);

    /* renamed from: a */
    void mo40308a(List<? extends OfflineDoc> list, String str);

    /* renamed from: b */
    void mo40309b(BinderPushListener binderPushListener, String str);

    /* renamed from: b */
    void mo40310b(List<? extends OfflineDoc> list);

    /* renamed from: b */
    void mo40311b(List<? extends OfflineDoc> list, String str);
}
