package com.tt.refer.impl.business.api.diagnose.commands;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.larksuite.framework.utils.C26310o;
import com.tt.miniapp.toast.ToastManager;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import com.tt.refer.impl.business.file.log.FileLogManager;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/ExportTTFileLog;", "Lcom/tt/refer/impl/business/api/diagnose/AbsDebugCommand;", "()V", "execute", "Lorg/json/JSONObject;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "params", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.api.diagnose.a.d */
public final class ExportTTFileLog extends AbstractC67885a {

    /* renamed from: a */
    public static final Companion f170969a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/ExportTTFileLog$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.api.diagnose.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.tt.refer.impl.business.api.diagnose.AbstractC67885a
    /* renamed from: a */
    public JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        IBaseService findServiceByInterface = iAppContext.findServiceByInterface(AbstractC67724a.class);
        Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy…IHostService::class.java)");
        String l = ((AbstractC67724a) findServiceByInterface).mo50471l();
        String str = l;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AppBrandLogger.m52830i("ExportTTFileLog", "userId is null or empty", l);
            JSONObject a = mo235513a("userId invalid");
            Intrinsics.checkExpressionValueIsNotNull(a, "fail(\"userId invalid\")");
            return a;
        }
        File a2 = FileLogManager.m264458a(l);
        if (!a2.exists()) {
            ToastManager.showShortToast(iAppContext.getApplicationContext(), "no file to export");
            JSONObject a3 = mo235511a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "success()");
            return a3;
        }
        Activity currentActivity = iAppContext.getCurrentActivity();
        if (currentActivity == null) {
            AppBrandLogger.m52830i("ExportTTFileLog", "host top activity is null");
            JSONObject a4 = mo235513a("activity is null");
            Intrinsics.checkExpressionValueIsNotNull(a4, "fail(\"activity is null\")");
            return a4;
        }
        Uri a5 = C26310o.m95259a(currentActivity, a2);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setDataAndType(a5, "application/octet-stream");
        intent.addFlags(1);
        intent.addFlags(268435456);
        currentActivity.startActivity(intent);
        AppBrandLogger.m52830i("ExportTTFileLog", "intent is started.");
        JSONObject a6 = mo235511a();
        Intrinsics.checkExpressionValueIsNotNull(a6, "success()");
        return a6;
    }
}
