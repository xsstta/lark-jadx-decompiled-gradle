package com.larksuite.component.openplatform.core.plugin.infra.file.write;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.p3324r.p3325a.C66709e;
import com.tt.miniapp.util.C67070z;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.write.a */
public class C24920a extends AbstractC24899a<C66709e.C66710a, C66709e.C66711b> {

    /* renamed from: g */
    private ByteBuffer f61060g;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C66709e.C66711b mo87979c() {
        C66709e.C66711b bVar = new C66709e.C66711b();
        bVar.f168414a = mo87968a(this.f61047a, "ok", null);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C66709e.C66711b mo87981d() {
        C66709e.C66711b bVar = new C66709e.C66711b();
        bVar.f168414a = mo87968a(this.f61047a, "fail", mo87980c(this.f61050d));
        return bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() throws Exception {
        String a = mo87967a("filePath");
        String a2 = mo87967a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        String a3 = mo87967a("encoding");
        File file = new File(mo87982d(a));
        AppBrandLogger.m52828d("ApiWriteFileBufferCtrl", "filePath ", a, " \n data ", a2, " \n encoding ", a3);
        if (!mo87973a(file)) {
            AppBrandLogger.m52830i("ApiWriteFileBufferCtrl", "the file cannot be write, filePath=" + a);
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (!file.getParentFile().exists()) {
            AppBrandLogger.m52830i("ApiWriteFileBufferCtrl", "the parent is not exist, filePath=" + a);
            this.f61050d = mo87975b(this.f61047a, a);
            return false;
        } else {
            ByteBuffer byteBuffer = this.f61060g;
            if (byteBuffer != null) {
                if (mo87984f().mo235031a(C67070z.m261384a(byteBuffer))) {
                    AppBrandLogger.m52830i("ApiWriteFileBufferCtrl", "buffer data is not null, user dir saved file size limit exceeded");
                    this.f61050d = "user dir saved file size limit exceeded";
                    return false;
                }
                C67070z.m261395a(file.getAbsolutePath(), this.f61060g);
                return true;
            } else if (TextUtils.isEmpty(a2) || a2.getBytes() == null) {
                AppBrandLogger.m52830i("ApiWriteFileBufferCtrl", "data and nativeBuffer is empty");
                return true;
            } else {
                if (mo87984f().mo235031a((long) a2.getBytes().length)) {
                    AppBrandLogger.m52830i("ApiWriteFileBufferCtrl", "data is not null, user dir saved file size limit exceeded");
                    this.f61050d = "user dir saved file size limit exceeded";
                    return false;
                }
                C67070z.m261394a(file.getAbsolutePath(), a2, a3);
                return true;
            }
        }
    }

    public C24920a(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C66709e.C66711b mo87966a(Throwable th) {
        AppBrandLogger.m52829e("ApiWriteFileBufferCtrl", "", th);
        String generateThrowableExtraInfo = ApiCallResultHelper.generateThrowableExtraInfo(th);
        C66709e.C66711b bVar = new C66709e.C66711b();
        bVar.f168414a = mo87968a(this.f61047a, "fail", generateThrowableExtraInfo);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87972a(C66709e.C66710a aVar) throws Exception {
        String str = aVar.f168410a;
        Map map = this.f61049c;
        String str2 = "";
        if (C66718d.m260519a(str)) {
            str = str2;
        }
        map.put("filePath", new AbstractC24899a.C24900a(str, true));
        String str3 = aVar.f168412c;
        Map map2 = this.f61049c;
        if (!C66718d.m260519a(str3)) {
            str2 = str3;
        }
        map2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new AbstractC24899a.C24900a(str2, false));
        String str4 = aVar.f168411b;
        Map map3 = this.f61049c;
        if (C66718d.m260519a(str4)) {
            str4 = "utf-8";
        }
        map3.put("encoding", new AbstractC24899a.C24900a(str4, false));
        this.f61060g = aVar.f168413d;
    }
}
