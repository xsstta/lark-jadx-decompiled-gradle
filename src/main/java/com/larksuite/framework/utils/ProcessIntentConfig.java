package com.larksuite.framework.utils;

import android.content.Intent;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/larksuite/framework/utils/ProcessIntentConfig;", "", "()V", "PARAM_PROCESS_START_ID", "", "PARAM_PROCESS_START_SOURCE", "PARAM_PROCESS_START_TIME", "config", "Landroid/content/Intent;", "intent", ShareHitPoint.f121868c, "getSource", "getStartId", "getStartTime", "", "getTargetComponent", "getTargetUri", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.utils.ac */
public final class ProcessIntentConfig {

    /* renamed from: a */
    public static final ProcessIntentConfig f64838a = new ProcessIntentConfig();

    private ProcessIntentConfig() {
    }

    /* renamed from: b */
    public final long mo93360b(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        return intent.getLongExtra("PARAM_PROCESS_START_TIME", 0);
    }

    /* renamed from: a */
    public final String mo93359a(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        String stringExtra = intent.getStringExtra("PARAM_PROCESS_START_ID");
        if (stringExtra != null) {
            return stringExtra;
        }
        return "";
    }

    /* renamed from: c */
    public final String mo93361c(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        String stringExtra = intent.getStringExtra("PARAM_PROCESS_START_SOURCE");
        if (stringExtra != null) {
            return stringExtra;
        }
        return "";
    }

    /* renamed from: a */
    public final Intent mo93358a(Intent intent, String str) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        intent.putExtra("PARAM_PROCESS_START_ID", UUID.randomUUID().toString());
        intent.putExtra("PARAM_PROCESS_START_TIME", System.currentTimeMillis());
        if (str == null) {
            str = "";
        }
        intent.putExtra("PARAM_PROCESS_START_SOURCE", str);
        return intent;
    }
}
