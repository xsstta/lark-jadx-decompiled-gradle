package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionCodec implements ObjectDeserializer, ObjectSerializer {
    public static final CollectionCodec instance = new CollectionCodec();

    private CollectionCodec() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.alibaba.fastjson.parser.DefaultJSONParser] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.CollectionCodec.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj != null) {
            Type type2 = null;
            if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) != 0) {
                type2 = TypeUtils.getCollectionItemType(type);
            }
            Collection collection = (Collection) obj;
            SerialContext serialContext = jSONSerializer.context;
            int i = 0;
            jSONSerializer.setContext(serialContext, obj, obj2, 0);
            if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) != 0) {
                if (HashSet.class == collection.getClass()) {
                    serializeWriter.append((CharSequence) "Set");
                } else if (TreeSet.class == collection.getClass()) {
                    serializeWriter.append((CharSequence) "TreeSet");
                }
            }
            try {
                serializeWriter.write(91);
                for (Object obj3 : collection) {
                    int i2 = i + 1;
                    if (i != 0) {
                        serializeWriter.write(44);
                    }
                    if (obj3 == null) {
                        serializeWriter.writeNull();
                    } else {
                        Class<?> cls = obj3.getClass();
                        if (cls == Integer.class) {
                            serializeWriter.writeInt(((Integer) obj3).intValue());
                        } else if (cls == Long.class) {
                            serializeWriter.writeLong(((Long) obj3).longValue());
                            if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) != 0) {
                                serializeWriter.write(76);
                            }
                        } else {
                            jSONSerializer.config.get(cls).write(jSONSerializer, obj3, Integer.valueOf(i2 - 1), type2);
                        }
                    }
                    i = i2;
                }
                serializeWriter.write(93);
            } finally {
                jSONSerializer.context = serialContext;
            }
        } else if ((serializeWriter.features & SerializerFeature.WriteNullListAsEmpty.mask) != 0) {
            serializeWriter.write("[]");
        } else {
            serializeWriter.writeNull();
        }
    }
}
