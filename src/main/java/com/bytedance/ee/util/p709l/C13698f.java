package com.bytedance.ee.util.p709l;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.l.f */
public class C13698f extends AbstractC1142af {
    private ContentObserver mContentObserver;
    private ContentResolver mContentResolver;
    private C1177w<Boolean> mEnable = new C1177w<>();
    public C1177w<Boolean> mLocked = new C1177w<>();
    private int mRequestOrientation = -1;
    private String mSource;
    private boolean mSwitchOrientationTemporarily;

    public C1177w<Boolean> getEnable() {
        return this.mEnable;
    }

    public C1177w<Boolean> getLocked() {
        return this.mLocked;
    }

    public int getRequestOrientation() {
        return this.mRequestOrientation;
    }

    public String getSource() {
        return this.mSource;
    }

    public boolean isSwitchOrientationTemporarily() {
        return this.mSwitchOrientationTemporarily;
    }

    public boolean isLock() {
        return Boolean.TRUE.equals(this.mLocked.mo5927b());
    }

    public boolean isLocked() {
        ContentResolver contentResolver = this.mContentResolver;
        if (contentResolver == null || Settings.System.getInt(contentResolver, "accelerometer_rotation", 0) != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        ContentResolver contentResolver = this.mContentResolver;
        if (contentResolver != null) {
            contentResolver.unregisterContentObserver(this.mContentObserver);
        }
    }

    public C13698f() {
        this.mEnable.mo5929b((Boolean) true);
    }

    public void disable() {
        if (Boolean.TRUE.equals(this.mEnable.mo5927b())) {
            this.mEnable.mo5929b(Boolean.FALSE);
        }
    }

    public void enable() {
        if (Boolean.FALSE.equals(this.mEnable.mo5927b())) {
            this.mEnable.mo5929b(Boolean.TRUE);
        }
    }

    public void setSource(String str) {
        this.mSource = str;
    }

    public void setSwitchOrientationTemporarily(boolean z) {
        this.mSwitchOrientationTemporarily = z;
    }

    public void setRequestOrientation(int i) {
        C13479a.m54764b("OrientationViewModel", "setRequestOrientation: " + i);
        this.mRequestOrientation = i;
    }

    public void registerLockObserver(Context context) {
        this.mContentObserver = new ContentObserver(new Handler()) {
            /* class com.bytedance.ee.util.p709l.C13698f.C136991 */

            public void onChange(boolean z) {
                C13698f.this.mLocked.mo5929b(Boolean.valueOf(C13698f.this.isLocked()));
            }
        };
        ContentResolver contentResolver = context.getContentResolver();
        this.mContentResolver = contentResolver;
        contentResolver.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, this.mContentObserver);
        this.mLocked.mo5929b(Boolean.valueOf(isLocked()));
    }
}
