package com.ss.android.lark.pb.videochat;

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

public final class VideoChatSecuritySetting extends Message<VideoChatSecuritySetting, C50435a> {
    public static final ProtoAdapter<VideoChatSecuritySetting> ADAPTER = new C50436b();
    public static final Boolean DEFAULT_HAS_SET_SECURITY_CONTACTS_AND_GROUP = false;
    public static final Boolean DEFAULT_IS_OPEN_LOBBY = false;
    private static final long serialVersionUID = 0;
    public final List<String> mgroup_ids;
    public final Boolean mhas_set_security_contacts_and_group;
    public final Boolean mis_open_lobby;
    public final List<String> mroom_ids;
    public final SecurityLevel msecurity_level;
    public final List<SpecialGroupType> mspecial_group_type;
    public final List<String> muser_ids;

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

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatSecuritySetting$b */
    private static final class C50436b extends ProtoAdapter<VideoChatSecuritySetting> {
        C50436b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatSecuritySetting.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatSecuritySetting videoChatSecuritySetting) {
            int i;
            int encodedSizeWithTag = SecurityLevel.ADAPTER.encodedSizeWithTag(1, videoChatSecuritySetting.msecurity_level) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, videoChatSecuritySetting.mgroup_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, videoChatSecuritySetting.muser_ids);
            int i2 = 0;
            if (videoChatSecuritySetting.mis_open_lobby != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, videoChatSecuritySetting.mis_open_lobby);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + SpecialGroupType.ADAPTER.asRepeated().encodedSizeWithTag(5, videoChatSecuritySetting.mspecial_group_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, videoChatSecuritySetting.mroom_ids);
            if (videoChatSecuritySetting.mhas_set_security_contacts_and_group != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(8, videoChatSecuritySetting.mhas_set_security_contacts_and_group);
            }
            return encodedSizeWithTag2 + i2 + videoChatSecuritySetting.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatSecuritySetting decode(ProtoReader protoReader) throws IOException {
            C50435a aVar = new C50435a();
            aVar.f125947d = false;
            aVar.f125950g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f125944a = SecurityLevel.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f125945b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f125946c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f125947d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f125948e.add(SpecialGroupType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f125949f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 8:
                            aVar.f125950g = ProtoAdapter.BOOL.decode(protoReader);
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
            SecurityLevel.ADAPTER.encodeWithTag(protoWriter, 1, videoChatSecuritySetting.msecurity_level);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, videoChatSecuritySetting.mgroup_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, videoChatSecuritySetting.muser_ids);
            if (videoChatSecuritySetting.mis_open_lobby != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, videoChatSecuritySetting.mis_open_lobby);
            }
            SpecialGroupType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, videoChatSecuritySetting.mspecial_group_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, videoChatSecuritySetting.mroom_ids);
            if (videoChatSecuritySetting.mhas_set_security_contacts_and_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, videoChatSecuritySetting.mhas_set_security_contacts_and_group);
            }
            protoWriter.writeBytes(videoChatSecuritySetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatSecuritySetting$a */
    public static final class C50435a extends Message.Builder<VideoChatSecuritySetting, C50435a> {

        /* renamed from: a */
        public SecurityLevel f125944a;

        /* renamed from: b */
        public List<String> f125945b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f125946c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f125947d;

        /* renamed from: e */
        public List<SpecialGroupType> f125948e = Internal.newMutableList();

        /* renamed from: f */
        public List<String> f125949f = Internal.newMutableList();

        /* renamed from: g */
        public Boolean f125950g;

        /* renamed from: a */
        public VideoChatSecuritySetting build() {
            SecurityLevel securityLevel = this.f125944a;
            if (securityLevel != null) {
                return new VideoChatSecuritySetting(securityLevel, this.f125945b, this.f125946c, this.f125947d, this.f125948e, this.f125949f, this.f125950g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(securityLevel, "msecurity_level");
        }
    }

    @Override // com.squareup.wire.Message
    public C50435a newBuilder() {
        C50435a aVar = new C50435a();
        aVar.f125944a = this.msecurity_level;
        aVar.f125945b = Internal.copyOf("mgroup_ids", this.mgroup_ids);
        aVar.f125946c = Internal.copyOf("muser_ids", this.muser_ids);
        aVar.f125947d = this.mis_open_lobby;
        aVar.f125948e = Internal.copyOf("mspecial_group_type", this.mspecial_group_type);
        aVar.f125949f = Internal.copyOf("mroom_ids", this.mroom_ids);
        aVar.f125950g = this.mhas_set_security_contacts_and_group;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", security_level=");
        sb.append(this.msecurity_level);
        if (!this.mgroup_ids.isEmpty()) {
            sb.append(", group_ids=");
            sb.append(this.mgroup_ids);
        }
        if (!this.muser_ids.isEmpty()) {
            sb.append(", user_ids=");
            sb.append(this.muser_ids);
        }
        if (this.mis_open_lobby != null) {
            sb.append(", is_open_lobby=");
            sb.append(this.mis_open_lobby);
        }
        if (!this.mspecial_group_type.isEmpty()) {
            sb.append(", special_group_type=");
            sb.append(this.mspecial_group_type);
        }
        if (!this.mroom_ids.isEmpty()) {
            sb.append(", room_ids=");
            sb.append(this.mroom_ids);
        }
        if (this.mhas_set_security_contacts_and_group != null) {
            sb.append(", has_set_security_contacts_and_group=");
            sb.append(this.mhas_set_security_contacts_and_group);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatSecuritySetting{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatSecuritySetting(SecurityLevel securityLevel, List<String> list, List<String> list2, Boolean bool, List<SpecialGroupType> list3, List<String> list4, Boolean bool2) {
        this(securityLevel, list, list2, bool, list3, list4, bool2, ByteString.EMPTY);
    }

    public VideoChatSecuritySetting(SecurityLevel securityLevel, List<String> list, List<String> list2, Boolean bool, List<SpecialGroupType> list3, List<String> list4, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msecurity_level = securityLevel;
        this.mgroup_ids = Internal.immutableCopyOf("mgroup_ids", list);
        this.muser_ids = Internal.immutableCopyOf("muser_ids", list2);
        this.mis_open_lobby = bool;
        this.mspecial_group_type = Internal.immutableCopyOf("mspecial_group_type", list3);
        this.mroom_ids = Internal.immutableCopyOf("mroom_ids", list4);
        this.mhas_set_security_contacts_and_group = bool2;
    }
}
