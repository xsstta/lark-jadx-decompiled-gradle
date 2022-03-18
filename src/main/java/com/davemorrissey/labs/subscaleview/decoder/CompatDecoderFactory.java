package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap;
import java.lang.reflect.InvocationTargetException;

public class CompatDecoderFactory<T> implements DecoderFactory<T> {
    private final Bitmap.Config bitmapConfig;
    private final Class<? extends T> clazz;

    @Override // com.davemorrissey.labs.subscaleview.decoder.DecoderFactory
    public T make() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        if (this.bitmapConfig == null) {
            return (T) this.clazz.newInstance();
        }
        return (T) this.clazz.getConstructor(Bitmap.Config.class).newInstance(this.bitmapConfig);
    }

    public CompatDecoderFactory(Class<? extends T> cls) {
        this(cls, null);
    }

    public CompatDecoderFactory(Class<? extends T> cls, Bitmap.Config config) {
        this.clazz = cls;
        this.bitmapConfig = config;
    }
}
