package com.bytedance.ee.bear.basesdk.api;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.basesdk.business.comment.ICommentDependency;
import com.larksuite.framework.apiplugin.AbstractC25937e;

/* renamed from: com.bytedance.ee.bear.basesdk.api.e */
public interface AbstractC4379e {

    /* renamed from: com.bytedance.ee.bear.basesdk.api.e$a */
    public interface AbstractC4380a {
        /* renamed from: a */
        AbstractC25937e mo17032a();

        /* renamed from: a */
        void mo17033a(Activity activity, PopupWindow popupWindow, ViewGroup viewGroup);

        /* renamed from: a */
        void mo17034a(FragmentActivity fragmentActivity, FrameLayout frameLayout, String str, int i, int i2);

        /* renamed from: a */
        void mo17035a(Runnable runnable);
    }

    /* renamed from: a */
    AbstractC4380a mo17029a(ICommentDependency cVar);

    /* renamed from: a */
    String mo17030a();

    /* renamed from: b */
    String mo17031b();
}
