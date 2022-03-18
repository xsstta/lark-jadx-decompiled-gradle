package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CancelEnterprisePhoneResponse extends Message<CancelEnterprisePhoneResponse, C50280a> {
    public static final ProtoAdapter<CancelEnterprisePhoneResponse> ADAPTER = new C50281b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videochat.CancelEnterprisePhoneResponse$b */
    private static final class C50281b extends ProtoAdapter<CancelEnterprisePhoneResponse> {
        C50281b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelEnterprisePhoneResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelEnterprisePhoneResponse cancelEnterprisePhoneResponse) {
            return cancelEnterprisePhoneResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CancelEnterprisePhoneResponse decode(ProtoReader protoReader) throws IOException {
            C50280a aVar = new C50280a();
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
        public void encode(ProtoWriter protoWriter, CancelEnterprisePhoneResponse cancelEnterprisePhoneResponse) throws IOException {
            protoWriter.writeBytes(cancelEnterprisePhoneResponse.unknownFields());
        }
    }

    public CancelEnterprisePhoneResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videochat.CancelEnterprisePhoneResponse$a */
    public static final class C50280a extends Message.Builder<CancelEnterprisePhoneResponse, C50280a> {
        /* renamed from: a */
        public CancelEnterprisePhoneResponse build() {
            return new CancelEnterprisePhoneResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50280a newBuilder() {
        C50280a aVar = new C50280a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "CancelEnterprisePhoneResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CancelEnterprisePhoneResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
