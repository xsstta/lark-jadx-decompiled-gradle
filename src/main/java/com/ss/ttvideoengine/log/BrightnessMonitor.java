package com.ss.ttvideoengine.log;

import android.content.Context;
import android.database.ContentObserver;
import android.provider.Settings;
import com.ss.android.vesdk.p3188b.C63954b;
import com.ss.ttvideoengine.utils.ScreenUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public class BrightnessMonitor {
    private final ContentObserver mBrightnessObserver = new ContentObserver(null) {
        /* class com.ss.ttvideoengine.log.BrightnessMonitor.C654491 */

        public void onChange(boolean z) {
            super.onChange(z);
            BrightnessMonitor.this.addToHistory();
        }
    };
    private final Context mContext;
    private final ArrayList<String> mHistoryList = new ArrayList<>();
    private volatile boolean mIsStart;

    public ArrayList<String> getList() {
        return this.mHistoryList;
    }

    public void stop() {
        if (this.mIsStart) {
            this.mIsStart = false;
            this.mContext.getContentResolver().unregisterContentObserver(this.mBrightnessObserver);
        }
    }

    public void addToHistory() {
        HashMap hashMap = new HashMap();
        hashMap.put(C63954b.f161494a, Float.valueOf(ScreenUtils.getNormalizedBrightness(this.mContext)));
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        this.mHistoryList.add(new JSONObject(hashMap).toString());
    }

    public void start() {
        if (!this.mIsStart) {
            this.mIsStart = true;
            try {
                this.mContext.getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), true, this.mBrightnessObserver);
            } catch (Exception e) {
                TTVideoEngineLog.m256508w("BrightnessMonitor", e.getMessage());
            }
            addToHistory();
        }
    }

    public BrightnessMonitor(Context context) {
        this.mContext = context;
    }
}
