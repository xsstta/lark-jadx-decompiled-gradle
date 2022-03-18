package com.ss.android.lark.larkconfig.userconfig;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.behavior.v1.GetABExperimentVersionRequest;
import com.bytedance.lark.pb.behavior.v1.GetABExperimentVersionResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.larkconfig.userconfig.AbstractC41233f;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.android.lark.larkconfig.userconfig.a */
public class C41216a extends AbstractC41233f<String, String> {

    /* renamed from: com.ss.android.lark.larkconfig.userconfig.a$a */
    private static class C41219a {

        /* renamed from: a */
        static C41216a f104995a = new C41216a();
    }

    /* renamed from: a */
    public static C41216a m163455a() {
        return C41219a.f104995a;
    }

    /* renamed from: b */
    public static void m163456b() {
        C41216a aVar = C41219a.f104995a;
        C41219a.f104995a = new C41216a();
        aVar.mo148591c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.larkconfig.userconfig.AbstractC41233f
    /* renamed from: a */
    public void mo148548a(AbstractC41233f.AbstractC41235a aVar) {
        m163457b(aVar);
    }

    /* renamed from: b */
    private void m163457b(final AbstractC41233f.AbstractC41235a aVar) {
        SdkSender.asynSendRequestNonWrap(Command.GET_AB_EXPERIMENT_VERSION, new GetABExperimentVersionRequest.C15456a().mo56016a(true), new IGetDataCallback<Map<String, String>>() {
            /* class com.ss.android.lark.larkconfig.userconfig.C41216a.C412171 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                aVar.mo148595a(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                C41216a.this.mo148590a(map);
                aVar.mo148594a();
            }
        }, new SdkSender.IParser<Map<String, String>>() {
            /* class com.ss.android.lark.larkconfig.userconfig.C41216a.C412182 */

            /* renamed from: a */
            public Map<String, String> parse(byte[] bArr) throws IOException {
                GetABExperimentVersionResponse decode = GetABExperimentVersionResponse.ADAPTER.decode(bArr);
                if (decode.tea_event_key_map == null) {
                    return null;
                }
                return decode.tea_event_key_map;
            }
        });
    }

    /* renamed from: a */
    public void mo148549a(String str, IGetDataCallback<String> iGetDataCallback) {
        mo148589a((Object) str, (IGetDataCallback) iGetDataCallback);
    }
}
