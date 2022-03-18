package com.ss.android.lark.search.widget.reporter;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/widget/reporter/PickerReporterConstants;", "", "()V", "KEY", "VALUE", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.widget.d.b */
public final class PickerReporterConstants {

    /* renamed from: a */
    public static final PickerReporterConstants f133097a = new PickerReporterConstants();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/search/widget/reporter/PickerReporterConstants$VALUE;", "", "()V", "CLICK", "SCENE", "TYPE", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.d.b$a */
    public static final class VALUE {

        /* renamed from: a */
        public static final VALUE f133098a = new VALUE();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/search/widget/reporter/PickerReporterConstants$VALUE$TYPE;", "", "()V", "BOT", "", "CRYPTO_GROUP", "DEPARTMENT", "DOC", "GROUP", "MAIL_MEMBER", "MEMBER", "TOPIC", "WIKI", "group", "mailMember", "member", "toType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.widget.d.b$a$a */
        public static final class TYPE {

            /* renamed from: a */
            public static final TYPE f133099a = new TYPE();

            /* renamed from: a */
            public final String mo183769a() {
                return "member";
            }

            /* renamed from: b */
            public final String mo183771b() {
                return "group";
            }

            /* renamed from: c */
            public final String mo183772c() {
                return "email_member";
            }

            private TYPE() {
            }

            /* renamed from: a */
            public final String mo183770a(SearchBaseInfo searchBaseInfo) {
                Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (searchBaseInfo instanceof SearchChatInfo) {
                    if (((SearchChatInfo) searchBaseInfo).isSecretChat()) {
                        return "crypto_group";
                    }
                    return "group";
                } else if (searchBaseInfo instanceof SearchChatterInfo) {
                    SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
                    if (searchChatterInfo.isP2pCryptoChat()) {
                        return "crypto_group";
                    }
                    if (searchChatterInfo.getChatterType() == Chatter.ChatterType.BOT) {
                        return "bot";
                    }
                    return "member";
                } else if (searchBaseInfo instanceof SearchThreadInfo) {
                    return ChatTypeStateKeeper.f135670e;
                } else {
                    if (searchBaseInfo instanceof SearchSpaceInfo) {
                        return "doc";
                    }
                    if (searchBaseInfo instanceof SearchWikiInfo) {
                        return "wiki";
                    }
                    if (searchBaseInfo instanceof SearchDepartmentInfo) {
                        return "department";
                    }
                    if (searchBaseInfo instanceof SearchMailContactInfo) {
                        return "email_member";
                    }
                    return "";
                }
            }
        }

        private VALUE() {
        }
    }

    private PickerReporterConstants() {
    }
}
