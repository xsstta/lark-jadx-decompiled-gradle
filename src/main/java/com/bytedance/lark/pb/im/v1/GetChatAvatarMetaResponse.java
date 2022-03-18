package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AvatarMeta;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetChatAvatarMetaResponse extends Message<GetChatAvatarMetaResponse, C17496a> {
    public static final ProtoAdapter<GetChatAvatarMetaResponse> ADAPTER = new C17497b();
    private static final long serialVersionUID = 0;
    public final AvatarMeta avatar_meta;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatAvatarMetaResponse$b */
    private static final class C17497b extends ProtoAdapter<GetChatAvatarMetaResponse> {
        C17497b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatAvatarMetaResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatAvatarMetaResponse getChatAvatarMetaResponse) {
            return AvatarMeta.ADAPTER.encodedSizeWithTag(1, getChatAvatarMetaResponse.avatar_meta) + getChatAvatarMetaResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatAvatarMetaResponse decode(ProtoReader protoReader) throws IOException {
            C17496a aVar = new C17496a();
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
                    aVar.f44404a = AvatarMeta.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatAvatarMetaResponse getChatAvatarMetaResponse) throws IOException {
            AvatarMeta.ADAPTER.encodeWithTag(protoWriter, 1, getChatAvatarMetaResponse.avatar_meta);
            protoWriter.writeBytes(getChatAvatarMetaResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatAvatarMetaResponse$a */
    public static final class C17496a extends Message.Builder<GetChatAvatarMetaResponse, C17496a> {

        /* renamed from: a */
        public AvatarMeta f44404a;

        /* renamed from: a */
        public GetChatAvatarMetaResponse build() {
            AvatarMeta avatarMeta = this.f44404a;
            if (avatarMeta != null) {
                return new GetChatAvatarMetaResponse(avatarMeta, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(avatarMeta, "avatar_meta");
        }
    }

    @Override // com.squareup.wire.Message
    public C17496a newBuilder() {
        C17496a aVar = new C17496a();
        aVar.f44404a = this.avatar_meta;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatAvatarMetaResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", avatar_meta=");
        sb.append(this.avatar_meta);
        StringBuilder replace = sb.replace(0, 2, "GetChatAvatarMetaResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatAvatarMetaResponse(AvatarMeta avatarMeta) {
        this(avatarMeta, ByteString.EMPTY);
    }

    public GetChatAvatarMetaResponse(AvatarMeta avatarMeta, ByteString byteString) {
        super(ADAPTER, byteString);
        this.avatar_meta = avatarMeta;
    }
}
