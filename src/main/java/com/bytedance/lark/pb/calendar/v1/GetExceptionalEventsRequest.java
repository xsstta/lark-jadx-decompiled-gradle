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

public final class GetExceptionalEventsRequest extends Message<GetExceptionalEventsRequest, C15704a> {
    public static final ProtoAdapter<GetExceptionalEventsRequest> ADAPTER = new C15705b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final Long end_time;
    public final String key;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetExceptionalEventsRequest$b */
    private static final class C15705b extends ProtoAdapter<GetExceptionalEventsRequest> {
        C15705b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetExceptionalEventsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetExceptionalEventsRequest getExceptionalEventsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getExceptionalEventsRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getExceptionalEventsRequest.key);
            int i2 = 0;
            if (getExceptionalEventsRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(3, getExceptionalEventsRequest.start_time);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getExceptionalEventsRequest.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(4, getExceptionalEventsRequest.end_time);
            }
            return i3 + i2 + getExceptionalEventsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetExceptionalEventsRequest decode(ProtoReader protoReader) throws IOException {
            C15704a aVar = new C15704a();
            aVar.f41461a = "";
            aVar.f41462b = "";
            aVar.f41463c = 0L;
            aVar.f41464d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41461a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41462b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41463c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41464d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetExceptionalEventsRequest getExceptionalEventsRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getExceptionalEventsRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getExceptionalEventsRequest.key);
            if (getExceptionalEventsRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getExceptionalEventsRequest.start_time);
            }
            if (getExceptionalEventsRequest.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getExceptionalEventsRequest.end_time);
            }
            protoWriter.writeBytes(getExceptionalEventsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15704a newBuilder() {
        C15704a aVar = new C15704a();
        aVar.f41461a = this.calendar_id;
        aVar.f41462b = this.key;
        aVar.f41463c = this.start_time;
        aVar.f41464d = this.end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetExceptionalEventsRequest$a */
    public static final class C15704a extends Message.Builder<GetExceptionalEventsRequest, C15704a> {

        /* renamed from: a */
        public String f41461a;

        /* renamed from: b */
        public String f41462b;

        /* renamed from: c */
        public Long f41463c;

        /* renamed from: d */
        public Long f41464d;

        /* renamed from: a */
        public GetExceptionalEventsRequest build() {
            String str;
            String str2 = this.f41461a;
            if (str2 != null && (str = this.f41462b) != null) {
                return new GetExceptionalEventsRequest(str2, str, this.f41463c, this.f41464d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41462b, "key");
        }

        /* renamed from: a */
        public C15704a mo56826a(String str) {
            this.f41461a = str;
            return this;
        }

        /* renamed from: b */
        public C15704a mo56828b(String str) {
            this.f41462b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetExceptionalEventsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetExceptionalEventsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetExceptionalEventsRequest(String str, String str2, Long l, Long l2) {
        this(str, str2, l, l2, ByteString.EMPTY);
    }

    public GetExceptionalEventsRequest(String str, String str2, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.start_time = l;
        this.end_time = l2;
    }
}
