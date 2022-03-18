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

public final class GetSharedCalendarEventRequest extends Message<GetSharedCalendarEventRequest, C15784a> {
    public static final ProtoAdapter<GetSharedCalendarEventRequest> ADAPTER = new C15785b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final String message_id;
    public final Long original_time;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetSharedCalendarEventRequest$b */
    private static final class C15785b extends ProtoAdapter<GetSharedCalendarEventRequest> {
        C15785b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSharedCalendarEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSharedCalendarEventRequest getSharedCalendarEventRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getSharedCalendarEventRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getSharedCalendarEventRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, getSharedCalendarEventRequest.original_time);
            int i2 = 0;
            if (getSharedCalendarEventRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, getSharedCalendarEventRequest.message_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getSharedCalendarEventRequest.token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, getSharedCalendarEventRequest.token);
            }
            return i3 + i2 + getSharedCalendarEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSharedCalendarEventRequest decode(ProtoReader protoReader) throws IOException {
            C15784a aVar = new C15784a();
            aVar.f41558a = "";
            aVar.f41559b = "";
            aVar.f41560c = 0L;
            aVar.f41561d = "";
            aVar.f41562e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41558a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41559b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41560c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f41561d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41562e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSharedCalendarEventRequest getSharedCalendarEventRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getSharedCalendarEventRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getSharedCalendarEventRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getSharedCalendarEventRequest.original_time);
            if (getSharedCalendarEventRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getSharedCalendarEventRequest.message_id);
            }
            if (getSharedCalendarEventRequest.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getSharedCalendarEventRequest.token);
            }
            protoWriter.writeBytes(getSharedCalendarEventRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetSharedCalendarEventRequest$a */
    public static final class C15784a extends Message.Builder<GetSharedCalendarEventRequest, C15784a> {

        /* renamed from: a */
        public String f41558a;

        /* renamed from: b */
        public String f41559b;

        /* renamed from: c */
        public Long f41560c;

        /* renamed from: d */
        public String f41561d;

        /* renamed from: e */
        public String f41562e;

        /* renamed from: a */
        public GetSharedCalendarEventRequest build() {
            String str;
            Long l;
            String str2 = this.f41558a;
            if (str2 != null && (str = this.f41559b) != null && (l = this.f41560c) != null) {
                return new GetSharedCalendarEventRequest(str2, str, l, this.f41561d, this.f41562e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41559b, "key", this.f41560c, "original_time");
        }

        /* renamed from: a */
        public C15784a mo57021a(Long l) {
            this.f41560c = l;
            return this;
        }

        /* renamed from: b */
        public C15784a mo57024b(String str) {
            this.f41559b = str;
            return this;
        }

        /* renamed from: c */
        public C15784a mo57025c(String str) {
            this.f41561d = str;
            return this;
        }

        /* renamed from: d */
        public C15784a mo57026d(String str) {
            this.f41562e = str;
            return this;
        }

        /* renamed from: a */
        public C15784a mo57022a(String str) {
            this.f41558a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15784a newBuilder() {
        C15784a aVar = new C15784a();
        aVar.f41558a = this.calendar_id;
        aVar.f41559b = this.key;
        aVar.f41560c = this.original_time;
        aVar.f41561d = this.message_id;
        aVar.f41562e = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetSharedCalendarEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSharedCalendarEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSharedCalendarEventRequest(String str, String str2, Long l, String str3, String str4) {
        this(str, str2, l, str3, str4, ByteString.EMPTY);
    }

    public GetSharedCalendarEventRequest(String str, String str2, Long l, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.message_id = str3;
        this.token = str4;
    }
}
