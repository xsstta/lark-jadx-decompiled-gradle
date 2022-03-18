package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UserBriefInfo extends Message<UserBriefInfo, C16420a> {
    public static final ProtoAdapter<UserBriefInfo> ADAPTER = new C16421b();
    private static final long serialVersionUID = 0;
    public final String alias;
    public final String avatar_key;
    public final String avatar_path;
    public final String contact_token;
    public final String en_name;
    public final String localized_name;
    public final String name;
    public final String tenant_id;
    public final String tenant_name;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.UserBriefInfo$b */
    private static final class C16421b extends ProtoAdapter<UserBriefInfo> {
        C16421b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserBriefInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(UserBriefInfo userBriefInfo) {
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
            if (userBriefInfo.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, userBriefInfo.user_id);
            } else {
                i = 0;
            }
            if (userBriefInfo.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, userBriefInfo.name);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (userBriefInfo.en_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, userBriefInfo.en_name);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (userBriefInfo.avatar_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, userBriefInfo.avatar_key);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (userBriefInfo.tenant_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, userBriefInfo.tenant_id);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (userBriefInfo.tenant_name != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, userBriefInfo.tenant_name);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (userBriefInfo.localized_name != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, userBriefInfo.localized_name);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (userBriefInfo.alias != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, userBriefInfo.alias);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (userBriefInfo.contact_token != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, userBriefInfo.contact_token);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (userBriefInfo.avatar_path != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, userBriefInfo.avatar_path);
            }
            return i18 + i10 + userBriefInfo.unknownFields().size();
        }

        /* renamed from: a */
        public UserBriefInfo decode(ProtoReader protoReader) throws IOException {
            C16420a aVar = new C16420a();
            aVar.f42696a = "";
            aVar.f42697b = "";
            aVar.f42698c = "";
            aVar.f42699d = "";
            aVar.f42700e = "";
            aVar.f42701f = "";
            aVar.f42702g = "";
            aVar.f42703h = "";
            aVar.f42704i = "";
            aVar.f42705j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42696a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42697b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42698c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42699d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42700e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42701f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42702g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f42703h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f42704i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f42705j = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UserBriefInfo userBriefInfo) throws IOException {
            if (userBriefInfo.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userBriefInfo.user_id);
            }
            if (userBriefInfo.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userBriefInfo.name);
            }
            if (userBriefInfo.en_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, userBriefInfo.en_name);
            }
            if (userBriefInfo.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, userBriefInfo.avatar_key);
            }
            if (userBriefInfo.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, userBriefInfo.tenant_id);
            }
            if (userBriefInfo.tenant_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, userBriefInfo.tenant_name);
            }
            if (userBriefInfo.localized_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, userBriefInfo.localized_name);
            }
            if (userBriefInfo.alias != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, userBriefInfo.alias);
            }
            if (userBriefInfo.contact_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, userBriefInfo.contact_token);
            }
            if (userBriefInfo.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, userBriefInfo.avatar_path);
            }
            protoWriter.writeBytes(userBriefInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UserBriefInfo$a */
    public static final class C16420a extends Message.Builder<UserBriefInfo, C16420a> {

        /* renamed from: a */
        public String f42696a;

        /* renamed from: b */
        public String f42697b;

        /* renamed from: c */
        public String f42698c;

        /* renamed from: d */
        public String f42699d;

        /* renamed from: e */
        public String f42700e;

        /* renamed from: f */
        public String f42701f;

        /* renamed from: g */
        public String f42702g;

        /* renamed from: h */
        public String f42703h;

        /* renamed from: i */
        public String f42704i;

        /* renamed from: j */
        public String f42705j;

        /* renamed from: a */
        public UserBriefInfo build() {
            return new UserBriefInfo(this.f42696a, this.f42697b, this.f42698c, this.f42699d, this.f42700e, this.f42701f, this.f42702g, this.f42703h, this.f42704i, this.f42705j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16420a newBuilder() {
        C16420a aVar = new C16420a();
        aVar.f42696a = this.user_id;
        aVar.f42697b = this.name;
        aVar.f42698c = this.en_name;
        aVar.f42699d = this.avatar_key;
        aVar.f42700e = this.tenant_id;
        aVar.f42701f = this.tenant_name;
        aVar.f42702g = this.localized_name;
        aVar.f42703h = this.alias;
        aVar.f42704i = this.contact_token;
        aVar.f42705j = this.avatar_path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "UserBriefInfo");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.en_name != null) {
            sb.append(", en_name=");
            sb.append(this.en_name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.tenant_name != null) {
            sb.append(", tenant_name=");
            sb.append(this.tenant_name);
        }
        if (this.localized_name != null) {
            sb.append(", localized_name=");
            sb.append(this.localized_name);
        }
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.contact_token != null) {
            sb.append(", contact_token=");
            sb.append(this.contact_token);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        StringBuilder replace = sb.replace(0, 2, "UserBriefInfo{");
        replace.append('}');
        return replace.toString();
    }

    public UserBriefInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, ByteString.EMPTY);
    }

    public UserBriefInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.name = str2;
        this.en_name = str3;
        this.avatar_key = str4;
        this.tenant_id = str5;
        this.tenant_name = str6;
        this.localized_name = str7;
        this.alias = str8;
        this.contact_token = str9;
        this.avatar_path = str10;
    }
}
