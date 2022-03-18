package com.ss.android.lark.platform.network;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.bytedance.common.utility.CommonHttpException;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.p1191f.C26004b;
import com.larksuite.framework.http.response.BaseResponse;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.ss.android.lark.platform.network.a */
public class C51857a extends NetworkClient {

    /* renamed from: c */
    private static int f128869c;

    /* renamed from: a */
    private AbstractC25990b f128870a;

    /* renamed from: b */
    private Context f128871b;

    /* renamed from: a */
    private boolean m201113a() {
        return C36083a.m141486a().getPassportDependency().mo133099r().mo172434a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SendHttpResponse m201112a(byte[] bArr) throws IOException {
        return SendHttpResponse.ADAPTER.decode(bArr);
    }

    /* renamed from: a */
    private static ArrayMap<String, String> m201111a(Map<String, String> map) {
        if (map == null) {
            return new ArrayMap<>();
        }
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayMap.put(entry.getKey(), entry.getValue());
        }
        return arrayMap;
    }

    public C51857a(Context context, AbstractC25990b bVar) {
        this.f128871b = context;
        this.f128870a = bVar;
    }

    /* renamed from: a */
    public BaseResponse mo178023a(String str, Map<String, String> map) {
        return C26004b.m94125a(this.f128870a, C26004b.m94122a(str, m201111a(map)));
    }

    /* renamed from: c */
    private BaseResponse m201114c(String str, byte[] bArr, Map<String, String> map) {
        String str2;
        if (map != null) {
            str2 = map.get("Content-Type");
            map.remove("Content-Type");
        } else {
            str2 = null;
        }
        return C26004b.m94125a(this.f128870a, C26004b.m94124a(str, bArr, str2, m201111a(map)));
    }

    @Override // com.bytedance.common.utility.NetworkClient
    public String get(String str, Map<String, String> map, NetworkClient.ReqContext reqContext) throws Exception {
        BaseResponse a = C26004b.m94125a(this.f128870a, C26004b.m94122a(str, m201111a(map)));
        if (a != null) {
            return a.body().mo92409a();
        }
        return null;
    }

    /* renamed from: b */
    public String mo178025b(String str, byte[] bArr, Map<String, String> map) {
        Log.m165389i("BytedanceNetworkClient", "getDidByRustProxy");
        SendHttpRequest.C15253a aVar = new SendHttpRequest.C15253a();
        aVar.mo55528a(str);
        aVar.mo55529a(map);
        aVar.mo55526a(SendHttpRequest.Method.POST);
        aVar.mo55530a(ByteString.of(bArr));
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.SEND_HTTP, aVar, $$Lambda$a$kMDwRnMmCy9_94AHzdevETjD5Oc.INSTANCE);
        if (syncSendMayError == null || syncSendMayError.f131572a == null || syncSendMayError.f131572a.json_body == null) {
            Log.m165383e("BytedanceNetworkClient", "result empty");
            f128869c++;
            return null;
        } else if (syncSendMayError.f131573b == null) {
            return syncSendMayError.f131572a.json_body;
        } else {
            Log.m165383e("BytedanceNetworkClient", "result error: " + syncSendMayError.f131573b.getDebugMsg() + syncSendMayError.f131573b.getDisplayMsg());
            f128869c = f128869c + 1;
            return null;
        }
    }

    /* renamed from: a */
    public BaseResponse mo178024a(String str, byte[] bArr, Map<String, String> map) {
        if (map != null && "gzip".equalsIgnoreCase(map.get("Accept-Encoding"))) {
            map.remove("Accept-Encoding");
        }
        return m201114c(str, bArr, map);
    }

    @Override // com.bytedance.common.utility.NetworkClient
    public String post(String str, List<Pair<String, String>> list, Map<String, String> map, NetworkClient.ReqContext reqContext) throws CommonHttpException {
        BaseResponse a = C26004b.m94125a(this.f128870a, C26004b.m94123a(str, list, m201111a(map)));
        if (a != null) {
            try {
                if (a.body() != null) {
                    return a.body().mo92409a();
                }
            } catch (IOException e) {
                Log.m165384e("Lark", e.getMessage(), e);
            }
        }
        return null;
    }

    @Override // com.bytedance.common.utility.NetworkClient
    public String post(String str, byte[] bArr, Map<String, String> map, NetworkClient.ReqContext reqContext) throws CommonHttpException {
        boolean z;
        if (TextUtils.isEmpty(str) || !"/service/2/device_register/".equals(Uri.parse(str).getPath()) || m201113a() || f128869c >= 3) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return mo178025b(str, bArr, map);
        }
        BaseResponse c = m201114c(str, bArr, map);
        if (c != null) {
            try {
                if (c.body() != null) {
                    return c.body().mo92409a();
                }
            } catch (IOException e) {
                Log.m165384e("Lark", e.getMessage(), e);
            }
        }
        return null;
    }

    @Override // com.bytedance.common.utility.NetworkClient
    public String post(String str, byte[] bArr, boolean z, String str2, boolean z2) throws CommonHttpException {
        return super.post(str, bArr, z, str2, z2);
    }
}
