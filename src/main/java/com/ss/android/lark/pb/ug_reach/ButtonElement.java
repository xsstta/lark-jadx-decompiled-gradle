package com.ss.android.lark.pb.ug_reach;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ButtonElement extends Message<ButtonElement, C50116a> {
    public static final ProtoAdapter<ButtonElement> ADAPTER = new C50117b();
    private static final long serialVersionUID = 0;
    public final String mbackground_color;
    public final String mcallback_event_name;
    public final String mlink;
    public final String mname;
    public final String mtext;
    public final String mtext_color;

    /* renamed from: com.ss.android.lark.pb.ug_reach.ButtonElement$b */
    private static final class C50117b extends ProtoAdapter<ButtonElement> {
        C50117b() {
            super(FieldEncoding.LENGTH_DELIMITED, ButtonElement.class);
        }

        /* renamed from: a */
        public int encodedSize(ButtonElement buttonElement) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (buttonElement.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, buttonElement.mname);
            } else {
                i = 0;
            }
            if (buttonElement.mtext != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, buttonElement.mtext);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (buttonElement.mbackground_color != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, buttonElement.mbackground_color);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (buttonElement.mtext_color != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, buttonElement.mtext_color);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (buttonElement.mcallback_event_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, buttonElement.mcallback_event_name);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (buttonElement.mlink != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, buttonElement.mlink);
            }
            return i10 + i6 + buttonElement.unknownFields().size();
        }

        /* renamed from: a */
        public ButtonElement decode(ProtoReader protoReader) throws IOException {
            C50116a aVar = new C50116a();
            aVar.f125266a = "";
            aVar.f125267b = "";
            aVar.f125268c = "";
            aVar.f125269d = "";
            aVar.f125270e = "";
            aVar.f125271f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125266a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125267b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125268c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125269d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125270e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125271f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ButtonElement buttonElement) throws IOException {
            if (buttonElement.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, buttonElement.mname);
            }
            if (buttonElement.mtext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, buttonElement.mtext);
            }
            if (buttonElement.mbackground_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, buttonElement.mbackground_color);
            }
            if (buttonElement.mtext_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, buttonElement.mtext_color);
            }
            if (buttonElement.mcallback_event_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, buttonElement.mcallback_event_name);
            }
            if (buttonElement.mlink != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, buttonElement.mlink);
            }
            protoWriter.writeBytes(buttonElement.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.ButtonElement$a */
    public static final class C50116a extends Message.Builder<ButtonElement, C50116a> {

        /* renamed from: a */
        public String f125266a;

        /* renamed from: b */
        public String f125267b;

        /* renamed from: c */
        public String f125268c;

        /* renamed from: d */
        public String f125269d;

        /* renamed from: e */
        public String f125270e;

        /* renamed from: f */
        public String f125271f;

        /* renamed from: a */
        public ButtonElement build() {
            return new ButtonElement(this.f125266a, this.f125267b, this.f125268c, this.f125269d, this.f125270e, this.f125271f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50116a newBuilder() {
        C50116a aVar = new C50116a();
        aVar.f125266a = this.mname;
        aVar.f125267b = this.mtext;
        aVar.f125268c = this.mbackground_color;
        aVar.f125269d = this.mtext_color;
        aVar.f125270e = this.mcallback_event_name;
        aVar.f125271f = this.mlink;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.mtext != null) {
            sb.append(", text=");
            sb.append(this.mtext);
        }
        if (this.mbackground_color != null) {
            sb.append(", background_color=");
            sb.append(this.mbackground_color);
        }
        if (this.mtext_color != null) {
            sb.append(", text_color=");
            sb.append(this.mtext_color);
        }
        if (this.mcallback_event_name != null) {
            sb.append(", callback_event_name=");
            sb.append(this.mcallback_event_name);
        }
        if (this.mlink != null) {
            sb.append(", link=");
            sb.append(this.mlink);
        }
        StringBuilder replace = sb.replace(0, 2, "ButtonElement{");
        replace.append('}');
        return replace.toString();
    }

    public ButtonElement(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, ByteString.EMPTY);
    }

    public ButtonElement(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mname = str;
        this.mtext = str2;
        this.mbackground_color = str3;
        this.mtext_color = str4;
        this.mcallback_event_name = str5;
        this.mlink = str6;
    }
}
