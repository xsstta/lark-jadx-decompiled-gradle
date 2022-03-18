package com.ss.android.lark.screen.audit.impl;

import android.app.Activity;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.screen.p2581a.p2582a.AbstractC53225c;

@ClaymoreImpl(AbstractC53225c.class)
public class ScreenshotDetector implements AbstractC53225c {
    @Override // com.ss.android.lark.screen.p2581a.p2582a.AbstractC53225c
    public void stop() {
        Log.m165379d("ScreenshotDetector", "do noting");
    }

    @Override // com.ss.android.lark.screen.p2581a.p2582a.AbstractC53225c
    public void start(Activity activity) {
        Log.m165379d("ScreenshotDetector", "do noting");
    }
}
