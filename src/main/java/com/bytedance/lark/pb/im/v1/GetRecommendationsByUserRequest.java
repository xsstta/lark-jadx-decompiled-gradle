package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetRecommendationsByUserRequest extends Message<GetRecommendationsByUserRequest, C17668a> {
    public static final ProtoAdapter<GetRecommendationsByUserRequest> ADAPTER = new C17669b();
    public static final Integer DEFAULT_COUNT = 10;
    public static final Integer DEFAULT_PRELOAD_COUNT = 30;
    public static final RecommendationsScene DEFAULT_SCENE = RecommendationsScene.FIRST_SCREEN;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String cursor;
    public final Integer preload_count;
    public final RecommendationsScene scene;

    public enum RecommendationsScene implements WireEnum {
        FIRST_SCREEN(1),
        NEXT_PAGE(2),
        REFRESH(3);
        
        public static final ProtoAdapter<RecommendationsScene> ADAPTER = ProtoAdapter.newEnumAdapter(RecommendationsScene.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RecommendationsScene fromValue(int i) {
            if (i == 1) {
                return FIRST_SCREEN;
            }
            if (i == 2) {
                return NEXT_PAGE;
            }
            if (i != 3) {
                return null;
            }
            return REFRESH;
        }

        private RecommendationsScene(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetRecommendationsByUserRequest$b */
    private static final class C17669b extends ProtoAdapter<GetRecommendationsByUserRequest> {
        C17669b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRecommendationsByUserRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRecommendationsByUserRequest getRecommendationsByUserRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = RecommendationsScene.ADAPTER.encodedSizeWithTag(1, getRecommendationsByUserRequest.scene);
            int i3 = 0;
            if (getRecommendationsByUserRequest.cursor != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getRecommendationsByUserRequest.cursor);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getRecommendationsByUserRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getRecommendationsByUserRequest.count);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getRecommendationsByUserRequest.preload_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, getRecommendationsByUserRequest.preload_count);
            }
            return i5 + i3 + getRecommendationsByUserRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetRecommendationsByUserRequest decode(ProtoReader protoReader) throws IOException {
            C17668a aVar = new C17668a();
            aVar.f44672a = RecommendationsScene.FIRST_SCREEN;
            aVar.f44673b = "";
            aVar.f44674c = 10;
            aVar.f44675d = 30;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44672a = RecommendationsScene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f44673b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44674c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44675d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRecommendationsByUserRequest getRecommendationsByUserRequest) throws IOException {
            RecommendationsScene.ADAPTER.encodeWithTag(protoWriter, 1, getRecommendationsByUserRequest.scene);
            if (getRecommendationsByUserRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getRecommendationsByUserRequest.cursor);
            }
            if (getRecommendationsByUserRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getRecommendationsByUserRequest.count);
            }
            if (getRecommendationsByUserRequest.preload_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getRecommendationsByUserRequest.preload_count);
            }
            protoWriter.writeBytes(getRecommendationsByUserRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17668a newBuilder() {
        C17668a aVar = new C17668a();
        aVar.f44672a = this.scene;
        aVar.f44673b = this.cursor;
        aVar.f44674c = this.count;
        aVar.f44675d = this.preload_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetRecommendationsByUserRequest$a */
    public static final class C17668a extends Message.Builder<GetRecommendationsByUserRequest, C17668a> {

        /* renamed from: a */
        public RecommendationsScene f44672a;

        /* renamed from: b */
        public String f44673b;

        /* renamed from: c */
        public Integer f44674c;

        /* renamed from: d */
        public Integer f44675d;

        /* renamed from: a */
        public GetRecommendationsByUserRequest build() {
            RecommendationsScene recommendationsScene = this.f44672a;
            if (recommendationsScene != null) {
                return new GetRecommendationsByUserRequest(recommendationsScene, this.f44673b, this.f44674c, this.f44675d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(recommendationsScene, "scene");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetRecommendationsByUserRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.scene);
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
        StringBuilder replace = sb.replace(0, 2, "GetRecommendationsByUserRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetRecommendationsByUserRequest(RecommendationsScene recommendationsScene, String str, Integer num, Integer num2) {
        this(recommendationsScene, str, num, num2, ByteString.EMPTY);
    }

    public GetRecommendationsByUserRequest(RecommendationsScene recommendationsScene, String str, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = recommendationsScene;
        this.cursor = str;
        this.count = num;
        this.preload_count = num2;
    }
}
