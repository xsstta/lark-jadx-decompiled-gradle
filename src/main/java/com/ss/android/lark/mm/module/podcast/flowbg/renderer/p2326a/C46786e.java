package com.ss.android.lark.mm.module.podcast.flowbg.renderer.p2326a;

import android.opengl.GLES20;
import java.nio.Buffer;

/* renamed from: com.ss.android.lark.mm.module.podcast.flowbg.renderer.a.e */
public class C46786e {
    /* renamed from: a */
    public static void m185410a(int i) {
        GLES20.glEnableVertexAttribArray(i);
    }

    /* renamed from: a */
    public static void m185411a(int i, Buffer buffer) {
        GLES20.glVertexAttribPointer(i, 2, 5120, false, 0, buffer);
    }
}
