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

public final class GetSendHongbaoRecordResponse extends Message<GetSendHongbaoRecordResponse, C17679a> {
    public static final ProtoAdapter<GetSendHongbaoRecordResponse> ADAPTER = new C17680b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_TOTAL_AMOUNT = 0L;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final Boolean has_more;
    public final String next_cursor;
    public final List<SendHongbaoRecord> records;
    public final Long total_amount;
    public final Integer total_num;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetSendHongbaoRecordResponse$b */
    private static final class C17680b extends ProtoAdapter<GetSendHongbaoRecordResponse> {
        C17680b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSendHongbaoRecordResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSendHongbaoRecordResponse getSendHongbaoRecordResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, getSendHongbaoRecordResponse.total_num) + ProtoAdapter.INT64.encodedSizeWithTag(2, getSendHongbaoRecordResponse.total_amount) + SendHongbaoRecord.ADAPTER.asRepeated().encodedSizeWithTag(3, getSendHongbaoRecordResponse.records);
            int i3 = 0;
            if (getSendHongbaoRecordResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, getSendHongbaoRecordResponse.has_more);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getSendHongbaoRecordResponse.next_cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, getSendHongbaoRecordResponse.next_cursor);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getSendHongbaoRecordResponse.entity != null) {
                i3 = C14928Entity.ADAPTER.encodedSizeWithTag(6, getSendHongbaoRecordResponse.entity);
            }
            return i5 + i3 + getSendHongbaoRecordResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSendHongbaoRecordResponse decode(ProtoReader protoReader) throws IOException {
            C17679a aVar = new C17679a();
            aVar.f44692a = 0;
            aVar.f44693b = 0L;
            aVar.f44695d = false;
            aVar.f44696e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44692a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44693b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44694c.add(SendHongbaoRecord.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f44695d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44696e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44697f = C14928Entity.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetSendHongbaoRecordResponse getSendHongbaoRecordResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getSendHongbaoRecordResponse.total_num);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getSendHongbaoRecordResponse.total_amount);
            SendHongbaoRecord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getSendHongbaoRecordResponse.records);
            if (getSendHongbaoRecordResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getSendHongbaoRecordResponse.has_more);
            }
            if (getSendHongbaoRecordResponse.next_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getSendHongbaoRecordResponse.next_cursor);
            }
            if (getSendHongbaoRecordResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 6, getSendHongbaoRecordResponse.entity);
            }
            protoWriter.writeBytes(getSendHongbaoRecordResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetSendHongbaoRecordResponse$a */
    public static final class C17679a extends Message.Builder<GetSendHongbaoRecordResponse, C17679a> {

        /* renamed from: a */
        public Integer f44692a;

        /* renamed from: b */
        public Long f44693b;

        /* renamed from: c */
        public List<SendHongbaoRecord> f44694c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f44695d;

        /* renamed from: e */
        public String f44696e;

        /* renamed from: f */
        public C14928Entity f44697f;

        /* renamed from: a */
        public GetSendHongbaoRecordResponse build() {
            Long l;
            Integer num = this.f44692a;
            if (num != null && (l = this.f44693b) != null) {
                return new GetSendHongbaoRecordResponse(num, l, this.f44694c, this.f44695d, this.f44696e, this.f44697f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "total_num", this.f44693b, "total_amount");
        }
    }

    @Override // com.squareup.wire.Message
    public C17679a newBuilder() {
        C17679a aVar = new C17679a();
        aVar.f44692a = this.total_num;
        aVar.f44693b = this.total_amount;
        aVar.f44694c = Internal.copyOf("records", this.records);
        aVar.f44695d = this.has_more;
        aVar.f44696e = this.next_cursor;
        aVar.f44697f = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetSendHongbaoRecordResponse");
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
        StringBuilder replace = sb.replace(0, 2, "GetSendHongbaoRecordResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSendHongbaoRecordResponse(Integer num, Long l, List<SendHongbaoRecord> list, Boolean bool, String str, C14928Entity entity2) {
        this(num, l, list, bool, str, entity2, ByteString.EMPTY);
    }

    public GetSendHongbaoRecordResponse(Integer num, Long l, List<SendHongbaoRecord> list, Boolean bool, String str, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_num = num;
        this.total_amount = l;
        this.records = Internal.immutableCopyOf("records", list);
        this.has_more = bool;
        this.next_cursor = str;
        this.entity = entity2;
    }
}
