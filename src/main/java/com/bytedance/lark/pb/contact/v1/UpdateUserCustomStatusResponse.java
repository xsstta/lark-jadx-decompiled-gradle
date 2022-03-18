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

public final class UpdateUserCustomStatusResponse extends Message<UpdateUserCustomStatusResponse, C16418a> {
    public static final ProtoAdapter<UpdateUserCustomStatusResponse> ADAPTER = new C16419b();
    private static final long serialVersionUID = 0;
    public final Map<Long, UserCustomStatus> status;

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusResponse$a */
    public static final class C16418a extends Message.Builder<UpdateUserCustomStatusResponse, C16418a> {

        /* renamed from: a */
        public Map<Long, UserCustomStatus> f42694a = Internal.newMutableMap();

        /* renamed from: a */
        public UpdateUserCustomStatusResponse build() {
            return new UpdateUserCustomStatusResponse(this.f42694a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusResponse$b */
    private static final class C16419b extends ProtoAdapter<UpdateUserCustomStatusResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Long, UserCustomStatus>> f42695a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, UserCustomStatus.ADAPTER);

        C16419b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateUserCustomStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateUserCustomStatusResponse updateUserCustomStatusResponse) {
            return this.f42695a.encodedSizeWithTag(1, updateUserCustomStatusResponse.status) + updateUserCustomStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateUserCustomStatusResponse decode(ProtoReader protoReader) throws IOException {
            C16418a aVar = new C16418a();
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
                    aVar.f42694a.putAll(this.f42695a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateUserCustomStatusResponse updateUserCustomStatusResponse) throws IOException {
            this.f42695a.encodeWithTag(protoWriter, 1, updateUserCustomStatusResponse.status);
            protoWriter.writeBytes(updateUserCustomStatusResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16418a newBuilder() {
        C16418a aVar = new C16418a();
        aVar.f42694a = Internal.copyOf(UpdateKey.STATUS, this.status);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "UpdateUserCustomStatusResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.status.isEmpty()) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateUserCustomStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateUserCustomStatusResponse(Map<Long, UserCustomStatus> map) {
        this(map, ByteString.EMPTY);
    }

    public UpdateUserCustomStatusResponse(Map<Long, UserCustomStatus> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = Internal.immutableCopyOf(UpdateKey.STATUS, map);
    }
}
