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

public final class GetChatterStatusIconsRequest extends Message<GetChatterStatusIconsRequest, C16208a> {
    public static final ProtoAdapter<GetChatterStatusIconsRequest> ADAPTER = new C16209b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterStatusIconsRequest$b */
    private static final class C16209b extends ProtoAdapter<GetChatterStatusIconsRequest> {
        C16209b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatterStatusIconsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatterStatusIconsRequest getChatterStatusIconsRequest) {
            int i;
            if (getChatterStatusIconsRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getChatterStatusIconsRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getChatterStatusIconsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatterStatusIconsRequest decode(ProtoReader protoReader) throws IOException {
            C16208a aVar = new C16208a();
            aVar.f42379a = SyncDataStrategy.FORCE_SERVER;
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
                        aVar.f42379a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatterStatusIconsRequest getChatterStatusIconsRequest) throws IOException {
            if (getChatterStatusIconsRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getChatterStatusIconsRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getChatterStatusIconsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterStatusIconsRequest$a */
    public static final class C16208a extends Message.Builder<GetChatterStatusIconsRequest, C16208a> {

        /* renamed from: a */
        public SyncDataStrategy f42379a;

        /* renamed from: a */
        public GetChatterStatusIconsRequest build() {
            return new GetChatterStatusIconsRequest(this.f42379a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16208a newBuilder() {
        C16208a aVar = new C16208a();
        aVar.f42379a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetChatterStatusIconsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatterStatusIconsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatterStatusIconsRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetChatterStatusIconsRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
