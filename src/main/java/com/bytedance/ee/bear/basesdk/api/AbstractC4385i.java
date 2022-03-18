package com.bytedance.ee.bear.basesdk.api;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.OnlineOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;
import com.bytedance.ee.bear.drivesdk.PreviewType;

/* renamed from: com.bytedance.ee.bear.basesdk.api.i */
public interface AbstractC4385i {
    /* renamed from: a */
    Fragment mo17055a(LocalOpenEntity localOpenEntity);

    /* renamed from: a */
    PreviewType mo17056a(String str, String str2);

    /* renamed from: a */
    void mo17057a(Context context, BaseOpenEntity baseOpenEntity);

    /* renamed from: a */
    void mo17058a(Context context, LocalOpenEntity localOpenEntity);

    /* renamed from: a */
    void mo17059a(OnlineOpenEntity onlineOpenEntity);

    /* renamed from: a */
    void mo17060a(String str, PreviewAction previewAction);
}
