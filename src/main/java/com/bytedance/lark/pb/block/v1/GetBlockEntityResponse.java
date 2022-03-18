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

public final class GetBlockEntityResponse extends Message<GetBlockEntityResponse, C15480a> {
    public static final ProtoAdapter<GetBlockEntityResponse> ADAPTER = new C15481b();
    private static final long serialVersionUID = 0;
    public final List<BlockEntity> data;

    /* renamed from: com.bytedance.lark.pb.block.v1.GetBlockEntityResponse$b */
    private static final class C15481b extends ProtoAdapter<GetBlockEntityResponse> {
        C15481b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBlockEntityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBlockEntityResponse getBlockEntityResponse) {
            return BlockEntity.ADAPTER.asRepeated().encodedSizeWithTag(1, getBlockEntityResponse.data) + getBlockEntityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetBlockEntityResponse decode(ProtoReader protoReader) throws IOException {
            C15480a aVar = new C15480a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40941a.add(BlockEntity.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBlockEntityResponse getBlockEntityResponse) throws IOException {
            BlockEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getBlockEntityResponse.data);
            protoWriter.writeBytes(getBlockEntityResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.GetBlockEntityResponse$a */
    public static final class C15480a extends Message.Builder<GetBlockEntityResponse, C15480a> {

        /* renamed from: a */
        public List<BlockEntity> f40941a = Internal.newMutableList();

        /* renamed from: a */
        public GetBlockEntityResponse build() {
            return new GetBlockEntityResponse(this.f40941a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15480a newBuilder() {
        C15480a aVar = new C15480a();
        aVar.f40941a = Internal.copyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "GetBlockEntityResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.data.isEmpty()) {
            sb.append(", data=");
            sb.append(this.data);
        }
        StringBuilder replace = sb.replace(0, 2, "GetBlockEntityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetBlockEntityResponse(List<BlockEntity> list) {
        this(list, ByteString.EMPTY);
    }

    public GetBlockEntityResponse(List<BlockEntity> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data = Internal.immutableCopyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, list);
    }
}
