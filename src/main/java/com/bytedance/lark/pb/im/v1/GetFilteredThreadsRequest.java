package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ChannelDataScene;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetFilteredThreadsRequest extends Message<GetFilteredThreadsRequest, C17580a> {
    public static final ProtoAdapter<GetFilteredThreadsRequest> ADAPTER = new C17581b();
    public static final Integer DEFAULT_COUNT = 10;
    public static final Integer DEFAULT_PRELOAD_COUNT = 30;
    public static final ChannelDataScene DEFAULT_SCENE = ChannelDataScene.FIRST_SCREEN;
    private static final long serialVersionUID = 0;
    public final String channel_id;
    public final Integer count;
    public final String cursor;
    public final ExtendData extend_data;
    public final String filter_id;
    public final Integer preload_count;
    public final ChannelDataScene scene;

    public static final class ExtendData extends Message<ExtendData, C17578a> {
        public static final ProtoAdapter<ExtendData> ADAPTER = new C17579b();
        private static final long serialVersionUID = 0;
        public final List<String> extend_filter_ids;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetFilteredThreadsRequest$ExtendData$b */
        private static final class C17579b extends ProtoAdapter<ExtendData> {
            C17579b() {
                super(FieldEncoding.LENGTH_DELIMITED, ExtendData.class);
            }

            /* renamed from: a */
            public int encodedSize(ExtendData extendData) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, extendData.extend_filter_ids) + extendData.unknownFields().size();
            }

            /* renamed from: a */
            public ExtendData decode(ProtoReader protoReader) throws IOException {
                C17578a aVar = new C17578a();
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
                        aVar.f44537a.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ExtendData extendData) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, extendData.extend_filter_ids);
                protoWriter.writeBytes(extendData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetFilteredThreadsRequest$ExtendData$a */
        public static final class C17578a extends Message.Builder<ExtendData, C17578a> {

            /* renamed from: a */
            public List<String> f44537a = Internal.newMutableList();

            /* renamed from: a */
            public ExtendData build() {
                return new ExtendData(this.f44537a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C17578a mo61510a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f44537a = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C17578a newBuilder() {
            C17578a aVar = new C17578a();
            aVar.f44537a = Internal.copyOf("extend_filter_ids", this.extend_filter_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "ExtendData");
            StringBuilder sb = new StringBuilder();
            if (!this.extend_filter_ids.isEmpty()) {
                sb.append(", extend_filter_ids=");
                sb.append(this.extend_filter_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "ExtendData{");
            replace.append('}');
            return replace.toString();
        }

        public ExtendData(List<String> list) {
            this(list, ByteString.EMPTY);
        }

        public ExtendData(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.extend_filter_ids = Internal.immutableCopyOf("extend_filter_ids", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetFilteredThreadsRequest$b */
    private static final class C17581b extends ProtoAdapter<GetFilteredThreadsRequest> {
        C17581b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFilteredThreadsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFilteredThreadsRequest getFilteredThreadsRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getFilteredThreadsRequest.channel_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getFilteredThreadsRequest.filter_id);
            int i5 = 0;
            if (getFilteredThreadsRequest.scene != null) {
                i = ChannelDataScene.ADAPTER.encodedSizeWithTag(3, getFilteredThreadsRequest.scene);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (getFilteredThreadsRequest.cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, getFilteredThreadsRequest.cursor);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (getFilteredThreadsRequest.count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, getFilteredThreadsRequest.count);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (getFilteredThreadsRequest.preload_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(6, getFilteredThreadsRequest.preload_count);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (getFilteredThreadsRequest.extend_data != null) {
                i5 = ExtendData.ADAPTER.encodedSizeWithTag(7, getFilteredThreadsRequest.extend_data);
            }
            return i9 + i5 + getFilteredThreadsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetFilteredThreadsRequest decode(ProtoReader protoReader) throws IOException {
            C17580a aVar = new C17580a();
            aVar.f44538a = "";
            aVar.f44539b = "";
            aVar.f44540c = ChannelDataScene.FIRST_SCREEN;
            aVar.f44541d = "";
            aVar.f44542e = 10;
            aVar.f44543f = 30;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44538a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44539b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f44540c = ChannelDataScene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f44541d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44542e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44543f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44544g = ExtendData.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetFilteredThreadsRequest getFilteredThreadsRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getFilteredThreadsRequest.channel_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getFilteredThreadsRequest.filter_id);
            if (getFilteredThreadsRequest.scene != null) {
                ChannelDataScene.ADAPTER.encodeWithTag(protoWriter, 3, getFilteredThreadsRequest.scene);
            }
            if (getFilteredThreadsRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getFilteredThreadsRequest.cursor);
            }
            if (getFilteredThreadsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getFilteredThreadsRequest.count);
            }
            if (getFilteredThreadsRequest.preload_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getFilteredThreadsRequest.preload_count);
            }
            if (getFilteredThreadsRequest.extend_data != null) {
                ExtendData.ADAPTER.encodeWithTag(protoWriter, 7, getFilteredThreadsRequest.extend_data);
            }
            protoWriter.writeBytes(getFilteredThreadsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetFilteredThreadsRequest$a */
    public static final class C17580a extends Message.Builder<GetFilteredThreadsRequest, C17580a> {

        /* renamed from: a */
        public String f44538a;

        /* renamed from: b */
        public String f44539b;

        /* renamed from: c */
        public ChannelDataScene f44540c;

        /* renamed from: d */
        public String f44541d;

        /* renamed from: e */
        public Integer f44542e;

        /* renamed from: f */
        public Integer f44543f;

        /* renamed from: g */
        public ExtendData f44544g;

        /* renamed from: a */
        public GetFilteredThreadsRequest build() {
            String str;
            String str2 = this.f44538a;
            if (str2 != null && (str = this.f44539b) != null) {
                return new GetFilteredThreadsRequest(str2, str, this.f44540c, this.f44541d, this.f44542e, this.f44543f, this.f44544g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "channel_id", this.f44539b, "filter_id");
        }

        /* renamed from: a */
        public C17580a mo61515a(ChannelDataScene channelDataScene) {
            this.f44540c = channelDataScene;
            return this;
        }

        /* renamed from: b */
        public C17580a mo61520b(Integer num) {
            this.f44543f = num;
            return this;
        }

        /* renamed from: c */
        public C17580a mo61522c(String str) {
            this.f44541d = str;
            return this;
        }

        /* renamed from: a */
        public C17580a mo61516a(ExtendData extendData) {
            this.f44544g = extendData;
            return this;
        }

        /* renamed from: b */
        public C17580a mo61521b(String str) {
            this.f44539b = str;
            return this;
        }

        /* renamed from: a */
        public C17580a mo61517a(Integer num) {
            this.f44542e = num;
            return this;
        }

        /* renamed from: a */
        public C17580a mo61518a(String str) {
            this.f44538a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17580a newBuilder() {
        C17580a aVar = new C17580a();
        aVar.f44538a = this.channel_id;
        aVar.f44539b = this.filter_id;
        aVar.f44540c = this.scene;
        aVar.f44541d = this.cursor;
        aVar.f44542e = this.count;
        aVar.f44543f = this.preload_count;
        aVar.f44544g = this.extend_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetFilteredThreadsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_id=");
        sb.append(this.channel_id);
        sb.append(", filter_id=");
        sb.append(this.filter_id);
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.preload_count != null) {
            sb.append(", preload_count=");
            sb.append(this.preload_count);
        }
        if (this.extend_data != null) {
            sb.append(", extend_data=");
            sb.append(this.extend_data);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFilteredThreadsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetFilteredThreadsRequest(String str, String str2, ChannelDataScene channelDataScene, String str3, Integer num, Integer num2, ExtendData extendData) {
        this(str, str2, channelDataScene, str3, num, num2, extendData, ByteString.EMPTY);
    }

    public GetFilteredThreadsRequest(String str, String str2, ChannelDataScene channelDataScene, String str3, Integer num, Integer num2, ExtendData extendData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_id = str;
        this.filter_id = str2;
        this.scene = channelDataScene;
        this.cursor = str3;
        this.count = num;
        this.preload_count = num2;
        this.extend_data = extendData;
    }
}
