package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetAnonymousInfoResponse extends Message<GetAnonymousInfoResponse, C17472a> {
    public static final ProtoAdapter<GetAnonymousInfoResponse> ADAPTER = new C17473b();
    public static final Long DEFAULT_LEFT_QUOTA = 0L;
    public static final Long DEFAULT_TOTAL_QUOTA = 0L;
    private static final long serialVersionUID = 0;
    public final Long left_quota;
    public final Long total_quota;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAnonymousInfoResponse$b */
    private static final class C17473b extends ProtoAdapter<GetAnonymousInfoResponse> {
        C17473b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAnonymousInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAnonymousInfoResponse getAnonymousInfoResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, getAnonymousInfoResponse.left_quota);
            if (getAnonymousInfoResponse.total_quota != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, getAnonymousInfoResponse.total_quota);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getAnonymousInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAnonymousInfoResponse decode(ProtoReader protoReader) throws IOException {
            C17472a aVar = new C17472a();
            aVar.f44360a = 0L;
            aVar.f44361b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44360a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44361b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAnonymousInfoResponse getAnonymousInfoResponse) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getAnonymousInfoResponse.left_quota);
            if (getAnonymousInfoResponse.total_quota != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getAnonymousInfoResponse.total_quota);
            }
            protoWriter.writeBytes(getAnonymousInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAnonymousInfoResponse$a */
    public static final class C17472a extends Message.Builder<GetAnonymousInfoResponse, C17472a> {

        /* renamed from: a */
        public Long f44360a;

        /* renamed from: b */
        public Long f44361b;

        /* renamed from: a */
        public GetAnonymousInfoResponse build() {
            Long l = this.f44360a;
            if (l != null) {
                return new GetAnonymousInfoResponse(l, this.f44361b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "left_quota");
        }
    }

    @Override // com.squareup.wire.Message
    public C17472a newBuilder() {
        C17472a aVar = new C17472a();
        aVar.f44360a = this.left_quota;
        aVar.f44361b = this.total_quota;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetAnonymousInfoResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", left_quota=");
        sb.append(this.left_quota);
        if (this.total_quota != null) {
            sb.append(", total_quota=");
            sb.append(this.total_quota);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAnonymousInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAnonymousInfoResponse(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public GetAnonymousInfoResponse(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.left_quota = l;
        this.total_quota = l2;
    }
}
