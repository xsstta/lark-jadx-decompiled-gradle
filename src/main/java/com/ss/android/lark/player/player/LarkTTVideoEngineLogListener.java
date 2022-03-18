package com.ss.android.lark.player.player;

import com.ss.android.lark.log.Log;
import com.ss.ttvideoengine.utils.TTVideoEngineLogListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/player/player/LarkTTVideoEngineLogListener;", "Lcom/ss/ttvideoengine/utils/TTVideoEngineLogListener;", "()V", "consoleLog", "", "log", "", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.player.c.g */
public final class LarkTTVideoEngineLogListener implements TTVideoEngineLogListener {
    @Override // com.ss.ttvideoengine.utils.TTVideoEngineLogListener
    public void consoleLog(String str) {
        if (LarkPlayerUtils.m202131a()) {
            Log.m165389i("TTEnginePlayerListeners", str);
        }
    }
}
