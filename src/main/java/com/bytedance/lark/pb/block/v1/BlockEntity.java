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

public final class BlockEntity extends Message<BlockEntity, C15464a> {
    public static final ProtoAdapter<BlockEntity> ADAPTER = new C15465b();
    private static final long serialVersionUID = 0;
    public final String commits;
    public final String entity;
    public final String extensions;
    public final String id;
    public final String versions;

    /* renamed from: com.bytedance.lark.pb.block.v1.BlockEntity$b */
    private static final class C15465b extends ProtoAdapter<BlockEntity> {
        C15465b() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockEntity.class);
        }

        /* renamed from: a */
        public int encodedSize(BlockEntity blockEntity) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, blockEntity.id);
            int i4 = 0;
            if (blockEntity.entity != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, blockEntity.entity);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (blockEntity.extensions != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, blockEntity.extensions);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (blockEntity.versions != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, blockEntity.versions);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (blockEntity.commits != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, blockEntity.commits);
            }
            return i7 + i4 + blockEntity.unknownFields().size();
        }

        /* renamed from: a */
        public BlockEntity decode(ProtoReader protoReader) throws IOException {
            C15464a aVar = new C15464a();
            aVar.f40917a = "";
            aVar.f40918b = "";
            aVar.f40919c = "";
            aVar.f40920d = "";
            aVar.f40921e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40917a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40918b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40919c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f40920d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40921e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BlockEntity blockEntity) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, blockEntity.id);
            if (blockEntity.entity != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, blockEntity.entity);
            }
            if (blockEntity.extensions != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, blockEntity.extensions);
            }
            if (blockEntity.versions != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, blockEntity.versions);
            }
            if (blockEntity.commits != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, blockEntity.commits);
            }
            protoWriter.writeBytes(blockEntity.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.BlockEntity$a */
    public static final class C15464a extends Message.Builder<BlockEntity, C15464a> {

        /* renamed from: a */
        public String f40917a;

        /* renamed from: b */
        public String f40918b;

        /* renamed from: c */
        public String f40919c;

        /* renamed from: d */
        public String f40920d;

        /* renamed from: e */
        public String f40921e;

        /* renamed from: a */
        public BlockEntity build() {
            String str = this.f40917a;
            if (str != null) {
                return new BlockEntity(str, this.f40918b, this.f40919c, this.f40920d, this.f40921e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15464a newBuilder() {
        C15464a aVar = new C15464a();
        aVar.f40917a = this.id;
        aVar.f40918b = this.entity;
        aVar.f40919c = this.extensions;
        aVar.f40920d = this.versions;
        aVar.f40921e = this.commits;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "BlockEntity");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.extensions != null) {
            sb.append(", extensions=");
            sb.append(this.extensions);
        }
        if (this.versions != null) {
            sb.append(", versions=");
            sb.append(this.versions);
        }
        if (this.commits != null) {
            sb.append(", commits=");
            sb.append(this.commits);
        }
        StringBuilder replace = sb.replace(0, 2, "BlockEntity{");
        replace.append('}');
        return replace.toString();
    }

    public BlockEntity(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public BlockEntity(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.entity = str2;
        this.extensions = str3;
        this.versions = str4;
        this.commits = str5;
    }
}
