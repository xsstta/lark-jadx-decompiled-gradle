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

public final class GenPwdForCalDAVUserRequest extends Message<GenPwdForCalDAVUserRequest, C15628a> {
    public static final ProtoAdapter<GenPwdForCalDAVUserRequest> ADAPTER = new C15629b();
    private static final long serialVersionUID = 0;
    public final String password_name;
    public final String user_name;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GenPwdForCalDAVUserRequest$b */
    private static final class C15629b extends ProtoAdapter<GenPwdForCalDAVUserRequest> {
        C15629b() {
            super(FieldEncoding.LENGTH_DELIMITED, GenPwdForCalDAVUserRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GenPwdForCalDAVUserRequest genPwdForCalDAVUserRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, genPwdForCalDAVUserRequest.user_name);
            if (genPwdForCalDAVUserRequest.password_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, genPwdForCalDAVUserRequest.password_name);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + genPwdForCalDAVUserRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GenPwdForCalDAVUserRequest decode(ProtoReader protoReader) throws IOException {
            C15628a aVar = new C15628a();
            aVar.f41386a = "";
            aVar.f41387b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41386a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41387b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GenPwdForCalDAVUserRequest genPwdForCalDAVUserRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, genPwdForCalDAVUserRequest.user_name);
            if (genPwdForCalDAVUserRequest.password_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, genPwdForCalDAVUserRequest.password_name);
            }
            protoWriter.writeBytes(genPwdForCalDAVUserRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GenPwdForCalDAVUserRequest$a */
    public static final class C15628a extends Message.Builder<GenPwdForCalDAVUserRequest, C15628a> {

        /* renamed from: a */
        public String f41386a;

        /* renamed from: b */
        public String f41387b;

        /* renamed from: a */
        public GenPwdForCalDAVUserRequest build() {
            String str = this.f41386a;
            if (str != null) {
                return new GenPwdForCalDAVUserRequest(str, this.f41387b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "user_name");
        }
    }

    @Override // com.squareup.wire.Message
    public C15628a newBuilder() {
        C15628a aVar = new C15628a();
        aVar.f41386a = this.user_name;
        aVar.f41387b = this.password_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GenPwdForCalDAVUserRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_name=");
        sb.append(this.user_name);
        if (this.password_name != null) {
            sb.append(", password_name=");
            sb.append(this.password_name);
        }
        StringBuilder replace = sb.replace(0, 2, "GenPwdForCalDAVUserRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GenPwdForCalDAVUserRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public GenPwdForCalDAVUserRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_name = str;
        this.password_name = str2;
    }
}
