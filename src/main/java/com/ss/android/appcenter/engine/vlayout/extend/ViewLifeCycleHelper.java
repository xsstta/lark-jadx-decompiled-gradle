package com.ss.android.appcenter.engine.vlayout.extend;

import android.view.View;
import androidx.collection.ArrayMap;
import com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager;

public class ViewLifeCycleHelper {

    /* renamed from: a */
    private ArrayMap<View, STATUS> f71032a;

    /* renamed from: b */
    private AbstractC28283a f71033b;

    /* renamed from: c */
    private VirtualLayoutManager f71034c;

    /* renamed from: d */
    private int f71035d;

    public enum STATUS {
        APPEARING,
        APPEARED,
        DISAPPEARING,
        DISAPPEARED
    }

    /* renamed from: a */
    public void mo100792a() {
        for (int i = 0; i < this.f71034c.getChildCount(); i++) {
            View childAt = this.f71034c.getChildAt(i);
            if (this.f71035d == 0) {
                this.f71035d = childAt.getContext().getResources().getDisplayMetrics().heightPixels;
            }
            if (this.f71034c.mo100696g() == 1) {
                if (childAt.getTop() <= 0 && childAt.getBottom() >= 0 && m103725f(childAt)) {
                    m103726g(childAt);
                } else if (childAt.getTop() <= this.f71035d && childAt.getBottom() >= this.f71035d && m103721b(childAt)) {
                    m103722c(childAt);
                }
            } else if (childAt.getTop() <= 0 && childAt.getBottom() >= 0 && m103721b(childAt)) {
                m103722c(childAt);
            } else if (childAt.getTop() <= this.f71035d && childAt.getBottom() >= this.f71035d && m103725f(childAt)) {
                m103726g(childAt);
            }
            if (childAt.getTop() < 0 || childAt.getBottom() > this.f71035d) {
                if (childAt.getBottom() <= 0 || childAt.getTop() >= this.f71035d) {
                    if (m103725f(childAt)) {
                        m103726g(childAt);
                    } else if (m103727h(childAt)) {
                        m103728i(childAt);
                    }
                }
            } else if (m103721b(childAt)) {
                m103722c(childAt);
            } else if (m103723d(childAt)) {
                m103724e(childAt);
            }
        }
    }

    /* renamed from: b */
    private boolean m103721b(View view) {
        if (m103719a(view) == STATUS.DISAPPEARED) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m103723d(View view) {
        if (m103719a(view) == STATUS.APPEARING) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m103725f(View view) {
        if (m103719a(view) == STATUS.APPEARED) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m103727h(View view) {
        if (m103719a(view) == STATUS.DISAPPEARING) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private STATUS m103719a(View view) {
        if (this.f71032a.containsKey(view)) {
            return this.f71032a.get(view);
        }
        this.f71032a.put(view, STATUS.DISAPPEARED);
        return STATUS.DISAPPEARED;
    }

    /* renamed from: c */
    private void m103722c(View view) {
        if (m103719a(view) != STATUS.APPEARING) {
            m103720a(view, STATUS.APPEARING);
            AbstractC28283a aVar = this.f71033b;
            if (aVar != null) {
                aVar.mo100793a(view);
            }
        }
    }

    /* renamed from: e */
    private void m103724e(View view) {
        if (m103719a(view) != STATUS.APPEARED) {
            m103720a(view, STATUS.APPEARED);
            AbstractC28283a aVar = this.f71033b;
            if (aVar != null) {
                aVar.mo100795c(view);
            }
        }
    }

    /* renamed from: g */
    private void m103726g(View view) {
        if (m103719a(view) != STATUS.DISAPPEARING) {
            m103720a(view, STATUS.DISAPPEARING);
            AbstractC28283a aVar = this.f71033b;
            if (aVar != null) {
                aVar.mo100794b(view);
            }
        }
    }

    /* renamed from: i */
    private void m103728i(View view) {
        if (m103719a(view) != STATUS.DISAPPEARED) {
            m103720a(view, STATUS.DISAPPEARED);
            AbstractC28283a aVar = this.f71033b;
            if (aVar != null) {
                aVar.mo100796d(view);
            }
        }
    }

    /* renamed from: a */
    private void m103720a(View view, STATUS status) {
        this.f71032a.put(view, status);
    }
}
