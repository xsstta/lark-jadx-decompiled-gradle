package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class Packet extends Message<Packet, C15109a> {
    public static final ProtoAdapter<Packet> ADAPTER = new C15110b();
    public static final Command DEFAULT_CMD = Command.UNKNOWN_COMMAND;
    public static final Boolean DEFAULT_IS_ERR = false;
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    public static final Integer DEFAULT_STATUS = 0;
    public static final StreamStatus DEFAULT_STREAM_STATUS = StreamStatus.ACTIVE;
    public static final Long DEFAULT_TASK_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Command cmd;
    public final String context_id;
    public final Boolean is_err;
    public final String mail_account_id;
    public final String message;
    public final ByteString payload;
    public final String start_callback_time;
    public final Integer status;
    public final StreamStatus stream_status;
    public final Long task_id;
    public final Trace trace;
    public final String user_id;

    public enum StreamStatus implements WireEnum {
        ACTIVE(1),
        FINAL_WITH_PAYLOAD(2),
        FINAL_WITHOUT_PAYLOAD(3);
        
        public static final ProtoAdapter<StreamStatus> ADAPTER = ProtoAdapter.newEnumAdapter(StreamStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static StreamStatus fromValue(int i) {
            if (i == 1) {
                return ACTIVE;
            }
            if (i == 2) {
                return FINAL_WITH_PAYLOAD;
            }
            if (i != 3) {
                return null;
            }
            return FINAL_WITHOUT_PAYLOAD;
        }

        private StreamStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Packet$b */
    private static final class C15110b extends ProtoAdapter<Packet> {
        C15110b() {
            super(FieldEncoding.LENGTH_DELIMITED, Packet.class);
        }

        /* renamed from: a */
        public int encodedSize(Packet packet) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12 = 0;
            if (packet.cmd != null) {
                i = Command.ADAPTER.encodedSizeWithTag(1, packet.cmd);
            } else {
                i = 0;
            }
            if (packet.status != null) {
                i2 = ProtoAdapter.UINT32.encodedSizeWithTag(2, packet.status);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (packet.message != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, packet.message);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (packet.context_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, packet.context_id);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (packet.user_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, packet.user_id);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (packet.start_callback_time != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, packet.start_callback_time);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (packet.task_id != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, packet.task_id);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (packet.is_err != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, packet.is_err);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (packet.stream_status != null) {
                i9 = StreamStatus.ADAPTER.encodedSizeWithTag(9, packet.stream_status);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (packet.mail_account_id != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, packet.mail_account_id);
            } else {
                i10 = 0;
            }
            int i21 = i20 + i10;
            if (packet.trace != null) {
                i11 = Trace.ADAPTER.encodedSizeWithTag(11, packet.trace);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (packet.payload != null) {
                i12 = ProtoAdapter.BYTES.encodedSizeWithTag(9999, packet.payload);
            }
            return i22 + i12 + packet.unknownFields().size();
        }

        /* renamed from: a */
        public Packet decode(ProtoReader protoReader) throws IOException {
            C15109a aVar = new C15109a();
            aVar.f40060a = Command.UNKNOWN_COMMAND;
            aVar.f40061b = 0;
            aVar.f40062c = "";
            aVar.f40063d = "";
            aVar.f40064e = "";
            aVar.f40065f = "";
            aVar.f40066g = 0L;
            aVar.f40067h = false;
            aVar.f40068i = StreamStatus.ACTIVE;
            aVar.f40069j = "";
            aVar.f40071l = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 9999) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f40060a = Command.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f40061b = ProtoAdapter.UINT32.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f40062c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f40063d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f40064e = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f40065f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f40066g = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f40067h = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 9:
                            try {
                                aVar.f40068i = StreamStatus.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 10:
                            aVar.f40069j = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f40070k = Trace.ADAPTER.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f40071l = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Packet packet) throws IOException {
            if (packet.cmd != null) {
                Command.ADAPTER.encodeWithTag(protoWriter, 1, packet.cmd);
            }
            if (packet.status != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, packet.status);
            }
            if (packet.message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, packet.message);
            }
            if (packet.context_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, packet.context_id);
            }
            if (packet.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, packet.user_id);
            }
            if (packet.start_callback_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, packet.start_callback_time);
            }
            if (packet.task_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, packet.task_id);
            }
            if (packet.is_err != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, packet.is_err);
            }
            if (packet.stream_status != null) {
                StreamStatus.ADAPTER.encodeWithTag(protoWriter, 9, packet.stream_status);
            }
            if (packet.mail_account_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, packet.mail_account_id);
            }
            if (packet.trace != null) {
                Trace.ADAPTER.encodeWithTag(protoWriter, 11, packet.trace);
            }
            if (packet.payload != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 9999, packet.payload);
            }
            protoWriter.writeBytes(packet.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Packet$a */
    public static final class C15109a extends Message.Builder<Packet, C15109a> {

        /* renamed from: a */
        public Command f40060a;

        /* renamed from: b */
        public Integer f40061b;

        /* renamed from: c */
        public String f40062c;

        /* renamed from: d */
        public String f40063d;

        /* renamed from: e */
        public String f40064e;

        /* renamed from: f */
        public String f40065f;

        /* renamed from: g */
        public Long f40066g;

        /* renamed from: h */
        public Boolean f40067h;

        /* renamed from: i */
        public StreamStatus f40068i;

        /* renamed from: j */
        public String f40069j;

        /* renamed from: k */
        public Trace f40070k;

        /* renamed from: l */
        public ByteString f40071l;

        /* renamed from: a */
        public Packet build() {
            return new Packet(this.f40060a, this.f40061b, this.f40062c, this.f40063d, this.f40064e, this.f40065f, this.f40066g, this.f40067h, this.f40068i, this.f40069j, this.f40070k, this.f40071l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15109a newBuilder() {
        C15109a aVar = new C15109a();
        aVar.f40060a = this.cmd;
        aVar.f40061b = this.status;
        aVar.f40062c = this.message;
        aVar.f40063d = this.context_id;
        aVar.f40064e = this.user_id;
        aVar.f40065f = this.start_callback_time;
        aVar.f40066g = this.task_id;
        aVar.f40067h = this.is_err;
        aVar.f40068i = this.stream_status;
        aVar.f40069j = this.mail_account_id;
        aVar.f40070k = this.trace;
        aVar.f40071l = this.payload;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Packet");
        StringBuilder sb = new StringBuilder();
        if (this.cmd != null) {
            sb.append(", cmd=");
            sb.append(this.cmd);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (this.context_id != null) {
            sb.append(", context_id=");
            sb.append(this.context_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.start_callback_time != null) {
            sb.append(", start_callback_time=");
            sb.append(this.start_callback_time);
        }
        if (this.task_id != null) {
            sb.append(", task_id=");
            sb.append(this.task_id);
        }
        if (this.is_err != null) {
            sb.append(", is_err=");
            sb.append(this.is_err);
        }
        if (this.stream_status != null) {
            sb.append(", stream_status=");
            sb.append(this.stream_status);
        }
        if (this.mail_account_id != null) {
            sb.append(", mail_account_id=");
            sb.append(this.mail_account_id);
        }
        if (this.trace != null) {
            sb.append(", trace=");
            sb.append(this.trace);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        StringBuilder replace = sb.replace(0, 2, "Packet{");
        replace.append('}');
        return replace.toString();
    }

    public Packet(Command command, Integer num, String str, String str2, String str3, String str4, Long l, Boolean bool, StreamStatus streamStatus, String str5, Trace trace2, ByteString byteString) {
        this(command, num, str, str2, str3, str4, l, bool, streamStatus, str5, trace2, byteString, ByteString.EMPTY);
    }

    public Packet(Command command, Integer num, String str, String str2, String str3, String str4, Long l, Boolean bool, StreamStatus streamStatus, String str5, Trace trace2, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.cmd = command;
        this.status = num;
        this.message = str;
        this.context_id = str2;
        this.user_id = str3;
        this.start_callback_time = str4;
        this.task_id = l;
        this.is_err = bool;
        this.stream_status = streamStatus;
        this.mail_account_id = str5;
        this.trace = trace2;
        this.payload = byteString;
    }
}
