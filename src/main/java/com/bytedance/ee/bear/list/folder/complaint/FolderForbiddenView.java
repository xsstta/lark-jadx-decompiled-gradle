package com.bytedance.ee.bear.list.folder.complaint;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.bear.p522q.C10539a;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;

public class FolderForbiddenView extends UDNotice {

    /* renamed from: e */
    private AbstractC8342a f22543e;

    public enum ForbiddenState {
        WARNING,
        IN_COMPLAINT,
        COMPLAINT_FAIL,
        COMPLAINT_SUCCESS,
        COMPLAINT_EXCEED_LIMITS_DAY,
        COMPLAINT_EXCEED_LIMITS
    }

    /* renamed from: com.bytedance.ee.bear.list.folder.complaint.FolderForbiddenView$a */
    public interface AbstractC8342a {
        /* renamed from: e */
        void mo32661e();

        /* renamed from: f */
        void mo32662f();
    }

    /* renamed from: g */
    private void m34563g() {
        setVisibility(8);
    }

    /* renamed from: a */
    private void m34555a() {
        mo91033c();
        setType(UDNotice.Type.WARNING);
        setIconColorful(true);
        setIcon(R.drawable.ud_icon_warning_colorful);
        Context context = getContext();
        String string = context.getString(R.string.appealing_submit);
        String a = C10539a.m43639a(context, R.string.CreationMobile_Suspend_Folder_banner, "submit_appeal", string);
        int indexOf = a.indexOf(string, 0);
        setText(a);
        mo91029a(indexOf, string.length() + indexOf, new View.OnClickListener() {
            /* class com.bytedance.ee.bear.list.folder.complaint.$$Lambda$FolderForbiddenView$kEnXYqSWw7CKpgPax0hgUlmCSgo */

            public final void onClick(View view) {
                FolderForbiddenView.this.m34559c((FolderForbiddenView) view);
            }
        });
        setVisibility(0);
    }

    /* renamed from: b */
    private void m34557b() {
        mo91033c();
        setType(UDNotice.Type.INFO);
        setIconColorful(true);
        setIcon(R.drawable.ud_icon_info_colorful);
        setText(getContext().getString(R.string.CreationMobile_appealing_folder_pending));
        setVisibility(0);
    }

    /* renamed from: d */
    private void m34560d() {
        mo91033c();
        setType(UDNotice.Type.ERROR);
        setIconColorful(true);
        setIcon(R.drawable.ud_icon_error_colorful);
        Context context = getContext();
        String string = context.getString(R.string.appealing_submit);
        String a = C10539a.m43639a(context, R.string.CreationMobile_appealing_folder_decline, "submit_appeal", string);
        int indexOf = a.indexOf(string, 0);
        setText(a);
        mo91029a(indexOf, string.length() + indexOf, new View.OnClickListener() {
            /* class com.bytedance.ee.bear.list.folder.complaint.$$Lambda$FolderForbiddenView$KBAcajnIl8DOjYK4bl9xMDA9_k */

            public final void onClick(View view) {
                FolderForbiddenView.this.m34558b((FolderForbiddenView) view);
            }
        });
        setVisibility(0);
    }

    /* renamed from: e */
    private void m34561e() {
        mo91033c();
        setType(UDNotice.Type.ERROR);
        setIconColorful(true);
        setIcon(R.drawable.ud_icon_error_colorful);
        setText(getContext().getString(R.string.CreationMobile_ECM_Folder_SubmitThreeTimesToast));
        setVisibility(0);
    }

    /* renamed from: f */
    private void m34562f() {
        mo91033c();
        setType(UDNotice.Type.ERROR);
        setIconColorful(true);
        setIcon(R.drawable.ud_icon_error_colorful);
        Context context = getContext();
        String string = context.getString(R.string.CreationMobile_ECM_Folder_SubmitMaximumToast2);
        String a = C10539a.m43639a(context, R.string.CreationMobile_ECM_Folder_SubmitMaximumToast, "customer_service", string);
        int indexOf = a.indexOf(string, 0);
        setText(a);
        mo91029a(indexOf, string.length() + indexOf, new View.OnClickListener() {
            /* class com.bytedance.ee.bear.list.folder.complaint.$$Lambda$FolderForbiddenView$_iuwCajmK9SOJ___f0KXtCp1tFU */

            public final void onClick(View view) {
                FolderForbiddenView.this.m34556a((FolderForbiddenView) view);
            }
        });
        setVisibility(0);
    }

    public void setViewDelegate(AbstractC8342a aVar) {
        this.f22543e = aVar;
    }

    public FolderForbiddenView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34556a(View view) {
        AbstractC8342a aVar = this.f22543e;
        if (aVar != null) {
            aVar.mo32662f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m34558b(View view) {
        AbstractC8342a aVar = this.f22543e;
        if (aVar != null) {
            aVar.mo32661e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m34559c(View view) {
        AbstractC8342a aVar = this.f22543e;
        if (aVar != null) {
            aVar.mo32661e();
        }
    }

    /* renamed from: a */
    public void mo32779a(ForbiddenState forbiddenState) {
        if (forbiddenState == ForbiddenState.WARNING) {
            m34555a();
        } else if (forbiddenState == ForbiddenState.IN_COMPLAINT) {
            m34557b();
        } else if (forbiddenState == ForbiddenState.COMPLAINT_FAIL) {
            m34560d();
        } else if (forbiddenState == ForbiddenState.COMPLAINT_EXCEED_LIMITS_DAY) {
            m34561e();
        } else if (forbiddenState == ForbiddenState.COMPLAINT_EXCEED_LIMITS) {
            m34562f();
        } else {
            m34563g();
        }
    }

    public FolderForbiddenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FolderForbiddenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
