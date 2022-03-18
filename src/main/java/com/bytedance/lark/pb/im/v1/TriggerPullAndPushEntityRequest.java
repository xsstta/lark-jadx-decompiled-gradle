package com.bytedance.lark.pb.im.v1;

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

public final class TriggerPullAndPushEntityRequest extends Message<TriggerPullAndPushEntityRequest, C18123a> {
    public static final ProtoAdapter<TriggerPullAndPushEntityRequest> ADAPTER = new C18124b();
    public static final Type DEFAULT_TYPE = Type.CHATTER;
    private static final long serialVersionUID = 0;
    public final String id;
    public final Type type;

    public enum Type implements WireEnum {
        CHATTER(0),
        CHAT(1);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return CHATTER;
            }
            if (i != 1) {
                return null;
            }
            return CHAT;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TriggerPullAndPushEntityRequest$b */
    private static final class C18124b extends ProtoAdapter<TriggerPullAndPushEntityRequest> {
        C18124b() {
            super(FieldEncoding.LENGTH_DELIMITED, TriggerPullAndPushEntityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TriggerPullAndPushEntityRequest triggerPullAndPushEntityRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, triggerPullAndPushEntityRequest.id);
            if (triggerPullAndPushEntityRequest.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(2, triggerPullAndPushEntityRequest.type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + triggerPullAndPushEntityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TriggerPullAndPushEntityRequest decode(ProtoReader protoReader) throws IOException {
            C18123a aVar = new C18123a();
            aVar.f45282a = "";
            aVar.f45283b = Type.CHATTER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45282a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45283b = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TriggerPullAndPushEntityRequest triggerPullAndPushEntityRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, triggerPullAndPushEntityRequest.id);
            if (triggerPullAndPushEntityRequest.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, triggerPullAndPushEntityRequest.type);
            }
            protoWriter.writeBytes(triggerPullAndPushEntityRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TriggerPullAndPushEntityRequest$a */
    public static final class C18123a extends Message.Builder<TriggerPullAndPushEntityRequest, C18123a> {

        /* renamed from: a */
        public String f45282a;

        /* renamed from: b */
        public Type f45283b;

        /* renamed from: a */
        public TriggerPullAndPushEntityRequest build() {
            String str = this.f45282a;
            if (str != null) {
                return new TriggerPullAndPushEntityRequest(str, this.f45283b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18123a newBuilder() {
        C18123a aVar = new C18123a();
        aVar.f45282a = this.id;
        aVar.f45283b = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TriggerPullAndPushEntityRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "TriggerPullAndPushEntityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TriggerPullAndPushEntityRequest(String str, Type type2) {
        this(str, type2, ByteString.EMPTY);
    }

    public TriggerPullAndPushEntityRequest(String str, Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
    }
}
