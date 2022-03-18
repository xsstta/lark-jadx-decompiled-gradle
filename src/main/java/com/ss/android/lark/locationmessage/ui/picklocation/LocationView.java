package com.ss.android.lark.locationmessage.ui.picklocation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.location.dto.LocationImageData;
import com.ss.android.lark.location.dto.POIConfig;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.location.p2146b.AbstractC41569h;
import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.locationmessage.p2149b.AbstractC41591b;
import com.ss.android.lark.locationmessage.p2149b.AbstractView$OnClickListenerC41590a;
import com.ss.android.lark.locationmessage.p2149b.C41592c;
import com.ss.android.lark.locationmessage.p2149b.C41594e;
import com.ss.android.lark.locationmessage.p2149b.C41596g;
import com.ss.android.lark.locationmessage.statistics.LocationHitPoint;
import com.ss.android.lark.locationmessage.ui.picklocation.C41663a;
import com.ss.android.lark.locationmessage.ui.picklocation.C41665b;
import com.ss.android.lark.locationmessage.widget.LoadingView;
import com.ss.android.lark.locationmessage.widget.SearchBar;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.C57805b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LocationView extends C41663a implements C41665b.AbstractC41667b {

    /* renamed from: b */
    protected Activity f105782b;

    /* renamed from: c */
    protected boolean f105783c;

    /* renamed from: d */
    public boolean f105784d;

    /* renamed from: e */
    protected boolean f105785e;

    /* renamed from: f */
    public POIConfig f105786f;

    /* renamed from: g */
    protected C41665b.AbstractC41667b.AbstractC41668a f105787g;

    /* renamed from: h */
    protected C41669c f105788h;

    /* renamed from: i */
    public C41669c f105789i;

    /* renamed from: j */
    public AbstractC41569h f105790j;

    /* renamed from: k */
    protected boolean f105791k = true;

    /* renamed from: l */
    public AbstractC41569h.AbstractC41571b f105792l = new AbstractC41569h.AbstractC41571b() {
        /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass12 */

        @Override // com.ss.android.lark.location.p2146b.AbstractC41569h.AbstractC41571b
        /* renamed from: a */
        public void mo149595a() {
            LocationView.this.mo149802b();
        }

        @Override // com.ss.android.lark.location.p2146b.AbstractC41569h.AbstractC41571b
        /* renamed from: b */
        public void mo149596b() {
            LocationView.this.mNearbyLoading.mo149871b(R.string.Lark_Chat_MapsSearchNoresults);
            LocationView.this.mo149806e();
        }
    };

    /* renamed from: m */
    private String f105793m;
    @BindView(6496)
    AppBarLayout mAppBarLayout;
    @BindView(7135)
    LinearLayout mContainerLayout;
    @BindView(6843)
    RelativeLayout mContentLayout;
    @BindView(7101)
    ImageView mIvLocatePosition;
    @BindView(6962)
    ImageView mIvLocationIcon;
    @BindView(7096)
    FrameLayout mMapContainerLayout;
    @BindView(7124)
    ListView mNearByListView;
    @BindView(7108)
    LoadingView mNearbyLoading;
    @BindView(7103)
    LinearLayout mRecommendEmptyView;
    @BindView(7097)
    FrameLayout mRecommendLayout;
    @BindView(7102)
    View mRecommendLineView;
    @BindView(7125)
    ListView mRecommendListView;
    @BindView(7110)
    LoadingView mRecommendLoading;
    @BindView(7434)
    SearchBar mSearchBar;
    @BindView(7111)
    CommonTitleBar mTitleBar;

    /* renamed from: n */
    private AbstractC41658a f105794n = new AbstractC41658a() {
        /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.C416461 */

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41658a
        /* renamed from: a */
        public void mo149809a(POIInfo pOIInfo) {
            Log.m165389i("LocationView", "onRegeocodeSearched called.");
            LocationView.this.f105791k = true;
            LocationView.this.mNearByListView.setVisibility(0);
            LocationView.this.mNearbyLoading.setVisibility(8);
            if (pOIInfo == null) {
                LocationView.this.mSearchBar.setEditTextEnabled(true);
                return;
            }
            LocationView.this.f105788h.mo149846a(0, pOIInfo);
            LocationView.this.mo149793a(0);
            LocationView.this.mSearchBar.setEditTextEnabled(true);
        }
    };

    /* renamed from: o */
    private TextWatcher f105795o = new TextWatcher() {
        /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass14 */

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(final Editable editable) {
            LocationView.this.mRecommendLayout.setVisibility(0);
            LocationView.this.mRecommendLineView.setVisibility(0);
            LocationView.this.mContentLayout.setVisibility(8);
            if (TextUtils.isEmpty(editable)) {
                LocationView.this.f105789i.mo149849a(LocationView.this.f105787g.mo149835a(LocationView.this.f105782b, !LocationView.this.f105786f.isSelfDefine()));
                return;
            }
            if (LocationView.this.f105786f.isSelfDefine()) {
                LocationView.this.f105789i.mo149848a(editable.toString());
            }
            LocationView.this.mRecommendListView.setVisibility(8);
            LocationView.this.mRecommendLoading.mo149869a(R.string.Lark_Legacy_LoadingTip);
            LocationView.this.f105787g.mo149843a(LocationView.this.f105782b, editable.toString(), new AbstractC41660c() {
                /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass14.C416481 */

                @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41660c
                /* renamed from: a */
                public void mo149815a(int i) {
                    LocationView.this.mRecommendListView.setVisibility(0);
                    LocationView.this.mRecommendLoading.setVisibility(8);
                    List<POIInfo> a = LocationView.this.f105787g.mo149835a(LocationView.this.f105782b, !LocationView.this.f105786f.isSelfDefine());
                    if (!TextUtils.isEmpty(editable) && LocationView.this.f105786f.isSelfDefine()) {
                        a.add(0, new POIInfo(editable.toString(), LocationView.this.f105782b.getString(R.string.Lark_Chat_MapsSearchCustomLocation), 360.0d, 360.0d, false, true));
                    }
                    if (a != null && a.size() >= 0) {
                        LocationView.this.f105789i.mo149849a(a);
                    }
                }

                @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41660c
                /* renamed from: a */
                public void mo149816a(List<POIInfo> list) {
                    LocationView.this.mRecommendListView.setVisibility(0);
                    LocationView.this.mRecommendLoading.setVisibility(8);
                    if (list != null && list.size() > 0) {
                        if (LocationView.this.f105786f.isSelfDefine()) {
                            list.add(0, new POIInfo(editable.toString(), LocationView.this.f105782b.getString(R.string.Lark_Chat_MapsSearchCustomLocation), 360.0d, 360.0d, false, true));
                        }
                        LocationView.this.f105789i.mo149849a(list);
                    } else if (LocationView.this.f105786f.isSelfDefine()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(0, new POIInfo(editable.toString(), LocationView.this.f105782b.getString(R.string.Lark_Chat_MapsSearchCustomLocation), 360.0d, 360.0d, false, true));
                        LocationView.this.f105789i.mo149849a(arrayList);
                    }
                }
            });
        }
    };

    /* renamed from: p */
    private AbstractC41659b f105796p = new AbstractC41659b() {
        /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass15 */

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41659b
        /* renamed from: a */
        public void mo149817a() {
            if (C41597c.m165069a().mo143909b()) {
                LocationHitPoint.m165169c();
            }
            LKUIToast.show(LocationView.this.f105782b, UIUtils.getString(LocationView.this.f105782b, R.string.Lark_Chat_MessageLocationMapGoogleUnavailable));
        }

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41659b
        /* renamed from: a */
        public void mo149818a(double d, double d2) {
            LocationView.this.f105787g.mo149836a(d, d2);
            LocationView.this.f105790j.mo149582a(d, d2);
            LocationView.this.f105790j.mo149583a(d, d2, LocationView.this.f105792l);
            if (!C41597c.m165069a().mo143909b() && !C41597c.m165069a().mo143916i().mo143931b(d, d2)) {
                LocationHitPoint.m165170d();
            }
        }
    };

    /* renamed from: q */
    private ValueAnimator f105797q;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.LocationView$a */
    public interface AbstractC41658a {
        /* renamed from: a */
        void mo149809a(POIInfo pOIInfo);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.LocationView$b */
    public interface AbstractC41659b {
        /* renamed from: a */
        void mo149817a();

        /* renamed from: a */
        void mo149818a(double d, double d2);
    }

    /* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.LocationView$c */
    public interface AbstractC41660c {
        /* renamed from: a */
        void mo149815a(int i);

        /* renamed from: a */
        void mo149816a(List<POIInfo> list);
    }

    /* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.LocationView$d */
    public static abstract class AbstractC41661d implements AbstractC41660c {
        @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41660c
        /* renamed from: a */
        public void mo149815a(int i) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.LocationView$e */
    public interface AbstractC41662e {
        /* renamed from: a */
        void mo149810a();

        /* renamed from: a */
        void mo149811a(LocationImageData locationImageData);
    }

    /* renamed from: i */
    private void m165257i() {
        m165260l();
        m165259k();
        m165258j();
    }

    /* renamed from: m */
    private void m165261m() {
        Activity activity = this.f105782b;
        if (activity != null && !activity.isFinishing()) {
            this.f105782b.finish();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        AbstractC41569h hVar = this.f105790j;
        if (hVar != null) {
            hVar.mo149568e();
        }
    }

    /* renamed from: f */
    public void mo149807f() {
        AbstractC41569h hVar = this.f105790j;
        if (hVar != null) {
            hVar.mo149567d();
        }
    }

    /* renamed from: g */
    public void mo149808g() {
        AbstractC41569h hVar = this.f105790j;
        if (hVar != null) {
            hVar.mo149566c();
        }
    }

    /* renamed from: h */
    private void m165256h() {
        C41669c cVar = new C41669c(this.f105782b, new ArrayList());
        this.f105788h = cVar;
        this.mNearByListView.setAdapter((ListAdapter) cVar);
        this.f105789i = new C41669c(this.f105782b, new ArrayList());
        this.mRecommendListView.setEmptyView(this.mRecommendEmptyView);
        this.mRecommendListView.setAdapter((ListAdapter) this.f105789i);
        this.f105787g.mo149841a(this.f105782b, this.f105796p);
    }

    /* renamed from: l */
    private void m165260l() {
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.addAction(new AbstractC41591b(this.f105793m, R.color.location_position_send_disable_color) {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.C416579 */

            @Override // com.ss.android.lark.locationmessage.p2149b.AbstractC41591b
            /* renamed from: a */
            public void mo149708a(View view) {
                POIInfo pOIInfo;
                KeyboardUtils.hideKeyboard(LocationView.this.f105782b);
                if (LocationView.this.f105788h != null) {
                    pOIInfo = LocationView.this.f105788h.mo149850b();
                } else {
                    pOIInfo = null;
                }
                if (pOIInfo != null) {
                    pOIInfo.setVendor(LocationView.this.f105790j.mo149587b());
                    pOIInfo.setZoomLevel(LocationView.this.f105790j.mo149588f());
                    if (LocationView.this.f105786f.isSnapshot()) {
                        LocationView.this.mo149803b(pOIInfo);
                    } else {
                        LocationView.this.f105826a.mo149827a(pOIInfo);
                    }
                }
            }
        });
        this.mTitleBar.getRightText().setClickable(false);
        this.mTitleBar.setDividerVisible(false);
        this.mTitleBar.setLeftClickListener(new AbstractView$OnClickListenerC41590a() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass10 */

            @Override // com.ss.android.lark.locationmessage.p2149b.AbstractView$OnClickListenerC41590a
            /* renamed from: a */
            public void mo149706a(View view) {
                LocationView.this.mo149801a();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo149802b() {
        mo149806e();
        this.mNearByListView.setVisibility(8);
        this.mNearbyLoading.mo149869a(R.string.Lark_Legacy_LoadingTip);
        this.f105788h.mo149853d();
        this.f105787g.mo149836a(this.f105790j.mo149589g(), this.f105790j.mo149590h());
        this.f105791k = false;
        this.f105787g.mo149842a(this.f105782b, new AbstractC41661d() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass16 */

            @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41661d, com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41660c
            /* renamed from: a */
            public void mo149815a(int i) {
                Log.m165389i("LocationView", "queryLocation onSearchResultError called. errorCode:" + i);
                LocationView.this.mNearbyLoading.mo149871b(R.string.Lark_Chat_MapsSearchNoresults);
                LocationView.this.f105791k = true;
                LocationView.this.mo149806e();
                LocationView.this.mo149804c();
            }

            @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41660c
            /* renamed from: a */
            public void mo149816a(List<POIInfo> list) {
                Log.m165389i("LocationView", "queryLocation onSearchResultSuccess called.");
                UserSP.getInstance().putString("result_type", "default");
                if (list == null || list.size() <= 0) {
                    LocationView.this.mNearbyLoading.mo149871b(R.string.Lark_Chat_MapsSearchNoresults);
                } else {
                    LocationView.this.mNearByListView.setVisibility(0);
                    LocationView.this.mNearbyLoading.setVisibility(8);
                    LocationView.this.mo149798a(list.get(0), false, false);
                    LocationView.this.f105788h.mo149849a(list);
                    C41592c.m165056a(LocationView.this.mNearByListView);
                    LocationView.this.mNearByListView.setSelection(0);
                    LocationView.this.mo149806e();
                }
                LocationView.this.mo149804c();
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC41569h b = C41597c.m165069a().mo143916i().mo143930b();
        this.f105790j = b;
        if (b == null) {
            m165261m();
            return;
        }
        this.f105826a.mo149826a(this);
        String actionText = this.f105786f.getActionText();
        this.f105793m = actionText;
        if (TextUtils.isEmpty(actionText)) {
            this.f105793m = this.f105782b.getString(R.string.Lark_Legacy_Send);
        }
        m165257i();
        m165256h();
    }

    /* renamed from: e */
    public void mo149806e() {
        if (this.f105788h.mo149852c()) {
            this.mTitleBar.setRightText(0, this.f105793m, ContextCompat.getColor(this.f105782b, R.color.primary_pri_500));
            this.mTitleBar.getRightText().setClickable(true);
            return;
        }
        this.mTitleBar.setRightText(0, this.f105793m, ContextCompat.getColor(this.f105782b, R.color.location_position_send_disable_color));
        this.mTitleBar.getRightText().setClickable(false);
    }

    /* renamed from: j */
    private void m165258j() {
        this.mSearchBar.mo149873a(this.f105795o);
        this.mSearchBar.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass17 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    LocationView.this.mRecommendLayout.setVisibility(0);
                    LocationView.this.mRecommendListView.setVisibility(0);
                    LocationView.this.mRecommendLineView.setVisibility(0);
                    LocationView.this.mContentLayout.setVisibility(8);
                    LocationView.this.f105784d = true;
                    LocationView.this.mTitleBar.setRightVisible(false);
                    LocationView.this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
                    LocationView.this.f105789i.mo149849a(LocationView.this.f105787g.mo149835a(LocationView.this.f105782b, true ^ LocationView.this.f105786f.isSelfDefine()));
                    LocationHitPoint.m165166a();
                    return;
                }
                LocationView.this.mRecommendLayout.setVisibility(8);
                LocationView.this.mRecommendListView.setVisibility(8);
                LocationView.this.mContentLayout.setVisibility(0);
                LocationView.this.mRecommendLineView.setVisibility(8);
                LocationView.this.f105784d = true;
                LocationView.this.mTitleBar.setRightVisible(true);
            }
        });
        this.mNearByListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass18 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                UserSP.getInstance().putString("result_type", "list");
                POIInfo a = LocationView.this.f105788h.mo149844a(i);
                if (a != null && !TextUtils.isEmpty(a.getLocationName())) {
                    LocationView.this.mIvLocatePosition.setImageDrawable(LocationView.this.f105782b.getDrawable(R.drawable.location_navigate_position_selector));
                    LocationView.this.mo149798a(a, !a.getIsSelfDefine(), false);
                    LocationView.this.mo149793a(i);
                }
            }
        });
        this.mRecommendListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass19 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                UserSP.getInstance().putString("result_type", "search");
                KeyboardUtils.hideKeyboard(LocationView.this.f105782b);
                LocationView.this.f105784d = false;
                LocationView.this.mRecommendListView.setVisibility(8);
                LocationView.this.mContentLayout.setVisibility(0);
                LocationView.this.mTitleBar.setRightVisible(true);
                LocationView.this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
                LocationView.this.mo149800a("");
                POIInfo a = LocationView.this.f105789i.mo149844a(i);
                if (a != null) {
                    LocationView.this.f105787g.mo149839a(LocationView.this.f105782b, a, new AbstractC41562e.AbstractC41564b() {
                        /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass19.C416491 */

                        @Override // com.ss.android.lark.location.p2146b.AbstractC41562e.AbstractC41564b
                        /* renamed from: a */
                        public void mo149562a(POIInfo pOIInfo) {
                            if (!TextUtils.isEmpty(pOIInfo.getLocationName())) {
                                LocationView.this.mo149798a(pOIInfo, !pOIInfo.getIsSelfDefine(), false);
                                LocationView.this.mo149796a(pOIInfo);
                            }
                        }
                    });
                    LocationHitPoint.m165168b();
                }
            }
        });
        this.mIvLocatePosition.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass20 */

            public void onClick(View view) {
                LocationView.this.f105785e = true;
                LocationView.this.mIvLocatePosition.setImageDrawable(LocationView.this.f105782b.getDrawable(R.drawable.location_ic_locate_position_clicked));
                LocationView.this.f105787g.mo149836a(LocationView.this.f105790j.mo149591i(), LocationView.this.f105790j.mo149592j());
                LocationView.this.f105790j.mo149583a(LocationView.this.f105790j.mo149591i(), LocationView.this.f105790j.mo149592j(), LocationView.this.f105792l);
                LocationView.this.mTitleBar.setRightVisible(true);
                LocationView.this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
            }
        });
        this.f105790j.mo149581a();
        this.f105790j.mo149584a(new AbstractC41569h.AbstractC41570a() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.C416502 */

            @Override // com.ss.android.lark.location.p2146b.AbstractC41569h.AbstractC41570a
            /* renamed from: a */
            public void mo149594a(double d, double d2) {
                LocationView.this.f105787g.mo149836a(d, d2);
                if (LocationView.this.f105783c) {
                    if (LocationView.this.f105791k) {
                        LocationView.this.mo149802b();
                    }
                    if (C41597c.m165069a().mo143909b()) {
                        LocationView.this.mo149805d();
                    } else {
                        LocationView.this.f105790j.mo149593k();
                    }
                }
            }
        });
        this.f105790j.mo149586a(new AbstractC41569h.AbstractC41573d() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.C416513 */

            @Override // com.ss.android.lark.location.p2146b.AbstractC41569h.AbstractC41573d
            /* renamed from: b */
            public void mo149600b() {
                LocationView.this.f105783c = true;
            }

            @Override // com.ss.android.lark.location.p2146b.AbstractC41569h.AbstractC41573d
            /* renamed from: a */
            public void mo149599a() {
                if (C41597c.m165069a().mo143909b()) {
                    LocationView.this.f105788h.mo149845a();
                    LocationView.this.f105788h.notifyDataSetChanged();
                    LocationView.this.mo149806e();
                }
                LocationView.this.mIvLocatePosition.setImageDrawable(LocationView.this.f105782b.getDrawable(R.drawable.location_navigate_position_selector));
            }
        });
        if (C41597c.m165069a().mo143909b()) {
            AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
            behavior.setDragCallback(new AppBarLayout.Behavior.DragCallback() {
                /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.C416524 */

                @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
                public boolean canDrag(AppBarLayout appBarLayout) {
                    return false;
                }
            });
            ((CoordinatorLayout.LayoutParams) this.mAppBarLayout.getLayoutParams()).setBehavior(behavior);
        }
    }

    /* renamed from: c */
    public void mo149804c() {
        if (39.908823d == this.f105790j.mo149589g() && 116.39747d == this.f105790j.mo149590h()) {
            Log.m165389i("LocationView", "getFromLocation called. default latLng.");
            this.mSearchBar.setEditTextEnabled(true);
            return;
        }
        mo149806e();
        this.mNearByListView.setVisibility(8);
        this.mNearbyLoading.mo149869a(R.string.Lark_Legacy_LoadingTip);
        this.f105787g.mo149837a(this.f105782b, this.f105790j.mo149589g(), this.f105790j.mo149590h(), this.f105794n);
    }

    /* renamed from: d */
    public void mo149805d() {
        ValueAnimator valueAnimator = this.f105797q;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mIvLocationIcon, "translationY", 0.0f, (float) (-UIUtils.dp2px(this.f105782b, 16.0f)), 0.0f);
            this.f105797q = ofFloat;
            ofFloat.setDuration(500L);
            this.f105797q.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f105797q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.C416535 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LocationView.this.mIvLocationIcon.invalidate();
                }
            });
            this.f105797q.start();
        }
    }

    /* renamed from: k */
    private void m165259k() {
        int i;
        this.mSearchBar.setStyle(R.style.LocationMsgAppendViewEditText);
        this.mSearchBar.setHint(R.string.Lark_Chat_MapsSearchInputLocation);
        this.mSearchBar.setEditTextImeOptions(6);
        this.mSearchBar.setEditTextEnabled(false);
        ImageView imageView = this.mIvLocationIcon;
        if (C41597c.m165069a().mo143909b()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.mContainerLayout.addView(this.f105790j.mo149580a(this.f105782b, (Bundle) null), layoutParams);
        if (!C41594e.m165060a(this.f105782b)) {
            new C25639g(this.f105782b).mo89248g(R.string.Lark_Chat_MessageLocationPermissionBanTitle).mo89242c(C41596g.m165066a(this.f105782b, R.string.Lark_Chat_MessageLocationSystemPermissionBanContentAndroid)).mo89246d(false).mo89247e(false).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Chat_MessageLocationPermissionBanCancelButton, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.DialogInterface$OnClickListenerC416568 */

                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Chat_MessageLocationPermissionBanSettingButton, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.DialogInterface$OnClickListenerC416557 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                    intent.addFlags(1073741824);
                    intent.addFlags(8388608);
                    LocationView.this.f105782b.startActivityForResult(intent, 0);
                }
            }).mo89239c();
        }
    }

    @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41667b
    /* renamed from: a */
    public boolean mo149801a() {
        Activity activity = this.f105782b;
        if (activity == null) {
            return false;
        }
        KeyboardUtils.hideKeyboard(activity);
        if (this.f105784d) {
            this.mSearchBar.clearFocus();
            this.mTitleBar.setRightVisible(true);
            this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
            this.mRecommendListView.setVisibility(8);
            this.mContentLayout.setVisibility(0);
            this.f105784d = false;
            return true;
        }
        this.f105782b.finish();
        return true;
    }

    /* renamed from: a */
    public void setViewDelegate(C41665b.AbstractC41667b.AbstractC41668a aVar) {
        this.f105787g = aVar;
    }

    /* renamed from: b */
    public void mo149803b(final POIInfo pOIInfo) {
        C57805b.m224333d(this.f105782b, new C57805b.AbstractC57809a() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass11 */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public void permissionGranted(boolean z) {
                if (z) {
                    LocationView.this.f105790j.mo149585a(new AbstractC41569h.AbstractC41572c() {
                        /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass11.C416471 */

                        @Override // com.ss.android.lark.location.p2146b.AbstractC41569h.AbstractC41572c
                        /* renamed from: a */
                        public void mo149597a() {
                            LocationView.this.mIvLocationIcon.setVisibility(8);
                        }

                        @Override // com.ss.android.lark.location.p2146b.AbstractC41569h.AbstractC41572c
                        /* renamed from: a */
                        public void mo149598a(Bitmap bitmap) {
                            LocationView.this.mo149797a(pOIInfo, bitmap);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void mo149795a(Bundle bundle) {
        AbstractC41569h hVar = this.f105790j;
        if (hVar != null) {
            hVar.mo149565a(bundle);
        }
    }

    /* renamed from: a */
    public void mo149793a(int i) {
        this.f105788h.mo149845a();
        this.f105788h.mo149844a(i).setIsCurrent(true);
        this.mNearByListView.setSelection(i);
        this.f105788h.notifyDataSetChanged();
        C41592c.m165056a(this.mNearByListView);
        mo149806e();
    }

    /* renamed from: a */
    public void mo149796a(final POIInfo pOIInfo) {
        mo149806e();
        this.mNearByListView.setVisibility(8);
        this.mNearbyLoading.mo149869a(R.string.Lark_Legacy_LoadingTip);
        this.f105788h.mo149853d();
        this.f105787g.mo149842a(this.f105782b, new AbstractC41661d() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.C416546 */

            @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41661d, com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41660c
            /* renamed from: a */
            public void mo149815a(int i) {
                super.mo149815a(i);
                LocationView.this.mNearByListView.setVisibility(0);
                LocationView.this.mNearbyLoading.setVisibility(8);
                pOIInfo.setIsCurrent(true);
                LocationView.this.f105788h.mo149847a(pOIInfo);
                C41592c.m165056a(LocationView.this.mNearByListView);
                LocationView.this.mo149806e();
            }

            @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41660c
            /* renamed from: a */
            public void mo149816a(List<POIInfo> list) {
                pOIInfo.setIsCurrent(true);
                LocationView.this.mNearByListView.setVisibility(0);
                LocationView.this.mNearbyLoading.setVisibility(8);
                if (list == null || list.size() <= 0) {
                    LocationView.this.f105788h.mo149847a(pOIInfo);
                } else {
                    LocationView.this.f105788h.mo149851b(LocationView.this.mo149792a(list, pOIInfo));
                }
                C41592c.m165056a(LocationView.this.mNearByListView);
                LocationView.this.mo149806e();
            }
        });
    }

    /* renamed from: a */
    public void mo149800a(String str) {
        this.mSearchBar.mo149874b(this.f105795o);
        this.mSearchBar.setText(str);
        this.mSearchBar.setSelection(str.length());
        this.mSearchBar.mo149873a(this.f105795o);
    }

    /* renamed from: a */
    public List<POIInfo> mo149792a(List<POIInfo> list, POIInfo pOIInfo) {
        if (pOIInfo == null) {
            return list;
        }
        CopyOnWriteArrayList<POIInfo> copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        for (POIInfo pOIInfo2 : copyOnWriteArrayList) {
            if (TextUtils.equals(pOIInfo2.getLocationName(), pOIInfo.getLocationName()) && TextUtils.equals(pOIInfo2.getLocationAddress(), pOIInfo.getLocationAddress())) {
                copyOnWriteArrayList.remove(pOIInfo2);
            }
        }
        copyOnWriteArrayList.add(0, pOIInfo);
        return copyOnWriteArrayList;
    }

    /* renamed from: a */
    public void mo149797a(final POIInfo pOIInfo, Bitmap bitmap) {
        this.f105787g.mo149838a(this.f105782b, bitmap, new AbstractC41662e() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AnonymousClass13 */

            @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41662e
            /* renamed from: a */
            public void mo149810a() {
                LKUIToast.show(LocationView.this.f105782b, (int) R.string.Lark_Chat_MessageLocationSendFailed);
            }

            @Override // com.ss.android.lark.locationmessage.ui.picklocation.LocationView.AbstractC41662e
            /* renamed from: a */
            public void mo149811a(LocationImageData locationImageData) {
                if (locationImageData == null) {
                    LKUIToast.show(LocationView.this.f105782b, (int) R.string.Lark_Chat_MessageLocationSendFailed);
                    return;
                }
                pOIInfo.setLocationImageData(locationImageData);
                LocationView.this.f105826a.mo149827a(pOIInfo);
            }
        });
    }

    /* renamed from: a */
    public void mo149794a(int i, int i2, Intent intent) {
        if (i == 0) {
            this.f105787g.mo149841a(this.f105782b, this.f105796p);
        }
    }

    public LocationView(Activity activity, C41663a.AbstractC41664a aVar, POIConfig pOIConfig) {
        this.f105782b = activity;
        this.f105826a = aVar;
        this.f105786f = pOIConfig;
    }

    /* renamed from: a */
    public void mo149798a(POIInfo pOIInfo, boolean z, boolean z2) {
        this.f105787g.mo149836a(pOIInfo.getLatitude(), pOIInfo.getLongitude());
        this.f105783c = false;
        if (z) {
            this.f105790j.mo149583a(pOIInfo.getLatitude(), pOIInfo.getLongitude(), null);
        }
        if (z2) {
            mo149800a(pOIInfo.getLocationName());
        }
        this.f105787g.mo149840a(this.f105782b, pOIInfo, !this.f105786f.isSelfDefine());
        this.mSearchBar.clearFocus();
    }
}
