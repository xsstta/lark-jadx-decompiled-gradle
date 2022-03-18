package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetPhoneQueryQuotaResponse extends Message<SetPhoneQueryQuotaResponse, C16398a> {
    public static final ProtoAdapter<SetPhoneQueryQuotaResponse> ADAPTER = new C16399b();
    private static final long serialVersionUID = 0;
    public final String msg;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetPhoneQueryQuotaResponse$b */
    private static final class C16399b extends ProtoAdapter<SetPhoneQueryQuotaResponse> {
        C16399b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetPhoneQueryQuotaResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetPhoneQueryQuotaResponse setPhoneQueryQuotaResponse) {
            int i;
            if (setPhoneQueryQuotaResponse.msg != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setPhoneQueryQuotaResponse.msg);
            } else {
                i = 0;
            }
            return i + setPhoneQueryQuotaResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetPhoneQueryQuotaResponse decode(ProtoReader protoReader) throws IOException {
            C16398a aVar = new C16398a();
            aVar.f42661a = "";
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
                    aVar.f42661a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetPhoneQueryQuotaResponse setPhoneQueryQuotaResponse) throws IOException {
            if (setPhoneQueryQuotaResponse.msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setPhoneQueryQuotaResponse.msg);
            }
            protoWriter.writeBytes(setPhoneQueryQuotaResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetPhoneQueryQuotaResponse$a */
    public static final class C16398a extends Message.Builder<SetPhoneQueryQuotaResponse, C16398a> {

        /* renamed from: a */
        public String f42661a;

        /* renamed from: a */
        public SetPhoneQueryQuotaResponse build() {
            return new SetPhoneQueryQuotaResponse(this.f42661a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16398a newBuilder() {
        C16398a aVar = new C16398a();
        aVar.f42661a = this.msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetPhoneQueryQuotaResponse");
        StringBuilder sb = new StringBuilder();
        if (this.msg != null) {
            sb.append(", msg=");
            sb.append(this.msg);
        }
        StringBuilder replace = sb.replace(0, 2, "SetPhoneQueryQuotaResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetPhoneQueryQuotaResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public SetPhoneQueryQuotaResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msg = str;
    }
}
