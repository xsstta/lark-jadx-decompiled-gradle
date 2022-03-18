package com.bytedance.lark.pb.onboarding.v1;

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

public final class PutTrustedMailRequest extends Message<PutTrustedMailRequest, C18612a> {
    public static final ProtoAdapter<PutTrustedMailRequest> ADAPTER = new C18613b();
    public static final ProcessType DEFAULT_PROCESS_TYPE = ProcessType.ADD;
    private static final long serialVersionUID = 0;
    public final String mail;
    public final ProcessType process_type;

    public enum ProcessType implements WireEnum {
        ADD(1),
        Delete(2);
        
        public static final ProtoAdapter<ProcessType> ADAPTER = ProtoAdapter.newEnumAdapter(ProcessType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ProcessType fromValue(int i) {
            if (i == 1) {
                return ADD;
            }
            if (i != 2) {
                return null;
            }
            return Delete;
        }

        private ProcessType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PutTrustedMailRequest$b */
    private static final class C18613b extends ProtoAdapter<PutTrustedMailRequest> {
        C18613b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutTrustedMailRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutTrustedMailRequest putTrustedMailRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, putTrustedMailRequest.mail) + ProcessType.ADAPTER.encodedSizeWithTag(2, putTrustedMailRequest.process_type) + putTrustedMailRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutTrustedMailRequest decode(ProtoReader protoReader) throws IOException {
            C18612a aVar = new C18612a();
            aVar.f46115a = "";
            aVar.f46116b = ProcessType.ADD;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46115a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46116b = ProcessType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutTrustedMailRequest putTrustedMailRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, putTrustedMailRequest.mail);
            ProcessType.ADAPTER.encodeWithTag(protoWriter, 2, putTrustedMailRequest.process_type);
            protoWriter.writeBytes(putTrustedMailRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18612a newBuilder() {
        C18612a aVar = new C18612a();
        aVar.f46115a = this.mail;
        aVar.f46116b = this.process_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PutTrustedMailRequest$a */
    public static final class C18612a extends Message.Builder<PutTrustedMailRequest, C18612a> {

        /* renamed from: a */
        public String f46115a;

        /* renamed from: b */
        public ProcessType f46116b;

        /* renamed from: a */
        public PutTrustedMailRequest build() {
            ProcessType processType;
            String str = this.f46115a;
            if (str != null && (processType = this.f46116b) != null) {
                return new PutTrustedMailRequest(str, processType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mail", this.f46116b, "process_type");
        }

        /* renamed from: a */
        public C18612a mo64130a(ProcessType processType) {
            this.f46116b = processType;
            return this;
        }

        /* renamed from: a */
        public C18612a mo64131a(String str) {
            this.f46115a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "PutTrustedMailRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", mail=");
        sb.append(this.mail);
        sb.append(", process_type=");
        sb.append(this.process_type);
        StringBuilder replace = sb.replace(0, 2, "PutTrustedMailRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutTrustedMailRequest(String str, ProcessType processType) {
        this(str, processType, ByteString.EMPTY);
    }

    public PutTrustedMailRequest(String str, ProcessType processType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mail = str;
        this.process_type = processType;
    }
}
