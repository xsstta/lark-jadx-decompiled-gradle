package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Channel;
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

public final class GetChannelThreadsRequest extends Message<GetChannelThreadsRequest, C17476a> {
    public static final ProtoAdapter<GetChannelThreadsRequest> ADAPTER = new C17477b();
    public static final Integer DEFAULT_COUNT = 20;
    public static final Boolean DEFAULT_NEED_REPLY_PROMPT = false;
    public static final Boolean DEFAULT_NEED_RESPONSE = true;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_PRELOAD_COUNT = 30;
    public static final Integer DEFAULT_REDUNDANCY_COUNT = 5;
    public static final Integer DEFAULT_REDUNDANCY_WEIGHTS_FOR_FILTER = 0;
    public static final ChannelDataScene DEFAULT_SCENE = ChannelDataScene.FIRST_SCREEN;
    public static final ChannelDataIncompleteStrategy DEFAULT_STRATEGY = ChannelDataIncompleteStrategy.SYNC_SERVER_DATA;
    public static final Integer DEFAULT_WEIGHTS_FOR_FILTER = 0;
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final Integer count;
    public final Boolean need_reply_prompt;
    public final Boolean need_response;
    public final Integer position;
    public final Integer preload_count;
    public final Integer redundancy_count;
    public final Integer redundancy_weights_for_filter;
    public final ChannelDataScene scene;
    public final ChannelDataIncompleteStrategy strategy;
    public final Integer weights_for_filter;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChannelThreadsRequest$b */
    private static final class C17477b extends ProtoAdapter<GetChannelThreadsRequest> {
        C17477b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChannelThreadsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChannelThreadsRequest getChannelThreadsRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = Channel.ADAPTER.encodedSizeWithTag(1, getChannelThreadsRequest.channel);
            int i10 = 0;
            if (getChannelThreadsRequest.scene != null) {
                i = ChannelDataScene.ADAPTER.encodedSizeWithTag(2, getChannelThreadsRequest.scene);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (getChannelThreadsRequest.redundancy_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getChannelThreadsRequest.redundancy_count);
            } else {
                i2 = 0;
            }
            int i12 = i11 + i2;
            if (getChannelThreadsRequest.position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, getChannelThreadsRequest.position);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (getChannelThreadsRequest.count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, getChannelThreadsRequest.count);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (getChannelThreadsRequest.strategy != null) {
                i5 = ChannelDataIncompleteStrategy.ADAPTER.encodedSizeWithTag(6, getChannelThreadsRequest.strategy);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (getChannelThreadsRequest.preload_count != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(7, getChannelThreadsRequest.preload_count);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (getChannelThreadsRequest.need_response != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(8, getChannelThreadsRequest.need_response);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (getChannelThreadsRequest.weights_for_filter != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(9, getChannelThreadsRequest.weights_for_filter);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (getChannelThreadsRequest.redundancy_weights_for_filter != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(10, getChannelThreadsRequest.redundancy_weights_for_filter);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (getChannelThreadsRequest.need_reply_prompt != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(11, getChannelThreadsRequest.need_reply_prompt);
            }
            return i19 + i10 + getChannelThreadsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChannelThreadsRequest decode(ProtoReader protoReader) throws IOException {
            C17476a aVar = new C17476a();
            aVar.f44368b = ChannelDataScene.FIRST_SCREEN;
            aVar.f44369c = 5;
            aVar.f44370d = 0;
            aVar.f44371e = 20;
            aVar.f44372f = ChannelDataIncompleteStrategy.SYNC_SERVER_DATA;
            aVar.f44373g = 30;
            aVar.f44374h = true;
            aVar.f44375i = 0;
            aVar.f44376j = 0;
            aVar.f44377k = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44367a = Channel.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f44368b = ChannelDataScene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f44369c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44370d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44371e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f44372f = ChannelDataIncompleteStrategy.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            aVar.f44373g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f44374h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f44375i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f44376j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f44377k = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetChannelThreadsRequest getChannelThreadsRequest) throws IOException {
            Channel.ADAPTER.encodeWithTag(protoWriter, 1, getChannelThreadsRequest.channel);
            if (getChannelThreadsRequest.scene != null) {
                ChannelDataScene.ADAPTER.encodeWithTag(protoWriter, 2, getChannelThreadsRequest.scene);
            }
            if (getChannelThreadsRequest.redundancy_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getChannelThreadsRequest.redundancy_count);
            }
            if (getChannelThreadsRequest.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getChannelThreadsRequest.position);
            }
            if (getChannelThreadsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getChannelThreadsRequest.count);
            }
            if (getChannelThreadsRequest.strategy != null) {
                ChannelDataIncompleteStrategy.ADAPTER.encodeWithTag(protoWriter, 6, getChannelThreadsRequest.strategy);
            }
            if (getChannelThreadsRequest.preload_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, getChannelThreadsRequest.preload_count);
            }
            if (getChannelThreadsRequest.need_response != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, getChannelThreadsRequest.need_response);
            }
            if (getChannelThreadsRequest.weights_for_filter != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, getChannelThreadsRequest.weights_for_filter);
            }
            if (getChannelThreadsRequest.redundancy_weights_for_filter != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, getChannelThreadsRequest.redundancy_weights_for_filter);
            }
            if (getChannelThreadsRequest.need_reply_prompt != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, getChannelThreadsRequest.need_reply_prompt);
            }
            protoWriter.writeBytes(getChannelThreadsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17476a newBuilder() {
        C17476a aVar = new C17476a();
        aVar.f44367a = this.channel;
        aVar.f44368b = this.scene;
        aVar.f44369c = this.redundancy_count;
        aVar.f44370d = this.position;
        aVar.f44371e = this.count;
        aVar.f44372f = this.strategy;
        aVar.f44373g = this.preload_count;
        aVar.f44374h = this.need_response;
        aVar.f44375i = this.weights_for_filter;
        aVar.f44376j = this.redundancy_weights_for_filter;
        aVar.f44377k = this.need_reply_prompt;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChannelThreadsRequest$a */
    public static final class C17476a extends Message.Builder<GetChannelThreadsRequest, C17476a> {

        /* renamed from: a */
        public Channel f44367a;

        /* renamed from: b */
        public ChannelDataScene f44368b;

        /* renamed from: c */
        public Integer f44369c;

        /* renamed from: d */
        public Integer f44370d;

        /* renamed from: e */
        public Integer f44371e;

        /* renamed from: f */
        public ChannelDataIncompleteStrategy f44372f;

        /* renamed from: g */
        public Integer f44373g;

        /* renamed from: h */
        public Boolean f44374h;

        /* renamed from: i */
        public Integer f44375i;

        /* renamed from: j */
        public Integer f44376j;

        /* renamed from: k */
        public Boolean f44377k;

        /* renamed from: a */
        public GetChannelThreadsRequest build() {
            Channel channel = this.f44367a;
            if (channel != null) {
                return new GetChannelThreadsRequest(channel, this.f44368b, this.f44369c, this.f44370d, this.f44371e, this.f44372f, this.f44373g, this.f44374h, this.f44375i, this.f44376j, this.f44377k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channel, "channel");
        }

        /* renamed from: a */
        public C17476a mo61245a(Channel channel) {
            this.f44367a = channel;
            return this;
        }

        /* renamed from: b */
        public C17476a mo61251b(Boolean bool) {
            this.f44377k = bool;
            return this;
        }

        /* renamed from: c */
        public C17476a mo61253c(Integer num) {
            this.f44371e = num;
            return this;
        }

        /* renamed from: d */
        public C17476a mo61254d(Integer num) {
            this.f44373g = num;
            return this;
        }

        /* renamed from: a */
        public C17476a mo61246a(ChannelDataIncompleteStrategy channelDataIncompleteStrategy) {
            this.f44372f = channelDataIncompleteStrategy;
            return this;
        }

        /* renamed from: b */
        public C17476a mo61252b(Integer num) {
            this.f44370d = num;
            return this;
        }

        /* renamed from: a */
        public C17476a mo61247a(ChannelDataScene channelDataScene) {
            this.f44368b = channelDataScene;
            return this;
        }

        /* renamed from: a */
        public C17476a mo61248a(Boolean bool) {
            this.f44374h = bool;
            return this;
        }

        /* renamed from: a */
        public C17476a mo61249a(Integer num) {
            this.f44369c = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChannelThreadsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel=");
        sb.append(this.channel);
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
        if (this.need_reply_prompt != null) {
            sb.append(", need_reply_prompt=");
            sb.append(this.need_reply_prompt);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChannelThreadsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChannelThreadsRequest(Channel channel2, ChannelDataScene channelDataScene, Integer num, Integer num2, Integer num3, ChannelDataIncompleteStrategy channelDataIncompleteStrategy, Integer num4, Boolean bool, Integer num5, Integer num6, Boolean bool2) {
        this(channel2, channelDataScene, num, num2, num3, channelDataIncompleteStrategy, num4, bool, num5, num6, bool2, ByteString.EMPTY);
    }

    public GetChannelThreadsRequest(Channel channel2, ChannelDataScene channelDataScene, Integer num, Integer num2, Integer num3, ChannelDataIncompleteStrategy channelDataIncompleteStrategy, Integer num4, Boolean bool, Integer num5, Integer num6, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel = channel2;
        this.scene = channelDataScene;
        this.redundancy_count = num;
        this.position = num2;
        this.count = num3;
        this.strategy = channelDataIncompleteStrategy;
        this.preload_count = num4;
        this.need_response = bool;
        this.weights_for_filter = num5;
        this.redundancy_weights_for_filter = num6;
        this.need_reply_prompt = bool2;
    }
}
