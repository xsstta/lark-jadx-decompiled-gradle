package com.larksuite.component.openplatform.core.plugin.infra.storage;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"removeSavedFile"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.g */
public class C24967g extends AbstractC65797c {

    /* renamed from: a */
    private AbstractC67722a f61094a;

    public C24967g() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("removeSavedFile");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        if (this.f61094a == null) {
            this.f61094a = (AbstractC67722a) mo230473f().findServiceByInterface(AbstractC67722a.class);
        }
        String str = (String) bVar.mo234984a("filePath");
        AppBrandLogger.m52830i("RemoveSavedFileAsyncHandler", "delete file filePath=" + str);
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52831w("RemoveSavedFileAsyncHandler", "filePath null");
            mo230481a(ApiCode.GENERAL_PARAM);
            return;
        }
        File a = this.f61094a.mo235076a(str);
        if (!this.f61094a.mo235091e(a) && !this.f61094a.mo235089d(a)) {
            AppBrandLogger.m52831w("RemoveSavedFileAsyncHandler", "file no permission");
            mo230481a(ApiCode.REMOVESAVEDFILE_FILE_CANNOT_ACCESS);
        } else if (!a.exists()) {
            AppBrandLogger.m52831w("RemoveSavedFileAsyncHandler", "file not exist");
            mo230481a(ApiCode.REMOVESAVEDFILE_FILE_NOT_EXIST);
        } else if (!a.isFile()) {
            AppBrandLogger.m52831w("RemoveSavedFileAsyncHandler", "not file");
            mo230481a(ApiCode.REMOVESAVEDFILE_FILE_IS_DIR);
        } else if (a.delete()) {
            mo230494j();
        } else {
            AppBrandLogger.m52831w("RemoveSavedFileAsyncHandler", "delete file failed");
            mo230481a(ApiCode.REMOVESAVEDFILE_FILE_DELETE_FAILED);
        }
    }

    public C24967g(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
