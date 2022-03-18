package com.ss.android.lark.pb.videoconference.v1;

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
import java.util.Map;
import okio.ByteString;

public final class FollowStrategy extends Message<FollowStrategy, C50579a> {
    public static final ProtoAdapter<FollowStrategy> ADAPTER = new C50580b();
    public static final Boolean DEFAULT_CAN_BE_REACTIVATED = false;
    public static final Boolean DEFAULT_KEEP_ORDER = false;
    public static final Boolean DEFAULT_RECEIVING_DATA_WHEN_NOT_FOLLOWING = false;
    public static final ResourceInjectTiming DEFAULT_RESOURCE_INJECT_TIMING = ResourceInjectTiming.UNKNOWN;
    public static final UseDeviceIdScope DEFAULT_USE_DEVICE_ID_SCOPE = UseDeviceIdScope.NONE;
    public static final Boolean DEFAULT_USE_USER_CARD = false;
    private static final long serialVersionUID = 0;
    public final List<String> android_resource_ids;
    public final Boolean can_be_reactivated;
    public final String id;
    public final List<String> ios_resource_ids;
    public final Boolean keep_order;
    public final Boolean receiving_data_when_not_following;
    public final List<String> resource_ids;
    public final ResourceInjectTiming resource_inject_timing;
    public final Map<String, String> resource_versions;
    public final String settings;
    public final UseDeviceIdScope use_device_id_scope;
    public final Boolean use_user_card;

    public enum ResourceInjectTiming implements WireEnum {
        UNKNOWN(0),
        BEFORE_LOAD(1),
        ON_LOAD(2),
        DOM_READY(3);
        
        public static final ProtoAdapter<ResourceInjectTiming> ADAPTER = ProtoAdapter.newEnumAdapter(ResourceInjectTiming.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ResourceInjectTiming fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return BEFORE_LOAD;
            }
            if (i == 2) {
                return ON_LOAD;
            }
            if (i != 3) {
                return null;
            }
            return DOM_READY;
        }

