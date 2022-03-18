package com.bytedance.lark.pb.contact.v1;

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

public final class MGetChattersRequest extends Message<MGetChattersRequest, C16324a> {
    public static final ProtoAdapter<MGetChattersRequest> ADAPTER = new C16325b();
    public static final Boolean DEFAULT_IS_FROM_SERVER = false;
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.LOCAL;
    private static final long serialVersionUID = 0;
    public final List<String> chatter_ids;
    public final Boolean is_from_server;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.contact.v1.MGetChattersRequest$b */
    private static final class C16325b extends ProtoAdapter<MGetChattersRequest> {
        C16325b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetChattersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetChattersRequest mGetChattersRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetChattersRequest.chatter_ids);
            int i2 = 0;
            if (mGetChattersRequest.is_from_server != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, mGetChattersRequest.is_from_server);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mGetChattersRequest.sync_data_strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(3, mGetChattersRequest.sync_data_strategy);
            }
            return i3 + i2 + mGetChattersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetChattersRequest decode(ProtoReader protoReader) throws IOException {
            C16324a aVar = new C16324a();
            aVar.f42571b = false;
            aVar.f42572c = SyncDataStrategy.LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42570a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f42571b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42572c = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetChattersRequest mGetChattersRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetChattersRequest.chatter_ids);
            if (mGetChattersRequest.is_from_server != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mGetChattersRequest.is_from_server);
            }
            if (mGetChattersRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, mGetChattersRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(mGetChattersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.MGetChattersRequest$a */
    public static final class C16324a extends Message.Builder<MGetChattersRequest, C16324a> {

        /* renamed from: a */
        public List<String> f42570a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f42571b;

        /* renamed from: c */
        public SyncDataStrategy f42572c;

        /* renamed from: a */
        public MGetChattersRequest build() {
            return new MGetChattersRequest(this.f42570a, this.f42571b, this.f42572c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16324a mo58369a(Boolean bool) {
            this.f42571b = bool;
            return this;
        }

        /* renamed from: a */
        public C16324a mo58370a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42570a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16324a newBuilder() {
        C16324a aVar = new C16324a();
        aVar.f42570a = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f42571b = this.is_from_server;
        aVar.f42572c = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "MGetChattersRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (this.is_from_server != null) {
            sb.append(", is_from_server=");
            sb.append(this.is_from_server);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetChattersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetChattersRequest(List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy) {
        this(list, bool, syncDataStrategy, ByteString.EMPTY);
    }

    public MGetChattersRequest(List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.is_from_server = bool;
        this.sync_data_strategy = syncDataStrategy;
    }
}
