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

public final class MailThreadChange extends Message<MailThreadChange, C17070a> {
    public static final ProtoAdapter<MailThreadChange> ADAPTER = new C17071b();
    public static final ThreadChangeSource DEFAULT_SOURCE = ThreadChangeSource.DEFAULT;
    private static final long serialVersionUID = 0;
    public final List<String> label_ids;
    public final ThreadChangeSource source;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailThreadChange$b */
    private static final class C17071b extends ProtoAdapter<MailThreadChange> {
        C17071b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailThreadChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailThreadChange mailThreadChange) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailThreadChange.label_ids);
            int i2 = 0;
            if (mailThreadChange.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mailThreadChange.thread_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mailThreadChange.source != null) {
                i2 = ThreadChangeSource.ADAPTER.encodedSizeWithTag(3, mailThreadChange.source);
            }
            return i3 + i2 + mailThreadChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailThreadChange decode(ProtoReader protoReader) throws IOException {
            C17070a aVar = new C17070a();
            aVar.f43733b = "";
            aVar.f43734c = ThreadChangeSource.DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43732a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43733b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43734c = ThreadChangeSource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailThreadChange mailThreadChange) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailThreadChange.label_ids);
            if (mailThreadChange.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailThreadChange.thread_id);
            }
            if (mailThreadChange.source != null) {
                ThreadChangeSource.ADAPTER.encodeWithTag(protoWriter, 3, mailThreadChange.source);
            }
            protoWriter.writeBytes(mailThreadChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailThreadChange$a */
    public static final class C17070a extends Message.Builder<MailThreadChange, C17070a> {

        /* renamed from: a */
        public List<String> f43732a = Internal.newMutableList();

        /* renamed from: b */
        public String f43733b;

        /* renamed from: c */
        public ThreadChangeSource f43734c;

        /* renamed from: a */
        public MailThreadChange build() {
            return new MailThreadChange(this.f43732a, this.f43733b, this.f43734c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17070a newBuilder() {
        C17070a aVar = new C17070a();
        aVar.f43732a = Internal.copyOf("label_ids", this.label_ids);
        aVar.f43733b = this.thread_id;
        aVar.f43734c = this.source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailThreadChange");
        StringBuilder sb = new StringBuilder();
        if (!this.label_ids.isEmpty()) {
            sb.append(", label_ids=");
            sb.append(this.label_ids);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        StringBuilder replace = sb.replace(0, 2, "MailThreadChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailThreadChange(List<String> list, String str, ThreadChangeSource threadChangeSource) {
        this(list, str, threadChangeSource, ByteString.EMPTY);
    }

    public MailThreadChange(List<String> list, String str, ThreadChangeSource threadChangeSource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_ids = Internal.immutableCopyOf("label_ids", list);
        this.thread_id = str;
        this.source = threadChangeSource;
    }
}
