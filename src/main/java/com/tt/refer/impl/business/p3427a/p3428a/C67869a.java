package com.tt.refer.impl.business.p3427a.p3428a;

import com.bytedance.common.utility.Logger;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesRequest;
import com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesResponse;
import com.bytedance.lark.pb.openplatform.v1.PushOpenAppBadgeNodesRequest;
import com.bytedance.lark.pb.openplatform.v1.SaveOpenAppBadgeNodeResponse;
import com.bytedance.lark.pb.openplatform.v1.SaveOpenAppBadgeNodesRequest;
import com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppBadgeNodeRequest;
import com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppBadgeNodeResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tt.refer.impl.business.a.a.a */
public class C67869a {

    /* renamed from: a */
    private final List<AbstractC67871a> f170937a;

    /* renamed from: com.tt.refer.impl.business.a.a.a$a */
    public interface AbstractC67871a {
        void onBadgePush(List<OpenAppBadgeNode> list, boolean z, boolean z2);
    }

    /* renamed from: com.tt.refer.impl.business.a.a.a$b */
    private static class C67872b {

        /* renamed from: a */
        static C67869a f170938a = new C67869a();
    }

    /* renamed from: a */
    public static C67869a m264034a() {
        return C67872b.f170938a;
    }

    private C67869a() {
        this.f170937a = new ArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m264041b() {
        C53248k.m205912a().mo181696a(Command.PUSH_OPEN_APP_BADGE_NODES);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m264042c() {
        C53248k.m205912a().mo181697a(Command.PUSH_OPEN_APP_BADGE_NODES, new C53248k.AbstractC53250a() {
            /* class com.tt.refer.impl.business.p3427a.p3428a.$$Lambda$a$IFJrBHO9V0xdHA0YmQweobIxo */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C67869a.this.m264040a((C67869a) bArr, (byte[]) str, (String) z, z2);
            }
        });
    }

    /* renamed from: b */
    public void mo235509b(AbstractC67871a aVar) {
        C53246j.m205911b(this.f170937a, aVar, $$Lambda$a$SmeQY1WHvoe8ZpOuVJojCZSXFr4.INSTANCE);
    }

    /* renamed from: a */
    public void mo235508a(AbstractC67871a aVar) {
        C53246j.m205910a(this.f170937a, aVar, new C53246j.AbstractC53247a() {
            /* class com.tt.refer.impl.business.p3427a.p3428a.$$Lambda$a$lqc8hQjzJNggSCyzifUCa3f7cYA */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C67869a.this.m264042c();
            }
        });
    }

    /* renamed from: a */
    public static void m264036a(HashMap<String, Integer> hashMap, IGetDataCallback<PullOpenAppBadgeNodesResponse> iGetDataCallback) {
        m264037a(hashMap, iGetDataCallback, false);
    }

