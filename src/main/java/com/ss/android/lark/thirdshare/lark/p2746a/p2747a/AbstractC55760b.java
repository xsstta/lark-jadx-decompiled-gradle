package com.ss.android.lark.thirdshare.lark.p2746a.p2747a;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.lark.thirdshare.base.export.ShareRemoteConfig;
import java.util.Map;

/* renamed from: com.ss.android.lark.thirdshare.lark.a.a.b */
public interface AbstractC55760b {
    Map<String, ShareRemoteConfig> getShareRemoteConfig();

    boolean isGooglePlay();

    void shareLarkChatImage(Context context, Bitmap bitmap, int i);

    void shareLarkChatText(Context context, String str, String str2, int i);
}
