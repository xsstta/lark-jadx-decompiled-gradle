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

public final class SyncPushEvent extends Message<SyncPushEvent, C19443a> {
    public static final ProtoAdapter<SyncPushEvent> ADAPTER = new C19444b();
    private static final long serialVersionUID = 0;
    public final String app_name;
    public final SyncEvent sync_event;
    public final String topic_id;

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncPushEvent$b */
    private static final class C19444b extends ProtoAdapter<SyncPushEvent> {
        C19444b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncPushEvent.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncPushEvent syncPushEvent) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, syncPushEvent.app_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, syncPushEvent.topic_id) + SyncEvent.ADAPTER.encodedSizeWithTag(3, syncPushEvent.sync_event) + syncPushEvent.unknownFields().size();
        }

        /* renamed from: a */
        public SyncPushEvent decode(ProtoReader protoReader) throws IOException {
            C19443a aVar = new C19443a();
            aVar.f47774a = "";
            aVar.f47775b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47774a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47775b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47776c = SyncEvent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SyncPushEvent syncPushEvent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, syncPushEvent.app_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, syncPushEvent.topic_id);
            SyncEvent.ADAPTER.encodeWithTag(protoWriter, 3, syncPushEvent.sync_event);
            protoWriter.writeBytes(syncPushEvent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19443a newBuilder() {
        C19443a aVar = new C19443a();
        aVar.f47774a = this.app_name;
        aVar.f47775b = this.topic_id;
        aVar.f47776c = this.sync_event;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncPushEvent$a */
    public static final class C19443a extends Message.Builder<SyncPushEvent, C19443a> {

        /* renamed from: a */
        public String f47774a;

        /* renamed from: b */
        public String f47775b;

        /* renamed from: c */
        public SyncEvent f47776c;

        /* renamed from: a */
        public SyncPushEvent build() {
            String str;
            SyncEvent syncEvent;
            String str2 = this.f47774a;
            if (str2 != null && (str = this.f47775b) != null && (syncEvent = this.f47776c) != null) {
                return new SyncPushEvent(str2, str, syncEvent, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "app_name", this.f47775b, "topic_id", this.f47776c, "sync_event");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("sync", "SyncPushEvent");
        StringBuilder sb = new StringBuilder();
        sb.append(", app_name=");
        sb.append(this.app_name);
        sb.append(", topic_id=");
        sb.append(this.topic_id);
        sb.append(", sync_event=");
        sb.append(this.sync_event);
        StringBuilder replace = sb.replace(0, 2, "SyncPushEvent{");
        replace.append('}');
        return replace.toString();
    }

    public SyncPushEvent(String str, String str2, SyncEvent syncEvent) {
        this(str, str2, syncEvent, ByteString.EMPTY);
    }

    public SyncPushEvent(String str, String str2, SyncEvent syncEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_name = str;
        this.topic_id = str2;
        this.sync_event = syncEvent;
    }
}
