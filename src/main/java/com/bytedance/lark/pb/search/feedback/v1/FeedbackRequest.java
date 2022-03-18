package com.bytedance.lark.pb.search.feedback.v1;

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

public final class FeedbackRequest extends Message<FeedbackRequest, C18751a> {
    public static final ProtoAdapter<FeedbackRequest> ADAPTER = new C18752b();
    public static final Scene DEFAULT_SCENE = Scene.Other;
    private static final long serialVersionUID = 0;
    public final String feedback_content;
    public final FeedbackParam param;
    public final List<FeedbackReasonItem> reason_items;
    public final Scene scene;
    public final List<FeedbackParamV2> v2_param_list;

    public enum Scene implements WireEnum {
        Other(0),
        IntegrationSearch(1),
        NoQuerySearch(2),
        Correction(3);
        
        public static final ProtoAdapter<Scene> ADAPTER = ProtoAdapter.newEnumAdapter(Scene.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Scene fromValue(int i) {
            if (i == 0) {
                return Other;
            }
            if (i == 1) {
                return IntegrationSearch;
            }
            if (i == 2) {
                return NoQuerySearch;
            }
            if (i != 3) {
                return null;
            }
            return Correction;
        }

        private Scene(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.FeedbackRequest$b */
    private static final class C18752b extends ProtoAdapter<FeedbackRequest> {
        C18752b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedbackRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedbackRequest feedbackRequest) {
            int i;
            int encodedSizeWithTag = Scene.ADAPTER.encodedSizeWithTag(1, feedbackRequest.scene) + ProtoAdapter.STRING.encodedSizeWithTag(2, feedbackRequest.feedback_content);
            if (feedbackRequest.param != null) {
                i = FeedbackParam.ADAPTER.encodedSizeWithTag(3, feedbackRequest.param);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + FeedbackReasonItem.ADAPTER.asRepeated().encodedSizeWithTag(4, feedbackRequest.reason_items) + FeedbackParamV2.ADAPTER.asRepeated().encodedSizeWithTag(5, feedbackRequest.v2_param_list) + feedbackRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FeedbackRequest decode(ProtoReader protoReader) throws IOException {
            C18751a aVar = new C18751a();
            aVar.f46298a = Scene.Other;
            aVar.f46299b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46298a = Scene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f46299b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46300c = FeedbackParam.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f46301d.add(FeedbackReasonItem.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46302e.add(FeedbackParamV2.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedbackRequest feedbackRequest) throws IOException {
            Scene.ADAPTER.encodeWithTag(protoWriter, 1, feedbackRequest.scene);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, feedbackRequest.feedback_content);
            if (feedbackRequest.param != null) {
                FeedbackParam.ADAPTER.encodeWithTag(protoWriter, 3, feedbackRequest.param);
            }
            FeedbackReasonItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, feedbackRequest.reason_items);
            FeedbackParamV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, feedbackRequest.v2_param_list);
            protoWriter.writeBytes(feedbackRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.FeedbackRequest$a */
    public static final class C18751a extends Message.Builder<FeedbackRequest, C18751a> {

        /* renamed from: a */
        public Scene f46298a;

        /* renamed from: b */
        public String f46299b;

        /* renamed from: c */
        public FeedbackParam f46300c;

        /* renamed from: d */
        public List<FeedbackReasonItem> f46301d = Internal.newMutableList();

        /* renamed from: e */
        public List<FeedbackParamV2> f46302e = Internal.newMutableList();

        /* renamed from: a */
        public FeedbackRequest build() {
            String str;
            Scene scene = this.f46298a;
            if (scene != null && (str = this.f46299b) != null) {
                return new FeedbackRequest(scene, str, this.f46300c, this.f46301d, this.f46302e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(scene, "scene", this.f46299b, "feedback_content");
        }

        /* renamed from: a */
        public C18751a mo64457a(FeedbackParam feedbackParam) {
            this.f46300c = feedbackParam;
            return this;
        }

        /* renamed from: a */
        public C18751a mo64458a(Scene scene) {
            this.f46298a = scene;
            return this;
        }

        /* renamed from: a */
        public C18751a mo64459a(String str) {
            this.f46299b = str;
            return this;
        }

        /* renamed from: a */
        public C18751a mo64460a(List<FeedbackReasonItem> list) {
            Internal.checkElementsNotNull(list);
            this.f46301d = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18751a newBuilder() {
        C18751a aVar = new C18751a();
        aVar.f46298a = this.scene;
        aVar.f46299b = this.feedback_content;
        aVar.f46300c = this.param;
        aVar.f46301d = Internal.copyOf("reason_items", this.reason_items);
        aVar.f46302e = Internal.copyOf("v2_param_list", this.v2_param_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "FeedbackRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.scene);
        sb.append(", feedback_content=");
        sb.append(this.feedback_content);
        if (this.param != null) {
            sb.append(", param=");
            sb.append(this.param);
        }
        if (!this.reason_items.isEmpty()) {
            sb.append(", reason_items=");
            sb.append(this.reason_items);
        }
        if (!this.v2_param_list.isEmpty()) {
            sb.append(", v2_param_list=");
            sb.append(this.v2_param_list);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedbackRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FeedbackRequest(Scene scene2, String str, FeedbackParam feedbackParam, List<FeedbackReasonItem> list, List<FeedbackParamV2> list2) {
        this(scene2, str, feedbackParam, list, list2, ByteString.EMPTY);
    }

    public FeedbackRequest(Scene scene2, String str, FeedbackParam feedbackParam, List<FeedbackReasonItem> list, List<FeedbackParamV2> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = scene2;
        this.feedback_content = str;
        this.param = feedbackParam;
        this.reason_items = Internal.immutableCopyOf("reason_items", list);
        this.v2_param_list = Internal.immutableCopyOf("v2_param_list", list2);
    }
}
