package com.ss.android.lark.mail.impl.mailtoolbar.plugins.image;

import androidx.lifecycle.AbstractC1142af;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.c */
public class C42801c extends AbstractC1142af {
    private final String TAG = "UploadImageViewModel";
    private PermissionCode permissionCode = PermissionCode.NONE;
    private AbstractC42802a videoDelegate;

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.c$a */
    public static abstract class AbstractC42802a {
        /* renamed from: a */
        public void mo150669a(String str) {
        }

        /* renamed from: a */
        public boolean mo150670a() {
            return false;
        }

        /* renamed from: b */
        public void mo150671b() {
        }

        /* renamed from: c */
        public abstract long mo150672c();

        /* renamed from: d */
        public abstract long mo150673d();
    }

    public PermissionCode getPermissionCode() {
        Log.m165389i("UploadImageViewModel", "getPermissionCode");
        return this.permissionCode;
    }

    public void showKeyboardPanel() {
        Log.m165389i("UploadImageViewModel", "showKeyboard");
        AbstractC42802a aVar = this.videoDelegate;
        if (aVar != null) {
            aVar.mo150671b();
        }
    }

    public boolean supportVideo() {
        AbstractC42802a aVar = this.videoDelegate;
        if (aVar == null) {
            return false;
        }
        return aVar.mo150670a();
    }

    public long getSelectedAttachmentSize() {
        AbstractC42802a aVar = this.videoDelegate;
        if (aVar != null) {
            return aVar.mo150672c();
        }
        Log.m165383e("UploadImageViewModel", "getSelectedAttachmentSize no delegate");
        return 0;
    }

    public long getSelectedCalculationFileSize() {
        AbstractC42802a aVar = this.videoDelegate;
        if (aVar != null) {
            return aVar.mo150673d();
        }
        Log.m165383e("UploadImageViewModel", "getSelectedCalculationFileSize no delegate");
        return 0;
    }

    public void setVideoDelegate(AbstractC42802a aVar) {
        this.videoDelegate = aVar;
    }

    public void updatePermissionCode(PermissionCode permissionCode2) {
        Log.m165389i("UploadImageViewModel", "updatePermissionCode");
        if (permissionCode2 == null) {
            this.permissionCode = PermissionCode.NONE;
        }
        this.permissionCode = permissionCode2;
    }

    public void uploadVideo(String str) {
        Log.m165389i("UploadImageViewModel", "uploadVideo");
        AbstractC42802a aVar = this.videoDelegate;
        if (aVar != null) {
            aVar.mo150669a(str);
        }
    }
}
