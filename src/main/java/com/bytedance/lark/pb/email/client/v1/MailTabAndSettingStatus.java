package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailTabAndSettingStatus extends Message<MailTabAndSettingStatus, C16912a> {
    public static final ProtoAdapter<MailTabAndSettingStatus> ADAPTER = new C16913b();
    public static final Boolean DEFAULT_SETTING_VISIBLE = false;
    public static final Boolean DEFAULT_TAB_VISIBLE = false;
    private static final long serialVersionUID = 0;
    public final Boolean setting_visible;
    public final Boolean tab_visible;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailTabAndSettingStatus$b */
    private static final class C16913b extends ProtoAdapter<MailTabAndSettingStatus> {
        C16913b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailTabAndSettingStatus.class);
        }

        /* renamed from: a */
        public int encodedSize(MailTabAndSettingStatus mailTabAndSettingStatus) {
            int i;
            int i2 = 0;
            if (mailTabAndSettingStatus.tab_visible != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailTabAndSettingStatus.tab_visible);
            } else {
                i = 0;
            }
            if (mailTabAndSettingStatus.setting_visible != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, mailTabAndSettingStatus.setting_visible);
            }
            return i + i2 + mailTabAndSettingStatus.unknownFields().size();
        }

        /* renamed from: a */
        public MailTabAndSettingStatus decode(ProtoReader protoReader) throws IOException {
            C16912a aVar = new C16912a();
            aVar.f43396a = false;
            aVar.f43397b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43396a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43397b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailTabAndSettingStatus mailTabAndSettingStatus) throws IOException {
            if (mailTabAndSettingStatus.tab_visible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailTabAndSettingStatus.tab_visible);
            }
            if (mailTabAndSettingStatus.setting_visible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailTabAndSettingStatus.setting_visible);
            }
            protoWriter.writeBytes(mailTabAndSettingStatus.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailTabAndSettingStatus$a */
    public static final class C16912a extends Message.Builder<MailTabAndSettingStatus, C16912a> {

        /* renamed from: a */
        public Boolean f43396a;

        /* renamed from: b */
        public Boolean f43397b;

        /* renamed from: a */
        public MailTabAndSettingStatus build() {
            return new MailTabAndSettingStatus(this.f43396a, this.f43397b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16912a newBuilder() {
        C16912a aVar = new C16912a();
        aVar.f43396a = this.tab_visible;
        aVar.f43397b = this.setting_visible;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailTabAndSettingStatus");
        StringBuilder sb = new StringBuilder();
        if (this.tab_visible != null) {
            sb.append(", tab_visible=");
            sb.append(this.tab_visible);
        }
        if (this.setting_visible != null) {
            sb.append(", setting_visible=");
            sb.append(this.setting_visible);
        }
        StringBuilder replace = sb.replace(0, 2, "MailTabAndSettingStatus{");
        replace.append('}');
        return replace.toString();
    }

    public MailTabAndSettingStatus(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public MailTabAndSettingStatus(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tab_visible = bool;
        this.setting_visible = bool2;
    }
}
