package com.ss.android.openbusiness.ui;

import android.util.SparseArray;
import android.view.View;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.openbusiness.ui.StatusController;

public class StatusController {

    /* renamed from: a */
    private SparseArray<View> f147920a = new SparseArray<>();

    /* renamed from: b */
    private SparseArray<AbstractC59600b> f147921b = new SparseArray<>();

    /* renamed from: c */
    private boolean f147922c;

    /* renamed from: d */
    private Status f147923d = Status.UNINIT;

    /* renamed from: com.ss.android.openbusiness.ui.StatusController$a */
    public interface AbstractC59599a {
        /* renamed from: a */
        void mo203022a();
    }

    /* renamed from: com.ss.android.openbusiness.ui.StatusController$b */
    public interface AbstractC59600b {
        /* renamed from: a */
        void mo202786a();

        /* renamed from: b */
        void mo202787b();
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

    public StatusController() {
    }

    /* renamed from: a */
    public void mo203019a(boolean z) {
        this.f147922c = z;
    }

    /* renamed from: a */
    public void mo203016a(Status status) {
        mo203017a(status, (AbstractC59599a) null);
    }

    /* renamed from: b */
    private void m231134b(Status status) {
        int value = status.getValue();
        for (int i = 0; i < this.f147920a.size(); i++) {
            int keyAt = this.f147920a.keyAt(i);
            View view = this.f147920a.get(keyAt);
            if (keyAt != value) {
                view.setVisibility(8);
            }
        }
        for (int i2 = 0; i2 < this.f147921b.size(); i2++) {
            int keyAt2 = this.f147921b.keyAt(i2);
            AbstractC59600b bVar = this.f147921b.get(keyAt2);
            if (keyAt2 != value) {
                bVar.mo202787b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m231136c(Status status, AbstractC59599a aVar) {
        m231134b(status);
        m231135b(status, aVar);
    }

    /* renamed from: a */
    public void mo203015a(View view, Status status) {
        if (status != null && view != null) {
            this.f147920a.put(status.getValue(), view);
        }
    }

    /* renamed from: a */
    public void mo203017a(Status status, AbstractC59599a aVar) {
        Status status2 = this.f147923d;
        if (status2 != status) {
            if (!this.f147922c || status2 != Status.CONTENT || status != Status.ERROR) {
                this.f147923d = status;
                UICallbackExecutor.post(new Runnable(status, aVar) {
                    /* class com.ss.android.openbusiness.ui.$$Lambda$StatusController$hyaqoIFpTzT939Vg0C5MuCGJ84o */
                    public final /* synthetic */ StatusController.Status f$1;
                    public final /* synthetic */ StatusController.AbstractC59599a f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        StatusController.this.m231136c(this.f$1, this.f$2);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo203018a(AbstractC59600b bVar, Status status) {
        if (status != null && bVar != null) {
            this.f147921b.put(status.getValue(), bVar);
        }
    }

    /* renamed from: b */
    private void m231135b(Status status, AbstractC59599a aVar) {
        int value = status.getValue();
        for (int i = 0; i < this.f147920a.size(); i++) {
            int keyAt = this.f147920a.keyAt(i);
            View view = this.f147920a.get(keyAt);
            if (keyAt == value) {
                view.setVisibility(0);
                if (aVar != null) {
                    aVar.mo203022a();
                }
            }
        }
        for (int i2 = 0; i2 < this.f147921b.size(); i2++) {
            int keyAt2 = this.f147921b.keyAt(i2);
            AbstractC59600b bVar = this.f147921b.get(keyAt2);
            if (keyAt2 == value) {
                bVar.mo202786a();
                if (aVar != null) {
                    aVar.mo203022a();
                }
            }
        }
    }

    public StatusController(View view, View view2, AbstractC59600b bVar) {
        mo203015a(view, Status.CONTENT);
        mo203015a(view2, Status.ERROR);
        mo203018a(bVar, Status.LOADING);
    }
}
