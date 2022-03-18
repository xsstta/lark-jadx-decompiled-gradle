package com.ss.android.lark.share.impl.p2682a.p2683a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.share.impl.p2682a.C54739d;
import com.ss.android.lark.share.impl.p2682a.p2683a.C54726b;

/* renamed from: com.ss.android.lark.share.impl.a.a.e */
public class C54732e implements C54726b.AbstractC54728b {

    /* renamed from: a */
    public String f135162a;

    /* renamed from: b */
    public String f135163b;

    /* renamed from: c */
    public String f135164c;

    /* renamed from: d */
    public byte[] f135165d;

    /* renamed from: e */
    public boolean f135166e;

    @Override // com.ss.android.lark.share.impl.p2682a.p2683a.C54726b.AbstractC54728b
    /* renamed from: a */
    public void mo186865a(Context context, Bundle bundle, CommonShareData commonShareData) {
        String str;
        if (bundle != null) {
            this.f135162a = bundle.getString("android.intent.lark.EXTRA_WEB_PAGE_OBJECT_URL");
            this.f135163b = bundle.getString("android.intent.lark.EXTRA_WEB_PAGE_OBJECT_TITLE");
            this.f135164c = bundle.getString("android.intent.lark.EXTRA_WEB_PAGE_OBJECT_CONTENT");
            this.f135165d = bundle.getByteArray("android.intent.lark.EXTRA_WEB_PAGE_OBJECT_ICON");
            boolean z = bundle.getBoolean("android.intent.lark.EXTRA_WEB_PAGE_NEW_STYLE", false);
            this.f135166e = z;
            commonShareData.setNewStyle(z);
            commonShareData.setTitle(this.f135163b);
            if (TextUtils.isEmpty(this.f135164c)) {
                str = this.f135162a;
            } else {
                str = this.f135164c;
            }
            commonShareData.setContent(str);
            commonShareData.setUrl(this.f135162a);
            byte[] bArr = this.f135165d;
            if (bArr != null && bArr.length > 0) {
                Log.m165389i("MediaMessage", "unserialize icon data");
                commonShareData.setIconPath(C54739d.m212387a(context, this.f135165d));
            }
            Log.m165389i("MediaMessage", "unserialize webpage Message");
        }
    }
}
