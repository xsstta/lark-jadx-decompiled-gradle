package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.WsChannelSettings;

class WsChannelEnableObserver {
    private final Context mContext;
    private final Handler mHandler;
    private final OnWsChannelEnableChangedObserver mObserver;
    private boolean mPushSdkEnabled;
    private ContentObserver mPushSdkEnabledObserver;

    /* access modifiers changed from: package-private */
    public interface OnWsChannelEnableChangedObserver {
        void onWsChannelEnableChange(boolean z);
    }

    /* access modifiers changed from: package-private */
    public boolean isEnable() {
        return this.mPushSdkEnabled;
    }

    private void registerContentObservers() {
        try {
            this.mContext.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, "frontier_enabled", "boolean"), true, this.mPushSdkEnabledObserver);
        } catch (Throwable unused) {
        }
    }

    public void handlePushSdkEnabled() {
        OnWsChannelEnableChangedObserver onWsChannelEnableChangedObserver;
        try {
            boolean z = this.mPushSdkEnabled;
            loadPushSdkEnabled();
            boolean z2 = this.mPushSdkEnabled;
            if (z != z2 && (onWsChannelEnableChangedObserver = this.mObserver) != null) {
                onWsChannelEnableChangedObserver.onWsChannelEnableChange(z2);
            }
        } catch (Exception unused) {
        }
    }

    private void loadPushSdkEnabled() {
        try {
            boolean isEnable = WsChannelSettings.inst(this.mContext).isEnable();
            if (Logger.debug()) {
                Logger.m15167d("WsChannelService", "pushSdkEnabled = " + isEnable);
            }
            if (isEnable != this.mPushSdkEnabled) {
                this.mPushSdkEnabled = isEnable;
            }
        } catch (Throwable unused) {
        }
    }

    WsChannelEnableObserver(Context context, Handler handler, OnWsChannelEnableChangedObserver onWsChannelEnableChangedObserver) {
        this.mHandler = handler;
        this.mContext = context;
        this.mObserver = onWsChannelEnableChangedObserver;
        loadPushSdkEnabled();
        this.mPushSdkEnabledObserver = new ContentObserver(handler) {
            /* class com.bytedance.common.wschannel.server.WsChannelEnableObserver.C36781 */

            public void onChange(boolean z) {
                if (Logger.debug()) {
                    Logger.m15167d("WsChannelService", "KEY_FRONTIER_ENABLED");
                }
                WsChannelEnableObserver.this.handlePushSdkEnabled();
            }
        };
        registerContentObservers();
    }
}
