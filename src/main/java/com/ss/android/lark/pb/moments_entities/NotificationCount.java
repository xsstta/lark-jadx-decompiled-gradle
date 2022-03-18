package com.ss.android.lark.pb.moments_entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class NotificationCount extends Message<NotificationCount, C49988a> {
    public static final ProtoAdapter<NotificationCount> ADAPTER = new C49989b();
    public static final Integer DEFAULT_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_REACTION_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer mmessage_count;
    public final String mmessage_read_ts;
    public final Integer mreaction_count;
    public final String mreaction_read_ts;

    /* renamed from: com.ss.android.lark.pb.moments_entities.NotificationCount$b */
    private static final class C49989b extends ProtoAdapter<NotificationCount> {
        C49989b() {
            super(FieldEncoding.LENGTH_DELIMITED, NotificationCount.class);
        }

        /* renamed from: a */
        public int encodedSize(NotificationCount notificationCount) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (notificationCount.mmessage_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, notificationCount.mmessage_count);
            } else {
                i = 0;
            }
            if (notificationCount.mreaction_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, notificationCount.mreaction_count);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (notificationCount.mmessage_read_ts != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, notificationCount.mmessage_read_ts);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (notificationCount.mreaction_read_ts != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, notificationCount.mreaction_read_ts);
            }
            return i6 + i4 + notificationCount.unknownFields().size();
        }

        /* renamed from: a */
        public NotificationCount decode(ProtoReader protoReader) throws IOException {
            C49988a aVar = new C49988a();
            aVar.f125023a = 0;
            aVar.f125024b = 0;
            aVar.f125025c = "";
            aVar.f125026d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125023a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125024b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125025c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125026d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NotificationCount notificationCount) throws IOException {
            if (notificationCount.mmessage_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, notificationCount.mmessage_count);
            }
            if (notificationCount.mreaction_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, notificationCount.mreaction_count);
            }
            if (notificationCount.mmessage_read_ts != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, notificationCount.mmessage_read_ts);
            }
            if (notificationCount.mreaction_read_ts != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, notificationCount.mreaction_read_ts);
            }
            protoWriter.writeBytes(notificationCount.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments_entities.NotificationCount$a */
    public static final class C49988a extends Message.Builder<NotificationCount, C49988a> {

        /* renamed from: a */
        public Integer f125023a;

        /* renamed from: b */
        public Integer f125024b;

        /* renamed from: c */
        public String f125025c;

        /* renamed from: d */
        public String f125026d;

        /* renamed from: a */
        public NotificationCount build() {
            return new NotificationCount(this.f125023a, this.f125024b, this.f125025c, this.f125026d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49988a mo173759a(Integer num) {
            this.f125023a = num;
            return this;
        }

        /* renamed from: b */
        public C49988a mo173762b(Integer num) {
            this.f125024b = num;
            return this;
        }

        /* renamed from: a */
        public C49988a mo173760a(String str) {
            this.f125025c = str;
            return this;
        }

        /* renamed from: b */
        public C49988a mo173763b(String str) {
            this.f125026d = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49988a newBuilder() {
        C49988a aVar = new C49988a();
        aVar.f125023a = this.mmessage_count;
        aVar.f125024b = this.mreaction_count;
        aVar.f125025c = this.mmessage_read_ts;
        aVar.f125026d = this.mreaction_read_ts;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mmessage_count != null) {
            sb.append(", message_count=");
            sb.append(this.mmessage_count);
        }
        if (this.mreaction_count != null) {
            sb.append(", reaction_count=");
            sb.append(this.mreaction_count);
        }
        if (this.mmessage_read_ts != null) {
            sb.append(", message_read_ts=");
            sb.append(this.mmessage_read_ts);
        }
        if (this.mreaction_read_ts != null) {
            sb.append(", reaction_read_ts=");
            sb.append(this.mreaction_read_ts);
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
        this.mmessage_count = num;
        this.mreaction_count = num2;
        this.mmessage_read_ts = str;
        this.mreaction_read_ts = str2;
    }
}
