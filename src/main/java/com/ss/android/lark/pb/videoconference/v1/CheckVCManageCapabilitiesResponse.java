package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CheckVCManageCapabilitiesResponse extends Message<CheckVCManageCapabilitiesResponse, C50507a> {
    public static final ProtoAdapter<CheckVCManageCapabilitiesResponse> ADAPTER = new C50508b();
    public static final CheckResult DEFAULT_CHECK_RESULT = CheckResult.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final CheckResult check_result;
    public final List<String> keys;

    public enum CheckResult implements WireEnum {
        UNKNOWN(0),
        SUCCESS(1),
        NEEDNOTICE(2);
        
        public static final ProtoAdapter<CheckResult> ADAPTER = ProtoAdapter.newEnumAdapter(CheckResult.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CheckResult fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return NEEDNOTICE;
        }

        private CheckResult(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CheckVCManageCapabilitiesResponse$b */
    private static final class C50508b extends ProtoAdapter<CheckVCManageCapabilitiesResponse> {
        C50508b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckVCManageCapabilitiesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckVCManageCapabilitiesResponse checkVCManageCapabilitiesResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, checkVCManageCapabilitiesResponse.keys);
            if (checkVCManageCapabilitiesResponse.check_result != null) {
                i = CheckResult.ADAPTER.encodedSizeWithTag(2, checkVCManageCapabilitiesResponse.check_result);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + checkVCManageCapabilitiesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckVCManageCapabilitiesResponse decode(ProtoReader protoReader) throws IOException {
            C50507a aVar = new C50507a();
            aVar.f126098b = CheckResult.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126097a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126098b = CheckResult.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckVCManageCapabilitiesResponse checkVCManageCapabilitiesResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, checkVCManageCapabilitiesResponse.keys);
            if (checkVCManageCapabilitiesResponse.check_result != null) {
                CheckResult.ADAPTER.encodeWithTag(protoWriter, 2, checkVCManageCapabilitiesResponse.check_result);
            }
            protoWriter.writeBytes(checkVCManageCapabilitiesResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CheckVCManageCapabilitiesResponse$a */
    public static final class C50507a extends Message.Builder<CheckVCManageCapabilitiesResponse, C50507a> {

        /* renamed from: a */
        public List<String> f126097a = Internal.newMutableList();

        /* renamed from: b */
        public CheckResult f126098b;

        /* renamed from: a */
        public CheckVCManageCapabilitiesResponse build() {
            return new CheckVCManageCapabilitiesResponse(this.f126097a, this.f126098b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50507a newBuilder() {
        C50507a aVar = new C50507a();
        aVar.f126097a = Internal.copyOf("keys", this.keys);
        aVar.f126098b = this.check_result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CheckVCManageCapabilitiesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.keys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        if (this.check_result != null) {
            sb.append(", check_result=");
            sb.append(this.check_result);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckVCManageCapabilitiesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckVCManageCapabilitiesResponse(List<String> list, CheckResult checkResult) {
        this(list, checkResult, ByteString.EMPTY);
    }

    public CheckVCManageCapabilitiesResponse(List<String> list, CheckResult checkResult, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keys = Internal.immutableCopyOf("keys", list);
        this.check_result = checkResult;
    }
}
