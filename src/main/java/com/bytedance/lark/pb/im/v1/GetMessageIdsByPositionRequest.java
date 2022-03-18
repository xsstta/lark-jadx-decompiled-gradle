package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetMessageIdsByPositionRequest extends Message<GetMessageIdsByPositionRequest, C17613a> {
    public static final ProtoAdapter<GetMessageIdsByPositionRequest> ADAPTER = new C17614b();
    public static final Integer DEFAULT_COUNT = 100;
    public static final Integer DEFAULT_START_POSITION = 0;
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Integer count;
    public final Integer start_position;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageIdsByPositionRequest$b */
    private static final class C17614b extends ProtoAdapter<GetMessageIdsByPositionRequest> {
        C17614b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageIdsByPositionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageIdsByPositionRequest getMessageIdsByPositionRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageIdsByPositionRequest.chat_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageIdsByPositionRequest.start_position);
            int i2 = 0;
            if (getMessageIdsByPositionRequest.count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(3, getMessageIdsByPositionRequest.count);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getMessageIdsByPositionRequest.sync_data_strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(4, getMessageIdsByPositionRequest.sync_data_strategy);
            }
            return i3 + i2 + getMessageIdsByPositionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageIdsByPositionRequest decode(ProtoReader protoReader) throws IOException {
            C17613a aVar = new C17613a();
            aVar.f44607a = "";
            aVar.f44608b = 0;
            aVar.f44609c = 100;
            aVar.f44610d = SyncDataStrategy.TRY_LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44607a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44608b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44609c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44610d = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageIdsByPositionRequest getMessageIdsByPositionRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageIdsByPositionRequest.chat_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageIdsByPositionRequest.start_position);
            if (getMessageIdsByPositionRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getMessageIdsByPositionRequest.count);
            }
            if (getMessageIdsByPositionRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 4, getMessageIdsByPositionRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getMessageIdsByPositionRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17613a newBuilder() {
        C17613a aVar = new C17613a();
        aVar.f44607a = this.chat_id;
        aVar.f44608b = this.start_position;
        aVar.f44609c = this.count;
        aVar.f44610d = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageIdsByPositionRequest$a */
    public static final class C17613a extends Message.Builder<GetMessageIdsByPositionRequest, C17613a> {

        /* renamed from: a */
        public String f44607a;

        /* renamed from: b */
        public Integer f44608b;

        /* renamed from: c */
        public Integer f44609c;

        /* renamed from: d */
        public SyncDataStrategy f44610d;

        /* renamed from: a */
        public GetMessageIdsByPositionRequest build() {
            Integer num;
            String str = this.f44607a;
            if (str != null && (num = this.f44608b) != null) {
                return new GetMessageIdsByPositionRequest(str, num, this.f44609c, this.f44610d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f44608b, "start_position");
        }

        /* renamed from: a */
        public C17613a mo61610a(Integer num) {
            this.f44608b = num;
            return this;
        }

        /* renamed from: b */
        public C17613a mo61613b(Integer num) {
            this.f44609c = num;
            return this;
        }

        /* renamed from: a */
        public C17613a mo61611a(String str) {
            this.f44607a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessageIdsByPositionRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        sb.append(", start_position=");
        sb.append(this.start_position);
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageIdsByPositionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageIdsByPositionRequest(String str, Integer num, Integer num2, SyncDataStrategy syncDataStrategy) {
        this(str, num, num2, syncDataStrategy, ByteString.EMPTY);
    }

    public GetMessageIdsByPositionRequest(String str, Integer num, Integer num2, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.start_position = num;
        this.count = num2;
        this.sync_data_strategy = syncDataStrategy;
    }
}
