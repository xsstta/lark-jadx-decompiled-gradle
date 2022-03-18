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

public final class GetCustomizedStickersRequest extends Message<GetCustomizedStickersRequest, C17562a> {
    public static final ProtoAdapter<GetCustomizedStickersRequest> ADAPTER = new C17563b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetCustomizedStickersRequest$b */
    private static final class C17563b extends ProtoAdapter<GetCustomizedStickersRequest> {
        C17563b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCustomizedStickersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCustomizedStickersRequest getCustomizedStickersRequest) {
            int i;
            if (getCustomizedStickersRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getCustomizedStickersRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getCustomizedStickersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCustomizedStickersRequest decode(ProtoReader protoReader) throws IOException {
            C17562a aVar = new C17562a();
            aVar.f44524a = SyncDataStrategy.FORCE_SERVER;
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
                        aVar.f44524a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCustomizedStickersRequest getCustomizedStickersRequest) throws IOException {
            if (getCustomizedStickersRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getCustomizedStickersRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getCustomizedStickersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetCustomizedStickersRequest$a */
    public static final class C17562a extends Message.Builder<GetCustomizedStickersRequest, C17562a> {

        /* renamed from: a */
        public SyncDataStrategy f44524a;

        /* renamed from: a */
        public GetCustomizedStickersRequest build() {
            return new GetCustomizedStickersRequest(this.f44524a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17562a newBuilder() {
        C17562a aVar = new C17562a();
        aVar.f44524a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetCustomizedStickersRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCustomizedStickersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCustomizedStickersRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetCustomizedStickersRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
