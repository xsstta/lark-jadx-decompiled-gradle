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
import java.util.List;
import okio.ByteString;

public final class PushCustomizedStickersRequest extends Message<PushCustomizedStickersRequest, C17887a> {
    public static final ProtoAdapter<PushCustomizedStickersRequest> ADAPTER = new C17888b();
    public static final AddDirection DEFAULT_ADD_DIRECTION = AddDirection.HEAD;
    public static final Operation DEFAULT_OPERATION = Operation.ADD;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final AddDirection add_direction;
    public final Operation operation;
    public final List<Sticker> stickers;
    public final Long update_time;

    public enum AddDirection implements WireEnum {
        HEAD(1),
        TAIL(2);
        
        public static final ProtoAdapter<AddDirection> ADAPTER = ProtoAdapter.newEnumAdapter(AddDirection.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AddDirection fromValue(int i) {
            if (i == 1) {
                return HEAD;
            }
            if (i != 2) {
                return null;
            }
            return TAIL;
        }

        private AddDirection(int i) {
            this.value = i;
        }
    }

    public enum Operation implements WireEnum {
        ADD(1),
        DELETE(2),
        MODIFY(3);
        
        public static final ProtoAdapter<Operation> ADAPTER = ProtoAdapter.newEnumAdapter(Operation.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Operation fromValue(int i) {
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return DELETE;
            }
            if (i != 3) {
                return null;
            }
            return MODIFY;
        }

        private Operation(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushCustomizedStickersRequest$b */
    private static final class C17888b extends ProtoAdapter<PushCustomizedStickersRequest> {
        C17888b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushCustomizedStickersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PushCustomizedStickersRequest pushCustomizedStickersRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (pushCustomizedStickersRequest.operation != null) {
                i = Operation.ADAPTER.encodedSizeWithTag(1, pushCustomizedStickersRequest.operation);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Sticker.ADAPTER.asRepeated().encodedSizeWithTag(2, pushCustomizedStickersRequest.stickers);
            if (pushCustomizedStickersRequest.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, pushCustomizedStickersRequest.update_time);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag + i2;
            if (pushCustomizedStickersRequest.add_direction != null) {
                i3 = AddDirection.ADAPTER.encodedSizeWithTag(4, pushCustomizedStickersRequest.add_direction);
            }
            return i4 + i3 + pushCustomizedStickersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PushCustomizedStickersRequest decode(ProtoReader protoReader) throws IOException {
            C17887a aVar = new C17887a();
            aVar.f44962a = Operation.ADD;
            aVar.f44964c = 0L;
            aVar.f44965d = AddDirection.HEAD;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44962a = Operation.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f44963b.add(Sticker.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f44964c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44965d = AddDirection.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushCustomizedStickersRequest pushCustomizedStickersRequest) throws IOException {
            if (pushCustomizedStickersRequest.operation != null) {
                Operation.ADAPTER.encodeWithTag(protoWriter, 1, pushCustomizedStickersRequest.operation);
            }
            Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, pushCustomizedStickersRequest.stickers);
            if (pushCustomizedStickersRequest.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pushCustomizedStickersRequest.update_time);
            }
            if (pushCustomizedStickersRequest.add_direction != null) {
                AddDirection.ADAPTER.encodeWithTag(protoWriter, 4, pushCustomizedStickersRequest.add_direction);
            }
            protoWriter.writeBytes(pushCustomizedStickersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushCustomizedStickersRequest$a */
    public static final class C17887a extends Message.Builder<PushCustomizedStickersRequest, C17887a> {

        /* renamed from: a */
        public Operation f44962a;

        /* renamed from: b */
        public List<Sticker> f44963b = Internal.newMutableList();

        /* renamed from: c */
        public Long f44964c;

        /* renamed from: d */
        public AddDirection f44965d;

        /* renamed from: a */
        public PushCustomizedStickersRequest build() {
            return new PushCustomizedStickersRequest(this.f44962a, this.f44963b, this.f44964c, this.f44965d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17887a newBuilder() {
        C17887a aVar = new C17887a();
        aVar.f44962a = this.operation;
        aVar.f44963b = Internal.copyOf("stickers", this.stickers);
        aVar.f44964c = this.update_time;
        aVar.f44965d = this.add_direction;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushCustomizedStickersRequest");
        StringBuilder sb = new StringBuilder();
        if (this.operation != null) {
            sb.append(", operation=");
            sb.append(this.operation);
        }
        if (!this.stickers.isEmpty()) {
            sb.append(", stickers=");
            sb.append(this.stickers);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.add_direction != null) {
            sb.append(", add_direction=");
            sb.append(this.add_direction);
        }
        StringBuilder replace = sb.replace(0, 2, "PushCustomizedStickersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PushCustomizedStickersRequest(Operation operation2, List<Sticker> list, Long l, AddDirection addDirection) {
        this(operation2, list, l, addDirection, ByteString.EMPTY);
    }

    public PushCustomizedStickersRequest(Operation operation2, List<Sticker> list, Long l, AddDirection addDirection, ByteString byteString) {
        super(ADAPTER, byteString);
        this.operation = operation2;
        this.stickers = Internal.immutableCopyOf("stickers", list);
        this.update_time = l;
        this.add_direction = addDirection;
    }
}
