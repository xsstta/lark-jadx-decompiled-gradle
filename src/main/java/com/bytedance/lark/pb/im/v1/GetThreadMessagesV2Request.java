package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ChannelDataIncompleteStrategy;
import com.bytedance.lark.pb.basic.v1.ChannelDataScene;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetThreadMessagesV2Request extends Message<GetThreadMessagesV2Request, C17703a> {
    public static final ProtoAdapter<GetThreadMessagesV2Request> ADAPTER = new C17704b();
    public static final Integer DEFAULT_COUNT = 20;
    public static final Boolean DEFAULT_NEED_RESPONSE = true;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_PRELOAD_COUNT = 30;
    public static final Integer DEFAULT_REDUNDANCY_COUNT = 5;
    public static final Integer DEFAULT_REDUNDANCY_WEIGHTS_FOR_FILTER = 0;
    public static final ChannelDataScene DEFAULT_SCENE = ChannelDataScene.FIRST_SCREEN;
    public static final ChannelDataIncompleteStrategy DEFAULT_STRATEGY = ChannelDataIncompleteStrategy.SYNC_SERVER_DATA;
    public static final Boolean DEFAULT_SUBSCRIBE_THREAD_EVENT = false;
    public static final Integer DEFAULT_WEIGHTS_FOR_FILTER = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Boolean need_response;
    public final Integer position;
    public final Integer preload_count;
    public final Integer redundancy_count;
    public final Integer redundancy_weights_for_filter;
    public final ChannelDataScene scene;
    public final ChannelDataIncompleteStrategy strategy;
    public final Boolean subscribe_thread_event;
    public final String thread_id;
    public final Integer weights_for_filter;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadMessagesV2Request$b */
    private static final class C17704b extends ProtoAdapter<GetThreadMessagesV2Request> {
        C17704b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetThreadMessagesV2Request.class);
        }

        /* renamed from: a */
        public int encodedSize(GetThreadMessagesV2Request getThreadMessagesV2Request) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getThreadMessagesV2Request.thread_id);
            int i10 = 0;
            if (getThreadMessagesV2Request.scene != null) {
                i = ChannelDataScene.ADAPTER.encodedSizeWithTag(2, getThreadMessagesV2Request.scene);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (getThreadMessagesV2Request.redundancy_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getThreadMessagesV2Request.redundancy_count);
            } else {
                i2 = 0;
            }
            int i12 = i11 + i2;
            if (getThreadMessagesV2Request.position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, getThreadMessagesV2Request.position);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (getThreadMessagesV2Request.count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, getThreadMessagesV2Request.count);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (getThreadMessagesV2Request.strategy != null) {
                i5 = ChannelDataIncompleteStrategy.ADAPTER.encodedSizeWithTag(6, getThreadMessagesV2Request.strategy);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (getThreadMessagesV2Request.subscribe_thread_event != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, getThreadMessagesV2Request.subscribe_thread_event);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (getThreadMessagesV2Request.preload_count != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(8, getThreadMessagesV2Request.preload_count);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (getThreadMessagesV2Request.need_response != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, getThreadMessagesV2Request.need_response);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (getThreadMessagesV2Request.weights_for_filter != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(10, getThreadMessagesV2Request.weights_for_filter);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (getThreadMessagesV2Request.redundancy_weights_for_filter != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, getThreadMessagesV2Request.redundancy_weights_for_filter);
            }
            return i19 + i10 + getThreadMessagesV2Request.unknownFields().size();
        }

        /* renamed from: a */
        public GetThreadMessagesV2Request decode(ProtoReader protoReader) throws IOException {
            C17703a aVar = new C17703a();
            aVar.f44722a = "";
            aVar.f44723b = ChannelDataScene.FIRST_SCREEN;
            aVar.f44724c = 5;
            aVar.f44725d = 0;
            aVar.f44726e = 20;
            aVar.f44727f = ChannelDataIncompleteStrategy.SYNC_SERVER_DATA;
            aVar.f44728g = false;
            aVar.f44729h = 30;
            aVar.f44730i = true;
            aVar.f44731j = 0;
            aVar.f44732k = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44722a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f44723b = ChannelDataScene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f44724c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44725d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44726e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f44727f = ChannelDataIncompleteStrategy.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            aVar.f44728g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f44729h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f44730i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f44731j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f44732k = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetThreadMessagesV2Request getThreadMessagesV2Request) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getThreadMessagesV2Request.thread_id);
            if (getThreadMessagesV2Request.scene != null) {
                ChannelDataScene.ADAPTER.encodeWithTag(protoWriter, 2, getThreadMessagesV2Request.scene);
            }
            if (getThreadMessagesV2Request.redundancy_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getThreadMessagesV2Request.redundancy_count);
            }
            if (getThreadMessagesV2Request.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getThreadMessagesV2Request.position);
            }
            if (getThreadMessagesV2Request.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getThreadMessagesV2Request.count);
            }
            if (getThreadMessagesV2Request.strategy != null) {
                ChannelDataIncompleteStrategy.ADAPTER.encodeWithTag(protoWriter, 6, getThreadMessagesV2Request.strategy);
            }
            if (getThreadMessagesV2Request.subscribe_thread_event != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, getThreadMessagesV2Request.subscribe_thread_event);
            }
            if (getThreadMessagesV2Request.preload_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, getThreadMessagesV2Request.preload_count);
            }
            if (getThreadMessagesV2Request.need_response != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, getThreadMessagesV2Request.need_response);
            }
            if (getThreadMessagesV2Request.weights_for_filter != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, getThreadMessagesV2Request.weights_for_filter);
            }
            if (getThreadMessagesV2Request.redundancy_weights_for_filter != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, getThreadMessagesV2Request.redundancy_weights_for_filter);
            }
            protoWriter.writeBytes(getThreadMessagesV2Request.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17703a newBuilder() {
        C17703a aVar = new C17703a();
        aVar.f44722a = this.thread_id;
        aVar.f44723b = this.scene;
        aVar.f44724c = this.redundancy_count;
        aVar.f44725d = this.position;
        aVar.f44726e = this.count;
        aVar.f44727f = this.strategy;
        aVar.f44728g = this.subscribe_thread_event;
        aVar.f44729h = this.preload_count;
        aVar.f44730i = this.need_response;
        aVar.f44731j = this.weights_for_filter;
        aVar.f44732k = this.redundancy_weights_for_filter;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadMessagesV2Request$a */
    public static final class C17703a extends Message.Builder<GetThreadMessagesV2Request, C17703a> {

        /* renamed from: a */
        public String f44722a;

        /* renamed from: b */
        public ChannelDataScene f44723b;

        /* renamed from: c */
        public Integer f44724c;

        /* renamed from: d */
        public Integer f44725d;

        /* renamed from: e */
        public Integer f44726e;

        /* renamed from: f */
        public ChannelDataIncompleteStrategy f44727f;

        /* renamed from: g */
        public Boolean f44728g;

        /* renamed from: h */
        public Integer f44729h;

        /* renamed from: i */
        public Boolean f44730i;

        /* renamed from: j */
        public Integer f44731j;

        /* renamed from: k */
        public Integer f44732k;

        /* renamed from: a */
        public GetThreadMessagesV2Request build() {
            String str = this.f44722a;
            if (str != null) {
                return new GetThreadMessagesV2Request(str, this.f44723b, this.f44724c, this.f44725d, this.f44726e, this.f44727f, this.f44728g, this.f44729h, this.f44730i, this.f44731j, this.f44732k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "thread_id");
        }

        /* renamed from: a */
        public C17703a mo61828a(ChannelDataIncompleteStrategy channelDataIncompleteStrategy) {
            this.f44727f = channelDataIncompleteStrategy;
            return this;
        }

        /* renamed from: b */
        public C17703a mo61834b(Integer num) {
            this.f44725d = num;
            return this;
        }

        /* renamed from: c */
        public C17703a mo61835c(Integer num) {
            this.f44726e = num;
            return this;
        }

        /* renamed from: d */
        public C17703a mo61836d(Integer num) {
            this.f44729h = num;
            return this;
        }

        /* renamed from: a */
        public C17703a mo61829a(ChannelDataScene channelDataScene) {
            this.f44723b = channelDataScene;
            return this;
        }

        /* renamed from: a */
        public C17703a mo61830a(Boolean bool) {
            this.f44730i = bool;
            return this;
        }

        /* renamed from: a */
        public C17703a mo61831a(Integer num) {
            this.f44724c = num;
            return this;
        }

        /* renamed from: a */
        public C17703a mo61832a(String str) {
            this.f44722a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetThreadMessagesV2Request");
        StringBuilder sb = new StringBuilder();
        sb.append(", thread_id=");
        sb.append(this.thread_id);
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.redundancy_count != null) {
            sb.append(", redundancy_count=");
            sb.append(this.redundancy_count);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        if (this.subscribe_thread_event != null) {
            sb.append(", subscribe_thread_event=");
            sb.append(this.subscribe_thread_event);
        }
        if (this.preload_count != null) {
            sb.append(", preload_count=");
            sb.append(this.preload_count);
        }
        if (this.need_response != null) {
            sb.append(", need_response=");
            sb.append(this.need_response);
        }
        if (this.weights_for_filter != null) {
            sb.append(", weights_for_filter=");
            sb.append(this.weights_for_filter);
        }
        if (this.redundancy_weights_for_filter != null) {
            sb.append(", redundancy_weights_for_filter=");
            sb.append(this.redundancy_weights_for_filter);
        }
        StringBuilder replace = sb.replace(0, 2, "GetThreadMessagesV2Request{");
        replace.append('}');
        return replace.toString();
    }

    public GetThreadMessagesV2Request(String str, ChannelDataScene channelDataScene, Integer num, Integer num2, Integer num3, ChannelDataIncompleteStrategy channelDataIncompleteStrategy, Boolean bool, Integer num4, Boolean bool2, Integer num5, Integer num6) {
        this(str, channelDataScene, num, num2, num3, channelDataIncompleteStrategy, bool, num4, bool2, num5, num6, ByteString.EMPTY);
    }

    public GetThreadMessagesV2Request(String str, ChannelDataScene channelDataScene, Integer num, Integer num2, Integer num3, ChannelDataIncompleteStrategy channelDataIncompleteStrategy, Boolean bool, Integer num4, Boolean bool2, Integer num5, Integer num6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.scene = channelDataScene;
        this.redundancy_count = num;
        this.position = num2;
        this.count = num3;
        this.strategy = channelDataIncompleteStrategy;
        this.subscribe_thread_event = bool;
        this.preload_count = num4;
        this.need_response = bool2;
        this.weights_for_filter = num5;
        this.redundancy_weights_for_filter = num6;
    }
}
