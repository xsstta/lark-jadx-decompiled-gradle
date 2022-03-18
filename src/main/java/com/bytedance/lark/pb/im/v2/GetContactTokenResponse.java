package com.bytedance.lark.pb.im.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetContactTokenResponse extends Message<GetContactTokenResponse, C18182a> {
    public static final ProtoAdapter<GetContactTokenResponse> ADAPTER = new C18183b();
    private static final long serialVersionUID = 0;
    public final ContactTokenResponse link;
    public final ContactTokenResponse qr_code;

    public static final class ContactTokenResponse extends Message<ContactTokenResponse, C18180a> {
        public static final ProtoAdapter<ContactTokenResponse> ADAPTER = new C18181b();
        public static final Boolean DEFAULT_CAN_SEARCH_WITH_TOKEN = false;
        private static final long serialVersionUID = 0;
        public final Boolean can_search_with_token;
        public final String country_code;
        public final String invite_msg;
        public final String invite_url;
        public final String token;
        public final String unique_id;

        /* renamed from: com.bytedance.lark.pb.im.v2.GetContactTokenResponse$ContactTokenResponse$b */
        private static final class C18181b extends ProtoAdapter<ContactTokenResponse> {
            C18181b() {
                super(FieldEncoding.LENGTH_DELIMITED, ContactTokenResponse.class);
            }

            /* renamed from: a */
            public int encodedSize(ContactTokenResponse contactTokenResponse) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6 = 0;
                if (contactTokenResponse.token != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, contactTokenResponse.token);
                } else {
                    i = 0;
                }
                if (contactTokenResponse.invite_url != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, contactTokenResponse.invite_url);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (contactTokenResponse.invite_msg != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, contactTokenResponse.invite_msg);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (contactTokenResponse.country_code != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, contactTokenResponse.country_code);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (contactTokenResponse.can_search_with_token != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, contactTokenResponse.can_search_with_token);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (contactTokenResponse.unique_id != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, contactTokenResponse.unique_id);
                }
                return i10 + i6 + contactTokenResponse.unknownFields().size();
            }

            /* renamed from: a */
            public ContactTokenResponse decode(ProtoReader protoReader) throws IOException {
                C18180a aVar = new C18180a();
                aVar.f45387a = "";
                aVar.f45388b = "";
                aVar.f45389c = "";
                aVar.f45390d = "";
                aVar.f45391e = false;
                aVar.f45392f = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f45387a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f45388b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f45389c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f45390d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f45391e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f45392f = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, ContactTokenResponse contactTokenResponse) throws IOException {
                if (contactTokenResponse.token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, contactTokenResponse.token);
                }
                if (contactTokenResponse.invite_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, contactTokenResponse.invite_url);
                }
                if (contactTokenResponse.invite_msg != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, contactTokenResponse.invite_msg);
                }
                if (contactTokenResponse.country_code != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, contactTokenResponse.country_code);
                }
                if (contactTokenResponse.can_search_with_token != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, contactTokenResponse.can_search_with_token);
                }
                if (contactTokenResponse.unique_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, contactTokenResponse.unique_id);
                }
                protoWriter.writeBytes(contactTokenResponse.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v2.GetContactTokenResponse$ContactTokenResponse$a */
        public static final class C18180a extends Message.Builder<ContactTokenResponse, C18180a> {

            /* renamed from: a */
            public String f45387a;

            /* renamed from: b */
            public String f45388b;

            /* renamed from: c */
            public String f45389c;

            /* renamed from: d */
            public String f45390d;

            /* renamed from: e */
            public Boolean f45391e;

            /* renamed from: f */
            public String f45392f;

            /* renamed from: a */
            public ContactTokenResponse build() {
                return new ContactTokenResponse(this.f45387a, this.f45388b, this.f45389c, this.f45390d, this.f45391e, this.f45392f, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18180a newBuilder() {
            C18180a aVar = new C18180a();
            aVar.f45387a = this.token;
            aVar.f45388b = this.invite_url;
            aVar.f45389c = this.invite_msg;
            aVar.f45390d = this.country_code;
            aVar.f45391e = this.can_search_with_token;
            aVar.f45392f = this.unique_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "ContactTokenResponse");
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
            if (this.unique_id != null) {
                sb.append(", unique_id=");
                sb.append(this.unique_id);
            }
            StringBuilder replace = sb.replace(0, 2, "ContactTokenResponse{");
            replace.append('}');
            return replace.toString();
        }

        public ContactTokenResponse(String str, String str2, String str3, String str4, Boolean bool, String str5) {
            this(str, str2, str3, str4, bool, str5, ByteString.EMPTY);
        }

        public ContactTokenResponse(String str, String str2, String str3, String str4, Boolean bool, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            this.token = str;
            this.invite_url = str2;
            this.invite_msg = str3;
            this.country_code = str4;
            this.can_search_with_token = bool;
            this.unique_id = str5;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v2.GetContactTokenResponse$b */
    private static final class C18183b extends ProtoAdapter<GetContactTokenResponse> {
        C18183b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetContactTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetContactTokenResponse getContactTokenResponse) {
            int i;
            int i2 = 0;
            if (getContactTokenResponse.qr_code != null) {
                i = ContactTokenResponse.ADAPTER.encodedSizeWithTag(1, getContactTokenResponse.qr_code);
            } else {
                i = 0;
            }
            if (getContactTokenResponse.link != null) {
                i2 = ContactTokenResponse.ADAPTER.encodedSizeWithTag(2, getContactTokenResponse.link);
            }
            return i + i2 + getContactTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetContactTokenResponse decode(ProtoReader protoReader) throws IOException {
            C18182a aVar = new C18182a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45393a = ContactTokenResponse.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45394b = ContactTokenResponse.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetContactTokenResponse getContactTokenResponse) throws IOException {
            if (getContactTokenResponse.qr_code != null) {
                ContactTokenResponse.ADAPTER.encodeWithTag(protoWriter, 1, getContactTokenResponse.qr_code);
            }
            if (getContactTokenResponse.link != null) {
                ContactTokenResponse.ADAPTER.encodeWithTag(protoWriter, 2, getContactTokenResponse.link);
            }
            protoWriter.writeBytes(getContactTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v2.GetContactTokenResponse$a */
    public static final class C18182a extends Message.Builder<GetContactTokenResponse, C18182a> {

        /* renamed from: a */
        public ContactTokenResponse f45393a;

        /* renamed from: b */
        public ContactTokenResponse f45394b;

        /* renamed from: a */
        public GetContactTokenResponse build() {
            return new GetContactTokenResponse(this.f45393a, this.f45394b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18182a newBuilder() {
        C18182a aVar = new C18182a();
        aVar.f45393a = this.qr_code;
        aVar.f45394b = this.link;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetContactTokenResponse");
        StringBuilder sb = new StringBuilder();
        if (this.qr_code != null) {
            sb.append(", qr_code=");
            sb.append(this.qr_code);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        StringBuilder replace = sb.replace(0, 2, "GetContactTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetContactTokenResponse(ContactTokenResponse contactTokenResponse, ContactTokenResponse contactTokenResponse2) {
        this(contactTokenResponse, contactTokenResponse2, ByteString.EMPTY);
    }

    public GetContactTokenResponse(ContactTokenResponse contactTokenResponse, ContactTokenResponse contactTokenResponse2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.qr_code = contactTokenResponse;
        this.link = contactTokenResponse2;
    }
}
