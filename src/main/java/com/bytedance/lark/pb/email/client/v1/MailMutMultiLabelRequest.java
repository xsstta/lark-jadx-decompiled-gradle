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

public final class MailMutMultiLabelRequest extends Message<MailMutMultiLabelRequest, C16836a> {
    public static final ProtoAdapter<MailMutMultiLabelRequest> ADAPTER = new C16837b();
    public static final ReportType DEFAULT_REPORT_TYPE = ReportType.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final List<String> add_label_ids;
    public final String from_label;
    public final String message_id;
    public final List<String> remove_label_ids;
    public final ReportType report_type;
    public final List<String> thread_ids;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMutMultiLabelRequest$b */
    private static final class C16837b extends ProtoAdapter<MailMutMultiLabelRequest> {
        C16837b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailMutMultiLabelRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailMutMultiLabelRequest mailMutMultiLabelRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailMutMultiLabelRequest.thread_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, mailMutMultiLabelRequest.add_label_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, mailMutMultiLabelRequest.remove_label_ids);
            int i3 = 0;
            if (mailMutMultiLabelRequest.from_label != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, mailMutMultiLabelRequest.from_label);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (mailMutMultiLabelRequest.report_type != null) {
                i2 = ReportType.ADAPTER.encodedSizeWithTag(5, mailMutMultiLabelRequest.report_type);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (mailMutMultiLabelRequest.message_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, mailMutMultiLabelRequest.message_id);
            }
            return i5 + i3 + mailMutMultiLabelRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailMutMultiLabelRequest decode(ProtoReader protoReader) throws IOException {
            C16836a aVar = new C16836a();
            aVar.f43305d = "";
            aVar.f43306e = ReportType.UNKNOWN_TYPE;
            aVar.f43307f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43302a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            aVar.f43303b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f43304c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f43305d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f43306e = ReportType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f43307f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MailMutMultiLabelRequest mailMutMultiLabelRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailMutMultiLabelRequest.thread_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, mailMutMultiLabelRequest.add_label_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, mailMutMultiLabelRequest.remove_label_ids);
            if (mailMutMultiLabelRequest.from_label != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailMutMultiLabelRequest.from_label);
            }
            if (mailMutMultiLabelRequest.report_type != null) {
                ReportType.ADAPTER.encodeWithTag(protoWriter, 5, mailMutMultiLabelRequest.report_type);
            }
            if (mailMutMultiLabelRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, mailMutMultiLabelRequest.message_id);
            }
            protoWriter.writeBytes(mailMutMultiLabelRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMutMultiLabelRequest$a */
    public static final class C16836a extends Message.Builder<MailMutMultiLabelRequest, C16836a> {

        /* renamed from: a */
        public List<String> f43302a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f43303b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f43304c = Internal.newMutableList();

        /* renamed from: d */
        public String f43305d;

        /* renamed from: e */
        public ReportType f43306e;

        /* renamed from: f */
        public String f43307f;

        /* renamed from: a */
        public MailMutMultiLabelRequest build() {
            return new MailMutMultiLabelRequest(this.f43302a, this.f43303b, this.f43304c, this.f43305d, this.f43306e, this.f43307f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16836a newBuilder() {
        C16836a aVar = new C16836a();
        aVar.f43302a = Internal.copyOf("thread_ids", this.thread_ids);
        aVar.f43303b = Internal.copyOf("add_label_ids", this.add_label_ids);
        aVar.f43304c = Internal.copyOf("remove_label_ids", this.remove_label_ids);
        aVar.f43305d = this.from_label;
        aVar.f43306e = this.report_type;
        aVar.f43307f = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailMutMultiLabelRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.thread_ids.isEmpty()) {
            sb.append(", thread_ids=");
            sb.append(this.thread_ids);
        }
        if (!this.add_label_ids.isEmpty()) {
            sb.append(", add_label_ids=");
            sb.append(this.add_label_ids);
        }
        if (!this.remove_label_ids.isEmpty()) {
            sb.append(", remove_label_ids=");
            sb.append(this.remove_label_ids);
        }
        if (this.from_label != null) {
            sb.append(", from_label=");
            sb.append(this.from_label);
        }
        if (this.report_type != null) {
            sb.append(", report_type=");
            sb.append(this.report_type);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailMutMultiLabelRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailMutMultiLabelRequest(List<String> list, List<String> list2, List<String> list3, String str, ReportType reportType, String str2) {
        this(list, list2, list3, str, reportType, str2, ByteString.EMPTY);
    }

    public MailMutMultiLabelRequest(List<String> list, List<String> list2, List<String> list3, String str, ReportType reportType, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_ids = Internal.immutableCopyOf("thread_ids", list);
        this.add_label_ids = Internal.immutableCopyOf("add_label_ids", list2);
        this.remove_label_ids = Internal.immutableCopyOf("remove_label_ids", list3);
        this.from_label = str;
        this.report_type = reportType;
        this.message_id = str2;
    }
}
