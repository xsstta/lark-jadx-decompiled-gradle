package com.bytedance.ee.bear.middleground.drive.export;

/* renamed from: com.bytedance.ee.bear.middleground.drive.export.c */
public interface AbstractC9363c {

    /* renamed from: com.bytedance.ee.bear.middleground.drive.export.c$a */
    public interface AbstractC9364a {
        void onExistUploadingFile();

        void onFileCountChange(int i, int i2);

        void onFileProgressChange(int i, ProgressingEntity progressingEntity);

        void onUploadError(int i);

        void onUploadErrorCode(String str, int i);

        void onUploadFileSuccess(String str, String str2, String str3);

        void onUploadFinished();
    }
}
