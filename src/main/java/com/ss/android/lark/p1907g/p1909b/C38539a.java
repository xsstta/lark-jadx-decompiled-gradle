package com.ss.android.lark.p1907g.p1909b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.GetLinkExtraDataRequest;
import com.bytedance.lark.pb.basic.v1.GetLinkExtraDataResponse;
import com.ss.android.lark.biz.im.api.param.AbstractC29624a;
import com.ss.android.lark.biz.im.api.param.Params;
import com.ss.android.lark.p1907g.C38537a;
import com.ss.android.lark.p1907g.p1908a.AbstractC38538a;
import com.ss.android.lark.p1907g.p1910c.C38543a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57782ag;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.g.b.a */
public final class C38539a implements AbstractC38542b {
    /* renamed from: a */
    private void m151989a(Context context) {
        AbstractC38538a a = C38537a.m151981a();
        if (a != null) {
            a.mo141223a(context);
        }
    }

    @Override // com.ss.android.lark.p1907g.p1909b.AbstractC38542b
    /* renamed from: a */
    public String mo141226a(String str) {
        if (C57782ag.m224241a(str)) {
            return str;
        }
        GetLinkExtraDataResponse getLinkExtraDataResponse = (GetLinkExtraDataResponse) SdkSender.syncSend(Command.GET_LINK_EXTRA_DATA, new GetLinkExtraDataRequest.C14969a().mo54746a(str), new SdkSender.IParser<GetLinkExtraDataResponse>() {
            /* class com.ss.android.lark.p1907g.p1909b.C38539a.C385412 */

            /* renamed from: a */
            public GetLinkExtraDataResponse parse(byte[] bArr) throws IOException {
                return GetLinkExtraDataResponse.ADAPTER.decode(bArr);
            }
        });
        if (getLinkExtraDataResponse == null || getLinkExtraDataResponse.zendesk_link == null) {
            return str;
        }
        try {
            return m151987a(str, "show_right_button", "false");
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    private String m151988a(String str, Map<String, String> map) {
        if (str == null) {
            return "";
        }
        if (map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return buildUpon.toString();
    }

    /* renamed from: a */
    private String m151987a(String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(str2, str3);
        return buildUpon.toString();
    }

    @Override // com.ss.android.lark.p1907g.p1909b.AbstractC38542b
    /* renamed from: a */
    public void mo141227a(Context context, Params params, AbstractC29624a aVar) {
        if (context == null || params == null) {
            if (aVar != null) {
                aVar.mo106736b();
            }
            C53241h.m205894a("CustomerService", "launchCustomerService error : context == null || params == null");
            return;
        }
        AbstractC38538a a = C38537a.m151981a();
        if (a == null || a.mo141225b() || C57782ag.m224241a(a.mo141222a())) {
            m151989a(context);
            if (aVar != null) {
                aVar.mo106736b();
                return;
            }
            return;
        }
        a.mo141224a(context, m151988a(a.mo141222a(), new HashMap<String, String>(params) {
            /* class com.ss.android.lark.p1907g.p1909b.C38539a.C385401 */
            final /* synthetic */ Params val$params;

            {
                this.val$params = r3;
                put("from", "app");
                put("system", "android");
                put("business", String.valueOf(r3.f74254a));
            }
        }));
        if (aVar != null) {
            aVar.mo106735a();
        }
        C38543a.m151995a();
    }
}
