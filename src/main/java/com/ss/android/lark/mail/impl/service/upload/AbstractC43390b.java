package com.ss.android.lark.mail.impl.service.upload;

import com.ss.android.lark.manis.annotation.RemoteCallback;

@RemoteCallback
/* renamed from: com.ss.android.lark.mail.impl.service.upload.b */
public interface AbstractC43390b {
    boolean onFailed(String str, int i);

    boolean updateProgress(String str, int i, long j, long j2, String str2, String str3);
}
