package com.bytedance.ee.bear.contract;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@NewRemoteService
public interface ak {

    /* renamed from: com.bytedance.ee.bear.contract.ak$a */
    public interface AbstractC5105a {
        void onChange();
    }

    /* renamed from: com.bytedance.ee.bear.contract.ak$b */
    public interface AbstractC5106b {
        void onFail(int i, String str);

        void onSuccess(String str);
    }

    /* renamed from: com.bytedance.ee.bear.contract.ak$c */
    public interface AbstractC5107c {
        void onProcessStart();
    }

    void addProcessStartCallback(BinderIProcessStart binderIProcessStart);

    Bundle doCommand(Bundle bundle);

    void fetchEmojis();

    String getEmojiImageFromNet(String str);

    List<String> getRecentReactionList();

    void getResMapFromNet(int i, List<String> list);

    List<String> getWholeReactionList();

    void goToCustomService();

    void goToHelpCenter();

    void goToProfileMain(String str, String str2);

    void handleQrResult(String str);

    boolean isFeedCardShortcut(String str);

    void jumpToLarkFeed(String str);

    void markFeedCardShortcut(boolean z, int i, String str, BinderIMarkFeedCallback binderIMarkFeedCallback);

    void notifyAnnouncementChange(String str, String str2, boolean z, String str3, IBinder iBinder);

    void onProcessStart();

    void openExternalUrl(String str, Map<String, String> map);

    String recognizeQRCode(String str);

    void removeProcessStartCallback(BinderIProcessStart binderIProcessStart);

    void routeTabDocs(int i);

    void routeToLarkAbout();

    void shareImages(String str, String str2, ArrayList<Uri> arrayList);

    void shareImages(String str, String str2, ArrayList<Uri> arrayList, boolean z);

    void shareTextPlain(String str, String str2);

    void shareTextPlain(String str, String str2, boolean z);

    void updateOrder(String str);
}
