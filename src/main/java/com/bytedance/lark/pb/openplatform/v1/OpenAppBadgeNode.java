package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class OpenAppBadgeNode extends Message<OpenAppBadgeNode, C18679a> {
    public static final ProtoAdapter<OpenAppBadgeNode> ADAPTER = new C18680b();
    public static final Integer DEFAULT_BADGE_NUM = 0;
    public static final CommonEnum.OpenAppFeatureType DEFAULT_FEATURE = CommonEnum.OpenAppFeatureType.MiniApp;
    public static final Boolean DEFAULT_NEED_SHOW = false;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final Integer badge_num;
    public final String extra;
    public final CommonEnum.OpenAppFeatureType feature;
    public final String id;
    public final Boolean need_show;
    public final String update_time;
    public final String version;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode$b */
    private static final class C18680b extends ProtoAdapter<OpenAppBadgeNode> {
        C18680b() {
            super(FieldEncoding.LENGTH_DELIMITED, OpenAppBadgeNode.class);
        }

        /* renamed from: a */
        public int encodedSize(OpenAppBadgeNode openAppBadgeNode) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, openAppBadgeNode.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, openAppBadgeNode.app_id) + CommonEnum.OpenAppFeatureType.ADAPTER.encodedSizeWithTag(3, openAppBadgeNode.feature);
            int i3 = 0;
            if (openAppBadgeNode.need_show != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, openAppBadgeNode.need_show);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (openAppBadgeNode.update_time != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, openAppBadgeNode.update_time);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i4 + i2 + ProtoAdapter.INT32.encodedSizeWithTag(6, openAppBadgeNode.badge_num);
            if (openAppBadgeNode.extra != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, openAppBadgeNode.extra);
            }
            return encodedSizeWithTag2 + i3 + ProtoAdapter.STRING.encodedSizeWithTag(8, openAppBadgeNode.version) + openAppBadgeNode.unknownFields().size();
        }

        /* renamed from: a */
        public OpenAppBadgeNode decode(ProtoReader protoReader) throws IOException {
            C18679a aVar = new C18679a();
            aVar.f46211a = "";
            aVar.f46212b = "";
            aVar.f46213c = CommonEnum.OpenAppFeatureType.MiniApp;
            aVar.f46214d = false;
            aVar.f46215e = "";
            aVar.f46216f = 0;
            aVar.f46217g = "";
            aVar.f46218h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46211a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46212b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f46213c = CommonEnum.OpenAppFeatureType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f46214d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46215e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46216f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46217g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46218h = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, OpenAppBadgeNode openAppBadgeNode) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openAppBadgeNode.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, openAppBadgeNode.app_id);
            CommonEnum.OpenAppFeatureType.ADAPTER.encodeWithTag(protoWriter, 3, openAppBadgeNode.feature);
            if (openAppBadgeNode.need_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, openAppBadgeNode.need_show);
            }
            if (openAppBadgeNode.update_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, openAppBadgeNode.update_time);
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, openAppBadgeNode.badge_num);
            if (openAppBadgeNode.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, openAppBadgeNode.extra);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, openAppBadgeNode.version);
            protoWriter.writeBytes(openAppBadgeNode.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18679a newBuilder() {
        C18679a aVar = new C18679a();
        aVar.f46211a = this.id;
        aVar.f46212b = this.app_id;
        aVar.f46213c = this.feature;
        aVar.f46214d = this.need_show;
        aVar.f46215e = this.update_time;
        aVar.f46216f = this.badge_num;
        aVar.f46217g = this.extra;
        aVar.f46218h = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode$a */
    public static final class C18679a extends Message.Builder<OpenAppBadgeNode, C18679a> {

        /* renamed from: a */
        public String f46211a;

        /* renamed from: b */
        public String f46212b;

        /* renamed from: c */
        public CommonEnum.OpenAppFeatureType f46213c;

        /* renamed from: d */
        public Boolean f46214d;

        /* renamed from: e */
        public String f46215e;

        /* renamed from: f */
        public Integer f46216f;

        /* renamed from: g */
        public String f46217g;

        /* renamed from: h */
        public String f46218h;

        /* renamed from: a */
        public OpenAppBadgeNode build() {
            String str;
            CommonEnum.OpenAppFeatureType openAppFeatureType;
            Integer num;
            String str2;
            String str3 = this.f46211a;
            if (str3 != null && (str = this.f46212b) != null && (openAppFeatureType = this.f46213c) != null && (num = this.f46216f) != null && (str2 = this.f46218h) != null) {
                return new OpenAppBadgeNode(str3, str, openAppFeatureType, this.f46214d, this.f46215e, num, this.f46217g, str2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "id", this.f46212b, "app_id", this.f46213c, "feature", this.f46216f, "badge_num", this.f46218h, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        }

        /* renamed from: a */
        public C18679a mo64287a(CommonEnum.OpenAppFeatureType openAppFeatureType) {
            this.f46213c = openAppFeatureType;
            return this;
        }

        /* renamed from: b */
        public C18679a mo64292b(String str) {
            this.f46212b = str;
            return this;
        }

        /* renamed from: c */
        public C18679a mo64293c(String str) {
            this.f46217g = str;
            return this;
        }

        /* renamed from: d */
        public C18679a mo64294d(String str) {
            this.f46218h = str;
            return this;
        }

        /* renamed from: a */
        public C18679a mo64288a(Boolean bool) {
            this.f46214d = bool;
            return this;
        }

        /* renamed from: a */
        public C18679a mo64289a(Integer num) {
            this.f46216f = num;
            return this;
        }

        /* renamed from: a */
        public C18679a mo64290a(String str) {
            this.f46211a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "OpenAppBadgeNode");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", app_id=");
        sb.append(this.app_id);
        sb.append(", feature=");
        sb.append(this.feature);
        if (this.need_show != null) {
            sb.append(", need_show=");
            sb.append(this.need_show);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        sb.append(", badge_num=");
        sb.append(this.badge_num);
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.append(", version=");
        sb.append(this.version);
        StringBuilder replace = sb.replace(0, 2, "OpenAppBadgeNode{");
        replace.append('}');
        return replace.toString();
    }

    public OpenAppBadgeNode(String str, String str2, CommonEnum.OpenAppFeatureType openAppFeatureType, Boolean bool, String str3, Integer num, String str4, String str5) {
        this(str, str2, openAppFeatureType, bool, str3, num, str4, str5, ByteString.EMPTY);
    }

    public OpenAppBadgeNode(String str, String str2, CommonEnum.OpenAppFeatureType openAppFeatureType, Boolean bool, String str3, Integer num, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.app_id = str2;
        this.feature = openAppFeatureType;
        this.need_show = bool;
        this.update_time = str3;
        this.badge_num = num;
        this.extra = str4;
        this.version = str5;
    }
}
