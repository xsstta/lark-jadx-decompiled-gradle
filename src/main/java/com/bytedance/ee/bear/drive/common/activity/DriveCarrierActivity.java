package com.bytedance.ee.bear.drive.common.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.AbstractC6900a;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.CarrierActivity;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p699b.C13595b;
import com.bytedance.ee.util.p718t.C13726a;

public class DriveCarrierActivity extends CarrierActivity implements AbstractC6900a {
    /* renamed from: a */
    public static void m27213a(Context context, Class<? extends C7667e> cls, Bundle bundle) {
        m27214a(context, cls, bundle, -1);
    }

    /* renamed from: a */
    public static void m27215a(Fragment fragment, Class<? extends C7667e> cls, Bundle bundle) {
        Class cls2;
        if (fragment == null || !C13726a.m55676b(fragment.getActivity())) {
            C13479a.m54758a("CarrierActivity", "launchWithContentForResult# fragment is null");
            return;
        }
        FragmentActivity activity = fragment.getActivity();
        if (C13595b.m55176a()) {
            cls2 = DriveCarrierMainProcActivity.class;
        } else {
            cls2 = DriveCarrierActivity.class;
        }
        Intent intent = new Intent(activity, cls2);
        intent.putExtra("class_fragment_content", cls);
        if (bundle != null) {
            intent.putExtra("class_fragment_extras", bundle);
        }
        fragment.getActivity().startActivityFromFragment(fragment, intent, 100);
    }

    /* renamed from: a */
    public static void m27214a(Context context, Class<? extends C7667e> cls, Bundle bundle, int i) {
        Class cls2;
        if (C13595b.m55176a()) {
            cls2 = DriveCarrierMainProcActivity.class;
        } else {
            cls2 = DriveCarrierActivity.class;
        }
        Intent intent = new Intent(context, cls2);
        intent.putExtra("class_fragment_content", cls);
        if (bundle != null) {
            intent.putExtra("class_fragment_extras", bundle);
        }
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        if (i == -1 || !(context instanceof Activity)) {
            context.startActivity(intent);
        } else {
            ((Activity) context).startActivityForResult(intent, i);
        }
    }
}
