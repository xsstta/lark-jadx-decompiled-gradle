package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetRepliesRequest extends Message<GetRepliesRequest, C17674a> {
    public static final ProtoAdapter<GetRepliesRequest> ADAPTER = new C17675b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final String root_id;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetRepliesRequest$b */
    private static final class C17675b extends ProtoAdapter<GetRepliesRequest> {
        C17675b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRepliesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRepliesRequest getRepliesRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getRepliesRequest.root_id);
            if (getRepliesRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getRepliesRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getRepliesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetRepliesRequest decode(ProtoReader protoReader) throws IOException {
            C17674a aVar = new C17674a();
            aVar.f44686a = "";
            aVar.f44687b = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44686a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44687b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRepliesRequest getRepliesRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getRepliesRequest.root_id);
            if (getRepliesRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getRepliesRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getRepliesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetRepliesRequest$a */
    public static final class C17674a extends Message.Builder<GetRepliesRequest, C17674a> {

        /* renamed from: a */
        public String f44686a;

        /* renamed from: b */
        public SyncDataStrategy f44687b;

        /* renamed from: a */
        public GetRepliesRequest build() {
            String str = this.f44686a;
            if (str != null) {
                return new GetRepliesRequest(str, this.f44687b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "root_id");
        }

        /* renamed from: a */
        public C17674a mo61754a(SyncDataStrategy syncDataStrategy) {
            this.f44687b = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C17674a mo61755a(String str) {
            this.f44686a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17674a newBuilder() {
        C17674a aVar = new C17674a();
        aVar.f44686a = this.root_id;
        aVar.f44687b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetRepliesRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", root_id=");
        sb.append(this.root_id);
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRepliesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetRepliesRequest(String str, SyncDataStrategy syncDataStrategy) {
        this(str, syncDataStrategy, ByteString.EMPTY);
    }

    public GetRepliesRequest(String str, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.root_id = str;
        this.sync_data_strategy = syncDataStrategy;
    }
}
