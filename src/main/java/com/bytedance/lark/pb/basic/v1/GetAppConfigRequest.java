package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAppConfigRequest extends Message<GetAppConfigRequest, C14959a> {
    public static final ProtoAdapter<GetAppConfigRequest> ADAPTER = new C14960b();
    public static final Boolean DEFAULT_FORCE_REMOTE = false;
    public static final Boolean DEFAULT_NEED_LOGIN = true;
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final Boolean force_remote;
    public final Boolean need_login;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetAppConfigRequest$b */
    private static final class C14960b extends ProtoAdapter<GetAppConfigRequest> {
        C14960b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAppConfigRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAppConfigRequest getAppConfigRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getAppConfigRequest.need_login != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getAppConfigRequest.need_login);
            } else {
                i = 0;
            }
            if (getAppConfigRequest.force_remote != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getAppConfigRequest.force_remote);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getAppConfigRequest.sync_data_strategy != null) {
                i3 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(3, getAppConfigRequest.sync_data_strategy);
            }
            return i4 + i3 + getAppConfigRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAppConfigRequest decode(ProtoReader protoReader) throws IOException {
            C14959a aVar = new C14959a();
            aVar.f39612a = true;
            aVar.f39613b = false;
            aVar.f39614c = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39612a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39613b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f39614c = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAppConfigRequest getAppConfigRequest) throws IOException {
            if (getAppConfigRequest.need_login != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getAppConfigRequest.need_login);
            }
            if (getAppConfigRequest.force_remote != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getAppConfigRequest.force_remote);
            }
            if (getAppConfigRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, getAppConfigRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getAppConfigRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetAppConfigRequest$a */
    public static final class C14959a extends Message.Builder<GetAppConfigRequest, C14959a> {

        /* renamed from: a */
        public Boolean f39612a;

        /* renamed from: b */
        public Boolean f39613b;

        /* renamed from: c */
        public SyncDataStrategy f39614c;

        /* renamed from: a */
        public GetAppConfigRequest build() {
            return new GetAppConfigRequest(this.f39612a, this.f39613b, this.f39614c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14959a mo54724a(Boolean bool) {
            this.f39613b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14959a newBuilder() {
        C14959a aVar = new C14959a();
        aVar.f39612a = this.need_login;
        aVar.f39613b = this.force_remote;
        aVar.f39614c = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetAppConfigRequest");
        StringBuilder sb = new StringBuilder();
        if (this.need_login != null) {
            sb.append(", need_login=");
            sb.append(this.need_login);
        }
        if (this.force_remote != null) {
            sb.append(", force_remote=");
            sb.append(this.force_remote);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAppConfigRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAppConfigRequest(Boolean bool, Boolean bool2, SyncDataStrategy syncDataStrategy) {
        this(bool, bool2, syncDataStrategy, ByteString.EMPTY);
    }

    public GetAppConfigRequest(Boolean bool, Boolean bool2, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.need_login = bool;
        this.force_remote = bool2;
        this.sync_data_strategy = syncDataStrategy;
    }
}
