package com.bytedance.ee.bear.drive.biz.upload;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.UploadCallback;
import com.bytedance.ee.log.C13479a;

public class RustUploadCallback implements UploadCallback {
    private C7130c mDriveReport;
    private Bundle mExtras;
    private String mFilePointer;
    private boolean mIsFileUri;
    private UploadPresenter mUploadPresenter;

    private void reportClientFileUpload(String str, String str2) {
        String str3;
        int lastIndexOf;
        if (TextUtils.isEmpty(str2) || (lastIndexOf = str2.lastIndexOf(".")) == -1) {
            str3 = "";
        } else {
            str3 = str2.substring(lastIndexOf + 1);
        }
        this.mDriveReport.mo27923a("finish_upload", str, str3, this.mExtras);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
    public boolean onFailed(String str, int i, String str2, long j) {
        this.mUploadPresenter.mo26566a(str, i, str2, j);
        return false;
    }

    public RustUploadCallback(UploadPresenter eVar, String str, boolean z, C7130c cVar, Bundle bundle) {
        this.mUploadPresenter = eVar;
        this.mFilePointer = str;
        this.mDriveReport = cVar;
        this.mExtras = bundle;
        this.mIsFileUri = z;
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
    public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z;
        C13479a.m54772d("DRIVE_RustUploadCallback", "upload file, status: " + status);
        if (status == DriveFile.Status.SUCCESS) {
            this.mUploadPresenter.mo26567a(this.mFilePointer, this.mIsFileUri, str2, str5);
            reportClientFileUpload(str2, str3);
        }
        if (status == DriveFile.Status.SUCCESS || status == DriveFile.Status.FAILED || status == DriveFile.Status.CANCEL) {
            C7130c cVar = this.mDriveReport;
            if (status == DriveFile.Status.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
            cVar.mo27925a(str3, str, z, str2);
        }
        return false;
    }
}
