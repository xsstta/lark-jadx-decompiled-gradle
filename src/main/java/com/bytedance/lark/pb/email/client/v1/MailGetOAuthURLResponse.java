package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MailGetOAuthURLResponse extends Message<MailGetOAuthURLResponse, C16760a> {
    public static final ProtoAdapter<MailGetOAuthURLResponse> ADAPTER = new C16761b();
    public static final Boolean DEFAULT_ACCESS_DENIED = false;
    public static final Boolean DEFAULT_TOKEN_EXIST = false;
    private static final long serialVersionUID = 0;
    public final Boolean access_denied;
    public final String oauth_url;
    public final Boolean token_exist;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetOAuthURLResponse$b */
    private static final class C16761b extends ProtoAdapter<MailGetOAuthURLResponse> {
        C16761b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetOAuthURLResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetOAuthURLResponse mailGetOAuthURLResponse) {
            int i;
            int i2 = 0;
            if (mailGetOAuthURLResponse.oauth_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetOAuthURLResponse.oauth_url);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.BOOL.encodedSizeWithTag(2, mailGetOAuthURLResponse.token_exist);
            if (mailGetOAuthURLResponse.access_denied != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mailGetOAuthURLResponse.access_denied);
            }
            return encodedSizeWithTag + i2 + mailGetOAuthURLResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetOAuthURLResponse decode(ProtoReader protoReader) throws IOException {
            C16760a aVar = new C16760a();
            aVar.f43229a = "";
            aVar.f43230b = false;
            aVar.f43231c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43229a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43230b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43231c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetOAuthURLResponse mailGetOAuthURLResponse) throws IOException {
            if (mailGetOAuthURLResponse.oauth_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetOAuthURLResponse.oauth_url);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailGetOAuthURLResponse.token_exist);
            if (mailGetOAuthURLResponse.access_denied != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mailGetOAuthURLResponse.access_denied);
            }
            protoWriter.writeBytes(mailGetOAuthURLResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16760a newBuilder() {
        C16760a aVar = new C16760a();
        aVar.f43229a = this.oauth_url;
        aVar.f43230b = this.token_exist;
        aVar.f43231c = this.access_denied;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetOAuthURLResponse$a */
    public static final class C16760a extends Message.Builder<MailGetOAuthURLResponse, C16760a> {

        /* renamed from: a */
        public String f43229a;

        /* renamed from: b */
        public Boolean f43230b;

        /* renamed from: c */
        public Boolean f43231c;

        /* renamed from: a */
        public MailGetOAuthURLResponse build() {
            Boolean bool = this.f43230b;
            if (bool != null) {
                return new MailGetOAuthURLResponse(this.f43229a, bool, this.f43231c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "token_exist");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetOAuthURLResponse");
        StringBuilder sb = new StringBuilder();
        if (this.oauth_url != null) {
            sb.append(", oauth_url=");
            sb.append(this.oauth_url);
        }
        sb.append(", token_exist=");
        sb.append(this.token_exist);
        if (this.access_denied != null) {
            sb.append(", access_denied=");
            sb.append(this.access_denied);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetOAuthURLResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetOAuthURLResponse(String str, Boolean bool, Boolean bool2) {
        this(str, bool, bool2, ByteString.EMPTY);
    }

    public MailGetOAuthURLResponse(String str, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.oauth_url = str;
        this.token_exist = bool;
        this.access_denied = bool2;
    }
}
