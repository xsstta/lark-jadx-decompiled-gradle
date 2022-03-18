package com.ss.android.lark.widget.richtext2.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext2.widget.codeblock.CodeBlockDetailView;

/* renamed from: com.ss.android.lark.widget.richtext2.ui.a */
public class C59085a extends Fragment {

    /* renamed from: a */
    private CodeBlockDetailActivity f146478a;

    /* renamed from: b */
    private CodeBlockDetailView f146479b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo200725a() {
        this.f146479b.mo114050a();
    }

    /* renamed from: b */
    private void m229479b() {
        RichTextElement.CodeBlockProperty codeBlockProperty;
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("KEY_CODE_BLOCK_DATA") || (codeBlockProperty = (RichTextElement.CodeBlockProperty) arguments.getSerializable("KEY_CODE_BLOCK_DATA")) == null) {
            this.f146478a.finish();
        } else {
            this.f146479b.mo200758a(codeBlockProperty);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof CodeBlockDetailActivity) {
            this.f146478a = (CodeBlockDetailActivity) context;
        } else {
            ((Activity) context).finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f146479b = CodeBlockDetailView.m229528a((Context) this.f146478a, (ViewGroup) null, false);
        m229479b();
        return this.f146479b;
    }
}
