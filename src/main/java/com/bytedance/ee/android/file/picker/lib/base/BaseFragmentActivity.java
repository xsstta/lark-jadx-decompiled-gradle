package com.bytedance.ee.android.file.picker.lib.base;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.bytedance.ee.android.file.picker.lib.FilePicker;
import com.bytedance.ee.android.file.picker.lib.dependency.IPickerImageLoader;
import com.bytedance.ee.android.file.picker.lib.dependency.IPickerLogger;
import com.bytedance.ee.android.file.picker.lib.dependency.IPickerStatistics;
import com.bytedance.ee.android.file.picker.lib.receiver.CloseReceiver;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/base/BaseFragmentActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "localReceiver", "Lcom/bytedance/ee/android/file/picker/lib/receiver/CloseReceiver;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSaveInstanceState", "outState", "outPersistentState", "Landroid/os/PersistableBundle;", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
public class BaseFragmentActivity extends com.ss.android.lark.base.fragment.BaseFragmentActivity {

    /* renamed from: a */
    private final CloseReceiver f12271a = new CloseReceiver(this);

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f12271a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FilePicker.f12248b.mo15809b(bundle);
        IPickerLogger iPickerLogger = (IPickerLogger) getIntent().getParcelableExtra("logger");
        IPickerImageLoader iPickerImageLoader = (IPickerImageLoader) getIntent().getParcelableExtra("imageLoader");
        IPickerStatistics iPickerStatistics = (IPickerStatistics) getIntent().getParcelableExtra("statistics");
        if (!FilePicker.f12248b.mo15807a()) {
            FilePicker.f12248b.mo15806a(iPickerLogger, iPickerStatistics, iPickerImageLoader);
        }
        m16811a(this, this.f12271a, new IntentFilter("file.picker.close"));
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        Intrinsics.checkParameterIsNotNull(persistableBundle, "outPersistentState");
        super.onSaveInstanceState(bundle, persistableBundle);
        FilePicker.f12248b.mo15804a(bundle);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m16811a(BaseFragmentActivity baseFragmentActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return baseFragmentActivity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
