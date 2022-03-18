package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class NamecardMetaInfo extends Message<NamecardMetaInfo, C16546a> {
    public static final ProtoAdapter<NamecardMetaInfo> ADAPTER = new C16547b();
    public static final Boolean DEFAULT_IS_CUSTOM_AVATAR = false;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String company_name;
    public final String email;
    public final String extra;
    public final String group;
    public final Boolean is_custom_avatar;
    public final String name;
    public final String namecard_id;
    public final Phone phone;
    public final String title;

    /* renamed from: com.bytedance.lark.pb.contact.v2.NamecardMetaInfo$b */
    private static final class C16547b extends ProtoAdapter<NamecardMetaInfo> {
        C16547b() {
            super(FieldEncoding.LENGTH_DELIMITED, NamecardMetaInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(NamecardMetaInfo namecardMetaInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = 0;
            if (namecardMetaInfo.namecard_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, namecardMetaInfo.namecard_id);
            } else {
                i = 0;
            }
            if (namecardMetaInfo.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, namecardMetaInfo.name);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (namecardMetaInfo.company_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, namecardMetaInfo.company_name);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (namecardMetaInfo.title != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, namecardMetaInfo.title);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (namecardMetaInfo.phone != null) {
                i5 = Phone.ADAPTER.encodedSizeWithTag(5, namecardMetaInfo.phone);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (namecardMetaInfo.email != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, namecardMetaInfo.email);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (namecardMetaInfo.group != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, namecardMetaInfo.group);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (namecardMetaInfo.extra != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, namecardMetaInfo.extra);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (namecardMetaInfo.avatar_key != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, namecardMetaInfo.avatar_key);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (namecardMetaInfo.is_custom_avatar != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(12, namecardMetaInfo.is_custom_avatar);
            }
            return i18 + i10 + namecardMetaInfo.unknownFields().size();
        }

        /* renamed from: a */
        public NamecardMetaInfo decode(ProtoReader protoReader) throws IOException {
            C16546a aVar = new C16546a();
            aVar.f42907a = "";
            aVar.f42908b = "";
            aVar.f42909c = "";
            aVar.f42910d = "";
            aVar.f42912f = "";
            aVar.f42913g = "";
            aVar.f42914h = "";
            aVar.f42915i = "";
            aVar.f42916j = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 12) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42907a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f42908b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f42909c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f42910d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f42911e = Phone.ADAPTER.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f42912f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f42913g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f42914h = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f42915i = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f42916j = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NamecardMetaInfo namecardMetaInfo) throws IOException {
            if (namecardMetaInfo.namecard_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, namecardMetaInfo.namecard_id);
            }
            if (namecardMetaInfo.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, namecardMetaInfo.name);
            }
            if (namecardMetaInfo.company_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, namecardMetaInfo.company_name);
            }
            if (namecardMetaInfo.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, namecardMetaInfo.title);
            }
            if (namecardMetaInfo.phone != null) {
                Phone.ADAPTER.encodeWithTag(protoWriter, 5, namecardMetaInfo.phone);
            }
            if (namecardMetaInfo.email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, namecardMetaInfo.email);
            }
            if (namecardMetaInfo.group != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, namecardMetaInfo.group);
            }
            if (namecardMetaInfo.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, namecardMetaInfo.extra);
            }
            if (namecardMetaInfo.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, namecardMetaInfo.avatar_key);
            }
            if (namecardMetaInfo.is_custom_avatar != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, namecardMetaInfo.is_custom_avatar);
            }
            protoWriter.writeBytes(namecardMetaInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.NamecardMetaInfo$a */
    public static final class C16546a extends Message.Builder<NamecardMetaInfo, C16546a> {

        /* renamed from: a */
        public String f42907a;

        /* renamed from: b */
        public String f42908b;

        /* renamed from: c */
        public String f42909c;

        /* renamed from: d */
        public String f42910d;

        /* renamed from: e */
        public Phone f42911e;

        /* renamed from: f */
        public String f42912f;

        /* renamed from: g */
        public String f42913g;

        /* renamed from: h */
        public String f42914h;

        /* renamed from: i */
        public String f42915i;

        /* renamed from: j */
        public Boolean f42916j;

        /* renamed from: a */
        public NamecardMetaInfo build() {
            return new NamecardMetaInfo(this.f42907a, this.f42908b, this.f42909c, this.f42910d, this.f42911e, this.f42912f, this.f42913g, this.f42914h, this.f42915i, this.f42916j, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16546a mo58899a(Phone phone) {
            this.f42911e = phone;
            return this;
        }

        /* renamed from: b */
        public C16546a mo58903b(String str) {
            this.f42908b = str;
            return this;
        }

        /* renamed from: c */
        public C16546a mo58904c(String str) {
            this.f42909c = str;
            return this;
        }

        /* renamed from: d */
        public C16546a mo58905d(String str) {
            this.f42910d = str;
            return this;
        }

        /* renamed from: e */
        public C16546a mo58906e(String str) {
            this.f42912f = str;
            return this;
        }

        /* renamed from: f */
        public C16546a mo58907f(String str) {
            this.f42913g = str;
            return this;
        }

        /* renamed from: g */
        public C16546a mo58908g(String str) {
            this.f42914h = str;
            return this;
        }

        /* renamed from: a */
        public C16546a mo58900a(Boolean bool) {
            this.f42916j = bool;
            return this;
        }

        /* renamed from: a */
        public C16546a mo58901a(String str) {
            this.f42907a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16546a newBuilder() {
        C16546a aVar = new C16546a();
        aVar.f42907a = this.namecard_id;
        aVar.f42908b = this.name;
        aVar.f42909c = this.company_name;
        aVar.f42910d = this.title;
        aVar.f42911e = this.phone;
        aVar.f42912f = this.email;
        aVar.f42913g = this.group;
        aVar.f42914h = this.extra;
        aVar.f42915i = this.avatar_key;
        aVar.f42916j = this.is_custom_avatar;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "NamecardMetaInfo");
        StringBuilder sb = new StringBuilder();
        if (this.namecard_id != null) {
            sb.append(", namecard_id=");
            sb.append(this.namecard_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.company_name != null) {
            sb.append(", company_name=");
            sb.append(this.company_name);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.phone != null) {
            sb.append(", phone=");
            sb.append(this.phone);
        }
        if (this.email != null) {
            sb.append(", email=");
            sb.append(this.email);
        }
        if (this.group != null) {
            sb.append(", group=");
            sb.append(this.group);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.is_custom_avatar != null) {
            sb.append(", is_custom_avatar=");
            sb.append(this.is_custom_avatar);
        }
        StringBuilder replace = sb.replace(0, 2, "NamecardMetaInfo{");
        replace.append('}');
        return replace.toString();
    }

    public NamecardMetaInfo(String str, String str2, String str3, String str4, Phone phone2, String str5, String str6, String str7, String str8, Boolean bool) {
        this(str, str2, str3, str4, phone2, str5, str6, str7, str8, bool, ByteString.EMPTY);
    }

    public NamecardMetaInfo(String str, String str2, String str3, String str4, Phone phone2, String str5, String str6, String str7, String str8, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.namecard_id = str;
        this.name = str2;
        this.company_name = str3;
        this.title = str4;
        this.phone = phone2;
        this.email = str5;
        this.group = str6;
        this.extra = str7;
        this.avatar_key = str8;
        this.is_custom_avatar = bool;
    }
}
