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

public final class GetBlockExtensionEntityRequest extends Message<GetBlockExtensionEntityRequest, C15482a> {
    public static final ProtoAdapter<GetBlockExtensionEntityRequest> ADAPTER = new C15483b();
    private static final long serialVersionUID = 0;
    public final String ext_type;
    public final List<String> ids;

    /* renamed from: com.bytedance.lark.pb.block.v1.GetBlockExtensionEntityRequest$b */
    private static final class C15483b extends ProtoAdapter<GetBlockExtensionEntityRequest> {
        C15483b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBlockExtensionEntityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBlockExtensionEntityRequest getBlockExtensionEntityRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getBlockExtensionEntityRequest.ext_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getBlockExtensionEntityRequest.ids) + getBlockExtensionEntityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetBlockExtensionEntityRequest decode(ProtoReader protoReader) throws IOException {
            C15482a aVar = new C15482a();
            aVar.f40942a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40942a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40943b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBlockExtensionEntityRequest getBlockExtensionEntityRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getBlockExtensionEntityRequest.ext_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getBlockExtensionEntityRequest.ids);
            protoWriter.writeBytes(getBlockExtensionEntityRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.GetBlockExtensionEntityRequest$a */
    public static final class C15482a extends Message.Builder<GetBlockExtensionEntityRequest, C15482a> {

        /* renamed from: a */
        public String f40942a;

        /* renamed from: b */
        public List<String> f40943b = Internal.newMutableList();

        /* renamed from: a */
        public GetBlockExtensionEntityRequest build() {
            String str = this.f40942a;
            if (str != null) {
                return new GetBlockExtensionEntityRequest(str, this.f40943b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "ext_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C15482a newBuilder() {
        C15482a aVar = new C15482a();
        aVar.f40942a = this.ext_type;
        aVar.f40943b = Internal.copyOf("ids", this.ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "GetBlockExtensionEntityRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", ext_type=");
        sb.append(this.ext_type);
        if (!this.ids.isEmpty()) {
            sb.append(", ids=");
            sb.append(this.ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetBlockExtensionEntityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetBlockExtensionEntityRequest(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public GetBlockExtensionEntityRequest(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ext_type = str;
        this.ids = Internal.immutableCopyOf("ids", list);
    }
}
