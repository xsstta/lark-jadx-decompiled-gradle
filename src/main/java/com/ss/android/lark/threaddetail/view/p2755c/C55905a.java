package com.ss.android.lark.threaddetail.view.p2755c;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.lark.threaddetail.view.c.a */
public class C55905a implements AbstractC26248b<C55905a> {

    /* renamed from: a */
    private MessageInfo f138100a;

    /* renamed from: b */
    private boolean f138101b;

    /* renamed from: c */
    private CharSequence f138102c;

    /* renamed from: d */
    private ChatChatter f138103d;

    /* renamed from: e */
    private long f138104e;

    /* renamed from: f */
    private SendStatus f138105f;

    /* renamed from: g */
    private boolean f138106g;

    /* renamed from: h */
    private String f138107h;

    /* renamed from: i */
    private Message f138108i;

    /* renamed from: j */
    private boolean f138109j;

    /* renamed from: k */
    private boolean f138110k;

    /* renamed from: l */
    private int f138111l;

    /* renamed from: m */
    private boolean f138112m;

    /* renamed from: n */
    private String f138113n;

    /* renamed from: o */
    private boolean f138114o;

    /* renamed from: p */
    private int f138115p;

    /* renamed from: q */
    private String f138116q;

    /* renamed from: r */
    private boolean f138117r;

    /* renamed from: s */
    private boolean f138118s;

    /* renamed from: t */
    private ChatChatter f138119t;

    /* renamed from: u */
    private boolean f138120u;

    /* renamed from: v */
    private boolean f138121v;

    /* renamed from: w */
    private double f138122w;

    /* renamed from: x */
    private boolean f138123x;

    /* renamed from: y */
    private List<String> f138124y = new ArrayList();

    /* renamed from: z */
    private boolean f138125z;

    /* renamed from: B */
    public boolean mo190571B() {
        return this.f138120u;
    }

    /* renamed from: C */
    public List<String> mo190572C() {
        return this.f138124y;
    }

    /* renamed from: e */
    public CharSequence mo190596e() {
        return this.f138102c;
    }

    /* renamed from: f */
    public MessageInfo mo190598f() {
        return this.f138100a;
    }

    /* renamed from: h */
    public ChatChatter mo190602h() {
        return this.f138103d;
    }

    /* renamed from: i */
    public long mo190604i() {
        return this.f138104e;
    }

    /* renamed from: j */
    public SendStatus mo190606j() {
        return this.f138105f;
    }

    /* renamed from: k */
    public String mo190608k() {
        return this.f138107h;
    }

    /* renamed from: l */
    public Message mo190610l() {
        return this.f138108i;
    }

    /* renamed from: m */
    public boolean mo190612m() {
        return this.f138121v;
    }

    /* renamed from: n */
    public double mo190613n() {
        return this.f138122w;
    }

    /* renamed from: o */
    public boolean mo190614o() {
        return this.f138123x;
    }

    /* renamed from: p */
    public int mo190615p() {
        return this.f138111l;
    }

    /* renamed from: q */
    public boolean mo190616q() {
        return this.f138112m;
    }

    /* renamed from: r */
    public String mo190617r() {
        return this.f138113n;
    }

    /* renamed from: s */
    public boolean mo190618s() {
        return this.f138114o;
    }

    /* renamed from: t */
    public int mo190619t() {
        return this.f138115p;
    }

    /* renamed from: u */
    public String mo190620u() {
        return this.f138116q;
    }

    /* renamed from: v */
    public boolean mo190621v() {
        return this.f138117r;
    }

    /* renamed from: w */
    public boolean mo190622w() {
        return this.f138118s;
    }

    /* renamed from: x */
    public ChatChatter mo190623x() {
        return this.f138119t;
    }

    /* renamed from: a */
    public boolean mo190584a() {
        return this.f138125z;
    }

    /* renamed from: a */
    public void mo190583a(boolean z) {
        this.f138125z = z;
    }

    /* renamed from: a */
    public void mo190581a(String str) {
        this.f138107h = str;
    }

    /* renamed from: a */
    public boolean isItemSame(C55905a aVar) {
        if (this == aVar) {
            return true;
        }
        if (mo190589b() && aVar.mo190589b()) {
            return true;
        }
        if (mo190593c() && aVar.mo190593c()) {
            return true;
        }
        if (mo190610l() == null && aVar.mo190610l() == null) {
            return true;
        }
        if (mo190610l() == null || aVar.mo190610l() == null) {
            return false;
        }
        return mo190610l().isItemSame(aVar.mo190610l());
    }

