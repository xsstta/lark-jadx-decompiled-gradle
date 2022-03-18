package com.bytedance.ee.bear.sheet.inputbar.at.p546b;

import android.content.Context;
import android.text.TextPaint;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.AttachmentSegment;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.b.b */
public class C11198b extends AbstractC11197a {

    /* renamed from: a */
    private final Context f30121a;

    /* renamed from: b */
    private AttachmentSegment f30122b;

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: e */
    public boolean mo39745e() {
        return false;
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: f */
    public boolean mo39746f() {
        return false;
    }

    /* renamed from: d */
    public AttachmentSegment mo42803h() {
        return this.f30122b;
    }

    /* renamed from: g */
    public C11198b clone() throws CloneNotSupportedException {
        C11198b bVar = (C11198b) super.clone();
        AttachmentSegment attachmentSegment = this.f30122b;
        if (attachmentSegment != null) {
            bVar.f30122b = attachmentSegment.clone();
        }
        return bVar;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.p546b.AbstractC11197a
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f30121a.getResources().getColor(R.color.space_kit_b500));
    }

    public C11198b(Context context, AttachmentSegment attachmentSegment) {
        super(context);
        this.f30121a = context;
        this.f30122b = attachmentSegment;
    }
}
