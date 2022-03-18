package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetMessageReadStateResponse extends Message<GetMessageReadStateResponse, C17631a> {
    public static final ProtoAdapter<GetMessageReadStateResponse> ADAPTER = new C17632b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final String read_cursor;
    public final ReadState read_state;
    public final String unread_cursor;

    public static final class ReadState extends Message<ReadState, C17629a> {
        public static final ProtoAdapter<ReadState> ADAPTER = new C17630b();
        public static final Integer DEFAULT_COLUMN_COUNT = 2;
        public static final Integer DEFAULT_READ_COUNT = 0;
        public static final Boolean DEFAULT_SHOW_LIMITED = false;
        public static final Boolean DEFAULT_SHOW_SEARCH_BOX = false;
        public static final Integer DEFAULT_UNREAD_COUNT = 0;
        private static final long serialVersionUID = 0;
        public final Integer column_count;
        public final List<String> mention_user_ids;
        public final Integer read_count;
        public final List<String> read_user_ids;
        public final Boolean show_limited;
        public final Boolean show_search_box;
        public final Integer unread_count;
        public final List<String> unread_user_ids;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageReadStateResponse$ReadState$b */
        private static final class C17630b extends ProtoAdapter<ReadState> {
            C17630b() {
                super(FieldEncoding.LENGTH_DELIMITED, ReadState.class);
            }

            /* renamed from: a */
            public int encodedSize(ReadState readState) {
                int i;
                int i2;
                int i3;
                int i4;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, readState.read_user_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, readState.unread_user_ids);
                int i5 = 0;
                if (readState.unread_count != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(3, readState.unread_count);
                } else {
                    i = 0;
                }
                int i6 = encodedSizeWithTag + i;
                if (readState.read_count != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, readState.read_count);
                } else {
                    i2 = 0;
                }
                int i7 = i6 + i2;
                if (readState.show_search_box != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, readState.show_search_box);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (readState.show_limited != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, readState.show_limited);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (readState.column_count != null) {
                    i5 = ProtoAdapter.INT32.encodedSizeWithTag(7, readState.column_count);
                }
                return i9 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, readState.mention_user_ids) + readState.unknownFields().size();
            }

            /* renamed from: a */
            public ReadState decode(ProtoReader protoReader) throws IOException {
                C17629a aVar = new C17629a();
                aVar.f44633c = 0;
                aVar.f44634d = 0;
                aVar.f44635e = false;
                aVar.f44636f = false;
                aVar.f44637g = 2;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f44631a.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 2:
                                aVar.f44632b.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 3:
                                aVar.f44633c = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 4:
                                aVar.f44634d = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 5:
                                aVar.f44635e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f44636f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f44637g = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                aVar.f44638h.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ReadState readState) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, readState.read_user_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, readState.unread_user_ids);
                if (readState.unread_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, readState.unread_count);
                }
                if (readState.read_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, readState.read_count);
                }
                if (readState.show_search_box != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, readState.show_search_box);
                }
                if (readState.show_limited != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, readState.show_limited);
                }
                if (readState.column_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, readState.column_count);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, readState.mention_user_ids);
                protoWriter.writeBytes(readState.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageReadStateResponse$ReadState$a */
        public static final class C17629a extends Message.Builder<ReadState, C17629a> {

            /* renamed from: a */
            public List<String> f44631a = Internal.newMutableList();

            /* renamed from: b */
            public List<String> f44632b = Internal.newMutableList();

            /* renamed from: c */
            public Integer f44633c;

            /* renamed from: d */
            public Integer f44634d;

            /* renamed from: e */
            public Boolean f44635e;

            /* renamed from: f */
            public Boolean f44636f;

            /* renamed from: g */
            public Integer f44637g;

            /* renamed from: h */
            public List<String> f44638h = Internal.newMutableList();

            /* renamed from: a */
            public ReadState build() {
                return new ReadState(this.f44631a, this.f44632b, this.f44633c, this.f44634d, this.f44635e, this.f44636f, this.f44637g, this.f44638h, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17629a newBuilder() {
            C17629a aVar = new C17629a();
            aVar.f44631a = Internal.copyOf("read_user_ids", this.read_user_ids);
            aVar.f44632b = Internal.copyOf("unread_user_ids", this.unread_user_ids);
            aVar.f44633c = this.unread_count;
            aVar.f44634d = this.read_count;
            aVar.f44635e = this.show_search_box;
            aVar.f44636f = this.show_limited;
            aVar.f44637g = this.column_count;
            aVar.f44638h = Internal.copyOf("mention_user_ids", this.mention_user_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "ReadState");
            StringBuilder sb = new StringBuilder();
            if (!this.read_user_ids.isEmpty()) {
                sb.append(", read_user_ids=");
                sb.append(this.read_user_ids);
            }
            if (!this.unread_user_ids.isEmpty()) {
                sb.append(", unread_user_ids=");
                sb.append(this.unread_user_ids);
            }
            if (this.unread_count != null) {
                sb.append(", unread_count=");
                sb.append(this.unread_count);
            }
            if (this.read_count != null) {
                sb.append(", read_count=");
                sb.append(this.read_count);
            }
            if (this.show_search_box != null) {
                sb.append(", show_search_box=");
                sb.append(this.show_search_box);
            }
            if (this.show_limited != null) {
                sb.append(", show_limited=");
                sb.append(this.show_limited);
            }
            if (this.column_count != null) {
                sb.append(", column_count=");
                sb.append(this.column_count);
            }
            if (!this.mention_user_ids.isEmpty()) {
                sb.append(", mention_user_ids=");
                sb.append(this.mention_user_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "ReadState{");
            replace.append('}');
            return replace.toString();
        }

        public ReadState(List<String> list, List<String> list2, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, List<String> list3) {
            this(list, list2, num, num2, bool, bool2, num3, list3, ByteString.EMPTY);
        }

        public ReadState(List<String> list, List<String> list2, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, List<String> list3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.read_user_ids = Internal.immutableCopyOf("read_user_ids", list);
            this.unread_user_ids = Internal.immutableCopyOf("unread_user_ids", list2);
            this.unread_count = num;
            this.read_count = num2;
            this.show_search_box = bool;
            this.show_limited = bool2;
            this.column_count = num3;
            this.mention_user_ids = Internal.immutableCopyOf("mention_user_ids", list3);
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageReadStateResponse$b */
    private static final class C17632b extends ProtoAdapter<GetMessageReadStateResponse> {
        C17632b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageReadStateResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageReadStateResponse getMessageReadStateResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getMessageReadStateResponse.read_state != null) {
                i = ReadState.ADAPTER.encodedSizeWithTag(1, getMessageReadStateResponse.read_state);
            } else {
                i = 0;
            }
            if (getMessageReadStateResponse.entity != null) {
                i2 = C14928Entity.ADAPTER.encodedSizeWithTag(2, getMessageReadStateResponse.entity);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (getMessageReadStateResponse.read_cursor != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getMessageReadStateResponse.read_cursor);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getMessageReadStateResponse.unread_cursor != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, getMessageReadStateResponse.unread_cursor);
            }
            return i6 + i4 + getMessageReadStateResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageReadStateResponse decode(ProtoReader protoReader) throws IOException {
            C17631a aVar = new C17631a();
            aVar.f44641c = "";
            aVar.f44642d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44639a = ReadState.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44640b = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44641c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44642d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageReadStateResponse getMessageReadStateResponse) throws IOException {
            if (getMessageReadStateResponse.read_state != null) {
                ReadState.ADAPTER.encodeWithTag(protoWriter, 1, getMessageReadStateResponse.read_state);
            }
            if (getMessageReadStateResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, getMessageReadStateResponse.entity);
            }
            if (getMessageReadStateResponse.read_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getMessageReadStateResponse.read_cursor);
            }
            if (getMessageReadStateResponse.unread_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getMessageReadStateResponse.unread_cursor);
            }
            protoWriter.writeBytes(getMessageReadStateResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageReadStateResponse$a */
    public static final class C17631a extends Message.Builder<GetMessageReadStateResponse, C17631a> {

        /* renamed from: a */
        public ReadState f44639a;

        /* renamed from: b */
        public C14928Entity f44640b;

        /* renamed from: c */
        public String f44641c;

        /* renamed from: d */
        public String f44642d;

        /* renamed from: a */
        public GetMessageReadStateResponse build() {
            return new GetMessageReadStateResponse(this.f44639a, this.f44640b, this.f44641c, this.f44642d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17631a newBuilder() {
        C17631a aVar = new C17631a();
        aVar.f44639a = this.read_state;
        aVar.f44640b = this.entity;
        aVar.f44641c = this.read_cursor;
        aVar.f44642d = this.unread_cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessageReadStateResponse");
        StringBuilder sb = new StringBuilder();
        if (this.read_state != null) {
            sb.append(", read_state=");
            sb.append(this.read_state);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.read_cursor != null) {
            sb.append(", read_cursor=");
            sb.append(this.read_cursor);
        }
        if (this.unread_cursor != null) {
            sb.append(", unread_cursor=");
            sb.append(this.unread_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageReadStateResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageReadStateResponse(ReadState readState, C14928Entity entity2, String str, String str2) {
        this(readState, entity2, str, str2, ByteString.EMPTY);
    }

    public GetMessageReadStateResponse(ReadState readState, C14928Entity entity2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.read_state = readState;
        this.entity = entity2;
        this.read_cursor = str;
        this.unread_cursor = str2;
    }
}
