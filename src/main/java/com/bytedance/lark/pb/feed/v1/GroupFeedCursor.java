package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GroupFeedCursor extends Message<GroupFeedCursor, C17192a> {
    public static final ProtoAdapter<GroupFeedCursor> ADAPTER = new C17193b();
    public static final CursorType DEFAULT_CURSOR_TYPE = CursorType.INBOX;
    private static final long serialVersionUID = 0;
    public final List<Cursor> cursor;
    public final CursorType cursor_type;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GroupFeedCursor$b */
    private static final class C17193b extends ProtoAdapter<GroupFeedCursor> {
        C17193b() {
            super(FieldEncoding.LENGTH_DELIMITED, GroupFeedCursor.class);
        }

        /* renamed from: a */
        public int encodedSize(GroupFeedCursor groupFeedCursor) {
            int i;
            int encodedSizeWithTag = Cursor.ADAPTER.asRepeated().encodedSizeWithTag(1, groupFeedCursor.cursor);
            if (groupFeedCursor.cursor_type != null) {
                i = CursorType.ADAPTER.encodedSizeWithTag(2, groupFeedCursor.cursor_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + groupFeedCursor.unknownFields().size();
        }

        /* renamed from: a */
        public GroupFeedCursor decode(ProtoReader protoReader) throws IOException {
            C17192a aVar = new C17192a();
            aVar.f43966b = CursorType.INBOX;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43965a.add(Cursor.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43966b = CursorType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GroupFeedCursor groupFeedCursor) throws IOException {
            Cursor.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, groupFeedCursor.cursor);
            if (groupFeedCursor.cursor_type != null) {
                CursorType.ADAPTER.encodeWithTag(protoWriter, 2, groupFeedCursor.cursor_type);
            }
            protoWriter.writeBytes(groupFeedCursor.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GroupFeedCursor$a */
    public static final class C17192a extends Message.Builder<GroupFeedCursor, C17192a> {

        /* renamed from: a */
        public List<Cursor> f43965a = Internal.newMutableList();

        /* renamed from: b */
        public CursorType f43966b;

        /* renamed from: a */
        public GroupFeedCursor build() {
            return new GroupFeedCursor(this.f43965a, this.f43966b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17192a newBuilder() {
        C17192a aVar = new C17192a();
        aVar.f43965a = Internal.copyOf("cursor", this.cursor);
        aVar.f43966b = this.cursor_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GroupFeedCursor");
        StringBuilder sb = new StringBuilder();
        if (!this.cursor.isEmpty()) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.cursor_type != null) {
            sb.append(", cursor_type=");
            sb.append(this.cursor_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GroupFeedCursor{");
        replace.append('}');
        return replace.toString();
    }

    public GroupFeedCursor(List<Cursor> list, CursorType cursorType) {
        this(list, cursorType, ByteString.EMPTY);
    }

    public GroupFeedCursor(List<Cursor> list, CursorType cursorType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = Internal.immutableCopyOf("cursor", list);
        this.cursor_type = cursorType;
    }
}
