package com.ss.android.lark.pb.entities;

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

public final class AppStatusInfo extends Message<AppStatusInfo, C49640a> {
    public static final ProtoAdapter<AppStatusInfo> ADAPTER = new C49641b();
    public static final Long DEFAULT_APP_ID = 0L;
    public static final Boolean DEFAULT_CHATABLE = false;
    public static final Boolean DEFAULT_IS_AVAILABLE = false;
    public static final Boolean DEFAULT_IS_ISV = false;
    private static final long serialVersionUID = 0;
    public final List<FeatureAbility> mapp_ability;
    public final Long mapp_id;
    public final String mapp_store_url;
    public final String mapp_url;
    public final Image mavatar;
    public final String mavatar_key;
    public final List<BotCheckStatus> mbot_list;
    public final Boolean mchatable;
    public final String mcli_id;
    public final List<ExtraHitField> mextraHitFields;
    public final String mextra_config;
    public final Map<String, String> mi18n_descriptions;
    public final Map<String, String> mi18n_names;
    public final Boolean mis_available;
    public final Boolean mis_isv;
    public final AppUsageStatus mstatus;
    public final TipsContent mtips;

    public enum AppUsageStatus implements WireEnum {
        APP_USABLE(1),
        APP_TENANT_FORBIDDEN(2),
        APP_PLATFORM_FORBIDDEN(3),
        APP_DEVELOPER_FORBIDDEN(4),
        APP_OFFLINE(5),
        APP_USER_UNVISIBLE(6),
        APP_NEED_PAY_USE(7),
        APP_DELETED(8);
        
        public static final ProtoAdapter<AppUsageStatus> ADAPTER = ProtoAdapter.newEnumAdapter(AppUsageStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AppUsageStatus fromValue(int i) {
            switch (i) {
                case 1:
                    return APP_USABLE;
                case 2:
                    return APP_TENANT_FORBIDDEN;
                case 3:
                    return APP_PLATFORM_FORBIDDEN;
                case 4:
                    return APP_DEVELOPER_FORBIDDEN;
                case 5:
                    return APP_OFFLINE;
                case 6:
                    return APP_USER_UNVISIBLE;
                case 7:
                    return APP_NEED_PAY_USE;
                case 8:
                    return APP_DELETED;
                default:
                    return null;
            }
        }

        private AppUsageStatus(int i) {
            this.value = i;
        }
    }

    public enum FeatureAbility implements WireEnum {
        SMALL(1),
        H5(2),
        BOT(3);
        
