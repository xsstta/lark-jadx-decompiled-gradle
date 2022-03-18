package com.bytedance.ee.bear.fileselector.listener;

import com.bytedance.ee.bear.fileselector.api.FileType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/listener/SimpleFileSizeCheckListener;", "Lcom/bytedance/ee/bear/fileselector/listener/IFileSizeCheckListener;", "()V", "onFileOverSize", "", "fileType", "Lcom/bytedance/ee/bear/fileselector/api/FileType;", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.fileselector.a.h */
public class SimpleFileSizeCheckListener implements IFileSizeCheckListener {
    @Override // com.bytedance.ee.bear.fileselector.listener.IFileSizeCheckListener
    public void onFileOverSize(FileType fileType) {
        Intrinsics.checkParameterIsNotNull(fileType, "fileType");
    }
}
