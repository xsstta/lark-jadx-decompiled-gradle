package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GrootCell extends Message<GrootCell, C50735a> {
    public static final ProtoAdapter<GrootCell> ADAPTER = new C50736b();
    public static final Action DEFAULT_ACTION = Action.CLIENT_REQ;
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    public static final Integer DEFAULT_UP_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final ByteString payload;
    public final Integer up_version;

    public enum Action implements WireEnum {
        CLIENT_REQ(1),
        SERVER_SET(3),
        TRIGGER(4);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 1) {
                return CLIENT_REQ;
            }
            if (i == 3) {
                return SERVER_SET;
            }
            if (i != 4) {
                return null;
            }
            return TRIGGER;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GrootCell$b */
    private static final class C50736b extends ProtoAdapter<GrootCell> {
        C50736b() {
            super(FieldEncoding.LENGTH_DELIMITED, GrootCell.class);
        }

        /* renamed from: a */
        public int encodedSize(GrootCell grootCell) {
            int i;
            int encodedSizeWithTag = Action.ADAPTER.encodedSizeWithTag(1, grootCell.action) + ProtoAdapter.BYTES.encodedSizeWithTag(2, grootCell.payload);
            if (grootCell.up_version != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(4, grootCell.up_version);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + grootCell.unknownFields().size();
        }

        /* renamed from: a */
        public GrootCell decode(ProtoReader protoReader) throws IOException {
            C50735a aVar = new C50735a();
            aVar.f126485a = Action.CLIENT_REQ;
            aVar.f126486b = ByteString.EMPTY;
            aVar.f126487c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126485a = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126486b = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126487c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GrootCell grootCell) throws IOException {
            Action.ADAPTER.encodeWithTag(protoWriter, 1, grootCell.action);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, grootCell.payload);
            if (grootCell.up_version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, grootCell.up_version);
            }
            protoWriter.writeBytes(grootCell.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50735a newBuilder() {
        C50735a aVar = new C50735a();
        aVar.f126485a = this.action;
        aVar.f126486b = this.payload;
        aVar.f126487c = this.up_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GrootCell$a */
    public static final class C50735a extends Message.Builder<GrootCell, C50735a> {

        /* renamed from: a */
        public Action f126485a;

        /* renamed from: b */
        public ByteString f126486b;

        /* renamed from: c */
        public Integer f126487c;

        /* renamed from: a */
        public GrootCell build() {
            ByteString byteString;
            Action action = this.f126485a;
            if (action != null && (byteString = this.f126486b) != null) {
                return new GrootCell(action, byteString, this.f126487c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(action, "action", this.f126486b, "payload");
        }

        /* renamed from: a */
        public C50735a mo175463a(Action action) {
            this.f126485a = action;
            return this;
        }

        /* renamed from: a */
        public C50735a mo175464a(ByteString byteString) {
            this.f126486b = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GrootCell");
        StringBuilder sb = new StringBuilder();
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", payload=");
        sb.append(this.payload);
        if (this.up_version != null) {
            sb.append(", up_version=");
            sb.append(this.up_version);
        }
        StringBuilder replace = sb.replace(0, 2, "GrootCell{");
        replace.append('}');
        return replace.toString();
    }

    public GrootCell(Action action2, ByteString byteString, Integer num) {
        this(action2, byteString, num, ByteString.EMPTY);
    }

    public GrootCell(Action action2, ByteString byteString, Integer num, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.action = action2;
        this.payload = byteString;
        this.up_version = num;
    }
}
