package com.he.loader;

import com.huawei.hms.feature.dynamic.DynamicModule;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;

public final class LoadScriptSample {
    private static final long epoch_start = ((System.currentTimeMillis() * 1000) - (System.nanoTime() / 1000));
    public final boolean cacheAccepted;
    public final boolean cacheHit;
    public final int cacheSize;
    public final int codeSize;
    public final long compileStart;
    public final long decodeStringStart;
    public final boolean eagerCompiled;
    public final long end;
    public final long executeStart;
    public final long loadCacheStart;
    public final long loadCodeStart;
    public final String path;
    public final long start;

    public interface Callback {
        void onSample(LoadScriptSample loadScriptSample);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("LoadScriptSample {\n  path      : \"");
        sb.append(this.path);
        sb.append("\"\n  start     : ");
        sb.append(toEpochTime(this.start));
        sb.append('\n');
        sb.append("  load code : +");
        sb.append(this.decodeStringStart - this.loadCodeStart);
        sb.append('\n');
        sb.append("  decode string : +");
        sb.append(this.loadCacheStart - this.decodeStringStart);
        sb.append('\n');
        sb.append("  load cache: +");
        sb.append(this.compileStart - this.loadCacheStart);
        sb.append('\n');
        sb.append("  compile   : +");
        sb.append(this.executeStart - this.compileStart);
        sb.append('\n');
        sb.append("  execute   : +");
        sb.append(this.end - this.executeStart);
        sb.append('\n');
        sb.append("  total     : +");
        sb.append(this.end - this.start);
        sb.append('\n');
        sb.append("  code size : ");
        sb.append(this.codeSize);
        sb.append('\n');
        sb.append("  cache     : ");
        if (this.cacheHit) {
            StringBuilder sb2 = new StringBuilder();
            if (this.cacheAccepted) {
                str2 = "accepted";
            } else {
                str2 = "rejected";
            }
            sb2.append(str2);
            sb2.append(", size ");
            sb2.append(this.cacheSize);
            sb2.append(", ");
            if (this.eagerCompiled) {
                str3 = "eager";
            } else {
                str3 = "lazy";
            }
            sb2.append(str3);
            sb2.append(" compiled\n");
            str = sb2.toString();
        } else {
            str = "miss\n";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public static long toEpochTime(long j) {
        return (epoch_start + j) / 1000;
    }

    public LoadScriptSample(ByteBuffer byteBuffer, int i) {
        boolean z;
        boolean z2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        char[] cArr = new char[byteBuffer.getInt(i)];
        CharBuffer asCharBuffer = byteBuffer.asCharBuffer();
        asCharBuffer.position((i >> 1) + 2);
        asCharBuffer.get(cArr);
        this.path = new String(cArr);
        this.start = byteBuffer.getLong(i + DynamicModule.f58006b);
        this.loadCodeStart = byteBuffer.getLong(i + 264);
        this.decodeStringStart = byteBuffer.getLong(i + 272);
        this.loadCacheStart = byteBuffer.getLong(i + 280);
        this.compileStart = byteBuffer.getLong(i + 288);
        this.executeStart = byteBuffer.getLong(i + 296);
        this.end = byteBuffer.getLong(i + 304);
        this.codeSize = byteBuffer.getInt(i + 312);
        int i2 = byteBuffer.getInt(i + 316);
        this.cacheSize = 268435455 & i2;
        boolean z3 = false;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        this.cacheHit = z;
        if ((Integer.MIN_VALUE & i2) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.cacheAccepted = z2;
        this.eagerCompiled = (i2 & 1073741824) != 0 ? true : z3;
    }
}
