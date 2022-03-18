package com.ss.android.lark.pb.videoconference.v1;

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

public final class VcQueryDocsResponse extends Message<VcQueryDocsResponse, C51218a> {
    public static final ProtoAdapter<VcQueryDocsResponse> ADAPTER = new C51219b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final Integer DEFAULT_TOTAL = 0;
    private static final long serialVersionUID = 0;
    public final List<VcDocs> docs;
    public final Boolean has_more;
    public final Integer offset;
    public final Integer total;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VcQueryDocsResponse$b */
    private static final class C51219b extends ProtoAdapter<VcQueryDocsResponse> {
        C51219b() {
            super(FieldEncoding.LENGTH_DELIMITED, VcQueryDocsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VcQueryDocsResponse vcQueryDocsResponse) {
            int i;
            int encodedSizeWithTag = VcDocs.ADAPTER.asRepeated().encodedSizeWithTag(1, vcQueryDocsResponse.docs) + ProtoAdapter.BOOL.encodedSizeWithTag(2, vcQueryDocsResponse.has_more) + ProtoAdapter.INT32.encodedSizeWithTag(3, vcQueryDocsResponse.total);
            if (vcQueryDocsResponse.offset != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(4, vcQueryDocsResponse.offset);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + vcQueryDocsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VcQueryDocsResponse decode(ProtoReader protoReader) throws IOException {
            C51218a aVar = new C51218a();
            aVar.f127509b = false;
            aVar.f127510c = 0;
            aVar.f127511d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127508a.add(VcDocs.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f127509b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f127510c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127511d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VcQueryDocsResponse vcQueryDocsResponse) throws IOException {
            VcDocs.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, vcQueryDocsResponse.docs);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, vcQueryDocsResponse.has_more);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, vcQueryDocsResponse.total);
            if (vcQueryDocsResponse.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, vcQueryDocsResponse.offset);
            }
            protoWriter.writeBytes(vcQueryDocsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VcQueryDocsResponse$a */
    public static final class C51218a extends Message.Builder<VcQueryDocsResponse, C51218a> {

        /* renamed from: a */
        public List<VcDocs> f127508a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f127509b;

        /* renamed from: c */
        public Integer f127510c;

        /* renamed from: d */
        public Integer f127511d;

        /* renamed from: a */
        public VcQueryDocsResponse build() {
            Integer num;
            Boolean bool = this.f127509b;
            if (bool != null && (num = this.f127510c) != null) {
                return new VcQueryDocsResponse(this.f127508a, bool, num, this.f127511d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_more", this.f127510c, "total");
        }
    }

    @Override // com.squareup.wire.Message
    public C51218a newBuilder() {
        C51218a aVar = new C51218a();
        aVar.f127508a = Internal.copyOf("docs", this.docs);
        aVar.f127509b = this.has_more;
        aVar.f127510c = this.total;
        aVar.f127511d = this.offset;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VcQueryDocsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.docs.isEmpty()) {
            sb.append(", docs=");
            sb.append(this.docs);
        }
        sb.append(", has_more=");
        sb.append(this.has_more);
        sb.append(", total=");
        sb.append(this.total);
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        StringBuilder replace = sb.replace(0, 2, "VcQueryDocsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VcQueryDocsResponse(List<VcDocs> list, Boolean bool, Integer num, Integer num2) {
        this(list, bool, num, num2, ByteString.EMPTY);
    }

    public VcQueryDocsResponse(List<VcDocs> list, Boolean bool, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.docs = Internal.immutableCopyOf("docs", list);
        this.has_more = bool;
        this.total = num;
        this.offset = num2;
    }
}
