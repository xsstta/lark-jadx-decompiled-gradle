package com.ss.android.lark.mail.impl.settings.mainpage;

import android.app.Activity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.C41970e;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.home.p2178a.C42365c;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t;
import com.ss.android.lark.mail.impl.settings.component.accountPanel.C43403a;
import com.ss.android.lark.mail.impl.settings.component.p2220a.AbstractC43400b;
import com.ss.android.lark.mail.impl.settings.component.p2220a.C43397a;
import com.ss.android.lark.mail.impl.settings.component.p2221b.AbstractC43405a;
import com.ss.android.lark.mail.impl.settings.component.p2221b.C43406b;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43417a;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43420c;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43423f;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43425h;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43426i;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43429j;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43430k;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43431l;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43432m;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43433n;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.settings.mainpage.C43437a;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.mainpage.c */
public class C43445c extends BasePresenter<C43437a.AbstractC43438a, MailSettingView, C43437a.AbstractC43440b.AbstractC43441a> implements AbstractC43333t {

    /* renamed from: a */
    public Activity f110358a;

    /* renamed from: b */
    public C43403a f110359b;

    /* renamed from: c */
    public AbstractC43456a f110360c = new AbstractC43456a() {
        /* class com.ss.android.lark.mail.impl.settings.mainpage.C43445c.C434527 */

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: a */
        public String mo155260a() {
            return "Empty";
        }

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: a */
        public void mo155261a(AbstractC43456a aVar) {
            ((MailSettingView) C43445c.this.getView()).mo155241a(1);
        }

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: b */
        public void mo155262b(AbstractC43456a aVar) {
            ((MailSettingView) C43445c.this.getView()).mo155241a(2);
        }
    };

