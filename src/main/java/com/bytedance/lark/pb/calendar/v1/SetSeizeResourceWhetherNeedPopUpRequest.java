package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetSeizeResourceWhetherNeedPopUpRequest extends Message<SetSeizeResourceWhetherNeedPopUpRequest, C16046a> {
    public static final ProtoAdapter<SetSeizeResourceWhetherNeedPopUpRequest> ADAPTER = new C16047b();
    public static final Boolean DEFAULT_NEED_POP_UP = false;
    private static final long serialVersionUID = 0;
    public final Boolean need_pop_up;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetSeizeResourceWhetherNeedPopUpRequest$b */
    private static final class C16047b extends ProtoAdapter<SetSeizeResourceWhetherNeedPopUpRequest> {
        C16047b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetSeizeResourceWhetherNeedPopUpRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetSeizeResourceWhetherNeedPopUpRequest setSeizeResourceWhetherNeedPopUpRequest) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, setSeizeResourceWhetherNeedPopUpRequest.need_pop_up) + setSeizeResourceWhetherNeedPopUpRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetSeizeResourceWhetherNeedPopUpRequest decode(ProtoReader protoReader) throws IOException {
            C16046a aVar = new C16046a();
            aVar.f42122a = false;
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
                    aVar.f42122a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetSeizeResourceWhetherNeedPopUpRequest setSeizeResourceWhetherNeedPopUpRequest) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, setSeizeResourceWhetherNeedPopUpRequest.need_pop_up);
            protoWriter.writeBytes(setSeizeResourceWhetherNeedPopUpRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetSeizeResourceWhetherNeedPopUpRequest$a */
    public static final class C16046a extends Message.Builder<SetSeizeResourceWhetherNeedPopUpRequest, C16046a> {

        /* renamed from: a */
        public Boolean f42122a;

        /* renamed from: a */
        public SetSeizeResourceWhetherNeedPopUpRequest build() {
            Boolean bool = this.f42122a;
            if (bool != null) {
                return new SetSeizeResourceWhetherNeedPopUpRequest(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "need_pop_up");
        }

        /* renamed from: a */
        public C16046a mo57708a(Boolean bool) {
            this.f42122a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16046a newBuilder() {
        C16046a aVar = new C16046a();
        aVar.f42122a = this.need_pop_up;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SetSeizeResourceWhetherNeedPopUpRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", need_pop_up=");
        sb.append(this.need_pop_up);
        StringBuilder replace = sb.replace(0, 2, "SetSeizeResourceWhetherNeedPopUpRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetSeizeResourceWhetherNeedPopUpRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public SetSeizeResourceWhetherNeedPopUpRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.need_pop_up = bool;
    }
}
