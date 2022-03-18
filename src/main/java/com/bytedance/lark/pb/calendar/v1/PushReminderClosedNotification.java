package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushReminderClosedNotification extends Message<PushReminderClosedNotification, C15962a> {
    public static final ProtoAdapter<PushReminderClosedNotification> ADAPTER = new C15963b();
    public static final Integer DEFAULT_EVENT_ID = 0;
    public static final Integer DEFAULT_MINUTES = 0;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final Integer event_id;
    public final String key;
    public final Integer minutes;
    public final Long original_time;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushReminderClosedNotification$b */
    private static final class C15963b extends ProtoAdapter<PushReminderClosedNotification> {
        C15963b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushReminderClosedNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushReminderClosedNotification pushReminderClosedNotification) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushReminderClosedNotification.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, pushReminderClosedNotification.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, pushReminderClosedNotification.original_time) + ProtoAdapter.INT64.encodedSizeWithTag(4, pushReminderClosedNotification.start_time) + ProtoAdapter.INT32.encodedSizeWithTag(5, pushReminderClosedNotification.minutes);
            if (pushReminderClosedNotification.event_id != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(6, pushReminderClosedNotification.event_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushReminderClosedNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushReminderClosedNotification decode(ProtoReader protoReader) throws IOException {
            C15962a aVar = new C15962a();
            aVar.f41961a = "";
            aVar.f41962b = "";
            aVar.f41963c = 0L;
            aVar.f41964d = 0L;
            aVar.f41965e = 0;
            aVar.f41966f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41961a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41962b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41963c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41964d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41965e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41966f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushReminderClosedNotification pushReminderClosedNotification) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushReminderClosedNotification.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushReminderClosedNotification.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pushReminderClosedNotification.original_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, pushReminderClosedNotification.start_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, pushReminderClosedNotification.minutes);
            if (pushReminderClosedNotification.event_id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, pushReminderClosedNotification.event_id);
            }
            protoWriter.writeBytes(pushReminderClosedNotification.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15962a newBuilder() {
        C15962a aVar = new C15962a();
        aVar.f41961a = this.calendar_id;
        aVar.f41962b = this.key;
        aVar.f41963c = this.original_time;
        aVar.f41964d = this.start_time;
        aVar.f41965e = this.minutes;
        aVar.f41966f = this.event_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushReminderClosedNotification$a */
    public static final class C15962a extends Message.Builder<PushReminderClosedNotification, C15962a> {

        /* renamed from: a */
        public String f41961a;

        /* renamed from: b */
        public String f41962b;

        /* renamed from: c */
        public Long f41963c;

        /* renamed from: d */
        public Long f41964d;

        /* renamed from: e */
        public Integer f41965e;

        /* renamed from: f */
        public Integer f41966f;

        /* renamed from: a */
        public PushReminderClosedNotification build() {
            String str;
            Long l;
            Long l2;
            Integer num;
            String str2 = this.f41961a;
            if (str2 != null && (str = this.f41962b) != null && (l = this.f41963c) != null && (l2 = this.f41964d) != null && (num = this.f41965e) != null) {
                return new PushReminderClosedNotification(str2, str, l, l2, num, this.f41966f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41962b, "key", this.f41963c, "original_time", this.f41964d, "start_time", this.f41965e, "minutes");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushReminderClosedNotification");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", minutes=");
        sb.append(this.minutes);
        if (this.event_id != null) {
            sb.append(", event_id=");
            sb.append(this.event_id);
        }
        StringBuilder replace = sb.replace(0, 2, "PushReminderClosedNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushReminderClosedNotification(String str, String str2, Long l, Long l2, Integer num, Integer num2) {
        this(str, str2, l, l2, num, num2, ByteString.EMPTY);
    }

    public PushReminderClosedNotification(String str, String str2, Long l, Long l2, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.start_time = l2;
        this.minutes = num;
        this.event_id = num2;
    }
}
