package com.larksuite.framework.ui.p1197a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.larksuite.framework.ui.a.e */
public class C26181e extends AbstractC26178b {
    /* renamed from: d */
    private void m94710d() {
        Drawable foreground = mo93158a().getForeground();
        if (!(foreground instanceof C26177a)) {
            mo93158a().setForeground(new C26177a(foreground));
        }
    }

    @Override // com.larksuite.framework.ui.p1197a.AbstractC26178b
    /* renamed from: b */
    public void mo93159b() {
        if (mo93158a() != null) {
            m94710d();
            mo93158a().getForeground().setAlpha(SmActions.ACTION_ONTHECALL_ENTRY);
        }
    }

    @Override // com.larksuite.framework.ui.p1197a.AbstractC26178b
    /* renamed from: c */
    public void mo93160c() {
        if (mo93158a() != null) {
            Drawable foreground = mo93158a().getForeground();
            if (foreground instanceof C26177a) {
                mo93158a().setForeground(((C26177a) foreground).mo93156a());
            }
        }
    }

    C26181e(Context context) {
        super(context);
    }
}
