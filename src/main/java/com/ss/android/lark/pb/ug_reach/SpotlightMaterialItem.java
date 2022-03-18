package com.ss.android.lark.pb.ug_reach;

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

public final class SpotlightMaterialItem extends Message<SpotlightMaterialItem, C50142a> {
    public static final ProtoAdapter<SpotlightMaterialItem> ADAPTER = new C50143b();
    private static final long serialVersionUID = 0;
    public final ContainerConfiguration mcontainer_config;
    public final SpotlightContent mcontent;
    public final String mstep_name;
    public final TargetAnchor mtarget_anchor_config;

    public static final class ContainerConfiguration extends Message<ContainerConfiguration, C50136a> {
        public static final ProtoAdapter<ContainerConfiguration> ADAPTER = new C50137b();
        private static final long serialVersionUID = 0;
        public final String mbackground_color;
        public final String mshadow_color;
        public final ContainerStyle mstyle;

        public enum ContainerStyle implements WireEnum {
            UNKNOWN(0),
            FILL(1),
            STROKE(2);
            
            public static final ProtoAdapter<ContainerStyle> ADAPTER = ProtoAdapter.newEnumAdapter(ContainerStyle.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static ContainerStyle fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return FILL;
                }
                if (i != 2) {
                    return null;
                }
                return STROKE;
            }

