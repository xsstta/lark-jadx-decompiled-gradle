package com.ss.android.lark.share.impl.p2682a.p2683a;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.share.impl.p2682a.p2683a.C54726b;

/* renamed from: com.ss.android.lark.share.impl.a.a.c */
public class C54729c implements C54726b.AbstractC54728b {

    /* renamed from: a */
    public String f135156a;

    @Override // com.ss.android.lark.share.impl.p2682a.p2683a.C54726b.AbstractC54728b
    /* renamed from: a */
    public void mo186865a(Context context, Bundle bundle, CommonShareData commonShareData) {
        if (bundle != null) {
            String string = bundle.getString("android.intent.lark.EXTRA_TEXT_OBJECT_TEXT");
            this.f135156a = string;
            commonShareData.setContent(string);
            Log.m165389i("MediaMessage", "unserialize text message");
        }
    }
}
