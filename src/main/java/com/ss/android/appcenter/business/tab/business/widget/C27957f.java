package com.ss.android.appcenter.business.tab.business.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.tab.business.blockit.BlockLogFragment;

/* renamed from: com.ss.android.appcenter.business.tab.business.widget.f */
public class C27957f {
    /* renamed from: a */
    public static void m102091a(FragmentActivity fragmentActivity, String str) {
        BlockLogFragment.f69538b.mo99301a(fragmentActivity, str);
    }

    /* renamed from: b */
    public void mo99675b(final FragmentActivity fragmentActivity, final String str) {
        ViewGroup viewGroup = (ViewGroup) fragmentActivity.findViewById(16908290);
        View inflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.block_log_float_view, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        inflate.setTranslationX(200.0f);
        inflate.setTranslationY(400.0f);
        viewGroup.addView(inflate, layoutParams);
        inflate.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.widget.C27957f.View$OnClickListenerC279581 */

            public void onClick(View view) {
                C27957f.m102091a(fragmentActivity, str);
            }
        });
    }
}
