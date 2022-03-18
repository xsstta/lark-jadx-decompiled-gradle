package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.Image;
import java.io.IOException;
import okio.ByteString;

public final class RichLink extends Message<RichLink, C49507a> {
    public static final ProtoAdapter<RichLink> ADAPTER = new C49508b();
    private static final long serialVersionUID = 0;
    public final Image mavatar;
    public final String mchat_applink;
    public final ChatAuthInfo mchat_auth_info;
    public final String mdesc;
    public final HelpDeskAuthInfo mhelpdesk_auth_info;
    public final String mtitle;
    public final String murl;

    /* renamed from: com.ss.android.lark.pb.ai.RichLink$b */
    private static final class C49508b extends ProtoAdapter<RichLink> {
        C49508b() {
            super(FieldEncoding.LENGTH_DELIMITED, RichLink.class);
        }

        /* renamed from: a */
        public int encodedSize(RichLink richLink) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, richLink.mtitle) + ProtoAdapter.STRING.encodedSizeWithTag(2, richLink.murl);
            int i5 = 0;
            if (richLink.mdesc != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, richLink.mdesc);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (richLink.mavatar != null) {
                i2 = Image.ADAPTER.encodedSizeWithTag(4, richLink.mavatar);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (richLink.mchat_applink != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, richLink.mchat_applink);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (richLink.mchat_auth_info != null) {
                i4 = ChatAuthInfo.ADAPTER.encodedSizeWithTag(5, richLink.mchat_auth_info);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (richLink.mhelpdesk_auth_info != null) {
                i5 = HelpDeskAuthInfo.ADAPTER.encodedSizeWithTag(6, richLink.mhelpdesk_auth_info);
            }
            return i9 + i5 + richLink.unknownFields().size();
        }

        /* renamed from: a */
        public RichLink decode(ProtoReader protoReader) throws IOException {
            C49507a aVar = new C49507a();
            aVar.f124104a = "";
            aVar.f124105b = "";
            aVar.f124106c = "";
            aVar.f124108e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124104a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124105b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124106c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124107d = Image.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.mo172687a(ChatAuthInfo.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.mo172688a(HelpDeskAuthInfo.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f124108e = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, RichLink richLink) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, richLink.mtitle);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, richLink.murl);
            if (richLink.mdesc != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, richLink.mdesc);
            }
            if (richLink.mavatar != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 4, richLink.mavatar);
            }
            if (richLink.mchat_applink != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, richLink.mchat_applink);
            }
            if (richLink.mchat_auth_info != null) {
                ChatAuthInfo.ADAPTER.encodeWithTag(protoWriter, 5, richLink.mchat_auth_info);
            }
            if (richLink.mhelpdesk_auth_info != null) {
                HelpDeskAuthInfo.ADAPTER.encodeWithTag(protoWriter, 6, richLink.mhelpdesk_auth_info);
            }
            protoWriter.writeBytes(richLink.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.RichLink$a */
    public static final class C49507a extends Message.Builder<RichLink, C49507a> {

        /* renamed from: a */
        public String f124104a;

        /* renamed from: b */
        public String f124105b;

        /* renamed from: c */
        public String f124106c;

        /* renamed from: d */
        public Image f124107d;

        /* renamed from: e */
        public String f124108e;

        /* renamed from: f */
        public ChatAuthInfo f124109f;

        /* renamed from: g */
        public HelpDeskAuthInfo f124110g;

        /* renamed from: a */
        public RichLink build() {
            String str;
            String str2 = this.f124104a;
            if (str2 != null && (str = this.f124105b) != null) {
                return new RichLink(str2, str, this.f124106c, this.f124107d, this.f124108e, this.f124109f, this.f124110g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "mtitle", this.f124105b, "murl");
        }

        /* renamed from: a */
        public C49507a mo172687a(ChatAuthInfo chatAuthInfo) {
            this.f124109f = chatAuthInfo;
            this.f124110g = null;
            return this;
        }

        /* renamed from: a */
        public C49507a mo172688a(HelpDeskAuthInfo helpDeskAuthInfo) {
            this.f124110g = helpDeskAuthInfo;
            this.f124109f = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49507a newBuilder() {
        C49507a aVar = new C49507a();
        aVar.f124104a = this.mtitle;
        aVar.f124105b = this.murl;
        aVar.f124106c = this.mdesc;
        aVar.f124107d = this.mavatar;
        aVar.f124108e = this.mchat_applink;
        aVar.f124109f = this.mchat_auth_info;
        aVar.f124110g = this.mhelpdesk_auth_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", title=");
        sb.append(this.mtitle);
        sb.append(", url=");
        sb.append(this.murl);
        if (this.mdesc != null) {
            sb.append(", desc=");
            sb.append(this.mdesc);
        }
        if (this.mavatar != null) {
            sb.append(", avatar=");
            sb.append(this.mavatar);
        }
        if (this.mchat_applink != null) {
            sb.append(", chat_applink=");
            sb.append(this.mchat_applink);
        }
        if (this.mchat_auth_info != null) {
            sb.append(", chat_auth_info=");
            sb.append(this.mchat_auth_info);
        }
        if (this.mhelpdesk_auth_info != null) {
            sb.append(", helpdesk_auth_info=");
            sb.append(this.mhelpdesk_auth_info);
        }
        StringBuilder replace = sb.replace(0, 2, "RichLink{");
        replace.append('}');
        return replace.toString();
    }

    public RichLink(String str, String str2, String str3, Image image, String str4, ChatAuthInfo chatAuthInfo, HelpDeskAuthInfo helpDeskAuthInfo) {
        this(str, str2, str3, image, str4, chatAuthInfo, helpDeskAuthInfo, ByteString.EMPTY);
    }

    public RichLink(String str, String str2, String str3, Image image, String str4, ChatAuthInfo chatAuthInfo, HelpDeskAuthInfo helpDeskAuthInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(chatAuthInfo, helpDeskAuthInfo) <= 1) {
            this.mtitle = str;
            this.murl = str2;
            this.mdesc = str3;
            this.mavatar = image;
            this.mchat_applink = str4;
            this.mchat_auth_info = chatAuthInfo;
            this.mhelpdesk_auth_info = helpDeskAuthInfo;
            return;
        }
        throw new IllegalArgumentException("at most one of mchat_auth_info, mhelpdesk_auth_info may be non-null");
    }
}
