package com.ss.android.lark.moments.impl.feed.nineimage;

import android.app.Activity;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/nineimage/MomentsDialogMenuClickListener;", "Lcom/ss/android/lark/widget/photo_picker/gallery/callback/OnDialogMenuClickListener;", "()V", "onDecodeQRCodeClicked", "", "qrCodeContent", "", "activity", "Landroid/app/Activity;", "onJumpToChatClicked", "messageId", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsDialogMenuClickListener implements OnDialogMenuClickListener {
    @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener
    public void onJumpToChatClicked(String str) {
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener
    public void onDecodeQRCodeClicked(String str, Activity activity) {
        if (str != null && activity != null) {
            MomentsDependencyHolder.f118998b.mo165899a().qrCodeDependency().mo144728a(str, activity);
        }
    }
}
