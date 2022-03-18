package com.bytedance.ee.bear.middleground.permission.apply;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.permission.apply.g */
public class C9574g implements NetService.AbstractC5074c<NetService.Result<String>> {
    @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
    public NetService.Result<String> parse(String str) throws NetService.ParseException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C13479a.m54772d("PermissionApplyParser", "request return json" + str);
            JSONObject jSONObject = new JSONObject(str);
            NetService.Result<String> result = new NetService.Result<>();
            result.code = jSONObject.optInt("code", -1);
            return result;
        } catch (JSONException e) {
            C13479a.m54759a("PermissionApplyParser", "sendPermissionRequest(): ", e);
            return null;
        }
    }
}
