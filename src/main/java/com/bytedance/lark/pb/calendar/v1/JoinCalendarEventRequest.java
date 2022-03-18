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

public final class JoinCalendarEventRequest extends Message<JoinCalendarEventRequest, C15820a> {
    public static final ProtoAdapter<JoinCalendarEventRequest> ADAPTER = new C15821b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final String message_id;
    public final Long original_time;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JoinCalendarEventRequest$b */
    private static final class C15821b extends ProtoAdapter<JoinCalendarEventRequest> {
        C15821b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinCalendarEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinCalendarEventRequest joinCalendarEventRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, joinCalendarEventRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, joinCalendarEventRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, joinCalendarEventRequest.original_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, joinCalendarEventRequest.message_id);
            if (joinCalendarEventRequest.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, joinCalendarEventRequest.token);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + joinCalendarEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public JoinCalendarEventRequest decode(ProtoReader protoReader) throws IOException {
            C15820a aVar = new C15820a();
            aVar.f41614a = "";
            aVar.f41615b = "";
            aVar.f41616c = 0L;
            aVar.f41617d = "";
            aVar.f41618e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41614a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41615b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41616c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f41617d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41618e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinCalendarEventRequest joinCalendarEventRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, joinCalendarEventRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, joinCalendarEventRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, joinCalendarEventRequest.original_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, joinCalendarEventRequest.message_id);
            if (joinCalendarEventRequest.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, joinCalendarEventRequest.token);
            }
            protoWriter.writeBytes(joinCalendarEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15820a newBuilder() {
        C15820a aVar = new C15820a();
        aVar.f41614a = this.calendar_id;
        aVar.f41615b = this.key;
        aVar.f41616c = this.original_time;
        aVar.f41617d = this.message_id;
        aVar.f41618e = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JoinCalendarEventRequest$a */
    public static final class C15820a extends Message.Builder<JoinCalendarEventRequest, C15820a> {

        /* renamed from: a */
        public String f41614a;

        /* renamed from: b */
        public String f41615b;

        /* renamed from: c */
        public Long f41616c;

        /* renamed from: d */
        public String f41617d;

        /* renamed from: e */
        public String f41618e;

        /* renamed from: a */
        public JoinCalendarEventRequest build() {
            String str;
            Long l;
            String str2;
            String str3 = this.f41614a;
            if (str3 != null && (str = this.f41615b) != null && (l = this.f41616c) != null && (str2 = this.f41617d) != null) {
                return new JoinCalendarEventRequest(str3, str, l, str2, this.f41618e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "calendar_id", this.f41615b, "key", this.f41616c, "original_time", this.f41617d, "message_id");
        }

        /* renamed from: a */
        public C15820a mo57118a(Long l) {
            this.f41616c = l;
            return this;
        }

        /* renamed from: b */
        public C15820a mo57121b(String str) {
            this.f41615b = str;
            return this;
        }

        /* renamed from: c */
        public C15820a mo57122c(String str) {
            this.f41617d = str;
            return this;
        }

        /* renamed from: d */
        public C15820a mo57123d(String str) {
            this.f41618e = str;
            return this;
        }

        /* renamed from: a */
        public C15820a mo57119a(String str) {
            this.f41614a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "JoinCalendarEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        sb.append(", message_id=");
        sb.append(this.message_id);
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinCalendarEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public JoinCalendarEventRequest(String str, String str2, Long l, String str3, String str4) {
        this(str, str2, l, str3, str4, ByteString.EMPTY);
    }

    public JoinCalendarEventRequest(String str, String str2, Long l, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.message_id = str3;
        this.token = str4;
    }
}
