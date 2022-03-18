package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetContactTokenResponse extends Message<GetContactTokenResponse, C17560a> {
    public static final ProtoAdapter<GetContactTokenResponse> ADAPTER = new C17561b();
    public static final Boolean DEFAULT_CAN_SEARCH_WITH_TOKEN = false;
    private static final long serialVersionUID = 0;
    public final Boolean can_search_with_token;
    public final String country_code;
    public final String invite_msg;
    public final String invite_url;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetContactTokenResponse$b */
    private static final class C17561b extends ProtoAdapter<GetContactTokenResponse> {
        C17561b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetContactTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetContactTokenResponse getContactTokenResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getContactTokenResponse.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getContactTokenResponse.token);
            } else {
                i = 0;
            }
            if (getContactTokenResponse.invite_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getContactTokenResponse.invite_url);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (getContactTokenResponse.invite_msg != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getContactTokenResponse.invite_msg);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getContactTokenResponse.country_code != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, getContactTokenResponse.country_code);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getContactTokenResponse.can_search_with_token != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getContactTokenResponse.can_search_with_token);
            }
            return i8 + i5 + getContactTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetContactTokenResponse decode(ProtoReader protoReader) throws IOException {
            C17560a aVar = new C17560a();
            aVar.f44519a = "";
            aVar.f44520b = "";
            aVar.f44521c = "";
            aVar.f44522d = "";
            aVar.f44523e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44519a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44520b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44521c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f44522d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44523e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetContactTokenResponse getContactTokenResponse) throws IOException {
            if (getContactTokenResponse.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getContactTokenResponse.token);
            }
            if (getContactTokenResponse.invite_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getContactTokenResponse.invite_url);
            }
            if (getContactTokenResponse.invite_msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getContactTokenResponse.invite_msg);
            }
            if (getContactTokenResponse.country_code != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getContactTokenResponse.country_code);
            }
            if (getContactTokenResponse.can_search_with_token != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getContactTokenResponse.can_search_with_token);
            }
            protoWriter.writeBytes(getContactTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetContactTokenResponse$a */
    public static final class C17560a extends Message.Builder<GetContactTokenResponse, C17560a> {

        /* renamed from: a */
        public String f44519a;

        /* renamed from: b */
        public String f44520b;

        /* renamed from: c */
        public String f44521c;

        /* renamed from: d */
        public String f44522d;

        /* renamed from: e */
        public Boolean f44523e;

        /* renamed from: a */
        public GetContactTokenResponse build() {
            return new GetContactTokenResponse(this.f44519a, this.f44520b, this.f44521c, this.f44522d, this.f44523e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17560a newBuilder() {
        C17560a aVar = new C17560a();
        aVar.f44519a = this.token;
        aVar.f44520b = this.invite_url;
        aVar.f44521c = this.invite_msg;
        aVar.f44522d = this.country_code;
        aVar.f44523e = this.can_search_with_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetContactTokenResponse");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.invite_url != null) {
            sb.append(", invite_url=");
            sb.append(this.invite_url);
        }
        if (this.invite_msg != null) {
            sb.append(", invite_msg=");
            sb.append(this.invite_msg);
        }
        if (this.country_code != null) {
            sb.append(", country_code=");
            sb.append(this.country_code);
        }
        if (this.can_search_with_token != null) {
            sb.append(", can_search_with_token=");
            sb.append(this.can_search_with_token);
        }
        StringBuilder replace = sb.replace(0, 2, "GetContactTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetContactTokenResponse(String str, String str2, String str3, String str4, Boolean bool) {
        this(str, str2, str3, str4, bool, ByteString.EMPTY);
    }

    public GetContactTokenResponse(String str, String str2, String str3, String str4, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.invite_url = str2;
        this.invite_msg = str3;
        this.country_code = str4;
        this.can_search_with_token = bool;
    }
}
