package com.ss.android.lark.widget.photo_picker.gallery;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.palette.widget.ConstraintLayoutPalette;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.p2932c.C58354g;
import com.ss.android.lark.widget.photo_picker.C58596b;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.C58641f;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.C58732b;
import com.ss.android.lark.widget.photo_picker.gallery.callback.IOnCreateView;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnPageSelectListener;
import com.ss.android.lark.widget.photo_picker.gallery.function.BottomFuncPanel;
import com.ss.android.lark.widget.photo_picker.gallery.function.C58751a;
import com.ss.android.lark.widget.photo_picker.gallery.function.C58796b;
import com.ss.android.lark.widget.photo_picker.gallery.function.LookOriginController;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58756a;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58761b;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58764c;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58769e;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58772f;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58775g;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.C58782i;
import com.ss.android.lark.widget.photo_picker.gallery.pageturner.C58822a;
import com.ss.android.lark.widget.photo_picker.gallery.pageturner.PageTurner;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.photo_picker.palette.HoverEventDisallowColour;
import com.ss.android.lark.widget.photo_picker.palette.TouchSlopMonitorColour;
import com.ss.android.lark.widget.photo_picker.service.TranslateImageService;
import com.ss.android.lark.widget.photo_picker.statistics.ImagePreviewHitPoint;
import com.ss.android.lark.widget.photo_picker.utils.PhotoPreviewUtils;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class ImagePagerFragment extends Fragment {

    /* renamed from: A */
    public int f144914A;

    /* renamed from: B */
    private PageTurner f144915B;

    /* renamed from: C */
    private PageTurner f144916C;

    /* renamed from: D */
    private int f144917D = 0;

    /* renamed from: E */
    private int f144918E = 0;

    /* renamed from: F */
    private ImageView f144919F;

    /* renamed from: G */
    private ImageView f144920G;

    /* renamed from: H */
    private ImageView f144921H;

    /* renamed from: I */
    private ImageView f144922I;

    /* renamed from: J */
    private boolean f144923J = false;

    /* renamed from: K */
    private final Handler f144924K = new Handler();

    /* renamed from: L */
    private LookOriginController f144925L;

    /* renamed from: M */
    private boolean f144926M = false;

    /* renamed from: N */
    private boolean f144927N = false;

    /* renamed from: O */
    private boolean f144928O = true;

    /* renamed from: P */
    private boolean f144929P = true;

    /* renamed from: Q */
    private String f144930Q;

    /* renamed from: R */
    private IOnCreateView f144931R;

    /* renamed from: S */
    private boolean f144932S;

    /* renamed from: T */
    private final boolean f144933T = true;

    /* renamed from: U */
    private final boolean f144934U = true;

    /* renamed from: V */
    private int f144935V = -1;

    /* renamed from: W */
    private boolean f144936W = false;

    /* renamed from: X */
    private ViewPager.OnPageChangeListener f144937X;

    /* renamed from: Y */
    private IRequestCreator f144938Y;

    /* renamed from: Z */
    private C58796b f144939Z;

    /* renamed from: a */
    public ArrayList<PhotoItem> f144940a = new ArrayList<>();
    private boolean aa = true;
    private final ArrayList<Photo> ab = new ArrayList<>();
    private Fragment ac;
    private ConstraintLayoutPalette ad;
    private boolean ae = false;
    private final Runnable af = new Runnable() {
        /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.RunnableC586651 */

        public void run() {
            if (ImagePagerFragment.this.f144958s != null && ImagePagerFragment.this.f144959t != null) {
                ImagePagerFragment.this.f144958s.mo199266a();
                ImagePagerFragment.this.f144959t.mo199174b();
                ImagePagerFragment.this.f144961v = false;
            }
        }
    };

    /* renamed from: b */
    public View f144941b;

    /* renamed from: c */
    public FlexibleViewPager f144942c;

    /* renamed from: d */
    public C58732b f144943d;

    /* renamed from: e */
    public BottomFuncPanel f144944e;

    /* renamed from: f */
    public int f144945f = 0;

    /* renamed from: g */
    public int f144946g = 0;

    /* renamed from: h */
    public boolean f144947h = false;

    /* renamed from: i */
    public View f144948i;

    /* renamed from: j */
    public int f144949j = 0;

    /* renamed from: k */
    public boolean f144950k = false;

    /* renamed from: l */
    public boolean f144951l = false;

    /* renamed from: m */
    public boolean f144952m = false;

    /* renamed from: n */
    public OnPageSelectListener f144953n;

    /* renamed from: o */
    public boolean f144954o = false;

    /* renamed from: p */
    public boolean f144955p = false;

    /* renamed from: q */
    public OnDialogMenuClickListener f144956q;

    /* renamed from: r */
    public OnLoadMoreListener f144957r;

    /* renamed from: s */
    public C58822a f144958s;

    /* renamed from: t */
    public C58751a f144959t;

    /* renamed from: u */
    public int f144960u = -1;

    /* renamed from: v */
    public boolean f144961v = false;

    /* renamed from: w */
    public int f144962w = 2;

    /* renamed from: x */
    public OnChatAlbumClickListener f144963x;

    /* renamed from: y */
    public Biz f144964y;

    /* renamed from: z */
    public Scene f144965z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PHOTO_DATA_STRATEGY_DESKTOP {
    }

    /* renamed from: j */
    public ViewPager mo198975j() {
        return this.f144942c;
    }

    /* renamed from: k */
    public ArrayList<PhotoItem> mo198977k() {
        return this.f144940a;
    }

    /* renamed from: a */
    public void mo198949a(IOnCreateView aVar) {
        this.f144931R = aVar;
    }

    /* renamed from: a */
    public void mo198954a(List<PhotoItem> list, int i) {
        Pair<List<PhotoItem>, Integer> b = m227613b(list, i);
        this.f144940a.clear();
        this.f144940a.addAll((Collection) b.first);
        int intValue = ((Integer) b.second).intValue();
        this.f144949j = intValue;
        this.f144960u = intValue;
        if (this.f144943d == null) {
            this.f144943d = new C58732b(getChildFragmentManager(), ImageLoader.with(this), list, this.f144932S ? this.f144949j : -1);
        }
        this.f144943d.mo199132b(this.f144940a);
        if (this.f144951l) {
            TranslateImageService.INSTANCE.detectCanTranslate(list);
        }
        int currentItem = this.f144942c.getCurrentItem();
        if (currentItem < list.size()) {
            this.f144943d.mo199123a(currentItem, list.get(currentItem));
            int currentItem2 = this.f144942c.getCurrentItem();
            int i2 = this.f144960u;
            if (currentItem2 != i2) {
                this.f144942c.setCurrentItem(i2);
                return;
            }
            ViewPager.OnPageChangeListener onPageChangeListener = this.f144937X;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(i2);
            }
        }
    }

    /* renamed from: a */
    public void mo198955a(boolean z) {
        this.f144952m = z;
    }

    /* renamed from: a */
    public void mo198944a(PhotoItem photoItem) {
        C58796b bVar = this.f144939Z;
        if (bVar != null) {
            bVar.mo199226a(photoItem, new IGetDataCallback<List<AbstractC58768d>>() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass20 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ImagePagerFragment.this.mo198963d();
                }

                /* renamed from: a */
                public void onSuccess(List<AbstractC58768d> list) {
                    ImagePagerFragment.this.f144959t.mo199173a(!CollectionUtils.isEmpty(list));
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC58768d dVar : list) {
                        if (dVar.mo199180e()) {
                            arrayList.add(dVar);
                        }
                    }
                    ImagePagerFragment.this.f144944e.mo199165a(arrayList);
                    ImagePagerFragment.this.mo198963d();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo198951a(AbstractC58768d dVar) {
        if (dVar instanceof C58782i) {
            ImagePreviewHitPoint.m228130b("translate", "none");
        } else if (dVar instanceof C58764c) {
            ImagePreviewHitPoint.m228130b("forward", "none");
        } else if (dVar instanceof C58775g) {
            ImagePreviewHitPoint.m228130b("save", "none");
        } else if (dVar instanceof C58756a) {
            ImagePreviewHitPoint.m228130b("download", "none");
        } else if (dVar instanceof C58761b) {
            ImagePreviewHitPoint.m228130b("edit", "none");
        } else if (dVar instanceof C58772f) {
            ImagePreviewHitPoint.m228130b("identify_QR", "none");
        } else if (dVar instanceof C58769e) {
            ImagePreviewHitPoint.m228130b("jump_to_chat", "im_chat_main_view");
        }
    }

    /* renamed from: a */
    public void mo198945a(PhotoItem photoItem, boolean z) {
        m227629v();
        if (photoItem == null || photoItem.isVideo()) {
            m227630w();
        } else {
            m227616b(photoItem, z);
        }
    }

    /* renamed from: a */
    public void mo198952a(final Runnable runnable) {
        if (!getArguments().getBoolean("HAS_ANIM", false) || !this.f144947h) {
            runnable.run();
            return;
        }
        this.f144942c.animate().setDuration(200).setInterpolator(new AccelerateInterpolator()).scaleX(((float) this.f144917D) / ((float) this.f144942c.getWidth())).scaleY(((float) this.f144918E) / ((float) this.f144942c.getHeight())).translationX((float) this.f144946g).translationY((float) this.f144945f).setListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass14 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                runnable.run();
            }
        });
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f144942c.getBackground(), "alpha", 0);
        ofInt.setDuration(200L);
        ofInt.start();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "saturation", 1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    /* renamed from: a */
    public void mo198950a(OnPageSelectListener bVar) {
        this.f144953n = bVar;
    }

    /* renamed from: a */
    public void mo198947a(OnDialogMenuClickListener onDialogMenuClickListener) {
        this.f144956q = onDialogMenuClickListener;
        this.f144943d.mo199127a(onDialogMenuClickListener);
    }

    /* renamed from: a */
    public void mo198948a(OnLoadMoreListener onLoadMoreListener) {
        this.f144957r = onLoadMoreListener;
    }

    /* renamed from: a */
    public void mo198953a(String str) {
        this.f144930Q = str;
    }

    /* renamed from: a */
    public boolean mo198956a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21 || keyCode == 22) {
                FlexibleViewPager flexibleViewPager = this.f144942c;
                if (flexibleViewPager != null) {
                    flexibleViewPager.dispatchKeyEvent(keyEvent);
                    return true;
                }
            } else if (keyCode == 111) {
                getActivity().finish();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo198946a(OnChatAlbumClickListener onChatAlbumClickListener) {
        this.f144963x = onChatAlbumClickListener;
        this.f144943d.mo199126a(onChatAlbumClickListener);
    }

    /* renamed from: o */
    private void m227621o() {
        this.f144919F.setVisibility(8);
    }

    /* renamed from: w */
    private void m227630w() {
        this.f144948i.setVisibility(8);
    }

    /* renamed from: l */
    public int mo198979l() {
        return this.f144942c.getCurrentItem();
    }

    /* renamed from: r */
    private void m227625r() {
        this.f144925L = new LookOriginController(new LookOriginController.IDependency() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.C586715 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.function.LookOriginController.IDependency
            /* renamed from: a */
            public LifecycleOwner mo199000a() {
                return ImagePagerFragment.this.getViewLifecycleOwner();
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.function.LookOriginController.IDependency
            /* renamed from: b */
            public View mo199001b() {
                return ImagePagerFragment.this.f144948i;
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.function.LookOriginController.IDependency
            /* renamed from: d */
            public List<PhotoItem> mo199003d() {
                return ImagePagerFragment.this.f144940a;
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.function.LookOriginController.IDependency
            /* renamed from: c */
            public PhotoItem mo199002c() {
                PhotoItem h = ImagePagerFragment.this.mo198971h();
                if (h == null) {
                    return new PhotoItem();
                }
                return h;
            }
        });
    }

    /* renamed from: u */
    private void m227628u() {
        C586748 r0 = new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.C586748 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                boolean z;
                boolean z2;
                ImagePagerFragment.this.f144960u = i;
                ImagePagerFragment imagePagerFragment = ImagePagerFragment.this;
                boolean z3 = false;
                if (imagePagerFragment.f144949j == i) {
                    z = true;
                } else {
                    z = false;
                }
                imagePagerFragment.f144947h = z;
                PhotoItem photoItem = ImagePagerFragment.this.f144940a.get(i);
                ImagePagerFragment.this.mo198945a(photoItem, true);
                ImagePagerFragment.this.mo198958b(photoItem);
                if (ImagePagerFragment.this.f144953n != null) {
                    ImagePagerFragment.this.f144953n.mo198846a(photoItem);
                }
                if (ImagePagerFragment.this.mo198970g()) {
                    ImagePagerFragment.this.mo198940a(i);
                }
                if (DesktopUtil.m144301a((Context) ImagePagerFragment.this.getActivity())) {
                    C58822a aVar = ImagePagerFragment.this.f144958s;
                    if (i < ImagePagerFragment.this.f144940a.size() - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aVar.mo199272b(z2);
                    C58822a aVar2 = ImagePagerFragment.this.f144958s;
                    if (i > 0) {
                        z3 = true;
                    }
                    aVar2.mo199270a(z3);
                    ImagePagerFragment.this.mo198944a(photoItem);
                }
                Log.m165389i("ImagePagerFragment", "curr show PhotoItem( position = " + i + "url = " + photoItem.getCurrentUrl() + " , imageKey = " + photoItem.getImageKey() + " , isVideo = " + photoItem.isVideo() + ")");
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                ImagePagerFragment.this.f144943d.mo199122a(ImagePagerFragment.this.mo198979l(), f);
            }
        };
        this.f144937X = r0;
        this.f144942c.addOnPageChangeListener(r0);
    }

    /* renamed from: d */
    public void mo198963d() {
        if (!this.f144923J) {
            mo198967f();
            this.f144923J = true;
        }
    }

    /* renamed from: g */
    public boolean mo198970g() {
        if (this.f144957r == null || this.f144962w == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public void mo198981m() {
        this.f144932S = true;
        if (1 != 0) {
            this.f144943d.mo199139f(this.f144949j);
        }
    }

    /* renamed from: n */
    public void mo198982n() {
        this.f144943d.mo199135d(this.f144942c.getCurrentItem());
    }

    /* renamed from: p */
    private void m227623p() {
        this.ad.mo92740a(HoverEventDisallowColour.class);
        ((TouchSlopMonitorColour) this.ad.mo92740a(TouchSlopMonitorColour.class)).mo198686a(new TouchSlopMonitorColour.TouchSlopCallback() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$ImagePagerFragment$FQK0OTz2dVZ8PuLK9BguIFKdwE */

            @Override // com.ss.android.lark.widget.photo_picker.palette.TouchSlopMonitorColour.TouchSlopCallback
            public final void onSlop() {
                ImagePagerFragment.this.m227633z();
            }
        });
    }

    /* renamed from: s */
    private void m227626s() {
        if (!DesktopUtil.m144301a((Context) getActivity())) {
            this.f144958s.mo199273c();
        }
        this.f144958s.mo199269a(new C58822a.AbstractC58827a() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.C586737 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.pageturner.C58822a.AbstractC58827a
            /* renamed from: a */
            public void mo199005a(int i) {
                int i2;
                if (i == 1) {
                    if (ImagePagerFragment.this.mo198979l() + 1 >= ImagePagerFragment.this.mo198977k().size()) {
                        i2 = ImagePagerFragment.this.mo198979l();
                    } else {
                        i2 = ImagePagerFragment.this.mo198979l() + 1;
                    }
                } else if (ImagePagerFragment.this.mo198979l() - 1 < 0) {
                    i2 = ImagePagerFragment.this.mo198979l();
                } else {
                    i2 = ImagePagerFragment.this.mo198979l() - 1;
                }
                ImagePagerFragment.this.f144942c.setCurrentItem(i2, false);
            }
        });
    }

    /* renamed from: t */
    private void m227627t() {
        if (!DesktopUtil.m144301a((Context) getActivity()) || !this.aa) {
            this.f144959t.mo199170a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m227633z() {
        if (this.f144948i.getVisibility() != 0) {
            mo198945a(mo198971h(), false);
        }
    }

    /* renamed from: h */
    public PhotoItem mo198971h() {
        int l = mo198979l();
        if (l < 0 || l >= this.f144940a.size()) {
            return null;
        }
        return this.f144940a.get(l);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LookOriginController cVar = this.f144925L;
        if (cVar != null) {
            cVar.mo199256j();
        }
        C58822a aVar = this.f144958s;
        if (aVar != null) {
            aVar.mo199271b();
        }
        C58796b bVar = this.f144939Z;
        if (bVar != null) {
            bVar.mo199232d();
        }
        super.onDestroy();
        this.f144924K.removeCallbacksAndMessages(null);
    }

    /* renamed from: x */
    private void m227631x() {
        if (!this.f144955p && this.f144957r != null) {
            this.f144955p = true;
            ArrayList<PhotoItem> arrayList = this.f144940a;
            final MessageIdentity messageIdentity = arrayList.get(arrayList.size() - 1).getMessageIdentity();
            if (messageIdentity != null) {
                C57865c.m224574a(new C57865c.AbstractC57873d<List<PhotoItem>>() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.C586759 */

                    /* renamed from: a */
                    public List<PhotoItem> produce() {
                        List<ImageSet> onLoadRight = ImagePagerFragment.this.f144957r.onLoadRight(messageIdentity.getMessageId());
                        if (CollectionUtils.isEmpty(onLoadRight)) {
                            return null;
                        }
                        return C58659h.m227513a(onLoadRight);
                    }
                }, new C57865c.C57875f<ImagePagerFragment, List<PhotoItem>>(this) {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass10 */

                    /* renamed from: a */
                    public void consume(List<PhotoItem> list) {
                        List<PhotoItem> list2;
                        ImagePagerFragment.this.f144955p = false;
                        if (list != null) {
                            if (ImagePagerFragment.this.f144962w == 1) {
                                list2 = ImagePagerFragment.this.mo198938a(list);
                            } else {
                                list2 = new ArrayList(list);
                            }
                            if (ImagePagerFragment.this.f144940a != null) {
                                ImagePagerFragment.this.f144943d.mo199124a(ImagePagerFragment.this.f144943d.getCount(), list2);
                                ImagePagerFragment.this.f144940a.addAll(list2);
                                if (ImagePagerFragment.this.f144951l) {
                                    TranslateImageService.INSTANCE.detectCanTranslate(list2);
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: y */
    private void m227632y() {
        if (!this.f144954o && this.f144957r != null) {
            this.f144954o = true;
            final MessageIdentity messageIdentity = this.f144940a.get(0).getMessageIdentity();
            if (messageIdentity != null) {
                C57865c.m224574a(new C57865c.AbstractC57873d<List<PhotoItem>>() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass12 */

                    /* renamed from: a */
                    public List<PhotoItem> produce() {
                        List<ImageSet> onLoadLeft = ImagePagerFragment.this.f144957r.onLoadLeft(messageIdentity.getMessageId());
                        if (CollectionUtils.isEmpty(onLoadLeft)) {
                            return null;
                        }
                        return C58659h.m227513a(onLoadLeft);
                    }
                }, new C57865c.C57875f<ImagePagerFragment, List<PhotoItem>>(this) {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass13 */

                    /* renamed from: a */
                    public void consume(List<PhotoItem> list) {
                        List<PhotoItem> list2;
                        ImagePagerFragment.this.f144954o = false;
                        if (!CollectionUtils.isEmpty(list)) {
                            if (ImagePagerFragment.this.f144962w == 1) {
                                list2 = ImagePagerFragment.this.mo198938a(list);
                            } else {
                                list2 = new ArrayList(list);
                            }
                            if (ImagePagerFragment.this.f144940a != null) {
                                ImagePagerFragment.this.f144940a.addAll(0, list2);
                                int indexOf = ImagePagerFragment.this.f144940a.indexOf(ImagePagerFragment.this.f144940a.get(ImagePagerFragment.this.f144960u));
                                ImagePagerFragment.this.f144943d.mo199128a((List<PhotoItem>) ImagePagerFragment.this.f144940a);
                                if (indexOf != -1) {
                                    ImagePagerFragment.this.f144942c.setCurrentItem(indexOf);
                                }
                                if (ImagePagerFragment.this.f144951l) {
                                    TranslateImageService.INSTANCE.detectCanTranslate(list2);
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: q */
    private void m227624q() {
        this.f144948i = this.ad.findViewById(R.id.ll_action_menu);
        this.f144919F = (ImageView) this.ad.findViewById(R.id.iv_edit_image);
        this.f144920G = (ImageView) this.ad.findViewById(R.id.iv_download_image);
        this.f144921H = (ImageView) this.ad.findViewById(R.id.iv_view_chat_image);
        this.f144922I = (ImageView) this.ad.findViewById(R.id.iv_more_menu);
        m227625r();
    }

    /* renamed from: v */
    private void m227629v() {
        Log.m165383e("ImagePagerFragment", "menus visibility permission, showEditBtn: " + this.f144926M + ", showSaveBtn: " + this.f144950k + ", mShowViewChatImage: " + this.f144927N + ", showJumpChatBtn: " + this.f144928O + ", showTranslationBtn: " + this.f144951l + ", showForwardItem: " + this.f144952m + ", showQRCodeBtn: " + this.f144929P);
    }

    /* renamed from: c */
    public void mo198961c() {
        boolean z;
        FragmentActivity activity = getActivity();
        C58796b.C58810b.C58811a b = new C58796b.C58810b.C58811a().mo199237a(this.f144950k).mo199239b(this.f144952m);
        if (!this.f144928O || this.f144956q == null) {
            z = false;
        } else {
            z = true;
        }
        C58796b bVar = new C58796b(activity, b.mo199241d(z).mo199242e(this.f144951l).mo199240c(this.f144926M).mo199244g(this.ae).mo199243f(this.f144929P).mo199238a());
        this.f144939Z = bVar;
        bVar.mo199229a(this.f144930Q);
        this.f144939Z.mo199227a(new C58796b.AbstractC58809a() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.AbstractC58809a
            /* renamed from: a */
            public void mo198987a(String str) {
                if (ImagePagerFragment.this.f144956q != null) {
                    ImagePagerFragment.this.f144956q.onJumpToChatClicked(str);
                }
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.AbstractC58809a
            /* renamed from: a */
            public void mo198985a(int i) {
                Fragment b = ImagePagerFragment.this.f144943d.mo199041b(ImagePagerFragment.this.mo198979l());
                if (b instanceof C58734c) {
                    ((C58734c) b).mo199141a(i);
                }
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.AbstractC58809a
            /* renamed from: b */
            public void mo198989b(String str) {
                if (ImagePagerFragment.this.f144956q != null && ImagePagerFragment.this.getActivity() != null) {
                    ImagePagerFragment.this.f144956q.onDecodeQRCodeClicked(str, ImagePagerFragment.this.getActivity());
                }
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.AbstractC58809a
            /* renamed from: a */
            public void mo198986a(PhotoItem photoItem) {
                ImagePagerFragment.this.f144940a.set(ImagePagerFragment.this.mo198979l(), photoItem);
                ImagePagerFragment.this.f144943d.mo199131b(ImagePagerFragment.this.mo198979l(), photoItem);
                ImagePagerFragment.this.mo198945a(photoItem, true);
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.function.C58796b.AbstractC58809a
            /* renamed from: a */
            public void mo198988a(String str, String str2, String str3) {
                C58612c.AbstractC58615c a = C58612c.m227290a();
                Context context = ImagePagerFragment.this.getContext();
                ImagePagerFragment imagePagerFragment = ImagePagerFragment.this;
                a.mo102837a(context, imagePagerFragment, 2, str, str2, imagePagerFragment.f144950k, ImagePagerFragment.this.f144952m, str3);
            }
        });
        this.f144943d.mo199125a((C58732b.AbstractC58733a) new C58732b.AbstractC58733a() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass15 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.C58732b.AbstractC58733a
            /* renamed from: a */
            public void mo197714a(PhotoItem photoItem) {
                ImagePreviewHitPoint.m228128a("press", "public_picbrowser_more_view");
                ImagePagerFragment.this.mo198965e();
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.C58732b.AbstractC58733a
            /* renamed from: a */
            public boolean mo197715a(final PhotoItem photoItem, float f, float f2) {
                return C58354g.m226231a(ImagePagerFragment.this.getActivity(), ImagePagerFragment.this.f144941b, f, f2, new C58354g.AbstractC58373b() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass15.C586661 */

                    @Override // com.ss.android.lark.widget.p2932c.C58354g.AbstractC58373b
                    /* renamed from: a */
                    public File mo197606a() {
                        return C58612c.m227290a().mo102827a(ImageLoader.with(ImagePagerFragment.this.getActivity()), photoItem.getCurrentUrl(), photoItem.getImageKey(), photoItem.getEntityId(), C58659h.m227515a(photoItem), photoItem.getType());
                    }
                });
            }
        });
        mo198945a(mo198971h(), true);
        if (DesktopUtil.m144301a(getContext())) {
            mo198944a(mo198971h());
        }
    }

    /* renamed from: f */
    public void mo198967f() {
        boolean z;
        boolean z2;
        if (DesktopUtil.m144301a(getContext())) {
            this.f144942c.setBackgroundColor(UIHelper.getColor(R.color.lkui_N100));
            if (this.f144960u < this.f144940a.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (this.f144960u > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f144958s.mo199272b(z);
            this.f144958s.mo199270a(z2);
            if (z2) {
                this.f144916C.setVisibility(0);
            }
            if (z) {
                this.f144915B.setVisibility(0);
            }
            if (this.f144944e.getItemSize() > 0) {
                this.f144944e.setVisibility(0);
            }
            this.f144961v = true;
            this.f144924K.removeCallbacks(this.af);
            this.f144924K.postDelayed(this.af, 2000);
            m227610a(this.ad);
        }
    }

    /* renamed from: e */
    public void mo198965e() {
        if (getContext() != null) {
            List<AbstractC58768d> c = this.f144939Z.mo199231c();
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (AbstractC58768d dVar : c) {
                if (dVar.mo199180e()) {
                    linkedHashMap.put(dVar.mo199178c(), dVar);
                }
            }
            if (linkedHashMap.size() != 0) {
                final String[] strArr = (String[]) linkedHashMap.keySet().toArray(new String[0]);
                ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(getContext()).mo90870a(Arrays.asList(strArr))).mo90869a(new UDListDialogController.OnItemClickListener() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.C586693 */

                    @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                    public void onItemClick(int i) {
                        if (i >= 0) {
                            String[] strArr = strArr;
                            if (i < strArr.length) {
                                AbstractC58768d dVar = (AbstractC58768d) linkedHashMap.get(strArr[i]);
                                ImagePagerFragment.this.mo198951a(dVar);
                                if (dVar != null) {
                                    dVar.mo199177a().run();
                                }
                            }
                        }
                    }
                })).addActionButton(R.id.ud_dialog_btn_cancel, UIUtils.getString(getContext(), R.string.Lark_Legacy_Cancel), new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.DialogInterface$OnClickListenerC586682 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })).build().show();
                ImagePreviewHitPoint.m228129b();
            }
        }
    }

    /* renamed from: i */
    public void mo198973i() {
        int i;
        int i2;
        this.f144942c.setPivotX(BitmapDescriptorFactory.HUE_RED);
        this.f144942c.setPivotY(BitmapDescriptorFactory.HUE_RED);
        FlexibleViewPager flexibleViewPager = this.f144942c;
        float f = (float) this.f144917D;
        if (flexibleViewPager.getWidth() > 0) {
            i = this.f144942c.getWidth();
        } else {
            i = DeviceUtils.getScreenWidth(getContext());
        }
        flexibleViewPager.setScaleX(f / ((float) i));
        FlexibleViewPager flexibleViewPager2 = this.f144942c;
        float f2 = (float) this.f144918E;
        if (flexibleViewPager2.getHeight() > 0) {
            i2 = this.f144942c.getHeight();
        } else {
            i2 = DeviceUtils.getScreenHeight(getContext());
        }
        flexibleViewPager2.setScaleY(f2 / ((float) i2));
        this.f144942c.setTranslationX((float) this.f144946g);
        this.f144942c.setTranslationY((float) this.f144945f);
        this.f144942c.animate().setDuration(200).scaleX(1.0f).scaleY(1.0f).translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setInterpolator(new DecelerateInterpolator());
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f144942c.getBackground(), "alpha", 0, 255);
        ofInt.setDuration(200L);
        ofInt.start();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "saturation", BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    /* renamed from: b */
    public boolean mo198960b() {
        return this.f144936W;
    }

    /* renamed from: a */
    public void mo198939a() {
        FlexibleViewPager flexibleViewPager = this.f144942c;
        if (flexibleViewPager != null && flexibleViewPager.getAdapter() != null) {
            ((C58732b) this.f144942c.getAdapter()).mo199121a();
        }
    }

    /* renamed from: a */
    public void mo198941a(Fragment fragment) {
        this.ac = fragment;
    }

    /* renamed from: b */
    public void mo198957b(int i) {
        this.f144914A = i;
    }

    /* renamed from: c */
    public void mo198962c(boolean z) {
        this.f144950k = z;
    }

    /* renamed from: f */
    public void mo198968f(boolean z) {
        this.f144951l = z;
    }

    /* renamed from: g */
    public void mo198969g(boolean z) {
        this.f144929P = z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public void mo198942a(Biz biz) {
        this.f144964y = biz;
    }

    /* renamed from: b */
    public void mo198959b(boolean z) {
        this.f144926M = z;
    }

    /* renamed from: d */
    public void mo198964d(boolean z) {
        this.f144927N = z;
        this.f144943d.mo199140f(z);
    }

    /* renamed from: e */
    public void mo198966e(boolean z) {
        this.f144928O = z;
        this.f144943d.mo199136d(z);
    }

    /* renamed from: h */
    public void mo198972h(boolean z) {
        this.f144943d.mo199138e(z);
    }

    /* renamed from: k */
    public void mo198978k(boolean z) {
        this.f144943d.mo199133b(z);
    }

    /* renamed from: a */
    private void m227610a(View view) {
        view.setOnHoverListener(new View.OnHoverListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.View$OnHoverListenerC586726 */

            public boolean onHover(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                    ImagePagerFragment.this.f144958s.mo199268a(motionEvent, !ImagePagerFragment.this.f144961v);
                    ImagePagerFragment.this.f144959t.mo199172a(motionEvent, !ImagePagerFragment.this.f144961v);
                } else if (motionEvent.getAction() != 10 || ImagePagerFragment.this.f144961v) {
                    return false;
                } else {
                    ImagePagerFragment.this.f144958s.mo199266a();
                    ImagePagerFragment.this.f144959t.mo199174b();
                }
                return false;
            }
        });
    }

    /* renamed from: j */
    public void mo198976j(boolean z) {
        this.ae = z;
        this.f144943d.mo199129a(z);
        m227622o(!z);
    }

    /* renamed from: l */
    public void mo198980l(boolean z) {
        this.f144943d.mo199134c(z);
    }

    /* renamed from: b */
    private static ArrayList<Photo> m227614b(ArrayList<Photo> arrayList) {
        ArrayList<Photo> arrayList2 = new ArrayList<>();
        Iterator<Photo> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new Photo(it.next()));
        }
        return arrayList2;
    }

    /* renamed from: o */
    private void m227622o(boolean z) {
        if (getActivity() != null) {
            Window window = getActivity().getWindow();
            if (z) {
                window.clearFlags(8192);
            } else {
                window.setFlags(8192, 8192);
            }
        }
    }

    /* renamed from: c */
    private void m227617c(PhotoItem photoItem) {
        if (photoItem != null) {
            Iterator<PhotoItem> it = this.f144940a.iterator();
            while (it.hasNext()) {
                it.next().getPhotoState().getShowFile().mo5922a(getViewLifecycleOwner());
            }
            photoItem.getPhotoState().getShowFile().mo5923a(getViewLifecycleOwner(), new AbstractC1178x(photoItem) {
                /* class com.ss.android.lark.widget.photo_picker.gallery.$$Lambda$ImagePagerFragment$YAGkM9lGH873wpnofeEnjyyRHkw */
                public final /* synthetic */ PhotoItem f$1;

                {
                    this.f$1 = r2;
                }

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    ImagePagerFragment.this.m227615b((ImagePagerFragment) this.f$1, (PhotoItem) ((File) obj));
                }
            });
        }
    }

    /* renamed from: d */
    private String m227618d(PhotoItem photoItem) {
        String str = photoItem.getOriginPicInfo().key;
        if (TextUtils.isEmpty(str)) {
            str = photoItem.getCurrentUrl();
        }
        return "photo item: " + str + ", ";
    }

    /* renamed from: n */
    private void m227620n(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (z || this.f144950k || this.f144927N) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.f144952m && !this.f144928O && !this.f144951l && !this.f144929P) {
            z3 = false;
        }
        if (!z2 || !z3) {
            this.f144922I.setVisibility(8);
        } else {
            this.f144922I.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo198958b(PhotoItem photoItem) {
        Fragment fragment = this.ac;
        if (fragment != null) {
            if (fragment instanceof C58596b) {
                ((C58596b) fragment).mo198607a(photoItem);
            }
            Fragment fragment2 = this.ac;
            if (fragment2 instanceof C58641f) {
                ((C58641f) fragment2).mo198838a(photoItem.getPhoto());
            }
        }
    }

    /* renamed from: m */
    private void m227619m(boolean z) {
        int i;
        this.f144925L.mo199247a(z);
        ImageView imageView = this.f144920G;
        int i2 = 0;
        if (this.f144950k) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        this.f144920G.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass16 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ImagePreviewHitPoint.m228128a("download", "none");
                C58756a aVar = new C58756a(ImagePagerFragment.this.getContext(), ImagePagerFragment.this.f144950k, ImagePagerFragment.this.mo198971h(), ImagePagerFragment.this.f144964y, ImagePagerFragment.this.f144965z, ImagePagerFragment.this.f144914A);
                if (aVar.mo199180e()) {
                    aVar.mo199177a().run();
                    ImagePagerFragment imagePagerFragment = ImagePagerFragment.this;
                    imagePagerFragment.mo198945a(imagePagerFragment.mo198971h(), true);
                }
            }
        });
        ImageView imageView2 = this.f144921H;
        if (!this.f144927N || this.f144963x == null) {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
        this.f144921H.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass17 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ImagePreviewHitPoint.m228128a("chat_album", "pubic_chat_album_view");
                if (ImagePagerFragment.this.f144963x != null) {
                    ImagePagerFragment.this.f144963x.onChatAlbumClicked(ImagePagerFragment.this.getContext());
                }
            }
        });
        this.f144922I.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass18 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ImagePreviewHitPoint.m228128a("more", "public_picbrowser_more_view");
                ImagePagerFragment.this.mo198965e();
            }
        });
    }

    /* renamed from: i */
    public void mo198974i(boolean z) {
        int i;
        if (DesktopUtil.m144301a(getContext())) {
            i = getResources().getColor(R.color.lkui_N100);
        } else {
            i = getResources().getColor(R.color.black);
        }
        if (z) {
            this.f144942c.setBackgroundColor(getResources().getColor(R.color.lkui_transparent));
            this.f144941b.setBackgroundColor(i);
            return;
        }
        this.f144942c.setBackgroundColor(i);
        this.f144941b.setBackgroundColor(getResources().getColor(R.color.lkui_transparent));
    }

    /* renamed from: a */
    private void m227612a(ArrayList<Photo> arrayList) {
        this.ab.clear();
        this.ab.addAll(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        C48211b.m190251a().mo168689b("Pager#onCreate");
        ImagePreviewHitPoint.m228127a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f144940a.clear();
            ArrayList<Photo> arrayList = this.ab;
            ArrayList arrayList2 = new ArrayList();
            Iterator<Photo> it = arrayList.iterator();
            while (it.hasNext()) {
                Photo next = it.next();
                PhotoItem paths = new PhotoItem().setPaths(Collections.singletonList(next.getPath()));
                paths.setPhoto(next);
                arrayList2.add(paths);
            }
            Pair<List<PhotoItem>, Integer> b = m227613b(arrayList2, arguments.getInt("ARG_CURRENT_ITEM"));
            this.f144940a = new ArrayList<>((Collection) b.first);
            int intValue = ((Integer) b.second).intValue();
            this.f144949j = intValue;
            this.f144960u = intValue;
            this.f144947h = arguments.getBoolean("HAS_ANIM");
            this.f144945f = arguments.getInt("THUMBNAIL_TOP");
            this.f144946g = arguments.getInt("THUMBNAIL_LEFT");
            this.f144917D = arguments.getInt("THUMBNAIL_WIDTH");
            this.f144918E = arguments.getInt("THUMBNAIL_HEIGHT");
            this.aa = arguments.getBoolean("HAS_BOTTOM_PANEL", true);
        }
        if (this.f144932S) {
            i = this.f144949j;
        } else {
            i = -1;
        }
        this.f144938Y = ImageLoader.with(this);
        this.f144943d = new C58732b(getChildFragmentManager(), ImageLoader.with(this), this.f144940a, i);
        C48211b.m190251a().mo168691c("Pager#onCreate");
    }

    /* renamed from: a */
    public List<PhotoItem> mo198938a(List<PhotoItem> list) {
        if (!DesktopUtil.m144301a(getContext())) {
            return list;
        }
        Iterator<PhotoItem> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isVideo()) {
                it.remove();
            }
        }
        return list;
    }

    /* renamed from: a */
    public void mo198940a(int i) {
        int i2;
        C58732b bVar = this.f144943d;
        if (bVar == null) {
            i2 = 0;
        } else {
            i2 = bVar.getCount();
        }
        if (i2 != 0) {
            int i3 = this.f144935V;
            if (i3 == -1) {
                this.f144935V = i;
                if (i == 0) {
                    m227632y();
                }
                if (i == i2 - 1) {
                    m227631x();
                    return;
                }
                return;
            }
            if (i3 < i) {
                C58612c.m227290a().mo102846a("picbrowser_next_ChatHistory");
                if (i + 3 >= i2) {
                    m227631x();
                }
            } else if (i3 > i) {
                C58612c.m227290a().mo102846a("picbrowser_previous_ChatHistory");
                if (i - 3 <= 0) {
                    m227632y();
                }
            }
            this.f144935V = i;
        }
    }

    /* renamed from: a */
    public void mo198943a(Scene scene) {
        this.f144965z = scene;
    }

    /* renamed from: b */
    private void m227616b(PhotoItem photoItem, boolean z) {
        if (photoItem != null) {
            m227617c(photoItem);
            m227619m(z);
        }
    }

    /* renamed from: a */
    private void m227611a(final PhotoItem photoItem, final File file) {
        this.f144919F.setVisibility(0);
        this.f144919F.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass19 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ImagePreviewHitPoint.m228128a("edit", "public_pic_edit_view");
                C58761b bVar = new C58761b(ImagePagerFragment.this.getContext(), true, photoItem, file, new C58761b.AbstractC58763a() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.AnonymousClass19.C586671 */

                    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.C58761b.AbstractC58763a
                    /* renamed from: a */
                    public void mo198996a(String str, String str2) {
                        C58612c.m227290a().mo102837a(ImagePagerFragment.this.getContext(), ImagePagerFragment.this, 2, str, str2, ImagePagerFragment.this.f144950k, ImagePagerFragment.this.f144952m, C58659h.m227519c(photoItem));
                    }
                });
                if (bVar.mo199180e()) {
                    bVar.mo199177a().run();
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.ac instanceof C58596b) {
            mo198958b(this.f144940a.get(this.f144949j));
        }
        mo198975j().setOverScrollMode(2);
    }

    /* renamed from: a */
    public static ImagePagerFragment m227608a(ArrayList<Photo> arrayList, int i) {
        ImagePagerFragment imagePagerFragment = new ImagePagerFragment();
        Bundle bundle = new Bundle();
        imagePagerFragment.m227612a(m227614b(arrayList));
        bundle.putInt("ARG_CURRENT_ITEM", i);
        bundle.putBoolean("HAS_ANIM", false);
        bundle.putBoolean("HAS_BOTTOM_PANEL", false);
        imagePagerFragment.setArguments(bundle);
        return imagePagerFragment;
    }

    /* renamed from: b */
    private Pair<List<PhotoItem>, Integer> m227613b(List<PhotoItem> list, int i) {
        if (!DesktopUtil.m144301a(getContext())) {
            this.f144962w = 2;
            return new Pair<>(list, Integer.valueOf(i));
        } else if (i < 0) {
            return new Pair<>(list, Integer.valueOf(i));
        } else {
            PhotoItem photoItem = list.get(i);
            List<PhotoItem> arrayList = new ArrayList<>();
            if (photoItem != null) {
                if (photoItem.isVideo()) {
                    arrayList.clear();
                    arrayList.add(photoItem);
                    this.f144962w = 0;
                    i = 0;
                } else {
                    arrayList = mo198938a(list);
                    if (arrayList.indexOf(photoItem) == -1) {
                        i = 0;
                    } else {
                        i = arrayList.indexOf(photoItem);
                    }
                    this.f144962w = 1;
                }
            }
            return new Pair<>(arrayList, Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m227615b(PhotoItem photoItem, File file) {
        boolean z;
        C58796b bVar = this.f144939Z;
        if (bVar != null) {
            bVar.mo199225a(photoItem);
        }
        if (!this.f144950k || !this.f144926M) {
            z = false;
        } else {
            z = true;
        }
        if (PhotoPreviewUtils.m227507a(photoItem, file, z)) {
            Log.m165389i("ImagePagerFragment", m227618d(photoItem) + "file is valid, show edit action");
            m227620n(true);
            m227611a(photoItem, file);
            return;
        }
        Log.m165383e("ImagePagerFragment", m227618d(photoItem) + "file is null or invalid, hide edit action");
        m227620n(false);
        m227621o();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2 && getActivity() != null) {
            getActivity().setRequestedOrientation(-1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ad = (ConstraintLayoutPalette) layoutInflater.inflate(R.layout.__picker_picker_fragment_image_pager, viewGroup, false);
        m227623p();
        this.f144941b = this.ad.findViewById(R.id.layout_container);
        m227624q();
        this.f144942c = (FlexibleViewPager) this.ad.findViewById(R.id.vp_photos);
        this.f144916C = (PageTurner) this.ad.findViewById(R.id.back);
        this.f144915B = (PageTurner) this.ad.findViewById(R.id.next);
        this.f144944e = (BottomFuncPanel) this.ad.findViewById(R.id.bottom_panel);
        this.f144958s = new C58822a(getContext(), this.f144916C, this.f144915B, this.f144941b);
        m227626s();
        this.f144959t = new C58751a(getContext(), this.f144944e);
        m227627t();
        this.f144942c.setPageMargin(UIUtils.dp2px(getActivity(), 10.0f));
        this.f144942c.setAdapter(this.f144943d);
        this.f144942c.setCurrentItem(this.f144949j);
        this.f144942c.setOffscreenPageLimit(1);
        if (bundle == null && this.f144947h) {
            this.f144942c.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment.ViewTreeObserver$OnPreDrawListenerC586704 */

                public boolean onPreDraw() {
                    ImagePagerFragment.this.f144942c.getViewTreeObserver().removeOnPreDrawListener(this);
                    int[] iArr = new int[2];
                    ImagePagerFragment.this.f144942c.getLocationOnScreen(iArr);
                    ImagePagerFragment.this.f144946g -= iArr[0];
                    ImagePagerFragment.this.f144945f -= iArr[1];
                    if (!DesktopUtil.m144301a(ImagePagerFragment.this.getContext())) {
                        ImagePagerFragment.this.mo198973i();
                    }
                    return true;
                }
            });
        }
        m227628u();
        if (!this.aa && DesktopUtil.m144301a(getContext())) {
            mo198963d();
        }
        IOnCreateView aVar = this.f144931R;
        if (aVar != null) {
            aVar.mo198481a();
        }
        this.f144936W = true;
        return this.ad;
    }

    /* renamed from: a */
    public static ImagePagerFragment m227609a(List<Photo> list, int i, int[] iArr, int i2, int i3) {
        ImagePagerFragment a = m227608a((ArrayList<Photo>) new ArrayList(list), i);
        a.getArguments().putInt("THUMBNAIL_LEFT", iArr[0]);
        a.getArguments().putInt("THUMBNAIL_TOP", iArr[1]);
        a.getArguments().putInt("THUMBNAIL_WIDTH", i2);
        a.getArguments().putInt("THUMBNAIL_HEIGHT", i3);
        a.getArguments().putBoolean("HAS_ANIM", true);
        return a;
    }
}
