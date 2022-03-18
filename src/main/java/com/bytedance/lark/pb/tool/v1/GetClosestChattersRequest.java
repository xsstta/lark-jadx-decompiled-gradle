package com.bytedance.lark.pb.tool.v1;

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

public final class GetClosestChattersRequest extends Message<GetClosestChattersRequest, C19703a> {
    public static final ProtoAdapter<GetClosestChattersRequest> ADAPTER = new C19704b();
    public static final Integer DEFAULT_BEGIN = 0;
    public static final Integer DEFAULT_END = 4;
    private static final long serialVersionUID = 0;
    public final Integer begin;
    public final Integer end;
    public final FilterParam filter_param;

    public static final class FilterParam extends Message<FilterParam, C19701a> {
        public static final ProtoAdapter<FilterParam> ADAPTER = new C19702b();
        public static final Long DEFAULT_AGENDA_START_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final String agenda_id;
        public final Long agenda_start_time;
        public final List<String> chat_ids;

        /* renamed from: com.bytedance.lark.pb.tool.v1.GetClosestChattersRequest$FilterParam$b */
        private static final class C19702b extends ProtoAdapter<FilterParam> {
            C19702b() {
                super(FieldEncoding.LENGTH_DELIMITED, FilterParam.class);
            }

            /* renamed from: a */
            public int encodedSize(FilterParam filterParam) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, filterParam.chat_ids);
                int i2 = 0;
                if (filterParam.agenda_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, filterParam.agenda_id);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (filterParam.agenda_start_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, filterParam.agenda_start_time);
                }
                return i3 + i2 + filterParam.unknownFields().size();
            }

            /* renamed from: a */
            public FilterParam decode(ProtoReader protoReader) throws IOException {
                C19701a aVar = new C19701a();
                aVar.f48160b = "";
                aVar.f48161c = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f48159a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f48160b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48161c = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FilterParam filterParam) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, filterParam.chat_ids);
                if (filterParam.agenda_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, filterParam.agenda_id);
                }
                if (filterParam.agenda_start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, filterParam.agenda_start_time);
                }
                protoWriter.writeBytes(filterParam.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.GetClosestChattersRequest$FilterParam$a */
        public static final class C19701a extends Message.Builder<FilterParam, C19701a> {

            /* renamed from: a */
            public List<String> f48159a = Internal.newMutableList();

            /* renamed from: b */
            public String f48160b;

            /* renamed from: c */
            public Long f48161c;

            /* renamed from: a */
            public FilterParam build() {
                return new FilterParam(this.f48159a, this.f48160b, this.f48161c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19701a newBuilder() {
            C19701a aVar = new C19701a();
            aVar.f48159a = Internal.copyOf("chat_ids", this.chat_ids);
            aVar.f48160b = this.agenda_id;
            aVar.f48161c = this.agenda_start_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("tool", "FilterParam");
            StringBuilder sb = new StringBuilder();
            if (!this.chat_ids.isEmpty()) {
                sb.append(", chat_ids=");
                sb.append(this.chat_ids);
            }
            if (this.agenda_id != null) {
                sb.append(", agenda_id=");
                sb.append(this.agenda_id);
            }
            if (this.agenda_start_time != null) {
                sb.append(", agenda_start_time=");
                sb.append(this.agenda_start_time);
            }
            StringBuilder replace = sb.replace(0, 2, "FilterParam{");
            replace.append('}');
            return replace.toString();
        }

        public FilterParam(List<String> list, String str, Long l) {
            this(list, str, l, ByteString.EMPTY);
        }

        public FilterParam(List<String> list, String str, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
            this.agenda_id = str;
            this.agenda_start_time = l;
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetClosestChattersRequest$b */
    private static final class C19704b extends ProtoAdapter<GetClosestChattersRequest> {
        C19704b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetClosestChattersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetClosestChattersRequest getClosestChattersRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getClosestChattersRequest.begin != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getClosestChattersRequest.begin);
            } else {
                i = 0;
            }
            if (getClosestChattersRequest.end != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getClosestChattersRequest.end);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getClosestChattersRequest.filter_param != null) {
                i3 = FilterParam.ADAPTER.encodedSizeWithTag(3, getClosestChattersRequest.filter_param);
            }
            return i4 + i3 + getClosestChattersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetClosestChattersRequest decode(ProtoReader protoReader) throws IOException {
            C19703a aVar = new C19703a();
            aVar.f48162a = 0;
            aVar.f48163b = 4;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48162a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48163b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48164c = FilterParam.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetClosestChattersRequest getClosestChattersRequest) throws IOException {
            if (getClosestChattersRequest.begin != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getClosestChattersRequest.begin);
            }
            if (getClosestChattersRequest.end != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getClosestChattersRequest.end);
            }
            if (getClosestChattersRequest.filter_param != null) {
                FilterParam.ADAPTER.encodeWithTag(protoWriter, 3, getClosestChattersRequest.filter_param);
            }
            protoWriter.writeBytes(getClosestChattersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetClosestChattersRequest$a */
    public static final class C19703a extends Message.Builder<GetClosestChattersRequest, C19703a> {

        /* renamed from: a */
        public Integer f48162a;

        /* renamed from: b */
        public Integer f48163b;

        /* renamed from: c */
        public FilterParam f48164c;

        /* renamed from: a */
        public GetClosestChattersRequest build() {
            return new GetClosestChattersRequest(this.f48162a, this.f48163b, this.f48164c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19703a newBuilder() {
        C19703a aVar = new C19703a();
        aVar.f48162a = this.begin;
        aVar.f48163b = this.end;
        aVar.f48164c = this.filter_param;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "GetClosestChattersRequest");
        StringBuilder sb = new StringBuilder();
        if (this.begin != null) {
            sb.append(", begin=");
            sb.append(this.begin);
        }
        if (this.end != null) {
            sb.append(", end=");
            sb.append(this.end);
        }
        if (this.filter_param != null) {
            sb.append(", filter_param=");
            sb.append(this.filter_param);
        }
        StringBuilder replace = sb.replace(0, 2, "GetClosestChattersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetClosestChattersRequest(Integer num, Integer num2, FilterParam filterParam) {
        this(num, num2, filterParam, ByteString.EMPTY);
    }

    public GetClosestChattersRequest(Integer num, Integer num2, FilterParam filterParam, ByteString byteString) {
        super(ADAPTER, byteString);
        this.begin = num;
        this.end = num2;
        this.filter_param = filterParam;
    }
}
