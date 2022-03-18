package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BotTipsContent extends Message<BotTipsContent, C14704a> {
    public static final ProtoAdapter<BotTipsContent> ADAPTER = new C14705b();
    private static final long serialVersionUID = 0;
    public final String admin_id;
    public final String i18n_admin_name;
    public final String i18n_msg;

    /* renamed from: com.bytedance.lark.pb.basic.v1.BotTipsContent$b */
    private static final class C14705b extends ProtoAdapter<BotTipsContent> {
        C14705b() {
            super(FieldEncoding.LENGTH_DELIMITED, BotTipsContent.class);
        }

        /* renamed from: a */
        public int encodedSize(BotTipsContent botTipsContent) {
            int i;
            int i2;
            int i3 = 0;
            if (botTipsContent.i18n_msg != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, botTipsContent.i18n_msg);
            } else {
                i = 0;
            }
            if (botTipsContent.admin_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, botTipsContent.admin_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (botTipsContent.i18n_admin_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, botTipsContent.i18n_admin_name);
            }
            return i4 + i3 + botTipsContent.unknownFields().size();
        }

        /* renamed from: a */
        public BotTipsContent decode(ProtoReader protoReader) throws IOException {
            C14704a aVar = new C14704a();
            aVar.f38873a = "";
            aVar.f38874b = "";
            aVar.f38875c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38873a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f38874b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38875c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BotTipsContent botTipsContent) throws IOException {
            if (botTipsContent.i18n_msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, botTipsContent.i18n_msg);
            }
            if (botTipsContent.admin_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, botTipsContent.admin_id);
            }
            if (botTipsContent.i18n_admin_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, botTipsContent.i18n_admin_name);
            }
            protoWriter.writeBytes(botTipsContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.BotTipsContent$a */
    public static final class C14704a extends Message.Builder<BotTipsContent, C14704a> {

        /* renamed from: a */
        public String f38873a;

        /* renamed from: b */
        public String f38874b;

        /* renamed from: c */
        public String f38875c;

        /* renamed from: a */
        public BotTipsContent build() {
            return new BotTipsContent(this.f38873a, this.f38874b, this.f38875c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14704a newBuilder() {
        C14704a aVar = new C14704a();
        aVar.f38873a = this.i18n_msg;
        aVar.f38874b = this.admin_id;
        aVar.f38875c = this.i18n_admin_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "BotTipsContent");
        StringBuilder sb = new StringBuilder();
        if (this.i18n_msg != null) {
            sb.append(", i18n_msg=");
            sb.append(this.i18n_msg);
        }
        if (this.admin_id != null) {
            sb.append(", admin_id=");
            sb.append(this.admin_id);
        }
        if (this.i18n_admin_name != null) {
            sb.append(", i18n_admin_name=");
            sb.append(this.i18n_admin_name);
        }
        StringBuilder replace = sb.replace(0, 2, "BotTipsContent{");
        replace.append('}');
        return replace.toString();
    }

    public BotTipsContent(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public BotTipsContent(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.i18n_msg = str;
        this.admin_id = str2;
        this.i18n_admin_name = str3;
    }
}
