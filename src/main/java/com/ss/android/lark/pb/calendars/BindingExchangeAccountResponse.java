package com.ss.android.lark.pb.calendars;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class BindingExchangeAccountResponse extends Message<BindingExchangeAccountResponse, C49568a> {
    public static final ProtoAdapter<BindingExchangeAccountResponse> ADAPTER = new C49569b();
    private static final long serialVersionUID = 0;
    public final State mresp_state;

    public enum State implements WireEnum {
        BINDING_SUCCESS(1),
        NEED_SERVER_URL(2),
        COMMUNICATION_FAILED(3),
        UNAUTHORIZED(4),
        ALREADY_BINDING_SELF(5),
        UNKNOWN_ERROR(6),
        FORBIDDENT_ERROR(7);
        
        public static final ProtoAdapter<State> ADAPTER = ProtoAdapter.newEnumAdapter(State.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static State fromValue(int i) {
            switch (i) {
                case 1:
                    return BINDING_SUCCESS;
                case 2:
                    return NEED_SERVER_URL;
                case 3:
                    return COMMUNICATION_FAILED;
                case 4:
                    return UNAUTHORIZED;
                case 5:
                    return ALREADY_BINDING_SELF;
                case 6:
                    return UNKNOWN_ERROR;
                case 7:
                    return FORBIDDENT_ERROR;
                default:
                    return null;
            }
        }

        private State(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.calendars.BindingExchangeAccountResponse$b */
    private static final class C49569b extends ProtoAdapter<BindingExchangeAccountResponse> {
        C49569b() {
            super(FieldEncoding.LENGTH_DELIMITED, BindingExchangeAccountResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(BindingExchangeAccountResponse bindingExchangeAccountResponse) {
            int i;
            if (bindingExchangeAccountResponse.mresp_state != null) {
                i = State.ADAPTER.encodedSizeWithTag(1, bindingExchangeAccountResponse.mresp_state);
            } else {
                i = 0;
            }
            return i + bindingExchangeAccountResponse.unknownFields().size();
        }

        /* renamed from: a */
        public BindingExchangeAccountResponse decode(ProtoReader protoReader) throws IOException {
            C49568a aVar = new C49568a();
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
                        aVar.f124185a = State.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BindingExchangeAccountResponse bindingExchangeAccountResponse) throws IOException {
            if (bindingExchangeAccountResponse.mresp_state != null) {
                State.ADAPTER.encodeWithTag(protoWriter, 1, bindingExchangeAccountResponse.mresp_state);
            }
            protoWriter.writeBytes(bindingExchangeAccountResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.calendars.BindingExchangeAccountResponse$a */
    public static final class C49568a extends Message.Builder<BindingExchangeAccountResponse, C49568a> {

        /* renamed from: a */
        public State f124185a;

        /* renamed from: a */
        public BindingExchangeAccountResponse build() {
            return new BindingExchangeAccountResponse(this.f124185a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49568a newBuilder() {
        C49568a aVar = new C49568a();
        aVar.f124185a = this.mresp_state;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mresp_state != null) {
            sb.append(", resp_state=");
            sb.append(this.mresp_state);
        }
        StringBuilder replace = sb.replace(0, 2, "BindingExchangeAccountResponse{");
        replace.append('}');
        return replace.toString();
    }

    public BindingExchangeAccountResponse(State state) {
        this(state, ByteString.EMPTY);
    }

    public BindingExchangeAccountResponse(State state, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mresp_state = state;
    }
}
