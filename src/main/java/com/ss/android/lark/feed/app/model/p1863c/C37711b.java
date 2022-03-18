package com.ss.android.lark.feed.app.model.p1863c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.common.utility.Lists;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.LittleAppFeedPreview;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.log.Log;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.feed.app.model.c.b */
public class C37711b implements C37030f.AbstractC37033c, AbstractC38037a.AbstractC38059s {

    /* renamed from: a */
    private static C37711b f96667a;

    /* renamed from: b */
    private final Map<Integer, Drawable> f96668b = new ConcurrentHashMap();

    /* renamed from: c */
    private void m148270c() {
        Map<Integer, Drawable> map = this.f96668b;
        if (map != null) {
            map.clear();
        }
    }

    /* renamed from: b */
    public void mo138228b() {
        Log.m165379d("FeedTagHelper", "destroy");
        m148270c();
    }

    /* renamed from: a */
    public static C37711b m148269a() {
        if (f96667a == null) {
            synchronized (C37711b.class) {
                if (f96667a == null) {
                    f96667a = new C37711b();
                }
            }
        }
        return f96667a;
    }

    public C37711b() {
        C37262a.m146726a().mo139203v().mo139295a((C37030f.AbstractC37033c) this);
        C37262a.m146726a().mo139203v().mo139296a((AbstractC38037a.AbstractC38059s) this);
    }

    /* renamed from: a */
    public Drawable mo138226a(LarkNameTag dVar) {
        boolean z;
        if (dVar == null) {
            return null;
        }
        Drawable drawable = this.f96668b.get(Integer.valueOf(dVar.hashCode()));
        StringBuilder sb = new StringBuilder();
        sb.append("getTagCache:");
        sb.append(dVar.hashCode());
        sb.append("/");
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        Log.m165379d("FeedTagHelper", sb.toString());
        return drawable;
    }

    @Override // com.ss.android.lark.C37030f.AbstractC37033c
    /* renamed from: a */
    public void mo134316a(int i) {
        m148270c();
        Log.m165379d("FeedTagHelper", "onNightModeChanged:" + i);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38059s
    /* renamed from: a */
    public void mo137914a(Locale locale, Locale locale2) {
        m148270c();
        Log.m165379d("FeedTagHelper", "onLanguageChange");
    }

    /* renamed from: a */
    public static LarkNameTag m148267a(Context context, DocFeedPreview docFeedPreview) {
        return LarkNameTag.m92208d(context).mo90020a(docFeedPreview.isCustomer(), docFeedPreview.isCrossTenant(), C37268c.m146766b().mo139200s().mo139325d()).mo90027e();
    }

    /* renamed from: a */
    public static LarkNameTag m148268a(Context context, LittleAppFeedPreview littleAppFeedPreview) {
        return LarkNameTag.m92207c(context).mo90011b(false).mo90010a(true).mo90021b((float) LKUIDisplayManager.m91881c(context, 18)).mo90014a(LKUIDisplayManager.m91864a(context, 12)).mo90027e();
    }

    /* renamed from: a */
    public static LarkNameTag m148266a(Context context, ChatFeedPreview chatFeedPreview) {
        boolean z;
        LarkNameTag.ChatTagBuilder l = LarkNameTag.m92203a(context).mo90038i(chatFeedPreview.isDepartment()).mo90039j(chatFeedPreview.isSuper()).mo90040k(chatFeedPreview.isTenantChat()).mo90041l(chatFeedPreview.isPublic());
        boolean z2 = true;
        if (chatFeedPreview.getChatType() != Chat.Type.P2P || chatFeedPreview.isBotChat() || !C37268c.m146766b().mo139203v().mo139297a(chatFeedPreview.getZenModeEndTime())) {
            z = false;
        } else {
            z = true;
        }
        LarkNameTag.ChatTagBuilder a = l.mo90042m(z).mo90035f(chatFeedPreview.isSecret()).mo90036g(chatFeedPreview.isShowBotTag()).mo90034e(chatFeedPreview.isMeeting()).mo90032a(chatFeedPreview.isShowOnCallTag(), chatFeedPreview.isOfflineOncall());
        if (!chatFeedPreview.isOfficialOncall() && (Lists.isEmpty(chatFeedPreview.getTags()) || !chatFeedPreview.getTags().contains(Tag.OFFICIAL))) {
            z2 = false;
        }
        LarkNameTag.Builder b = a.mo90033b(z2).mo90020a(chatFeedPreview.isCustomer(), chatFeedPreview.isCrossTenant(), chatFeedPreview.isSimpleTenant()).mo90014a(LKUIDisplayManager.m91864a(context, 12)).mo90021b((float) LKUIDisplayManager.m91881c(context, 18));
        if (chatFeedPreview.isEdu()) {
            TagInfo.apply(b, TagInfo.getFactory().mo124879a(context));
            b.mo90020a(chatFeedPreview.isCustomer(), false, chatFeedPreview.isSimpleTenant());
        }
        if (chatFeedPreview.isCrossWithKa()) {
            TagInfo.apply(b, TagInfo.getFactory().mo124881c(context));
            b.mo90020a(chatFeedPreview.isCustomer(), false, chatFeedPreview.isSimpleTenant());
        }
        return b.mo90027e();
    }

    /* renamed from: a */
    public void mo138227a(LarkNameTag dVar, Drawable drawable) {
        boolean z;
        if (dVar != null && drawable != null) {
            this.f96668b.put(Integer.valueOf(dVar.hashCode()), drawable);
            StringBuilder sb = new StringBuilder();
            sb.append("setTagCache:");
            sb.append(dVar.hashCode());
            sb.append("/");
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            Log.m165379d("FeedTagHelper", sb.toString());
        }
    }
}
