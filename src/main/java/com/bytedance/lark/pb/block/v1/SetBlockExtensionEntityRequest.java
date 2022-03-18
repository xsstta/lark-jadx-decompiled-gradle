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

public final class SetBlockExtensionEntityRequest extends Message<SetBlockExtensionEntityRequest, C15492a> {
    public static final ProtoAdapter<SetBlockExtensionEntityRequest> ADAPTER = new C15493b();
    private static final long serialVersionUID = 0;
    public final List<BlockExtensionEntity> data;

    /* renamed from: com.bytedance.lark.pb.block.v1.SetBlockExtensionEntityRequest$b */
    private static final class C15493b extends ProtoAdapter<SetBlockExtensionEntityRequest> {
        C15493b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetBlockExtensionEntityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetBlockExtensionEntityRequest setBlockExtensionEntityRequest) {
            return BlockExtensionEntity.ADAPTER.asRepeated().encodedSizeWithTag(1, setBlockExtensionEntityRequest.data) + setBlockExtensionEntityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetBlockExtensionEntityRequest decode(ProtoReader protoReader) throws IOException {
            C15492a aVar = new C15492a();
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
                    aVar.f40951a.add(BlockExtensionEntity.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetBlockExtensionEntityRequest setBlockExtensionEntityRequest) throws IOException {
            BlockExtensionEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, setBlockExtensionEntityRequest.data);
            protoWriter.writeBytes(setBlockExtensionEntityRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.SetBlockExtensionEntityRequest$a */
    public static final class C15492a extends Message.Builder<SetBlockExtensionEntityRequest, C15492a> {

        /* renamed from: a */
        public List<BlockExtensionEntity> f40951a = Internal.newMutableList();

        /* renamed from: a */
        public SetBlockExtensionEntityRequest build() {
            return new SetBlockExtensionEntityRequest(this.f40951a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15492a newBuilder() {
        C15492a aVar = new C15492a();
        aVar.f40951a = Internal.copyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "SetBlockExtensionEntityRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.data.isEmpty()) {
            sb.append(", data=");
            sb.append(this.data);
        }
        StringBuilder replace = sb.replace(0, 2, "SetBlockExtensionEntityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetBlockExtensionEntityRequest(List<BlockExtensionEntity> list) {
        this(list, ByteString.EMPTY);
    }

    public SetBlockExtensionEntityRequest(List<BlockExtensionEntity> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data = Internal.immutableCopyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, list);
    }
}
