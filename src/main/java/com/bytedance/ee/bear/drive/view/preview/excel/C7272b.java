package com.bytedance.ee.bear.drive.view.preview.excel;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.dao.p351a.C6956b;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.C7045g;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.util.p700c.C13602d;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.excel.b */
public class C7272b {

    /* renamed from: a */
    public List<String> f19495a = new ArrayList();

    /* renamed from: a */
    public void mo28440a() {
        if (!C13657b.m55421a(this.f19495a)) {
            ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19657a((ArrayList) this.f19495a);
        }
    }

    /* renamed from: a */
    public static String m29081a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", (Object) str);
        jSONObject.put("value", (Object) str2);
        return Base64.encodeToString(jSONObject.toJSONString().getBytes(), 2);
    }

    /* renamed from: a */
    public static boolean m29082a(AbstractC7095c cVar, String str, String str2, String str3) {
        if (!cVar.mo27721j(str, null) || !cVar.mo27720i(str2, null) || !TextUtils.isEmpty(str3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C6956b m29080a(C6880a aVar, String str, String str2, String str3, String str4, String str5, String str6) {
        C6956b bVar = new C6956b();
        bVar.mo27475f(str2);
        bVar.mo27467b(str3);
        bVar.mo27469c(str4);
        bVar.mo27465a(str5);
        bVar.mo27473e(str6);
        aVar.mo27078a(bVar);
        return bVar;
    }

    /* renamed from: a */
    public AbstractC68307f<String> mo28439a(String str, final C6880a aVar, String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final DrivePriority.DownloadPriority downloadPriority) {
        final String uri = Uri.parse(str).buildUpon().appendQueryParameter("sub_id", str6).build().toString();
        final File file = new File(str2, C13602d.m55222a(str3 + str4 + str5 + str6));
        return AbstractC68307f.m265080a(new AbstractC68324h<String>() {
            /* class com.bytedance.ee.bear.drive.view.preview.excel.C7272b.C72731 */

            @Override // io.reactivex.AbstractC68324h
            public void subscribe(final AbstractC68323g<String> gVar) {
                C7272b.this.f19495a.add(C7045g.m28049a(uri, file.getAbsolutePath(), downloadPriority, str5, 0, str7, new DownloadCallback() {
                    /* class com.bytedance.ee.bear.drive.view.preview.excel.C7272b.C72731.C72741 */

                    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
                    public boolean onFailed(String str, int i) {
                        AbstractC68323g gVar = gVar;
                        gVar.onError(new Exception("fetchDataByRust onFailed, errorCode = " + i));
                        return false;
                    }

                    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
                    public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
                        if (status == DriveFile.Status.SUCCESS) {
                            C6956b bVar = new C6956b();
                            bVar.mo27475f(str3);
                            bVar.mo27467b(str4);
                            bVar.mo27469c(str2);
                            bVar.mo27465a(str6);
                            bVar.mo27471d(file.getAbsolutePath());
                            aVar.mo27078a(bVar);
                            gVar.onNext(file.getAbsolutePath());
                            gVar.onComplete();
                            return false;
                        } else if (status == DriveFile.Status.CANCEL) {
                            gVar.onError(new ExcelDownloadCancelException("fetchDataByRust cancel download"));
                            return false;
                        } else if (status != DriveFile.Status.FAILED) {
                            return false;
                        } else {
                            gVar.onError(new Exception("fetchDataByRust onFailed, errorCode = DriveFile.Status.FAILED"));
                            return false;
                        }
                    }
                }));
            }
        }, BackpressureStrategy.BUFFER);
    }
}
