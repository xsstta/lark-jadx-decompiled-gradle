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

public final class GetCalendarEventInfoRequest extends Message<GetCalendarEventInfoRequest, C15652a> {
    public static final ProtoAdapter<GetCalendarEventInfoRequest> ADAPTER = new C15653b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Long original_time;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventInfoRequest$b */
    private static final class C15653b extends ProtoAdapter<GetCalendarEventInfoRequest> {
        C15653b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarEventInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarEventInfoRequest getCalendarEventInfoRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getCalendarEventInfoRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getCalendarEventInfoRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, getCalendarEventInfoRequest.original_time);
            if (getCalendarEventInfoRequest.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, getCalendarEventInfoRequest.token);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getCalendarEventInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarEventInfoRequest decode(ProtoReader protoReader) throws IOException {
            C15652a aVar = new C15652a();
            aVar.f41415a = "";
            aVar.f41416b = "";
            aVar.f41417c = 0L;
            aVar.f41418d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41415a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41416b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41417c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41418d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarEventInfoRequest getCalendarEventInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCalendarEventInfoRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getCalendarEventInfoRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getCalendarEventInfoRequest.original_time);
            if (getCalendarEventInfoRequest.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getCalendarEventInfoRequest.token);
            }
            protoWriter.writeBytes(getCalendarEventInfoRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15652a newBuilder() {
        C15652a aVar = new C15652a();
        aVar.f41415a = this.calendar_id;
        aVar.f41416b = this.key;
        aVar.f41417c = this.original_time;
        aVar.f41418d = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventInfoRequest$a */
    public static final class C15652a extends Message.Builder<GetCalendarEventInfoRequest, C15652a> {

        /* renamed from: a */
        public String f41415a;

        /* renamed from: b */
        public String f41416b;

        /* renamed from: c */
        public Long f41417c;

        /* renamed from: d */
        public String f41418d;

        /* renamed from: a */
        public GetCalendarEventInfoRequest build() {
            String str;
            Long l;
            String str2 = this.f41415a;
            if (str2 != null && (str = this.f41416b) != null && (l = this.f41417c) != null) {
                return new GetCalendarEventInfoRequest(str2, str, l, this.f41418d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41416b, "key", this.f41417c, "original_time");
        }

        /* renamed from: a */
        public C15652a mo56700a(Long l) {
            this.f41417c = l;
            return this;
        }

        /* renamed from: b */
        public C15652a mo56703b(String str) {
            this.f41416b = str;
            return this;
        }

        /* renamed from: a */
        public C15652a mo56701a(String str) {
            this.f41415a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarEventInfoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarEventInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarEventInfoRequest(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, ByteString.EMPTY);
    }

    public GetCalendarEventInfoRequest(String str, String str2, Long l, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.token = str3;
    }
}
