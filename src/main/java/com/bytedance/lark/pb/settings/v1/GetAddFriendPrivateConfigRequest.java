package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class GetAddFriendPrivateConfigRequest extends Message<GetAddFriendPrivateConfigRequest, C19135a> {
    public static final ProtoAdapter<GetAddFriendPrivateConfigRequest> ADAPTER = new C19136b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.LOCAL;
    public static final VersionType DEFAULT_VERSION = VersionType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;
    public final VersionType version;

    public enum VersionType implements WireEnum {
        UNKNOWN(0),
        FIRST_VERSION(1);
        
        public static final ProtoAdapter<VersionType> ADAPTER = ProtoAdapter.newEnumAdapter(VersionType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static VersionType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return FIRST_VERSION;
        }

        private VersionType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetAddFriendPrivateConfigRequest$b */
    private static final class C19136b extends ProtoAdapter<GetAddFriendPrivateConfigRequest> {
        C19136b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAddFriendPrivateConfigRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAddFriendPrivateConfigRequest getAddFriendPrivateConfigRequest) {
            int i;
            int i2 = 0;
            if (getAddFriendPrivateConfigRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getAddFriendPrivateConfigRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            if (getAddFriendPrivateConfigRequest.version != null) {
                i2 = VersionType.ADAPTER.encodedSizeWithTag(2, getAddFriendPrivateConfigRequest.version);
            }
            return i + i2 + getAddFriendPrivateConfigRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAddFriendPrivateConfigRequest decode(ProtoReader protoReader) throws IOException {
            C19135a aVar = new C19135a();
            aVar.f47274a = SyncDataStrategy.LOCAL;
            aVar.f47275b = VersionType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f47274a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47275b = VersionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAddFriendPrivateConfigRequest getAddFriendPrivateConfigRequest) throws IOException {
            if (getAddFriendPrivateConfigRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getAddFriendPrivateConfigRequest.sync_data_strategy);
            }
            if (getAddFriendPrivateConfigRequest.version != null) {
                VersionType.ADAPTER.encodeWithTag(protoWriter, 2, getAddFriendPrivateConfigRequest.version);
            }
            protoWriter.writeBytes(getAddFriendPrivateConfigRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetAddFriendPrivateConfigRequest$a */
    public static final class C19135a extends Message.Builder<GetAddFriendPrivateConfigRequest, C19135a> {

        /* renamed from: a */
        public SyncDataStrategy f47274a;

        /* renamed from: b */
        public VersionType f47275b;

        /* renamed from: a */
        public GetAddFriendPrivateConfigRequest build() {
            return new GetAddFriendPrivateConfigRequest(this.f47274a, this.f47275b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19135a mo65415a(VersionType versionType) {
            this.f47275b = versionType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19135a newBuilder() {
        C19135a aVar = new C19135a();
        aVar.f47274a = this.sync_data_strategy;
        aVar.f47275b = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetAddFriendPrivateConfigRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAddFriendPrivateConfigRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAddFriendPrivateConfigRequest(SyncDataStrategy syncDataStrategy, VersionType versionType) {
        this(syncDataStrategy, versionType, ByteString.EMPTY);
    }

    public GetAddFriendPrivateConfigRequest(SyncDataStrategy syncDataStrategy, VersionType versionType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
        this.version = versionType;
    }
}
