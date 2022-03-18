package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullAllAppConfigV2Request extends Message<PullAllAppConfigV2Request, C17853a> {
    public static final ProtoAdapter<PullAllAppConfigV2Request> ADAPTER = new C17854b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.PullAllAppConfigV2Request$b */
    private static final class C17854b extends ProtoAdapter<PullAllAppConfigV2Request> {
        C17854b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAllAppConfigV2Request.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAllAppConfigV2Request pullAllAppConfigV2Request) {
            int i;
            if (pullAllAppConfigV2Request.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, pullAllAppConfigV2Request.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + pullAllAppConfigV2Request.unknownFields().size();
        }

        /* renamed from: a */
        public PullAllAppConfigV2Request decode(ProtoReader protoReader) throws IOException {
            C17853a aVar = new C17853a();
            aVar.f44920a = SyncDataStrategy.FORCE_SERVER;
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
                        aVar.f44920a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAllAppConfigV2Request pullAllAppConfigV2Request) throws IOException {
            if (pullAllAppConfigV2Request.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, pullAllAppConfigV2Request.sync_data_strategy);
            }
            protoWriter.writeBytes(pullAllAppConfigV2Request.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PullAllAppConfigV2Request$a */
    public static final class C17853a extends Message.Builder<PullAllAppConfigV2Request, C17853a> {

        /* renamed from: a */
        public SyncDataStrategy f44920a;

        /* renamed from: a */
        public PullAllAppConfigV2Request build() {
            return new PullAllAppConfigV2Request(this.f44920a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17853a mo62217a(SyncDataStrategy syncDataStrategy) {
            this.f44920a = syncDataStrategy;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17853a newBuilder() {
        C17853a aVar = new C17853a();
        aVar.f44920a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PullAllAppConfigV2Request");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "PullAllAppConfigV2Request{");
        replace.append('}');
        return replace.toString();
    }

    public PullAllAppConfigV2Request(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public PullAllAppConfigV2Request(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
