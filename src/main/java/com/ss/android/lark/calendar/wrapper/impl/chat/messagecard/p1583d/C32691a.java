package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1583d;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.ShareCalendarEventContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1583d.C32692b;
import com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;

/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.d.a */
public class C32691a<T> extends AbstractC58992f<T, C32692b> {

    /* renamed from: a */
    private AbstractC32679d.AbstractC32680a<T> f83853a;

    /* renamed from: a */
    private String m125511a(CalendarEvent calendarEvent) {
        return C32646c.m125260a(calendarEvent);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m125518d(View view) {
        this.f83853a.mo120387a(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m125512a(View view) {
        this.f83853a.mo120386a(65299);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m125514b(View view) {
        this.f83853a.mo120386a(65298);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m125516c(View view) {
        this.f83853a.mo120386a(65297);
    }

    /* renamed from: b */
    private void m125515b(C32692b bVar) {
        if (this.f83853a.mo120395g()) {
            bVar.f83864k.setVisibility(0);
            bVar.f83864k.setText(UIHelper.mustacheFormat((int) R.string.Lark_Pin_From, "name", this.f83853a.mo120396h()));
            return;
        }
        bVar.f83864k.setVisibility(8);
    }

    /* renamed from: c */
    private void m125517c(C32692b bVar) {
        CalendarEvent calendarEvent;
        bVar.f83854a.setVisibility(0);
        ShareCalendarEventContent shareCalendarEventContent = (ShareCalendarEventContent) this.f83853a.mo120390b().getContent();
        if (shareCalendarEventContent != null && (calendarEvent = shareCalendarEventContent.getCalendarInternalShareEventContent().getCalendarEvent()) != null) {
            String summary = calendarEvent.getSummary();
            if (TextUtils.isEmpty(summary)) {
                summary = C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
            }
            bVar.f83854a.setText(summary);
            bVar.f83858e.setText(m125511a(calendarEvent));
        }
    }

    /* renamed from: a */
    private void m125513a(C32692b bVar) {
        C25649b.m91853a(bVar.f83857d, 32);
        C25649b.m91857a(bVar.f83855b, LarkFont.BODY1);
        C25649b.m91857a(bVar.f83856c, LarkFont.CAPTION0);
        int c = LKUIDisplayManager.m91881c(this.f146181d, 24) + UIHelper.dp2px(3.0f);
        int c2 = LKUIDisplayManager.m91881c(this.f146181d, 24) + UIHelper.dp2px(6.0f);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) bVar.f83863j.getLayoutParams();
        layoutParams.width = c;
        layoutParams.height = c2;
        bVar.f83863j.setLayoutParams(layoutParams);
        C25649b.m91853a(bVar.f83868o, 32);
        C25649b.m91857a(bVar.f83854a, LarkFont.HEADLINE);
        C25649b.m91857a(bVar.f83858e, LarkFont.BODY1);
        C25649b.m91857a(bVar.f83864k, LarkFont.BODY1);
        C25649b.m91857a(bVar.f83859f, LarkFont.CAPTION0);
    }

    public C32691a(Context context, AbstractC32679d.AbstractC32680a<T> aVar) {
        super(context);
        this.f83853a = aVar;
    }

    /* renamed from: a */
    public C32692b mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C32692b.C32694a.m125523a(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    public void mo31174a(C32692b bVar, int i, T t) {
        this.f83853a.mo120388a((Object) t);
        String c = this.f83853a.mo120391c();
        String f = this.f83853a.mo120394f();
        String d = this.f83853a.mo120392d();
        String e = this.f83853a.mo120393e();
        if (this.f83853a.mo120389a()) {
            bVar.f83859f.setText(String.format("%s %s", c, f));
            bVar.f83861h.setVisibility(8);
            bVar.f83862i.setBackgroundResource(R.drawable.item_bg_c4_white);
            bVar.itemView.setBackgroundResource(R.drawable.item_bg_c4_white_border);
        } else {
            bVar.f83855b.setText(c);
            bVar.f83856c.setText(f);
            bVar.f83859f.setVisibility(8);
        }
        C30022a.f74882a.imageDependency().mo108246a(this.f146181d, d, e, bVar.f83857d, 24, 24);
        m125515b(bVar);
        m125517c(bVar);
        if (!DesktopUtil.m144307b()) {
            bVar.f83863j.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1583d.$$Lambda$a$yHeyYGHZ9ZtTQkSzxLVy1AcjalU */

                public final void onClick(View view) {
                    C32691a.this.m125518d(view);
                }
            });
            bVar.f83865l.setVisibility(8);
            bVar.f83866m.setVisibility(8);
            bVar.f83867n.setVisibility(8);
            m125513a(bVar);
            return;
        }
        bVar.f83863j.setVisibility(8);
        bVar.f83865l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1583d.$$Lambda$a$zPGE4UrX89a1s6R2wsynQIWrMvY */

            public final void onClick(View view) {
                C32691a.this.m125516c((C32691a) view);
            }
        });
        bVar.f83866m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1583d.$$Lambda$a$WgMJkbzPvvZuvEhoDjSkdWRnMY */

            public final void onClick(View view) {
                C32691a.this.m125514b((C32691a) view);
            }
        });
        bVar.f83867n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1583d.$$Lambda$a$DiQlMPKq6O7V7C2OC41Qqjr8RUg */

            public final void onClick(View view) {
                C32691a.this.m125512a((C32691a) view);
            }
        });
        PinItemHoverHandler.m125525a(bVar.itemView);
    }
}
