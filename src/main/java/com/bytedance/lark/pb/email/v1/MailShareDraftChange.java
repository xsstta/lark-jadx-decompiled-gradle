package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.Draft;
import com.bytedance.lark.pb.email.client.v1.DraftChangeAction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailShareDraftChange extends Message<MailShareDraftChange, C17042a> {
    public static final ProtoAdapter<MailShareDraftChange> ADAPTER = new C17043b();
    public static final DraftChangeAction DEFAULT_ACTION = DraftChangeAction.ADD;
    private static final long serialVersionUID = 0;
    public final DraftChangeAction action;
    public final Draft draft;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailShareDraftChange$b */
    private static final class C17043b extends ProtoAdapter<MailShareDraftChange> {
        C17043b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailShareDraftChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailShareDraftChange mailShareDraftChange) {
            int i;
            int i2;
            int i3 = 0;
            if (mailShareDraftChange.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailShareDraftChange.thread_id);
            } else {
                i = 0;
            }
            if (mailShareDraftChange.draft != null) {
                i2 = Draft.ADAPTER.encodedSizeWithTag(2, mailShareDraftChange.draft);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailShareDraftChange.action != null) {
                i3 = DraftChangeAction.ADAPTER.encodedSizeWithTag(3, mailShareDraftChange.action);
            }
            return i4 + i3 + mailShareDraftChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailShareDraftChange decode(ProtoReader protoReader) throws IOException {
            C17042a aVar = new C17042a();
            aVar.f43695a = "";
            aVar.f43697c = DraftChangeAction.ADD;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43695a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43696b = Draft.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43697c = DraftChangeAction.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailShareDraftChange mailShareDraftChange) throws IOException {
            if (mailShareDraftChange.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailShareDraftChange.thread_id);
            }
            if (mailShareDraftChange.draft != null) {
                Draft.ADAPTER.encodeWithTag(protoWriter, 2, mailShareDraftChange.draft);
            }
            if (mailShareDraftChange.action != null) {
                DraftChangeAction.ADAPTER.encodeWithTag(protoWriter, 3, mailShareDraftChange.action);
            }
            protoWriter.writeBytes(mailShareDraftChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailShareDraftChange$a */
    public static final class C17042a extends Message.Builder<MailShareDraftChange, C17042a> {

        /* renamed from: a */
        public String f43695a;

        /* renamed from: b */
        public Draft f43696b;

        /* renamed from: c */
        public DraftChangeAction f43697c;

        /* renamed from: a */
        public MailShareDraftChange build() {
            return new MailShareDraftChange(this.f43695a, this.f43696b, this.f43697c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17042a newBuilder() {
        C17042a aVar = new C17042a();
        aVar.f43695a = this.thread_id;
        aVar.f43696b = this.draft;
        aVar.f43697c = this.action;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailShareDraftChange");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.draft != null) {
            sb.append(", draft=");
            sb.append(this.draft);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        StringBuilder replace = sb.replace(0, 2, "MailShareDraftChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailShareDraftChange(String str, Draft draft2, DraftChangeAction draftChangeAction) {
        this(str, draft2, draftChangeAction, ByteString.EMPTY);
    }

    public MailShareDraftChange(String str, Draft draft2, DraftChangeAction draftChangeAction, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.draft = draft2;
        this.action = draftChangeAction;
    }
}
