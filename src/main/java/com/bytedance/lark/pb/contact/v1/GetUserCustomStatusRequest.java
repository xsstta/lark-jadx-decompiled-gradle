package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserCustomStatusRequest extends Message<GetUserCustomStatusRequest, C16272a> {
    public static final ProtoAdapter<GetUserCustomStatusRequest> ADAPTER = new C16273b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserCustomStatusRequest$b */
    private static final class C16273b extends ProtoAdapter<GetUserCustomStatusRequest> {
        C16273b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserCustomStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserCustomStatusRequest getUserCustomStatusRequest) {
            int i;
            if (getUserCustomStatusRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getUserCustomStatusRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getUserCustomStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserCustomStatusRequest decode(ProtoReader protoReader) throws IOException {
            C16272a aVar = new C16272a();
            aVar.f42470a = SyncDataStrategy.FORCE_SERVER;
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
                    try {
                        aVar.f42470a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserCustomStatusRequest getUserCustomStatusRequest) throws IOException {
            if (getUserCustomStatusRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getUserCustomStatusRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getUserCustomStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserCustomStatusRequest$a */
    public static final class C16272a extends Message.Builder<GetUserCustomStatusRequest, C16272a> {

        /* renamed from: a */
        public SyncDataStrategy f42470a;

        /* renamed from: a */
        public GetUserCustomStatusRequest build() {
            return new GetUserCustomStatusRequest(this.f42470a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16272a newBuilder() {
        C16272a aVar = new C16272a();
        aVar.f42470a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserCustomStatusRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserCustomStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserCustomStatusRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetUserCustomStatusRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
