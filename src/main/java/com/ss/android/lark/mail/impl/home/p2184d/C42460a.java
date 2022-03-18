package com.ss.android.lark.mail.impl.home.p2184d;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.email.client.v1.FilterType;
import com.bytedance.lark.pb.email.client.v1.MailLastVersionNewUserFlagResponse;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.dynamicresources.DynamicResourcesFacade;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.menu.MailMenuComponent;
import com.ss.android.lark.mail.impl.home.menu.MailMenuViewModel;
import com.ss.android.lark.mail.impl.home.p2183c.C42441c;
import com.ss.android.lark.mail.impl.home.p2184d.C42460a;
import com.ss.android.lark.mail.impl.home.threadlist.C42593a;
import com.ss.android.lark.mail.impl.home.titlebar.accountcard.AccountCardComponent;
import com.ss.android.lark.mail.impl.message.p2203c.C42846c;
import com.ss.android.lark.mail.impl.message.view.C43187b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43344f;
import com.ss.android.lark.mail.impl.utils.C43779n;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44549f;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.d.a */
public class C42460a {

    /* renamed from: A */
    private ViewTreeObserver.OnPreDrawListener f108079A;

    /* renamed from: a */
    public AbstractC42473b f108080a;

    /* renamed from: b */
    public C43187b f108081b;

    /* renamed from: c */
    public C43187b f108082c;

    /* renamed from: d */
    public final List<AbstractC44545b> f108083d = new ArrayList();

    /* renamed from: e */
    public C42471a f108084e;

    /* renamed from: f */
    AbstractC44549f f108085f;

    /* renamed from: g */
    MailMenuComponent f108086g;

    /* renamed from: h */
    public C42593a f108087h;

    /* renamed from: i */
    boolean f108088i = true;

    /* renamed from: j */
    String f108089j;

    /* renamed from: k */
    boolean f108090k;

    /* renamed from: l */
    boolean f108091l;

    /* renamed from: m */
    ITitleInfo.AbstractC44542a f108092m;

    /* renamed from: n */
    boolean f108093n;

    /* renamed from: o */
    boolean f108094o;

