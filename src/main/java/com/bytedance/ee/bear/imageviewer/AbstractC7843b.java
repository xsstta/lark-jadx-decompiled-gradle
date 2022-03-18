package com.bytedance.ee.bear.imageviewer;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a;

/* renamed from: com.bytedance.ee.bear.imageviewer.b */
public interface AbstractC7843b extends AbstractC5179a {
    /* renamed from: a */
    View mo30649a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: a */
    void mo30650a(Configuration configuration);

    /* renamed from: a */
    void mo30651a(View view, ImageData imageData);

    /* renamed from: a */
    void mo30652a(FragmentActivity fragmentActivity, Fragment fragment, LifecycleOwner lifecycleOwner, Bundle bundle);

    /* renamed from: d */
    void mo30653d();

    /* renamed from: e */
    void mo30654e();
}