    /* renamed from: a */
    public static void m264039a(List<OpenAppBadgeNode> list, IGetDataCallback<SaveOpenAppBadgeNodeResponse> iGetDataCallback) {
        if (list != null && !list.isEmpty()) {
            SaveOpenAppBadgeNodesRequest.C18703a aVar = new SaveOpenAppBadgeNodesRequest.C18703a();
            aVar.f46244a = list;
            Command command = Command.SAVE_OPEN_APP_BADGE_NODES;
            ProtoAdapter<SaveOpenAppBadgeNodeResponse> protoAdapter = SaveOpenAppBadgeNodeResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, aVar, iGetDataCallback, new SdkSender.IParser() {
                /* class com.tt.refer.impl.business.p3427a.p3428a.$$Lambda$ZTzgLDuOYzWX2Vxl4O5hVaRlC9I */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (SaveOpenAppBadgeNodeResponse) ProtoAdapter.this.decode(bArr);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m264037a(HashMap<String, Integer> hashMap, IGetDataCallback<PullOpenAppBadgeNodesResponse> iGetDataCallback, boolean z) {
        m264038a(hashMap, iGetDataCallback, z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m264040a(byte[] bArr, String str, boolean z, boolean z2) {
        Logger.m15173i("MiniAppBadgeApi", "PUSH_OPEN_APP_BADGE_NODES onBadgePush");
        try {
            PushOpenAppBadgeNodesRequest decode = PushOpenAppBadgeNodesRequest.ADAPTER.decode(bArr);
            List<OpenAppBadgeNode> list = decode.notice_nodes;
            if (list != null) {
                if (!list.isEmpty()) {
                    for (AbstractC67871a aVar : this.f170937a) {
                        aVar.onBadgePush(list, z, z2);
                    }
                    return;
                }
            }
            Logger.m15173i("MiniAppBadgeApi", "badge push empty:" + decode);
        } catch (IOException e) {
            Logger.m15173i("MiniAppBadgeApi", "badge push error:" + e);
        }
    }

    /* renamed from: a */
    public static void m264038a(HashMap<String, Integer> hashMap, IGetDataCallback<PullOpenAppBadgeNodesResponse> iGetDataCallback, boolean z, boolean z2) {
        if (!(hashMap == null || hashMap.isEmpty())) {
            PullOpenAppBadgeNodesRequest.C18683a aVar = new PullOpenAppBadgeNodesRequest.C18683a();
            aVar.f46222b = true;
            if (z) {
                aVar.mo64302a(CommonEnum.LoadStrategy.Local);
            } else {
                aVar.mo64302a(CommonEnum.LoadStrategy.Net);
            }
            aVar.mo64303a(Boolean.valueOf(z2));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                Integer value = entry.getValue();
                if (value == null) {
                    arrayList.add(new PullOpenAppBadgeNodesRequest.IdFeaturePair(entry.getKey(), null));
                } else if (value.intValue() == CommonEnum.OpenAppFeatureType.MiniApp.getValue()) {
                    arrayList.add(new PullOpenAppBadgeNodesRequest.IdFeaturePair(entry.getKey(), CommonEnum.OpenAppFeatureType.MiniApp));
                } else if (value.intValue() == CommonEnum.OpenAppFeatureType.H5.getValue()) {
                    arrayList.add(new PullOpenAppBadgeNodesRequest.IdFeaturePair(entry.getKey(), CommonEnum.OpenAppFeatureType.H5));
                }
            }
            aVar.f46221a = arrayList;
            Command command = Command.PULL_OPEN_APP_BADGE_NODES;
            ProtoAdapter<PullOpenAppBadgeNodesResponse> protoAdapter = PullOpenAppBadgeNodesResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, aVar, iGetDataCallback, new SdkSender.IParser() {
                /* class com.tt.refer.impl.business.p3427a.p3428a.$$Lambda$dw3Y15GZKQpYl1eIyUIPdZaQoZU */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (PullOpenAppBadgeNodesResponse) ProtoAdapter.this.decode(bArr);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m264035a(String str, Integer num, Boolean bool, CommonEnum.OpenAppFeatureType openAppFeatureType, IGetDataCallback<UpdateOpenAppBadgeNodeResponse> iGetDataCallback) {
        UpdateOpenAppBadgeNodeRequest.C18715a b = new UpdateOpenAppBadgeNodeRequest.C18715a().mo64376a(str).mo64378b(true);
        if (openAppFeatureType != null) {
            b.mo64373a(openAppFeatureType);
        }
        if (bool != null) {
            b.mo64374a(bool);
        }
        if (num != null) {
            b.mo64375a(num);
            if (openAppFeatureType != null) {
                b.mo64373a(openAppFeatureType);
            }
        }
        Command command = Command.UPDATE_LOCAL_OPEN_APP_BADGE_NODE;
        ProtoAdapter<UpdateOpenAppBadgeNodeResponse> protoAdapter = UpdateOpenAppBadgeNodeResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, b, iGetDataCallback, new SdkSender.IParser() {
            /* class com.tt.refer.impl.business.p3427a.p3428a.$$Lambda$MnFDuNz7bTPJjOsltcQpvKgoeIo */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (UpdateOpenAppBadgeNodeResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }
}
