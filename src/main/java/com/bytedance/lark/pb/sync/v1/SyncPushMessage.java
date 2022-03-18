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

public final class SyncPushMessage extends Message<SyncPushMessage, C19445a> {
    public static final ProtoAdapter<SyncPushMessage> ADAPTER = new C19446b();
    private static final long serialVersionUID = 0;
    public final String app_name;
    public final SyncMessage message;

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncPushMessage$b */
    private static final class C19446b extends ProtoAdapter<SyncPushMessage> {
        C19446b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncPushMessage.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncPushMessage syncPushMessage) {
            return SyncMessage.ADAPTER.encodedSizeWithTag(1, syncPushMessage.message) + ProtoAdapter.STRING.encodedSizeWithTag(2, syncPushMessage.app_name) + syncPushMessage.unknownFields().size();
        }

        /* renamed from: a */
        public SyncPushMessage decode(ProtoReader protoReader) throws IOException {
            C19445a aVar = new C19445a();
            aVar.f47778b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47777a = SyncMessage.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47778b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SyncPushMessage syncPushMessage) throws IOException {
            SyncMessage.ADAPTER.encodeWithTag(protoWriter, 1, syncPushMessage.message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, syncPushMessage.app_name);
            protoWriter.writeBytes(syncPushMessage.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19445a newBuilder() {
        C19445a aVar = new C19445a();
        aVar.f47777a = this.message;
        aVar.f47778b = this.app_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncPushMessage$a */
    public static final class C19445a extends Message.Builder<SyncPushMessage, C19445a> {

        /* renamed from: a */
        public SyncMessage f47777a;

        /* renamed from: b */
        public String f47778b;

        /* renamed from: a */
        public SyncPushMessage build() {
            String str;
            SyncMessage syncMessage = this.f47777a;
            if (syncMessage != null && (str = this.f47778b) != null) {
                return new SyncPushMessage(syncMessage, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(syncMessage, "message", this.f47778b, "app_name");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("sync", "SyncPushMessage");
        StringBuilder sb = new StringBuilder();
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", app_name=");
        sb.append(this.app_name);
        StringBuilder replace = sb.replace(0, 2, "SyncPushMessage{");
        replace.append('}');
        return replace.toString();
    }

    public SyncPushMessage(SyncMessage syncMessage, String str) {
        this(syncMessage, str, ByteString.EMPTY);
    }

    public SyncPushMessage(SyncMessage syncMessage, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = syncMessage;
        this.app_name = str;
    }
}