    /* renamed from: d */
    public AbstractC43456a f110361d = new AbstractC43456a() {
        /* class com.ss.android.lark.mail.impl.settings.mainpage.C43445c.C434538 */

        /* renamed from: a */
        List<AbsSettingItemViewModel> f110378a = new ArrayList();

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: a */
        public String mo155260a() {
            return "Multi";
        }

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: b */
        public void mo155262b(AbstractC43456a aVar) {
            for (AbsSettingItemViewModel absSettingItemViewModel : this.f110378a) {
                absSettingItemViewModel.mo155203a();
            }
        }

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: a */
        public void mo155261a(AbstractC43456a aVar) {
            ((MailSettingView) C43445c.this.getView()).mo155240a();
            ((MailSettingView) C43445c.this.getView()).mo155242a(C43445c.this.f110359b.mo155188b());
            this.f110378a.clear();
            this.f110378a.add(new C43432m(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.new_bot_notification")) {
                this.f110378a.add(new C43423f(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            } else {
                this.f110378a.add(new C43425h(((MailSettingView) C43445c.this.getView()).mo155244b(), AbsSettingItemViewModel.ActionType.Arrow, null));
            }
            this.f110378a.add(new C43430k(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            this.f110378a.add(new C43431l(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            this.f110378a.add(new C43433n(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            this.f110378a.add(new C43426i(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            for (int i = 0; i < this.f110378a.size(); i++) {
                AbsSettingItemViewModel absSettingItemViewModel = this.f110378a.get(i);
                absSettingItemViewModel.mo155204a(C43445c.this.f110358a);
                ((MailSettingView) C43445c.this.getView()).mo155242a(absSettingItemViewModel.mo155215g());
            }
        }
    };

    /* renamed from: e */
    public AbstractC43456a f110362e = new AbstractC43456a() {
        /* class com.ss.android.lark.mail.impl.settings.mainpage.C43445c.C434549 */

        /* renamed from: a */
        List<AbsSettingItemViewModel> f110380a = new ArrayList();

        /* renamed from: b */
        C43406b f110381b;

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: a */
        public String mo155260a() {
            return "SingleNormal";
        }

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: b */
        public void mo155262b(AbstractC43456a aVar) {
            for (AbsSettingItemViewModel absSettingItemViewModel : this.f110380a) {
                absSettingItemViewModel.mo155203a();
            }
            this.f110381b.destroy();
        }

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: a */
        public void mo155261a(AbstractC43456a aVar) {
            ((MailSettingView) C43445c.this.getView()).mo155240a();
            ((MailSettingView) C43445c.this.getView()).mo155242a(C43445c.this.f110359b.mo155188b());
            this.f110380a.clear();
            this.f110380a.add(new C43432m(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.new_bot_notification")) {
                this.f110380a.add(new C43423f(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            } else {
                this.f110380a.add(new C43425h(((MailSettingView) C43445c.this.getView()).mo155244b(), AbsSettingItemViewModel.ActionType.Switch, (ISettingItemModel) C43445c.this.getModel()));
            }
            this.f110380a.add(new C43430k(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            this.f110380a.add(new C43431l(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            this.f110380a.add(new C43433n(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            if (C41970e.m166941d().mo150951a()) {
                this.f110380a.add(new C43420c(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            } else {
                this.f110380a.add(new C43429j(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            }
            this.f110380a.add(new C43417a(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            this.f110380a.add(new C43426i(((MailSettingView) C43445c.this.getView()).mo155244b(), (ISettingItemModel) C43445c.this.getModel()));
            for (int i = 0; i < this.f110380a.size(); i++) {
                AbsSettingItemViewModel absSettingItemViewModel = this.f110380a.get(i);
                absSettingItemViewModel.mo155204a(C43445c.this.f110358a);
                ((MailSettingView) C43445c.this.getView()).mo155242a(absSettingItemViewModel.mo155215g());
            }
            C43406b bVar = new C43406b(C43445c.this.f110358a, ((MailSettingView) C43445c.this.getView()).mo155244b(), new C43406b.AbstractC43411a() {
                /* class com.ss.android.lark.mail.impl.settings.mainpage.C43445c.C434549.C434551 */

                @Override // com.ss.android.lark.mail.impl.settings.component.p2221b.C43406b.AbstractC43411a
                /* renamed from: a */
                public void mo155201a() {
                }
            }, (AbstractC43405a) C43445c.this.getModel());
            this.f110381b = bVar;
            bVar.create();
            ((MailSettingView) C43445c.this.getView()).mo155242a(this.f110381b.getView());
        }
    };

    /* renamed from: f */
    public AbstractC43456a f110363f = new AbstractC43456a() {
        /* class com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AnonymousClass10 */

        /* renamed from: a */
        C43397a f110367a;

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: a */
        public String mo155260a() {
            return "SingleExpired";
        }

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: b */
        public void mo155262b(AbstractC43456a aVar) {
            this.f110367a.destroy();
        }

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: a */
        public void mo155261a(AbstractC43456a aVar) {
            ((MailSettingView) C43445c.this.getView()).mo155240a();
            ((MailSettingView) C43445c.this.getView()).mo155242a(C43445c.this.f110359b.mo155188b());
            C43397a aVar2 = new C43397a(C43445c.this.f110358a, ((MailSettingView) C43445c.this.getView()).mo155244b(), (AbstractC43400b) C43445c.this.getModel());
            this.f110367a = aVar2;
            aVar2.create();
            ((MailSettingView) C43445c.this.getView()).mo155242a(this.f110367a.getView());
        }
    };

    /* renamed from: g */
    public AbstractC43456a f110364g = new AbstractC43456a() {
        /* class com.ss.android.lark.mail.impl.settings.mainpage.C43445c.C434472 */

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: a */
        public String mo155260a() {
            return "SingleUnbind";
        }

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: b */
        public void mo155262b(AbstractC43456a aVar) {
        }

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43445c.AbstractC43456a
        /* renamed from: a */
        public void mo155261a(AbstractC43456a aVar) {
            ((MailSettingView) C43445c.this.getView()).mo155240a();
            ((MailSettingView) C43445c.this.getView()).mo155242a(C43445c.this.f110359b.mo155188b());
        }
    };

    /* renamed from: h */
    private AbstractC43456a f110365h;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.settings.mainpage.c$a */
    public interface AbstractC43456a {
        /* renamed from: a */
        String mo155260a();

        /* renamed from: a */
        void mo155261a(AbstractC43456a aVar);

        /* renamed from: b */
        void mo155262b(AbstractC43456a aVar);
    }

    /* renamed from: a */
    public void mo155256a() {
    }

    /* renamed from: b */
    public void mo155258b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C43437a.AbstractC43440b.AbstractC43441a createViewDelegate() {
        return new C43437a.AbstractC43440b.AbstractC43441a() {
            /* class com.ss.android.lark.mail.impl.settings.mainpage.C43445c.C434505 */

            @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43437a.AbstractC43440b.AbstractC43441a
            /* renamed from: a */
            public void mo155252a() {
                ((C43437a.AbstractC43438a) C43445c.this.getModel()).mo155250g();
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        Watchers.m167209b(this);
        AbstractC43456a aVar = this.f110365h;
        if (aVar != null) {
            aVar.mo155262b(null);
        }
        C43403a aVar2 = this.f110359b;
        if (aVar2 != null) {
            aVar2.mo155185a();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C43403a aVar = new C43403a(((MailSettingView) getView()).mo155244b(), C43277a.m171921a().mo155068P());
        this.f110359b = aVar;
        aVar.mo155186a(this.f110358a);
        ((MailSettingView) getView()).mo155241a(((C43437a.AbstractC43438a) getModel()).mo155248e().mo5927b().intValue());
        ((C43437a.AbstractC43438a) getModel()).mo155247a(new C43437a.AbstractC43438a.AbstractC43439a() {
            /* class com.ss.android.lark.mail.impl.settings.mainpage.C43445c.C434461 */

            @Override // com.ss.android.lark.mail.impl.settings.mainpage.C43437a.AbstractC43438a.AbstractC43439a
            /* renamed from: a */
            public LifecycleOwner mo155251a() {
                return ((MailSettingView) C43445c.this.getView()).mo155244b();
            }
        });
        ((C43437a.AbstractC43438a) getModel()).mo155248e().mo5923a(((MailSettingView) getView()).mo155244b(), new AbstractC1178x<Integer>() {
            /* class com.ss.android.lark.mail.impl.settings.mainpage.C43445c.C434483 */

            /* renamed from: a */
            public void onChanged(Integer num) {
                ((MailSettingView) C43445c.this.getView()).mo155241a(num.intValue());
            }
        });
        ((C43437a.AbstractC43438a) getModel()).mo155249f().mo5923a(((MailSettingView) getView()).mo155244b(), new AbstractC1178x<List<C42087a>>() {
            /* class com.ss.android.lark.mail.impl.settings.mainpage.C43445c.C434494 */

            /* renamed from: a */
            public void onChanged(List<C42087a> list) {
                String str;
                int i;
                StringBuilder sb = new StringBuilder();
                sb.append("setting list change : ");
                if (list != null) {
                    str = list.toString();
                } else {
                    str = "null";
                }
                sb.append(str);
                Log.m165389i("MailSettingPresenter", sb.toString());
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                if (i <= 0) {
                    C43445c cVar = C43445c.this;
                    cVar.mo155257a(cVar.f110360c);
                    return;
                }
                C42087a aVar = list.get(0);
                if (aVar.f107030g == 3) {
                    C43445c.this.f110358a.finish();
                } else if (i > 1) {
                    C43445c cVar2 = C43445c.this;
                    cVar2.mo155257a(cVar2.f110361d);
                } else if (i != 1) {
                } else {
                    if (aVar.f107030g == 0) {
                        C43445c cVar3 = C43445c.this;
                        cVar3.mo155257a(cVar3.f110362e);
                    } else if (aVar.f107030g == 1) {
                        C43445c cVar4 = C43445c.this;
                        cVar4.mo155257a(cVar4.f110363f);
                    } else if (aVar.f107030g == 2) {
                        C43445c cVar5 = C43445c.this;
                        cVar5.mo155257a(cVar5.f110364g);
                    }
                }
            }
        });
        Watchers.m167206a(this);
        C43277a.m171921a().mo154932a(true);
        ((C43437a.AbstractC43438a) getModel()).mo155250g();
    }

    /* renamed from: a */
    public void mo155257a(AbstractC43456a aVar) {
        String str;
        AbstractC43456a aVar2 = this.f110365h;
        if (aVar2 != aVar) {
            String str2 = "null";
            if (aVar2 != null) {
                if (("leave state : " + aVar2) != null) {
                    str = aVar2.mo155260a();
                } else {
                    str = str2;
                }
                Log.m165388i(str);
                aVar2.mo155262b(aVar);
            }
            this.f110365h = aVar;
            if (aVar != null) {
                if (("enter state : " + aVar) != null) {
                    str2 = aVar.mo155260a();
                }
                Log.m165388i(str2);
                aVar.mo155261a(aVar2);
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t
    public void onSharedAccountChange(final String str, final C42093e eVar, final boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.settings.mainpage.C43445c.RunnableC434516 */

            public void run() {
                C42365c.m169155a().mo152525a(((MailSettingView) C43445c.this.getView()).mo155245c(), str, eVar, z, 1, null);
            }
        });
    }

    public C43445c(Activity activity, C43437a.AbstractC43438a aVar, MailSettingView mailSettingView) {
        super(aVar, mailSettingView);
        this.f110358a = activity;
    }
}
