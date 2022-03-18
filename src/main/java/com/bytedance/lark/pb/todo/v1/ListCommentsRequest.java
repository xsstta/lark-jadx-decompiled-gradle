package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ListCommentsRequest extends Message<ListCommentsRequest, C19571a> {
    public static final ProtoAdapter<ListCommentsRequest> ADAPTER = new C19572b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Direction DEFAULT_DIRECTION = Direction.UP;
    public static final Integer DEFAULT_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Direction direction;
    public final Integer position;
    public final String todo_guid;

    public enum Direction implements WireEnum {
        UP(0),
        DOWN(1);
        
        public static final ProtoAdapter<Direction> ADAPTER = ProtoAdapter.newEnumAdapter(Direction.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Direction fromValue(int i) {
            if (i == 0) {
                return UP;
            }
            if (i != 1) {
                return null;
            }
            return DOWN;
        }

        private Direction(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ListCommentsRequest$b */
    private static final class C19572b extends ProtoAdapter<ListCommentsRequest> {
        C19572b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListCommentsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListCommentsRequest listCommentsRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (listCommentsRequest.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, listCommentsRequest.todo_guid);
            } else {
                i = 0;
            }
            if (listCommentsRequest.position != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, listCommentsRequest.position);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (listCommentsRequest.count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, listCommentsRequest.count);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (listCommentsRequest.direction != null) {
                i4 = Direction.ADAPTER.encodedSizeWithTag(4, listCommentsRequest.direction);
            }
            return i6 + i4 + listCommentsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListCommentsRequest decode(ProtoReader protoReader) throws IOException {
            C19571a aVar = new C19571a();
            aVar.f47917a = "";
            aVar.f47918b = 0;
            aVar.f47919c = 0;
            aVar.f47920d = Direction.UP;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47917a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47918b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47919c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47920d = Direction.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListCommentsRequest listCommentsRequest) throws IOException {
            if (listCommentsRequest.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listCommentsRequest.todo_guid);
            }
            if (listCommentsRequest.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, listCommentsRequest.position);
            }
            if (listCommentsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, listCommentsRequest.count);
            }
            if (listCommentsRequest.direction != null) {
                Direction.ADAPTER.encodeWithTag(protoWriter, 4, listCommentsRequest.direction);
            }
            protoWriter.writeBytes(listCommentsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ListCommentsRequest$a */
    public static final class C19571a extends Message.Builder<ListCommentsRequest, C19571a> {

        /* renamed from: a */
        public String f47917a;

        /* renamed from: b */
        public Integer f47918b;

        /* renamed from: c */
        public Integer f47919c;

        /* renamed from: d */
        public Direction f47920d;

        /* renamed from: a */
        public ListCommentsRequest build() {
            return new ListCommentsRequest(this.f47917a, this.f47918b, this.f47919c, this.f47920d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19571a newBuilder() {
        C19571a aVar = new C19571a();
        aVar.f47917a = this.todo_guid;
        aVar.f47918b = this.position;
        aVar.f47919c = this.count;
        aVar.f47920d = this.direction;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "ListCommentsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.direction != null) {
            sb.append(", direction=");
            sb.append(this.direction);
        }
        StringBuilder replace = sb.replace(0, 2, "ListCommentsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListCommentsRequest(String str, Integer num, Integer num2, Direction direction2) {
        this(str, num, num2, direction2, ByteString.EMPTY);
    }

    public ListCommentsRequest(String str, Integer num, Integer num2, Direction direction2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
        this.position = num;
        this.count = num2;
        this.direction = direction2;
    }
}
