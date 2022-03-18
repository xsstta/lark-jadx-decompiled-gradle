package com.ss.android.openbusiness.p3004b.p3005a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.openplatform.v1.CommonGadgetPushRequest;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.openbusiness.b.a.b */
public class C59485b {

    /* renamed from: a */
    private final List<AbstractC59484a> f147678a = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.openbusiness.b.a.b$a */
    public static class C59488a {

        /* renamed from: a */
        static C59485b f147682a = new C59485b();
    }

    /* renamed from: a */
    public static C59485b m230885a() {
        return C59488a.f147682a;
    }

    /* renamed from: a */
    public void mo202791a(final AbstractC59484a aVar) {
        Log.m165389i("Opb_PushManager", "register apps change push");
        C53246j.m205910a(this.f147678a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.openbusiness.p3004b.p3005a.C59485b.C594861 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.GADGET_COMMON_PUSH, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.openbusiness.p3004b.p3005a.C59485b.C594861.C594871 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        try {
                            CommonGadgetPushRequest decode = CommonGadgetPushRequest.ADAPTER.decode(bArr);
                            if (TextUtils.equals(decode.biz, "app_explore_user_common_apps")) {
                                String optString = new JSONObject(decode.data).optString("scene");
                                Log.m165389i("Opb_PushManager", "receive config app push, " + optString);
                                aVar.mo170515a(optString, Long.parseLong(decode.timestamp));
                                return;
                            }
                            Log.m165389i("Opb_PushManager", "not featured push");
                        } catch (Exception e) {
                            Log.m165383e("Opb_PushManager", e.getMessage());
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
    }
}
