package com.ss.android.lark.pb.ug_reach;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SpotlightMaterial extends Message<SpotlightMaterial, C50134a> {
    public static final ProtoAdapter<SpotlightMaterial> ADAPTER = new C50135b();
    private static final long serialVersionUID = 0;
    public final MaterialBase mbase;
    public final MaskConfig mspotlight_mask_config;
    public final List<SpotlightMaterialItem> mspotlights;

    public static final class MaskConfig extends Message<MaskConfig, C50132a> {
        public static final ProtoAdapter<MaskConfig> ADAPTER = new C50133b();
        public static final Double DEFAULT_ALPHA = Double.valueOf(0.0d);
        public static final Boolean DEFAULT_MASK_INTERACTION_FORCE_OPEN = false;
        private static final long serialVersionUID = 0;
        public final Double malpha;
        public final Boolean mmask_interaction_force_open;

        /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterial$MaskConfig$b */
        private static final class C50133b extends ProtoAdapter<MaskConfig> {
            C50133b() {
                super(FieldEncoding.LENGTH_DELIMITED, MaskConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(MaskConfig maskConfig) {
                int i;
                int i2 = 0;
                if (maskConfig.malpha != null) {
                    i = ProtoAdapter.DOUBLE.encodedSizeWithTag(1, maskConfig.malpha);
                } else {
                    i = 0;
                }
                if (maskConfig.mmask_interaction_force_open != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, maskConfig.mmask_interaction_force_open);
                }
                return i + i2 + maskConfig.unknownFields().size();
            }

            /* renamed from: a */
            public MaskConfig decode(ProtoReader protoReader) throws IOException {
                C50132a aVar = new C50132a();
                aVar.f125303a = Double.valueOf(0.0d);
                aVar.f125304b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125303a = ProtoAdapter.DOUBLE.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125304b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MaskConfig maskConfig) throws IOException {
                if (maskConfig.malpha != null) {
                    ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, maskConfig.malpha);
                }
                if (maskConfig.mmask_interaction_force_open != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, maskConfig.mmask_interaction_force_open);
                }
                protoWriter.writeBytes(maskConfig.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterial$MaskConfig$a */
        public static final class C50132a extends Message.Builder<MaskConfig, C50132a> {

            /* renamed from: a */
            public Double f125303a;

            /* renamed from: b */
            public Boolean f125304b;

            /* renamed from: a */
            public MaskConfig build() {
                return new MaskConfig(this.f125303a, this.f125304b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50132a newBuilder() {
            C50132a aVar = new C50132a();
            aVar.f125303a = this.malpha;
            aVar.f125304b = this.mmask_interaction_force_open;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.malpha != null) {
                sb.append(", alpha=");
                sb.append(this.malpha);
            }
            if (this.mmask_interaction_force_open != null) {
                sb.append(", mask_interaction_force_open=");
                sb.append(this.mmask_interaction_force_open);
            }
            StringBuilder replace = sb.replace(0, 2, "MaskConfig{");
            replace.append('}');
            return replace.toString();
        }

        public MaskConfig(Double d, Boolean bool) {
            this(d, bool, ByteString.EMPTY);
        }

        public MaskConfig(Double d, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.malpha = d;
            this.mmask_interaction_force_open = bool;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterial$b */
    private static final class C50135b extends ProtoAdapter<SpotlightMaterial> {
        C50135b() {
            super(FieldEncoding.LENGTH_DELIMITED, SpotlightMaterial.class);
        }

        /* renamed from: a */
        public int encodedSize(SpotlightMaterial spotlightMaterial) {
            int i;
            int encodedSizeWithTag = SpotlightMaterialItem.ADAPTER.asRepeated().encodedSizeWithTag(1, spotlightMaterial.mspotlights);
            int i2 = 0;
            if (spotlightMaterial.mspotlight_mask_config != null) {
                i = MaskConfig.ADAPTER.encodedSizeWithTag(2, spotlightMaterial.mspotlight_mask_config);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (spotlightMaterial.mbase != null) {
                i2 = MaterialBase.ADAPTER.encodedSizeWithTag(3, spotlightMaterial.mbase);
            }
            return i3 + i2 + spotlightMaterial.unknownFields().size();
        }

        /* renamed from: a */
        public SpotlightMaterial decode(ProtoReader protoReader) throws IOException {
            C50134a aVar = new C50134a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125305a.add(SpotlightMaterialItem.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f125306b = MaskConfig.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125307c = MaterialBase.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SpotlightMaterial spotlightMaterial) throws IOException {
            SpotlightMaterialItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, spotlightMaterial.mspotlights);
            if (spotlightMaterial.mspotlight_mask_config != null) {
                MaskConfig.ADAPTER.encodeWithTag(protoWriter, 2, spotlightMaterial.mspotlight_mask_config);
            }
            if (spotlightMaterial.mbase != null) {
                MaterialBase.ADAPTER.encodeWithTag(protoWriter, 3, spotlightMaterial.mbase);
            }
            protoWriter.writeBytes(spotlightMaterial.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.SpotlightMaterial$a */
    public static final class C50134a extends Message.Builder<SpotlightMaterial, C50134a> {

        /* renamed from: a */
        public List<SpotlightMaterialItem> f125305a = Internal.newMutableList();

        /* renamed from: b */
        public MaskConfig f125306b;

        /* renamed from: c */
        public MaterialBase f125307c;

        /* renamed from: a */
        public SpotlightMaterial build() {
            return new SpotlightMaterial(this.f125305a, this.f125306b, this.f125307c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50134a newBuilder() {
        C50134a aVar = new C50134a();
        aVar.f125305a = Internal.copyOf("mspotlights", this.mspotlights);
        aVar.f125306b = this.mspotlight_mask_config;
        aVar.f125307c = this.mbase;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mspotlights.isEmpty()) {
            sb.append(", spotlights=");
            sb.append(this.mspotlights);
        }
        if (this.mspotlight_mask_config != null) {
            sb.append(", spotlight_mask_config=");
            sb.append(this.mspotlight_mask_config);
        }
        if (this.mbase != null) {
            sb.append(", base=");
            sb.append(this.mbase);
        }
        StringBuilder replace = sb.replace(0, 2, "SpotlightMaterial{");
        replace.append('}');
        return replace.toString();
    }

    public SpotlightMaterial(List<SpotlightMaterialItem> list, MaskConfig maskConfig, MaterialBase materialBase) {
        this(list, maskConfig, materialBase, ByteString.EMPTY);
    }

    public SpotlightMaterial(List<SpotlightMaterialItem> list, MaskConfig maskConfig, MaterialBase materialBase, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mspotlights = Internal.immutableCopyOf("mspotlights", list);
        this.mspotlight_mask_config = maskConfig;
        this.mbase = materialBase;
    }
}
