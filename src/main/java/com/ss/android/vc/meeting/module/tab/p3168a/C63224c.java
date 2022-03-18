package com.ss.android.vc.meeting.module.tab.p3168a;

import android.content.Context;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.tab.C59204a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.tab.p3168a.AbstractC63217a;
import com.ss.android.vc.meeting.module.tab.p3168a.C63224c;

/* renamed from: com.ss.android.vc.meeting.module.tab.a.c */
public class C63224c {

    /* renamed from: a */
    public int f159407a;

    /* renamed from: b */
    public AbstractC63227a f159408b;

    /* renamed from: c */
    private AbstractC63217a f159409c;

    /* renamed from: d */
    private AbstractC63217a.AbstractC63218a f159410d = new AbstractC63217a.AbstractC63218a() {
        /* class com.ss.android.vc.meeting.module.tab.p3168a.C63224c.C632251 */

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m247594b(int i) {
            if (C63224c.this.f159408b != null) {
                C63224c.this.f159408b.mo218819a(i);
            }
        }

        @Override // com.ss.android.vc.meeting.module.tab.p3168a.AbstractC63217a.AbstractC63218a
        /* renamed from: a */
        public void mo218807a(int i) {
            C60700b.m235851b("VideoChatTab_VideoChatTabRedDotHelper", "[onVideoChatTabCountChanged]", "count= " + i);
            C13748k.m55732a(new Runnable(i) {
                /* class com.ss.android.vc.meeting.module.tab.p3168a.$$Lambda$c$1$sBxXm7l5g_XXyKbdjVDLUra4ILY */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C63224c.C632251.lambda$sBxXm7l5g_XXyKbdjVDLUra4ILY(C63224c.C632251.this, this.f$1);
                }
            });
        }
    };

    /* renamed from: com.ss.android.vc.meeting.module.tab.a.c$a */
    public interface AbstractC63227a {
        /* renamed from: a */
        void mo218819a(int i);

        /* renamed from: a */
        void mo218820a(C59204a aVar);
    }

    /* renamed from: a */
    public void mo218815a() {
        AbstractC63217a aVar = this.f159409c;
        if (aVar != null) {
            aVar.mo218805a(this.f159410d);
        }
    }

    /* renamed from: b */
    public void mo218817b() {
        AbstractC63217a aVar = this.f159409c;
        if (aVar != null) {
            aVar.mo218806b(this.f159410d);
        }
    }

    public C63224c(AbstractC63227a aVar) {
        this.f159408b = aVar;
    }

    /* renamed from: a */
    public void mo218816a(Context context) {
        if (this.f159408b != null) {
            this.f159409c = C63219b.m247574a();
            this.f159408b.mo218820a(new C59204a<LKUIBadgeView, Integer>(context) {
                /* class com.ss.android.vc.meeting.module.tab.p3168a.C63224c.C632262 */

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
                    if (num.intValue() != C63224c.this.f159407a) {
                        C63224c.this.f159407a = num.intValue();
                        if (num.intValue() == 0) {
                            ((LKUIBadgeView) mo201282b()).setVisibility(8);
                            return;
                        }
                        String valueOf = String.valueOf(Math.abs(num.intValue()));
                        ((LKUIBadgeView) mo201282b()).setVisibility(0);
                        if (num.intValue() < 10) {
                            i = R.drawable.badge_orange_single_count_bg_stroke;
                        } else if (num.intValue() < 99) {
                            i = R.drawable.badge_orange_multi_count_bg_stroke;
                        } else {
                            valueOf = null;
                            i = R.drawable.badge_orange_bg_etc_count_stroke;
                        }
                        ((LKUIBadgeView) mo201282b()).mo89322b(i).mo89321b(2.5f).mo89319a(valueOf).mo89317a(-1).mo89320a();
                    }
                }
            });
        }
    }
}
