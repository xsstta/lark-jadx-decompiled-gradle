package com.ss.android.lark.chat.chatwindow.chat.p1612a;

import android.content.Context;
import com.bytedance.common.utility.Lists;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.larksuite.component.ui.tag.DefaultTagProvider;
import com.larksuite.component.ui.tag.ITagProvider;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.a.b */
public class C33085b {

    /* renamed from: a */
    private final Chat f85217a;

    /* renamed from: b */
    private final Chatter f85218b;

    /* renamed from: c */
    private AbstractC36474h f85219c;

    /* renamed from: d */
    private TopicGroup f85220d;

    /* renamed from: e */
    private ITagProvider f85221e = new DefaultTagProvider();

    /* renamed from: b */
    private boolean m127939b() {
        Chat chat = this.f85217a;
        if (chat == null || !chat.isOfflineOncall()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private boolean m127944g() {
        Chat chat = this.f85217a;
        if (chat == null || !chat.isSecret()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m127949l() {
        Chat chat = this.f85217a;
        if (chat == null || !chat.isPublic()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m127950m() {
        Chat chat = this.f85217a;
        if (chat == null || !chat.isSuper()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m127938a() {
        Chat chat = this.f85217a;
        if (chat == null || !chat.isCrossWithKa()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m127941d() {
        Chat chat = this.f85217a;
        if (chat == null || !chat.isOnCall() || this.f85217a.isOfficialOncall() || DesktopUtil.m144307b()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m127946i() {
        Chat chat = this.f85217a;
        if (chat == null || !chat.is_department() || !m127951n()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m127947j() {
        TopicGroup topicGroup;
        Chat chat;
        if ((!m127951n() || (chat = this.f85217a) == null || !chat.isTenant()) && ((topicGroup = this.f85220d) == null || topicGroup.getType() != TopicGroup.Type.DEFAULT)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private boolean m127951n() {
        AbstractC36474h hVar = this.f85219c;
        if (hVar == null || hVar.mo134515N() == null || this.f85219c.mo134515N().mo134399b()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m127952o() {
        Chatter chatter = this.f85218b;
        if (chatter == null || chatter.isDimission() || !this.f85218b.isFrozen()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m127940c() {
        Chatter chatter;
        Chat chat = this.f85217a;
        if (chat == null || !chat.isP2PChat() || (chatter = this.f85218b) == null || WorkStatus.isInvalid(chatter.getWorkStatus()) || this.f85218b.isFrozen()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m127942e() {
        Chatter chatter;
        AbstractC36474h hVar;
        Chat chat = this.f85217a;
        if (chat == null || chat.getType() != Chat.Type.P2P || (chatter = this.f85218b) == null || chatter.isBot() || DesktopUtil.m144307b() || (hVar = this.f85219c) == null || !hVar.mo134596x().mo134463a(this.f85218b.getZenModeEndTime())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m127943f() {
        Chatter chatter;
        Chat chat = this.f85217a;
        if (chat == null || chat.getType() != Chat.Type.P2P || DesktopUtil.m144307b() || (chatter = this.f85218b) == null || !chatter.isBot() || !this.f85218b.showBotTag()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m127945h() {
        Chat chat = this.f85217a;
        if (chat == null || (!chat.isOfficialOncall() && (Lists.isEmpty(this.f85217a.getTags()) || !this.f85217a.getTags().contains(Tag.OFFICIAL)))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private boolean m127948k() {
        AbstractC36474h hVar;
        if (this.f85217a == null || !m127951n() || !this.f85217a.isCrossTenant() || (hVar = this.f85219c) == null || hVar.mo134515N().mo134406i()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C33085b mo122240a(ITagProvider bVar) {
        this.f85221e = bVar;
        return this;
    }

    /* renamed from: a */
    public C33085b mo122241a(AbstractC36474h hVar) {
        this.f85219c = hVar;
        return this;
    }

    /* renamed from: a */
    public LarkNameTag.ChatTagBuilder mo122239a(Context context) {
        int i;
        int i2;
        LarkNameTag.ChatTagBuilder a = LarkNameTag.m92203a(context);
        if (m127940c()) {
            boolean g = m127944g();
            if (g) {
                i = R.color.lkui_N700;
            } else {
                i = R.color.udtoken_tag_text_s_red;
            }
            if (g) {
                i2 = 17170443;
            } else {
                i2 = R.color.udtoken_tag_bg_red;
            }
            a.mo89985b(TextTag.f62987a.mo90160a(new Function1(this.f85218b.getWorkStatus().getDisplayTextNoDuration(context), i, i2) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1612a.$$Lambda$b$o5FktsWd0A3pGdUbBjrL3Ha2Mc */
                public final /* synthetic */ String f$0;
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C33085b.m270347lambda$o5FktsWd0A3pGdUbBjrL3Ha2Mc(this.f$0, this.f$1, this.f$2, (TextTag.Builder) obj);
                }
            }), true);
        }
        a.mo90032a(m127941d(), m127939b());
        a.mo90035f(m127944g());
        a.mo90042m(m127942e());
        a.mo90036g(m127943f());
        a.mo90038i(m127946i());
        a.mo90040k(m127947j());
        a.mo90037h(m127948k());
        a.mo90041l(m127949l());
        a.mo90043n(m127952o());
        a.mo90025d(m127938a());
        a.mo90033b(m127945h());
        a.mo90039j(m127950m());
        a.mo90012b(this.f85221e);
        return a;
    }

    /* renamed from: a */
    public static C33085b m127936a(Chat chat, Chatter chatter) {
        return new C33085b(chat, chatter);
    }

    private C33085b(Chat chat, Chatter chatter) {
        this.f85217a = chat;
        this.f85218b = chatter;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m127937a(String str, int i, int i2, TextTag.Builder aVar) {
        aVar.mo90136a(str);
        aVar.mo90145d(i);
        aVar.mo90147e(i2);
        return null;
    }
}
