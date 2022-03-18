package com.ss.android.lark.pb.calendarevents;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class CheckInByQRCodeResponse extends Message<CheckInByQRCodeResponse, C49564a> {
    public static final ProtoAdapter<CheckInByQRCodeResponse> ADAPTER = new C49565b();
    private static final long serialVersionUID = 0;
    public final Status mcheck_in_resp;

    public enum Status implements WireEnum {
        UNKNOWN(0),
        SUCCESS(1),
        RELEASED(2),
        UNAUTHORIZED(3),
        INACTIVATED(4);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return RELEASED;
            }
            if (i == 3) {
                return UNAUTHORIZED;
            }
            if (i != 4) {
                return null;
            }
            return INACTIVATED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.calendarevents.CheckInByQRCodeResponse$b */
    private static final class C49565b extends ProtoAdapter<CheckInByQRCodeResponse> {
        C49565b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckInByQRCodeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckInByQRCodeResponse checkInByQRCodeResponse) {
            int i;
            if (checkInByQRCodeResponse.mcheck_in_resp != null) {
                i = Status.ADAPTER.encodedSizeWithTag(1, checkInByQRCodeResponse.mcheck_in_resp);
            } else {
                i = 0;
            }
            return i + checkInByQRCodeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckInByQRCodeResponse decode(ProtoReader protoReader) throws IOException {
            C49564a aVar = new C49564a();
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
                        aVar.f124181a = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckInByQRCodeResponse checkInByQRCodeResponse) throws IOException {
            if (checkInByQRCodeResponse.mcheck_in_resp != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 1, checkInByQRCodeResponse.mcheck_in_resp);
            }
            protoWriter.writeBytes(checkInByQRCodeResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.calendarevents.CheckInByQRCodeResponse$a */
    public static final class C49564a extends Message.Builder<CheckInByQRCodeResponse, C49564a> {

        /* renamed from: a */
        public Status f124181a;

        /* renamed from: a */
        public CheckInByQRCodeResponse build() {
            return new CheckInByQRCodeResponse(this.f124181a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49564a newBuilder() {
        C49564a aVar = new C49564a();
        aVar.f124181a = this.mcheck_in_resp;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcheck_in_resp != null) {
            sb.append(", check_in_resp=");
            sb.append(this.mcheck_in_resp);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckInByQRCodeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckInByQRCodeResponse(Status status) {
        this(status, ByteString.EMPTY);
    }

    public CheckInByQRCodeResponse(Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcheck_in_resp = status;
    }
}
