package com.bytedance.ee.bear.browser.plugin;

import android.content.res.Configuration;
import com.bytedance.ee.bear.browser.plugin.C4943e;

/* renamed from: com.bytedance.ee.bear.browser.plugin.c */
public interface AbstractC4941c<H extends C4943e> {
    H getHost();

    void onAttachToHost(H h);

    void onAttachToUIContainer(H h, AbstractC4958n nVar);

    void onConfigurationChanged(Configuration configuration);

    void onDetachFromHost(H h);

    void onDetachFromUIContainer(H h, AbstractC4958n nVar);

    void setUserVisibleHint(boolean z);
}
