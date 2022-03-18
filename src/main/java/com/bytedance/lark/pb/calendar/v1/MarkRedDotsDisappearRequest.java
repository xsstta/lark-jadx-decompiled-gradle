package com.bytedance.lark.pb.calendar.v1;

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

public final class MarkRedDotsDisappearRequest extends Message<MarkRedDotsDisappearRequest, C15862a> {
    public static final ProtoAdapter<MarkRedDotsDisappearRequest> ADAPTER = new C15863b();
    private static final long serialVersionUID = 0;
    public final List<RedDotUiItem> red_dot_items;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MarkRedDotsDisappearRequest$b */
    private static final class C15863b extends ProtoAdapter<MarkRedDotsDisappearRequest> {
        C15863b() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkRedDotsDisappearRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MarkRedDotsDisappearRequest markRedDotsDisappearRequest) {
            return RedDotUiItem.ADAPTER.asRepeated().encodedSizeWithTag(1, markRedDotsDisappearRequest.red_dot_items) + markRedDotsDisappearRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MarkRedDotsDisappearRequest decode(ProtoReader protoReader) throws IOException {
            C15862a aVar = new C15862a();
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
                    aVar.f41684a.add(RedDotUiItem.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MarkRedDotsDisappearRequest markRedDotsDisappearRequest) throws IOException {
            RedDotUiItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, markRedDotsDisappearRequest.red_dot_items);
            protoWriter.writeBytes(markRedDotsDisappearRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MarkRedDotsDisappearRequest$a */
    public static final class C15862a extends Message.Builder<MarkRedDotsDisappearRequest, C15862a> {

        /* renamed from: a */
        public List<RedDotUiItem> f41684a = Internal.newMutableList();

        /* renamed from: a */
        public MarkRedDotsDisappearRequest build() {
            return new MarkRedDotsDisappearRequest(this.f41684a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15862a mo57237a(List<RedDotUiItem> list) {
            Internal.checkElementsNotNull(list);
            this.f41684a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15862a newBuilder() {
        C15862a aVar = new C15862a();
        aVar.f41684a = Internal.copyOf("red_dot_items", this.red_dot_items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MarkRedDotsDisappearRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.red_dot_items.isEmpty()) {
            sb.append(", red_dot_items=");
            sb.append(this.red_dot_items);
        }
        StringBuilder replace = sb.replace(0, 2, "MarkRedDotsDisappearRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MarkRedDotsDisappearRequest(List<RedDotUiItem> list) {
        this(list, ByteString.EMPTY);
    }

    public MarkRedDotsDisappearRequest(List<RedDotUiItem> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.red_dot_items = Internal.immutableCopyOf("red_dot_items", list);
    }
}
