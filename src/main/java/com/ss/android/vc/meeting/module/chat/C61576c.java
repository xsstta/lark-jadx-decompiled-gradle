package com.ss.android.vc.meeting.module.chat;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.ak;
import com.ss.android.vc.entity.response.ap;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.chat.C61576c;
import com.ss.android.vc.meeting.module.reaction.entity.IMSource;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessageType;
import com.ss.android.vc.meeting.module.reaction.entity.ReactionContent;
import com.ss.android.vc.meeting.module.reaction.entity.TextContent;
import com.ss.android.vc.meeting.module.reaction.util.MessageCompleteTask;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.chat.c */
public class C61576c extends AbstractC61566a implements C61388g.AbstractC61393a, AbsBreakoutRoomControl.AbstractC61510d, MessageCompleteTask.MessageConsumer {

    /* renamed from: d */
    private static final Long f154473d = 1500L;

    /* renamed from: a */
    public C61303k f154474a;

    /* renamed from: b */
    public CopyOnWriteArrayList<AbstractC61595i> f154475b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public int f154476c = -1;

    /* renamed from: e */
    private String f154477e;

    /* renamed from: f */
    private boolean f154478f;

    /* renamed from: g */
    private Comparator<InteractionMessage> f154479g = new Comparator<InteractionMessage>() {
        /* class com.ss.android.vc.meeting.module.chat.C61576c.C615771 */

        /* renamed from: a */
        public int compare(InteractionMessage aVar, InteractionMessage aVar2) {
            return aVar.mo216919e() - aVar2.mo216919e();
        }
    };

    /* renamed from: h */
    private HashSet<Integer> f154480h = new HashSet<>();

    /* renamed from: i */
    private ArrayList<InteractionMessage> f154481i = new ArrayList<>();

    /* renamed from: j */
    private int f154482j = -1;

    /* renamed from: k */
    private int f154483k = -1;

    /* renamed from: l */
    private int f154484l = -1;

    /* renamed from: m */
    private int f154485m = -1;

    /* renamed from: n */
    private MessageCompleteTask f154486n = new MessageCompleteTask(this);

    /* renamed from: o */
    private boolean f154487o = false;

    /* renamed from: p */
    private boolean f154488p = false;

