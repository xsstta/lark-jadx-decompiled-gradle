package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetEnterprisePhoneConfigResponse extends Message<GetEnterprisePhoneConfigResponse, C50320a> {
    public static final ProtoAdapter<GetEnterprisePhoneConfigResponse> ADAPTER = new C50321b();
    public static final Boolean DEFAULT_AUTHORIZED = false;
    private static final long serialVersionUID = 0;
    public final Boolean mauthorized;

    /* renamed from: com.ss.android.lark.pb.videochat.GetEnterprisePhoneConfigResponse$b */
    private static final class C50321b extends ProtoAdapter<GetEnterprisePhoneConfigResponse> {
        C50321b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEnterprisePhoneConfigResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEnterprisePhoneConfigResponse getEnterprisePhoneConfigResponse) {
            int i;
            if (getEnterprisePhoneConfigResponse.mauthorized != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getEnterprisePhoneConfigResponse.mauthorized);
            } else {
                i = 0;
            }
            return i + getEnterprisePhoneConfigResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetEnterprisePhoneConfigResponse decode(ProtoReader protoReader) throws IOException {
            C50320a aVar = new C50320a();
            aVar.f125701a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125701a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEnterprisePhoneConfigResponse getEnterprisePhoneConfigResponse) throws IOException {
            if (getEnterprisePhoneConfigResponse.mauthorized != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getEnterprisePhoneConfigResponse.mauthorized);
            }
            protoWriter.writeBytes(getEnterprisePhoneConfigResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetEnterprisePhoneConfigResponse$a */
    public static final class C50320a extends Message.Builder<GetEnterprisePhoneConfigResponse, C50320a> {

        /* renamed from: a */
        public Boolean f125701a;

        /* renamed from: a */
        public GetEnterprisePhoneConfigResponse build() {
            return new GetEnterprisePhoneConfigResponse(this.f125701a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50320a newBuilder() {
        C50320a aVar = new C50320a();
        aVar.f125701a = this.mauthorized;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mauthorized != null) {
            sb.append(", authorized=");
            sb.append(this.mauthorized);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEnterprisePhoneConfigResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetEnterprisePhoneConfigResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetEnterprisePhoneConfigResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mauthorized = bool;
    }
}
