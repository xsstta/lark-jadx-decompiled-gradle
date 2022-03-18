package com.tt.miniapp.feedback.entrance;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.feedback.entrance.C66137d;
import com.tt.miniapp.feedback.entrance.vo.FAQItemVO;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.util.C67590h;
import com.tt.refer.common.base.AppType;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.tt.miniapp.feedback.entrance.c */
public class View$OnClickListenerC66133c extends AbstractC66114a implements View.OnClickListener {

    /* renamed from: g */
    public View f166916g;

    /* renamed from: h */
    public View f166917h;

    /* renamed from: i */
    public AppType f166918i;

    /* renamed from: j */
    private FAQItemVO f166919j;

    /* renamed from: k */
    private TextView f166920k;

    /* renamed from: l */
    private TextView f166921l;

    /* renamed from: m */
    private View f166922m;

    /* renamed from: n */
    private ImageView f166923n;

    /* renamed from: o */
    private TextView f166924o;

    /* renamed from: p */
    private View f166925p;

    /* renamed from: q */
    private ImageView f166926q;

    /* renamed from: r */
    private TextView f166927r;

    /* renamed from: s */
    private RecyclerView f166928s;

    /* renamed from: t */
    private TextView f166929t;

    /* renamed from: u */
    private C66137d f166930u;

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: d */
    public int mo231299d() {
        return R.layout.microapp_m_fragment_feedback_detail;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: b */
    public void mo231297b() {
        super.mo231297b();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f166919j = (FAQItemVO) arguments.getParcelable("key_faq_item");
            this.f166918i = (AppType) arguments.getSerializable("key_app_type");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: a */
    public void mo231296a() {
        super.mo231296a();
        ((TextView) this.f166872f.findViewById(R.id.microapp_m_page_title)).setText(getText(R.string.microapp_m_feedback_faq_detail_title));
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: c */
    public void mo231298c() {
        super.mo231298c();
        this.f166920k = (TextView) this.f166872f.findViewById(R.id.microapp_m_feedback_detail_title);
        this.f166921l = (TextView) this.f166872f.findViewById(R.id.microapp_m_feedback_detail_answer);
        this.f166928s = (RecyclerView) this.f166872f.findViewById(R.id.microapp_m_feedback_detail_related_question_list);
        this.f166929t = (TextView) this.f166872f.findViewById(R.id.microapp_m_feedback_detail_feedback);
        this.f166916g = this.f166872f.findViewById(R.id.microapp_m_feedback_detail_body);
        this.f166917h = this.f166872f.findViewById(R.id.microapp_m_feedback_detail_footer);
        this.f166922m = this.f166872f.findViewById(R.id.microapp_m_feedback_detail_layout_useful);
        this.f166923n = (ImageView) this.f166872f.findViewById(R.id.microapp_m_feedback_detail_useful_imageview);
        this.f166924o = (TextView) this.f166872f.findViewById(R.id.microapp_m_feedback_detail_useful_textview);
        this.f166925p = this.f166872f.findViewById(R.id.microapp_m_feedback_detail_layout_useless);
        this.f166926q = (ImageView) this.f166872f.findViewById(R.id.microapp_m_feedback_detail_useless_imageview);
        this.f166927r = (TextView) this.f166872f.findViewById(R.id.microapp_m_feedback_detail_useless_textview);
        this.f166922m.setOnClickListener(this);
        this.f166925p.setOnClickListener(this);
        this.f166929t.setOnClickListener(this);
        final List<FAQItemVO> e = this.f166919j.mo231394e();
        if (e == null || e.isEmpty()) {
            C67590h.m263079a(this.f166872f.findViewById(R.id.microapp_m_feedback_detail_related_layout), 8);
        } else {
            this.f166928s.setLayoutManager(new LinearLayoutManager(this.f166868b));
            C66137d dVar = new C66137d(this.f166868b);
            this.f166930u = dVar;
            dVar.mo231341a(R.color.microapp_m_ssxianzi3);
            this.f166930u.mo231344a(e);
            this.f166930u.mo231342a(new C66137d.AbstractC66139a() {
                /* class com.tt.miniapp.feedback.entrance.View$OnClickListenerC66133c.C661341 */

                @Override // com.tt.miniapp.feedback.entrance.C66137d.AbstractC66139a
                /* renamed from: a */
                public void mo231337a(View view, int i) {
                    Fragment fragment;
                    C66020b.m258531a("mp_feedback_item_click", View$OnClickListenerC66133c.this.f166870d, C67448a.m262353a().mo234181b(C67440a.m262344a(View$OnClickListenerC66133c.this.f166918i, View$OnClickListenerC66133c.this.f166870d.appId))).mo231092a();
                    FAQItemVO fAQItemVO = (FAQItemVO) e.get(i);
                    JSONArray c = fAQItemVO.mo231391c();
                    if (c != null && c.length() > 0) {
                        fragment = C66141e.m258963a(c, false, null, View$OnClickListenerC66133c.this.f166918i);
                    } else if (TextUtils.isEmpty(fAQItemVO.mo231392d()) || fAQItemVO.mo231392d().equals("null")) {
                        fragment = C66119b.m258917a(fAQItemVO, View$OnClickListenerC66133c.this.f166870d, View$OnClickListenerC66133c.this.f166918i);
                    } else {
                        fragment = View$OnClickListenerC66133c.m258949a(fAQItemVO, View$OnClickListenerC66133c.this.f166918i);
                    }
                    if (fragment != null) {
                        View$OnClickListenerC66133c.this.f166867a.mo231280a(View$OnClickListenerC66133c.this, fragment);
                    }
                }
            });
            this.f166928s.setAdapter(this.f166930u);
        }
        this.f166920k.setText(this.f166919j.mo231389b());
        this.f166921l.setText(this.f166919j.mo231392d());
        this.f166871e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.tt.miniapp.feedback.entrance.View$OnClickListenerC66133c.View$OnLayoutChangeListenerC661352 */

            public void onLayoutChange(final View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                View$OnClickListenerC66133c.this.f166917h.post(new Runnable() {
                    /* class com.tt.miniapp.feedback.entrance.View$OnClickListenerC66133c.View$OnLayoutChangeListenerC661352.RunnableC661361 */

                    public void run() {
                        int height = View$OnClickListenerC66133c.this.f166868b.findViewById(16908290).getHeight();
                        int height2 = view.getHeight();
                        int height3 = View$OnClickListenerC66133c.this.f166916g.getHeight();
                        int height4 = View$OnClickListenerC66133c.this.f166917h.getHeight();
                        int a = (int) C67590h.m263065a(View$OnClickListenerC66133c.this.f166868b, 20.0f);
                        int a2 = (int) C67590h.m263065a(View$OnClickListenerC66133c.this.f166868b, 80.0f);
                        int i = (((height - height2) - height3) - height4) - a;
                        if (i >= a2) {
                            a2 = i;
                        }
                        C67590h.m263077a(View$OnClickListenerC66133c.this.f166917h, 0, a2, 0, a);
                        C67590h.m263079a(View$OnClickListenerC66133c.this.f166917h, 0);
                    }
                });
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            m258951b(this.f166925p, this.f166926q, this.f166927r);
            m258951b(this.f166922m, this.f166923n, this.f166924o);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.microapp_m_feedback_detail_layout_useful) {
            m258950a(this.f166922m, this.f166923n, this.f166924o);
            m258951b(this.f166925p, this.f166926q, this.f166927r);
            HostDependManager.getInst().showToast(this.f166868b, null, getResources().getString(R.string.microapp_m_feedback_faq_detail_thanks), 0, null);
        } else if (id == R.id.microapp_m_feedback_detail_layout_useless) {
            m258950a(this.f166925p, this.f166926q, this.f166927r);
            m258951b(this.f166922m, this.f166923n, this.f166924o);
            this.f166867a.mo231280a(this, C66119b.m258917a(this.f166919j, this.f166870d, this.f166918i));
        } else if (id == R.id.microapp_m_feedback_detail_feedback) {
            this.f166867a.mo231280a(this, C66119b.m258917a(this.f166919j, this.f166870d, this.f166918i));
        }
    }

    /* renamed from: a */
    public static View$OnClickListenerC66133c m258949a(FAQItemVO fAQItemVO, AppType appType) {
        View$OnClickListenerC66133c cVar = new View$OnClickListenerC66133c();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_faq_item", fAQItemVO);
        bundle.putSerializable("key_app_type", appType);
        cVar.setArguments(bundle);
        return cVar;
    }

    /* renamed from: a */
    private void m258950a(View view, ImageView imageView, TextView textView) {
        imageView.setBackground(getResources().getDrawable(R.drawable.microapp_m_feedback_detail_useful_red));
        textView.setTextColor(getResources().getColor(R.color.microapp_m_btn_red));
        view.setEnabled(false);
    }

    /* renamed from: b */
    private void m258951b(View view, ImageView imageView, TextView textView) {
        imageView.setBackground(getResources().getDrawable(R.drawable.microapp_m_feedback_detail_useful_white));
        textView.setTextColor(getResources().getColor(R.color.microapp_m_text_focus));
        view.setEnabled(true);
    }
}
