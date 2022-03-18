package com.bytedance.ee.bear.diskmanager;

import android.content.Context;
import com.ss.android.lark.diskmanage.storage.Storage;
import com.ss.android.lark.diskmanage.storage.StorageManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/diskmanager/CCMStorage;", "", "()V", "Companion", "biz-diskmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.diskmanager.a */
public final class CCMStorage {

    /* renamed from: a */
    public static final Companion f15230a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final String m21712a(Context context, Biz biz) {
        return Companion.m21718a(f15230a, context, biz, null, 4, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m21713a(Context context, Biz biz, String str) {
        return f15230a.mo21333a(context, biz, str);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m21714b(Context context, Biz biz) {
        return Companion.m21719b(f15230a, context, biz, null, 4, null);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m21715b(Context context, Biz biz, String str) {
        return f15230a.mo21334b(context, biz, str);
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m21716c(Context context, Biz biz) {
        return Companion.m21720c(f15230a, context, biz, null, 4, null);
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m21717c(Context context, Biz biz, String str) {
        return f15230a.mo21336d(context, biz, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/diskmanager/CCMStorage$Companion;", "", "()V", "CCMRootDir", "", "getCCMCachePath", "context", "Landroid/content/Context;", "biz", "Lcom/bytedance/ee/bear/diskmanager/Biz;", "relativePath", "getCCMExternalPath", "getCCMFilePath", "getCCMInnerCachePath", "getCCMInnerFilePath", "biz-diskmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.diskmanager.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo21333a(Context context, Biz biz, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(biz, "biz");
            Intrinsics.checkParameterIsNotNull(str, "relativePath");
            return StorageManager.f94668b.mo135702a(context, "ccm", "", Storage.Type.INNER_CACHE, biz.getBizRootDir(), str);
        }

        @JvmStatic
        /* renamed from: b */
        public final String mo21334b(Context context, Biz biz, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(biz, "biz");
            Intrinsics.checkParameterIsNotNull(str, "relativePath");
            return StorageManager.f94668b.mo135702a(context, "ccm", "", Storage.Type.INNER_FILES, biz.getBizRootDir(), str);
        }

        @JvmStatic
        /* renamed from: c */
        public final String mo21335c(Context context, Biz biz, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(biz, "biz");
            Intrinsics.checkParameterIsNotNull(str, "relativePath");
            return StorageManager.f94668b.mo135702a(context, "ccm", "", Storage.Type.CACHE, biz.getBizRootDir(), str);
        }

        @JvmStatic
        /* renamed from: d */
        public final String mo21336d(Context context, Biz biz, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(biz, "biz");
            Intrinsics.checkParameterIsNotNull(str, "relativePath");
            return StorageManager.f94668b.mo135702a(context, "ccm", "", Storage.Type.FILES, biz.getBizRootDir(), str);
        }

        /* renamed from: a */
        public static /* synthetic */ String m21718a(Companion aVar, Context context, Biz biz, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            return aVar.mo21333a(context, biz, str);
        }

        /* renamed from: b */
        public static /* synthetic */ String m21719b(Companion aVar, Context context, Biz biz, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            return aVar.mo21334b(context, biz, str);
        }

        /* renamed from: c */
        public static /* synthetic */ String m21720c(Companion aVar, Context context, Biz biz, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            return aVar.mo21336d(context, biz, str);
        }
    }
}
