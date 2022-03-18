package com.bytedance.ee.bear.list.sort;

import android.text.TextUtils;
import com.bytedance.ee.bear.list.folder.C8380s;
import com.bytedance.ee.bear.list.folder.aw;
import com.bytedance.ee.bear.list.manualoffline.C8611j;
import com.bytedance.ee.bear.list.mine.C8621j;
import com.bytedance.ee.bear.list.share.C8727f;
import com.bytedance.ee.bear.list.share.ap;
import com.bytedance.ee.bear.list.share.av;
import com.bytedance.ee.bear.list.sort.AbstractC8769h;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.list.sort.p */
public class C8788p {
    /* renamed from: a */
    static AbstractC8769h.AbstractC8770a m36853a(String str) {
        if (TextUtils.equals(str, "root") || TextUtils.equals(str, "shared_folder") || TextUtils.equals(str, "my_root")) {
            return new C8380s();
        }
        if (TextUtils.equals(str, "shared_folder")) {
            return new C8727f();
        }
        if (TextUtils.equals(str, "shared")) {
            return new av();
        }
        if (TextUtils.equals(str, "manual_offline")) {
            return new C8611j();
        }
        if (TextUtils.equals(str, "mine")) {
            return new C8621j();
        }
        if (TextUtils.equals(str, "shared_file")) {
            return new ap();
        }
        return new aw();
    }
}
