package com.ss.android.lark.share.impl.p2682a.p2683a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.share.impl.p2682a.p2683a.C54726b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.ao;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.share.impl.a.a.d */
public class C54730d implements C54726b.AbstractC54728b {

    /* renamed from: a */
    public String f135157a;

    /* renamed from: a */
    private C54731a m212367a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bitmap d = ao.m224315d(str);
        if (d != null) {
            String a = C26311p.m95265a(d, C57881t.m224630d(context) + Math.abs(str.hashCode()) + ".jpg");
            int height = d.getHeight();
            int width = d.getWidth();
            Log.m165389i("VideoMessage", "transformVideo thumbPath:" + a + ", width");
            return new C54731a(a, width, height);
        }
        Log.m165383e("VideoMessage", "get video thumb frame failed");
        return null;
    }

    @Override // com.ss.android.lark.share.impl.p2682a.p2683a.C54726b.AbstractC54728b
    /* renamed from: a */
    public void mo186865a(Context context, Bundle bundle, CommonShareData commonShareData) {
        if (bundle != null) {
            String string = bundle.getString("android.intent.lark.EXTRA_VIDEO_OBJECT_VIDEO_URL");
            this.f135157a = string;
            if (!TextUtils.isEmpty(string)) {
                C54731a a = m212367a(context, this.f135157a);
                HashMap hashMap = new HashMap();
                if (a != null) {
                    String str = a.f135158a;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    commonShareData.setImages(arrayList);
                }
                hashMap.put(this.f135157a, Long.valueOf(C26311p.m95281c(new File(this.f135157a))));
                commonShareData.setVideos(hashMap);
                Log.m165389i("MediaMessage", "unserialize video message");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.share.impl.a.a.d$a */
    public class C54731a {

        /* renamed from: a */
        public final String f135158a;

        /* renamed from: c */
        private final int f135160c;

        /* renamed from: d */
        private final int f135161d;

        public C54731a(String str, int i, int i2) {
            this.f135158a = str;
            this.f135160c = i;
            this.f135161d = i2;
        }
    }
}
