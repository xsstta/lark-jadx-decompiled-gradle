package com.ss.android.lark.share.impl.p2682a.p2683a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.share.impl.p2682a.C54739d;
import com.ss.android.lark.share.impl.p2682a.p2683a.C54726b;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.share.impl.a.a.a */
public class C54725a implements C54726b.AbstractC54728b {

    /* renamed from: a */
    public byte[] f135149a;

    /* renamed from: b */
    public String f135150b;

    /* renamed from: c */
    public String f135151c;

    @Override // com.ss.android.lark.share.impl.p2682a.p2683a.C54726b.AbstractC54728b
    /* renamed from: a */
    public void mo186865a(Context context, Bundle bundle, CommonShareData commonShareData) {
        if (bundle != null) {
            this.f135149a = bundle.getByteArray("android.intent.lark.EXTRA_IMAGE_OBJECT_IMAGE_DATA");
            this.f135151c = bundle.getString("android.intent.lark.EXTRA_IMAGE_OBJECT_IMAGE_PATH");
            this.f135150b = bundle.getString("android.intent.lark.EXTRA_IMAGE_OBJECT_IMAGE_URL");
            byte[] bArr = this.f135149a;
            if (bArr != null && bArr.length > 0) {
                Log.m165389i("MediaMessage", "unserialize image data");
                String a = C54739d.m212387a(context, this.f135149a);
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(a)) {
                    arrayList.add(a);
                }
                commonShareData.setImages(arrayList);
            } else if (!TextUtils.isEmpty(this.f135151c)) {
                Log.m165389i("MediaMessage", "unserialize image path");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(this.f135151c);
                commonShareData.setImages(arrayList2);
            }
        }
    }
}
