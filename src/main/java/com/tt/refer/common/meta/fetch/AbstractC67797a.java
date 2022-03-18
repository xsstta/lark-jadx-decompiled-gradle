package com.tt.refer.common.meta.fetch;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.errorcode.ErrorCode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.refer.common.meta.fetch.a */
public abstract class AbstractC67797a<T> extends AbstractC67806i<T> {
    @Override // com.tt.refer.common.meta.fetch.AbstractC67802f, com.tt.refer.common.meta.fetch.AbstractC67806i
    public String b_(String str) throws MetaException {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("error", 0);
            if (optInt == 0) {
                optInt = jSONObject.optInt("code", 0);
            }
            String optString = jSONObject.optString("message");
            if (TextUtils.isEmpty(optString)) {
                optString = jSONObject.optString("msg");
            }
            if (optInt <= 0) {
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    return optJSONObject.toString();
                }
                return "";
            }
            throw new MetaException(optInt + "", optString, true);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(Log.getStackTraceString(e));
            if (TextUtils.isEmpty(str)) {
                str2 = " empty json dta!";
            } else {
                str2 = str;
            }
            sb.append(str2);
            String sb2 = sb.toString();
            Object[] objArr = new Object[1];
            StringBuilder sb3 = new StringBuilder();
            sb3.append("AbsAppMetaParserV2>getAppMetaSync->onPreParser error:");
            if (TextUtils.isEmpty(str)) {
                str = " empty json dta!";
            }
            sb3.append(str);
            objArr[0] = sb3.toString();
            AppBrandLogger.m52829e("app_meta_v2", objArr);
            throw new MetaException(ErrorCode.META.JSON_ERROR.getCode(), sb2);
        }
    }
}
