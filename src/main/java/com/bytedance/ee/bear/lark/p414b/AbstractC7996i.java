package com.bytedance.ee.bear.lark.p414b;

import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.IGetDataCallback;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.lark.b.i */
public interface AbstractC7996i {
    /* renamed from: a */
    void mo30996a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, IGetDataCallback<C7997a> iGetDataCallback);

    /* renamed from: a */
    void mo30997a(List<String> list, List<String> list2, int i, int i2, IGetDataCallback<List<Bitmap>> iGetDataCallback);

    /* renamed from: com.bytedance.ee.bear.lark.b.i$a */
    public static class C7997a {

        /* renamed from: a */
        public String f21480a;

        /* renamed from: b */
        public String f21481b;

        public C7997a(String str, String str2) {
            this.f21480a = str;
            this.f21481b = str2;
        }
    }
}
