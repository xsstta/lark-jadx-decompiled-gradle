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

public final class GetStickerSetsRequest extends Message<GetStickerSetsRequest, C17685a> {
    public static final ProtoAdapter<GetStickerSetsRequest> ADAPTER = new C17686b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsRequest$b */
    private static final class C17686b extends ProtoAdapter<GetStickerSetsRequest> {
        C17686b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStickerSetsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetStickerSetsRequest getStickerSetsRequest) {
            int i;
            if (getStickerSetsRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getStickerSetsRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getStickerSetsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetStickerSetsRequest decode(ProtoReader protoReader) throws IOException {
            C17685a aVar = new C17685a();
            aVar.f44704a = SyncDataStrategy.FORCE_SERVER;
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
                        aVar.f44704a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetStickerSetsRequest getStickerSetsRequest) throws IOException {
            if (getStickerSetsRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getStickerSetsRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getStickerSetsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsRequest$a */
    public static final class C17685a extends Message.Builder<GetStickerSetsRequest, C17685a> {

        /* renamed from: a */
        public SyncDataStrategy f44704a;

        /* renamed from: a */
        public GetStickerSetsRequest build() {
            return new GetStickerSetsRequest(this.f44704a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17685a newBuilder() {
        C17685a aVar = new C17685a();
        aVar.f44704a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetStickerSetsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStickerSetsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetStickerSetsRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetStickerSetsRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
