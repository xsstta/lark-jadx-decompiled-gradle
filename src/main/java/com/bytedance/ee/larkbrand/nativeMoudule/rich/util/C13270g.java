package com.bytedance.ee.larkbrand.nativeMoudule.rich.util;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.RichTextData;
import com.google.firebase.messaging.Constants;
import com.tt.miniapphost.C67432a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.util.g */
public class C13270g {

    /* renamed from: a */
    private String f35148a;

    /* renamed from: b */
    private IAppContext f35149b;

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.util.g$a */
    public static class C13271a {

        /* renamed from: a */
        private JSONObject f35150a = new JSONObject();

        /* renamed from: a */
        public void mo49490a(String str) {
            this.f35150a.remove(str);
        }

        /* renamed from: a */
        public C13271a mo49488a(String str, List<String> list) throws JSONException {
            if (!(TextUtils.isEmpty(str) || list == null || list.size() == 0)) {
                JSONArray jSONArray = new JSONArray();
                for (String str2 : list) {
                    jSONArray.put(str2);
                }
                this.f35150a.put(str, jSONArray);
            }
            return this;
        }

        /* renamed from: a */
        public C13271a mo49489a(String str, RichTextData.AtData[] atDataArr) throws JSONException {
            if (!(atDataArr == null || atDataArr.length == 0)) {
                JSONArray jSONArray = new JSONArray();
                for (RichTextData.AtData atData : atDataArr) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", atData.getId());
                    jSONObject.put("name", atData.getName());
                    jSONObject.put("offset", atData.getOffset());
                    jSONObject.put("length", atData.getLength());
                    jSONArray.put(jSONObject);
                }
                this.f35150a.put(str, jSONArray);
            }
            return this;
        }

        /* renamed from: a */
        public C13271a mo49487a(String str, String str2, boolean z) throws JSONException {
            if (!TextUtils.isEmpty(str) && (!TextUtils.isEmpty(str2) || z)) {
                this.f35150a.put(str, str2);
            }
            return this;
        }

        /* renamed from: a */
        public void mo49491a(String str, String str2, IAppContext iAppContext) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("eventName", str2);
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.f35150a);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String jSONObject2 = jSONObject.toString();
            AppBrandLogger.m52828d("RichTextSender", "EventBuilder content=" + jSONObject2);
            if (TextUtils.isEmpty(str)) {
                str = "richTextEvent";
            }
            C67432a.m262319a(iAppContext).getJsBridge().sendMsgToJsCore(str, jSONObject2);
        }
    }

    public C13270g(String str, IAppContext iAppContext) {
        this.f35148a = str;
        this.f35149b = iAppContext;
    }

    /* renamed from: a */
    public void mo49485a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventName", str);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
            C67432a.m262319a(this.f35149b).getJsBridge().sendMsgToJsCore(this.f35148a, jSONObject.toString());
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("RichTextSender", "send string event error", e);
        }
    }

    /* renamed from: a */
    public void mo49486a(String str, List<String> list) {
        if (list != null && list.size() != 0) {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : list) {
                jSONArray.put(str2);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("eventName", str);
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
                AppBrandLogger.m52828d("RichTextSender", "sendArrayEvent " + str + " content=" + jSONObject.toString());
                C67432a.m262319a(this.f35149b).getJsBridge().sendMsgToJsCore(this.f35148a, jSONObject.toString());
            } catch (Exception e) {
                AppBrandLogger.eWithThrowable("RichTextSender", "send array event error", e);
            }
        }
    }
}
