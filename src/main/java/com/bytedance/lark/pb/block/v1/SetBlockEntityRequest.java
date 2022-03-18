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

public final class SetBlockEntityRequest extends Message<SetBlockEntityRequest, C15488a> {
    public static final ProtoAdapter<SetBlockEntityRequest> ADAPTER = new C15489b();
    private static final long serialVersionUID = 0;
    public final List<BlockEntity> data;

    /* renamed from: com.bytedance.lark.pb.block.v1.SetBlockEntityRequest$b */
    private static final class C15489b extends ProtoAdapter<SetBlockEntityRequest> {
        C15489b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetBlockEntityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetBlockEntityRequest setBlockEntityRequest) {
            return BlockEntity.ADAPTER.asRepeated().encodedSizeWithTag(1, setBlockEntityRequest.data) + setBlockEntityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetBlockEntityRequest decode(ProtoReader protoReader) throws IOException {
            C15488a aVar = new C15488a();
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
                    aVar.f40947a.add(BlockEntity.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetBlockEntityRequest setBlockEntityRequest) throws IOException {
            BlockEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, setBlockEntityRequest.data);
            protoWriter.writeBytes(setBlockEntityRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.SetBlockEntityRequest$a */
    public static final class C15488a extends Message.Builder<SetBlockEntityRequest, C15488a> {

        /* renamed from: a */
        public List<BlockEntity> f40947a = Internal.newMutableList();

        /* renamed from: a */
        public SetBlockEntityRequest build() {
            return new SetBlockEntityRequest(this.f40947a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15488a newBuilder() {
        C15488a aVar = new C15488a();
        aVar.f40947a = Internal.copyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "SetBlockEntityRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.data.isEmpty()) {
            sb.append(", data=");
            sb.append(this.data);
        }
        StringBuilder replace = sb.replace(0, 2, "SetBlockEntityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetBlockEntityRequest(List<BlockEntity> list) {
        this(list, ByteString.EMPTY);
    }

    public SetBlockEntityRequest(List<BlockEntity> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data = Internal.immutableCopyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, list);
    }
}
