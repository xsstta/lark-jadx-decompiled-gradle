package com.tt.miniapphost.util;

import java.io.File;
import kotlin.Metadata;
import kotlin.io.C69104g;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tt/miniapphost/util/KotlinIOUtil;", "", "()V", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapphost.util.e */
public final class KotlinIOUtil {

    /* renamed from: a */
    public static final Companion f170419a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m263056a(File file) {
        f170419a.mo234786a(file);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m263057b(File file) {
        f170419a.mo234787b(file);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/tt/miniapphost/util/KotlinIOUtil$Companion;", "", "()V", "deleteFileWhenExit", "", "file", "Ljava/io/File;", "deleteRecursively", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapphost.util.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo234787b(File file) {
            Intrinsics.checkParameterIsNotNull(file, "file");
            C69104g.m265937f(file);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo234786a(File file) {
            File[] listFiles;
            Intrinsics.checkParameterIsNotNull(file, "file");
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    Companion aVar = KotlinIOUtil.f170419a;
                    Intrinsics.checkExpressionValueIsNotNull(file2, "child");
                    aVar.mo234786a(file2);
                }
            }
            file.deleteOnExit();
        }
    }
}
