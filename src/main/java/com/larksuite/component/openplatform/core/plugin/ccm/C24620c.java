package com.larksuite.component.openplatform.core.plugin.ccm;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"openDocument"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.ccm.c */
public class C24620c extends AbstractC65797c {

    /* renamed from: a */
    private static final List<String> f60651a = Arrays.asList("doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf");

    /* renamed from: b */
    private static final List<String> f60652b = Arrays.asList("pdf");

    public C24620c() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("openDocument");
    }

    /* renamed from: a */
    private String m89699a(String str) {
        if (!str.startsWith("ttfile")) {
            return "";
        }
        return mo230475h().mo235038b(str).getAbsolutePath();
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        String str = (String) bVar.mo234984a("filePath");
        String str2 = (String) bVar.mo234984a("fileType");
        boolean booleanValue = ((Boolean) bVar.mo234985a("showMenu", true)).booleanValue();
        AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc begin filePath=" + str + " fileType=" + str2 + " showMenu=" + booleanValue);
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc failed filePath=null");
            mo230481a(ApiCode.OPENDOCUMENT_INVALID_FILEPATH);
        } else if (!TextUtils.equals("cloudFile", str2)) {
            String a = m89699a(str);
            if (TextUtils.isEmpty(a)) {
                AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc failed realFilePath=null");
                mo230481a(ApiCode.OPENDOCUMENT_FILE_NOT_EXIST);
                return;
            }
            AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc realFilePath=" + a);
            if (!new File(a).exists()) {
                AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "realFile do not exist");
                mo230481a(ApiCode.OPENDOCUMENT_FILE_NOT_EXIST);
                return;
            }
            Activity f = mo230475h().mo235051f();
            if (f != null) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = mo87612a(str, str2);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                }
                AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc fileType=" + str2);
                boolean a2 = mo230475h().mo235032a(f, this.f165819i.getAppId(), a, str2, booleanValue);
                AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc end result=" + a2);
                if (a2) {
                    mo230494j();
                } else {
                    mo230482a(ApiCode.OPENDOCUMENT_OPEN_FILE_FAIL, "start activity fail");
                }
            } else {
                AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc failed activity=null");
                mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "activity null");
            }
        } else if (mo230475h().mo235050e(str)) {
            Activity f2 = mo230475h().mo235051f();
            if (f2 != null) {
                mo230475h().mo235023a(f2, str);
                mo230494j();
                return;
            }
            AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc failed activity=null");
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "activity null ");
        } else {
            AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc failed cannot open cloud file");
            mo230481a(ApiCode.OPENDOCUMENT_SPACEFILE_INVALID);
        }
    }

    public C24620c(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    public String mo87612a(String str, String str2) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(".") + 1) >= str.length()) {
            return "";
        }
        String substring = str.substring(lastIndexOf);
        AppBrandLogger.m52828d("LarkApiOpenDocument-AsyncHandler", "getFileType:" + substring);
        if (f60651a.contains(substring.toLowerCase())) {
            return substring.toLowerCase();
        }
        return "";
    }
}
