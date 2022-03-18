package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetThreadMessagesByPositionsResponse extends Message<GetThreadMessagesByPositionsResponse, C17701a> {
    public static final ProtoAdapter<GetThreadMessagesByPositionsResponse> ADAPTER = new C17702b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<Integer> invalid_positions;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadMessagesByPositionsResponse$b */
    private static final class C17702b extends ProtoAdapter<GetThreadMessagesByPositionsResponse> {
        C17702b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetThreadMessagesByPositionsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetThreadMessagesByPositionsResponse getThreadMessagesByPositionsResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, getThreadMessagesByPositionsResponse.entity) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, getThreadMessagesByPositionsResponse.invalid_positions) + getThreadMessagesByPositionsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetThreadMessagesByPositionsResponse decode(ProtoReader protoReader) throws IOException {
            C17701a aVar = new C17701a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44720a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44721b.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetThreadMessagesByPositionsResponse getThreadMessagesByPositionsResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getThreadMessagesByPositionsResponse.entity);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, getThreadMessagesByPositionsResponse.invalid_positions);
            protoWriter.writeBytes(getThreadMessagesByPositionsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadMessagesByPositionsResponse$a */
    public static final class C17701a extends Message.Builder<GetThreadMessagesByPositionsResponse, C17701a> {

        /* renamed from: a */
        public C14928Entity f44720a;

        /* renamed from: b */
        public List<Integer> f44721b = Internal.newMutableList();

        /* renamed from: a */
        public GetThreadMessagesByPositionsResponse build() {
            C14928Entity entity = this.f44720a;
            if (entity != null) {
                return new GetThreadMessagesByPositionsResponse(entity, this.f44721b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17701a newBuilder() {
        C17701a aVar = new C17701a();
        aVar.f44720a = this.entity;
        aVar.f44721b = Internal.copyOf("invalid_positions", this.invalid_positions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetThreadMessagesByPositionsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.invalid_positions.isEmpty()) {
            sb.append(", invalid_positions=");
            sb.append(this.invalid_positions);
        }
        StringBuilder replace = sb.replace(0, 2, "GetThreadMessagesByPositionsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetThreadMessagesByPositionsResponse(C14928Entity entity2, List<Integer> list) {
        this(entity2, list, ByteString.EMPTY);
    }

    public GetThreadMessagesByPositionsResponse(C14928Entity entity2, List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.invalid_positions = Internal.immutableCopyOf("invalid_positions", list);
    }
}
