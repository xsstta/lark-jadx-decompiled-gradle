package com.bytedance.lark.pb.passport.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserSidebarRequest extends Message<GetUserSidebarRequest, C18727a> {
    public static final ProtoAdapter<GetUserSidebarRequest> ADAPTER = new C18728b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetUserSidebarRequest$b */
    private static final class C18728b extends ProtoAdapter<GetUserSidebarRequest> {
        C18728b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserSidebarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserSidebarRequest getUserSidebarRequest) {
            int i;
            if (getUserSidebarRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getUserSidebarRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getUserSidebarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserSidebarRequest decode(ProtoReader protoReader) throws IOException {
            C18727a aVar = new C18727a();
            aVar.f46274a = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46274a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserSidebarRequest getUserSidebarRequest) throws IOException {
            if (getUserSidebarRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getUserSidebarRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getUserSidebarRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetUserSidebarRequest$a */
    public static final class C18727a extends Message.Builder<GetUserSidebarRequest, C18727a> {

        /* renamed from: a */
        public SyncDataStrategy f46274a;

        /* renamed from: a */
        public GetUserSidebarRequest build() {
            return new GetUserSidebarRequest(this.f46274a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18727a mo64405a(SyncDataStrategy syncDataStrategy) {
            this.f46274a = syncDataStrategy;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18727a newBuilder() {
        C18727a aVar = new C18727a();
        aVar.f46274a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("passport", "GetUserSidebarRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserSidebarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserSidebarRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetUserSidebarRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
