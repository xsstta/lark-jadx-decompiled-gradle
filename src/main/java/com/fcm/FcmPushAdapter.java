package com.fcm;

import android.content.Context;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.third.IPushAdapter;
import com.bytedance.push.third.PushChannelHelper;
import com.fcm.p963a.C21281a;
import com.ss.android.message.AppProvider;

public class FcmPushAdapter implements IPushAdapter {
    private static int FCM_PUSH = -1;

    @Override // com.bytedance.push.third.IPushAdapter
    public boolean isPushAvailable(Context context, int i) {
        return true;
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public boolean requestNotificationPermission(int i) {
        return false;
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public void setAlias(Context context, String str, int i) {
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public void trackPush(Context context, int i, Object obj) {
    }

    public static int getFcmPush() {
        if (FCM_PUSH == -1) {
            FCM_PUSH = PushChannelHelper.inst(AppProvider.getApp()).getChannelId(FcmPushAdapter.class.getName());
        }
        return FCM_PUSH;
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        return C21280a.m77095a(str, context);
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public void unregisterPush(Context context, int i) {
        if (context != null && i == getFcmPush()) {
            PushSupporter.logger().mo68955i("FcmPush", "unregisterPush");
        }
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public void registerPush(Context context, int i) {
        if (context == null || i != getFcmPush()) {
            String str = null;
            if (context == null) {
                str = "context is null";
            } else if (i != getFcmPush()) {
                str = "register sender error";
            }
            PushSupporter.monitor().monitorRegisterSenderFailed(i, 101, "0", str);
            return;
        }
        ILogger logger = PushSupporter.logger();
        logger.mo68955i("FcmPush", "registerPush:" + i);
        C21281a.m77097a(context);
    }
}
