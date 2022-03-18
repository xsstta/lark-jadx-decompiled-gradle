package com.bytedance.lark.pb.media.v1;

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

public final class DeleteResourcesResponse extends Message<DeleteResourcesResponse, C18206a> {
    public static final ProtoAdapter<DeleteResourcesResponse> ADAPTER = new C18207b();
    private static final long serialVersionUID = 0;
    public final List<String> success_keys;

    /* renamed from: com.bytedance.lark.pb.media.v1.DeleteResourcesResponse$b */
    private static final class C18207b extends ProtoAdapter<DeleteResourcesResponse> {
        C18207b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteResourcesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteResourcesResponse deleteResourcesResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, deleteResourcesResponse.success_keys) + deleteResourcesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteResourcesResponse decode(ProtoReader protoReader) throws IOException {
            C18206a aVar = new C18206a();
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
                    aVar.f45428a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteResourcesResponse deleteResourcesResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, deleteResourcesResponse.success_keys);
            protoWriter.writeBytes(deleteResourcesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.DeleteResourcesResponse$a */
    public static final class C18206a extends Message.Builder<DeleteResourcesResponse, C18206a> {

        /* renamed from: a */
        public List<String> f45428a = Internal.newMutableList();

        /* renamed from: a */
        public DeleteResourcesResponse build() {
            return new DeleteResourcesResponse(this.f45428a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18206a newBuilder() {
        C18206a aVar = new C18206a();
        aVar.f45428a = Internal.copyOf("success_keys", this.success_keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "DeleteResourcesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.success_keys.isEmpty()) {
            sb.append(", success_keys=");
            sb.append(this.success_keys);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteResourcesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteResourcesResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteResourcesResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success_keys = Internal.immutableCopyOf("success_keys", list);
    }
}
