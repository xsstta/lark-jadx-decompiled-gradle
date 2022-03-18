package com.bytedance.lark.pb.onboarding.v1;

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
import okio.ByteString;

public final class Element extends Message<Element, C18576a> {
    public static final ProtoAdapter<Element> ADAPTER = new C18577b();
    public static final ElementType DEFAULT_TYPE = ElementType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final ButtonElementData button_element_data;
    public final ConfigElementData config_element_data;
    public final String id;
    public final PictureElementData picture_element_data;
    public final TextElementData text_element_data;
    public final ElementType type;
    public final VideoElementData video_element_data;

    public enum ElementType implements WireEnum {
        UNKNOWN(0),
        TEXT(1),
        PICTURE(2),
        VIDEO(3),
        BUTTON(4),
        CONFIG(5);
        
        public static final ProtoAdapter<ElementType> ADAPTER = ProtoAdapter.newEnumAdapter(ElementType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ElementType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TEXT;
            }
            if (i == 2) {
                return PICTURE;
            }
            if (i == 3) {
                return VIDEO;
            }
            if (i == 4) {
                return BUTTON;
            }
            if (i != 5) {
                return null;
            }
            return CONFIG;
        }

        private ElementType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.Element$b */
    private static final class C18577b extends ProtoAdapter<Element> {
        C18577b() {
            super(FieldEncoding.LENGTH_DELIMITED, Element.class);
        }

