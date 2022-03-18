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

public final class SendGrootCellsRequest extends Message<SendGrootCellsRequest, C51008a> {
    public static final ProtoAdapter<SendGrootCellsRequest> ADAPTER = new C51009b();
    private static final long serialVersionUID = 0;
    public final List<GrootCell> cells;
    public final ChannelMeta channel_meta;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SendGrootCellsRequest$b */
    private static final class C51009b extends ProtoAdapter<SendGrootCellsRequest> {
        C51009b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendGrootCellsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendGrootCellsRequest sendGrootCellsRequest) {
            return ChannelMeta.ADAPTER.encodedSizeWithTag(1, sendGrootCellsRequest.channel_meta) + GrootCell.ADAPTER.asRepeated().encodedSizeWithTag(2, sendGrootCellsRequest.cells) + sendGrootCellsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendGrootCellsRequest decode(ProtoReader protoReader) throws IOException {
            C51008a aVar = new C51008a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127070a = ChannelMeta.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127071b.add(GrootCell.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendGrootCellsRequest sendGrootCellsRequest) throws IOException {
            ChannelMeta.ADAPTER.encodeWithTag(protoWriter, 1, sendGrootCellsRequest.channel_meta);
            GrootCell.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, sendGrootCellsRequest.cells);
            protoWriter.writeBytes(sendGrootCellsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SendGrootCellsRequest$a */
    public static final class C51008a extends Message.Builder<SendGrootCellsRequest, C51008a> {

        /* renamed from: a */
        public ChannelMeta f127070a;

        /* renamed from: b */
        public List<GrootCell> f127071b = Internal.newMutableList();

        /* renamed from: a */
        public SendGrootCellsRequest build() {
            ChannelMeta channelMeta = this.f127070a;
            if (channelMeta != null) {
                return new SendGrootCellsRequest(channelMeta, this.f127071b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channelMeta, "channel_meta");
        }

        /* renamed from: a */
        public C51008a mo176121a(ChannelMeta channelMeta) {
            this.f127070a = channelMeta;
            return this;
        }

        /* renamed from: a */
        public C51008a mo176122a(List<GrootCell> list) {
            Internal.checkElementsNotNull(list);
            this.f127071b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51008a newBuilder() {
        C51008a aVar = new C51008a();
        aVar.f127070a = this.channel_meta;
        aVar.f127071b = Internal.copyOf("cells", this.cells);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SendGrootCellsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_meta=");
        sb.append(this.channel_meta);
        if (!this.cells.isEmpty()) {
            sb.append(", cells=");
            sb.append(this.cells);
        }
        StringBuilder replace = sb.replace(0, 2, "SendGrootCellsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendGrootCellsRequest(ChannelMeta channelMeta, List<GrootCell> list) {
        this(channelMeta, list, ByteString.EMPTY);
    }

    public SendGrootCellsRequest(ChannelMeta channelMeta, List<GrootCell> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_meta = channelMeta;
        this.cells = Internal.immutableCopyOf("cells", list);
    }
}
