package com.bytedance.lark.pb.ugreach.v1;

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

public final class DeleteUGReachPointCacheRequest extends Message<DeleteUGReachPointCacheRequest, C19765a> {
    public static final ProtoAdapter<DeleteUGReachPointCacheRequest> ADAPTER = new C19766b();
    private static final long serialVersionUID = 0;
    public final List<String> reach_point_ids;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.DeleteUGReachPointCacheRequest$b */
    private static final class C19766b extends ProtoAdapter<DeleteUGReachPointCacheRequest> {
        C19766b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteUGReachPointCacheRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteUGReachPointCacheRequest deleteUGReachPointCacheRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, deleteUGReachPointCacheRequest.reach_point_ids) + deleteUGReachPointCacheRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteUGReachPointCacheRequest decode(ProtoReader protoReader) throws IOException {
            C19765a aVar = new C19765a();
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
                    aVar.f48231a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteUGReachPointCacheRequest deleteUGReachPointCacheRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, deleteUGReachPointCacheRequest.reach_point_ids);
            protoWriter.writeBytes(deleteUGReachPointCacheRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.DeleteUGReachPointCacheRequest$a */
    public static final class C19765a extends Message.Builder<DeleteUGReachPointCacheRequest, C19765a> {

        /* renamed from: a */
        public List<String> f48231a = Internal.newMutableList();

        /* renamed from: a */
        public DeleteUGReachPointCacheRequest build() {
            return new DeleteUGReachPointCacheRequest(this.f48231a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19765a mo66941a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f48231a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19765a newBuilder() {
        C19765a aVar = new C19765a();
        aVar.f48231a = Internal.copyOf("reach_point_ids", this.reach_point_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "DeleteUGReachPointCacheRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.reach_point_ids.isEmpty()) {
            sb.append(", reach_point_ids=");
            sb.append(this.reach_point_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteUGReachPointCacheRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteUGReachPointCacheRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteUGReachPointCacheRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reach_point_ids = Internal.immutableCopyOf("reach_point_ids", list);
    }
}
