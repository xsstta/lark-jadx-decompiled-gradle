package com.bytedance.lark.pb.contact.v1;

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

public final class UpdateFocusChatterRequest extends Message<UpdateFocusChatterRequest, C16410a> {
    public static final ProtoAdapter<UpdateFocusChatterRequest> ADAPTER = new C16411b();
    public static final Operate DEFAULT_OPERATE = Operate.ADD;
    private static final long serialVersionUID = 0;
    public final List<Long> chatter_ids;
    public final Operate operate;

    public enum Operate implements WireEnum {
        ADD(1),
        DELETE(2);
        
        public static final ProtoAdapter<Operate> ADAPTER = ProtoAdapter.newEnumAdapter(Operate.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Operate fromValue(int i) {
            if (i == 1) {
                return ADD;
            }
            if (i != 2) {
                return null;
            }
            return DELETE;
        }

        private Operate(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateFocusChatterRequest$b */
    private static final class C16411b extends ProtoAdapter<UpdateFocusChatterRequest> {
        C16411b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateFocusChatterRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateFocusChatterRequest updateFocusChatterRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, updateFocusChatterRequest.chatter_ids);
            if (updateFocusChatterRequest.operate != null) {
                i = Operate.ADAPTER.encodedSizeWithTag(2, updateFocusChatterRequest.operate);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + updateFocusChatterRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateFocusChatterRequest decode(ProtoReader protoReader) throws IOException {
            C16410a aVar = new C16410a();
            aVar.f42681b = Operate.ADD;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42680a.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42681b = Operate.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateFocusChatterRequest updateFocusChatterRequest) throws IOException {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, updateFocusChatterRequest.chatter_ids);
            if (updateFocusChatterRequest.operate != null) {
                Operate.ADAPTER.encodeWithTag(protoWriter, 2, updateFocusChatterRequest.operate);
            }
            protoWriter.writeBytes(updateFocusChatterRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateFocusChatterRequest$a */
    public static final class C16410a extends Message.Builder<UpdateFocusChatterRequest, C16410a> {

        /* renamed from: a */
        public List<Long> f42680a = Internal.newMutableList();

        /* renamed from: b */
        public Operate f42681b;

        /* renamed from: a */
        public UpdateFocusChatterRequest build() {
            return new UpdateFocusChatterRequest(this.f42680a, this.f42681b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16410a newBuilder() {
        C16410a aVar = new C16410a();
        aVar.f42680a = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f42681b = this.operate;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "UpdateFocusChatterRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (this.operate != null) {
            sb.append(", operate=");
            sb.append(this.operate);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateFocusChatterRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateFocusChatterRequest(List<Long> list, Operate operate2) {
        this(list, operate2, ByteString.EMPTY);
    }

    public UpdateFocusChatterRequest(List<Long> list, Operate operate2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.operate = operate2;
    }
}
