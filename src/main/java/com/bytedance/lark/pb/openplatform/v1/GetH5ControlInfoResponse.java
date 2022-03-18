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

public final class GetH5ControlInfoResponse extends Message<GetH5ControlInfoResponse, C18659a> {
    public static final ProtoAdapter<GetH5ControlInfoResponse> ADAPTER = new C18660b();
    public static final DataFrom DEFAULT_DATA_FROM = DataFrom.Local;
    private static final long serialVersionUID = 0;
    public final DataFrom data_from;
    public final H5Info h5_info;
    public final GuideTips tips;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse$b */
    private static final class C18660b extends ProtoAdapter<GetH5ControlInfoResponse> {
        C18660b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetH5ControlInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetH5ControlInfoResponse getH5ControlInfoResponse) {
            int i;
            int encodedSizeWithTag = DataFrom.ADAPTER.encodedSizeWithTag(1, getH5ControlInfoResponse.data_from);
            int i2 = 0;
            if (getH5ControlInfoResponse.h5_info != null) {
                i = H5Info.ADAPTER.encodedSizeWithTag(2, getH5ControlInfoResponse.h5_info);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getH5ControlInfoResponse.tips != null) {
                i2 = GuideTips.ADAPTER.encodedSizeWithTag(3, getH5ControlInfoResponse.tips);
            }
            return i3 + i2 + getH5ControlInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetH5ControlInfoResponse decode(ProtoReader protoReader) throws IOException {
            C18659a aVar = new C18659a();
            aVar.f46185a = DataFrom.Local;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46185a = DataFrom.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f46186b = H5Info.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46187c = GuideTips.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetH5ControlInfoResponse getH5ControlInfoResponse) throws IOException {
            DataFrom.ADAPTER.encodeWithTag(protoWriter, 1, getH5ControlInfoResponse.data_from);
            if (getH5ControlInfoResponse.h5_info != null) {
                H5Info.ADAPTER.encodeWithTag(protoWriter, 2, getH5ControlInfoResponse.h5_info);
            }
            if (getH5ControlInfoResponse.tips != null) {
                GuideTips.ADAPTER.encodeWithTag(protoWriter, 3, getH5ControlInfoResponse.tips);
            }
            protoWriter.writeBytes(getH5ControlInfoResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18659a newBuilder() {
        C18659a aVar = new C18659a();
        aVar.f46185a = this.data_from;
        aVar.f46186b = this.h5_info;
        aVar.f46187c = this.tips;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse$a */
    public static final class C18659a extends Message.Builder<GetH5ControlInfoResponse, C18659a> {

        /* renamed from: a */
        public DataFrom f46185a;

        /* renamed from: b */
        public H5Info f46186b;

        /* renamed from: c */
        public GuideTips f46187c;

        /* renamed from: a */
        public GetH5ControlInfoResponse build() {
            DataFrom dataFrom = this.f46185a;
            if (dataFrom != null) {
                return new GetH5ControlInfoResponse(dataFrom, this.f46186b, this.f46187c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(dataFrom, "data_from");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetH5ControlInfoResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", data_from=");
        sb.append(this.data_from);
        if (this.h5_info != null) {
            sb.append(", h5_info=");
            sb.append(this.h5_info);
        }
        if (this.tips != null) {
            sb.append(", tips=");
            sb.append(this.tips);
        }
        StringBuilder replace = sb.replace(0, 2, "GetH5ControlInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetH5ControlInfoResponse(DataFrom dataFrom, H5Info h5Info, GuideTips guideTips) {
        this(dataFrom, h5Info, guideTips, ByteString.EMPTY);
    }

    public GetH5ControlInfoResponse(DataFrom dataFrom, H5Info h5Info, GuideTips guideTips, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data_from = dataFrom;
        this.h5_info = h5Info;
        this.tips = guideTips;
    }
}
