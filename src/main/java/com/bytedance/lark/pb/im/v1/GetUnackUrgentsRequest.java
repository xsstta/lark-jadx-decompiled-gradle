package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUnackUrgentsRequest extends Message<GetUnackUrgentsRequest, C17737a> {
    public static final ProtoAdapter<GetUnackUrgentsRequest> ADAPTER = new C17738b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUnackUrgentsRequest$b */
    private static final class C17738b extends ProtoAdapter<GetUnackUrgentsRequest> {
        C17738b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUnackUrgentsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUnackUrgentsRequest getUnackUrgentsRequest) {
            int i;
            if (getUnackUrgentsRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getUnackUrgentsRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getUnackUrgentsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUnackUrgentsRequest decode(ProtoReader protoReader) throws IOException {
            C17737a aVar = new C17737a();
            aVar.f44785a = SyncDataStrategy.FORCE_SERVER;
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
                        aVar.f44785a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUnackUrgentsRequest getUnackUrgentsRequest) throws IOException {
            if (getUnackUrgentsRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getUnackUrgentsRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getUnackUrgentsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUnackUrgentsRequest$a */
    public static final class C17737a extends Message.Builder<GetUnackUrgentsRequest, C17737a> {

        /* renamed from: a */
        public SyncDataStrategy f44785a;

        /* renamed from: a */
        public GetUnackUrgentsRequest build() {
            return new GetUnackUrgentsRequest(this.f44785a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17737a newBuilder() {
        C17737a aVar = new C17737a();
        aVar.f44785a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUnackUrgentsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUnackUrgentsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUnackUrgentsRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetUnackUrgentsRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
