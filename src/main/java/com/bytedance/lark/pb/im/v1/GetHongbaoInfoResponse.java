package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.HongbaoContent;
import com.bytedance.lark.pb.basic.v1.HongbaoCover;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class GetHongbaoInfoResponse extends Message<GetHongbaoInfoResponse, C17594a> {
    public static final ProtoAdapter<GetHongbaoInfoResponse> ADAPTER = new C17595b();
    public static final Long DEFAULT_GRAB_AMOUNT = 0L;
    public static final Integer DEFAULT_GRAB_NUM = 0;
    public static final Boolean DEFAULT_HAS_GRABBED = false;
    public static final Boolean DEFAULT_IS_EXPIRED = false;
    public static final Long DEFAULT_TOTAL_AMOUNT = 0L;
    public static final Long DEFAULT_TOTAL_GRAB_AMOUNT = 0L;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final HongbaoContent.Type DEFAULT_TYPE = HongbaoContent.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final HongbaoCover cover;
    public final C14928Entity entity;
    public final Long grab_amount;
    public final Integer grab_num;
    public final Boolean has_grabbed;
    public final Boolean is_expired;
    public final String lucky_user_id;
    public final String subject;
    public final Long total_amount;
    public final Long total_grab_amount;
    public final Integer total_num;
    public final HongbaoContent.Type type;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetHongbaoInfoResponse$b */
    private static final class C17595b extends ProtoAdapter<GetHongbaoInfoResponse> {
        C17595b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHongbaoInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHongbaoInfoResponse getHongbaoInfoResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (getHongbaoInfoResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, getHongbaoInfoResponse.entity);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.encodedSizeWithTag(2, getHongbaoInfoResponse.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(3, getHongbaoInfoResponse.total_amount) + ProtoAdapter.INT32.encodedSizeWithTag(4, getHongbaoInfoResponse.total_num) + ProtoAdapter.INT32.encodedSizeWithTag(5, getHongbaoInfoResponse.grab_num) + ProtoAdapter.STRING.encodedSizeWithTag(6, getHongbaoInfoResponse.subject) + HongbaoContent.Type.ADAPTER.encodedSizeWithTag(7, getHongbaoInfoResponse.type);
            if (getHongbaoInfoResponse.has_grabbed != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(8, getHongbaoInfoResponse.has_grabbed);
            } else {
                i2 = 0;
            }
            int i8 = encodedSizeWithTag + i2;
            if (getHongbaoInfoResponse.is_expired != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(9, getHongbaoInfoResponse.is_expired);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (getHongbaoInfoResponse.lucky_user_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(10, getHongbaoInfoResponse.lucky_user_id);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (getHongbaoInfoResponse.grab_amount != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(11, getHongbaoInfoResponse.grab_amount);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (getHongbaoInfoResponse.total_grab_amount != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(12, getHongbaoInfoResponse.total_grab_amount);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (getHongbaoInfoResponse.cover != null) {
                i7 = HongbaoCover.ADAPTER.encodedSizeWithTag(21, getHongbaoInfoResponse.cover);
            }
            return i12 + i7 + getHongbaoInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetHongbaoInfoResponse decode(ProtoReader protoReader) throws IOException {
            C17594a aVar = new C17594a();
            aVar.f44567b = "";
            aVar.f44568c = 0L;
            aVar.f44569d = 0;
            aVar.f44570e = 0;
            aVar.f44571f = "";
            aVar.f44572g = HongbaoContent.Type.UNKNOWN;
            aVar.f44573h = false;
            aVar.f44574i = false;
            aVar.f44575j = "";
            aVar.f44576k = 0L;
            aVar.f44577l = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 21) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44566a = C14928Entity.ADAPTER.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f44567b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f44568c = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f44569d = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f44570e = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f44571f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            try {
                                aVar.f44572g = HongbaoContent.Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 8:
                            aVar.f44573h = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f44574i = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f44575j = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f44576k = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f44577l = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f44578m = HongbaoCover.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHongbaoInfoResponse getHongbaoInfoResponse) throws IOException {
            if (getHongbaoInfoResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getHongbaoInfoResponse.entity);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getHongbaoInfoResponse.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getHongbaoInfoResponse.total_amount);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getHongbaoInfoResponse.total_num);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getHongbaoInfoResponse.grab_num);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getHongbaoInfoResponse.subject);
            HongbaoContent.Type.ADAPTER.encodeWithTag(protoWriter, 7, getHongbaoInfoResponse.type);
            if (getHongbaoInfoResponse.has_grabbed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, getHongbaoInfoResponse.has_grabbed);
            }
            if (getHongbaoInfoResponse.is_expired != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, getHongbaoInfoResponse.is_expired);
            }
            if (getHongbaoInfoResponse.lucky_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, getHongbaoInfoResponse.lucky_user_id);
            }
            if (getHongbaoInfoResponse.grab_amount != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, getHongbaoInfoResponse.grab_amount);
            }
            if (getHongbaoInfoResponse.total_grab_amount != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, getHongbaoInfoResponse.total_grab_amount);
            }
            if (getHongbaoInfoResponse.cover != null) {
                HongbaoCover.ADAPTER.encodeWithTag(protoWriter, 21, getHongbaoInfoResponse.cover);
            }
            protoWriter.writeBytes(getHongbaoInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetHongbaoInfoResponse$a */
    public static final class C17594a extends Message.Builder<GetHongbaoInfoResponse, C17594a> {

        /* renamed from: a */
        public C14928Entity f44566a;

        /* renamed from: b */
        public String f44567b;

        /* renamed from: c */
        public Long f44568c;

        /* renamed from: d */
        public Integer f44569d;

        /* renamed from: e */
        public Integer f44570e;

        /* renamed from: f */
        public String f44571f;

        /* renamed from: g */
        public HongbaoContent.Type f44572g;

        /* renamed from: h */
        public Boolean f44573h;

        /* renamed from: i */
        public Boolean f44574i;

        /* renamed from: j */
        public String f44575j;

        /* renamed from: k */
        public Long f44576k;

        /* renamed from: l */
        public Long f44577l;

        /* renamed from: m */
        public HongbaoCover f44578m;

        /* renamed from: a */
        public GetHongbaoInfoResponse build() {
            Long l;
            Integer num;
            Integer num2;
            String str;
            HongbaoContent.Type type;
            String str2 = this.f44567b;
            if (str2 != null && (l = this.f44568c) != null && (num = this.f44569d) != null && (num2 = this.f44570e) != null && (str = this.f44571f) != null && (type = this.f44572g) != null) {
                return new GetHongbaoInfoResponse(this.f44566a, str2, l, num, num2, str, type, this.f44573h, this.f44574i, this.f44575j, this.f44576k, this.f44577l, this.f44578m, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "user_id", this.f44568c, "total_amount", this.f44569d, "total_num", this.f44570e, "grab_num", this.f44571f, "subject", this.f44572g, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C17594a newBuilder() {
        C17594a aVar = new C17594a();
        aVar.f44566a = this.entity;
        aVar.f44567b = this.user_id;
        aVar.f44568c = this.total_amount;
        aVar.f44569d = this.total_num;
        aVar.f44570e = this.grab_num;
        aVar.f44571f = this.subject;
        aVar.f44572g = this.type;
        aVar.f44573h = this.has_grabbed;
        aVar.f44574i = this.is_expired;
        aVar.f44575j = this.lucky_user_id;
        aVar.f44576k = this.grab_amount;
        aVar.f44577l = this.total_grab_amount;
        aVar.f44578m = this.cover;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetHongbaoInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", total_amount=");
        sb.append(this.total_amount);
        sb.append(", total_num=");
        sb.append(this.total_num);
        sb.append(", grab_num=");
        sb.append(this.grab_num);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", type=");
        sb.append(this.type);
        if (this.has_grabbed != null) {
            sb.append(", has_grabbed=");
            sb.append(this.has_grabbed);
        }
        if (this.is_expired != null) {
            sb.append(", is_expired=");
            sb.append(this.is_expired);
        }
        if (this.lucky_user_id != null) {
            sb.append(", lucky_user_id=");
            sb.append(this.lucky_user_id);
        }
        if (this.grab_amount != null) {
            sb.append(", grab_amount=");
            sb.append(this.grab_amount);
        }
        if (this.total_grab_amount != null) {
            sb.append(", total_grab_amount=");
            sb.append(this.total_grab_amount);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        StringBuilder replace = sb.replace(0, 2, "GetHongbaoInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetHongbaoInfoResponse(C14928Entity entity2, String str, Long l, Integer num, Integer num2, String str2, HongbaoContent.Type type2, Boolean bool, Boolean bool2, String str3, Long l2, Long l3, HongbaoCover hongbaoCover) {
        this(entity2, str, l, num, num2, str2, type2, bool, bool2, str3, l2, l3, hongbaoCover, ByteString.EMPTY);
    }

    public GetHongbaoInfoResponse(C14928Entity entity2, String str, Long l, Integer num, Integer num2, String str2, HongbaoContent.Type type2, Boolean bool, Boolean bool2, String str3, Long l2, Long l3, HongbaoCover hongbaoCover, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.user_id = str;
        this.total_amount = l;
        this.total_num = num;
        this.grab_num = num2;
        this.subject = str2;
        this.type = type2;
        this.has_grabbed = bool;
        this.is_expired = bool2;
        this.lucky_user_id = str3;
        this.grab_amount = l2;
        this.total_grab_amount = l3;
        this.cover = hongbaoCover;
    }
}
