package com.tt.miniapp.feedback.entrance;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.feedback.entrance.C66141e;
import com.tt.miniapp.feedback.entrance.image.AbstractC66149b;
import com.tt.miniapp.feedback.entrance.image.C66151d;
import com.tt.miniapp.feedback.entrance.image.C66152e;
import com.tt.miniapp.feedback.entrance.image.ImageUploadView;
import com.tt.miniapp.feedback.entrance.vo.FAQItemVO;
import com.tt.miniapp.feedback.entrance.vo.FeedbackParam;
import com.tt.miniapp.feedback.entrance.vo.ImageInfoVO;
import com.tt.miniapp.p3357x.p3358a.C67404a;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.toast.ToastManager;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67045l;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.util.C67590h;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.feedback.entrance.b */
public class C66119b extends AbstractC66114a implements AbstractC66149b {

    /* renamed from: A */
    private TextWatcher f166875A = new TextWatcher() {
        /* class com.tt.miniapp.feedback.entrance.C66119b.C661265 */

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.length() > 0) {
                C67590h.m263079a(C66119b.this.f166880k, 0);
                if (C66119b.this.mo231309b(editable.toString())) {
                    C66119b.this.f166884o = false;
                } else {
                    C66119b.this.f166884o = true;
                }
            } else {
                C67590h.m263079a(C66119b.this.f166880k, 8);
                C66119b.this.f166884o = true;
            }
            C66119b.this.mo231315j();
        }
    };

    /* renamed from: g */
    public FAQItemVO f166876g;

    /* renamed from: h */
    public ImageUploadView f166877h;

    /* renamed from: i */
    public EditText f166878i;

    /* renamed from: j */
    public TextView f166879j;

    /* renamed from: k */
    public View f166880k;

    /* renamed from: l */
    public TextView f166881l;

    /* renamed from: m */
    public List<ImageInfoVO> f166882m = Collections.synchronizedList(new ArrayList(3));

    /* renamed from: n */
    public boolean f166883n = false;

    /* renamed from: o */
    public boolean f166884o = true;

    /* renamed from: p */
    public String f166885p;

    /* renamed from: q */
    public IAppContext f166886q;

    /* renamed from: r */
    public AppType f166887r;

    /* renamed from: s */
    private EditText f166888s;

    /* renamed from: t */
    private TextView f166889t;

    /* renamed from: u */
    private View f166890u;

    /* renamed from: v */
    private View f166891v;

    /* renamed from: w */
    private int f166892w;

    /* renamed from: x */
    private int f166893x;

    /* renamed from: y */
    private AppInfoEntity f166894y;

    /* renamed from: z */
    private TextWatcher f166895z = new TextWatcher() {
        /* class com.tt.miniapp.feedback.entrance.C66119b.C661254 */

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.length() <= 0 || editable.length() > 300) {
                C66119b.this.f166883n = false;
            } else {
                C66119b.this.f166883n = true;
            }
            if (editable.length() >= 300) {
                C66119b.this.f166881l.setText(String.format(C66119b.this.f166885p, Integer.valueOf(editable.length())));
                C67590h.m263079a(C66119b.this.f166881l, 0);
            } else {
                C67590h.m263079a(C66119b.this.f166881l, 4);
            }
            C66119b.this.mo231315j();
        }
    };

    /* renamed from: com.tt.miniapp.feedback.entrance.b$a */
    public interface AbstractC66132a {
        /* renamed from: a */
        void mo231318a(List<MediaEntity> list);
    }

    @Override // com.tt.miniapp.feedback.entrance.image.AbstractC66149b
    /* renamed from: a */
    public void mo231308a(ArrayList<C66152e> arrayList, int i) {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: d */
    public int mo231299d() {
        return R.layout.microapp_m_fragment_feedback_commit;
    }

    /* renamed from: a */
    public void mo231307a(CharSequence charSequence, long j) {
        ToastManager.C66967a aVar = new ToastManager.C66967a(this.f166868b);
        View inflate = View.inflate(this.f166868b, R.layout.microapp_m_popup_toast, null);
        TextView textView = (TextView) inflate.findViewById(R.id.microapp_m_text);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMinWidth((int) C67590h.m263065a(this.f166868b, 108.0f));
        textView.setMaxWidth((int) C67590h.m263065a(this.f166868b, 168.0f));
        textView.setText(charSequence);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.microapp_m_icon);
        imageView.setVisibility(0);
        imageView.setImageDrawable(getResources().getDrawable(2131234657));
        textView.setMaxLines(1);
        aVar.mo232986a(inflate);
        aVar.mo232985a(j);
        aVar.mo232984a(17);
        aVar.mo232983a();
    }

    /* renamed from: i */
    public String mo231314i() {
        return C67043j.m261279d();
    }

    /* renamed from: l */
    private void m258920l() {
        this.f166889t.setTextColor(this.f166893x);
        this.f166889t.setEnabled(false);
    }

    /* renamed from: m */
    private void m258921m() {
        this.f166889t.setTextColor(this.f166892w);
        this.f166889t.setEnabled(true);
    }

    /* renamed from: e */
    public String mo231310e() {
        return this.f166878i.getText().toString();
    }

    /* renamed from: f */
    public String mo231311f() {
        return this.f166888s.getText().toString();
    }

    /* renamed from: h */
    public String mo231313h() {
        return C67043j.m261271a() + "+" + C67043j.m261276b();
    }

    /* renamed from: j */
    public void mo231315j() {
        int i;
        if (!this.f166884o || !this.f166883n) {
            m258920l();
        } else {
            m258921m();
        }
        View view = this.f166890u;
        if (this.f166884o) {
            i = 8;
        } else {
            i = 0;
        }
        C67590h.m263079a(view, i);
    }

    @Override // com.tt.miniapp.feedback.entrance.image.AbstractC66149b
    /* renamed from: k */
    public void mo231316k() {
        m258918a(this.f166868b, 3 - this.f166877h.getImageList().size());
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: b */
    public void mo231297b() {
        super.mo231297b();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f166876g = (FAQItemVO) arguments.getParcelable("key_faq_item");
            this.f166894y = (AppInfoEntity) arguments.getParcelable("key_appinfo_entity");
            AppType appType = (AppType) arguments.getSerializable("key_app_type");
            this.f166887r = appType;
            this.f166886q = C67448a.m262353a().mo234181b(C67440a.m262344a(appType, this.f166870d.appId));
        }
    }

    /* renamed from: g */
    public void mo231312g() {
        HostDependManager.getInst().showToast(this.f166868b, null, getString(R.string.microapp_m_feedback_posting), 10000, "loading");
        Observable.create(new Function<String>() {
            /* class com.tt.miniapp.feedback.entrance.C66119b.C661233 */

            /* renamed from: a */
            public String fun() {
                Long l;
                String str;
                C67556a.m262934a(C66119b.this.f166879j.getText().toString(), new AbstractC67565b() {
                    /* class com.tt.miniapp.feedback.entrance.C66119b.C661233.C661241 */

                    @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                    /* renamed from: a */
                    public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                    }
                });
                StringBuilder sb = new StringBuilder();
                FeedbackParam feedbackParam = new FeedbackParam();
                feedbackParam.mo231421f(C66119b.this.f166869c.mo231420f());
                feedbackParam.mo231423g(C66119b.this.f166869c.mo231422g());
                feedbackParam.mo231425h(C66119b.this.f166869c.mo231424h());
                feedbackParam.mo231419e(C66119b.this.f166869c.mo231418e());
                feedbackParam.mo231412b(C66119b.this.f166869c.mo231411b());
                feedbackParam.mo231414c(C66119b.this.f166869c.mo231413c());
                sb.append(AppbrandConstant.C65702c.m257640a().mo230164d());
                String f = C66119b.this.f166869c.mo231420f();
                String g = C66119b.this.f166869c.mo231422g();
                String h = C66119b.this.f166869c.mo231424h();
                C66119b bVar = C66119b.this;
                sb.append(feedbackParam.mo231408a(f, g, h, bVar.mo231302a(bVar.f166869c.mo231436n()), C66119b.this.mo231314i(), C66119b.this.mo231313h(), C66119b.this.f166869c.mo231438o()));
                C12827e eVar = new C12827e(sb.toString(), "POST", false);
                String a = C67556a.m262928a();
                if (!TextUtils.isEmpty(a)) {
                    eVar.mo48434a("Cookie", a);
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("mp_id", C66119b.this.f166869c.mo231415d());
                    jSONObject.put("mp_name", C66119b.this.f166869c.mo231406a());
                    jSONObject.put("mp_type", C66119b.this.f166869c.mo231426i());
                    jSONObject2.put("mp_id", C66119b.this.f166869c.mo231415d());
                    jSONObject2.put("mp_name", C66119b.this.f166869c.mo231406a());
                    jSONObject2.put("mp_type", C66119b.this.f166869c.mo231426i());
                    if (C66119b.this.f166869c.mo231428j() == null) {
                        str = "current";
                    } else {
                        str = C66119b.this.f166869c.mo231428j();
                    }
                    jSONObject2.put("mp_version_type", str);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("tma_FAQCommitFragment", e);
                }
                eVar.mo48433a("extra_params", jSONObject);
                eVar.mo48433a("extra_persistent_params", jSONObject2);
                eVar.mo48433a("content", (Object) C66119b.this.mo231311f());
                if (C66119b.this.f166876g != null) {
                    l = Long.valueOf(C66119b.this.f166876g.mo231384a());
                } else {
                    l = "";
                }
                eVar.mo48433a("qr_id", l);
                if (!TextUtils.isEmpty(C66119b.this.mo231310e())) {
                    eVar.mo48433a("contact", (Object) C66119b.this.mo231310e());
                }
                if (C66119b.this.f166882m != null && !C66119b.this.f166882m.isEmpty()) {
                    if (C66119b.this.f166882m.size() != 1 || C66119b.this.f166882m.get(0).mo231451c() == null || C66119b.this.f166882m.get(0).mo231451c().isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < C66119b.this.f166882m.size(); i++) {
                            try {
                                jSONArray.put(ImageInfoVO.m259055a(C66119b.this.f166882m.get(i)));
                            } catch (JSONException e2) {
                                AppBrandLogger.m52829e("tma_FAQCommitFragment", e2);
                            }
                        }
                        if (jSONArray.length() > 0) {
                            eVar.mo48433a("multi_image", (Object) 1);
                            eVar.mo48433a("image_list", jSONArray);
                        }
                    } else {
                        eVar.mo48433a("multi_image", (Object) 0);
                        eVar.mo48433a("image_uri", (Object) C66119b.this.f166882m.get(0).mo231451c().get(0));
                        eVar.mo48433a("image_width", Integer.valueOf(C66119b.this.f166882m.get(0).mo231444a()));
                        eVar.mo48433a("image_height", Integer.valueOf(C66119b.this.f166882m.get(0).mo231448b()));
                    }
                }
                try {
                    return HostDependManager.getInst().doPostUrlEncoded(eVar, C66119b.this.f166886q).mo48466d();
                } catch (Exception e3) {
                    AppBrandLogger.m52829e("tma_FAQCommitFragment", e3);
                    return "";
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<String>() {
            /* class com.tt.miniapp.feedback.entrance.C66119b.C661212 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                HostDependManager.getInst().hideToast();
                if (C66119b.this.isAdded()) {
                    C66119b bVar = C66119b.this;
                    bVar.mo231307a(bVar.getResources().getString(R.string.microapp_m_feedback_submit_feedback_error_toast), 0);
                }
                AppBrandLogger.m52829e("tma_FAQCommitFragment", "submit", th);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                HostDependManager.getInst().hideToast();
                try {
                    if (TextUtils.equals(new JSONObject(str).optString("message"), "success")) {
                        C66020b.m258531a("mp_feedback_result", C66119b.this.f166870d, C66119b.this.f166886q).mo231090a("result_type", "success").mo231092a();
                        if (C66119b.this.isAdded()) {
                            HostDependManager.getInst().showToast(C66119b.this.f166868b, null, C66119b.this.getResources().getString(R.string.microapp_m_feedback_submit_feedback_success_toast), 0, "success");
                        }
                        C67866g.m264027a(new Runnable() {
                            /* class com.tt.miniapp.feedback.entrance.C66119b.C661212.RunnableC661221 */

                            public void run() {
                                C66119b.this.f166868b.onBackPressed();
                            }
                        });
                        return;
                    }
                    C66020b.m258531a("mp_feedback_result", C66119b.this.f166870d, C66119b.this.f166886q).mo231090a("result_type", "fail").mo231092a();
                    if (C66119b.this.isAdded()) {
                        C66119b bVar = C66119b.this;
                        bVar.mo231307a(bVar.getResources().getString(R.string.microapp_m_feedback_submit_feedback_error_toast), 0);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: a */
    public void mo231296a() {
        super.mo231296a();
        ((TextView) this.f166872f.findViewById(R.id.microapp_m_page_title)).setText(getText(R.string.microapp_m_feedback_commit_submit_feedback_title));
        TextView textView = (TextView) this.f166872f.findViewById(R.id.microapp_m_feedback_send);
        this.f166889t = textView;
        C67590h.m263079a(textView, 0);
        this.f166889t.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.feedback.entrance.C66119b.View$OnClickListenerC661201 */

            public void onClick(View view) {
                C66020b.m258531a("mp_feedback_upload", C66119b.this.f166870d, C66119b.this.f166886q).mo231092a();
                C66119b.this.mo231312g();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: c */
    public void mo231298c() {
        String str;
        super.mo231298c();
        ImageUploadView imageUploadView = (ImageUploadView) this.f166872f.findViewById(R.id.microapp_m_feedback_img_load);
        this.f166877h = imageUploadView;
        imageUploadView.mo231348a(this).mo231349a(new C66151d()).mo231350a(true).mo231353b(3).mo231354c(3);
        int a = C67590h.m263066a(this.f166868b);
        int a2 = (int) C67590h.m263065a(this.f166868b, 15.0f);
        C67590h.m263077a(this.f166877h, a2, -3, a2, -3);
        this.f166877h.mo231347a(((int) ((((float) a) - (C67590h.m263065a(this.f166868b, 3.0f) * 2.0f)) - ((float) (a2 * 2)))) / 3);
        this.f166888s = (EditText) this.f166872f.findViewById(R.id.microapp_m_feedback_faq_description);
        this.f166888s.setFilters(new InputFilter[]{new InputFilter.LengthFilter(LocationRequest.PRIORITY_INDOOR)});
        this.f166888s.addTextChangedListener(this.f166895z);
        this.f166888s.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.tt.miniapp.feedback.entrance.C66119b.View$OnFocusChangeListenerC661276 */

            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    C66119b.this.mo231304a(view);
                }
            }
        });
        EditText editText = (EditText) this.f166872f.findViewById(R.id.microapp_m_et_feedback_contact);
        this.f166878i = editText;
        editText.addTextChangedListener(this.f166875A);
        this.f166878i.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.tt.miniapp.feedback.entrance.C66119b.View$OnFocusChangeListenerC661287 */

            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    C66119b.this.mo231304a(view);
                }
            }
        });
        TextView textView = (TextView) this.f166872f.findViewById(R.id.microapp_m_feedback_scene);
        this.f166879j = textView;
        FAQItemVO fAQItemVO = this.f166876g;
        if (fAQItemVO != null) {
            str = fAQItemVO.mo231389b();
        } else {
            str = "";
        }
        textView.setText(str);
        View findViewById = this.f166872f.findViewById(R.id.microapp_m_feedback_contact_clear_btn);
        this.f166880k = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.feedback.entrance.C66119b.View$OnClickListenerC661298 */

            public void onClick(View view) {
                C66119b.this.f166878i.setText("");
            }
        });
        this.f166890u = this.f166872f.findViewById(R.id.microapp_m_feedback_contact_error_layout);
        this.f166881l = (TextView) this.f166872f.findViewById(R.id.microapp_m_feedback_text_length);
        View findViewById2 = this.f166872f.findViewById(R.id.microapp_m_feedback_scene_select_layout);
        this.f166891v = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.feedback.entrance.C66119b.View$OnClickListenerC661309 */

            public void onClick(View view) {
                C66119b.this.f166867a.mo231280a(C66119b.this, C66141e.m258964a(true, new C66141e.AbstractC66144a() {
                    /* class com.tt.miniapp.feedback.entrance.C66119b.View$OnClickListenerC661309.C661311 */

                    @Override // com.tt.miniapp.feedback.entrance.C66141e.AbstractC66144a
                    /* renamed from: a */
                    public void mo231335a(FAQItemVO fAQItemVO) {
                        String str;
                        C66119b.this.f166876g = fAQItemVO;
                        TextView textView = C66119b.this.f166879j;
                        if (C66119b.this.f166876g != null) {
                            str = C66119b.this.f166876g.mo231389b();
                        } else {
                            str = "";
                        }
                        textView.setText(str);
                    }
                }, C66119b.this.f166887r));
            }
        });
        this.f166885p = getString(R.string.microapp_m_feedback_number_counts);
        this.f166892w = getResources().getColor(R.color.microapp_m_feedback_send_text_color_available);
        this.f166893x = getResources().getColor(R.color.microapp_m_feedback_send_text_color_unavailable);
        this.f166867a.mo231282a(new AbstractC66132a() {
            /* class com.tt.miniapp.feedback.entrance.C66119b.AnonymousClass10 */

            @Override // com.tt.miniapp.feedback.entrance.C66119b.AbstractC66132a
            /* renamed from: a */
            public void mo231318a(List<MediaEntity> list) {
                if (!(list == null || list.isEmpty())) {
                    for (MediaEntity mediaEntity : list) {
                        C66119b.this.mo231305a(mediaEntity);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public String mo231302a(String str) {
        return CharacterUtils.splitCharByPoints(str);
    }

    /* renamed from: b */
    public boolean mo231309b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 19968 && charAt <= 40869) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tt.miniapp.feedback.entrance.image.AbstractC66149b
    /* renamed from: a */
    public void mo231303a(int i) {
        if (i < this.f166882m.size()) {
            this.f166877h.mo231355d(i);
            this.f166882m.remove(i);
        }
    }

    /* renamed from: a */
    public void mo231304a(View view) {
        ((InputMethodManager) this.f166868b.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: a */
    public void mo231305a(final MediaEntity mediaEntity) {
        this.f166877h.mo231351a(new C66152e(mediaEntity.f170273f, mediaEntity.f170268a, 1));
        Observable.create(new Function<String>() {
            /* class com.tt.miniapp.feedback.entrance.C66119b.AnonymousClass12 */

            /* renamed from: a */
            public String fun() {
                File file;
                StringBuilder sb = new StringBuilder();
                FeedbackParam feedbackParam = new FeedbackParam();
                feedbackParam.mo231421f(C66119b.this.f166869c.mo231420f());
                feedbackParam.mo231423g(C66119b.this.f166869c.mo231422g());
                feedbackParam.mo231425h(C66119b.this.f166869c.mo231424h());
                feedbackParam.mo231419e(C66119b.this.f166869c.mo231418e());
                feedbackParam.mo231412b(C66119b.this.f166869c.mo231411b());
                feedbackParam.mo231414c(C66119b.this.f166869c.mo231413c());
                sb.append(AppbrandConstant.C65702c.m257640a().mo230163c());
                sb.append(feedbackParam.mo231407a(C66119b.this.f166869c.mo231420f(), C66119b.this.f166869c.mo231422g(), C66119b.this.f166869c.mo231424h()));
                C12827e eVar = new C12827e(sb.toString(), "POST", false);
                eVar.mo48438b(30000);
                eVar.mo48439c(30000);
                File file2 = new File(mediaEntity.f170268a);
                File d = C67404a.m262266a(C66119b.this.f166886q).mo234083d(C66119b.this.f166869c.mo231415d());
                try {
                    file = C67045l.m261301a(file2, 640, 480, Bitmap.CompressFormat.PNG, 75, new File(d, new Random().nextInt() + ".png").toString());
                } catch (IOException e) {
                    e.printStackTrace();
                    file = null;
                }
                if (file != null) {
                    eVar.mo48432a("image", file, "image/jpeg");
                } else {
                    eVar.mo48432a("image", file2, "image/jpeg");
                }
                String str = "";
                try {
                    C12830f postMultiPart = HostDependManager.getInst().postMultiPart(eVar, C66119b.this.f166886q);
                    if (postMultiPart == null) {
                        return str;
                    }
                    str = postMultiPart.mo48466d();
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    return str;
                } catch (Exception e2) {
                    AppBrandLogger.m52829e("tma_FAQCommitFragment", e2);
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<String>() {
            /* class com.tt.miniapp.feedback.entrance.C66119b.AnonymousClass11 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                C66119b.this.mo231306a(mediaEntity, false);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.optString("message").equals("success")) {
                        C66119b.this.mo231306a(mediaEntity, false);
                        return;
                    }
                    C66119b.this.f166882m.add(ImageInfoVO.m259054a(new JSONObject(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE))));
                    C66119b.this.mo231306a(mediaEntity, true);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("tma_FAQCommitFragment", e);
                }
            }
        });
    }

    /* renamed from: a */
    private void m258918a(Activity activity, int i) {
        if (ActivityCompat.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 66);
        } else {
            m258919a(activity, i, true, true, null);
        }
    }

    /* renamed from: a */
    public void mo231306a(MediaEntity mediaEntity, final boolean z) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new C66152e(mediaEntity.f170273f, mediaEntity.f170268a, 2));
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.feedback.entrance.C66119b.AnonymousClass13 */

            public void run() {
                C66119b.this.f166877h.mo231352a(arrayList, z);
            }
        });
    }

    /* renamed from: a */
    public static C66119b m258917a(FAQItemVO fAQItemVO, AppInfoEntity appInfoEntity, AppType appType) {
        C66119b bVar = new C66119b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_faq_item", fAQItemVO);
        bundle.putParcelable("key_appinfo_entity", appInfoEntity);
        bundle.putSerializable("key_app_type", appType);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 66) {
            return;
        }
        if (iArr == null || iArr.length < 1 || iArr[0] != 0) {
            C66588h.m260183a().mo232192a(this.f166868b, strArr, iArr);
        } else {
            m258919a(this.f166868b, 3 - this.f166877h.getImageList().size(), true, true, null);
        }
    }

    /* renamed from: a */
    private void m258919a(Activity activity, int i, boolean z, boolean z2, String str) {
        HostDependManager.getInst().chooseImageForFeedback(this.f166886q, i, z, z2, str);
    }
}
