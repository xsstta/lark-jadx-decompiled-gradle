package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CancelEnterprisePhoneRequest extends Message<CancelEnterprisePhoneRequest, C50278a> {
    public static final ProtoAdapter<CancelEnterprisePhoneRequest> ADAPTER = new C50279b();
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final String menterprise_phone_id;

    /* renamed from: com.ss.android.lark.pb.videochat.CancelEnterprisePhoneRequest$b */
    private static final class C50279b extends ProtoAdapter<CancelEnterprisePhoneRequest> {
        C50279b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelEnterprisePhoneRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelEnterprisePhoneRequest cancelEnterprisePhoneRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, cancelEnterprisePhoneRequest.menterprise_phone_id);
            if (cancelEnterprisePhoneRequest.mchat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, cancelEnterprisePhoneRequest.mchat_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + cancelEnterprisePhoneRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CancelEnterprisePhoneRequest decode(ProtoReader protoReader) throws IOException {
            C50278a aVar = new C50278a();
            aVar.f125643a = "";
            aVar.f125644b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125643a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125644b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelEnterprisePhoneRequest cancelEnterprisePhoneRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cancelEnterprisePhoneRequest.menterprise_phone_id);
            if (cancelEnterprisePhoneRequest.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cancelEnterprisePhoneRequest.mchat_id);
            }
            protoWriter.writeBytes(cancelEnterprisePhoneRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.CancelEnterprisePhoneRequest$a */
    public static final class C50278a extends Message.Builder<CancelEnterprisePhoneRequest, C50278a> {

        /* renamed from: a */
        public String f125643a;

        /* renamed from: b */
        public String f125644b;

        /* renamed from: a */
        public CancelEnterprisePhoneRequest build() {
            String str = this.f125643a;
            if (str != null) {
                return new CancelEnterprisePhoneRequest(str, this.f125644b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "menterprise_phone_id");
        }

        /* renamed from: a */
        public C50278a mo174430a(String str) {
            this.f125643a = str;
            return this;
        }

        /* renamed from: b */
        public C50278a mo174432b(String str) {
            this.f125644b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50278a newBuilder() {
        C50278a aVar = new C50278a();
        aVar.f125643a = this.menterprise_phone_id;
        aVar.f125644b = this.mchat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", enterprise_phone_id=");
        sb.append(this.menterprise_phone_id);
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "CancelEnterprisePhoneRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CancelEnterprisePhoneRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public CancelEnterprisePhoneRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.menterprise_phone_id = str;
        this.mchat_id = str2;
    }
}
