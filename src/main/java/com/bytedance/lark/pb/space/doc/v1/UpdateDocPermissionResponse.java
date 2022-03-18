package com.bytedance.lark.pb.space.doc.v1;

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

public final class UpdateDocPermissionResponse extends Message<UpdateDocPermissionResponse, C19293a> {
    public static final ProtoAdapter<UpdateDocPermissionResponse> ADAPTER = new C19294b();
    private static final long serialVersionUID = 0;
    public final List<String> success_message_ids;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocPermissionResponse$b */
    private static final class C19294b extends ProtoAdapter<UpdateDocPermissionResponse> {
        C19294b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateDocPermissionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateDocPermissionResponse updateDocPermissionResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, updateDocPermissionResponse.success_message_ids) + updateDocPermissionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateDocPermissionResponse decode(ProtoReader protoReader) throws IOException {
            C19293a aVar = new C19293a();
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
                    aVar.f47480a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateDocPermissionResponse updateDocPermissionResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, updateDocPermissionResponse.success_message_ids);
            protoWriter.writeBytes(updateDocPermissionResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocPermissionResponse$a */
    public static final class C19293a extends Message.Builder<UpdateDocPermissionResponse, C19293a> {

        /* renamed from: a */
        public List<String> f47480a = Internal.newMutableList();

        /* renamed from: a */
        public UpdateDocPermissionResponse build() {
            return new UpdateDocPermissionResponse(this.f47480a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19293a newBuilder() {
        C19293a aVar = new C19293a();
        aVar.f47480a = Internal.copyOf("success_message_ids", this.success_message_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UpdateDocPermissionResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.success_message_ids.isEmpty()) {
            sb.append(", success_message_ids=");
            sb.append(this.success_message_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateDocPermissionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateDocPermissionResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public UpdateDocPermissionResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success_message_ids = Internal.immutableCopyOf("success_message_ids", list);
    }
}
