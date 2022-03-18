package com.bytedance.ee.bear.middleground.drive.export;

import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import java.io.Serializable;

public interface UploadCallback extends Serializable {
    boolean onFailed(String str, int i, String str2, long j);

    boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7);
}
