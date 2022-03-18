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

public final class GetMeetingEventRequest extends Message<GetMeetingEventRequest, C15728a> {
    public static final ProtoAdapter<GetMeetingEventRequest> ADAPTER = new C15729b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Long original_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingEventRequest$b */
    private static final class C15729b extends ProtoAdapter<GetMeetingEventRequest> {
        C15729b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingEventRequest getMeetingEventRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getMeetingEventRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getMeetingEventRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, getMeetingEventRequest.original_time) + getMeetingEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingEventRequest decode(ProtoReader protoReader) throws IOException {
            C15728a aVar = new C15728a();
            aVar.f41487a = "";
            aVar.f41488b = "";
            aVar.f41489c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41487a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41488b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41489c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingEventRequest getMeetingEventRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMeetingEventRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getMeetingEventRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getMeetingEventRequest.original_time);
            protoWriter.writeBytes(getMeetingEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15728a newBuilder() {
        C15728a aVar = new C15728a();
        aVar.f41487a = this.calendar_id;
        aVar.f41488b = this.key;
        aVar.f41489c = this.original_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingEventRequest$a */
    public static final class C15728a extends Message.Builder<GetMeetingEventRequest, C15728a> {

        /* renamed from: a */
        public String f41487a;

        /* renamed from: b */
        public String f41488b;

        /* renamed from: c */
        public Long f41489c;

        /* renamed from: a */
        public GetMeetingEventRequest build() {
            String str;
            Long l;
            String str2 = this.f41487a;
            if (str2 != null && (str = this.f41488b) != null && (l = this.f41489c) != null) {
                return new GetMeetingEventRequest(str2, str, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41488b, "key", this.f41489c, "original_time");
        }

        /* renamed from: a */
        public C15728a mo56883a(Long l) {
            this.f41489c = l;
            return this;
        }

        /* renamed from: b */
        public C15728a mo56886b(String str) {
            this.f41488b = str;
            return this;
        }

        /* renamed from: a */
        public C15728a mo56884a(String str) {
            this.f41487a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetMeetingEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        StringBuilder replace = sb.replace(0, 2, "GetMeetingEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingEventRequest(String str, String str2, Long l) {
        this(str, str2, l, ByteString.EMPTY);
    }

    public GetMeetingEventRequest(String str, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
    }
}
