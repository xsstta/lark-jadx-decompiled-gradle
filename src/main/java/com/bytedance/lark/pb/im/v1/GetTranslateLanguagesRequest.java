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

public final class GetTranslateLanguagesRequest extends Message<GetTranslateLanguagesRequest, C17729a> {
    public static final ProtoAdapter<GetTranslateLanguagesRequest> ADAPTER = new C17730b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTranslateLanguagesRequest$b */
    private static final class C17730b extends ProtoAdapter<GetTranslateLanguagesRequest> {
        C17730b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTranslateLanguagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTranslateLanguagesRequest getTranslateLanguagesRequest) {
            int i;
            if (getTranslateLanguagesRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(3, getTranslateLanguagesRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getTranslateLanguagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTranslateLanguagesRequest decode(ProtoReader protoReader) throws IOException {
            C17729a aVar = new C17729a();
            aVar.f44760a = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44760a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTranslateLanguagesRequest getTranslateLanguagesRequest) throws IOException {
            if (getTranslateLanguagesRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, getTranslateLanguagesRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getTranslateLanguagesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTranslateLanguagesRequest$a */
    public static final class C17729a extends Message.Builder<GetTranslateLanguagesRequest, C17729a> {

        /* renamed from: a */
        public SyncDataStrategy f44760a;

        /* renamed from: a */
        public GetTranslateLanguagesRequest build() {
            return new GetTranslateLanguagesRequest(this.f44760a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17729a mo61896a(SyncDataStrategy syncDataStrategy) {
            this.f44760a = syncDataStrategy;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17729a newBuilder() {
        C17729a aVar = new C17729a();
        aVar.f44760a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTranslateLanguagesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTranslateLanguagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTranslateLanguagesRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetTranslateLanguagesRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
