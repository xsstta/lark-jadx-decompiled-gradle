package com.ss.android.ugc.effectmanager.common.cachemanager;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0012\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/cachemanager/FileICache;", "Lcom/ss/android/ugc/effectmanager/common/cachemanager/ICache;", "cacheDir", "", "(Ljava/lang/String;)V", "getCacheDir", "()Ljava/lang/String;", "setCacheDir", "clear", "", "generatePath", "key", "has", "", "queryToStream", "Ljava/io/InputStream;", "queryToValue", "remove", "removePattern", "pattern", "Ljava/util/regex/Pattern;", "patternStr", "save", "", "inputStream", "value", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.b.a */
public class FileICache implements ICache {

    /* renamed from: a */
    private String f151259a;

    public FileICache(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cacheDir");
        this.f151259a = str;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    /* renamed from: b */
    public boolean mo207134b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return FileUtils.f151342a.mo207251a(mo207140c(str));
    }

    /* renamed from: c */
    private final String mo207140c(String str) {
        return this.f151259a + File.separator + str;
    }

    /* renamed from: d */
    public boolean mo207141d(String str) {
        boolean b;
        Intrinsics.checkParameterIsNotNull(str, "key");
        synchronized (FileICache.class) {
            b = FileUtils.f151342a.mo207254b(mo207140c(str));
        }
        return b;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    /* renamed from: a */
    public InputStream mo207129a(String str) {
        InputStream c;
        Intrinsics.checkParameterIsNotNull(str, "key");
        String c2 = mo207140c(str);
        synchronized (FileICache.class) {
            c = FileUtils.f151342a.mo207255c(c2);
        }
        return c;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    /* renamed from: a */
    public long mo207128a(String str, String str2) {
        long a;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        synchronized (FileICache.class) {
            a = FileUtils.f151342a.mo207244a(str2, mo207140c(str));
        }
        return a;
    }
}
