package com.bytedance.ee.bear.fileselector.api;

import com.bytedance.ee.bear.fileselector.bean.FileBean;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u001e\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/api/IFileSelectListener;", "", "onSelectFileBeanList", "", "fileList", "", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "onSelectFileCancel", "onSelectFileList", "filePointerList", "", "isFileUseUri", "", "onSelectFilePathList", "filePathList", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.fileselector.api.a */
public interface IFileSelectListener {
    /* renamed from: a */
    void mo18018a();

    /* renamed from: a */
    void mo18019a(List<? extends FileBean> list);

    /* renamed from: a */
    void mo25164a(List<String> list, boolean z);
}
