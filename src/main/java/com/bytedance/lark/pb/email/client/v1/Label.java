package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Label extends Message<Label, C16618a> {
    public static final ProtoAdapter<Label> ADAPTER = new C16619b();
    public static final Long DEFAULT_ALL_ORDER_INDEX = 0L;
    public static final Long DEFAULT_CREATED_TIMESTAMP_MS = 0L;
    public static final EmailClientType DEFAULT_EMAIL_CLIENT_TYPE = EmailClientType.LARK_MAIL;
    public static final Boolean DEFAULT_IS_SYSTEM = false;
    public static final ModelType DEFAULT_MODEL_TYPE = ModelType.LABEL;
    public static final Boolean DEFAULT_SHOW_IN_LABEL_LIST = false;
    public static final Long DEFAULT_UNREAD_COUNT = 0L;
    public static final Long DEFAULT_UPDATED_TIMESTAMP_MS = 0L;
    public static final Long DEFAULT_USER_ORDERED_INDEX = 0L;
    private static final long serialVersionUID = 0;
    public final Long all_order_index;
    public final String bg_color;
    public final Long created_timestamp_ms;
    public final EmailClientType email_client_type;
    public final String font_color;
    public final String id;
    public final Boolean is_system;
    public final ModelType model_type;
    public final String name;
    public final List<String> node_path;
    public final String parent_id;
    public final Boolean show_in_label_list;
    public final Long unread_count;
    public final Long updated_timestamp_ms;
    public final Long user_ordered_index;

    public enum EmailClientType implements WireEnum {
        LARK_MAIL(0),
        GOOGLE_MAIL(1),
        EXCHANGE(2);
        
        public static final ProtoAdapter<EmailClientType> ADAPTER = ProtoAdapter.newEnumAdapter(EmailClientType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EmailClientType fromValue(int i) {
            if (i == 0) {
                return LARK_MAIL;
            }
            if (i == 1) {
                return GOOGLE_MAIL;
            }
            if (i != 2) {
                return null;
            }
            return EXCHANGE;
        }

        private EmailClientType(int i) {
            this.value = i;
        }
    }

    public enum ModelType implements WireEnum {
        LABEL(0),
        FOLDER(1);
        
        public static final ProtoAdapter<ModelType> ADAPTER = ProtoAdapter.newEnumAdapter(ModelType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ModelType fromValue(int i) {
            if (i == 0) {
                return LABEL;
            }
            if (i != 1) {
                return null;
            }
            return FOLDER;
        }

        private ModelType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Label$b */
    private static final class C16619b extends ProtoAdapter<Label> {
        C16619b() {
            super(FieldEncoding.LENGTH_DELIMITED, Label.class);
        }

        /* renamed from: a */
        public int encodedSize(Label label) {
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
            int i11;
            int i12;
            int i13;
            int i14 = 0;
            if (label.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, label.id);
            } else {
                i = 0;
            }
            if (label.is_system != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, label.is_system);
            } else {
                i2 = 0;
            }
            int i15 = i + i2;
            if (label.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, label.name);
            } else {
                i3 = 0;
            }
            int i16 = i15 + i3;
            if (label.bg_color != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, label.bg_color);
            } else {
                i4 = 0;
            }
            int i17 = i16 + i4;
            if (label.font_color != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, label.font_color);
            } else {
                i5 = 0;
            }
            int i18 = i17 + i5;
            if (label.created_timestamp_ms != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, label.created_timestamp_ms);
            } else {
                i6 = 0;
            }
            int i19 = i18 + i6;
            if (label.updated_timestamp_ms != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, label.updated_timestamp_ms);
            } else {
                i7 = 0;
            }
            int i20 = i19 + i7;
            if (label.show_in_label_list != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, label.show_in_label_list);
            } else {
                i8 = 0;
            }
            int i21 = i20 + i8;
            if (label.user_ordered_index != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, label.user_ordered_index);
            } else {
                i9 = 0;
            }
            int i22 = i21 + i9;
            if (label.unread_count != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, label.unread_count);
            } else {
                i10 = 0;
            }
            int i23 = i22 + i10;
            if (label.all_order_index != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(11, label.all_order_index);
            } else {
                i11 = 0;
            }
            int i24 = i23 + i11;
            if (label.email_client_type != null) {
                i12 = EmailClientType.ADAPTER.encodedSizeWithTag(12, label.email_client_type);
            } else {
                i12 = 0;
            }
            int i25 = i24 + i12;
            if (label.parent_id != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(13, label.parent_id);
            } else {
                i13 = 0;
            }
            int encodedSizeWithTag = i25 + i13 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(14, label.node_path);
            if (label.model_type != null) {
                i14 = ModelType.ADAPTER.encodedSizeWithTag(15, label.model_type);
            }
            return encodedSizeWithTag + i14 + label.unknownFields().size();
        }

        /* renamed from: a */
        public Label decode(ProtoReader protoReader) throws IOException {
            C16618a aVar = new C16618a();
            aVar.f43033a = "";
            aVar.f43034b = false;
            aVar.f43035c = "";
            aVar.f43036d = "";
            aVar.f43037e = "";
            aVar.f43038f = 0L;
            aVar.f43039g = 0L;
            aVar.f43040h = false;
            aVar.f43041i = 0L;
            aVar.f43042j = 0L;
            aVar.f43043k = 0L;
            aVar.f43044l = EmailClientType.LARK_MAIL;
            aVar.f43045m = "";
            aVar.f43047o = ModelType.LABEL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43033a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43034b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43035c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43036d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43037e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43038f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43039g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43040h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f43041i = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            aVar.f43042j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f43043k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f43044l = EmailClientType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 13:
                            aVar.f43045m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f43046n.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            try {
                                aVar.f43047o = ModelType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, Label label) throws IOException {
            if (label.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, label.id);
            }
            if (label.is_system != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, label.is_system);
            }
            if (label.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, label.name);
            }
            if (label.bg_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, label.bg_color);
            }
            if (label.font_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, label.font_color);
            }
            if (label.created_timestamp_ms != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, label.created_timestamp_ms);
            }
            if (label.updated_timestamp_ms != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, label.updated_timestamp_ms);
            }
            if (label.show_in_label_list != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, label.show_in_label_list);
            }
            if (label.user_ordered_index != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, label.user_ordered_index);
            }
            if (label.unread_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, label.unread_count);
            }
            if (label.all_order_index != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, label.all_order_index);
            }
            if (label.email_client_type != null) {
                EmailClientType.ADAPTER.encodeWithTag(protoWriter, 12, label.email_client_type);
            }
            if (label.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, label.parent_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 14, label.node_path);
            if (label.model_type != null) {
                ModelType.ADAPTER.encodeWithTag(protoWriter, 15, label.model_type);
            }
            protoWriter.writeBytes(label.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16618a newBuilder() {
        C16618a aVar = new C16618a();
        aVar.f43033a = this.id;
        aVar.f43034b = this.is_system;
        aVar.f43035c = this.name;
        aVar.f43036d = this.bg_color;
        aVar.f43037e = this.font_color;
        aVar.f43038f = this.created_timestamp_ms;
        aVar.f43039g = this.updated_timestamp_ms;
        aVar.f43040h = this.show_in_label_list;
        aVar.f43041i = this.user_ordered_index;
        aVar.f43042j = this.unread_count;
        aVar.f43043k = this.all_order_index;
        aVar.f43044l = this.email_client_type;
        aVar.f43045m = this.parent_id;
        aVar.f43046n = Internal.copyOf("node_path", this.node_path);
        aVar.f43047o = this.model_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Label$a */
    public static final class C16618a extends Message.Builder<Label, C16618a> {

        /* renamed from: a */
        public String f43033a;

        /* renamed from: b */
        public Boolean f43034b;

        /* renamed from: c */
        public String f43035c;

        /* renamed from: d */
        public String f43036d;

        /* renamed from: e */
        public String f43037e;

        /* renamed from: f */
        public Long f43038f;

        /* renamed from: g */
        public Long f43039g;

        /* renamed from: h */
        public Boolean f43040h;

        /* renamed from: i */
        public Long f43041i;

        /* renamed from: j */
        public Long f43042j;

        /* renamed from: k */
        public Long f43043k;

        /* renamed from: l */
        public EmailClientType f43044l;

        /* renamed from: m */
        public String f43045m;

        /* renamed from: n */
        public List<String> f43046n = Internal.newMutableList();

        /* renamed from: o */
        public ModelType f43047o;

        /* renamed from: a */
        public Label build() {
            return new Label(this.f43033a, this.f43034b, this.f43035c, this.f43036d, this.f43037e, this.f43038f, this.f43039g, this.f43040h, this.f43041i, this.f43042j, this.f43043k, this.f43044l, this.f43045m, this.f43046n, this.f43047o, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16618a mo59097a(EmailClientType emailClientType) {
            this.f43044l = emailClientType;
            return this;
        }

        /* renamed from: b */
        public C16618a mo59104b(Boolean bool) {
            this.f43040h = bool;
            return this;
        }

        /* renamed from: c */
        public C16618a mo59107c(Long l) {
            this.f43041i = l;
            return this;
        }

        /* renamed from: d */
        public C16618a mo59109d(Long l) {
            this.f43042j = l;
            return this;
        }

        /* renamed from: e */
        public C16618a mo59111e(Long l) {
            this.f43043k = l;
            return this;
        }

        /* renamed from: a */
        public C16618a mo59098a(ModelType modelType) {
            this.f43047o = modelType;
            return this;
        }

        /* renamed from: b */
        public C16618a mo59105b(Long l) {
            this.f43039g = l;
            return this;
        }

        /* renamed from: c */
        public C16618a mo59108c(String str) {
            this.f43036d = str;
            return this;
        }

        /* renamed from: d */
        public C16618a mo59110d(String str) {
            this.f43037e = str;
            return this;
        }

        /* renamed from: e */
        public C16618a mo59112e(String str) {
            this.f43045m = str;
            return this;
        }

        /* renamed from: a */
        public C16618a mo59099a(Boolean bool) {
            this.f43034b = bool;
            return this;
        }

        /* renamed from: b */
        public C16618a mo59106b(String str) {
            this.f43035c = str;
            return this;
        }

        /* renamed from: a */
        public C16618a mo59100a(Long l) {
            this.f43038f = l;
            return this;
        }

        /* renamed from: a */
        public C16618a mo59101a(String str) {
            this.f43033a = str;
            return this;
        }

        /* renamed from: a */
        public C16618a mo59102a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43046n = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "Label");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.is_system != null) {
            sb.append(", is_system=");
            sb.append(this.is_system);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.bg_color != null) {
            sb.append(", bg_color=");
            sb.append(this.bg_color);
        }
        if (this.font_color != null) {
            sb.append(", font_color=");
            sb.append(this.font_color);
        }
        if (this.created_timestamp_ms != null) {
            sb.append(", created_timestamp_ms=");
            sb.append(this.created_timestamp_ms);
        }
        if (this.updated_timestamp_ms != null) {
            sb.append(", updated_timestamp_ms=");
            sb.append(this.updated_timestamp_ms);
        }
        if (this.show_in_label_list != null) {
            sb.append(", show_in_label_list=");
            sb.append(this.show_in_label_list);
        }
        if (this.user_ordered_index != null) {
            sb.append(", user_ordered_index=");
            sb.append(this.user_ordered_index);
        }
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (this.all_order_index != null) {
            sb.append(", all_order_index=");
            sb.append(this.all_order_index);
        }
        if (this.email_client_type != null) {
            sb.append(", email_client_type=");
            sb.append(this.email_client_type);
        }
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (!this.node_path.isEmpty()) {
            sb.append(", node_path=");
            sb.append(this.node_path);
        }
        if (this.model_type != null) {
            sb.append(", model_type=");
            sb.append(this.model_type);
        }
        StringBuilder replace = sb.replace(0, 2, "Label{");
        replace.append('}');
        return replace.toString();
    }

    public Label(String str, Boolean bool, String str2, String str3, String str4, Long l, Long l2, Boolean bool2, Long l3, Long l4, Long l5, EmailClientType emailClientType, String str5, List<String> list, ModelType modelType) {
        this(str, bool, str2, str3, str4, l, l2, bool2, l3, l4, l5, emailClientType, str5, list, modelType, ByteString.EMPTY);
    }

    public Label(String str, Boolean bool, String str2, String str3, String str4, Long l, Long l2, Boolean bool2, Long l3, Long l4, Long l5, EmailClientType emailClientType, String str5, List<String> list, ModelType modelType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.is_system = bool;
        this.name = str2;
        this.bg_color = str3;
        this.font_color = str4;
        this.created_timestamp_ms = l;
        this.updated_timestamp_ms = l2;
        this.show_in_label_list = bool2;
        this.user_ordered_index = l3;
        this.unread_count = l4;
        this.all_order_index = l5;
        this.email_client_type = emailClientType;
        this.parent_id = str5;
        this.node_path = Internal.immutableCopyOf("node_path", list);
        this.model_type = modelType;
    }
}
