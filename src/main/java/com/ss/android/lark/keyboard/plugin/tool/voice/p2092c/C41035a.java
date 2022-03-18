package com.ss.android.lark.keyboard.plugin.tool.voice.p2092c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.hitpoint.HitPointHelper;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41035a;
import com.ss.android.lark.widget.p2932c.C58339d;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.c.a */
public class C41035a {

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.c.a$a */
    public interface AbstractC41036a {
        void onOptionSelected(int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m162695a(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: a */
    public static void m162692a(Context context) {
        m162693a(context, (int) R.string.Lark_Chat_AudioToTextNetworkError);
    }

    /* renamed from: a */
    public static void m162693a(Context context, int i) {
        new C25639g(context).mo89254m(i).mo89245d(0.3f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_DialogOk, $$Lambda$a$aFItjixNp1FZrHZ_CFqXAfjWOzs.INSTANCE).mo89239c();
    }

    /* renamed from: a */
    public static void m162694a(Context context, AbstractC41036a aVar, boolean z) {
        int i;
        View inflate = LayoutInflater.from(context).inflate(R.layout.kb_audio_bottom_sheet_layout, (ViewGroup) null);
        Dialog a = C58339d.m226190a(context, inflate);
        if (a != null) {
            View findViewById = inflate.findViewById(R.id.chinese_option);
            View findViewById2 = inflate.findViewById(R.id.english_option);
            View findViewById3 = inflate.findViewById(R.id.cancel);
            View findViewById4 = inflate.findViewById(R.id.chinese_option_checked);
            View findViewById5 = inflate.findViewById(R.id.english_option_checked);
            boolean equals = C41039c.m162705a().equals("zh_ch");
            int i2 = 0;
            if (equals) {
                i = 0;
            } else {
                i = 4;
            }
            findViewById4.setVisibility(i);
            if (equals) {
                i2 = 4;
            }
            findViewById5.setVisibility(i2);
            findViewById.setOnClickListener(new View.OnClickListener(z, aVar, a) {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.$$Lambda$a$O6fIHWROiWuxz5fkn2agmDk3X1w */
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ C41035a.AbstractC41036a f$1;
                public final /* synthetic */ Dialog f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    C41035a.m162697b(this.f$0, this.f$1, this.f$2, view);
                }
            });
            findViewById2.setOnClickListener(new View.OnClickListener(z, aVar, a) {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.$$Lambda$a$cVDsXBPaZh2WfuVtxDjCoJAu8CI */
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ C41035a.AbstractC41036a f$1;
                public final /* synthetic */ Dialog f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    C41035a.m162696a(this.f$0, this.f$1, this.f$2, view);
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener(a) {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.$$Lambda$a$osKY75aA0g30Q1KojTpEi840 */
                public final /* synthetic */ Dialog f$0;

                {
                    this.f$0 = r1;
                }

                public final void onClick(View view) {
                    C41035a.m162691a(this.f$0, view);
                }
            });
            a.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m162697b(boolean z, AbstractC41036a aVar, Dialog dialog, View view) {
        HitPointHelper.f103322b.mo146877a("chinese", z);
        C41039c.m162709b("zh_ch");
        if (aVar != null) {
            aVar.onOptionSelected(0);
        }
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m162696a(boolean z, AbstractC41036a aVar, Dialog dialog, View view) {
        HitPointHelper.f103322b.mo146877a("english", z);
        C41039c.m162709b("en_us");
        if (aVar != null) {
            aVar.onOptionSelected(1);
        }
        dialog.dismiss();
    }
}
