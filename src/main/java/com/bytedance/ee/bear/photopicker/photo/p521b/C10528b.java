package com.bytedance.ee.bear.photopicker.photo.p521b;

import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.photopicker.photo.b.b */
public class C10528b {
    /* renamed from: a */
    public static int m43608a(FileSelectConfig fileSelectConfig) {
        if (fileSelectConfig.actionType == 0) {
            return R.string.Lark_MediaPicker_Send;
        }
        if (fileSelectConfig.actionType == 1) {
            return R.string.Lark_MediaPicker_Upload;
        }
        if (fileSelectConfig.actionType == 2) {
            return R.string.Lark_MediaPicker_Confirm;
        }
        return R.string.Lark_MediaPicker_Add;
    }

    /* renamed from: b */
    public static int m43609b(FileSelectConfig fileSelectConfig) {
        if (fileSelectConfig.actionType == 0) {
            return R.string.Lark_MediaPicker_SendWithCount;
        }
        if (fileSelectConfig.actionType == 1) {
            return R.string.Lark_MediaPicker_UploadWithCount;
        }
        if (fileSelectConfig.actionType == 2) {
            return R.string.Lark_MediaPicker_ConfirmWithCount;
        }
        return R.string.Lark_MediaPicker_AddWithCount;
    }
}
