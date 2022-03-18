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

public final class GetUniversalUserSettingRequest extends Message<GetUniversalUserSettingRequest, C19159a> {
    public static final ProtoAdapter<GetUniversalUserSettingRequest> ADAPTER = new C19160b();
    public static final Boolean DEFAULT_NEED_ALL_KEYS = false;
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final List<String> key;
    public final Boolean need_all_keys;
    public final SyncDataStrategy strategy;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUniversalUserSettingRequest$b */
    private static final class C19160b extends ProtoAdapter<GetUniversalUserSettingRequest> {
        C19160b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUniversalUserSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUniversalUserSettingRequest getUniversalUserSettingRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getUniversalUserSettingRequest.key);
            int i2 = 0;
            if (getUniversalUserSettingRequest.strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getUniversalUserSettingRequest.strategy);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getUniversalUserSettingRequest.need_all_keys != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getUniversalUserSettingRequest.need_all_keys);
            }
            return i3 + i2 + getUniversalUserSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUniversalUserSettingRequest decode(ProtoReader protoReader) throws IOException {
            C19159a aVar = new C19159a();
            aVar.f47299b = SyncDataStrategy.TRY_LOCAL;
            aVar.f47300c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47298a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        aVar.f47299b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47300c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUniversalUserSettingRequest getUniversalUserSettingRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getUniversalUserSettingRequest.key);
            if (getUniversalUserSettingRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getUniversalUserSettingRequest.strategy);
            }
            if (getUniversalUserSettingRequest.need_all_keys != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getUniversalUserSettingRequest.need_all_keys);
            }
            protoWriter.writeBytes(getUniversalUserSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUniversalUserSettingRequest$a */
    public static final class C19159a extends Message.Builder<GetUniversalUserSettingRequest, C19159a> {

        /* renamed from: a */
        public List<String> f47298a = Internal.newMutableList();

        /* renamed from: b */
        public SyncDataStrategy f47299b;

        /* renamed from: c */
        public Boolean f47300c;

        /* renamed from: a */
        public GetUniversalUserSettingRequest build() {
            return new GetUniversalUserSettingRequest(this.f47298a, this.f47299b, this.f47300c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19159a mo65468a(SyncDataStrategy syncDataStrategy) {
            this.f47299b = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C19159a mo65469a(Boolean bool) {
            this.f47300c = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19159a newBuilder() {
        C19159a aVar = new C19159a();
        aVar.f47298a = Internal.copyOf("key", this.key);
        aVar.f47299b = this.strategy;
        aVar.f47300c = this.need_all_keys;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetUniversalUserSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.key.isEmpty()) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        if (this.need_all_keys != null) {
            sb.append(", need_all_keys=");
            sb.append(this.need_all_keys);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUniversalUserSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUniversalUserSettingRequest(List<String> list, SyncDataStrategy syncDataStrategy, Boolean bool) {
        this(list, syncDataStrategy, bool, ByteString.EMPTY);
    }

    public GetUniversalUserSettingRequest(List<String> list, SyncDataStrategy syncDataStrategy, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = Internal.immutableCopyOf("key", list);
        this.strategy = syncDataStrategy;
        this.need_all_keys = bool;
    }
}
