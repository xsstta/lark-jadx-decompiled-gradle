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

public final class GetMiniAppControlInfoResponse extends Message<GetMiniAppControlInfoResponse, C18663a> {
    public static final ProtoAdapter<GetMiniAppControlInfoResponse> ADAPTER = new C18664b();
    public static final DataFrom DEFAULT_DATA_FROM = DataFrom.Local;
    private static final long serialVersionUID = 0;
    public final MiniAppInfo app_info;
    public final DataFrom data_from;
    public final GuideTips tips;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse$b */
    private static final class C18664b extends ProtoAdapter<GetMiniAppControlInfoResponse> {
        C18664b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMiniAppControlInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMiniAppControlInfoResponse getMiniAppControlInfoResponse) {
            int i;
            int encodedSizeWithTag = DataFrom.ADAPTER.encodedSizeWithTag(1, getMiniAppControlInfoResponse.data_from);
            int i2 = 0;
            if (getMiniAppControlInfoResponse.app_info != null) {
                i = MiniAppInfo.ADAPTER.encodedSizeWithTag(2, getMiniAppControlInfoResponse.app_info);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getMiniAppControlInfoResponse.tips != null) {
                i2 = GuideTips.ADAPTER.encodedSizeWithTag(3, getMiniAppControlInfoResponse.tips);
            }
            return i3 + i2 + getMiniAppControlInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMiniAppControlInfoResponse decode(ProtoReader protoReader) throws IOException {
            C18663a aVar = new C18663a();
            aVar.f46190a = DataFrom.Local;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46190a = DataFrom.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f46191b = MiniAppInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46192c = GuideTips.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMiniAppControlInfoResponse getMiniAppControlInfoResponse) throws IOException {
            DataFrom.ADAPTER.encodeWithTag(protoWriter, 1, getMiniAppControlInfoResponse.data_from);
            if (getMiniAppControlInfoResponse.app_info != null) {
                MiniAppInfo.ADAPTER.encodeWithTag(protoWriter, 2, getMiniAppControlInfoResponse.app_info);
            }
            if (getMiniAppControlInfoResponse.tips != null) {
                GuideTips.ADAPTER.encodeWithTag(protoWriter, 3, getMiniAppControlInfoResponse.tips);
            }
            protoWriter.writeBytes(getMiniAppControlInfoResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18663a newBuilder() {
        C18663a aVar = new C18663a();
        aVar.f46190a = this.data_from;
        aVar.f46191b = this.app_info;
        aVar.f46192c = this.tips;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse$a */
    public static final class C18663a extends Message.Builder<GetMiniAppControlInfoResponse, C18663a> {

        /* renamed from: a */
        public DataFrom f46190a;

        /* renamed from: b */
        public MiniAppInfo f46191b;

        /* renamed from: c */
        public GuideTips f46192c;

        /* renamed from: a */
        public GetMiniAppControlInfoResponse build() {
            DataFrom dataFrom = this.f46190a;
            if (dataFrom != null) {
                return new GetMiniAppControlInfoResponse(dataFrom, this.f46191b, this.f46192c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(dataFrom, "data_from");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetMiniAppControlInfoResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", data_from=");
        sb.append(this.data_from);
        if (this.app_info != null) {
            sb.append(", app_info=");
            sb.append(this.app_info);
        }
        if (this.tips != null) {
            sb.append(", tips=");
            sb.append(this.tips);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMiniAppControlInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMiniAppControlInfoResponse(DataFrom dataFrom, MiniAppInfo miniAppInfo, GuideTips guideTips) {
        this(dataFrom, miniAppInfo, guideTips, ByteString.EMPTY);
    }

    public GetMiniAppControlInfoResponse(DataFrom dataFrom, MiniAppInfo miniAppInfo, GuideTips guideTips, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data_from = dataFrom;
        this.app_info = miniAppInfo;
        this.tips = guideTips;
    }
}
