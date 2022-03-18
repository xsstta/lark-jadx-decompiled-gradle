package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval;
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

public final class UpdateUserCustomStatusMeta extends Message<UpdateUserCustomStatusMeta, C16414a> {
    public static final ProtoAdapter<UpdateUserCustomStatusMeta> ADAPTER = new C16415b();
    public static final Long DEFAULT_ID = 0L;
    public static final Boolean DEFAULT_IS_NOT_DISTURB_MODE = false;
    public static final Long DEFAULT_LAST_CUSTOMIZED_END_TIME = 0L;
    public static final UserCustomStatusDuration DEFAULT_LAST_SELECTED_DURATION = UserCustomStatusDuration.MINUTES_30;
    private static final long serialVersionUID = 0;
    public final StatusEffectiveInterval effective_interval;
    public final List<UserCustomStatusField> fields;
    public final String icon_key;
    public final Long id;
    public final Boolean is_not_disturb_mode;
    public final Long last_customized_end_time;
    public final UserCustomStatusDuration last_selected_duration;
    public final Map<Long, Boolean> sync_settings;
    public final String title;

    public enum UserCustomStatusField implements WireEnum {
        TITLE(1),
        ICON_KEY(2),
        IS_NOT_DISTURB_MODE(3),
        EFFECTIVE_INTERVAL(4),
        LAST_SELECTED_DEFAULT_DURATION(5),
        LAST_CUSTOMIZED_END_TIME(6),
        SYN_SETTINGS(7);
        
