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

public final class PushMonitorAppLagStatusResponse extends Message<PushMonitorAppLagStatusResponse, C15133a> {
    public static final ProtoAdapter<PushMonitorAppLagStatusResponse> ADAPTER = new C15134b();
    public static final Status DEFAULT_STATUS = Status.START;
    private static final long serialVersionUID = 0;
    public final Status status;

    public enum Status implements WireEnum {
        START(1);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i != 1) {
                return null;
            }
            return START;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushMonitorAppLagStatusResponse$b */
    private static final class C15134b extends ProtoAdapter<PushMonitorAppLagStatusResponse> {
        C15134b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMonitorAppLagStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMonitorAppLagStatusResponse pushMonitorAppLagStatusResponse) {
            int i;
            if (pushMonitorAppLagStatusResponse.status != null) {
                i = Status.ADAPTER.encodedSizeWithTag(1, pushMonitorAppLagStatusResponse.status);
            } else {
                i = 0;
            }
            return i + pushMonitorAppLagStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushMonitorAppLagStatusResponse decode(ProtoReader protoReader) throws IOException {
            C15133a aVar = new C15133a();
            aVar.f40110a = Status.START;
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
                        aVar.f40110a = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushMonitorAppLagStatusResponse pushMonitorAppLagStatusResponse) throws IOException {
            if (pushMonitorAppLagStatusResponse.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 1, pushMonitorAppLagStatusResponse.status);
            }
            protoWriter.writeBytes(pushMonitorAppLagStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushMonitorAppLagStatusResponse$a */
    public static final class C15133a extends Message.Builder<PushMonitorAppLagStatusResponse, C15133a> {

        /* renamed from: a */
        public Status f40110a;

        /* renamed from: a */
        public PushMonitorAppLagStatusResponse build() {
            return new PushMonitorAppLagStatusResponse(this.f40110a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15133a newBuilder() {
        C15133a aVar = new C15133a();
        aVar.f40110a = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PushMonitorAppLagStatusResponse");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "PushMonitorAppLagStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushMonitorAppLagStatusResponse(Status status2) {
        this(status2, ByteString.EMPTY);
    }

    public PushMonitorAppLagStatusResponse(Status status2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = status2;
    }
}
