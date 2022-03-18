package com.ss.android.ttvecamera.systemresmanager;

import android.content.Context;

public class TESystemResManager {

    /* renamed from: a */
    public AbstractC60431a f151015a;

    /* renamed from: b */
    private boolean f151016b;

    public enum ActionType {
        UNKNOWN,
        BOOST_CPU,
        RESTORE_CPU
    }

    /* renamed from: com.ss.android.ttvecamera.systemresmanager.TESystemResManager$a */
    public static class C60430a {

        /* renamed from: a */
        public ActionType f151017a;

        /* renamed from: b */
        public int f151018b;

        public C60430a(ActionType actionType) {
            this.f151017a = actionType;
        }

        public C60430a(ActionType actionType, int i) {
            this.f151017a = actionType;
            this.f151018b = i;
        }
    }

    /* renamed from: a */
    public void mo206925a(AbstractC60431a aVar) {
        this.f151016b = false;
        this.f151015a = aVar;
    }

    /* renamed from: a */
    public void mo206923a(Context context) {
        if (!this.f151016b) {
            AbstractC60431a aVar = this.f151015a;
            if (aVar != null) {
                aVar.mo206928a(context);
            }
            this.f151016b = true;
        }
    }

    /* renamed from: a */
    public void mo206924a(C60430a aVar) {
        if (this.f151016b && this.f151015a != null) {
            if (aVar.f151017a == ActionType.BOOST_CPU) {
                this.f151015a.mo206927a(aVar.f151018b);
            } else if (aVar.f151017a == ActionType.RESTORE_CPU) {
                this.f151015a.mo206926a();
            }
        }
    }
}
