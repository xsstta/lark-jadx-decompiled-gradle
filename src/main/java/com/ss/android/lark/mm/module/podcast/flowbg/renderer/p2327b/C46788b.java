package com.ss.android.lark.mm.module.podcast.flowbg.renderer.p2327b;

import android.content.Context;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* renamed from: com.ss.android.lark.mm.module.podcast.flowbg.renderer.b.b */
public class C46788b {
    /* renamed from: a */
    public static String m185413a(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append('\n');
            }
        } catch (Exception e) {
            C45855f.m181666e("TextReader", "readTextFileFromResource error: " + e.getMessage());
        }
        return sb.toString();
    }
}
