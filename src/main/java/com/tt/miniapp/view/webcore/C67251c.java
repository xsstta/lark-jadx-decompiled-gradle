package com.tt.miniapp.view.webcore;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: com.tt.miniapp.view.webcore.c */
public class C67251c extends InputConnectionWrapper {
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return super.sendKeyEvent(keyEvent);
    }

    public C67251c(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (i - i2 != 1) {
            return super.deleteSurroundingText(i, i2);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        sendKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 0, 67, 0, 0, -1, 0, 22));
        sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), uptimeMillis, 1, 67, 0, 0, -1, 0, 22));
        return true;
    }
}
