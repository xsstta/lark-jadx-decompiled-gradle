package com.ss.android.vc.meeting.module.chat;

import android.view.View;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.reaction.entity.IMSource;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessageType;
import com.ss.android.vc.service.C63634c;
import java.util.ArrayList;

/* renamed from: com.ss.android.vc.meeting.module.chat.g */
public class C61585g extends AbstractC61424d implements AbstractC61595i {

    /* renamed from: a */
    private C61586h f154499a;

    /* renamed from: b */
    private C61571b f154500b;

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m240417f() {
        this.f154499a.mo213428a(0);
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: a */
    public void mo213414a() {
        C61586h hVar = this.f154499a;
        if (hVar != null) {
            hVar.mo213431b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: c */
    public boolean mo213423c() {
        if (this.f154499a != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: d */
    public boolean mo213424d() {
        C61586h hVar = this.f154499a;
        if (hVar == null || !hVar.mo213439j()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: e */
    public void mo213425e() {
        if (this.f154499a != null) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.vc.meeting.module.chat.$$Lambda$g$tYqpZl5jSirma9pXJ9GGQn0kYhU */

                public final void run() {
                    C61585g.this.m240417f();
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        super.destroy();
        C61586h hVar = this.f154499a;
        if (hVar != null) {
            hVar.mo213435f();
        }
        getMeeting().mo212105W().mo212840s().mo213373b(this);
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: b */
    public void mo213421b() {
        String str;
        if (this.f154500b != null) {
            int i = this.mPresent.mo212921f().mo212105W().mo212840s().mo213380i();
            if (i >= 1) {
                if (i <= 999) {
                    str = Integer.toString(i);
                } else {
                    str = "···";
                }
                this.f154500b.f154457a.setText(str);
                this.f154500b.f154457a.setVisibility(0);
                this.f154500b.f154458b.setVisibility(0);
                return;
            }
            this.f154500b.f154457a.setVisibility(8);
            this.f154500b.f154458b.setVisibility(8);
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: a */
    public void mo213419a(String str) {
        C60738ac.m236029a(str);
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: b */
    public void mo213422b(C61586h hVar) {
        this.f154499a = null;
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: a */
    public void mo213416a(View view) {
        C61571b bVar = new C61571b();
        this.f154500b = bVar;
        bVar.mo213390a(view);
        mo213421b();
    }

    public C61585g(AbstractC61429i iVar) {
        super(iVar);
        getMeeting().mo212105W().mo212840s().mo213368a(this);
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: a */
    public void mo213417a(C61586h hVar) {
        if (!C63634c.m249496b("byteview.meeting.android.chat")) {
            C60700b.m235851b("ChatViewControl", "[createIMExpandView]", "Fg not enable");
        } else {
            this.f154499a = hVar;
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: a */
    public void mo213418a(InteractionMessage aVar) {
        if (this.f154499a == null && aVar != null && aVar.mo216914b() == InteractionMessageType.TEXT && aVar.mo216925i() != null && getMeeting().as().mo213380i() > 0) {
            if (this.mPresent.mo212921f().ai().mo213012a()) {
                getMeeting().aC().mo213386a(aVar, IMSource.BOTTOM_BAR);
            } else {
                getMeeting().aC().mo213386a(aVar, IMSource.REACTION);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: a */
    public void mo213415a(int i, boolean z) {
        C61586h hVar = this.f154499a;
        if (hVar != null) {
            hVar.mo213429a(i, z);
        }
        this.mPresent.mo212921f().ai().mo213013b(i);
        mo213421b();
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61595i
    /* renamed from: a */
    public void mo213420a(ArrayList<InteractionMessage> arrayList, ChatMoveDirection chatMoveDirection) {
        C61586h hVar = this.f154499a;
        if (hVar != null) {
            hVar.mo213430a(arrayList, chatMoveDirection);
        }
    }
}
