package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.IOException;
import okio.ByteString;

public final class TextUrlContent extends Message<TextUrlContent, C15320a> {
    public static final ProtoAdapter<TextUrlContent> ADAPTER = new C15321b();
    public static final Boolean DEFAULT_IS_HIDDEN = false;
    public static final Integer DEFAULT_SEQUENCE_ID = 0;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final ImageSet icon;
    public final Boolean is_hidden;
    public final Integer sequence_id;
    public final String summary;
    public final String text;
    public final String title;
    public final Type type;
    public final String url;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        TEXT(1),
        URL(2);
        
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
                return TEXT;
            }
            if (i != 2) {
                return null;
            }
            return URL;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TextUrlContent$b */
    private static final class C15321b extends ProtoAdapter<TextUrlContent> {
        C15321b() {
            super(FieldEncoding.LENGTH_DELIMITED, TextUrlContent.class);
        }

        /* renamed from: a */
        public int encodedSize(TextUrlContent textUrlContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, textUrlContent.type);
            int i7 = 0;
            if (textUrlContent.text != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(100, textUrlContent.text);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (textUrlContent.sequence_id != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(LocationRequest.PRIORITY_HD_ACCURACY, textUrlContent.sequence_id);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (textUrlContent.url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(201, textUrlContent.url);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (textUrlContent.title != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(202, textUrlContent.title);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (textUrlContent.summary != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(SmEvents.EVENT_HBRESET, textUrlContent.summary);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (textUrlContent.icon != null) {
                i6 = ImageSet.ADAPTER.encodedSizeWithTag(204, textUrlContent.icon);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (textUrlContent.is_hidden != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(SmEvents.EVENT_HB_NOTICE_DISCONNECT, textUrlContent.is_hidden);
            }
            return i13 + i7 + textUrlContent.unknownFields().size();
        }

        /* renamed from: a */
        public TextUrlContent decode(ProtoReader protoReader) throws IOException {
            C15320a aVar = new C15320a();
            aVar.f40542a = Type.UNKNOWN;
            aVar.f40543b = "";
            aVar.f40544c = 0;
            aVar.f40545d = "";
            aVar.f40546e = "";
            aVar.f40547f = "";
            aVar.f40549h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40542a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 100) {
                    switch (nextTag) {
                        case LocationRequest.PRIORITY_HD_ACCURACY /*{ENCODED_INT: 200}*/:
                            aVar.f40544c = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 201:
                            aVar.f40545d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 202:
                            aVar.f40546e = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case SmEvents.EVENT_HBRESET /*{ENCODED_INT: 203}*/:
                            aVar.f40547f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 204:
                            aVar.f40548g = ImageSet.ADAPTER.decode(protoReader);
                            continue;
                        case SmEvents.EVENT_HB_NOTICE_DISCONNECT /*{ENCODED_INT: 205}*/:
                            aVar.f40549h = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f40543b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TextUrlContent textUrlContent) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, textUrlContent.type);
            if (textUrlContent.text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 100, textUrlContent.text);
            }
            if (textUrlContent.sequence_id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, LocationRequest.PRIORITY_HD_ACCURACY, textUrlContent.sequence_id);
            }
            if (textUrlContent.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 201, textUrlContent.url);
            }
            if (textUrlContent.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 202, textUrlContent.title);
            }
            if (textUrlContent.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, SmEvents.EVENT_HBRESET, textUrlContent.summary);
            }
            if (textUrlContent.icon != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 204, textUrlContent.icon);
            }
            if (textUrlContent.is_hidden != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmEvents.EVENT_HB_NOTICE_DISCONNECT, textUrlContent.is_hidden);
            }
            protoWriter.writeBytes(textUrlContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TextUrlContent$a */
    public static final class C15320a extends Message.Builder<TextUrlContent, C15320a> {

        /* renamed from: a */
        public Type f40542a;

        /* renamed from: b */
        public String f40543b;

        /* renamed from: c */
        public Integer f40544c;

        /* renamed from: d */
        public String f40545d;

        /* renamed from: e */
        public String f40546e;

        /* renamed from: f */
        public String f40547f;

        /* renamed from: g */
        public ImageSet f40548g;

        /* renamed from: h */
        public Boolean f40549h;

        /* renamed from: a */
        public TextUrlContent build() {
            Type type = this.f40542a;
            if (type != null) {
                return new TextUrlContent(type, this.f40543b, this.f40544c, this.f40545d, this.f40546e, this.f40547f, this.f40548g, this.f40549h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C15320a newBuilder() {
        C15320a aVar = new C15320a();
        aVar.f40542a = this.type;
        aVar.f40543b = this.text;
        aVar.f40544c = this.sequence_id;
        aVar.f40545d = this.url;
        aVar.f40546e = this.title;
        aVar.f40547f = this.summary;
        aVar.f40548g = this.icon;
        aVar.f40549h = this.is_hidden;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TextUrlContent");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.sequence_id != null) {
            sb.append(", sequence_id=");
            sb.append(this.sequence_id);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.is_hidden != null) {
            sb.append(", is_hidden=");
            sb.append(this.is_hidden);
        }
        StringBuilder replace = sb.replace(0, 2, "TextUrlContent{");
        replace.append('}');
        return replace.toString();
    }

    public TextUrlContent(Type type2, String str, Integer num, String str2, String str3, String str4, ImageSet imageSet, Boolean bool) {
        this(type2, str, num, str2, str3, str4, imageSet, bool, ByteString.EMPTY);
    }

    public TextUrlContent(Type type2, String str, Integer num, String str2, String str3, String str4, ImageSet imageSet, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.text = str;
        this.sequence_id = num;
        this.url = str2;
        this.title = str3;
        this.summary = str4;
        this.icon = imageSet;
        this.is_hidden = bool;
    }
}
