package com.ss.android.lark.notification.setting.impl.p2391a;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.notification.p2379c.C48432a;
import com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a;
import com.ss.android.lark.notification.setting.impl.setting.view.NotificationEntranceView;

/* renamed from: com.ss.android.lark.notification.setting.impl.a.e */
public class C48580e implements AbstractC48571a.AbstractC48573b {

    /* renamed from: a */
    AbstractC48571a.AbstractC48573b.AbstractC48574a f122216a;

    /* renamed from: b */
    NotificationEntranceView f122217b;

    /* renamed from: c */
    Context f122218c;

    /* renamed from: d */
    AbstractC48582a f122219d;

    /* renamed from: com.ss.android.lark.notification.setting.impl.a.e$a */
    public interface AbstractC48582a {
        /* renamed from: a */
        void mo169661a();

        /* renamed from: a */
        void mo169662a(View view);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a.AbstractC48573b
    /* renamed from: a */
    public View mo169654a() {
        return this.f122217b;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m191497c();
    }

    @Override // com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a.AbstractC48573b
    /* renamed from: b */
    public void mo169657b() {
        AbstractC48582a aVar = this.f122219d;
        if (aVar != null) {
            aVar.mo169661a();
        }
    }

    /* renamed from: c */
    private void m191497c() {
        NotificationEntranceView notificationEntranceView = new NotificationEntranceView(this.f122218c);
        this.f122217b = notificationEntranceView;
        notificationEntranceView.setOnEntranceClickListener(new NotificationEntranceView.AbstractC48647a() {
            /* class com.ss.android.lark.notification.setting.impl.p2391a.C48580e.C485811 */

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.NotificationEntranceView.AbstractC48647a
            /* renamed from: a */
            public void mo169668a() {
                C48580e.this.f122216a.mo169658a();
            }

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.NotificationEntranceView.AbstractC48647a
            /* renamed from: b */
            public void mo169670b() {
                C48580e.this.f122219d.mo169662a(C48580e.this.f122217b);
                C48580e.this.f122216a.mo169660b();
            }

            @Override // com.ss.android.lark.notification.setting.impl.setting.view.NotificationEntranceView.AbstractC48647a
            /* renamed from: a */
            public void mo169669a(String str) {
                C48580e.this.f122216a.mo169659a(str);
            }
        });
    }

    @Override // com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a.AbstractC48573b
    /* renamed from: a */
    public void mo169655a(C48432a aVar) {
        this.f122217b.mo169819a(aVar);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC48571a.AbstractC48573b.AbstractC48574a aVar) {
        this.f122216a = aVar;
    }

    @Override // com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a.AbstractC48573b
    /* renamed from: a */
    public void mo169656a(boolean z) {
        this.f122217b.mo169820a(z);
    }

    public C48580e(Context context, AbstractC48582a aVar) {
        this.f122218c = context;
        this.f122219d = aVar;
    }
}
