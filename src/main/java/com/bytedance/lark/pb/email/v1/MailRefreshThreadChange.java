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

public final class MailRefreshThreadChange extends Message<MailRefreshThreadChange, C17036a> {
    public static final ProtoAdapter<MailRefreshThreadChange> ADAPTER = new C17037b();
    private static final long serialVersionUID = 0;
    public final String label_id;
    public final List<String> label_ids;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailRefreshThreadChange$b */
    private static final class C17037b extends ProtoAdapter<MailRefreshThreadChange> {
        C17037b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailRefreshThreadChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailRefreshThreadChange mailRefreshThreadChange) {
            int i;
            if (mailRefreshThreadChange.label_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailRefreshThreadChange.label_id);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, mailRefreshThreadChange.label_ids) + mailRefreshThreadChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailRefreshThreadChange decode(ProtoReader protoReader) throws IOException {
            C17036a aVar = new C17036a();
            aVar.f43686a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43686a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43687b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailRefreshThreadChange mailRefreshThreadChange) throws IOException {
            if (mailRefreshThreadChange.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailRefreshThreadChange.label_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, mailRefreshThreadChange.label_ids);
            protoWriter.writeBytes(mailRefreshThreadChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailRefreshThreadChange$a */
    public static final class C17036a extends Message.Builder<MailRefreshThreadChange, C17036a> {

        /* renamed from: a */
        public String f43686a;

        /* renamed from: b */
        public List<String> f43687b = Internal.newMutableList();

        /* renamed from: a */
        public MailRefreshThreadChange build() {
            return new MailRefreshThreadChange(this.f43686a, this.f43687b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17036a newBuilder() {
        C17036a aVar = new C17036a();
        aVar.f43686a = this.label_id;
        aVar.f43687b = Internal.copyOf("label_ids", this.label_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailRefreshThreadChange");
        StringBuilder sb = new StringBuilder();
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        if (!this.label_ids.isEmpty()) {
            sb.append(", label_ids=");
            sb.append(this.label_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "MailRefreshThreadChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailRefreshThreadChange(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public MailRefreshThreadChange(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_id = str;
        this.label_ids = Internal.immutableCopyOf("label_ids", list);
    }
}
