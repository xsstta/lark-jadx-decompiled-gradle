package com.bytedance.lark.pb.block.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BlockPushHeadServer extends Message<BlockPushHeadServer, C15470a> {
    public static final ProtoAdapter<BlockPushHeadServer> ADAPTER = new C15471b();
    public static final Long DEFAULT_CLIENT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long client_id;
    public final String command_type;

    /* renamed from: com.bytedance.lark.pb.block.v1.BlockPushHeadServer$b */
    private static final class C15471b extends ProtoAdapter<BlockPushHeadServer> {
        C15471b() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockPushHeadServer.class);
        }

        /* renamed from: a */
        public int encodedSize(BlockPushHeadServer blockPushHeadServer) {
            int i;
            int i2 = 0;
            if (blockPushHeadServer.client_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, blockPushHeadServer.client_id);
            } else {
                i = 0;
            }
            if (blockPushHeadServer.command_type != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, blockPushHeadServer.command_type);
            }
            return i + i2 + blockPushHeadServer.unknownFields().size();
        }

        /* renamed from: a */
        public BlockPushHeadServer decode(ProtoReader protoReader) throws IOException {
            C15470a aVar = new C15470a();
            aVar.f40927a = 0L;
            aVar.f40928b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40927a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40928b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BlockPushHeadServer blockPushHeadServer) throws IOException {
            if (blockPushHeadServer.client_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, blockPushHeadServer.client_id);
            }
            if (blockPushHeadServer.command_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, blockPushHeadServer.command_type);
            }
            protoWriter.writeBytes(blockPushHeadServer.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.BlockPushHeadServer$a */
    public static final class C15470a extends Message.Builder<BlockPushHeadServer, C15470a> {

        /* renamed from: a */
        public Long f40927a;

        /* renamed from: b */
        public String f40928b;

        /* renamed from: a */
        public BlockPushHeadServer build() {
            return new BlockPushHeadServer(this.f40927a, this.f40928b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15470a newBuilder() {
        C15470a aVar = new C15470a();
        aVar.f40927a = this.client_id;
        aVar.f40928b = this.command_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "BlockPushHeadServer");
        StringBuilder sb = new StringBuilder();
        if (this.client_id != null) {
            sb.append(", client_id=");
            sb.append(this.client_id);
        }
        if (this.command_type != null) {
            sb.append(", command_type=");
            sb.append(this.command_type);
        }
        StringBuilder replace = sb.replace(0, 2, "BlockPushHeadServer{");
        replace.append('}');
        return replace.toString();
    }

    public BlockPushHeadServer(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public BlockPushHeadServer(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.client_id = l;
        this.command_type = str;
    }
}
