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

public final class GetThreadsByPositionsResponse extends Message<GetThreadsByPositionsResponse, C17711a> {
    public static final ProtoAdapter<GetThreadsByPositionsResponse> ADAPTER = new C17712b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<Integer> invalid_positions;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadsByPositionsResponse$b */
    private static final class C17712b extends ProtoAdapter<GetThreadsByPositionsResponse> {
        C17712b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetThreadsByPositionsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetThreadsByPositionsResponse getThreadsByPositionsResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, getThreadsByPositionsResponse.entity) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, getThreadsByPositionsResponse.invalid_positions) + getThreadsByPositionsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetThreadsByPositionsResponse decode(ProtoReader protoReader) throws IOException {
            C17711a aVar = new C17711a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44742a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44743b.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetThreadsByPositionsResponse getThreadsByPositionsResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getThreadsByPositionsResponse.entity);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, getThreadsByPositionsResponse.invalid_positions);
            protoWriter.writeBytes(getThreadsByPositionsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadsByPositionsResponse$a */
    public static final class C17711a extends Message.Builder<GetThreadsByPositionsResponse, C17711a> {

        /* renamed from: a */
        public C14928Entity f44742a;

        /* renamed from: b */
        public List<Integer> f44743b = Internal.newMutableList();

        /* renamed from: a */
        public GetThreadsByPositionsResponse build() {
            C14928Entity entity = this.f44742a;
            if (entity != null) {
                return new GetThreadsByPositionsResponse(entity, this.f44743b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17711a newBuilder() {
        C17711a aVar = new C17711a();
        aVar.f44742a = this.entity;
        aVar.f44743b = Internal.copyOf("invalid_positions", this.invalid_positions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetThreadsByPositionsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.invalid_positions.isEmpty()) {
            sb.append(", invalid_positions=");
            sb.append(this.invalid_positions);
        }
        StringBuilder replace = sb.replace(0, 2, "GetThreadsByPositionsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetThreadsByPositionsResponse(C14928Entity entity2, List<Integer> list) {
        this(entity2, list, ByteString.EMPTY);
    }

    public GetThreadsByPositionsResponse(C14928Entity entity2, List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.invalid_positions = Internal.immutableCopyOf("invalid_positions", list);
    }
}