        /* renamed from: a */
        public int encodedSize(Element element) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, element.id) + ElementType.ADAPTER.encodedSizeWithTag(2, element.type);
            int i5 = 0;
            if (element.text_element_data != null) {
                i = TextElementData.ADAPTER.encodedSizeWithTag(3, element.text_element_data);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (element.picture_element_data != null) {
                i2 = PictureElementData.ADAPTER.encodedSizeWithTag(4, element.picture_element_data);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (element.video_element_data != null) {
                i3 = VideoElementData.ADAPTER.encodedSizeWithTag(5, element.video_element_data);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (element.button_element_data != null) {
                i4 = ButtonElementData.ADAPTER.encodedSizeWithTag(6, element.button_element_data);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (element.config_element_data != null) {
                i5 = ConfigElementData.ADAPTER.encodedSizeWithTag(7, element.config_element_data);
            }
            return i9 + i5 + element.unknownFields().size();
        }

        /* renamed from: a */
        public Element decode(ProtoReader protoReader) throws IOException {
            C18576a aVar = new C18576a();
            aVar.f46072a = "";
            aVar.f46073b = ElementType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46072a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f46073b = ElementType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.mo64048a(TextElementData.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.mo64047a(PictureElementData.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.mo64049a(VideoElementData.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.mo64044a(ButtonElementData.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.mo64045a(ConfigElementData.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, Element element) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, element.id);
            ElementType.ADAPTER.encodeWithTag(protoWriter, 2, element.type);
            if (element.text_element_data != null) {
                TextElementData.ADAPTER.encodeWithTag(protoWriter, 3, element.text_element_data);
            }
            if (element.picture_element_data != null) {
                PictureElementData.ADAPTER.encodeWithTag(protoWriter, 4, element.picture_element_data);
            }
            if (element.video_element_data != null) {
                VideoElementData.ADAPTER.encodeWithTag(protoWriter, 5, element.video_element_data);
            }
            if (element.button_element_data != null) {
                ButtonElementData.ADAPTER.encodeWithTag(protoWriter, 6, element.button_element_data);
            }
            if (element.config_element_data != null) {
                ConfigElementData.ADAPTER.encodeWithTag(protoWriter, 7, element.config_element_data);
            }
            protoWriter.writeBytes(element.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18576a newBuilder() {
        C18576a aVar = new C18576a();
        aVar.f46072a = this.id;
        aVar.f46073b = this.type;
        aVar.f46074c = this.text_element_data;
        aVar.f46075d = this.picture_element_data;
        aVar.f46076e = this.video_element_data;
        aVar.f46077f = this.button_element_data;
        aVar.f46078g = this.config_element_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "Element");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        if (this.text_element_data != null) {
            sb.append(", text_element_data=");
            sb.append(this.text_element_data);
        }
        if (this.picture_element_data != null) {
            sb.append(", picture_element_data=");
            sb.append(this.picture_element_data);
        }
        if (this.video_element_data != null) {
            sb.append(", video_element_data=");
            sb.append(this.video_element_data);
        }
        if (this.button_element_data != null) {
            sb.append(", button_element_data=");
            sb.append(this.button_element_data);
        }
        if (this.config_element_data != null) {
            sb.append(", config_element_data=");
            sb.append(this.config_element_data);
        }
        StringBuilder replace = sb.replace(0, 2, "Element{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.Element$a */
    public static final class C18576a extends Message.Builder<Element, C18576a> {

        /* renamed from: a */
        public String f46072a;

        /* renamed from: b */
        public ElementType f46073b;

        /* renamed from: c */
        public TextElementData f46074c;

        /* renamed from: d */
        public PictureElementData f46075d;

        /* renamed from: e */
        public VideoElementData f46076e;

        /* renamed from: f */
        public ButtonElementData f46077f;

        /* renamed from: g */
        public ConfigElementData f46078g;

        /* renamed from: a */
        public Element build() {
            ElementType elementType;
            String str = this.f46072a;
            if (str != null && (elementType = this.f46073b) != null) {
                return new Element(str, elementType, this.f46074c, this.f46075d, this.f46076e, this.f46077f, this.f46078g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f46073b, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C18576a mo64046a(ElementType elementType) {
            this.f46073b = elementType;
            return this;
        }

        /* renamed from: a */
        public C18576a mo64050a(String str) {
            this.f46072a = str;
            return this;
        }

        /* renamed from: a */
        public C18576a mo64044a(ButtonElementData buttonElementData) {
            this.f46077f = buttonElementData;
            this.f46074c = null;
            this.f46075d = null;
            this.f46076e = null;
            this.f46078g = null;
            return this;
        }

        /* renamed from: a */
        public C18576a mo64045a(ConfigElementData configElementData) {
            this.f46078g = configElementData;
            this.f46074c = null;
            this.f46075d = null;
            this.f46076e = null;
            this.f46077f = null;
            return this;
        }

        /* renamed from: a */
        public C18576a mo64047a(PictureElementData pictureElementData) {
            this.f46075d = pictureElementData;
            this.f46074c = null;
            this.f46076e = null;
            this.f46077f = null;
            this.f46078g = null;
            return this;
        }

        /* renamed from: a */
        public C18576a mo64048a(TextElementData textElementData) {
            this.f46074c = textElementData;
            this.f46075d = null;
            this.f46076e = null;
            this.f46077f = null;
            this.f46078g = null;
            return this;
        }

        /* renamed from: a */
        public C18576a mo64049a(VideoElementData videoElementData) {
            this.f46076e = videoElementData;
            this.f46074c = null;
            this.f46075d = null;
            this.f46077f = null;
            this.f46078g = null;
            return this;
        }
    }

    public Element(String str, ElementType elementType, TextElementData textElementData, PictureElementData pictureElementData, VideoElementData videoElementData, ButtonElementData buttonElementData, ConfigElementData configElementData) {
        this(str, elementType, textElementData, pictureElementData, videoElementData, buttonElementData, configElementData, ByteString.EMPTY);
    }

    public Element(String str, ElementType elementType, TextElementData textElementData, PictureElementData pictureElementData, VideoElementData videoElementData, ButtonElementData buttonElementData, ConfigElementData configElementData, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(textElementData, pictureElementData, videoElementData, buttonElementData, configElementData) <= 1) {
            this.id = str;
            this.type = elementType;
            this.text_element_data = textElementData;
            this.picture_element_data = pictureElementData;
            this.video_element_data = videoElementData;
            this.button_element_data = buttonElementData;
            this.config_element_data = configElementData;
            return;
        }
        throw new IllegalArgumentException("at most one of text_element_data, picture_element_data, video_element_data, button_element_data, config_element_data may be non-null");
    }
}
