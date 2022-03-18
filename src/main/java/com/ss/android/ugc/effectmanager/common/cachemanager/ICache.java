package com.ss.android.ugc.effectmanager.common.cachemanager;

import java.io.InputStream;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH&J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/cachemanager/ICache;", "", "clear", "", "has", "", "key", "", "queryToStream", "Ljava/io/InputStream;", "queryToValue", "remove", "removePattern", "pattern", "Ljava/util/regex/Pattern;", "patternStr", "save", "", "inputStream", "value", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.b.b */
public interface ICache {
    /* renamed from: a */
    long mo207128a(String str, String str2);

    /* renamed from: a */
    InputStream mo207129a(String str);

    /* renamed from: b */
    boolean mo207134b(String str);
}
