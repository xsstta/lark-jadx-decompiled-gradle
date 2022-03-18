package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MailSyncEventResponse extends Message<MailSyncEventResponse, C16910a> {
    public static final ProtoAdapter<MailSyncEventResponse> ADAPTER = new C16911b();
    public static final SyncEvent DEFAULT_EVENT = SyncEvent.Sync;
    private static final long serialVersionUID = 0;
    public final SyncEvent event;

    public enum SyncEvent implements WireEnum {
        Sync(0),
        End(1);
        
        public static final ProtoAdapter<SyncEvent> ADAPTER = ProtoAdapter.newEnumAdapter(SyncEvent.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SyncEvent fromValue(int i) {
            if (i == 0) {
                return Sync;
            }
            if (i != 1) {
                return null;
            }
            return End;
        }

        private SyncEvent(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSyncEventResponse$b */
    private static final class C16911b extends ProtoAdapter<MailSyncEventResponse> {
        C16911b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSyncEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSyncEventResponse mailSyncEventResponse) {
            int i;
            if (mailSyncEventResponse.event != null) {
                i = SyncEvent.ADAPTER.encodedSizeWithTag(1, mailSyncEventResponse.event);
            } else {
                i = 0;
            }
            return i + mailSyncEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailSyncEventResponse decode(ProtoReader protoReader) throws IOException {
            C16910a aVar = new C16910a();
            aVar.f43395a = SyncEvent.Sync;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43395a = SyncEvent.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSyncEventResponse mailSyncEventResponse) throws IOException {
            if (mailSyncEventResponse.event != null) {
                SyncEvent.ADAPTER.encodeWithTag(protoWriter, 1, mailSyncEventResponse.event);
            }
            protoWriter.writeBytes(mailSyncEventResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSyncEventResponse$a */
    public static final class C16910a extends Message.Builder<MailSyncEventResponse, C16910a> {

        /* renamed from: a */
        public SyncEvent f43395a;

        /* renamed from: a */
        public MailSyncEventResponse build() {
            return new MailSyncEventResponse(this.f43395a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16910a newBuilder() {
        C16910a aVar = new C16910a();
        aVar.f43395a = this.event;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSyncEventResponse");
        StringBuilder sb = new StringBuilder();
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSyncEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailSyncEventResponse(SyncEvent syncEvent) {
        this(syncEvent, ByteString.EMPTY);
    }

    public MailSyncEventResponse(SyncEvent syncEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = syncEvent;
    }
}
