package com.tt.miniapp.p3301m;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.address.AddressInfo;
import com.tt.miniapp.component.nativeview.game.RoundedImageView;
import com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b;
import com.tt.miniapp.component.nativeview.picker.wheel.C65939a;
import com.tt.miniapp.component.nativeview.picker.wheel.C65949b;
import com.tt.miniapp.component.nativeview.picker.wheel.C65953c;
import com.tt.miniapp.component.nativeview.picker.wheel.C65957d;
import com.tt.miniapp.component.nativeview.picker.wheel.C65961e;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.toast.ToastManager;
import com.tt.miniapp.util.C67018a;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.view.dialog.C67179c;
import com.tt.miniapp.view.dialog.DialogC67191d;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.entity.C67521a;
import com.tt.miniapphost.entity.C67533i;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.C67478b;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.ui.HostOptionUiDepend;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tt.miniapp.m.j */
public class C66344j implements HostOptionUiDepend {
    @Override // com.tt.option.ui.HostOptionUiDepend
    public C67521a getAnchorConfig(String str) {
        return null;
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void initFeignHostConfig(Context context) {
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void initNativeUIParams() {
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void hideToast() {
        ToastManager.hideToast();
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public Dialog getLoadingDialog(Activity activity, String str) {
        return new DialogC67191d(activity, str);
    }

    /* renamed from: a */
    public static int m259474a(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    /* renamed from: a */
    private void m259476a(Activity activity, FrameLayout frameLayout, int i, IAppContext iAppContext) {
        View inflate = LayoutInflater.from(activity).inflate(R.layout.microapp_m_view_permission_common, frameLayout);
        C66578b.C66579a permissionTypeToPermission = HostDependManager.getInst().permissionTypeToPermission(i, iAppContext);
        ((TextView) inflate.findViewById(R.id.tv_permission_name)).setText(permissionTypeToPermission.mo232179c());
        ((TextView) inflate.findViewById(R.id.tv_subtitle)).setText(CharacterUtils.trimString(permissionTypeToPermission.mo232180d(), 46, false, "..."));
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showRegionPickerView(Activity activity, String str, String[] strArr, final HostOptionUiDepend.AbstractC67693e eVar) {
        final C65953c cVar = new C65953c(activity);
        cVar.mo230908a(strArr);
        cVar.mo230907a(str);
        cVar.mo230910n();
        cVar.mo230793c();
        cVar.mo230802a(new AbstractC65914b.AbstractC65917a() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass10 */

            @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b.AbstractC65917a
            /* renamed from: a */
            public void mo49482a() {
                eVar.mo234047a();
            }
        });
        cVar.mo230789a(new DialogInterface.OnDismissListener() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass11 */

            public void onDismiss(DialogInterface dialogInterface) {
                eVar.mo234047a();
            }
        });
        cVar.mo230902a(new C65949b.AbstractC65952b() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass13 */

            @Override // com.tt.miniapp.component.nativeview.picker.wheel.C65949b.AbstractC65952b
            /* renamed from: a */
            public void mo230906a(int[] iArr) {
                AddressInfo[] r = cVar.mo230914r();
                AppBrandLogger.m52828d("showRegionPickerView", r[0] + "," + r[1] + "," + r[1]);
                eVar.mo234067a(new String[]{r[0].name, r[1].name, r[2].name}, new String[]{r[0].code, r[1].code, r[2].code});
            }
        });
        cVar.mo230901a(new C65949b.AbstractC65951a() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass14 */

            @Override // com.tt.miniapp.component.nativeview.picker.wheel.C65949b.AbstractC65951a
            /* renamed from: a */
            public void mo230905a(int i, int i2, Object obj) {
                eVar.mo234066a(i, i2, obj);
            }
        });
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showUnSupportView(Activity activity, String str, HostOptionUiDepend.AbstractC67695g gVar, IAppContext iAppContext) {
        if (activity == null || TextUtils.isEmpty(str) || !HostDependManager.getInst().handleAppbrandDisablePage(activity, str)) {
            HostDependManager inst = HostDependManager.getInst();
            inst.jumpToWebView(activity, AppbrandConstant.C65701b.m257612c().mo230142g() + "?" + C67478b.m262466b(), "", true);
        }
        gVar.mo231034a();
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showToast(Context context, String str, String str2, long j, String str3) {
        ToastManager.showToast(context, str2, j, str3);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showActionSheet(Context context, String str, String[] strArr, final AbstractC67550j.AbstractC67551a<Integer> aVar, IAppContext iAppContext) {
        Activity currentActivity = iAppContext.getCurrentActivity();
        if (currentActivity != null && strArr != null) {
            C67179c.m261839a(currentActivity, strArr, new C67179c.AbstractC67189a() {
                /* class com.tt.miniapp.p3301m.C66344j.C663451 */

                @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67189a
                /* renamed from: a */
                public void mo231527a() {
                    aVar.onNativeModuleCall(-1);
                }

                @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67189a
                /* renamed from: a */
                public void mo231528a(int i) {
                    aVar.onNativeModuleCall(Integer.valueOf(i));
                }
            });
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showMultiPickerView(Activity activity, String str, List<List<String>> list, int[] iArr, final HostOptionUiDepend.AbstractC67690b bVar) {
        C65949b bVar2 = new C65949b(activity, list);
        bVar2.mo230904a(iArr);
        bVar2.mo230793c();
        bVar2.mo230802a(new AbstractC65914b.AbstractC65917a() {
            /* class com.tt.miniapp.p3301m.C66344j.C663526 */

            @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b.AbstractC65917a
            /* renamed from: a */
            public void mo49482a() {
                bVar.mo234047a();
            }
        });
        bVar2.mo230789a(new DialogInterface.OnDismissListener() {
            /* class com.tt.miniapp.p3301m.C66344j.DialogInterface$OnDismissListenerC663537 */

            public void onDismiss(DialogInterface dialogInterface) {
                bVar.mo234047a();
            }
        });
        bVar2.mo230902a(new C65949b.AbstractC65952b() {
            /* class com.tt.miniapp.p3301m.C66344j.C663548 */

            @Override // com.tt.miniapp.component.nativeview.picker.wheel.C65949b.AbstractC65952b
            /* renamed from: a */
            public void mo230906a(int[] iArr) {
                bVar.mo234059a(iArr);
            }
        });
        bVar2.mo230901a(new C65949b.AbstractC65951a() {
            /* class com.tt.miniapp.p3301m.C66344j.C663559 */

            @Override // com.tt.miniapp.component.nativeview.picker.wheel.C65949b.AbstractC65951a
            /* renamed from: a */
            public void mo230905a(int i, int i2, Object obj) {
                bVar.mo234058a(i, i2, obj);
            }
        });
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public Dialog showPermissionDialog(Activity activity, int i, final String str, final AbstractC67540b bVar, IAppContext iAppContext) {
        return C67179c.m261835a(activity, new C67179c.AbstractC67190b() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass15 */

            @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67190b
            /* renamed from: c */
            public void mo231533c() {
            }

            @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67190b
            /* renamed from: a */
            public void mo231531a() {
                bVar.mo87199a();
            }

            @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67190b
            /* renamed from: b */
            public void mo231532b() {
                bVar.mo87200a(str);
            }
        }, activity.getString(R.string.microapp_m_require_following_permission_with_appname, new Object[]{C67432a.m262319a(iAppContext).getAppInfo().appName}), str, activity.getString(R.string.microapp_m_brand_permission_ok), activity.getString(R.string.microapp_m_brand_title_permission_cancel));
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showPickerView(Activity activity, String str, int i, List<String> list, final HostOptionUiDepend.AbstractC67691c<String> cVar) {
        C65957d dVar = new C65957d(activity, list);
        dVar.mo230802a((AbstractC65914b.AbstractC65917a) new AbstractC65914b.AbstractC65917a() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass23 */

            @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b.AbstractC65917a
            /* renamed from: a */
            public void mo49482a() {
                cVar.mo234047a();
            }
        });
        dVar.mo230789a((DialogInterface.OnDismissListener) new DialogInterface.OnDismissListener() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass24 */

            public void onDismiss(DialogInterface dialogInterface) {
                cVar.mo234050b();
            }
        });
        dVar.mo230916a((C65957d.AbstractC65959a) new C65957d.AbstractC65959a<String>() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass25 */

            /* renamed from: a */
            public void mo49483a(int i, String str) {
                cVar.mo234062a(i, str);
            }
        });
        dVar.mo230915a(i);
        dVar.mo230793c();
    }

    /* renamed from: a */
    private void m259477a(final Activity activity, FrameLayout frameLayout, final LinkedHashMap<Integer, Boolean> linkedHashMap, final TextView textView, final IAppContext iAppContext) {
        final int parseColor = Color.parseColor("#E8E8E8");
        ListView listView = new ListView(activity);
        listView.setHorizontalScrollBarEnabled(false);
        listView.setVerticalScrollBarEnabled(false);
        listView.setDividerHeight(0);
        View view = new View(activity);
        view.setLayoutParams(new AbsListView.LayoutParams(-1, (int) C67590h.m263065a(activity, 0.5f)));
        view.setBackgroundColor(activity.getResources().getColor(R.color.microapp_m_black_7));
        listView.addFooterView(view);
        frameLayout.addView(listView);
        final Integer[] numArr = (Integer[]) linkedHashMap.keySet().toArray(new Integer[linkedHashMap.size()]);
        listView.setAdapter((ListAdapter) new BaseAdapter() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass22 */

            public long getItemId(int i) {
                return (long) i;
            }

            public int getCount() {
                return numArr.length;
            }

            public Object getItem(int i) {
                return numArr[i];
            }

            public View getView(final int i, View view, ViewGroup viewGroup) {
                if (view != null) {
                    return view;
                }
                View inflate = LayoutInflater.from(activity).inflate(R.layout.microapp_m_item_view_permission, (ViewGroup) null);
                ((TextView) inflate.findViewById(R.id.tv_name)).setText(HostDependManager.getInst().permissionTypeToPermission(numArr[i].intValue(), iAppContext).mo232179c());
                final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.cb_permission);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(Color.parseColor(C67533i.m262676a().mo234522b()));
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(1);
                gradientDrawable2.setColor(Color.parseColor(C67533i.m262676a().mo234530j()));
                gradientDrawable2.setStroke((int) C67590h.m263065a(activity, 1.0f), parseColor);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842912}, gradientDrawable);
                stateListDrawable.addState(new int[]{-16842912}, gradientDrawable2);
                checkBox.setBackground(stateListDrawable);
                final ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_permission_checkbox_fg);
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass22.C663471 */

                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        linkedHashMap.put(numArr[i], Boolean.valueOf(z));
                        boolean z2 = false;
                        if (z) {
                            imageView.setVisibility(0);
                        } else {
                            imageView.setVisibility(8);
                        }
                        Iterator it = linkedHashMap.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Boolean) it.next()).booleanValue()) {
                                    break;
                                }
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                        textView.setEnabled(!z2);
                    }
                });
                inflate.setOnClickListener(new View.OnClickListener() {
                    /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass22.View$OnClickListenerC663482 */

                    public void onClick(View view) {
                        CheckBox checkBox = checkBox;
                        checkBox.setChecked(!checkBox.isChecked());
                    }
                });
                checkBox.setChecked(((Boolean) linkedHashMap.get(numArr[i])).booleanValue());
                return inflate;
            }
        });
    }

    /* renamed from: a */
    private void m259478a(Activity activity, FrameLayout frameLayout, LinkedHashMap<Integer, String> linkedHashMap, HashMap<String, String> hashMap, IAppContext iAppContext) {
        boolean z;
        String str;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.microapp_m_view_permission_user_info, frameLayout);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_permission_name);
        RoundedImageView roundedImageView = (RoundedImageView) inflate.findViewById(R.id.iv_user_head_icon);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_user_name);
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_account_origin);
        C66578b.C66579a permissionTypeToPermission = HostDependManager.getInst().permissionTypeToPermission(11, iAppContext);
        if (permissionTypeToPermission != null) {
            textView.setText(permissionTypeToPermission.mo232179c());
        }
        roundedImageView.setBorderColor(-1);
        roundedImageView.setBorderWidth(C67590h.m263065a(activity, 1.0f));
        int g = (int) (((float) roundedImageView.getLayoutParams().height) * C67533i.m262676a().mo234527g());
        if (((double) C67533i.m262676a().mo234527g()) == 0.5d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            roundedImageView.setOval(true);
        } else {
            roundedImageView.setCornerRadius((float) g);
        }
        String str2 = "";
        if (hashMap != null) {
            String str3 = hashMap.get("avatarUrl");
            str = hashMap.get("nickName");
            str2 = str3;
        } else {
            str = str2;
        }
        HostDependManager.getInst().loadImage(activity, roundedImageView, Uri.parse(str2));
        textView2.setText(str);
        String string = activity.getResources().getString(R.string.microapp_m_your_toutiao_account_prefix);
        String string2 = activity.getResources().getString(R.string.microapp_m_your_toutiao_account_suffix);
        textView3.setText(string + AppbrandUtil.getApplicationName(activity) + string2);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showToast(Context context, ViewGroup viewGroup, String str, String str2, long j, String str3) {
        ToastManager.showToast(context, str2, j, str3);
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public Dialog showPermissionsDialog(final Activity activity, Set<Integer> set, LinkedHashMap<Integer, String> linkedHashMap, AbstractC67539a aVar, HashMap<String, String> hashMap, IAppContext iAppContext) {
        int i;
        float f;
        LinkedHashMap<Integer, Boolean> linkedHashMap2 = new LinkedHashMap<>();
        for (Integer num : set) {
            linkedHashMap2.put(Integer.valueOf(num.intValue()), true);
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.microapp_m_appbrand_permission_dialog, (ViewGroup) null);
        final RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.rl_bg);
        final RoundedImageView roundedImageView = (RoundedImageView) inflate.findViewById(R.id.iv_blurred_bg);
        final ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_blurred_bg_shade);
        RoundedImageView roundedImageView2 = (RoundedImageView) inflate.findViewById(R.id.iv_miniapp_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_miniapp_name);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.fl_permission_desc_container);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_cancel);
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_allow);
        View findViewById = inflate.findViewById(R.id.microapp_m_permission_privacy_policy);
        m259479a(inflate, roundedImageView2, activity, textView, findViewById, linkedHashMap2, iAppContext);
        relativeLayout.post(new Runnable() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass16 */

            public void run() {
                activity.getWindow().getDecorView().buildDrawingCache();
                Bitmap drawingCache = activity.getWindow().getDecorView().getDrawingCache();
                int width = relativeLayout.getWidth();
                int height = relativeLayout.getHeight();
                if (height > 0 && width > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setFlags(2);
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) (-(C67043j.m261267a(activity) - height)));
                    if (drawingCache != null) {
                        canvas.drawBitmap(drawingCache, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                    }
                    Bitmap a = C67590h.m263072a(createBitmap, 0.25f, 50);
                    roundedImageView.setLayoutParams(new RelativeLayout.LayoutParams(width, height));
                    imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, height));
                    roundedImageView.mo230708a(C67590h.m263065a(activity, 4.0f), C67590h.m263065a(activity, 4.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    roundedImageView.setImageDrawable(new BitmapDrawable(activity.getResources(), a));
                }
            }
        });
        Dialog dialog = new Dialog(activity, R.style.microapp_m_DialogTheme);
        m259475a(activity, dialog, inflate, textView3, textView2, findViewById, linkedHashMap2, linkedHashMap, aVar, iAppContext);
        int a = (int) C67590h.m263065a(activity, 32.0f);
        int a2 = (int) C67590h.m263065a(activity, 32.0f);
        if (linkedHashMap2.size() == 1) {
            if (linkedHashMap2.keySet().contains(11)) {
                linkedHashMap2.put(11, true);
                m259478a(activity, frameLayout, linkedHashMap, hashMap, iAppContext);
            } else if (linkedHashMap2.keySet().contains(16)) {
                linkedHashMap2.put(16, true);
            } else {
                int intValue = linkedHashMap2.keySet().iterator().next().intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), true);
                m259476a(activity, frameLayout, intValue, iAppContext);
                f = C67590h.m263065a(activity, 67.0f);
            }
            i = a2;
            frameLayout.setPadding(0, a, 0, i + frameLayout.getPaddingBottom());
            return dialog;
        }
        m259477a(activity, frameLayout, linkedHashMap2, textView3, iAppContext);
        a = (int) C67590h.m263065a(activity, 28.0f);
        f = C67590h.m263065a(activity, 29.0f);
        i = (int) f;
        frameLayout.setPadding(0, a, 0, i + frameLayout.getPaddingBottom());
        return dialog;
    }

    /* renamed from: a */
    private void m259479a(final View view, final RoundedImageView roundedImageView, final Activity activity, TextView textView, View view2, LinkedHashMap<Integer, Boolean> linkedHashMap, final IAppContext iAppContext) {
        boolean z;
        String str;
        final float a = ((float) m259474a(activity.getResources(), R.integer.microapp_m_permission_dialog_base_max_height)) / ((float) m259474a(activity.getResources(), R.integer.microapp_m_permission_dialog_base_max_width));
        view.post(new Runnable() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass20 */

            public void run() {
                boolean z;
                if (activity.getResources().getConfiguration().orientation == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Activity activity = activity;
                    int a = (int) C67590h.m263065a(activity, (float) m259491a(activity.getResources(), R.integer.microapp_m_permission_dialog_base_max_width));
                    view.getLayoutParams().width = a;
                    view.setX((float) ((C67043j.m261275b(activity) - a) / 2));
                }
                int measuredWidth = (int) (((float) view.getMeasuredWidth()) * a);
                if (view.getMeasuredHeight() > measuredWidth) {
                    view.getLayoutParams().height = measuredWidth;
                }
            }

            /* renamed from: a */
            public static int m259491a(Resources resources, int i) throws Resources.NotFoundException {
                ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
                if (matchConfig == null) {
                    return resources.getInteger(i);
                }
                try {
                    if (!matchConfig.mockCrash) {
                        return resources.getInteger(i);
                    }
                    throw new Resources.NotFoundException("unknown resource from mocked");
                } catch (Throwable th) {
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
                    for (int i2 = 0; i2 < min; i2++) {
                        StackTraceElement stackTraceElement = stackTrace[i2];
                        if (stackTraceElement != null) {
                            if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                                if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                                    Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                                    return matchConfig.mReturnIdWhenException;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return resources.getInteger(i);
                }
            }
        });
        roundedImageView.setBorderColor(-1);
        roundedImageView.setBorderWidth(C67590h.m263065a(activity, 2.0f));
        int f = (int) (((float) roundedImageView.getLayoutParams().height) * C67533i.m262676a().mo234526f());
        boolean z2 = true;
        if (((double) C67533i.m262676a().mo234526f()) == 0.5d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            roundedImageView.setOval(true);
        } else {
            roundedImageView.setCornerRadius((float) f);
        }
        activity.runOnUiThread(new Runnable() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass21 */

            public void run() {
                if (C67432a.m262319a(iAppContext).getAppInfo().icon != null) {
                    HostDependManager.getInst().loadImage(activity, roundedImageView, Uri.parse(C67432a.m262319a(iAppContext).getAppInfo().icon));
                }
            }
        });
        String str2 = C67432a.m262319a(iAppContext).getAppInfo().appName + "  ";
        if (!C66236a.m259221a(iAppContext) || !linkedHashMap.keySet().contains(16)) {
            z2 = false;
        }
        if (z2) {
            str = str2 + activity.getResources().getString(R.string.microapp_m_miniapp_request_permission);
        } else {
            str = str2 + activity.getResources().getString(R.string.microapp_m_miniapp_request_your_permission);
        }
        textView.setText(str + ":");
        if (!TextUtils.isEmpty(C67432a.m262319a(iAppContext).getAppInfo().privacyPolicyUrl) || z2) {
            C67590h.m263079a(view2, 0);
            if (z2) {
                ((TextView) view2.findViewById(R.id.tv_privacy_policy_hint)).setText(activity.getResources().getString(R.string.microapp_m_ad_site_phone_number_permission_hint));
            } else {
                ((TextView) view2.findViewById(R.id.tv_privacy_policy_app_name)).setText(C67432a.m262319a(iAppContext).getAppInfo().appName);
            }
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showTimePickerView(Activity activity, String str, int i, int i2, int i3, int i4, int i5, int i6, final HostOptionUiDepend.AbstractC67694f<String> fVar) {
        C65961e eVar = new C65961e(activity);
        eVar.mo230921g(i, i2);
        eVar.mo230922h(i3, i4);
        eVar.mo230923k(i5, i6);
        eVar.mo230802a(new AbstractC65914b.AbstractC65917a() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass26 */

            @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b.AbstractC65917a
            /* renamed from: a */
            public void mo49482a() {
                fVar.mo234047a();
            }
        });
        eVar.mo230789a(new DialogInterface.OnDismissListener() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass27 */

            public void onDismiss(DialogInterface dialogInterface) {
                fVar.mo234050b();
            }
        });
        eVar.mo230920a(new C65961e.AbstractC65963a() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass28 */

            @Override // com.tt.miniapp.component.nativeview.picker.wheel.C65961e.AbstractC65963a
            /* renamed from: a */
            public void mo230924a(String str, String str2) {
                fVar.mo234048a(str, str2);
            }
        });
        eVar.mo230793c();
    }

    /* renamed from: a */
    private void m259475a(final Activity activity, final Dialog dialog, View view, TextView textView, TextView textView2, View view2, final LinkedHashMap<Integer, Boolean> linkedHashMap, final LinkedHashMap<Integer, String> linkedHashMap2, final AbstractC67539a aVar, final IAppContext iAppContext) {
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(view);
        dialog.setCancelable(false);
        textView.setTextColor(Color.parseColor(C67533i.m262676a().mo234524d()));
        GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
        gradientDrawable.setCornerRadius(C67590h.m263065a(activity, (float) C67533i.m262676a().mo234525e()));
        gradientDrawable.setColor(Color.parseColor(C67533i.m262676a().mo234522b()));
        textView2.setTextColor(Color.parseColor(C67533i.m262676a().mo234531k()));
        GradientDrawable gradientDrawable2 = (GradientDrawable) textView2.getBackground();
        gradientDrawable2.setCornerRadius(C67590h.m263065a(activity, (float) C67533i.m262676a().mo234525e()));
        gradientDrawable2.setColor(Color.parseColor(C67533i.m262676a().mo234530j()));
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass17 */

            public void onClick(View view) {
                boolean z;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry.getValue() == null || !((Boolean) entry.getValue()).booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        linkedHashMap2.put(entry.getKey(), "ok");
                    } else {
                        linkedHashMap2.put(entry.getKey(), "auth deny");
                    }
                }
                aVar.mo87589a(linkedHashMap2);
                dialog.dismiss();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass18 */

            public void onClick(View view) {
                for (Integer num : linkedHashMap.keySet()) {
                    linkedHashMap2.put(Integer.valueOf(num.intValue()), "auth deny");
                }
                aVar.mo87590b(linkedHashMap2);
                dialog.dismiss();
            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass19 */

            public void onClick(View view) {
                String str;
                String str2 = C67432a.m262319a(iAppContext).getAppInfo().privacyPolicyUrl;
                if (!C66236a.m259221a(iAppContext) || !linkedHashMap.keySet().contains(16)) {
                    str = Uri.encode(str2) + "&title=" + Uri.encode(activity.getString(R.string.microapp_m_permission_privacy_policy_title)) + "&hide_bar=0";
                } else {
                    str = Uri.encode("https://sf3-ttcdn-tos.pstatp.com/obj/developer/misc/ad_site_privacy.html");
                }
                String str3 = AppbrandContext.getInst().getInitParams().mo234501a(1008, "sslocal") + "://webview?url=" + str;
                Activity activity = activity;
                if (activity instanceof MiniappHostBase) {
                    C67018a.m261203a((MiniappHostBase) activity, str3, null, null, iAppContext);
                }
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            if (TextUtils.equals(C67043j.m261271a().toLowerCase(), "huawei") && AppbrandContext.getInst().isGame()) {
                window.setFlags(1024, 1024);
                window.getDecorView().setSystemUiVisibility(2822);
            }
            window.setLayout(-1, -2);
            window.setGravity(80);
            window.setWindowAnimations(R.style.microapp_i_BottomDialogAnimation);
            window.getDecorView().setSystemUiVisibility(2304);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showModal(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, final AbstractC67550j.AbstractC67551a<Integer> aVar, Activity activity) {
        Activity activity2;
        if (context instanceof Activity) {
            activity2 = (Activity) context;
        } else {
            activity2 = activity;
        }
        if (activity2 != null) {
            C67179c.m261835a(activity2, new C67179c.AbstractC67190b() {
                /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass12 */

                @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67190b
                /* renamed from: c */
                public void mo231533c() {
                }

                @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67190b
                /* renamed from: a */
                public void mo231531a() {
                    aVar.onNativeModuleCall(1);
                }

                @Override // com.tt.miniapp.view.dialog.C67179c.AbstractC67190b
                /* renamed from: b */
                public void mo231532b() {
                    aVar.onNativeModuleCall(0);
                }
            }, str2, str3, str6, str4);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showDatePickerView(Activity activity, String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, final HostOptionUiDepend.AbstractC67689a<String> aVar) {
        C65939a aVar2;
        C65939a aVar3;
        if (TextUtils.equals(str2, "year")) {
            aVar2 = new C65939a(activity, 5);
            aVar2.mo230823f(i, i4);
            aVar2.mo230892e(i7, 0, 0);
        } else {
            if (TextUtils.equals(str2, "month")) {
                aVar3 = new C65939a(activity, 1);
                aVar3.mo230893g(i, i2);
                aVar3.mo230894h(i4, i5);
                aVar3.mo230892e(i7, i8, 0);
            } else if (TextUtils.equals(str2, "day")) {
                aVar3 = new C65939a(activity, 0);
                aVar3.mo230890c(i, i2, i3);
                aVar3.mo230891d(i4, i5, i6);
                aVar3.mo230892e(i7, i8, i9);
            } else {
                aVar2 = null;
            }
            aVar2 = aVar3;
        }
        if (aVar2 != null) {
            aVar2.mo230816a((String) null, (String) null, (String) null, (String) null, (String) null);
            aVar2.mo230802a(new AbstractC65914b.AbstractC65917a() {
                /* class com.tt.miniapp.p3301m.C66344j.AnonymousClass29 */

                @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b.AbstractC65917a
                /* renamed from: a */
                public void mo49482a() {
                    aVar.mo234047a();
                }
            });
            aVar2.mo230789a(new DialogInterface.OnDismissListener() {
                /* class com.tt.miniapp.p3301m.C66344j.DialogInterface$OnDismissListenerC663462 */

                public void onDismiss(DialogInterface dialogInterface) {
                    aVar.mo234047a();
                }
            });
            if (TextUtils.equals(str2, "year")) {
                aVar2.mo230889a(new C65939a.AbstractC65948e() {
                    /* class com.tt.miniapp.p3301m.C66344j.C663493 */

                    @Override // com.tt.miniapp.component.nativeview.picker.wheel.C65939a.AbstractC65948e
                    /* renamed from: a */
                    public void mo230898a(String str) {
                        aVar.mo234052a(str, null, null);
                    }
                });
            } else if (TextUtils.equals(str2, "month")) {
                aVar2.mo230889a(new C65939a.AbstractC65947d() {
                    /* class com.tt.miniapp.p3301m.C66344j.C663504 */

                    @Override // com.tt.miniapp.component.nativeview.picker.wheel.C65939a.AbstractC65947d
                    /* renamed from: a */
                    public void mo230897a(String str, String str2) {
                        aVar.mo234052a(str, str2, null);
                    }
                });
            } else if (TextUtils.equals(str2, "day")) {
                aVar2.mo230889a(new C65939a.AbstractC65946c() {
                    /* class com.tt.miniapp.p3301m.C66344j.C663515 */

                    @Override // com.tt.miniapp.component.nativeview.picker.wheel.C65939a.AbstractC65946c
                    /* renamed from: a */
                    public void mo230896a(String str, String str2, String str3) {
                        aVar.mo234052a(str, str2, str3);
                    }
                });
            }
            aVar2.mo230793c();
        }
    }
}
