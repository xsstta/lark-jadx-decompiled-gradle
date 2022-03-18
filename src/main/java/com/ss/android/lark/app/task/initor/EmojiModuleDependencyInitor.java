package com.ss.android.lark.app.task.initor;

import android.content.Context;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.widget.C58314a;

public class EmojiModuleDependencyInitor {
    /* renamed from: a */
    public static void m106397a(Context context) {
        C58314a.m226105a(new C58314a.AbstractC58315a() {
            /* class com.ss.android.lark.app.task.initor.EmojiModuleDependencyInitor.C289931 */

            @Override // com.ss.android.lark.widget.C58314a.AbstractC58315a
            /* renamed from: a */
            public boolean mo102816a() {
                return C37239a.m146648b().mo136952a("emoji_springfestival", true);
            }

            @Override // com.ss.android.lark.widget.C58314a.AbstractC58315a
            /* renamed from: b */
            public boolean mo102817b() {
                return C37239a.m146648b().mo136951a("lark.richtext.image.use.memory.cache");
            }
        });
    }
}
