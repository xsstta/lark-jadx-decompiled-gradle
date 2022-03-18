package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MsgInfo extends Message<MsgInfo, C50888a> {
    public static final ProtoAdapter<MsgInfo> ADAPTER = new C50889b();
    public static final Integer DEFAULT_EXPIRE = 0;
    public static final Boolean DEFAULT_IS_OVERRIDE = false;
    public static final Boolean DEFAULT_IS_SHOW = false;
    public static final Popup_Type DEFAULT_POP_UP_TYPE = Popup_Type.Popup_UNKNOWN;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Alert alert;
    public final Integer expire;
    public final Boolean is_override;
    public final Boolean is_show;
    public final String message;
    public final I18nKeyInfo msg_i18n_key;
    public final I18nKeyInfo msg_title_i18n_key;
    public final Popup_Type pop_up_type;
    public final Type type;

    public static final class Alert extends Message<Alert, C50886a> {
        public static final ProtoAdapter<Alert> ADAPTER = new C50887b();
        private static final long serialVersionUID = 0;
        public final Text body;
        public final C50881Button footer;
        public final C50881Button footer2;
        public final Text title;

        public enum Button_Color implements WireEnum {
            BLACK(0),
            RED(1),
            BLUE(2),
            GREY(3);
            
            public static final ProtoAdapter<Button_Color> ADAPTER = ProtoAdapter.newEnumAdapter(Button_Color.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Button_Color fromValue(int i) {
                if (i == 0) {
                    return BLACK;
                }
                if (i == 1) {
                    return RED;
                }
                if (i == 2) {
                    return BLUE;
                }
                if (i != 3) {
                    return null;
                }
                return GREY;
            }

            private Button_Color(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MsgInfo$Alert$Button */
        public static final class C50881Button extends Message<C50881Button, C50882a> {
            public static final ProtoAdapter<C50881Button> ADAPTER = new C50883b();
            public static final Button_Color DEFAULT_COLOR = Button_Color.BLACK;
            public static final Integer DEFAULT_WAIT_TIME = 0;
            private static final long serialVersionUID = 0;
            public final Button_Color color;
            public final Text text;
            public final Integer wait_time;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.MsgInfo$Alert$Button$b */
            private static final class C50883b extends ProtoAdapter<C50881Button> {
                C50883b() {
                    super(FieldEncoding.LENGTH_DELIMITED, C50881Button.class);
                }

                /* renamed from: a */
                public int encodedSize(C50881Button button) {
                    int i;
                    int i2;
                    int i3 = 0;
                    if (button.text != null) {
                        i = Text.ADAPTER.encodedSizeWithTag(1, button.text);
                    } else {
                        i = 0;
                    }
                    if (button.wait_time != null) {
                        i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, button.wait_time);
                    } else {
                        i2 = 0;
                    }
                    int i4 = i + i2;
                    if (button.color != null) {
                        i3 = Button_Color.ADAPTER.encodedSizeWithTag(3, button.color);
                    }
                    return i4 + i3 + button.unknownFields().size();
                }

                /* renamed from: a */
                public C50881Button decode(ProtoReader protoReader) throws IOException {
                    C50882a aVar = new C50882a();
                    aVar.f126806b = 0;
                    aVar.f126807c = Button_Color.BLACK;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f126805a = Text.ADAPTER.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f126806b = ProtoAdapter.INT32.decode(protoReader);
                        } else if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                aVar.f126807c = Button_Color.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                            }
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, C50881Button button) throws IOException {
                    if (button.text != null) {
                        Text.ADAPTER.encodeWithTag(protoWriter, 1, button.text);
                    }
                    if (button.wait_time != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, button.wait_time);
                    }
                    if (button.color != null) {
                        Button_Color.ADAPTER.encodeWithTag(protoWriter, 3, button.color);
                    }
                    protoWriter.writeBytes(button.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.MsgInfo$Alert$Button$a */
            public static final class C50882a extends Message.Builder<C50881Button, C50882a> {

                /* renamed from: a */
                public Text f126805a;

                /* renamed from: b */
                public Integer f126806b;

                /* renamed from: c */
                public Button_Color f126807c;

                /* renamed from: a */
                public C50881Button build() {
                    return new C50881Button(this.f126805a, this.f126806b, this.f126807c, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50882a newBuilder() {
                C50882a aVar = new C50882a();
                aVar.f126805a = this.text;
                aVar.f126806b = this.wait_time;
                aVar.f126807c = this.color;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "Button");
                StringBuilder sb = new StringBuilder();
                if (this.text != null) {
                    sb.append(", text=");
                    sb.append(this.text);
                }
                if (this.wait_time != null) {
                    sb.append(", wait_time=");
                    sb.append(this.wait_time);
                }
                if (this.color != null) {
                    sb.append(", color=");
                    sb.append(this.color);
                }
                StringBuilder replace = sb.replace(0, 2, "Button{");
                replace.append('}');
                return replace.toString();
            }

            public C50881Button(Text text2, Integer num, Button_Color button_Color) {
                this(text2, num, button_Color, ByteString.EMPTY);
            }

            public C50881Button(Text text2, Integer num, Button_Color button_Color, ByteString byteString) {
                super(ADAPTER, byteString);
                this.text = text2;
                this.wait_time = num;
                this.color = button_Color;
            }
        }

        public static final class Text extends Message<Text, C50884a> {
            public static final ProtoAdapter<Text> ADAPTER = new C50885b();
            private static final long serialVersionUID = 0;
            public final String i18n_key;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.MsgInfo$Alert$Text$b */
            private static final class C50885b extends ProtoAdapter<Text> {
                C50885b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Text.class);
                }

                /* renamed from: a */
                public int encodedSize(Text text) {
                    int i;
                    if (text.i18n_key != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, text.i18n_key);
                    } else {
                        i = 0;
                    }
                    return i + text.unknownFields().size();
                }

                /* renamed from: a */
                public Text decode(ProtoReader protoReader) throws IOException {
                    C50884a aVar = new C50884a();
                    aVar.f126808a = "";
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
                            aVar.f126808a = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Text text) throws IOException {
                    if (text.i18n_key != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, text.i18n_key);
                    }
                    protoWriter.writeBytes(text.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.MsgInfo$Alert$Text$a */
            public static final class C50884a extends Message.Builder<Text, C50884a> {

                /* renamed from: a */
                public String f126808a;

                /* renamed from: a */
                public Text build() {
                    return new Text(this.f126808a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50884a newBuilder() {
                C50884a aVar = new C50884a();
                aVar.f126808a = this.i18n_key;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "Text");
                StringBuilder sb = new StringBuilder();
                if (this.i18n_key != null) {
                    sb.append(", i18n_key=");
                    sb.append(this.i18n_key);
                }
                StringBuilder replace = sb.replace(0, 2, "Text{");
                replace.append('}');
                return replace.toString();
            }

            public Text(String str) {
                this(str, ByteString.EMPTY);
            }

            public Text(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                this.i18n_key = str;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MsgInfo$Alert$b */
        private static final class C50887b extends ProtoAdapter<Alert> {
            C50887b() {
                super(FieldEncoding.LENGTH_DELIMITED, Alert.class);
            }

            /* renamed from: a */
            public int encodedSize(Alert alert) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (alert.title != null) {
                    i = Text.ADAPTER.encodedSizeWithTag(1, alert.title);
                } else {
                    i = 0;
                }
                if (alert.body != null) {
                    i2 = Text.ADAPTER.encodedSizeWithTag(2, alert.body);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (alert.footer != null) {
                    i3 = C50881Button.ADAPTER.encodedSizeWithTag(3, alert.footer);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (alert.footer2 != null) {
                    i4 = C50881Button.ADAPTER.encodedSizeWithTag(4, alert.footer2);
                }
                return i6 + i4 + alert.unknownFields().size();
            }

            /* renamed from: a */
            public Alert decode(ProtoReader protoReader) throws IOException {
                C50886a aVar = new C50886a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126809a = Text.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126810b = Text.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f126811c = C50881Button.ADAPTER.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126812d = C50881Button.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Alert alert) throws IOException {
                if (alert.title != null) {
                    Text.ADAPTER.encodeWithTag(protoWriter, 1, alert.title);
                }
                if (alert.body != null) {
                    Text.ADAPTER.encodeWithTag(protoWriter, 2, alert.body);
                }
                if (alert.footer != null) {
                    C50881Button.ADAPTER.encodeWithTag(protoWriter, 3, alert.footer);
                }
                if (alert.footer2 != null) {
                    C50881Button.ADAPTER.encodeWithTag(protoWriter, 4, alert.footer2);
                }
                protoWriter.writeBytes(alert.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MsgInfo$Alert$a */
        public static final class C50886a extends Message.Builder<Alert, C50886a> {

            /* renamed from: a */
            public Text f126809a;

            /* renamed from: b */
            public Text f126810b;

            /* renamed from: c */
            public C50881Button f126811c;

            /* renamed from: d */
            public C50881Button f126812d;

            /* renamed from: a */
            public Alert build() {
                return new Alert(this.f126809a, this.f126810b, this.f126811c, this.f126812d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50886a newBuilder() {
            C50886a aVar = new C50886a();
            aVar.f126809a = this.title;
            aVar.f126810b = this.body;
            aVar.f126811c = this.footer;
            aVar.f126812d = this.footer2;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Alert");
            StringBuilder sb = new StringBuilder();
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.body != null) {
                sb.append(", body=");
                sb.append(this.body);
            }
            if (this.footer != null) {
                sb.append(", footer=");
                sb.append(this.footer);
            }
            if (this.footer2 != null) {
                sb.append(", footer2=");
                sb.append(this.footer2);
            }
            StringBuilder replace = sb.replace(0, 2, "Alert{");
            replace.append('}');
            return replace.toString();
        }

        public Alert(Text text, Text text2, C50881Button button, C50881Button button2) {
            this(text, text2, button, button2, ByteString.EMPTY);
        }

        public Alert(Text text, Text text2, C50881Button button, C50881Button button2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.title = text;
            this.body = text2;
            this.footer = button;
            this.footer2 = button2;
        }
    }

    public enum Popup_Type implements WireEnum {
        Popup_UNKNOWN(0),
        Popup_INFO(1),
        Popup_WARNING(2),
        Popup_ERROR(3);
        
        public static final ProtoAdapter<Popup_Type> ADAPTER = ProtoAdapter.newEnumAdapter(Popup_Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Popup_Type fromValue(int i) {
            if (i == 0) {
                return Popup_UNKNOWN;
            }
            if (i == 1) {
                return Popup_INFO;
            }
            if (i == 2) {
                return Popup_WARNING;
            }
            if (i != 3) {
                return null;
            }
            return Popup_ERROR;
        }

        private Popup_Type(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        TIPS(1),
        TOAST(2),
        POPUP(3),
        ALERT(4);
        
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
                return TIPS;
            }
            if (i == 2) {
                return TOAST;
            }
            if (i == 3) {
                return POPUP;
            }
            if (i != 4) {
                return null;
            }
            return ALERT;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MsgInfo$b */
    private static final class C50889b extends ProtoAdapter<MsgInfo> {
        C50889b() {
            super(FieldEncoding.LENGTH_DELIMITED, MsgInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(MsgInfo msgInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (msgInfo.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, msgInfo.type);
            } else {
                i = 0;
            }
            if (msgInfo.expire != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, msgInfo.expire);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (msgInfo.message != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, msgInfo.message);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (msgInfo.is_show != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, msgInfo.is_show);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (msgInfo.is_override != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, msgInfo.is_override);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (msgInfo.msg_i18n_key != null) {
                i6 = I18nKeyInfo.ADAPTER.encodedSizeWithTag(6, msgInfo.msg_i18n_key);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (msgInfo.msg_title_i18n_key != null) {
                i7 = I18nKeyInfo.ADAPTER.encodedSizeWithTag(7, msgInfo.msg_title_i18n_key);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (msgInfo.pop_up_type != null) {
                i8 = Popup_Type.ADAPTER.encodedSizeWithTag(8, msgInfo.pop_up_type);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (msgInfo.alert != null) {
                i9 = Alert.ADAPTER.encodedSizeWithTag(9, msgInfo.alert);
            }
            return i16 + i9 + msgInfo.unknownFields().size();
        }

        /* renamed from: a */
        public MsgInfo decode(ProtoReader protoReader) throws IOException {
            C50888a aVar = new C50888a();
            aVar.f126813a = Type.UNKNOWN;
            aVar.f126814b = 0;
            aVar.f126815c = "";
            aVar.f126816d = false;
            aVar.f126817e = false;
            aVar.f126820h = Popup_Type.Popup_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f126813a = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f126814b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126815c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126816d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126817e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126818f = I18nKeyInfo.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126819g = I18nKeyInfo.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f126820h = Popup_Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f126821i = Alert.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MsgInfo msgInfo) throws IOException {
            if (msgInfo.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, msgInfo.type);
            }
            if (msgInfo.expire != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, msgInfo.expire);
            }
            if (msgInfo.message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, msgInfo.message);
            }
            if (msgInfo.is_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, msgInfo.is_show);
            }
            if (msgInfo.is_override != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, msgInfo.is_override);
            }
            if (msgInfo.msg_i18n_key != null) {
                I18nKeyInfo.ADAPTER.encodeWithTag(protoWriter, 6, msgInfo.msg_i18n_key);
            }
            if (msgInfo.msg_title_i18n_key != null) {
                I18nKeyInfo.ADAPTER.encodeWithTag(protoWriter, 7, msgInfo.msg_title_i18n_key);
            }
            if (msgInfo.pop_up_type != null) {
                Popup_Type.ADAPTER.encodeWithTag(protoWriter, 8, msgInfo.pop_up_type);
            }
            if (msgInfo.alert != null) {
                Alert.ADAPTER.encodeWithTag(protoWriter, 9, msgInfo.alert);
            }
            protoWriter.writeBytes(msgInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MsgInfo$a */
    public static final class C50888a extends Message.Builder<MsgInfo, C50888a> {

        /* renamed from: a */
        public Type f126813a;

        /* renamed from: b */
        public Integer f126814b;

        /* renamed from: c */
        public String f126815c;

        /* renamed from: d */
        public Boolean f126816d;

        /* renamed from: e */
        public Boolean f126817e;

        /* renamed from: f */
        public I18nKeyInfo f126818f;

        /* renamed from: g */
        public I18nKeyInfo f126819g;

        /* renamed from: h */
        public Popup_Type f126820h;

        /* renamed from: i */
        public Alert f126821i;

        /* renamed from: a */
        public MsgInfo build() {
            return new MsgInfo(this.f126813a, this.f126814b, this.f126815c, this.f126816d, this.f126817e, this.f126818f, this.f126819g, this.f126820h, this.f126821i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50888a newBuilder() {
        C50888a aVar = new C50888a();
        aVar.f126813a = this.type;
        aVar.f126814b = this.expire;
        aVar.f126815c = this.message;
        aVar.f126816d = this.is_show;
        aVar.f126817e = this.is_override;
        aVar.f126818f = this.msg_i18n_key;
        aVar.f126819g = this.msg_title_i18n_key;
        aVar.f126820h = this.pop_up_type;
        aVar.f126821i = this.alert;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "MsgInfo");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.expire != null) {
            sb.append(", expire=");
            sb.append(this.expire);
        }
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (this.is_show != null) {
            sb.append(", is_show=");
            sb.append(this.is_show);
        }
        if (this.is_override != null) {
            sb.append(", is_override=");
            sb.append(this.is_override);
        }
        if (this.msg_i18n_key != null) {
            sb.append(", msg_i18n_key=");
            sb.append(this.msg_i18n_key);
        }
        if (this.msg_title_i18n_key != null) {
            sb.append(", msg_title_i18n_key=");
            sb.append(this.msg_title_i18n_key);
        }
        if (this.pop_up_type != null) {
            sb.append(", pop_up_type=");
            sb.append(this.pop_up_type);
        }
        if (this.alert != null) {
            sb.append(", alert=");
            sb.append(this.alert);
        }
        StringBuilder replace = sb.replace(0, 2, "MsgInfo{");
        replace.append('}');
        return replace.toString();
    }

    public MsgInfo(Type type2, Integer num, String str, Boolean bool, Boolean bool2, I18nKeyInfo i18nKeyInfo, I18nKeyInfo i18nKeyInfo2, Popup_Type popup_Type, Alert alert2) {
        this(type2, num, str, bool, bool2, i18nKeyInfo, i18nKeyInfo2, popup_Type, alert2, ByteString.EMPTY);
    }

    public MsgInfo(Type type2, Integer num, String str, Boolean bool, Boolean bool2, I18nKeyInfo i18nKeyInfo, I18nKeyInfo i18nKeyInfo2, Popup_Type popup_Type, Alert alert2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.expire = num;
        this.message = str;
        this.is_show = bool;
        this.is_override = bool2;
        this.msg_i18n_key = i18nKeyInfo;
        this.msg_title_i18n_key = i18nKeyInfo2;
        this.pop_up_type = popup_Type;
        this.alert = alert2;
    }
}
