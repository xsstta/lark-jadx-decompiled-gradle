package com.bytedance.ee.bear.lark.selector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.bytedance.ee.bear.lark.selector.c */
public class C8117c {
    /* renamed from: a */
    public static void m32406a(Activity activity, int i) {
        m32407a(activity, i, new Bundle());
    }

    /* renamed from: a */
    private static void m32407a(Activity activity, int i, Bundle bundle) {
        Intent intent = new Intent(activity, DocSelectorActivity.class);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public static void m32408a(Activity activity, int i, String str, int i2, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", str);
        bundle.putInt("extra_max_num", i2);
        bundle.putString("extra_confirm_text", str2);
        m32407a(activity, i, bundle);
    }
}
