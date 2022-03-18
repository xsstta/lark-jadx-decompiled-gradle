package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class NotificationCount extends Message<NotificationCount, C18484a> {
    public static final ProtoAdapter<NotificationCount> ADAPTER = new C18485b();
    public static final Integer DEFAULT_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_REACTION_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer message_count;
    public final String message_read_ts;
    public final Integer reaction_count;
    public final String reaction_read_ts;

    /* renamed from: com.bytedance.lark.pb.moments.v1.NotificationCount$b */
    private static final class C18485b extends ProtoAdapter<NotificationCount> {
        C18485b() {
            super(FieldEncoding.LENGTH_DELIMITED, NotificationCount.class);
        }

        /* renamed from: a */
        public int encodedSize(NotificationCount notificationCount) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (notificationCount.message_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, notificationCount.message_count);
            } else {
                i = 0;
            }
            if (notificationCount.reaction_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, notificationCount.reaction_count);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (notificationCount.message_read_ts != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, notificationCount.message_read_ts);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (notificationCount.reaction_read_ts != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, notificationCount.reaction_read_ts);
            }
            return i6 + i4 + notificationCount.unknownFields().size();
        }

        /* renamed from: a */
        public NotificationCount decode(ProtoReader protoReader) throws IOException {
            C18484a aVar = new C18484a();
            aVar.f45912a = 0;
            aVar.f45913b = 0;
            aVar.f45914c = "";
            aVar.f45915d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45912a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45913b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45914c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45915d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NotificationCount notificationCount) throws IOException {
            if (notificationCount.message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, notificationCount.message_count);
            }
            if (notificationCount.reaction_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, notificationCount.reaction_count);
            }
            if (notificationCount.message_read_ts != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, notificationCount.message_read_ts);
            }
            if (notificationCount.reaction_read_ts != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, notificationCount.reaction_read_ts);
            }
            protoWriter.writeBytes(notificationCount.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.NotificationCount$a */
    public static final class C18484a extends Message.Builder<NotificationCount, C18484a> {

        /* renamed from: a */
        public Integer f45912a;

        /* renamed from: b */
        public Integer f45913b;

        /* renamed from: c */
        public String f45914c;

        /* renamed from: d */
        public String f45915d;

        /* renamed from: a */
        public NotificationCount build() {
            return new NotificationCount(this.f45912a, this.f45913b, this.f45914c, this.f45915d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18484a newBuilder() {
        C18484a aVar = new C18484a();
        aVar.f45912a = this.message_count;
        aVar.f45913b = this.reaction_count;
        aVar.f45914c = this.message_read_ts;
        aVar.f45915d = this.reaction_read_ts;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "NotificationCount");
        StringBuilder sb = new StringBuilder();
        if (this.message_count != null) {
            sb.append(", message_count=");
            sb.append(this.message_count);
        }
        if (this.reaction_count != null) {
            sb.append(", reaction_count=");
            sb.append(this.reaction_count);
        }
        if (this.message_read_ts != null) {
            sb.append(", message_read_ts=");
            sb.append(this.message_read_ts);
        }
        if (this.reaction_read_ts != null) {
            sb.append(", reaction_read_ts=");
            sb.append(this.reaction_read_ts);
        }
        StringBuilder replace = sb.replace(0, 2, "NotificationCount{");
        replace.append('}');
        return replace.toString();
    }

    public NotificationCount(Integer num, Integer num2, String str, String str2) {
        this(num, num2, str, str2, ByteString.EMPTY);
    }

    public NotificationCount(Integer num, Integer num2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_count = num;
        this.reaction_count = num2;
        this.message_read_ts = str;
        this.reaction_read_ts = str2;
    }
}
