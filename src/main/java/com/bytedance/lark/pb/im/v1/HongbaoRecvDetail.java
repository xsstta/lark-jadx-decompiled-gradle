package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class HongbaoRecvDetail extends Message<HongbaoRecvDetail, C17783a> {
    public static final ProtoAdapter<HongbaoRecvDetail> ADAPTER = new C17784b();
    public static final Long DEFAULT_AMOUNT = 0L;
    public static final Long DEFAULT_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long amount;
    public final Long time;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.HongbaoRecvDetail$b */
    private static final class C17784b extends ProtoAdapter<HongbaoRecvDetail> {
        C17784b() {
            super(FieldEncoding.LENGTH_DELIMITED, HongbaoRecvDetail.class);
        }

        /* renamed from: a */
        public int encodedSize(HongbaoRecvDetail hongbaoRecvDetail) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, hongbaoRecvDetail.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, hongbaoRecvDetail.amount) + ProtoAdapter.INT64.encodedSizeWithTag(3, hongbaoRecvDetail.time) + hongbaoRecvDetail.unknownFields().size();
        }

        /* renamed from: a */
        public HongbaoRecvDetail decode(ProtoReader protoReader) throws IOException {
            C17783a aVar = new C17783a();
            aVar.f44825a = "";
            aVar.f44826b = 0L;
            aVar.f44827c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44825a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44826b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44827c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, HongbaoRecvDetail hongbaoRecvDetail) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hongbaoRecvDetail.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, hongbaoRecvDetail.amount);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, hongbaoRecvDetail.time);
            protoWriter.writeBytes(hongbaoRecvDetail.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17783a newBuilder() {
        C17783a aVar = new C17783a();
        aVar.f44825a = this.user_id;
        aVar.f44826b = this.amount;
        aVar.f44827c = this.time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.HongbaoRecvDetail$a */
    public static final class C17783a extends Message.Builder<HongbaoRecvDetail, C17783a> {

        /* renamed from: a */
        public String f44825a;

        /* renamed from: b */
        public Long f44826b;

        /* renamed from: c */
        public Long f44827c;

        /* renamed from: a */
        public HongbaoRecvDetail build() {
            Long l;
            Long l2;
            String str = this.f44825a;
            if (str != null && (l = this.f44826b) != null && (l2 = this.f44827c) != null) {
                return new HongbaoRecvDetail(str, l, l2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "user_id", this.f44826b, "amount", this.f44827c, "time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "HongbaoRecvDetail");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", time=");
        sb.append(this.time);
        StringBuilder replace = sb.replace(0, 2, "HongbaoRecvDetail{");
        replace.append('}');
        return replace.toString();
    }

    public HongbaoRecvDetail(String str, Long l, Long l2) {
        this(str, l, l2, ByteString.EMPTY);
    }

    public HongbaoRecvDetail(String str, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.amount = l;
        this.time = l2;
    }
}
