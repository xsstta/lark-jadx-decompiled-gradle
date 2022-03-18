package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushGrootCells extends Message<PushGrootCells, C50948a> {
    public static final ProtoAdapter<PushGrootCells> ADAPTER = new C50949b();
    private static final long serialVersionUID = 0;
    public final List<GrootCell> cells;
    public final ChannelMeta channel_meta;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PushGrootCells$b */
    private static final class C50949b extends ProtoAdapter<PushGrootCells> {
        C50949b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushGrootCells.class);
        }

        /* renamed from: a */
        public int encodedSize(PushGrootCells pushGrootCells) {
            return ChannelMeta.ADAPTER.encodedSizeWithTag(1, pushGrootCells.channel_meta) + GrootCell.ADAPTER.asRepeated().encodedSizeWithTag(2, pushGrootCells.cells) + pushGrootCells.unknownFields().size();
        }

        /* renamed from: a */
        public PushGrootCells decode(ProtoReader protoReader) throws IOException {
            C50948a aVar = new C50948a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126968a = ChannelMeta.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126969b.add(GrootCell.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushGrootCells pushGrootCells) throws IOException {
            ChannelMeta.ADAPTER.encodeWithTag(protoWriter, 1, pushGrootCells.channel_meta);
            GrootCell.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, pushGrootCells.cells);
            protoWriter.writeBytes(pushGrootCells.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PushGrootCells$a */
    public static final class C50948a extends Message.Builder<PushGrootCells, C50948a> {

        /* renamed from: a */
        public ChannelMeta f126968a;

        /* renamed from: b */
        public List<GrootCell> f126969b = Internal.newMutableList();

        /* renamed from: a */
        public PushGrootCells build() {
            ChannelMeta channelMeta = this.f126968a;
            if (channelMeta != null) {
                return new PushGrootCells(channelMeta, this.f126969b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channelMeta, "channel_meta");
        }
    }

    @Override // com.squareup.wire.Message
    public C50948a newBuilder() {
        C50948a aVar = new C50948a();
        aVar.f126968a = this.channel_meta;
        aVar.f126969b = Internal.copyOf("cells", this.cells);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PushGrootCells");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_meta=");
        sb.append(this.channel_meta);
        if (!this.cells.isEmpty()) {
            sb.append(", cells=");
            sb.append(this.cells);
        }
        StringBuilder replace = sb.replace(0, 2, "PushGrootCells{");
        replace.append('}');
        return replace.toString();
    }

    public PushGrootCells(ChannelMeta channelMeta, List<GrootCell> list) {
        this(channelMeta, list, ByteString.EMPTY);
    }

    public PushGrootCells(ChannelMeta channelMeta, List<GrootCell> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_meta = channelMeta;
        this.cells = Internal.immutableCopyOf("cells", list);
    }
}
