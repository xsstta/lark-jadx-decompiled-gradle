package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MailBatchChangesEnd extends Message<MailBatchChangesEnd, C17008a> {
    public static final ProtoAdapter<MailBatchChangesEnd> ADAPTER = new C17009b();
    public static final Action DEFAULT_ACTION = Action.APPLY_RULE;
    public static final Integer DEFAULT_CODE = 0;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final Integer code;
    public final String session_id;

    public enum Action implements WireEnum {
        APPLY_RULE(0),
        SELECT_ALL(1);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return APPLY_RULE;
            }
            if (i != 1) {
                return null;
            }
            return SELECT_ALL;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailBatchChangesEnd$b */
    private static final class C17009b extends ProtoAdapter<MailBatchChangesEnd> {
        C17009b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailBatchChangesEnd.class);
        }

        /* renamed from: a */
        public int encodedSize(MailBatchChangesEnd mailBatchChangesEnd) {
            int i;
            int i2;
            int i3 = 0;
            if (mailBatchChangesEnd.session_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailBatchChangesEnd.session_id);
            } else {
                i = 0;
            }
            if (mailBatchChangesEnd.code != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, mailBatchChangesEnd.code);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailBatchChangesEnd.action != null) {
                i3 = Action.ADAPTER.encodedSizeWithTag(3, mailBatchChangesEnd.action);
            }
            return i4 + i3 + mailBatchChangesEnd.unknownFields().size();
        }

        /* renamed from: a */
        public MailBatchChangesEnd decode(ProtoReader protoReader) throws IOException {
            C17008a aVar = new C17008a();
            aVar.f43644a = "";
            aVar.f43645b = 0;
            aVar.f43646c = Action.APPLY_RULE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43644a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43645b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43646c = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailBatchChangesEnd mailBatchChangesEnd) throws IOException {
            if (mailBatchChangesEnd.session_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailBatchChangesEnd.session_id);
            }
            if (mailBatchChangesEnd.code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, mailBatchChangesEnd.code);
            }
            if (mailBatchChangesEnd.action != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 3, mailBatchChangesEnd.action);
            }
            protoWriter.writeBytes(mailBatchChangesEnd.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailBatchChangesEnd$a */
    public static final class C17008a extends Message.Builder<MailBatchChangesEnd, C17008a> {

        /* renamed from: a */
        public String f43644a;

        /* renamed from: b */
        public Integer f43645b;

        /* renamed from: c */
        public Action f43646c;

        /* renamed from: a */
        public MailBatchChangesEnd build() {
            return new MailBatchChangesEnd(this.f43644a, this.f43645b, this.f43646c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17008a newBuilder() {
        C17008a aVar = new C17008a();
        aVar.f43644a = this.session_id;
        aVar.f43645b = this.code;
        aVar.f43646c = this.action;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailBatchChangesEnd");
        StringBuilder sb = new StringBuilder();
        if (this.session_id != null) {
            sb.append(", session_id=");
            sb.append(this.session_id);
        }
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        StringBuilder replace = sb.replace(0, 2, "MailBatchChangesEnd{");
        replace.append('}');
        return replace.toString();
    }

    public MailBatchChangesEnd(String str, Integer num, Action action2) {
        this(str, num, action2, ByteString.EMPTY);
    }

    public MailBatchChangesEnd(String str, Integer num, Action action2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.session_id = str;
        this.code = num;
        this.action = action2;
    }
}
