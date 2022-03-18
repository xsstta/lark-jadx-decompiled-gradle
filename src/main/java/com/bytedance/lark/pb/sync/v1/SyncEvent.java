package com.bytedance.lark.pb.sync.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class SyncEvent extends Message<SyncEvent, C19435a> {
    public static final ProtoAdapter<SyncEvent> ADAPTER = new C19436b();
    public static final ByteString DEFAULT_DATA = ByteString.EMPTY;
    public static final SyncEventType DEFAULT_TYPE = SyncEventType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final ByteString data;
    public final SyncEventType type;

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncEvent$b */
    private static final class C19436b extends ProtoAdapter<SyncEvent> {
        C19436b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncEvent.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncEvent syncEvent) {
            int i;
            int encodedSizeWithTag = SyncEventType.ADAPTER.encodedSizeWithTag(1, syncEvent.type);
            if (syncEvent.data != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(2, syncEvent.data);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + syncEvent.unknownFields().size();
        }

        /* renamed from: a */
        public SyncEvent decode(ProtoReader protoReader) throws IOException {
            C19435a aVar = new C19435a();
            aVar.f47763a = SyncEventType.UNKNOWN;
            aVar.f47764b = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f47763a = SyncEventType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47764b = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SyncEvent syncEvent) throws IOException {
            SyncEventType.ADAPTER.encodeWithTag(protoWriter, 1, syncEvent.type);
            if (syncEvent.data != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, syncEvent.data);
            }
            protoWriter.writeBytes(syncEvent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncEvent$a */
    public static final class C19435a extends Message.Builder<SyncEvent, C19435a> {

        /* renamed from: a */
        public SyncEventType f47763a;

        /* renamed from: b */
        public ByteString f47764b;

        /* renamed from: a */
        public SyncEvent build() {
            SyncEventType syncEventType = this.f47763a;
            if (syncEventType != null) {
                return new SyncEvent(syncEventType, this.f47764b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(syncEventType, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C19435a newBuilder() {
        C19435a aVar = new C19435a();
        aVar.f47763a = this.type;
        aVar.f47764b = this.data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("sync", "SyncEvent");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        StringBuilder replace = sb.replace(0, 2, "SyncEvent{");
        replace.append('}');
        return replace.toString();
    }

    public SyncEvent(SyncEventType syncEventType, ByteString byteString) {
        this(syncEventType, byteString, ByteString.EMPTY);
    }

    public SyncEvent(SyncEventType syncEventType, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.type = syncEventType;
        this.data = byteString;
    }
}
