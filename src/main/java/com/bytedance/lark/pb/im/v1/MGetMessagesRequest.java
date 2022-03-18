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
import java.util.List;
import okio.ByteString;

public final class MGetMessagesRequest extends Message<MGetMessagesRequest, C17803a> {
    public static final ProtoAdapter<MGetMessagesRequest> ADAPTER = new C17804b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final List<String> message_ids;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetMessagesRequest$b */
    private static final class C17804b extends ProtoAdapter<MGetMessagesRequest> {
        C17804b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetMessagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetMessagesRequest mGetMessagesRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetMessagesRequest.message_ids);
            if (mGetMessagesRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, mGetMessagesRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + mGetMessagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetMessagesRequest decode(ProtoReader protoReader) throws IOException {
            C17803a aVar = new C17803a();
            aVar.f44848b = SyncDataStrategy.TRY_LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44847a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44848b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetMessagesRequest mGetMessagesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetMessagesRequest.message_ids);
            if (mGetMessagesRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, mGetMessagesRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(mGetMessagesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetMessagesRequest$a */
    public static final class C17803a extends Message.Builder<MGetMessagesRequest, C17803a> {

        /* renamed from: a */
        public List<String> f44847a = Internal.newMutableList();

        /* renamed from: b */
        public SyncDataStrategy f44848b;

        /* renamed from: a */
        public MGetMessagesRequest build() {
            return new MGetMessagesRequest(this.f44847a, this.f44848b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17803a mo62070a(SyncDataStrategy syncDataStrategy) {
            this.f44848b = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C17803a mo62071a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44847a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17803a newBuilder() {
        C17803a aVar = new C17803a();
        aVar.f44847a = Internal.copyOf("message_ids", this.message_ids);
        aVar.f44848b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "MGetMessagesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetMessagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetMessagesRequest(List<String> list, SyncDataStrategy syncDataStrategy) {
        this(list, syncDataStrategy, ByteString.EMPTY);
    }

    public MGetMessagesRequest(List<String> list, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", list);
        this.sync_data_strategy = syncDataStrategy;
    }
}
