package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatQRCodeTokenResponse extends Message<GetChatQRCodeTokenResponse, C17548a> {
    public static final ProtoAdapter<GetChatQRCodeTokenResponse> ADAPTER = new C17549b();
    public static final Long DEFAULT_EXPIRE_TIME = 0L;
    public static final Boolean DEFAULT_IS_UNLIMITED = false;
    private static final long serialVersionUID = 0;
    public final Long expire_time;
    public final Boolean is_unlimited;
    public final String token;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatQRCodeTokenResponse$b */
    private static final class C17549b extends ProtoAdapter<GetChatQRCodeTokenResponse> {
        C17549b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatQRCodeTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatQRCodeTokenResponse getChatQRCodeTokenResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getChatQRCodeTokenResponse.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatQRCodeTokenResponse.token);
            } else {
                i = 0;
            }
            if (getChatQRCodeTokenResponse.url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getChatQRCodeTokenResponse.url);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (getChatQRCodeTokenResponse.expire_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getChatQRCodeTokenResponse.expire_time);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getChatQRCodeTokenResponse.is_unlimited != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getChatQRCodeTokenResponse.is_unlimited);
            }
            return i6 + i4 + getChatQRCodeTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatQRCodeTokenResponse decode(ProtoReader protoReader) throws IOException {
            C17548a aVar = new C17548a();
            aVar.f44508a = "";
            aVar.f44509b = "";
            aVar.f44510c = 0L;
            aVar.f44511d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44508a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44509b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44510c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44511d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatQRCodeTokenResponse getChatQRCodeTokenResponse) throws IOException {
            if (getChatQRCodeTokenResponse.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatQRCodeTokenResponse.token);
            }
            if (getChatQRCodeTokenResponse.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getChatQRCodeTokenResponse.url);
            }
            if (getChatQRCodeTokenResponse.expire_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getChatQRCodeTokenResponse.expire_time);
            }
            if (getChatQRCodeTokenResponse.is_unlimited != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getChatQRCodeTokenResponse.is_unlimited);
            }
            protoWriter.writeBytes(getChatQRCodeTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatQRCodeTokenResponse$a */
    public static final class C17548a extends Message.Builder<GetChatQRCodeTokenResponse, C17548a> {

        /* renamed from: a */
        public String f44508a;

        /* renamed from: b */
        public String f44509b;

        /* renamed from: c */
        public Long f44510c;

        /* renamed from: d */
        public Boolean f44511d;

        /* renamed from: a */
        public GetChatQRCodeTokenResponse build() {
            return new GetChatQRCodeTokenResponse(this.f44508a, this.f44509b, this.f44510c, this.f44511d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17548a newBuilder() {
        C17548a aVar = new C17548a();
        aVar.f44508a = this.token;
        aVar.f44509b = this.url;
        aVar.f44510c = this.expire_time;
        aVar.f44511d = this.is_unlimited;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatQRCodeTokenResponse");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.expire_time != null) {
            sb.append(", expire_time=");
            sb.append(this.expire_time);
        }
        if (this.is_unlimited != null) {
            sb.append(", is_unlimited=");
            sb.append(this.is_unlimited);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatQRCodeTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatQRCodeTokenResponse(String str, String str2, Long l, Boolean bool) {
        this(str, str2, l, bool, ByteString.EMPTY);
    }

    public GetChatQRCodeTokenResponse(String str, String str2, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.url = str2;
        this.expire_time = l;
        this.is_unlimited = bool;
    }
}
