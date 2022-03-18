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

public final class GetThreadsByPositionsRequest extends Message<GetThreadsByPositionsRequest, C17709a> {
    public static final ProtoAdapter<GetThreadsByPositionsRequest> ADAPTER = new C17710b();
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final List<Integer> positions;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadsByPositionsRequest$b */
    private static final class C17710b extends ProtoAdapter<GetThreadsByPositionsRequest> {
        C17710b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetThreadsByPositionsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetThreadsByPositionsRequest getThreadsByPositionsRequest) {
            return Channel.ADAPTER.encodedSizeWithTag(1, getThreadsByPositionsRequest.channel) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, getThreadsByPositionsRequest.positions) + getThreadsByPositionsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetThreadsByPositionsRequest decode(ProtoReader protoReader) throws IOException {
            C17709a aVar = new C17709a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44740a = Channel.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44741b.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetThreadsByPositionsRequest getThreadsByPositionsRequest) throws IOException {
            Channel.ADAPTER.encodeWithTag(protoWriter, 1, getThreadsByPositionsRequest.channel);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, getThreadsByPositionsRequest.positions);
            protoWriter.writeBytes(getThreadsByPositionsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadsByPositionsRequest$a */
    public static final class C17709a extends Message.Builder<GetThreadsByPositionsRequest, C17709a> {

        /* renamed from: a */
        public Channel f44740a;

        /* renamed from: b */
        public List<Integer> f44741b = Internal.newMutableList();

        /* renamed from: a */
        public GetThreadsByPositionsRequest build() {
            Channel channel = this.f44740a;
            if (channel != null) {
                return new GetThreadsByPositionsRequest(channel, this.f44741b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channel, "channel");
        }

        /* renamed from: a */
        public C17709a mo61848a(Channel channel) {
            this.f44740a = channel;
            return this;
        }

        /* renamed from: a */
        public C17709a mo61849a(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.f44741b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17709a newBuilder() {
        C17709a aVar = new C17709a();
        aVar.f44740a = this.channel;
        aVar.f44741b = Internal.copyOf("positions", this.positions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetThreadsByPositionsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel=");
        sb.append(this.channel);
        if (!this.positions.isEmpty()) {
            sb.append(", positions=");
            sb.append(this.positions);
        }
        StringBuilder replace = sb.replace(0, 2, "GetThreadsByPositionsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetThreadsByPositionsRequest(Channel channel2, List<Integer> list) {
        this(channel2, list, ByteString.EMPTY);
    }

    public GetThreadsByPositionsRequest(Channel channel2, List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel = channel2;
        this.positions = Internal.immutableCopyOf("positions", list);
    }
}
