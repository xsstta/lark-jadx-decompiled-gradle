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

public final class GetFocusChatterListRequest extends Message<GetFocusChatterListRequest, C16244a> {
    public static final ProtoAdapter<GetFocusChatterListRequest> ADAPTER = new C16245b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetFocusChatterListRequest$b */
    private static final class C16245b extends ProtoAdapter<GetFocusChatterListRequest> {
        C16245b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFocusChatterListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFocusChatterListRequest getFocusChatterListRequest) {
            int i;
            if (getFocusChatterListRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getFocusChatterListRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getFocusChatterListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetFocusChatterListRequest decode(ProtoReader protoReader) throws IOException {
            C16244a aVar = new C16244a();
            aVar.f42441a = SyncDataStrategy.TRY_LOCAL;
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
                        aVar.f42441a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFocusChatterListRequest getFocusChatterListRequest) throws IOException {
            if (getFocusChatterListRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getFocusChatterListRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getFocusChatterListRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetFocusChatterListRequest$a */
    public static final class C16244a extends Message.Builder<GetFocusChatterListRequest, C16244a> {

        /* renamed from: a */
        public SyncDataStrategy f42441a;

        /* renamed from: a */
        public GetFocusChatterListRequest build() {
            return new GetFocusChatterListRequest(this.f42441a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16244a mo58197a(SyncDataStrategy syncDataStrategy) {
            this.f42441a = syncDataStrategy;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16244a newBuilder() {
        C16244a aVar = new C16244a();
        aVar.f42441a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetFocusChatterListRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFocusChatterListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetFocusChatterListRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetFocusChatterListRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
