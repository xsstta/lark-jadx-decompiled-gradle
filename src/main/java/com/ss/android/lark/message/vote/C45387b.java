package com.ss.android.lark.message.vote;

import com.ss.android.lark.message.card.p2262b.C45292a;
import com.ss.android.lark.message.card.p2262b.C45293b;
import com.ss.android.lark.message.service.AbstractC45376a;
import com.ss.android.lark.widget.richtext.AbstractC59028b;
import com.ss.android.lark.widget.richtext.C59033g;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.Map;

/* renamed from: com.ss.android.lark.message.vote.b */
public class C45387b {

    /* renamed from: a */
    public AbstractC45376a f114956a;

    /* renamed from: b */
    public C45293b f114957b = new C45293b();

    /* renamed from: c */
    private RichText f114958c;

    /* renamed from: d */
    private AbstractC59028b f114959d = new AbstractC45393d() {
        /* class com.ss.android.lark.message.vote.C45387b.C453881 */

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146983a(RichTextElement.MediaProperty mediaProperty) {
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146968a(RichText richText) {
            if (C45387b.this.f114956a != null) {
                C45387b.this.f114956a.mo144083a();
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146972a(RichTextElement.ButtonProperty buttonProperty) {
            C45387b.this.f114957b.mo160026b(buttonProperty.getActionId());
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: b */
        public void mo146990b(RichText richText) {
            if (C45387b.this.f114956a != null) {
                C45387b.this.f114956a.mo144084a(C45387b.this.f114957b);
            }
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146987a(RichTextElement.SelectProperty selectProperty) {
            C45387b.this.f114957b.mo160025b(selectProperty.getMaxPickNum());
            C45387b.this.f114957b.mo160021a(selectProperty.getMinPickNum());
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146986a(RichTextElement.ProgressSelectOptionProperty progressSelectOptionProperty) {
            C45292a aVar = new C45292a();
            aVar.mo160002a(progressSelectOptionProperty.getActionId());
            aVar.mo160006b(progressSelectOptionProperty.getActionParamName());
            aVar.mo160009c(progressSelectOptionProperty.getActionParamValue());
            aVar.mo160003a(progressSelectOptionProperty.isDisable());
            aVar.mo160007b(progressSelectOptionProperty.isSelected());
            aVar.mo160010d(progressSelectOptionProperty.getOptionCase());
            aVar.mo160012e(progressSelectOptionProperty.getContent());
            aVar.mo160001a(progressSelectOptionProperty.getNumberOfSelected());
            aVar.mo160005b(progressSelectOptionProperty.getNumberOfTotal());
            C45387b.this.f114957b.mo160022a(aVar);
        }

        @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
        /* renamed from: a */
        public void mo146988a(RichTextElement.TextProperty textProperty, Map<String, String> map) {
            C45387b.this.f114957b.mo160023a(textProperty.getContent());
        }
    };

    /* renamed from: a */
    public void mo160245a() {
        RichText richText = this.f114958c;
        if (richText != null) {
            C59033g.m229196a(richText, this.f114959d);
        }
    }

    public C45387b(RichText richText, AbstractC45376a aVar) {
        this.f114958c = richText;
        this.f114956a = aVar;
    }
}
