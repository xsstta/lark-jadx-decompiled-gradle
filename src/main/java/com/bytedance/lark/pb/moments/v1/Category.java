package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Category extends Message<Category, C18328a> {
    public static final ProtoAdapter<Category> ADAPTER = new C18329b();
    public static final Boolean DEFAULT_CAN_ANONYMOUS = false;
    public static final Boolean DEFAULT_CAN_CREATE_POST = false;
    public static final Boolean DEFAULT_CAN_READ = false;
    public static final Boolean DEFAULT_IS_SELF_ADMIN = false;
    public static final Boolean DEFAULT_SHOW_ADMIN_INFO = false;
    private static final long serialVersionUID = 0;
    public final List<String> admin_user_ids;
    public final Boolean can_anonymous;
    public final Boolean can_create_post;
    public final Boolean can_read;
    public final String category_id;
    public final String description;
    public final String icon_key;
    public final Boolean is_self_admin;
    public final String name;
    public final Boolean show_admin_info;

    /* renamed from: com.bytedance.lark.pb.moments.v1.Category$b */
    private static final class C18329b extends ProtoAdapter<Category> {
        C18329b() {
            super(FieldEncoding.LENGTH_DELIMITED, Category.class);
        }

        /* renamed from: a */
        public int encodedSize(Category category) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (category.category_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, category.category_id);
            } else {
                i = 0;
            }
            if (category.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, category.name);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (category.description != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, category.description);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (category.icon_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, category.icon_key);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag = i11 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, category.admin_user_ids);
            if (category.show_admin_info != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, category.show_admin_info);
            } else {
                i5 = 0;
            }
            int i12 = encodedSizeWithTag + i5;
            if (category.can_create_post != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(11, category.can_create_post);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (category.can_anonymous != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(12, category.can_anonymous);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (category.is_self_admin != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(13, category.is_self_admin);
            } else {
                i8 = 0;
            }
            int i15 = i14 + i8;
            if (category.can_read != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(14, category.can_read);
            }
            return i15 + i9 + category.unknownFields().size();
        }

        /* renamed from: a */
        public Category decode(ProtoReader protoReader) throws IOException {
            C18328a aVar = new C18328a();
            aVar.f45645a = "";
            aVar.f45646b = "";
            aVar.f45647c = "";
            aVar.f45648d = "";
            aVar.f45650f = false;
            aVar.f45651g = false;
            aVar.f45652h = false;
            aVar.f45653i = false;
            aVar.f45654j = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45645a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45646b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45647c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45648d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45649e.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            aVar.f45650f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 11:
                            aVar.f45651g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f45652h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f45653i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            aVar.f45654j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Category category) throws IOException {
            if (category.category_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, category.category_id);
            }
            if (category.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, category.name);
            }
            if (category.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, category.description);
            }
            if (category.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, category.icon_key);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, category.admin_user_ids);
            if (category.show_admin_info != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, category.show_admin_info);
            }
            if (category.can_create_post != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, category.can_create_post);
            }
            if (category.can_anonymous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, category.can_anonymous);
            }
            if (category.is_self_admin != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, category.is_self_admin);
            }
            if (category.can_read != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, category.can_read);
            }
            protoWriter.writeBytes(category.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Category$a */
    public static final class C18328a extends Message.Builder<Category, C18328a> {

        /* renamed from: a */
        public String f45645a;

        /* renamed from: b */
        public String f45646b;

        /* renamed from: c */
        public String f45647c;

        /* renamed from: d */
        public String f45648d;

        /* renamed from: e */
        public List<String> f45649e = Internal.newMutableList();

        /* renamed from: f */
        public Boolean f45650f;

        /* renamed from: g */
        public Boolean f45651g;

        /* renamed from: h */
        public Boolean f45652h;

        /* renamed from: i */
        public Boolean f45653i;

        /* renamed from: j */
        public Boolean f45654j;

        /* renamed from: a */
        public Category build() {
            return new Category(this.f45645a, this.f45646b, this.f45647c, this.f45648d, this.f45649e, this.f45650f, this.f45651g, this.f45652h, this.f45653i, this.f45654j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18328a newBuilder() {
        C18328a aVar = new C18328a();
        aVar.f45645a = this.category_id;
        aVar.f45646b = this.name;
        aVar.f45647c = this.description;
        aVar.f45648d = this.icon_key;
        aVar.f45649e = Internal.copyOf("admin_user_ids", this.admin_user_ids);
        aVar.f45650f = this.show_admin_info;
        aVar.f45651g = this.can_create_post;
        aVar.f45652h = this.can_anonymous;
        aVar.f45653i = this.is_self_admin;
        aVar.f45654j = this.can_read;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Category");
        StringBuilder sb = new StringBuilder();
        if (this.category_id != null) {
            sb.append(", category_id=");
            sb.append(this.category_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (!this.admin_user_ids.isEmpty()) {
            sb.append(", admin_user_ids=");
            sb.append(this.admin_user_ids);
        }
        if (this.show_admin_info != null) {
            sb.append(", show_admin_info=");
            sb.append(this.show_admin_info);
        }
        if (this.can_create_post != null) {
            sb.append(", can_create_post=");
            sb.append(this.can_create_post);
        }
        if (this.can_anonymous != null) {
            sb.append(", can_anonymous=");
            sb.append(this.can_anonymous);
        }
        if (this.is_self_admin != null) {
            sb.append(", is_self_admin=");
            sb.append(this.is_self_admin);
        }
        if (this.can_read != null) {
            sb.append(", can_read=");
            sb.append(this.can_read);
        }
        StringBuilder replace = sb.replace(0, 2, "Category{");
        replace.append('}');
        return replace.toString();
    }

    public Category(String str, String str2, String str3, String str4, List<String> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this(str, str2, str3, str4, list, bool, bool2, bool3, bool4, bool5, ByteString.EMPTY);
    }

    public Category(String str, String str2, String str3, String str4, List<String> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.category_id = str;
        this.name = str2;
        this.description = str3;
        this.icon_key = str4;
        this.admin_user_ids = Internal.immutableCopyOf("admin_user_ids", list);
        this.show_admin_info = bool;
        this.can_create_post = bool2;
        this.can_anonymous = bool3;
        this.is_self_admin = bool4;
        this.can_read = bool5;
    }
}
