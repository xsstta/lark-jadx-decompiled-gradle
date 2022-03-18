package com.larksuite.component.openplatform.core.plugin.media;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.option.previewImage.AbstractC67668a;
import com.tt.option.previewImage.ImageRequest;
import com.tt.refer.common.util.C67858b;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.impl.business.file.UriUtil;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PreviewImageHandlerPlugin extends OPPlugin {
    public ILogger mILogger;

    /* access modifiers changed from: private */
    public static class PreviewImageHandlerRequest extends C25920a {
        @JSONField(name = "current")
        public String current;
        @JSONField(name = "header")
        public JSONObject header;
        @JSONField(name = "originUrls")
        public JSONArray originUrls;
        @JSONField(name = "placeHolderUrls")
        public JSONArray placeHolderUrls;
        @JSONField(name = "requests")
        public JSONArray requests;
        @JSONField(name = "urls")
        public JSONArray urls;

        private PreviewImageHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class PreviewImageHandlerResponse extends C25921b {
        private PreviewImageHandlerResponse() {
        }
    }

    public void callbackOk(AbstractC25897h<PreviewImageHandlerResponse> hVar) {
        hVar.callback(new PreviewImageHandlerResponse());
    }

    private List<ImageRequest> handleImageRequest(PreviewImageHandlerRequest previewImageHandlerRequest) {
        JSONArray jSONArray = previewImageHandlerRequest.requests;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new ImageRequest(jSONObject.getString("url"), parseJsonObjectToMap(jSONObject.getJSONObject("header")), jSONObject.getString("method"), jSONObject.getString("body")));
        }
        return arrayList;
    }

    private Map parseJsonObjectToMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            hashMap.put(str, jSONObject.getString(str));
        }
        return hashMap;
    }

    private List<String> handleUrls(PreviewImageHandlerRequest previewImageHandlerRequest) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = previewImageHandlerRequest.urls;
        if (jSONArray == null) {
            return null;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            String string = jSONArray.getString(i);
            if (string.startsWith("file://")) {
                if (new File(string.substring(7)).exists()) {
                    arrayList.add(jSONArray.getString(i));
                }
            } else if (string.startsWith("http://") || string.startsWith("https://")) {
                arrayList.add(string);
            } else if (string.startsWith("ttfile://")) {
                String c = getApiDependency().mo235044c(string);
                if (new File(c).exists()) {
                    arrayList.add("file://" + c);
                }
            } else if (!TextUtils.isEmpty(string)) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    private String standardGetCurrent(LKEvent lKEvent, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri a = UriUtil.m264453a(str);
        if (TextUtils.isEmpty(str) || !UriUtil.m264454a(a, "ttfile")) {
            return str;
        }
        ILogger b = lKEvent.mo92134c().mo92190b();
        try {
            File i = ((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235635i(new TTFile(str), new TTFileContext(lKEvent.mo92134c().mo92188a(), "previewImage"));
            if (i != null) {
                return UriUtil.m264455b(i.getAbsolutePath()).toString();
            }
            b.mo92225w("PreviewImageHandlerPlugin", "getSystemFile return null, current:" + str);
            return str;
        } catch (TTFileException e) {
            b.mo92223e("PreviewImageHandlerPlugin", "get readable current exception, current", e);
            return str;
        }
    }

    private List<String> standardHandleUrls(PreviewImageHandlerRequest previewImageHandlerRequest, LKEvent lKEvent, ILogger aVar) {
        AbstractC67722a aVar2 = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = previewImageHandlerRequest.urls;
        if (jSONArray == null) {
            return null;
        }
        TTFileContext hVar = new TTFileContext(lKEvent.mo92134c().mo92188a(), "previewImage");
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            String string = jSONArray.getString(i);
            Uri a = UriUtil.m264453a(string);
            if (UriUtil.m264454a(a, "file")) {
                if (new File(string.substring(7)).exists()) {
                    arrayList.add(jSONArray.getString(i));
                }
            } else if (UriUtil.m264454a(a, "http") || UriUtil.m264454a(a, "https")) {
                arrayList.add(string);
            } else if (UriUtil.m264454a(a, "ttfile")) {
                try {
                    File i2 = aVar2.mo235635i(new TTFile(string), hVar);
                    if (i2 != null) {
                        Uri b = UriUtil.m264455b(i2.getAbsolutePath());
                        if (b != null) {
                            arrayList.add(b.toString());
                        }
                    } else {
                        AppBrandLogger.m52831w("PreviewImageHandlerPlugin", "get system file return null, file:" + string);
                    }
                } catch (TTFileException e) {
                    AppBrandLogger.m52829e("PreviewImageHandlerPlugin", "getSystemFile exception", e);
                }
            } else if (!TextUtils.isEmpty(string)) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    private void previewImageWithRequests(Activity activity, List<ImageRequest> list, LKEvent lKEvent, final AbstractC25897h<PreviewImageHandlerResponse> hVar) {
        final PreviewImageHandlerResponse previewImageHandlerResponse = new PreviewImageHandlerResponse();
        for (ImageRequest imageRequest : list) {
            if (TextUtils.isEmpty(imageRequest.url)) {
                this.mILogger.mo92224i("PreviewImageHandlerPlugin", "invalid url");
                fillFailedResponse(previewImageHandlerResponse, C25906a.f64072b, "invalid url");
                hVar.callback(previewImageHandlerResponse);
                return;
            } else if (imageRequest.method != null) {
                imageRequest.method = imageRequest.method.toUpperCase();
                if (!TextUtils.equals("GET", imageRequest.method) && !TextUtils.equals("POST", imageRequest.method)) {
                    this.mILogger.mo92224i("PreviewImageHandlerPlugin", "invalid method");
                    fillFailedResponse(previewImageHandlerResponse, C25906a.f64072b, "invalid method");
                    hVar.callback(previewImageHandlerResponse);
                    return;
                }
            }
        }
        this.mILogger.mo92224i("PreviewImageHandlerPlugin", "startImagePreviewActivity");
        getApiDependency().mo235034a(activity, list, 0, new AbstractC67668a() {
            /* class com.larksuite.component.openplatform.core.plugin.media.PreviewImageHandlerPlugin.C250221 */

            @Override // com.tt.option.previewImage.AbstractC67668a
            /* renamed from: a */
            public void mo88084a(int i, String str) {
                ILogger aVar = PreviewImageHandlerPlugin.this.mILogger;
                aVar.mo92224i("PreviewImageHandlerPlugin", "onPreviewResult code:" + i + " msg:" + str);
                if (i == 0) {
                    PreviewImageHandlerPlugin.this.callbackOk(hVar);
                    return;
                }
                PreviewImageHandlerPlugin previewImageHandlerPlugin = PreviewImageHandlerPlugin.this;
                PreviewImageHandlerResponse previewImageHandlerResponse = previewImageHandlerResponse;
                C25906a aVar2 = C25906a.f64080j;
                previewImageHandlerPlugin.fillFailedResponse(previewImageHandlerResponse, aVar2, "onPreviewResult code:" + i + " msg:" + str);
                hVar.callback(previewImageHandlerResponse);
                ILogger aVar3 = PreviewImageHandlerPlugin.this.mILogger;
                aVar3.mo92224i("PreviewImageHandlerPlugin", "onPreviewResult code:" + i + " msg:" + str);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"previewImage"})
    public void PreviewImageHandlerAsync(LKEvent lKEvent, PreviewImageHandlerRequest previewImageHandlerRequest, ILogger aVar, AbstractC25897h<PreviewImageHandlerResponse> hVar) {
        List<String> list;
        this.mILogger = aVar;
        PreviewImageHandlerResponse previewImageHandlerResponse = new PreviewImageHandlerResponse();
        try {
            this.mILogger.mo92224i("PreviewImageHandlerPlugin", "invoke api:");
            if (TTFileHelper.m264259a("previewImage", getAppContext())) {
                list = standardHandleUrls(previewImageHandlerRequest, lKEvent, aVar);
            } else {
                list = handleUrls(previewImageHandlerRequest);
            }
            List<ImageRequest> handleImageRequest = handleImageRequest(previewImageHandlerRequest);
            boolean a = C67858b.m263996a(list);
            boolean a2 = C67858b.m263996a(handleImageRequest);
            if (a && a2) {
                this.mILogger.mo92224i("PreviewImageHandlerPlugin", "urls and requests is empty");
                fillFailedResponse(previewImageHandlerResponse, C25906a.f64072b, "urls and requests is empty");
                hVar.callback(previewImageHandlerResponse);
            } else if (a || a2) {
                Activity f = getApiDependency().mo235051f();
                if (f != null) {
                    if (!f.isFinishing()) {
                        if (a2) {
                            previewImageWithUrls(f, previewImageHandlerRequest, list, lKEvent, hVar);
                            return;
                        } else {
                            previewImageWithRequests(f, handleImageRequest, lKEvent, hVar);
                            return;
                        }
                    }
                }
                fillFailedResponse(previewImageHandlerResponse, C25906a.f64080j, "activity is null or is finishing");
                hVar.callback(previewImageHandlerResponse);
                this.mILogger.mo92224i("PreviewImageHandlerPlugin", "activity is null or is finishing");
            } else {
                this.mILogger.mo92224i("PreviewImageHandlerPlugin", "urls and requests is mutually exclusive");
                fillFailedResponse(previewImageHandlerResponse, C25906a.f64072b, "urls and requests is mutually exclusive");
                hVar.callback(previewImageHandlerResponse);
            }
        } catch (Exception e) {
            fillFailedResponse(previewImageHandlerResponse, C25906a.f64080j, e.getMessage());
            hVar.callback(previewImageHandlerResponse);
            this.mILogger.mo92223e("PreviewImageHandlerPlugin", "exception:", e);
        }
    }

    private void previewImageWithUrls(Activity activity, PreviewImageHandlerRequest previewImageHandlerRequest, List<String> list, LKEvent lKEvent, AbstractC25897h<PreviewImageHandlerResponse> hVar) {
        String str = previewImageHandlerRequest.current;
        if (TTFileHelper.m264259a("previewImage", getAppContext())) {
            str = standardGetCurrent(lKEvent, str);
        } else if (!TextUtils.isEmpty(str) && str.startsWith("ttfile://")) {
            String c = getApiDependency().mo235044c(str);
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
        this.mILogger.mo92224i("PreviewImageHandlerPlugin", "startImagePreviewActivity");
        if (getApiDependency().mo235033a(activity, previewImageHandlerRequest.toString(), list, i)) {
            callbackOk(hVar);
            return;
        }
        PreviewImageHandlerResponse previewImageHandlerResponse = new PreviewImageHandlerResponse();
        fillFailedResponse(previewImageHandlerResponse, C25906a.f64080j, "start image preview activity fail");
        hVar.callback(previewImageHandlerResponse);
        this.mILogger.mo92224i("PreviewImageHandlerPlugin", "start image preview activity fail");
    }
}
