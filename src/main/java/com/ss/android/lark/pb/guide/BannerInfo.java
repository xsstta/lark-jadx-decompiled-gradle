package com.ss.android.lark.pb.guide;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BannerInfo extends Message<BannerInfo, C49774a> {
    public static final ProtoAdapter<BannerInfo> ADAPTER = new C49775b();
    public static final Integer DEFAULT_PRIORITY = 0;
    private static final long serialVersionUID = 0;
    public final String mbanner_key;
    public final BannerBizName mbiz_name;
    public final BannerDyData mdy_data;
    public final Integer mpriority;

    public enum BannerBizName implements WireEnum {
        UNKNOWN(0),
        UPGRADE_TEAM(1),
        ACTIVITY(2),
        INVITE_MEMBER(3),
        NOTIFICATION(4),
        DYNAMIC(5);
        
        public static final ProtoAdapter<BannerBizName> ADAPTER = ProtoAdapter.newEnumAdapter(BannerBizName.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static BannerBizName fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return UPGRADE_TEAM;
            }
            if (i == 2) {
                return ACTIVITY;
            }
            if (i == 3) {
                return INVITE_MEMBER;
            }
            if (i == 4) {
                return NOTIFICATION;
            }
            if (i != 5) {
                return null;
            }
            return DYNAMIC;
        }

        private BannerBizName(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.BannerInfo$b */
    private static final class C49775b extends ProtoAdapter<BannerInfo> {
        C49775b() {
            super(FieldEncoding.LENGTH_DELIMITED, BannerInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(BannerInfo bannerInfo) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, bannerInfo.mbanner_key) + ProtoAdapter.INT32.encodedSizeWithTag(2, bannerInfo.mpriority) + BannerBizName.ADAPTER.encodedSizeWithTag(3, bannerInfo.mbiz_name);
            if (bannerInfo.mdy_data != null) {
                i = BannerDyData.ADAPTER.encodedSizeWithTag(6, bannerInfo.mdy_data);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + bannerInfo.unknownFields().size();
        }

        /* renamed from: a */
        public BannerInfo decode(ProtoReader protoReader) throws IOException {
            C49774a aVar = new C49774a();
            aVar.f124666a = "";
            aVar.f124667b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124666a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124667b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f124668c = BannerBizName.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 6) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124669d = BannerDyData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BannerInfo bannerInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bannerInfo.mbanner_key);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, bannerInfo.mpriority);
            BannerBizName.ADAPTER.encodeWithTag(protoWriter, 3, bannerInfo.mbiz_name);
            if (bannerInfo.mdy_data != null) {
                BannerDyData.ADAPTER.encodeWithTag(protoWriter, 6, bannerInfo.mdy_data);
            }
            protoWriter.writeBytes(bannerInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49774a newBuilder() {
        C49774a aVar = new C49774a();
        aVar.f124666a = this.mbanner_key;
        aVar.f124667b = this.mpriority;
        aVar.f124668c = this.mbiz_name;
        aVar.f124669d = this.mdy_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.guide.BannerInfo$a */
    public static final class C49774a extends Message.Builder<BannerInfo, C49774a> {

        /* renamed from: a */
        public String f124666a;

        /* renamed from: b */
        public Integer f124667b;

        /* renamed from: c */
        public BannerBizName f124668c;

        /* renamed from: d */
        public BannerDyData f124669d;

        /* renamed from: a */
        public BannerInfo build() {
            Integer num;
            BannerBizName bannerBizName;
            String str = this.f124666a;
            if (str != null && (num = this.f124667b) != null && (bannerBizName = this.f124668c) != null) {
                return new BannerInfo(str, num, bannerBizName, this.f124669d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mbanner_key", this.f124667b, "mpriority", this.f124668c, "mbiz_name");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", banner_key=");
        sb.append(this.mbanner_key);
        sb.append(", priority=");
        sb.append(this.mpriority);
        sb.append(", biz_name=");
        sb.append(this.mbiz_name);
        if (this.mdy_data != null) {
            sb.append(", dy_data=");
            sb.append(this.mdy_data);
        }
        StringBuilder replace = sb.replace(0, 2, "BannerInfo{");
        replace.append('}');
        return replace.toString();
    }

    public BannerInfo(String str, Integer num, BannerBizName bannerBizName, BannerDyData bannerDyData) {
        this(str, num, bannerBizName, bannerDyData, ByteString.EMPTY);
    }

    public BannerInfo(String str, Integer num, BannerBizName bannerBizName, BannerDyData bannerDyData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbanner_key = str;
        this.mpriority = num;
        this.mbiz_name = bannerBizName;
        this.mdy_data = bannerDyData;
    }
}
