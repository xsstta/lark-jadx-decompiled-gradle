package com.ss.android.lark.meego.wrapper.p2251f;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.meego.wrapper.MeegoModule;
import com.ss.android.lark.meego.wrapper.p2250e.C44866a;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.meego.GetMeegoShowEnableRequest;
import com.ss.android.lark.pb.meego.GetMeegoShowEnableResponse;
import com.ss.android.lark.pb.meego.GetMeegoSignatureRequest;
import com.ss.android.lark.pb.meego.GetMeegoSignatureResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57768af;

/* renamed from: com.ss.android.lark.meego.wrapper.f.a */
public class C44869a {

    /* renamed from: a */
    public static boolean f113649a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.meego.wrapper.f.a$a */
    public static class C44872a {

        /* renamed from: a */
        public static final C44869a f113653a = new C44869a();
    }

    /* renamed from: a */
    public static C44869a m177889a() {
        return C44872a.f113653a;
    }

    /* renamed from: b */
    public String mo158761b() {
        final C57768af.C57772b bVar = new C57768af.C57772b();
        GetMeegoSignatureRequest.C49841a aVar = new GetMeegoSignatureRequest.C49841a();
        Log.m165389i("Meego", "getMeegoSignature start.");
        Command command = Command.GET_MEEGO_SINGATURE;
        C448701 r3 = new IGetDataCallback<GetMeegoSignatureResponse>() {
            /* class com.ss.android.lark.meego.wrapper.p2251f.C44869a.C448701 */

            /* renamed from: a */
            public void onSuccess(GetMeegoSignatureResponse getMeegoSignatureResponse) {
                bVar.mo196072a(getMeegoSignatureResponse.msignature);
                Log.m165389i("MeegoModule", getMeegoSignatureResponse.msignature);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                bVar.mo196072a("");
                Log.m165383e("MeegoModule", errorResult.getDebugMsg());
            }
        };
        ProtoAdapter<GetMeegoSignatureResponse> protoAdapter = GetMeegoSignatureResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, r3, new SdkSender.IParser() {
            /* class com.ss.android.lark.meego.wrapper.p2251f.$$Lambda$77SYO16ikzZGdrQWlEObu9pnfoM */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetMeegoSignatureResponse) ProtoAdapter.this.decode(bArr);
            }
        });
        return (String) bVar.mo196071a();
    }

    /* renamed from: c */
    public void mo158762c() {
        f113649a = false;
        boolean isGooglePlay = MeegoModule.m177824d().isGooglePlay();
        Log.m165389i("MeegoModule", "fetchMeegoShowEnable isGooglePlay=" + isGooglePlay);
        if (!isGooglePlay) {
            GetMeegoShowEnableRequest.C49837a aVar = new GetMeegoShowEnableRequest.C49837a();
            Command command = Command.GET_MEEGO_SHOW_ENABLE;
            C448712 r2 = new IGetDataCallback<GetMeegoShowEnableResponse>() {
                /* class com.ss.android.lark.meego.wrapper.p2251f.C44869a.C448712 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165384e("MeegoModule", "fetchMeegoShowEnable error", errorResult);
                }

                /* renamed from: a */
                public void onSuccess(GetMeegoShowEnableResponse getMeegoShowEnableResponse) {
                    C44869a.f113649a = getMeegoShowEnableResponse.mcanShow.booleanValue();
                    Log.m165389i("MeegoModule", "fetchMeegoShowEnable success, enable=" + C44869a.f113649a);
                    if (C44869a.f113649a) {
                        C44866a.m177886b();
                    }
                }
            };
            ProtoAdapter<GetMeegoShowEnableResponse> protoAdapter = GetMeegoShowEnableResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.sendPassThroughRequest(command, aVar, r2, new SdkSender.IParser() {
                /* class com.ss.android.lark.meego.wrapper.p2251f.$$Lambda$rTriALU1hzLcXrmLJAzsi97gt0 */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (GetMeegoShowEnableResponse) ProtoAdapter.this.decode(bArr);
                }
            });
        }
    }

    /* renamed from: d */
    public boolean mo158763d() {
        boolean isGooglePlay = MeegoModule.m177824d().isGooglePlay();
        boolean a = C44866a.m177885a();
        Log.m165389i("MeegoModule", "isMeegoShowEnable=" + f113649a + ", isGooglePlay=" + isGooglePlay + ", isPluginInstalled=" + a);
        if (!f113649a || isGooglePlay || !a) {
            return false;
        }
        return true;
    }
}
