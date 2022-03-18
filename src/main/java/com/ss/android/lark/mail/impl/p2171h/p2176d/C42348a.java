package com.ss.android.lark.mail.impl.p2171h.p2176d;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.lark.mail.impl.h.d.a */
public class C42348a {

    /* renamed from: d */
    private static int f107797d = 3;

    /* renamed from: f */
    private static final C42348a f107798f = new C42348a();

    /* renamed from: a */
    private int f107799a;

    /* renamed from: b */
    private ConcurrentLinkedQueue<Activity> f107800b;

    /* renamed from: c */
    private Runnable f107801c;

    /* renamed from: e */
    private List<Integer> f107802e;

    /* renamed from: a */
    public static C42348a m169098a() {
        return f107798f;
    }

    private C42348a() {
        this.f107799a = ParticipantRepo.f117150c;
        this.f107800b = new ConcurrentLinkedQueue<>();
        this.f107801c = new Runnable() {
            /* class com.ss.android.lark.mail.impl.p2171h.p2176d.$$Lambda$a$EePDT2utKV6SpwBx22oujyloyk */

            public final void run() {
                C42348a.this.m169102b();
            }
        };
        this.f107802e = new ArrayList();
        this.f107799a = DeviceUtils.getScreenWidth(C41816b.m166115a().mo150132b()) / 2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m169102b() {
        Activity poll;
        while (!this.f107800b.isEmpty() && (poll = this.f107800b.poll()) != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) poll.getWindow().getDecorView();
                if (viewGroup != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt.getVisibility() == 0) {
                            if (childAt instanceof ViewGroup) {
                                m169100a(poll, (ViewGroup) childAt, 0);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m165397w("OverDrawMonitor", "onCheckOverDraw error:" + th);
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo152456b(Activity activity) {
        if (C41816b.m166115a().mo150143j()) {
            this.f107800b.remove(activity);
        }
    }

    /* renamed from: a */
    public void mo152455a(Activity activity) {
        if (C41816b.m166115a().mo150143j() && activity != null && !this.f107800b.contains(activity)) {
            this.f107800b.add(activity);
            CoreThreadPool.getBackgroundHandler().postDelayed(this.f107801c, 10000);
        }
    }

    /* renamed from: a */
    private void m169099a(Activity activity, View view) {
        try {
            C43849u.m173826a(new Runnable(activity, view) {
                /* class com.ss.android.lark.mail.impl.p2171h.p2176d.$$Lambda$a$nQz07pebNfnr5ZlClkvsi31spQo */
                public final /* synthetic */ Activity f$1;
                public final /* synthetic */ View f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C42348a.this.m169104c(this.f$1, this.f$2);
                }
            });
        } catch (Throwable th) {
            Log.m165397w("OverDrawMonitor", "notifyOverDraw error:" + th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m169104c(Activity activity, View view) {
        int i;
        if (activity != null) {
            if (view != null) {
                if (view.getId() == 0) {
                    i = view.toString().hashCode();
                } else {
                    i = view.getId();
                }
                if (!this.f107802e.contains(Integer.valueOf(i))) {
                    this.f107802e.add(Integer.valueOf(i));
                } else {
                    return;
                }
            }
            C25639g gVar = new C25639g(activity);
            gVar.mo89242c("界面" + activity + ", -->\n" + view + ",\n存在过渡渲染").mo89246d(true).mo89247e(true).mo89224a(R.id.lkui_dialog_btn_center, R.string.Mail_Alert_OK, $$Lambda$a$wh6xS78oMAJpGM2g6_wCCFUEe50.INSTANCE).mo89239c();
        }
    }

    /* renamed from: a */
    private void m169100a(Activity activity, ViewGroup viewGroup, int i) {
        boolean z;
        int i2;
        if (viewGroup != null) {
            int min = Math.min(viewGroup.getChildCount(), 25);
            if (min == 0 && i >= f107797d) {
                m169099a(activity, viewGroup);
            }
            for (int i3 = 0; i3 < min; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    if (childAt.getBackground() == null || childAt.getWidth() <= this.f107799a || childAt.getHeight() <= 10 || childAt.getBackground().getAlpha() <= 0) {
                        i2 = i;
                        z = false;
                    } else {
                        i2 = i + 1;
                        z = true;
                    }
                    if (childAt instanceof ViewGroup) {
                        m169100a(activity, (ViewGroup) childAt, i2);
                    } else if (i2 >= f107797d) {
                        Log.m165383e("OverDrawMonitor", "drawCount: " + i2 + ", view:" + childAt);
                        if (z) {
                            m169099a(activity, childAt);
                        }
                    } else {
                        Log.m165389i("OverDrawMonitor", "drawCount: " + i2);
                    }
                }
            }
        }
    }
}
