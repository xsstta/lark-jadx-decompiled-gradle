package com.bytedance.ee.bear.middleground.docsdk.v2;

import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.toolbar.media.AbstractC6232b;
import com.bytedance.ee.bear.document.toolbar.media.C6233c;
import com.bytedance.ee.bear.document.toolbar.media.impl.SelectedMediaItem;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.AbsEditorSdkPlugin;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.C9344a;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.Disposable;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public class SDKV2SelectImgPlugin extends AbsEditorSdkPlugin {
    public AbstractC7947h selectMediaCallback;
    private final C6233c selectMediaModule = new C6233c(new AbstractC6232b() {
        /* class com.bytedance.ee.bear.middleground.docsdk.v2.SDKV2SelectImgPlugin.C93331 */

        @Override // com.bytedance.ee.bear.document.toolbar.media.AbstractC6232b
        /* renamed from: b */
        public boolean mo25171b() {
            return false;
        }

        @Override // com.bytedance.ee.bear.document.toolbar.media.AbstractC6232b
        /* renamed from: a */
        public FragmentActivity mo25168a() {
            return ((C9344a) SDKV2SelectImgPlugin.this.getHost()).mo19564f();
        }

        @Override // com.bytedance.ee.bear.document.toolbar.media.AbstractC6232b
        /* renamed from: a */
        public Disposable mo25169a(List<SelectedMediaItem> list) {
            if (SDKV2SelectImgPlugin.this.selectMediaCallback != null) {
                SDKV2SelectImgPlugin.this.selectMediaCallback.mo17188a(SDKV2SelectImgPlugin.this.buildJsonData(list));
                return null;
            }
            C13479a.m54758a("SDKV2SelectImgPlugin", "insertMedias(): failed cause selectMediaCallback is null ");
            return null;
        }

        @Override // com.bytedance.ee.bear.document.toolbar.media.AbstractC6232b
        /* renamed from: a */
        public void mo25170a(String str, JSONObject jSONObject) {
            SDKV2SelectImgPlugin.this.execJS(str, jSONObject);
        }
    });

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.SDKV2SelectImgPlugin$a */
    private class C9334a implements AbstractC7945d<Void> {
        private C9334a() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            SDKV2SelectImgPlugin.this.selectMediaCallback = hVar;
        }
    }

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.SDKV2SelectImgPlugin$b */
    private class C9335b implements AbstractC7945d<Void> {
        private C9335b() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            SDKV2SelectImgPlugin.this.selectMediaCallback = hVar;
        }
    }

    public void onAttachToHost(C9344a aVar) {
        super.onAttachToHost((C4943e) aVar);
        this.selectMediaModule.mo25176a().mo25174a();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.selectMedia", new C9335b());
        map.put("biz.util.selectImage", new C9334a());
    }

    public JSONObject buildJsonData(List<SelectedMediaItem> list) {
        JSONArray jSONArray = new JSONArray();
        for (SelectedMediaItem selectedMediaItem : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uuid", (Object) selectedMediaItem.getUuid());
            jSONObject.put("width", (Object) Integer.valueOf(selectedMediaItem.getWidth()));
            jSONObject.put("height", (Object) Integer.valueOf(selectedMediaItem.getHeight()));
            jSONObject.put("src", (Object) selectedMediaItem.getMediaFile());
            jSONArray.add(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", (Object) 0);
        jSONObject2.put("thumbs", (Object) jSONArray);
        return jSONObject2;
    }

    public void onDetachFromUIContainer(C9344a aVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) aVar, nVar);
        this.selectMediaModule.mo25176a().mo25175b();
    }
}
