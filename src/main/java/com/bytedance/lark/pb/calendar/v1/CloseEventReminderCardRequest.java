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

public final class CloseEventReminderCardRequest extends Message<CloseEventReminderCardRequest, C15574a> {
    public static final ProtoAdapter<CloseEventReminderCardRequest> ADAPTER = new C15575b();
    public static final Integer DEFAULT_MINUTES = 0;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Integer minutes;
    public final Long original_time;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CloseEventReminderCardRequest$b */
    private static final class C15575b extends ProtoAdapter<CloseEventReminderCardRequest> {
        C15575b() {
            super(FieldEncoding.LENGTH_DELIMITED, CloseEventReminderCardRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CloseEventReminderCardRequest closeEventReminderCardRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, closeEventReminderCardRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, closeEventReminderCardRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, closeEventReminderCardRequest.original_time) + ProtoAdapter.INT64.encodedSizeWithTag(4, closeEventReminderCardRequest.start_time) + ProtoAdapter.INT32.encodedSizeWithTag(5, closeEventReminderCardRequest.minutes) + closeEventReminderCardRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CloseEventReminderCardRequest decode(ProtoReader protoReader) throws IOException {
            C15574a aVar = new C15574a();
            aVar.f41307a = "";
            aVar.f41308b = "";
            aVar.f41309c = 0L;
            aVar.f41310d = 0L;
            aVar.f41311e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41307a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41308b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41309c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f41310d = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41311e = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CloseEventReminderCardRequest closeEventReminderCardRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, closeEventReminderCardRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, closeEventReminderCardRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, closeEventReminderCardRequest.original_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, closeEventReminderCardRequest.start_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, closeEventReminderCardRequest.minutes);
            protoWriter.writeBytes(closeEventReminderCardRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15574a newBuilder() {
        C15574a aVar = new C15574a();
        aVar.f41307a = this.calendar_id;
        aVar.f41308b = this.key;
        aVar.f41309c = this.original_time;
        aVar.f41310d = this.start_time;
        aVar.f41311e = this.minutes;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CloseEventReminderCardRequest$a */
    public static final class C15574a extends Message.Builder<CloseEventReminderCardRequest, C15574a> {

        /* renamed from: a */
        public String f41307a;

        /* renamed from: b */
        public String f41308b;

        /* renamed from: c */
        public Long f41309c;

        /* renamed from: d */
        public Long f41310d;

        /* renamed from: e */
        public Integer f41311e;

        /* renamed from: a */
        public CloseEventReminderCardRequest build() {
            String str;
            Long l;
            Long l2;
            Integer num;
            String str2 = this.f41307a;
            if (str2 != null && (str = this.f41308b) != null && (l = this.f41309c) != null && (l2 = this.f41310d) != null && (num = this.f41311e) != null) {
                return new CloseEventReminderCardRequest(str2, str, l, l2, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41308b, "key", this.f41309c, "original_time", this.f41310d, "start_time", this.f41311e, "minutes");
        }

        /* renamed from: a */
        public C15574a mo56501a(Integer num) {
            this.f41311e = num;
            return this;
        }

        /* renamed from: b */
        public C15574a mo56505b(Long l) {
            this.f41310d = l;
            return this;
        }

        /* renamed from: a */
        public C15574a mo56502a(Long l) {
            this.f41309c = l;
            return this;
        }

        /* renamed from: b */
        public C15574a mo56506b(String str) {
            this.f41308b = str;
            return this;
        }

        /* renamed from: a */
        public C15574a mo56503a(String str) {
            this.f41307a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CloseEventReminderCardRequest");
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
        StringBuilder replace = sb.replace(0, 2, "CloseEventReminderCardRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CloseEventReminderCardRequest(String str, String str2, Long l, Long l2, Integer num) {
        this(str, str2, l, l2, num, ByteString.EMPTY);
    }

    public CloseEventReminderCardRequest(String str, String str2, Long l, Long l2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.start_time = l2;
        this.minutes = num;
    }
}
