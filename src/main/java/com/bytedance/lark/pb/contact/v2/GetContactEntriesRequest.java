package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetContactEntriesRequest extends Message<GetContactEntriesRequest, C16448a> {
    public static final ProtoAdapter<GetContactEntriesRequest> ADAPTER = new C16449b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetContactEntriesRequest$b */
    private static final class C16449b extends ProtoAdapter<GetContactEntriesRequest> {
        C16449b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetContactEntriesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetContactEntriesRequest getContactEntriesRequest) {
            int i;
            if (getContactEntriesRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getContactEntriesRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getContactEntriesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetContactEntriesRequest decode(ProtoReader protoReader) throws IOException {
            C16448a aVar = new C16448a();
            aVar.f42745a = SyncDataStrategy.FORCE_SERVER;
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
                        aVar.f42745a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetContactEntriesRequest getContactEntriesRequest) throws IOException {
            if (getContactEntriesRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getContactEntriesRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getContactEntriesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetContactEntriesRequest$a */
    public static final class C16448a extends Message.Builder<GetContactEntriesRequest, C16448a> {

        /* renamed from: a */
        public SyncDataStrategy f42745a;

        /* renamed from: a */
        public GetContactEntriesRequest build() {
            return new GetContactEntriesRequest(this.f42745a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16448a mo58674a(SyncDataStrategy syncDataStrategy) {
            this.f42745a = syncDataStrategy;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16448a newBuilder() {
        C16448a aVar = new C16448a();
        aVar.f42745a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetContactEntriesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetContactEntriesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetContactEntriesRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetContactEntriesRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
