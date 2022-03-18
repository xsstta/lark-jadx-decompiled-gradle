package com.bytedance.ee.bear.document.toolbar.file;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.offline.file.p319a.C5938d;
import com.bytedance.ee.bear.document.toolbar.file.SelectFilePlugin;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.fileselector.api.FileType;
import com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener;
import com.bytedance.ee.bear.fileselector.listener.SimpleFileSizeCheckListener;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.koin.java.KoinJavaComponent;

public class SelectFilePlugin extends DocumentPlugin implements AbstractC7664b {
    public Disposable disposable;
    private AbstractC10740f routeService;
    public C6223a selectFileHandler;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.toolbar.file.SelectFilePlugin$a */
    public class C6223a implements AbstractC7945d<Void> {

        /* renamed from: b */
        private AbstractC7947h f17309b;

        private C6223a() {
        }

        /* renamed from: a */
        public void mo25161a(JSONObject jSONObject) {
            AbstractC7947h hVar = this.f17309b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m25073a(Throwable th) throws Exception {
            C13479a.m54773d("SelectFilePlugin", "saveFilesFlow fail ", th);
            Toast.showFailureText(SelectFilePlugin.this.getContext(), (int) R.string.CreationMobile_Docs_Operation_Failed_Tips);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m25072a(JSONArray jSONArray, Boolean bool) throws Exception {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) 0);
            jSONObject.put("thumbs", (Object) jSONArray);
            SelectFilePlugin.this.selectFileHandler.mo25161a(jSONObject);
        }

        /* renamed from: a */
        public void handle(Void r3, AbstractC7947h hVar) {
            this.f17309b = hVar;
            FragmentActivity f = ((C6095s) SelectFilePlugin.this.getHost()).mo19564f();
            FileSelectorManager.m31232a(f, f.getSupportFragmentManager(), ((FileSelectConfig.C7790e) ((FileSelectConfig.C7790e) FileSelectConfig.filePickerBuilder().mo30477a(f.getResources().getString(R.string.Doc_Facade_Upload)).mo30459a(new SimpleFileSelectListener() {
                /* class com.bytedance.ee.bear.document.toolbar.file.SelectFilePlugin.C6223a.C62252 */

                @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
                /* renamed from: a */
                public void mo25164a(List<String> list, boolean z) {
                    C6223a.this.mo25163a(list, z);
                }
            })).mo30456a(new SimpleFileSizeCheckListener() {
                /* class com.bytedance.ee.bear.document.toolbar.file.SelectFilePlugin.C6223a.C62241 */

                @Override // com.bytedance.ee.bear.fileselector.listener.SimpleFileSizeCheckListener, com.bytedance.ee.bear.fileselector.listener.IFileSizeCheckListener
                public void onFileOverSize(FileType fileType) {
                    Toast.showFailureText(SelectFilePlugin.this.getContext(), (int) R.string.CreationMobile_Upload_Error_File_TooLarge_Tips);
                    C13479a.m54775e("SelectFilePlugin", "File length is over size.");
                }
            })).mo30476a(-2147483648L).mo30455a(), "SelectFilePlugin");
        }

        /* renamed from: a */
        public void mo25163a(List<String> list, boolean z) {
            if (SelectFilePlugin.this.selectFileHandler.f17309b == null) {
                C13479a.m54775e("SelectFilePlugin", "callback is null.");
            } else if (C13657b.m55421a(list)) {
                C13479a.m54758a("SelectFilePlugin", "handleResult, filePointerList is empty");
            } else {
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                for (String str : list) {
                    long c = C13675f.m55519c(z, str);
                    String uuid = UUID.randomUUID().toString();
                    String encodeUrl = SelectFilePlugin.this.encodeUrl(uuid, C13675f.m55491a(z, str));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("contentType", (Object) "file");
                    jSONObject.put("uuid", (Object) uuid);
                    jSONObject.put("src", (Object) encodeUrl);
                    jSONObject.put("fileSize", (Object) Long.valueOf(c));
                    jSONObject.put("fileName", (Object) C13675f.m55511b(z, str));
                    jSONArray.add(jSONObject);
                    hashMap.put(encodeUrl, str);
                }
                SelectFilePlugin selectFilePlugin = SelectFilePlugin.this;
                selectFilePlugin.disposable = C5938d.m23938a(selectFilePlugin.getDocViewModel().getUrl(), hashMap, z).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(jSONArray) {
                    /* class com.bytedance.ee.bear.document.toolbar.file.$$Lambda$SelectFilePlugin$a$zHBBqYEDFV9fp2BeaUiVMLZ_yTw */
                    public final /* synthetic */ JSONArray f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SelectFilePlugin.C6223a.this.m25072a((SelectFilePlugin.C6223a) this.f$1, (JSONArray) ((Boolean) obj));
                    }
                }, new Consumer() {
                    /* class com.bytedance.ee.bear.document.toolbar.file.$$Lambda$SelectFilePlugin$a$f_xjkKspGrW5ZpJnsBr0nOpsCsQ */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SelectFilePlugin.C6223a.this.m25073a((SelectFilePlugin.C6223a) ((Throwable) obj));
                    }
                });
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        C6223a aVar = new C6223a();
        this.selectFileHandler = aVar;
        map.put("biz.util.selectFile", aVar);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.routeService = (AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class);
    }

    public String encodeUrl(String str, String str2) {
        return "docsource://com.bytedance.net/file/f/" + str + "." + str2;
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        Disposable disposable2 = this.disposable;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.disposable.dispose();
        }
    }
}
