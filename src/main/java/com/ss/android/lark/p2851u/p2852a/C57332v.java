package com.ss.android.lark.p2851u.p2852a;

import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.QuasiThread;
import com.bytedance.lark.pb.basic.v1.Thread;
import com.bytedance.lark.pb.basic.v1.TopicGroup;
import com.bytedance.lark.pb.im.v1.GetTopicGroupsToPostResponse;
import com.larksuite.framework.utils.C26249aa;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.C29607af;
import com.ss.android.lark.biz.im.api.ThreadStateInfo;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.biz.im.api.TopicGroupsResponse;
import com.ss.android.lark.chat.entity.Channel;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.android.lark.u.a.v */
public class C57332v {
    /* renamed from: a */
    public static Map<String, ThreadTopic> m222231a(Map<String, Thread> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<Thread, ThreadTopic>() {
            /* class com.ss.android.lark.p2851u.p2852a.C57332v.C573331 */

            /* renamed from: a */
            public ThreadTopic get(Thread thread) {
                return C57332v.m222229a(thread);
            }
        });
    }

    /* renamed from: a */
    public static ThreadStateInfo m222227a(com.bytedance.lark.pb.basic.v1.ThreadStateInfo threadStateInfo) {
        return new ThreadStateInfo(ThreadStateInfo.ThreadState.valueOf(threadStateInfo.state.getValue()), threadStateInfo.operator_id, threadStateInfo.update_time_ms);
    }

    /* renamed from: a */
    public static ThreadTopic m222228a(QuasiThread quasiThread) {
        if (quasiThread == null) {
            return null;
        }
        ThreadTopic threadTopic = new ThreadTopic();
        threadTopic.setId(quasiThread.id);
        threadTopic.setChannel(new Channel(quasiThread.channel.type.getValue(), quasiThread.channel.id));
        threadTopic.setTopic(quasiThread.topic);
        threadTopic.setPosition(quasiThread.position.intValue());
        return threadTopic;
    }

    /* renamed from: a */
    public static TopicGroupsResponse m222230a(GetTopicGroupsToPostResponse getTopicGroupsToPostResponse) {
        TopicGroupsResponse agVar = new TopicGroupsResponse();
        if (!(getTopicGroupsToPostResponse.entity == null || getTopicGroupsToPostResponse.item_list == null || CollectionUtils.isEmpty(getTopicGroupsToPostResponse.item_list.items))) {
            agVar.mo106686a(getTopicGroupsToPostResponse.next_cursor);
            ArrayList arrayList = new ArrayList();
            for (GetTopicGroupsToPostResponse.GroupItem groupItem : getTopicGroupsToPostResponse.item_list.items) {
                Chat chat = getTopicGroupsToPostResponse.entity.chats.get(groupItem.item_id);
                TopicGroup topicGroup = getTopicGroupsToPostResponse.entity.topic_groups.get(groupItem.item_id);
                if (!(chat == null || topicGroup == null)) {
                    arrayList.add(new C29607af(C57310e.m222078a(chat), C57335x.m222234a(topicGroup)));
                }
            }
            agVar.mo106687a(arrayList);
        }
        return agVar;
    }

    /* renamed from: a */
    public static ThreadTopic m222229a(Thread thread) {
        if (thread == null) {
            return null;
        }
        ThreadTopic threadTopic = new ThreadTopic();
        threadTopic.setId(thread.id);
        threadTopic.setChannel(new Channel(thread.channel.type.getValue(), thread.channel.id));
        threadTopic.setTopic(thread.topic);
        threadTopic.setPosition(thread.position.intValue());
        threadTopic.setRootMsgId(thread.root_message_id);
        threadTopic.setLastMsgId(thread.last_message_id);
        threadTopic.setLastMsgPos(thread.last_message_position.intValue());
        threadTopic.setUpdateTime(thread.update_time.longValue());
        threadTopic.setReplyCount(thread.reply_count.intValue());
        threadTopic.setOwnerId(thread.owner_id);
        threadTopic.setLastMsgPosBadgeCount(thread.last_message_position_badge_count.intValue());
        threadTopic.setReadPos(thread.read_position.intValue());
        threadTopic.setReadPosBadgeCount(thread.read_position_badge_count.intValue());
        threadTopic.setLastVisibleMsgPos(thread.last_visible_message_position.intValue());
        threadTopic.setLastVisibleMsgId(thread.last_visible_message_id);
        threadTopic.setBadgeCount(thread.badge_count.intValue());
        threadTopic.setVisible(thread.is_visible.booleanValue());
        threadTopic.setBadged(thread.is_badged.booleanValue());
        threadTopic.setFollow(thread.is_follow.booleanValue());
        threadTopic.setAvatarKey(thread.avatar_key);
        threadTopic.setSubTitle(thread.subtitle);
        threadTopic.setLastReplyIds(thread.last_reply_ids);
        threadTopic.setNoTraceDelete(thread.is_no_trace_deleted.booleanValue());
        threadTopic.setOriginBadgeCount(thread.origin_badge_count.intValue());
        threadTopic.setLatestAtMessageIds(thread.latest_at_message_id);
        threadTopic.setFilterRankTime(thread.rank_time.longValue());
        if (thread.state_info != null) {
            threadTopic.setStateInfo(m222227a(thread.state_info));
        }
        if (thread.anonymous_id != null) {
            threadTopic.setAnonymousId(thread.anonymous_id);
        }
        if (thread.anonymous_enable != null) {
            threadTopic.setAnonymousEnable(thread.anonymous_enable.booleanValue());
        }
        return threadTopic;
    }
}
