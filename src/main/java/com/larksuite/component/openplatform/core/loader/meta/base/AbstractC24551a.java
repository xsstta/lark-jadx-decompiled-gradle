package com.larksuite.component.openplatform.core.loader.meta.base;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.refer.common.meta.fetch.AbstractC67806i;
import com.tt.refer.common.meta.fetch.MetaException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.base.a */
public abstract class AbstractC24551a<T> extends AbstractC67806i<T> {
    @Override // com.tt.refer.common.meta.fetch.AbstractC67802f, com.tt.refer.common.meta.fetch.AbstractC67806i
    public String b_(String str) throws MetaException {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("code");
            String optString = jSONObject.optString("msg");
            if (optInt <= 0) {
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject == null) {
                    return null;
                }
                JSONArray optJSONArray = optJSONObject.optJSONArray("app_metas");
                if (optJSONArray != null) {
                    return optJSONArray.toString();
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
            sb3.append("AbsAppMetaParserV4->onPreParser error:");
            if (TextUtils.isEmpty(str)) {
                str = " empty json dta!";
            }
            sb3.append(str);
            objArr[0] = sb3.toString();
            AppBrandLogger.m52829e("AbsAppMetaParserV4", objArr);
            throw new MetaException(ErrorCode.META.JSON_ERROR.getCode(), sb2);
        }
    }
}
