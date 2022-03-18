package com.ss.android.lark.pb.flow;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetLDRServiceAppLinkResponse extends Message<GetLDRServiceAppLinkResponse, C49758a> {
    public static final ProtoAdapter<GetLDRServiceAppLinkResponse> ADAPTER = new C49759b();
    public static final Boolean DEFAULT_IS_OPEN_ENTRY = false;
    private static final long serialVersionUID = 0;
    public final String mall_members_group_chat_id;
    public final String mapp_link;
    public final String mbutton_report_event_key;
    public final Boolean mis_open_entry;
    public final String mldr_button_text;
    public final String mldr_img_url;
    public final String mldr_sub_title;
    public final String mldr_title;
    public final List<Option> moptions;

    /* renamed from: com.ss.android.lark.pb.flow.GetLDRServiceAppLinkResponse$b */
    private static final class C49759b extends ProtoAdapter<GetLDRServiceAppLinkResponse> {
        C49759b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetLDRServiceAppLinkResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetLDRServiceAppLinkResponse getLDRServiceAppLinkResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, getLDRServiceAppLinkResponse.mis_open_entry);
            int i7 = 0;
            if (getLDRServiceAppLinkResponse.mapp_link != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getLDRServiceAppLinkResponse.mapp_link);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (getLDRServiceAppLinkResponse.mldr_title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getLDRServiceAppLinkResponse.mldr_title);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (getLDRServiceAppLinkResponse.mldr_sub_title != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getLDRServiceAppLinkResponse.mldr_sub_title);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (getLDRServiceAppLinkResponse.mldr_button_text != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, getLDRServiceAppLinkResponse.mldr_button_text);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (getLDRServiceAppLinkResponse.mldr_img_url != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, getLDRServiceAppLinkResponse.mldr_img_url);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (getLDRServiceAppLinkResponse.mbutton_report_event_key != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, getLDRServiceAppLinkResponse.mbutton_report_event_key);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (getLDRServiceAppLinkResponse.mall_members_group_chat_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, getLDRServiceAppLinkResponse.mall_members_group_chat_id);
            }
            return i13 + i7 + Option.ADAPTER.asRepeated().encodedSizeWithTag(9, getLDRServiceAppLinkResponse.moptions) + getLDRServiceAppLinkResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetLDRServiceAppLinkResponse decode(ProtoReader protoReader) throws IOException {
            C49758a aVar = new C49758a();
            aVar.f124629a = false;
            aVar.f124630b = "";
            aVar.f124631c = "";
            aVar.f124632d = "";
            aVar.f124633e = "";
            aVar.f124634f = "";
            aVar.f124635g = "";
            aVar.f124636h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124629a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124630b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124631c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124632d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124633e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124634f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124635g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124636h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124637i.add(Option.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, GetLDRServiceAppLinkResponse getLDRServiceAppLinkResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getLDRServiceAppLinkResponse.mis_open_entry);
            if (getLDRServiceAppLinkResponse.mapp_link != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getLDRServiceAppLinkResponse.mapp_link);
            }
            if (getLDRServiceAppLinkResponse.mldr_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getLDRServiceAppLinkResponse.mldr_title);
            }
            if (getLDRServiceAppLinkResponse.mldr_sub_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getLDRServiceAppLinkResponse.mldr_sub_title);
            }
            if (getLDRServiceAppLinkResponse.mldr_button_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getLDRServiceAppLinkResponse.mldr_button_text);
            }
            if (getLDRServiceAppLinkResponse.mldr_img_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getLDRServiceAppLinkResponse.mldr_img_url);
            }
            if (getLDRServiceAppLinkResponse.mbutton_report_event_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, getLDRServiceAppLinkResponse.mbutton_report_event_key);
            }
            if (getLDRServiceAppLinkResponse.mall_members_group_chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, getLDRServiceAppLinkResponse.mall_members_group_chat_id);
            }
            Option.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, getLDRServiceAppLinkResponse.moptions);
            protoWriter.writeBytes(getLDRServiceAppLinkResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.flow.GetLDRServiceAppLinkResponse$a */
    public static final class C49758a extends Message.Builder<GetLDRServiceAppLinkResponse, C49758a> {

        /* renamed from: a */
        public Boolean f124629a;

        /* renamed from: b */
        public String f124630b;

        /* renamed from: c */
        public String f124631c;

        /* renamed from: d */
        public String f124632d;

        /* renamed from: e */
        public String f124633e;

        /* renamed from: f */
        public String f124634f;

        /* renamed from: g */
        public String f124635g;

        /* renamed from: h */
        public String f124636h;

        /* renamed from: i */
        public List<Option> f124637i = Internal.newMutableList();

        /* renamed from: a */
        public GetLDRServiceAppLinkResponse build() {
            Boolean bool = this.f124629a;
            if (bool != null) {
                return new GetLDRServiceAppLinkResponse(bool, this.f124630b, this.f124631c, this.f124632d, this.f124633e, this.f124634f, this.f124635g, this.f124636h, this.f124637i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "mis_open_entry");
        }
    }

    @Override // com.squareup.wire.Message
    public C49758a newBuilder() {
        C49758a aVar = new C49758a();
        aVar.f124629a = this.mis_open_entry;
        aVar.f124630b = this.mapp_link;
        aVar.f124631c = this.mldr_title;
        aVar.f124632d = this.mldr_sub_title;
        aVar.f124633e = this.mldr_button_text;
        aVar.f124634f = this.mldr_img_url;
        aVar.f124635g = this.mbutton_report_event_key;
        aVar.f124636h = this.mall_members_group_chat_id;
        aVar.f124637i = Internal.copyOf("moptions", this.moptions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", is_open_entry=");
        sb.append(this.mis_open_entry);
        if (this.mapp_link != null) {
            sb.append(", app_link=");
            sb.append(this.mapp_link);
        }
        if (this.mldr_title != null) {
            sb.append(", ldr_title=");
            sb.append(this.mldr_title);
        }
        if (this.mldr_sub_title != null) {
            sb.append(", ldr_sub_title=");
            sb.append(this.mldr_sub_title);
        }
        if (this.mldr_button_text != null) {
            sb.append(", ldr_button_text=");
            sb.append(this.mldr_button_text);
        }
        if (this.mldr_img_url != null) {
            sb.append(", ldr_img_url=");
            sb.append(this.mldr_img_url);
        }
        if (this.mbutton_report_event_key != null) {
            sb.append(", button_report_event_key=");
            sb.append(this.mbutton_report_event_key);
        }
        if (this.mall_members_group_chat_id != null) {
            sb.append(", all_members_group_chat_id=");
            sb.append(this.mall_members_group_chat_id);
        }
        if (!this.moptions.isEmpty()) {
            sb.append(", options=");
            sb.append(this.moptions);
        }
        StringBuilder replace = sb.replace(0, 2, "GetLDRServiceAppLinkResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetLDRServiceAppLinkResponse(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Option> list) {
        this(bool, str, str2, str3, str4, str5, str6, str7, list, ByteString.EMPTY);
    }

    public GetLDRServiceAppLinkResponse(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Option> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mis_open_entry = bool;
        this.mapp_link = str;
        this.mldr_title = str2;
        this.mldr_sub_title = str3;
        this.mldr_button_text = str4;
        this.mldr_img_url = str5;
        this.mbutton_report_event_key = str6;
        this.mall_members_group_chat_id = str7;
        this.moptions = Internal.immutableCopyOf("moptions", list);
    }
}
