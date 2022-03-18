package com.ss.android.lark.ai.smartreply;

import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28619b;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.smartreply.a */
public class C28588a implements AbstractC28619b {

    /* renamed from: a */
    private KeyBoard f71944a;

    /* renamed from: b */
    private AbstractC28534a f71945b;

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28619b
    /* renamed from: d */
    public void mo101789d() {
        this.f71944a = null;
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28619b
    /* renamed from: a */
    public boolean mo101784a() {
        KeyBoard fVar = this.f71944a;
        if (fVar == null || !fVar.mo146828i()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28619b
    /* renamed from: b */
    public boolean mo101787b() {
        KeyBoard fVar = this.f71944a;
        if (fVar == null || !fVar.mo146835p()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28619b
    /* renamed from: c */
    public boolean mo101788c() {
        KeyBoard fVar = this.f71944a;
        if (fVar == null || !fVar.mo146818b("text")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private IOutInputSupport m104829e() {
        IInputSupportPlugin d = this.f71944a.mo146821d("text");
        if (d == null) {
            return this.f71944a.mo146821d("input_richtext_shrink");
        }
        return d;
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28619b
    /* renamed from: b */
    public void mo101786b(TextWatcher textWatcher) {
        IOutInputSupport e;
        if (this.f71944a != null && (e = m104829e()) != null && e.mo146904l() != null) {
            e.mo146904l().removeTextChangedListener(textWatcher);
        }
    }

    /* renamed from: a */
    private boolean m104828a(RichTextEmojiconEditText richTextEmojiconEditText) {
        HashMap<Integer, RichTextElement> rRMap = richTextEmojiconEditText.getRRMap();
        if (rRMap.isEmpty()) {
            return false;
        }
        for (RichTextElement richTextElement : rRMap.values()) {
            if (richTextElement.getTag() != RichTextElement.RichTextTag.AT) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28619b
    /* renamed from: a */
    public void mo101780a(TextWatcher textWatcher) {
        IOutInputSupport e;
        if (this.f71944a != null && (e = m104829e()) != null && e.mo146904l() != null) {
            e.mo146904l().addTextChangedListener(textWatcher);
        }
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28619b
    /* renamed from: a */
    public void mo101781a(CharSequence charSequence) {
        IOutInputSupport e;
        if (this.f71944a != null && (e = m104829e()) != null && e.mo146904l() != null) {
            e.mo146904l().append(charSequence);
        }
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28619b
    /* renamed from: a */
    public boolean mo101785a(boolean z) {
        IOutInputSupport e;
        if (!(this.f71944a == null || (e = m104829e()) == null || e.mo146904l() == null)) {
            String obj = e.mo146904l().getText().toString();
            if (TextUtils.isEmpty(obj)) {
                return true;
            }
            EditText l = e.mo146904l();
            if (!z || !C57782ag.m224242a(obj, "$") || !(l instanceof RichTextEmojiconEditText) || !m104828a((RichTextEmojiconEditText) e.mo146904l())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C28588a(KeyBoard fVar, AbstractC28534a aVar) {
        this.f71944a = fVar;
        this.f71945b = aVar;
    }

    /* renamed from: a */
    private void m104827a(String str, RichText richText) {
        this.f71945b.mo101561c().mo101572a(str, this.f71944a.mo146836q(), this.f71944a.mo146837r(), richText);
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28619b
    /* renamed from: a */
    public void mo101782a(String str, String str2) {
        if (this.f71944a != null) {
            m104827a(str, C59029c.m229161b(str2));
            this.f71944a.mo146841v();
        }
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28619b
    /* renamed from: a */
    public void mo101783a(String str, List<String> list) {
        if (!(CollectionUtils.isEmpty(list) || this.f71944a == null)) {
            for (String str2 : list) {
                m104827a(str, C59029c.m229161b(str2));
            }
            this.f71944a.mo146841v();
        }
    }
}
