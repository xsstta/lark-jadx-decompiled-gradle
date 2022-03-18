package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GoogleToken extends Message<GoogleToken, C50729a> {
    public static final ProtoAdapter<GoogleToken> ADAPTER = new C50730b();
    private static final long serialVersionUID = 0;
    public final String access_token;
    public final String expiry_date;
    public final String platform;
    public final String refresh_token;
    public final String scope;
    public final String token_type;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GoogleToken$b */
    private static final class C50730b extends ProtoAdapter<GoogleToken> {
        C50730b() {
            super(FieldEncoding.LENGTH_DELIMITED, GoogleToken.class);
        }

        /* renamed from: a */
        public int encodedSize(GoogleToken googleToken) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, googleToken.access_token) + ProtoAdapter.STRING.encodedSizeWithTag(2, googleToken.refresh_token) + ProtoAdapter.STRING.encodedSizeWithTag(3, googleToken.scope) + ProtoAdapter.STRING.encodedSizeWithTag(4, googleToken.token_type) + ProtoAdapter.STRING.encodedSizeWithTag(5, googleToken.expiry_date);
            if (googleToken.platform != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(6, googleToken.platform);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + googleToken.unknownFields().size();
        }

        /* renamed from: a */
        public GoogleToken decode(ProtoReader protoReader) throws IOException {
            C50729a aVar = new C50729a();
            aVar.f126473a = "";
            aVar.f126474b = "";
            aVar.f126475c = "";
            aVar.f126476d = "";
            aVar.f126477e = "";
            aVar.f126478f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126473a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126474b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126475c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126476d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126477e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126478f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GoogleToken googleToken) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, googleToken.access_token);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, googleToken.refresh_token);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, googleToken.scope);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, googleToken.token_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, googleToken.expiry_date);
            if (googleToken.platform != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, googleToken.platform);
            }
            protoWriter.writeBytes(googleToken.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50729a newBuilder() {
        C50729a aVar = new C50729a();
        aVar.f126473a = this.access_token;
        aVar.f126474b = this.refresh_token;
        aVar.f126475c = this.scope;
        aVar.f126476d = this.token_type;
        aVar.f126477e = this.expiry_date;
        aVar.f126478f = this.platform;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GoogleToken$a */
    public static final class C50729a extends Message.Builder<GoogleToken, C50729a> {

        /* renamed from: a */
        public String f126473a;

        /* renamed from: b */
        public String f126474b;

        /* renamed from: c */
        public String f126475c;

        /* renamed from: d */
        public String f126476d;

        /* renamed from: e */
        public String f126477e;

        /* renamed from: f */
        public String f126478f;

        /* renamed from: a */
        public GoogleToken build() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5 = this.f126473a;
            if (str5 != null && (str = this.f126474b) != null && (str2 = this.f126475c) != null && (str3 = this.f126476d) != null && (str4 = this.f126477e) != null) {
                return new GoogleToken(str5, str, str2, str3, str4, this.f126478f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str5, "access_token", this.f126474b, "refresh_token", this.f126475c, "scope", this.f126476d, "token_type", this.f126477e, "expiry_date");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GoogleToken");
        StringBuilder sb = new StringBuilder();
        sb.append(", access_token=");
        sb.append(this.access_token);
        sb.append(", refresh_token=");
        sb.append(this.refresh_token);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", token_type=");
        sb.append(this.token_type);
        sb.append(", expiry_date=");
        sb.append(this.expiry_date);
        if (this.platform != null) {
            sb.append(", platform=");
            sb.append(this.platform);
        }
        StringBuilder replace = sb.replace(0, 2, "GoogleToken{");
        replace.append('}');
        return replace.toString();
    }

    public GoogleToken(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, ByteString.EMPTY);
    }

    public GoogleToken(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.access_token = str;
        this.refresh_token = str2;
        this.scope = str3;
        this.token_type = str4;
        this.expiry_date = str5;
        this.platform = str6;
    }
}
