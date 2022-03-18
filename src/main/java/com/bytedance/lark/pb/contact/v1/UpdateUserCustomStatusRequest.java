package com.bytedance.lark.pb.contact.v1;

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

public final class UpdateUserCustomStatusRequest extends Message<UpdateUserCustomStatusRequest, C16416a> {
    public static final ProtoAdapter<UpdateUserCustomStatusRequest> ADAPTER = new C16417b();
    private static final long serialVersionUID = 0;
    public final List<UpdateUserCustomStatusMeta> update_status;

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusRequest$b */
    private static final class C16417b extends ProtoAdapter<UpdateUserCustomStatusRequest> {
        C16417b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateUserCustomStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateUserCustomStatusRequest updateUserCustomStatusRequest) {
            return UpdateUserCustomStatusMeta.ADAPTER.asRepeated().encodedSizeWithTag(1, updateUserCustomStatusRequest.update_status) + updateUserCustomStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateUserCustomStatusRequest decode(ProtoReader protoReader) throws IOException {
            C16416a aVar = new C16416a();
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
                    aVar.f42693a.add(UpdateUserCustomStatusMeta.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateUserCustomStatusRequest updateUserCustomStatusRequest) throws IOException {
            UpdateUserCustomStatusMeta.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateUserCustomStatusRequest.update_status);
            protoWriter.writeBytes(updateUserCustomStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusRequest$a */
    public static final class C16416a extends Message.Builder<UpdateUserCustomStatusRequest, C16416a> {

        /* renamed from: a */
        public List<UpdateUserCustomStatusMeta> f42693a = Internal.newMutableList();

        /* renamed from: a */
        public UpdateUserCustomStatusRequest build() {
            return new UpdateUserCustomStatusRequest(this.f42693a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16416a mo58598a(List<UpdateUserCustomStatusMeta> list) {
            Internal.checkElementsNotNull(list);
            this.f42693a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16416a newBuilder() {
        C16416a aVar = new C16416a();
        aVar.f42693a = Internal.copyOf("update_status", this.update_status);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "UpdateUserCustomStatusRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.update_status.isEmpty()) {
            sb.append(", update_status=");
            sb.append(this.update_status);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateUserCustomStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateUserCustomStatusRequest(List<UpdateUserCustomStatusMeta> list) {
        this(list, ByteString.EMPTY);
    }

    public UpdateUserCustomStatusRequest(List<UpdateUserCustomStatusMeta> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.update_status = Internal.immutableCopyOf("update_status", list);
    }
}
