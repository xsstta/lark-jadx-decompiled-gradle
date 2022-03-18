package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class RuntimeMessageAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends ProtoAdapter<M> {
    private final Class<B> builderType;
    private final Map<Integer, FieldBinding<M, B>> fieldBindings;
    private final Class<M> messageType;

    /* access modifiers changed from: package-private */
    public Map<Integer, FieldBinding<M, B>> fieldBindings() {
        return this.fieldBindings;
    }

    public int hashCode() {
        return this.messageType.hashCode();
    }

    /* access modifiers changed from: package-private */
    public B newBuilder() {
        try {
            return this.builderType.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RuntimeMessageAdapter) || ((RuntimeMessageAdapter) obj).messageType != this.messageType) {
            return false;
        }
        return true;
    }

    static <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> create(Class<M> cls) {
        Class builderType2 = getBuilderType(cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, field, builderType2));
            }
        }
        return new RuntimeMessageAdapter<>(cls, builderType2, Collections.unmodifiableMap(linkedHashMap));
    }

    private static <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        try {
            return (Class<B>) Class.forName(cls.getName() + "$Builder");
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("No builder class found for message type " + cls.getName());
        }
    }

    public int encodedSize(M m) {
        int i = m.cachedSerializedSize;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                i2 += fieldBinding.adapter().encodedSizeWithTag(fieldBinding.tag, obj);
            }
        }
        int size = i2 + m.unknownFields().size();
        m.cachedSerializedSize = size;
        return size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(ProtoReader protoReader) throws IOException {
        ProtoAdapter<?> protoAdapter;
        B newBuilder = newBuilder();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldBinding<M, B> fieldBinding = this.fieldBindings.get(Integer.valueOf(nextTag));
                if (fieldBinding != null) {
                    try {
                        if (fieldBinding.isMap()) {
                            protoAdapter = fieldBinding.adapter();
                        } else {
                            protoAdapter = fieldBinding.singleAdapter();
                        }
                        fieldBinding.value(newBuilder, protoAdapter.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        newBuilder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    newBuilder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return (M) newBuilder.build();
            }
        }
    }

    public String toString(M m) {
        StringBuilder sb = new StringBuilder();
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                sb.append(", ");
                sb.append(fieldBinding.name);
                sb.append('=');
                if (fieldBinding.redacted) {
                    obj = "██";
                }
                sb.append(obj);
            }
        }
        sb.replace(0, 2, this.messageType.getSimpleName() + '{');
        sb.append('}');
        return sb.toString();
    }

    public M redact(M m) {
        Message.Builder newBuilder = m.newBuilder();
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            if (!fieldBinding.redacted || fieldBinding.label != WireField.Label.REQUIRED) {
                boolean isAssignableFrom = Message.class.isAssignableFrom(fieldBinding.singleAdapter().javaType);
                if (fieldBinding.redacted || (isAssignableFrom && !fieldBinding.label.isRepeated())) {
                    Object fromBuilder = fieldBinding.getFromBuilder(newBuilder);
                    if (fromBuilder != null) {
                        fieldBinding.set(newBuilder, fieldBinding.adapter().redact(fromBuilder));
                    }
                } else if (isAssignableFrom && fieldBinding.label.isRepeated()) {
                    Internal.redactElements((List) fieldBinding.getFromBuilder(newBuilder), fieldBinding.singleAdapter());
                }
            } else {
                throw new UnsupportedOperationException(String.format("Field '%s' in %s is required and cannot be redacted.", fieldBinding.name, this.javaType.getName()));
            }
        }
        newBuilder.clearUnknownFields();
        return (M) newBuilder.build();
    }

    public void encode(ProtoWriter protoWriter, M m) throws IOException {
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                fieldBinding.adapter().encodeWithTag(protoWriter, fieldBinding.tag, obj);
            }
        }
        protoWriter.writeBytes(m.unknownFields());
    }

    RuntimeMessageAdapter(Class<M> cls, Class<B> cls2, Map<Integer, FieldBinding<M, B>> map) {
        super(FieldEncoding.LENGTH_DELIMITED, cls);
        this.messageType = cls;
        this.builderType = cls2;
        this.fieldBindings = map;
    }
}
