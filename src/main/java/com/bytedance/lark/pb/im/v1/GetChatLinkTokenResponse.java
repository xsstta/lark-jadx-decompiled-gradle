package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatLinkTokenResponse extends Message<GetChatLinkTokenResponse, C17526a> {
    public static final ProtoAdapter<GetChatLinkTokenResponse> ADAPTER = new C17527b();
    public static final Long DEFAULT_EXPIRE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long expire_time;
    public final String paste_text;
    public final String share_token;
    public final String shared_url;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLinkTokenResponse$b */
    private static final class C17527b extends ProtoAdapter<GetChatLinkTokenResponse> {
        C17527b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatLinkTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatLinkTokenResponse getChatLinkTokenResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getChatLinkTokenResponse.share_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatLinkTokenResponse.share_token);
            } else {
                i = 0;
            }
            if (getChatLinkTokenResponse.expire_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getChatLinkTokenResponse.expire_time);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (getChatLinkTokenResponse.shared_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getChatLinkTokenResponse.shared_url);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getChatLinkTokenResponse.paste_text != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, getChatLinkTokenResponse.paste_text);
            }
            return i6 + i4 + getChatLinkTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatLinkTokenResponse decode(ProtoReader protoReader) throws IOException {
            C17526a aVar = new C17526a();
            aVar.f44458a = "";
            aVar.f44459b = 0L;
            aVar.f44460c = "";
            aVar.f44461d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44458a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44459b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44460c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44461d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatLinkTokenResponse getChatLinkTokenResponse) throws IOException {
            if (getChatLinkTokenResponse.share_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatLinkTokenResponse.share_token);
            }
            if (getChatLinkTokenResponse.expire_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getChatLinkTokenResponse.expire_time);
            }
            if (getChatLinkTokenResponse.shared_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getChatLinkTokenResponse.shared_url);
            }
            if (getChatLinkTokenResponse.paste_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getChatLinkTokenResponse.paste_text);
            }
            protoWriter.writeBytes(getChatLinkTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLinkTokenResponse$a */
    public static final class C17526a extends Message.Builder<GetChatLinkTokenResponse, C17526a> {

        /* renamed from: a */
        public String f44458a;

        /* renamed from: b */
        public Long f44459b;

        /* renamed from: c */
        public String f44460c;

        /* renamed from: d */
        public String f44461d;

        /* renamed from: a */
        public GetChatLinkTokenResponse build() {
            return new GetChatLinkTokenResponse(this.f44458a, this.f44459b, this.f44460c, this.f44461d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17526a newBuilder() {
        C17526a aVar = new C17526a();
        aVar.f44458a = this.share_token;
        aVar.f44459b = this.expire_time;
        aVar.f44460c = this.shared_url;
        aVar.f44461d = this.paste_text;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatLinkTokenResponse");
        StringBuilder sb = new StringBuilder();
        if (this.share_token != null) {
            sb.append(", share_token=");
            sb.append(this.share_token);
        }
        if (this.expire_time != null) {
            sb.append(", expire_time=");
            sb.append(this.expire_time);
        }
        if (this.shared_url != null) {
            sb.append(", shared_url=");
            sb.append(this.shared_url);
        }
        if (this.paste_text != null) {
            sb.append(", paste_text=");
            sb.append(this.paste_text);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatLinkTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatLinkTokenResponse(String str, Long l, String str2, String str3) {
        this(str, l, str2, str3, ByteString.EMPTY);
    }

    public GetChatLinkTokenResponse(String str, Long l, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.share_token = str;
        this.expire_time = l;
        this.shared_url = str2;
        this.paste_text = str3;
    }
}
