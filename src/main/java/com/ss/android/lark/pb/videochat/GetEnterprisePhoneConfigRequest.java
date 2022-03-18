package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetEnterprisePhoneConfigRequest extends Message<GetEnterprisePhoneConfigRequest, C50318a> {
    public static final ProtoAdapter<GetEnterprisePhoneConfigRequest> ADAPTER = new C50319b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videochat.GetEnterprisePhoneConfigRequest$b */
    private static final class C50319b extends ProtoAdapter<GetEnterprisePhoneConfigRequest> {
        C50319b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEnterprisePhoneConfigRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEnterprisePhoneConfigRequest getEnterprisePhoneConfigRequest) {
            return getEnterprisePhoneConfigRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetEnterprisePhoneConfigRequest decode(ProtoReader protoReader) throws IOException {
            C50318a aVar = new C50318a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEnterprisePhoneConfigRequest getEnterprisePhoneConfigRequest) throws IOException {
            protoWriter.writeBytes(getEnterprisePhoneConfigRequest.unknownFields());
        }
    }

    public GetEnterprisePhoneConfigRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetEnterprisePhoneConfigRequest$a */
    public static final class C50318a extends Message.Builder<GetEnterprisePhoneConfigRequest, C50318a> {
        /* renamed from: a */
        public GetEnterprisePhoneConfigRequest build() {
            return new GetEnterprisePhoneConfigRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50318a newBuilder() {
        C50318a aVar = new C50318a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetEnterprisePhoneConfigRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetEnterprisePhoneConfigRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
