package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.FollowInfo;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import java.io.IOException;
import okio.ByteString;

public final class ShareScreenToRoomRequest extends Message<ShareScreenToRoomRequest, C51050a> {
    public static final ProtoAdapter<ShareScreenToRoomRequest> ADAPTER = new C51051b();
    public static final ShareType DEFAULT_SHARE_TYPE = ShareType.UNKNOWN;
    public static final VideoChatInfo.MeetingSource DEFAULT_SOURCE = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
    private static final long serialVersionUID = 0;
    public final DocShareScreenInfo doc_share_screen_info;
    public final String doc_url;
    public final MagicShareInfo magic_share_info;
    public final String meeting_id;
    public final String meeting_no;
    public final String share_code;
    public final ShareType share_type;
    public final VideoChatInfo.MeetingSource source;

    public enum ShareType implements WireEnum {
        UNKNOWN(0),
        SCREEN(1),
        MAGIC_SHARE(2);
        
        public static final ProtoAdapter<ShareType> ADAPTER = ProtoAdapter.newEnumAdapter(ShareType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ShareType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SCREEN;
            }
            if (i != 2) {
                return null;
            }
            return MAGIC_SHARE;
        }

        private ShareType(int i) {
            this.value = i;
        }
    }

    public static final class DocShareScreenInfo extends Message<DocShareScreenInfo, C51046a> {
        public static final ProtoAdapter<DocShareScreenInfo> ADAPTER = new C51047b();
        private static final long serialVersionUID = 0;
        public final String login_token;
        public final String url;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenToRoomRequest$DocShareScreenInfo$b */
        private static final class C51047b extends ProtoAdapter<DocShareScreenInfo> {
            C51047b() {
                super(FieldEncoding.LENGTH_DELIMITED, DocShareScreenInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(DocShareScreenInfo docShareScreenInfo) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, docShareScreenInfo.url);
                if (docShareScreenInfo.login_token != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, docShareScreenInfo.login_token);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + docShareScreenInfo.unknownFields().size();
            }

            /* renamed from: a */
            public DocShareScreenInfo decode(ProtoReader protoReader) throws IOException {
                C51046a aVar = new C51046a();
                aVar.f127119a = "";
                aVar.f127120b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127119a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127120b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DocShareScreenInfo docShareScreenInfo) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docShareScreenInfo.url);
                if (docShareScreenInfo.login_token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, docShareScreenInfo.login_token);
                }
                protoWriter.writeBytes(docShareScreenInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenToRoomRequest$DocShareScreenInfo$a */
        public static final class C51046a extends Message.Builder<DocShareScreenInfo, C51046a> {

            /* renamed from: a */
            public String f127119a;

            /* renamed from: b */
            public String f127120b;

            /* renamed from: a */
            public DocShareScreenInfo build() {
                String str = this.f127119a;
                if (str != null) {
                    return new DocShareScreenInfo(str, this.f127120b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "url");
            }
        }

        @Override // com.squareup.wire.Message
        public C51046a newBuilder() {
            C51046a aVar = new C51046a();
            aVar.f127119a = this.url;
            aVar.f127120b = this.login_token;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "DocShareScreenInfo");
            StringBuilder sb = new StringBuilder();
            sb.append(", url=");
            sb.append(this.url);
            if (this.login_token != null) {
                sb.append(", login_token=");
                sb.append(this.login_token);
            }
            StringBuilder replace = sb.replace(0, 2, "DocShareScreenInfo{");
            replace.append('}');
            return replace.toString();
        }

        public DocShareScreenInfo(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public DocShareScreenInfo(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.url = str;
            this.login_token = str2;
        }
    }

    public static final class MagicShareInfo extends Message<MagicShareInfo, C51048a> {
        public static final ProtoAdapter<MagicShareInfo> ADAPTER = new C51049b();
        public static final FollowInfo.LifeTime DEFAULT_LIFE_TIME = FollowInfo.LifeTime.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final FollowInfo.LifeTime life_time;
        public final FollowInfo.Options options;
        public final String url;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenToRoomRequest$MagicShareInfo$b */
        private static final class C51049b extends ProtoAdapter<MagicShareInfo> {
            C51049b() {
                super(FieldEncoding.LENGTH_DELIMITED, MagicShareInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(MagicShareInfo magicShareInfo) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, magicShareInfo.url);
                int i2 = 0;
                if (magicShareInfo.options != null) {
                    i = FollowInfo.Options.ADAPTER.encodedSizeWithTag(2, magicShareInfo.options);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (magicShareInfo.life_time != null) {
                    i2 = FollowInfo.LifeTime.ADAPTER.encodedSizeWithTag(3, magicShareInfo.life_time);
                }
                return i3 + i2 + magicShareInfo.unknownFields().size();
            }

            /* renamed from: a */
            public MagicShareInfo decode(ProtoReader protoReader) throws IOException {
                C51048a aVar = new C51048a();
                aVar.f127121a = "";
                aVar.f127123c = FollowInfo.LifeTime.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127121a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f127122b = FollowInfo.Options.ADAPTER.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f127123c = FollowInfo.LifeTime.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MagicShareInfo magicShareInfo) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, magicShareInfo.url);
                if (magicShareInfo.options != null) {
                    FollowInfo.Options.ADAPTER.encodeWithTag(protoWriter, 2, magicShareInfo.options);
                }
                if (magicShareInfo.life_time != null) {
                    FollowInfo.LifeTime.ADAPTER.encodeWithTag(protoWriter, 3, magicShareInfo.life_time);
                }
                protoWriter.writeBytes(magicShareInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51048a newBuilder() {
            C51048a aVar = new C51048a();
            aVar.f127121a = this.url;
            aVar.f127122b = this.options;
            aVar.f127123c = this.life_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenToRoomRequest$MagicShareInfo$a */
        public static final class C51048a extends Message.Builder<MagicShareInfo, C51048a> {

            /* renamed from: a */
            public String f127121a;

            /* renamed from: b */
            public FollowInfo.Options f127122b;

            /* renamed from: c */
            public FollowInfo.LifeTime f127123c;

            /* renamed from: a */
            public MagicShareInfo build() {
                String str = this.f127121a;
                if (str != null) {
                    return new MagicShareInfo(str, this.f127122b, this.f127123c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "url");
            }

            /* renamed from: a */
            public C51048a mo176226a(String str) {
                this.f127121a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "MagicShareInfo");
            StringBuilder sb = new StringBuilder();
            sb.append(", url=");
            sb.append(this.url);
            if (this.options != null) {
                sb.append(", options=");
                sb.append(this.options);
            }
            if (this.life_time != null) {
                sb.append(", life_time=");
                sb.append(this.life_time);
            }
            StringBuilder replace = sb.replace(0, 2, "MagicShareInfo{");
            replace.append('}');
            return replace.toString();
        }

        public MagicShareInfo(String str, FollowInfo.Options options2, FollowInfo.LifeTime lifeTime) {
            this(str, options2, lifeTime, ByteString.EMPTY);
        }

        public MagicShareInfo(String str, FollowInfo.Options options2, FollowInfo.LifeTime lifeTime, ByteString byteString) {
            super(ADAPTER, byteString);
            this.url = str;
            this.options = options2;
            this.life_time = lifeTime;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenToRoomRequest$b */
    private static final class C51051b extends ProtoAdapter<ShareScreenToRoomRequest> {
        C51051b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareScreenToRoomRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareScreenToRoomRequest shareScreenToRoomRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, shareScreenToRoomRequest.share_code);
            int i7 = 0;
            if (shareScreenToRoomRequest.source != null) {
                i = VideoChatInfo.MeetingSource.ADAPTER.encodedSizeWithTag(2, shareScreenToRoomRequest.source);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (shareScreenToRoomRequest.doc_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, shareScreenToRoomRequest.doc_url);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (shareScreenToRoomRequest.doc_share_screen_info != null) {
                i3 = DocShareScreenInfo.ADAPTER.encodedSizeWithTag(4, shareScreenToRoomRequest.doc_share_screen_info);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (shareScreenToRoomRequest.share_type != null) {
                i4 = ShareType.ADAPTER.encodedSizeWithTag(5, shareScreenToRoomRequest.share_type);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (shareScreenToRoomRequest.magic_share_info != null) {
                i5 = MagicShareInfo.ADAPTER.encodedSizeWithTag(6, shareScreenToRoomRequest.magic_share_info);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (shareScreenToRoomRequest.meeting_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, shareScreenToRoomRequest.meeting_id);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (shareScreenToRoomRequest.meeting_no != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, shareScreenToRoomRequest.meeting_no);
            }
            return i13 + i7 + shareScreenToRoomRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ShareScreenToRoomRequest decode(ProtoReader protoReader) throws IOException {
            C51050a aVar = new C51050a();
            aVar.f127124a = "";
            aVar.f127125b = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
            aVar.f127126c = "";
            aVar.f127128e = ShareType.UNKNOWN;
            aVar.f127130g = "";
            aVar.f127131h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127124a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f127125b = VideoChatInfo.MeetingSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f127126c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127127d = DocShareScreenInfo.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f127128e = ShareType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f127129f = MagicShareInfo.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127130g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127131h = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ShareScreenToRoomRequest shareScreenToRoomRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareScreenToRoomRequest.share_code);
            if (shareScreenToRoomRequest.source != null) {
                VideoChatInfo.MeetingSource.ADAPTER.encodeWithTag(protoWriter, 2, shareScreenToRoomRequest.source);
            }
            if (shareScreenToRoomRequest.doc_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareScreenToRoomRequest.doc_url);
            }
            if (shareScreenToRoomRequest.doc_share_screen_info != null) {
                DocShareScreenInfo.ADAPTER.encodeWithTag(protoWriter, 4, shareScreenToRoomRequest.doc_share_screen_info);
            }
            if (shareScreenToRoomRequest.share_type != null) {
                ShareType.ADAPTER.encodeWithTag(protoWriter, 5, shareScreenToRoomRequest.share_type);
            }
            if (shareScreenToRoomRequest.magic_share_info != null) {
                MagicShareInfo.ADAPTER.encodeWithTag(protoWriter, 6, shareScreenToRoomRequest.magic_share_info);
            }
            if (shareScreenToRoomRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, shareScreenToRoomRequest.meeting_id);
            }
            if (shareScreenToRoomRequest.meeting_no != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, shareScreenToRoomRequest.meeting_no);
            }
            protoWriter.writeBytes(shareScreenToRoomRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenToRoomRequest$a */
    public static final class C51050a extends Message.Builder<ShareScreenToRoomRequest, C51050a> {

        /* renamed from: a */
        public String f127124a;

        /* renamed from: b */
        public VideoChatInfo.MeetingSource f127125b;

        /* renamed from: c */
        public String f127126c;

        /* renamed from: d */
        public DocShareScreenInfo f127127d;

        /* renamed from: e */
        public ShareType f127128e;

        /* renamed from: f */
        public MagicShareInfo f127129f;

        /* renamed from: g */
        public String f127130g;

        /* renamed from: h */
        public String f127131h;

        /* renamed from: a */
        public ShareScreenToRoomRequest build() {
            String str = this.f127124a;
            if (str != null) {
                return new ShareScreenToRoomRequest(str, this.f127125b, this.f127126c, this.f127127d, this.f127128e, this.f127129f, this.f127130g, this.f127131h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "share_code");
        }

        /* renamed from: a */
        public C51050a mo176231a(MagicShareInfo magicShareInfo) {
            this.f127129f = magicShareInfo;
            return this;
        }

        /* renamed from: b */
        public C51050a mo176236b(String str) {
            this.f127130g = str;
            return this;
        }

        /* renamed from: c */
        public C51050a mo176237c(String str) {
            this.f127131h = str;
            return this;
        }

        /* renamed from: a */
        public C51050a mo176232a(ShareType shareType) {
            this.f127128e = shareType;
            return this;
        }

        /* renamed from: a */
        public C51050a mo176233a(VideoChatInfo.MeetingSource meetingSource) {
            this.f127125b = meetingSource;
            return this;
        }

        /* renamed from: a */
        public C51050a mo176234a(String str) {
            this.f127124a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51050a newBuilder() {
        C51050a aVar = new C51050a();
        aVar.f127124a = this.share_code;
        aVar.f127125b = this.source;
        aVar.f127126c = this.doc_url;
        aVar.f127127d = this.doc_share_screen_info;
        aVar.f127128e = this.share_type;
        aVar.f127129f = this.magic_share_info;
        aVar.f127130g = this.meeting_id;
        aVar.f127131h = this.meeting_no;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ShareScreenToRoomRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", share_code=");
        sb.append(this.share_code);
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.doc_url != null) {
            sb.append(", doc_url=");
            sb.append(this.doc_url);
        }
        if (this.doc_share_screen_info != null) {
            sb.append(", doc_share_screen_info=");
            sb.append(this.doc_share_screen_info);
        }
        if (this.share_type != null) {
            sb.append(", share_type=");
            sb.append(this.share_type);
        }
        if (this.magic_share_info != null) {
            sb.append(", magic_share_info=");
            sb.append(this.magic_share_info);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.meeting_no != null) {
            sb.append(", meeting_no=");
            sb.append(this.meeting_no);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareScreenToRoomRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ShareScreenToRoomRequest(String str, VideoChatInfo.MeetingSource meetingSource, String str2, DocShareScreenInfo docShareScreenInfo, ShareType shareType, MagicShareInfo magicShareInfo, String str3, String str4) {
        this(str, meetingSource, str2, docShareScreenInfo, shareType, magicShareInfo, str3, str4, ByteString.EMPTY);
    }

    public ShareScreenToRoomRequest(String str, VideoChatInfo.MeetingSource meetingSource, String str2, DocShareScreenInfo docShareScreenInfo, ShareType shareType, MagicShareInfo magicShareInfo, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.share_code = str;
        this.source = meetingSource;
        this.doc_url = str2;
        this.doc_share_screen_info = docShareScreenInfo;
        this.share_type = shareType;
        this.magic_share_info = magicShareInfo;
        this.meeting_id = str3;
        this.meeting_no = str4;
    }
}
