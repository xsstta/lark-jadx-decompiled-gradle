package com.larksuite.component.openplatform.core.plugin.infra.storage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.b */
public class C24962b extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "base64ToTempFilePathSync";
    }

    public C24962b() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        try {
            AppBrandLogger.m52830i("tma_ApiBase64ToTempFilePathSyncCtrl", "invoke api");
            byte[] decode = Base64.decode(new JSONObject(this.f168426a).optString("base64Data"), 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            File d = mo232454e().mo235047d();
            File file = new File(d, System.currentTimeMillis() + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            decodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (!file.exists()) {
                AppBrandLogger.m52830i("tma_ApiBase64ToTempFilePathSyncCtrl", "save temp file fail");
                return mo232451b("save temp file fail");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tempFilePath", mo232454e().mo235048d(file.getPath()));
            return mo232446a(jSONObject);
        } catch (Exception e) {
            return mo232445a(e);
        }
    }

    public C24962b(String str) {
        super(str);
    }
}
