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

public final class GetGoogleAuthURLResponse extends Message<GetGoogleAuthURLResponse, C15710a> {
    public static final ProtoAdapter<GetGoogleAuthURLResponse> ADAPTER = new C15711b();
    public static final Boolean DEFAULT_TOKEN_EXIST = false;
    private static final long serialVersionUID = 0;
    public final String auth_url;
    public final Boolean token_exist;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetGoogleAuthURLResponse$b */
    private static final class C15711b extends ProtoAdapter<GetGoogleAuthURLResponse> {
        C15711b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGoogleAuthURLResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetGoogleAuthURLResponse getGoogleAuthURLResponse) {
            int i;
            if (getGoogleAuthURLResponse.auth_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getGoogleAuthURLResponse.auth_url);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.BOOL.encodedSizeWithTag(2, getGoogleAuthURLResponse.token_exist) + getGoogleAuthURLResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetGoogleAuthURLResponse decode(ProtoReader protoReader) throws IOException {
            C15710a aVar = new C15710a();
            aVar.f41469a = "";
            aVar.f41470b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41469a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41470b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetGoogleAuthURLResponse getGoogleAuthURLResponse) throws IOException {
            if (getGoogleAuthURLResponse.auth_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getGoogleAuthURLResponse.auth_url);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getGoogleAuthURLResponse.token_exist);
            protoWriter.writeBytes(getGoogleAuthURLResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetGoogleAuthURLResponse$a */
    public static final class C15710a extends Message.Builder<GetGoogleAuthURLResponse, C15710a> {

        /* renamed from: a */
        public String f41469a;

        /* renamed from: b */
        public Boolean f41470b;

        /* renamed from: a */
        public GetGoogleAuthURLResponse build() {
            Boolean bool = this.f41470b;
            if (bool != null) {
                return new GetGoogleAuthURLResponse(this.f41469a, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "token_exist");
        }
    }

    @Override // com.squareup.wire.Message
    public C15710a newBuilder() {
        C15710a aVar = new C15710a();
        aVar.f41469a = this.auth_url;
        aVar.f41470b = this.token_exist;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetGoogleAuthURLResponse");
        StringBuilder sb = new StringBuilder();
        if (this.auth_url != null) {
            sb.append(", auth_url=");
            sb.append(this.auth_url);
        }
        sb.append(", token_exist=");
        sb.append(this.token_exist);
        StringBuilder replace = sb.replace(0, 2, "GetGoogleAuthURLResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetGoogleAuthURLResponse(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public GetGoogleAuthURLResponse(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.auth_url = str;
        this.token_exist = bool;
    }
}
