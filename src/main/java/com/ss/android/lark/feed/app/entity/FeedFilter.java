package com.ss.android.lark.feed.app.entity;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "toString", "", GrsBaseInfo.CountryCodeSource.UNKNOWN, "INBOX", "AT_ME", "UNREAD", "DELAYED", "DOC", "P2P_CHAT", "GROUP_CHAT", "BOT", "HELP_DESK", "TOPIC_GROUP", "DONE", "CRYPTO_CHAT", "MESSAGE", "MUTE", "GROUP", "TEAM", "SHORTCUTS", "BOX", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum FeedFilter {
    UNKNOWN(0),
    INBOX(1),
    AT_ME(2),
    UNREAD(3),
    DELAYED(4),
    DOC(5),
    P2P_CHAT(6),
    GROUP_CHAT(7),
    BOT(8),
    HELP_DESK(9),
    TOPIC_GROUP(10),
    DONE(11),
    CRYPTO_CHAT(12),
    MESSAGE(13),
    MUTE(14),
    GROUP(15),
    TEAM(16),
    SHORTCUTS(100),
    BOX(101);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedFilter.values().length];
            $EnumSwitchMapping$0 = iArr;
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
            iArr[FeedFilter.BOX.ordinal()] = 17;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/feed/app/entity/FeedFilter$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "value", "", "valueOf", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FeedFilter valueOf(int i) {
            return forNumber(i);
        }

        public final FeedFilter forNumber(int i) {
            if (i == 100) {
                return FeedFilter.SHORTCUTS;
            }
            if (i == 101) {
                return FeedFilter.BOX;
            }
            switch (i) {
                case 0:
                    return FeedFilter.UNKNOWN;
                case 1:
                    return FeedFilter.INBOX;
                case 2:
                    return FeedFilter.AT_ME;
                case 3:
                    return FeedFilter.UNREAD;
                case 4:
                    return FeedFilter.DELAYED;
                case 5:
                    return FeedFilter.DOC;
                case 6:
                    return FeedFilter.P2P_CHAT;
                case 7:
                    return FeedFilter.GROUP_CHAT;
                case 8:
                    return FeedFilter.BOT;
                case 9:
                    return FeedFilter.HELP_DESK;
                case 10:
                    return FeedFilter.TOPIC_GROUP;
                case 11:
                    return FeedFilter.DONE;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return FeedFilter.CRYPTO_CHAT;
                case 13:
                    return FeedFilter.MESSAGE;
                case 14:
                    return FeedFilter.MUTE;
                case 15:
                    return FeedFilter.GROUP;
                case 16:
                    return FeedFilter.TEAM;
                default:
                    return FeedFilter.UNKNOWN;
            }
        }
    }

    public final int getValue() {
        return this.value;
    }

    public String toString() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        int i2 = R.string.Lark_Legacy_UnknownErr;
        switch (i) {
            case 2:
                i2 = R.string.Lark_Feed_FilterAll;
                break;
            case 3:
                i2 = R.string.Lark_Feed_FilterMentions;
                break;
            case 4:
                i2 = R.string.Lark_Feed_FilterUnread;
                break;
            case 5:
                i2 = R.string.Lark_Feed_FilterMarkedForLater;
                break;
            case 6:
                i2 = R.string.Lark_Feed_FilterDocs;
                break;
            case 7:
                i2 = R.string.Lark_Feed_FilterPrivateChats;
                break;
            case 8:
                i2 = R.string.Lark_Feed_FilterGroupChats;
                break;
            case 9:
                i2 = R.string.Lark_Feed_FilterBots;
                break;
            case 10:
                i2 = R.string.Lark_Feed_FilterHelpDesk;
                break;
            case 11:
                i2 = R.string.Lark_Feed_FilterCircles;
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                i2 = R.string.Lark_Feed_FilterDone;
                break;
            case 13:
                i2 = R.string.Lark_Feed_FilterSecretChats;
                break;
            case 14:
                i2 = R.string.Lark_Feed_Messages;
                break;
            case 15:
                i2 = R.string.Lark_Feed_FilterMuted;
                break;
            case 16:
                i2 = R.string.Project_T_TeamMenuTab;
                break;
            case 17:
                i2 = R.string.Lark_Legacy_ChatBox;
                break;
        }
        String string = UIHelper.getString(i2);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(when …_Legacy_UnknownErr\n    })");
        return string;
    }

    private FeedFilter(int i) {
        this.value = i;
    }
}
