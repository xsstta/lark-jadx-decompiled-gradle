package com.bytedance.lark.pb.settings.v1;

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

public final class GetSettingsRequest extends Message<GetSettingsRequest, C19155a> {
    public static final ProtoAdapter<GetSettingsRequest> ADAPTER = new C19156b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.LOCAL;
    private static final long serialVersionUID = 0;
    public final List<String> fields;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetSettingsRequest$b */
    private static final class C19156b extends ProtoAdapter<GetSettingsRequest> {
        C19156b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSettingsRequest getSettingsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getSettingsRequest.fields);
            if (getSettingsRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getSettingsRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C19155a aVar = new C19155a();
            aVar.f47295b = SyncDataStrategy.LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47294a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47295b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSettingsRequest getSettingsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getSettingsRequest.fields);
            if (getSettingsRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getSettingsRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getSettingsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetSettingsRequest$a */
    public static final class C19155a extends Message.Builder<GetSettingsRequest, C19155a> {

        /* renamed from: a */
        public List<String> f47294a = Internal.newMutableList();

        /* renamed from: b */
        public SyncDataStrategy f47295b;

        /* renamed from: a */
        public GetSettingsRequest build() {
            return new GetSettingsRequest(this.f47294a, this.f47295b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19155a mo65459a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47294a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19155a newBuilder() {
        C19155a aVar = new C19155a();
        aVar.f47294a = Internal.copyOf("fields", this.fields);
        aVar.f47295b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetSettingsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.fields.isEmpty()) {
            sb.append(", fields=");
            sb.append(this.fields);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSettingsRequest(List<String> list, SyncDataStrategy syncDataStrategy) {
        this(list, syncDataStrategy, ByteString.EMPTY);
    }

    public GetSettingsRequest(List<String> list, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fields = Internal.immutableCopyOf("fields", list);
        this.sync_data_strategy = syncDataStrategy;
    }
}
