package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Tenant extends Message<Tenant, C15318a> {
    public static final ProtoAdapter<Tenant> ADAPTER = new C15319b();
    private static final long serialVersionUID = 0;
    public final String address;
    public final String contact_email;
    public final String contact_mobile;
    public final String contact_name;
    public final String domain;
    public final String icon_url;
    public final String id;
    public final String name;
    public final String post_code;
    public final String remark;
    public final String telephone;
    public final String unit_league;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Tenant$b */
    private static final class C15319b extends ProtoAdapter<Tenant> {
        C15319b() {
            super(FieldEncoding.LENGTH_DELIMITED, Tenant.class);
        }

        /* renamed from: a */
        public int encodedSize(Tenant tenant) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, tenant.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, tenant.name);
            int i10 = 0;
            if (tenant.contact_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, tenant.contact_name);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (tenant.contact_mobile != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, tenant.contact_mobile);
            } else {
                i2 = 0;
            }
            int i12 = i11 + i2;
            if (tenant.contact_email != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, tenant.contact_email);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (tenant.address != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, tenant.address);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (tenant.domain != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, tenant.domain);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (tenant.post_code != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, tenant.post_code);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (tenant.remark != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(9, tenant.remark);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (tenant.telephone != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(10, tenant.telephone);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (tenant.icon_url != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(11, tenant.icon_url);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (tenant.unit_league != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(12, tenant.unit_league);
            }
            return i19 + i10 + tenant.unknownFields().size();
        }

        /* renamed from: a */
        public Tenant decode(ProtoReader protoReader) throws IOException {
            C15318a aVar = new C15318a();
            aVar.f40530a = "";
            aVar.f40531b = "";
            aVar.f40532c = "";
            aVar.f40533d = "";
            aVar.f40534e = "";
            aVar.f40535f = "";
            aVar.f40536g = "";
            aVar.f40537h = "";
            aVar.f40538i = "";
            aVar.f40539j = "";
            aVar.f40540k = "";
            aVar.f40541l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40530a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40531b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40532c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40533d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f40534e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f40535f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40536g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f40537h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f40538i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f40539j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f40540k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f40541l = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Tenant tenant) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, tenant.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, tenant.name);
            if (tenant.contact_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, tenant.contact_name);
            }
            if (tenant.contact_mobile != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, tenant.contact_mobile);
            }
            if (tenant.contact_email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, tenant.contact_email);
            }
            if (tenant.address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, tenant.address);
            }
            if (tenant.domain != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, tenant.domain);
            }
            if (tenant.post_code != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, tenant.post_code);
            }
            if (tenant.remark != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, tenant.remark);
            }
            if (tenant.telephone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, tenant.telephone);
            }
            if (tenant.icon_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, tenant.icon_url);
            }
            if (tenant.unit_league != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, tenant.unit_league);
            }
            protoWriter.writeBytes(tenant.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15318a newBuilder() {
        C15318a aVar = new C15318a();
        aVar.f40530a = this.id;
        aVar.f40531b = this.name;
        aVar.f40532c = this.contact_name;
        aVar.f40533d = this.contact_mobile;
        aVar.f40534e = this.contact_email;
        aVar.f40535f = this.address;
        aVar.f40536g = this.domain;
        aVar.f40537h = this.post_code;
        aVar.f40538i = this.remark;
        aVar.f40539j = this.telephone;
        aVar.f40540k = this.icon_url;
        aVar.f40541l = this.unit_league;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Tenant$a */
    public static final class C15318a extends Message.Builder<Tenant, C15318a> {

        /* renamed from: a */
        public String f40530a;

        /* renamed from: b */
        public String f40531b;

        /* renamed from: c */
        public String f40532c;

        /* renamed from: d */
        public String f40533d;

        /* renamed from: e */
        public String f40534e;

        /* renamed from: f */
        public String f40535f;

        /* renamed from: g */
        public String f40536g;

        /* renamed from: h */
        public String f40537h;

        /* renamed from: i */
        public String f40538i;

        /* renamed from: j */
        public String f40539j;

        /* renamed from: k */
        public String f40540k;

        /* renamed from: l */
        public String f40541l;

        /* renamed from: a */
        public Tenant build() {
            String str;
            String str2 = this.f40530a;
            if (str2 != null && (str = this.f40531b) != null) {
                return new Tenant(str2, str, this.f40532c, this.f40533d, this.f40534e, this.f40535f, this.f40536g, this.f40537h, this.f40538i, this.f40539j, this.f40540k, this.f40541l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f40531b, "name");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Tenant");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        if (this.contact_name != null) {
            sb.append(", contact_name=");
            sb.append(this.contact_name);
        }
        if (this.contact_mobile != null) {
            sb.append(", contact_mobile=");
            sb.append(this.contact_mobile);
        }
        if (this.contact_email != null) {
            sb.append(", contact_email=");
            sb.append(this.contact_email);
        }
        if (this.address != null) {
            sb.append(", address=");
            sb.append(this.address);
        }
        if (this.domain != null) {
            sb.append(", domain=");
            sb.append(this.domain);
        }
        if (this.post_code != null) {
            sb.append(", post_code=");
            sb.append(this.post_code);
        }
        if (this.remark != null) {
            sb.append(", remark=");
            sb.append(this.remark);
        }
        if (this.telephone != null) {
            sb.append(", telephone=");
            sb.append(this.telephone);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=");
            sb.append(this.icon_url);
        }
        if (this.unit_league != null) {
            sb.append(", unit_league=");
            sb.append(this.unit_league);
        }
        StringBuilder replace = sb.replace(0, 2, "Tenant{");
        replace.append('}');
        return replace.toString();
    }

    public Tenant(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, ByteString.EMPTY);
    }

    public Tenant(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.contact_name = str3;
        this.contact_mobile = str4;
        this.contact_email = str5;
        this.address = str6;
        this.domain = str7;
        this.post_code = str8;
        this.remark = str9;
        this.telephone = str10;
        this.icon_url = str11;
        this.unit_league = str12;
    }
}
