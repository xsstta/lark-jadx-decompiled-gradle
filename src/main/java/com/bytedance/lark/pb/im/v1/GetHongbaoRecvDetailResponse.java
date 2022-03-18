package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetHongbaoRecvDetailResponse extends Message<GetHongbaoRecvDetailResponse, C17597a> {
    public static final ProtoAdapter<GetHongbaoRecvDetailResponse> ADAPTER = new C17598b();
    public static final Integer DEFAULT_GRAB_NUM = 0;
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_TOTAL_GRAB_AMOUNT = 0L;
    private static final long serialVersionUID = 0;
    public final List<HongbaoRecvDetail> details;
    public final C14928Entity entity;
    public final Integer grab_num;
    public final Boolean has_more;
    public final String lucky_user_id;
    public final String next_cursor;
    public final Long total_grab_amount;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetHongbaoRecvDetailResponse$b */
    private static final class C17598b extends ProtoAdapter<GetHongbaoRecvDetailResponse> {
        C17598b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHongbaoRecvDetailResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHongbaoRecvDetailResponse getHongbaoRecvDetailResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (getHongbaoRecvDetailResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, getHongbaoRecvDetailResponse.entity);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + HongbaoRecvDetail.ADAPTER.asRepeated().encodedSizeWithTag(2, getHongbaoRecvDetailResponse.details);
            if (getHongbaoRecvDetailResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getHongbaoRecvDetailResponse.has_more);
            } else {
                i2 = 0;
            }
            int i7 = encodedSizeWithTag + i2;
            if (getHongbaoRecvDetailResponse.next_cursor != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getHongbaoRecvDetailResponse.next_cursor);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (getHongbaoRecvDetailResponse.grab_num != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, getHongbaoRecvDetailResponse.grab_num);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (getHongbaoRecvDetailResponse.total_grab_amount != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(6, getHongbaoRecvDetailResponse.total_grab_amount);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (getHongbaoRecvDetailResponse.lucky_user_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, getHongbaoRecvDetailResponse.lucky_user_id);
            }
            return i10 + i6 + getHongbaoRecvDetailResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetHongbaoRecvDetailResponse decode(ProtoReader protoReader) throws IOException {
            C17597a aVar = new C17597a();
            aVar.f44581c = false;
            aVar.f44582d = "";
            aVar.f44583e = 0;
            aVar.f44584f = 0L;
            aVar.f44585g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44579a = C14928Entity.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44580b.add(HongbaoRecvDetail.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f44581c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44582d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44583e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44584f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44585g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetHongbaoRecvDetailResponse getHongbaoRecvDetailResponse) throws IOException {
            if (getHongbaoRecvDetailResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getHongbaoRecvDetailResponse.entity);
            }
            HongbaoRecvDetail.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getHongbaoRecvDetailResponse.details);
            if (getHongbaoRecvDetailResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getHongbaoRecvDetailResponse.has_more);
            }
            if (getHongbaoRecvDetailResponse.next_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getHongbaoRecvDetailResponse.next_cursor);
            }
            if (getHongbaoRecvDetailResponse.grab_num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getHongbaoRecvDetailResponse.grab_num);
            }
            if (getHongbaoRecvDetailResponse.total_grab_amount != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, getHongbaoRecvDetailResponse.total_grab_amount);
            }
            if (getHongbaoRecvDetailResponse.lucky_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, getHongbaoRecvDetailResponse.lucky_user_id);
            }
            protoWriter.writeBytes(getHongbaoRecvDetailResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetHongbaoRecvDetailResponse$a */
    public static final class C17597a extends Message.Builder<GetHongbaoRecvDetailResponse, C17597a> {

        /* renamed from: a */
        public C14928Entity f44579a;

        /* renamed from: b */
        public List<HongbaoRecvDetail> f44580b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f44581c;

        /* renamed from: d */
        public String f44582d;

        /* renamed from: e */
        public Integer f44583e;

        /* renamed from: f */
        public Long f44584f;

        /* renamed from: g */
        public String f44585g;

        /* renamed from: a */
        public GetHongbaoRecvDetailResponse build() {
            return new GetHongbaoRecvDetailResponse(this.f44579a, this.f44580b, this.f44581c, this.f44582d, this.f44583e, this.f44584f, this.f44585g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17597a newBuilder() {
        C17597a aVar = new C17597a();
        aVar.f44579a = this.entity;
        aVar.f44580b = Internal.copyOf("details", this.details);
        aVar.f44581c = this.has_more;
        aVar.f44582d = this.next_cursor;
        aVar.f44583e = this.grab_num;
        aVar.f44584f = this.total_grab_amount;
        aVar.f44585g = this.lucky_user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetHongbaoRecvDetailResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (!this.details.isEmpty()) {
            sb.append(", details=");
            sb.append(this.details);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.grab_num != null) {
            sb.append(", grab_num=");
            sb.append(this.grab_num);
        }
        if (this.total_grab_amount != null) {
            sb.append(", total_grab_amount=");
            sb.append(this.total_grab_amount);
        }
        if (this.lucky_user_id != null) {
            sb.append(", lucky_user_id=");
            sb.append(this.lucky_user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetHongbaoRecvDetailResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetHongbaoRecvDetailResponse(C14928Entity entity2, List<HongbaoRecvDetail> list, Boolean bool, String str, Integer num, Long l, String str2) {
        this(entity2, list, bool, str, num, l, str2, ByteString.EMPTY);
    }

    public GetHongbaoRecvDetailResponse(C14928Entity entity2, List<HongbaoRecvDetail> list, Boolean bool, String str, Integer num, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.details = Internal.immutableCopyOf("details", list);
        this.has_more = bool;
        this.next_cursor = str;
        this.grab_num = num;
        this.total_grab_amount = l;
        this.lucky_user_id = str2;
    }
}
