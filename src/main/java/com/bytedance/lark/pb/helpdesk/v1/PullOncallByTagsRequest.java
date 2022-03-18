package com.bytedance.lark.pb.helpdesk.v1;

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

public final class PullOncallByTagsRequest extends Message<PullOncallByTagsRequest, C17272a> {
    public static final ProtoAdapter<PullOncallByTagsRequest> ADAPTER = new C17273b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Integer offset;
    public final List<String> tag_ids;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PullOncallByTagsRequest$b */
    private static final class C17273b extends ProtoAdapter<PullOncallByTagsRequest> {
        C17273b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullOncallByTagsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullOncallByTagsRequest pullOncallByTagsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, pullOncallByTagsRequest.tag_ids);
            int i2 = 0;
            if (pullOncallByTagsRequest.offset != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, pullOncallByTagsRequest.offset);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pullOncallByTagsRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, pullOncallByTagsRequest.count);
            }
            return i3 + i2 + pullOncallByTagsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullOncallByTagsRequest decode(ProtoReader protoReader) throws IOException {
            C17272a aVar = new C17272a();
            aVar.f44101b = 0;
            aVar.f44102c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44100a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44101b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44102c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullOncallByTagsRequest pullOncallByTagsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, pullOncallByTagsRequest.tag_ids);
            if (pullOncallByTagsRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullOncallByTagsRequest.offset);
            }
            if (pullOncallByTagsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, pullOncallByTagsRequest.count);
            }
            protoWriter.writeBytes(pullOncallByTagsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PullOncallByTagsRequest$a */
    public static final class C17272a extends Message.Builder<PullOncallByTagsRequest, C17272a> {

        /* renamed from: a */
        public List<String> f44100a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f44101b;

        /* renamed from: c */
        public Integer f44102c;

        /* renamed from: a */
        public PullOncallByTagsRequest build() {
            return new PullOncallByTagsRequest(this.f44100a, this.f44101b, this.f44102c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17272a mo60703a(Integer num) {
            this.f44101b = num;
            return this;
        }

        /* renamed from: b */
        public C17272a mo60706b(Integer num) {
            this.f44102c = num;
            return this;
        }

        /* renamed from: a */
        public C17272a mo60704a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44100a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17272a newBuilder() {
        C17272a aVar = new C17272a();
        aVar.f44100a = Internal.copyOf("tag_ids", this.tag_ids);
        aVar.f44101b = this.offset;
        aVar.f44102c = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "PullOncallByTagsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.tag_ids.isEmpty()) {
            sb.append(", tag_ids=");
            sb.append(this.tag_ids);
        }
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "PullOncallByTagsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullOncallByTagsRequest(List<String> list, Integer num, Integer num2) {
        this(list, num, num2, ByteString.EMPTY);
    }

    public PullOncallByTagsRequest(List<String> list, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tag_ids = Internal.immutableCopyOf("tag_ids", list);
        this.offset = num;
        this.count = num2;
    }
}
