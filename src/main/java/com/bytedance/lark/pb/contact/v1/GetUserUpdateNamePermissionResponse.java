package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserUpdateNamePermissionResponse extends Message<GetUserUpdateNamePermissionResponse, C16308a> {
    public static final ProtoAdapter<GetUserUpdateNamePermissionResponse> ADAPTER = new C16309b();
    public static final Boolean DEFAULT_ENABLE = false;
    private static final long serialVersionUID = 0;
    public final Boolean enable;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserUpdateNamePermissionResponse$b */
    private static final class C16309b extends ProtoAdapter<GetUserUpdateNamePermissionResponse> {
        C16309b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserUpdateNamePermissionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserUpdateNamePermissionResponse getUserUpdateNamePermissionResponse) {
            int i;
            if (getUserUpdateNamePermissionResponse.enable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getUserUpdateNamePermissionResponse.enable);
            } else {
                i = 0;
            }
            return i + getUserUpdateNamePermissionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserUpdateNamePermissionResponse decode(ProtoReader protoReader) throws IOException {
            C16308a aVar = new C16308a();
            aVar.f42544a = false;
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
                    aVar.f42544a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserUpdateNamePermissionResponse getUserUpdateNamePermissionResponse) throws IOException {
            if (getUserUpdateNamePermissionResponse.enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getUserUpdateNamePermissionResponse.enable);
            }
            protoWriter.writeBytes(getUserUpdateNamePermissionResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserUpdateNamePermissionResponse$a */
    public static final class C16308a extends Message.Builder<GetUserUpdateNamePermissionResponse, C16308a> {

        /* renamed from: a */
        public Boolean f42544a;

        /* renamed from: a */
        public GetUserUpdateNamePermissionResponse build() {
            return new GetUserUpdateNamePermissionResponse(this.f42544a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16308a newBuilder() {
        C16308a aVar = new C16308a();
        aVar.f42544a = this.enable;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserUpdateNamePermissionResponse");
        StringBuilder sb = new StringBuilder();
        if (this.enable != null) {
            sb.append(", enable=");
            sb.append(this.enable);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserUpdateNamePermissionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserUpdateNamePermissionResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetUserUpdateNamePermissionResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable = bool;
    }
}
