package com.ss.android.lark.pb.chats;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullChatQRCodeTokenResponse extends Message<PullChatQRCodeTokenResponse, C49598a> {
    public static final ProtoAdapter<PullChatQRCodeTokenResponse> ADAPTER = new C49599b();
    public static final Long DEFAULT_EXPIRE_TIME = 0L;
    public static final Boolean DEFAULT_IS_UNLIMITED = false;
    private static final long serialVersionUID = 0;
    public final Long mexpire_time;
    public final Boolean mis_unlimited;
    public final String mshared_url;
    public final String mtoken;

    /* renamed from: com.ss.android.lark.pb.chats.PullChatQRCodeTokenResponse$b */
    private static final class C49599b extends ProtoAdapter<PullChatQRCodeTokenResponse> {
        C49599b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatQRCodeTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatQRCodeTokenResponse pullChatQRCodeTokenResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (pullChatQRCodeTokenResponse.mtoken != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pullChatQRCodeTokenResponse.mtoken);
            } else {
                i = 0;
            }
            if (pullChatQRCodeTokenResponse.mexpire_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, pullChatQRCodeTokenResponse.mexpire_time);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (pullChatQRCodeTokenResponse.mshared_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pullChatQRCodeTokenResponse.mshared_url);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (pullChatQRCodeTokenResponse.mis_unlimited != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, pullChatQRCodeTokenResponse.mis_unlimited);
            }
            return i6 + i4 + pullChatQRCodeTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatQRCodeTokenResponse decode(ProtoReader protoReader) throws IOException {
            C49598a aVar = new C49598a();
            aVar.f124223a = "";
            aVar.f124224b = 0L;
            aVar.f124225c = "";
            aVar.f124226d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124223a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124224b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124225c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124226d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatQRCodeTokenResponse pullChatQRCodeTokenResponse) throws IOException {
            if (pullChatQRCodeTokenResponse.mtoken != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullChatQRCodeTokenResponse.mtoken);
            }
            if (pullChatQRCodeTokenResponse.mexpire_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pullChatQRCodeTokenResponse.mexpire_time);
            }
            if (pullChatQRCodeTokenResponse.mshared_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullChatQRCodeTokenResponse.mshared_url);
            }
            if (pullChatQRCodeTokenResponse.mis_unlimited != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, pullChatQRCodeTokenResponse.mis_unlimited);
            }
            protoWriter.writeBytes(pullChatQRCodeTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.PullChatQRCodeTokenResponse$a */
    public static final class C49598a extends Message.Builder<PullChatQRCodeTokenResponse, C49598a> {

        /* renamed from: a */
        public String f124223a;

        /* renamed from: b */
        public Long f124224b;

        /* renamed from: c */
        public String f124225c;

        /* renamed from: d */
        public Boolean f124226d;

        /* renamed from: a */
        public PullChatQRCodeTokenResponse build() {
            return new PullChatQRCodeTokenResponse(this.f124223a, this.f124224b, this.f124225c, this.f124226d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49598a newBuilder() {
        C49598a aVar = new C49598a();
        aVar.f124223a = this.mtoken;
        aVar.f124224b = this.mexpire_time;
        aVar.f124225c = this.mshared_url;
        aVar.f124226d = this.mis_unlimited;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtoken != null) {
            sb.append(", token=");
            sb.append(this.mtoken);
        }
        if (this.mexpire_time != null) {
            sb.append(", expire_time=");
            sb.append(this.mexpire_time);
        }
        if (this.mshared_url != null) {
            sb.append(", shared_url=");
            sb.append(this.mshared_url);
        }
        if (this.mis_unlimited != null) {
            sb.append(", is_unlimited=");
            sb.append(this.mis_unlimited);
        }
        StringBuilder replace = sb.replace(0, 2, "PullChatQRCodeTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatQRCodeTokenResponse(String str, Long l, String str2, Boolean bool) {
        this(str, l, str2, bool, ByteString.EMPTY);
    }

    public PullChatQRCodeTokenResponse(String str, Long l, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtoken = str;
        this.mexpire_time = l;
        this.mshared_url = str2;
        this.mis_unlimited = bool;
    }
}
