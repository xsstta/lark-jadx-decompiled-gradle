package com.larksuite.framework.utils.file.direct;

import android.os.Environment;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/SharedExternalPathUtils;", "", "()V", "getDir", "Ljava/io/File;", ShareHitPoint.f121869d, "", "getStorageDir", "getStoragePublicDir", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.utils.file.direct.f */
public final class SharedExternalPathUtils {

    /* renamed from: a */
    public static final SharedExternalPathUtils f64899a = new SharedExternalPathUtils();

    private SharedExternalPathUtils() {
    }

    /* renamed from: a */
    public final File mo93409a() {
        return Environment.getExternalStorageDirectory();
    }

    /* renamed from: a */
    public final File mo93410a(String str) {
        File b;
        if (str == null || (b = f64899a.mo93411b(str)) == null) {
            return mo93409a();
        }
        return b;
    }

    /* renamed from: b */
    public final File mo93411b(String str) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        return Environment.getExternalStoragePublicDirectory(str);
    }
}
