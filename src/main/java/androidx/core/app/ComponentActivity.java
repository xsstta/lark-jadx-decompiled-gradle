package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;

public class ComponentActivity extends Activity implements KeyEventDispatcher.Component, LifecycleOwner {
    private SimpleArrayMap<Class<? extends C0715a>, C0715a> mExtraDataMap = new SimpleArrayMap<>();
    private LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);

    /* renamed from: androidx.core.app.ComponentActivity$a */
    public static class C0715a {
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.m5308a(this);
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends C0715a> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.markState(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$a>, androidx.core.app.ComponentActivity$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public void putExtraData(C0715a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !KeyEventDispatcher.m4005a(decorView, keyEvent)) {
            return KeyEventDispatcher.m4006a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !KeyEventDispatcher.m4005a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }
}
