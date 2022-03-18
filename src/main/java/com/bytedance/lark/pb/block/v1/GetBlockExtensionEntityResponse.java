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

public final class GetBlockExtensionEntityResponse extends Message<GetBlockExtensionEntityResponse, C15484a> {
    public static final ProtoAdapter<GetBlockExtensionEntityResponse> ADAPTER = new C15485b();
    private static final long serialVersionUID = 0;
    public final List<BlockExtensionEntity> data;

    /* renamed from: com.bytedance.lark.pb.block.v1.GetBlockExtensionEntityResponse$b */
    private static final class C15485b extends ProtoAdapter<GetBlockExtensionEntityResponse> {
        C15485b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBlockExtensionEntityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBlockExtensionEntityResponse getBlockExtensionEntityResponse) {
            return BlockExtensionEntity.ADAPTER.asRepeated().encodedSizeWithTag(1, getBlockExtensionEntityResponse.data) + getBlockExtensionEntityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetBlockExtensionEntityResponse decode(ProtoReader protoReader) throws IOException {
            C15484a aVar = new C15484a();
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
                    aVar.f40944a.add(BlockExtensionEntity.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBlockExtensionEntityResponse getBlockExtensionEntityResponse) throws IOException {
            BlockExtensionEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getBlockExtensionEntityResponse.data);
            protoWriter.writeBytes(getBlockExtensionEntityResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.GetBlockExtensionEntityResponse$a */
    public static final class C15484a extends Message.Builder<GetBlockExtensionEntityResponse, C15484a> {

        /* renamed from: a */
        public List<BlockExtensionEntity> f40944a = Internal.newMutableList();

        /* renamed from: a */
        public GetBlockExtensionEntityResponse build() {
            return new GetBlockExtensionEntityResponse(this.f40944a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15484a newBuilder() {
        C15484a aVar = new C15484a();
        aVar.f40944a = Internal.copyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "GetBlockExtensionEntityResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.data.isEmpty()) {
            sb.append(", data=");
            sb.append(this.data);
        }
        StringBuilder replace = sb.replace(0, 2, "GetBlockExtensionEntityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetBlockExtensionEntityResponse(List<BlockExtensionEntity> list) {
        this(list, ByteString.EMPTY);
    }

    public GetBlockExtensionEntityResponse(List<BlockExtensionEntity> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data = Internal.immutableCopyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, list);
    }
}
