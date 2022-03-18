package com.bytedance.ee.bear.drive.view.preview.excel;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.dao.p351a.C6956b;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.excel.a */
public class C7271a {

    /* renamed from: a */
    private C6880a f19491a;

    /* renamed from: b */
    private C6923a f19492b = C6920b.m27342f().mo27168c();

    /* renamed from: c */
    private Context f19493c;

    /* renamed from: d */
    private C7272b f19494d = new C7272b();

    /* renamed from: a */
    public void mo28438a() {
        this.f19494d.mo28440a();
    }

    /* renamed from: c */
    private boolean m29076c(C7086a aVar) {
        Iterator<String> it = m29077d(aVar).iterator();
        while (it.hasNext()) {
            if (m29073a(aVar, it.next()) instanceof ExcelDownloadCancelException) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo28437a(C7086a aVar) {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function(aVar) {
            /* class com.bytedance.ee.bear.drive.view.preview.excel.$$Lambda$a$s0T21GUxHRLrRzcfW_nc5oF26o */
            public final /* synthetic */ C7086a f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7271a.this.m29072a(this.f$1, (Boolean) obj);
            }
        });
    }

    /* renamed from: b */
    private void m29075b(C7086a aVar) {
        ExcelMeta excelMeta = new ExcelMeta();
        excelMeta.setIndex(0);
        excelMeta.setApiPrefix(aVar.mo27340g());
        excelMeta.setPreviewExtra(aVar.mo27339f());
        C6956b bVar = new C6956b();
        bVar.mo27465a("PREVIEW_META_DATA_SUB_ID");
        bVar.mo27469c(aVar.mo27322a().f19098q);
        bVar.mo27467b(aVar.mo27322a().f18785a);
        bVar.mo27473e(JSON.toJSONString(excelMeta));
        this.f19491a.mo27078a(bVar);
    }

    /* renamed from: d */
    private ArrayList<String> m29077d(C7086a aVar) {
        long excel_tab_data_max_size = ((long) this.f19492b.mo27227i().getExcel_tab_data_max_size()) * 1024;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("style");
        ExcelPreviewExtraBean excelPreviewExtraBean = (ExcelPreviewExtraBean) JSON.parseObject(aVar.mo27339f(), ExcelPreviewExtraBean.class);
        if (C13657b.m55421a(excelPreviewExtraBean.getSheets())) {
            C13479a.m54758a("ExcelCacheDownloadManager", "getSubIdList getSheets is empty");
            return arrayList;
        }
        for (int i = 0; i < excelPreviewExtraBean.getSheets().size(); i++) {
            if (excelPreviewExtraBean.getSheets().get(i).getSize() < excel_tab_data_max_size) {
                arrayList.add(String.valueOf(i));
            }
        }
        arrayList.removeAll(m29074a(aVar.mo27322a().f18785a, aVar.mo27322a().f19098q));
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m29072a(C7086a aVar, Boolean bool) throws Exception {
        if (m29076c(aVar)) {
            m29075b(aVar);
        }
        return true;
    }

    /* renamed from: a */
    private ArrayList<String> m29074a(String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (C6956b bVar : this.f19491a.mo27085a("", str, str2)) {
            arrayList.add(bVar.mo27464a());
        }
        return arrayList;
    }

    /* renamed from: a */
    private Object m29073a(C7086a aVar, String str) {
        try {
            return this.f19494d.mo28439a(aVar.mo27340g(), this.f19491a, C6880a.m27106e(this.f19493c).getAbsolutePath(), "", aVar.mo27322a().f18785a, aVar.mo27322a().f19098q, str, aVar.mo27322a().mo27363f(), DrivePriority.DownloadPriority.MANUAL_OFFLINE).mo238023d();
        } catch (Exception e) {
            C13479a.m54759a("ExcelCacheDownloadManager", "downloadSubCache failed, subId = " + str, e);
            return e;
        }
    }

    public C7271a(C6880a aVar, C10917c cVar, Context context) {
        this.f19491a = aVar;
        this.f19493c = context;
    }
}
