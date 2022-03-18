package com.ss.android.lark.mail.impl.mailtoolbar.plugins.image;

import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.photopicker.photo.MediaPickerView;
import com.ss.android.lark.log.Log;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.b */
public class C42799b extends AbstractC1142af {
    public static HashMap<String, String> mImgMap = new HashMap<>();
    private AbstractC42800a mDelegate;
    private MediaPickerView mMediaPickerView;

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.b$a */
    public interface AbstractC42800a {
        /* renamed from: a */
        void mo153644a();

        /* renamed from: a */
        void mo153645a(String str);
    }

    public AbstractC42800a getDelegate() {
        return this.mDelegate;
    }

    public MediaPickerView getMediaPickerView() {
        return this.mMediaPickerView;
    }

    public void releaseMediaPicker() {
        MediaPickerView mediaPickerView = this.mMediaPickerView;
        if (mediaPickerView != null) {
            mediaPickerView.mo39806b();
            this.mMediaPickerView = null;
        }
    }

    public void cancelFromImageSelector() {
        Log.m165383e("MailSelectImageViewModel", "cancelFromImageSelector");
        AbstractC42800a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo153644a();
        } else {
            Log.m165383e("MailSelectImageViewModel", "cancelFromImageSelector fail caused by mDelegate is null");
        }
    }

    public void setDelegate(AbstractC42800a aVar) {
        this.mDelegate = aVar;
    }

    public void setMediaPickerView(MediaPickerView mediaPickerView) {
        this.mMediaPickerView = mediaPickerView;
    }

    public void insertImages(String str) {
        AbstractC42800a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo153645a(str);
        } else {
            Log.m165383e("MailSelectImageViewModel", "insertImages(): fail caused by mDelegate is null");
        }
    }
}
