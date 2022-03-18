package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class VideoChatSecuritySetting extends Message<VideoChatSecuritySetting, C51284a> {
    public static final ProtoAdapter<VideoChatSecuritySetting> ADAPTER = new C51285b();
    public static final Boolean DEFAULT_IS_OPEN_LOBBY = false;
    public static final SecurityLevel DEFAULT_SECURITY_LEVEL = SecurityLevel.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<String> group_ids;
    public final Boolean is_open_lobby;
    public final List<String> room_ids;
    public final SecurityLevel security_level;
    public final List<SpecialGroupType> special_group_type;
    public final List<String> user_ids;

    public enum SecurityLevel implements WireEnum {
        UNKNOWN(0),
        PUBLIC(1),
        TENANT(2),
        CONTACTS_AND_GROUP(3),
        ONLY_HOST(4);
        
        public static final ProtoAdapter<SecurityLevel> ADAPTER = ProtoAdapter.newEnumAdapter(SecurityLevel.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SecurityLevel fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return PUBLIC;
            }
            if (i == 2) {
                return TENANT;
            }
            if (i == 3) {
                return CONTACTS_AND_GROUP;
            }
            if (i != 4) {
                return null;
            }
            return ONLY_HOST;
        }

        private SecurityLevel(int i) {
            this.value = i;
        }
    }

    public enum SpecialGroupType implements WireEnum {
        TYPE_UNKNOWN(0),
        CALENDAR_GUEST_LIST(1);
        
        public static final ProtoAdapter<SpecialGroupType> ADAPTER = ProtoAdapter.newEnumAdapter(SpecialGroupType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SpecialGroupType fromValue(int i) {
            if (i == 0) {
                return TYPE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return CALENDAR_GUEST_LIST;
        }

        private SpecialGroupType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatSecuritySetting$b */
    private static final class C51285b extends ProtoAdapter<VideoChatSecuritySetting> {
        C51285b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatSecuritySetting.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatSecuritySetting videoChatSecuritySetting) {
            int i;
            int encodedSizeWithTag = SecurityLevel.ADAPTER.encodedSizeWithTag(1, videoChatSecuritySetting.security_level) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, videoChatSecuritySetting.group_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, videoChatSecuritySetting.user_ids);
            if (videoChatSecuritySetting.is_open_lobby != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, videoChatSecuritySetting.is_open_lobby);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + SpecialGroupType.ADAPTER.asRepeated().encodedSizeWithTag(5, videoChatSecuritySetting.special_group_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, videoChatSecuritySetting.room_ids) + videoChatSecuritySetting.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatSecuritySetting decode(ProtoReader protoReader) throws IOException {
            C51284a aVar = new C51284a();
            aVar.f127711a = SecurityLevel.UNKNOWN;
            aVar.f127714d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f127711a = SecurityLevel.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f127712b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f127713c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f127714d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f127715e.add(SpecialGroupType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f127716f.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, VideoChatSecuritySetting videoChatSecuritySetting) throws IOException {
            SecurityLevel.ADAPTER.encodeWithTag(protoWriter, 1, videoChatSecuritySetting.security_level);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, videoChatSecuritySetting.group_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, videoChatSecuritySetting.user_ids);
            if (videoChatSecuritySetting.is_open_lobby != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, videoChatSecuritySetting.is_open_lobby);
            }
            SpecialGroupType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, videoChatSecuritySetting.special_group_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, videoChatSecuritySetting.room_ids);
            protoWriter.writeBytes(videoChatSecuritySetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatSecuritySetting$a */
    public static final class C51284a extends Message.Builder<VideoChatSecuritySetting, C51284a> {

        /* renamed from: a */
        public SecurityLevel f127711a;

        /* renamed from: b */
        public List<String> f127712b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f127713c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f127714d;

        /* renamed from: e */
        public List<SpecialGroupType> f127715e = Internal.newMutableList();

        /* renamed from: f */
        public List<String> f127716f = Internal.newMutableList();

        /* renamed from: a */
        public VideoChatSecuritySetting build() {
            SecurityLevel securityLevel = this.f127711a;
            if (securityLevel != null) {
                return new VideoChatSecuritySetting(securityLevel, this.f127712b, this.f127713c, this.f127714d, this.f127715e, this.f127716f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(securityLevel, "security_level");
        }

        /* renamed from: a */
        public C51284a mo176796a(SecurityLevel securityLevel) {
            this.f127711a = securityLevel;
            return this;
        }

        /* renamed from: a */
        public C51284a mo176797a(Boolean bool) {
            this.f127714d = bool;
            return this;
        }

        /* renamed from: b */
        public C51284a mo176800b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f127713c = list;
            return this;
        }

        /* renamed from: c */
        public C51284a mo176801c(List<SpecialGroupType> list) {
            Internal.checkElementsNotNull(list);
            this.f127715e = list;
            return this;
        }

        /* renamed from: d */
        public C51284a mo176802d(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f127716f = list;
            return this;
        }

        /* renamed from: a */
        public C51284a mo176798a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f127712b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51284a newBuilder() {
        C51284a aVar = new C51284a();
        aVar.f127711a = this.security_level;
        aVar.f127712b = Internal.copyOf("group_ids", this.group_ids);
        aVar.f127713c = Internal.copyOf("user_ids", this.user_ids);
        aVar.f127714d = this.is_open_lobby;
        aVar.f127715e = Internal.copyOf("special_group_type", this.special_group_type);
        aVar.f127716f = Internal.copyOf("room_ids", this.room_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatSecuritySetting");
        StringBuilder sb = new StringBuilder();
        sb.append(", security_level=");
        sb.append(this.security_level);
        if (!this.group_ids.isEmpty()) {
            sb.append(", group_ids=");
            sb.append(this.group_ids);
        }
        if (!this.user_ids.isEmpty()) {
            sb.append(", user_ids=");
            sb.append(this.user_ids);
        }
        if (this.is_open_lobby != null) {
            sb.append(", is_open_lobby=");
            sb.append(this.is_open_lobby);
        }
        if (!this.special_group_type.isEmpty()) {
            sb.append(", special_group_type=");
            sb.append(this.special_group_type);
        }
        if (!this.room_ids.isEmpty()) {
            sb.append(", room_ids=");
            sb.append(this.room_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatSecuritySetting{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatSecuritySetting(SecurityLevel securityLevel, List<String> list, List<String> list2, Boolean bool, List<SpecialGroupType> list3, List<String> list4) {
        this(securityLevel, list, list2, bool, list3, list4, ByteString.EMPTY);
    }

    public VideoChatSecuritySetting(SecurityLevel securityLevel, List<String> list, List<String> list2, Boolean bool, List<SpecialGroupType> list3, List<String> list4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.security_level = securityLevel;
        this.group_ids = Internal.immutableCopyOf("group_ids", list);
        this.user_ids = Internal.immutableCopyOf("user_ids", list2);
        this.is_open_lobby = bool;
        this.special_group_type = Internal.immutableCopyOf("special_group_type", list3);
        this.room_ids = Internal.immutableCopyOf("room_ids", list4);
    }
}
