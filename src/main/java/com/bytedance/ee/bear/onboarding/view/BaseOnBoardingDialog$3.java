package com.bytedance.ee.bear.onboarding.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class BaseOnBoardingDialog$3 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ AbstractDialogC10436a f28015a;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void dismissDialog() {
        C13479a.m54772d("BaseOnBoardingDialog", "Activity is destroying, should dismissDialog...");
        this.f28015a.dismiss();
    }

    BaseOnBoardingDialog$3(AbstractDialogC10436a aVar) {
        this.f28015a = aVar;
    }
}
