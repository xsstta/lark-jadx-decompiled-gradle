package com.ss.android.lark.locationmessage.ui.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.location.p2146b.AbstractC41561d;
import com.ss.android.lark.locationmessage.C41587a;
import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.locationmessage.p2149b.AbstractView$OnClickListenerC41590a;
import com.ss.android.lark.locationmessage.p2149b.C41594e;
import com.ss.android.lark.locationmessage.p2149b.C41595f;
import com.ss.android.lark.locationmessage.statistics.LocationHitPoint;
import com.ss.android.lark.locationmessage.statistics.NavigateHitPoint;
import com.ss.android.lark.locationmessage.ui.navigation.AbstractC41632a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.C58333b;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.ArrayList;
import java.util.List;

public class NavigateView implements AbstractC41632a.AbstractC41634b {

    /* renamed from: a */
    protected Activity f105736a;

    /* renamed from: b */
    protected AbstractC41631b f105737b;

    /* renamed from: c */
    public Message f105738c;

    /* renamed from: d */
    protected LocationInfo f105739d;

    /* renamed from: e */
    public String f105740e;

    /* renamed from: f */
    protected double f105741f;

    /* renamed from: g */
    protected double f105742g;

    /* renamed from: h */
    public AbstractC41561d f105743h;

    /* renamed from: i */
    private final ViewGroup f105744i;

    /* renamed from: j */
    private AbstractC41632a.AbstractC41634b.AbstractC41635a f105745j;

    /* renamed from: k */
    private final String[] f105746k = new String[3];

    /* renamed from: l */
    private final AbstractC41630a f105747l = new AbstractC41630a() {
        /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.C416211 */

        @Override // com.ss.android.lark.locationmessage.ui.navigation.NavigateView.AbstractC41630a
        /* renamed from: a */
        public void mo149753a() {
            if (C41597c.m165069a().mo143909b()) {
                LocationHitPoint.m165169c();
            }
            LKUIToast.show(NavigateView.this.f105736a, UIUtils.getString(NavigateView.this.f105736a, R.string.Lark_Chat_MessageLocationMapGoogleUnavailable));
        }

        @Override // com.ss.android.lark.locationmessage.ui.navigation.NavigateView.AbstractC41630a
        /* renamed from: a */
        public void mo149754a(double d, double d2) {
            NavigateView.this.f105741f = d;
            NavigateView.this.f105742g = d2;
            NavigateView.this.f105743h.mo149551a(C41595f.m165064a(NavigateView.this.f105739d.getLatitude()), C41595f.m165064a(NavigateView.this.f105739d.getLongitude()));
            NavigateView.this.f105743h.mo149552b(d, d2);
            if (C41594e.m165061a(NavigateView.this.f105739d, NavigateView.this.f105741f, NavigateView.this.f105742g)) {
                NavigateView.this.mIvLocatePosition.setImageResource(R.drawable.location_ic_locate_position_clicked);
            } else {
                NavigateView.this.mIvLocatePosition.setImageResource(R.drawable.location_navigate_position_selector);
            }
            if (!C41597c.m165069a().mo143909b() && !C41597c.m165069a().mo143916i().mo143931b(d, d2)) {
                LocationHitPoint.m165170d();
            }
        }
    };
    @BindView(7106)
    View mBottomLayout;
    @BindView(7104)
    LinearLayout mContainerLayout;
    @BindView(7169)
    ImageView mIvBack;
    @BindView(7100)
    ImageView mIvGoToNavigate;
    @BindView(7101)
    ImageView mIvLocatePosition;
    @BindView(7170)
    ImageView mIvMore;
    @BindView(7113)
    TextView mTvNavigateDesc;
    @BindView(7114)
    TextView mTvNavigateTitle;
    @BindView(7171)
    View mViewTitleBar;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.locationmessage.ui.navigation.NavigateView$a */
    public interface AbstractC41630a {
        /* renamed from: a */
        void mo149753a();

