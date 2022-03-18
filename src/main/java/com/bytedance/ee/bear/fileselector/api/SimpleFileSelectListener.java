package com.bytedance.ee.bear.fileselector.api;

import com.bytedance.ee.bear.fileselector.bean.FileBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u001e\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/api/SimpleFileSelectListener;", "Lcom/bytedance/ee/bear/fileselector/api/IFileSelectListener;", "()V", "onSelectFileBeanList", "", "fileList", "", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "onSelectFileCancel", "onSelectFileList", "filePointerList", "", "isFileUseUri", "", "onSelectFilePathList", "filePathList", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.fileselector.api.b */
public class SimpleFileSelectListener implements IFileSelectListener {
    @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener
    /* renamed from: a */
    public void mo18018a() {
    }

    @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener
    /* renamed from: a */
    public void mo18019a(List<? extends FileBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "fileList");
    }

    @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener
    /* renamed from: a */
    public void mo25164a(List<String> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "filePointerList");
    }
}
