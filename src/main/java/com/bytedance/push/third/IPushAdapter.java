package com.bytedance.push.third;

import android.content.Context;

public interface IPushAdapter {
    boolean checkThirdPushConfig(String str, Context context) throws Exception;

    boolean isPushAvailable(Context context, int i);

    void registerPush(Context context, int i);

    boolean requestNotificationPermission(int i);

    void setAlias(Context context, String str, int i);

    void trackPush(Context context, int i, Object obj);

    void unregisterPush(Context context, int i);
}
