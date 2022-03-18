package com.ss.ttvideoengine.source.strategy;

import android.text.TextUtils;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.source.DirectUrlSource;
import com.ss.ttvideoengine.source.Source;
import com.ss.ttvideoengine.source.VidPlayAuthTokenSource;
import com.ss.ttvideoengine.source.strategy.CodecStrategy;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.List;

public class CodecStrategyAdapter {
    private int mCodecStrategy = -1;
    private final List<CodecStrategy.Dimension> mErrorDimensions = new ArrayList();
    private CodecStrategy.ResolveResult mResolveResult;
    private Source mSource;

    private static boolean isCodecStrategyValid(int i) {
        return i == 1 || i == 2;
    }

    public int getCodecStrategy() {
        return this.mCodecStrategy;
    }

    public CodecStrategy.ResolveResult getResolveResult() {
        return this.mResolveResult;
    }

    public Source getSource() {
        return this.mSource;
    }

    public boolean isCodecStrategyValid() {
        return isCodecStrategyValid(this.mCodecStrategy);
    }

    public void release() {
        reset();
        this.mErrorDimensions.clear();
    }

    public void reset() {
        this.mSource = null;
        this.mCodecStrategy = -1;
        this.mResolveResult = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.source.strategy.CodecStrategyAdapter$1 */
    public static /* synthetic */ class C654821 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$ttvideoengine$source$Source$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.ttvideoengine.source.Source$Type[] r0 = com.ss.ttvideoengine.source.Source.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.ttvideoengine.source.strategy.CodecStrategyAdapter.C654821.$SwitchMap$com$ss$ttvideoengine$source$Source$Type = r0
                com.ss.ttvideoengine.source.Source$Type r1 = com.ss.ttvideoengine.source.Source.Type.DIRECT_URL_SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.ttvideoengine.source.strategy.CodecStrategyAdapter.C654821.$SwitchMap$com$ss$ttvideoengine$source$Source$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.ttvideoengine.source.Source$Type r1 = com.ss.ttvideoengine.source.Source.Type.VID_PLAY_AUTH_TOKEN_SOURCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.source.strategy.CodecStrategyAdapter.C654821.<clinit>():void");
        }
    }

    public boolean interceptFallbackRetry(TTVideoEngine tTVideoEngine, Error error) {
        if (tTVideoEngine == null) {
            return false;
        }
        if (error == null && error.code != -499981) {
            return false;
        }
        Source source = this.mSource;
        CodecStrategy.ResolveResult resolveResult = this.mResolveResult;
        int i = this.mCodecStrategy;
        if (source == null || resolveResult == null || !isCodecStrategyValid(i)) {
            return false;
        }
        CodecStrategy.Dimension dimension = resolveResult.dimension;
        if (dimension != null && !this.mErrorDimensions.contains(dimension)) {
            this.mErrorDimensions.add(dimension);
        }
        CodecStrategy.ResolveResult resolveFallback = CodecStrategy.resolveFallback(source, i, this.mErrorDimensions);
        if (resolveFallback == null) {
            if (TTVideoEngineLog.m256504e()) {
                TTVideoEngineLog.m256503e("CodecStrategyAdapter", "resolveFallback return null! " + source + "  " + i + " " + this.mErrorDimensions + " " + CodecStrategy.Decoder.dump());
            }
            return false;
        }
        if (TTVideoEngineLog.m256502d()) {
            TTVideoEngineLog.m256500d("CodecStrategyAdapter", "resolveFallback " + resolveFallback + " " + CodecStrategy.Decoder.dump());
        }
        setupEngine(tTVideoEngine, source, resolveFallback);
        tTVideoEngine.play();
        return true;
    }

    private void setupEngine(TTVideoEngine tTVideoEngine, Source source, CodecStrategy.ResolveResult resolveResult) {
        int i;
        this.mResolveResult = resolveResult;
        CodecStrategy.Dimension dimension = resolveResult.dimension;
        if (dimension.decoder == 1) {
            i = 1;
        } else {
            i = 0;
        }
        boolean equals = TextUtils.equals(dimension.encodeType, "bytevc1");
        Source.Type type = source.type();
        int i2 = C654821.$SwitchMap$com$ss$ttvideoengine$source$Source$Type[type.ordinal()];
        if (i2 == 1) {
            DirectUrlSource.UrlItem urlItem = resolveResult.urlItem;
            tTVideoEngine.setEncodedKey(urlItem.getPlayAuth());
            tTVideoEngine.setDirectUrlUseDataLoader(urlItem.getUrl(), urlItem.getCacheKey());
            tTVideoEngine.setIntOption(7, i);
        } else if (i2 == 2) {
            tTVideoEngine.setVideoID(source.vid());
            tTVideoEngine.setPlayAuthToken(((VidPlayAuthTokenSource) source).playAuthToken());
            tTVideoEngine.setIntOption(7, i);
            tTVideoEngine.setIntOption(6, equals ? 1 : 0);
        } else {
            throw new IllegalArgumentException("unsupported source type! " + type);
        }
        tTVideoEngine.setIntOption(670, 0);
    }

    public boolean interceptSetSource(TTVideoEngine tTVideoEngine, Source source, int i) {
        if (tTVideoEngine == null || source == null || !isCodecStrategyValid(i)) {
            reset();
            return false;
        }
        this.mCodecStrategy = i;
        this.mSource = source;
        CodecStrategy.ResolveResult resolveStartPlayback = CodecStrategy.resolveStartPlayback(source, i);
        if (resolveStartPlayback == null) {
            if (TTVideoEngineLog.m256504e()) {
                TTVideoEngineLog.m256503e("CodecStrategyAdapter", "resolveStartPlayback return null! " + source + "  " + i + " " + this.mErrorDimensions + " " + CodecStrategy.Decoder.dump());
            }
            return false;
        }
        if (TTVideoEngineLog.m256502d()) {
            TTVideoEngineLog.m256500d("CodecStrategyAdapter", "resolveStartPlayback " + resolveStartPlayback + " " + CodecStrategy.Decoder.dump());
        }
        setupEngine(tTVideoEngine, source, resolveStartPlayback);
        return true;
    }
}
