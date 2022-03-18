package com.ss.android.lark.pb.flow;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Option extends Message<Option, C49764a> {
    public static final ProtoAdapter<Option> ADAPTER = new C49765b();
    public static final Integer DEFAULT_VERSION_ID = 0;
    private static final long serialVersionUID = 0;
    public final String mapp_link;
    public final String mchat_id;
    public final String mevent_key;
    public final String mimg_url;
    public final String msub_title;
    public final String mtea_event;
    public final String mtitle;
    public final Integer mversion_id;

    /* renamed from: com.ss.android.lark.pb.flow.Option$b */
    private static final class C49765b extends ProtoAdapter<Option> {
        C49765b() {
            super(FieldEncoding.LENGTH_DELIMITED, Option.class);
        }

        /* renamed from: a */
        public int encodedSize(Option option) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (option.mtitle != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, option.mtitle);
            } else {
                i = 0;
            }
            if (option.msub_title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, option.msub_title);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (option.mimg_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, option.mimg_url);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (option.mevent_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, option.mevent_key);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (option.mapp_link != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, option.mapp_link);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (option.mtea_event != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, option.mtea_event);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (option.mchat_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, option.mchat_id);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (option.mversion_id != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(8, option.mversion_id);
            }
            return i14 + i8 + option.unknownFields().size();
        }

        /* renamed from: a */
        public Option decode(ProtoReader protoReader) throws IOException {
            C49764a aVar = new C49764a();
            aVar.f124644a = "";
            aVar.f124645b = "";
            aVar.f124646c = "";
            aVar.f124647d = "";
            aVar.f124648e = "";
            aVar.f124649f = "";
            aVar.f124650g = "";
            aVar.f124651h = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124644a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124645b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124646c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124647d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124648e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124649f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124650g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124651h = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Option option) throws IOException {
            if (option.mtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, option.mtitle);
            }
            if (option.msub_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, option.msub_title);
            }
            if (option.mimg_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, option.mimg_url);
            }
            if (option.mevent_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, option.mevent_key);
            }
            if (option.mapp_link != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, option.mapp_link);
            }
            if (option.mtea_event != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, option.mtea_event);
            }
            if (option.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, option.mchat_id);
            }
            if (option.mversion_id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, option.mversion_id);
            }
            protoWriter.writeBytes(option.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.flow.Option$a */
    public static final class C49764a extends Message.Builder<Option, C49764a> {

        /* renamed from: a */
        public String f124644a;

        /* renamed from: b */
        public String f124645b;

        /* renamed from: c */
        public String f124646c;

        /* renamed from: d */
        public String f124647d;

        /* renamed from: e */
        public String f124648e;

        /* renamed from: f */
        public String f124649f;

        /* renamed from: g */
        public String f124650g;

        /* renamed from: h */
        public Integer f124651h;

        /* renamed from: a */
        public Option build() {
            return new Option(this.f124644a, this.f124645b, this.f124646c, this.f124647d, this.f124648e, this.f124649f, this.f124650g, this.f124651h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49764a newBuilder() {
        C49764a aVar = new C49764a();
        aVar.f124644a = this.mtitle;
        aVar.f124645b = this.msub_title;
        aVar.f124646c = this.mimg_url;
        aVar.f124647d = this.mevent_key;
        aVar.f124648e = this.mapp_link;
        aVar.f124649f = this.mtea_event;
        aVar.f124650g = this.mchat_id;
        aVar.f124651h = this.mversion_id;
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
        if (this.msub_title != null) {
            sb.append(", sub_title=");
            sb.append(this.msub_title);
        }
        if (this.mimg_url != null) {
            sb.append(", img_url=");
            sb.append(this.mimg_url);
        }
        if (this.mevent_key != null) {
            sb.append(", event_key=");
            sb.append(this.mevent_key);
        }
        if (this.mapp_link != null) {
            sb.append(", app_link=");
            sb.append(this.mapp_link);
        }
        if (this.mtea_event != null) {
            sb.append(", tea_event=");
            sb.append(this.mtea_event);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mversion_id != null) {
            sb.append(", version_id=");
            sb.append(this.mversion_id);
        }
        StringBuilder replace = sb.replace(0, 2, "Option{");
        replace.append('}');
        return replace.toString();
    }

    public Option(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num) {
        this(str, str2, str3, str4, str5, str6, str7, num, ByteString.EMPTY);
    }

    public Option(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtitle = str;
        this.msub_title = str2;
        this.mimg_url = str3;
        this.mevent_key = str4;
        this.mapp_link = str5;
        this.mtea_event = str6;
        this.mchat_id = str7;
        this.mversion_id = num;
    }
}
