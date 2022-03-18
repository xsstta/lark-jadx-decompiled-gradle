package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetFeedFilterSettingsRequest extends Message<GetFeedFilterSettingsRequest, C17164a> {
    public static final ProtoAdapter<GetFeedFilterSettingsRequest> ADAPTER = new C17165b();
    public static final Boolean DEFAULT_NEED_ALL = false;
    public static final SyncDataStrategy DEFAULT_SYNC_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final Boolean need_all;
    public final SyncDataStrategy sync_strategy;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedFilterSettingsRequest$b */
    private static final class C17165b extends ProtoAdapter<GetFeedFilterSettingsRequest> {
        C17165b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFeedFilterSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFeedFilterSettingsRequest getFeedFilterSettingsRequest) {
            int i;
            int i2 = 0;
            if (getFeedFilterSettingsRequest.need_all != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getFeedFilterSettingsRequest.need_all);
            } else {
                i = 0;
            }
            if (getFeedFilterSettingsRequest.sync_strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getFeedFilterSettingsRequest.sync_strategy);
            }
            return i + i2 + getFeedFilterSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetFeedFilterSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C17164a aVar = new C17164a();
            aVar.f43916a = false;
            aVar.f43917b = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43916a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43917b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFeedFilterSettingsRequest getFeedFilterSettingsRequest) throws IOException {
            if (getFeedFilterSettingsRequest.need_all != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getFeedFilterSettingsRequest.need_all);
            }
            if (getFeedFilterSettingsRequest.sync_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getFeedFilterSettingsRequest.sync_strategy);
            }
            protoWriter.writeBytes(getFeedFilterSettingsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedFilterSettingsRequest$a */
    public static final class C17164a extends Message.Builder<GetFeedFilterSettingsRequest, C17164a> {

        /* renamed from: a */
        public Boolean f43916a;

        /* renamed from: b */
        public SyncDataStrategy f43917b;

        /* renamed from: a */
        public GetFeedFilterSettingsRequest build() {
            return new GetFeedFilterSettingsRequest(this.f43916a, this.f43917b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17164a mo60448a(SyncDataStrategy syncDataStrategy) {
            this.f43917b = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C17164a mo60449a(Boolean bool) {
            this.f43916a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17164a newBuilder() {
        C17164a aVar = new C17164a();
        aVar.f43916a = this.need_all;
        aVar.f43917b = this.sync_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetFeedFilterSettingsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.need_all != null) {
            sb.append(", need_all=");
            sb.append(this.need_all);
        }
        if (this.sync_strategy != null) {
            sb.append(", sync_strategy=");
            sb.append(this.sync_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFeedFilterSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetFeedFilterSettingsRequest(Boolean bool, SyncDataStrategy syncDataStrategy) {
        this(bool, syncDataStrategy, ByteString.EMPTY);
    }

    public GetFeedFilterSettingsRequest(Boolean bool, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.need_all = bool;
        this.sync_strategy = syncDataStrategy;
    }
}
