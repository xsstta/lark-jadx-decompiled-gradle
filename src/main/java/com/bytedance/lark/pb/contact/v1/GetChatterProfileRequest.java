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
import okio.ByteString;

public final class GetChatterProfileRequest extends Message<GetChatterProfileRequest, C16198a> {
    public static final ProtoAdapter<GetChatterProfileRequest> ADAPTER = new C16199b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final String chatter_id;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterProfileRequest$b */
    private static final class C16199b extends ProtoAdapter<GetChatterProfileRequest> {
        C16199b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatterProfileRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatterProfileRequest getChatterProfileRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatterProfileRequest.chatter_id);
            if (getChatterProfileRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getChatterProfileRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getChatterProfileRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatterProfileRequest decode(ProtoReader protoReader) throws IOException {
            C16198a aVar = new C16198a();
            aVar.f42355a = "";
            aVar.f42356b = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42355a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42356b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatterProfileRequest getChatterProfileRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatterProfileRequest.chatter_id);
            if (getChatterProfileRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getChatterProfileRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getChatterProfileRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterProfileRequest$a */
    public static final class C16198a extends Message.Builder<GetChatterProfileRequest, C16198a> {

        /* renamed from: a */
        public String f42355a;

        /* renamed from: b */
        public SyncDataStrategy f42356b;

        /* renamed from: a */
        public GetChatterProfileRequest build() {
            String str = this.f42355a;
            if (str != null) {
                return new GetChatterProfileRequest(str, this.f42356b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chatter_id");
        }

        /* renamed from: a */
        public C16198a mo58076a(SyncDataStrategy syncDataStrategy) {
            this.f42356b = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C16198a mo58077a(String str) {
            this.f42355a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16198a newBuilder() {
        C16198a aVar = new C16198a();
        aVar.f42355a = this.chatter_id;
        aVar.f42356b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetChatterProfileRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chatter_id=");
        sb.append(this.chatter_id);
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatterProfileRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatterProfileRequest(String str, SyncDataStrategy syncDataStrategy) {
        this(str, syncDataStrategy, ByteString.EMPTY);
    }

    public GetChatterProfileRequest(String str, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_id = str;
        this.sync_data_strategy = syncDataStrategy;
    }
}
