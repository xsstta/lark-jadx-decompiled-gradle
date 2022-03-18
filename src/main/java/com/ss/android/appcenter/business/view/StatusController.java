package com.ss.android.appcenter.business.view;

import android.util.SparseArray;
import android.view.View;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.appcenter.business.view.StatusController;

public class StatusController {

    /* renamed from: a */
    private SparseArray<View> f70390a = new SparseArray<>();

    /* renamed from: b */
    private SparseArray<AbstractC28105b> f70391b = new SparseArray<>();

    /* renamed from: c */
    private boolean f70392c;

    /* renamed from: d */
    private Status f70393d = Status.UNINIT;

    /* renamed from: com.ss.android.appcenter.business.view.StatusController$a */
    public interface AbstractC28104a {
        void onStatusChanged();
    }

    /* renamed from: com.ss.android.appcenter.business.view.StatusController$b */
    public interface AbstractC28105b {
        /* renamed from: a */
        void mo98317a();

        /* renamed from: b */
        void mo98318b();
    }

    public enum Status {
        UNINIT(0, "Uninit"),
        LOADING(1, "Loading"),
        ERROR(2, "Error"),
        CONTENT(3, "Content"),
        GUIDE(4, "Guide"),
        EMPTY(5, "Empty"),
        ONBOARDING(6, "Onboarding"),
        UPGRADE(7, "Upgrade"),
        DEFAULT(-1, "Default");
        
        String status;
        int value;

        public String getStatus() {
            return this.status;
        }

        public int getValue() {
            return this.value;
        }

        private Status(int i, String str) {
            this.value = i;
            this.status = str;
        }
    }

    /* renamed from: b */
    public boolean mo100038b() {
        if (Status.ERROR == this.f70393d) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo100039c() {
        if (Status.LOADING == this.f70393d) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo100040d() {
        if (Status.CONTENT == this.f70393d) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo100041e() {
        if (Status.GUIDE == this.f70393d) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo100042f() {
        if (Status.ONBOARDING == this.f70393d) {
            return true;
        }
        return false;
    }

    public StatusController() {
    }

    /* renamed from: a */
    public boolean mo100037a() {
        if (Status.UNINIT == this.f70393d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo100036a(boolean z) {
        this.f70392c = z;
    }

    /* renamed from: a */
    public void mo100033a(Status status) {
        mo100034a(status, (AbstractC28104a) null);
    }

    /* renamed from: b */
    private void m102767b(Status status) {
        int value = status.getValue();
        for (int i = 0; i < this.f70390a.size(); i++) {
            int keyAt = this.f70390a.keyAt(i);
            View view = this.f70390a.get(keyAt);
            if (keyAt != value) {
                view.setVisibility(8);
            }
        }
        for (int i2 = 0; i2 < this.f70391b.size(); i2++) {
            int keyAt2 = this.f70391b.keyAt(i2);
            AbstractC28105b bVar = this.f70391b.get(keyAt2);
            if (keyAt2 != value) {
                bVar.mo98318b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m102769c(Status status, AbstractC28104a aVar) {
        m102767b(status);
        m102768b(status, aVar);
    }

    /* renamed from: a */
    public void mo100032a(View view, Status status) {
        if (status != null && view != null) {
            this.f70390a.put(status.getValue(), view);
        }
    }

    /* renamed from: a */
    public void mo100034a(Status status, AbstractC28104a aVar) {
        Status status2 = this.f70393d;
        if (status2 != status) {
            if (!this.f70392c || status2 != Status.CONTENT || status != Status.ERROR) {
                this.f70393d = status;
                UICallbackExecutor.post(new Runnable(status, aVar) {
                    /* class com.ss.android.appcenter.business.view.$$Lambda$StatusController$Gn0jv5hngGfiITTGKMlZC0r9eQ */
                    public final /* synthetic */ StatusController.Status f$1;
                    public final /* synthetic */ StatusController.AbstractC28104a f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        StatusController.this.m102769c(this.f$1, this.f$2);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo100035a(AbstractC28105b bVar, Status status) {
        if (status != null && bVar != null) {
            this.f70391b.put(status.getValue(), bVar);
        }
    }

    /* renamed from: b */
    private void m102768b(Status status, AbstractC28104a aVar) {
        int value = status.getValue();
        for (int i = 0; i < this.f70390a.size(); i++) {
            int keyAt = this.f70390a.keyAt(i);
            View view = this.f70390a.get(keyAt);
            if (keyAt == value) {
                view.setVisibility(0);
                if (aVar != null) {
                    aVar.onStatusChanged();
                }
            }
        }
        for (int i2 = 0; i2 < this.f70391b.size(); i2++) {
            int keyAt2 = this.f70391b.keyAt(i2);
            AbstractC28105b bVar = this.f70391b.get(keyAt2);
            if (keyAt2 == value) {
                bVar.mo98317a();
                if (aVar != null) {
                    aVar.onStatusChanged();
                }
            }
        }
    }

    public StatusController(View view, View view2, View view3) {
        mo100032a(view, Status.CONTENT);
        mo100032a(view2, Status.ERROR);
        mo100032a(view3, Status.LOADING);
    }

    public StatusController(View view, View view2, AbstractC28105b bVar) {
        mo100032a(view, Status.CONTENT);
        mo100032a(view2, Status.ERROR);
        mo100035a(bVar, Status.LOADING);
    }
}
