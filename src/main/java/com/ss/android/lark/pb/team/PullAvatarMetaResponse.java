package com.ss.android.lark.pb.team;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.entities.AvatarMeta;
import java.io.IOException;
import okio.ByteString;

public final class PullAvatarMetaResponse extends Message<PullAvatarMetaResponse, C50068a> {
    public static final ProtoAdapter<PullAvatarMetaResponse> ADAPTER = new C50069b();
    private static final long serialVersionUID = 0;
    public final AvatarMeta mavatar_meta;

    /* renamed from: com.ss.android.lark.pb.team.PullAvatarMetaResponse$b */
    private static final class C50069b extends ProtoAdapter<PullAvatarMetaResponse> {
        C50069b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAvatarMetaResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAvatarMetaResponse pullAvatarMetaResponse) {
            int i;
            if (pullAvatarMetaResponse.mavatar_meta != null) {
                i = AvatarMeta.ADAPTER.encodedSizeWithTag(1, pullAvatarMetaResponse.mavatar_meta);
            } else {
                i = 0;
            }
            return i + pullAvatarMetaResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullAvatarMetaResponse decode(ProtoReader protoReader) throws IOException {
            C50068a aVar = new C50068a();
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
                    aVar.f125194a = AvatarMeta.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAvatarMetaResponse pullAvatarMetaResponse) throws IOException {
            if (pullAvatarMetaResponse.mavatar_meta != null) {
                AvatarMeta.ADAPTER.encodeWithTag(protoWriter, 1, pullAvatarMetaResponse.mavatar_meta);
            }
            protoWriter.writeBytes(pullAvatarMetaResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.team.PullAvatarMetaResponse$a */
    public static final class C50068a extends Message.Builder<PullAvatarMetaResponse, C50068a> {

        /* renamed from: a */
        public AvatarMeta f125194a;

        /* renamed from: a */
        public PullAvatarMetaResponse build() {
            return new PullAvatarMetaResponse(this.f125194a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50068a newBuilder() {
        C50068a aVar = new C50068a();
        aVar.f125194a = this.mavatar_meta;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mavatar_meta != null) {
            sb.append(", avatar_meta=");
            sb.append(this.mavatar_meta);
        }
        StringBuilder replace = sb.replace(0, 2, "PullAvatarMetaResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullAvatarMetaResponse(AvatarMeta avatarMeta) {
        this(avatarMeta, ByteString.EMPTY);
    }

    public PullAvatarMetaResponse(AvatarMeta avatarMeta, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mavatar_meta = avatarMeta;
    }
}
