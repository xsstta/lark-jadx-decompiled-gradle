package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetMessagesByPositionsRequest extends Message<GetMessagesByPositionsRequest, C17637a> {
    public static final ProtoAdapter<GetMessagesByPositionsRequest> ADAPTER = new C17638b();
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final List<Integer> positions;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessagesByPositionsRequest$b */
    private static final class C17638b extends ProtoAdapter<GetMessagesByPositionsRequest> {
        C17638b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessagesByPositionsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessagesByPositionsRequest getMessagesByPositionsRequest) {
            return Channel.ADAPTER.encodedSizeWithTag(1, getMessagesByPositionsRequest.channel) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, getMessagesByPositionsRequest.positions) + getMessagesByPositionsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessagesByPositionsRequest decode(ProtoReader protoReader) throws IOException {
            C17637a aVar = new C17637a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44646a = Channel.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44647b.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessagesByPositionsRequest getMessagesByPositionsRequest) throws IOException {
            Channel.ADAPTER.encodeWithTag(protoWriter, 1, getMessagesByPositionsRequest.channel);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, getMessagesByPositionsRequest.positions);
            protoWriter.writeBytes(getMessagesByPositionsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessagesByPositionsRequest$a */
    public static final class C17637a extends Message.Builder<GetMessagesByPositionsRequest, C17637a> {

        /* renamed from: a */
        public Channel f44646a;

        /* renamed from: b */
        public List<Integer> f44647b = Internal.newMutableList();

        /* renamed from: a */
        public GetMessagesByPositionsRequest build() {
            Channel channel = this.f44646a;
            if (channel != null) {
                return new GetMessagesByPositionsRequest(channel, this.f44647b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channel, "channel");
        }

        /* renamed from: a */
        public C17637a mo61671a(Channel channel) {
            this.f44646a = channel;
            return this;
        }

        /* renamed from: a */
        public C17637a mo61672a(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.f44647b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17637a newBuilder() {
        C17637a aVar = new C17637a();
        aVar.f44646a = this.channel;
        aVar.f44647b = Internal.copyOf("positions", this.positions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessagesByPositionsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel=");
        sb.append(this.channel);
        if (!this.positions.isEmpty()) {
            sb.append(", positions=");
            sb.append(this.positions);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessagesByPositionsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessagesByPositionsRequest(Channel channel2, List<Integer> list) {
        this(channel2, list, ByteString.EMPTY);
    }

    public GetMessagesByPositionsRequest(Channel channel2, List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel = channel2;
        this.positions = Internal.immutableCopyOf("positions", list);
    }
}
