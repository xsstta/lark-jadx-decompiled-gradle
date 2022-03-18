package com.bytedance.lark.pb.url.v1;

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

public final class MGetUrlPreviewRequest extends Message<MGetUrlPreviewRequest, C19815a> {
    public static final ProtoAdapter<MGetUrlPreviewRequest> ADAPTER = new C19816b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final List<GetUrlPreviewRequest> reqs;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.url.v1.MGetUrlPreviewRequest$b */
    private static final class C19816b extends ProtoAdapter<MGetUrlPreviewRequest> {
        C19816b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetUrlPreviewRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetUrlPreviewRequest mGetUrlPreviewRequest) {
            int i;
            int encodedSizeWithTag = GetUrlPreviewRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, mGetUrlPreviewRequest.reqs);
            if (mGetUrlPreviewRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, mGetUrlPreviewRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + mGetUrlPreviewRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetUrlPreviewRequest decode(ProtoReader protoReader) throws IOException {
            C19815a aVar = new C19815a();
            aVar.f48303b = SyncDataStrategy.TRY_LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48302a.add(GetUrlPreviewRequest.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f48303b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetUrlPreviewRequest mGetUrlPreviewRequest) throws IOException {
            GetUrlPreviewRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mGetUrlPreviewRequest.reqs);
            if (mGetUrlPreviewRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, mGetUrlPreviewRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(mGetUrlPreviewRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.url.v1.MGetUrlPreviewRequest$a */
    public static final class C19815a extends Message.Builder<MGetUrlPreviewRequest, C19815a> {

        /* renamed from: a */
        public List<GetUrlPreviewRequest> f48302a = Internal.newMutableList();

        /* renamed from: b */
        public SyncDataStrategy f48303b;

        /* renamed from: a */
        public MGetUrlPreviewRequest build() {
            return new MGetUrlPreviewRequest(this.f48302a, this.f48303b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19815a newBuilder() {
        C19815a aVar = new C19815a();
        aVar.f48302a = Internal.copyOf("reqs", this.reqs);
        aVar.f48303b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("url", "MGetUrlPreviewRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.reqs.isEmpty()) {
            sb.append(", reqs=");
            sb.append(this.reqs);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetUrlPreviewRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetUrlPreviewRequest(List<GetUrlPreviewRequest> list, SyncDataStrategy syncDataStrategy) {
        this(list, syncDataStrategy, ByteString.EMPTY);
    }

    public MGetUrlPreviewRequest(List<GetUrlPreviewRequest> list, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reqs = Internal.immutableCopyOf("reqs", list);
        this.sync_data_strategy = syncDataStrategy;
    }
}
