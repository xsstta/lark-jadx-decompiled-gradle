package com.ss.android.lark.widget.photo_picker.utils;

import android.content.Context;
import com.larksuite.framework.utils.C26320t;
import com.p938d.p939a.C20945a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/utils/MediaKVDiskCacheUtils;", "", "()V", "Companion", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.f.e */
public final class MediaKVDiskCacheUtils {

    /* renamed from: a */
    public static C20945a f144843a;

    /* renamed from: b */
    public static final Companion f144844b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/utils/MediaKVDiskCacheUtils$Companion;", "", "()V", "APP_VERSION", "", "MAX_DISK_SIZE", "TAG", "", "VALUE_COUNT", "sDiskLruCache", "Lcom/jakewharton/disklrucache/DiskLruCache;", "getDiskLruCache", "context", "Landroid/content/Context;", "getSupportCompressCached", "", "path", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Boolean;", "putSupportCompress", "", "isSupport", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.f.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final C20945a m227483a(Context context) {
            if (MediaKVDiskCacheUtils.f144843a == null) {
                synchronized (C58654f.class) {
                    if (MediaKVDiskCacheUtils.f144843a == null) {
                        try {
                            MediaKVDiskCacheUtils.f144843a = C20945a.m76302a(new File(C57881t.m224645q(context)), 1, 1, (long) 10485760);
                        } catch (IOException e) {
                            Log.m165384e("MediaKVDiskCacheUtils", "cannot get DiskLruCache", e);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return MediaKVDiskCacheUtils.f144843a;
        }

        /* renamed from: a */
        public final Boolean mo198857a(Context context, String str) {
            String str2;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "path");
            C20945a a = m227483a(context);
            if (a != null) {
                try {
                    C20945a.C20951c a2 = a.mo70796a(C26320t.m95318a(str));
                    if (a2 != null) {
                        str2 = a2.mo70822b(0);
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        return null;
                    }
                    int hashCode = str2.hashCode();
                    if (hashCode != 3569038) {
                        if (hashCode != 97196323) {
                            return null;
                        }
                        if (str2.equals("false")) {
                            return false;
                        }
                        return null;
                    } else if (str2.equals("true")) {
                        return true;
                    } else {
                        return null;
                    }
                } catch (IOException e) {
                    Log.m165384e("MediaKVDiskCacheUtils", "get diskLruCache error path: " + str, e);
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo198858a(Context context, String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "path");
            C20945a a = m227483a(context);
            if (a != null) {
                try {
                    C20945a.C20948a b = a.mo70799b(C26320t.m95318a(str));
                    b.mo70811a(0, String.valueOf(z));
                    b.mo70810a();
                } catch (IOException e) {
                    Log.m165384e("MediaKVDiskCacheUtils", "put diskLruCache error path: " + str, e);
                }
            }
        }
    }
}
