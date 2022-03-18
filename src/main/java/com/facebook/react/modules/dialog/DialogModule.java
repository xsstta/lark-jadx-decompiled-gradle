package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C21108a;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

@ReactModule(name = "DialogManagerAndroid")
public class DialogModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    static final Map<String, Object> CONSTANTS = C21108a.m76730a("buttonClicked", "buttonClicked", "dismissed", "dismissed", "buttonPositive", -1, "buttonNegative", -2, "buttonNeutral", -3);
    public boolean mIsInForeground;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DialogManagerAndroid";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.dialog.DialogModule$b */
    public class C21192b {

        /* renamed from: b */
        private final FragmentManager f51666b;

        /* renamed from: c */
        private Object f51667c;

        /* renamed from: b */
        private void m76923b() {
            DialogInterface$OnClickListenerC21193a aVar;
            if (DialogModule.this.mIsInForeground && (aVar = (DialogInterface$OnClickListenerC21193a) this.f51666b.findFragmentByTag("com.facebook.catalyst.react.dialog.DialogModule")) != null && aVar.isResumed()) {
                aVar.u_();
            }
        }

        /* renamed from: a */
        public void mo71998a() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(DialogModule.this.mIsInForeground, "showPendingAlert() called in background");
            if (this.f51667c != null) {
                m76923b();
                ((DialogInterface$OnClickListenerC21193a) this.f51667c).mo5511a(this.f51666b, "com.facebook.catalyst.react.dialog.DialogModule");
                this.f51667c = null;
            }
        }

        public C21192b(FragmentManager fragmentManager) {
            this.f51666b = fragmentManager;
        }

        /* renamed from: a */
        public void mo71999a(Bundle bundle, Callback callback) {
            DialogInterface$OnClickListenerC21191a aVar;
            UiThreadUtil.assertOnUiThread();
            m76923b();
            if (callback != null) {
                aVar = new DialogInterface$OnClickListenerC21191a(callback);
            } else {
                aVar = null;
            }
            DialogInterface$OnClickListenerC21193a aVar2 = new DialogInterface$OnClickListenerC21193a(aVar, bundle);
            if (!DialogModule.this.mIsInForeground || this.f51666b.isStateSaved()) {
                this.f51667c = aVar2;
                return;
            }
            if (bundle.containsKey("cancelable")) {
                aVar2.mo5512a(bundle.getBoolean("cancelable"));
            }
            aVar2.mo5511a(this.f51666b, "com.facebook.catalyst.react.dialog.DialogModule");
        }
    }

    private C21192b getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return new C21192b(((FragmentActivity) currentActivity).getSupportFragmentManager());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        C21192b fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.mo71998a();
        } else {
            FLog.m76610w(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.modules.dialog.DialogModule$a */
    public class DialogInterface$OnClickListenerC21191a implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: b */
        private final Callback f51663b;

        /* renamed from: c */
        private boolean f51664c;

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.f51664c && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.f51663b.invoke("dismissed");
                this.f51664c = true;
            }
        }

        public DialogInterface$OnClickListenerC21191a(Callback callback) {
            this.f51663b = callback;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!this.f51664c && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.f51663b.invoke("buttonClicked", Integer.valueOf(i));
                this.f51664c = true;
            }
        }
    }

    @ReactMethod
    public void showAlert(ReadableMap readableMap, Callback callback, final Callback callback2) {
        final C21192b fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        final Bundle bundle = new Bundle();
        if (readableMap.hasKey("title")) {
            bundle.putString("title", readableMap.getString("title"));
        }
        if (readableMap.hasKey("message")) {
            bundle.putString("message", readableMap.getString("message"));
        }
        if (readableMap.hasKey("buttonPositive")) {
            bundle.putString("button_positive", readableMap.getString("buttonPositive"));
        }
        if (readableMap.hasKey("buttonNegative")) {
            bundle.putString("button_negative", readableMap.getString("buttonNegative"));
        }
        if (readableMap.hasKey("buttonNeutral")) {
            bundle.putString("button_neutral", readableMap.getString("buttonNeutral"));
        }
        if (readableMap.hasKey("items")) {
            ReadableArray array = readableMap.getArray("items");
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray("items", charSequenceArr);
        }
        if (readableMap.hasKey("cancelable")) {
            bundle.putBoolean("cancelable", readableMap.getBoolean("cancelable"));
        }
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.dialog.DialogModule.RunnableC211901 */

            public void run() {
                fragmentManagerHelper.mo71999a(bundle, callback2);
            }
        });
    }
}
