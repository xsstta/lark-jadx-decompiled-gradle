package com.ss.android.lark.mail.impl.service.upload;

import com.ss.android.lark.manis.annotation.RemoteCallback;

@RemoteCallback
/* renamed from: com.ss.android.lark.mail.impl.service.upload.a */
public interface AbstractC43389a {
    boolean onFailed(String str, int i);

    boolean updateProgress(String str, int i, long j, long j2);
}
