package com.bytedance.ee.bear;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;
import com.bytedance.ee.bear.drivesdk.PreviewType;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.d */
public interface AbstractC5239d {
    /* renamed from: a */
    Fragment mo21089a(LocalOpenEntity localOpenEntity);

    /* renamed from: a */
    Fragment mo21090a(String str, Bundle bundle);

    /* renamed from: a */
    PreviewType mo21091a(String str, String str2);

    /* renamed from: a */
    void mo21092a(Context context, BaseOpenEntity baseOpenEntity);

    /* renamed from: a */
    void mo21093a(Context context, ArrayList<? extends BaseOpenEntity> arrayList, int i);

    /* renamed from: a */
    void mo21094a(String str, PreviewAction previewAction);
}
