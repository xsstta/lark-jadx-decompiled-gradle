package com.ss.android.lark.setting.page.content.general.feedfilter.dto;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.dto.a */
public final /* synthetic */ class C54520a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f134777a;

    static {
        int[] iArr = new int[FeedFilter.values().length];
        f134777a = iArr;
        iArr[FeedFilter.UNKNOWN.ordinal()] = 1;
        iArr[FeedFilter.INBOX.ordinal()] = 2;
        iArr[FeedFilter.AT_ME.ordinal()] = 3;
        iArr[FeedFilter.UNREAD.ordinal()] = 4;
        iArr[FeedFilter.DELAYED.ordinal()] = 5;
        iArr[FeedFilter.DOC.ordinal()] = 6;
        iArr[FeedFilter.P2P_CHAT.ordinal()] = 7;
        iArr[FeedFilter.GROUP_CHAT.ordinal()] = 8;
        iArr[FeedFilter.BOT.ordinal()] = 9;
        iArr[FeedFilter.HELP_DESK.ordinal()] = 10;
        iArr[FeedFilter.TOPIC_GROUP.ordinal()] = 11;
        iArr[FeedFilter.DONE.ordinal()] = 12;
        iArr[FeedFilter.CRYPTO_CHAT.ordinal()] = 13;
        iArr[FeedFilter.MESSAGE.ordinal()] = 14;
        iArr[FeedFilter.MUTE.ordinal()] = 15;
        iArr[FeedFilter.TEAM.ordinal()] = 16;
    }
}
