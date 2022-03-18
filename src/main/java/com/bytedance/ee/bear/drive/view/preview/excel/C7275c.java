package com.bytedance.ee.bear.drive.view.preview.excel;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.dao.p351a.C6956b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.excel.c */
public class C7275c {

    /* renamed from: a */
    public C6880a f19506a;

    /* renamed from: b */
    public C7553d f19507b;

    /* renamed from: c */
    public C6956b f19508c;

    /* renamed from: d */
    public ExcelMeta f19509d;

    /* renamed from: e */
    public AbstractC7278a f19510e;

    /* renamed from: f */
    public String f19511f;

    /* renamed from: g */
    public C7272b f19512g;

    /* renamed from: h */
    private C6923a f19513h = C6920b.m27342f().mo27168c();

    /* renamed from: i */
    private Context f19514i;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.excel.c$a */
    public interface AbstractC7278a {
        void onFirstLoadFile(C6956b bVar);
    }

    /* renamed from: b */
    public void mo28445b() {
        this.f19512g.mo28440a();
    }

    /* renamed from: a */
    public String mo28443a() {
        int excel_tab_data_max_size = this.f19513h.mo27227i().getExcel_tab_data_max_size() * 1024;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiPrefix", (Object) this.f19509d.getApiPrefix());
            jSONObject.put("index", (Object) Integer.valueOf(this.f19509d.getIndex()));
            jSONObject.put("previewExtra", (Object) this.f19509d.getPreviewExtra());
            jSONObject.put("platform", (Object) "mobile");
            jSONObject.put("resourcePrefix", (Object) "file:///android_asset/excel/");
            jSONObject.put("copyable", (Object) true);
            jSONObject.put("perTabMaxSize", (Object) Integer.valueOf(excel_tab_data_max_size));
            jSONObject.put("sizeExceededTipsText", (Object) this.f19514i.getResources().getString(R.string.Drive_Drive_ExcelTooLargeTips));
            return jSONObject.toJSONString();
        } catch (Exception e) {
            C13479a.m54759a("ExcelRenderModel", "getInitialData failed", e);
            return "";
        }
    }

    /* renamed from: b */
    public Disposable mo28444b(String str) {
        return AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.drive.view.preview.excel.$$Lambda$c$LneJDaHih4yn7olwDoWJPXixXvQ */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7275c.lambda$LneJDaHih4yn7olwDoWJPXixXvQ(C7275c.this, this.f$1, (String) obj);
            }
        }, new Consumer(str) {
            /* class com.bytedance.ee.bear.drive.view.preview.excel.$$Lambda$c$g47c5EYl2IZxoOGpGBprB8T3e5A */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7275c.lambda$g47c5EYl2IZxoOGpGBprB8T3e5A(this.f$0, (Throwable) obj);
            }
        });
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo28441a(C7553d dVar) {
        this.f19507b = dVar;
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function<String, Boolean>() {
            /* class com.bytedance.ee.bear.drive.view.preview.excel.C7275c.C72761 */

            /* renamed from: a */
            public Boolean apply(String str) {
                C6956b a = C7275c.this.f19506a.mo27077a(C7275c.this.f19507b.mo29496o(), C7275c.this.f19507b.mo29479b(), C7275c.this.f19507b.mo29476a(), "PREVIEW_META_DATA_SUB_ID");
                if (a != null) {
                    C13479a.m54764b("ExcelRenderModel", "find excelSubCacheModel");
                    C7275c.this.f19508c = a;
                    C7275c.this.f19509d = (ExcelMeta) JSON.parseObject(a.mo27472e(), ExcelMeta.class);
                } else {
                    C13479a.m54764b("ExcelRenderModel", "add a new excelSubCacheModel");
                    C7275c.this.f19509d = new ExcelMeta();
                    C7275c.this.f19509d.setIndex(0);
                    C7275c.this.f19509d.setApiPrefix(C7275c.this.f19507b.mo29487f().values().iterator().next());
                    C7275c.this.f19509d.setPreviewExtra(C7275c.this.f19507b.mo29489h());
                    C7275c cVar = C7275c.this;
                    cVar.f19508c = C7272b.m29080a(cVar.f19506a, C7275c.this.f19511f, C7275c.this.f19507b.mo29496o(), C7275c.this.f19507b.mo29479b(), C7275c.this.f19507b.mo29476a(), "PREVIEW_META_DATA_SUB_ID", JSON.toJSONString(C7275c.this.f19509d));
                    if (C7275c.this.f19510e != null) {
                        C7275c.this.f19510e.onFirstLoadFile(C7275c.this.f19508c);
                    }
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    public AbstractC68307f<String> mo28442a(final String str) {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238014c(new Function<String, AbstractC70020b<String>>() {
            /* class com.bytedance.ee.bear.drive.view.preview.excel.C7275c.C72772 */

            /* renamed from: a */
            public AbstractC70020b<String> apply(String str) {
                C6956b a = C7275c.this.f19506a.mo27077a(C7275c.this.f19507b.mo29496o(), C7275c.this.f19507b.mo29479b(), C7275c.this.f19507b.mo29476a(), str);
                if (a == null) {
                    return C7275c.this.f19512g.mo28439a(C7275c.this.f19509d.getApiPrefix(), C7275c.this.f19506a, C7275c.this.f19511f, C7275c.this.f19507b.mo29496o(), C7275c.this.f19507b.mo29479b(), C7275c.this.f19507b.mo29476a(), str, C7275c.this.f19507b.mo29499r(), DrivePriority.DownloadPriority.PREVIEW);
                }
                String d = a.mo27470d();
                C13479a.m54764b("ExcelRenderModel", "get cache form local file, subId = " + str);
                return AbstractC68307f.m265083a(d);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29085a(String str, String str2) throws Exception {
        this.f19509d.setIndex(Integer.valueOf(str).intValue());
        this.f19508c.mo27473e(JSON.toJSONString(this.f19509d));
        this.f19506a.mo27078a(this.f19508c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m29086a(String str, Throwable th) throws Exception {
        C13479a.m54759a("ExcelRenderModel", "changeIndex failed, index = " + str, th);
    }

    public C7275c(C6880a aVar, C10917c cVar, Context context, AbstractC7278a aVar2) {
        this.f19506a = aVar;
        this.f19510e = aVar2;
        this.f19511f = C6880a.m27106e(context).getAbsolutePath();
        this.f19514i = context;
        this.f19512g = new C7272b();
    }
}
