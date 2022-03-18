package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GenPwdForCalDAVUserResponse extends Message<GenPwdForCalDAVUserResponse, C15630a> {
    public static final ProtoAdapter<GenPwdForCalDAVUserResponse> ADAPTER = new C15631b();
    private static final long serialVersionUID = 0;
    public final String password;
    public final String password_name;
    public final String server_address;
    public final String server_port;
    public final String user_name;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GenPwdForCalDAVUserResponse$b */
    private static final class C15631b extends ProtoAdapter<GenPwdForCalDAVUserResponse> {
        C15631b() {
            super(FieldEncoding.LENGTH_DELIMITED, GenPwdForCalDAVUserResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GenPwdForCalDAVUserResponse genPwdForCalDAVUserResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, genPwdForCalDAVUserResponse.user_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, genPwdForCalDAVUserResponse.password) + ProtoAdapter.STRING.encodedSizeWithTag(3, genPwdForCalDAVUserResponse.server_address);
            int i2 = 0;
            if (genPwdForCalDAVUserResponse.server_port != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, genPwdForCalDAVUserResponse.server_port);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (genPwdForCalDAVUserResponse.password_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, genPwdForCalDAVUserResponse.password_name);
            }
            return i3 + i2 + genPwdForCalDAVUserResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GenPwdForCalDAVUserResponse decode(ProtoReader protoReader) throws IOException {
            C15630a aVar = new C15630a();
            aVar.f41388a = "";
            aVar.f41389b = "";
            aVar.f41390c = "";
            aVar.f41391d = "";
            aVar.f41392e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41388a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41389b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41390c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f41391d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41392e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GenPwdForCalDAVUserResponse genPwdForCalDAVUserResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, genPwdForCalDAVUserResponse.user_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, genPwdForCalDAVUserResponse.password);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, genPwdForCalDAVUserResponse.server_address);
            if (genPwdForCalDAVUserResponse.server_port != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, genPwdForCalDAVUserResponse.server_port);
            }
            if (genPwdForCalDAVUserResponse.password_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, genPwdForCalDAVUserResponse.password_name);
            }
            protoWriter.writeBytes(genPwdForCalDAVUserResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GenPwdForCalDAVUserResponse$a */
    public static final class C15630a extends Message.Builder<GenPwdForCalDAVUserResponse, C15630a> {

        /* renamed from: a */
        public String f41388a;

        /* renamed from: b */
        public String f41389b;

        /* renamed from: c */
        public String f41390c;

        /* renamed from: d */
        public String f41391d;

        /* renamed from: e */
        public String f41392e;

        /* renamed from: a */
        public GenPwdForCalDAVUserResponse build() {
            String str;
            String str2;
            String str3 = this.f41388a;
            if (str3 != null && (str = this.f41389b) != null && (str2 = this.f41390c) != null) {
                return new GenPwdForCalDAVUserResponse(str3, str, str2, this.f41391d, this.f41392e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "user_name", this.f41389b, "password", this.f41390c, "server_address");
        }
    }

    @Override // com.squareup.wire.Message
    public C15630a newBuilder() {
        C15630a aVar = new C15630a();
        aVar.f41388a = this.user_name;
        aVar.f41389b = this.password;
        aVar.f41390c = this.server_address;
        aVar.f41391d = this.server_port;
        aVar.f41392e = this.password_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GenPwdForCalDAVUserResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_name=");
        sb.append(this.user_name);
        sb.append(", password=");
        sb.append(this.password);
        sb.append(", server_address=");
        sb.append(this.server_address);
        if (this.server_port != null) {
            sb.append(", server_port=");
            sb.append(this.server_port);
        }
        if (this.password_name != null) {
            sb.append(", password_name=");
            sb.append(this.password_name);
        }
        StringBuilder replace = sb.replace(0, 2, "GenPwdForCalDAVUserResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GenPwdForCalDAVUserResponse(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public GenPwdForCalDAVUserResponse(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_name = str;
        this.password = str2;
        this.server_address = str3;
        this.server_port = str4;
        this.password_name = str5;
    }
}
