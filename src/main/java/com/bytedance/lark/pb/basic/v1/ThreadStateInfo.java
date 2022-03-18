package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ThreadStateInfo extends Message<ThreadStateInfo, C15328a> {
    public static final ProtoAdapter<ThreadStateInfo> ADAPTER = new C15329b();
    public static final ThreadState DEFAULT_STATE = ThreadState.UNKNOWN_STATE;
    public static final Long DEFAULT_UPDATE_TIME_MS = 0L;
    private static final long serialVersionUID = 0;
    public final String operator_id;
    public final ThreadState state;
    public final Long update_time_ms;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ThreadStateInfo$b */
    private static final class C15329b extends ProtoAdapter<ThreadStateInfo> {
        C15329b() {
            super(FieldEncoding.LENGTH_DELIMITED, ThreadStateInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ThreadStateInfo threadStateInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (threadStateInfo.state != null) {
                i = ThreadState.ADAPTER.encodedSizeWithTag(1, threadStateInfo.state);
            } else {
                i = 0;
            }
            if (threadStateInfo.operator_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, threadStateInfo.operator_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (threadStateInfo.update_time_ms != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, threadStateInfo.update_time_ms);
            }
            return i4 + i3 + threadStateInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ThreadStateInfo decode(ProtoReader protoReader) throws IOException {
            C15328a aVar = new C15328a();
            aVar.f40605a = ThreadState.UNKNOWN_STATE;
            aVar.f40606b = "";
            aVar.f40607c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40605a = ThreadState.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f40606b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40607c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ThreadStateInfo threadStateInfo) throws IOException {
            if (threadStateInfo.state != null) {
                ThreadState.ADAPTER.encodeWithTag(protoWriter, 1, threadStateInfo.state);
            }
            if (threadStateInfo.operator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, threadStateInfo.operator_id);
            }
            if (threadStateInfo.update_time_ms != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, threadStateInfo.update_time_ms);
            }
            protoWriter.writeBytes(threadStateInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ThreadStateInfo$a */
    public static final class C15328a extends Message.Builder<ThreadStateInfo, C15328a> {

        /* renamed from: a */
        public ThreadState f40605a;

        /* renamed from: b */
        public String f40606b;

        /* renamed from: c */
        public Long f40607c;

        /* renamed from: a */
        public ThreadStateInfo build() {
            return new ThreadStateInfo(this.f40605a, this.f40606b, this.f40607c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15328a newBuilder() {
        C15328a aVar = new C15328a();
        aVar.f40605a = this.state;
        aVar.f40606b = this.operator_id;
        aVar.f40607c = this.update_time_ms;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ThreadStateInfo");
        StringBuilder sb = new StringBuilder();
        if (this.state != null) {
            sb.append(", state=");
            sb.append(this.state);
        }
        if (this.operator_id != null) {
            sb.append(", operator_id=");
            sb.append(this.operator_id);
        }
        if (this.update_time_ms != null) {
            sb.append(", update_time_ms=");
            sb.append(this.update_time_ms);
        }
        StringBuilder replace = sb.replace(0, 2, "ThreadStateInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ThreadStateInfo(ThreadState threadState, String str, Long l) {
        this(threadState, str, l, ByteString.EMPTY);
    }

    public ThreadStateInfo(ThreadState threadState, String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.state = threadState;
        this.operator_id = str;
        this.update_time_ms = l;
    }
}
