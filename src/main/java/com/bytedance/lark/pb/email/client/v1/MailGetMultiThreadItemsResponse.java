package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadListResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailGetMultiThreadItemsResponse extends Message<MailGetMultiThreadItemsResponse, C16752a> {
    public static final ProtoAdapter<MailGetMultiThreadItemsResponse> ADAPTER = new C16753b();
    private static final long serialVersionUID = 0;
    public final List<String> disappeared_thread_ids;
    public final List<MailGetThreadListResponse.ThreadItem> thread_items;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMultiThreadItemsResponse$b */
    private static final class C16753b extends ProtoAdapter<MailGetMultiThreadItemsResponse> {
        C16753b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetMultiThreadItemsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetMultiThreadItemsResponse mailGetMultiThreadItemsResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailGetMultiThreadItemsResponse.disappeared_thread_ids) + MailGetThreadListResponse.ThreadItem.ADAPTER.asRepeated().encodedSizeWithTag(2, mailGetMultiThreadItemsResponse.thread_items) + mailGetMultiThreadItemsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetMultiThreadItemsResponse decode(ProtoReader protoReader) throws IOException {
            C16752a aVar = new C16752a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43225a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43226b.add(MailGetThreadListResponse.ThreadItem.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetMultiThreadItemsResponse mailGetMultiThreadItemsResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailGetMultiThreadItemsResponse.disappeared_thread_ids);
            MailGetThreadListResponse.ThreadItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mailGetMultiThreadItemsResponse.thread_items);
            protoWriter.writeBytes(mailGetMultiThreadItemsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMultiThreadItemsResponse$a */
    public static final class C16752a extends Message.Builder<MailGetMultiThreadItemsResponse, C16752a> {

        /* renamed from: a */
        public List<String> f43225a = Internal.newMutableList();

        /* renamed from: b */
        public List<MailGetThreadListResponse.ThreadItem> f43226b = Internal.newMutableList();

        /* renamed from: a */
        public MailGetMultiThreadItemsResponse build() {
            return new MailGetMultiThreadItemsResponse(this.f43225a, this.f43226b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16752a newBuilder() {
        C16752a aVar = new C16752a();
        aVar.f43225a = Internal.copyOf("disappeared_thread_ids", this.disappeared_thread_ids);
        aVar.f43226b = Internal.copyOf("thread_items", this.thread_items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetMultiThreadItemsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.disappeared_thread_ids.isEmpty()) {
            sb.append(", disappeared_thread_ids=");
            sb.append(this.disappeared_thread_ids);
        }
        if (!this.thread_items.isEmpty()) {
            sb.append(", thread_items=");
            sb.append(this.thread_items);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetMultiThreadItemsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetMultiThreadItemsResponse(List<String> list, List<MailGetThreadListResponse.ThreadItem> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public MailGetMultiThreadItemsResponse(List<String> list, List<MailGetThreadListResponse.ThreadItem> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.disappeared_thread_ids = Internal.immutableCopyOf("disappeared_thread_ids", list);
        this.thread_items = Internal.immutableCopyOf("thread_items", list2);
    }
}
