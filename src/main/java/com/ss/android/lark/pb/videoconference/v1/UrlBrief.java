package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.FollowInfo;
import java.io.IOException;
import okio.ByteString;

public final class UrlBrief extends Message<UrlBrief, C51144a> {
    public static final ProtoAdapter<UrlBrief> ADAPTER = new C51145b();
    public static final Boolean DEFAULT_IS_DIRTY = false;
    public static final Boolean DEFAULT_OPEN_IN_BROWSER = false;
    public static final FollowInfo.ShareSubType DEFAULT_SUBTYPE = FollowInfo.ShareSubType.UNKNOWN_SHARE_SUBTYPE;
    public static final FollowInfo.ShareType DEFAULT_TYPE = FollowInfo.ShareType.UNKNOWN_SHARE_TYPE;
    private static final long serialVersionUID = 0;
    public final Boolean is_dirty;
    public final Boolean open_in_browser;
    public final FollowInfo.ShareSubType subtype;
    public final ThumbnailDetail thumbnail;
    public final String title;
    public final FollowInfo.ShareType type;
    public final String url;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UrlBrief$b */
    private static final class C51145b extends ProtoAdapter<UrlBrief> {
        C51145b() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlBrief.class);
        }

        /* renamed from: a */
        public int encodedSize(UrlBrief urlBrief) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, urlBrief.url) + ProtoAdapter.BOOL.encodedSizeWithTag(2, urlBrief.is_dirty);
            int i5 = 0;
            if (urlBrief.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, urlBrief.title);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (urlBrief.type != null) {
                i2 = FollowInfo.ShareType.ADAPTER.encodedSizeWithTag(4, urlBrief.type);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (urlBrief.subtype != null) {
                i3 = FollowInfo.ShareSubType.ADAPTER.encodedSizeWithTag(5, urlBrief.subtype);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (urlBrief.thumbnail != null) {
                i4 = ThumbnailDetail.ADAPTER.encodedSizeWithTag(6, urlBrief.thumbnail);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (urlBrief.open_in_browser != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(7, urlBrief.open_in_browser);
            }
            return i9 + i5 + urlBrief.unknownFields().size();
        }

        /* renamed from: a */
        public UrlBrief decode(ProtoReader protoReader) throws IOException {
            C51144a aVar = new C51144a();
            aVar.f127268a = "";
            aVar.f127269b = false;
            aVar.f127270c = "";
            aVar.f127271d = FollowInfo.ShareType.UNKNOWN_SHARE_TYPE;
            aVar.f127272e = FollowInfo.ShareSubType.UNKNOWN_SHARE_SUBTYPE;
            aVar.f127274g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127268a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127269b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127270c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f127271d = FollowInfo.ShareType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f127272e = FollowInfo.ShareSubType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f127273f = ThumbnailDetail.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127274g = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UrlBrief urlBrief) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urlBrief.url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, urlBrief.is_dirty);
            if (urlBrief.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, urlBrief.title);
            }
            if (urlBrief.type != null) {
                FollowInfo.ShareType.ADAPTER.encodeWithTag(protoWriter, 4, urlBrief.type);
            }
            if (urlBrief.subtype != null) {
                FollowInfo.ShareSubType.ADAPTER.encodeWithTag(protoWriter, 5, urlBrief.subtype);
            }
            if (urlBrief.thumbnail != null) {
                ThumbnailDetail.ADAPTER.encodeWithTag(protoWriter, 6, urlBrief.thumbnail);
            }
            if (urlBrief.open_in_browser != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, urlBrief.open_in_browser);
            }
            protoWriter.writeBytes(urlBrief.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UrlBrief$a */
    public static final class C51144a extends Message.Builder<UrlBrief, C51144a> {

        /* renamed from: a */
        public String f127268a;

        /* renamed from: b */
        public Boolean f127269b;

        /* renamed from: c */
        public String f127270c;

        /* renamed from: d */
        public FollowInfo.ShareType f127271d;

        /* renamed from: e */
        public FollowInfo.ShareSubType f127272e;

        /* renamed from: f */
        public ThumbnailDetail f127273f;

        /* renamed from: g */
        public Boolean f127274g;

        /* renamed from: a */
        public UrlBrief build() {
            Boolean bool;
            String str = this.f127268a;
            if (str != null && (bool = this.f127269b) != null) {
                return new UrlBrief(str, bool, this.f127270c, this.f127271d, this.f127272e, this.f127273f, this.f127274g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "url", this.f127269b, "is_dirty");
        }
    }

    @Override // com.squareup.wire.Message
    public C51144a newBuilder() {
        C51144a aVar = new C51144a();
        aVar.f127268a = this.url;
        aVar.f127269b = this.is_dirty;
        aVar.f127270c = this.title;
        aVar.f127271d = this.type;
        aVar.f127272e = this.subtype;
        aVar.f127273f = this.thumbnail;
        aVar.f127274g = this.open_in_browser;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UrlBrief");
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", is_dirty=");
        sb.append(this.is_dirty);
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.subtype != null) {
            sb.append(", subtype=");
            sb.append(this.subtype);
        }
        if (this.thumbnail != null) {
            sb.append(", thumbnail=");
            sb.append(this.thumbnail);
        }
        if (this.open_in_browser != null) {
            sb.append(", open_in_browser=");
            sb.append(this.open_in_browser);
        }
        StringBuilder replace = sb.replace(0, 2, "UrlBrief{");
        replace.append('}');
        return replace.toString();
    }

    public UrlBrief(String str, Boolean bool, String str2, FollowInfo.ShareType shareType, FollowInfo.ShareSubType shareSubType, ThumbnailDetail thumbnailDetail, Boolean bool2) {
        this(str, bool, str2, shareType, shareSubType, thumbnailDetail, bool2, ByteString.EMPTY);
    }

    public UrlBrief(String str, Boolean bool, String str2, FollowInfo.ShareType shareType, FollowInfo.ShareSubType shareSubType, ThumbnailDetail thumbnailDetail, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.is_dirty = bool;
        this.title = str2;
        this.type = shareType;
        this.subtype = shareSubType;
        this.thumbnail = thumbnailDetail;
        this.open_in_browser = bool2;
    }
}
