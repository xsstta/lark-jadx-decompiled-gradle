package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetChatLimitInfoResponse extends Message<GetChatLimitInfoResponse, C17518a> {
    public static final ProtoAdapter<GetChatLimitInfoResponse> ADAPTER = new C17519b();
    public static final Boolean DEFAULT_IS_LARGE_GROUP = false;
    public static final Boolean DEFAULT_IS_SUPER_GROUP = false;
    public static final Boolean DEFAULT_OPEN_SECURITY = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_large_group;
    public final Boolean is_super_group;
    public final Boolean open_security;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLimitInfoResponse$b */
    private static final class C17519b extends ProtoAdapter<GetChatLimitInfoResponse> {
        C17519b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatLimitInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatLimitInfoResponse getChatLimitInfoResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, getChatLimitInfoResponse.is_large_group) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getChatLimitInfoResponse.open_security);
            if (getChatLimitInfoResponse.is_super_group != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(3, getChatLimitInfoResponse.is_super_group);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getChatLimitInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatLimitInfoResponse decode(ProtoReader protoReader) throws IOException {
            C17518a aVar = new C17518a();
            aVar.f44444a = false;
            aVar.f44445b = false;
            aVar.f44446c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44444a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44445b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44446c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatLimitInfoResponse getChatLimitInfoResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getChatLimitInfoResponse.is_large_group);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getChatLimitInfoResponse.open_security);
            if (getChatLimitInfoResponse.is_super_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getChatLimitInfoResponse.is_super_group);
            }
            protoWriter.writeBytes(getChatLimitInfoResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17518a newBuilder() {
        C17518a aVar = new C17518a();
        aVar.f44444a = this.is_large_group;
        aVar.f44445b = this.open_security;
        aVar.f44446c = this.is_super_group;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLimitInfoResponse$a */
    public static final class C17518a extends Message.Builder<GetChatLimitInfoResponse, C17518a> {

        /* renamed from: a */
        public Boolean f44444a;

        /* renamed from: b */
        public Boolean f44445b;

        /* renamed from: c */
        public Boolean f44446c;

        /* renamed from: a */
        public GetChatLimitInfoResponse build() {
            Boolean bool;
            Boolean bool2 = this.f44444a;
            if (bool2 != null && (bool = this.f44445b) != null) {
                return new GetChatLimitInfoResponse(bool2, bool, this.f44446c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool2, "is_large_group", this.f44445b, "open_security");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatLimitInfoResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_large_group=");
        sb.append(this.is_large_group);
        sb.append(", open_security=");
        sb.append(this.open_security);
        if (this.is_super_group != null) {
            sb.append(", is_super_group=");
            sb.append(this.is_super_group);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatLimitInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatLimitInfoResponse(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public GetChatLimitInfoResponse(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_large_group = bool;
        this.open_security = bool2;
        this.is_super_group = bool3;
    }
}
