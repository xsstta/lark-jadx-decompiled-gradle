package com.bytedance.ee.bear.middleground.drive.export;

import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import java.io.Serializable;

public interface DownloadCallback extends Serializable {
    boolean onFailed(String str, int i);

    boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2);
}
