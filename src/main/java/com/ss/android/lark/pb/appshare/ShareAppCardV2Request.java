package com.ss.android.lark.pb.appshare;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ShareAppCardV2Request extends Message<ShareAppCardV2Request, C49543a> {
    public static final ProtoAdapter<ShareAppCardV2Request> ADAPTER = new C49544b();
    private static final long serialVersionUID = 0;
    public final ShareApp mapp;
    public final ShareAppPage mapp_page;
    public final ShareH5 mh5;
    public final AppShareType mtype;

    public enum AppShareType implements WireEnum {
        SHARE_UNKNOWN(0),
        SHARE_APP(1),
        SHARE_APP_PAGE(2),
        SHARE_APP_H5(3);
        
        public static final ProtoAdapter<AppShareType> ADAPTER = ProtoAdapter.newEnumAdapter(AppShareType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AppShareType fromValue(int i) {
            if (i == 0) {
                return SHARE_UNKNOWN;
            }
            if (i == 1) {
                return SHARE_APP;
            }
            if (i == 2) {
                return SHARE_APP_PAGE;
            }
            if (i != 3) {
                return null;
            }
            return SHARE_APP_H5;
        }

        private AppShareType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.appshare.ShareAppCardV2Request$b */
    private static final class C49544b extends ProtoAdapter<ShareAppCardV2Request> {
        C49544b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareAppCardV2Request.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareAppCardV2Request shareAppCardV2Request) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (shareAppCardV2Request.mtype != null) {
                i = AppShareType.ADAPTER.encodedSizeWithTag(1, shareAppCardV2Request.mtype);
            } else {
                i = 0;
            }
            if (shareAppCardV2Request.mapp != null) {
                i2 = ShareApp.ADAPTER.encodedSizeWithTag(2, shareAppCardV2Request.mapp);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (shareAppCardV2Request.mapp_page != null) {
                i3 = ShareAppPage.ADAPTER.encodedSizeWithTag(3, shareAppCardV2Request.mapp_page);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (shareAppCardV2Request.mh5 != null) {
                i4 = ShareH5.ADAPTER.encodedSizeWithTag(4, shareAppCardV2Request.mh5);
            }
            return i6 + i4 + shareAppCardV2Request.unknownFields().size();
        }

        /* renamed from: a */
        public ShareAppCardV2Request decode(ProtoReader protoReader) throws IOException {
            C49543a aVar = new C49543a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124144a = AppShareType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f124145b = ShareApp.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124146c = ShareAppPage.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124147d = ShareH5.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareAppCardV2Request shareAppCardV2Request) throws IOException {
            if (shareAppCardV2Request.mtype != null) {
                AppShareType.ADAPTER.encodeWithTag(protoWriter, 1, shareAppCardV2Request.mtype);
            }
            if (shareAppCardV2Request.mapp != null) {
                ShareApp.ADAPTER.encodeWithTag(protoWriter, 2, shareAppCardV2Request.mapp);
            }
            if (shareAppCardV2Request.mapp_page != null) {
                ShareAppPage.ADAPTER.encodeWithTag(protoWriter, 3, shareAppCardV2Request.mapp_page);
            }
            if (shareAppCardV2Request.mh5 != null) {
                ShareH5.ADAPTER.encodeWithTag(protoWriter, 4, shareAppCardV2Request.mh5);
            }
            protoWriter.writeBytes(shareAppCardV2Request.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49543a newBuilder() {
        C49543a aVar = new C49543a();
        aVar.f124144a = this.mtype;
        aVar.f124145b = this.mapp;
        aVar.f124146c = this.mapp_page;
        aVar.f124147d = this.mh5;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.appshare.ShareAppCardV2Request$a */
    public static final class C49543a extends Message.Builder<ShareAppCardV2Request, C49543a> {

        /* renamed from: a */
        public AppShareType f124144a;

        /* renamed from: b */
        public ShareApp f124145b;

        /* renamed from: c */
        public ShareAppPage f124146c;

        /* renamed from: d */
        public ShareH5 f124147d;

        /* renamed from: a */
        public ShareAppCardV2Request build() {
            return new ShareAppCardV2Request(this.f124144a, this.f124145b, this.f124146c, this.f124147d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49543a mo172774a(ShareApp shareApp) {
            this.f124145b = shareApp;
            return this;
        }

        /* renamed from: a */
        public C49543a mo172775a(AppShareType appShareType) {
            this.f124144a = appShareType;
            return this;
        }

        /* renamed from: a */
        public C49543a mo172776a(ShareAppPage shareAppPage) {
            this.f124146c = shareAppPage;
            return this;
        }

        /* renamed from: a */
        public C49543a mo172777a(ShareH5 shareH5) {
            this.f124147d = shareH5;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mapp != null) {
            sb.append(", app=");
            sb.append(this.mapp);
        }
        if (this.mapp_page != null) {
            sb.append(", app_page=");
            sb.append(this.mapp_page);
        }
        if (this.mh5 != null) {
            sb.append(", h5=");
            sb.append(this.mh5);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareAppCardV2Request{");
        replace.append('}');
        return replace.toString();
    }

    public ShareAppCardV2Request(AppShareType appShareType, ShareApp shareApp, ShareAppPage shareAppPage, ShareH5 shareH5) {
        this(appShareType, shareApp, shareAppPage, shareH5, ByteString.EMPTY);
    }

    public ShareAppCardV2Request(AppShareType appShareType, ShareApp shareApp, ShareAppPage shareAppPage, ShareH5 shareH5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = appShareType;
        this.mapp = shareApp;
        this.mapp_page = shareAppPage;
        this.mh5 = shareH5;
    }
}
