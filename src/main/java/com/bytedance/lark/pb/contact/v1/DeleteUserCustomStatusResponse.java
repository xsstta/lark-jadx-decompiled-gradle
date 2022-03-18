package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class DeleteUserCustomStatusResponse extends Message<DeleteUserCustomStatusResponse, C16164a> {
    public static final ProtoAdapter<DeleteUserCustomStatusResponse> ADAPTER = new C16165b();
    private static final long serialVersionUID = 0;
    public final Map<Long, UserCustomStatus> status;

    /* renamed from: com.bytedance.lark.pb.contact.v1.DeleteUserCustomStatusResponse$a */
    public static final class C16164a extends Message.Builder<DeleteUserCustomStatusResponse, C16164a> {

        /* renamed from: a */
        public Map<Long, UserCustomStatus> f42281a = Internal.newMutableMap();

        /* renamed from: a */
        public DeleteUserCustomStatusResponse build() {
            return new DeleteUserCustomStatusResponse(this.f42281a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.DeleteUserCustomStatusResponse$b */
    private static final class C16165b extends ProtoAdapter<DeleteUserCustomStatusResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Long, UserCustomStatus>> f42282a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, UserCustomStatus.ADAPTER);

        C16165b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteUserCustomStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteUserCustomStatusResponse deleteUserCustomStatusResponse) {
            return this.f42282a.encodedSizeWithTag(1, deleteUserCustomStatusResponse.status) + deleteUserCustomStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteUserCustomStatusResponse decode(ProtoReader protoReader) throws IOException {
            C16164a aVar = new C16164a();
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
                    aVar.f42281a.putAll(this.f42282a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteUserCustomStatusResponse deleteUserCustomStatusResponse) throws IOException {
            this.f42282a.encodeWithTag(protoWriter, 1, deleteUserCustomStatusResponse.status);
            protoWriter.writeBytes(deleteUserCustomStatusResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16164a newBuilder() {
        C16164a aVar = new C16164a();
        aVar.f42281a = Internal.copyOf(UpdateKey.STATUS, this.status);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "DeleteUserCustomStatusResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.status.isEmpty()) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteUserCustomStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteUserCustomStatusResponse(Map<Long, UserCustomStatus> map) {
        this(map, ByteString.EMPTY);
    }

    public DeleteUserCustomStatusResponse(Map<Long, UserCustomStatus> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = Internal.immutableCopyOf(UpdateKey.STATUS, map);
    }
}
