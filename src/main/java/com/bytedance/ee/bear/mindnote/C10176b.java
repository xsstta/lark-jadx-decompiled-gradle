package com.bytedance.ee.bear.mindnote;

import android.content.Context;
import android.os.Build;
import androidx.core.graphics.C0768a;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.C5869m;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.mindnote.b */
public class C10176b extends C5869m {

    /* renamed from: e */
    static final /* synthetic */ boolean f27468e = true;

    @Override // com.bytedance.ee.bear.document.aj, androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onDestroyView() {
        int i;
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (f27468e || activity != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                i = getResources().getColor(R.color.bg_body, activity.getTheme());
            } else {
                i = getResources().getColor(R.color.bg_body);
            }
            C11789c.m48865a(activity, i, m42405a(getContext()));
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private boolean m42405a(Context context) {
        if (C0768a.m3714b(-1, UIUtils.getColor(context, R.color.bg_body)) <= 3.0d) {
            return f27468e;
        }
        return false;
    }
}
