package com.ss.android.lark.filedetail.impl.detail;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import java.io.File;

/* access modifiers changed from: package-private */
public class FileTransmissionPresenter$2 extends BinderMenuAction.Stub {
    final /* synthetic */ C38243c this$0;
    final /* synthetic */ File val$fileToOpen;
    final /* synthetic */ String val$fileType;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction.AbstractC5143a
    public void action(Bundle bundle) {
        String str;
        if (!TextUtils.isEmpty(this.this$0.f98077g)) {
            str = this.this$0.f98077g;
        } else {
            str = this.this$0.f98078h;
        }
        C38243c cVar = this.this$0;
        cVar.mo139832a(cVar.f98080j, this.val$fileToOpen, this.val$fileType, str);
    }

    FileTransmissionPresenter$2(C38243c cVar, File file, String str) {
        this.this$0 = cVar;
        this.val$fileToOpen = file;
        this.val$fileType = str;
    }
}
