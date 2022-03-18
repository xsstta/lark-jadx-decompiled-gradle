package com.ss.android.lark.setting.page.content.common.impl.translate.manis;

import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.ParcelableError;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.TransmissionData;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.manis.a */
public interface AbstractC54255a {

    @RemoteCallback
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.manis.a$a */
    public interface AbstractC54256a {
        void onError(ParcelableError parcelableError);

        void onSuccess(TransmissionData transmissionData);
    }

    @RemoteCallback
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.manis.a$b */
    public interface AbstractC54257b {
        void onError(ParcelableError parcelableError);

        void onSuccess();
    }
}
