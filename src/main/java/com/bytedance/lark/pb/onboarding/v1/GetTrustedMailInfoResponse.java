package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetTrustedMailInfoResponse extends Message<GetTrustedMailInfoResponse, C18596a> {
    public static final ProtoAdapter<GetTrustedMailInfoResponse> ADAPTER = new C18597b();
    public static final Boolean DEFAULT_NEED_SET = false;
    private static final long serialVersionUID = 0;
    public final String mail;
    public final Boolean need_set;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetTrustedMailInfoResponse$b */
    private static final class C18597b extends ProtoAdapter<GetTrustedMailInfoResponse> {
        C18597b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTrustedMailInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTrustedMailInfoResponse getTrustedMailInfoResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, getTrustedMailInfoResponse.need_set);
            if (getTrustedMailInfoResponse.mail != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getTrustedMailInfoResponse.mail);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getTrustedMailInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTrustedMailInfoResponse decode(ProtoReader protoReader) throws IOException {
            C18596a aVar = new C18596a();
            aVar.f46101a = false;
            aVar.f46102b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46101a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46102b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTrustedMailInfoResponse getTrustedMailInfoResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getTrustedMailInfoResponse.need_set);
            if (getTrustedMailInfoResponse.mail != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getTrustedMailInfoResponse.mail);
            }
            protoWriter.writeBytes(getTrustedMailInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetTrustedMailInfoResponse$a */
    public static final class C18596a extends Message.Builder<GetTrustedMailInfoResponse, C18596a> {

        /* renamed from: a */
        public Boolean f46101a;

        /* renamed from: b */
        public String f46102b;

        /* renamed from: a */
        public GetTrustedMailInfoResponse build() {
            Boolean bool = this.f46101a;
            if (bool != null) {
                return new GetTrustedMailInfoResponse(bool, this.f46102b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "need_set");
        }
    }

    @Override // com.squareup.wire.Message
    public C18596a newBuilder() {
        C18596a aVar = new C18596a();
        aVar.f46101a = this.need_set;
        aVar.f46102b = this.mail;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "GetTrustedMailInfoResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", need_set=");
        sb.append(this.need_set);
        if (this.mail != null) {
            sb.append(", mail=");
            sb.append(this.mail);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTrustedMailInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTrustedMailInfoResponse(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public GetTrustedMailInfoResponse(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.need_set = bool;
        this.mail = str;
    }
}
