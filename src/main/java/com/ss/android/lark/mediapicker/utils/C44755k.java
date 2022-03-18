package com.ss.android.lark.mediapicker.utils;

import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.MediaPickerConfig;

/* renamed from: com.ss.android.lark.mediapicker.utils.k */
public class C44755k {
    /* renamed from: a */
    public static int m177503a(MediaPickerConfig mediaPickerConfig) {
        if (mediaPickerConfig.f113088u == 0) {
            return R.string.Lark_MediaPicker_Send;
        }
        if (mediaPickerConfig.f113088u == 2) {
            return R.string.Lark_MediaPicker_Upload;
        }
        if (mediaPickerConfig.f113088u == 1) {
            return R.string.Lark_MediaPicker_Confirm;
        }
        return R.string.Lark_MediaPicker_Add;
    }

    /* renamed from: b */
    public static int m177504b(MediaPickerConfig mediaPickerConfig) {
        if (mediaPickerConfig.f113088u == 0) {
            return R.string.Lark_MediaPicker_SendWithCount;
        }
        if (mediaPickerConfig.f113088u == 2) {
            return R.string.Lark_MediaPicker_UploadWithCount;
        }
        if (mediaPickerConfig.f113088u == 1) {
            return R.string.Lark_MediaPicker_ConfirmWithCount;
        }
        return R.string.Lark_MediaPicker_AddWithCount;
    }
}
