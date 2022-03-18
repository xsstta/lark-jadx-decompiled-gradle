package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CreateEnterprisePhoneResponse extends Message<CreateEnterprisePhoneResponse, C50288a> {
    public static final ProtoAdapter<CreateEnterprisePhoneResponse> ADAPTER = new C50289b();
    private static final long serialVersionUID = 0;
    public final String menterprise_phone_id;

    /* renamed from: com.ss.android.lark.pb.videochat.CreateEnterprisePhoneResponse$b */
    private static final class C50289b extends ProtoAdapter<CreateEnterprisePhoneResponse> {
        C50289b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateEnterprisePhoneResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateEnterprisePhoneResponse createEnterprisePhoneResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createEnterprisePhoneResponse.menterprise_phone_id) + createEnterprisePhoneResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateEnterprisePhoneResponse decode(ProtoReader protoReader) throws IOException {
            C50288a aVar = new C50288a();
            aVar.f125651a = "";
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
                    aVar.f125651a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateEnterprisePhoneResponse createEnterprisePhoneResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createEnterprisePhoneResponse.menterprise_phone_id);
            protoWriter.writeBytes(createEnterprisePhoneResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.CreateEnterprisePhoneResponse$a */
    public static final class C50288a extends Message.Builder<CreateEnterprisePhoneResponse, C50288a> {

        /* renamed from: a */
        public String f125651a;

        /* renamed from: a */
        public CreateEnterprisePhoneResponse build() {
            String str = this.f125651a;
            if (str != null) {
                return new CreateEnterprisePhoneResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "menterprise_phone_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50288a newBuilder() {
        C50288a aVar = new C50288a();
        aVar.f125651a = this.menterprise_phone_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", enterprise_phone_id=");
        sb.append(this.menterprise_phone_id);
        StringBuilder replace = sb.replace(0, 2, "CreateEnterprisePhoneResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateEnterprisePhoneResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public CreateEnterprisePhoneResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.menterprise_phone_id = str;
    }
}
