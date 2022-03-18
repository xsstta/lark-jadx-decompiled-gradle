package com.ss.android.lark.notification.p2385g;

import com.bytedance.lark.pb.basic.v1.Notice;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.notification.g.c */
public class C48513c {
    /* renamed from: a */
    public static Notice m191302a(com.bytedance.lark.pb.basic.v1.Notice notice) {
        if (notice == null) {
            return null;
        }
        Notice notice2 = new Notice();
        notice2.messageId = notice.message_id;
        notice2.state = notice.state.getValue();
        notice2.content = notice.content;
        notice2.title = notice.title;
        notice2.type = notice.type.getValue();
        notice2.key = notice.key;
        notice2.createTime = notice.create_time.longValue();
        notice2.shouldNotify = notice.should_notify.booleanValue();
        notice2.position = notice.position.intValue();
        Notice.Extra extra = notice.extra;
        if (extra != null) {
            notice2.extra = new Notice.Extra();
            notice2.extra.f122002a = extra.root_id;
            notice2.extra.f122003b = extra.urgent_id;
            notice2.extra.f122004c = extra.chat_id;
            notice2.extra.f122005d = Notice.Extra.ChatType.valueOf(extra.chat_type.getValue());
            notice2.extra.f122006e = extra.from_chatter_id;
            notice2.extra.f122007f.addAll(extra.image_urls);
            if (extra.channel != null) {
                notice2.extra.f122013l = extra.channel.type.getValue();
                notice2.extra.f122014m = extra.channel.id;
            }
            notice2.extra.f122008g = Notice.Extra.ChatMode.forNumber(extra.chat_mode.getValue());
            notice2.extra.f122009h = extra.thread_id;
            notice2.extra.f122010i = extra.is_crypto.booleanValue();
            notice2.extra.f122011j = extra.avatar_key;
            notice2.extra.f122012k = extra.new_message_count.intValue();
            notice2.extra.f122015n = extra.recaller_id;
            notice2.extra.f122016o = extra.me_read.booleanValue();
            notice2.extra.f122009h = extra.thread_id;
            notice2.extra.f122018q = extra.thread_message_position.intValue();
            notice2.extra.f122019r = extra.channel_thread_position.intValue();
            notice2.extra.f122020s = extra.doc_image_reply_body;
            notice2.extra.f122021t = extra.android_schema;
            notice2.extra.f122022u = extra.last_notification_seq_id;
            notice2.extra.f122017p = extra.label_id;
        }
        return notice2;
    }
}
