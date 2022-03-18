package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullOpenAppBadgeNodesRequest extends Message<PullOpenAppBadgeNodesRequest, C18683a> {
    public static final ProtoAdapter<PullOpenAppBadgeNodesRequest> ADAPTER = new C18684b();
    public static final Boolean DEFAULT_IS_MOBILE = false;
    public static final Boolean DEFAULT_NEED_TRIGGER_PUSH = false;
    public static final CommonEnum.LoadStrategy DEFAULT_STRATEGY = CommonEnum.LoadStrategy.Local;
    private static final long serialVersionUID = 0;
    public final List<IdFeaturePair> id_feature_pairs;
    public final Boolean is_mobile;
    public final Boolean need_trigger_push;
    public final CommonEnum.LoadStrategy strategy;

    public static final class IdFeaturePair extends Message<IdFeaturePair, C18681a> {
        public static final ProtoAdapter<IdFeaturePair> ADAPTER = new C18682b();
        public static final CommonEnum.OpenAppFeatureType DEFAULT_FEATURE = CommonEnum.OpenAppFeatureType.MiniApp;
        private static final long serialVersionUID = 0;
        public final String app_id;
        public final CommonEnum.OpenAppFeatureType feature;

        /* renamed from: com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesRequest$IdFeaturePair$b */
        private static final class C18682b extends ProtoAdapter<IdFeaturePair> {
            C18682b() {
                super(FieldEncoding.LENGTH_DELIMITED, IdFeaturePair.class);
            }

            /* renamed from: a */
            public int encodedSize(IdFeaturePair idFeaturePair) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, idFeaturePair.app_id);
                if (idFeaturePair.feature != null) {
                    i = CommonEnum.OpenAppFeatureType.ADAPTER.encodedSizeWithTag(2, idFeaturePair.feature);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + idFeaturePair.unknownFields().size();
            }

            /* renamed from: a */
            public IdFeaturePair decode(ProtoReader protoReader) throws IOException {
                C18681a aVar = new C18681a();
                aVar.f46219a = "";
                aVar.f46220b = CommonEnum.OpenAppFeatureType.MiniApp;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46219a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f46220b = CommonEnum.OpenAppFeatureType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, IdFeaturePair idFeaturePair) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, idFeaturePair.app_id);
                if (idFeaturePair.feature != null) {
                    CommonEnum.OpenAppFeatureType.ADAPTER.encodeWithTag(protoWriter, 2, idFeaturePair.feature);
                }
                protoWriter.writeBytes(idFeaturePair.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesRequest$IdFeaturePair$a */
        public static final class C18681a extends Message.Builder<IdFeaturePair, C18681a> {

            /* renamed from: a */
            public String f46219a;

            /* renamed from: b */
            public CommonEnum.OpenAppFeatureType f46220b;

            /* renamed from: a */
            public IdFeaturePair build() {
                String str = this.f46219a;
                if (str != null) {
                    return new IdFeaturePair(str, this.f46220b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "app_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C18681a newBuilder() {
            C18681a aVar = new C18681a();
            aVar.f46219a = this.app_id;
            aVar.f46220b = this.feature;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("openplatform", "IdFeaturePair");
            StringBuilder sb = new StringBuilder();
            sb.append(", app_id=");
            sb.append(this.app_id);
            if (this.feature != null) {
                sb.append(", feature=");
                sb.append(this.feature);
            }
            StringBuilder replace = sb.replace(0, 2, "IdFeaturePair{");
            replace.append('}');
            return replace.toString();
        }

        public IdFeaturePair(String str, CommonEnum.OpenAppFeatureType openAppFeatureType) {
            this(str, openAppFeatureType, ByteString.EMPTY);
        }

        public IdFeaturePair(String str, CommonEnum.OpenAppFeatureType openAppFeatureType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.app_id = str;
            this.feature = openAppFeatureType;
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesRequest$b */
    private static final class C18684b extends ProtoAdapter<PullOpenAppBadgeNodesRequest> {
        C18684b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullOpenAppBadgeNodesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullOpenAppBadgeNodesRequest pullOpenAppBadgeNodesRequest) {
            int i;
            int encodedSizeWithTag = IdFeaturePair.ADAPTER.asRepeated().encodedSizeWithTag(1, pullOpenAppBadgeNodesRequest.id_feature_pairs) + ProtoAdapter.BOOL.encodedSizeWithTag(2, pullOpenAppBadgeNodesRequest.is_mobile);
            int i2 = 0;
            if (pullOpenAppBadgeNodesRequest.strategy != null) {
                i = CommonEnum.LoadStrategy.ADAPTER.encodedSizeWithTag(3, pullOpenAppBadgeNodesRequest.strategy);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pullOpenAppBadgeNodesRequest.need_trigger_push != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, pullOpenAppBadgeNodesRequest.need_trigger_push);
            }
            return i3 + i2 + pullOpenAppBadgeNodesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullOpenAppBadgeNodesRequest decode(ProtoReader protoReader) throws IOException {
            C18683a aVar = new C18683a();
            aVar.f46222b = false;
            aVar.f46223c = CommonEnum.LoadStrategy.Local;
            aVar.f46224d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46221a.add(IdFeaturePair.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f46222b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f46223c = CommonEnum.LoadStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46224d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullOpenAppBadgeNodesRequest pullOpenAppBadgeNodesRequest) throws IOException {
            IdFeaturePair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullOpenAppBadgeNodesRequest.id_feature_pairs);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pullOpenAppBadgeNodesRequest.is_mobile);
            if (pullOpenAppBadgeNodesRequest.strategy != null) {
                CommonEnum.LoadStrategy.ADAPTER.encodeWithTag(protoWriter, 3, pullOpenAppBadgeNodesRequest.strategy);
            }
            if (pullOpenAppBadgeNodesRequest.need_trigger_push != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, pullOpenAppBadgeNodesRequest.need_trigger_push);
            }
            protoWriter.writeBytes(pullOpenAppBadgeNodesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesRequest$a */
    public static final class C18683a extends Message.Builder<PullOpenAppBadgeNodesRequest, C18683a> {

        /* renamed from: a */
        public List<IdFeaturePair> f46221a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f46222b;

        /* renamed from: c */
        public CommonEnum.LoadStrategy f46223c;

        /* renamed from: d */
        public Boolean f46224d;

        /* renamed from: a */
        public PullOpenAppBadgeNodesRequest build() {
            Boolean bool = this.f46222b;
            if (bool != null) {
                return new PullOpenAppBadgeNodesRequest(this.f46221a, bool, this.f46223c, this.f46224d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_mobile");
        }

        /* renamed from: a */
        public C18683a mo64302a(CommonEnum.LoadStrategy loadStrategy) {
            this.f46223c = loadStrategy;
            return this;
        }

        /* renamed from: a */
        public C18683a mo64303a(Boolean bool) {
            this.f46224d = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18683a newBuilder() {
        C18683a aVar = new C18683a();
        aVar.f46221a = Internal.copyOf("id_feature_pairs", this.id_feature_pairs);
        aVar.f46222b = this.is_mobile;
        aVar.f46223c = this.strategy;
        aVar.f46224d = this.need_trigger_push;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "PullOpenAppBadgeNodesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.id_feature_pairs.isEmpty()) {
            sb.append(", id_feature_pairs=");
            sb.append(this.id_feature_pairs);
        }
        sb.append(", is_mobile=");
        sb.append(this.is_mobile);
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        if (this.need_trigger_push != null) {
            sb.append(", need_trigger_push=");
            sb.append(this.need_trigger_push);
        }
        StringBuilder replace = sb.replace(0, 2, "PullOpenAppBadgeNodesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullOpenAppBadgeNodesRequest(List<IdFeaturePair> list, Boolean bool, CommonEnum.LoadStrategy loadStrategy, Boolean bool2) {
        this(list, bool, loadStrategy, bool2, ByteString.EMPTY);
    }

    public PullOpenAppBadgeNodesRequest(List<IdFeaturePair> list, Boolean bool, CommonEnum.LoadStrategy loadStrategy, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id_feature_pairs = Internal.immutableCopyOf("id_feature_pairs", list);
        this.is_mobile = bool;
        this.strategy = loadStrategy;
        this.need_trigger_push = bool2;
    }
}
