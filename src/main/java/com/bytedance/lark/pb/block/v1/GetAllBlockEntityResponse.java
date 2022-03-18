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

public final class GetAllBlockEntityResponse extends Message<GetAllBlockEntityResponse, C15476a> {
    public static final ProtoAdapter<GetAllBlockEntityResponse> ADAPTER = new C15477b();
    private static final long serialVersionUID = 0;
    public final List<BlockEntity> data;

    /* renamed from: com.bytedance.lark.pb.block.v1.GetAllBlockEntityResponse$b */
    private static final class C15477b extends ProtoAdapter<GetAllBlockEntityResponse> {
        C15477b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllBlockEntityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllBlockEntityResponse getAllBlockEntityResponse) {
            return BlockEntity.ADAPTER.asRepeated().encodedSizeWithTag(1, getAllBlockEntityResponse.data) + getAllBlockEntityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllBlockEntityResponse decode(ProtoReader protoReader) throws IOException {
            C15476a aVar = new C15476a();
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
                    aVar.f40939a.add(BlockEntity.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAllBlockEntityResponse getAllBlockEntityResponse) throws IOException {
            BlockEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAllBlockEntityResponse.data);
            protoWriter.writeBytes(getAllBlockEntityResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.GetAllBlockEntityResponse$a */
    public static final class C15476a extends Message.Builder<GetAllBlockEntityResponse, C15476a> {

        /* renamed from: a */
        public List<BlockEntity> f40939a = Internal.newMutableList();

        /* renamed from: a */
        public GetAllBlockEntityResponse build() {
            return new GetAllBlockEntityResponse(this.f40939a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15476a newBuilder() {
        C15476a aVar = new C15476a();
        aVar.f40939a = Internal.copyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "GetAllBlockEntityResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.data.isEmpty()) {
            sb.append(", data=");
            sb.append(this.data);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAllBlockEntityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllBlockEntityResponse(List<BlockEntity> list) {
        this(list, ByteString.EMPTY);
    }

    public GetAllBlockEntityResponse(List<BlockEntity> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data = Internal.immutableCopyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, list);
    }
}
