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

public final class GetSubordinateDepartmentsRequest extends Message<GetSubordinateDepartmentsRequest, C16268a> {
    public static final ProtoAdapter<GetSubordinateDepartmentsRequest> ADAPTER = new C16269b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetSubordinateDepartmentsRequest$b */
    private static final class C16269b extends ProtoAdapter<GetSubordinateDepartmentsRequest> {
        C16269b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSubordinateDepartmentsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSubordinateDepartmentsRequest getSubordinateDepartmentsRequest) {
            int i;
            if (getSubordinateDepartmentsRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getSubordinateDepartmentsRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getSubordinateDepartmentsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSubordinateDepartmentsRequest decode(ProtoReader protoReader) throws IOException {
            C16268a aVar = new C16268a();
            aVar.f42466a = SyncDataStrategy.FORCE_SERVER;
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
                        aVar.f42466a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSubordinateDepartmentsRequest getSubordinateDepartmentsRequest) throws IOException {
            if (getSubordinateDepartmentsRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getSubordinateDepartmentsRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getSubordinateDepartmentsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetSubordinateDepartmentsRequest$a */
    public static final class C16268a extends Message.Builder<GetSubordinateDepartmentsRequest, C16268a> {

        /* renamed from: a */
        public SyncDataStrategy f42466a;

        /* renamed from: a */
        public GetSubordinateDepartmentsRequest build() {
            return new GetSubordinateDepartmentsRequest(this.f42466a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16268a newBuilder() {
        C16268a aVar = new C16268a();
        aVar.f42466a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetSubordinateDepartmentsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSubordinateDepartmentsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSubordinateDepartmentsRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetSubordinateDepartmentsRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
