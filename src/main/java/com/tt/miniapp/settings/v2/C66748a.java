package com.tt.miniapp.settings.v2;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12749e;
import com.bytedance.ee.lark.infra.config.mina.v2.C12745c;
import com.bytedance.ee.lark.infra.config.mina.v2.C12748d;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.settings.v1.GetSettingsRequest;
import com.bytedance.lark.pb.settings.v1.GetSettingsResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.tt.miniapphost.util.TimeMeter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.a */
public class C66748a implements AbstractC12749e {
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12749e
    /* renamed from: a */
    public void mo48261a(Context context, AbstractC12749e.AbstractC12750a aVar) {
        m260566a(C12745c.m52737a().mo48254b(), aVar);
    }

    /* renamed from: a */
    private void m260566a(List<String> list, final AbstractC12749e.AbstractC12750a aVar) {
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        SdkSender.asynSendRequestNonWrap(Command.GET_SETTINGS, new GetSettingsRequest.C19155a().mo65459a(list), new IGetDataCallback<Map<String, String>>() {
            /* class com.tt.miniapp.settings.v2.C66748a.C667491 */

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                int i;
                if (map != null) {
                    AppBrandLogger.m52830i("AppSettingsFetcher", "sdk keys:", Arrays.toString(map.keySet().toArray()));
                    i = map.size();
                } else {
                    map = new HashMap<>();
                    AppBrandLogger.m52829e("AppSettingsFetcher", "sdk result is null!");
                    i = 0;
                }
                C12748d.m52750a(true, "", "", i, TimeMeter.stop(newAndStart));
                aVar.mo48260a(new JSONObject(map));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                C53241h.m205894a("AppSettingsFetcher", "pullAppSettings onError:" + errorResult);
                StringBuilder sb = new StringBuilder();
                sb.append(errorResult.getErrorCode());
                String str2 = "";
                sb.append(str2);
                String sb2 = sb.toString();
                if (errorResult.getDisplayMsg() == null) {
                    str = str2;
                } else {
                    str = errorResult.getDisplayMsg();
                }
                C12748d.m52750a(false, sb2, str, 0, TimeMeter.stop(newAndStart));
                AbstractC12749e.AbstractC12750a aVar = aVar;
                String str3 = errorResult.getErrorCode() + str2;
                if (errorResult.getDisplayMsg() != null) {
                    str2 = errorResult.getDisplayMsg();
                }
                aVar.mo48259a(str3, str2);
            }
        }, new SdkSender.IParser<Map<String, String>>() {
            /* class com.tt.miniapp.settings.v2.C66748a.C667502 */

            /* renamed from: a */
            public Map<String, String> parse(byte[] bArr) throws IOException {
                return GetSettingsResponse.ADAPTER.decode(bArr).field_groups;
            }
        });
    }
}