    /* renamed from: p */
    public final ITitleInfo f108095p = new ITitleInfo() {
        /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.C424611 */

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: g */
        public ITitleInfo.C44543b mo33261g() {
            return null;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: a */
        public boolean mo33255a() {
            return C42460a.this.f108088i;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: f */
        public ITitleInfo.AbstractC44542a mo33260f() {
            return C42460a.this.f108092m;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: b */
        public String mo33256b() {
            if (C42460a.this.f108093n) {
                return C43819s.m173684a((int) R.string.Mail_Normal_Email);
            }
            return C42460a.this.f108089j;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: c */
        public ITitleInfo.IconStyle mo33257c() {
            if (C42460a.this.f108093n) {
                return ITitleInfo.IconStyle.Hide;
            }
            if (C42460a.this.f108090k) {
                return ITitleInfo.IconStyle.Up;
            }
            return ITitleInfo.IconStyle.Down;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: e */
        public ITitleInfo.Status mo33259e() {
            if (C42460a.this.f108093n) {
                return ITitleInfo.Status.Normal;
            }
            if (C42460a.this.f108091l) {
                return ITitleInfo.Status.Loading;
            }
            return ITitleInfo.Status.Normal;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: d */
        public List<AbstractC44545b> mo33258d() {
            if (C42460a.this.f108093n) {
                Log.m165388i("getFunctionButtonList:hideContent");
                return null;
            }
            Log.m165388i("getFunctionButtonList:size=" + C42460a.this.f108083d.size());
            return C42460a.this.f108083d;
        }
    };

    /* renamed from: q */
    public final C1177w<Integer> f108096q = new C1177w<>();

    /* renamed from: r */
    String f108097r;

    /* renamed from: s */
    FilterType f108098s = FilterType.FILTER_UNKNOWN;

    /* renamed from: t */
    private AbstractC44545b f108099t;

    /* renamed from: u */
    private AbstractC44548e f108100u;

    /* renamed from: v */
    private final Fragment f108101v;

    /* renamed from: w */
    private final C43849u.C43850a f108102w = new C43849u.C43850a("TitleBar_LimitExecutor", LocationRequest.PRIORITY_HD_ACCURACY);

    /* renamed from: x */
    private AccountCardComponent f108103x;

    /* renamed from: y */
    private AbstractC1178x f108104y;

    /* renamed from: z */
    private AbstractC43344f f108105z;

    /* renamed from: com.ss.android.lark.mail.impl.home.d.a$b */
    public interface AbstractC42473b {
        /* renamed from: a */
        void mo152796a();

        /* renamed from: a */
        void mo152797a(FilterType filterType);

        /* renamed from: b */
        void mo152798b();

        /* renamed from: c */
        void mo152799c();

        /* renamed from: d */
        void mo152800d();

        /* renamed from: e */
        void mo152801e();
    }

    /* renamed from: com.ss.android.lark.mail.impl.home.d.a$a */
    public static class C42471a implements AbstractC44545b {

        /* renamed from: b */
        public ImageView f108125b;

        /* renamed from: a */
        public void mo152780a(View view) {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44545b
        public View getContentView() {
            return this.f108125b;
        }

        /* renamed from: b */
        public void mo152794b(int i) {
            this.f108125b.setColorFilter(i);
        }

        /* renamed from: a */
        public void mo152793a(int i) {
            this.f108125b.setImageResource(i);
            this.f108125b.setBackground(null);
        }

        public C42471a(Context context, int i, int i2, int i3) {
            ImageView imageView = new ImageView(context);
            this.f108125b = imageView;
            imageView.setId(i);
            this.f108125b.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.C42471a.View$OnClickListenerC424721 */

                public void onClick(View view) {
                    C42471a.this.mo152780a(view);
                }
            });
            mo152793a(i2);
            if (i3 >= 0) {
                mo152794b(i3);
            }
        }
    }

    /* renamed from: c */
    public boolean mo152765c() {
        return this.f108088i;
    }

    /* renamed from: i */
    public C1177w<Integer> mo152772i() {
        return this.f108096q;
    }

    /* renamed from: k */
    public String mo152774k() {
        return this.f108089j;
    }

    /* renamed from: l */
    public ITitleInfo mo152775l() {
        return this.f108095p;
    }

    /* renamed from: v */
    private boolean m169508v() {
        return DynamicResourcesFacade.m88635b((int) R.color.suite_skin_vi_content_color);
    }

    /* renamed from: m */
    public Context mo152776m() {
        return this.f108101v.getContext();
    }

    /* renamed from: o */
    public void mo152778o() {
        mo152761a(false);
    }

    /* renamed from: h */
    public int mo152771h() {
        AbstractC44549f fVar = this.f108085f;
        if (fVar != null) {
            return fVar.mo99189a();
        }
        return 0;
    }

    /* renamed from: j */
    public View mo152773j() {
        AbstractC44549f fVar = this.f108085f;
        if (fVar != null) {
            return fVar.mo99196d();
        }
        return null;
    }

    /* renamed from: p */
    public void mo152779p() {
        this.f108093n = m169507u();
        mo152768e();
    }

    /* renamed from: b */
    public void mo152762b() {
        Log.m165388i("closeFilterMenu");
        mo152767d(false);
        MailMenuComponent cVar = this.f108086g;
        if (cVar != null) {
            ((MailMenuViewModel) cVar.getValue()).show(false);
        }
    }

    /* renamed from: f */
    public AccountCardComponent mo152769f() {
        if (this.f108103x == null) {
            AccountCardComponent aVar = new AccountCardComponent(this.f108101v);
            this.f108103x = aVar;
            aVar.mo152803a(this.f108085f, this.f108100u);
        }
        return this.f108103x;
    }

    /* renamed from: g */
    public Bitmap mo152770g() {
        Bitmap bitmap;
        AbstractC44549f fVar = this.f108085f;
        if (fVar != null) {
            bitmap = fVar.mo99195c();
        } else {
            bitmap = null;
        }
        return C57820d.m224429a(bitmap, (int) ParticipantRepo.f117150c);
    }

    /* renamed from: u */
    private boolean m169507u() {
        C42087a m = C43277a.m171921a().mo154949m();
        if (m == null || !(m.f107030g == 2 || m.f107030g == 3)) {
            Log.m165388i("show content");
            return false;
        }
        Log.m165388i("hide content");
        return true;
    }

    /* renamed from: d */
    public void mo152766d() {
        final View view;
        AbstractC44549f fVar = this.f108085f;
        if (fVar != null) {
            view = fVar.mo99197e();
        } else {
            view = null;
        }
        if (view != null) {
            if (this.f108079A != null) {
                view.getViewTreeObserver().removeOnPreDrawListener(this.f108079A);
            }
            this.f108079A = new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.ViewTreeObserver$OnPreDrawListenerC424644 */

                public boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    Log.m165389i("TitleBarComponent", "title bar height : " + C42460a.this.mo152771h());
                    C42460a.this.f108096q.mo5929b(Integer.valueOf(C42460a.this.mo152771h()));
                    return true;
                }
            };
            view.getViewTreeObserver().addOnPreDrawListener(this.f108079A);
        }
    }

    /* renamed from: e */
    public void mo152768e() {
        RunnableC424655 r0 = new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.RunnableC424655 */

            public void run() {
                Log.m165388i("execute updateTitleInfo");
                if (C42460a.this.f108085f != null) {
                    C42460a.this.f108085f.mo99191a(C42460a.this.f108095p);
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (!C41816b.m166115a().mo150143j()) {
                Log.m165386e("notifyUpdateTitleInfo error", new RuntimeException("Only the ui thread can touch title views."));
            } else {
                throw new RuntimeException("Only the ui thread can touch title views.");
            }
        }
        C43849u.m173823a(this.f108102w, r0);
    }

    /* renamed from: n */
    public void mo152777n() {
        AccountCardComponent aVar = this.f108103x;
        if (aVar != null) {
            aVar.mo152808g();
        }
        C42493b.m169603a().mo152849b().mo5928b(this.f108104y);
        Watchers.m167209b(this.f108105z);
        if (this.f108101v != null) {
            C43374f.m172264f().mo155136x().mo5922a(this.f108101v);
            C43374f.m172264f().mo155131s().mo5922a(this.f108101v);
        }
    }

    /* renamed from: r */
    private void m169504r() {
        if (this.f108081b == null) {
            this.f108081b = new C43187b(mo152776m());
        }
        this.f108081b.mo154576a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C42846c(20, R.drawable.ud_icon_filter_outlined, mo152776m().getString(R.string.Mail_Label_UnreadOnly)));
        this.f108081b.mo154579a(arrayList);
        this.f108081b.mo154578a(new C43187b.AbstractC43190a() {
            /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.AnonymousClass15 */

            @Override // com.ss.android.lark.mail.impl.message.view.C43187b.AbstractC43190a
            /* renamed from: a */
            public void mo152784a(View view, C42846c cVar, int i) {
                if (C42460a.this.f108080a != null && cVar.f109077a == 20) {
                    C42460a.this.f108081b.mo154581b();
                    C42460a.this.f108080a.mo152797a(FilterType.UNREAD);
                }
            }
        });
    }

    /* renamed from: s */
    private void m169505s() {
        C424633 r0 = new AbstractC43344f() {
            /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.C424633 */

            @Override // com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43344f
            /* renamed from: a */
            public void mo152785a() {
            }

            @Override // com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43344f
            /* renamed from: c */
            public void mo152787c() {
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m169546e() {
                C42460a.this.mo152766d();
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m169547f() {
                C42460a.this.mo152766d();
            }

            @Override // com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43344f
            /* renamed from: b */
            public void mo152786b() {
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.home.p2184d.$$Lambda$a$3$YgodakSR4rffdIqxs3O6kvaqMXk */

                    public final void run() {
                        C42460a.C424633.this.m169547f();
                    }
                });
            }

            @Override // com.ss.android.lark.mail.impl.service.p2217b.p2219b.AbstractC43344f
            /* renamed from: d */
            public void mo152788d() {
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.home.p2184d.$$Lambda$a$3$Zzfk1DkX7YWHvBwfL0tbemt5u8 */

                    public final void run() {
                        C42460a.C424633.this.m169546e();
                    }
                });
            }
        };
        this.f108105z = r0;
        Watchers.m167206a(r0);
        mo152769f().mo152806e().mo5923a(this.f108101v, new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.home.p2184d.$$Lambda$a$5zPTP2cK5ey87jBUJh7tKb_UOaI */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C42460a.this.m169498a((C42460a) ((Boolean) obj));
            }
        });
        C43374f.m172264f().mo155131s().mo5923a(this.f108101v, new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.home.p2184d.$$Lambda$a$PMTEvLNhJo2ShjU1zjO2lfNpLGg */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C42460a.this.m169502b((C42460a) ((MailLabelEntity) obj));
            }
        });
        C43374f.m172264f().mo155136x().mo5923a(this.f108101v, new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.home.p2184d.$$Lambda$a$B7Ca9zCLlZ6AKGnvzsT0XDSyxDM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C42460a.this.m169497a((C42460a) ((FilterType) obj));
            }
        });
    }

    /* renamed from: q */
    private void m169503q() {
        this.f108092m = new ITitleInfo.AbstractC44542a() {
            /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.C424698 */

            @Override // com.ss.android.lark.maincore.ITitleInfo.AbstractC44542a
            /* renamed from: a */
            public void mo99210a() {
                if (!C42460a.this.f108093n) {
                    if (C42460a.this.f108080a != null) {
                        C42460a.this.f108080a.mo152796a();
                    }
                    if (C42460a.this.f108090k) {
                        C42460a.this.mo152762b();
                    } else {
                        C42460a.this.mo152755a();
                    }
                }
            }
        };
        TypedArray obtainTypedArray = mo152776m().getResources().obtainTypedArray(R.array.function_btn_ids);
        this.f108083d.add(new C42471a(mo152776m(), obtainTypedArray.getResourceId(0, 0), R.drawable.ud_icon_search_outlined, UDColorUtils.getColor(mo152776m(), R.color.icon_n1)) {
            /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.C424709 */

            @Override // com.ss.android.lark.mail.impl.home.p2184d.C42460a.C42471a
            /* renamed from: a */
            public void mo152780a(View view) {
                super.mo152780a(view);
                if (C42460a.this.f108080a != null) {
                    C42460a.this.f108080a.mo152798b();
                }
                if (C42460a.this.f108090k) {
                    C42460a.this.mo152762b();
                }
            }
        });
        this.f108084e = new C42471a(mo152776m(), obtainTypedArray.getResourceId(1, 0), R.drawable.ud_icon_filter_outlined, UDColorUtils.getColor(mo152776m(), R.color.icon_n1)) {
            /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.AnonymousClass10 */

            @Override // com.ss.android.lark.mail.impl.home.p2184d.C42460a.C42471a
            /* renamed from: a */
            public void mo152780a(View view) {
                super.mo152780a(view);
                if (C42460a.this.f108081b != null) {
                    C42460a.this.f108081b.mo154577a(view, 0);
                } else if (C42460a.this.f108080a != null) {
                    C42460a.this.f108080a.mo152797a(FilterType.ALL_MAIL);
                }
                if (C42460a.this.f108090k) {
                    C42460a.this.mo152762b();
                }
            }
        };
        AnonymousClass11 r7 = new C42471a(mo152776m(), obtainTypedArray.getResourceId(2, 0), R.drawable.ud_icon_more_outlined, UDColorUtils.getColor(mo152776m(), R.color.icon_n1)) {
            /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.AnonymousClass11 */

            @Override // com.ss.android.lark.mail.impl.home.p2184d.C42460a.C42471a
            /* renamed from: a */
            public void mo152780a(View view) {
                super.mo152780a(view);
                if (C42460a.this.f108082c == null) {
                    C42460a.this.mo152757a(C43374f.m172264f().mo155130r());
                }
                boolean z = true;
                if (C42460a.this.f108082c == null) {
                    Log.m165387e("initMoreMenu fail when click", (Throwable) new RuntimeException("MailCustomException"), true);
                    return;
                }
                C43187b bVar = C42460a.this.f108082c;
                if (C42460a.this.f108087h.mo153120c() != 0) {
                    z = false;
                }
                bVar.mo154580a(z);
                C42460a.this.f108082c.mo154577a(view, 0);
                C42187a.m168575w();
                if (C42460a.this.f108090k) {
                    C42460a.this.mo152762b();
                }
            }
        };
        this.f108099t = r7;
        this.f108083d.add(r7);
        obtainTypedArray.recycle();
        this.f108093n = m169507u();
        this.f108094o = C43779n.m173508a(C43277a.m171921a().mo154946j()).getBoolean("LarkMailSP_ignore_filter_btn_tip", false);
        this.f108104y = new AbstractC1178x<Boolean>() {
            /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.AnonymousClass12 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                C42460a.this.mo152764c(bool.booleanValue());
            }
        };
        C42493b.m169603a().mo152849b().mo5925a(this.f108104y);
        m169505s();
    }

    /* renamed from: t */
    private void m169506t() {
        String str;
        MailLabelEntity r = C43374f.m172264f().mo155130r();
        String q = C43374f.m172264f().mo155129q();
        FilterType w = C43374f.m172264f().mo155135w();
        if (r != null) {
            str = r.mo151528l();
        } else {
            str = "";
        }
        this.f108089j = str;
        if (!TextUtils.equals(this.f108097r, q) || this.f108098s != w) {
            this.f108097r = q;
            this.f108098s = w;
            if (C42441c.m169465a(r)) {
                if (!this.f108083d.contains(this.f108084e)) {
                    this.f108083d.add(1, this.f108084e);
                }
                this.f108084e.mo152793a(R.drawable.ud_icon_filter_outlined);
                if (w == FilterType.UNREAD) {
                    this.f108081b = null;
                    if (m169508v()) {
                        this.f108084e.mo152794b(UIHelper.getColor(R.color.suite_skin_vi_content_color));
                    } else {
                        this.f108084e.mo152794b(UIHelper.getColor(R.color.primary_pri_500));
                    }
                } else {
                    m169504r();
                    if (m169508v()) {
                        this.f108084e.mo152794b(UIHelper.getColor(R.color.suite_skin_vi_content_color));
                    } else {
                        this.f108084e.mo152794b(UIHelper.getColor(R.color.icon_n1));
                    }
                }
            } else {
                this.f108083d.remove(this.f108084e);
            }
            mo152757a(r);
        }
        mo152768e();
    }

    /* renamed from: a */
    public void mo152755a() {
        View view;
        Log.m165388i("showFilterMenu");
        mo152767d(true);
        try {
            MailMenuComponent cVar = this.f108086g;
            if (!(cVar == null || this.f108085f == null)) {
                ((MailMenuViewModel) cVar.getValue()).show(true);
                View e = this.f108085f.mo99197e();
                this.f108100u.mo99185a(e, e.getHeight(), this.f108086g.mo153034g(), new PopupWindow.OnDismissListener() {
                    /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.AnonymousClass13 */

                    public void onDismiss() {
                        Log.m165388i("onDismiss");
                    }
                });
            }
        } catch (Throwable th) {
            Log.m165386e("error", th);
        }
        C42471a aVar = this.f108084e;
        if (aVar != null) {
            view = aVar.getContentView();
        } else {
            view = null;
        }
        mo152756a(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m169497a(FilterType filterType) {
        m169506t();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m169502b(MailLabelEntity mailLabelEntity) {
        m169506t();
    }

    /* renamed from: a */
    public void mo152758a(AbstractC42473b bVar) {
        this.f108080a = bVar;
    }

    /* renamed from: d */
    public void mo152767d(boolean z) {
        this.f108090k = z;
        mo152768e();
    }

    /* renamed from: a */
    public void mo152759a(C42593a aVar) {
        this.f108087h = aVar;
    }

    /* renamed from: b */
    public void mo152763b(boolean z) {
        this.f108088i = false;
        AbstractC44549f fVar = this.f108085f;
        if (fVar != null) {
            fVar.mo99194b(z);
        }
        m169499a(false, z);
    }

    /* renamed from: a */
    private boolean m169500a(String str) {
        if ("SPAM".equals(str) || "TRASH".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo152764c(boolean z) {
        Log.m165388i("updateLoadingStatus : " + z);
        this.f108091l = z;
        mo152768e();
    }

    public C42460a(Fragment fragment) {
        this.f108101v = fragment;
        m169503q();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m169498a(Boolean bool) {
        Log.m165389i("TitleBarComponent", "account card visible change: " + bool);
        if (mo152765c() && C43345c.m172076m().mo154997c()) {
            mo152766d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m169501b(View view) {
        if (this.f108094o) {
            Log.m165388i("enqueueFilterBtnOnboarding ignore case sp");
            return;
        }
        this.f108094o = true;
        C43779n.m173508a(C43277a.m171921a().mo154946j()).putBoolean("LarkMailSP_ignore_filter_btn_tip", true);
        final C38708a aVar = new C38708a(this.f108101v.getActivity(), new AbstractC38707a() {
            /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.C424666 */

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: a */
            public void mo129837a(String str) {
            }

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: c */
            public void mo129839c(String str) {
            }

            @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
            /* renamed from: b */
            public void mo129838b(String str) {
                if (C42460a.this.f108083d == null || !C42460a.this.f108083d.contains(C42460a.this.f108084e)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    C41816b.m166115a().mo150118H().mo150195a(arrayList);
                }
            }
        }, new TextBubbleConfig(new AnchorConfig(new WeakReference(view), AnchorConfig.AnchorGravity.BOTTOM), new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null), null, C43819s.m173684a((int) R.string.Mail_Label_FilterUnreadOnboarding)));
        C42176e.m168344a().mo152255g(new IGetDataCallback<MailLastVersionNewUserFlagResponse>() {
            /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.C424677 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165388i("enqueueFilterBtnOnboarding ignore case error");
            }

            /* renamed from: a */
            public void onSuccess(MailLastVersionNewUserFlagResponse mailLastVersionNewUserFlagResponse) {
                if (mailLastVersionNewUserFlagResponse == null || mailLastVersionNewUserFlagResponse.new_user_flag.booleanValue()) {
                    Log.m165388i("enqueueFilterBtnOnboarding ignore case new user");
                    return;
                }
                Log.m165388i("enqueueFilterBtnOnboarding old user");
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.C424677.RunnableC424681 */

                    public void run() {
                        C41816b.m166115a().mo150118H().mo150197a("mobile_email_feedfilter", aVar);
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo152756a(View view) {
        Log.m165388i("enqueueFilterBtnOnboarding");
        if (view == null || view.getParent() == null) {
            Log.m165382e("enqueueFilterBtnOnboarding empty view");
        } else {
            C43849u.m173826a(new Runnable(view) {
                /* class com.ss.android.lark.mail.impl.home.p2184d.$$Lambda$a$iCwtr_C2ZAAd_ULESSm9IxysrGY */
                public final /* synthetic */ View f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C42460a.this.m169501b((C42460a) this.f$1);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152757a(MailLabelEntity mailLabelEntity) {
        String str;
        if (mailLabelEntity != null) {
            if (this.f108082c == null) {
                this.f108082c = new C43187b(mo152776m());
            }
            this.f108082c.mo154576a();
            ArrayList arrayList = new ArrayList();
            String k = mailLabelEntity.mo151527k();
            if (m169500a(k)) {
                if (k.equals("SPAM")) {
                    str = mo152776m().getString(R.string.Mail_ThreadList_EmptySpam);
                } else {
                    str = mo152776m().getString(R.string.Mail_ThreadList_EmptyTrash);
                }
                arrayList.add(new C42846c(8, R.drawable.ud_icon_delete_trash_outlined, str));
            } else if (C43374f.m172264f().mo155118c(mailLabelEntity)) {
                arrayList.add(new C42846c(5, R.drawable.ud_icon_mark_read_outlined, mo152776m().getString(R.string.Mail_ThreadList_MarkAllAsRead)));
            }
            if (!"OUTBOX".equals(k) && !"SHARE".equals(k)) {
                arrayList.add(new C42846c(6, R.drawable.ud_icon_select_up_outlined, mo152776m().getString(R.string.Mail_ThreadList_MultipleSelect)));
            }
            arrayList.add(new C42846c(7, R.drawable.ud_icon_setting_outlined, mo152776m().getString(R.string.Mail_ThreadList_MailSettings)));
            if (!this.f108083d.contains(this.f108099t)) {
                this.f108083d.add(this.f108099t);
                mo152768e();
            }
            this.f108082c.mo154579a(arrayList);
            this.f108082c.mo154578a(new C43187b.AbstractC43190a() {
                /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.C424622 */

                @Override // com.ss.android.lark.mail.impl.message.view.C43187b.AbstractC43190a
                /* renamed from: a */
                public void mo152784a(View view, C42846c cVar, int i) {
                    if (C42460a.this.f108080a != null) {
                        int i2 = cVar.f109077a;
                        if (i2 == 5) {
                            C42460a.this.f108082c.mo154581b();
                            C42460a.this.f108080a.mo152800d();
                        } else if (i2 == 6) {
                            C42460a.this.f108082c.mo154581b();
                            C42460a.this.f108080a.mo152799c();
                        } else if (i2 == 7) {
                            C42187a.m168555m("email_settings_click");
                            C42699a.m170261b(C42460a.this.mo152776m());
                        } else if (i2 == 8) {
                            C42460a.this.f108082c.mo154581b();
                            C42460a.this.f108080a.mo152801e();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152761a(boolean z) {
        this.f108088i = true;
        AbstractC44549f fVar = this.f108085f;
        if (fVar != null) {
            fVar.mo99192a(z);
        }
        m169499a(true, z);
    }

    /* renamed from: a */
    private void m169499a(final boolean z, boolean z2) {
        if (z2) {
            if (z) {
                ((AbstractC43344f) Watchers.m167205a(AbstractC43344f.class)).mo152785a();
            } else {
                ((AbstractC43344f) Watchers.m167205a(AbstractC43344f.class)).mo152787c();
            }
            C43849u.m173827a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.home.p2184d.C42460a.AnonymousClass14 */

                public void run() {
                    if (z) {
                        ((AbstractC43344f) Watchers.m167205a(AbstractC43344f.class)).mo152786b();
                    } else {
                        ((AbstractC43344f) Watchers.m167205a(AbstractC43344f.class)).mo152788d();
                    }
                }
            }, 200);
        } else if (z) {
            ((AbstractC43344f) Watchers.m167205a(AbstractC43344f.class)).mo152785a();
            ((AbstractC43344f) Watchers.m167205a(AbstractC43344f.class)).mo152786b();
        } else {
            ((AbstractC43344f) Watchers.m167205a(AbstractC43344f.class)).mo152787c();
            ((AbstractC43344f) Watchers.m167205a(AbstractC43344f.class)).mo152788d();
        }
    }

    /* renamed from: a */
    public void mo152760a(AbstractC44549f fVar, MailMenuComponent cVar, AbstractC44548e eVar) {
        this.f108085f = fVar;
        this.f108086g = cVar;
        this.f108100u = eVar;
        AccountCardComponent aVar = this.f108103x;
        if (aVar != null) {
            aVar.mo152803a(fVar, eVar);
        }
    }
}
