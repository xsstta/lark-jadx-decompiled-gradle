package com.bytedance.lark.pb.email.client.v1;

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

public final class MailMoveMultiLabelRequest extends Message<MailMoveMultiLabelRequest, C16824a> {
    public static final ProtoAdapter<MailMoveMultiLabelRequest> ADAPTER = new C16825b();
    public static final ReportType DEFAULT_REPORT_TYPE = ReportType.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final String from_label;
    public final ReportType report_type;
    public final List<String> thread_ids;
    public final String to_label;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMoveMultiLabelRequest$b */
    private static final class C16825b extends ProtoAdapter<MailMoveMultiLabelRequest> {
        C16825b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailMoveMultiLabelRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailMoveMultiLabelRequest mailMoveMultiLabelRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailMoveMultiLabelRequest.thread_ids);
            int i3 = 0;
            if (mailMoveMultiLabelRequest.from_label != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mailMoveMultiLabelRequest.from_label);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (mailMoveMultiLabelRequest.to_label != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailMoveMultiLabelRequest.to_label);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (mailMoveMultiLabelRequest.report_type != null) {
                i3 = ReportType.ADAPTER.encodedSizeWithTag(4, mailMoveMultiLabelRequest.report_type);
            }
            return i5 + i3 + mailMoveMultiLabelRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailMoveMultiLabelRequest decode(ProtoReader protoReader) throws IOException {
            C16824a aVar = new C16824a();
            aVar.f43292b = "";
            aVar.f43293c = "";
            aVar.f43294d = ReportType.UNKNOWN_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43291a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43292b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43293c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43294d = ReportType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailMoveMultiLabelRequest mailMoveMultiLabelRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailMoveMultiLabelRequest.thread_ids);
            if (mailMoveMultiLabelRequest.from_label != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailMoveMultiLabelRequest.from_label);
            }
            if (mailMoveMultiLabelRequest.to_label != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailMoveMultiLabelRequest.to_label);
            }
            if (mailMoveMultiLabelRequest.report_type != null) {
                ReportType.ADAPTER.encodeWithTag(protoWriter, 4, mailMoveMultiLabelRequest.report_type);
            }
            protoWriter.writeBytes(mailMoveMultiLabelRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMoveMultiLabelRequest$a */
    public static final class C16824a extends Message.Builder<MailMoveMultiLabelRequest, C16824a> {

        /* renamed from: a */
        public List<String> f43291a = Internal.newMutableList();

        /* renamed from: b */
        public String f43292b;

        /* renamed from: c */
        public String f43293c;

        /* renamed from: d */
        public ReportType f43294d;

        /* renamed from: a */
        public MailMoveMultiLabelRequest build() {
            return new MailMoveMultiLabelRequest(this.f43291a, this.f43292b, this.f43293c, this.f43294d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16824a newBuilder() {
        C16824a aVar = new C16824a();
        aVar.f43291a = Internal.copyOf("thread_ids", this.thread_ids);
        aVar.f43292b = this.from_label;
        aVar.f43293c = this.to_label;
        aVar.f43294d = this.report_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailMoveMultiLabelRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.thread_ids.isEmpty()) {
            sb.append(", thread_ids=");
            sb.append(this.thread_ids);
        }
        if (this.from_label != null) {
            sb.append(", from_label=");
            sb.append(this.from_label);
        }
        if (this.to_label != null) {
            sb.append(", to_label=");
            sb.append(this.to_label);
        }
        if (this.report_type != null) {
            sb.append(", report_type=");
            sb.append(this.report_type);
        }
        StringBuilder replace = sb.replace(0, 2, "MailMoveMultiLabelRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailMoveMultiLabelRequest(List<String> list, String str, String str2, ReportType reportType) {
        this(list, str, str2, reportType, ByteString.EMPTY);
    }

    public MailMoveMultiLabelRequest(List<String> list, String str, String str2, ReportType reportType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_ids = Internal.immutableCopyOf("thread_ids", list);
        this.from_label = str;
        this.to_label = str2;
        this.report_type = reportType;
    }
}
