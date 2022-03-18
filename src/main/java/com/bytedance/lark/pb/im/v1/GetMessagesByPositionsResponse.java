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

public final class GetMessagesByPositionsResponse extends Message<GetMessagesByPositionsResponse, C17639a> {
    public static final ProtoAdapter<GetMessagesByPositionsResponse> ADAPTER = new C17640b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<Integer> invalid_positions;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessagesByPositionsResponse$b */
    private static final class C17640b extends ProtoAdapter<GetMessagesByPositionsResponse> {
        C17640b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessagesByPositionsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessagesByPositionsResponse getMessagesByPositionsResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, getMessagesByPositionsResponse.entity) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, getMessagesByPositionsResponse.invalid_positions) + getMessagesByPositionsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessagesByPositionsResponse decode(ProtoReader protoReader) throws IOException {
            C17639a aVar = new C17639a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44648a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44649b.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessagesByPositionsResponse getMessagesByPositionsResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getMessagesByPositionsResponse.entity);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, getMessagesByPositionsResponse.invalid_positions);
            protoWriter.writeBytes(getMessagesByPositionsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessagesByPositionsResponse$a */
    public static final class C17639a extends Message.Builder<GetMessagesByPositionsResponse, C17639a> {

        /* renamed from: a */
        public C14928Entity f44648a;

        /* renamed from: b */
        public List<Integer> f44649b = Internal.newMutableList();

        /* renamed from: a */
        public GetMessagesByPositionsResponse build() {
            C14928Entity entity = this.f44648a;
            if (entity != null) {
                return new GetMessagesByPositionsResponse(entity, this.f44649b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17639a newBuilder() {
        C17639a aVar = new C17639a();
        aVar.f44648a = this.entity;
        aVar.f44649b = Internal.copyOf("invalid_positions", this.invalid_positions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessagesByPositionsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.invalid_positions.isEmpty()) {
            sb.append(", invalid_positions=");
            sb.append(this.invalid_positions);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessagesByPositionsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessagesByPositionsResponse(C14928Entity entity2, List<Integer> list) {
        this(entity2, list, ByteString.EMPTY);
    }

    public GetMessagesByPositionsResponse(C14928Entity entity2, List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.invalid_positions = Internal.immutableCopyOf("invalid_positions", list);
    }
}
