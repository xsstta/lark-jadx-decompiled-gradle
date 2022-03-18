package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.Label;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailLabelChange extends Message<MailLabelChange, C17018a> {
    public static final ProtoAdapter<MailLabelChange> ADAPTER = new C17019b();
    private static final long serialVersionUID = 0;
    public final List<Label> labels;
    public final List<Label> labels_in_more;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailLabelChange$b */
    private static final class C17019b extends ProtoAdapter<MailLabelChange> {
        C17019b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailLabelChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailLabelChange mailLabelChange) {
            return Label.ADAPTER.asRepeated().encodedSizeWithTag(1, mailLabelChange.labels) + Label.ADAPTER.asRepeated().encodedSizeWithTag(2, mailLabelChange.labels_in_more) + mailLabelChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailLabelChange decode(ProtoReader protoReader) throws IOException {
            C17018a aVar = new C17018a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43666a.add(Label.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43667b.add(Label.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailLabelChange mailLabelChange) throws IOException {
            Label.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailLabelChange.labels);
            Label.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mailLabelChange.labels_in_more);
            protoWriter.writeBytes(mailLabelChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailLabelChange$a */
    public static final class C17018a extends Message.Builder<MailLabelChange, C17018a> {

        /* renamed from: a */
        public List<Label> f43666a = Internal.newMutableList();

        /* renamed from: b */
        public List<Label> f43667b = Internal.newMutableList();

        /* renamed from: a */
        public MailLabelChange build() {
            return new MailLabelChange(this.f43666a, this.f43667b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17018a newBuilder() {
        C17018a aVar = new C17018a();
        aVar.f43666a = Internal.copyOf("labels", this.labels);
        aVar.f43667b = Internal.copyOf("labels_in_more", this.labels_in_more);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailLabelChange");
        StringBuilder sb = new StringBuilder();
        if (!this.labels.isEmpty()) {
            sb.append(", labels=");
            sb.append(this.labels);
        }
        if (!this.labels_in_more.isEmpty()) {
            sb.append(", labels_in_more=");
            sb.append(this.labels_in_more);
        }
        StringBuilder replace = sb.replace(0, 2, "MailLabelChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailLabelChange(List<Label> list, List<Label> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public MailLabelChange(List<Label> list, List<Label> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.labels = Internal.immutableCopyOf("labels", list);
        this.labels_in_more = Internal.immutableCopyOf("labels_in_more", list2);
    }
}
