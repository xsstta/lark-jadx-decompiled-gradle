package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MsgInfo extends Message<MsgInfo, C50389a> {
    public static final ProtoAdapter<MsgInfo> ADAPTER = new C50390b();
    public static final Integer DEFAULT_EXPIRE = 0;
    public static final Boolean DEFAULT_IS_OVERRIDE = false;
    public static final Boolean DEFAULT_IS_SHOW = false;
    private static final long serialVersionUID = 0;
    public final Alert malert;
    public final Integer mexpire;
    public final Boolean mis_override;
    public final Boolean mis_show;
    public final String mmessage;
    public final I18nKeyInfo mmsg_i18n_key;
    public final I18nKeyInfo mmsg_title_i18n_key;
    public final Popup_Type mpop_up_type;
    public final Type mtype;

    public static final class Alert extends Message<Alert, C50387a> {
        public static final ProtoAdapter<Alert> ADAPTER = new C50388b();
        private static final long serialVersionUID = 0;
        public final Text mbody;
        public final C50382Button mfooter;
        public final C50382Button mfooter2;
        public final Text mtitle;

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

        /* renamed from: com.ss.android.lark.pb.videochat.MsgInfo$Alert$Button */
        public static final class C50382Button extends Message<C50382Button, C50383a> {
            public static final ProtoAdapter<C50382Button> ADAPTER = new C50384b();
            public static final Integer DEFAULT_WAIT_TIME = 0;
            private static final long serialVersionUID = 0;
            public final Button_Color mcolor;
            public final Text mtext;
            public final Integer mwait_time;

            /* renamed from: com.ss.android.lark.pb.videochat.MsgInfo$Alert$Button$b */
            private static final class C50384b extends ProtoAdapter<C50382Button> {
                C50384b() {
                    super(FieldEncoding.LENGTH_DELIMITED, C50382Button.class);
                }

                /* renamed from: a */
                public int encodedSize(C50382Button button) {
                    int i;
                    int i2;
                    int i3 = 0;
                    if (button.mtext != null) {
                        i = Text.ADAPTER.encodedSizeWithTag(1, button.mtext);
                    } else {
                        i = 0;
                    }
                    if (button.mwait_time != null) {
                        i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, button.mwait_time);
                    } else {
                        i2 = 0;
                    }
                    int i4 = i + i2;
                    if (button.mcolor != null) {
                        i3 = Button_Color.ADAPTER.encodedSizeWithTag(3, button.mcolor);
                    }
                    return i4 + i3 + button.unknownFields().size();
                }

                /* renamed from: a */
                public C50382Button decode(ProtoReader protoReader) throws IOException {
                    C50383a aVar = new C50383a();
                    aVar.f125790b = 0;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f125789a = Text.ADAPTER.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f125790b = ProtoAdapter.INT32.decode(protoReader);
                        } else if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                aVar.f125791c = Button_Color.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                            }
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, C50382Button button) throws IOException {
                    if (button.mtext != null) {
                        Text.ADAPTER.encodeWithTag(protoWriter, 1, button.mtext);
                    }
                    if (button.mwait_time != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, button.mwait_time);
                    }
                    if (button.mcolor != null) {
                        Button_Color.ADAPTER.encodeWithTag(protoWriter, 3, button.mcolor);
                    }
                    protoWriter.writeBytes(button.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videochat.MsgInfo$Alert$Button$a */
            public static final class C50383a extends Message.Builder<C50382Button, C50383a> {

                /* renamed from: a */
                public Text f125789a;

                /* renamed from: b */
                public Integer f125790b;

                /* renamed from: c */
                public Button_Color f125791c;

                /* renamed from: a */
                public C50382Button build() {
                    return new C50382Button(this.f125789a, this.f125790b, this.f125791c, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50383a newBuilder() {
                C50383a aVar = new C50383a();
                aVar.f125789a = this.mtext;
                aVar.f125790b = this.mwait_time;
                aVar.f125791c = this.mcolor;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                StringBuilder sb = new StringBuilder();
                if (this.mtext != null) {
                    sb.append(", text=");
                    sb.append(this.mtext);
                }
                if (this.mwait_time != null) {
                    sb.append(", wait_time=");
                    sb.append(this.mwait_time);
                }
                if (this.mcolor != null) {
                    sb.append(", color=");
                    sb.append(this.mcolor);
                }
                StringBuilder replace = sb.replace(0, 2, "Button{");
                replace.append('}');
                return replace.toString();
            }

            public C50382Button(Text text, Integer num, Button_Color button_Color) {
                this(text, num, button_Color, ByteString.EMPTY);
            }

            public C50382Button(Text text, Integer num, Button_Color button_Color, ByteString byteString) {
                super(ADAPTER, byteString);
                this.mtext = text;
                this.mwait_time = num;
                this.mcolor = button_Color;
            }
        }

        public static final class Text extends Message<Text, C50385a> {
            public static final ProtoAdapter<Text> ADAPTER = new C50386b();
            private static final long serialVersionUID = 0;
            public final String mi18n_key;

            /* renamed from: com.ss.android.lark.pb.videochat.MsgInfo$Alert$Text$b */
            private static final class C50386b extends ProtoAdapter<Text> {
                C50386b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Text.class);
                }

                /* renamed from: a */
                public int encodedSize(Text text) {
                    int i;
                    if (text.mi18n_key != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, text.mi18n_key);
                    } else {
                        i = 0;
                    }
                    return i + text.unknownFields().size();
                }

                /* renamed from: a */
                public Text decode(ProtoReader protoReader) throws IOException {
                    C50385a aVar = new C50385a();
                    aVar.f125792a = "";
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
                            aVar.f125792a = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Text text) throws IOException {
                    if (text.mi18n_key != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, text.mi18n_key);
                    }
                    protoWriter.writeBytes(text.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videochat.MsgInfo$Alert$Text$a */
            public static final class C50385a extends Message.Builder<Text, C50385a> {

                /* renamed from: a */
                public String f125792a;

                /* renamed from: a */
                public Text build() {
                    return new Text(this.f125792a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50385a newBuilder() {
                C50385a aVar = new C50385a();
                aVar.f125792a = this.mi18n_key;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                StringBuilder sb = new StringBuilder();
                if (this.mi18n_key != null) {
                    sb.append(", i18n_key=");
                    sb.append(this.mi18n_key);
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
                this.mi18n_key = str;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.MsgInfo$Alert$b */
        private static final class C50388b extends ProtoAdapter<Alert> {
            C50388b() {
                super(FieldEncoding.LENGTH_DELIMITED, Alert.class);
            }

            /* renamed from: a */
            public int encodedSize(Alert alert) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (alert.mtitle != null) {
                    i = Text.ADAPTER.encodedSizeWithTag(1, alert.mtitle);
                } else {
                    i = 0;
                }
                if (alert.mbody != null) {
                    i2 = Text.ADAPTER.encodedSizeWithTag(2, alert.mbody);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (alert.mfooter != null) {
                    i3 = C50382Button.ADAPTER.encodedSizeWithTag(3, alert.mfooter);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (alert.mfooter2 != null) {
                    i4 = C50382Button.ADAPTER.encodedSizeWithTag(4, alert.mfooter2);
                }
                return i6 + i4 + alert.unknownFields().size();
            }

            /* renamed from: a */
            public Alert decode(ProtoReader protoReader) throws IOException {
                C50387a aVar = new C50387a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125793a = Text.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f125794b = Text.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f125795c = C50382Button.ADAPTER.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125796d = C50382Button.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Alert alert) throws IOException {
                if (alert.mtitle != null) {
                    Text.ADAPTER.encodeWithTag(protoWriter, 1, alert.mtitle);
                }
                if (alert.mbody != null) {
                    Text.ADAPTER.encodeWithTag(protoWriter, 2, alert.mbody);
                }
                if (alert.mfooter != null) {
                    C50382Button.ADAPTER.encodeWithTag(protoWriter, 3, alert.mfooter);
                }
                if (alert.mfooter2 != null) {
                    C50382Button.ADAPTER.encodeWithTag(protoWriter, 4, alert.mfooter2);
                }
                protoWriter.writeBytes(alert.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.MsgInfo$Alert$a */
        public static final class C50387a extends Message.Builder<Alert, C50387a> {

            /* renamed from: a */
            public Text f125793a;

            /* renamed from: b */
            public Text f125794b;

            /* renamed from: c */
            public C50382Button f125795c;

            /* renamed from: d */
            public C50382Button f125796d;

            /* renamed from: a */
            public Alert build() {
                return new Alert(this.f125793a, this.f125794b, this.f125795c, this.f125796d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50387a newBuilder() {
            C50387a aVar = new C50387a();
            aVar.f125793a = this.mtitle;
            aVar.f125794b = this.mbody;
            aVar.f125795c = this.mfooter;
            aVar.f125796d = this.mfooter2;
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
            if (this.mbody != null) {
                sb.append(", body=");
                sb.append(this.mbody);
            }
            if (this.mfooter != null) {
                sb.append(", footer=");
                sb.append(this.mfooter);
            }
            if (this.mfooter2 != null) {
                sb.append(", footer2=");
                sb.append(this.mfooter2);
            }
            StringBuilder replace = sb.replace(0, 2, "Alert{");
            replace.append('}');
            return replace.toString();
        }

        public Alert(Text text, Text text2, C50382Button button, C50382Button button2) {
            this(text, text2, button, button2, ByteString.EMPTY);
        }

        public Alert(Text text, Text text2, C50382Button button, C50382Button button2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mtitle = text;
            this.mbody = text2;
            this.mfooter = button;
            this.mfooter2 = button2;
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

    /* renamed from: com.ss.android.lark.pb.videochat.MsgInfo$b */
    private static final class C50390b extends ProtoAdapter<MsgInfo> {
        C50390b() {
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
            if (msgInfo.mtype != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, msgInfo.mtype);
            } else {
                i = 0;
            }
            if (msgInfo.mexpire != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, msgInfo.mexpire);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (msgInfo.mmessage != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, msgInfo.mmessage);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (msgInfo.mis_show != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, msgInfo.mis_show);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (msgInfo.mis_override != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, msgInfo.mis_override);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (msgInfo.mmsg_i18n_key != null) {
                i6 = I18nKeyInfo.ADAPTER.encodedSizeWithTag(6, msgInfo.mmsg_i18n_key);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (msgInfo.mmsg_title_i18n_key != null) {
                i7 = I18nKeyInfo.ADAPTER.encodedSizeWithTag(7, msgInfo.mmsg_title_i18n_key);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (msgInfo.mpop_up_type != null) {
                i8 = Popup_Type.ADAPTER.encodedSizeWithTag(8, msgInfo.mpop_up_type);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (msgInfo.malert != null) {
                i9 = Alert.ADAPTER.encodedSizeWithTag(9, msgInfo.malert);
            }
            return i16 + i9 + msgInfo.unknownFields().size();
        }

        /* renamed from: a */
        public MsgInfo decode(ProtoReader protoReader) throws IOException {
            C50389a aVar = new C50389a();
            aVar.f125798b = 0;
            aVar.f125799c = "";
            aVar.f125800d = false;
            aVar.f125801e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f125797a = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f125798b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125799c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125800d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125801e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125802f = I18nKeyInfo.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125803g = I18nKeyInfo.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f125804h = Popup_Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f125805i = Alert.ADAPTER.decode(protoReader);
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
            if (msgInfo.mtype != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, msgInfo.mtype);
            }
            if (msgInfo.mexpire != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, msgInfo.mexpire);
            }
            if (msgInfo.mmessage != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, msgInfo.mmessage);
            }
            if (msgInfo.mis_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, msgInfo.mis_show);
            }
            if (msgInfo.mis_override != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, msgInfo.mis_override);
            }
            if (msgInfo.mmsg_i18n_key != null) {
                I18nKeyInfo.ADAPTER.encodeWithTag(protoWriter, 6, msgInfo.mmsg_i18n_key);
            }
            if (msgInfo.mmsg_title_i18n_key != null) {
                I18nKeyInfo.ADAPTER.encodeWithTag(protoWriter, 7, msgInfo.mmsg_title_i18n_key);
            }
            if (msgInfo.mpop_up_type != null) {
                Popup_Type.ADAPTER.encodeWithTag(protoWriter, 8, msgInfo.mpop_up_type);
            }
            if (msgInfo.malert != null) {
                Alert.ADAPTER.encodeWithTag(protoWriter, 9, msgInfo.malert);
            }
            protoWriter.writeBytes(msgInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.MsgInfo$a */
    public static final class C50389a extends Message.Builder<MsgInfo, C50389a> {

        /* renamed from: a */
        public Type f125797a;

        /* renamed from: b */
        public Integer f125798b;

        /* renamed from: c */
        public String f125799c;

        /* renamed from: d */
        public Boolean f125800d;

        /* renamed from: e */
        public Boolean f125801e;

        /* renamed from: f */
        public I18nKeyInfo f125802f;

        /* renamed from: g */
        public I18nKeyInfo f125803g;

        /* renamed from: h */
        public Popup_Type f125804h;

        /* renamed from: i */
        public Alert f125805i;

        /* renamed from: a */
        public MsgInfo build() {
            return new MsgInfo(this.f125797a, this.f125798b, this.f125799c, this.f125800d, this.f125801e, this.f125802f, this.f125803g, this.f125804h, this.f125805i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50389a newBuilder() {
        C50389a aVar = new C50389a();
        aVar.f125797a = this.mtype;
        aVar.f125798b = this.mexpire;
        aVar.f125799c = this.mmessage;
        aVar.f125800d = this.mis_show;
        aVar.f125801e = this.mis_override;
        aVar.f125802f = this.mmsg_i18n_key;
        aVar.f125803g = this.mmsg_title_i18n_key;
        aVar.f125804h = this.mpop_up_type;
        aVar.f125805i = this.malert;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mexpire != null) {
            sb.append(", expire=");
            sb.append(this.mexpire);
        }
        if (this.mmessage != null) {
            sb.append(", message=");
            sb.append(this.mmessage);
        }
        if (this.mis_show != null) {
            sb.append(", is_show=");
            sb.append(this.mis_show);
        }
        if (this.mis_override != null) {
            sb.append(", is_override=");
            sb.append(this.mis_override);
        }
        if (this.mmsg_i18n_key != null) {
            sb.append(", msg_i18n_key=");
            sb.append(this.mmsg_i18n_key);
        }
        if (this.mmsg_title_i18n_key != null) {
            sb.append(", msg_title_i18n_key=");
            sb.append(this.mmsg_title_i18n_key);
        }
        if (this.mpop_up_type != null) {
            sb.append(", pop_up_type=");
            sb.append(this.mpop_up_type);
        }
        if (this.malert != null) {
            sb.append(", alert=");
            sb.append(this.malert);
        }
        StringBuilder replace = sb.replace(0, 2, "MsgInfo{");
        replace.append('}');
        return replace.toString();
    }

    public MsgInfo(Type type, Integer num, String str, Boolean bool, Boolean bool2, I18nKeyInfo i18nKeyInfo, I18nKeyInfo i18nKeyInfo2, Popup_Type popup_Type, Alert alert) {
        this(type, num, str, bool, bool2, i18nKeyInfo, i18nKeyInfo2, popup_Type, alert, ByteString.EMPTY);
    }

    public MsgInfo(Type type, Integer num, String str, Boolean bool, Boolean bool2, I18nKeyInfo i18nKeyInfo, I18nKeyInfo i18nKeyInfo2, Popup_Type popup_Type, Alert alert, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = type;
        this.mexpire = num;
        this.mmessage = str;
        this.mis_show = bool;
        this.mis_override = bool2;
        this.mmsg_i18n_key = i18nKeyInfo;
        this.mmsg_title_i18n_key = i18nKeyInfo2;
        this.mpop_up_type = popup_Type;
        this.malert = alert;
    }
}
