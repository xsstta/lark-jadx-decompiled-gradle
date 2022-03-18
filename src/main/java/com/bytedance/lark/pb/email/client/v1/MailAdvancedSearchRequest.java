package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailAdvancedSearchRequest extends Message<MailAdvancedSearchRequest, C16636a> {
    public static final ProtoAdapter<MailAdvancedSearchRequest> ADAPTER = new C16637b();
    public static final Long DEFAULT_END_DATE = 0L;
    public static final Boolean DEFAULT_HAS_ATTACHMENT = false;
    public static final Long DEFAULT_START_DATE = 0L;
    private static final long serialVersionUID = 0;
    public final Long end_date;
    public final List<String> excluded_keyword_list;
    public final String folder;
    public final List<String> from_list;
    public final Boolean has_attachment;
    public final String keyword;
    public final String label;
    public final String search_session;
    public final Long start_date;
    public final List<String> subject_list;
    public final List<String> to_list;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAdvancedSearchRequest$b */
    private static final class C16637b extends ProtoAdapter<MailAdvancedSearchRequest> {
        C16637b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailAdvancedSearchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailAdvancedSearchRequest mailAdvancedSearchRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (mailAdvancedSearchRequest.keyword != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, mailAdvancedSearchRequest.keyword);
            } else {
                i = 0;
            }
            if (mailAdvancedSearchRequest.start_date != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(6, mailAdvancedSearchRequest.start_date);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (mailAdvancedSearchRequest.end_date != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(7, mailAdvancedSearchRequest.end_date);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (mailAdvancedSearchRequest.has_attachment != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(8, mailAdvancedSearchRequest.has_attachment);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (mailAdvancedSearchRequest.label != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(9, mailAdvancedSearchRequest.label);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (mailAdvancedSearchRequest.search_session != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(10, mailAdvancedSearchRequest.search_session);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag = i11 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(11, mailAdvancedSearchRequest.from_list) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(12, mailAdvancedSearchRequest.to_list) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(13, mailAdvancedSearchRequest.subject_list) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(14, mailAdvancedSearchRequest.excluded_keyword_list);
            if (mailAdvancedSearchRequest.folder != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(15, mailAdvancedSearchRequest.folder);
            }
            return encodedSizeWithTag + i7 + mailAdvancedSearchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailAdvancedSearchRequest decode(ProtoReader protoReader) throws IOException {
            C16636a aVar = new C16636a();
            aVar.f43073a = "";
            aVar.f43074b = 0L;
            aVar.f43075c = 0L;
            aVar.f43076d = false;
            aVar.f43077e = "";
            aVar.f43078f = "";
            aVar.f43083k = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 4:
                            aVar.f43073a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 6:
                            aVar.f43074b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43075c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43076d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f43077e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f43078f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f43079g.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f43080h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            aVar.f43081i.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            aVar.f43082j.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            aVar.f43083k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailAdvancedSearchRequest mailAdvancedSearchRequest) throws IOException {
            if (mailAdvancedSearchRequest.keyword != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailAdvancedSearchRequest.keyword);
            }
            if (mailAdvancedSearchRequest.start_date != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, mailAdvancedSearchRequest.start_date);
            }
            if (mailAdvancedSearchRequest.end_date != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, mailAdvancedSearchRequest.end_date);
            }
            if (mailAdvancedSearchRequest.has_attachment != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, mailAdvancedSearchRequest.has_attachment);
            }
            if (mailAdvancedSearchRequest.label != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, mailAdvancedSearchRequest.label);
            }
            if (mailAdvancedSearchRequest.search_session != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, mailAdvancedSearchRequest.search_session);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 11, mailAdvancedSearchRequest.from_list);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 12, mailAdvancedSearchRequest.to_list);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 13, mailAdvancedSearchRequest.subject_list);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 14, mailAdvancedSearchRequest.excluded_keyword_list);
            if (mailAdvancedSearchRequest.folder != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, mailAdvancedSearchRequest.folder);
            }
            protoWriter.writeBytes(mailAdvancedSearchRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAdvancedSearchRequest$a */
    public static final class C16636a extends Message.Builder<MailAdvancedSearchRequest, C16636a> {

        /* renamed from: a */
        public String f43073a;

        /* renamed from: b */
        public Long f43074b;

        /* renamed from: c */
        public Long f43075c;

        /* renamed from: d */
        public Boolean f43076d;

        /* renamed from: e */
        public String f43077e;

        /* renamed from: f */
        public String f43078f;

        /* renamed from: g */
        public List<String> f43079g = Internal.newMutableList();

        /* renamed from: h */
        public List<String> f43080h = Internal.newMutableList();

        /* renamed from: i */
        public List<String> f43081i = Internal.newMutableList();

        /* renamed from: j */
        public List<String> f43082j = Internal.newMutableList();

        /* renamed from: k */
        public String f43083k;

        /* renamed from: a */
        public MailAdvancedSearchRequest build() {
            return new MailAdvancedSearchRequest(this.f43073a, this.f43074b, this.f43075c, this.f43076d, this.f43077e, this.f43078f, this.f43079g, this.f43080h, this.f43081i, this.f43082j, this.f43083k, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16636a newBuilder() {
        C16636a aVar = new C16636a();
        aVar.f43073a = this.keyword;
        aVar.f43074b = this.start_date;
        aVar.f43075c = this.end_date;
        aVar.f43076d = this.has_attachment;
        aVar.f43077e = this.label;
        aVar.f43078f = this.search_session;
        aVar.f43079g = Internal.copyOf("from_list", this.from_list);
        aVar.f43080h = Internal.copyOf("to_list", this.to_list);
        aVar.f43081i = Internal.copyOf("subject_list", this.subject_list);
        aVar.f43082j = Internal.copyOf("excluded_keyword_list", this.excluded_keyword_list);
        aVar.f43083k = this.folder;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailAdvancedSearchRequest");
        StringBuilder sb = new StringBuilder();
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
        }
        if (this.start_date != null) {
            sb.append(", start_date=");
            sb.append(this.start_date);
        }
        if (this.end_date != null) {
            sb.append(", end_date=");
            sb.append(this.end_date);
        }
        if (this.has_attachment != null) {
            sb.append(", has_attachment=");
            sb.append(this.has_attachment);
        }
        if (this.label != null) {
            sb.append(", label=");
            sb.append(this.label);
        }
        if (this.search_session != null) {
            sb.append(", search_session=");
            sb.append(this.search_session);
        }
        if (!this.from_list.isEmpty()) {
            sb.append(", from_list=");
            sb.append(this.from_list);
        }
        if (!this.to_list.isEmpty()) {
            sb.append(", to_list=");
            sb.append(this.to_list);
        }
        if (!this.subject_list.isEmpty()) {
            sb.append(", subject_list=");
            sb.append(this.subject_list);
        }
        if (!this.excluded_keyword_list.isEmpty()) {
            sb.append(", excluded_keyword_list=");
            sb.append(this.excluded_keyword_list);
        }
        if (this.folder != null) {
            sb.append(", folder=");
            sb.append(this.folder);
        }
        StringBuilder replace = sb.replace(0, 2, "MailAdvancedSearchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailAdvancedSearchRequest(String str, Long l, Long l2, Boolean bool, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, String str4) {
        this(str, l, l2, bool, str2, str3, list, list2, list3, list4, str4, ByteString.EMPTY);
    }

    public MailAdvancedSearchRequest(String str, Long l, Long l2, Boolean bool, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keyword = str;
        this.start_date = l;
        this.end_date = l2;
        this.has_attachment = bool;
        this.label = str2;
        this.search_session = str3;
        this.from_list = Internal.immutableCopyOf("from_list", list);
        this.to_list = Internal.immutableCopyOf("to_list", list2);
        this.subject_list = Internal.immutableCopyOf("subject_list", list3);
        this.excluded_keyword_list = Internal.immutableCopyOf("excluded_keyword_list", list4);
        this.folder = str4;
    }
}
