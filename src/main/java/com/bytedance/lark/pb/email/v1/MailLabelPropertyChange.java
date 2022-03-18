package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.Label;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailLabelPropertyChange extends Message<MailLabelPropertyChange, C17020a> {
    public static final ProtoAdapter<MailLabelPropertyChange> ADAPTER = new C17021b();
    public static final Boolean DEFAULT_IS_DELETE = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_delete;
    public final Label label;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailLabelPropertyChange$b */
    private static final class C17021b extends ProtoAdapter<MailLabelPropertyChange> {
        C17021b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailLabelPropertyChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailLabelPropertyChange mailLabelPropertyChange) {
            int i;
            int i2 = 0;
            if (mailLabelPropertyChange.label != null) {
                i = Label.ADAPTER.encodedSizeWithTag(1, mailLabelPropertyChange.label);
            } else {
                i = 0;
            }
            if (mailLabelPropertyChange.is_delete != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, mailLabelPropertyChange.is_delete);
            }
            return i + i2 + mailLabelPropertyChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailLabelPropertyChange decode(ProtoReader protoReader) throws IOException {
            C17020a aVar = new C17020a();
            aVar.f43669b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43668a = Label.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43669b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailLabelPropertyChange mailLabelPropertyChange) throws IOException {
            if (mailLabelPropertyChange.label != null) {
                Label.ADAPTER.encodeWithTag(protoWriter, 1, mailLabelPropertyChange.label);
            }
            if (mailLabelPropertyChange.is_delete != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailLabelPropertyChange.is_delete);
            }
            protoWriter.writeBytes(mailLabelPropertyChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailLabelPropertyChange$a */
    public static final class C17020a extends Message.Builder<MailLabelPropertyChange, C17020a> {

        /* renamed from: a */
        public Label f43668a;

        /* renamed from: b */
        public Boolean f43669b;

        /* renamed from: a */
        public MailLabelPropertyChange build() {
            return new MailLabelPropertyChange(this.f43668a, this.f43669b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17020a newBuilder() {
        C17020a aVar = new C17020a();
        aVar.f43668a = this.label;
        aVar.f43669b = this.is_delete;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailLabelPropertyChange");
        StringBuilder sb = new StringBuilder();
        if (this.label != null) {
            sb.append(", label=");
            sb.append(this.label);
        }
        if (this.is_delete != null) {
            sb.append(", is_delete=");
            sb.append(this.is_delete);
        }
        StringBuilder replace = sb.replace(0, 2, "MailLabelPropertyChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailLabelPropertyChange(Label label2, Boolean bool) {
        this(label2, bool, ByteString.EMPTY);
    }

    public MailLabelPropertyChange(Label label2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label = label2;
        this.is_delete = bool;
    }
}
