package com.ss.android.lark.watermark.p2928e;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.contact.v1.GetChatterMobileRequest;
import com.bytedance.lark.pb.contact.v1.GetChatterMobileResponse;
import com.bytedance.lark.pb.contact.v1.GetChatterProfileRequest;
import com.bytedance.lark.pb.contact.v1.GetChatterProfileResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.watermark.C58275e;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import com.ss.android.lark.watermark.p2928e.AbstractC58277a;
import com.ss.android.lark.watermark.p2929f.C58286a;
import java.io.IOException;

/* renamed from: com.ss.android.lark.watermark.e.d */
public class C58281d implements AbstractC58277a {
    @Override // com.ss.android.lark.watermark.p2928e.AbstractC58277a
    /* renamed from: b */
    public WatermarkInfo mo197377b() {
        return (WatermarkInfo) JSONObject.parseObject(C57744a.m224104a().getString("WATERMARK_V2"), WatermarkInfo.class);
    }

    @Override // com.ss.android.lark.watermark.p2928e.AbstractC58277a
    /* renamed from: a */
    public void mo197376a(final AbstractC58277a.AbstractC58278a aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.watermark.p2928e.C58281d.RunnableC582821 */

            public void run() {
                String a = C58275e.m225982a().mo177766c().mo177772a();
                String b = C58275e.m225982a().mo177766c().mo177773b();
                String a2 = C58275e.m225982a().mo177768e().mo177775a();
                if (a2 == null) {
                    AbstractC58277a.AbstractC58278a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo197241a(new C58286a("userId == null"));
                        return;
                    }
                    return;
                }
                WatermarkInfo a3 = C58280c.m226004a(a, b, a2, C58281d.this.mo197380a(a2), C58280c.f143286a, 0.1f);
                C57744a.m224104a().putString("WATERMARK_V2", JSONObject.toJSONString(a3));
                AbstractC58277a.AbstractC58278a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo197242a(a3);
                }
            }
        });
    }

    /* renamed from: a */
    public String mo197380a(String str) {
        String str2 = (String) SdkSender.syncSend(Command.GET_CHATTER_MOBILE, new GetChatterMobileRequest.C16194a().mo58067a(str), new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.watermark.p2928e.C58281d.C582832 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return GetChatterMobileResponse.ADAPTER.decode(bArr).mobile;
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String str3 = (String) SdkSender.syncSend(Command.GET_CHATTER_PROFILE, new GetChatterProfileRequest.C16198a().mo58077a(str).mo58076a(SyncDataStrategy.FORCE_SERVER), new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.watermark.p2928e.C58281d.C582843 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return GetChatterProfileResponse.ADAPTER.decode(bArr).personal.email;
            }
        });
        if (str3 == null) {
            return "";
        }
        return str3;
    }
}
