package com.ss.android.lark.mm.module.mention;

import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.module.detail.baseinfo.BaseUserType;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.mm.module.mention.d */
public class C46488d extends ClickableSpan {

    /* renamed from: a */
    public String f117051a;

    /* renamed from: a */
    public C46488d mo163360a(String str) {
        this.f117051a = str;
        return this;
    }

    public void onClick(View view) {
        C45855f.m181663b("MmMentionClickSpan", "onClick " + this.f117051a);
        if (!TextUtils.isEmpty(this.f117051a)) {
            C45899c.m181859a().getHostDepend().mo144633a(view.getContext(), this.f117051a, BaseUserType.USER);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (TextUtils.isEmpty(this.f117051a) || !this.f117051a.equals(C45899c.m181859a().getLoginDepend().mo144647a())) {
            textPaint.setColor(ContextCompat.getColor(C45851c.m181646a(), R.color.lkui_B500));
        } else {
            textPaint.setColor(-1);
        }
        textPaint.setUnderlineText(false);
    }
}