        public static final ProtoAdapter<FeatureAbility> ADAPTER = ProtoAdapter.newEnumAdapter(FeatureAbility.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static FeatureAbility fromValue(int i) {
            if (i == 1) {
                return SMALL;
            }
            if (i == 2) {
                return H5;
            }
            if (i != 3) {
                return null;
            }
            return BOT;
        }

        private FeatureAbility(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.AppStatusInfo$b */
    private static final class C49641b extends ProtoAdapter<AppStatusInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f124306a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f124307b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49641b() {
            super(FieldEncoding.LENGTH_DELIMITED, AppStatusInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(AppStatusInfo appStatusInfo) {
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
            int i12 = 0;
            if (appStatusInfo.mcli_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, appStatusInfo.mcli_id);
            } else {
                i = 0;
            }
            if (appStatusInfo.mstatus != null) {
                i2 = AppUsageStatus.ADAPTER.encodedSizeWithTag(2, appStatusInfo.mstatus);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (appStatusInfo.mtips != null) {
                i3 = TipsContent.ADAPTER.encodedSizeWithTag(3, appStatusInfo.mtips);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag = i13 + i3 + BotCheckStatus.ADAPTER.asRepeated().encodedSizeWithTag(4, appStatusInfo.mbot_list) + FeatureAbility.ADAPTER.asRepeated().encodedSizeWithTag(5, appStatusInfo.mapp_ability);
            if (appStatusInfo.mapp_url != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, appStatusInfo.mapp_url);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i4 + this.f124306a.encodedSizeWithTag(7, appStatusInfo.mi18n_names) + this.f124307b.encodedSizeWithTag(8, appStatusInfo.mi18n_descriptions);
            if (appStatusInfo.mavatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(9, appStatusInfo.mavatar_key);
            } else {
                i5 = 0;
            }
            int i14 = encodedSizeWithTag2 + i5;
            if (appStatusInfo.mapp_id != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(10, appStatusInfo.mapp_id);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (appStatusInfo.mchatable != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(11, appStatusInfo.mchatable);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (appStatusInfo.mextra_config != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(12, appStatusInfo.mextra_config);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (appStatusInfo.mavatar != null) {
                i9 = Image.ADAPTER.encodedSizeWithTag(13, appStatusInfo.mavatar);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (appStatusInfo.mapp_store_url != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(14, appStatusInfo.mapp_store_url);
            } else {
                i10 = 0;
            }
            int i19 = i18 + i10;
            if (appStatusInfo.mis_isv != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(15, appStatusInfo.mis_isv);
            } else {
                i11 = 0;
            }
            int i20 = i19 + i11;
            if (appStatusInfo.mis_available != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(16, appStatusInfo.mis_available);
            }
            return i20 + i12 + ExtraHitField.ADAPTER.asRepeated().encodedSizeWithTag(17, appStatusInfo.mextraHitFields) + appStatusInfo.unknownFields().size();
        }

        /* renamed from: a */
        public AppStatusInfo decode(ProtoReader protoReader) throws IOException {
            C49640a aVar = new C49640a();
            aVar.f124289a = "";
            aVar.f124294f = "";
            aVar.f124297i = "";
            aVar.f124298j = 0L;
            aVar.f124299k = false;
            aVar.f124300l = "";
            aVar.f124302n = "";
            aVar.f124303o = false;
            aVar.f124304p = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124289a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f124290b = AppUsageStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f124291c = TipsContent.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124292d.add(BotCheckStatus.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            try {
                                aVar.f124293e.add(FeatureAbility.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f124294f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124295g.putAll(this.f124306a.decode(protoReader));
                            break;
                        case 8:
                            aVar.f124296h.putAll(this.f124307b.decode(protoReader));
                            break;
                        case 9:
                            aVar.f124297i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f124298j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f124299k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f124300l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f124301m = Image.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            aVar.f124302n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f124303o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            aVar.f124304p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 17:
                            aVar.f124305q.add(ExtraHitField.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, AppStatusInfo appStatusInfo) throws IOException {
            if (appStatusInfo.mcli_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appStatusInfo.mcli_id);
            }
            if (appStatusInfo.mstatus != null) {
                AppUsageStatus.ADAPTER.encodeWithTag(protoWriter, 2, appStatusInfo.mstatus);
            }
            if (appStatusInfo.mtips != null) {
                TipsContent.ADAPTER.encodeWithTag(protoWriter, 3, appStatusInfo.mtips);
            }
            BotCheckStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, appStatusInfo.mbot_list);
            FeatureAbility.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, appStatusInfo.mapp_ability);
            if (appStatusInfo.mapp_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, appStatusInfo.mapp_url);
            }
            this.f124306a.encodeWithTag(protoWriter, 7, appStatusInfo.mi18n_names);
            this.f124307b.encodeWithTag(protoWriter, 8, appStatusInfo.mi18n_descriptions);
            if (appStatusInfo.mavatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, appStatusInfo.mavatar_key);
            }
            if (appStatusInfo.mapp_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, appStatusInfo.mapp_id);
            }
            if (appStatusInfo.mchatable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, appStatusInfo.mchatable);
            }
            if (appStatusInfo.mextra_config != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, appStatusInfo.mextra_config);
            }
            if (appStatusInfo.mavatar != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 13, appStatusInfo.mavatar);
            }
            if (appStatusInfo.mapp_store_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, appStatusInfo.mapp_store_url);
            }
            if (appStatusInfo.mis_isv != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, appStatusInfo.mis_isv);
            }
            if (appStatusInfo.mis_available != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, appStatusInfo.mis_available);
            }
            ExtraHitField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 17, appStatusInfo.mextraHitFields);
            protoWriter.writeBytes(appStatusInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.AppStatusInfo$a */
    public static final class C49640a extends Message.Builder<AppStatusInfo, C49640a> {

        /* renamed from: a */
        public String f124289a;

        /* renamed from: b */
        public AppUsageStatus f124290b;

        /* renamed from: c */
        public TipsContent f124291c;

        /* renamed from: d */
        public List<BotCheckStatus> f124292d = Internal.newMutableList();

        /* renamed from: e */
        public List<FeatureAbility> f124293e = Internal.newMutableList();

        /* renamed from: f */
        public String f124294f;

        /* renamed from: g */
        public Map<String, String> f124295g = Internal.newMutableMap();

        /* renamed from: h */
        public Map<String, String> f124296h = Internal.newMutableMap();

        /* renamed from: i */
        public String f124297i;

        /* renamed from: j */
        public Long f124298j;

        /* renamed from: k */
        public Boolean f124299k;

        /* renamed from: l */
        public String f124300l;

        /* renamed from: m */
        public Image f124301m;

        /* renamed from: n */
        public String f124302n;

        /* renamed from: o */
        public Boolean f124303o;

        /* renamed from: p */
        public Boolean f124304p;

        /* renamed from: q */
        public List<ExtraHitField> f124305q = Internal.newMutableList();

        /* renamed from: a */
        public AppStatusInfo build() {
            return new AppStatusInfo(this.f124289a, this.f124290b, this.f124291c, this.f124292d, this.f124293e, this.f124294f, this.f124295g, this.f124296h, this.f124297i, this.f124298j, this.f124299k, this.f124300l, this.f124301m, this.f124302n, this.f124303o, this.f124304p, this.f124305q, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49640a newBuilder() {
        C49640a aVar = new C49640a();
        aVar.f124289a = this.mcli_id;
        aVar.f124290b = this.mstatus;
        aVar.f124291c = this.mtips;
        aVar.f124292d = Internal.copyOf("mbot_list", this.mbot_list);
        aVar.f124293e = Internal.copyOf("mapp_ability", this.mapp_ability);
        aVar.f124294f = this.mapp_url;
        aVar.f124295g = Internal.copyOf("mi18n_names", this.mi18n_names);
        aVar.f124296h = Internal.copyOf("mi18n_descriptions", this.mi18n_descriptions);
        aVar.f124297i = this.mavatar_key;
        aVar.f124298j = this.mapp_id;
        aVar.f124299k = this.mchatable;
        aVar.f124300l = this.mextra_config;
        aVar.f124301m = this.mavatar;
        aVar.f124302n = this.mapp_store_url;
        aVar.f124303o = this.mis_isv;
        aVar.f124304p = this.mis_available;
        aVar.f124305q = Internal.copyOf("mextraHitFields", this.mextraHitFields);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcli_id != null) {
            sb.append(", cli_id=");
            sb.append(this.mcli_id);
        }
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (this.mtips != null) {
            sb.append(", tips=");
            sb.append(this.mtips);
        }
        if (!this.mbot_list.isEmpty()) {
            sb.append(", bot_list=");
            sb.append(this.mbot_list);
        }
        if (!this.mapp_ability.isEmpty()) {
            sb.append(", app_ability=");
            sb.append(this.mapp_ability);
        }
        if (this.mapp_url != null) {
            sb.append(", app_url=");
            sb.append(this.mapp_url);
        }
        if (!this.mi18n_names.isEmpty()) {
            sb.append(", i18n_names=");
            sb.append(this.mi18n_names);
        }
        if (!this.mi18n_descriptions.isEmpty()) {
            sb.append(", i18n_descriptions=");
            sb.append(this.mi18n_descriptions);
        }
        if (this.mavatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.mavatar_key);
        }
        if (this.mapp_id != null) {
            sb.append(", app_id=");
            sb.append(this.mapp_id);
        }
        if (this.mchatable != null) {
            sb.append(", chatable=");
            sb.append(this.mchatable);
        }
        if (this.mextra_config != null) {
            sb.append(", extra_config=");
            sb.append(this.mextra_config);
        }
        if (this.mavatar != null) {
            sb.append(", avatar=");
            sb.append(this.mavatar);
        }
        if (this.mapp_store_url != null) {
            sb.append(", app_store_url=");
            sb.append(this.mapp_store_url);
        }
        if (this.mis_isv != null) {
            sb.append(", is_isv=");
            sb.append(this.mis_isv);
        }
        if (this.mis_available != null) {
            sb.append(", is_available=");
            sb.append(this.mis_available);
        }
        if (!this.mextraHitFields.isEmpty()) {
            sb.append(", extraHitFields=");
            sb.append(this.mextraHitFields);
        }
        StringBuilder replace = sb.replace(0, 2, "AppStatusInfo{");
        replace.append('}');
        return replace.toString();
    }

    public AppStatusInfo(String str, AppUsageStatus appUsageStatus, TipsContent tipsContent, List<BotCheckStatus> list, List<FeatureAbility> list2, String str2, Map<String, String> map, Map<String, String> map2, String str3, Long l, Boolean bool, String str4, Image image, String str5, Boolean bool2, Boolean bool3, List<ExtraHitField> list3) {
        this(str, appUsageStatus, tipsContent, list, list2, str2, map, map2, str3, l, bool, str4, image, str5, bool2, bool3, list3, ByteString.EMPTY);
    }

    public AppStatusInfo(String str, AppUsageStatus appUsageStatus, TipsContent tipsContent, List<BotCheckStatus> list, List<FeatureAbility> list2, String str2, Map<String, String> map, Map<String, String> map2, String str3, Long l, Boolean bool, String str4, Image image, String str5, Boolean bool2, Boolean bool3, List<ExtraHitField> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcli_id = str;
        this.mstatus = appUsageStatus;
        this.mtips = tipsContent;
        this.mbot_list = Internal.immutableCopyOf("mbot_list", list);
        this.mapp_ability = Internal.immutableCopyOf("mapp_ability", list2);
        this.mapp_url = str2;
        this.mi18n_names = Internal.immutableCopyOf("mi18n_names", map);
        this.mi18n_descriptions = Internal.immutableCopyOf("mi18n_descriptions", map2);
        this.mavatar_key = str3;
        this.mapp_id = l;
        this.mchatable = bool;
        this.mextra_config = str4;
        this.mavatar = image;
        this.mapp_store_url = str5;
        this.mis_isv = bool2;
        this.mis_available = bool3;
        this.mextraHitFields = Internal.immutableCopyOf("mextraHitFields", list3);
    }
}
