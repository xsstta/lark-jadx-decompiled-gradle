package com.bytedance.ee.bear.fileselector.model;

import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/model/FileSelectConfigModel;", "Landroidx/lifecycle/ViewModel;", "()V", "mFileSelectConfig", "Lcom/bytedance/ee/bear/fileselector/api/FileSelectConfig;", "getFileSelectConfig", "setFileSelectConfig", "", "config", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.fileselector.b.a */
public final class FileSelectConfigModel extends AbstractC1142af {
    private FileSelectConfig mFileSelectConfig;

    public final FileSelectConfig getFileSelectConfig() {
        return this.mFileSelectConfig;
    }

    public final void setFileSelectConfig(FileSelectConfig fileSelectConfig) {
        Intrinsics.checkParameterIsNotNull(fileSelectConfig, "config");
        this.mFileSelectConfig = fileSelectConfig;
    }
}
