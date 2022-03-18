package com.larksuite.component.openplatform.core.plugin.media;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.miniapphost.util.C67586c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.io.File;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"compressImage"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.media.c */
public class C25039c extends AbstractC65797c {
    public C25039c() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("compressImage");
    }

    /* renamed from: a */
    private String m90331a(String str) {
        if (str.endsWith(".jpg")) {
            return ".jpg";
        }
        if (str.endsWith(".png")) {
            return ".png";
        }
        if (str.endsWith(".jpeg")) {
            return ".jpeg";
        }
        return null;
    }

    /* renamed from: a */
    private void m90332a(File file) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tempFilePath", mo230475h().mo235048d(file.getAbsolutePath()));
            mo230492b(jSONObject);
        } catch (JSONException e) {
            mo230481a(ApiCode.GENERAL_JSON_ERROR);
            AppBrandLogger.m52830i("CompressImageHandler", "build resp exception:" + e);
        }
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        int i = 80;
        int intValue = ((Integer) this.f165820j.mo234985a("quality", 80)).intValue();
        if (intValue >= 0 && intValue <= 100) {
            i = intValue;
        }
        String str = (String) this.f165820j.mo234984a("src");
        String c = mo230475h().mo235044c(str);
        File file = new File(c);
        AppBrandLogger.m52830i("CompressImageHandler", "src:" + str + " realFilePath:" + c + " quality:" + i);
        if (!file.exists()) {
            TTAPkgFile findFile = StreamLoader.findFile(c, mo230473f());
            if (findFile != null) {
                String a = m90331a(findFile.getFileName());
                if (a != null) {
                    byte[] loadByteFromStream = StreamLoader.loadByteFromStream(c, mo230473f());
                    File d = mo230475h().mo235047d();
                    File file2 = new File(d, System.currentTimeMillis() + a);
                    if (!a.equals(".jpg") || i >= 100) {
                        m90335a(loadByteFromStream, file2);
                    } else {
                        m90336a(loadByteFromStream, file2, i);
                    }
                    if (file2.exists()) {
                        m90332a(file2);
                        return;
                    }
                    mo230481a(ApiCode.COMPRESSIMAGE_COMPRESS_FAIL);
                    AppBrandLogger.m52830i("CompressImageHandler", "compress or copy toFile fail");
                    return;
                }
                mo230481a(ApiCode.COMPRESSIMAGE_INVALID_SRC);
                AppBrandLogger.m52830i("CompressImageHandler", "file suffixName is not suit");
                return;
            }
            mo230481a(ApiCode.COMPRESSIMAGE_INVALID_SRC);
            AppBrandLogger.m52830i("CompressImageHandler", "no such file");
        } else if (mo230475h().mo235035a(file)) {
            String a2 = m90331a(str);
            if (!TextUtils.isEmpty(a2)) {
                File d2 = mo230475h().mo235047d();
                File file3 = new File(d2, System.currentTimeMillis() + a2);
                if (!a2.equals(".jpg") || i >= 100) {
                    m90333a(file, file3);
                } else {
                    m90334a(file, file3, i);
                }
                if (file3.exists()) {
                    m90332a(file3);
                    return;
                }
                mo230481a(ApiCode.COMPRESSIMAGE_COMPRESS_FAIL);
                AppBrandLogger.m52830i("CompressImageHandler", "compress or copy toFile fail");
                return;
            }
            mo230481a(ApiCode.COMPRESSIMAGE_INVALID_SRC);
            AppBrandLogger.m52830i("CompressImageHandler", "file suffixName is not suit");
        } else {
            mo230481a(ApiCode.GENERAL_FILE_CAN_NOT_READ);
            AppBrandLogger.m52830i("CompressImageHandler", "file can not read");
        }
    }

    public C25039c(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    private void m90333a(File file, File file2) {
        AppBrandLogger.m52830i("CompressImageHandler", "copyOtherImage File to File");
        C67586c.m263045a(file, file2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC, Splitter:B:28:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a A[SYNTHETIC, Splitter:B:33:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0069 A[SYNTHETIC, Splitter:B:38:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0077 A[SYNTHETIC, Splitter:B:43:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m90335a(byte[] r6, java.io.File r7) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.media.C25039c.m90335a(byte[], java.io.File):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044 A[SYNTHETIC, Splitter:B:24:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062 A[SYNTHETIC, Splitter:B:35:0x0062] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m90334a(java.io.File r7, java.io.File r8, int r9) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.media.C25039c.m90334a(java.io.File, java.io.File, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045 A[SYNTHETIC, Splitter:B:28:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0060 A[SYNTHETIC, Splitter:B:37:0x0060] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m90336a(byte[] r7, java.io.File r8, int r9) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.media.C25039c.m90336a(byte[], java.io.File, int):void");
    }
}
