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

public final class MGetTenantsRequest extends Message<MGetTenantsRequest, C16328a> {
    public static final ProtoAdapter<MGetTenantsRequest> ADAPTER = new C16329b();
    public static final Boolean DEFAULT_SHOULD_AUTH = false;
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.LOCAL;
    private static final long serialVersionUID = 0;
    public final Boolean should_auth;
    public final SyncDataStrategy sync_data_strategy;
    public final List<String> tenant_ids;

    /* renamed from: com.bytedance.lark.pb.contact.v1.MGetTenantsRequest$b */
    private static final class C16329b extends ProtoAdapter<MGetTenantsRequest> {
        C16329b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetTenantsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetTenantsRequest mGetTenantsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetTenantsRequest.tenant_ids);
            int i2 = 0;
            if (mGetTenantsRequest.should_auth != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, mGetTenantsRequest.should_auth);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mGetTenantsRequest.sync_data_strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(3, mGetTenantsRequest.sync_data_strategy);
            }
            return i3 + i2 + mGetTenantsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetTenantsRequest decode(ProtoReader protoReader) throws IOException {
            C16328a aVar = new C16328a();
            aVar.f42575b = false;
            aVar.f42576c = SyncDataStrategy.LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42574a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f42575b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42576c = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetTenantsRequest mGetTenantsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetTenantsRequest.tenant_ids);
            if (mGetTenantsRequest.should_auth != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mGetTenantsRequest.should_auth);
            }
            if (mGetTenantsRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, mGetTenantsRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(mGetTenantsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.MGetTenantsRequest$a */
    public static final class C16328a extends Message.Builder<MGetTenantsRequest, C16328a> {

        /* renamed from: a */
        public List<String> f42574a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f42575b;

        /* renamed from: c */
        public SyncDataStrategy f42576c;

        /* renamed from: a */
        public MGetTenantsRequest build() {
            return new MGetTenantsRequest(this.f42574a, this.f42575b, this.f42576c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16328a mo58379a(Boolean bool) {
            this.f42575b = bool;
            return this;
        }

        /* renamed from: a */
        public C16328a mo58380a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42574a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16328a newBuilder() {
        C16328a aVar = new C16328a();
        aVar.f42574a = Internal.copyOf("tenant_ids", this.tenant_ids);
        aVar.f42575b = this.should_auth;
        aVar.f42576c = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "MGetTenantsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.tenant_ids.isEmpty()) {
            sb.append(", tenant_ids=");
            sb.append(this.tenant_ids);
        }
        if (this.should_auth != null) {
            sb.append(", should_auth=");
            sb.append(this.should_auth);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetTenantsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetTenantsRequest(List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy) {
        this(list, bool, syncDataStrategy, ByteString.EMPTY);
    }

    public MGetTenantsRequest(List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tenant_ids = Internal.immutableCopyOf("tenant_ids", list);
        this.should_auth = bool;
        this.sync_data_strategy = syncDataStrategy;
    }
}
