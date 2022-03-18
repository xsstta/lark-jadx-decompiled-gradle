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

public final class PullLeanModeStatusAndAuthorityRequest extends Message<PullLeanModeStatusAndAuthorityRequest, C17861a> {
    public static final ProtoAdapter<PullLeanModeStatusAndAuthorityRequest> ADAPTER = new C17862b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.PullLeanModeStatusAndAuthorityRequest$b */
    private static final class C17862b extends ProtoAdapter<PullLeanModeStatusAndAuthorityRequest> {
        C17862b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullLeanModeStatusAndAuthorityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullLeanModeStatusAndAuthorityRequest pullLeanModeStatusAndAuthorityRequest) {
            int i;
            if (pullLeanModeStatusAndAuthorityRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, pullLeanModeStatusAndAuthorityRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + pullLeanModeStatusAndAuthorityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullLeanModeStatusAndAuthorityRequest decode(ProtoReader protoReader) throws IOException {
            C17861a aVar = new C17861a();
            aVar.f44928a = SyncDataStrategy.FORCE_SERVER;
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
                        aVar.f44928a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullLeanModeStatusAndAuthorityRequest pullLeanModeStatusAndAuthorityRequest) throws IOException {
            if (pullLeanModeStatusAndAuthorityRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, pullLeanModeStatusAndAuthorityRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(pullLeanModeStatusAndAuthorityRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PullLeanModeStatusAndAuthorityRequest$a */
    public static final class C17861a extends Message.Builder<PullLeanModeStatusAndAuthorityRequest, C17861a> {

        /* renamed from: a */
        public SyncDataStrategy f44928a;

        /* renamed from: a */
        public PullLeanModeStatusAndAuthorityRequest build() {
            return new PullLeanModeStatusAndAuthorityRequest(this.f44928a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17861a mo62237a(SyncDataStrategy syncDataStrategy) {
            this.f44928a = syncDataStrategy;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17861a newBuilder() {
        C17861a aVar = new C17861a();
        aVar.f44928a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PullLeanModeStatusAndAuthorityRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "PullLeanModeStatusAndAuthorityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullLeanModeStatusAndAuthorityRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public PullLeanModeStatusAndAuthorityRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
