package com.larksuite.component.openplatform.core.plugin.media;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25912g;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.miniapphost.util.C67586c;
import com.tt.refer.impl.business.file.TTFileHelper;
import java.io.File;

public class CompressImageHandlerPlugin extends OPPlugin {
    private ILogger mILogger;

    /* access modifiers changed from: private */
    public static class CompressImageHandlerRequest extends C25920a {
        @JSONField(name = "quality")
        public int quality;
        @JSONField(name = "src")
        @LKRequiredParam
        public String src;

        private CompressImageHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class CompressImageHandlerResponse extends C25921b {
        @JSONField(name = "tempFilePath")
        public String tempFilePath;

        private CompressImageHandlerResponse() {
        }
    }

    private String getSuffixName(String str) {
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

    private void callbackSuccess(AbstractC25897h<CompressImageHandlerResponse> hVar, File file) {
        CompressImageHandlerResponse compressImageHandlerResponse = new CompressImageHandlerResponse();
        compressImageHandlerResponse.tempFilePath = getApiDependency().mo235048d(file.getAbsolutePath());
        hVar.callback(compressImageHandlerResponse);
    }

    private void copyOtherImage(File file, File file2) {
        this.mILogger.mo92224i("CompressImageHandlerPlugin", "copyOtherImage>>> File to File");
        C67586c.m263045a(file, file2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004e A[SYNTHETIC, Splitter:B:28:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c A[SYNTHETIC, Splitter:B:33:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b A[SYNTHETIC, Splitter:B:38:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0079 A[SYNTHETIC, Splitter:B:43:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void copyOtherImage(byte[] r6, java.io.File r7) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.media.CompressImageHandlerPlugin.copyOtherImage(byte[], java.io.File):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[SYNTHETIC, Splitter:B:24:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d A[SYNTHETIC, Splitter:B:35:0x006d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void compressJpg(java.io.File r7, java.io.File r8, int r9) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.media.CompressImageHandlerPlugin.compressJpg(java.io.File, java.io.File, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0050 A[SYNTHETIC, Splitter:B:28:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b A[SYNTHETIC, Splitter:B:37:0x006b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void compressJpg(byte[] r7, java.io.File r8, int r9) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.media.CompressImageHandlerPlugin.compressJpg(byte[], java.io.File, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.larksuite.component.openplatform.core.plugin.media.CompressImageHandlerPlugin.CompressImageHandlerResponse standardCompressImage(com.larksuite.framework.apiplugin.LKEvent r18, com.larksuite.component.openplatform.core.plugin.media.CompressImageHandlerPlugin.CompressImageHandlerRequest r19, com.ss.android.lark.optrace.api.ILogger r20) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.media.CompressImageHandlerPlugin.standardCompressImage(com.larksuite.framework.apiplugin.LKEvent, com.larksuite.component.openplatform.core.plugin.media.CompressImageHandlerPlugin$CompressImageHandlerRequest, com.ss.android.lark.optrace.api.a):com.larksuite.component.openplatform.core.plugin.media.CompressImageHandlerPlugin$CompressImageHandlerResponse");
    }

    @LKPluginFunction(async = true, eventName = {"compressImage"})
    public void compressImageHandlerAsync(LKEvent lKEvent, CompressImageHandlerRequest compressImageHandlerRequest, ILogger aVar, AbstractC25897h<CompressImageHandlerResponse> hVar) {
        if (TTFileHelper.m264259a(lKEvent.mo92146m(), getAppContext())) {
            hVar.callback(standardCompressImage(lKEvent, compressImageHandlerRequest, aVar));
            return;
        }
        CompressImageHandlerResponse compressImageHandlerResponse = new CompressImageHandlerResponse();
        this.mILogger = aVar;
        int i = compressImageHandlerRequest.quality;
        if (i <= 0 || i > 100) {
            i = 80;
        }
        String str = compressImageHandlerRequest.src;
        if (TextUtils.isEmpty(str)) {
            fillFailedResponse(compressImageHandlerResponse, C25906a.f64072b, "src is empty");
            hVar.callback(compressImageHandlerResponse);
            return;
        }
        String c = getApiDependency().mo235044c(str);
        File file = new File(c);
        ILogger aVar2 = this.mILogger;
        aVar2.mo92224i("CompressImageHandlerPlugin", "src:" + str + " realFilePath:" + c + " quality:" + i);
        if (!file.exists()) {
            TTAPkgFile findFile = StreamLoader.findFile(c, getAppContext());
            this.mILogger.mo92224i("CompressImageHandlerPlugin", "realFile not exists. try TTAPkg");
            if (findFile != null) {
                String suffixName = getSuffixName(findFile.getFileName());
                ILogger aVar3 = this.mILogger;
                aVar3.mo92224i("CompressImageHandlerPlugin", "TTAPkg name:" + findFile.getFileName());
                if (suffixName != null) {
                    byte[] loadByteFromStream = StreamLoader.loadByteFromStream(c, getAppContext());
                    File d = getApiDependency().mo235047d();
                    File file2 = new File(d, System.currentTimeMillis() + suffixName);
                    if (!TextUtils.equals(suffixName, ".jpg") || i >= 100) {
                        copyOtherImage(loadByteFromStream, file2);
                    } else {
                        compressJpg(loadByteFromStream, file2, i);
                    }
                    if (file2.exists()) {
                        callbackSuccess(hVar, file2);
                        return;
                    }
                    fillFailedResponse(compressImageHandlerResponse, C25912g.f64144b, "compress or copy toFile fail");
                    hVar.callback(compressImageHandlerResponse);
                    this.mILogger.mo92224i("CompressImageHandlerPlugin", "compress or copy toFile fail");
                    return;
                }
                fillFailedResponse(compressImageHandlerResponse, C25906a.f64072b, "file suffixName is not suit");
                hVar.callback(compressImageHandlerResponse);
                this.mILogger.mo92224i("CompressImageHandlerPlugin", "file suffixName is not suit");
                return;
            }
            fillFailedResponse(compressImageHandlerResponse, C25912g.f64145c, "file can not read");
            hVar.callback(compressImageHandlerResponse);
            this.mILogger.mo92224i("CompressImageHandlerPlugin", "no such file");
        } else if (getApiDependency().mo235035a(file)) {
            this.mILogger.mo92224i("CompressImageHandlerPlugin", "canRead.");
            String suffixName2 = getSuffixName(str);
            if (!TextUtils.isEmpty(suffixName2)) {
                File d2 = getApiDependency().mo235047d();
                File file3 = new File(d2, System.currentTimeMillis() + suffixName2);
                if (!TextUtils.equals(suffixName2, ".jpg") || i >= 100) {
                    copyOtherImage(file, file3);
                } else {
                    compressJpg(file, file3, i);
                }
                if (file3.exists()) {
                    callbackSuccess(hVar, file3);
                    return;
                }
                fillFailedResponse(compressImageHandlerResponse, C25912g.f64144b, "compress or copy toFile fail");
                hVar.callback(compressImageHandlerResponse);
                this.mILogger.mo92224i("CompressImageHandlerPlugin", "compress or copy toFile fail");
                return;
            }
            fillFailedResponse(compressImageHandlerResponse, C25906a.f64072b, "file suffixName is not suit");
            hVar.callback(compressImageHandlerResponse);
            this.mILogger.mo92224i("CompressImageHandlerPlugin", "file suffixName is not suit");
        } else {
            fillFailedResponse(compressImageHandlerResponse, C25912g.f64145c, "file can not read");
            hVar.callback(compressImageHandlerResponse);
            this.mILogger.mo92224i("CompressImageHandlerPlugin", "file can not read");
        }
    }
}
