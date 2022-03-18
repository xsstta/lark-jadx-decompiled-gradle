package com.ss.android.lark.feed.app;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.C36529b;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.model.C37668a;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.C59204a;
import com.ss.android.lark.widget.tab.NavigationTabItemView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.i */
class C37613i implements AbstractC36553a, AbstractC44552i {

    /* renamed from: a */
    public FeedTabView f96453a;

    /* renamed from: b */
    public C37539f f96454b;

    /* renamed from: c */
    public int f96455c = 0;

    /* renamed from: d */
    private C37731d.AbstractC37734b f96456d;

    /* renamed from: e */
    private C37621a f96457e;

    /* renamed from: f */
    private AbstractC44548e f96458f;

    /* renamed from: g */
    private ITitleController f96459g;

    /* renamed from: h */
    private AbstractC44552i.AbstractC44553a f96460h = new AbstractC44552i.AbstractC44553a() {
        /* class com.ss.android.lark.feed.app.C37613i.C376141 */

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            if (C37613i.this.f96454b != null) {
                C37613i.this.f96454b.mo137766a(str, str2);
            }
            if (C37613i.this.f96453a != null) {
                boolean equals = TextUtils.equals("conversation", str);
                boolean equals2 = TextUtils.equals("conversation", str2);
                if (equals && !equals2) {
                    C37613i.this.f96453a.mo110683b();
                }
                if (!equals && equals2) {
                    C37613i.this.f96453a.mo110677a();
                }
            }
        }
    };

    /* renamed from: i */
    private AbstractC37622b f96461i = new AbstractC37622b() {
        /* class com.ss.android.lark.feed.app.C37613i.C376152 */

        @Override // com.ss.android.lark.feed.app.C37613i.AbstractC37622b
        /* renamed from: a */
        public void mo138005a() {
            C37613i.this.mo138004p();
        }

        @Override // com.ss.android.lark.feed.app.C37613i.AbstractC37622b
        /* renamed from: a */
        public void mo138006a(int i) {
            C37613i.this.mo138001a(i);
        }

        @Override // com.ss.android.lark.feed.app.C37613i.AbstractC37622b
        /* renamed from: a */
        public void mo138007a(boolean z) {
            C37613i.this.mo138002a(z);
        }
    };

    /* renamed from: com.ss.android.lark.feed.app.i$b */
    public interface AbstractC37622b {
        /* renamed from: a */
        void mo138005a();

        /* renamed from: a */
        void mo138006a(int i);

        /* renamed from: a */
        void mo138007a(boolean z);
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a, com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "conversation";
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 0;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f96460h;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
        C37539f fVar = this.f96454b;
        if (fVar != null) {
            fVar.mo137770c();
        }
    }

    /* renamed from: p */
    public void mo138004p() {
        FeedTabView feedTabView = this.f96453a;
        if (feedTabView != null) {
            feedTabView.mo137108c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.i$a */
    public class C37621a extends NavigationTabItemView {
        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C37613i iVar = C37613i.this;
            iVar.mo138001a(iVar.f96455c);
        }

        public C37621a(Context context) {
            super(context);
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
        C37731d.m148488a().mo138408b(this.f96456d);
        this.f96456d = null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        C37539f fVar = this.f96454b;
        if (fVar == null) {
            return null;
        }
        return fVar.mo137772e();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        C37539f fVar = this.f96454b;
        if (fVar == null) {
            return null;
        }
        return fVar.mo137771d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public FeedTabView mo138000a() {
        return new FeedTabView(this.f96458f.getContainerContext());
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        if (this.f96453a == null) {
            this.f96453a = mo138000a();
            mo138001a(this.f96455c);
        }
        return this.f96453a;
    }

    /* renamed from: o */
    public C37539f mo31318i() {
        if (this.f96454b == null) {
            this.f96454b = new C37539f(this.f96458f, this.f96459g, this.f96461i);
        }
        return this.f96454b;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        C37621a aVar = this.f96457e;
        if (aVar != null) {
            return aVar;
        }
        Context containerContext = this.f96458f.getContainerContext();
        C37621a aVar2 = new C37621a(containerContext);
        this.f96457e = aVar2;
        aVar2.setTabTitle(containerContext.getString(R.string.Lark_Legacy_MessengerTab));
        this.f96457e.setTabIcon(UDIconUtils.getIconDrawable(containerContext, (int) R.drawable.ud_icon_tab_chat_filled, UIHelper.getColor(R.color.ud_B500)));
        m147878a(containerContext);
        mo138001a(this.f96455c);
        return this.f96457e;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a
    /* renamed from: r */
    public Map<ContainerType, C36516a> mo103433r() {
        HashMap hashMap = new HashMap();
        mo31318i().setFragmentParams(new MainWindowParams.C36570a(ContainerType.Left).mo134958a(mo31311b()).mo134930b());
        C36529b bVar = new C36529b();
        Bundle arguments = bVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("holder", R.drawable.empty_default_icon);
        bVar.setArguments(arguments);
        bVar.setFragmentParams(new MainWindowParams.C36570a(ContainerType.Right).mo134958a(mo31311b()).mo134930b());
        hashMap.put(ContainerType.Left, mo31318i());
        hashMap.put(ContainerType.Right, bVar);
        return hashMap;
    }

    /* renamed from: a */
    public void mo138002a(boolean z) {
        FeedTabView feedTabView = this.f96453a;
        if (feedTabView != null) {
            feedTabView.mo137107a(z);
        }
    }

    /* renamed from: a */
    private void m147878a(Context context) {
        this.f96457e.setRedDotView(new C59204a<LKUIBadgeView, Integer>(context) {
            /* class com.ss.android.lark.feed.app.C37613i.C376205 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.widget.tab.C59204a
            /* renamed from: a */
            public void mo31305a(Context context) {
                super.mo31305a(context);
                this.f147019e = new LKUIBadgeView(context);
                ((LKUIBadgeView) this.f147019e).mo89316a(11.0f);
            }

            /* renamed from: a */
            public void mo31307a(Integer num) {
                int i;
                super.mo31307a((Object) num);
                if (num.intValue() == 0) {
                    ((LKUIBadgeView) mo201282b()).setVisibility(8);
                    return;
                }
                String valueOf = String.valueOf(Math.abs(num.intValue()));
                ((LKUIBadgeView) mo201282b()).setVisibility(0);
                if (num.intValue() < 10) {
                    i = R.drawable.badge_orange_single_count_bg_no_stroke;
                } else if (num.intValue() < 99) {
                    i = R.drawable.badge_orange_multi_count_bg_no_stroke;
                } else {
                    valueOf = null;
                    i = R.drawable.badge_orange_bg_etc_count;
                }
                ((LKUIBadgeView) mo201282b()).mo89322b(i).mo89319a(valueOf).mo89317a(-1).mo89320a();
            }
        });
    }

    /* renamed from: a */
    public void mo138001a(int i) {
        this.f96455c = i;
        FeedTabView feedTabView = this.f96453a;
        if (feedTabView != null) {
            feedTabView.mo201233a(i);
        }
        C37621a aVar = this.f96457e;
        if (aVar != null) {
            aVar.mo201263a(i);
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
        boolean z = bundle.getBoolean("switch_to_inbox");
        boolean z2 = bundle.getBoolean("switch_to_convbox");
        Log.m165389i("FeedModule_FeedTabPageSpec", "execCommand: switchToInbox = " + z);
        if (z) {
            C37268c.m146766b().mo139165L();
        } else if (z2 && this.f96454b != null) {
            this.f96454b.mo137765a(bundle.getString("parent_card_id"));
        }
    }

    public C37613i(AbstractC44548e eVar, ITitleController iTitleController) {
        this.f96458f = eVar;
        this.f96459g = iTitleController;
        this.f96456d = new C37731d.AbstractC37734b() {
            /* class com.ss.android.lark.feed.app.C37613i.C376163 */

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
                r2 = r2.get(java.lang.Integer.valueOf(com.ss.android.lark.biz.im.api.FeedCard.FeedType.INBOX.getNumber()));
             */
            @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo137402a(java.util.Map<java.lang.Integer, java.lang.Integer> r2) {
                /*
                    r1 = this;
                    super.mo137402a(r2)
                    if (r2 != 0) goto L_0x0006
                    return
                L_0x0006:
                    com.ss.android.lark.biz.im.api.FeedCard$FeedType r0 = com.ss.android.lark.biz.im.api.FeedCard.FeedType.INBOX
                    int r0 = r0.getNumber()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.lang.Object r2 = r2.get(r0)
                    java.lang.Integer r2 = (java.lang.Integer) r2
                    if (r2 != 0) goto L_0x0019
                    return
                L_0x0019:
                    com.ss.android.lark.feed.app.i$3$1 r0 = new com.ss.android.lark.feed.app.i$3$1
                    r0.<init>(r2)
                    java.lang.String r2 = "onBadgeCountChanged"
                    com.ss.android.lark.feed.p1873d.C38074a.m149792a(r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.C37613i.C376163.mo137402a(java.util.Map):void");
            }
        };
        C37731d.m148488a().mo138402a(this.f96456d);
        C37262a.m146726a().mo139166M().mo139281a(new AbstractC44544a() {
            /* class com.ss.android.lark.feed.app.C37613i.C376184 */

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102546a() {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: b */
            public void mo102548b() {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102547a(String str) {
                C37262a.m146726a().mo139166M().mo139284b(this);
                if (!"conversation".equals(C37262a.m146726a().mo139166M().mo139279a())) {
                    CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                        /* class com.ss.android.lark.feed.app.C37613i.C376184.RunnableC376191 */

                        public void run() {
                            C37480d.m147447a().mo137450b();
                            C37668a.m148111a().mo138103b();
                        }
                    });
                }
            }
        });
    }
}
