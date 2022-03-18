package com.ss.ugc.effectplatform.download;

import bytekn.foundation.io.file.FileInputStream;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/ss/ugc/effectplatform/download/IWriteDisk;", "", "execWrite", "", "inputStream", "Lbytekn/foundation/io/file/FileInputStream;", "contentLength", "", "listener", "Lcom/ss/ugc/effectplatform/download/DownloadListener;", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.download.i */
public interface IWriteDisk {
    /* renamed from: a */
    String mo227769a(FileInputStream bVar, long j, DownloadListener cVar);
}
