package com.ss.android.lark.widget.photo_picker.gallery.callback;

import android.app.Activity;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/gallery/callback/OnDialogMenuClickListener;", "Ljava/io/Serializable;", "onDecodeQRCodeClicked", "", "qrCodeContent", "", "activity", "Landroid/app/Activity;", "onJumpToChatClicked", "messageId", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface OnDialogMenuClickListener extends Serializable {
    void onDecodeQRCodeClicked(String str, Activity activity);

    void onJumpToChatClicked(String str);
}
