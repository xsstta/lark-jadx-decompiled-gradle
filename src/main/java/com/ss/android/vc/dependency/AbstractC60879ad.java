package com.ss.android.vc.dependency;

import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.dependency.ad */
public interface AbstractC60879ad {
    void cancelPromptNotification(String str);

    void cancelRingNotification(C61303k kVar);

    boolean isSoundOn(int i);

    boolean isVibrateOn(int i);

    void pushPromptNotification(String str);

    void pushRingNotification(C61303k kVar);
}
