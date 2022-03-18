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

public final class GetEventRequest extends Message<GetEventRequest, C15700a> {
    public static final ProtoAdapter<GetEventRequest> ADAPTER = new C15701b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Long original_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetEventRequest$b */
    private static final class C15701b extends ProtoAdapter<GetEventRequest> {
        C15701b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEventRequest getEventRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getEventRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getEventRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, getEventRequest.original_time) + getEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetEventRequest decode(ProtoReader protoReader) throws IOException {
            C15700a aVar = new C15700a();
            aVar.f41457a = "";
            aVar.f41458b = "";
            aVar.f41459c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41457a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41458b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41459c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEventRequest getEventRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getEventRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getEventRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getEventRequest.original_time);
            protoWriter.writeBytes(getEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15700a newBuilder() {
        C15700a aVar = new C15700a();
        aVar.f41457a = this.calendar_id;
        aVar.f41458b = this.key;
        aVar.f41459c = this.original_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetEventRequest$a */
    public static final class C15700a extends Message.Builder<GetEventRequest, C15700a> {

        /* renamed from: a */
        public String f41457a;

        /* renamed from: b */
        public String f41458b;

        /* renamed from: c */
        public Long f41459c;

        /* renamed from: a */
        public GetEventRequest build() {
            String str;
            Long l;
            String str2 = this.f41457a;
            if (str2 != null && (str = this.f41458b) != null && (l = this.f41459c) != null) {
                return new GetEventRequest(str2, str, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41458b, "key", this.f41459c, "original_time");
        }

        /* renamed from: a */
        public C15700a mo56815a(Long l) {
            this.f41459c = l;
            return this;
        }

        /* renamed from: b */
        public C15700a mo56818b(String str) {
            this.f41458b = str;
            return this;
        }

        /* renamed from: a */
        public C15700a mo56816a(String str) {
            this.f41457a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        StringBuilder replace = sb.replace(0, 2, "GetEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetEventRequest(String str, String str2, Long l) {
        this(str, str2, l, ByteString.EMPTY);
    }

    public GetEventRequest(String str, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
    }
}
