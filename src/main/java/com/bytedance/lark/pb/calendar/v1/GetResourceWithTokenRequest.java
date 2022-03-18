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

public final class GetResourceWithTokenRequest extends Message<GetResourceWithTokenRequest, C15776a> {
    public static final ProtoAdapter<GetResourceWithTokenRequest> ADAPTER = new C15777b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long end_time;
    public final String resource_token;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceWithTokenRequest$b */
    private static final class C15777b extends ProtoAdapter<GetResourceWithTokenRequest> {
        C15777b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetResourceWithTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetResourceWithTokenRequest getResourceWithTokenRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getResourceWithTokenRequest.resource_token) + ProtoAdapter.INT64.encodedSizeWithTag(2, getResourceWithTokenRequest.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, getResourceWithTokenRequest.end_time) + getResourceWithTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetResourceWithTokenRequest decode(ProtoReader protoReader) throws IOException {
            C15776a aVar = new C15776a();
            aVar.f41544a = "";
            aVar.f41545b = 0L;
            aVar.f41546c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41544a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41545b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41546c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetResourceWithTokenRequest getResourceWithTokenRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getResourceWithTokenRequest.resource_token);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getResourceWithTokenRequest.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getResourceWithTokenRequest.end_time);
            protoWriter.writeBytes(getResourceWithTokenRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15776a newBuilder() {
        C15776a aVar = new C15776a();
        aVar.f41544a = this.resource_token;
        aVar.f41545b = this.start_time;
        aVar.f41546c = this.end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceWithTokenRequest$a */
    public static final class C15776a extends Message.Builder<GetResourceWithTokenRequest, C15776a> {

        /* renamed from: a */
        public String f41544a;

        /* renamed from: b */
        public Long f41545b;

        /* renamed from: c */
        public Long f41546c;

        /* renamed from: a */
        public GetResourceWithTokenRequest build() {
            Long l;
            Long l2;
            String str = this.f41544a;
            if (str != null && (l = this.f41545b) != null && (l2 = this.f41546c) != null) {
                return new GetResourceWithTokenRequest(str, l, l2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "resource_token", this.f41545b, "start_time", this.f41546c, "end_time");
        }

        /* renamed from: a */
        public C15776a mo56998a(Long l) {
            this.f41545b = l;
            return this;
        }

        /* renamed from: b */
        public C15776a mo57001b(Long l) {
            this.f41546c = l;
            return this;
        }

        /* renamed from: a */
        public C15776a mo56999a(String str) {
            this.f41544a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetResourceWithTokenRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", resource_token=");
        sb.append(this.resource_token);
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", end_time=");
        sb.append(this.end_time);
        StringBuilder replace = sb.replace(0, 2, "GetResourceWithTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetResourceWithTokenRequest(String str, Long l, Long l2) {
        this(str, l, l2, ByteString.EMPTY);
    }

    public GetResourceWithTokenRequest(String str, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_token = str;
        this.start_time = l;
        this.end_time = l2;
    }
}
