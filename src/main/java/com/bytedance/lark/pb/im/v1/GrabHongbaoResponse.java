package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GrabHongbaoResponse extends Message<GrabHongbaoResponse, C17779a> {
    public static final ProtoAdapter<GrabHongbaoResponse> ADAPTER = new C17780b();
    public static final Long DEFAULT_AMOUNT = 0L;
    public static final Boolean DEFAULT_IS_REAL_NAME_AUTHED = true;
    private static final long serialVersionUID = 0;
    public final Long amount;
    public final String auth_url;
    public final Boolean is_real_name_authed;

    /* renamed from: com.bytedance.lark.pb.im.v1.GrabHongbaoResponse$b */
    private static final class C17780b extends ProtoAdapter<GrabHongbaoResponse> {
        C17780b() {
            super(FieldEncoding.LENGTH_DELIMITED, GrabHongbaoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GrabHongbaoResponse grabHongbaoResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (grabHongbaoResponse.amount != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, grabHongbaoResponse.amount);
            } else {
                i = 0;
            }
            if (grabHongbaoResponse.is_real_name_authed != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, grabHongbaoResponse.is_real_name_authed);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (grabHongbaoResponse.auth_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, grabHongbaoResponse.auth_url);
            }
            return i4 + i3 + grabHongbaoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GrabHongbaoResponse decode(ProtoReader protoReader) throws IOException {
            C17779a aVar = new C17779a();
            aVar.f44821a = 0L;
            aVar.f44822b = true;
            aVar.f44823c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44821a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44822b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44823c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GrabHongbaoResponse grabHongbaoResponse) throws IOException {
            if (grabHongbaoResponse.amount != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, grabHongbaoResponse.amount);
            }
            if (grabHongbaoResponse.is_real_name_authed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, grabHongbaoResponse.is_real_name_authed);
            }
            if (grabHongbaoResponse.auth_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, grabHongbaoResponse.auth_url);
            }
            protoWriter.writeBytes(grabHongbaoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GrabHongbaoResponse$a */
    public static final class C17779a extends Message.Builder<GrabHongbaoResponse, C17779a> {

        /* renamed from: a */
        public Long f44821a;

        /* renamed from: b */
        public Boolean f44822b;

        /* renamed from: c */
        public String f44823c;

        /* renamed from: a */
        public GrabHongbaoResponse build() {
            return new GrabHongbaoResponse(this.f44821a, this.f44822b, this.f44823c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17779a newBuilder() {
        C17779a aVar = new C17779a();
        aVar.f44821a = this.amount;
        aVar.f44822b = this.is_real_name_authed;
        aVar.f44823c = this.auth_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GrabHongbaoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.amount != null) {
            sb.append(", amount=");
            sb.append(this.amount);
        }
        if (this.is_real_name_authed != null) {
            sb.append(", is_real_name_authed=");
            sb.append(this.is_real_name_authed);
        }
        if (this.auth_url != null) {
            sb.append(", auth_url=");
            sb.append(this.auth_url);
        }
        StringBuilder replace = sb.replace(0, 2, "GrabHongbaoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GrabHongbaoResponse(Long l, Boolean bool, String str) {
        this(l, bool, str, ByteString.EMPTY);
    }

    public GrabHongbaoResponse(Long l, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.amount = l;
        this.is_real_name_authed = bool;
        this.auth_url = str;
    }
}
