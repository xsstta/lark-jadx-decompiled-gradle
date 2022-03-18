package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CheckEnterprisePhoneQuotaRequest extends Message<CheckEnterprisePhoneQuotaRequest, C50282a> {
    public static final ProtoAdapter<CheckEnterprisePhoneQuotaRequest> ADAPTER = new C50283b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videochat.CheckEnterprisePhoneQuotaRequest$b */
    private static final class C50283b extends ProtoAdapter<CheckEnterprisePhoneQuotaRequest> {
        C50283b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckEnterprisePhoneQuotaRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckEnterprisePhoneQuotaRequest checkEnterprisePhoneQuotaRequest) {
            return checkEnterprisePhoneQuotaRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckEnterprisePhoneQuotaRequest decode(ProtoReader protoReader) throws IOException {
            C50282a aVar = new C50282a();
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
        public void encode(ProtoWriter protoWriter, CheckEnterprisePhoneQuotaRequest checkEnterprisePhoneQuotaRequest) throws IOException {
            protoWriter.writeBytes(checkEnterprisePhoneQuotaRequest.unknownFields());
        }
    }

    public CheckEnterprisePhoneQuotaRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videochat.CheckEnterprisePhoneQuotaRequest$a */
    public static final class C50282a extends Message.Builder<CheckEnterprisePhoneQuotaRequest, C50282a> {
        /* renamed from: a */
        public CheckEnterprisePhoneQuotaRequest build() {
            return new CheckEnterprisePhoneQuotaRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50282a newBuilder() {
        C50282a aVar = new C50282a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "CheckEnterprisePhoneQuotaRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckEnterprisePhoneQuotaRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
