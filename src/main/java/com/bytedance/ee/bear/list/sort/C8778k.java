package com.bytedance.ee.bear.list.sort;

import android.text.TextUtils;
import com.bytedance.ee.bear.list.folder.C8379r;
import com.bytedance.ee.bear.list.folder.C8381t;
import com.bytedance.ee.bear.list.manualoffline.C8610i;
import com.bytedance.ee.bear.list.mine.C8620i;
import com.bytedance.ee.bear.list.p431g.C8455a;
import com.bytedance.ee.bear.list.p431g.C8456b;
import com.bytedance.ee.bear.list.recent.C8692k;
import com.bytedance.ee.bear.list.share.ao;
import com.bytedance.ee.bear.list.sort.AbstractC8765g;
import com.bytedance.ee.bear.list.star.C8816n;
import com.bytedance.ee.bear.service.C10917c;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.list.sort.k */
public class C8778k {
    /* renamed from: a */
    static AbstractC8765g.AbstractC8766a m36826a(C10917c cVar, String str, boolean z) {
        if (TextUtils.equals(str, "recent")) {
            return new C8692k(cVar, z);
        }
        if (TextUtils.equals(str, "mine")) {
            return new C8620i(cVar, z);
        }
        if (TextUtils.equals(str, "shared_file") || TextUtils.equals(str, "shared")) {
            return new ao(cVar, z);
        }
        if (TextUtils.equals(str, "star")) {
            return new C8816n(cVar, z);
        }
        if (TextUtils.equals(str, "manual_offline")) {
            return new C8610i(cVar, z);
        }
        if (TextUtils.equals(str, "root") || TextUtils.equals(str, "shared_folder")) {
            return new C8379r(cVar, z);
        }
        if (TextUtils.equals(str, "template")) {
            return new C8455a(cVar, z);
        }
        if (TextUtils.equals(str, "template_v4")) {
            return new C8456b(cVar, z);
        }
        if (TextUtils.equals(str, "template_topic")) {
            return new C8456b(cVar, z);
        }
        return new C8381t(cVar, z);
    }
}
