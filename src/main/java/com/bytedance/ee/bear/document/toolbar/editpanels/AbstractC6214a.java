package com.bytedance.ee.bear.document.toolbar.editpanels;

import android.content.Context;
import androidx.lifecycle.LiveData;

/* renamed from: com.bytedance.ee.bear.document.toolbar.editpanels.a */
public interface AbstractC6214a {
    LiveData<Boolean> getActive();

    int getPanelHeight(Context context);

    String getPanelName();

    void onBecomeActive(C6215b bVar, AbstractC6214a aVar);

    void onBecomeInactive(C6215b bVar, AbstractC6214a aVar);

    void requestNotFocus(Context context);

    boolean shouldNotifyVCKeyboardEvent();
}