        private ResourceInjectTiming(int i) {
            this.value = i;
        }
    }

    public enum UseDeviceIdScope implements WireEnum {
        NONE(0),
        ALL(1),
        STATE(2),
        PATCH(3);
        
        public static final ProtoAdapter<UseDeviceIdScope> ADAPTER = ProtoAdapter.newEnumAdapter(UseDeviceIdScope.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UseDeviceIdScope fromValue(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return ALL;
            }
            if (i == 2) {
                return STATE;
            }
            if (i != 3) {
                return null;
            }
            return PATCH;
        }

        private UseDeviceIdScope(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowStrategy$b */
    private static final class C50580b extends ProtoAdapter<FollowStrategy> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f126275a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C50580b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowStrategy.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowStrategy followStrategy) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, followStrategy.id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, followStrategy.resource_ids) + this.f126275a.encodedSizeWithTag(3, followStrategy.resource_versions);
            int i7 = 0;
            if (followStrategy.use_device_id_scope != null) {
                i = UseDeviceIdScope.ADAPTER.encodedSizeWithTag(4, followStrategy.use_device_id_scope);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (followStrategy.use_user_card != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(5, followStrategy.use_user_card);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (followStrategy.settings != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, followStrategy.settings);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (followStrategy.resource_inject_timing != null) {
                i4 = ResourceInjectTiming.ADAPTER.encodedSizeWithTag(7, followStrategy.resource_inject_timing);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (followStrategy.keep_order != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(8, followStrategy.keep_order);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (followStrategy.receiving_data_when_not_following != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(9, followStrategy.receiving_data_when_not_following);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (followStrategy.can_be_reactivated != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(10, followStrategy.can_be_reactivated);
            }
            return i13 + i7 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(11, followStrategy.android_resource_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(12, followStrategy.ios_resource_ids) + followStrategy.unknownFields().size();
        }

        /* renamed from: a */
        public FollowStrategy decode(ProtoReader protoReader) throws IOException {
            C50579a aVar = new C50579a();
            aVar.f126263a = "";
            aVar.f126266d = UseDeviceIdScope.NONE;
            aVar.f126267e = false;
            aVar.f126268f = "";
            aVar.f126269g = ResourceInjectTiming.UNKNOWN;
            aVar.f126270h = false;
            aVar.f126271i = false;
            aVar.f126272j = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126263a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126264b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f126265c.putAll(this.f126275a.decode(protoReader));
                            break;
                        case 4:
                            try {
                                aVar.f126266d = UseDeviceIdScope.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f126267e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126268f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f126269g = ResourceInjectTiming.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 8:
                            aVar.f126270h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f126271i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f126272j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f126273k.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f126274l.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, FollowStrategy followStrategy) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followStrategy.id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, followStrategy.resource_ids);
            this.f126275a.encodeWithTag(protoWriter, 3, followStrategy.resource_versions);
            if (followStrategy.use_device_id_scope != null) {
                UseDeviceIdScope.ADAPTER.encodeWithTag(protoWriter, 4, followStrategy.use_device_id_scope);
            }
            if (followStrategy.use_user_card != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, followStrategy.use_user_card);
            }
            if (followStrategy.settings != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, followStrategy.settings);
            }
            if (followStrategy.resource_inject_timing != null) {
                ResourceInjectTiming.ADAPTER.encodeWithTag(protoWriter, 7, followStrategy.resource_inject_timing);
            }
            if (followStrategy.keep_order != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, followStrategy.keep_order);
            }
            if (followStrategy.receiving_data_when_not_following != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, followStrategy.receiving_data_when_not_following);
            }
            if (followStrategy.can_be_reactivated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, followStrategy.can_be_reactivated);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 11, followStrategy.android_resource_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 12, followStrategy.ios_resource_ids);
            protoWriter.writeBytes(followStrategy.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowStrategy$a */
    public static final class C50579a extends Message.Builder<FollowStrategy, C50579a> {

        /* renamed from: a */
        public String f126263a;

        /* renamed from: b */
        public List<String> f126264b = Internal.newMutableList();

        /* renamed from: c */
        public Map<String, String> f126265c = Internal.newMutableMap();

        /* renamed from: d */
        public UseDeviceIdScope f126266d;

        /* renamed from: e */
        public Boolean f126267e;

        /* renamed from: f */
        public String f126268f;

        /* renamed from: g */
        public ResourceInjectTiming f126269g;

        /* renamed from: h */
        public Boolean f126270h;

        /* renamed from: i */
        public Boolean f126271i;

        /* renamed from: j */
        public Boolean f126272j;

        /* renamed from: k */
        public List<String> f126273k = Internal.newMutableList();

        /* renamed from: l */
        public List<String> f126274l = Internal.newMutableList();

        /* renamed from: a */
        public FollowStrategy build() {
            String str = this.f126263a;
            if (str != null) {
                return new FollowStrategy(str, this.f126264b, this.f126265c, this.f126266d, this.f126267e, this.f126268f, this.f126269g, this.f126270h, this.f126271i, this.f126272j, this.f126273k, this.f126274l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50579a newBuilder() {
        C50579a aVar = new C50579a();
        aVar.f126263a = this.id;
        aVar.f126264b = Internal.copyOf("resource_ids", this.resource_ids);
        aVar.f126265c = Internal.copyOf("resource_versions", this.resource_versions);
        aVar.f126266d = this.use_device_id_scope;
        aVar.f126267e = this.use_user_card;
        aVar.f126268f = this.settings;
        aVar.f126269g = this.resource_inject_timing;
        aVar.f126270h = this.keep_order;
        aVar.f126271i = this.receiving_data_when_not_following;
        aVar.f126272j = this.can_be_reactivated;
        aVar.f126273k = Internal.copyOf("android_resource_ids", this.android_resource_ids);
        aVar.f126274l = Internal.copyOf("ios_resource_ids", this.ios_resource_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FollowStrategy");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (!this.resource_ids.isEmpty()) {
            sb.append(", resource_ids=");
            sb.append(this.resource_ids);
        }
        if (!this.resource_versions.isEmpty()) {
            sb.append(", resource_versions=");
            sb.append(this.resource_versions);
        }
        if (this.use_device_id_scope != null) {
            sb.append(", use_device_id_scope=");
            sb.append(this.use_device_id_scope);
        }
        if (this.use_user_card != null) {
            sb.append(", use_user_card=");
            sb.append(this.use_user_card);
        }
        if (this.settings != null) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        if (this.resource_inject_timing != null) {
            sb.append(", resource_inject_timing=");
            sb.append(this.resource_inject_timing);
        }
        if (this.keep_order != null) {
            sb.append(", keep_order=");
            sb.append(this.keep_order);
        }
        if (this.receiving_data_when_not_following != null) {
            sb.append(", receiving_data_when_not_following=");
            sb.append(this.receiving_data_when_not_following);
        }
        if (this.can_be_reactivated != null) {
            sb.append(", can_be_reactivated=");
            sb.append(this.can_be_reactivated);
        }
        if (!this.android_resource_ids.isEmpty()) {
            sb.append(", android_resource_ids=");
            sb.append(this.android_resource_ids);
        }
        if (!this.ios_resource_ids.isEmpty()) {
            sb.append(", ios_resource_ids=");
            sb.append(this.ios_resource_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowStrategy{");
        replace.append('}');
        return replace.toString();
    }

    public FollowStrategy(String str, List<String> list, Map<String, String> map, UseDeviceIdScope useDeviceIdScope, Boolean bool, String str2, ResourceInjectTiming resourceInjectTiming, Boolean bool2, Boolean bool3, Boolean bool4, List<String> list2, List<String> list3) {
        this(str, list, map, useDeviceIdScope, bool, str2, resourceInjectTiming, bool2, bool3, bool4, list2, list3, ByteString.EMPTY);
    }

    public FollowStrategy(String str, List<String> list, Map<String, String> map, UseDeviceIdScope useDeviceIdScope, Boolean bool, String str2, ResourceInjectTiming resourceInjectTiming, Boolean bool2, Boolean bool3, Boolean bool4, List<String> list2, List<String> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.resource_ids = Internal.immutableCopyOf("resource_ids", list);
        this.resource_versions = Internal.immutableCopyOf("resource_versions", map);
        this.use_device_id_scope = useDeviceIdScope;
        this.use_user_card = bool;
        this.settings = str2;
        this.resource_inject_timing = resourceInjectTiming;
        this.keep_order = bool2;
        this.receiving_data_when_not_following = bool3;
        this.can_be_reactivated = bool4;
        this.android_resource_ids = Internal.immutableCopyOf("android_resource_ids", list2);
        this.ios_resource_ids = Internal.immutableCopyOf("ios_resource_ids", list3);
    }
}
