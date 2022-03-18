package com.bytedance.ee.bear.fileselector.listener;

import com.bytedance.ee.bear.fileselector.api.FileType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/listener/IFileSizeCheckListener;", "", "onFileOverSize", "", "fileType", "Lcom/bytedance/ee/bear/fileselector/api/FileType;", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.fileselector.a.c */
public interface IFileSizeCheckListener {
    void onFileOverSize(FileType fileType);
}
