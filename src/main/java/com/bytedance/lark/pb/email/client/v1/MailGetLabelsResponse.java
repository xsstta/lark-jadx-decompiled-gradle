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

public final class MailGetLabelsResponse extends Message<MailGetLabelsResponse, C16726a> {
    public static final ProtoAdapter<MailGetLabelsResponse> ADAPTER = new C16727b();
    private static final long serialVersionUID = 0;
    public final List<Label> labels;
    public final List<Label> labels_in_more;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLabelsResponse$b */
    private static final class C16727b extends ProtoAdapter<MailGetLabelsResponse> {
        C16727b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetLabelsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetLabelsResponse mailGetLabelsResponse) {
            return Label.ADAPTER.asRepeated().encodedSizeWithTag(1, mailGetLabelsResponse.labels) + Label.ADAPTER.asRepeated().encodedSizeWithTag(2, mailGetLabelsResponse.labels_in_more) + mailGetLabelsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetLabelsResponse decode(ProtoReader protoReader) throws IOException {
            C16726a aVar = new C16726a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43190a.add(Label.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43191b.add(Label.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetLabelsResponse mailGetLabelsResponse) throws IOException {
            Label.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailGetLabelsResponse.labels);
            Label.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mailGetLabelsResponse.labels_in_more);
            protoWriter.writeBytes(mailGetLabelsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLabelsResponse$a */
    public static final class C16726a extends Message.Builder<MailGetLabelsResponse, C16726a> {

        /* renamed from: a */
        public List<Label> f43190a = Internal.newMutableList();

        /* renamed from: b */
        public List<Label> f43191b = Internal.newMutableList();

        /* renamed from: a */
        public MailGetLabelsResponse build() {
            return new MailGetLabelsResponse(this.f43190a, this.f43191b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16726a newBuilder() {
        C16726a aVar = new C16726a();
        aVar.f43190a = Internal.copyOf("labels", this.labels);
        aVar.f43191b = Internal.copyOf("labels_in_more", this.labels_in_more);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetLabelsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.labels.isEmpty()) {
            sb.append(", labels=");
            sb.append(this.labels);
        }
        if (!this.labels_in_more.isEmpty()) {
            sb.append(", labels_in_more=");
            sb.append(this.labels_in_more);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetLabelsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetLabelsResponse(List<Label> list, List<Label> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public MailGetLabelsResponse(List<Label> list, List<Label> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.labels = Internal.immutableCopyOf("labels", list);
        this.labels_in_more = Internal.immutableCopyOf("labels_in_more", list2);
    }
}
