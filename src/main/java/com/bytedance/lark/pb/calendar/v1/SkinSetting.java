package com.bytedance.lark.pb.calendar.v1;

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
import java.util.Map;
import okio.ByteString;

public final class SkinSetting extends Message<SkinSetting, C16062a> {
    public static final ProtoAdapter<SkinSetting> ADAPTER = new C16063b();
    public static final SkinType DEFAULT_SKIN_TYPE = SkinType.LIGHT;
    private static final long serialVersionUID = 0;
    public final Map<String, String> alphas;
    public final Map<String, SkinColor> colors;
    public final SkinType skin_type;

    public enum AlphaType implements WireEnum {
        PC_LIGHT(1),
        PC_DARK(2),
        PC_GOOGLE_MARK(3),
        PC_TENTATIVE_MASK(4),
        PC_MONTH_VIEW_TENTATIVE_EVENT(5),
        MOBILE_NEED_ACTION_DARK(10),
        MOBILE_NEED_ACTION_LIGHT(11),
        MOBILE_TENTATIVE_LIGHT(12),
        MOBILE_TENTATIVE_DARK(13),
        MOBILE_INSTANCE(14),
        MOBILE_EVENT_CREATION(15),
        MOBILE_EVENT_CREATION_BG(16),
        MOBILE_EVENT_FINISHED_MASK(17);
        
        public static final ProtoAdapter<AlphaType> ADAPTER = ProtoAdapter.newEnumAdapter(AlphaType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AlphaType fromValue(int i) {
            if (i == 1) {
                return PC_LIGHT;
            }
            if (i == 2) {
                return PC_DARK;
            }
            if (i == 3) {
                return PC_GOOGLE_MARK;
            }
            if (i == 4) {
                return PC_TENTATIVE_MASK;
            }
            if (i == 5) {
                return PC_MONTH_VIEW_TENTATIVE_EVENT;
            }
            switch (i) {
                case 10:
                    return MOBILE_NEED_ACTION_DARK;
                case 11:
                    return MOBILE_NEED_ACTION_LIGHT;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return MOBILE_TENTATIVE_LIGHT;
                case 13:
                    return MOBILE_TENTATIVE_DARK;
                case 14:
                    return MOBILE_INSTANCE;
                case 15:
                    return MOBILE_EVENT_CREATION;
                case 16:
                    return MOBILE_EVENT_CREATION_BG;
                case 17:
                    return MOBILE_EVENT_FINISHED_MASK;
                default:
                    return null;
            }
        }

        private AlphaType(int i) {
            this.value = i;
        }
    }

    public enum SkinType implements WireEnum {
        LIGHT(1),
        DARK(2);
        
        public static final ProtoAdapter<SkinType> ADAPTER = ProtoAdapter.newEnumAdapter(SkinType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SkinType fromValue(int i) {
            if (i == 1) {
                return LIGHT;
            }
            if (i != 2) {
                return null;
            }
            return DARK;
        }

        private SkinType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SkinSetting$a */
    public static final class C16062a extends Message.Builder<SkinSetting, C16062a> {

        /* renamed from: a */
        public SkinType f42150a;

        /* renamed from: b */
        public Map<String, SkinColor> f42151b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, String> f42152c = Internal.newMutableMap();

        /* renamed from: a */
        public SkinSetting build() {
            return new SkinSetting(this.f42150a, this.f42151b, this.f42152c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SkinSetting$b */
    private static final class C16063b extends ProtoAdapter<SkinSetting> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, SkinColor>> f42153a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SkinColor.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f42154b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C16063b() {
            super(FieldEncoding.LENGTH_DELIMITED, SkinSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(SkinSetting skinSetting) {
            int i;
            if (skinSetting.skin_type != null) {
                i = SkinType.ADAPTER.encodedSizeWithTag(1, skinSetting.skin_type);
            } else {
                i = 0;
            }
            return i + this.f42153a.encodedSizeWithTag(2, skinSetting.colors) + this.f42154b.encodedSizeWithTag(3, skinSetting.alphas) + skinSetting.unknownFields().size();
        }

        /* renamed from: a */
        public SkinSetting decode(ProtoReader protoReader) throws IOException {
            C16062a aVar = new C16062a();
            aVar.f42150a = SkinType.LIGHT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42150a = SkinType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f42151b.putAll(this.f42153a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42152c.putAll(this.f42154b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SkinSetting skinSetting) throws IOException {
            if (skinSetting.skin_type != null) {
                SkinType.ADAPTER.encodeWithTag(protoWriter, 1, skinSetting.skin_type);
            }
            this.f42153a.encodeWithTag(protoWriter, 2, skinSetting.colors);
            this.f42154b.encodeWithTag(protoWriter, 3, skinSetting.alphas);
            protoWriter.writeBytes(skinSetting.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16062a newBuilder() {
        C16062a aVar = new C16062a();
        aVar.f42150a = this.skin_type;
        aVar.f42151b = Internal.copyOf("colors", this.colors);
        aVar.f42152c = Internal.copyOf("alphas", this.alphas);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SkinSetting");
        StringBuilder sb = new StringBuilder();
        if (this.skin_type != null) {
            sb.append(", skin_type=");
            sb.append(this.skin_type);
        }
        if (!this.colors.isEmpty()) {
            sb.append(", colors=");
            sb.append(this.colors);
        }
        if (!this.alphas.isEmpty()) {
            sb.append(", alphas=");
            sb.append(this.alphas);
        }
        StringBuilder replace = sb.replace(0, 2, "SkinSetting{");
        replace.append('}');
        return replace.toString();
    }

    public SkinSetting(SkinType skinType, Map<String, SkinColor> map, Map<String, String> map2) {
        this(skinType, map, map2, ByteString.EMPTY);
    }

    public SkinSetting(SkinType skinType, Map<String, SkinColor> map, Map<String, String> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.skin_type = skinType;
        this.colors = Internal.immutableCopyOf("colors", map);
        this.alphas = Internal.immutableCopyOf("alphas", map2);
    }
}
