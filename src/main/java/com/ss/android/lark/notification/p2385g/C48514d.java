package com.ss.android.lark.notification.p2385g;

import com.bytedance.lark.pb.basic.v1.AppFeedData;
import com.bytedance.lark.pb.basic.v1.ChatApplyData;
import com.bytedance.lark.pb.basic.v1.DocFeedData;
import com.bytedance.lark.pb.basic.v1.DocImageReplyData;
import com.bytedance.lark.pb.basic.v1.MailData;
import com.bytedance.lark.pb.basic.v1.MessageData;
import com.bytedance.lark.pb.basic.v1.Notification;
import com.ss.android.lark.notification.export.entity.Notice;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.notification.g.d */
public class C48514d {
    /* renamed from: a */
    private static int m191303a(AppFeedData appFeedData) {
        return 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.notification.g.d$1 */
    public static /* synthetic */ class C485151 {

        /* renamed from: a */
        static final /* synthetic */ int[] f122103a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.lark.pb.basic.v1.MessageData$Type[] r0 = com.bytedance.lark.pb.basic.v1.MessageData.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.notification.p2385g.C48514d.C485151.f122103a = r0
                com.bytedance.lark.pb.basic.v1.MessageData$Type r1 = com.bytedance.lark.pb.basic.v1.MessageData.Type.AT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.notification.p2385g.C48514d.C485151.f122103a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.basic.v1.MessageData$Type r1 = com.bytedance.lark.pb.basic.v1.MessageData.Type.URGENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.notification.p2385g.C48514d.C485151.f122103a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.basic.v1.MessageData$Type r1 = com.bytedance.lark.pb.basic.v1.MessageData.Type.REACTION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.notification.p2385g.C48514d.C485151.f122103a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.lark.pb.basic.v1.MessageData$Type r1 = com.bytedance.lark.pb.basic.v1.MessageData.Type.URGENT_ACK     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.notification.p2385g.C48514d.C485151.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static int m191304a(MessageData messageData) {
        int i = C485151.f122103a[messageData.type.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return 1;
        }
        return 5;
    }

    /* renamed from: b */
    private static int m191312b(Notification notification) {
        if (notification.message_data != null) {
            return m191304a(notification.message_data);
        }
        if (notification.mail_data != null) {
            return 7;
        }
        if (notification.doc_image_reply_data != null) {
            return 9;
        }
        if (notification.doc_feed_data != null) {
            return 1;
        }
        if (notification.chat_apply_data != null) {
            return 8;
        }
        if (notification.app_feed_data != null) {
            return m191303a(notification.app_feed_data);
        }
        return 6;
    }

    /* renamed from: a */
    public static Notice m191305a(Notification notification) {
        Notice notice = new Notice();
        notice.messageId = "";
        notice.state = notification.state.getValue();
        notice.content = notification.content;
        notice.title = notification.title;
        notice.type = m191312b(notification);
        notice.key = notification.id;
        notice.shouldNotify = notification.should_notify.booleanValue();
        if (notification.message_data != null) {
            m191311a(notification.message_data, notice);
            return notice;
        } else if (notification.mail_data != null) {
            m191310a(notification.mail_data, notice);
            return notice;
        } else if (notification.doc_image_reply_data != null) {
            m191309a(notification.doc_image_reply_data, notice);
            return notice;
        } else if (notification.doc_feed_data != null) {
            m191308a(notification.doc_feed_data, notice);
            return notice;
        } else if (notification.chat_apply_data != null) {
            m191307a(notification.chat_apply_data, notice);
            return notice;
        } else {
            if (notification.app_feed_data != null) {
                m191306a(notification.app_feed_data, notice);
            }
            return notice;
        }
    }

    /* renamed from: a */
    private static void m191307a(ChatApplyData chatApplyData, Notice notice) {
        notice.extra = new Notice.Extra();
        notice.extra.f122004c = chatApplyData.chat_id;
    }

    /* renamed from: a */
    private static void m191306a(AppFeedData appFeedData, Notice notice) {
        notice.messageId = appFeedData.message_id;
        notice.createTime = appFeedData.create_time.longValue();
        notice.extra = new Notice.Extra();
        notice.extra.f122011j = appFeedData.avatar_key;
        notice.extra.f122021t = appFeedData.android_schema;
        notice.extra.f122022u = appFeedData.last_notification_seq_id;
        if (appFeedData.channel != null) {
            notice.extra.f122013l = appFeedData.channel.type.getValue();
            notice.extra.f122014m = appFeedData.channel.id;
        }
    }

    /* renamed from: a */
    private static void m191308a(DocFeedData docFeedData, Notice notice) {
        notice.messageId = docFeedData.message_id;
        notice.createTime = docFeedData.create_time.longValue();
        notice.extra = new Notice.Extra();
        if (docFeedData.channel != null) {
            notice.extra.f122013l = docFeedData.channel.type.getValue();
            notice.extra.f122014m = docFeedData.channel.id;
        }
        notice.extra.f122006e = docFeedData.from_chatter_id;
        notice.extra.f122011j = docFeedData.avatar_key;
        notice.extra.f122012k = docFeedData.new_message_count.intValue();
    }

    /* renamed from: a */
    private static void m191309a(DocImageReplyData docImageReplyData, Notice notice) {
        notice.createTime = docImageReplyData.create_time.longValue();
        notice.extra = new Notice.Extra();
        notice.extra.f122020s = docImageReplyData.doc_image_reply_body;
    }

    /* renamed from: a */
    private static void m191310a(MailData mailData, Notice notice) {
        notice.messageId = mailData.message_id;
        notice.createTime = mailData.create_time.longValue();
        notice.extra = new Notice.Extra();
        if (mailData.channel != null) {
            notice.extra.f122013l = mailData.channel.type.getValue();
            notice.extra.f122014m = mailData.channel.id;
        }
        notice.extra.f122009h = mailData.thread_id;
        notice.extra.f122012k = mailData.new_message_count.intValue();
        notice.extra.f122006e = mailData.from_chatter_id;
        notice.extra.f122017p = mailData.label_id;
        notice.extra.f122023v = mailData.mail_account_id;
    }

    /* renamed from: a */
    private static void m191311a(MessageData messageData, Notice notice) {
        notice.createTime = messageData.create_time.longValue();
        notice.messageId = messageData.message_id;
        notice.position = messageData.position.intValue();
        notice.extra = new Notice.Extra();
        notice.extra.f122003b = messageData.urgent_id;
        notice.extra.f122015n = messageData.recaller_id;
        if (messageData.channel != null) {
            notice.extra.f122013l = messageData.channel.type.getValue();
            notice.extra.f122014m = messageData.channel.id;
        }
        notice.extra.f122004c = messageData.chat_id;
        notice.extra.f122005d = Notice.Extra.ChatType.valueOf(messageData.chat_type.getValue());
        notice.extra.f122008g = Notice.Extra.ChatMode.forNumber(messageData.chat_mode.getValue());
        notice.extra.f122010i = messageData.is_crypto.booleanValue();
        notice.extra.f122012k = messageData.new_message_count.intValue();
        notice.extra.f122011j = messageData.avatar_key;
        notice.extra.f122018q = messageData.thread_message_position.intValue();
        notice.extra.f122006e = messageData.from_chatter_id;
        notice.extra.f122007f = new ArrayList(messageData.image_urls);
        notice.extra.f122009h = messageData.thread_id;
        notice.extra.f122019r = messageData.channel_thread_position.intValue();
        notice.extra.f122016o = messageData.me_read.booleanValue();
    }
}
