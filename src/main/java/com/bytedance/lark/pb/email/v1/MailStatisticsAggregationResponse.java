package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailStatisticsAggregationResponse extends Message<MailStatisticsAggregationResponse, C17066a> {
    public static final ProtoAdapter<MailStatisticsAggregationResponse> ADAPTER = new C17067b();
    private static final long serialVersionUID = 0;
    public final List<MailStatistic> statistics;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailStatisticsAggregationResponse$b */
    private static final class C17067b extends ProtoAdapter<MailStatisticsAggregationResponse> {
        C17067b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailStatisticsAggregationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailStatisticsAggregationResponse mailStatisticsAggregationResponse) {
            return MailStatistic.ADAPTER.asRepeated().encodedSizeWithTag(1, mailStatisticsAggregationResponse.statistics) + mailStatisticsAggregationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailStatisticsAggregationResponse decode(ProtoReader protoReader) throws IOException {
            C17066a aVar = new C17066a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43730a.add(MailStatistic.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailStatisticsAggregationResponse mailStatisticsAggregationResponse) throws IOException {
            MailStatistic.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailStatisticsAggregationResponse.statistics);
            protoWriter.writeBytes(mailStatisticsAggregationResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailStatisticsAggregationResponse$a */
    public static final class C17066a extends Message.Builder<MailStatisticsAggregationResponse, C17066a> {

        /* renamed from: a */
        public List<MailStatistic> f43730a = Internal.newMutableList();

        /* renamed from: a */
        public MailStatisticsAggregationResponse build() {
            return new MailStatisticsAggregationResponse(this.f43730a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17066a newBuilder() {
        C17066a aVar = new C17066a();
        aVar.f43730a = Internal.copyOf("statistics", this.statistics);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailStatisticsAggregationResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.statistics.isEmpty()) {
            sb.append(", statistics=");
            sb.append(this.statistics);
        }
        StringBuilder replace = sb.replace(0, 2, "MailStatisticsAggregationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailStatisticsAggregationResponse(List<MailStatistic> list) {
        this(list, ByteString.EMPTY);
    }

    public MailStatisticsAggregationResponse(List<MailStatistic> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.statistics = Internal.immutableCopyOf("statistics", list);
    }
}