        /* renamed from: a */
        void mo149754a(double d, double d2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.locationmessage.ui.navigation.NavigateView$b */
    public interface AbstractC41631b {
        /* renamed from: a */
        String mo149760a();

        /* renamed from: a */
        void mo149761a(NavigateView navigateView);

        /* renamed from: b */
        void mo149762b();
    }

    /* renamed from: k */
    private void m165197k() {
        Activity activity = this.f105736a;
        if (activity != null && !activity.isFinishing()) {
            this.f105736a.finish();
        }
    }

    /* renamed from: a */
    public void mo149746a() {
        AbstractC41561d dVar = this.f105743h;
        if (dVar != null) {
            dVar.mo149567d();
        }
    }

    /* renamed from: b */
    public void mo149749b() {
        AbstractC41561d dVar = this.f105743h;
        if (dVar != null) {
            dVar.mo149566c();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        AbstractC41561d dVar = this.f105743h;
        if (dVar != null) {
            dVar.mo149568e();
        }
    }

    /* renamed from: d */
    public void mo149751d() {
        NavigateHitPoint.m165175b();
        if (this.f105738c == null) {
            LKUIToast.show(this.f105736a, (int) R.string.Lark_Legacy_FailedToForward);
        } else {
            C41597c.m165069a().mo143915h().mo143926a(this.f105736a, this.f105738c);
        }
    }

    /* renamed from: f */
    private void m165192f() {
        int i = 8;
        if (this.f105739d.isHideTitleBar()) {
            this.mViewTitleBar.setVisibility(8);
            this.mIvGoToNavigate.setVisibility(8);
        } else {
            this.mViewTitleBar.setVisibility(0);
            this.mIvGoToNavigate.setVisibility(0);
        }
        View view = this.mBottomLayout;
        if (!this.f105739d.isNameAndDescEmpty()) {
            i = 0;
        }
        view.setVisibility(i);
        m165195i();
        m165194h();
        m165196j();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        if (this.f105737b == null) {
            m165197k();
        } else if (!m165193g()) {
            m165197k();
        } else {
            AbstractC41561d a = C41597c.m165069a().mo143916i().mo143927a();
            this.f105743h = a;
            if (a == null) {
                m165197k();
                return;
            }
            this.f105737b.mo149761a(this);
            m165192f();
            this.f105745j.mo149764a(this.f105736a, this.f105747l);
        }
    }

    /* renamed from: g */
    private boolean m165193g() {
        String str;
        LocationInfo locationInfo = this.f105739d;
        if (locationInfo == null) {
            return false;
        }
        this.f105738c = locationInfo.getMessage();
        this.f105740e = this.f105737b.mo149760a();
        this.f105746k[0] = this.f105736a.getString(R.string.Lark_Legacy_Forward);
        String[] strArr = this.f105746k;
        if (this.f105740e == null) {
            str = this.f105736a.getString(R.string.Lark_Legacy_SaveToFavorite);
        } else {
            str = this.f105736a.getString(R.string.Lark_Legacy_Remove);
        }
        strArr[1] = str;
        this.f105746k[2] = this.f105736a.getString(R.string.Lark_Legacy_Cancel);
        return true;
    }

    /* renamed from: h */
    private void m165194h() {
        String str;
        if (TextUtils.isEmpty(this.f105739d.getName())) {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Chat_MessageReplyStatusLocation, "title", "");
        } else {
            str = this.f105739d.getName();
        }
        this.mTvNavigateTitle.setText(str);
        String desc = this.f105739d.getDesc();
        if (TextUtils.isEmpty(desc)) {
            this.mTvNavigateDesc.setVisibility(8);
            return;
        }
        this.mTvNavigateDesc.setVisibility(0);
        this.mTvNavigateDesc.setText(desc);
    }

    /* renamed from: i */
    private void m165195i() {
        Context a = C41597c.m165069a().mo143908a();
        POIInfo pOIInfo = new POIInfo();
        pOIInfo.setLatitude(C41595f.m165064a(this.f105739d.getLatitude()));
        pOIInfo.setLongitude(C41595f.m165064a(this.f105739d.getLongitude()));
        pOIInfo.setLocationName(this.f105739d.getName());
        pOIInfo.setLocationAddress(this.f105739d.getDesc());
        pOIInfo.setZoomLevel(this.f105739d.getZoomLevel());
        this.mContainerLayout.addView(this.f105743h.mo149549a(a, null, pOIInfo), new LinearLayout.LayoutParams(-1, -1));
    }

    /* renamed from: j */
    private void m165196j() {
        this.mIvBack.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.View$OnClickListenerC416255 */

            public void onClick(View view) {
                NavigateView.this.f105737b.mo149762b();
            }
        });
        if (!this.f105739d.isSecretChat()) {
            this.mIvMore.setVisibility(0);
            this.mIvMore.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.View$OnClickListenerC416266 */

                public void onClick(View view) {
                    NavigateView.this.mo149750c();
                }
            });
        } else {
            this.mIvMore.setVisibility(8);
        }
        this.mIvLocatePosition.setOnClickListener(new AbstractView$OnClickListenerC41590a() {
            /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.C416277 */

            @Override // com.ss.android.lark.locationmessage.p2149b.AbstractView$OnClickListenerC41590a
            /* renamed from: a */
            public void mo149706a(View view) {
                if (NavigateView.this.f105741f != 0.0d || NavigateView.this.f105742g != 0.0d) {
                    if (C41594e.m165061a(NavigateView.this.f105739d, NavigateView.this.f105741f, NavigateView.this.f105742g)) {
                        NavigateView.this.mIvLocatePosition.setImageResource(R.drawable.location_ic_locate_position_clicked);
                    } else {
                        NavigateView.this.mIvLocatePosition.setImageResource(R.drawable.location_navigate_position_selector);
                    }
                    NavigateView.this.f105743h.mo149551a(NavigateView.this.f105741f, NavigateView.this.f105742g);
                }
            }
        });
        this.mIvGoToNavigate.setOnClickListener(new AbstractView$OnClickListenerC41590a() {
            /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.C416288 */

            @Override // com.ss.android.lark.locationmessage.p2149b.AbstractView$OnClickListenerC41590a
            /* renamed from: a */
            public void mo149706a(View view) {
                NavigateHitPoint.m165172a();
                C41587a.m165045a(NavigateView.this.f105736a, NavigateView.this.f105739d);
            }
        });
        this.f105743h.mo149550a();
    }

    /* renamed from: c */
    public void mo149750c() {
        if (!DesktopUtil.m144301a((Context) this.f105736a)) {
            ((C25644o) ((C25644o) ((C25644o) new C25644o(this.f105736a).mo89206a(this.f105746k)).mo89210d(R.layout.location_dialog_navigate_menu_item)).mo89202a(new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.DialogInterface$OnClickListenerC416299 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (i == 0) {
                        NavigateView.this.mo149751d();
                    } else if (i == 1) {
                        NavigateView.this.mo149752e();
                    }
                }
            })).mo89239c();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, new C58339d.C58341a(this.f105746k[0], new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                NavigateView.this.mo149751d();
            }
        }));
        arrayList.add(1, new C58339d.C58341a(this.f105746k[1], new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                NavigateView.this.mo149752e();
            }
        }));
        C58333b.m226183a(this.f105736a, this.mIvMore, arrayList);
    }

    /* renamed from: e */
    public void mo149752e() {
        String str = this.f105740e;
        if (str == null) {
            NavigateHitPoint.m165177c();
            Message message = this.f105738c;
            if (message == null || TextUtils.isEmpty(message.getId())) {
                LKUIToast.show(this.f105736a, (int) R.string.Lark_Legacy_SaveBoxSaveFail);
                return;
            }
            C41597c.m165069a().mo143914g().mo143924a(new ArrayList<String>() {
                /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.AnonymousClass12 */

                {
                    add(NavigateView.this.f105738c.getId());
                }
            }, new UIGetDataCallback(new IGetDataCallback<List<FavoriteMessageInfo>>() {
                /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.C416222 */

                /* renamed from: a */
                public void onSuccess(List<FavoriteMessageInfo> list) {
                    LKUIToast.show(NavigateView.this.f105736a, (int) R.string.Lark_Legacy_ChatViewFavorites);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    LKUIToast.show(NavigateView.this.f105736a, (int) R.string.Lark_Legacy_SaveBoxSaveFail);
                }
            }));
        } else if (str == null) {
            LKUIToast.show(this.f105736a, (int) R.string.Lark_Legacy_RemoveFailed);
        } else {
            C41597c.m165069a().mo143914g().mo143925b(new ArrayList<String>() {
                /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.C416233 */

                {
                    add(NavigateView.this.f105740e);
                }
            }, new UIGetDataCallback(new IGetDataCallback<List<FavoriteMessageInfo>>() {
                /* class com.ss.android.lark.locationmessage.ui.navigation.NavigateView.C416244 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    LKUIToast.show(NavigateView.this.f105736a, (int) R.string.Lark_Legacy_RemoveFailed);
                }

                /* renamed from: a */
                public void onSuccess(List<FavoriteMessageInfo> list) {
                    LKUIToast.show(NavigateView.this.f105736a, (int) R.string.Lark_Legacy_RemovedSuccessfully);
                    Intent intent = new Intent();
                    intent.putExtra("params_favorites", NavigateView.this.f105740e);
                    NavigateView.this.f105736a.setResult(-1, intent);
                    NavigateView.this.f105736a.finish();
                }
            }));
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC41632a.AbstractC41634b.AbstractC41635a aVar) {
        this.f105745j = aVar;
    }

    /* renamed from: a */
    public void mo149747a(Bundle bundle) {
        AbstractC41561d dVar = this.f105743h;
        if (dVar != null) {
            dVar.mo149565a(bundle);
        }
    }

    public NavigateView(Activity activity, View view, AbstractC41631b bVar, LocationInfo locationInfo) {
        this.f105736a = activity;
        this.f105744i = (ViewGroup) view;
        this.f105737b = bVar;
        this.f105739d = locationInfo;
    }
}
