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

public final class GetChatMessagesRequest extends Message<GetChatMessagesRequest, C17528a> {
    public static final ProtoAdapter<GetChatMessagesRequest> ADAPTER = new C17529b();
    public static final Integer DEFAULT_COUNT = 20;
    public static final Boolean DEFAULT_NEED_RESPONSE = true;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_PRELOAD_COUNT = 30;
    public static final Integer DEFAULT_REDUNDANCY_COUNT = 5;
    public static final Integer DEFAULT_REDUNDANCY_WEIGHTS_FOR_FILTER = 0;
    public static final ChannelDataScene DEFAULT_SCENE = ChannelDataScene.FIRST_SCREEN;
    public static final ChannelDataIncompleteStrategy DEFAULT_STRATEGY = ChannelDataIncompleteStrategy.SYNC_SERVER_DATA;
    public static final Boolean DEFAULT_SUBSCRIB_CHAT_EVENT = false;
    public static final Integer DEFAULT_WEIGHTS_FOR_FILTER = 0;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Integer count;
    public final Boolean need_response;
    public final Integer position;
    public final Integer preload_count;
    public final Integer redundancy_count;
    public final Integer redundancy_weights_for_filter;
    public final ChannelDataScene scene;
    public final ChannelDataIncompleteStrategy strategy;
    public final Boolean subscrib_chat_event;
    public final Integer weights_for_filter;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatMessagesRequest$b */
    private static final class C17529b extends ProtoAdapter<GetChatMessagesRequest> {
        C17529b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatMessagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatMessagesRequest getChatMessagesRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatMessagesRequest.chat_id);
            int i10 = 0;
            if (getChatMessagesRequest.scene != null) {
                i = ChannelDataScene.ADAPTER.encodedSizeWithTag(2, getChatMessagesRequest.scene);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (getChatMessagesRequest.redundancy_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getChatMessagesRequest.redundancy_count);
            } else {
                i2 = 0;
            }
            int i12 = i11 + i2;
            if (getChatMessagesRequest.position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, getChatMessagesRequest.position);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (getChatMessagesRequest.count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, getChatMessagesRequest.count);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (getChatMessagesRequest.strategy != null) {
                i5 = ChannelDataIncompleteStrategy.ADAPTER.encodedSizeWithTag(6, getChatMessagesRequest.strategy);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (getChatMessagesRequest.subscrib_chat_event != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, getChatMessagesRequest.subscrib_chat_event);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (getChatMessagesRequest.preload_count != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(8, getChatMessagesRequest.preload_count);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (getChatMessagesRequest.need_response != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, getChatMessagesRequest.need_response);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (getChatMessagesRequest.weights_for_filter != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(10, getChatMessagesRequest.weights_for_filter);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (getChatMessagesRequest.redundancy_weights_for_filter != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, getChatMessagesRequest.redundancy_weights_for_filter);
            }
            return i19 + i10 + getChatMessagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatMessagesRequest decode(ProtoReader protoReader) throws IOException {
            C17528a aVar = new C17528a();
            aVar.f44462a = "";
            aVar.f44463b = ChannelDataScene.FIRST_SCREEN;
            aVar.f44464c = 5;
            aVar.f44465d = 0;
            aVar.f44466e = 20;
            aVar.f44467f = ChannelDataIncompleteStrategy.SYNC_SERVER_DATA;
            aVar.f44468g = false;
            aVar.f44469h = 30;
            aVar.f44470i = true;
            aVar.f44471j = 0;
            aVar.f44472k = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44462a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f44463b = ChannelDataScene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f44464c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44465d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44466e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f44467f = ChannelDataIncompleteStrategy.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            aVar.f44468g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f44469h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f44470i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f44471j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f44472k = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetChatMessagesRequest getChatMessagesRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatMessagesRequest.chat_id);
            if (getChatMessagesRequest.scene != null) {
                ChannelDataScene.ADAPTER.encodeWithTag(protoWriter, 2, getChatMessagesRequest.scene);
            }
            if (getChatMessagesRequest.redundancy_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getChatMessagesRequest.redundancy_count);
            }
            if (getChatMessagesRequest.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getChatMessagesRequest.position);
            }
            if (getChatMessagesRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getChatMessagesRequest.count);
            }
            if (getChatMessagesRequest.strategy != null) {
                ChannelDataIncompleteStrategy.ADAPTER.encodeWithTag(protoWriter, 6, getChatMessagesRequest.strategy);
            }
            if (getChatMessagesRequest.subscrib_chat_event != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, getChatMessagesRequest.subscrib_chat_event);
            }
            if (getChatMessagesRequest.preload_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, getChatMessagesRequest.preload_count);
            }
            if (getChatMessagesRequest.need_response != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, getChatMessagesRequest.need_response);
            }
            if (getChatMessagesRequest.weights_for_filter != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, getChatMessagesRequest.weights_for_filter);
            }
            if (getChatMessagesRequest.redundancy_weights_for_filter != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, getChatMessagesRequest.redundancy_weights_for_filter);
            }
            protoWriter.writeBytes(getChatMessagesRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17528a newBuilder() {
        C17528a aVar = new C17528a();
        aVar.f44462a = this.chat_id;
        aVar.f44463b = this.scene;
        aVar.f44464c = this.redundancy_count;
        aVar.f44465d = this.position;
        aVar.f44466e = this.count;
        aVar.f44467f = this.strategy;
        aVar.f44468g = this.subscrib_chat_event;
        aVar.f44469h = this.preload_count;
        aVar.f44470i = this.need_response;
        aVar.f44471j = this.weights_for_filter;
        aVar.f44472k = this.redundancy_weights_for_filter;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatMessagesRequest$a */
    public static final class C17528a extends Message.Builder<GetChatMessagesRequest, C17528a> {

        /* renamed from: a */
        public String f44462a;

        /* renamed from: b */
        public ChannelDataScene f44463b;

        /* renamed from: c */
        public Integer f44464c;

        /* renamed from: d */
        public Integer f44465d;

        /* renamed from: e */
        public Integer f44466e;

        /* renamed from: f */
        public ChannelDataIncompleteStrategy f44467f;

        /* renamed from: g */
        public Boolean f44468g;

        /* renamed from: h */
        public Integer f44469h;

        /* renamed from: i */
        public Boolean f44470i;

        /* renamed from: j */
        public Integer f44471j;

        /* renamed from: k */
        public Integer f44472k;

        /* renamed from: a */
        public GetChatMessagesRequest build() {
            String str = this.f44462a;
            if (str != null) {
                return new GetChatMessagesRequest(str, this.f44463b, this.f44464c, this.f44465d, this.f44466e, this.f44467f, this.f44468g, this.f44469h, this.f44470i, this.f44471j, this.f44472k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17528a mo61386a(ChannelDataIncompleteStrategy channelDataIncompleteStrategy) {
            this.f44467f = channelDataIncompleteStrategy;
            return this;
        }

        /* renamed from: b */
        public C17528a mo61392b(Integer num) {
            this.f44465d = num;
            return this;
        }

        /* renamed from: c */
        public C17528a mo61393c(Integer num) {
            this.f44466e = num;
            return this;
        }

        /* renamed from: d */
        public C17528a mo61394d(Integer num) {
            this.f44469h = num;
            return this;
        }

        /* renamed from: e */
        public C17528a mo61395e(Integer num) {
            this.f44471j = num;
            return this;
        }

        /* renamed from: a */
        public C17528a mo61387a(ChannelDataScene channelDataScene) {
            this.f44463b = channelDataScene;
            return this;
        }

        /* renamed from: a */
        public C17528a mo61388a(Boolean bool) {
            this.f44470i = bool;
            return this;
        }

        /* renamed from: a */
        public C17528a mo61389a(Integer num) {
            this.f44464c = num;
            return this;
        }

        /* renamed from: a */
        public C17528a mo61390a(String str) {
            this.f44462a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatMessagesRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
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
        if (this.subscrib_chat_event != null) {
            sb.append(", subscrib_chat_event=");
            sb.append(this.subscrib_chat_event);
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
        StringBuilder replace = sb.replace(0, 2, "GetChatMessagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatMessagesRequest(String str, ChannelDataScene channelDataScene, Integer num, Integer num2, Integer num3, ChannelDataIncompleteStrategy channelDataIncompleteStrategy, Boolean bool, Integer num4, Boolean bool2, Integer num5, Integer num6) {
        this(str, channelDataScene, num, num2, num3, channelDataIncompleteStrategy, bool, num4, bool2, num5, num6, ByteString.EMPTY);
    }

    public GetChatMessagesRequest(String str, ChannelDataScene channelDataScene, Integer num, Integer num2, Integer num3, ChannelDataIncompleteStrategy channelDataIncompleteStrategy, Boolean bool, Integer num4, Boolean bool2, Integer num5, Integer num6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.scene = channelDataScene;
        this.redundancy_count = num;
        this.position = num2;
        this.count = num3;
        this.strategy = channelDataIncompleteStrategy;
        this.subscrib_chat_event = bool;
        this.preload_count = num4;
        this.need_response = bool2;
        this.weights_for_filter = num5;
        this.redundancy_weights_for_filter = num6;
    }
}
