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

public final class MailSelectAllRequest extends Message<MailSelectAllRequest, C16880a> {
    public static final ProtoAdapter<MailSelectAllRequest> ADAPTER = new C16881b();
    public static final Boolean DEFAULT_IS_UNREAD = false;
    public static final Long DEFAULT_MAX_TIMESTAMP = 0L;
    public static final ReportType DEFAULT_REPORT_TYPE = ReportType.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final List<String> add_label_ids;
    public final List<String> exclude_thread_ids;
    public final Boolean is_unread;
    public final String label_id;
    public final Long max_timestamp;
    public final String move_to_folder;
    public final List<String> remove_label_ids;
    public final ReportType report_type;
    public final MailAdvancedSearchRequest search;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSelectAllRequest$b */
    private static final class C16881b extends ProtoAdapter<MailSelectAllRequest> {
        C16881b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSelectAllRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSelectAllRequest mailSelectAllRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (mailSelectAllRequest.label_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailSelectAllRequest.label_id);
            } else {
                i = 0;
            }
            if (mailSelectAllRequest.search != null) {
                i2 = MailAdvancedSearchRequest.ADAPTER.encodedSizeWithTag(2, mailSelectAllRequest.search);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (mailSelectAllRequest.max_timestamp != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, mailSelectAllRequest.max_timestamp);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag = i7 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, mailSelectAllRequest.exclude_thread_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, mailSelectAllRequest.add_label_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, mailSelectAllRequest.remove_label_ids);
            if (mailSelectAllRequest.is_unread != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, mailSelectAllRequest.is_unread);
            } else {
                i4 = 0;
            }
            int i8 = encodedSizeWithTag + i4;
            if (mailSelectAllRequest.move_to_folder != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, mailSelectAllRequest.move_to_folder);
            } else {
                i5 = 0;
            }
            int i9 = i8 + i5;
            if (mailSelectAllRequest.report_type != null) {
                i6 = ReportType.ADAPTER.encodedSizeWithTag(9, mailSelectAllRequest.report_type);
            }
            return i9 + i6 + mailSelectAllRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailSelectAllRequest decode(ProtoReader protoReader) throws IOException {
            C16880a aVar = new C16880a();
            aVar.f43345a = "";
            aVar.f43347c = 0L;
            aVar.f43351g = false;
            aVar.f43352h = "";
            aVar.f43353i = ReportType.UNKNOWN_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43345a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43346b = MailAdvancedSearchRequest.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43347c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43348d.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            aVar.f43349e.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            aVar.f43350f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f43351g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43352h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            try {
                                aVar.f43353i = ReportType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, MailSelectAllRequest mailSelectAllRequest) throws IOException {
            if (mailSelectAllRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailSelectAllRequest.label_id);
            }
            if (mailSelectAllRequest.search != null) {
                MailAdvancedSearchRequest.ADAPTER.encodeWithTag(protoWriter, 2, mailSelectAllRequest.search);
            }
            if (mailSelectAllRequest.max_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mailSelectAllRequest.max_timestamp);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, mailSelectAllRequest.exclude_thread_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, mailSelectAllRequest.add_label_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, mailSelectAllRequest.remove_label_ids);
            if (mailSelectAllRequest.is_unread != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, mailSelectAllRequest.is_unread);
            }
            if (mailSelectAllRequest.move_to_folder != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, mailSelectAllRequest.move_to_folder);
            }
            if (mailSelectAllRequest.report_type != null) {
                ReportType.ADAPTER.encodeWithTag(protoWriter, 9, mailSelectAllRequest.report_type);
            }
            protoWriter.writeBytes(mailSelectAllRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSelectAllRequest$a */
    public static final class C16880a extends Message.Builder<MailSelectAllRequest, C16880a> {

        /* renamed from: a */
        public String f43345a;

        /* renamed from: b */
        public MailAdvancedSearchRequest f43346b;

        /* renamed from: c */
        public Long f43347c;

        /* renamed from: d */
        public List<String> f43348d = Internal.newMutableList();

        /* renamed from: e */
        public List<String> f43349e = Internal.newMutableList();

        /* renamed from: f */
        public List<String> f43350f = Internal.newMutableList();

        /* renamed from: g */
        public Boolean f43351g;

        /* renamed from: h */
        public String f43352h;

        /* renamed from: i */
        public ReportType f43353i;

        /* renamed from: a */
        public MailSelectAllRequest build() {
            return new MailSelectAllRequest(this.f43345a, this.f43346b, this.f43347c, this.f43348d, this.f43349e, this.f43350f, this.f43351g, this.f43352h, this.f43353i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16880a newBuilder() {
        C16880a aVar = new C16880a();
        aVar.f43345a = this.label_id;
        aVar.f43346b = this.search;
        aVar.f43347c = this.max_timestamp;
        aVar.f43348d = Internal.copyOf("exclude_thread_ids", this.exclude_thread_ids);
        aVar.f43349e = Internal.copyOf("add_label_ids", this.add_label_ids);
        aVar.f43350f = Internal.copyOf("remove_label_ids", this.remove_label_ids);
        aVar.f43351g = this.is_unread;
        aVar.f43352h = this.move_to_folder;
        aVar.f43353i = this.report_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSelectAllRequest");
        StringBuilder sb = new StringBuilder();
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        if (this.search != null) {
            sb.append(", search=");
            sb.append(this.search);
        }
        if (this.max_timestamp != null) {
            sb.append(", max_timestamp=");
            sb.append(this.max_timestamp);
        }
        if (!this.exclude_thread_ids.isEmpty()) {
            sb.append(", exclude_thread_ids=");
            sb.append(this.exclude_thread_ids);
        }
        if (!this.add_label_ids.isEmpty()) {
            sb.append(", add_label_ids=");
            sb.append(this.add_label_ids);
        }
        if (!this.remove_label_ids.isEmpty()) {
            sb.append(", remove_label_ids=");
            sb.append(this.remove_label_ids);
        }
        if (this.is_unread != null) {
            sb.append(", is_unread=");
            sb.append(this.is_unread);
        }
        if (this.move_to_folder != null) {
            sb.append(", move_to_folder=");
            sb.append(this.move_to_folder);
        }
        if (this.report_type != null) {
            sb.append(", report_type=");
            sb.append(this.report_type);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSelectAllRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailSelectAllRequest(String str, MailAdvancedSearchRequest mailAdvancedSearchRequest, Long l, List<String> list, List<String> list2, List<String> list3, Boolean bool, String str2, ReportType reportType) {
        this(str, mailAdvancedSearchRequest, l, list, list2, list3, bool, str2, reportType, ByteString.EMPTY);
    }

    public MailSelectAllRequest(String str, MailAdvancedSearchRequest mailAdvancedSearchRequest, Long l, List<String> list, List<String> list2, List<String> list3, Boolean bool, String str2, ReportType reportType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_id = str;
        this.search = mailAdvancedSearchRequest;
        this.max_timestamp = l;
        this.exclude_thread_ids = Internal.immutableCopyOf("exclude_thread_ids", list);
        this.add_label_ids = Internal.immutableCopyOf("add_label_ids", list2);
        this.remove_label_ids = Internal.immutableCopyOf("remove_label_ids", list3);
        this.is_unread = bool;
        this.move_to_folder = str2;
        this.report_type = reportType;
    }
}
