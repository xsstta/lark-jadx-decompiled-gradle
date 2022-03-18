package com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a;

import android.net.Uri;
import androidx.lifecycle.AbstractC1142af;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.a.b */
public class C42776b extends AbstractC1142af {
    private final String TAG = "MailAttachmentPickerViewModel";
    private AbstractC42777a delegate;

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.a.b$a */
    public interface AbstractC42777a {
        /* renamed from: a */
        long mo150676a();

        /* renamed from: a */
        void mo150677a(List<Uri> list);

        /* renamed from: b */
        long mo150678b();
    }

    public long getSelectedAttachmentSize() {
        AbstractC42777a aVar = this.delegate;
        if (aVar != null) {
            return aVar.mo150676a();
        }
        Log.m165383e("MailAttachmentPickerViewModel", "getSelectedAttachmentSize no delegate");
        return 0;
    }

    public long getSelectedCalculationFileSize() {
        AbstractC42777a aVar = this.delegate;
        if (aVar != null) {
            return aVar.mo150678b();
        }
        Log.m165383e("MailAttachmentPickerViewModel", "getSelectedCalculationFileSize no delegate");
        return 0;
    }

    public void setDelegate(AbstractC42777a aVar) {
        this.delegate = aVar;
    }

    public void uploadAttachments(List<Uri> list) {
        AbstractC42777a aVar = this.delegate;
        if (aVar != null) {
            aVar.mo150677a(list);
        }
    }
}
