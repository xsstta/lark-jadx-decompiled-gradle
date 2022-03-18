package com.ss.android.lark.pb.moments_entities;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class Category extends Message<Category, C49958a> {
    public static final ProtoAdapter<Category> ADAPTER = new C49959b();
    public static final Boolean DEFAULT_CAN_ANONYMOUS = false;
    public static final Boolean DEFAULT_CAN_CREATE_POST = false;
    public static final Boolean DEFAULT_CAN_READ = false;
    public static final Boolean DEFAULT_IS_SELF_ADMIN = false;
    public static final Boolean DEFAULT_SHOW_ADMIN_INFO = false;
    private static final long serialVersionUID = 0;
    public final List<String> madmin_user_ids;
    public final Boolean mcan_anonymous;
    public final Boolean mcan_create_post;
    public final Boolean mcan_read;
    public final String mcategory_id;
    public final String mdescription;
    public final I18nInfo mi18n_info;
    public final String micon_key;
    public final Boolean mis_self_admin;
    public final String mname;
    public final Boolean mshow_admin_info;

    /* renamed from: com.ss.android.lark.pb.moments_entities.Category$b */
    private static final class C49959b extends ProtoAdapter<Category> {
        C49959b() {
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
            int i9;
            int i10 = 0;
            if (category.mcategory_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, category.mcategory_id);
            } else {
                i = 0;
            }
            if (category.mname != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, category.mname);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (category.mdescription != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, category.mdescription);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (category.mi18n_info != null) {
                i4 = I18nInfo.ADAPTER.encodedSizeWithTag(4, category.mi18n_info);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (category.micon_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, category.micon_key);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag = i13 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, category.madmin_user_ids);
            if (category.mshow_admin_info != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, category.mshow_admin_info);
            } else {
                i6 = 0;
            }
            int i14 = encodedSizeWithTag + i6;
            if (category.mcan_create_post != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(11, category.mcan_create_post);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (category.mcan_anonymous != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(12, category.mcan_anonymous);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (category.mis_self_admin != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(13, category.mis_self_admin);
            } else {
                i9 = 0;
            }
            int i17 = i16 + i9;
            if (category.mcan_read != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(14, category.mcan_read);
            }
            return i17 + i10 + category.unknownFields().size();
        }

        /* renamed from: a */
        public Category decode(ProtoReader protoReader) throws IOException {
            C49958a aVar = new C49958a();
            aVar.f124964a = "";
            aVar.f124965b = "";
            aVar.f124966c = "";
            aVar.f124968e = "";
            aVar.f124970g = false;
            aVar.f124971h = false;
            aVar.f124972i = false;
            aVar.f124973j = false;
            aVar.f124974k = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124964a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124965b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124966c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124967d = I18nInfo.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124968e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124969f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f124970g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                        case 9:
                        case 10:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 11:
                            aVar.f124971h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f124972i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f124973j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            aVar.f124974k = ProtoAdapter.BOOL.decode(protoReader);
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
            if (category.mcategory_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, category.mcategory_id);
            }
            if (category.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, category.mname);
            }
            if (category.mdescription != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, category.mdescription);
            }
            if (category.mi18n_info != null) {
                I18nInfo.ADAPTER.encodeWithTag(protoWriter, 4, category.mi18n_info);
            }
            if (category.micon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, category.micon_key);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, category.madmin_user_ids);
            if (category.mshow_admin_info != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, category.mshow_admin_info);
            }
            if (category.mcan_create_post != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, category.mcan_create_post);
            }
            if (category.mcan_anonymous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, category.mcan_anonymous);
            }
            if (category.mis_self_admin != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, category.mis_self_admin);
            }
            if (category.mcan_read != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, category.mcan_read);
            }
            protoWriter.writeBytes(category.unknownFields());
        }
    }

    public static final class I18nInfo extends Message<I18nInfo, C49956a> {
        public static final ProtoAdapter<I18nInfo> ADAPTER = new C49957b();
        private static final long serialVersionUID = 0;
        public final Map<String, String> mi18n_descriptions;
        public final Map<String, String> mi18n_names;

        /* renamed from: com.ss.android.lark.pb.moments_entities.Category$I18nInfo$a */
        public static final class C49956a extends Message.Builder<I18nInfo, C49956a> {

            /* renamed from: a */
            public Map<String, String> f124960a = Internal.newMutableMap();

            /* renamed from: b */
            public Map<String, String> f124961b = Internal.newMutableMap();

            /* renamed from: a */
            public I18nInfo build() {
                return new I18nInfo(this.f124960a, this.f124961b, super.buildUnknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.Category$I18nInfo$b */
        private static final class C49957b extends ProtoAdapter<I18nInfo> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f124962a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            /* renamed from: b */
            private final ProtoAdapter<Map<String, String>> f124963b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C49957b() {
                super(FieldEncoding.LENGTH_DELIMITED, I18nInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(I18nInfo i18nInfo) {
                return this.f124962a.encodedSizeWithTag(1, i18nInfo.mi18n_names) + this.f124963b.encodedSizeWithTag(2, i18nInfo.mi18n_descriptions) + i18nInfo.unknownFields().size();
            }

            /* renamed from: a */
            public I18nInfo decode(ProtoReader protoReader) throws IOException {
                C49956a aVar = new C49956a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124960a.putAll(this.f124962a.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124961b.putAll(this.f124963b.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, I18nInfo i18nInfo) throws IOException {
                this.f124962a.encodeWithTag(protoWriter, 1, i18nInfo.mi18n_names);
                this.f124963b.encodeWithTag(protoWriter, 2, i18nInfo.mi18n_descriptions);
                protoWriter.writeBytes(i18nInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49956a newBuilder() {
            C49956a aVar = new C49956a();
            aVar.f124960a = Internal.copyOf("mi18n_names", this.mi18n_names);
            aVar.f124961b = Internal.copyOf("mi18n_descriptions", this.mi18n_descriptions);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (!this.mi18n_names.isEmpty()) {
                sb.append(", i18n_names=");
                sb.append(this.mi18n_names);
            }
            if (!this.mi18n_descriptions.isEmpty()) {
                sb.append(", i18n_descriptions=");
                sb.append(this.mi18n_descriptions);
            }
            StringBuilder replace = sb.replace(0, 2, "I18nInfo{");
            replace.append('}');
            return replace.toString();
        }

        public I18nInfo(Map<String, String> map, Map<String, String> map2) {
            this(map, map2, ByteString.EMPTY);
        }

        public I18nInfo(Map<String, String> map, Map<String, String> map2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mi18n_names = Internal.immutableCopyOf("mi18n_names", map);
            this.mi18n_descriptions = Internal.immutableCopyOf("mi18n_descriptions", map2);
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments_entities.Category$a */
    public static final class C49958a extends Message.Builder<Category, C49958a> {

        /* renamed from: a */
        public String f124964a;

        /* renamed from: b */
        public String f124965b;

        /* renamed from: c */
        public String f124966c;

        /* renamed from: d */
        public I18nInfo f124967d;

        /* renamed from: e */
        public String f124968e;

        /* renamed from: f */
        public List<String> f124969f = Internal.newMutableList();

        /* renamed from: g */
        public Boolean f124970g;

        /* renamed from: h */
        public Boolean f124971h;

        /* renamed from: i */
        public Boolean f124972i;

        /* renamed from: j */
        public Boolean f124973j;

        /* renamed from: k */
        public Boolean f124974k;

        /* renamed from: a */
        public Category build() {
            return new Category(this.f124964a, this.f124965b, this.f124966c, this.f124967d, this.f124968e, this.f124969f, this.f124970g, this.f124971h, this.f124972i, this.f124973j, this.f124974k, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49958a newBuilder() {
        C49958a aVar = new C49958a();
        aVar.f124964a = this.mcategory_id;
        aVar.f124965b = this.mname;
        aVar.f124966c = this.mdescription;
        aVar.f124967d = this.mi18n_info;
        aVar.f124968e = this.micon_key;
        aVar.f124969f = Internal.copyOf("madmin_user_ids", this.madmin_user_ids);
        aVar.f124970g = this.mshow_admin_info;
        aVar.f124971h = this.mcan_create_post;
        aVar.f124972i = this.mcan_anonymous;
        aVar.f124973j = this.mis_self_admin;
        aVar.f124974k = this.mcan_read;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcategory_id != null) {
            sb.append(", category_id=");
            sb.append(this.mcategory_id);
        }
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.mdescription != null) {
            sb.append(", description=");
            sb.append(this.mdescription);
        }
        if (this.mi18n_info != null) {
            sb.append(", i18n_info=");
            sb.append(this.mi18n_info);
        }
        if (this.micon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.micon_key);
        }
        if (!this.madmin_user_ids.isEmpty()) {
            sb.append(", admin_user_ids=");
            sb.append(this.madmin_user_ids);
        }
        if (this.mshow_admin_info != null) {
            sb.append(", show_admin_info=");
            sb.append(this.mshow_admin_info);
        }
        if (this.mcan_create_post != null) {
            sb.append(", can_create_post=");
            sb.append(this.mcan_create_post);
        }
        if (this.mcan_anonymous != null) {
            sb.append(", can_anonymous=");
            sb.append(this.mcan_anonymous);
        }
        if (this.mis_self_admin != null) {
            sb.append(", is_self_admin=");
            sb.append(this.mis_self_admin);
        }
        if (this.mcan_read != null) {
            sb.append(", can_read=");
            sb.append(this.mcan_read);
        }
        StringBuilder replace = sb.replace(0, 2, "Category{");
        replace.append('}');
        return replace.toString();
    }

    public Category(String str, String str2, String str3, I18nInfo i18nInfo, String str4, List<String> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this(str, str2, str3, i18nInfo, str4, list, bool, bool2, bool3, bool4, bool5, ByteString.EMPTY);
    }

    public Category(String str, String str2, String str3, I18nInfo i18nInfo, String str4, List<String> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcategory_id = str;
        this.mname = str2;
        this.mdescription = str3;
        this.mi18n_info = i18nInfo;
        this.micon_key = str4;
        this.madmin_user_ids = Internal.immutableCopyOf("madmin_user_ids", list);
        this.mshow_admin_info = bool;
        this.mcan_create_post = bool2;
        this.mcan_anonymous = bool3;
        this.mis_self_admin = bool4;
        this.mcan_read = bool5;
    }
}
