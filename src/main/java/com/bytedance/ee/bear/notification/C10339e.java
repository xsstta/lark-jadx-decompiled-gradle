package com.bytedance.ee.bear.notification;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.notification.AbstractC10318c;
import com.bytedance.ee.bear.notification.view.NotificationView;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.notification.e */
public class C10339e implements AbstractC10318c {

    /* renamed from: a */
    private Map<AbstractC10318c.AbstractC10319a, BinderINotificationView> f27849a = new HashMap();

    @Override // com.bytedance.ee.bear.notification.AbstractC10318c
    /* renamed from: a */
    public AbstractC10318c.AbstractC10320b mo39422a() {
        return new AbstractC10318c.AbstractC10320b() {
            /* class com.bytedance.ee.bear.notification.C10339e.C103401 */

            /* renamed from: b */
            private NotificationView f27851b;

            @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10320b
            /* renamed from: a */
            public void mo39427a() {
                NotificationView notificationView = this.f27851b;
                if (notificationView != null) {
                    notificationView.mo37767a();
                }
            }

            @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10320b
            /* renamed from: b */
            public String mo39431b() {
                NotificationView notificationView = this.f27851b;
                if (notificationView != null) {
                    return notificationView.getNotificationId();
                }
                return null;
            }

            @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10320b
            /* renamed from: c */
            public String mo39432c() {
                NotificationView notificationView = this.f27851b;
                if (notificationView != null) {
                    return notificationView.getLinkUrl();
                }
                return null;
            }

            @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10320b
            /* renamed from: a */
            public View mo39426a(Context context) {
                if (this.f27851b == null) {
                    this.f27851b = new NotificationView(context);
                }
                return this.f27851b;
            }

            @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10320b
            /* renamed from: a */
            public void mo39428a(AbstractC10318c.AbstractC10320b.AbstractC10321a aVar) {
                NotificationView notificationView = this.f27851b;
                if (notificationView != null) {
                    aVar.getClass();
                    notificationView.setOnCloseListener(new NotificationView.AbstractC10361a() {
                        /* class com.bytedance.ee.bear.notification.$$Lambda$fZ5TppRpDO0AjP5UwVgYS_ZS3wE */

                        @Override // com.bytedance.ee.bear.notification.view.NotificationView.AbstractC10361a
                        public final void onUserClose(String str) {
                            AbstractC10318c.AbstractC10320b.AbstractC10321a.this.onUserClose(str);
                        }
                    });
                }
            }

            @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10320b
            /* renamed from: a */
            public void mo39429a(AbstractC10318c.AbstractC10320b.AbstractC10322b bVar) {
                NotificationView notificationView = this.f27851b;
                if (notificationView != null) {
                    bVar.getClass();
                    notificationView.setOnLinkClickListener(new NotificationView.AbstractC10362b() {
                        /* class com.bytedance.ee.bear.notification.$$Lambda$PRLKgEepUnqSgnO3hAY2uvtD98 */

                        @Override // com.bytedance.ee.bear.notification.view.NotificationView.AbstractC10362b
                        public final void onLinkClick(String str) {
                            AbstractC10318c.AbstractC10320b.AbstractC10322b.this.onLinkClick(str);
                        }
                    });
                }
            }

            @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10320b
            /* renamed from: a */
            public void mo39430a(String str, String str2) {
                NotificationView notificationView = this.f27851b;
                if (notificationView != null) {
                    notificationView.mo39488a(str, str2);
                }
            }
        };
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10318c
    /* renamed from: a */
    public void mo39423a(AbstractC10318c.AbstractC10319a aVar) {
        if (aVar != null) {
            BinderINotificationView remove = this.f27849a.remove(aVar);
            if (remove != null) {
                ar.m20936a().mo41508c(AbstractC10344g.class).mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.notification.$$Lambda$e$qOKgnm6ofaasmI3BsxPZpH3iU */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        ((AbstractC10344g) obj).unregisterINotification(BinderINotificationView.this);
                    }
                }, $$Lambda$e$GyzJGmNJ5HDC64xoxGjM14kCeg.INSTANCE);
            }
            NotificationImpl$2 notificationImpl$2 = new NotificationImpl$2(this, aVar);
            ar.m20936a().mo41508c(AbstractC10344g.class).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.notification.$$Lambda$e$xxUVyaUZPfZg5kquGzez0FMANcY */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ((AbstractC10344g) obj).registerINotification(BinderINotificationView.this);
                }
            }, $$Lambda$e$ugkbXixobfeazt__ZNtPrtAIse8.INSTANCE);
            this.f27849a.put(aVar, notificationImpl$2);
        }
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10318c
    /* renamed from: b */
    public void mo39425b(AbstractC10318c.AbstractC10319a aVar) {
        BinderINotificationView remove;
        if (aVar != null && (remove = this.f27849a.remove(aVar)) != null) {
            ar.m20936a().mo41508c(AbstractC10344g.class).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.notification.$$Lambda$e$pZv0JzdTtNeaVzB6zur72sfuAE */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ((AbstractC10344g) obj).unregisterINotification(BinderINotificationView.this);
                }
            }, $$Lambda$e$ckMSW46rwPb6OFSOIfZ9UH7q3E.INSTANCE);
        }
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10318c
    /* renamed from: a */
    public void mo39424a(String str) {
        ar.m20936a().mo41508c(AbstractC10344g.class).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.notification.$$Lambda$e$HA8r4Wn7xHascUHXJvu3NyC7JI */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC10344g) obj).notifyNotificationClosed(this.f$0);
            }
        }, $$Lambda$e$LFz5C2__oWsi5s8Ym_paO1qv5vE.INSTANCE);
    }
}
