package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetMiniAppControlInfoRequest extends Message<GetMiniAppControlInfoRequest, C18661a> {
    public static final ProtoAdapter<GetMiniAppControlInfoRequest> ADAPTER = new C18662b();
    public static final GetDataStrategy DEFAULT_STRATEGY = GetDataStrategy.LocalOnly;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final GetDataStrategy strategy;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoRequest$b */
    private static final class C18662b extends ProtoAdapter<GetMiniAppControlInfoRequest> {
        C18662b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMiniAppControlInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMiniAppControlInfoRequest getMiniAppControlInfoRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getMiniAppControlInfoRequest.app_id);
            if (getMiniAppControlInfoRequest.strategy != null) {
                i = GetDataStrategy.ADAPTER.encodedSizeWithTag(2, getMiniAppControlInfoRequest.strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getMiniAppControlInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMiniAppControlInfoRequest decode(ProtoReader protoReader) throws IOException {
            C18661a aVar = new C18661a();
            aVar.f46188a = "";
            aVar.f46189b = GetDataStrategy.LocalOnly;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46188a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46189b = GetDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMiniAppControlInfoRequest getMiniAppControlInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMiniAppControlInfoRequest.app_id);
            if (getMiniAppControlInfoRequest.strategy != null) {
                GetDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getMiniAppControlInfoRequest.strategy);
            }
            protoWriter.writeBytes(getMiniAppControlInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoRequest$a */
    public static final class C18661a extends Message.Builder<GetMiniAppControlInfoRequest, C18661a> {

        /* renamed from: a */
        public String f46188a;

        /* renamed from: b */
        public GetDataStrategy f46189b;

        /* renamed from: a */
        public GetMiniAppControlInfoRequest build() {
            String str = this.f46188a;
            if (str != null) {
                return new GetMiniAppControlInfoRequest(str, this.f46189b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "app_id");
        }

        /* renamed from: a */
        public C18661a mo64247a(GetDataStrategy getDataStrategy) {
            this.f46189b = getDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C18661a mo64248a(String str) {
            this.f46188a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18661a newBuilder() {
        C18661a aVar = new C18661a();
        aVar.f46188a = this.app_id;
        aVar.f46189b = this.strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetMiniAppControlInfoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", app_id=");
        sb.append(this.app_id);
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMiniAppControlInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMiniAppControlInfoRequest(String str, GetDataStrategy getDataStrategy) {
        this(str, getDataStrategy, ByteString.EMPTY);
    }

    public GetMiniAppControlInfoRequest(String str, GetDataStrategy getDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.strategy = getDataStrategy;
    }
}
