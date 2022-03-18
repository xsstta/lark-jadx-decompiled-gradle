package com.ss.android.appcenter.common.base;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.ss.android.appcenter.common.util.C28181e;

public class FunctionActivity extends BaseActivity {
    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.appcenter.common.base.BaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (m103054a(currentFocus, motionEvent)) {
                C28181e.m103232a(this);
                currentFocus.clearFocus();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private boolean m103054a(View view, MotionEvent motionEvent) {
        if (view == null || !(view instanceof EditText)) {
            return false;
        }
        int[] iArr = {0, 0};
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int height = view.getHeight() + i2;
        int width = view.getWidth() + i;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (x <= ((float) i) || x >= ((float) width) || y <= ((float) i2) || y >= ((float) height)) {
            return true;
        }
        return false;
    }
}
