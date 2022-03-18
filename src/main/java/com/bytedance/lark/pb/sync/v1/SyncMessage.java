package com.bytedance.lark.pb.sync.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SyncMessage extends Message<SyncMessage, C19439a> {
    public static final ProtoAdapter<SyncMessage> ADAPTER = new C19440b();
    public static final MsgType DEFAULT_MSG_TYPE = MsgType.Common;
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    public static final Long DEFAULT_SEQ = 0L;
    private static final long serialVersionUID = 0;
    public final MsgType msg_type;
    public final ByteString payload;
    public final Long seq;
    public final String topic_id;

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncMessage$b */
    private static final class C19440b extends ProtoAdapter<SyncMessage> {
        C19440b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncMessage.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncMessage syncMessage) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, syncMessage.topic_id) + ProtoAdapter.BYTES.encodedSizeWithTag(2, syncMessage.payload) + MsgType.ADAPTER.encodedSizeWithTag(3, syncMessage.msg_type);
            if (syncMessage.seq != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(4, syncMessage.seq);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + syncMessage.unknownFields().size();
        }

        /* renamed from: a */
        public SyncMessage decode(ProtoReader protoReader) throws IOException {
            C19439a aVar = new C19439a();
            aVar.f47767a = "";
            aVar.f47768b = ByteString.EMPTY;
            aVar.f47769c = MsgType.Common;
            aVar.f47770d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47767a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47768b = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f47769c = MsgType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47770d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SyncMessage syncMessage) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, syncMessage.topic_id);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, syncMessage.payload);
            MsgType.ADAPTER.encodeWithTag(protoWriter, 3, syncMessage.msg_type);
            if (syncMessage.seq != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, syncMessage.seq);
            }
            protoWriter.writeBytes(syncMessage.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19439a newBuilder() {
        C19439a aVar = new C19439a();
        aVar.f47767a = this.topic_id;
        aVar.f47768b = this.payload;
        aVar.f47769c = this.msg_type;
        aVar.f47770d = this.seq;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncMessage$a */
    public static final class C19439a extends Message.Builder<SyncMessage, C19439a> {

        /* renamed from: a */
        public String f47767a;

        /* renamed from: b */
        public ByteString f47768b;

        /* renamed from: c */
        public MsgType f47769c;

        /* renamed from: d */
        public Long f47770d;

        /* renamed from: a */
        public SyncMessage build() {
            ByteString byteString;
            MsgType msgType;
            String str = this.f47767a;
            if (str != null && (byteString = this.f47768b) != null && (msgType = this.f47769c) != null) {
                return new SyncMessage(str, byteString, msgType, this.f47770d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "topic_id", this.f47768b, "payload", this.f47769c, "msg_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("sync", "SyncMessage");
        StringBuilder sb = new StringBuilder();
        sb.append(", topic_id=");
        sb.append(this.topic_id);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", msg_type=");
        sb.append(this.msg_type);
        if (this.seq != null) {
            sb.append(", seq=");
            sb.append(this.seq);
        }
        StringBuilder replace = sb.replace(0, 2, "SyncMessage{");
        replace.append('}');
        return replace.toString();
    }

    public SyncMessage(String str, ByteString byteString, MsgType msgType, Long l) {
        this(str, byteString, msgType, l, ByteString.EMPTY);
    }

    public SyncMessage(String str, ByteString byteString, MsgType msgType, Long l, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.topic_id = str;
        this.payload = byteString;
        this.msg_type = msgType;
        this.seq = l;
    }
}
