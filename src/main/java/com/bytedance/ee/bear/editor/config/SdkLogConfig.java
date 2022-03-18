package com.bytedance.ee.bear.editor.config;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/editor/config/SdkLogConfig;", "Lcom/bytedance/ee/log/LogConfig;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "folderPath", "", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.g.b.b */
public final class SdkLogConfig {

    /* renamed from: a */
    private final Context f21098a;

    /* renamed from: a */
    public String mo30549a() {
        File filesDir = this.f21098a.getFilesDir();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkExpressionValueIsNotNull(filesDir, "dir");
        sb.append(filesDir.getPath());
        sb.append("/Journal/docs/log/");
        return sb.toString();
    }

    public SdkLogConfig(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f21098a = context;
    }
}
