package com.ss.android.lark.feed.app.team.entity;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.IBadgeable;
import com.ss.android.lark.team.entity.Item;

/* renamed from: com.ss.android.lark.feed.app.team.entity.d */
public class C37874d implements IBadgeable {

    /* renamed from: a */
    private String f97131a;

    /* renamed from: b */
    private String f97132b;

    /* renamed from: c */
    private Chat.ChatMode f97133c;

    /* renamed from: d */
    private FeedPreview.AtInfo f97134d;

    /* renamed from: e */
    private int f97135e;

    /* renamed from: f */
    private int f97136f;

    /* renamed from: g */
    private boolean f97137g;

    /* renamed from: h */
    private FeedCard.Type f97138h;

    /* renamed from: i */
    private long f97139i;

    /* renamed from: j */
    private boolean f97140j;

    /* renamed from: k */
    private Item f97141k;

    /* renamed from: l */
    private TeamChatType f97142l;

    /* renamed from: b */
    public String mo138742b() {
        return this.f97131a;
    }

    /* renamed from: c */
    public String mo138746c() {
        return this.f97132b;
    }

    /* renamed from: d */
    public Chat.ChatMode mo138747d() {
        return this.f97133c;
    }

    /* renamed from: e */
    public FeedPreview.AtInfo mo138748e() {
        return this.f97134d;
    }

    /* renamed from: f */
    public FeedCard.Type mo138749f() {
        return this.f97138h;
    }

    /* renamed from: g */
    public long mo138750g() {
        return this.f97139i;
    }

    @Override // com.ss.android.lark.feed.app.entity.IBadgeable
    public int getBadgeCount() {
        return this.f97136f;
    }

    /* renamed from: h */
    public boolean mo138751h() {
        return this.f97140j;
    }

    @Override // com.ss.android.lark.feed.app.entity.IBadgeable
    public boolean isRemind() {
        return this.f97137g;
    }

    /* renamed from: k */
    public Item mo138754k() {
        return this.f97141k;
    }

    /* renamed from: l */
    public TeamChatType mo138755l() {
        return this.f97142l;
    }

    /* renamed from: a */
    public boolean mo138741a(FeedPreview.MarkType markType) {
        return (markType.getNumber() & this.f97135e) != 0;
    }

    /* renamed from: i */
    public String mo138752i() {
        return this.f97141k.getNameWeight();
    }

    /* renamed from: j */
    public boolean mo138753j() {
        return this.f97141k.isHidden();
    }

    /* renamed from: a */
    public boolean mo138740a() {
        if (mo138741a(FeedPreview.MarkType.AT_ALL) || mo138741a(FeedPreview.MarkType.AT_USER)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo138731a(int i) {
        this.f97136f = i;
    }

    /* renamed from: a */
    public void mo138732a(long j) {
        this.f97139i = j;
    }

    /* renamed from: b */
    public void mo138743b(int i) {
        this.f97135e = i;
    }

    /* renamed from: a */
    public void mo138733a(FeedCard.Type type) {
        this.f97138h = type;
    }

    /* renamed from: b */
    public void mo138744b(String str) {
        this.f97132b = str;
    }

    /* renamed from: a */
    public void mo138734a(Chat.ChatMode chatMode) {
        this.f97133c = chatMode;
    }

    /* renamed from: b */
    public void mo138745b(boolean z) {
        this.f97140j = z;
    }

    /* renamed from: a */
    public void mo138735a(TeamChatType teamChatType) {
        this.f97142l = teamChatType;
    }

    /* renamed from: a */
    public void mo138736a(FeedPreview.AtInfo atInfo) {
        this.f97134d = atInfo;
    }

    /* renamed from: a */
    public void mo138737a(Item item) {
        this.f97141k = item;
    }

    /* renamed from: a */
    public void mo138738a(String str) {
        this.f97131a = str;
    }

    /* renamed from: a */
    public void mo138739a(boolean z) {
        this.f97137g = z;
    }
}
