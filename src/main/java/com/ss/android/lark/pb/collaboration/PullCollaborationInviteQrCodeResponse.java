package com.ss.android.lark.pb.collaboration;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.dynamic_resource.ImageConfiguration;
import com.ss.android.lark.pb.entities.Image;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullCollaborationInviteQrCodeResponse extends Message<PullCollaborationInviteQrCodeResponse, C49606a> {
    public static final ProtoAdapter<PullCollaborationInviteQrCodeResponse> ADAPTER = new C49607b();
    public static final Long DEFAULT_EXPIRED_TIME = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    public final Long mexpired_time;
    public final Integer mstatus;
    public final Image mtenant_avatar;
    public final String mtenant_display_id;
    public final String mtenant_name;
    public final String murl;
    public final List<ImageConfiguration> mview_qr;

    /* renamed from: com.ss.android.lark.pb.collaboration.PullCollaborationInviteQrCodeResponse$b */
    private static final class C49607b extends ProtoAdapter<PullCollaborationInviteQrCodeResponse> {
        C49607b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullCollaborationInviteQrCodeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullCollaborationInviteQrCodeResponse pullCollaborationInviteQrCodeResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (pullCollaborationInviteQrCodeResponse.mstatus != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, pullCollaborationInviteQrCodeResponse.mstatus);
            } else {
                i = 0;
            }
            if (pullCollaborationInviteQrCodeResponse.mtenant_display_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pullCollaborationInviteQrCodeResponse.mtenant_display_id);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (pullCollaborationInviteQrCodeResponse.mtenant_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pullCollaborationInviteQrCodeResponse.mtenant_name);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (pullCollaborationInviteQrCodeResponse.mtenant_avatar != null) {
                i4 = Image.ADAPTER.encodedSizeWithTag(4, pullCollaborationInviteQrCodeResponse.mtenant_avatar);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (pullCollaborationInviteQrCodeResponse.murl != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, pullCollaborationInviteQrCodeResponse.murl);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag = i9 + i5 + ImageConfiguration.ADAPTER.asRepeated().encodedSizeWithTag(6, pullCollaborationInviteQrCodeResponse.mview_qr);
            if (pullCollaborationInviteQrCodeResponse.mexpired_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(7, pullCollaborationInviteQrCodeResponse.mexpired_time);
            }
            return encodedSizeWithTag + i6 + pullCollaborationInviteQrCodeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullCollaborationInviteQrCodeResponse decode(ProtoReader protoReader) throws IOException {
            C49606a aVar = new C49606a();
            aVar.f124232a = 0;
            aVar.f124233b = "";
            aVar.f124234c = "";
            aVar.f124236e = "";
            aVar.f124238g = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124232a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124233b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124234c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124235d = Image.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124236e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124237f.add(ImageConfiguration.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f124238g = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PullCollaborationInviteQrCodeResponse pullCollaborationInviteQrCodeResponse) throws IOException {
            if (pullCollaborationInviteQrCodeResponse.mstatus != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, pullCollaborationInviteQrCodeResponse.mstatus);
            }
            if (pullCollaborationInviteQrCodeResponse.mtenant_display_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullCollaborationInviteQrCodeResponse.mtenant_display_id);
            }
            if (pullCollaborationInviteQrCodeResponse.mtenant_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullCollaborationInviteQrCodeResponse.mtenant_name);
            }
            if (pullCollaborationInviteQrCodeResponse.mtenant_avatar != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 4, pullCollaborationInviteQrCodeResponse.mtenant_avatar);
            }
            if (pullCollaborationInviteQrCodeResponse.murl != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, pullCollaborationInviteQrCodeResponse.murl);
            }
            ImageConfiguration.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, pullCollaborationInviteQrCodeResponse.mview_qr);
            if (pullCollaborationInviteQrCodeResponse.mexpired_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, pullCollaborationInviteQrCodeResponse.mexpired_time);
            }
            protoWriter.writeBytes(pullCollaborationInviteQrCodeResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.collaboration.PullCollaborationInviteQrCodeResponse$a */
    public static final class C49606a extends Message.Builder<PullCollaborationInviteQrCodeResponse, C49606a> {

        /* renamed from: a */
        public Integer f124232a;

        /* renamed from: b */
        public String f124233b;

        /* renamed from: c */
        public String f124234c;

        /* renamed from: d */
        public Image f124235d;

        /* renamed from: e */
        public String f124236e;

        /* renamed from: f */
        public List<ImageConfiguration> f124237f = Internal.newMutableList();

        /* renamed from: g */
        public Long f124238g;

        /* renamed from: a */
        public PullCollaborationInviteQrCodeResponse build() {
            return new PullCollaborationInviteQrCodeResponse(this.f124232a, this.f124233b, this.f124234c, this.f124235d, this.f124236e, this.f124237f, this.f124238g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49606a newBuilder() {
        C49606a aVar = new C49606a();
        aVar.f124232a = this.mstatus;
        aVar.f124233b = this.mtenant_display_id;
        aVar.f124234c = this.mtenant_name;
        aVar.f124235d = this.mtenant_avatar;
        aVar.f124236e = this.murl;
        aVar.f124237f = Internal.copyOf("mview_qr", this.mview_qr);
        aVar.f124238g = this.mexpired_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (this.mtenant_display_id != null) {
            sb.append(", tenant_display_id=");
            sb.append(this.mtenant_display_id);
        }
        if (this.mtenant_name != null) {
            sb.append(", tenant_name=");
            sb.append(this.mtenant_name);
        }
        if (this.mtenant_avatar != null) {
            sb.append(", tenant_avatar=");
            sb.append(this.mtenant_avatar);
        }
        if (this.murl != null) {
            sb.append(", url=");
            sb.append(this.murl);
        }
        if (!this.mview_qr.isEmpty()) {
            sb.append(", view_qr=");
            sb.append(this.mview_qr);
        }
        if (this.mexpired_time != null) {
            sb.append(", expired_time=");
            sb.append(this.mexpired_time);
        }
        StringBuilder replace = sb.replace(0, 2, "PullCollaborationInviteQrCodeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullCollaborationInviteQrCodeResponse(Integer num, String str, String str2, Image image, String str3, List<ImageConfiguration> list, Long l) {
        this(num, str, str2, image, str3, list, l, ByteString.EMPTY);
    }

    public PullCollaborationInviteQrCodeResponse(Integer num, String str, String str2, Image image, String str3, List<ImageConfiguration> list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mstatus = num;
        this.mtenant_display_id = str;
        this.mtenant_name = str2;
        this.mtenant_avatar = image;
        this.murl = str3;
        this.mview_qr = Internal.immutableCopyOf("mview_qr", list);
        this.mexpired_time = l;
    }
}
