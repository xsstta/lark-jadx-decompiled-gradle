package com.ss.android.lark.pb.chats;

import com.google.protobuf.server.FieldOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullChatLinkTokenResponse extends Message<PullChatLinkTokenResponse, C49590a> {
    public static final ProtoAdapter<PullChatLinkTokenResponse> ADAPTER = new C49591b();
    public static final Long DEFAULT_EXPIRE_TIME = 0L;
    public static final Boolean DEFAULT_IS_UNLIMITED = false;
    public static final FieldOptions FIELD_OPTIONS_MTOKEN = new FieldOptions.C23155a().mo80350a("split,type=chat_token").build();
    private static final long serialVersionUID = 0;
    public final Long mexpire_time;
    public final Boolean mis_unlimited;
    public final String mkouLing;
    public final String mshared_url;
    public final String mtoken;

    /* renamed from: com.ss.android.lark.pb.chats.PullChatLinkTokenResponse$b */
    private static final class C49591b extends ProtoAdapter<PullChatLinkTokenResponse> {
        C49591b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatLinkTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatLinkTokenResponse pullChatLinkTokenResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (pullChatLinkTokenResponse.mtoken != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pullChatLinkTokenResponse.mtoken);
            } else {
                i = 0;
            }
            if (pullChatLinkTokenResponse.mexpire_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, pullChatLinkTokenResponse.mexpire_time);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (pullChatLinkTokenResponse.mshared_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pullChatLinkTokenResponse.mshared_url);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (pullChatLinkTokenResponse.mkouLing != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, pullChatLinkTokenResponse.mkouLing);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (pullChatLinkTokenResponse.mis_unlimited != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, pullChatLinkTokenResponse.mis_unlimited);
            }
            return i8 + i5 + pullChatLinkTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatLinkTokenResponse decode(ProtoReader protoReader) throws IOException {
            C49590a aVar = new C49590a();
            aVar.f124208a = "";
            aVar.f124209b = 0L;
            aVar.f124210c = "";
            aVar.f124211d = "";
            aVar.f124212e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124208a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124209b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124210c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f124211d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124212e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatLinkTokenResponse pullChatLinkTokenResponse) throws IOException {
            if (pullChatLinkTokenResponse.mtoken != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullChatLinkTokenResponse.mtoken);
            }
            if (pullChatLinkTokenResponse.mexpire_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pullChatLinkTokenResponse.mexpire_time);
            }
            if (pullChatLinkTokenResponse.mshared_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullChatLinkTokenResponse.mshared_url);
            }
            if (pullChatLinkTokenResponse.mkouLing != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pullChatLinkTokenResponse.mkouLing);
            }
            if (pullChatLinkTokenResponse.mis_unlimited != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, pullChatLinkTokenResponse.mis_unlimited);
            }
            protoWriter.writeBytes(pullChatLinkTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.PullChatLinkTokenResponse$a */
    public static final class C49590a extends Message.Builder<PullChatLinkTokenResponse, C49590a> {

        /* renamed from: a */
        public String f124208a;

        /* renamed from: b */
        public Long f124209b;

        /* renamed from: c */
        public String f124210c;

        /* renamed from: d */
        public String f124211d;

        /* renamed from: e */
        public Boolean f124212e;

        /* renamed from: a */
        public PullChatLinkTokenResponse build() {
            return new PullChatLinkTokenResponse(this.f124208a, this.f124209b, this.f124210c, this.f124211d, this.f124212e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49590a newBuilder() {
        C49590a aVar = new C49590a();
        aVar.f124208a = this.mtoken;
        aVar.f124209b = this.mexpire_time;
        aVar.f124210c = this.mshared_url;
        aVar.f124211d = this.mkouLing;
        aVar.f124212e = this.mis_unlimited;
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
        if (this.mkouLing != null) {
            sb.append(", kouLing=");
            sb.append(this.mkouLing);
        }
        if (this.mis_unlimited != null) {
            sb.append(", is_unlimited=");
            sb.append(this.mis_unlimited);
        }
        StringBuilder replace = sb.replace(0, 2, "PullChatLinkTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatLinkTokenResponse(String str, Long l, String str2, String str3, Boolean bool) {
        this(str, l, str2, str3, bool, ByteString.EMPTY);
    }

    public PullChatLinkTokenResponse(String str, Long l, String str2, String str3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtoken = str;
        this.mexpire_time = l;
        this.mshared_url = str2;
        this.mkouLing = str3;
        this.mis_unlimited = bool;
    }
}
