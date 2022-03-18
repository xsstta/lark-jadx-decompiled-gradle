package com.bytedance.ee.bear.net;

import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.functions.Function;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.net.n */
public class C10293n implements Function<C10292m, RawServerResult> {
    /* renamed from: a */
    private Object[] m42908a(String str) {
        Object[] objArr = {0, "", ""};
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("code");
            String optString = jSONObject.optString("msg");
            objArr[0] = Integer.valueOf(optInt);
            objArr[1] = optString;
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                objArr[2] = optJSONObject.toString();
            }
        } catch (JSONException e) {
            C13479a.m54759a("ParseCodeFun", "parseBody JSONException", e);
        } catch (Exception e2) {
            C13479a.m54759a("ParseCodeFun", "parseBody Exception", e2);
        }
        return objArr;
    }

    /* renamed from: a */
    public RawServerResult apply(C10292m mVar) throws Exception {
        Object[] a = m42908a(mVar.mo39313b());
        RawServerResult rawServerResult = new RawServerResult();
        rawServerResult.setCode(((Integer) a[0]).intValue());
        rawServerResult.setMsg((String) a[1]);
        rawServerResult.setData((String) a[2]);
        rawServerResult.setJson(mVar.mo39313b());
        if (rawServerResult.getCode() != 0) {
            C13479a.m54758a("ParseCodeFun", "request error! url = " + mVar.mo39310a() + ", code = " + rawServerResult.getCode() + ", message = " + rawServerResult.getMsg() + ", logId = " + mVar.mo39311a("x-tt-logid"));
        }
        return rawServerResult;
    }
}
