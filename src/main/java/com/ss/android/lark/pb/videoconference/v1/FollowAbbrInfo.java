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
import java.util.List;
import okio.ByteString;

public final class FollowAbbrInfo extends Message<FollowAbbrInfo, C50557a> {
    public static final ProtoAdapter<FollowAbbrInfo> ADAPTER = new C50558b();
    public static final FollowInfo.ShareSubType DEFAULT_SHARE_SUBTYPE = FollowInfo.ShareSubType.UNKNOWN_SHARE_SUBTYPE;
    private static final long serialVersionUID = 0;
    public final String file_label_url;
    public final String file_title;
    public final String file_token;
    public final List<ByteviewUser> presenters;
    public final String raw_url;
    public final FollowInfo.ShareSubType share_subtype;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowAbbrInfo$b */
    private static final class C50558b extends ProtoAdapter<FollowAbbrInfo> {
        C50558b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowAbbrInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowAbbrInfo followAbbrInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(1, followAbbrInfo.presenters);
            int i5 = 0;
            if (followAbbrInfo.raw_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, followAbbrInfo.raw_url);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (followAbbrInfo.file_title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, followAbbrInfo.file_title);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (followAbbrInfo.file_token != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, followAbbrInfo.file_token);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (followAbbrInfo.share_subtype != null) {
                i4 = FollowInfo.ShareSubType.ADAPTER.encodedSizeWithTag(5, followAbbrInfo.share_subtype);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (followAbbrInfo.file_label_url != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, followAbbrInfo.file_label_url);
            }
            return i9 + i5 + followAbbrInfo.unknownFields().size();
        }

        /* renamed from: a */
        public FollowAbbrInfo decode(ProtoReader protoReader) throws IOException {
            C50557a aVar = new C50557a();
            aVar.f126200b = "";
            aVar.f126201c = "";
            aVar.f126202d = "";
            aVar.f126203e = FollowInfo.ShareSubType.UNKNOWN_SHARE_SUBTYPE;
            aVar.f126204f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126199a.add(ByteviewUser.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            aVar.f126200b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126201c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126202d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f126203e = FollowInfo.ShareSubType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f126204f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, FollowAbbrInfo followAbbrInfo) throws IOException {
            ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, followAbbrInfo.presenters);
            if (followAbbrInfo.raw_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, followAbbrInfo.raw_url);
            }
            if (followAbbrInfo.file_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, followAbbrInfo.file_title);
            }
            if (followAbbrInfo.file_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, followAbbrInfo.file_token);
            }
            if (followAbbrInfo.share_subtype != null) {
                FollowInfo.ShareSubType.ADAPTER.encodeWithTag(protoWriter, 5, followAbbrInfo.share_subtype);
            }
            if (followAbbrInfo.file_label_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, followAbbrInfo.file_label_url);
            }
            protoWriter.writeBytes(followAbbrInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowAbbrInfo$a */
    public static final class C50557a extends Message.Builder<FollowAbbrInfo, C50557a> {

        /* renamed from: a */
        public List<ByteviewUser> f126199a = Internal.newMutableList();

        /* renamed from: b */
        public String f126200b;

        /* renamed from: c */
        public String f126201c;

        /* renamed from: d */
        public String f126202d;

        /* renamed from: e */
        public FollowInfo.ShareSubType f126203e;

        /* renamed from: f */
        public String f126204f;

        /* renamed from: a */
        public FollowAbbrInfo build() {
            return new FollowAbbrInfo(this.f126199a, this.f126200b, this.f126201c, this.f126202d, this.f126203e, this.f126204f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50557a newBuilder() {
        C50557a aVar = new C50557a();
        aVar.f126199a = Internal.copyOf("presenters", this.presenters);
        aVar.f126200b = this.raw_url;
        aVar.f126201c = this.file_title;
        aVar.f126202d = this.file_token;
        aVar.f126203e = this.share_subtype;
        aVar.f126204f = this.file_label_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FollowAbbrInfo");
        StringBuilder sb = new StringBuilder();
        if (!this.presenters.isEmpty()) {
            sb.append(", presenters=");
            sb.append(this.presenters);
        }
        if (this.raw_url != null) {
            sb.append(", raw_url=");
            sb.append(this.raw_url);
        }
        if (this.file_title != null) {
            sb.append(", file_title=");
            sb.append(this.file_title);
        }
        if (this.file_token != null) {
            sb.append(", file_token=");
            sb.append(this.file_token);
        }
        if (this.share_subtype != null) {
            sb.append(", share_subtype=");
            sb.append(this.share_subtype);
        }
        if (this.file_label_url != null) {
            sb.append(", file_label_url=");
            sb.append(this.file_label_url);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowAbbrInfo{");
        replace.append('}');
        return replace.toString();
    }

    public FollowAbbrInfo(List<ByteviewUser> list, String str, String str2, String str3, FollowInfo.ShareSubType shareSubType, String str4) {
        this(list, str, str2, str3, shareSubType, str4, ByteString.EMPTY);
    }

    public FollowAbbrInfo(List<ByteviewUser> list, String str, String str2, String str3, FollowInfo.ShareSubType shareSubType, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.presenters = Internal.immutableCopyOf("presenters", list);
        this.raw_url = str;
        this.file_title = str2;
        this.file_token = str3;
        this.share_subtype = shareSubType;
        this.file_label_url = str4;
    }
}
