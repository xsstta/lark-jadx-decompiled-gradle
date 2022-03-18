package com.facebook.react.modules.timepicker;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "TimePickerAndroid")
public class TimePickerDialogModule extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "TimePickerAndroid";
    }

    public TimePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* renamed from: com.facebook.react.modules.timepicker.TimePickerDialogModule$a */
    private class DialogInterface$OnDismissListenerC21255a implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener {

        /* renamed from: b */
        private final Promise f51777b;

        /* renamed from: c */
        private boolean f51778c;

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.f51778c && TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "dismissedAction");
                this.f51777b.resolve(writableNativeMap);
                this.f51778c = true;
            }
        }

        public DialogInterface$OnDismissListenerC21255a(Promise promise) {
            this.f51777b = promise;
        }

        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            if (!this.f51778c && TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "timeSetAction");
                writableNativeMap.putInt("hour", i);
                writableNativeMap.putInt("minute", i2);
                this.f51777b.resolve(writableNativeMap);
                this.f51778c = true;
            }
        }
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("hour") && !readableMap.isNull("hour")) {
            bundle.putInt("hour", readableMap.getInt("hour"));
        }
        if (readableMap.hasKey("minute") && !readableMap.isNull("minute")) {
            bundle.putInt("minute", readableMap.getInt("minute"));
        }
        if (readableMap.hasKey("is24Hour") && !readableMap.isNull("is24Hour")) {
            bundle.putBoolean("is24Hour", readableMap.getBoolean("is24Hour"));
        }
        if (readableMap.hasKey("mode") && !readableMap.isNull("mode")) {
            bundle.putString("mode", readableMap.getString("mode"));
        }
        return bundle;
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        if (fragmentActivity == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a TimePicker dialog while not attached to an Activity");
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        DialogInterface$OnCancelListenerC1021b bVar = (DialogInterface$OnCancelListenerC1021b) supportFragmentManager.findFragmentByTag("TimePickerAndroid");
        if (bVar != null) {
            bVar.u_();
        }
        C21257b bVar2 = new C21257b();
        if (readableMap != null) {
            bVar2.setArguments(createFragmentArguments(readableMap));
        }
        DialogInterface$OnDismissListenerC21255a aVar = new DialogInterface$OnDismissListenerC21255a(promise);
        bVar2.mo72116a((DialogInterface.OnDismissListener) aVar);
        bVar2.mo72115a((TimePickerDialog.OnTimeSetListener) aVar);
        bVar2.mo5511a(supportFragmentManager, "TimePickerAndroid");
    }
}
