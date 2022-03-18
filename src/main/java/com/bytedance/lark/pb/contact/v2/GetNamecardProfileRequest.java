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

public final class GetNamecardProfileRequest extends Message<GetNamecardProfileRequest, C16470a> {
    public static final ProtoAdapter<GetNamecardProfileRequest> ADAPTER = new C16471b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.LOCAL;
    private static final long serialVersionUID = 0;
    public final QueryCondition query_condition;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardProfileRequest$b */
    private static final class C16471b extends ProtoAdapter<GetNamecardProfileRequest> {
        C16471b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNamecardProfileRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNamecardProfileRequest getNamecardProfileRequest) {
            int i;
            int i2 = 0;
            if (getNamecardProfileRequest.query_condition != null) {
                i = QueryCondition.ADAPTER.encodedSizeWithTag(1, getNamecardProfileRequest.query_condition);
            } else {
                i = 0;
            }
            if (getNamecardProfileRequest.sync_data_strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getNamecardProfileRequest.sync_data_strategy);
            }
            return i + i2 + getNamecardProfileRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetNamecardProfileRequest decode(ProtoReader protoReader) throws IOException {
            C16470a aVar = new C16470a();
            aVar.f42775b = SyncDataStrategy.LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42774a = QueryCondition.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42775b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNamecardProfileRequest getNamecardProfileRequest) throws IOException {
            if (getNamecardProfileRequest.query_condition != null) {
                QueryCondition.ADAPTER.encodeWithTag(protoWriter, 1, getNamecardProfileRequest.query_condition);
            }
            if (getNamecardProfileRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getNamecardProfileRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getNamecardProfileRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardProfileRequest$a */
    public static final class C16470a extends Message.Builder<GetNamecardProfileRequest, C16470a> {

        /* renamed from: a */
        public QueryCondition f42774a;

        /* renamed from: b */
        public SyncDataStrategy f42775b;

        /* renamed from: a */
        public GetNamecardProfileRequest build() {
            return new GetNamecardProfileRequest(this.f42774a, this.f42775b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16470a newBuilder() {
        C16470a aVar = new C16470a();
        aVar.f42774a = this.query_condition;
        aVar.f42775b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetNamecardProfileRequest");
        StringBuilder sb = new StringBuilder();
        if (this.query_condition != null) {
            sb.append(", query_condition=");
            sb.append(this.query_condition);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNamecardProfileRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetNamecardProfileRequest(QueryCondition queryCondition, SyncDataStrategy syncDataStrategy) {
        this(queryCondition, syncDataStrategy, ByteString.EMPTY);
    }

    public GetNamecardProfileRequest(QueryCondition queryCondition, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query_condition = queryCondition;
        this.sync_data_strategy = syncDataStrategy;
    }
}
