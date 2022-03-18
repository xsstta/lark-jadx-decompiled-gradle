package com.bytedance.ee.bear.document.orientation;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.Stack;

/* renamed from: com.bytedance.ee.bear.document.orientation.b */
public class C6055b extends AbstractC1142af {
    private ContentObserver mContentObserver;
    private ContentResolver mContentResolver;
    private C1177w<Boolean> mEnable = new C1177w<>();
    public C1177w<Boolean> mLocked = new C1177w<>();
    private C1177w<Stack<AbstractC6054a>> mPanels = new C1177w<>();
    private int mRequestOrientation = -1;
    private String mSource;
    private boolean mSwitchOrientationTemporarily;

    public C1177w<Boolean> getEnable() {
        return this.mEnable;
    }

    public C1177w<Boolean> getLocked() {
        return this.mLocked;
    }

    public C1177w<Stack<AbstractC6054a>> getPanels() {
        return this.mPanels;
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

    private Stack<AbstractC6054a> getPanelStack() {
        Stack<AbstractC6054a> b = this.mPanels.mo5927b();
        if (b != null) {
            return b;
        }
        Stack<AbstractC6054a> stack = new Stack<>();
        this.mPanels.mo5929b(stack);
        return stack;
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

    public C6055b() {
        this.mEnable.mo5929b((Boolean) true);
    }

    public void setSource(String str) {
        this.mSource = str;
    }

    public void setSwitchOrientationTemporarily(boolean z) {
        this.mSwitchOrientationTemporarily = z;
    }

    public /* synthetic */ void lambda$onOrientationSupportPanelDismiss$0$b(Stack stack) {
        this.mPanels.mo5929b(stack);
    }

    public void onOrientationSupportPanelDismiss(AbstractC6054a aVar) {
        Stack<AbstractC6054a> panelStack = getPanelStack();
        panelStack.remove(aVar);
        C13742g.m55706a(new Runnable(panelStack) {
            /* class com.bytedance.ee.bear.document.orientation.$$Lambda$b$RheVapjwHjQzLY9liOLgwa1suj0 */
            public final /* synthetic */ Stack f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C6055b.this.lambda$onOrientationSupportPanelDismiss$0$b(this.f$1);
            }
        }, 200);
    }

    public void onOrientationSupportPanelShowing(AbstractC6054a aVar) {
        Stack<AbstractC6054a> panelStack = getPanelStack();
        if (panelStack.isEmpty() || panelStack.peek() != aVar) {
            panelStack.push(aVar);
            this.mPanels.mo5929b(panelStack);
        }
    }

    public void setRequestOrientation(int i) {
        C13479a.m54764b("OrientationViewModel", "setRequestOrientation: " + i);
        this.mRequestOrientation = i;
    }

    public void registerLockObserver(Context context) {
        this.mContentObserver = new ContentObserver(new Handler()) {
            /* class com.bytedance.ee.bear.document.orientation.C6055b.C60561 */

            public void onChange(boolean z) {
                C6055b.this.mLocked.mo5929b(Boolean.valueOf(C6055b.this.isLocked()));
            }
        };
        ContentResolver contentResolver = context.getContentResolver();
        this.mContentResolver = contentResolver;
        contentResolver.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, this.mContentObserver);
        this.mLocked.mo5929b(Boolean.valueOf(isLocked()));
    }
}
