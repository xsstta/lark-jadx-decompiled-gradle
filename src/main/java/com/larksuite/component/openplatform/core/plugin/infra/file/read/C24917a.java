package com.larksuite.component.openplatform.core.plugin.infra.file.read;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.p3324r.p3325a.C66701c;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.util.C67070z;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.read.a */
public class C24917a extends AbstractC24899a<C66701c.C66702a, C66701c.C66703b> {
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C66701c.C66703b mo87981d() {
        return new C66701c.C66703b(mo87968a(this.f61047a, "fail", mo87980c(this.f61050d)), null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C66701c.C66703b mo87979c() {
        return new C66701c.C66703b(mo87968a(this.f61047a, "ok", null), (String) this.f61051e.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), (ArrayList) this.f61051e.get("__nativeBuffers__"));
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() throws Exception {
        AppBrandLogger.m52830i("ApiReadFileBufferCtrl", "ApiReadFileBufferCtrl handleInvoke apiName=" + this.f61047a);
        String a = mo87967a("filePath");
        String a2 = mo87967a("encoding");
        File file = new File(mo87982d(a));
        if (TextUtils.isEmpty(a)) {
            AppBrandLogger.m52829e("ApiReadFileBufferCtrl", "filePath is empty!");
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (!mo87977b(file)) {
            AppBrandLogger.m52829e("ApiReadFileBufferCtrl", "file cannot be read and filePath=" + a);
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (file.exists() || StreamLoader.loadByteFromStream(a, mo87965a()) != null) {
            this.f61051e = new HashMap();
            if (file.exists()) {
                if (TextUtils.isEmpty(a2) || "null".equals(a2)) {
                    AppBrandLogger.m52830i("ApiReadFileBufferCtrl", "file exist but encoding is not exist, read file with binary.");
                    byte[] b = C67070z.m261399b(file.getAbsolutePath());
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C66701c.C66703b.C66704a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, b));
                    this.f61051e.put("__nativeBuffers__", arrayList);
                } else {
                    AppBrandLogger.m52830i("ApiReadFileBufferCtrl", "file exist and encoding is valid.");
                    this.f61051e.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C67070z.m261389a(file.getAbsolutePath(), a2));
                }
                return true;
            }
            byte[] loadByteFromStream = StreamLoader.loadByteFromStream(a, mo87965a());
            if (loadByteFromStream == null) {
                return false;
            }
            if (TextUtils.isEmpty(a2) || a2.equals("null")) {
                AppBrandLogger.m52830i("ApiReadFileBufferCtrl", "read stream without encode");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C66701c.C66703b.C66704a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, loadByteFromStream));
                this.f61051e.put("__nativeBuffers__", arrayList2);
            } else {
                AppBrandLogger.m52830i("ApiReadFileBufferCtrl", "read stream with encode");
                this.f61051e.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C67070z.m261390a(loadByteFromStream, a2));
            }
            return true;
        } else {
            AppBrandLogger.m52829e("ApiReadFileBufferCtrl", "file is not exist and filePath=" + a);
            this.f61050d = mo87975b(this.f61047a, a);
            return false;
        }
    }

    public C24917a(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C66701c.C66703b mo87966a(Throwable th) {
        String generateThrowableExtraInfo = ApiCallResultHelper.generateThrowableExtraInfo(th);
        C66701c.C66703b bVar = new C66701c.C66703b();
        bVar.f168384a = mo87968a(this.f61047a, "fail", generateThrowableExtraInfo);
        AppBrandLogger.eWithThrowable("ApiReadFileBufferCtrl", "", th);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87972a(C66701c.C66702a aVar) throws Exception {
        String str = aVar.f168382a;
        String str2 = aVar.f168383b;
        Map map = this.f61049c;
        if (C66718d.m260519a(str)) {
            str = "";
        }
        map.put("filePath", new AbstractC24899a.C24900a(str, true));
        Map map2 = this.f61049c;
        if (C66718d.m260519a(str2)) {
            str2 = "";
        }
        map2.put("encoding", new AbstractC24899a.C24900a(str2, false));
    }
}