    /* renamed from: q */
    private InteractionMessage f154489q;

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212617a(InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2) {
        C61388g.AbstractC61393a.CC.$default$a(this, interpreterSetting, interpreterSetting2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212618a(LanguageType languageType, LanguageType languageType2) {
        C61388g.AbstractC61393a.CC.$default$a(this, languageType, languageType2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212619a(Participant participant) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212620a(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: b */
    public /* synthetic */ void mo212621b(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$b(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bB_() {
        C61388g.AbstractC61393a.CC.$default$bB_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bD_() {
        C61388g.AbstractC61393a.CC.$default$bD_(this);
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: m */
    public void mo213383m() {
        this.f154488p = true;
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$onSelfRtcModeUpdate(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: g */
    public int mo213378g() {
        return this.f154484l;
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: h */
    public int mo213379h() {
        return this.f154485m;
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: k */
    public String mo213382k() {
        return this.f154477e;
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: n */
    public boolean mo213384n() {
        return this.f154478f;
    }

    /* renamed from: p */
    public InteractionMessage mo213406p() {
        return this.f154489q;
    }

    @Override // com.ss.android.vc.meeting.module.reaction.util.MessageCompleteTask.MessageConsumer
    /* renamed from: r */
    public HashSet<Integer> mo213408r() {
        return this.f154480h;
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: a */
    public void mo213367a(C61586h hVar) {
        if (!C60742af.m236059a(this.f154475b)) {
            Iterator<AbstractC61595i> it = this.f154475b.iterator();
            while (it.hasNext()) {
                it.next().mo213417a(hVar);
            }
            m240360u();
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: a */
    public void mo213368a(AbstractC61595i iVar) {
        this.f154475b.add(iVar);
        m240361v();
        AbsBreakoutRoomControl al = this.f154474a.al();
        if (!al.mo213182i()) {
            this.f154485m = C57744a.m224104a().getInt(this.f154474a.mo212055d(), -1);
        } else if (al.mo213184k() != null) {
            this.f154485m = C57744a.m224104a().getInt(al.mo213184k().getBreakoutRoomId(), -1);
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: a */
    public void mo213371a(boolean z) {
        this.f154487o = true;
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: a */
    public void mo213369a(String str) {
        this.f154477e = str;
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: a */
    public void mo213370a(ArrayList<InteractionMessage> arrayList) {
        C61303k kVar;
        if (!C60742af.m236059a(arrayList) && (kVar = (C61303k) MeetingManager.m238341a().mo211906j()) != null && TextUtils.equals(kVar.mo212055d(), this.f154474a.mo212055d())) {
            int i = 0;
            Iterator<InteractionMessage> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InteractionMessage next = it.next();
                if (m240356c(next)) {
                    i = next.mo216919e() - this.f154483k;
                    break;
                }
            }
            if (i > 0) {
                if (i <= 30) {
                    C60700b.m235851b("ChatControl", "[updateInteractionMessagesByPush]", "missing messages less than one page, complete!");
                    Iterator<InteractionMessage> it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InteractionMessage next2 = it2.next();
                        if (m240356c(next2)) {
                            mo213404b(next2);
                            break;
                        }
                    }
                    mo213401a(ChatMoveDirection.MOVE_DOWN);
                    this.f154486n.mo216885b(kVar.mo212055d());
                    return;
                }
                C60700b.m235851b("ChatControl", "[updateInteractionMessagesByPush2]", "missing messages more than one page, need't complete");
                Iterator<InteractionMessage> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    InteractionMessage next3 = it3.next();
                    if (m240356c(next3)) {
                        if (next3.mo216919e() > this.f154476c) {
                            this.f154476c = next3.mo216919e();
                        }
                        Iterator<AbstractC61595i> it4 = this.f154475b.iterator();
                        while (it4.hasNext()) {
                            AbstractC61595i next4 = it4.next();
                            next4.mo213415a(this.f154476c - this.f154485m, true);
                            next4.mo213418a(next3);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo213402a(InteractionMessage aVar) {
        if (this.f154480h.contains(Integer.valueOf(aVar.mo216919e()))) {
            C60700b.m235861e("ChatControl", "[insertCurrentList]", "already contains this message, id is " + aVar.mo216912a());
            return;
        }
        this.f154481i.add(aVar);
        this.f154480h.add(Integer.valueOf(aVar.mo216919e()));
    }

    @Override // com.ss.android.vc.meeting.module.reaction.util.MessageCompleteTask.MessageConsumer
    /* renamed from: a */
    public void mo213403a(List<InteractionMessage> list, boolean z) {
        for (InteractionMessage aVar : list) {
            mo213404b(aVar);
        }
        if (this.f154487o) {
            mo213401a(ChatMoveDirection.MOVE_DOWN);
        } else {
            mo213401a(z ? ChatMoveDirection.MOVE_DOWN : ChatMoveDirection.MOVE_NEWEST);
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: e */
    public boolean mo213376e() {
        if (this.f154482j > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: i */
    public int mo213380i() {
        return this.f154476c - this.f154485m;
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    public void bE_() {
        C60700b.m235851b("ChatControl", "[onJoinStart]", "onJoinStart");
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    /* renamed from: d */
    public void mo213204d() {
        C60700b.m235851b("ChatControl", "[onLeaveStart]", "onLeaveStart");
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: f */
    public boolean mo213377f() {
        int i = this.f154483k;
        if (i != -1 && i < this.f154476c) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public void mo213405o() {
        this.f154474a.al().mo213171b(this);
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: a */
    public void mo213362a() {
        int i = this.f154482j - 1;
        if (i >= 0) {
            int i2 = (i - 30) + 1;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i >= i2) {
                m240354a(i, true, (i - i2) + 1, true);
                this.f154482j = i2;
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: c */
    public void mo213375c() {
        int i = this.f154483k + 1;
        int i2 = this.f154476c;
        if (i <= i2) {
            int i3 = (i + 30) - 1;
            if (i3 <= i2) {
                i2 = i3;
            }
            if (i2 >= i) {
                m240354a(i, false, (i2 - i) + 1, false);
                this.f154483k = i2;
            }
        }
    }

    /* renamed from: s */
    private boolean m240358s() {
        if (C60742af.m236059a(this.f154475b)) {
            return false;
        }
        Iterator<AbstractC61595i> it = this.f154475b.iterator();
        if (it.hasNext()) {
            return it.next().mo213423c();
        }
        return false;
    }

    /* renamed from: t */
    private boolean m240359t() {
        if (C60742af.m236059a(this.f154475b)) {
            return false;
        }
        Iterator<AbstractC61595i> it = this.f154475b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        AbstractC61595i next = it.next();
        if (!next.mo213423c() || !next.mo213424d()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private void m240361v() {
        VCBreakoutRoomInfo k;
        String d = this.f154474a.mo212055d();
        if (this.f154474a.al().mo213182i() && (k = this.f154474a.al().mo213184k()) != null) {
            d = k.getBreakoutRoomId();
        }
        VcBizSender.m249160a(d, -1, false, 1).mo219889a(new AbstractC63598b<ak>() {
            /* class com.ss.android.vc.meeting.module.chat.C61576c.C615815 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("ChatControl", "[setTotalPosition2]", "[get latest message]error" + eVar.toString());
            }

            /* renamed from: a */
            public void onSuccess(ak akVar) {
                for (InteractionMessage aVar : akVar.f152649a) {
                    if (aVar != null) {
                        C61576c.this.f154476c = aVar.mo216919e();
                        C60700b.m235851b("ChatControl", "[setTotalPosition]", "the latest message's position is " + C61576c.this.f154476c);
                    }
                }
                AbsBreakoutRoomControl al = C61576c.this.f154474a.al();
                al.mo213182i();
                if (!al.mo213183j()) {
                    al.mo213181h();
                }
                Iterator<AbstractC61595i> it = C61576c.this.f154475b.iterator();
                while (it.hasNext()) {
                    AbstractC61595i next = it.next();
                    next.mo213421b();
                    next.mo213415a(C61576c.this.mo213380i(), false);
                }
            }
        });
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public void bG_() {
        if (!C60742af.m236059a(this.f154475b)) {
            C60700b.m235851b("ChatControl", "[onParticipantsRoleChanged]", "participant roles changed, update when in chat page.");
            if (m240358s()) {
                Iterator<AbstractC61595i> it = this.f154475b.iterator();
                while (it.hasNext()) {
                    it.next().mo213420a(mo213407q(), ChatMoveDirection.MOVE_STOP);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: j */
    public void mo213381j() {
        C60700b.m235851b("ChatControl", "[resetMessageList]", "reset all chat data");
        this.f154480h.clear();
        this.f154481i.clear();
        this.f154482j = -1;
        this.f154483k = -1;
        this.f154484l = -1;
        this.f154485m = -1;
        this.f154489q = null;
        m240360u();
    }

    /* renamed from: q */
    public ArrayList<InteractionMessage> mo213407q() {
        ArrayList<InteractionMessage> arrayList = new ArrayList<>();
        if (C13657b.m55421a(this.f154480h) || C13657b.m55421a(this.f154481i) || this.f154482j == -1 || this.f154483k == -1) {
            C60700b.m235851b("ChatControl", "[getViewList]", "empty viewList");
            return arrayList;
        }
        Collections.sort(this.f154481i, this.f154479g);
        for (int i = 0; i < this.f154481i.size(); i++) {
            InteractionMessage aVar = this.f154481i.get(i);
            int e = aVar.mo216919e();
            if (e >= this.f154482j) {
                if (e > this.f154483k) {
                    break;
                }
                arrayList.add(aVar);
            }
        }
        C60700b.m235851b("ChatControl", "[getViewList2]", "size is " + arrayList.size());
        return arrayList;
    }

    /* renamed from: u */
    private void m240360u() {
        int i;
        if (this.f154487o) {
            int i2 = this.f154476c;
            this.f154483k = i2;
            this.f154485m = i2;
            int min = Math.min(i2 + 1, 30);
            int i3 = (this.f154483k - min) + 1;
            this.f154482j = i3;
            m240355b(i3, false, min, false);
            return;
        }
        int i4 = mo213380i();
        int i5 = this.f154484l;
        if (i5 >= 0) {
            int i6 = this.f154476c;
            if (i6 - i5 <= 29) {
                i5 = i6 - 29;
            }
            this.f154482j = i5;
            int max = Math.max(i5, 0);
            this.f154482j = max;
            int min2 = Math.min((this.f154476c - max) + 1, 30);
            int i7 = this.f154482j;
            this.f154483k = (i7 + min2) - 1;
            m240355b(i7, false, min2, false);
        } else if (i4 > 0) {
            if (i4 > 29) {
                i = this.f154485m;
            } else {
                i = this.f154476c - 29;
            }
            this.f154482j = i;
            int max2 = Math.max(i, 0);
            this.f154482j = max2;
            int min3 = Math.min((this.f154476c - max2) + 1, 30);
            int i8 = this.f154482j;
            this.f154483k = (i8 + min3) - 1;
            m240355b(i8, false, min3, false);
        } else {
            C60700b.m235861e("ChatControl", "[pullMessagesForEnterMeeting]", "pull default page");
            int i9 = this.f154476c;
            this.f154483k = i9;
            int min4 = Math.min(i9 + 1, 30);
            int i10 = (this.f154483k - min4) + 1;
            this.f154482j = i10;
            m240355b(i10, false, min4, false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: b */
    public void mo213374b(boolean z) {
        this.f154478f = z;
    }

    /* renamed from: c */
    private boolean m240356c(InteractionMessage aVar) {
        if (aVar.mo216914b() == InteractionMessageType.TEXT) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: a */
    public void mo213363a(int i) {
        this.f154484l = i;
        if (i == this.f154476c) {
            this.f154488p = true;
        }
    }

    /* renamed from: d */
    private void m240357d(InteractionMessage aVar) {
        if (m240356c(aVar) && aVar.mo216919e() > this.f154476c) {
            this.f154476c = aVar.mo216919e();
            this.f154483k = aVar.mo216919e();
            if (m240359t()) {
                mo213364a(aVar.mo216919e(), true);
            }
        }
    }

    public C61576c(C61303k kVar) {
        this.f154474a = kVar;
        kVar.mo212091I().mo212494b().mo212593a(this);
        this.f154474a.al().mo213165a(this);
        this.f154474a.mo212046a(new AbstractC61288e() {
            /* class com.ss.android.vc.meeting.module.chat.C61576c.C615782 */

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e
            public void meetingStateChanged(VideoChat videoChat, StatusNode statusNode) {
                if (statusNode == StatusNode.Idle) {
                    C61576c.this.mo213405o();
                }
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: b */
    public void mo213372b(C61586h hVar) {
        this.f154478f = false;
        if (!C60742af.m236059a(this.f154475b)) {
            Iterator<AbstractC61595i> it = this.f154475b.iterator();
            while (it.hasNext()) {
                it.next().mo213422b(hVar);
            }
            if (!this.f154488p && mo213406p() != null && mo213380i() > 0) {
                this.f154488p = true;
                if (this.f154474a.ai().mo213012a()) {
                    this.f154474a.aC().mo213386a(mo213406p(), IMSource.BOTTOM_BAR);
                } else {
                    this.f154474a.aC().mo213386a(mo213406p(), IMSource.REACTION);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: a */
    public void mo213365a(View view) {
        if (!C60742af.m236059a(this.f154475b)) {
            Iterator<AbstractC61595i> it = this.f154475b.iterator();
            while (it.hasNext()) {
                AbstractC61595i next = it.next();
                if (next != null) {
                    next.mo213416a(view);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: b */
    public void mo213373b(AbstractC61595i iVar) {
        this.f154486n.mo216882a();
        this.f154475b.remove(iVar);
        AbsBreakoutRoomControl al = this.f154474a.al();
        if (!al.mo213182i()) {
            C57744a.m224104a().putInt(this.f154474a.mo212055d(), mo213379h());
        } else if (al.mo213184k() != null) {
            C57744a.m224104a().putInt(al.mo213184k().getBreakoutRoomId(), mo213379h());
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: a */
    public void mo213366a(RichText richText) {
        VCBreakoutRoomInfo k;
        String d = this.f154474a.mo212055d();
        if (this.f154474a.al().mo213182i() && (k = this.f154474a.al().mo213184k()) != null) {
            d = k.getBreakoutRoomId();
        }
        VcBizSender.m249176a(d, InteractionMessageType.TEXT, (ReactionContent) null, new TextContent(richText)).mo219893b(new AbstractC63598b<ap>() {
            /* class com.ss.android.vc.meeting.module.chat.C61576c.C615793 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m240401a(String str) {
                Iterator<AbstractC61595i> it = C61576c.this.f154475b.iterator();
                while (it.hasNext()) {
                    it.next().mo213419a(str);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m240402b(ap apVar) {
                C61576c.this.mo213364a(apVar.f152655a.mo216919e(), true);
                C61576c.this.mo213404b(apVar.f152655a);
                C61576c.this.mo213401a(ChatMoveDirection.MOVE_DOWN);
            }

            /* renamed from: a */
            public void onSuccess(ap apVar) {
                C60700b.m235851b("ChatControl", "[sendMessage]", "onSuccess");
                C60735ab.m236001a(new Runnable(apVar) {
                    /* class com.ss.android.vc.meeting.module.chat.$$Lambda$c$3$MTFdYUX5vEcGV3vCv4KAkkRM4y0 */
                    public final /* synthetic */ ap f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C61576c.C615793.this.m240402b(this.f$1);
                    }
                });
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                String str;
                C60700b.m235864f("ChatControl", "[sendMessage2]", "error=" + eVar.toString());
                if (eVar.mo219899a() != 235201 || VideoChatModuleDependency.getLarkAppDependency() == null) {
                    str = C60773o.m236119a((int) R.string.View_M_CouldNotSendMessage);
                } else {
                    str = UIHelper.mustacheFormat((int) R.string.View_M_SensitiveMessage, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b());
                }
                if (!C60742af.m236059a(C61576c.this.f154475b)) {
                    C60735ab.m236001a(new Runnable(str) {
                        /* class com.ss.android.vc.meeting.module.chat.$$Lambda$c$3$ocnu9JdFH1kKawVi_6TiVYSC9YY */
                        public final /* synthetic */ String f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C61576c.C615793.this.m240401a((C61576c.C615793) this.f$1);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: b */
    public void mo213404b(InteractionMessage aVar) {
        if (m240356c(aVar)) {
            InteractionMessage aVar2 = this.f154489q;
            if (aVar2 == null || aVar2.mo216919e() <= aVar.mo216919e()) {
                this.f154489q = aVar;
            }
            if (this.f154480h.contains(Integer.valueOf(aVar.mo216919e()))) {
                C60700b.m235861e("ChatControl", "[insertMessageList]", "already contains");
                return;
            }
            this.f154488p = false;
            this.f154481i.add(aVar);
            this.f154480h.add(Integer.valueOf(aVar.mo216919e()));
            m240357d(aVar);
        }
    }

    /* renamed from: a */
    public void mo213401a(ChatMoveDirection chatMoveDirection) {
        ChatMoveDirection chatMoveDirection2;
        if (!C60742af.m236059a(this.f154475b)) {
            C60700b.m235851b("ChatControl", "[updateMessageListByState]", "direction is" + chatMoveDirection.toString());
            Iterator<AbstractC61595i> it = this.f154475b.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC61595i next = it.next();
                if (m240358s()) {
                    ArrayList<InteractionMessage> q = mo213407q();
                    if (m240359t() || this.f154487o) {
                        chatMoveDirection2 = chatMoveDirection;
                    } else {
                        chatMoveDirection2 = ChatMoveDirection.MOVE_STOP;
                    }
                    next.mo213420a(q, chatMoveDirection2);
                }
                int i = this.f154476c - this.f154485m;
                if (chatMoveDirection == ChatMoveDirection.MOVE_DOWN) {
                    z = true;
                }
                next.mo213415a(i, z);
                next.mo213418a(mo213406p());
            }
            if (this.f154487o) {
                this.f154487o = false;
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.AbstractC61566a
    /* renamed from: a */
    public void mo213364a(int i, boolean z) {
        if (i > this.f154485m) {
            this.f154485m = i;
        }
        if (!C60742af.m236059a(this.f154475b)) {
            Iterator<AbstractC61595i> it = this.f154475b.iterator();
            while (it.hasNext()) {
                it.next().mo213415a(this.f154476c - this.f154485m, z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    public void a_(String str, String str2) {
        if (TextUtils.isEmpty(str) || "1".equals(str)) {
            C57744a.m224104a().putInt(this.f154474a.mo212055d(), mo213379h());
        } else {
            C57744a.m224104a().putInt(str, mo213379h());
        }
        C60700b.m235851b("ChatControl", "[onJoinEnd]", "onJoinEnd originId=" + str + ", dstId= " + str2 + ", mNewestPosition= " + this.f154485m);
        Iterator<AbstractC61595i> it = this.f154475b.iterator();
        while (it.hasNext()) {
            it.next().mo213414a();
        }
        this.f154476c = -1;
        mo213381j();
        m240361v();
        if (!TextUtils.isEmpty(str2)) {
            this.f154485m = C57744a.m224104a().getInt(str2, -1);
            C60700b.m235851b("ChatControl", "[onJoinEnd2]", "get mNewestPosition from dstId=" + str2 + " position= " + this.f154485m);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    /* renamed from: d */
    public void mo213205d(String str, String str2) {
        C60700b.m235851b("ChatControl", "[onLeaveEnd]", "originId=" + str + " dstId= " + str2);
        if (!TextUtils.isEmpty(str2) && !"1".equals(str2)) {
            C57744a.m224104a().putInt(str, mo213379h());
            C60700b.m235851b("ChatControl", "[onLeaveEnd2]", "put mNewestPosition= " + mo213379h() + " id= " + str);
        }
        Iterator<AbstractC61595i> it = this.f154475b.iterator();
        while (it.hasNext()) {
            it.next().mo213414a();
        }
        this.f154476c = -1;
        mo213381j();
        m240361v();
        if (TextUtils.isEmpty(str2) || "1".equals(str2)) {
            this.f154485m = C57744a.m224104a().getInt(this.f154474a.mo212055d(), -1);
            C60700b.m235851b("ChatControl", "[onLeaveEnd3]", "get mNewestPosition from dstId=" + str2 + " position= " + this.f154485m);
        }
    }

    /* renamed from: a */
    private void m240354a(int i, boolean z, int i2, boolean z2) {
        VCBreakoutRoomInfo k;
        String d = this.f154474a.mo212055d();
        if (this.f154474a.al().mo213182i() && (k = this.f154474a.al().mo213184k()) != null) {
            d = k.getBreakoutRoomId();
        }
        VcBizSender.m249160a(d, i, z, i2).mo219889a(new AbstractC63598b<ak>() {
            /* class com.ss.android.vc.meeting.module.chat.C61576c.C615804 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("ChatControl", "[pullPreviousInterationMessages2]", "error " + eVar.toString());
                if (!C60742af.m236059a(C61576c.this.f154475b)) {
                    Iterator<AbstractC61595i> it = C61576c.this.f154475b.iterator();
                    while (it.hasNext()) {
                        it.next().mo213425e();
                    }
                }
            }

            /* renamed from: a */
            public void onSuccess(ak akVar) {
                C60700b.m235851b("ChatControl", "[pullPreviousInterationMessages]", "success, size is " + akVar.f152649a.size());
                for (InteractionMessage aVar : akVar.f152649a) {
                    if (aVar != null) {
                        C61576c.this.mo213402a(aVar);
                    }
                }
                if (!C60742af.m236059a(C61576c.this.f154475b)) {
                    Iterator<AbstractC61595i> it = C61576c.this.f154475b.iterator();
                    while (it.hasNext()) {
                        it.next().mo213425e();
                    }
                    if (akVar.f152649a.size() > 0) {
                        ArrayList<InteractionMessage> q = C61576c.this.mo213407q();
                        Iterator<AbstractC61595i> it2 = C61576c.this.f154475b.iterator();
                        while (it2.hasNext()) {
                            it2.next().mo213420a(q, ChatMoveDirection.MOVE_STOP);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private void m240355b(int i, boolean z, int i2, boolean z2) {
        VCBreakoutRoomInfo k;
        String d = this.f154474a.mo212055d();
        if (this.f154474a.al().mo213182i() && (k = this.f154474a.al().mo213184k()) != null) {
            d = k.getBreakoutRoomId();
        }
        this.f154486n.mo216883a(d, i, false, i2, z2);
    }
}
