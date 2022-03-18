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

public final class NotifyAppLagResponse extends Message<NotifyAppLagResponse, C15103a> {
    public static final ProtoAdapter<NotifyAppLagResponse> ADAPTER = new C15104b();
    public static final PushStatus DEFAULT_PUSH_STATUS = PushStatus.NORMAL;
    private static final long serialVersionUID = 0;
    public final PushStatus push_status;

    public enum PushStatus implements WireEnum {
        NORMAL(1),
        DOWNGRADE(2);
        
        public static final ProtoAdapter<PushStatus> ADAPTER = ProtoAdapter.newEnumAdapter(PushStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PushStatus fromValue(int i) {
            if (i == 1) {
                return NORMAL;
            }
            if (i != 2) {
                return null;
            }
            return DOWNGRADE;
        }

        private PushStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.NotifyAppLagResponse$b */
    private static final class C15104b extends ProtoAdapter<NotifyAppLagResponse> {
        C15104b() {
            super(FieldEncoding.LENGTH_DELIMITED, NotifyAppLagResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(NotifyAppLagResponse notifyAppLagResponse) {
            int i;
            if (notifyAppLagResponse.push_status != null) {
                i = PushStatus.ADAPTER.encodedSizeWithTag(1, notifyAppLagResponse.push_status);
            } else {
                i = 0;
            }
            return i + notifyAppLagResponse.unknownFields().size();
        }

        /* renamed from: a */
        public NotifyAppLagResponse decode(ProtoReader protoReader) throws IOException {
            C15103a aVar = new C15103a();
            aVar.f40030a = PushStatus.NORMAL;
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
                        aVar.f40030a = PushStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NotifyAppLagResponse notifyAppLagResponse) throws IOException {
            if (notifyAppLagResponse.push_status != null) {
                PushStatus.ADAPTER.encodeWithTag(protoWriter, 1, notifyAppLagResponse.push_status);
            }
            protoWriter.writeBytes(notifyAppLagResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.NotifyAppLagResponse$a */
    public static final class C15103a extends Message.Builder<NotifyAppLagResponse, C15103a> {

        /* renamed from: a */
        public PushStatus f40030a;

        /* renamed from: a */
        public NotifyAppLagResponse build() {
            return new NotifyAppLagResponse(this.f40030a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15103a newBuilder() {
        C15103a aVar = new C15103a();
        aVar.f40030a = this.push_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "NotifyAppLagResponse");
        StringBuilder sb = new StringBuilder();
        if (this.push_status != null) {
            sb.append(", push_status=");
            sb.append(this.push_status);
        }
        StringBuilder replace = sb.replace(0, 2, "NotifyAppLagResponse{");
        replace.append('}');
        return replace.toString();
    }

    public NotifyAppLagResponse(PushStatus pushStatus) {
        this(pushStatus, ByteString.EMPTY);
    }

    public NotifyAppLagResponse(PushStatus pushStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.push_status = pushStatus;
    }
}
