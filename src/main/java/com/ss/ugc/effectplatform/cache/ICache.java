package com.ss.ugc.effectplatform.cache;

import bytekn.foundation.io.file.FileInputStream;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0007H&J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tH&J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H&¨\u0006\u0012"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/ICache;", "", "clear", "", "has", "", "key", "", "queryToStream", "Lbytekn/foundation/io/file/FileInputStream;", "queryToValue", "remove", "removePattern", "patternString", "save", "", "inputStream", "value", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.a.f */
public interface ICache {
    /* renamed from: a */
    long mo227681a(String str, FileInputStream bVar);

    /* renamed from: a */
    long mo227682a(String str, String str2);

    /* renamed from: b */
    String mo227685b(String str);

    /* renamed from: c */
    FileInputStream mo227687c(String str);

    /* renamed from: e */
    boolean mo227690e(String str);
}
