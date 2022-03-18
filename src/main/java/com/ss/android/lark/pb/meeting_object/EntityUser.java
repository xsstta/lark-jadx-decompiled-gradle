package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class EntityUser extends Message<EntityUser, C49854a> {
    public static final ProtoAdapter<EntityUser> ADAPTER = new C49855b();
    private static final long serialVersionUID = 0;
    public final String mavatar_url;
    public final String mcn_name;
    public final String memail;
    public final String men_name;
    public final Map<String, String> mi18n_name;
    public final String mis_anonymous;
    public final String mname;
    public final String mtenant_id;
    public final String muid;

    /* renamed from: com.ss.android.lark.pb.meeting_object.EntityUser$b */
    private static final class C49855b extends ProtoAdapter<EntityUser> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f124815a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49855b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntityUser.class);
        }

        /* renamed from: a */
        public int encodedSize(EntityUser entityUser) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (entityUser.mavatar_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, entityUser.mavatar_url);
            } else {
                i = 0;
            }
            if (entityUser.mcn_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, entityUser.mcn_name);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (entityUser.memail != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, entityUser.memail);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (entityUser.men_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, entityUser.men_name);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (entityUser.mis_anonymous != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, entityUser.mis_anonymous);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (entityUser.mname != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, entityUser.mname);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (entityUser.mtenant_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, entityUser.mtenant_id);
            }
            return i12 + i7 + ProtoAdapter.STRING.encodedSizeWithTag(8, entityUser.muid) + this.f124815a.encodedSizeWithTag(9, entityUser.mi18n_name) + entityUser.unknownFields().size();
        }

        /* renamed from: a */
        public EntityUser decode(ProtoReader protoReader) throws IOException {
            C49854a aVar = new C49854a();
            aVar.f124806a = "";
            aVar.f124807b = "";
            aVar.f124808c = "";
            aVar.f124809d = "";
            aVar.f124810e = "";
            aVar.f124811f = "";
            aVar.f124812g = "";
            aVar.f124813h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124806a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124807b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124808c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124809d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124810e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124811f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124812g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124813h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124814i.putAll(this.f124815a.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, EntityUser entityUser) throws IOException {
            if (entityUser.mavatar_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entityUser.mavatar_url);
            }
            if (entityUser.mcn_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, entityUser.mcn_name);
            }
            if (entityUser.memail != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, entityUser.memail);
            }
            if (entityUser.men_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, entityUser.men_name);
            }
            if (entityUser.mis_anonymous != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, entityUser.mis_anonymous);
            }
            if (entityUser.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, entityUser.mname);
            }
            if (entityUser.mtenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, entityUser.mtenant_id);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, entityUser.muid);
            this.f124815a.encodeWithTag(protoWriter, 9, entityUser.mi18n_name);
            protoWriter.writeBytes(entityUser.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.EntityUser$a */
    public static final class C49854a extends Message.Builder<EntityUser, C49854a> {

        /* renamed from: a */
        public String f124806a;

        /* renamed from: b */
        public String f124807b;

        /* renamed from: c */
        public String f124808c;

        /* renamed from: d */
        public String f124809d;

        /* renamed from: e */
        public String f124810e;

        /* renamed from: f */
        public String f124811f;

        /* renamed from: g */
        public String f124812g;

        /* renamed from: h */
        public String f124813h;

        /* renamed from: i */
        public Map<String, String> f124814i = Internal.newMutableMap();

        /* renamed from: a */
        public EntityUser build() {
            String str = this.f124813h;
            if (str != null) {
                return new EntityUser(this.f124806a, this.f124807b, this.f124808c, this.f124809d, this.f124810e, this.f124811f, this.f124812g, str, this.f124814i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "muid");
        }
    }

    @Override // com.squareup.wire.Message
    public C49854a newBuilder() {
        C49854a aVar = new C49854a();
        aVar.f124806a = this.mavatar_url;
        aVar.f124807b = this.mcn_name;
        aVar.f124808c = this.memail;
        aVar.f124809d = this.men_name;
        aVar.f124810e = this.mis_anonymous;
        aVar.f124811f = this.mname;
        aVar.f124812g = this.mtenant_id;
        aVar.f124813h = this.muid;
        aVar.f124814i = Internal.copyOf("mi18n_name", this.mi18n_name);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mavatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.mavatar_url);
        }
        if (this.mcn_name != null) {
            sb.append(", cn_name=");
            sb.append(this.mcn_name);
        }
        if (this.memail != null) {
            sb.append(", email=");
            sb.append(this.memail);
        }
        if (this.men_name != null) {
            sb.append(", en_name=");
            sb.append(this.men_name);
        }
        if (this.mis_anonymous != null) {
            sb.append(", is_anonymous=");
            sb.append(this.mis_anonymous);
        }
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.mtenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.mtenant_id);
        }
        sb.append(", uid=");
        sb.append(this.muid);
        if (!this.mi18n_name.isEmpty()) {
            sb.append(", i18n_name=");
            sb.append(this.mi18n_name);
        }
        StringBuilder replace = sb.replace(0, 2, "EntityUser{");
        replace.append('}');
        return replace.toString();
    }

    public EntityUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, String> map) {
        this(str, str2, str3, str4, str5, str6, str7, str8, map, ByteString.EMPTY);
    }

    public EntityUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mavatar_url = str;
        this.mcn_name = str2;
        this.memail = str3;
        this.men_name = str4;
        this.mis_anonymous = str5;
        this.mname = str6;
        this.mtenant_id = str7;
        this.muid = str8;
        this.mi18n_name = Internal.immutableCopyOf("mi18n_name", map);
    }
}
