package com.bytedance.services.apm.api;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: com.bytedance.services.apm.api.c */
public interface AbstractC20698c {
    void onActivityCreated(Activity activity, Bundle bundle);

    void onActivityPause(Activity activity);

    void onActivityResume(Activity activity);

    void onActivityStarted(Activity activity);

    void onBackground(Activity activity);

    void onChange(Activity activity, Fragment fragment);

    void onFront(Activity activity);
}
