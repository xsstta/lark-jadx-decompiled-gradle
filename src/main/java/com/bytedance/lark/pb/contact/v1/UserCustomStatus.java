package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class UserCustomStatus extends Message<UserCustomStatus, C16422a> {
    public static final ProtoAdapter<UserCustomStatus> ADAPTER = new C16423b();
    public static final Integer DEFAULT_DISPLAY_PRIORITY = 0;
    public static final Long DEFAULT_ID = 0L;
    public static final Boolean DEFAULT_IS_NOT_DISTURB_MODE = false;
    public static final Long DEFAULT_LAST_CUSTOMIZED_END_TIME = 0L;
    public static final UserCustomStatusDuration DEFAULT_LAST_SELECTED_DURATION = UserCustomStatusDuration.MINUTES_30;
    public static final Integer DEFAULT_ORDER_WEIGHT = 0;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer display_priority;
    public final StatusEffectiveInterval effective_interval;
    public final String event_name;
    public final String icon_key;
    public final Long id;
    public final Boolean is_not_disturb_mode;
    public final Long last_customized_end_time;
    public final UserCustomStatusDuration last_selected_duration;
    public final Integer order_weight;
    public final Map<Long, Boolean> sync_settings;
    public final String title;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        CUSTOM(1),
        NO_DISTURB(2),
        IN_MEETING(3),
        ON_LEAVE(4),
        NOT_CUSTOM(5);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CUSTOM;
            }
            if (i == 2) {
                return NO_DISTURB;
            }
            if (i == 3) {
                return IN_MEETING;
            }
            if (i == 4) {
                return ON_LEAVE;
            }
            if (i != 5) {
                return null;
            }
            return NOT_CUSTOM;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UserCustomStatus$b */
    private static final class C16423b extends ProtoAdapter<UserCustomStatus> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Long, Boolean>> f42718a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, ProtoAdapter.BOOL);

        C16423b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserCustomStatus.class);
        }

        /* renamed from: a */
        public int encodedSize(UserCustomStatus userCustomStatus) {
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
            int i11 = 0;
            if (userCustomStatus.id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, userCustomStatus.id);
            } else {
                i = 0;
            }
            if (userCustomStatus.type != null) {
                i2 = Type.ADAPTER.encodedSizeWithTag(2, userCustomStatus.type);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (userCustomStatus.title != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, userCustomStatus.title);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (userCustomStatus.icon_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, userCustomStatus.icon_key);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (userCustomStatus.effective_interval != null) {
                i5 = StatusEffectiveInterval.ADAPTER.encodedSizeWithTag(10, userCustomStatus.effective_interval);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (userCustomStatus.is_not_disturb_mode != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(11, userCustomStatus.is_not_disturb_mode);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (userCustomStatus.last_selected_duration != null) {
                i7 = UserCustomStatusDuration.ADAPTER.encodedSizeWithTag(12, userCustomStatus.last_selected_duration);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (userCustomStatus.last_customized_end_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(13, userCustomStatus.last_customized_end_time);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag = i17 + i8 + this.f42718a.encodedSizeWithTag(14, userCustomStatus.sync_settings);
            if (userCustomStatus.order_weight != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(20, userCustomStatus.order_weight);
            } else {
                i9 = 0;
            }
            int i18 = encodedSizeWithTag + i9;
            if (userCustomStatus.display_priority != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(21, userCustomStatus.display_priority);
            } else {
                i10 = 0;
            }
            int i19 = i18 + i10;
            if (userCustomStatus.event_name != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(22, userCustomStatus.event_name);
            }
            return i19 + i11 + userCustomStatus.unknownFields().size();
        }

        /* renamed from: a */
        public UserCustomStatus decode(ProtoReader protoReader) throws IOException {
            C16422a aVar = new C16422a();
            aVar.f42706a = 0L;
            aVar.f42707b = Type.UNKNOWN;
            aVar.f42708c = "";
            aVar.f42709d = "";
            aVar.f42711f = false;
            aVar.f42712g = UserCustomStatusDuration.MINUTES_30;
            aVar.f42713h = 0L;
            aVar.f42715j = 0;
            aVar.f42716k = 0;
            aVar.f42717l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42706a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f42707b = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f42708c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    switch (nextTag) {
                        case 10:
                            aVar.f42710e = StatusEffectiveInterval.ADAPTER.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f42711f = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f42712g = UserCustomStatusDuration.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 13:
                            aVar.f42713h = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 14:
                            aVar.f42714i.putAll(this.f42718a.decode(protoReader));
                            continue;
                        default:
                            switch (nextTag) {
                                case 20:
                                    aVar.f42715j = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 21:
                                    aVar.f42716k = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 22:
                                    aVar.f42717l = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                                    continue;
                            }
                    }
                } else {
                    aVar.f42709d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserCustomStatus userCustomStatus) throws IOException {
            if (userCustomStatus.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, userCustomStatus.id);
            }
            if (userCustomStatus.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, userCustomStatus.type);
            }
            if (userCustomStatus.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, userCustomStatus.title);
            }
            if (userCustomStatus.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, userCustomStatus.icon_key);
            }
            if (userCustomStatus.effective_interval != null) {
                StatusEffectiveInterval.ADAPTER.encodeWithTag(protoWriter, 10, userCustomStatus.effective_interval);
            }
            if (userCustomStatus.is_not_disturb_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, userCustomStatus.is_not_disturb_mode);
            }
            if (userCustomStatus.last_selected_duration != null) {
                UserCustomStatusDuration.ADAPTER.encodeWithTag(protoWriter, 12, userCustomStatus.last_selected_duration);
            }
            if (userCustomStatus.last_customized_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, userCustomStatus.last_customized_end_time);
            }
            this.f42718a.encodeWithTag(protoWriter, 14, userCustomStatus.sync_settings);
            if (userCustomStatus.order_weight != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 20, userCustomStatus.order_weight);
            }
            if (userCustomStatus.display_priority != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 21, userCustomStatus.display_priority);
            }
            if (userCustomStatus.event_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, userCustomStatus.event_name);
            }
            protoWriter.writeBytes(userCustomStatus.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UserCustomStatus$a */
    public static final class C16422a extends Message.Builder<UserCustomStatus, C16422a> {

        /* renamed from: a */
        public Long f42706a;

        /* renamed from: b */
        public Type f42707b;

        /* renamed from: c */
        public String f42708c;

        /* renamed from: d */
        public String f42709d;

        /* renamed from: e */
        public StatusEffectiveInterval f42710e;

        /* renamed from: f */
        public Boolean f42711f;

        /* renamed from: g */
        public UserCustomStatusDuration f42712g;

        /* renamed from: h */
        public Long f42713h;

        /* renamed from: i */
        public Map<Long, Boolean> f42714i = Internal.newMutableMap();

        /* renamed from: j */
        public Integer f42715j;

        /* renamed from: k */
        public Integer f42716k;

        /* renamed from: l */
        public String f42717l;

        /* renamed from: a */
        public UserCustomStatus build() {
            return new UserCustomStatus(this.f42706a, this.f42707b, this.f42708c, this.f42709d, this.f42710e, this.f42711f, this.f42712g, this.f42713h, this.f42714i, this.f42715j, this.f42716k, this.f42717l, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16422a mo58611a(StatusEffectiveInterval statusEffectiveInterval) {
            this.f42710e = statusEffectiveInterval;
            return this;
        }

        /* renamed from: a */
        public C16422a mo58612a(UserCustomStatusDuration userCustomStatusDuration) {
            this.f42712g = userCustomStatusDuration;
            return this;
        }

        /* renamed from: a */
        public C16422a mo58613a(Long l) {
            this.f42713h = l;
            return this;
        }

        /* renamed from: a */
        public C16422a mo58614a(Map<Long, Boolean> map) {
            Internal.checkElementsNotNull(map);
            this.f42714i = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16422a newBuilder() {
        C16422a aVar = new C16422a();
        aVar.f42706a = this.id;
        aVar.f42707b = this.type;
        aVar.f42708c = this.title;
        aVar.f42709d = this.icon_key;
        aVar.f42710e = this.effective_interval;
        aVar.f42711f = this.is_not_disturb_mode;
        aVar.f42712g = this.last_selected_duration;
        aVar.f42713h = this.last_customized_end_time;
        aVar.f42714i = Internal.copyOf("sync_settings", this.sync_settings);
        aVar.f42715j = this.order_weight;
        aVar.f42716k = this.display_priority;
        aVar.f42717l = this.event_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "UserCustomStatus");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (this.effective_interval != null) {
            sb.append(", effective_interval=");
            sb.append(this.effective_interval);
        }
        if (this.is_not_disturb_mode != null) {
            sb.append(", is_not_disturb_mode=");
            sb.append(this.is_not_disturb_mode);
        }
        if (this.last_selected_duration != null) {
            sb.append(", last_selected_duration=");
            sb.append(this.last_selected_duration);
        }
        if (this.last_customized_end_time != null) {
            sb.append(", last_customized_end_time=");
            sb.append(this.last_customized_end_time);
        }
        if (!this.sync_settings.isEmpty()) {
            sb.append(", sync_settings=");
            sb.append(this.sync_settings);
        }
        if (this.order_weight != null) {
            sb.append(", order_weight=");
            sb.append(this.order_weight);
        }
        if (this.display_priority != null) {
            sb.append(", display_priority=");
            sb.append(this.display_priority);
        }
        if (this.event_name != null) {
            sb.append(", event_name=");
            sb.append(this.event_name);
        }
        StringBuilder replace = sb.replace(0, 2, "UserCustomStatus{");
        replace.append('}');
        return replace.toString();
    }

    public UserCustomStatus(Long l, Type type2, String str, String str2, StatusEffectiveInterval statusEffectiveInterval, Boolean bool, UserCustomStatusDuration userCustomStatusDuration, Long l2, Map<Long, Boolean> map, Integer num, Integer num2, String str3) {
        this(l, type2, str, str2, statusEffectiveInterval, bool, userCustomStatusDuration, l2, map, num, num2, str3, ByteString.EMPTY);
    }

    public UserCustomStatus(Long l, Type type2, String str, String str2, StatusEffectiveInterval statusEffectiveInterval, Boolean bool, UserCustomStatusDuration userCustomStatusDuration, Long l2, Map<Long, Boolean> map, Integer num, Integer num2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.type = type2;
        this.title = str;
        this.icon_key = str2;
        this.effective_interval = statusEffectiveInterval;
        this.is_not_disturb_mode = bool;
        this.last_selected_duration = userCustomStatusDuration;
        this.last_customized_end_time = l2;
        this.sync_settings = Internal.immutableCopyOf("sync_settings", map);
        this.order_weight = num;
        this.display_priority = num2;
        this.event_name = str3;
    }
}
