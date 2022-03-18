package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Cursor extends Message<Cursor, C17108a> {
    public static final ProtoAdapter<Cursor> ADAPTER = new C17109b();
    public static final Long DEFAULT_MAX_CURSOR = 0L;
    public static final Long DEFAULT_MIN_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    public final Long max_cursor;
    public final Long min_cursor;

    /* renamed from: com.bytedance.lark.pb.feed.v1.Cursor$b */
    private static final class C17109b extends ProtoAdapter<Cursor> {
        C17109b() {
            super(FieldEncoding.LENGTH_DELIMITED, Cursor.class);
        }

        /* renamed from: a */
        public int encodedSize(Cursor cursor) {
            int i;
            int i2 = 0;
            if (cursor.max_cursor != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, cursor.max_cursor);
            } else {
                i = 0;
            }
            if (cursor.min_cursor != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, cursor.min_cursor);
            }
            return i + i2 + cursor.unknownFields().size();
        }

        /* renamed from: a */
        public Cursor decode(ProtoReader protoReader) throws IOException {
            C17108a aVar = new C17108a();
            aVar.f43838a = 0L;
            aVar.f43839b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43838a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43839b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Cursor cursor) throws IOException {
            if (cursor.max_cursor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, cursor.max_cursor);
            }
            if (cursor.min_cursor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, cursor.min_cursor);
            }
            protoWriter.writeBytes(cursor.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.Cursor$a */
    public static final class C17108a extends Message.Builder<Cursor, C17108a> {

        /* renamed from: a */
        public Long f43838a;

        /* renamed from: b */
        public Long f43839b;

        /* renamed from: a */
        public Cursor build() {
            return new Cursor(this.f43838a, this.f43839b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17108a newBuilder() {
        C17108a aVar = new C17108a();
        aVar.f43838a = this.max_cursor;
        aVar.f43839b = this.min_cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "Cursor");
        StringBuilder sb = new StringBuilder();
        if (this.max_cursor != null) {
            sb.append(", max_cursor=");
            sb.append(this.max_cursor);
        }
        if (this.min_cursor != null) {
            sb.append(", min_cursor=");
            sb.append(this.min_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "Cursor{");
        replace.append('}');
        return replace.toString();
    }

    public Cursor(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public Cursor(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.max_cursor = l;
        this.min_cursor = l2;
    }
}