        public static final ProtoAdapter<UserCustomStatusField> ADAPTER = ProtoAdapter.newEnumAdapter(UserCustomStatusField.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UserCustomStatusField fromValue(int i) {
            switch (i) {
                case 1:
                    return TITLE;
                case 2:
                    return ICON_KEY;
                case 3:
                    return IS_NOT_DISTURB_MODE;
                case 4:
                    return EFFECTIVE_INTERVAL;
                case 5:
                    return LAST_SELECTED_DEFAULT_DURATION;
                case 6:
                    return LAST_CUSTOMIZED_END_TIME;
                case 7:
                    return SYN_SETTINGS;
                default:
                    return null;
            }
        }

        private UserCustomStatusField(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta$b */
    private static final class C16415b extends ProtoAdapter<UpdateUserCustomStatusMeta> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Long, Boolean>> f42692a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, ProtoAdapter.BOOL);

        C16415b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateUserCustomStatusMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateUserCustomStatusMeta updateUserCustomStatusMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (updateUserCustomStatusMeta.id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, updateUserCustomStatusMeta.id);
            } else {
                i = 0;
            }
            if (updateUserCustomStatusMeta.title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, updateUserCustomStatusMeta.title);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (updateUserCustomStatusMeta.icon_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, updateUserCustomStatusMeta.icon_key);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (updateUserCustomStatusMeta.effective_interval != null) {
                i4 = StatusEffectiveInterval.ADAPTER.encodedSizeWithTag(4, updateUserCustomStatusMeta.effective_interval);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (updateUserCustomStatusMeta.is_not_disturb_mode != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, updateUserCustomStatusMeta.is_not_disturb_mode);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (updateUserCustomStatusMeta.last_selected_duration != null) {
                i6 = UserCustomStatusDuration.ADAPTER.encodedSizeWithTag(6, updateUserCustomStatusMeta.last_selected_duration);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (updateUserCustomStatusMeta.last_customized_end_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, updateUserCustomStatusMeta.last_customized_end_time);
            }
            return i12 + i7 + this.f42692a.encodedSizeWithTag(8, updateUserCustomStatusMeta.sync_settings) + UserCustomStatusField.ADAPTER.asRepeated().encodedSizeWithTag(9, updateUserCustomStatusMeta.fields) + updateUserCustomStatusMeta.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateUserCustomStatusMeta decode(ProtoReader protoReader) throws IOException {
            C16414a aVar = new C16414a();
            aVar.f42683a = 0L;
            aVar.f42684b = "";
            aVar.f42685c = "";
            aVar.f42687e = false;
            aVar.f42688f = UserCustomStatusDuration.MINUTES_30;
            aVar.f42689g = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42683a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42684b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42685c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42686d = StatusEffectiveInterval.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42687e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f42688f = UserCustomStatusDuration.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 7:
                            aVar.f42689g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f42690h.putAll(this.f42692a.decode(protoReader));
                            break;
                        case 9:
                            try {
                                aVar.f42691i.add(UserCustomStatusField.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, UpdateUserCustomStatusMeta updateUserCustomStatusMeta) throws IOException {
            if (updateUserCustomStatusMeta.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, updateUserCustomStatusMeta.id);
            }
            if (updateUserCustomStatusMeta.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateUserCustomStatusMeta.title);
            }
            if (updateUserCustomStatusMeta.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, updateUserCustomStatusMeta.icon_key);
            }
            if (updateUserCustomStatusMeta.effective_interval != null) {
                StatusEffectiveInterval.ADAPTER.encodeWithTag(protoWriter, 4, updateUserCustomStatusMeta.effective_interval);
            }
            if (updateUserCustomStatusMeta.is_not_disturb_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, updateUserCustomStatusMeta.is_not_disturb_mode);
            }
            if (updateUserCustomStatusMeta.last_selected_duration != null) {
                UserCustomStatusDuration.ADAPTER.encodeWithTag(protoWriter, 6, updateUserCustomStatusMeta.last_selected_duration);
            }
            if (updateUserCustomStatusMeta.last_customized_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, updateUserCustomStatusMeta.last_customized_end_time);
            }
            this.f42692a.encodeWithTag(protoWriter, 8, updateUserCustomStatusMeta.sync_settings);
            UserCustomStatusField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, updateUserCustomStatusMeta.fields);
            protoWriter.writeBytes(updateUserCustomStatusMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16414a newBuilder() {
        C16414a aVar = new C16414a();
        aVar.f42683a = this.id;
        aVar.f42684b = this.title;
        aVar.f42685c = this.icon_key;
        aVar.f42686d = this.effective_interval;
        aVar.f42687e = this.is_not_disturb_mode;
        aVar.f42688f = this.last_selected_duration;
        aVar.f42689g = this.last_customized_end_time;
        aVar.f42690h = Internal.copyOf("sync_settings", this.sync_settings);
        aVar.f42691i = Internal.copyOf("fields", this.fields);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "UpdateUserCustomStatusMeta");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
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
        if (!this.fields.isEmpty()) {
            sb.append(", fields=");
            sb.append(this.fields);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateUserCustomStatusMeta{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta$a */
    public static final class C16414a extends Message.Builder<UpdateUserCustomStatusMeta, C16414a> {

        /* renamed from: a */
        public Long f42683a;

        /* renamed from: b */
        public String f42684b;

        /* renamed from: c */
        public String f42685c;

        /* renamed from: d */
        public StatusEffectiveInterval f42686d;

        /* renamed from: e */
        public Boolean f42687e;

        /* renamed from: f */
        public UserCustomStatusDuration f42688f;

        /* renamed from: g */
        public Long f42689g;

        /* renamed from: h */
        public Map<Long, Boolean> f42690h = Internal.newMutableMap();

        /* renamed from: i */
        public List<UserCustomStatusField> f42691i = Internal.newMutableList();

        /* renamed from: a */
        public UpdateUserCustomStatusMeta build() {
            return new UpdateUserCustomStatusMeta(this.f42683a, this.f42684b, this.f42685c, this.f42686d, this.f42687e, this.f42688f, this.f42689g, this.f42690h, this.f42691i, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16414a mo58585a(StatusEffectiveInterval statusEffectiveInterval) {
            this.f42686d = statusEffectiveInterval;
            return this;
        }

        /* renamed from: b */
        public C16414a mo58593b(Long l) {
            this.f42689g = l;
            return this;
        }

        /* renamed from: a */
        public C16414a mo58586a(UserCustomStatusDuration userCustomStatusDuration) {
            this.f42688f = userCustomStatusDuration;
            return this;
        }

        /* renamed from: b */
        public C16414a mo58594b(String str) {
            this.f42685c = str;
            return this;
        }

        /* renamed from: a */
        public C16414a mo58587a(Boolean bool) {
            this.f42687e = bool;
            return this;
        }

        /* renamed from: a */
        public C16414a mo58588a(Long l) {
            this.f42683a = l;
            return this;
        }

        /* renamed from: a */
        public C16414a mo58589a(String str) {
            this.f42684b = str;
            return this;
        }

        /* renamed from: a */
        public C16414a mo58590a(List<UserCustomStatusField> list) {
            Internal.checkElementsNotNull(list);
            this.f42691i = list;
            return this;
        }

        /* renamed from: a */
        public C16414a mo58591a(Map<Long, Boolean> map) {
            Internal.checkElementsNotNull(map);
            this.f42690h = map;
            return this;
        }
    }

    public UpdateUserCustomStatusMeta(Long l, String str, String str2, StatusEffectiveInterval statusEffectiveInterval, Boolean bool, UserCustomStatusDuration userCustomStatusDuration, Long l2, Map<Long, Boolean> map, List<UserCustomStatusField> list) {
        this(l, str, str2, statusEffectiveInterval, bool, userCustomStatusDuration, l2, map, list, ByteString.EMPTY);
    }

    public UpdateUserCustomStatusMeta(Long l, String str, String str2, StatusEffectiveInterval statusEffectiveInterval, Boolean bool, UserCustomStatusDuration userCustomStatusDuration, Long l2, Map<Long, Boolean> map, List<UserCustomStatusField> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.title = str;
        this.icon_key = str2;
        this.effective_interval = statusEffectiveInterval;
        this.is_not_disturb_mode = bool;
        this.last_selected_duration = userCustomStatusDuration;
        this.last_customized_end_time = l2;
        this.sync_settings = Internal.immutableCopyOf("sync_settings", map);
        this.fields = Internal.immutableCopyOf("fields", list);
    }
}
