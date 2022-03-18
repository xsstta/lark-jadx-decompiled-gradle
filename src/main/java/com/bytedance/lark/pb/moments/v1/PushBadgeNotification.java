package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushBadgeNotification extends Message<PushBadgeNotification, C18498a> {
    public static final ProtoAdapter<PushBadgeNotification> ADAPTER = new C18499b();
    private static final long serialVersionUID = 0;
    public final NotificationCount notification_count;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushBadgeNotification$b */
    private static final class C18499b extends ProtoAdapter<PushBadgeNotification> {
        C18499b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushBadgeNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushBadgeNotification pushBadgeNotification) {
            int i;
            if (pushBadgeNotification.notification_count != null) {
                i = NotificationCount.ADAPTER.encodedSizeWithTag(1, pushBadgeNotification.notification_count);
            } else {
                i = 0;
            }
            return i + pushBadgeNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushBadgeNotification decode(ProtoReader protoReader) throws IOException {
            C18498a aVar = new C18498a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45963a = NotificationCount.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushBadgeNotification pushBadgeNotification) throws IOException {
            if (pushBadgeNotification.notification_count != null) {
                NotificationCount.ADAPTER.encodeWithTag(protoWriter, 1, pushBadgeNotification.notification_count);
            }
            protoWriter.writeBytes(pushBadgeNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushBadgeNotification$a */
    public static final class C18498a extends Message.Builder<PushBadgeNotification, C18498a> {

        /* renamed from: a */
        public NotificationCount f45963a;

        /* renamed from: a */
        public PushBadgeNotification build() {
            return new PushBadgeNotification(this.f45963a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18498a newBuilder() {
        C18498a aVar = new C18498a();
        aVar.f45963a = this.notification_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushBadgeNotification");
        StringBuilder sb = new StringBuilder();
        if (this.notification_count != null) {
            sb.append(", notification_count=");
            sb.append(this.notification_count);
        }
        StringBuilder replace = sb.replace(0, 2, "PushBadgeNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushBadgeNotification(NotificationCount notificationCount) {
        this(notificationCount, ByteString.EMPTY);
    }

    public PushBadgeNotification(NotificationCount notificationCount, ByteString byteString) {
        super(ADAPTER, byteString);
        this.notification_count = notificationCount;
    }
}
