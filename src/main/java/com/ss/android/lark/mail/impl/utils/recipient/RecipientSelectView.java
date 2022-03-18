package com.ss.android.lark.mail.impl.utils.recipient;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.drawable.C0774a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.AddressType;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.service.C43362e;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout;
import com.ss.android.lark.mail.impl.utils.tokenautocomplete.C43845d;
import com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView;
import com.ss.android.lark.utils.UIHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class RecipientSelectView extends RecipientFilterView {

    /* renamed from: A */
    private AbstractC43798c f111105A;

    /* renamed from: B */
    private AbstractC43796a f111106B;

    /* renamed from: C */
    private AbstractC43797b f111107C;

    /* renamed from: D */
    private int f111108D;

    /* renamed from: E */
    private int f111109E;

    /* renamed from: e */
    List<MailAddress> f111110e;

    /* renamed from: x */
    private BubbleLayout f111111x;

    /* renamed from: y */
    private TextView f111112y;

    /* renamed from: z */
    private int f111113z = -1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface VisibleType {
    }

    /* renamed from: com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView$a */
    public interface AbstractC43796a {
        void onAddressCountChange(int i);
    }

    /* renamed from: com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView$b */
    public interface AbstractC43797b {
        /* renamed from: a */
        boolean mo156028a();
    }

    /* renamed from: com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView$c */
    public interface AbstractC43798c {
        /* renamed from: a */
        MailAddress mo150636a(MailAddress mailAddress);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    /* renamed from: a */
    public boolean mo155990a(TokenCompleteTextView tokenCompleteTextView, ClipData.Item item) {
        Intent intent = item.getIntent();
        if (intent == null || tokenCompleteTextView == null) {
            return false;
        }
        Bundle a = m173579a(intent, "bundle");
        a.setClassLoader(MailAddress.class.getClassLoader());
        if (!(a.getParcelable("MailAddress") instanceof MailAddress)) {
            return false;
        }
        MailAddress mailAddress = (MailAddress) a.getParcelable("MailAddress");
        if (mailAddress != null) {
            mailAddress = mailAddress.mo151199t().mo151211b(tokenCompleteTextView.getMailContactsType()).mo151210a();
        }
        tokenCompleteTextView.mo155985a((Object) mailAddress, true);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    /* renamed from: a */
    public void mo155986a(String str, IGetDataCallback<MailAddress> iGetDataCallback) {
        C43800a.m173635a().mo156043a(str, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo155987a(List<? extends MailAddress> list) {
        mo155989a(list, true);
    }

    /* renamed from: a */
    public void mo155989a(List<? extends MailAddress> list, boolean z) {
        if (list != null) {
            this.f111220q = true;
            if (z) {
                mo156004d();
            }
            for (MailAddress mailAddress : list) {
                mo156134i(mailAddress);
            }
            this.f111220q = false;
            post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.utils.recipient.$$Lambda$RecipientSelectView$urU3k12Z_PtwcxA9Gsx9avr5vU */

                public final void run() {
                    RecipientSelectView.this.m173578D();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo155988a(List<MailAddress> list, TextPaint textPaint) {
        if (list == null) {
            return;
        }
        if (textPaint != null) {
            mo156004d();
            this.f111110e = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mo156134i(list.get(i));
                if (m173582a(textPaint, i, list.size())) {
                    return;
                }
            }
            return;
        }
        mo155987a((List<? extends MailAddress>) list);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m173578D() {
        mo156119c(isFocused());
    }

    public List<MailAddress> getAllTokenWithoutFormat() {
        return mo155998c(-1);
    }

    /* renamed from: B */
    private boolean m173576B() {
        if ((this.f111109E & DynamicModule.f58006b) == 256) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    /* renamed from: c */
    public boolean mo156000c() {
        if (this.f111113z > 0) {
            return true;
        }
        return super.mo156000c();
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    /* renamed from: d */
    public void mo156004d() {
        this.f111113z = -1;
        this.f111110e = null;
        super.mo156004d();
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    public List<MailAddress> getObjects() {
        if (this.f111113z > 0) {
            m173575A();
        }
        return super.getObjects();
    }

    /* renamed from: y */
    private View m173583y() {
        return LayoutInflater.from(getContext()).inflate(R.layout.mail_recipient_token, (ViewGroup) null, false);
    }

    /* renamed from: z */
    private View m173584z() {
        return LayoutInflater.from(getContext()).inflate(R.layout.mail_recipient_illegal_token, (ViewGroup) null, false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    /* renamed from: h */
    public void mo156017h() {
        AbstractC43797b bVar = this.f111107C;
        if (bVar != null && !bVar.mo156028a()) {
            return;
        }
        if (this.f111113z > 0) {
            m173575A();
        } else {
            super.mo156017h();
        }
    }

    /* renamed from: C */
    private void m173577C() {
        if (m173576B()) {
            if ((this.f111108D & 273) == 256) {
                setVisibility(0);
            } else {
                setVisibility(8);
            }
        } else if ((this.f111108D & 273) == 0) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        if ((this.f111108D & 268435456) == 0) {
            mo156117b(true);
        } else {
            mo156117b(false);
        }
    }

    /* renamed from: e */
    public void mo156008e() {
        for (TokenCompleteTextView<T>.C43837c cVar : getAllSpans()) {
            if (!((MailAddress) cVar.mo156184a()).mo151185g()) {
                cVar.mo156190d();
                return;
            }
        }
    }

    /* renamed from: f */
    public void mo156009f() {
        for (TokenCompleteTextView<T>.C43837c cVar : getAllSpans()) {
            if (((MailAddress) cVar.mo156184a()).mo151185g() && !C43785p.m173541a(C43362e.m172201a().mo155096k(), (MailAddress) cVar.mo156184a())) {
                cVar.mo156191e();
            }
        }
    }

    /* renamed from: g */
    public void mo156010g() {
        for (TokenCompleteTextView<T>.C43837c cVar : getAllSpans()) {
            if (((MailAddress) cVar.mo156184a()).mo151185g() && !C43785p.m173541a(C43362e.m172201a().mo155096k(), (MailAddress) cVar.mo156184a())) {
                mo155999c((MailAddress) cVar.mo156184a());
            }
        }
    }

    public List<MailAddress> getIllegalEmailObjectList() {
        performCompletion();
        ArrayList arrayList = new ArrayList();
        for (MailAddress mailAddress : getObjects()) {
            if (!mailAddress.mo151185g()) {
                arrayList.add(mailAddress);
            }
        }
        return arrayList;
    }

    public String getLegalEmail() {
        performCompletion();
        StringBuilder sb = new StringBuilder();
        for (MailAddress mailAddress : getObjects()) {
            if (mailAddress.mo151185g()) {
                sb.append(mailAddress.mo151182e());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public String getLegalEmailNoAutoCompletion() {
        StringBuilder sb = new StringBuilder();
        for (MailAddress mailAddress : getObjects()) {
            if (mailAddress.mo151185g()) {
                sb.append(mailAddress.mo151182e());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public MailAddress getSelectedRecipient() {
        TokenCompleteTextView.C43837c[] cVarArr = (TokenCompleteTextView.C43837c[]) getText().getSpans(0, getText().length(), TokenCompleteTextView.C43837c.class);
        if (cVarArr == null) {
            return null;
        }
        for (int i = 0; i < cVarArr.length; i++) {
            if (cVarArr[i].mo156188b()) {
                return (MailAddress) cVarArr[i].mo156184a();
            }
        }
        return null;
    }

    /* renamed from: A */
    private void m173575A() {
        int i = this.f111113z;
        if (i > 0 && this.f111110e != null) {
            this.f111113z = -1;
            int spanStart = getText().getSpanStart(this.f111212i);
            getText().getSpanEnd(this.f111212i);
            if (spanStart >= 0) {
                try {
                    getText().delete(spanStart + 1, getText().length());
                } catch (Exception unused) {
                }
            }
            List<MailAddress> list = this.f111110e;
            if (list != null) {
                int size = list.size();
                while (i < size) {
                    mo156134i(this.f111110e.get(i));
                    i++;
                }
            }
        }
    }

    public void setAddressCountChange(AbstractC43796a aVar) {
        this.f111106B = aVar;
    }

    public void setCollapseChange(AbstractC43797b bVar) {
        this.f111107C = bVar;
    }

    public void setInterceptObjectListener(AbstractC43798c cVar) {
        this.f111105A = cVar;
    }

    public void setMailContactsType(int i) {
        this.f111224u = i;
    }

    public void setInMore(boolean z) {
        mo155997b(z ? 1 : 0, 1);
    }

    public RecipientSelectView(Context context) {
        super(context);
        m173580a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public CharSequence mo156003d(MailAddress mailAddress) {
        return mailAddress.mo151198s();
    }

    public void setEditPermission(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 268435456;
        }
        mo155997b(i, 268435456);
    }

    public void setInSeparately(boolean z) {
        int i;
        if (z) {
            i = DynamicModule.f58006b;
        } else {
            i = 0;
        }
        mo155997b(i, DynamicModule.f58006b);
    }

    public void setViewPermission(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 16;
        }
        mo155997b(i, 16);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo155991a(MailAddress mailAddress) {
        if (mailAddress == null || !mailAddress.mo151185g()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    public CharSequence convertSelectionToString(Object obj) {
        AbstractC43798c cVar;
        if (!this.f111092a || (cVar = this.f111105A) == null) {
            return super.convertSelectionToString(obj);
        }
        return super.convertSelectionToString(cVar.mo150636a((MailAddress) obj));
    }

    /* renamed from: d */
    public void mo155999c(MailAddress mailAddress) {
        if (this.f111113z > 0) {
            m173575A();
        }
        super.mo155999c((Object) mailAddress);
    }

    public void setSeparatelyMode(boolean z) {
        int i;
        if (z) {
            i = DynamicModule.f58006b;
        } else {
            i = 0;
        }
        int i2 = this.f111109E;
        int i3 = (i & DynamicModule.f58006b) | (i2 & -257);
        this.f111109E = i3;
        if ((i3 ^ i2) != 0) {
            m173577C();
        }
    }

    /* renamed from: a */
    private void m173580a(Context context) {
        setThreshold(1);
        mo156114a(false);
        BubbleLayout bubbleLayout = (BubbleLayout) LayoutInflater.from(getContext()).inflate(R.layout.mail_address_bubble_layout, (ViewGroup) null);
        this.f111111x = bubbleLayout;
        this.f111112y = (TextView) bubbleLayout.findViewById(R.id.mail_tv_address_bubble);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ClipData mo155993b(MailAddress mailAddress) {
        BubbleLayout bubbleLayout = this.f111111x;
        if (bubbleLayout != null) {
            bubbleLayout.mo155902a();
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MailAddress", mailAddress);
        intent.putExtra("bundle", bundle);
        return new ClipData(mailAddress.toString(), new String[]{"text/vnd.android.intent"}, new ClipData.Item(intent));
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    /* renamed from: b */
    public void mo155996b(int i) {
        AbstractC43796a aVar = this.f111106B;
        if (aVar != null) {
            aVar.onAddressCountChange(i);
        }
    }

    /* renamed from: c */
    public List<MailAddress> mo155998c(int i) {
        if (this.f111113z > 0) {
            return this.f111110e;
        }
        ArrayList<MailAddress> arrayList = new ArrayList(getObjects());
        String n = mo156140n();
        if (!TextUtils.isEmpty(n) && (getText().getSpanStart(this.f111212i) <= 0 || !n.trim().equals(this.f111212i.mo156208a().trim()))) {
            MailAddress a = mo155995b(mo156140n());
            if (!mo156123f(a)) {
                arrayList.add(a);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (MailAddress mailAddress : arrayList) {
            if (i == mailAddress.mo151193n() || i == -1) {
                arrayList2.add(mailAddress);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo156006e(MailAddress mailAddress) {
        View view;
        Drawable drawable;
        if (mailAddress.mo151185g()) {
            view = m173583y();
        } else {
            view = m173584z();
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        if (!C43819s.m173689a(mailAddress.mo151176a())) {
            appCompatTextView.setText(mailAddress.mo151176a());
        } else if (!C43819s.m173689a(mailAddress.mo151182e())) {
            appCompatTextView.setText(mailAddress.mo151182e());
        } else if (!C43819s.m173689a(mailAddress.mo151189j())) {
            appCompatTextView.setText(mailAddress.mo151189j());
        }
        if (!mailAddress.mo151185g() || !mailAddress.mo151191l()) {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            if (mailAddress.mo151190k() == AddressType.ENTERPRISE_MAIL_GROUP) {
                drawable = C0215a.m655b(getContext(), R.drawable.ud_icon_allmail_outlined);
            } else {
                drawable = C0215a.m655b(getContext(), R.drawable.ud_icon_group_outlined);
            }
            Drawable g = C0774a.m3779g(drawable);
            int dimens = UIHelper.getDimens(R.dimen.mail_ic_compose_recipient_token_icon_size);
            g.setBounds(0, 0, dimens, dimens);
            g.setTintList(C0215a.m652a(getContext(), R.color.icon_n1));
            appCompatTextView.setCompoundDrawables(g, null, null, null);
        }
        return appCompatTextView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MailAddress mo155994b(CharSequence charSequence) {
        if (getAdapter() == null || getAdapter().getCount() <= 0) {
            return null;
        }
        MailAddress mailAddress = (MailAddress) getAdapter().getItem(0);
        if (charSequence.equals(mailAddress.mo151182e())) {
            return mailAddress;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MailAddress mo155995b(String str) {
        MailAddress.C42062a t = MailAddress.m167321a(str).mo151199t();
        t.mo151211b(this.f111224u);
        MailAddress a = t.mo151210a();
        AbstractC43798c cVar = this.f111105A;
        if (cVar != null) {
            return cVar.mo150636a(a);
        }
        return a;
    }

    /* renamed from: a */
    public void mo155985a(MailAddress mailAddress, boolean z) {
        if (this.f111113z > 0) {
            m173575A();
        }
        super.mo155985a((Object) mailAddress, z);
    }

    public RecipientSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m173580a(context);
    }

    /* renamed from: a */
    public static Bundle m173579a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo155997b(int i, int i2) {
        int i3 = this.f111108D;
        int i4 = (i & i2) | ((~i2) & i3);
        this.f111108D = i4;
        if ((i4 ^ i3) != 0) {
            m173577C();
        }
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    /* renamed from: a */
    public String mo155981a(int i, int i2) {
        int i3;
        Editable text = getText();
        if (text == null) {
            return "";
        }
        TokenCompleteTextView.C43837c[] cVarArr = (TokenCompleteTextView.C43837c[]) text.getSpans(i, i2, TokenCompleteTextView.C43837c.class);
        StringBuilder sb = new StringBuilder();
        for (TokenCompleteTextView.C43837c cVar : cVarArr) {
            int spanStart = text.getSpanStart(cVar);
            if (spanStart > i && spanStart == (i3 = i + 1) && mo156118c(text.subSequence(i, spanStart).toString()).length() == 0) {
                i = i3;
            }
            if (spanStart > i && spanStart <= i2) {
                sb.append(text.subSequence(i, spanStart));
                sb.append(',');
            }
            sb.append(((MailAddress) cVar.mo156184a()).mo151198s());
            sb.append(',');
            i = text.getSpanEnd(cVar);
        }
        if (i < i2 && mo156118c(text.subSequence(i, i2).toString()).length() != 0) {
            sb.append(text.subSequence(i, i2));
            sb.append(',');
        }
        return sb.toString();
    }

    @Override // com.ss.android.lark.mail.impl.utils.recipient.RecipientFilterView, com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    public void onFocusChanged(final boolean z, final int i, final Rect rect) {
        if (!z) {
            mo156113a((Runnable) new Runnable() {
                /* class com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView.RunnableC437951 */

                public void run() {
                    RecipientSelectView.super.onFocusChanged(z, i, rect);
                }
            });
        } else {
            super.onFocusChanged(z, i, rect);
        }
    }

    public RecipientSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m173580a(context);
    }

    /* renamed from: a */
    private boolean m173582a(TextPaint textPaint, int i, int i2) {
        if (textPaint == null) {
            return false;
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        if (this.f111212i != null) {
            this.f111212i.mo156209a(i2);
            f = this.f111212i.mo156207a(textPaint);
        }
        C43845d.C43846a aVar = new C43845d.C43846a();
        TextUtils.ellipsize(getText(), textPaint, mo156141o() - f, TextUtils.TruncateAt.END, false, aVar);
        if (aVar.f111272a != aVar.f111273b) {
            this.f111212i.mo156209a(i2 - i);
            getText().replace(aVar.f111272a, aVar.f111273b, this.f111212i.mo156208a()).setSpan(this.f111212i, aVar.f111272a, aVar.f111272a + this.f111212i.mo156208a().length(), 33);
            this.f111113z = i;
        }
        if (aVar.f111272a != aVar.f111273b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo155983a(View view, int[] iArr, MailAddress mailAddress) {
        boolean z;
        if (this.f111111x != null && mailAddress.mo151185g()) {
            boolean a = C41816b.m166115a().mo150154u().mo150160a("contact.contactcards.email");
            if ((a || !C43819s.m173689a(mailAddress.mo151189j())) && !mailAddress.mo151191l() && mailAddress.mo151190k() != AddressType.SHARED_MAILBOX) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !C43785p.m173543a(a, mailAddress.mo151190k(), mailAddress.mo151196q(), mailAddress.mo151189j(), mailAddress.mo151182e(), mailAddress.mo151176a())) {
                if (AddressType.GROUP == mailAddress.mo151190k()) {
                    this.f111112y.setText(R.string.Mail_Compose_GroupAddressTip);
                } else {
                    this.f111112y.setText(mailAddress.mo151182e());
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f111112y.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = this.f111112y.getMeasuredWidth();
                this.f111111x.mo155901a(false);
                this.f111111x.mo155904a(view, iArr, measuredWidth);
                return;
            }
            mo156168v();
        }
    }
}
