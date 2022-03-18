package as_setting;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FeatureType implements WireEnum {
    DEFAULT(0),
    NAUTILUS(1);
    
    public static final ProtoAdapter<FeatureType> ADAPTER = ProtoAdapter.newEnumAdapter(FeatureType.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static FeatureType fromValue(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return NAUTILUS;
    }

    private FeatureType(int i) {
        this.value = i;
    }
}
