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

public final class GetH5ControlInfoRequest extends Message<GetH5ControlInfoRequest, C18657a> {
    public static final ProtoAdapter<GetH5ControlInfoRequest> ADAPTER = new C18658b();
    public static final GetDataStrategy DEFAULT_STRATEGY = GetDataStrategy.LocalOnly;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final GetDataStrategy strategy;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoRequest$b */
    private static final class C18658b extends ProtoAdapter<GetH5ControlInfoRequest> {
        C18658b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetH5ControlInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetH5ControlInfoRequest getH5ControlInfoRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getH5ControlInfoRequest.app_id);
            if (getH5ControlInfoRequest.strategy != null) {
                i = GetDataStrategy.ADAPTER.encodedSizeWithTag(2, getH5ControlInfoRequest.strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getH5ControlInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetH5ControlInfoRequest decode(ProtoReader protoReader) throws IOException {
            C18657a aVar = new C18657a();
            aVar.f46183a = "";
            aVar.f46184b = GetDataStrategy.LocalOnly;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46183a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46184b = GetDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetH5ControlInfoRequest getH5ControlInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getH5ControlInfoRequest.app_id);
            if (getH5ControlInfoRequest.strategy != null) {
                GetDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getH5ControlInfoRequest.strategy);
            }
            protoWriter.writeBytes(getH5ControlInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoRequest$a */
    public static final class C18657a extends Message.Builder<GetH5ControlInfoRequest, C18657a> {

        /* renamed from: a */
        public String f46183a;

        /* renamed from: b */
        public GetDataStrategy f46184b;

        /* renamed from: a */
        public GetH5ControlInfoRequest build() {
            String str = this.f46183a;
            if (str != null) {
                return new GetH5ControlInfoRequest(str, this.f46184b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "app_id");
        }

        /* renamed from: a */
        public C18657a mo64237a(GetDataStrategy getDataStrategy) {
            this.f46184b = getDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C18657a mo64238a(String str) {
            this.f46183a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18657a newBuilder() {
        C18657a aVar = new C18657a();
        aVar.f46183a = this.app_id;
        aVar.f46184b = this.strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetH5ControlInfoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", app_id=");
        sb.append(this.app_id);
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetH5ControlInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetH5ControlInfoRequest(String str, GetDataStrategy getDataStrategy) {
        this(str, getDataStrategy, ByteString.EMPTY);
    }

    public GetH5ControlInfoRequest(String str, GetDataStrategy getDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.strategy = getDataStrategy;
    }
}
