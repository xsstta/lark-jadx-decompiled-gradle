package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.QuasiContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class ShareAppCardRequest extends Message<ShareAppCardRequest, C18055a> {
    public static final ProtoAdapter<ShareAppCardRequest> ADAPTER = new C18056b();
    public static final AppShareType DEFAULT_SHARE_TYPE = AppShareType.UNKNOWN;
    public static final Message.Type DEFAULT_TYPE = Message.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final ShareApp app;
    public final ShareAppPage app_page;
    public final Channel channel;
    public final QuasiContent content;
    public final ShareH5 h5;
    public final String parent_id;
    public final String root_id;
    public final AppShareType share_type;
    public final String thread_id;
    public final Message.Type type;

    public enum AppShareType implements WireEnum {
        UNKNOWN(0),
        APP(1),
        APP_PAGE(2),
        H5(3);
        
        public static final ProtoAdapter<AppShareType> ADAPTER = ProtoAdapter.newEnumAdapter(AppShareType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AppShareType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return APP;
            }
            if (i == 2) {
                return APP_PAGE;
            }
            if (i != 3) {
                return null;
            }
            return H5;
        }

        private AppShareType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareAppCardRequest$b */
    private static final class C18056b extends ProtoAdapter<ShareAppCardRequest> {
        C18056b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareAppCardRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareAppCardRequest shareAppCardRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = Message.Type.ADAPTER.encodedSizeWithTag(1, shareAppCardRequest.type) + QuasiContent.ADAPTER.encodedSizeWithTag(2, shareAppCardRequest.content);
            int i8 = 0;
            if (shareAppCardRequest.root_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, shareAppCardRequest.root_id);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (shareAppCardRequest.parent_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, shareAppCardRequest.parent_id);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (shareAppCardRequest.channel != null) {
                i3 = Channel.ADAPTER.encodedSizeWithTag(5, shareAppCardRequest.channel);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (shareAppCardRequest.thread_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, shareAppCardRequest.thread_id);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (shareAppCardRequest.share_type != null) {
                i5 = AppShareType.ADAPTER.encodedSizeWithTag(8, shareAppCardRequest.share_type);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (shareAppCardRequest.app != null) {
                i6 = ShareApp.ADAPTER.encodedSizeWithTag(9, shareAppCardRequest.app);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (shareAppCardRequest.app_page != null) {
                i7 = ShareAppPage.ADAPTER.encodedSizeWithTag(10, shareAppCardRequest.app_page);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (shareAppCardRequest.h5 != null) {
                i8 = ShareH5.ADAPTER.encodedSizeWithTag(11, shareAppCardRequest.h5);
            }
            return i15 + i8 + shareAppCardRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ShareAppCardRequest decode(ProtoReader protoReader) throws IOException {
            C18055a aVar = new C18055a();
            aVar.f45169a = Message.Type.UNKNOWN;
            aVar.f45171c = "";
            aVar.f45172d = "";
            aVar.f45174f = "";
            aVar.f45175g = AppShareType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f45169a = Message.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f45170b = QuasiContent.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45171c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45172d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45173e = Channel.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45174f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 8:
                            try {
                                aVar.f45175g = AppShareType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f45176h = ShareApp.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f45177i = ShareAppPage.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f45178j = ShareH5.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareAppCardRequest shareAppCardRequest) throws IOException {
            Message.Type.ADAPTER.encodeWithTag(protoWriter, 1, shareAppCardRequest.type);
            QuasiContent.ADAPTER.encodeWithTag(protoWriter, 2, shareAppCardRequest.content);
            if (shareAppCardRequest.root_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareAppCardRequest.root_id);
            }
            if (shareAppCardRequest.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, shareAppCardRequest.parent_id);
            }
            if (shareAppCardRequest.channel != null) {
                Channel.ADAPTER.encodeWithTag(protoWriter, 5, shareAppCardRequest.channel);
            }
            if (shareAppCardRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, shareAppCardRequest.thread_id);
            }
            if (shareAppCardRequest.share_type != null) {
                AppShareType.ADAPTER.encodeWithTag(protoWriter, 8, shareAppCardRequest.share_type);
            }
            if (shareAppCardRequest.app != null) {
                ShareApp.ADAPTER.encodeWithTag(protoWriter, 9, shareAppCardRequest.app);
            }
            if (shareAppCardRequest.app_page != null) {
                ShareAppPage.ADAPTER.encodeWithTag(protoWriter, 10, shareAppCardRequest.app_page);
            }
            if (shareAppCardRequest.h5 != null) {
                ShareH5.ADAPTER.encodeWithTag(protoWriter, 11, shareAppCardRequest.h5);
            }
            protoWriter.writeBytes(shareAppCardRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18055a newBuilder() {
        C18055a aVar = new C18055a();
        aVar.f45169a = this.type;
        aVar.f45170b = this.content;
        aVar.f45171c = this.root_id;
        aVar.f45172d = this.parent_id;
        aVar.f45173e = this.channel;
        aVar.f45174f = this.thread_id;
        aVar.f45175g = this.share_type;
        aVar.f45176h = this.app;
        aVar.f45177i = this.app_page;
        aVar.f45178j = this.h5;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ShareAppCardRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", content=");
        sb.append(this.content);
        if (this.root_id != null) {
            sb.append(", root_id=");
            sb.append(this.root_id);
        }
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.share_type != null) {
            sb.append(", share_type=");
            sb.append(this.share_type);
        }
        if (this.app != null) {
            sb.append(", app=");
            sb.append(this.app);
        }
        if (this.app_page != null) {
            sb.append(", app_page=");
            sb.append(this.app_page);
        }
        if (this.h5 != null) {
            sb.append(", h5=");
            sb.append(this.h5);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareAppCardRequest{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareAppCardRequest$a */
    public static final class C18055a extends Message.Builder<ShareAppCardRequest, C18055a> {

        /* renamed from: a */
        public Message.Type f45169a;

        /* renamed from: b */
        public QuasiContent f45170b;

        /* renamed from: c */
        public String f45171c;

        /* renamed from: d */
        public String f45172d;

        /* renamed from: e */
        public Channel f45173e;

        /* renamed from: f */
        public String f45174f;

        /* renamed from: g */
        public AppShareType f45175g;

        /* renamed from: h */
        public ShareApp f45176h;

        /* renamed from: i */
        public ShareAppPage f45177i;

        /* renamed from: j */
        public ShareH5 f45178j;

        /* renamed from: a */
        public ShareAppCardRequest build() {
            QuasiContent quasiContent;
            Message.Type type = this.f45169a;
            if (type != null && (quasiContent = this.f45170b) != null) {
                return new ShareAppCardRequest(type, quasiContent, this.f45171c, this.f45172d, this.f45173e, this.f45174f, this.f45175g, this.f45176h, this.f45177i, this.f45178j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f45170b, "content");
        }

        /* renamed from: a */
        public C18055a mo62685a(Channel channel) {
            this.f45173e = channel;
            return this;
        }

        /* renamed from: a */
        public C18055a mo62686a(Message.Type type) {
            this.f45169a = type;
            return this;
        }

        /* renamed from: a */
        public C18055a mo62687a(QuasiContent quasiContent) {
            this.f45170b = quasiContent;
            return this;
        }

        /* renamed from: a */
        public C18055a mo62688a(ShareApp shareApp) {
            this.f45176h = shareApp;
            return this;
        }

        /* renamed from: a */
        public C18055a mo62689a(AppShareType appShareType) {
            this.f45175g = appShareType;
            return this;
        }

        /* renamed from: a */
        public C18055a mo62690a(ShareAppPage shareAppPage) {
            this.f45177i = shareAppPage;
            return this;
        }

        /* renamed from: a */
        public C18055a mo62691a(ShareH5 shareH5) {
            this.f45178j = shareH5;
            return this;
        }
    }

    public ShareAppCardRequest(Message.Type type2, QuasiContent quasiContent, String str, String str2, Channel channel2, String str3, AppShareType appShareType, ShareApp shareApp, ShareAppPage shareAppPage, ShareH5 shareH5) {
        this(type2, quasiContent, str, str2, channel2, str3, appShareType, shareApp, shareAppPage, shareH5, ByteString.EMPTY);
    }

    public ShareAppCardRequest(Message.Type type2, QuasiContent quasiContent, String str, String str2, Channel channel2, String str3, AppShareType appShareType, ShareApp shareApp, ShareAppPage shareAppPage, ShareH5 shareH5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.content = quasiContent;
        this.root_id = str;
        this.parent_id = str2;
        this.channel = channel2;
        this.thread_id = str3;
        this.share_type = appShareType;
        this.app = shareApp;
        this.app_page = shareAppPage;
        this.h5 = shareH5;
    }
}
