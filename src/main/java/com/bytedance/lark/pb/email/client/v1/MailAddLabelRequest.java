package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailAddLabelRequest extends Message<MailAddLabelRequest, C16632a> {
    public static final ProtoAdapter<MailAddLabelRequest> ADAPTER = new C16633b();
    public static final Boolean DEFAULT_SHOW_IN_LABEL_LIST = true;
    private static final long serialVersionUID = 0;
    public final String bg_color;
    public final String font_color;
    public final String label_name;
    public final String parent_id;
    public final Boolean show_in_label_list;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddLabelRequest$b */
    private static final class C16633b extends ProtoAdapter<MailAddLabelRequest> {
        C16633b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailAddLabelRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailAddLabelRequest mailAddLabelRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (mailAddLabelRequest.label_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailAddLabelRequest.label_name);
            } else {
                i = 0;
            }
            if (mailAddLabelRequest.bg_color != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailAddLabelRequest.bg_color);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (mailAddLabelRequest.font_color != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailAddLabelRequest.font_color);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (mailAddLabelRequest.show_in_label_list != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, mailAddLabelRequest.show_in_label_list);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (mailAddLabelRequest.parent_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, mailAddLabelRequest.parent_id);
            }
            return i8 + i5 + mailAddLabelRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailAddLabelRequest decode(ProtoReader protoReader) throws IOException {
            C16632a aVar = new C16632a();
            aVar.f43067a = "";
            aVar.f43068b = "";
            aVar.f43069c = "";
            aVar.f43070d = true;
            aVar.f43071e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43067a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43068b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43069c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f43070d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43071e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailAddLabelRequest mailAddLabelRequest) throws IOException {
            if (mailAddLabelRequest.label_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailAddLabelRequest.label_name);
            }
            if (mailAddLabelRequest.bg_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailAddLabelRequest.bg_color);
            }
            if (mailAddLabelRequest.font_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailAddLabelRequest.font_color);
            }
            if (mailAddLabelRequest.show_in_label_list != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, mailAddLabelRequest.show_in_label_list);
            }
            if (mailAddLabelRequest.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, mailAddLabelRequest.parent_id);
            }
            protoWriter.writeBytes(mailAddLabelRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddLabelRequest$a */
    public static final class C16632a extends Message.Builder<MailAddLabelRequest, C16632a> {

        /* renamed from: a */
        public String f43067a;

        /* renamed from: b */
        public String f43068b;

        /* renamed from: c */
        public String f43069c;

        /* renamed from: d */
        public Boolean f43070d;

        /* renamed from: e */
        public String f43071e;

        /* renamed from: a */
        public MailAddLabelRequest build() {
            return new MailAddLabelRequest(this.f43067a, this.f43068b, this.f43069c, this.f43070d, this.f43071e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16632a newBuilder() {
        C16632a aVar = new C16632a();
        aVar.f43067a = this.label_name;
        aVar.f43068b = this.bg_color;
        aVar.f43069c = this.font_color;
        aVar.f43070d = this.show_in_label_list;
        aVar.f43071e = this.parent_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailAddLabelRequest");
        StringBuilder sb = new StringBuilder();
        if (this.label_name != null) {
            sb.append(", label_name=");
            sb.append(this.label_name);
        }
        if (this.bg_color != null) {
            sb.append(", bg_color=");
            sb.append(this.bg_color);
        }
        if (this.font_color != null) {
            sb.append(", font_color=");
            sb.append(this.font_color);
        }
        if (this.show_in_label_list != null) {
            sb.append(", show_in_label_list=");
            sb.append(this.show_in_label_list);
        }
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailAddLabelRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailAddLabelRequest(String str, String str2, String str3, Boolean bool, String str4) {
        this(str, str2, str3, bool, str4, ByteString.EMPTY);
    }

    public MailAddLabelRequest(String str, String str2, String str3, Boolean bool, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_name = str;
        this.bg_color = str2;
        this.font_color = str3;
        this.show_in_label_list = bool;
        this.parent_id = str4;
    }
}
