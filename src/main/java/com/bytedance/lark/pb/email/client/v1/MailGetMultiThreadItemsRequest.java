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

public final class MailGetMultiThreadItemsRequest extends Message<MailGetMultiThreadItemsRequest, C16750a> {
    public static final ProtoAdapter<MailGetMultiThreadItemsRequest> ADAPTER = new C16751b();
    public static final Long DEFAULT_SORT_TIME_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    public final String from_label;
    public final Long sort_time_cursor;
    public final List<String> thread_ids;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMultiThreadItemsRequest$b */
    private static final class C16751b extends ProtoAdapter<MailGetMultiThreadItemsRequest> {
        C16751b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetMultiThreadItemsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetMultiThreadItemsRequest mailGetMultiThreadItemsRequest) {
            int i;
            int i2 = 0;
            if (mailGetMultiThreadItemsRequest.from_label != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetMultiThreadItemsRequest.from_label);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, mailGetMultiThreadItemsRequest.thread_ids);
            if (mailGetMultiThreadItemsRequest.sort_time_cursor != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, mailGetMultiThreadItemsRequest.sort_time_cursor);
            }
            return encodedSizeWithTag + i2 + mailGetMultiThreadItemsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetMultiThreadItemsRequest decode(ProtoReader protoReader) throws IOException {
            C16750a aVar = new C16750a();
            aVar.f43222a = "";
            aVar.f43224c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43222a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43223b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43224c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetMultiThreadItemsRequest mailGetMultiThreadItemsRequest) throws IOException {
            if (mailGetMultiThreadItemsRequest.from_label != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetMultiThreadItemsRequest.from_label);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, mailGetMultiThreadItemsRequest.thread_ids);
            if (mailGetMultiThreadItemsRequest.sort_time_cursor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mailGetMultiThreadItemsRequest.sort_time_cursor);
            }
            protoWriter.writeBytes(mailGetMultiThreadItemsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMultiThreadItemsRequest$a */
    public static final class C16750a extends Message.Builder<MailGetMultiThreadItemsRequest, C16750a> {

        /* renamed from: a */
        public String f43222a;

        /* renamed from: b */
        public List<String> f43223b = Internal.newMutableList();

        /* renamed from: c */
        public Long f43224c;

        /* renamed from: a */
        public MailGetMultiThreadItemsRequest build() {
            return new MailGetMultiThreadItemsRequest(this.f43222a, this.f43223b, this.f43224c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16750a mo59436a(Long l) {
            this.f43224c = l;
            return this;
        }

        /* renamed from: a */
        public C16750a mo59437a(String str) {
            this.f43222a = str;
            return this;
        }

        /* renamed from: a */
        public C16750a mo59438a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43223b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16750a newBuilder() {
        C16750a aVar = new C16750a();
        aVar.f43222a = this.from_label;
        aVar.f43223b = Internal.copyOf("thread_ids", this.thread_ids);
        aVar.f43224c = this.sort_time_cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetMultiThreadItemsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.from_label != null) {
            sb.append(", from_label=");
            sb.append(this.from_label);
        }
        if (!this.thread_ids.isEmpty()) {
            sb.append(", thread_ids=");
            sb.append(this.thread_ids);
        }
        if (this.sort_time_cursor != null) {
            sb.append(", sort_time_cursor=");
            sb.append(this.sort_time_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetMultiThreadItemsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetMultiThreadItemsRequest(String str, List<String> list, Long l) {
        this(str, list, l, ByteString.EMPTY);
    }

    public MailGetMultiThreadItemsRequest(String str, List<String> list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.from_label = str;
        this.thread_ids = Internal.immutableCopyOf("thread_ids", list);
        this.sort_time_cursor = l;
    }
}
