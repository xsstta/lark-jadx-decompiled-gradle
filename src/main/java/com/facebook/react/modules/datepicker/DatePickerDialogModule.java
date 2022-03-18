package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
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

@ReactModule(name = "DatePickerAndroid")
public class DatePickerDialogModule extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DatePickerAndroid";
    }

    public DatePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* renamed from: com.facebook.react.modules.datepicker.DatePickerDialogModule$a */
    private class DialogInterface$OnDismissListenerC21184a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener {

        /* renamed from: b */
        private final Promise f51652b;

        /* renamed from: c */
        private boolean f51653c;

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.f51653c && DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "dismissedAction");
                this.f51652b.resolve(writableNativeMap);
                this.f51653c = true;
            }
        }

        public DialogInterface$OnDismissListenerC21184a(Promise promise) {
            this.f51652b = promise;
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (!this.f51653c && DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "dateSetAction");
                writableNativeMap.putInt("year", i);
                writableNativeMap.putInt("month", i2);
                writableNativeMap.putInt("day", i3);
                this.f51652b.resolve(writableNativeMap);
                this.f51653c = true;
            }
        }
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("date") && !readableMap.isNull("date")) {
            bundle.putLong("date", (long) readableMap.getDouble("date"));
        }
        if (readableMap.hasKey("minDate") && !readableMap.isNull("minDate")) {
            bundle.putLong("minDate", (long) readableMap.getDouble("minDate"));
        }
        if (readableMap.hasKey("maxDate") && !readableMap.isNull("maxDate")) {
            bundle.putLong("maxDate", (long) readableMap.getDouble("maxDate"));
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
            promise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to an Activity");
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        DialogInterface$OnCancelListenerC1021b bVar = (DialogInterface$OnCancelListenerC1021b) supportFragmentManager.findFragmentByTag("DatePickerAndroid");
        if (bVar != null) {
            bVar.u_();
        }
        C21185a aVar = new C21185a();
        if (readableMap != null) {
            aVar.setArguments(createFragmentArguments(readableMap));
        }
        DialogInterface$OnDismissListenerC21184a aVar2 = new DialogInterface$OnDismissListenerC21184a(promise);
        aVar.mo71985a((DialogInterface.OnDismissListener) aVar2);
        aVar.mo71984a((DatePickerDialog.OnDateSetListener) aVar2);
        aVar.mo5511a(supportFragmentManager, "DatePickerAndroid");
    }
}
