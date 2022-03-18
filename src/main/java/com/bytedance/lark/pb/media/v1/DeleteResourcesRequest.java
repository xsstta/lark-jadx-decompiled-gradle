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

public final class DeleteResourcesRequest extends Message<DeleteResourcesRequest, C18204a> {
    public static final ProtoAdapter<DeleteResourcesRequest> ADAPTER = new C18205b();
    private static final long serialVersionUID = 0;
    public final List<String> keys;

    /* renamed from: com.bytedance.lark.pb.media.v1.DeleteResourcesRequest$b */
    private static final class C18205b extends ProtoAdapter<DeleteResourcesRequest> {
        C18205b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteResourcesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteResourcesRequest deleteResourcesRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, deleteResourcesRequest.keys) + deleteResourcesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteResourcesRequest decode(ProtoReader protoReader) throws IOException {
            C18204a aVar = new C18204a();
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
                    aVar.f45427a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteResourcesRequest deleteResourcesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, deleteResourcesRequest.keys);
            protoWriter.writeBytes(deleteResourcesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.DeleteResourcesRequest$a */
    public static final class C18204a extends Message.Builder<DeleteResourcesRequest, C18204a> {

        /* renamed from: a */
        public List<String> f45427a = Internal.newMutableList();

        /* renamed from: a */
        public DeleteResourcesRequest build() {
            return new DeleteResourcesRequest(this.f45427a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18204a newBuilder() {
        C18204a aVar = new C18204a();
        aVar.f45427a = Internal.copyOf("keys", this.keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "DeleteResourcesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.keys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteResourcesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteResourcesRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteResourcesRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keys = Internal.immutableCopyOf("keys", list);
    }
}
