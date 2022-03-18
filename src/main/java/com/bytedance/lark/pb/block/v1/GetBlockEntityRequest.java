package com.bytedance.lark.pb.block.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetBlockEntityRequest extends Message<GetBlockEntityRequest, C15478a> {
    public static final ProtoAdapter<GetBlockEntityRequest> ADAPTER = new C15479b();
    private static final long serialVersionUID = 0;
    public final List<String> ids;

    /* renamed from: com.bytedance.lark.pb.block.v1.GetBlockEntityRequest$b */
    private static final class C15479b extends ProtoAdapter<GetBlockEntityRequest> {
        C15479b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBlockEntityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBlockEntityRequest getBlockEntityRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getBlockEntityRequest.ids) + getBlockEntityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetBlockEntityRequest decode(ProtoReader protoReader) throws IOException {
            C15478a aVar = new C15478a();
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
                    aVar.f40940a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBlockEntityRequest getBlockEntityRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getBlockEntityRequest.ids);
            protoWriter.writeBytes(getBlockEntityRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.GetBlockEntityRequest$a */
    public static final class C15478a extends Message.Builder<GetBlockEntityRequest, C15478a> {

        /* renamed from: a */
        public List<String> f40940a = Internal.newMutableList();

        /* renamed from: a */
        public GetBlockEntityRequest build() {
            return new GetBlockEntityRequest(this.f40940a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15478a newBuilder() {
        C15478a aVar = new C15478a();
        aVar.f40940a = Internal.copyOf("ids", this.ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "GetBlockEntityRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.ids.isEmpty()) {
            sb.append(", ids=");
            sb.append(this.ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetBlockEntityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetBlockEntityRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetBlockEntityRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ids = Internal.immutableCopyOf("ids", list);
    }
}
