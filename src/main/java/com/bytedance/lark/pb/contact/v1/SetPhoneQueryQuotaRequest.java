package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetPhoneQueryQuotaRequest extends Message<SetPhoneQueryQuotaRequest, C16396a> {
    public static final ProtoAdapter<SetPhoneQueryQuotaRequest> ADAPTER = new C16397b();
    private static final long serialVersionUID = 0;
    public final String quota;
    public final String target_user_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetPhoneQueryQuotaRequest$b */
    private static final class C16397b extends ProtoAdapter<SetPhoneQueryQuotaRequest> {
        C16397b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetPhoneQueryQuotaRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetPhoneQueryQuotaRequest setPhoneQueryQuotaRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setPhoneQueryQuotaRequest.target_user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, setPhoneQueryQuotaRequest.quota) + setPhoneQueryQuotaRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetPhoneQueryQuotaRequest decode(ProtoReader protoReader) throws IOException {
            C16396a aVar = new C16396a();
            aVar.f42659a = "";
            aVar.f42660b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42659a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42660b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetPhoneQueryQuotaRequest setPhoneQueryQuotaRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setPhoneQueryQuotaRequest.target_user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setPhoneQueryQuotaRequest.quota);
            protoWriter.writeBytes(setPhoneQueryQuotaRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16396a newBuilder() {
        C16396a aVar = new C16396a();
        aVar.f42659a = this.target_user_id;
        aVar.f42660b = this.quota;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetPhoneQueryQuotaRequest$a */
    public static final class C16396a extends Message.Builder<SetPhoneQueryQuotaRequest, C16396a> {

        /* renamed from: a */
        public String f42659a;

        /* renamed from: b */
        public String f42660b;

        /* renamed from: a */
        public SetPhoneQueryQuotaRequest build() {
            String str;
            String str2 = this.f42659a;
            if (str2 != null && (str = this.f42660b) != null) {
                return new SetPhoneQueryQuotaRequest(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "target_user_id", this.f42660b, "quota");
        }

        /* renamed from: a */
        public C16396a mo58543a(String str) {
            this.f42659a = str;
            return this;
        }

        /* renamed from: b */
        public C16396a mo58545b(String str) {
            this.f42660b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetPhoneQueryQuotaRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", target_user_id=");
        sb.append(this.target_user_id);
        sb.append(", quota=");
        sb.append(this.quota);
        StringBuilder replace = sb.replace(0, 2, "SetPhoneQueryQuotaRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetPhoneQueryQuotaRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public SetPhoneQueryQuotaRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.target_user_id = str;
        this.quota = str2;
    }
}
