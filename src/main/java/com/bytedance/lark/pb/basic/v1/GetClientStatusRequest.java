package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetClientStatusRequest extends Message<GetClientStatusRequest, C14963a> {
    public static final ProtoAdapter<GetClientStatusRequest> ADAPTER = new C14964b();
    public static final Boolean DEFAULT_IS_FROM_SERVER = true;
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final Boolean is_from_server;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetClientStatusRequest$b */
    private static final class C14964b extends ProtoAdapter<GetClientStatusRequest> {
        C14964b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetClientStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetClientStatusRequest getClientStatusRequest) {
            int i;
            int i2 = 0;
            if (getClientStatusRequest.is_from_server != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getClientStatusRequest.is_from_server);
            } else {
                i = 0;
            }
            if (getClientStatusRequest.sync_data_strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getClientStatusRequest.sync_data_strategy);
            }
            return i + i2 + getClientStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetClientStatusRequest decode(ProtoReader protoReader) throws IOException {
            C14963a aVar = new C14963a();
            aVar.f39616a = true;
            aVar.f39617b = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39616a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f39617b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetClientStatusRequest getClientStatusRequest) throws IOException {
            if (getClientStatusRequest.is_from_server != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getClientStatusRequest.is_from_server);
            }
            if (getClientStatusRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getClientStatusRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getClientStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetClientStatusRequest$a */
    public static final class C14963a extends Message.Builder<GetClientStatusRequest, C14963a> {

        /* renamed from: a */
        public Boolean f39616a;

        /* renamed from: b */
        public SyncDataStrategy f39617b;

        /* renamed from: a */
        public GetClientStatusRequest build() {
            return new GetClientStatusRequest(this.f39616a, this.f39617b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14963a newBuilder() {
        C14963a aVar = new C14963a();
        aVar.f39616a = this.is_from_server;
        aVar.f39617b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetClientStatusRequest");
        StringBuilder sb = new StringBuilder();
        if (this.is_from_server != null) {
            sb.append(", is_from_server=");
            sb.append(this.is_from_server);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetClientStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetClientStatusRequest(Boolean bool, SyncDataStrategy syncDataStrategy) {
        this(bool, syncDataStrategy, ByteString.EMPTY);
    }

    public GetClientStatusRequest(Boolean bool, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_from_server = bool;
        this.sync_data_strategy = syncDataStrategy;
    }
}
