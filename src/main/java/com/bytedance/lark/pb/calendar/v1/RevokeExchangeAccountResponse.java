package com.bytedance.lark.pb.calendar.v1;

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

public final class RevokeExchangeAccountResponse extends Message<RevokeExchangeAccountResponse, C15982a> {
    public static final ProtoAdapter<RevokeExchangeAccountResponse> ADAPTER = new C15983b();
    public static final State DEFAULT_RESP_STATE = State.REVOKE_SUCCESS;
    private static final long serialVersionUID = 0;
    public final State resp_state;

    public enum State implements WireEnum {
        REVOKE_SUCCESS(1),
        REVOKE_FAILED(2);
        
        public static final ProtoAdapter<State> ADAPTER = ProtoAdapter.newEnumAdapter(State.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static State fromValue(int i) {
            if (i == 1) {
                return REVOKE_SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return REVOKE_FAILED;
        }

        private State(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RevokeExchangeAccountResponse$b */
    private static final class C15983b extends ProtoAdapter<RevokeExchangeAccountResponse> {
        C15983b() {
            super(FieldEncoding.LENGTH_DELIMITED, RevokeExchangeAccountResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(RevokeExchangeAccountResponse revokeExchangeAccountResponse) {
            return State.ADAPTER.encodedSizeWithTag(1, revokeExchangeAccountResponse.resp_state) + revokeExchangeAccountResponse.unknownFields().size();
        }

        /* renamed from: a */
        public RevokeExchangeAccountResponse decode(ProtoReader protoReader) throws IOException {
            C15982a aVar = new C15982a();
            aVar.f41982a = State.REVOKE_SUCCESS;
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
                        aVar.f41982a = State.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RevokeExchangeAccountResponse revokeExchangeAccountResponse) throws IOException {
            State.ADAPTER.encodeWithTag(protoWriter, 1, revokeExchangeAccountResponse.resp_state);
            protoWriter.writeBytes(revokeExchangeAccountResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RevokeExchangeAccountResponse$a */
    public static final class C15982a extends Message.Builder<RevokeExchangeAccountResponse, C15982a> {

        /* renamed from: a */
        public State f41982a;

        /* renamed from: a */
        public RevokeExchangeAccountResponse build() {
            State state = this.f41982a;
            if (state != null) {
                return new RevokeExchangeAccountResponse(state, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(state, "resp_state");
        }
    }

    @Override // com.squareup.wire.Message
    public C15982a newBuilder() {
        C15982a aVar = new C15982a();
        aVar.f41982a = this.resp_state;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "RevokeExchangeAccountResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", resp_state=");
        sb.append(this.resp_state);
        StringBuilder replace = sb.replace(0, 2, "RevokeExchangeAccountResponse{");
        replace.append('}');
        return replace.toString();
    }

    public RevokeExchangeAccountResponse(State state) {
        this(state, ByteString.EMPTY);
    }

    public RevokeExchangeAccountResponse(State state, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resp_state = state;
    }
}
