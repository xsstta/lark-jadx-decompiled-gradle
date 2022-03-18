package com.bytedance.ee.bear.facade.common;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExtensionActivityImpl implements LifecycleObserver, AbstractC7710h {

    /* renamed from: a */
    private final List<C7661a> f20777a;

    /* renamed from: b */
    public List<C7661a> mo30097b() {
        return this.f20777a;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C13479a.m54764b("DelegateActivityImpl", "onDestroy");
        this.f20777a.clear();
    }

    /* renamed from: a */
    public boolean mo30094a() {
        for (C7661a aVar : this.f20777a) {
            if (aVar.mo22318a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo30098b(C7661a aVar) {
        return this.f20777a.remove(aVar);
    }

    /* renamed from: a */
    public void mo30093a(C7661a aVar) {
        if (!this.f20777a.contains(aVar)) {
            this.f20777a.add(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7710h
    /* renamed from: a */
    public <T> T mo17222a(Class<T> cls) {
        Iterator<C7661a> it = this.f20777a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (cls.isAssignableFrom(t.getClass())) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo30092a(Configuration configuration) {
        for (C7661a aVar : this.f20777a) {
            aVar.mo30104a(configuration);
        }
    }

    /* renamed from: a */
    public boolean mo30095a(KeyEvent keyEvent) {
        for (C7661a aVar : this.f20777a) {
            if (aVar.mo30105a(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo30096a(MotionEvent motionEvent) {
        for (C7661a aVar : this.f20777a) {
            if (aVar.mo30106a(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public ExtensionActivityImpl(AppCompatActivity appCompatActivity, List<C7661a> list) {
        ArrayList arrayList = new ArrayList();
        this.f20777a = arrayList;
        appCompatActivity.getLifecycle().addObserver(this);
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    /* renamed from: a */
    public void mo30091a(int i, int i2, Intent intent) {
        for (C7661a aVar : this.f20777a) {
            aVar.mo30103a(i, i2, intent);
        }
    }
}
