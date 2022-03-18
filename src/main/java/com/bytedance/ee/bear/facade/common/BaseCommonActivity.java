package com.bytedance.ee.bear.facade.common;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import com.bytedance.ee.bear.facade.common.extension.C7700a;
import com.bytedance.ee.bear.facade.common.extension.C7701b;
import com.bytedance.ee.bear.facade.common.extension.C7702c;
import com.bytedance.ee.bear.facade.common.extension.C7703d;
import com.bytedance.ee.bear.facade.common.extension.C7704e;
import com.bytedance.ee.bear.facade.common.extension.C7705f;
import com.bytedance.ee.bear.facade.common.extension.C7706g;
import com.bytedance.ee.log.C13479a;
import java.util.Arrays;
import java.util.List;

public abstract class BaseCommonActivity extends LifeCycleActivity implements AbstractC7710h {

    /* renamed from: a */
    private final String f20773a = getClass().getSimpleName();

    /* renamed from: b */
    private ExtensionActivityImpl f20774b;

    static {
        AppCompatDelegate.m728a(true);
    }

    /* renamed from: o */
    public List<C7661a> mo30080o() {
        return this.f20774b.mo30097b();
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (!this.f20774b.mo30094a()) {
            super.onBackPressed();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7710h
    /* renamed from: a */
    public <T> T mo17222a(Class<T> cls) {
        return (T) this.f20774b.mo17222a(cls);
    }

    /* renamed from: a */
    public void mo30077a(C7661a aVar) {
        this.f20774b.mo30093a(aVar);
    }

    /* renamed from: b */
    public void mo30078b(int i) {
        C7705f fVar = (C7705f) mo17222a(C7705f.class);
        if (fVar != null) {
            fVar.mo30186c(i);
        }
    }

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f20774b.mo30095a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i) {
        super.setTheme(i);
        getBaseContext().setTheme(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22315b(Bundle bundle) {
        this.f20774b = new ExtensionActivityImpl(this, m30683a(this));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f20774b.mo30096a(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            C13479a.m54761a(this.f20773a, e);
            return false;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        ExtensionActivityImpl extensionActivityImpl = this.f20774b;
        if (extensionActivityImpl != null) {
            extensionActivityImpl.mo30092a(configuration);
        }
        getResources().getConfiguration().orientation = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    /* renamed from: a */
    public static List<C7661a> m30683a(AppCompatActivity appCompatActivity) {
        return Arrays.asList(new C7702c(appCompatActivity), new C7706g(appCompatActivity), new C7701b(appCompatActivity), new C7700a(appCompatActivity), new C7704e(appCompatActivity), new C7703d(appCompatActivity), new C7705f(appCompatActivity));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f20774b.mo30091a(i, i2, intent);
    }
}
