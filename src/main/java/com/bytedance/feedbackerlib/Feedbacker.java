package com.bytedance.feedbackerlib;

import android.app.Application;

public class Feedbacker {

    public interface IFeedbackCommonInfo {
        String getALogFilesDir();

        int getAid();

        String getAppId();

        String getChannel();

        String getCode();

        String getDid();

        AbstractC13886b getOnFeedbackClickListener();

        AbstractC13887c getOnMediasUploadFailedListener();

        String getUpdateVersionCode();

        String getUserId();
    }

    /* renamed from: com.bytedance.feedbackerlib.Feedbacker$a */
    public interface AbstractC13885a {
    }

    /* renamed from: com.bytedance.feedbackerlib.Feedbacker$b */
    public interface AbstractC13886b {
    }

    /* renamed from: com.bytedance.feedbackerlib.Feedbacker$c */
    public interface AbstractC13887c {
    }

    public static void clearSSOCache() {
    }

    public static void hideFeedbackFloatWindow() {
    }

    public static void init(Application application) {
    }

    public static void init(Application application, boolean z) {
    }

    public static void onScreenOrientationChanged() {
    }

    public static void setIFeedbackCommonInfo(IFeedbackCommonInfo iFeedbackCommonInfo) {
    }

    public static void showFeedbackFloatWindow() {
    }

    public static void switchToBoeDomain() {
    }

    public static void switchToOnlineDomain() {
    }

    public static synchronized void registerLarkSSOCallback(AbstractC13885a aVar) {
        synchronized (Feedbacker.class) {
        }
    }

    public static synchronized void unregisterLarkSSOCallback(AbstractC13885a aVar) {
        synchronized (Feedbacker.class) {
        }
    }
}
