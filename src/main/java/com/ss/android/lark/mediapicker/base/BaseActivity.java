package com.ss.android.lark.mediapicker.base;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.mediapicker.C44614a;
import com.ss.android.lark.mediapicker.dependency.IPickerImageLoader;
import com.ss.android.lark.mediapicker.dependency.IPickerLogger;
import com.ss.android.lark.mediapicker.receiver.CloseReceiver;
import me.ele.lancet.base.annotations.Skip;

public class BaseActivity extends AppCompatActivity {

    /* renamed from: a */
    private BroadcastReceiver f113212a = new CloseReceiver(this);

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f113212a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C44614a.m176964a(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        IPickerLogger iPickerLogger = (IPickerLogger) intent.getParcelableExtra("logger");
        IPickerImageLoader iPickerImageLoader = (IPickerImageLoader) intent.getParcelableExtra("imageLoader");
        if (!C44614a.m176966a()) {
            C44614a.m176965a(iPickerLogger, iPickerImageLoader);
        }
        m177198a(this, this.f113212a, new IntentFilter("media.picker.close"));
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m177198a(BaseActivity baseActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return baseActivity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
