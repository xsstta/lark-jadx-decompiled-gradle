package com.bytedance.lark.pb.block.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BlockExtensionEntity extends Message<BlockExtensionEntity, C15466a> {
    public static final ProtoAdapter<BlockExtensionEntity> ADAPTER = new C15467b();
    private static final long serialVersionUID = 0;
    public final String content;
    public final String ext_type;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.block.v1.BlockExtensionEntity$b */
    private static final class C15467b extends ProtoAdapter<BlockExtensionEntity> {
        C15467b() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockExtensionEntity.class);
        }

        /* renamed from: a */
        public int encodedSize(BlockExtensionEntity blockExtensionEntity) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, blockExtensionEntity.ext_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, blockExtensionEntity.id);
            if (blockExtensionEntity.content != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, blockExtensionEntity.content);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + blockExtensionEntity.unknownFields().size();
        }

        /* renamed from: a */
        public BlockExtensionEntity decode(ProtoReader protoReader) throws IOException {
            C15466a aVar = new C15466a();
            aVar.f40922a = "";
            aVar.f40923b = "";
            aVar.f40924c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40922a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40923b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40924c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BlockExtensionEntity blockExtensionEntity) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, blockExtensionEntity.ext_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, blockExtensionEntity.id);
            if (blockExtensionEntity.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, blockExtensionEntity.content);
            }
            protoWriter.writeBytes(blockExtensionEntity.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15466a newBuilder() {
        C15466a aVar = new C15466a();
        aVar.f40922a = this.ext_type;
        aVar.f40923b = this.id;
        aVar.f40924c = this.content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.BlockExtensionEntity$a */
    public static final class C15466a extends Message.Builder<BlockExtensionEntity, C15466a> {

        /* renamed from: a */
        public String f40922a;

        /* renamed from: b */
        public String f40923b;

        /* renamed from: c */
        public String f40924c;

        /* renamed from: a */
        public BlockExtensionEntity build() {
            String str;
            String str2 = this.f40922a;
            if (str2 != null && (str = this.f40923b) != null) {
                return new BlockExtensionEntity(str2, str, this.f40924c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "ext_type", this.f40923b, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "BlockExtensionEntity");
        StringBuilder sb = new StringBuilder();
        sb.append(", ext_type=");
        sb.append(this.ext_type);
        sb.append(", id=");
        sb.append(this.id);
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "BlockExtensionEntity{");
        replace.append('}');
        return replace.toString();
    }

    public BlockExtensionEntity(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public BlockExtensionEntity(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ext_type = str;
        this.id = str2;
        this.content = str3;
    }
}
