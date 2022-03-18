package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SubscribeFeedPushSceneRequest extends Message<SubscribeFeedPushSceneRequest, C17230a> {
    public static final ProtoAdapter<SubscribeFeedPushSceneRequest> ADAPTER = new C17231b();
    private static final long serialVersionUID = 0;
    public final List<Scene> subscribe;
    public final List<Scene> unsubscribe;

    public enum Scene implements WireEnum {
        DELAY(1),
        BOX(2);
        
        public static final ProtoAdapter<Scene> ADAPTER = ProtoAdapter.newEnumAdapter(Scene.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Scene fromValue(int i) {
            if (i == 1) {
                return DELAY;
            }
            if (i != 2) {
                return null;
            }
            return BOX;
        }

        private Scene(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.SubscribeFeedPushSceneRequest$b */
    private static final class C17231b extends ProtoAdapter<SubscribeFeedPushSceneRequest> {
        C17231b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeFeedPushSceneRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeFeedPushSceneRequest subscribeFeedPushSceneRequest) {
            return Scene.ADAPTER.asRepeated().encodedSizeWithTag(1, subscribeFeedPushSceneRequest.subscribe) + Scene.ADAPTER.asRepeated().encodedSizeWithTag(2, subscribeFeedPushSceneRequest.unsubscribe) + subscribeFeedPushSceneRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeFeedPushSceneRequest decode(ProtoReader protoReader) throws IOException {
            C17230a aVar = new C17230a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44035a.add(Scene.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44036b.add(Scene.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeFeedPushSceneRequest subscribeFeedPushSceneRequest) throws IOException {
            Scene.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, subscribeFeedPushSceneRequest.subscribe);
            Scene.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, subscribeFeedPushSceneRequest.unsubscribe);
            protoWriter.writeBytes(subscribeFeedPushSceneRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.SubscribeFeedPushSceneRequest$a */
    public static final class C17230a extends Message.Builder<SubscribeFeedPushSceneRequest, C17230a> {

        /* renamed from: a */
        public List<Scene> f44035a = Internal.newMutableList();

        /* renamed from: b */
        public List<Scene> f44036b = Internal.newMutableList();

        /* renamed from: a */
        public SubscribeFeedPushSceneRequest build() {
            return new SubscribeFeedPushSceneRequest(this.f44035a, this.f44036b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17230a mo60596a(List<Scene> list) {
            Internal.checkElementsNotNull(list);
            this.f44035a = list;
            return this;
        }

        /* renamed from: b */
        public C17230a mo60598b(List<Scene> list) {
            Internal.checkElementsNotNull(list);
            this.f44036b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17230a newBuilder() {
        C17230a aVar = new C17230a();
        aVar.f44035a = Internal.copyOf("subscribe", this.subscribe);
        aVar.f44036b = Internal.copyOf("unsubscribe", this.unsubscribe);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "SubscribeFeedPushSceneRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.subscribe.isEmpty()) {
            sb.append(", subscribe=");
            sb.append(this.subscribe);
        }
        if (!this.unsubscribe.isEmpty()) {
            sb.append(", unsubscribe=");
            sb.append(this.unsubscribe);
        }
        StringBuilder replace = sb.replace(0, 2, "SubscribeFeedPushSceneRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeFeedPushSceneRequest(List<Scene> list, List<Scene> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public SubscribeFeedPushSceneRequest(List<Scene> list, List<Scene> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.subscribe = Internal.immutableCopyOf("subscribe", list);
        this.unsubscribe = Internal.immutableCopyOf("unsubscribe", list2);
    }
}
