package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class CardContent extends Message<CardContent, C14744a> {
    public static final ProtoAdapter<CardContent> ADAPTER = new C14745b();
    public static final Integer DEFAULT_CARD_VERSION = 0;
    public static final Boolean DEFAULT_COMPACT_WIDTH = false;
    public static final Boolean DEFAULT_ENABLE_FORWARD = false;
    public static final ExtraType DEFAULT_EXTRA = ExtraType.UNKNOWN;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN_TYPE;
    public static final Boolean DEFAULT_WIDE_SCREEN_MODE = false;
    private static final long serialVersionUID = 0;
    public final Map<String, CardAction> actions;
    public final CardHeader card_header;
    public final Integer card_version;
    public final Boolean compact_width;
    public final Boolean enable_forward;
    public final ExtraType extra;
    public final ExtraInfo extra_info;
    public final RichText richtext;
    public final Type type;
    public final Boolean wide_screen_mode;

    public enum ExtraType implements WireEnum {
        UNKNOWN(0),
        SENDER_CANNOT_CLICK(1);
        
        public static final ProtoAdapter<ExtraType> ADAPTER = ProtoAdapter.newEnumAdapter(ExtraType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ExtraType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return SENDER_CANNOT_CLICK;
        }

        private ExtraType(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN_TYPE(0),
        VOTE(1),
        TEXT(2),
        VCHAT(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i == 1) {
                return VOTE;
            }
            if (i == 2) {
                return TEXT;
            }
            if (i != 3) {
                return null;
            }
            return VCHAT;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class CustomConfig extends Message<CustomConfig, C14738a> {
        public static final ProtoAdapter<CustomConfig> ADAPTER = new C14739b();
        private static final long serialVersionUID = 0;
        public final String analytics_data;

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardContent$CustomConfig$b */
        private static final class C14739b extends ProtoAdapter<CustomConfig> {
            C14739b() {
                super(FieldEncoding.LENGTH_DELIMITED, CustomConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(CustomConfig customConfig) {
                int i;
                if (customConfig.analytics_data != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, customConfig.analytics_data);
                } else {
                    i = 0;
                }
                return i + customConfig.unknownFields().size();
            }

            /* renamed from: a */
            public CustomConfig decode(ProtoReader protoReader) throws IOException {
                C14738a aVar = new C14738a();
                aVar.f38971a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38971a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CustomConfig customConfig) throws IOException {
                if (customConfig.analytics_data != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customConfig.analytics_data);
                }
                protoWriter.writeBytes(customConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardContent$CustomConfig$a */
        public static final class C14738a extends Message.Builder<CustomConfig, C14738a> {

            /* renamed from: a */
            public String f38971a;

            /* renamed from: a */
            public CustomConfig build() {
                return new CustomConfig(this.f38971a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14738a newBuilder() {
            C14738a aVar = new C14738a();
            aVar.f38971a = this.analytics_data;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "CustomConfig");
            StringBuilder sb = new StringBuilder();
            if (this.analytics_data != null) {
                sb.append(", analytics_data=");
                sb.append(this.analytics_data);
            }
            StringBuilder replace = sb.replace(0, 2, "CustomConfig{");
            replace.append('}');
            return replace.toString();
        }

        public CustomConfig(String str) {
            this(str, ByteString.EMPTY);
        }

        public CustomConfig(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.analytics_data = str;
        }
    }

    public static final class ExtraInfo extends Message<ExtraInfo, C14740a> {
        public static final ProtoAdapter<ExtraInfo> ADAPTER = new C14741b();
        private static final long serialVersionUID = 0;
        public final CustomConfig custom_config;
        public final GadgetConfig gadget_config;

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardContent$ExtraInfo$b */
        private static final class C14741b extends ProtoAdapter<ExtraInfo> {
            C14741b() {
                super(FieldEncoding.LENGTH_DELIMITED, ExtraInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(ExtraInfo extraInfo) {
                int i;
                int i2 = 0;
                if (extraInfo.gadget_config != null) {
                    i = GadgetConfig.ADAPTER.encodedSizeWithTag(1, extraInfo.gadget_config);
                } else {
                    i = 0;
                }
                if (extraInfo.custom_config != null) {
                    i2 = CustomConfig.ADAPTER.encodedSizeWithTag(2, extraInfo.custom_config);
                }
                return i + i2 + extraInfo.unknownFields().size();
            }

            /* renamed from: a */
            public ExtraInfo decode(ProtoReader protoReader) throws IOException {
                C14740a aVar = new C14740a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f38972a = GadgetConfig.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38973b = CustomConfig.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ExtraInfo extraInfo) throws IOException {
                if (extraInfo.gadget_config != null) {
                    GadgetConfig.ADAPTER.encodeWithTag(protoWriter, 1, extraInfo.gadget_config);
                }
                if (extraInfo.custom_config != null) {
                    CustomConfig.ADAPTER.encodeWithTag(protoWriter, 2, extraInfo.custom_config);
                }
                protoWriter.writeBytes(extraInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardContent$ExtraInfo$a */
        public static final class C14740a extends Message.Builder<ExtraInfo, C14740a> {

            /* renamed from: a */
            public GadgetConfig f38972a;

            /* renamed from: b */
            public CustomConfig f38973b;

            /* renamed from: a */
            public ExtraInfo build() {
                return new ExtraInfo(this.f38972a, this.f38973b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14740a newBuilder() {
            C14740a aVar = new C14740a();
            aVar.f38972a = this.gadget_config;
            aVar.f38973b = this.custom_config;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ExtraInfo");
            StringBuilder sb = new StringBuilder();
            if (this.gadget_config != null) {
                sb.append(", gadget_config=");
                sb.append(this.gadget_config);
            }
            if (this.custom_config != null) {
                sb.append(", custom_config=");
                sb.append(this.custom_config);
            }
            StringBuilder replace = sb.replace(0, 2, "ExtraInfo{");
            replace.append('}');
            return replace.toString();
        }

        public ExtraInfo(GadgetConfig gadgetConfig, CustomConfig customConfig) {
            this(gadgetConfig, customConfig, ByteString.EMPTY);
        }

        public ExtraInfo(GadgetConfig gadgetConfig, CustomConfig customConfig, ByteString byteString) {
            super(ADAPTER, byteString);
            this.gadget_config = gadgetConfig;
            this.custom_config = customConfig;
        }
    }

    public static final class GadgetConfig extends Message<GadgetConfig, C14742a> {
        public static final ProtoAdapter<GadgetConfig> ADAPTER = new C14743b();
        public static final Boolean DEFAULT_IS_PRELOAD = false;
        private static final long serialVersionUID = 0;
        public final Boolean is_preload;

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardContent$GadgetConfig$b */
        private static final class C14743b extends ProtoAdapter<GadgetConfig> {
            C14743b() {
                super(FieldEncoding.LENGTH_DELIMITED, GadgetConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(GadgetConfig gadgetConfig) {
                int i;
                if (gadgetConfig.is_preload != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, gadgetConfig.is_preload);
                } else {
                    i = 0;
                }
                return i + gadgetConfig.unknownFields().size();
            }

            /* renamed from: a */
            public GadgetConfig decode(ProtoReader protoReader) throws IOException {
                C14742a aVar = new C14742a();
                aVar.f38974a = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38974a = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, GadgetConfig gadgetConfig) throws IOException {
                if (gadgetConfig.is_preload != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, gadgetConfig.is_preload);
                }
                protoWriter.writeBytes(gadgetConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardContent$GadgetConfig$a */
        public static final class C14742a extends Message.Builder<GadgetConfig, C14742a> {

            /* renamed from: a */
            public Boolean f38974a;

            /* renamed from: a */
            public GadgetConfig build() {
                return new GadgetConfig(this.f38974a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14742a newBuilder() {
            C14742a aVar = new C14742a();
            aVar.f38974a = this.is_preload;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "GadgetConfig");
            StringBuilder sb = new StringBuilder();
            if (this.is_preload != null) {
                sb.append(", is_preload=");
                sb.append(this.is_preload);
            }
            StringBuilder replace = sb.replace(0, 2, "GadgetConfig{");
            replace.append('}');
            return replace.toString();
        }

        public GadgetConfig(Boolean bool) {
            this(bool, ByteString.EMPTY);
        }

        public GadgetConfig(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_preload = bool;
        }
    }

    public static final class CardHeader extends Message<CardHeader, C14736a> {
        public static final ProtoAdapter<CardHeader> ADAPTER = new C14737b();
        private static final long serialVersionUID = 0;
        public final Map<String, String> style;
        public final String theme;
        public final String title;
        public final String title_i18n_key;

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardContent$CardHeader$a */
        public static final class C14736a extends Message.Builder<CardHeader, C14736a> {

            /* renamed from: a */
            public String f38966a;

            /* renamed from: b */
            public String f38967b;

            /* renamed from: c */
            public Map<String, String> f38968c = Internal.newMutableMap();

            /* renamed from: d */
            public String f38969d;

            /* renamed from: a */
            public CardHeader build() {
                return new CardHeader(this.f38966a, this.f38967b, this.f38968c, this.f38969d, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardContent$CardHeader$b */
        private static final class C14737b extends ProtoAdapter<CardHeader> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f38970a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C14737b() {
                super(FieldEncoding.LENGTH_DELIMITED, CardHeader.class);
            }

            /* renamed from: a */
            public int encodedSize(CardHeader cardHeader) {
                int i;
                int i2;
                int i3 = 0;
                if (cardHeader.title != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, cardHeader.title);
                } else {
                    i = 0;
                }
                if (cardHeader.title_i18n_key != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, cardHeader.title_i18n_key);
                } else {
                    i2 = 0;
                }
                int encodedSizeWithTag = i + i2 + this.f38970a.encodedSizeWithTag(3, cardHeader.style);
                if (cardHeader.theme != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, cardHeader.theme);
                }
                return encodedSizeWithTag + i3 + cardHeader.unknownFields().size();
            }

            /* renamed from: a */
            public CardHeader decode(ProtoReader protoReader) throws IOException {
                C14736a aVar = new C14736a();
                aVar.f38966a = "";
                aVar.f38967b = "";
                aVar.f38969d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f38966a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f38967b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f38968c.putAll(this.f38970a.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38969d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CardHeader cardHeader) throws IOException {
                if (cardHeader.title != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cardHeader.title);
                }
                if (cardHeader.title_i18n_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cardHeader.title_i18n_key);
                }
                this.f38970a.encodeWithTag(protoWriter, 3, cardHeader.style);
                if (cardHeader.theme != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, cardHeader.theme);
                }
                protoWriter.writeBytes(cardHeader.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14736a newBuilder() {
            C14736a aVar = new C14736a();
            aVar.f38966a = this.title;
            aVar.f38967b = this.title_i18n_key;
            aVar.f38968c = Internal.copyOf("style", this.style);
            aVar.f38969d = this.theme;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "CardHeader");
            StringBuilder sb = new StringBuilder();
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.title_i18n_key != null) {
                sb.append(", title_i18n_key=");
                sb.append(this.title_i18n_key);
            }
            if (!this.style.isEmpty()) {
                sb.append(", style=");
                sb.append(this.style);
            }
            if (this.theme != null) {
                sb.append(", theme=");
                sb.append(this.theme);
            }
            StringBuilder replace = sb.replace(0, 2, "CardHeader{");
            replace.append('}');
            return replace.toString();
        }

        public CardHeader(String str, String str2, Map<String, String> map, String str3) {
            this(str, str2, map, str3, ByteString.EMPTY);
        }

        public CardHeader(String str, String str2, Map<String, String> map, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.title = str;
            this.title_i18n_key = str2;
            this.style = Internal.immutableCopyOf("style", map);
            this.theme = str3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CardContent$b */
    private static final class C14745b extends ProtoAdapter<CardContent> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, CardAction>> f38985a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CardAction.ADAPTER);

        C14745b() {
            super(FieldEncoding.LENGTH_DELIMITED, CardContent.class);
        }

        /* renamed from: a */
        public int encodedSize(CardContent cardContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, cardContent.type) + RichText.ADAPTER.encodedSizeWithTag(2, cardContent.richtext) + this.f38985a.encodedSizeWithTag(3, cardContent.actions);
            int i7 = 0;
            if (cardContent.extra != null) {
                i = ExtraType.ADAPTER.encodedSizeWithTag(4, cardContent.extra);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (cardContent.card_version != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(5, cardContent.card_version);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (cardContent.card_header != null) {
                i3 = CardHeader.ADAPTER.encodedSizeWithTag(6, cardContent.card_header);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (cardContent.wide_screen_mode != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, cardContent.wide_screen_mode);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (cardContent.extra_info != null) {
                i5 = ExtraInfo.ADAPTER.encodedSizeWithTag(8, cardContent.extra_info);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (cardContent.enable_forward != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(9, cardContent.enable_forward);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (cardContent.compact_width != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(10, cardContent.compact_width);
            }
            return i13 + i7 + cardContent.unknownFields().size();
        }

        /* renamed from: a */
        public CardContent decode(ProtoReader protoReader) throws IOException {
            C14744a aVar = new C14744a();
            aVar.f38975a = Type.UNKNOWN_TYPE;
            aVar.f38978d = ExtraType.UNKNOWN;
            aVar.f38979e = 0;
            aVar.f38981g = false;
            aVar.f38983i = false;
            aVar.f38984j = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f38975a = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f38976b = RichText.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f38977c.putAll(this.f38985a.decode(protoReader));
                            break;
                        case 4:
                            try {
                                aVar.f38978d = ExtraType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            aVar.f38979e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38980f = CardHeader.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f38981g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f38982h = ExtraInfo.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f38983i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f38984j = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CardContent cardContent) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, cardContent.type);
            RichText.ADAPTER.encodeWithTag(protoWriter, 2, cardContent.richtext);
            this.f38985a.encodeWithTag(protoWriter, 3, cardContent.actions);
            if (cardContent.extra != null) {
                ExtraType.ADAPTER.encodeWithTag(protoWriter, 4, cardContent.extra);
            }
            if (cardContent.card_version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, cardContent.card_version);
            }
            if (cardContent.card_header != null) {
                CardHeader.ADAPTER.encodeWithTag(protoWriter, 6, cardContent.card_header);
            }
            if (cardContent.wide_screen_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, cardContent.wide_screen_mode);
            }
            if (cardContent.extra_info != null) {
                ExtraInfo.ADAPTER.encodeWithTag(protoWriter, 8, cardContent.extra_info);
            }
            if (cardContent.enable_forward != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, cardContent.enable_forward);
            }
            if (cardContent.compact_width != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, cardContent.compact_width);
            }
            protoWriter.writeBytes(cardContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CardContent$a */
    public static final class C14744a extends Message.Builder<CardContent, C14744a> {

        /* renamed from: a */
        public Type f38975a;

        /* renamed from: b */
        public RichText f38976b;

        /* renamed from: c */
        public Map<String, CardAction> f38977c = Internal.newMutableMap();

        /* renamed from: d */
        public ExtraType f38978d;

        /* renamed from: e */
        public Integer f38979e;

        /* renamed from: f */
        public CardHeader f38980f;

        /* renamed from: g */
        public Boolean f38981g;

        /* renamed from: h */
        public ExtraInfo f38982h;

        /* renamed from: i */
        public Boolean f38983i;

        /* renamed from: j */
        public Boolean f38984j;

        /* renamed from: a */
        public CardContent build() {
            RichText richText;
            Type type = this.f38975a;
            if (type != null && (richText = this.f38976b) != null) {
                return new CardContent(type, richText, this.f38977c, this.f38978d, this.f38979e, this.f38980f, this.f38981g, this.f38982h, this.f38983i, this.f38984j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f38976b, "richtext");
        }

        /* renamed from: a */
        public C14744a mo54242a(ExtraType extraType) {
            this.f38978d = extraType;
            return this;
        }

        /* renamed from: a */
        public C14744a mo54243a(Type type) {
            this.f38975a = type;
            return this;
        }

        /* renamed from: a */
        public C14744a mo54244a(RichText richText) {
            this.f38976b = richText;
            return this;
        }

        /* renamed from: a */
        public C14744a mo54245a(Map<String, CardAction> map) {
            Internal.checkElementsNotNull(map);
            this.f38977c = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14744a newBuilder() {
        C14744a aVar = new C14744a();
        aVar.f38975a = this.type;
        aVar.f38976b = this.richtext;
        aVar.f38977c = Internal.copyOf("actions", this.actions);
        aVar.f38978d = this.extra;
        aVar.f38979e = this.card_version;
        aVar.f38980f = this.card_header;
        aVar.f38981g = this.wide_screen_mode;
        aVar.f38982h = this.extra_info;
        aVar.f38983i = this.enable_forward;
        aVar.f38984j = this.compact_width;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CardContent");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", richtext=");
        sb.append(this.richtext);
        if (!this.actions.isEmpty()) {
            sb.append(", actions=");
            sb.append(this.actions);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.card_version != null) {
            sb.append(", card_version=");
            sb.append(this.card_version);
        }
        if (this.card_header != null) {
            sb.append(", card_header=");
            sb.append(this.card_header);
        }
        if (this.wide_screen_mode != null) {
            sb.append(", wide_screen_mode=");
            sb.append(this.wide_screen_mode);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.enable_forward != null) {
            sb.append(", enable_forward=");
            sb.append(this.enable_forward);
        }
        if (this.compact_width != null) {
            sb.append(", compact_width=");
            sb.append(this.compact_width);
        }
        StringBuilder replace = sb.replace(0, 2, "CardContent{");
        replace.append('}');
        return replace.toString();
    }

    public CardContent(Type type2, RichText richText, Map<String, CardAction> map, ExtraType extraType, Integer num, CardHeader cardHeader, Boolean bool, ExtraInfo extraInfo, Boolean bool2, Boolean bool3) {
        this(type2, richText, map, extraType, num, cardHeader, bool, extraInfo, bool2, bool3, ByteString.EMPTY);
    }

    public CardContent(Type type2, RichText richText, Map<String, CardAction> map, ExtraType extraType, Integer num, CardHeader cardHeader, Boolean bool, ExtraInfo extraInfo, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.richtext = richText;
        this.actions = Internal.immutableCopyOf("actions", map);
        this.extra = extraType;
        this.card_version = num;
        this.card_header = cardHeader;
        this.wide_screen_mode = bool;
        this.extra_info = extraInfo;
        this.enable_forward = bool2;
        this.compact_width = bool3;
    }
}
