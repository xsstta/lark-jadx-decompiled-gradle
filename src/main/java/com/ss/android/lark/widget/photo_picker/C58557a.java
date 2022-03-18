package com.ss.android.lark.widget.photo_picker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.widget.photo_picker.a */
public class C58557a {

    /* renamed from: com.ss.android.lark.widget.photo_picker.a$a */
    public static class C58559a {

        /* renamed from: a */
        public final Bundle f144560a;

        /* renamed from: b */
        private String f144561b;

        /* renamed from: c */
        private PickerParams f144562c;

        /* renamed from: a */
        public void mo198511a(final Activity activity, final C57805b.AbstractC57809a aVar) {
            C57805b.m224331b(activity, new C57805b.AbstractC57809a() {
                /* class com.ss.android.lark.widget.photo_picker.C58557a.C58559a.C585612 */

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public void permissionGranted(boolean z) {
                    if (!z) {
                        return;
                    }
                    if (C58559a.this.f144560a.getInt("ONLY_CAMERA_TYPE", 0) > 1) {
                        C57805b.m224326a(activity, aVar);
                    } else {
                        aVar.permissionGranted(true);
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo198512a(Context context, Fragment fragment, int i) {
            m227132a(this.f144560a);
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                C57805b.m224333d(activity, new C57805b.AbstractC57809a(activity, context, fragment, i) {
                    /* class com.ss.android.lark.widget.photo_picker.$$Lambda$a$a$iSlLqgk1y6jOj6jXyujNtHIV4 */
                    public final /* synthetic */ FragmentActivity f$1;
                    public final /* synthetic */ Context f$2;
                    public final /* synthetic */ Fragment f$3;
                    public final /* synthetic */ int f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                    public final void permissionGranted(boolean z) {
                        C58557a.C58559a.this.m227133a(this.f$1, this.f$2, this.f$3, this.f$4, z);
                    }
                });
            }
        }

        public C58559a() {
            this.f144560a = new Bundle();
        }

        /* renamed from: a */
        public C58559a mo198507a(String str) {
            this.f144561b = str;
            return this;
        }

        /* renamed from: b */
        public C58559a mo198513b(int i) {
            this.f144560a.putInt("TOTAL_MAX_COUNT", i);
            return this;
        }

        /* renamed from: c */
        public C58559a mo198516c(int i) {
            this.f144560a.putInt("column", i);
            return this;
        }

        /* renamed from: d */
        public C58559a mo198518d(int i) {
            this.f144560a.putInt("MAX_DURATION", i);
            return this;
        }

        /* renamed from: e */
        public C58559a mo198520e(int i) {
            this.f144560a.putInt("ONLY_CAMERA_TYPE", i);
            return this;
        }

        /* renamed from: f */
        public C58559a mo198522f(int i) {
            this.f144560a.putInt("ACTION_TYPE", i);
            return this;
        }

        /* renamed from: g */
        public C58559a mo198524g(boolean z) {
            this.f144560a.putBoolean("SHOW_GIF", z);
            return this;
        }

        /* renamed from: h */
        public C58559a mo198525h(boolean z) {
            this.f144560a.putBoolean("SHOW_VIDEO", z);
            return this;
        }

        /* renamed from: i */
        public C58559a mo198526i(boolean z) {
            this.f144560a.putBoolean("SHOW_CAMERA", z);
            return this;
        }

        /* renamed from: j */
        public C58559a mo198527j(boolean z) {
            this.f144560a.putBoolean("extra_use_new_photo_picker", z);
            return this;
        }

        /* renamed from: k */
        public C58559a mo198528k(boolean z) {
            this.f144560a.putBoolean("keep_origin", z);
            return this;
        }

        /* renamed from: l */
        public C58559a mo198529l(boolean z) {
            this.f144560a.putBoolean("PREVIEW_ENABLED", z);
            return this;
        }

        /* renamed from: m */
        public C58559a mo198530m(boolean z) {
            this.f144560a.putBoolean("FULL_SCREEN", z);
            return this;
        }

        /* renamed from: n */
        public C58559a mo198531n(boolean z) {
            this.f144560a.putBoolean("SHOW_ORIGIN", z);
            return this;
        }

        /* renamed from: o */
        public C58559a mo198532o(boolean z) {
            this.f144560a.putBoolean("IS_SEND", z);
            return this;
        }

        /* renamed from: p */
        public C58559a mo198533p(boolean z) {
            this.f144560a.putBoolean("receive_cancel_event", z);
            return this;
        }

        /* renamed from: q */
        public C58559a mo198534q(boolean z) {
            this.f144560a.putBoolean("stand_alone_window", z);
            return this;
        }

        /* renamed from: a */
        private Intent m227129a(Context context) {
            Intent intent = new Intent();
            intent.setClass(context, PhotoPickerActivity.class);
            intent.putExtras(this.f144560a);
            return intent;
        }

        /* renamed from: b */
        public C58559a mo198514b(boolean z) {
            this.f144560a.putBoolean("USE_LARK_CAMERA", z);
            return this;
        }

        /* renamed from: c */
        public C58559a mo198517c(boolean z) {
            this.f144560a.putBoolean("ensure_selection", z);
            return this;
        }

        /* renamed from: d */
        public C58559a mo198519d(boolean z) {
            this.f144560a.putBoolean("TOTAL_HAS_VIDEO", z);
            return this;
        }

        /* renamed from: e */
        public C58559a mo198521e(boolean z) {
            this.f144560a.putBoolean("SINGLE_SHOW_SELECTOR", z);
            return this;
        }

        /* renamed from: f */
        public C58559a mo198523f(boolean z) {
            this.f144560a.putBoolean("TOAST_TOTAL_MAX_COUNT", z);
            return this;
        }

        private C58559a(PickerParams gVar) {
            this();
            this.f144562c = gVar;
            this.f144560a.putBoolean("extra_use_new_photo_picker", true);
        }

        /* renamed from: a */
        public C58559a mo198506a(int i) {
            this.f144560a.putInt("MAX_COUNT", i);
            return this;
        }

        /* renamed from: a */
        private void m227132a(Bundle bundle) {
            boolean z;
            boolean z2;
            PickerParams gVar = this.f144562c;
            if (gVar == null) {
                this.f144562c = PickerParams.m227538a(new Function1(bundle) {
                    /* class com.ss.android.lark.widget.photo_picker.$$Lambda$a$a$k8fpbojOg8KSLcCkyQkSSgHl_h8 */
                    public final /* synthetic */ Bundle f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C58557a.C58559a.m227130a(this.f$0, (PickerParams.Builder) obj);
                    }
                });
            } else {
                mo198506a(gVar.mo198866c());
                mo198513b(this.f144562c.mo198867d());
                mo198519d(this.f144562c.mo198868e());
                mo198521e(this.f144562c.mo198869f());
                mo198523f(this.f144562c.mo198870g());
                if (this.f144562c.mo198863a() == 1) {
                    if (this.f144562c.mo198865b() >= 1) {
                        mo198520e(2);
                    } else {
                        mo198520e(1);
                    }
                }
                boolean z3 = false;
                if (this.f144562c.mo198863a() >= 1) {
                    z = true;
                } else {
                    z = false;
                }
                mo198526i(z);
                mo198518d(this.f144562c.mo198871h());
                mo198514b(this.f144562c.mo198873j());
                if (this.f144562c.mo198865b() >= 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mo198525h(z2);
                mo198522f(this.f144562c.mo198880q());
                if (this.f144562c.mo198872i() == 1) {
                    z3 = true;
                }
                mo198509a(z3);
                mo198516c(this.f144562c.mo198878o());
                mo198528k(this.f144562c.mo198876m());
                mo198529l(this.f144562c.mo198877n());
                mo198508a(this.f144562c.mo198881r());
                mo198531n(this.f144562c.mo198875l());
                mo198524g(!this.f144562c.mo198874k());
            }
            this.f144562c.mo198864a(bundle);
        }

        /* renamed from: a */
        public C58559a mo198508a(ArrayList<Photo> arrayList) {
            this.f144560a.putSerializable("ORIGINAL_PHOTOS", arrayList);
            return this;
        }

        /* renamed from: a */
        public C58559a mo198509a(boolean z) {
            this.f144560a.putBoolean("FACE_FRONT", z);
            return this;
        }

        /* renamed from: b */
        public void mo198515b(Activity activity, int i) {
            if (!DesktopUtil.m144301a((Context) activity)) {
                activity.startActivityForResult(m227129a(activity), i);
            } else {
                m227136c(activity, null, i);
            }
        }

        /* renamed from: a */
        private void m227134a(C36516a aVar, int i) {
            C58596b bVar = new C58596b();
            bVar.setArguments(this.f144560a);
            FloatWindowParams.C36567a aVar2 = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2);
            if (!TextUtils.isEmpty(this.f144561b)) {
                aVar2.mo134945a(this.f144561b);
            }
            FloatWindowParams a = aVar2.mo134930b();
            bVar.setFragmentParams(a);
            C36512a.m144041a().mo134760a(aVar, bVar, a, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ Unit m227130a(Bundle bundle, PickerParams.Builder aVar) {
            int i = bundle.getInt("MAX_COUNT", 9);
            int i2 = bundle.getInt("TOTAL_MAX_COUNT", -1);
            boolean z = bundle.getBoolean("TOTAL_HAS_VIDEO", false);
            boolean z2 = bundle.getBoolean("SINGLE_SHOW_SELECTOR", false);
            boolean z3 = bundle.getBoolean("TOAST_TOTAL_MAX_COUNT", false);
            int i3 = bundle.getInt("ONLY_CAMERA_TYPE", 0);
            boolean z4 = bundle.getBoolean("USE_LARK_CAMERA", true);
            boolean z5 = bundle.getBoolean("SHOW_CAMERA", true);
            boolean z6 = bundle.getBoolean("SHOW_VIDEO", false);
            int i4 = bundle.getInt("ONLY_CAMERA_TYPE", 0);
            int i5 = bundle.getInt("ACTION_TYPE", 1);
            boolean z7 = bundle.getBoolean("FACE_FRONT", false);
            int i6 = bundle.getInt("column", 4);
            boolean z8 = bundle.getBoolean("keep_origin");
            boolean z9 = bundle.getBoolean("PREVIEW_ENABLED");
            ArrayList<Photo> arrayList = (ArrayList) bundle.getSerializable("SELECTED_PHOTOS");
            boolean z10 = bundle.getBoolean("SHOW_ORIGIN", false);
            boolean z11 = bundle.getBoolean("SHOW_GIF", true);
            aVar.mo198893c(i);
            aVar.mo198896d(i2);
            aVar.mo198888a(z);
            aVar.mo198891b(z2);
            aVar.mo198894c(z3);
            if (i3 == 1) {
                aVar.mo198884a(1);
                aVar.mo198890b(0);
            } else if (i3 == 2) {
                aVar.mo198884a(1);
                aVar.mo198890b(2);
            } else {
                if (z5) {
                    aVar.mo198884a(2);
                } else {
                    aVar.mo198884a(0);
                }
                if (z6) {
                    aVar.mo198890b(2);
                } else {
                    aVar.mo198890b(0);
                }
            }
            aVar.mo198908h(i5);
            aVar.mo198901f(z7 ? 1 : 0);
            aVar.mo198898e(i4);
            aVar.mo198897d(z4);
            aVar.mo198904g(i6);
            aVar.mo198905g(z8);
            aVar.mo198909h(z9);
            aVar.mo198887a(arrayList);
            aVar.mo198902f(z10);
            aVar.mo198899e(!z11);
            return null;
        }

        /* renamed from: a */
        public void mo198510a(final Activity activity, final int i) {
            m227132a(this.f144560a);
            C57805b.m224333d(activity, new C57805b.AbstractC57809a() {
                /* class com.ss.android.lark.widget.photo_picker.C58557a.C58559a.C585601 */

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public void permissionGranted(boolean z) {
                    if (!z) {
                        return;
                    }
                    if (C58559a.this.f144560a.getInt("ONLY_CAMERA_TYPE", 0) > 0) {
                        C58559a aVar = C58559a.this;
                        Activity activity = activity;
                        aVar.mo198511a(activity, new C57805b.AbstractC57809a(activity, i) {
                            /* class com.ss.android.lark.widget.photo_picker.$$Lambda$a$a$1$gJLRISrqq1wi8dMkmR9HBiuIWqQ */
                            public final /* synthetic */ Activity f$1;
                            public final /* synthetic */ int f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                            public final void permissionGranted(boolean z) {
                                C58557a.C58559a.C585601.this.m227166a(this.f$1, this.f$2, z);
                            }
                        });
                        return;
                    }
                    C58559a.this.mo198515b(activity, i);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m227166a(Activity activity, int i, boolean z) {
                    if (z) {
                        C58559a.this.mo198515b(activity, i);
                    }
                }
            });
        }

        /* renamed from: b */
        private void m227135b(Context context, Fragment fragment, int i) {
            if (!DesktopUtil.m144301a(context)) {
                fragment.startActivityForResult(m227129a(context), i);
            } else if (this.f144560a.getBoolean("stand_alone_window", false)) {
                m227136c(context, fragment, i);
            } else if (fragment instanceof C36516a) {
                m227134a((C36516a) fragment, i);
            } else {
                m227136c(context, fragment, i);
            }
        }

        /* renamed from: c */
        private void m227136c(Context context, Fragment fragment, int i) {
            Intent a = m227129a(context);
            a.setFlags(402653184);
            C36512a.m144041a().mo134755a((Activity) context, fragment, new StandAloneParam.C36572a(a, DesktopConstants.UIType.WINDOW_NORMAL_D1).mo134969c(i).mo134967a());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m227131a(Context context, Fragment fragment, int i, boolean z) {
            if (z) {
                m227135b(context, fragment, i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m227133a(FragmentActivity fragmentActivity, Context context, Fragment fragment, int i, boolean z) {
            if (!z) {
                return;
            }
            if (this.f144560a.getInt("ONLY_CAMERA_TYPE", 0) > 0) {
                mo198511a(fragmentActivity, new C57805b.AbstractC57809a(context, fragment, i) {
                    /* class com.ss.android.lark.widget.photo_picker.$$Lambda$a$a$4dRTnkrQi42I_0vDygYcVxrPJew */
                    public final /* synthetic */ Context f$1;
                    public final /* synthetic */ Fragment f$2;
                    public final /* synthetic */ int f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                    public final void permissionGranted(boolean z) {
                        C58557a.C58559a.this.m227131a(this.f$1, this.f$2, this.f$3, z);
                    }
                });
            } else {
                m227135b(context, fragment, i);
            }
        }
    }

    /* renamed from: a */
    public static C58559a m227127a() {
        return new C58559a();
    }

    /* renamed from: a */
    public static C58559a m227128a(PickerParams gVar) {
        return new C58559a(gVar);
    }
}
