package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetClientStatusResponse extends Message<GetClientStatusResponse, C14965a> {
    public static final ProtoAdapter<GetClientStatusResponse> ADAPTER = new C14966b();
    public static final Boolean DEFAULT_SHOW_NOTICE_DETAIL = true;
    public static final Boolean DEFAULT_SHOW_PHONE_ALERT = true;
    private static final long serialVersionUID = 0;
    public final String settings;
    public final Boolean show_notice_detail;
    public final Boolean show_phone_alert;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetClientStatusResponse$b */
    private static final class C14966b extends ProtoAdapter<GetClientStatusResponse> {
        C14966b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetClientStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetClientStatusResponse getClientStatusResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getClientStatusResponse.settings != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getClientStatusResponse.settings);
            } else {
                i = 0;
            }
            if (getClientStatusResponse.show_notice_detail != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getClientStatusResponse.show_notice_detail);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getClientStatusResponse.show_phone_alert != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getClientStatusResponse.show_phone_alert);
            }
            return i4 + i3 + getClientStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetClientStatusResponse decode(ProtoReader protoReader) throws IOException {
            C14965a aVar = new C14965a();
            aVar.f39618a = "";
            aVar.f39619b = true;
            aVar.f39620c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39618a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39619b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39620c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetClientStatusResponse getClientStatusResponse) throws IOException {
            if (getClientStatusResponse.settings != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getClientStatusResponse.settings);
            }
            if (getClientStatusResponse.show_notice_detail != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getClientStatusResponse.show_notice_detail);
            }
            if (getClientStatusResponse.show_phone_alert != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getClientStatusResponse.show_phone_alert);
            }
            protoWriter.writeBytes(getClientStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetClientStatusResponse$a */
    public static final class C14965a extends Message.Builder<GetClientStatusResponse, C14965a> {

        /* renamed from: a */
        public String f39618a;

        /* renamed from: b */
        public Boolean f39619b;

        /* renamed from: c */
        public Boolean f39620c;

        /* renamed from: a */
        public GetClientStatusResponse build() {
            return new GetClientStatusResponse(this.f39618a, this.f39619b, this.f39620c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14965a newBuilder() {
        C14965a aVar = new C14965a();
        aVar.f39618a = this.settings;
        aVar.f39619b = this.show_notice_detail;
        aVar.f39620c = this.show_phone_alert;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetClientStatusResponse");
        StringBuilder sb = new StringBuilder();
        if (this.settings != null) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        if (this.show_notice_detail != null) {
            sb.append(", show_notice_detail=");
            sb.append(this.show_notice_detail);
        }
        if (this.show_phone_alert != null) {
            sb.append(", show_phone_alert=");
            sb.append(this.show_phone_alert);
        }
        StringBuilder replace = sb.replace(0, 2, "GetClientStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetClientStatusResponse(String str, Boolean bool, Boolean bool2) {
        this(str, bool, bool2, ByteString.EMPTY);
    }

    public GetClientStatusResponse(String str, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.settings = str;
        this.show_notice_detail = bool;
        this.show_phone_alert = bool2;
    }
}