            private ContainerStyle(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem$ContainerConfiguration$b */
        private static final class C50137b extends ProtoAdapter<ContainerConfiguration> {
            C50137b() {
                super(FieldEncoding.LENGTH_DELIMITED, ContainerConfiguration.class);
            }

            /* renamed from: a */
            public int encodedSize(ContainerConfiguration containerConfiguration) {
                int i;
                int i2;
                int i3 = 0;
                if (containerConfiguration.mbackground_color != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, containerConfiguration.mbackground_color);
                } else {
                    i = 0;
                }
                if (containerConfiguration.mshadow_color != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, containerConfiguration.mshadow_color);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (containerConfiguration.mstyle != null) {
                    i3 = ContainerStyle.ADAPTER.encodedSizeWithTag(3, containerConfiguration.mstyle);
                }
                return i4 + i3 + containerConfiguration.unknownFields().size();
            }

            /* renamed from: a */
            public ContainerConfiguration decode(ProtoReader protoReader) throws IOException {
                C50136a aVar = new C50136a();
                aVar.f125308a = "";
                aVar.f125309b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125308a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f125309b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f125310c = ContainerStyle.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ContainerConfiguration containerConfiguration) throws IOException {
                if (containerConfiguration.mbackground_color != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, containerConfiguration.mbackground_color);
                }
                if (containerConfiguration.mshadow_color != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, containerConfiguration.mshadow_color);
                }
                if (containerConfiguration.mstyle != null) {
                    ContainerStyle.ADAPTER.encodeWithTag(protoWriter, 3, containerConfiguration.mstyle);
                }
                protoWriter.writeBytes(containerConfiguration.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem$ContainerConfiguration$a */
        public static final class C50136a extends Message.Builder<ContainerConfiguration, C50136a> {

            /* renamed from: a */
            public String f125308a;

            /* renamed from: b */
            public String f125309b;

            /* renamed from: c */
            public ContainerStyle f125310c;

            /* renamed from: a */
            public ContainerConfiguration build() {
                return new ContainerConfiguration(this.f125308a, this.f125309b, this.f125310c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50136a newBuilder() {
            C50136a aVar = new C50136a();
            aVar.f125308a = this.mbackground_color;
            aVar.f125309b = this.mshadow_color;
            aVar.f125310c = this.mstyle;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mbackground_color != null) {
                sb.append(", background_color=");
                sb.append(this.mbackground_color);
            }
            if (this.mshadow_color != null) {
                sb.append(", shadow_color=");
                sb.append(this.mshadow_color);
            }
            if (this.mstyle != null) {
                sb.append(", style=");
                sb.append(this.mstyle);
            }
            StringBuilder replace = sb.replace(0, 2, "ContainerConfiguration{");
            replace.append('}');
            return replace.toString();
        }

        public ContainerConfiguration(String str, String str2, ContainerStyle containerStyle) {
            this(str, str2, containerStyle, ByteString.EMPTY);
        }

        public ContainerConfiguration(String str, String str2, ContainerStyle containerStyle, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mbackground_color = str;
            this.mshadow_color = str2;
            this.mstyle = containerStyle;
        }
    }

    public static final class TargetAnchor extends Message<TargetAnchor, C50140a> {
        public static final ProtoAdapter<TargetAnchor> ADAPTER = new C50141b();
        public static final Double DEFAULT_OFFSET = Double.valueOf(0.0d);
        private static final long serialVersionUID = 0;
        public final ArrowDirection marrow_direction;
        public final Double moffset;
        public final TargetRectType mtarget_rect_type;

        public enum TargetRectType implements WireEnum {
            UNKNOWN(0),
            RECTANGLE(1),
            CIRCLE(2);
            
            public static final ProtoAdapter<TargetRectType> ADAPTER = ProtoAdapter.newEnumAdapter(TargetRectType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static TargetRectType fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return RECTANGLE;
                }
                if (i != 2) {
                    return null;
                }
                return CIRCLE;
            }

            private TargetRectType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem$TargetAnchor$b */
        private static final class C50141b extends ProtoAdapter<TargetAnchor> {
            C50141b() {
                super(FieldEncoding.LENGTH_DELIMITED, TargetAnchor.class);
            }

            /* renamed from: a */
            public int encodedSize(TargetAnchor targetAnchor) {
                int i;
                int i2;
                int i3 = 0;
                if (targetAnchor.moffset != null) {
                    i = ProtoAdapter.DOUBLE.encodedSizeWithTag(1, targetAnchor.moffset);
                } else {
                    i = 0;
                }
                if (targetAnchor.marrow_direction != null) {
                    i2 = ArrowDirection.ADAPTER.encodedSizeWithTag(2, targetAnchor.marrow_direction);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (targetAnchor.mtarget_rect_type != null) {
                    i3 = TargetRectType.ADAPTER.encodedSizeWithTag(3, targetAnchor.mtarget_rect_type);
                }
                return i4 + i3 + targetAnchor.unknownFields().size();
            }

            /* renamed from: a */
            public TargetAnchor decode(ProtoReader protoReader) throws IOException {
                C50140a aVar = new C50140a();
                aVar.f125315a = Double.valueOf(0.0d);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125315a = ProtoAdapter.DOUBLE.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            aVar.f125316b = ArrowDirection.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f125317c = TargetRectType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TargetAnchor targetAnchor) throws IOException {
                if (targetAnchor.moffset != null) {
                    ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, targetAnchor.moffset);
                }
                if (targetAnchor.marrow_direction != null) {
                    ArrowDirection.ADAPTER.encodeWithTag(protoWriter, 2, targetAnchor.marrow_direction);
                }
                if (targetAnchor.mtarget_rect_type != null) {
                    TargetRectType.ADAPTER.encodeWithTag(protoWriter, 3, targetAnchor.mtarget_rect_type);
                }
                protoWriter.writeBytes(targetAnchor.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem$TargetAnchor$a */
        public static final class C50140a extends Message.Builder<TargetAnchor, C50140a> {

            /* renamed from: a */
            public Double f125315a;

            /* renamed from: b */
            public ArrowDirection f125316b;

            /* renamed from: c */
            public TargetRectType f125317c;

            /* renamed from: a */
            public TargetAnchor build() {
                return new TargetAnchor(this.f125315a, this.f125316b, this.f125317c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50140a newBuilder() {
            C50140a aVar = new C50140a();
            aVar.f125315a = this.moffset;
            aVar.f125316b = this.marrow_direction;
            aVar.f125317c = this.mtarget_rect_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.moffset != null) {
                sb.append(", offset=");
                sb.append(this.moffset);
            }
            if (this.marrow_direction != null) {
                sb.append(", arrow_direction=");
                sb.append(this.marrow_direction);
            }
            if (this.mtarget_rect_type != null) {
                sb.append(", target_rect_type=");
                sb.append(this.mtarget_rect_type);
            }
            StringBuilder replace = sb.replace(0, 2, "TargetAnchor{");
            replace.append('}');
            return replace.toString();
        }

        public TargetAnchor(Double d, ArrowDirection arrowDirection, TargetRectType targetRectType) {
            this(d, arrowDirection, targetRectType, ByteString.EMPTY);
        }

        public TargetAnchor(Double d, ArrowDirection arrowDirection, TargetRectType targetRectType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.moffset = d;
            this.marrow_direction = arrowDirection;
            this.mtarget_rect_type = targetRectType;
        }
    }

    public enum ArrowDirection implements WireEnum {
        UNKNOWN(0),
        LEFT(1),
        UP(2),
        RIGHT(3),
        DOWN(4);
        
        public static final ProtoAdapter<ArrowDirection> ADAPTER = ProtoAdapter.newEnumAdapter(ArrowDirection.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ArrowDirection fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return LEFT;
            }
            if (i == 2) {
                return UP;
            }
            if (i == 3) {
                return RIGHT;
            }
            if (i != 4) {
                return null;
            }
            return DOWN;
        }

        private ArrowDirection(int i) {
            this.value = i;
        }
    }

    public static final class SpotlightContent extends Message<SpotlightContent, C50138a> {
        public static final ProtoAdapter<SpotlightContent> ADAPTER = new C50139b();
        private static final long serialVersionUID = 0;
        public final List<ButtonElement> mbuttons;
        public final TextElement mdescription;
        public final ImageElement mimage;
        public final TextElement mtitle;

        /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem$SpotlightContent$b */
        private static final class C50139b extends ProtoAdapter<SpotlightContent> {
            C50139b() {
                super(FieldEncoding.LENGTH_DELIMITED, SpotlightContent.class);
            }

            /* renamed from: a */
            public int encodedSize(SpotlightContent spotlightContent) {
                int i;
                int i2;
                int i3 = 0;
                if (spotlightContent.mtitle != null) {
                    i = TextElement.ADAPTER.encodedSizeWithTag(1, spotlightContent.mtitle);
                } else {
                    i = 0;
                }
                if (spotlightContent.mdescription != null) {
                    i2 = TextElement.ADAPTER.encodedSizeWithTag(2, spotlightContent.mdescription);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (spotlightContent.mimage != null) {
                    i3 = ImageElement.ADAPTER.encodedSizeWithTag(3, spotlightContent.mimage);
                }
                return i4 + i3 + ButtonElement.ADAPTER.asRepeated().encodedSizeWithTag(4, spotlightContent.mbuttons) + spotlightContent.unknownFields().size();
            }

            /* renamed from: a */
            public SpotlightContent decode(ProtoReader protoReader) throws IOException {
                C50138a aVar = new C50138a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125311a = TextElement.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f125312b = TextElement.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f125313c = ImageElement.ADAPTER.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125314d.add(ButtonElement.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SpotlightContent spotlightContent) throws IOException {
                if (spotlightContent.mtitle != null) {
                    TextElement.ADAPTER.encodeWithTag(protoWriter, 1, spotlightContent.mtitle);
                }
                if (spotlightContent.mdescription != null) {
                    TextElement.ADAPTER.encodeWithTag(protoWriter, 2, spotlightContent.mdescription);
                }
                if (spotlightContent.mimage != null) {
                    ImageElement.ADAPTER.encodeWithTag(protoWriter, 3, spotlightContent.mimage);
                }
                ButtonElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, spotlightContent.mbuttons);
                protoWriter.writeBytes(spotlightContent.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem$SpotlightContent$a */
        public static final class C50138a extends Message.Builder<SpotlightContent, C50138a> {

            /* renamed from: a */
            public TextElement f125311a;

            /* renamed from: b */
            public TextElement f125312b;

            /* renamed from: c */
            public ImageElement f125313c;

            /* renamed from: d */
            public List<ButtonElement> f125314d = Internal.newMutableList();

            /* renamed from: a */
            public SpotlightContent build() {
                return new SpotlightContent(this.f125311a, this.f125312b, this.f125313c, this.f125314d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50138a newBuilder() {
            C50138a aVar = new C50138a();
            aVar.f125311a = this.mtitle;
            aVar.f125312b = this.mdescription;
            aVar.f125313c = this.mimage;
            aVar.f125314d = Internal.copyOf("mbuttons", this.mbuttons);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mtitle != null) {
                sb.append(", title=");
                sb.append(this.mtitle);
            }
            if (this.mdescription != null) {
                sb.append(", description=");
                sb.append(this.mdescription);
            }
            if (this.mimage != null) {
                sb.append(", image=");
                sb.append(this.mimage);
            }
            if (!this.mbuttons.isEmpty()) {
                sb.append(", buttons=");
                sb.append(this.mbuttons);
            }
            StringBuilder replace = sb.replace(0, 2, "SpotlightContent{");
            replace.append('}');
            return replace.toString();
        }

        public SpotlightContent(TextElement textElement, TextElement textElement2, ImageElement imageElement, List<ButtonElement> list) {
            this(textElement, textElement2, imageElement, list, ByteString.EMPTY);
        }

        public SpotlightContent(TextElement textElement, TextElement textElement2, ImageElement imageElement, List<ButtonElement> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mtitle = textElement;
            this.mdescription = textElement2;
            this.mimage = imageElement;
            this.mbuttons = Internal.immutableCopyOf("mbuttons", list);
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem$b */
    private static final class C50143b extends ProtoAdapter<SpotlightMaterialItem> {
        C50143b() {
            super(FieldEncoding.LENGTH_DELIMITED, SpotlightMaterialItem.class);
        }

        /* renamed from: a */
        public int encodedSize(SpotlightMaterialItem spotlightMaterialItem) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (spotlightMaterialItem.mstep_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, spotlightMaterialItem.mstep_name);
            } else {
                i = 0;
            }
            if (spotlightMaterialItem.mcontent != null) {
                i2 = SpotlightContent.ADAPTER.encodedSizeWithTag(2, spotlightMaterialItem.mcontent);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (spotlightMaterialItem.mcontainer_config != null) {
                i3 = ContainerConfiguration.ADAPTER.encodedSizeWithTag(3, spotlightMaterialItem.mcontainer_config);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (spotlightMaterialItem.mtarget_anchor_config != null) {
                i4 = TargetAnchor.ADAPTER.encodedSizeWithTag(4, spotlightMaterialItem.mtarget_anchor_config);
            }
            return i6 + i4 + spotlightMaterialItem.unknownFields().size();
        }

        /* renamed from: a */
        public SpotlightMaterialItem decode(ProtoReader protoReader) throws IOException {
            C50142a aVar = new C50142a();
            aVar.f125318a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125318a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125319b = SpotlightContent.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125320c = ContainerConfiguration.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125321d = TargetAnchor.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SpotlightMaterialItem spotlightMaterialItem) throws IOException {
            if (spotlightMaterialItem.mstep_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, spotlightMaterialItem.mstep_name);
            }
            if (spotlightMaterialItem.mcontent != null) {
                SpotlightContent.ADAPTER.encodeWithTag(protoWriter, 2, spotlightMaterialItem.mcontent);
            }
            if (spotlightMaterialItem.mcontainer_config != null) {
                ContainerConfiguration.ADAPTER.encodeWithTag(protoWriter, 3, spotlightMaterialItem.mcontainer_config);
            }
            if (spotlightMaterialItem.mtarget_anchor_config != null) {
                TargetAnchor.ADAPTER.encodeWithTag(protoWriter, 4, spotlightMaterialItem.mtarget_anchor_config);
            }
            protoWriter.writeBytes(spotlightMaterialItem.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem$a */
    public static final class C50142a extends Message.Builder<SpotlightMaterialItem, C50142a> {

        /* renamed from: a */
        public String f125318a;

        /* renamed from: b */
        public SpotlightContent f125319b;

        /* renamed from: c */
        public ContainerConfiguration f125320c;

        /* renamed from: d */
        public TargetAnchor f125321d;

        /* renamed from: a */
        public SpotlightMaterialItem build() {
            return new SpotlightMaterialItem(this.f125318a, this.f125319b, this.f125320c, this.f125321d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50142a newBuilder() {
        C50142a aVar = new C50142a();
        aVar.f125318a = this.mstep_name;
        aVar.f125319b = this.mcontent;
        aVar.f125320c = this.mcontainer_config;
        aVar.f125321d = this.mtarget_anchor_config;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mstep_name != null) {
            sb.append(", step_name=");
            sb.append(this.mstep_name);
        }
        if (this.mcontent != null) {
            sb.append(", content=");
            sb.append(this.mcontent);
        }
        if (this.mcontainer_config != null) {
            sb.append(", container_config=");
            sb.append(this.mcontainer_config);
        }
        if (this.mtarget_anchor_config != null) {
            sb.append(", target_anchor_config=");
            sb.append(this.mtarget_anchor_config);
        }
        StringBuilder replace = sb.replace(0, 2, "SpotlightMaterialItem{");
        replace.append('}');
        return replace.toString();
    }

    public SpotlightMaterialItem(String str, SpotlightContent spotlightContent, ContainerConfiguration containerConfiguration, TargetAnchor targetAnchor) {
        this(str, spotlightContent, containerConfiguration, targetAnchor, ByteString.EMPTY);
    }

    public SpotlightMaterialItem(String str, SpotlightContent spotlightContent, ContainerConfiguration containerConfiguration, TargetAnchor targetAnchor, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mstep_name = str;
        this.mcontent = spotlightContent;
        this.mcontainer_config = containerConfiguration;
        this.mtarget_anchor_config = targetAnchor;
    }
}
