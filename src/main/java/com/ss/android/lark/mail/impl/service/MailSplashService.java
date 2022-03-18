package com.ss.android.lark.mail.impl.service;

import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionManager;
import com.ss.android.lark.mail.impl.utils.C43853v;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class MailSplashService implements LifecycleObserver {

    /* renamed from: a */
    private AtomicBoolean f110115a;

    /* renamed from: b */
    private String f110116b;

    /* renamed from: c */
    private LifecycleOwner f110117c;

    /* renamed from: d */
    private List<AbstractC43276b> f110118d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.service.MailSplashService$a */
    public static class C43275a {

        /* renamed from: a */
        public static MailSplashService f110119a = new MailSplashService();
    }

    /* renamed from: com.ss.android.lark.mail.impl.service.MailSplashService$b */
    public interface AbstractC43276b {
        void onPageFirstLoad();
    }

    /* renamed from: d */
    public static MailSplashService m171910d() {
        return C43275a.f110119a;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPagePause() {
        Log.m165389i("MailSplashService", "onPagePause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onPageResume() {
        Log.m165389i("MailSplashService", "onPageResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onPageDestroy() {
        Log.m165389i("MailSplashService", "onPageDestroy");
        this.f110117c = null;
    }

    private MailSplashService() {
        this.f110115a = new AtomicBoolean(false);
        this.f110118d = new CopyOnWriteArrayList();
    }

    /* renamed from: e */
    private void m171911e() {
        if (this.f110115a.compareAndSet(false, true)) {
            Log.m165389i("MailSplashService", "init");
            m171913g();
        }
    }

    /* renamed from: f */
    private void m171912f() {
        if (this.f110115a.get()) {
            Log.m165389i("MailSplashService", "accountChange");
            m171913g();
        }
    }

    /* renamed from: a */
    public void mo154916a() {
        Log.m165389i("MailSplashService", "onFirstDataLoaded");
        C41816b.m166115a().mo150113C().mo150178b();
    }

    /* renamed from: b */
    public void mo154919b() {
        Log.m165389i("MailSplashService", "onFirstFrameDraw");
        C41816b.m166115a().mo150113C().mo150179c();
    }

    /* renamed from: c */
    public void mo154921c() {
        Log.m165389i("MailSplashService", "onFirstContentDraw");
        C41816b.m166115a().mo150113C().mo150180d();
    }

    /* renamed from: g */
    private void m171913g() {
        ThreadActionManager.invalidate();
        C43345c.m172076m().mo154989a();
        C43853v.m173843b();
        C43362e.m172201a().mo155088c();
        for (AbstractC43276b bVar : this.f110118d) {
            bVar.onPageFirstLoad();
        }
    }

    /* renamed from: b */
    public void mo154920b(AbstractC43276b bVar) {
        if (bVar != null) {
            this.f110118d.remove(bVar);
        }
    }

    /* renamed from: a */
    public void mo154918a(AbstractC43276b bVar) {
        if (bVar != null && !this.f110118d.contains(bVar)) {
            this.f110118d.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo154917a(LifecycleOwner lifecycleOwner) {
        if (!this.f110115a.get()) {
            this.f110116b = C41816b.m166115a().mo150139f();
            m171911e();
        } else if (!TextUtils.equals(C41816b.m166115a().mo150139f(), this.f110116b)) {
            this.f110116b = C41816b.m166115a().mo150139f();
            m171912f();
        }
        this.f110117c = lifecycleOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }
}
