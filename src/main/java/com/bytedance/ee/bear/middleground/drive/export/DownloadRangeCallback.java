package com.bytedance.ee.bear.middleground.drive.export;

import com.bytedance.ee.bear.middleground.drive.export.C9361b;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import java.io.Serializable;
import java.util.List;

public interface DownloadRangeCallback extends Serializable {
    boolean onFailed(String str, int i);

    void onSubmit(String str);

    boolean updateProgress(String str, DriveFile.Status status, List<C9361b.C9362a> list);
}
