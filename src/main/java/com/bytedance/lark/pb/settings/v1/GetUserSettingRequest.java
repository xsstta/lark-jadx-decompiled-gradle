package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserSettingRequest extends Message<GetUserSettingRequest, C19167a> {
    public static final ProtoAdapter<GetUserSettingRequest> ADAPTER = new C19168b();
    public static final Boolean DEFAULT_IS_FROM_SERVER = true;
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final Boolean is_from_server;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUserSettingRequest$b */
    private static final class C19168b extends ProtoAdapter<GetUserSettingRequest> {
        C19168b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserSettingRequest getUserSettingRequest) {
            int i;
            int i2 = 0;
            if (getUserSettingRequest.is_from_server != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getUserSettingRequest.is_from_server);
            } else {
                i = 0;
            }
            if (getUserSettingRequest.sync_data_strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getUserSettingRequest.sync_data_strategy);
            }
            return i + i2 + getUserSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserSettingRequest decode(ProtoReader protoReader) throws IOException {
            C19167a aVar = new C19167a();
            aVar.f47304a = true;
            aVar.f47305b = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47304a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47305b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserSettingRequest getUserSettingRequest) throws IOException {
            if (getUserSettingRequest.is_from_server != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getUserSettingRequest.is_from_server);
            }
            if (getUserSettingRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getUserSettingRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getUserSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUserSettingRequest$a */
    public static final class C19167a extends Message.Builder<GetUserSettingRequest, C19167a> {

        /* renamed from: a */
        public Boolean f47304a;

        /* renamed from: b */
        public SyncDataStrategy f47305b;

        /* renamed from: a */
        public GetUserSettingRequest build() {
            return new GetUserSettingRequest(this.f47304a, this.f47305b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19167a mo65486a(Boolean bool) {
            this.f47304a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19167a newBuilder() {
        C19167a aVar = new C19167a();
        aVar.f47304a = this.is_from_server;
        aVar.f47305b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetUserSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.is_from_server != null) {
            sb.append(", is_from_server=");
            sb.append(this.is_from_server);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserSettingRequest(Boolean bool, SyncDataStrategy syncDataStrategy) {
        this(bool, syncDataStrategy, ByteString.EMPTY);
    }

    public GetUserSettingRequest(Boolean bool, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_from_server = bool;
        this.sync_data_strategy = syncDataStrategy;
    }
}
