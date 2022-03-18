package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ContactSource;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendChatApplicationRequest extends Message<SendChatApplicationRequest, C18011a> {
    public static final ProtoAdapter<SendChatApplicationRequest> ADAPTER = new C18012b();
    public static final ContactSource DEFAULT_SOURCE = ContactSource.UNKNOWN_SOURCE;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String extra_message;
    public final String sender;
    public final String sender_id;
    public final ContactSource source;
    public final String source_id;
    public final String source_name;
    public final String sub_source_type;
    public final String token;
    public final String user_alias;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.SendChatApplicationRequest$b */
    private static final class C18012b extends ProtoAdapter<SendChatApplicationRequest> {
        C18012b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendChatApplicationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendChatApplicationRequest sendChatApplicationRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11 = 0;
            if (sendChatApplicationRequest.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sendChatApplicationRequest.token);
            } else {
                i = 0;
            }
            if (sendChatApplicationRequest.extra_message != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sendChatApplicationRequest.extra_message);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (sendChatApplicationRequest.chat_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sendChatApplicationRequest.chat_id);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (sendChatApplicationRequest.sender != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, sendChatApplicationRequest.sender);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (sendChatApplicationRequest.source != null) {
                i5 = ContactSource.ADAPTER.encodedSizeWithTag(5, sendChatApplicationRequest.source);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (sendChatApplicationRequest.source_name != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, sendChatApplicationRequest.source_name);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (sendChatApplicationRequest.sender_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, sendChatApplicationRequest.sender_id);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (sendChatApplicationRequest.source_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, sendChatApplicationRequest.source_id);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (sendChatApplicationRequest.sub_source_type != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, sendChatApplicationRequest.sub_source_type);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (sendChatApplicationRequest.user_id != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, sendChatApplicationRequest.user_id);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (sendChatApplicationRequest.user_alias != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, sendChatApplicationRequest.user_alias);
            }
            return i20 + i11 + sendChatApplicationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendChatApplicationRequest decode(ProtoReader protoReader) throws IOException {
            C18011a aVar = new C18011a();
            aVar.f45108a = "";
            aVar.f45109b = "";
            aVar.f45110c = "";
            aVar.f45111d = "";
            aVar.f45112e = ContactSource.UNKNOWN_SOURCE;
            aVar.f45113f = "";
            aVar.f45114g = "";
            aVar.f45115h = "";
            aVar.f45116i = "";
            aVar.f45117j = "";
            aVar.f45118k = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45108a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45109b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45110c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45111d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f45112e = ContactSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f45113f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45114g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f45115h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f45116i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f45117j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f45118k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendChatApplicationRequest sendChatApplicationRequest) throws IOException {
            if (sendChatApplicationRequest.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendChatApplicationRequest.token);
            }
            if (sendChatApplicationRequest.extra_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendChatApplicationRequest.extra_message);
            }
            if (sendChatApplicationRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sendChatApplicationRequest.chat_id);
            }
            if (sendChatApplicationRequest.sender != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, sendChatApplicationRequest.sender);
            }
            if (sendChatApplicationRequest.source != null) {
                ContactSource.ADAPTER.encodeWithTag(protoWriter, 5, sendChatApplicationRequest.source);
            }
            if (sendChatApplicationRequest.source_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, sendChatApplicationRequest.source_name);
            }
            if (sendChatApplicationRequest.sender_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, sendChatApplicationRequest.sender_id);
            }
            if (sendChatApplicationRequest.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, sendChatApplicationRequest.source_id);
            }
            if (sendChatApplicationRequest.sub_source_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, sendChatApplicationRequest.sub_source_type);
            }
            if (sendChatApplicationRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, sendChatApplicationRequest.user_id);
            }
            if (sendChatApplicationRequest.user_alias != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, sendChatApplicationRequest.user_alias);
            }
            protoWriter.writeBytes(sendChatApplicationRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendChatApplicationRequest$a */
    public static final class C18011a extends Message.Builder<SendChatApplicationRequest, C18011a> {

        /* renamed from: a */
        public String f45108a;

        /* renamed from: b */
        public String f45109b;

        /* renamed from: c */
        public String f45110c;

        /* renamed from: d */
        public String f45111d;

        /* renamed from: e */
        public ContactSource f45112e;

        /* renamed from: f */
        public String f45113f;

        /* renamed from: g */
        public String f45114g;

        /* renamed from: h */
        public String f45115h;

        /* renamed from: i */
        public String f45116i;

        /* renamed from: j */
        public String f45117j;

        /* renamed from: k */
        public String f45118k;

        /* renamed from: a */
        public SendChatApplicationRequest build() {
            return new SendChatApplicationRequest(this.f45108a, this.f45109b, this.f45110c, this.f45111d, this.f45112e, this.f45113f, this.f45114g, this.f45115h, this.f45116i, this.f45117j, this.f45118k, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18011a mo62559a(ContactSource contactSource) {
            this.f45112e = contactSource;
            return this;
        }

        /* renamed from: b */
        public C18011a mo62562b(String str) {
            this.f45109b = str;
            return this;
        }

        /* renamed from: c */
        public C18011a mo62563c(String str) {
            this.f45110c = str;
            return this;
        }

        /* renamed from: a */
        public C18011a mo62560a(String str) {
            this.f45108a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18011a newBuilder() {
        C18011a aVar = new C18011a();
        aVar.f45108a = this.token;
        aVar.f45109b = this.extra_message;
        aVar.f45110c = this.chat_id;
        aVar.f45111d = this.sender;
        aVar.f45112e = this.source;
        aVar.f45113f = this.source_name;
        aVar.f45114g = this.sender_id;
        aVar.f45115h = this.source_id;
        aVar.f45116i = this.sub_source_type;
        aVar.f45117j = this.user_id;
        aVar.f45118k = this.user_alias;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendChatApplicationRequest");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.extra_message != null) {
            sb.append(", extra_message=");
            sb.append(this.extra_message);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.source_name != null) {
            sb.append(", source_name=");
            sb.append(this.source_name);
        }
        if (this.sender_id != null) {
            sb.append(", sender_id=");
            sb.append(this.sender_id);
        }
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.sub_source_type != null) {
            sb.append(", sub_source_type=");
            sb.append(this.sub_source_type);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.user_alias != null) {
            sb.append(", user_alias=");
            sb.append(this.user_alias);
        }
        StringBuilder replace = sb.replace(0, 2, "SendChatApplicationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendChatApplicationRequest(String str, String str2, String str3, String str4, ContactSource contactSource, String str5, String str6, String str7, String str8, String str9, String str10) {
        this(str, str2, str3, str4, contactSource, str5, str6, str7, str8, str9, str10, ByteString.EMPTY);
    }

    public SendChatApplicationRequest(String str, String str2, String str3, String str4, ContactSource contactSource, String str5, String str6, String str7, String str8, String str9, String str10, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.extra_message = str2;
        this.chat_id = str3;
        this.sender = str4;
        this.source = contactSource;
        this.source_name = str5;
        this.sender_id = str6;
        this.source_id = str7;
        this.sub_source_type = str8;
        this.user_id = str9;
        this.user_alias = str10;
    }
}
