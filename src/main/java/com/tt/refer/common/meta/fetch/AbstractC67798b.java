package com.tt.refer.common.meta.fetch;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.errorcode.ErrorCode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.refer.common.meta.fetch.b */
public abstract class AbstractC67798b<T> extends AbstractC67806i<T> {
    @Override // com.tt.refer.common.meta.fetch.AbstractC67802f, com.tt.refer.common.meta.fetch.AbstractC67806i
    public String b_(String str) throws MetaException {
        String str2;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject == null) {
                return null;
            }
            int optInt = optJSONObject.optInt("error");
            String optString = optJSONObject.optString("message");
            if (optInt <= 0) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("app_metas");
                if (optJSONObject2 != null) {
                    return optJSONObject2.toString();
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
            sb3.append("getAppMetaSync->onPreParser error:");
            if (TextUtils.isEmpty(str)) {
                str = " empty json data!";
            }
            sb3.append(str);
            objArr[0] = sb3.toString();
            AppBrandLogger.m52829e("app_meta", objArr);
            throw new MetaException(ErrorCode.META.JSON_ERROR.getCode(), sb2);
        }
    }
}
