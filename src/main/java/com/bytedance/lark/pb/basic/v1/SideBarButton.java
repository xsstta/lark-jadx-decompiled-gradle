package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SideBarButton extends Message<SideBarButton, C15284a> {
    public static final ProtoAdapter<SideBarButton> ADAPTER = new C15285b();
    private static final long serialVersionUID = 0;
    public final String i18n_name;
    public final String icon_key;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SideBarButton$b */
    private static final class C15285b extends ProtoAdapter<SideBarButton> {
        C15285b() {
            super(FieldEncoding.LENGTH_DELIMITED, SideBarButton.class);
        }

        /* renamed from: a */
        public int encodedSize(SideBarButton sideBarButton) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sideBarButton.i18n_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, sideBarButton.icon_key) + ProtoAdapter.STRING.encodedSizeWithTag(3, sideBarButton.url) + sideBarButton.unknownFields().size();
        }

        /* renamed from: a */
        public SideBarButton decode(ProtoReader protoReader) throws IOException {
            C15284a aVar = new C15284a();
            aVar.f40485a = "";
            aVar.f40486b = "";
            aVar.f40487c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40485a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40486b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40487c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SideBarButton sideBarButton) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sideBarButton.i18n_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sideBarButton.icon_key);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sideBarButton.url);
            protoWriter.writeBytes(sideBarButton.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15284a newBuilder() {
        C15284a aVar = new C15284a();
        aVar.f40485a = this.i18n_name;
        aVar.f40486b = this.icon_key;
        aVar.f40487c = this.url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SideBarButton$a */
    public static final class C15284a extends Message.Builder<SideBarButton, C15284a> {

        /* renamed from: a */
        public String f40485a;

        /* renamed from: b */
        public String f40486b;

        /* renamed from: c */
        public String f40487c;

        /* renamed from: a */
        public SideBarButton build() {
            String str;
            String str2;
            String str3 = this.f40485a;
            if (str3 != null && (str = this.f40486b) != null && (str2 = this.f40487c) != null) {
                return new SideBarButton(str3, str, str2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "i18n_name", this.f40486b, "icon_key", this.f40487c, "url");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SideBarButton");
        StringBuilder sb = new StringBuilder();
        sb.append(", i18n_name=");
        sb.append(this.i18n_name);
        sb.append(", icon_key=");
        sb.append(this.icon_key);
        sb.append(", url=");
        sb.append(this.url);
        StringBuilder replace = sb.replace(0, 2, "SideBarButton{");
        replace.append('}');
        return replace.toString();
    }

    public SideBarButton(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public SideBarButton(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.i18n_name = str;
        this.icon_key = str2;
        this.url = str3;
    }
}
