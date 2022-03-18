package com.larksuite.component.openplatform.core.plugin.media;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.option.previewImage.AbstractC67668a;
import com.tt.option.previewImage.ImageRequest;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67858b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"previewImage"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.media.e */
public class C25042e extends AbstractC65797c {
    public C25042e() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("previewImage");
    }

    /* renamed from: c */
    private List<ImageRequest> m90345c() throws JSONException {
        JSONArray jSONArray = (JSONArray) this.f165820j.mo234984a("requests");
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new ImageRequest(jSONObject.optString("url", null), m90341a(jSONObject.optJSONObject("header")), jSONObject.optString("method", "GET"), jSONObject.optString("body", null)));
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<String> m90343b() throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = (JSONArray) this.f165820j.mo234984a("urls");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            if (string.startsWith("file://")) {
                if (new File(string.substring(7)).exists()) {
                    arrayList.add(jSONArray.getString(i));
                }
            } else if (string.startsWith("http://") || string.startsWith("https://")) {
                arrayList.add(string);
            } else if (string.startsWith("ttfile://")) {
                String c = mo230475h().mo235044c(string);
                if (new File(c).exists()) {
                    arrayList.add("file://" + c);
                }
            } else if (!TextUtils.isEmpty(string)) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private Map m90341a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, jSONObject.getString(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        try {
            AppBrandLogger.m52830i("PreviewImageHandler", "invoke api:");
            List<String> b = m90343b();
            List<ImageRequest> c = m90345c();
            boolean a = C67858b.m263996a(b);
            boolean a2 = C67858b.m263996a(c);
            if (a && a2) {
                AppBrandLogger.m52830i("PreviewImageHandler", "urls and requests is empty");
                mo230481a(ApiCode.PREVIEWIMAGE_INVALID_URLS);
            } else if (a || a2) {
                Activity f = mo230475h().mo235051f();
                if (f != null) {
                    if (!f.isFinishing()) {
                        if (a2) {
                            m90342a(f, b);
                            return;
                        } else {
                            m90344b(f, c);
                            return;
                        }
                    }
                }
                mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                AppBrandLogger.m52830i("PreviewImageHandler", "activity is null or is finishing");
            } else {
                AppBrandLogger.m52830i("PreviewImageHandler", "urls and requests is mutually exclusive");
                mo230481a(ApiCode.PREVIEWIMAGE_URLS_EXCLUSIVE);
            }
        } catch (Exception e) {
            mo230493c(e.getMessage());
            AppBrandLogger.m52829e("PreviewImageHandler", "exception:" + e);
        }
    }

    public C25042e(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: b */
    private void m90344b(Activity activity, List<ImageRequest> list) {
        for (ImageRequest imageRequest : list) {
            if (TextUtils.isEmpty(imageRequest.url)) {
                AppBrandLogger.m52830i("PreviewImageHandler", "invaild url");
                mo230481a(ApiCode.PREVIEWIMAGE_URL_EMPTY);
                return;
            } else if (imageRequest.method != null) {
                imageRequest.method = imageRequest.method.toUpperCase();
                if (!TextUtils.equals("GET", imageRequest.method) && !TextUtils.equals("POST", imageRequest.method)) {
                    AppBrandLogger.m52830i("PreviewImageHandler", "invaild method");
                    mo230481a(ApiCode.PREVIEWIMAGE_INVALID_METHOD);
                    return;
                }
            }
        }
        AppBrandLogger.m52830i("PreviewImageHandler", "startImagePreviewActivity");
        mo230475h().mo235034a(activity, list, 0, new AbstractC67668a() {
            /* class com.larksuite.component.openplatform.core.plugin.media.C25042e.C250431 */

            @Override // com.tt.option.previewImage.AbstractC67668a
            /* renamed from: a */
            public void mo88084a(int i, String str) {
                AppBrandLogger.m52830i("PreviewImageHandler", "onPreviewResult code:" + i + " msg:" + str);
                if (i == 0) {
                    C25042e.this.mo230494j();
                    return;
                }
                C25042e.this.mo230493c("failed to load image");
                AppBrandLogger.m52830i("PreviewImageHandler", "onPreviewResult code:" + i + " msg:" + str);
            }
        });
    }

    /* renamed from: a */
    private void m90342a(Activity activity, List<String> list) {
        String str = (String) this.f165820j.mo234984a("current");
        if (!TextUtils.isEmpty(str) && str.startsWith("ttfile://")) {
            String c = mo230475h().mo235044c(str);
            if (new File(c).exists()) {
                str = "file://" + c;
            }
        }
        if (!list.contains(str)) {
            str = list.get(0);
        }
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = 0;
                break;
            } else if (TextUtils.equals(str, list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        AppBrandLogger.m52830i("PreviewImageHandler", "startImagePreviewActivity");
        if (mo230475h().mo235033a(activity, this.f165820j.mo234988d(), list, i)) {
            mo230494j();
            return;
        }
        mo230493c("");
        AppBrandLogger.m52830i("PreviewImageHandler", "start image preview activity fail");
    }
}
