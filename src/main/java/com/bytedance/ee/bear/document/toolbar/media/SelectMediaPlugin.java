package com.bytedance.ee.bear.document.toolbar.media;

import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.offline.file.p319a.C5938d;
import com.bytedance.ee.bear.document.toolbar.media.impl.SelectedMediaItem;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.p3511d.AbstractC70020b;

public class SelectMediaPlugin extends DocumentPluginV2 {
    public AbstractC7947h selectMediaCallback;
    private final C6233c selectMediaModule = new C6233c(new AbstractC6232b() {
        /* class com.bytedance.ee.bear.document.toolbar.media.SelectMediaPlugin.C62281 */

        @Override // com.bytedance.ee.bear.document.toolbar.media.AbstractC6232b
        /* renamed from: a */
        public FragmentActivity mo25168a() {
            return SelectMediaPlugin.this.getHost().mo19564f();
        }

        @Override // com.bytedance.ee.bear.document.toolbar.media.AbstractC6232b
        /* renamed from: b */
        public boolean mo25171b() {
            DocumentMetadata documentMetadata = SelectMediaPlugin.this.getDocumentMetadata();
            if (documentMetadata.isType(C8275a.f22371d) || documentMetadata.isType(C8275a.f22378k)) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.ee.bear.document.toolbar.media.AbstractC6232b
        /* renamed from: a */
        public Disposable mo25169a(List<SelectedMediaItem> list) {
            if (SelectMediaPlugin.this.selectMediaCallback == null) {
                C13479a.m54758a("SelectMediaPlugin", "insertMedias(): failed cause selectMediaCallback is null ");
                return null;
            }
            SelectMediaPlugin selectMediaPlugin = SelectMediaPlugin.this;
            return selectMediaPlugin.doInsertMediasInternal(list, selectMediaPlugin.selectMediaCallback);
        }

        @Override // com.bytedance.ee.bear.document.toolbar.media.AbstractC6232b
        /* renamed from: a */
        public void mo25170a(String str, JSONObject jSONObject) {
            SelectMediaPlugin.this.getBridge().mo19350a(str, jSONObject, null);
        }
    });

    /* renamed from: com.bytedance.ee.bear.document.toolbar.media.SelectMediaPlugin$a */
    private class C6229a implements AbstractC7945d<Void> {
        private C6229a() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            SelectMediaPlugin.this.selectMediaCallback = hVar;
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.toolbar.media.SelectMediaPlugin$b */
    private class C6230b implements AbstractC7945d<Void> {
        private C6230b() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            SelectMediaPlugin.this.selectMediaCallback = hVar;
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.selectMedia", new C6230b());
        map.put("biz.util.selectImage", new C6229a());
    }

    private String encodeUrl(SelectedMediaItem selectedMediaItem) {
        String mediaFile = selectedMediaItem.getMediaFile();
        return "docsource://com.bytedance.net/file/f/" + selectedMediaItem.getUuid() + mediaFile.substring(mediaFile.lastIndexOf("."));
    }

    private JSONObject buildJsonData(List<SelectedMediaItem> list) {
        JSONArray jSONArray = new JSONArray();
        for (SelectedMediaItem selectedMediaItem : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("contentType", (Object) selectedMediaItem.getContentType());
            jSONObject.put("uuid", (Object) selectedMediaItem.getUuid());
            jSONObject.put("src", (Object) encodeUrl(selectedMediaItem));
            jSONObject.put("width", (Object) Integer.valueOf(selectedMediaItem.getWidth()));
            jSONObject.put("height", (Object) Integer.valueOf(selectedMediaItem.getHeight()));
            jSONObject.put("duration", (Object) Long.valueOf(selectedMediaItem.getDuration()));
            jSONObject.put("fileSize", (Object) Long.valueOf(selectedMediaItem.getFileSize()));
            jSONObject.put("fileName", (Object) selectedMediaItem.getFileName());
            jSONArray.add(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", (Object) 0);
        jSONObject2.put("thumbs", (Object) jSONArray);
        C13479a.m54772d("SelectMediaPlugin", "buildJsonData: " + jSONObject2);
        return jSONObject2;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        this.selectMediaModule.mo25176a().mo25174a();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        this.selectMediaModule.mo25176a().mo25175b();
    }

    /* access modifiers changed from: protected */
    public Disposable doInsertMediasInternal(List<SelectedMediaItem> list, AbstractC7947h hVar) {
        return AbstractC68307f.m265083a((Object) list).mo238014c(new Function(list) {
            /* class com.bytedance.ee.bear.document.toolbar.media.$$Lambda$SelectMediaPlugin$LqMqSHJxe6gl1fX3BSWgGAiYtjw */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SelectMediaPlugin.this.lambda$doInsertMediasInternal$0$SelectMediaPlugin(this.f$1, (List) obj);
            }
        }).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(hVar, list) {
            /* class com.bytedance.ee.bear.document.toolbar.media.$$Lambda$SelectMediaPlugin$Hphtdk0AdVfwvV2tKB1wSUXycBA */
            public final /* synthetic */ AbstractC7947h f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SelectMediaPlugin.this.lambda$doInsertMediasInternal$1$SelectMediaPlugin(this.f$1, this.f$2, (Boolean) obj);
            }
        }, $$Lambda$SelectMediaPlugin$nilAlgtF3TM9YoGj0GwWXDhbuHA.INSTANCE);
    }

    public /* synthetic */ AbstractC70020b lambda$doInsertMediasInternal$0$SelectMediaPlugin(List list, List list2) throws Exception {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SelectedMediaItem selectedMediaItem = (SelectedMediaItem) it.next();
            hashMap.put(encodeUrl(selectedMediaItem), selectedMediaItem.getMediaFile());
        }
        return C5938d.m23938a(getDocumentMetadata().getUrl(), (Map<String, String>) hashMap, false);
    }

    public /* synthetic */ void lambda$doInsertMediasInternal$1$SelectMediaPlugin(AbstractC7947h hVar, List list, Boolean bool) throws Exception {
        hVar.mo17188a(buildJsonData(list));
    }
}