    /* renamed from: a */
    public void mo190582a(List<String> list) {
        this.f138124y = list;
    }

    /* renamed from: d */
    public boolean mo190595d() {
        return this.f138106g;
    }

    /* renamed from: g */
    public boolean mo190601g() {
        return this.f138101b;
    }

    /* renamed from: c */
    public boolean mo190593c() {
        return this.f138110k;
    }

    /* renamed from: A */
    public boolean mo190570A() {
        Message l = mo190610l();
        if (l.isPreMessage() || l.getStatus() == Message.Status.DELETED || l.getType() == Message.Type.SYSTEM || l.getType() == Message.Type.RED_PACKET) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo190589b() {
        return this.f138109j;
    }

    /* renamed from: z */
    public boolean mo190625z() {
        Message l = mo190610l();
        Message.Type type = l.getType();
        if (l.isPreMessage() || l.getStatus() == Message.Status.DELETED || (type != Message.Type.TEXT && type != Message.Type.POST && type != Message.Type.FILE && type != Message.Type.IMAGE && type != Message.Type.STICKER && type != Message.Type.AUDIO && type != Message.Type.MEDIA && type != Message.Type.LOCATION && type != Message.Type.FOLDER)) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public boolean mo190624y() {
        Message l = mo190610l();
        Message.Type type = l.getType();
        if (l.isPreMessage() || l.getStatus() == Message.Status.DELETED || (type != Message.Type.TEXT && type != Message.Type.POST && type != Message.Type.FILE && type != Message.Type.IMAGE && type != Message.Type.STICKER && type != Message.Type.MEDIA && type != Message.Type.AUDIO && type != Message.Type.SHARE_GROUP_CHAT && type != Message.Type.LOCATION && type != Message.Type.FOLDER)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m217088b(ChatChatter chatChatter) {
        this.f138103d = chatChatter;
    }

    /* renamed from: a */
    public void mo190573a(double d) {
        this.f138122w = d;
    }

    /* renamed from: c */
    public void mo190591c(String str) {
        this.f138116q = str;
    }

    /* renamed from: d */
    public void mo190594d(boolean z) {
        this.f138106g = z;
    }

    /* renamed from: g */
    public void mo190600g(boolean z) {
        this.f138123x = z;
    }

    /* renamed from: a */
    public void mo190574a(int i) {
        this.f138111l = i;
    }

    /* renamed from: b */
    public void mo190586b(int i) {
        this.f138115p = i;
    }

    /* renamed from: c */
    public void mo190592c(boolean z) {
        this.f138110k = z;
    }

    /* renamed from: e */
    public void mo190597e(boolean z) {
        this.f138101b = z;
    }

    /* renamed from: f */
    public void mo190599f(boolean z) {
        this.f138121v = z;
    }

    /* renamed from: h */
    public void mo190603h(boolean z) {
        this.f138112m = z;
    }

    /* renamed from: i */
    public void mo190605i(boolean z) {
        this.f138114o = z;
    }

    /* renamed from: j */
    public void mo190607j(boolean z) {
        this.f138117r = z;
    }

    /* renamed from: k */
    public void mo190609k(boolean z) {
        this.f138118s = z;
    }

    /* renamed from: l */
    public void mo190611l(boolean z) {
        this.f138120u = z;
    }

    /* renamed from: a */
    public void mo190575a(long j) {
        this.f138104e = j;
    }

    /* renamed from: b */
    public void mo190587b(String str) {
        this.f138113n = str;
    }

    /* renamed from: a */
    public void mo190576a(ChatChatter chatChatter) {
        this.f138119t = chatChatter;
    }

    /* renamed from: b */
    public void mo190588b(boolean z) {
        this.f138109j = z;
    }

    /* renamed from: a */
    public void mo190577a(Message message) {
        this.f138108i = message;
    }

    /* renamed from: a */
    public void mo190578a(MessageInfo messageInfo) {
        this.f138100a = messageInfo;
    }

    /* renamed from: b */
    public boolean isContentSame(C55905a aVar) {
        if ((aVar.mo190614o() && aVar.mo190614o() && (this.f138111l != aVar.f138111l || this.f138112m != aVar.f138112m)) || this.f138105f != aVar.f138105f || this.f138117r != aVar.f138117r || this.f138120u != aVar.f138120u || this.f138121v != aVar.f138121v || this.f138122w != aVar.f138122w || this.f138123x != aVar.f138123x || !C26247a.m94981a((Object) this.f138124y, (Object) aVar.mo190572C())) {
            return false;
        }
        MessageInfo messageInfo = this.f138100a;
        if (messageInfo != null && aVar.f138100a != null && !Objects.equals(messageInfo.getMessage().getContent(), aVar.f138100a.getMessage().getContent())) {
            return false;
        }
        MessageInfo messageInfo2 = this.f138100a;
        if (messageInfo2 != null && aVar.f138100a != null && (messageInfo2.isTranslating() != aVar.f138100a.isTranslating() || !Objects.equals(this.f138100a.getTranslateInfo(), aVar.f138100a.getTranslateInfo()) || this.f138100a.getMessage().getTranslateDisplayRule() != aVar.f138100a.getMessage().getTranslateDisplayRule())) {
            return false;
        }
        if (aVar == this || C26247a.m94983b(mo190598f(), aVar.f138100a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo190579a(SendStatus sendStatus) {
        this.f138105f = sendStatus;
    }

    /* renamed from: a */
    public void mo190580a(CharSequence charSequence) {
        this.f138102c = charSequence;
    }

    /* renamed from: a */
    public static C55905a m217087a(C55905a aVar, int i) {
        C55905a aVar2 = new C55905a();
        aVar2.mo190578a(aVar.mo190598f());
        aVar2.mo190583a(aVar.mo190584a());
        aVar2.mo190597e(aVar.mo190601g());
        aVar2.mo190580a(aVar.mo190596e());
        aVar2.mo190594d(aVar.mo190595d());
        aVar2.m217088b(aVar.mo190602h());
        aVar2.mo190575a(aVar.mo190604i());
        aVar2.mo190579a(aVar.mo190606j());
        aVar2.mo190581a(aVar.mo190608k());
        aVar2.mo190577a(aVar.mo190610l());
        aVar2.mo190574a(i);
        aVar2.mo190603h(aVar.mo190616q());
        aVar2.mo190587b(aVar.mo190617r());
        aVar2.mo190586b(aVar.mo190619t());
        aVar2.mo190591c(aVar.mo190620u());
        aVar2.mo190607j(aVar.mo190621v());
        aVar2.mo190609k(aVar.mo190622w());
        aVar2.mo190576a(aVar.mo190623x());
        aVar2.mo190611l(aVar.mo190571B());
        aVar2.mo190582a(aVar.mo190572C());
        aVar2.mo190573a(aVar.mo190613n());
        aVar2.mo190599f(aVar.mo190612m());
        aVar2.mo190600g(aVar.mo190614o());
        return aVar2;
    }

    /* renamed from: a */
    public static C55905a m217086a(MessageInfo messageInfo, String str, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        C55905a aVar = new C55905a();
        aVar.mo190578a(messageInfo);
        aVar.mo190583a(messageInfo.isForceUpdate());
        boolean z6 = true;
        if (messageInfo.getMessage().getThreadPosition() >= 0 || messageInfo.getMessage().isPreMessage()) {
            z3 = false;
        } else {
            z3 = true;
        }
        aVar.mo190597e(z3);
        Content content = messageInfo.getMessage().getContent();
        if (content instanceof PostContent) {
            aVar.mo190580a((CharSequence) ((PostContent) content).getTitleWithFilter(C29990c.m110930b().mo134528a()));
        } else {
            aVar.mo190580a((CharSequence) "");
        }
        Message message = messageInfo.getMessage();
        if (message.getType() == Message.Type.SYSTEM) {
            z4 = true;
        } else {
            z4 = false;
        }
        aVar.mo190594d(z4);
        aVar.m217088b(messageInfo.getMessageSender());
        aVar.mo190575a(message.getCreateTime());
        aVar.mo190579a(message.getSendStatus());
        aVar.mo190581a(message.getId());
        aVar.mo190577a(message);
        if (message.getStatus() == Message.Status.DELETED) {
            z5 = true;
        } else {
            z5 = false;
        }
        aVar.mo190603h(z5);
        aVar.mo190587b(message.getcId());
        aVar.mo190591c(str);
        aVar.mo190607j(message.isReEditable());
        if (!message.isFromMe() && !z2) {
            z6 = false;
        }
        aVar.mo190609k(z6);
        aVar.mo190576a(messageInfo.getRecallUser());
        aVar.mo190611l(z);
        aVar.mo190582a(message.getReadAtChatterIds());
        return aVar;
    }
}
