package com.bytedance.ee.bear.document.p302c;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.ee.bear.document.titlebar.ImmersiveWebContainerBehavior;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.c.d */
public class C5686d {
    /* renamed from: a */
    public static CustomTitleView m23057a(Context context) {
        CustomTitleView customTitleView = new CustomTitleView(context.getApplicationContext());
        customTitleView.setGravity(17);
        customTitleView.setTitleTextSize(R.dimen.doc_title_bar_text_size);
        customTitleView.setTitleTextColor(R.color.text_title);
        customTitleView.setTitleTextBold(true);
        customTitleView.setExternalVisible(false);
        return customTitleView;
    }

    /* renamed from: a */
    private static <V extends View> V m23056a(Activity activity, View view, int i) {
        if (activity == null) {
            return null;
        }
        V v = (V) activity.findViewById(i);
        return (v != null || view == null) ? v : (V) view.findViewById(i);
    }

    /* renamed from: a */
    public static void m23058a(Activity activity, View view, boolean z) {
        View a;
        int i;
        C13479a.m54772d("DocumentViewUtil", "updateWebContentHeight...");
        if (activity != null && (a = m23056a(activity, view, (int) R.id.contentOuterContainer)) != null && !(((CoordinatorLayout.LayoutParams) a.getLayoutParams()).getBehavior() instanceof ImmersiveWebContainerBehavior)) {
            if (z) {
                View a2 = m23056a(activity, view, (int) R.id.doc_appbar_layout);
                if (a2 != null) {
                    i = a2.getHeight();
                    if (i <= 0) {
                        i = Math.round(activity.getResources().getDimension(R.dimen.doc_titlebar_height));
                    }
                } else {
                    return;
                }
            } else {
                i = 0;
            }
            a.setPadding(0, i, 0, 0);
        }
    }
}
