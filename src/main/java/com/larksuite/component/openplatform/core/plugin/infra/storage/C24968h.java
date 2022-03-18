package com.larksuite.component.openplatform.core.plugin.infra.storage;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@ApiSupportType(apiName = {"saveFile"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.h */
public class C24968h extends AbstractC65797c {
    public C24968h() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("saveFile");
    }

    /* renamed from: a */
    public void mo88052a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("savedFilePath", str);
        mo230492b(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        final String str = (String) bVar.mo234984a("tempFilePath");
        final String str2 = (String) bVar.mo234984a("filePath");
        AppBrandLogger.m52830i("SaveFileAsyncHandler", "tempFilePath=" + str + " targetFilePath=" + str2);
        if (!TextUtils.isEmpty(str)) {
            Observable.create(new Action() {
                /* class com.larksuite.component.openplatform.core.plugin.infra.storage.C24968h.C249691 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    File file;
                    File b = C24968h.this.mo230475h().mo235038b(str);
                    if (TextUtils.isEmpty(str2)) {
                        File e = C24968h.this.mo230475h().mo235049e();
                        file = new File(e, System.currentTimeMillis() + IOUtils.getFileExtension(b.getAbsolutePath()));
                    } else {
                        file = C24968h.this.mo230475h().mo235038b(str2);
                    }
                    if (!C24968h.this.mo230475h().mo235035a(b)) {
                        AppBrandLogger.m52830i("SaveFileAsyncHandler", "tempFile cannot be read, tempFilePath=" + str);
                        C24968h.this.mo230482a(ApiCode.SAVEFILE_INVALID_TEMPFILEPATH, "tempFile cannot read");
                    } else if (!C24968h.this.mo230475h().mo235046c(file)) {
                        AppBrandLogger.m52830i("SaveFileAsyncHandler", "targetFile cannot be written, targetFile=" + str2);
                        C24968h.this.mo230481a(ApiCode.SAVEFILE_INVALID_FILEPATH);
                    } else if (!b.exists()) {
                        AppBrandLogger.m52830i("SaveFileAsyncHandler", "tempFile is not exist, tempFilePath=" + str);
                        C24968h.this.mo230482a(ApiCode.SAVEFILE_INVALID_TEMPFILEPATH, "tempFile not exist");
                    } else if (!file.getParentFile().exists()) {
                        AppBrandLogger.m52830i("SaveFileAsyncHandler", "targetFile is not exist, targetFilePath=" + str2);
                        C24968h.this.mo230482a(ApiCode.SAVEFILE_INVALID_FILEPATH, "filePath has no parent");
                    } else if (C24968h.this.mo230475h().mo235031a(b.length())) {
                        C24968h.this.mo230481a(ApiCode.SAVEFILE_LIMIT_EXCEEDED);
                    } else if (TextUtils.equals(str, str2)) {
                        AppBrandLogger.m52828d("SaveFileAsyncHandler", "TextUtils.equals(tempPath, targetFilePath)");
                        C24968h hVar = C24968h.this;
                        hVar.mo88052a(hVar.mo230475h().mo235048d(file.getAbsolutePath()));
                    } else if (IOUtils.copyFile(b, file, false) == 0) {
                        C24968h hVar2 = C24968h.this;
                        hVar2.mo88052a(hVar2.mo230475h().mo235048d(file.getAbsolutePath()));
                    } else {
                        C24968h.this.mo230481a(ApiCode.SAVEFILE_MOVE_FILE_FAIL);
                    }
                }
            }).schudleOn(Schedulers.shortIO()).subscribeSimple();
        } else {
            mo230482a(ApiCode.SAVEFILE_INVALID_TEMPFILEPATH, "tempFilePath is empty");
        }
    }

    public C24968h(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
