package com.bytedance.lark.pb.im.v1;

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

public final class GetHomeSchoolChatClassResponse extends Message<GetHomeSchoolChatClassResponse, C17591a> {
    public static final ProtoAdapter<GetHomeSchoolChatClassResponse> ADAPTER = new C17592b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Integer DEFAULT_NEXT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final List<Class> classes;
    public final Boolean has_more;
    public final List<String> is_director_class_ids;
    public final Integer next_offset;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetHomeSchoolChatClassResponse$b */
    private static final class C17592b extends ProtoAdapter<GetHomeSchoolChatClassResponse> {
        C17592b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHomeSchoolChatClassResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHomeSchoolChatClassResponse getHomeSchoolChatClassResponse) {
            int i;
            int encodedSizeWithTag = Class.ADAPTER.asRepeated().encodedSizeWithTag(1, getHomeSchoolChatClassResponse.classes);
            if (getHomeSchoolChatClassResponse.next_offset != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, getHomeSchoolChatClassResponse.next_offset);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + ProtoAdapter.BOOL.encodedSizeWithTag(3, getHomeSchoolChatClassResponse.has_more) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, getHomeSchoolChatClassResponse.is_director_class_ids) + getHomeSchoolChatClassResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetHomeSchoolChatClassResponse decode(ProtoReader protoReader) throws IOException {
            C17591a aVar = new C17591a();
            aVar.f44563b = 0;
            aVar.f44564c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44562a.add(Class.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44563b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44564c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44565d.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHomeSchoolChatClassResponse getHomeSchoolChatClassResponse) throws IOException {
            Class.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getHomeSchoolChatClassResponse.classes);
            if (getHomeSchoolChatClassResponse.next_offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getHomeSchoolChatClassResponse.next_offset);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getHomeSchoolChatClassResponse.has_more);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, getHomeSchoolChatClassResponse.is_director_class_ids);
            protoWriter.writeBytes(getHomeSchoolChatClassResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetHomeSchoolChatClassResponse$a */
    public static final class C17591a extends Message.Builder<GetHomeSchoolChatClassResponse, C17591a> {

        /* renamed from: a */
        public List<Class> f44562a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f44563b;

        /* renamed from: c */
        public Boolean f44564c;

        /* renamed from: d */
        public List<String> f44565d = Internal.newMutableList();

        /* renamed from: a */
        public GetHomeSchoolChatClassResponse build() {
            Boolean bool = this.f44564c;
            if (bool != null) {
                return new GetHomeSchoolChatClassResponse(this.f44562a, this.f44563b, bool, this.f44565d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_more");
        }
    }

    @Override // com.squareup.wire.Message
    public C17591a newBuilder() {
        C17591a aVar = new C17591a();
        aVar.f44562a = Internal.copyOf("classes", this.classes);
        aVar.f44563b = this.next_offset;
        aVar.f44564c = this.has_more;
        aVar.f44565d = Internal.copyOf("is_director_class_ids", this.is_director_class_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetHomeSchoolChatClassResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.classes.isEmpty()) {
            sb.append(", classes=");
            sb.append(this.classes);
        }
        if (this.next_offset != null) {
            sb.append(", next_offset=");
            sb.append(this.next_offset);
        }
        sb.append(", has_more=");
        sb.append(this.has_more);
        if (!this.is_director_class_ids.isEmpty()) {
            sb.append(", is_director_class_ids=");
            sb.append(this.is_director_class_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetHomeSchoolChatClassResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetHomeSchoolChatClassResponse(List<Class> list, Integer num, Boolean bool, List<String> list2) {
        this(list, num, bool, list2, ByteString.EMPTY);
    }

    public GetHomeSchoolChatClassResponse(List<Class> list, Integer num, Boolean bool, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.classes = Internal.immutableCopyOf("classes", list);
        this.next_offset = num;
        this.has_more = bool;
        this.is_director_class_ids = Internal.immutableCopyOf("is_director_class_ids", list2);
    }
}
