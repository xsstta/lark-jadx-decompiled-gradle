package com.ss.android.lark.feed.service.impl;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.lark.pb.basic.v1.Icon;
import com.bytedance.lark.pb.feed.v1.BoxData;
import com.bytedance.lark.pb.feed.v1.ChatData;
import com.bytedance.lark.pb.feed.v1.Cursor;
import com.bytedance.lark.pb.feed.v1.DocData;
import com.bytedance.lark.pb.feed.v1.FeedCardPushInfo;
import com.bytedance.lark.pb.feed.v1.FeedCursor;
import com.bytedance.lark.pb.feed.v1.FeedEntityPreview;
import com.bytedance.lark.pb.feed.v1.FeedFilterInfo;
import com.bytedance.lark.pb.feed.v1.FeedFilterList;
import com.bytedance.lark.pb.feed.v1.HighPriorityDisplay;
import com.bytedance.lark.pb.feed.v1.OpenAppData;
import com.bytedance.lark.pb.feed.v1.SubscriptionsData;
import com.bytedance.lark.pb.feed.v1.ThreadData;
import com.larksuite.framework.utils.C26249aa;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.FocusInfo;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.doc.entity.DocMessage;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.dto.C38081a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.feed.service.impl.h */
public class C38159h {
    /* renamed from: c */
    public static List<FeedFilter> m150028c(List<com.bytedance.lark.pb.feed.v1.FeedFilter> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.feed.v1.FeedFilter, FeedFilter>() {
            /* class com.ss.android.lark.feed.service.impl.C38159h.C381612 */

            /* renamed from: a */
            public FeedFilter get(com.bytedance.lark.pb.feed.v1.FeedFilter feedFilter) {
                return FeedFilter.Companion.valueOf(feedFilter.filter_type.getValue());
            }
        });
    }

    /* renamed from: d */
    public static List<C38081a> m150030d(List<FeedFilterInfo> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<FeedFilterInfo, C38081a>() {
            /* class com.ss.android.lark.feed.service.impl.C38159h.C381623 */

            /* renamed from: a */
            public C38081a get(FeedFilterInfo feedFilterInfo) {
                return new C38081a(FeedFilter.Companion.valueOf(feedFilterInfo.type.filter_type.getValue()), feedFilterInfo.unread_count.intValue(), feedFilterInfo.mute_unread_count.intValue());
            }
        });
    }

    /* renamed from: a */
    public static FeedCursor m150023a(FeedCursor feedCursor) {
        if (feedCursor != null) {
            return new FeedCursor(feedCursor.rank_time.longValue(), feedCursor.id.longValue());
        }
        return null;
    }

    /* renamed from: c */
    public static Map<String, List<FeedFilter>> m150029c(Map<String, FeedFilterList> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<FeedFilterList, List<FeedFilter>>() {
            /* class com.ss.android.lark.feed.service.impl.C38159h.C381601 */

            /* renamed from: a */
            public List<FeedFilter> get(FeedFilterList feedFilterList) {
                return C38159h.m150028c(feedFilterList.type);
            }
        });
    }

    /* renamed from: a */
    public static List<FeedPreviewInfo> m150024a(List<FeedEntityPreview> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (FeedEntityPreview feedEntityPreview : list) {
            FeedPreviewInfo a = m150022a(feedEntityPreview);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<C38126b> m150027b(List<Cursor> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Cursor cursor : list) {
            arrayList.add(new C38126b(cursor.min_cursor.longValue(), cursor.max_cursor.longValue()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<FeedPreviewInfo> m150025a(Map<String, FeedEntityPreview> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (FeedEntityPreview feedEntityPreview : map.values()) {
            FeedPreviewInfo a = m150022a(feedEntityPreview);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Pair<List<FeedPreviewInfo>, Map<String, List<FeedFilter>>> m150026b(Map<String, FeedCardPushInfo> map) {
        FeedPreviewInfo a;
        ArrayList arrayList = new ArrayList(map.size());
        HashMap hashMap = new HashMap();
        for (FeedCardPushInfo feedCardPushInfo : map.values()) {
            if (!(feedCardPushInfo == null || (a = m150022a(feedCardPushInfo.preview)) == null)) {
                arrayList.add(a);
                hashMap.put(a.mo106098p(), C38127c.m149944a(feedCardPushInfo.list));
            }
        }
        return Pair.create(arrayList, hashMap);
    }

    /* renamed from: a */
    public static FeedPreviewInfo m150022a(FeedEntityPreview feedEntityPreview) {
        TeamChatType teamChatType;
        long j;
        if (feedEntityPreview == null) {
            return null;
        }
        FeedPreviewInfo feedPreviewInfo = new FeedPreviewInfo();
        feedPreviewInfo.mo106060d(feedEntityPreview.feed_id);
        feedPreviewInfo.mo106006a(FeedCard.FeedType.forNumber(feedEntityPreview.feed_type.getValue()));
        feedPreviewInfo.mo106078i(feedEntityPreview.is_delayed.booleanValue());
        feedPreviewInfo.mo106053c(feedEntityPreview.update_time.longValue());
        feedPreviewInfo.mo106075h(feedEntityPreview.parent_card_id);
        if (feedEntityPreview.chat_data != null) {
            ChatData chatData = feedEntityPreview.chat_data;
            feedPreviewInfo.mo106007a(FeedCard.Type.CHAT);
            feedPreviewInfo.mo106069f(chatData.name);
            String str = chatData.avatar_key;
            Icon icon = chatData.icon;
            if (icon != null && !TextUtils.isEmpty(icon.value) && icon.type == Icon.Type.IMAGE) {
                str = icon.value;
            }
            feedPreviewInfo.mo106064e(str);
            if (chatData.focus_info != null) {
                feedPreviewInfo.mo106013a(new FocusInfo(chatData.focus_info.message_id.longValue()));
            }
            if (chatData.display != null) {
                HighPriorityDisplay highPriorityDisplay = chatData.display;
                String str2 = highPriorityDisplay.content;
                long j2 = 0;
                if (highPriorityDisplay.rank_time != null) {
                    j = TimeUnit.SECONDS.toMillis(highPriorityDisplay.rank_time.longValue());
                } else {
                    j = 0;
                }
                Long valueOf = Long.valueOf(j);
                if (highPriorityDisplay.display_time != null) {
                    j2 = TimeUnit.SECONDS.toMillis(highPriorityDisplay.display_time.longValue());
                }
                feedPreviewInfo.mo106014a(new com.ss.android.lark.biz.im.api.HighPriorityDisplay(str2, valueOf, Long.valueOf(j2)));
            }
            feedPreviewInfo.mo106059d((long) chatData.unread_count.intValue());
            feedPreviewInfo.mo106062d(chatData.is_remind.booleanValue());
            feedPreviewInfo.mo106066e(chatData.is_shortcut.booleanValue());
            feedPreviewInfo.mo106012a(C38127c.m149941a(chatData.draft_preview));
            feedPreviewInfo.mo106008a(C38127c.m149940a(chatData.at_info));
            feedPreviewInfo.mo106049b(C38127c.m149945a(chatData.at_infos));
            feedPreviewInfo.mo106004a(chatData.at_infos_count.intValue());
            feedPreviewInfo.mo106015a(C38127c.m149942a(chatData.urgent_info));
            feedPreviewInfo.mo106071g(chatData.localized_digest_message);
            feedPreviewInfo.mo106010a(FeedPreviewInfo.EntityStatus.getSource(chatData.entity_status.getValue()));
            feedPreviewInfo.mo106005a(chatData.display_time.longValue());
            feedPreviewInfo.mo106047b(chatData.rank_time.longValue());
            feedPreviewInfo.mo106082j(chatData.cross_tenant.booleanValue());
            feedPreviewInfo.mo106055c(C38163i.m150036a(chatData.reactions));
            feedPreviewInfo.mo106063e(chatData.do_not_disturb_end_time.longValue());
            feedPreviewInfo.mo106093n(chatData.mini_avatar_key);
            feedPreviewInfo.mo106017a(Chat.Type.forNumber(chatData.chat_type.getValue()));
            feedPreviewInfo.mo106019a(Chatter.ChatterType.forNumber(chatData.chatter_type.getValue()));
            feedPreviewInfo.mo106048b(chatData.chatter_id);
            feedPreviewInfo.mo106056c(chatData.is_crypto.booleanValue());
            feedPreviewInfo.mo106016a(Chat.ChatMode.forNumber(chatData.chat_mode.getValue()));
            feedPreviewInfo.mo106050b(chatData.is_meeting.booleanValue());
            feedPreviewInfo.mo106025a(C38158g.m150021a(chatData.urgents));
            feedPreviewInfo.mo106024a(chatData.with_bot_tag);
            feedPreviewInfo.mo106046b(chatData.last_message_position.intValue());
            feedPreviewInfo.mo106072g(chatData.is_department.booleanValue());
            feedPreviewInfo.mo106070f(chatData.is_super.booleanValue());
            feedPreviewInfo.mo106076h(chatData.tenant_chat.booleanValue());
            feedPreviewInfo.mo106077i(chatData.oncall_id);
            feedPreviewInfo.mo106020a(Message.Type.forNumber(chatData.last_message_type.getValue()));
            feedPreviewInfo.mo106021a(SystemMessageType.forNumber(chatData.system_message_type.getValue()));
            feedPreviewInfo.mo106009a(FeedPreviewInfo.CardContentType.forNumber(chatData.card_type.getValue()));
            feedPreviewInfo.mo106088l(chatData.is_public_v2.booleanValue());
            feedPreviewInfo.mo106084k(chatData.last_visible_message_id);
            feedPreviewInfo.mo106091m(chatData.is_official_oncall.booleanValue());
            feedPreviewInfo.mo106094n(chatData.is_offline_oncall.booleanValue());
            feedPreviewInfo.mo106011a(FeedPreviewInfo.VideoChatContentType.forNumber(chatData.video_chat_type.getValue()));
            feedPreviewInfo.mo106026a(chatData.is_voice_call.booleanValue());
            feedPreviewInfo.mo106097o(chatData.is_my_threads_updated.booleanValue());
            feedPreviewInfo.mo106100p(chatData.is_edu.booleanValue());
            feedPreviewInfo.mo106103q(chatData.is_cross_with_ka.booleanValue());
            feedPreviewInfo.mo106052c(chatData.user_count.intValue());
            feedPreviewInfo.mo106061d(chatData.tags);
            feedPreviewInfo.mo106096o(chatData.team_name);
            com.bytedance.lark.pb.basic.v1.TeamChatType teamChatType2 = chatData.team_chat_type;
            if (teamChatType2 == null) {
                teamChatType = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
            } else {
                teamChatType = TeamChatType.fromValue(teamChatType2.getValue());
            }
            feedPreviewInfo.mo106018a(teamChatType);
            feedPreviewInfo.mo106102q(C37262a.m146726a().mo139172a(chatData.chatter_status));
            if (chatData.chatter_status != null) {
                feedPreviewInfo.mo106065e(ChatterCustomStatus.Companion.mo124850a(chatData.chatter_status));
            }
        } else if (feedEntityPreview.doc_data != null) {
            DocData docData = feedEntityPreview.doc_data;
            feedPreviewInfo.mo106007a(FeedCard.Type.DOC);
            feedPreviewInfo.mo106069f(docData.name);
            feedPreviewInfo.mo106059d((long) docData.unread_count.intValue());
            feedPreviewInfo.mo106062d(docData.is_remind.booleanValue());
            feedPreviewInfo.mo106066e(docData.is_shortcut.booleanValue());
            feedPreviewInfo.mo106012a(C38127c.m149941a(docData.draft_preview));
            feedPreviewInfo.mo106071g(docData.localized_digest_message);
            feedPreviewInfo.mo106005a(docData.display_time.longValue());
            feedPreviewInfo.mo106047b(docData.rank_time.longValue());
            feedPreviewInfo.mo106082j(docData.cross_tenant.booleanValue());
            feedPreviewInfo.mo106055c(C38163i.m150036a(docData.reactions));
            feedPreviewInfo.mo106023a(DocType.forNumber(docData.doc_type.getValue()));
            feedPreviewInfo.mo106054c(docData.doc_url);
            feedPreviewInfo.mo106022a(DocMessage.Type.forNumber(docData.doc_message_type.getValue()));
            feedPreviewInfo.mo106081j(docData.last_doc_message_id);
        } else if (feedEntityPreview.thread_data != null) {
            ThreadData threadData = feedEntityPreview.thread_data;
            if (threadData.entity_type == ThreadData.EntityType.THREAD) {
                feedPreviewInfo.mo106007a(FeedCard.Type.THREAD);
            } else if (threadData.entity_type == ThreadData.EntityType.TOPIC) {
                feedPreviewInfo.mo106007a(FeedCard.Type.TOPIC);
            }
            feedPreviewInfo.mo106069f(threadData.name);
            feedPreviewInfo.mo106064e(threadData.avatar_key);
            feedPreviewInfo.mo106059d((long) threadData.unread_count.intValue());
            feedPreviewInfo.mo106062d(threadData.is_remind.booleanValue());
            feedPreviewInfo.mo106012a(C38127c.m149941a(threadData.draft_preview));
            feedPreviewInfo.mo106008a(C38127c.m149940a(threadData.at_info));
            feedPreviewInfo.mo106049b(C38127c.m149945a(threadData.at_infos));
            feedPreviewInfo.mo106004a(threadData.at_infos_count.intValue());
            feedPreviewInfo.mo106071g(threadData.localized_digest_message);
            feedPreviewInfo.mo106010a(FeedPreviewInfo.EntityStatus.getSource(threadData.entity_status.getValue()));
            feedPreviewInfo.mo106005a(threadData.display_time.longValue());
            feedPreviewInfo.mo106047b(threadData.rank_time.longValue());
            feedPreviewInfo.mo106099p(threadData.chat_id);
        } else if (feedEntityPreview.open_app_data != null) {
            OpenAppData openAppData = feedEntityPreview.open_app_data;
            feedPreviewInfo.mo106007a(FeedCard.Type.APP);
            feedPreviewInfo.mo106069f(openAppData.name);
            feedPreviewInfo.mo106064e(openAppData.avatar_key);
            feedPreviewInfo.mo106059d((long) openAppData.unread_count.intValue());
            feedPreviewInfo.mo106062d(openAppData.is_remind.booleanValue());
            feedPreviewInfo.mo106066e(openAppData.is_shortcut.booleanValue());
            feedPreviewInfo.mo106071g(openAppData.localized_digest_message);
            feedPreviewInfo.mo106005a(openAppData.display_time.longValue());
            feedPreviewInfo.mo106047b(openAppData.rank_time.longValue());
            feedPreviewInfo.mo106087l(openAppData.android_schema);
            feedPreviewInfo.mo106090m(openAppData.last_notification_seq_id);
        } else if (feedEntityPreview.box_data != null) {
            BoxData boxData = feedEntityPreview.box_data;
            feedPreviewInfo.mo106007a(FeedCard.Type.BOX);
            feedPreviewInfo.mo106062d(boxData.is_remind.booleanValue());
            feedPreviewInfo.mo106047b(boxData.rank_time.longValue());
            feedPreviewInfo.mo106066e(boxData.is_shortcut.booleanValue());
            feedPreviewInfo.mo106059d((long) boxData.unread_count.intValue());
            feedPreviewInfo.mo106005a(boxData.display_time.longValue());
            feedPreviewInfo.mo106071g(boxData.localized_digest_message);
            feedPreviewInfo.mo106008a(C38127c.m149940a(boxData.at_info));
            feedPreviewInfo.mo106049b(C38127c.m149945a(boxData.at_infos));
            feedPreviewInfo.mo106085k(boxData.has_focus.booleanValue());
        } else if (feedEntityPreview.subscriptions_data != null) {
            SubscriptionsData subscriptionsData = feedEntityPreview.subscriptions_data;
            feedPreviewInfo.mo106007a(FeedCard.Type.SUBSCRIPTION);
            feedPreviewInfo.mo106069f(subscriptionsData.name);
            feedPreviewInfo.mo106064e(subscriptionsData.avatar_key);
            feedPreviewInfo.mo106071g(subscriptionsData.localized_digest_message);
            feedPreviewInfo.mo106087l(subscriptionsData.schema);
            feedPreviewInfo.mo106059d((long) subscriptionsData.unread_count.intValue());
            feedPreviewInfo.mo106062d(subscriptionsData.is_remind.booleanValue());
            feedPreviewInfo.mo106066e(subscriptionsData.is_shortcut.booleanValue());
            feedPreviewInfo.mo106005a(subscriptionsData.display_time.longValue());
            feedPreviewInfo.mo106047b(subscriptionsData.rank_time.longValue());
        }
        return feedPreviewInfo;
    }
}
