package com.tt.refer.impl.business.api.diagnose.commands;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.format.Formatter;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/GetDiskInfo;", "Lcom/tt/refer/impl/business/api/diagnose/AbsDebugCommand;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "execute", "Lorg/json/JSONObject;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "params", "formatFileSize", "context", "Landroid/content/Context;", "fileSize", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.api.diagnose.a.i */
public final class GetDiskInfo extends AbstractC67885a {

    /* renamed from: a */
    private final String f170976a = "GetDiskInfo";

    /* renamed from: a */
    private final String m264138a(Context context, long j) {
        String formatFileSize = Formatter.formatFileSize(context, j);
        Intrinsics.checkExpressionValueIsNotNull(formatFileSize, "Formatter.formatFileSize(context, fileSize)");
        return formatFileSize;
    }

    @Override // com.tt.refer.impl.business.api.diagnose.AbstractC67885a
    /* renamed from: a */
    public JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        File dataDirectory = Environment.getDataDirectory();
        Intrinsics.checkExpressionValueIsNotNull(dataDirectory, "Environment.getDataDirectory()");
        StatFs statFs = new StatFs(dataDirectory.getPath());
        long totalBytes = statFs.getTotalBytes();
        long availableBytes = statFs.getAvailableBytes();
        AppBrandLogger.m52830i(this.f170976a, "Inner path: ", dataDirectory.getPath(), ", totalBytes: ", Long.valueOf(totalBytes), ", availableBytes: ", Long.valueOf(availableBytes));
        JSONObject jSONObject2 = new JSONObject();
        Context applicationContext = iAppContext.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "appContext.applicationContext");
        jSONObject2.put("total_disk_space", m264138a(applicationContext, totalBytes));
        Context applicationContext2 = iAppContext.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext2, "appContext.applicationContext");
        jSONObject2.put("available_disk_space", m264138a(applicationContext2, availableBytes));
        if (Intrinsics.areEqual("mounted", Environment.getExternalStorageState())) {
            jSONObject2.put("has_sdcard", true);
            File a = C12791h.m52861a(iAppContext.getApplicationContext());
            Intrinsics.checkExpressionValueIsNotNull(a, "StorageUtil.getExternalC…ntext.applicationContext)");
            StatFs statFs2 = new StatFs(a.getPath());
            long totalBytes2 = statFs2.getTotalBytes();
            long availableBytes2 = statFs2.getAvailableBytes();
            AppBrandLogger.m52830i(this.f170976a, "Sdcard path: ", a.getPath(), ", totalBytes: ", Long.valueOf(totalBytes2), ", availableBytes: ", Long.valueOf(availableBytes2));
            Context applicationContext3 = iAppContext.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext3, "appContext.applicationContext");
            jSONObject2.put("sdcard_total_disk_space", m264138a(applicationContext3, totalBytes2));
            Context applicationContext4 = iAppContext.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext4, "appContext.applicationContext");
            jSONObject2.put("sdcard_available_disk_space", m264138a(applicationContext4, availableBytes2));
        } else {
            jSONObject2.put("has_sdcard", false);
        }
        return jSONObject2;
    }
}
