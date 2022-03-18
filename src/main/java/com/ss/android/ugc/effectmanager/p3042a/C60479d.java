package com.ss.android.ugc.effectmanager.p3042a;

import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.common.C60499b;
import com.ss.android.ugc.effectmanager.common.C60512d;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.p3051f.C60515a;
import com.ss.android.ugc.effectmanager.download.IModelDownloader;
import com.ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import com.ss.android.ugc.effectmanager.p3055e.C60557i;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.effectmanager.a.d */
public class C60479d implements IModelDownloader {

    /* renamed from: a */
    private C60468b f151144a;

    /* renamed from: b */
    private C60515a f151145b;

    public C60479d(C60468b bVar, C60515a aVar) {
        this.f151144a = bVar;
        this.f151145b = aVar;
    }

    /* renamed from: b */
    private InputStream m234975b(ModelInfo modelInfo, FetchModelType fetchModelType, MonitorTrace bVar) {
        Iterator<String> it = modelInfo.getFile_url().getUrl(C60557i.m235416a(fetchModelType)).iterator();
        String str = "";
        while (it.hasNext()) {
            String next = it.next();
            EPMonitor.m235192a(bVar, "ModelDownloader#generateInputStream, downloadUrl = " + next);
            try {
                return this.f151145b.mo207213a(new C60499b("GET", next, false));
            } catch (Exception e) {
                str = "download model: with type " + fetchModelType + ", with url " + next + " failed " + e.getMessage();
                EPMonitor.m235192a(bVar, "ModelDownloader#generateInputStream, exception occurred, errorMessage= " + str);
            }
        }
        throw new RuntimeException(str);
    }

    @Override // com.ss.android.ugc.effectmanager.download.IModelDownloader
    /* renamed from: a */
    public synchronized long mo207042a(ModelInfo modelInfo, FetchModelType fetchModelType, MonitorTrace bVar) {
        long a;
        ExtendedUrlModel fileUrl = modelInfo.getFileUrl();
        if (fileUrl.getUrlList() == null || fileUrl.getUrlList().isEmpty()) {
            fetchModelType = FetchModelType.ZIP;
        }
        if (fileUrl.getZipUrlList() == null || fileUrl.getZip_url_list().isEmpty()) {
            fetchModelType = FetchModelType.ORIGIN;
        }
        String a2 = C60512d.m235164a(modelInfo);
        InputStream b = m234975b(modelInfo, fetchModelType, bVar);
        EPMonitor.m235192a(bVar, "ModelDownloader#download, network request success!");
        ArrayList<String> b2 = this.f151144a.mo207021b(modelInfo.getName());
        try {
            a = this.f151144a.mo207016a(fetchModelType, a2, b, MessageDigest.getInstance("MD5"), modelInfo.getFile_url().getUri(), bVar);
            EPMonitor.m235192a(bVar, "ModelDownloader#download, writeModelToDisk fileSize = " + a);
            EPMonitor.m235192a(bVar, "ModelDownloader#download, try clean old model, existingModels.size = " + b2.size());
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                String str = b2.get(i);
                try {
                    this.f151144a.mo207022c(str);
                    EPMonitor.m235192a(bVar, "ModelDownloader#download, delete old model success, modelName = " + str);
                } catch (Exception e) {
                    EPMonitor.m235192a(bVar, "ModelDownloader#download, delete old model failed, modelName = " + str + ", cause = " + e.getMessage());
                }
            }
            if (b != null) {
                try {
                    b.close();
                } catch (IOException unused) {
                }
            }
        } catch (NoSuchAlgorithmException e2) {
            EPMonitor.m235192a(bVar, "ModelDownloader#download, NoSuchAlgorithmException occurred, cause = " + e2.getMessage());
            throw new AssertionError();
        } catch (RuntimeException e3) {
            EPMonitor.m235192a(bVar, "ModelDownloader#download, RuntimeException occurred, cause = " + e3.getMessage());
            throw new RuntimeException("convertStreamToFile: with type: " + fetchModelType + ",with name: " + a2 + " failed. " + e3.getMessage(), e3);
        } catch (Throwable th) {
            if (b != null) {
                try {
                    b.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
        return a;
    }
}
