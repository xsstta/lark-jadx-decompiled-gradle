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

public final class GetContactTokenRequest extends Message<GetContactTokenRequest, C17558a> {
    public static final ProtoAdapter<GetContactTokenRequest> ADAPTER = new C17559b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetContactTokenRequest$b */
    private static final class C17559b extends ProtoAdapter<GetContactTokenRequest> {
        C17559b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetContactTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetContactTokenRequest getContactTokenRequest) {
            int i;
            if (getContactTokenRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getContactTokenRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getContactTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetContactTokenRequest decode(ProtoReader protoReader) throws IOException {
            C17558a aVar = new C17558a();
            aVar.f44518a = SyncDataStrategy.FORCE_SERVER;
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
                        aVar.f44518a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetContactTokenRequest getContactTokenRequest) throws IOException {
            if (getContactTokenRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getContactTokenRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getContactTokenRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetContactTokenRequest$a */
    public static final class C17558a extends Message.Builder<GetContactTokenRequest, C17558a> {

        /* renamed from: a */
        public SyncDataStrategy f44518a;

        /* renamed from: a */
        public GetContactTokenRequest build() {
            return new GetContactTokenRequest(this.f44518a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17558a newBuilder() {
        C17558a aVar = new C17558a();
        aVar.f44518a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetContactTokenRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetContactTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetContactTokenRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetContactTokenRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
