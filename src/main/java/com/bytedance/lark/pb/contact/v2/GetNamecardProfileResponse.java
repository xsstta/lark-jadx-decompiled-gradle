package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class GetNamecardProfileResponse extends Message<GetNamecardProfileResponse, C16478a> {
    public static final ProtoAdapter<GetNamecardProfileResponse> ADAPTER = new C16479b();
    private static final long serialVersionUID = 0;
    public final List<Field> field_orders;
    public final UserInfo user_info;

    public static final class Field extends Message<Field, C16472a> {
        public static final ProtoAdapter<Field> ADAPTER = new C16473b();
        public static final FieldType DEFAULT_FIELD_TYPE = FieldType.TEXT;
        private static final long serialVersionUID = 0;
        public final FieldType field_type;
        public final I18nVal i18n_names;
        public final String json_field_val;
        public final String key;

        public enum FieldType implements WireEnum {
            TEXT(1),
            LINK(2),
            PHONE(ParticipantRepo.f117150c);
            
            public static final ProtoAdapter<FieldType> ADAPTER = ProtoAdapter.newEnumAdapter(FieldType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static FieldType fromValue(int i) {
                if (i == 1) {
                    return TEXT;
                }
                if (i == 2) {
                    return LINK;
                }
                if (i != 500) {
                    return null;
                }
                return PHONE;
            }

            private FieldType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardProfileResponse$Field$b */
        private static final class C16473b extends ProtoAdapter<Field> {
            C16473b() {
                super(FieldEncoding.LENGTH_DELIMITED, Field.class);
            }

            /* renamed from: a */
            public int encodedSize(Field field) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (field.key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, field.key);
                } else {
                    i = 0;
                }
                if (field.i18n_names != null) {
                    i2 = I18nVal.ADAPTER.encodedSizeWithTag(2, field.i18n_names);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (field.field_type != null) {
                    i3 = FieldType.ADAPTER.encodedSizeWithTag(3, field.field_type);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (field.json_field_val != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, field.json_field_val);
                }
                return i6 + i4 + field.unknownFields().size();
            }

            /* renamed from: a */
            public Field decode(ProtoReader protoReader) throws IOException {
                C16472a aVar = new C16472a();
                aVar.f42776a = "";
                aVar.f42778c = FieldType.TEXT;
                aVar.f42779d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42776a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42777b = I18nVal.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            aVar.f42778c = FieldType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42779d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Field field) throws IOException {
                if (field.key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, field.key);
                }
                if (field.i18n_names != null) {
                    I18nVal.ADAPTER.encodeWithTag(protoWriter, 2, field.i18n_names);
                }
                if (field.field_type != null) {
                    FieldType.ADAPTER.encodeWithTag(protoWriter, 3, field.field_type);
                }
                if (field.json_field_val != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, field.json_field_val);
                }
                protoWriter.writeBytes(field.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardProfileResponse$Field$a */
        public static final class C16472a extends Message.Builder<Field, C16472a> {

            /* renamed from: a */
            public String f42776a;

            /* renamed from: b */
            public I18nVal f42777b;

            /* renamed from: c */
            public FieldType f42778c;

            /* renamed from: d */
            public String f42779d;

            /* renamed from: a */
            public Field build() {
                return new Field(this.f42776a, this.f42777b, this.f42778c, this.f42779d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16472a newBuilder() {
            C16472a aVar = new C16472a();
            aVar.f42776a = this.key;
            aVar.f42777b = this.i18n_names;
            aVar.f42778c = this.field_type;
            aVar.f42779d = this.json_field_val;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Field");
            StringBuilder sb = new StringBuilder();
            if (this.key != null) {
                sb.append(", key=");
                sb.append(this.key);
            }
            if (this.i18n_names != null) {
                sb.append(", i18n_names=");
                sb.append(this.i18n_names);
            }
            if (this.field_type != null) {
                sb.append(", field_type=");
                sb.append(this.field_type);
            }
            if (this.json_field_val != null) {
                sb.append(", json_field_val=");
                sb.append(this.json_field_val);
            }
            StringBuilder replace = sb.replace(0, 2, "Field{");
            replace.append('}');
            return replace.toString();
        }

        public Field(String str, I18nVal i18nVal, FieldType fieldType, String str2) {
            this(str, i18nVal, fieldType, str2, ByteString.EMPTY);
        }

        public Field(String str, I18nVal i18nVal, FieldType fieldType, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.key = str;
            this.i18n_names = i18nVal;
            this.field_type = fieldType;
            this.json_field_val = str2;
        }
    }

    public static final class UserInfo extends Message<UserInfo, C16476a> {
        public static final ProtoAdapter<UserInfo> ADAPTER = new C16477b();
        public static final FriendStatus DEFAULT_FRIEND_STATUS = FriendStatus.Forward;
        private static final long serialVersionUID = 0;
        public final String avatar_key;
        public final String company_name;
        public final FriendStatus friend_status;
        public final String namecard_id;
        public final String user_name;

        public enum FriendStatus implements WireEnum {
            Forward(2),
            None(4);
            
            public static final ProtoAdapter<FriendStatus> ADAPTER = ProtoAdapter.newEnumAdapter(FriendStatus.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static FriendStatus fromValue(int i) {
                if (i == 2) {
                    return Forward;
                }
                if (i != 4) {
                    return null;
                }
                return None;
            }

            private FriendStatus(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardProfileResponse$UserInfo$b */
        private static final class C16477b extends ProtoAdapter<UserInfo> {
            C16477b() {
                super(FieldEncoding.LENGTH_DELIMITED, UserInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(UserInfo userInfo) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (userInfo.namecard_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, userInfo.namecard_id);
                } else {
                    i = 0;
                }
                if (userInfo.friend_status != null) {
                    i2 = FriendStatus.ADAPTER.encodedSizeWithTag(2, userInfo.friend_status);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (userInfo.user_name != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, userInfo.user_name);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (userInfo.avatar_key != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, userInfo.avatar_key);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (userInfo.company_name != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, userInfo.company_name);
                }
                return i8 + i5 + userInfo.unknownFields().size();
            }

            /* renamed from: a */
            public UserInfo decode(ProtoReader protoReader) throws IOException {
                C16476a aVar = new C16476a();
                aVar.f42783a = "";
                aVar.f42784b = FriendStatus.Forward;
                aVar.f42785c = "";
                aVar.f42786d = "";
                aVar.f42787e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42783a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            aVar.f42784b = FriendStatus.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 3) {
                        aVar.f42785c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f42786d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 7) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42787e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UserInfo userInfo) throws IOException {
                if (userInfo.namecard_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userInfo.namecard_id);
                }
                if (userInfo.friend_status != null) {
                    FriendStatus.ADAPTER.encodeWithTag(protoWriter, 2, userInfo.friend_status);
                }
                if (userInfo.user_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, userInfo.user_name);
                }
                if (userInfo.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, userInfo.avatar_key);
                }
                if (userInfo.company_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, userInfo.company_name);
                }
                protoWriter.writeBytes(userInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardProfileResponse$UserInfo$a */
        public static final class C16476a extends Message.Builder<UserInfo, C16476a> {

            /* renamed from: a */
            public String f42783a;

            /* renamed from: b */
            public FriendStatus f42784b;

            /* renamed from: c */
            public String f42785c;

            /* renamed from: d */
            public String f42786d;

            /* renamed from: e */
            public String f42787e;

            /* renamed from: a */
            public UserInfo build() {
                return new UserInfo(this.f42783a, this.f42784b, this.f42785c, this.f42786d, this.f42787e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16476a newBuilder() {
            C16476a aVar = new C16476a();
            aVar.f42783a = this.namecard_id;
            aVar.f42784b = this.friend_status;
            aVar.f42785c = this.user_name;
            aVar.f42786d = this.avatar_key;
            aVar.f42787e = this.company_name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "UserInfo");
            StringBuilder sb = new StringBuilder();
            if (this.namecard_id != null) {
                sb.append(", namecard_id=");
                sb.append(this.namecard_id);
            }
            if (this.friend_status != null) {
                sb.append(", friend_status=");
                sb.append(this.friend_status);
            }
            if (this.user_name != null) {
                sb.append(", user_name=");
                sb.append(this.user_name);
            }
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            if (this.company_name != null) {
                sb.append(", company_name=");
                sb.append(this.company_name);
            }
            StringBuilder replace = sb.replace(0, 2, "UserInfo{");
            replace.append('}');
            return replace.toString();
        }

        public UserInfo(String str, FriendStatus friendStatus, String str2, String str3, String str4) {
            this(str, friendStatus, str2, str3, str4, ByteString.EMPTY);
        }

        public UserInfo(String str, FriendStatus friendStatus, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.namecard_id = str;
            this.friend_status = friendStatus;
            this.user_name = str2;
            this.avatar_key = str3;
            this.company_name = str4;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardProfileResponse$b */
    private static final class C16479b extends ProtoAdapter<GetNamecardProfileResponse> {
        C16479b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNamecardProfileResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNamecardProfileResponse getNamecardProfileResponse) {
            int i;
            if (getNamecardProfileResponse.user_info != null) {
                i = UserInfo.ADAPTER.encodedSizeWithTag(1, getNamecardProfileResponse.user_info);
            } else {
                i = 0;
            }
            return i + Field.ADAPTER.asRepeated().encodedSizeWithTag(2, getNamecardProfileResponse.field_orders) + getNamecardProfileResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetNamecardProfileResponse decode(ProtoReader protoReader) throws IOException {
            C16478a aVar = new C16478a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42788a = UserInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42789b.add(Field.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNamecardProfileResponse getNamecardProfileResponse) throws IOException {
            if (getNamecardProfileResponse.user_info != null) {
                UserInfo.ADAPTER.encodeWithTag(protoWriter, 1, getNamecardProfileResponse.user_info);
            }
            Field.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getNamecardProfileResponse.field_orders);
            protoWriter.writeBytes(getNamecardProfileResponse.unknownFields());
        }
    }

    public static final class I18nVal extends Message<I18nVal, C16474a> {
        public static final ProtoAdapter<I18nVal> ADAPTER = new C16475b();
        private static final long serialVersionUID = 0;
        public final String default_val;
        public final Map<String, String> i18n_vals;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardProfileResponse$I18nVal$a */
        public static final class C16474a extends Message.Builder<I18nVal, C16474a> {

            /* renamed from: a */
            public String f42780a;

            /* renamed from: b */
            public Map<String, String> f42781b = Internal.newMutableMap();

            /* renamed from: a */
            public I18nVal build() {
                return new I18nVal(this.f42780a, this.f42781b, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardProfileResponse$I18nVal$b */
        private static final class C16475b extends ProtoAdapter<I18nVal> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f42782a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C16475b() {
                super(FieldEncoding.LENGTH_DELIMITED, I18nVal.class);
            }

            /* renamed from: a */
            public int encodedSize(I18nVal i18nVal) {
                int i;
                if (i18nVal.default_val != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, i18nVal.default_val);
                } else {
                    i = 0;
                }
                return i + this.f42782a.encodedSizeWithTag(2, i18nVal.i18n_vals) + i18nVal.unknownFields().size();
            }

            /* renamed from: a */
            public I18nVal decode(ProtoReader protoReader) throws IOException {
                C16474a aVar = new C16474a();
                aVar.f42780a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42780a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42781b.putAll(this.f42782a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, I18nVal i18nVal) throws IOException {
                if (i18nVal.default_val != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, i18nVal.default_val);
                }
                this.f42782a.encodeWithTag(protoWriter, 2, i18nVal.i18n_vals);
                protoWriter.writeBytes(i18nVal.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16474a newBuilder() {
            C16474a aVar = new C16474a();
            aVar.f42780a = this.default_val;
            aVar.f42781b = Internal.copyOf("i18n_vals", this.i18n_vals);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "I18nVal");
            StringBuilder sb = new StringBuilder();
            if (this.default_val != null) {
                sb.append(", default_val=");
                sb.append(this.default_val);
            }
            if (!this.i18n_vals.isEmpty()) {
                sb.append(", i18n_vals=");
                sb.append(this.i18n_vals);
            }
            StringBuilder replace = sb.replace(0, 2, "I18nVal{");
            replace.append('}');
            return replace.toString();
        }

        public I18nVal(String str, Map<String, String> map) {
            this(str, map, ByteString.EMPTY);
        }

        public I18nVal(String str, Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.default_val = str;
            this.i18n_vals = Internal.immutableCopyOf("i18n_vals", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardProfileResponse$a */
    public static final class C16478a extends Message.Builder<GetNamecardProfileResponse, C16478a> {

        /* renamed from: a */
        public UserInfo f42788a;

        /* renamed from: b */
        public List<Field> f42789b = Internal.newMutableList();

        /* renamed from: a */
        public GetNamecardProfileResponse build() {
            return new GetNamecardProfileResponse(this.f42788a, this.f42789b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16478a newBuilder() {
        C16478a aVar = new C16478a();
        aVar.f42788a = this.user_info;
        aVar.f42789b = Internal.copyOf("field_orders", this.field_orders);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetNamecardProfileResponse");
        StringBuilder sb = new StringBuilder();
        if (this.user_info != null) {
            sb.append(", user_info=");
            sb.append(this.user_info);
        }
        if (!this.field_orders.isEmpty()) {
            sb.append(", field_orders=");
            sb.append(this.field_orders);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNamecardProfileResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetNamecardProfileResponse(UserInfo userInfo, List<Field> list) {
        this(userInfo, list, ByteString.EMPTY);
    }

    public GetNamecardProfileResponse(UserInfo userInfo, List<Field> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_info = userInfo;
        this.field_orders = Internal.immutableCopyOf("field_orders", list);
    }
}
