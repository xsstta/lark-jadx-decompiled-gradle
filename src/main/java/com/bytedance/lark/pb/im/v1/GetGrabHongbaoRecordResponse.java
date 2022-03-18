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

public final class GetGrabHongbaoRecordResponse extends Message<GetGrabHongbaoRecordResponse, C17587a> {
    public static final ProtoAdapter<GetGrabHongbaoRecordResponse> ADAPTER = new C17588b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_TOTAL_AMOUNT = 0L;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final Boolean has_more;
    public final String next_cursor;
    public final List<GrabHongbaoRecord> records;
    public final Long total_amount;
    public final Integer total_num;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetGrabHongbaoRecordResponse$b */
    private static final class C17588b extends ProtoAdapter<GetGrabHongbaoRecordResponse> {
        C17588b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGrabHongbaoRecordResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetGrabHongbaoRecordResponse getGrabHongbaoRecordResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, getGrabHongbaoRecordResponse.total_num) + ProtoAdapter.INT64.encodedSizeWithTag(2, getGrabHongbaoRecordResponse.total_amount) + GrabHongbaoRecord.ADAPTER.asRepeated().encodedSizeWithTag(3, getGrabHongbaoRecordResponse.records);
            int i3 = 0;
            if (getGrabHongbaoRecordResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, getGrabHongbaoRecordResponse.has_more);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getGrabHongbaoRecordResponse.next_cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, getGrabHongbaoRecordResponse.next_cursor);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getGrabHongbaoRecordResponse.entity != null) {
                i3 = C14928Entity.ADAPTER.encodedSizeWithTag(6, getGrabHongbaoRecordResponse.entity);
            }
            return i5 + i3 + getGrabHongbaoRecordResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetGrabHongbaoRecordResponse decode(ProtoReader protoReader) throws IOException {
            C17587a aVar = new C17587a();
            aVar.f44554a = 0;
            aVar.f44555b = 0L;
            aVar.f44557d = false;
            aVar.f44558e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44554a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44555b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44556c.add(GrabHongbaoRecord.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f44557d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44558e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44559f = C14928Entity.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetGrabHongbaoRecordResponse getGrabHongbaoRecordResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getGrabHongbaoRecordResponse.total_num);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getGrabHongbaoRecordResponse.total_amount);
            GrabHongbaoRecord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getGrabHongbaoRecordResponse.records);
            if (getGrabHongbaoRecordResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getGrabHongbaoRecordResponse.has_more);
            }
            if (getGrabHongbaoRecordResponse.next_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getGrabHongbaoRecordResponse.next_cursor);
            }
            if (getGrabHongbaoRecordResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 6, getGrabHongbaoRecordResponse.entity);
            }
            protoWriter.writeBytes(getGrabHongbaoRecordResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetGrabHongbaoRecordResponse$a */
    public static final class C17587a extends Message.Builder<GetGrabHongbaoRecordResponse, C17587a> {

        /* renamed from: a */
        public Integer f44554a;

        /* renamed from: b */
        public Long f44555b;

        /* renamed from: c */
        public List<GrabHongbaoRecord> f44556c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f44557d;

        /* renamed from: e */
        public String f44558e;

        /* renamed from: f */
        public C14928Entity f44559f;

        /* renamed from: a */
        public GetGrabHongbaoRecordResponse build() {
            Long l;
            Integer num = this.f44554a;
            if (num != null && (l = this.f44555b) != null) {
                return new GetGrabHongbaoRecordResponse(num, l, this.f44556c, this.f44557d, this.f44558e, this.f44559f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "total_num", this.f44555b, "total_amount");
        }
    }

    @Override // com.squareup.wire.Message
    public C17587a newBuilder() {
        C17587a aVar = new C17587a();
        aVar.f44554a = this.total_num;
        aVar.f44555b = this.total_amount;
        aVar.f44556c = Internal.copyOf("records", this.records);
        aVar.f44557d = this.has_more;
        aVar.f44558e = this.next_cursor;
        aVar.f44559f = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetGrabHongbaoRecordResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", total_num=");
        sb.append(this.total_num);
        sb.append(", total_amount=");
        sb.append(this.total_amount);
        if (!this.records.isEmpty()) {
            sb.append(", records=");
            sb.append(this.records);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        StringBuilder replace = sb.replace(0, 2, "GetGrabHongbaoRecordResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetGrabHongbaoRecordResponse(Integer num, Long l, List<GrabHongbaoRecord> list, Boolean bool, String str, C14928Entity entity2) {
        this(num, l, list, bool, str, entity2, ByteString.EMPTY);
    }

    public GetGrabHongbaoRecordResponse(Integer num, Long l, List<GrabHongbaoRecord> list, Boolean bool, String str, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_num = num;
        this.total_amount = l;
        this.records = Internal.immutableCopyOf("records", list);
        this.has_more = bool;
        this.next_cursor = str;
        this.entity = entity2;
    }
}
