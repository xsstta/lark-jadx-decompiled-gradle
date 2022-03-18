package com.bytedance.lark.pb.media.v1;

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

public final class GetFileStateResponse extends Message<GetFileStateResponse, C18240a> {
    public static final ProtoAdapter<GetFileStateResponse> ADAPTER = new C18241b();
    public static final State DEFAULT_STATE = State.NORMAL;
    private static final long serialVersionUID = 0;
    public final State state;

    public enum State implements WireEnum {
        NORMAL(1),
        DELETED(2),
        RECOVERABLE(3),
        UNRECOVERABLE(4);
        
        public static final ProtoAdapter<State> ADAPTER = ProtoAdapter.newEnumAdapter(State.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static State fromValue(int i) {
            if (i == 1) {
                return NORMAL;
            }
            if (i == 2) {
                return DELETED;
            }
            if (i == 3) {
                return RECOVERABLE;
            }
            if (i != 4) {
                return null;
            }
            return UNRECOVERABLE;
        }

        private State(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetFileStateResponse$b */
    private static final class C18241b extends ProtoAdapter<GetFileStateResponse> {
        C18241b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFileStateResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFileStateResponse getFileStateResponse) {
            return State.ADAPTER.encodedSizeWithTag(1, getFileStateResponse.state) + getFileStateResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetFileStateResponse decode(ProtoReader protoReader) throws IOException {
            C18240a aVar = new C18240a();
            aVar.f45489a = State.NORMAL;
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
                        aVar.f45489a = State.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFileStateResponse getFileStateResponse) throws IOException {
            State.ADAPTER.encodeWithTag(protoWriter, 1, getFileStateResponse.state);
            protoWriter.writeBytes(getFileStateResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetFileStateResponse$a */
    public static final class C18240a extends Message.Builder<GetFileStateResponse, C18240a> {

        /* renamed from: a */
        public State f45489a;

        /* renamed from: a */
        public GetFileStateResponse build() {
            State state = this.f45489a;
            if (state != null) {
                return new GetFileStateResponse(state, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(state, "state");
        }
    }

    @Override // com.squareup.wire.Message
    public C18240a newBuilder() {
        C18240a aVar = new C18240a();
        aVar.f45489a = this.state;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetFileStateResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", state=");
        sb.append(this.state);
        StringBuilder replace = sb.replace(0, 2, "GetFileStateResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetFileStateResponse(State state2) {
        this(state2, ByteString.EMPTY);
    }

    public GetFileStateResponse(State state2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.state = state2;
    }
}
