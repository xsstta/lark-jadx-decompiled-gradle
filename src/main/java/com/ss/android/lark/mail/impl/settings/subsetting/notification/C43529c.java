package com.ss.android.lark.mail.impl.settings.subsetting.notification;

import androidx.lifecycle.AbstractC1178x;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.notification.c */
public class C43529c extends BasePresenter<AbstractC43522a.AbstractC43523a, NotificationView, AbstractC43522a.AbstractC43524b.AbstractC43525a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC43522a.AbstractC43524b.AbstractC43525a createViewDelegate() {
        return new AbstractC43522a.AbstractC43524b.AbstractC43525a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.notification.C43529c.C435301 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a.AbstractC43524b.AbstractC43525a
            /* renamed from: a */
            public void mo155418a(int i) {
                ((AbstractC43522a.AbstractC43523a) C43529c.this.getModel()).mo155417a(i);
            }
        };
    }

    /* renamed from: c */
    public AbstractC43522a.AbstractC43526c mo155421c() {
        return (AbstractC43522a.AbstractC43526c) getView();
    }

    /* renamed from: b */
    public void mo155420b() {
        ((NotificationView) getView()).mo155405c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC43522a.AbstractC43523a) getModel()).mo155416a().mo5923a(((NotificationView) getView()).mo155406d(), new AbstractC1178x<Integer>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.notification.C43529c.C435312 */

            /* renamed from: a */
            public void onChanged(Integer num) {
                if (num != null) {
                    ((NotificationView) C43529c.this.getView()).mo155403a(num);
                }
            }
        });
    }

    public C43529c(AbstractC43522a.AbstractC43523a aVar, NotificationView notificationView) {
        super(aVar, notificationView);
    }
}
