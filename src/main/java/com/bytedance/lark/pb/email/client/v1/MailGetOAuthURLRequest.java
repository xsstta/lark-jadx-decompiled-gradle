package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MailGetOAuthURLRequest extends Message<MailGetOAuthURLRequest, C16758a> {
    public static final ProtoAdapter<MailGetOAuthURLRequest> ADAPTER = new C16759b();
    public static final OAuthType DEFAULT_OAUTH_TYPE = OAuthType.GOOGLE;
    private static final long serialVersionUID = 0;
    public final OAuthType oauth_type;

    public enum OAuthType implements WireEnum {
        GOOGLE(0),
        EXCHANGE(1);
        
        public static final ProtoAdapter<OAuthType> ADAPTER = ProtoAdapter.newEnumAdapter(OAuthType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static OAuthType fromValue(int i) {
            if (i == 0) {
                return GOOGLE;
            }
            if (i != 1) {
                return null;
            }
            return EXCHANGE;
        }

        private OAuthType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetOAuthURLRequest$b */
    private static final class C16759b extends ProtoAdapter<MailGetOAuthURLRequest> {
        C16759b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetOAuthURLRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetOAuthURLRequest mailGetOAuthURLRequest) {
            return OAuthType.ADAPTER.encodedSizeWithTag(1, mailGetOAuthURLRequest.oauth_type) + mailGetOAuthURLRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetOAuthURLRequest decode(ProtoReader protoReader) throws IOException {
            C16758a aVar = new C16758a();
            aVar.f43228a = OAuthType.GOOGLE;
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
                    try {
                        aVar.f43228a = OAuthType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetOAuthURLRequest mailGetOAuthURLRequest) throws IOException {
            OAuthType.ADAPTER.encodeWithTag(protoWriter, 1, mailGetOAuthURLRequest.oauth_type);
            protoWriter.writeBytes(mailGetOAuthURLRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetOAuthURLRequest$a */
    public static final class C16758a extends Message.Builder<MailGetOAuthURLRequest, C16758a> {

        /* renamed from: a */
        public OAuthType f43228a;

        /* renamed from: a */
        public MailGetOAuthURLRequest build() {
            OAuthType oAuthType = this.f43228a;
            if (oAuthType != null) {
                return new MailGetOAuthURLRequest(oAuthType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(oAuthType, "oauth_type");
        }

        /* renamed from: a */
        public C16758a mo59455a(OAuthType oAuthType) {
            this.f43228a = oAuthType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16758a newBuilder() {
        C16758a aVar = new C16758a();
        aVar.f43228a = this.oauth_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetOAuthURLRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", oauth_type=");
        sb.append(this.oauth_type);
        StringBuilder replace = sb.replace(0, 2, "MailGetOAuthURLRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetOAuthURLRequest(OAuthType oAuthType) {
        this(oAuthType, ByteString.EMPTY);
    }

    public MailGetOAuthURLRequest(OAuthType oAuthType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.oauth_type = oAuthType;
    }
}
