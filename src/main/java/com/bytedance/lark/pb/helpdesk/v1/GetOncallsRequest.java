package com.bytedance.lark.pb.helpdesk.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetOncallsRequest extends Message<GetOncallsRequest, C17262a> {
    public static final ProtoAdapter<GetOncallsRequest> ADAPTER = new C17263b();
    public static final Integer DEFAULT_COUNT = 20;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Integer offset;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.GetOncallsRequest$b */
    private static final class C17263b extends ProtoAdapter<GetOncallsRequest> {
        C17263b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetOncallsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetOncallsRequest getOncallsRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getOncallsRequest.count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getOncallsRequest.count);
            } else {
                i = 0;
            }
            if (getOncallsRequest.offset != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getOncallsRequest.offset);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getOncallsRequest.sync_data_strategy != null) {
                i3 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(3, getOncallsRequest.sync_data_strategy);
            }
            return i4 + i3 + getOncallsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetOncallsRequest decode(ProtoReader protoReader) throws IOException {
            C17262a aVar = new C17262a();
            aVar.f44092a = 20;
            aVar.f44093b = 0;
            aVar.f44094c = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44092a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44093b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44094c = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetOncallsRequest getOncallsRequest) throws IOException {
            if (getOncallsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getOncallsRequest.count);
            }
            if (getOncallsRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getOncallsRequest.offset);
            }
            if (getOncallsRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, getOncallsRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getOncallsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.GetOncallsRequest$a */
    public static final class C17262a extends Message.Builder<GetOncallsRequest, C17262a> {

        /* renamed from: a */
        public Integer f44092a;

        /* renamed from: b */
        public Integer f44093b;

        /* renamed from: c */
        public SyncDataStrategy f44094c;

        /* renamed from: a */
        public GetOncallsRequest build() {
            return new GetOncallsRequest(this.f44092a, this.f44093b, this.f44094c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17262a mo60681a(Integer num) {
            this.f44092a = num;
            return this;
        }

        /* renamed from: b */
        public C17262a mo60683b(Integer num) {
            this.f44093b = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17262a newBuilder() {
        C17262a aVar = new C17262a();
        aVar.f44092a = this.count;
        aVar.f44093b = this.offset;
        aVar.f44094c = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "GetOncallsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetOncallsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetOncallsRequest(Integer num, Integer num2, SyncDataStrategy syncDataStrategy) {
        this(num, num2, syncDataStrategy, ByteString.EMPTY);
    }

    public GetOncallsRequest(Integer num, Integer num2, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count = num;
        this.offset = num2;
        this.sync_data_strategy = syncDataStrategy;
    }
}
