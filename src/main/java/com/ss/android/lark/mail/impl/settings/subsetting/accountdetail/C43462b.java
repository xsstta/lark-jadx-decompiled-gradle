package com.ss.android.lark.mail.impl.settings.subsetting.accountdetail;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.C41970e;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.home.p2178a.C42365c;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t;
import com.ss.android.lark.mail.impl.settings.component.p2220a.AbstractC43400b;
import com.ss.android.lark.mail.impl.settings.component.p2220a.C43397a;
import com.ss.android.lark.mail.impl.settings.component.p2221b.AbstractC43405a;
import com.ss.android.lark.mail.impl.settings.component.p2221b.C43406b;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43417a;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43420c;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43429j;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.AbstractC43470c;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.b */
public class C43462b extends BasePresenter<C43459a, AccountDetailSettingView, AbstractC43470c.AbstractC43473b.AbstractC43474a> implements AbstractC43333t {

    /* renamed from: a */
    public Activity f110399a;

    /* renamed from: b */
    public final List<AbsSettingItemViewModel> f110400b = new ArrayList();

    /* renamed from: c */
    private C43406b f110401c;

    /* renamed from: d */
    private C43397a f110402d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC43470c.AbstractC43473b.AbstractC43474a createViewDelegate() {
        return new AbstractC43470c.AbstractC43473b.AbstractC43474a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.C43462b.C434642 */
        };
    }

    /* renamed from: b */
    public void mo155287b() {
        ((AccountDetailSettingView) getView()).mo155278b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        Watchers.m167209b(this);
        for (AbsSettingItemViewModel absSettingItemViewModel : this.f110400b) {
            absSettingItemViewModel.mo155203a();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        Watchers.m167206a(this);
        ((C43459a) getModel()).mo155283f().mo5923a(((AccountDetailSettingView) getView()).mo155279c(), new AbstractC1178x<C42087a>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.C43462b.C434653 */

            /* renamed from: a */
            public void onChanged(C42087a aVar) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("emailSetting change : ");
                if (aVar != null) {
                    str = aVar.toString();
                } else {
                    str = "null";
                }
                sb.append(str);
                Log.m165389i("AccountDetailSettingPresenter", sb.toString());
                if (aVar.f107030g == 2) {
                    C43462b.this.f110399a.finish();
                } else if (aVar != null) {
                    ((AccountDetailSettingView) C43462b.this.getView()).mo155275a(aVar);
                }
            }
        });
        ((C43459a) getModel()).mo155181a().mo5923a(((AccountDetailSettingView) getView()).mo155279c(), new AbstractC1178x<Boolean>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.C43462b.C434664 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                ((AccountDetailSettingView) C43462b.this.getView()).mo155277a(bool.booleanValue());
                for (int i = 0; i < C43462b.this.f110400b.size(); i++) {
                    C43462b.this.f110400b.get(i).mo155211c(bool.booleanValue());
                }
            }
        });
        if (C41970e.m166941d().mo150951a()) {
            this.f110400b.add(new C43420c(((AccountDetailSettingView) getView()).mo155279c(), (ISettingItemModel) getModel()));
        } else {
            this.f110400b.add(new C43429j(((AccountDetailSettingView) getView()).mo155279c(), (ISettingItemModel) getModel()));
        }
        this.f110400b.add(new C43417a(((AccountDetailSettingView) getView()).mo155279c(), (ISettingItemModel) getModel()));
        for (AbsSettingItemViewModel absSettingItemViewModel : this.f110400b) {
            absSettingItemViewModel.mo155204a(this.f110399a);
            ((AccountDetailSettingView) getView()).mo155274a(absSettingItemViewModel.mo155215g());
        }
        C43406b bVar = new C43406b(this.f110399a, ((AccountDetailSettingView) getView()).mo155279c(), new C43406b.AbstractC43411a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.C43462b.C434675 */

            @Override // com.ss.android.lark.mail.impl.settings.component.p2221b.C43406b.AbstractC43411a
            /* renamed from: a */
            public void mo155201a() {
                C43462b.this.f110399a.finish();
            }
        }, (AbstractC43405a) getModel());
        this.f110401c = bVar;
        bVar.create();
        ((AccountDetailSettingView) getView()).mo155274a(this.f110401c.getView());
        C43397a aVar = new C43397a(this.f110399a, ((AccountDetailSettingView) getView()).mo155279c(), (AbstractC43400b) getModel());
        this.f110402d = aVar;
        aVar.create();
        ((AccountDetailSettingView) getView()).mo155274a(this.f110402d.getView());
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43333t
    public void onSharedAccountChange(final String str, final C42093e eVar, final boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.C43462b.RunnableC434686 */

            public void run() {
                C42365c.m169155a().mo152525a(((AccountDetailSettingView) C43462b.this.getView()).mo155280d(), str, eVar, z, 2, new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.C43462b.RunnableC434686.DialogInterface$OnClickListenerC434691 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        String e = ((C43459a) C43462b.this.getModel()).mo155282e();
                        if (!z && TextUtils.equals(eVar.mo151848b(), e)) {
                            C42699a.m170261b(C43462b.this.f110399a);
                            C43462b.this.f110399a.finish();
                        }
                    }
                });
            }
        });
    }

    public C43462b(Activity activity, C43459a aVar, AccountDetailSettingView accountDetailSettingView) {
        super(aVar, accountDetailSettingView);
        this.f110399a = activity;
        aVar.mo155281a(new AbstractC43470c.AbstractC43471a.AbstractC43472a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.C43462b.C434631 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.AbstractC43470c.AbstractC43471a.AbstractC43472a
            /* renamed from: a */
            public LifecycleOwner mo155288a() {
                return ((AccountDetailSettingView) C43462b.this.getView()).mo155279c();
            }
        });
    }
}
