package com.bytedance.ee.bear.doc.resupdate;

import android.content.Context;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/doc/resupdate/GeckoResConfig;", "", "()V", "DEBUG_ACCESS_KEY", "", "GECKO_DIR", "RELEASE_ACCESS_KEY", "TAG", "getGeckoAccessKey", "context", "Landroid/content/Context;", "getGeckoRootPath", "Ljava/io/File;", "resupdate-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.resupdate.e */
public final class GeckoResConfig {

    /* renamed from: a */
    public static final GeckoResConfig f15547a = new GeckoResConfig();

    private GeckoResConfig() {
    }

    /* renamed from: a */
    public final String mo21855a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (C13616d.m55262a(context)) {
            return "2f8feb7db4d71d6ddf02e76668896c41";
        }
        return "170fde123c7a011616dd5e6856ec443b";
    }

    /* renamed from: b */
    public final File mo21856b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        File filesDir = context.getFilesDir();
        Intrinsics.checkExpressionValueIsNotNull(filesDir, "context.filesDir");
        if (filesDir.exists() || filesDir.mkdirs()) {
            File file = new File(filesDir, "gecko");
            if (file.exists() || file.mkdirs()) {
                C13479a.m54772d("GeckoResConfig", "getGeckoRootPath: " + file.getAbsolutePath());
                return file;
            }
            C13479a.m54775e("GeckoResConfig", "mkdir gecko Dir failed");
            return null;
        }
        C13479a.m54775e("GeckoResConfig", "mkdir filesDir failed");
        return null;
    }
}
