package com.bytedance.lark.pb.block.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.google.firebase.messaging.Constants;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class BlockPushDataServer extends Message<BlockPushDataServer, C15468a> {
    public static final ProtoAdapter<BlockPushDataServer> ADAPTER = new C15469b();
    private static final long serialVersionUID = 0;
    public final List<BlockServer> data;
    public final BlockPushHeadServer head;

    /* renamed from: com.bytedance.lark.pb.block.v1.BlockPushDataServer$b */
    private static final class C15469b extends ProtoAdapter<BlockPushDataServer> {
        C15469b() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockPushDataServer.class);
        }

        /* renamed from: a */
        public int encodedSize(BlockPushDataServer blockPushDataServer) {
            return BlockPushHeadServer.ADAPTER.encodedSizeWithTag(1, blockPushDataServer.head) + BlockServer.ADAPTER.asRepeated().encodedSizeWithTag(2, blockPushDataServer.data) + blockPushDataServer.unknownFields().size();
        }

        /* renamed from: a */
        public BlockPushDataServer decode(ProtoReader protoReader) throws IOException {
            C15468a aVar = new C15468a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40925a = BlockPushHeadServer.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40926b.add(BlockServer.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BlockPushDataServer blockPushDataServer) throws IOException {
            BlockPushHeadServer.ADAPTER.encodeWithTag(protoWriter, 1, blockPushDataServer.head);
            BlockServer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, blockPushDataServer.data);
            protoWriter.writeBytes(blockPushDataServer.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.BlockPushDataServer$a */
    public static final class C15468a extends Message.Builder<BlockPushDataServer, C15468a> {

        /* renamed from: a */
        public BlockPushHeadServer f40925a;

        /* renamed from: b */
        public List<BlockServer> f40926b = Internal.newMutableList();

        /* renamed from: a */
        public BlockPushDataServer build() {
            BlockPushHeadServer blockPushHeadServer = this.f40925a;
            if (blockPushHeadServer != null) {
                return new BlockPushDataServer(blockPushHeadServer, this.f40926b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(blockPushHeadServer, "head");
        }
    }

    @Override // com.squareup.wire.Message
    public C15468a newBuilder() {
        C15468a aVar = new C15468a();
        aVar.f40925a = this.head;
        aVar.f40926b = Internal.copyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "BlockPushDataServer");
        StringBuilder sb = new StringBuilder();
        sb.append(", head=");
        sb.append(this.head);
        if (!this.data.isEmpty()) {
            sb.append(", data=");
            sb.append(this.data);
        }
        StringBuilder replace = sb.replace(0, 2, "BlockPushDataServer{");
        replace.append('}');
        return replace.toString();
    }

    public BlockPushDataServer(BlockPushHeadServer blockPushHeadServer, List<BlockServer> list) {
        this(blockPushHeadServer, list, ByteString.EMPTY);
    }

    public BlockPushDataServer(BlockPushHeadServer blockPushHeadServer, List<BlockServer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.head = blockPushHeadServer;
        this.data = Internal.immutableCopyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, list);
    }
}
