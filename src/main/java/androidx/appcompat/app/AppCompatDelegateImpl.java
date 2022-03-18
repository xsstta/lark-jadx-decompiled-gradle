package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.view.AbstractC0297b;
import androidx.appcompat.view.C0301e;
import androidx.appcompat.view.C0303f;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.Window$CallbackC0308h;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.view.menu.AbstractC0339m;
import androidx.appcompat.view.menu.C0319d;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.widget.AbstractC0458n;
import androidx.appcompat.widget.AbstractC0464r;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0427af;
import androidx.appcompat.widget.C0445f;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ak;
import androidx.appcompat.widget.al;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.C0739f;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.C0760e;
import androidx.core.util.C0843d;
import androidx.core.view.AbstractC0912n;
import androidx.core.view.AbstractC0928y;
import androidx.core.view.C0883ab;
import androidx.core.view.C0905g;
import androidx.core.view.C0924x;
import androidx.core.view.C0929z;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26254af;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.util.List;
import me.ele.lancet.base.annotations.Skip;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
public class AppCompatDelegateImpl extends AppCompatDelegate implements LayoutInflater.Factory2, C0322f.AbstractC0323a {

    /* renamed from: u */
    private static final SimpleArrayMap<String, Integer> f601u = new SimpleArrayMap<>();

    /* renamed from: v */
    private static final boolean f602v;

    /* renamed from: w */
    private static final int[] f603w = {16842836};

    /* renamed from: x */
    private static final boolean f604x = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: y */
    private static final boolean f605y;

    /* renamed from: z */
    private static boolean f606z = true;

    /* renamed from: A */
    private C0246d f607A;

    /* renamed from: B */
    private CharSequence f608B;

    /* renamed from: C */
    private AbstractC0458n f609C;

    /* renamed from: D */
    private C0243b f610D;

    /* renamed from: E */
    private C0256m f611E;

    /* renamed from: F */
    private boolean f612F;

    /* renamed from: G */
    private boolean f613G;

    /* renamed from: H */
    private TextView f614H;

    /* renamed from: I */
    private View f615I;

    /* renamed from: J */
    private boolean f616J;

    /* renamed from: K */
    private boolean f617K;

    /* renamed from: L */
    private boolean f618L;

    /* renamed from: M */
    private PanelFeatureState[] f619M;

    /* renamed from: N */
    private PanelFeatureState f620N;

    /* renamed from: O */
    private boolean f621O;

    /* renamed from: P */
    private boolean f622P;

    /* renamed from: Q */
    private boolean f623Q;

    /* renamed from: R */
    private boolean f624R;

    /* renamed from: S */
    private int f625S;

    /* renamed from: T */
    private int f626T;

    /* renamed from: U */
    private boolean f627U;

    /* renamed from: V */
    private boolean f628V;

    /* renamed from: W */
    private AbstractC0248f f629W;

    /* renamed from: X */
    private AbstractC0248f f630X;

    /* renamed from: Y */
    private final Runnable f631Y;

    /* renamed from: Z */
    private boolean f632Z;

    /* renamed from: a */
    final Object f633a;
    private Rect aa;
    private Rect ab;
    private C0262d ac;

    /* renamed from: b */
    final Context f634b;

    /* renamed from: c */
    Window f635c;

    /* renamed from: d */
    final AppCompatCallback f636d;

    /* renamed from: e */
    ActionBar f637e;

    /* renamed from: f */
    MenuInflater f638f;

    /* renamed from: g */
    AbstractC0297b f639g;

    /* renamed from: h */
    ActionBarContextView f640h;

    /* renamed from: i */
    PopupWindow f641i;

    /* renamed from: j */
    Runnable f642j;

    /* renamed from: k */
    C0924x f643k;

    /* renamed from: l */
    ViewGroup f644l;

    /* renamed from: m */
    boolean f645m;

    /* renamed from: n */
    boolean f646n;

    /* renamed from: o */
    boolean f647o;

    /* renamed from: p */
    boolean f648p;

    /* renamed from: q */
    boolean f649q;

    /* renamed from: r */
    boolean f650r;

    /* renamed from: s */
    boolean f651s;

    /* renamed from: t */
    int f652t;

    /* access modifiers changed from: protected */
    public static final class PanelFeatureState {

        /* renamed from: a */
        int f661a;

        /* renamed from: b */
        int f662b;

        /* renamed from: c */
        int f663c;

        /* renamed from: d */
        int f664d;

        /* renamed from: e */
        int f665e;

        /* renamed from: f */
        int f666f;

        /* renamed from: g */
        ViewGroup f667g;

        /* renamed from: h */
        View f668h;

        /* renamed from: i */
        View f669i;

        /* renamed from: j */
        C0322f f670j;

        /* renamed from: k */
        C0319d f671k;

        /* renamed from: l */
        Context f672l;

        /* renamed from: m */
        boolean f673m;

        /* renamed from: n */
        boolean f674n;

        /* renamed from: o */
        boolean f675o;

        /* renamed from: p */
        public boolean f676p;

        /* renamed from: q */
        boolean f677q;

        /* renamed from: r */
        boolean f678r;

        /* renamed from: s */
        Bundle f679s;

        /* access modifiers changed from: private */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
                /* class androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.C02411 */

                /* renamed from: a */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }

                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m863a(parcel, null);
                }

                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m863a(parcel, classLoader);
                }
            };

            /* renamed from: a */
            int f680a;

            /* renamed from: b */
            boolean f681b;

            /* renamed from: c */
            Bundle f682c;

            public int describeContents() {
                return 0;
            }

            SavedState() {
            }

            /* renamed from: a */
            static SavedState m863a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f680a = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f681b = z;
                if (z) {
                    savedState.f682c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f680a);
                parcel.writeInt(this.f681b ? 1 : 0);
                if (this.f681b) {
                    parcel.writeBundle(this.f682c);
                }
            }
        }

        /* renamed from: a */
        public boolean mo873a() {
            if (this.f668h == null) {
                return false;
            }
            if (this.f669i == null && this.f671k.mo1362d().getCount() <= 0) {
                return false;
            }
            return true;
        }

        PanelFeatureState(int i) {
            this.f661a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo872a(C0322f fVar) {
            C0319d dVar;
            C0322f fVar2 = this.f670j;
            if (fVar != fVar2) {
                if (fVar2 != null) {
                    fVar2.mo1411b(this.f671k);
                }
                this.f670j = fVar;
                if (fVar != null && (dVar = this.f671k) != null) {
                    fVar.mo1392a(dVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC0339m mo870a(AbstractC0337l.AbstractC0338a aVar) {
            if (this.f670j == null) {
                return null;
            }
            if (this.f671k == null) {
                C0319d dVar = new C0319d(this.f672l, (int) R.layout.abc_list_menu_item_layout);
                this.f671k = dVar;
                dVar.mo1242a(aVar);
                this.f670j.mo1392a(this.f671k);
            }
            return this.f671k.mo1359a(this.f667g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo871a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(2131886918, true);
            }
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.f672l = contextThemeWrapper;
            TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle});
            this.f662b = obtainStyledAttributes.getResourceId(84, 0);
            this.f666f = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: B */
    private ViewGroup m762B() {
        return m770a(this);
    }

    /* renamed from: C */
    private void m763C() {
        m778b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo834a(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: c */
    public void mo818c(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: k */
    public int mo827k() {
        return this.f625S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final ActionBar mo848m() {
        return this.f637e;
    }

    /* renamed from: t */
    public boolean mo857t() {
        return this.f612F;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: b */
    public Context mo811b(Context context) {
        boolean z = true;
        this.f622P = true;
        int a = mo828a(context, m766F());
        Configuration configuration = null;
        if (f605y && (context instanceof android.view.ContextThemeWrapper)) {
            try {
                C0254k.m891a((android.view.ContextThemeWrapper) context, m768a(context, a, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m768a(context, a, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f604x) {
            return super.mo811b(context);
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = m769a(configuration2, configuration3);
            }
            Configuration a2 = m768a(context, a, configuration);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 2131886930);
            contextThemeWrapper.applyOverrideConfiguration(a2);
            boolean z2 = false;
            try {
                if (context.getTheme() == null) {
                    z = false;
                }
                z2 = z;
            } catch (NullPointerException unused3) {
            }
            if (z2) {
                C0760e.C0764b.m3689a(contextThemeWrapper.getTheme());
            }
            return super.mo811b(contextThemeWrapper);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Application failed to obtain resources from itself", e);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo806a(Bundle bundle) {
        this.f622P = true;
        m785c(false);
        m793z();
        Object obj = this.f633a;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0739f.m3601b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar m = mo848m();
                if (m == null) {
                    this.f632Z = true;
                } else {
                    m.mo706d(true);
                }
            }
            m727a((AppCompatDelegate) this);
        }
        this.f623Q = true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo809a(Toolbar toolbar) {
        if (this.f633a instanceof Activity) {
            ActionBar a = mo801a();
            if (!(a instanceof C0275k)) {
                this.f638f = null;
                if (a != null) {
                    a.mo712g();
                }
                if (toolbar != null) {
                    C0266h hVar = new C0266h(toolbar, mo855r(), this.f607A);
                    this.f637e = hVar;
                    this.f635c.setCallback(hVar.mo968h());
                } else {
                    this.f637e = null;
                    this.f635c.setCallback(this.f607A);
                }
                mo822f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo805a(Configuration configuration) {
        ActionBar a;
        if (this.f645m && this.f613G && (a = mo801a()) != null) {
            a.mo696a(configuration);
        }
        C0445f.m1910b().mo2589a(this.f634b);
        m785c(false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo807a(View view) {
        m761A();
        ViewGroup viewGroup = (ViewGroup) this.f644l.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f607A.mo1199a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo808a(View view, ViewGroup.LayoutParams layoutParams) {
        m761A();
        ViewGroup viewGroup = (ViewGroup) this.f644l.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f607A.mo1199a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: b */
    public void mo815b(View view, ViewGroup.LayoutParams layoutParams) {
        m761A();
        ((ViewGroup) this.f644l.findViewById(16908290)).addView(view, layoutParams);
        this.f607A.mo1199a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public final void mo810a(CharSequence charSequence) {
        this.f608B = charSequence;
        AbstractC0458n nVar = this.f609C;
        if (nVar != null) {
            nVar.setWindowTitle(charSequence);
        } else if (mo848m() != null) {
            mo848m().mo702b(charSequence);
        } else {
            TextView textView = this.f614H;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
    /* renamed from: a */
    public boolean mo839a(C0322f fVar, MenuItem menuItem) {
        PanelFeatureState a;
        Window.Callback n = mo849n();
        if (n == null || this.f650r || (a = mo832a((Menu) fVar.mo1445q())) == null) {
            return false;
        }
        return n.onMenuItemSelected(a.f661a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
    /* renamed from: a */
    public void mo836a(C0322f fVar) {
        m779b(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public AbstractC0297b mo802a(AbstractC0297b.AbstractC0298a aVar) {
        AppCompatCallback appCompatCallback;
        if (aVar != null) {
            AbstractC0297b bVar = this.f639g;
            if (bVar != null) {
                bVar.mo996c();
            }
            C0244c cVar = new C0244c(aVar);
            ActionBar a = mo801a();
            if (a != null) {
                AbstractC0297b a2 = a.mo693a(cVar);
                this.f639g = a2;
                if (!(a2 == null || (appCompatCallback = this.f636d) == null)) {
                    appCompatCallback.onSupportActionModeStarted(a2);
                }
            }
            if (this.f639g == null) {
                this.f639g = mo840b(cVar);
            }
            return this.f639g;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.AbstractC0297b mo840b(androidx.appcompat.view.AbstractC0297b.AbstractC0298a r8) {
        /*
        // Method dump skipped, instructions count: 372
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo840b(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo837a(int i, KeyEvent keyEvent) {
        ActionBar a = mo801a();
        if (a != null && a.mo699a(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f620N;
        if (panelFeatureState == null || !m776a(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f620N == null) {
                PanelFeatureState a2 = mo831a(0, true);
                m782b(a2, keyEvent);
                boolean a3 = m776a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f673m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.f620N;
        if (panelFeatureState2 != null) {
            panelFeatureState2.f674n = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo838a(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f633a;
        boolean z = true;
        if (((obj instanceof KeyEventDispatcher.Component) || (obj instanceof DialogC0259b)) && (decorView = this.f635c.getDecorView()) != null && KeyEventDispatcher.m4005a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f607A.mo1199a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo843c(keyCode, keyEvent) : mo842b(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo842b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f621O;
            this.f621O = false;
            PanelFeatureState a = mo831a(0, false);
            if (a != null && a.f675o) {
                if (!z) {
                    mo835a(a, true);
                }
                return true;
            } else if (mo859v()) {
                return true;
            }
        } else if (i == 82) {
            m788e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public View mo830a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.ac == null) {
            String string = this.f634b.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle}).getString(SmEvents.EVENT_TO);
            if (string == null) {
                this.ac = new C0262d();
            } else {
                try {
                    this.ac = (C0262d) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.ac = new C0262d();
                }
            }
        }
        boolean z3 = f602v;
        if (z3) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m774a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.ac.mo949a(view, str, context, attributeSet, z, z3, true, ak.m1860a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo841b(C0322f fVar) {
        if (!this.f618L) {
            this.f618L = true;
            this.f609C.mo1722k();
            Window.Callback n = mo849n();
            if (n != null && !this.f650r) {
                n.onPanelClosed(108, fVar);
            }
            this.f618L = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo835a(PanelFeatureState panelFeatureState, boolean z) {
        AbstractC0458n nVar;
        if (!z || panelFeatureState.f661a != 0 || (nVar = this.f609C) == null || !nVar.mo1710f()) {
            WindowManager windowManager = (WindowManager) this.f634b.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f675o || panelFeatureState.f667g == null)) {
                windowManager.removeView(panelFeatureState.f667g);
                if (z) {
                    mo833a(panelFeatureState.f661a, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f673m = false;
            panelFeatureState.f674n = false;
            panelFeatureState.f675o = false;
            panelFeatureState.f668h = null;
            panelFeatureState.f677q = true;
            if (this.f620N == panelFeatureState) {
                this.f620N = null;
                return;
            }
            return;
        }
        mo841b(panelFeatureState.f670j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo833a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f619M;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f670j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f675o) && !this.f650r) {
            this.f607A.mo1199a().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PanelFeatureState mo832a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f619M;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f670j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PanelFeatureState mo831a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f619M;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f619M = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: a */
    private boolean m776a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f673m || m782b(panelFeatureState, keyEvent)) && panelFeatureState.f670j != null) {
            z = panelFeatureState.f670j.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f609C == null) {
            mo835a(panelFeatureState, true);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo829a(C0883ab abVar, Rect rect) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4 = 0;
        if (abVar != null) {
            i = abVar.mo4644b();
        } else {
            i = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f640h;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f640h.getLayoutParams();
            boolean z3 = true;
            if (this.f640h.isShown()) {
                if (this.aa == null) {
                    this.aa = new Rect();
                    this.ab = new Rect();
                }
                Rect rect2 = this.aa;
                Rect rect3 = this.ab;
                if (abVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(abVar.mo4642a(), abVar.mo4644b(), abVar.mo4646c(), abVar.mo4647d());
                }
                al.m1863a(this.f644l, rect2, rect3);
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                C0883ab y = ViewCompat.m4110y(this.f644l);
                if (y == null) {
                    i2 = 0;
                } else {
                    i2 = y.mo4642a();
                }
                if (y == null) {
                    i3 = 0;
                } else {
                    i3 = y.mo4646c();
                }
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z2 = true;
                }
                if (i5 <= 0 || this.f615I != null) {
                    View view = this.f615I;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (!(marginLayoutParams2.height == marginLayoutParams.topMargin && marginLayoutParams2.leftMargin == i2 && marginLayoutParams2.rightMargin == i3)) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = i2;
                            marginLayoutParams2.rightMargin = i3;
                            this.f615I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f634b);
                    this.f615I = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i3;
                    this.f644l.addView(this.f615I, -1, layoutParams);
                }
                View view3 = this.f615I;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m777b(this.f615I);
                }
                if (!this.f647o && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f640h.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f615I;
        if (view4 != null) {
            if (!z) {
                i4 = 8;
            }
            view4.setVisibility(i4);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo828a(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return m786d(context).mo899a();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() != 0) {
                return m783c(context).mo899a();
            } else {
                return -1;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    public class C0247e extends AbstractC0248f {

        /* renamed from: c */
        private final PowerManager f690c;

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0248f
        /* renamed from: b */
        public void mo900b() {
            AppCompatDelegateImpl.this.mo826j();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0248f
        /* renamed from: a */
        public int mo899a() {
            if (Build.VERSION.SDK_INT < 21 || !this.f690c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0248f
        /* renamed from: c */
        public IntentFilter mo901c() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        C0247e(Context context) {
            super();
            this.f690c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    public class C0250g extends AbstractC0248f {

        /* renamed from: c */
        private final C0273j f695c;

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0248f
        /* renamed from: b */
        public void mo900b() {
            AppCompatDelegateImpl.this.mo826j();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0248f
        /* renamed from: a */
        public int mo899a() {
            if (this.f695c.mo974a()) {
                return 2;
            }
            return 1;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0248f
        /* renamed from: c */
        public IntentFilter mo901c() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        C0250g(C0273j jVar) {
            super();
            this.f695c = jVar;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public ActionBar mo801a() {
        m791x();
        return this.f637e;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: c */
    public void mo816c() {
        this.f624R = true;
        mo826j();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: h */
    public final ActionBarDrawerToggle.AbstractC0219a mo824h() {
        return new C0242a();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: j */
    public boolean mo826j() {
        return m785c(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Window.Callback mo849n() {
        return this.f635c.getCallback();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo858u() {
        C0924x xVar = this.f643k;
        if (xVar != null) {
            xVar.mo4730b();
        }
    }

    /* renamed from: E */
    private void m765E() {
        if (this.f613G) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: F */
    private int m766F() {
        int i = this.f625S;
        if (i != -100) {
            return i;
        }
        return m732l();
    }

    /* renamed from: y */
    private void m792y() {
        AbstractC0248f fVar = this.f629W;
        if (fVar != null) {
            fVar.mo903e();
        }
        AbstractC0248f fVar2 = this.f630X;
        if (fVar2 != null) {
            fVar2.mo903e();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: e */
    public void mo821e() {
        ActionBar a = mo801a();
        if (a != null) {
            a.mo708e(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final CharSequence mo855r() {
        Object obj = this.f633a;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f608B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    public abstract class AbstractC0248f {

        /* renamed from: a */
        private BroadcastReceiver f691a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract int mo899a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo900b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract IntentFilter mo901c();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo903e() {
            if (this.f691a != null) {
                try {
                    AppCompatDelegateImpl.this.f634b.unregisterReceiver(this.f691a);
                } catch (IllegalArgumentException unused) {
                }
                this.f691a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo902d() {
            mo903e();
            IntentFilter c = mo901c();
            if (c != null && c.countActions() != 0) {
                if (this.f691a == null) {
                    this.f691a = new BroadcastReceiver() {
                        /* class androidx.appcompat.app.AppCompatDelegateImpl.AbstractC0248f.C02491 */

                        public void onReceive(Context context, Intent intent) {
                            AbstractC0248f.this.mo900b();
                        }
                    };
                }
                m879a(AppCompatDelegateImpl.this.f634b, this.f691a, c);
            }
        }

        AbstractC0248f() {
        }

        @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
        /* renamed from: a */
        public static Intent m879a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }
    }

    /* renamed from: D */
    private AppCompatActivity m764D() {
        for (Context context = this.f634b; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: z */
    private void m793z() {
        if (this.f635c == null) {
            Object obj = this.f633a;
            if (obj instanceof Activity) {
                m772a(((Activity) obj).getWindow());
            }
        }
        if (this.f635c == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: b */
    public MenuInflater mo812b() {
        Context context;
        if (this.f638f == null) {
            m791x();
            ActionBar actionBar = this.f637e;
            if (actionBar != null) {
                context = actionBar.mo701b();
            } else {
                context = this.f634b;
            }
            this.f638f = new C0303f(context);
        }
        return this.f638f;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: f */
    public void mo822f() {
        ActionBar a = mo801a();
        if (a == null || !a.mo709e()) {
            m789j(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: i */
    public void mo825i() {
        LayoutInflater from = LayoutInflater.from(this.f634b);
        if (from.getFactory() == null) {
            C0905g.m4353a(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Context mo850o() {
        Context context;
        ActionBar a = mo801a();
        if (a != null) {
            context = a.mo701b();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f634b;
        }
        return context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo856s() {
        ViewGroup viewGroup;
        if (!this.f613G || (viewGroup = this.f644l) == null || !ViewCompat.m4012F(viewGroup)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo859v() {
        AbstractC0297b bVar = this.f639g;
        if (bVar != null) {
            bVar.mo996c();
            return true;
        }
        ActionBar a = mo801a();
        if (a == null || !a.mo711f()) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    private void m791x() {
        m761A();
        if (this.f645m && this.f637e == null) {
            Object obj = this.f633a;
            if (obj instanceof Activity) {
                this.f637e = new C0275k((Activity) obj, this.f646n);
            } else if (obj instanceof Dialog) {
                this.f637e = new C0275k((Dialog) obj);
            }
            ActionBar actionBar = this.f637e;
            if (actionBar != null) {
                actionBar.mo706d(this.f632Z);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: d */
    public void mo819d() {
        this.f624R = false;
        ActionBar a = mo801a();
        if (a != null) {
            a.mo708e(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo860w() {
        AbstractC0458n nVar = this.f609C;
        if (nVar != null) {
            nVar.mo1722k();
        }
        if (this.f641i != null) {
            this.f635c.getDecorView().removeCallbacks(this.f642j);
            if (this.f641i.isShowing()) {
                try {
                    this.f641i.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f641i = null;
        }
        mo858u();
        PanelFeatureState a = mo831a(0, false);
        if (a != null && a.f670j != null) {
            a.f670j.close();
        }
    }

    static {
        boolean z;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        f602v = z;
        if (Build.VERSION.SDK_INT >= 17) {
            z2 = true;
        }
        f605y = z2;
        if (z && !f606z) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                /* class androidx.appcompat.app.AppCompatDelegateImpl.C02331 */

                /* renamed from: a */
                private boolean m851a(Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                        return false;
                    }
                    if (message.contains("drawable") || message.contains("Drawable")) {
                        return true;
                    }
                    return false;
                }

                public void uncaughtException(Thread thread, Throwable th) {
                    if (m851a(th)) {
                        Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    /* renamed from: A */
    private void m761A() {
        if (!this.f613G) {
            this.f644l = m762B();
            CharSequence r = mo855r();
            if (!TextUtils.isEmpty(r)) {
                AbstractC0458n nVar = this.f609C;
                if (nVar != null) {
                    nVar.setWindowTitle(r);
                } else if (mo848m() != null) {
                    mo848m().mo702b(r);
                } else {
                    TextView textView = this.f614H;
                    if (textView != null) {
                        textView.setText(r);
                    }
                }
            }
            m763C();
            mo834a(this.f644l);
            this.f613G = true;
            PanelFeatureState a = mo831a(0, false);
            if (this.f650r) {
                return;
            }
            if (a == null || a.f670j == null) {
                m789j(108);
            }
        }
    }

    /* renamed from: G */
    private boolean m767G() {
        int i;
        boolean z;
        if (!this.f628V && (this.f633a instanceof Activity)) {
            PackageManager packageManager = this.f634b.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 269221888;
                } else if (Build.VERSION.SDK_INT >= 24) {
                    i = 786432;
                } else {
                    i = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f634b, this.f633a.getClass()), i);
                if (activityInfo == null || (activityInfo.configChanges & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                this.f627U = z;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f627U = false;
            }
        }
        this.f628V = true;
        return this.f627U;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo823g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f633a
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            m729b(r3)
        L_0x0009:
            boolean r0 = r3.f651s
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f635c
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f631Y
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.f624R = r0
            r0 = 1
            r3.f650r = r0
            int r0 = r3.f625S
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f633a
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f601u
            java.lang.Object r1 = r3.f633a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f625S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f601u
            java.lang.Object r1 = r3.f633a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.ActionBar r0 = r3.f637e
            if (r0 == 0) goto L_0x005e
            r0.mo712g()
        L_0x005e:
            r3.m792y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo823g():void");
    }

    /* renamed from: q */
    public void mo854q() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f644l.findViewById(16908290);
        View decorView = this.f635c.getDecorView();
        contentFrameLayout.mo2062a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f634b.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle});
        obtainStyledAttributes.getValue(SmActions.ACTION_INIT_EXIT, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(SmActions.ACTION_CALLING_ENTRY, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(SmEvents.EVENT_NW)) {
            obtainStyledAttributes.getValue(SmEvents.EVENT_NW, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(SmActions.ACTION_INIT_ENTRY)) {
            obtainStyledAttributes.getValue(SmActions.ACTION_INIT_ENTRY, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(118)) {
            obtainStyledAttributes.getValue(118, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(119)) {
            obtainStyledAttributes.getValue(119, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: p */
    public ViewGroup mo853p() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f634b.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle});
        if (obtainStyledAttributes.hasValue(115)) {
            if (obtainStyledAttributes.getBoolean(SmActions.ACTION_CALLING_EXIT, false)) {
                mo820d(1);
            } else if (obtainStyledAttributes.getBoolean(115, false)) {
                mo820d(108);
            }
            if (obtainStyledAttributes.getBoolean(SmEvents.EVENT_RS, false)) {
                mo820d(SmEvents.EVENT_NR);
            }
            if (obtainStyledAttributes.getBoolean(117, false)) {
                mo820d(10);
            }
            this.f648p = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            m793z();
            this.f635c.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f634b);
            if (this.f649q) {
                viewGroup = this.f647o ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
            } else if (this.f648p) {
                viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.f646n = false;
                this.f645m = false;
            } else if (this.f645m) {
                TypedValue typedValue = new TypedValue();
                this.f634b.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new ContextThemeWrapper(this.f634b, typedValue.resourceId);
                } else {
                    context = this.f634b;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                AbstractC0458n nVar = (AbstractC0458n) viewGroup.findViewById(R.id.decor_content_parent);
                this.f609C = nVar;
                nVar.setWindowCallback(mo849n());
                if (this.f646n) {
                    this.f609C.mo1700a(SmEvents.EVENT_NR);
                }
                if (this.f616J) {
                    this.f609C.mo1700a(2);
                }
                if (this.f617K) {
                    this.f609C.mo1700a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    ViewCompat.m4044a(viewGroup, new AbstractC0912n() {
                        /* class androidx.appcompat.app.AppCompatDelegateImpl.C02353 */

                        @Override // androidx.core.view.AbstractC0912n
                        public C0883ab onApplyWindowInsets(View view, C0883ab abVar) {
                            int b = abVar.mo4644b();
                            int a = AppCompatDelegateImpl.this.mo829a(abVar, (Rect) null);
                            if (b != a) {
                                abVar = abVar.mo4643a(abVar.mo4642a(), a, abVar.mo4646c(), abVar.mo4647d());
                            }
                            return ViewCompat.m4027a(view, abVar);
                        }
                    });
                } else if (viewGroup instanceof AbstractC0464r) {
                    ((AbstractC0464r) viewGroup).setOnFitSystemWindowsListener(new AbstractC0464r.AbstractC0465a() {
                        /* class androidx.appcompat.app.AppCompatDelegateImpl.C02364 */

                        @Override // androidx.appcompat.widget.AbstractC0464r.AbstractC0465a
                        /* renamed from: a */
                        public void mo864a(Rect rect) {
                            rect.top = AppCompatDelegateImpl.this.mo829a((C0883ab) null, rect);
                        }
                    });
                }
                if (this.f609C == null) {
                    this.f614H = (TextView) viewGroup.findViewById(R.id.title);
                }
                al.m1865b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f635c.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f635c.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new ContentFrameLayout.AbstractC0382a() {
                    /* class androidx.appcompat.app.AppCompatDelegateImpl.C02375 */

                    @Override // androidx.appcompat.widget.ContentFrameLayout.AbstractC0382a
                    /* renamed from: a */
                    public void mo865a() {
                    }

                    @Override // androidx.appcompat.widget.ContentFrameLayout.AbstractC0382a
                    /* renamed from: b */
                    public void mo866b() {
                        AppCompatDelegateImpl.this.mo860w();
                    }
                });
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f645m + ", windowActionBarOverlay: " + this.f646n + ", android:windowIsFloating: " + this.f648p + ", windowActionModeOverlay: " + this.f647o + ", windowNoTitle: " + this.f649q + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: a */
    public void mo803a(int i) {
        this.f626T = i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: b */
    public void mo814b(Bundle bundle) {
        m761A();
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    private class C0242a implements ActionBarDrawerToggle.AbstractC0219a {
        C0242a() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.AbstractC0219a
        /* renamed from: a */
        public void mo725a(int i) {
            ActionBar a = AppCompatDelegateImpl.this.mo801a();
            if (a != null) {
                a.mo695a(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    public final class C0243b implements AbstractC0337l.AbstractC0338a {
        C0243b() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
        /* renamed from: a */
        public boolean mo883a(C0322f fVar) {
            Window.Callback n = AppCompatDelegateImpl.this.mo849n();
            if (n == null) {
                return true;
            }
            n.onMenuOpened(108, fVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
        /* renamed from: a */
        public void mo882a(C0322f fVar, boolean z) {
            AppCompatDelegateImpl.this.mo841b(fVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    public final class C0256m implements AbstractC0337l.AbstractC0338a {
        C0256m() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
        /* renamed from: a */
        public boolean mo883a(C0322f fVar) {
            Window.Callback n;
            if (fVar != fVar.mo1445q() || !AppCompatDelegateImpl.this.f645m || (n = AppCompatDelegateImpl.this.mo849n()) == null || AppCompatDelegateImpl.this.f650r) {
                return true;
            }
            n.onMenuOpened(108, fVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
        /* renamed from: a */
        public void mo882a(C0322f fVar, boolean z) {
            boolean z2;
            C0322f q = fVar.mo1445q();
            if (q != fVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                fVar = q;
            }
            PanelFeatureState a = appCompatDelegateImpl.mo832a((Menu) fVar);
            if (a == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo833a(a.f661a, a, q);
                AppCompatDelegateImpl.this.mo835a(a, true);
                return;
            }
            AppCompatDelegateImpl.this.mo835a(a, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    public class C0255l extends ContentFrameLayout {
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0215a.m655b(getContext(), i));
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (AppCompatDelegateImpl.this.mo838a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m892a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.mo846h(0);
            return true;
        }

        public C0255l(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m892a(int i, int i2) {
            if (i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static ViewGroup m770a(AppCompatDelegateImpl appCompatDelegateImpl) {
        ViewGroup p;
        synchronized (appCompatDelegateImpl) {
            p = appCompatDelegateImpl.mo853p();
        }
        return p;
    }

    /* renamed from: d */
    private AbstractC0248f m786d(Context context) {
        if (this.f630X == null) {
            this.f630X = new C0247e(context);
        }
        return this.f630X;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: b */
    public <T extends View> T mo813b(int i) {
        m761A();
        return (T) this.f635c.findViewById(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo845g(int i) {
        ActionBar a;
        if (i == 108 && (a = mo801a()) != null) {
            a.mo710f(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo846h(int i) {
        mo835a(mo831a(i, true), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    public class C0246d extends Window$CallbackC0308h {
        @Override // androidx.appcompat.view.Window$CallbackC0308h
        public void onContentChanged() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ActionMode mo888a(ActionMode.Callback callback) {
            C0301e.C0302a aVar = new C0301e.C0302a(AppCompatDelegateImpl.this.f634b, callback);
            AbstractC0297b a = AppCompatDelegateImpl.this.mo802a(aVar);
            if (a != null) {
                return aVar.mo1180b(a);
            }
            return null;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0308h
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (AppCompatDelegateImpl.this.mo838a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0308h
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo837a(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0308h
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.mo857t()) {
                return mo888a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        C0246d(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0308h
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0322f)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0308h
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.mo845g(i);
            return true;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0308h
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo844f(i);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0308h
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo857t() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo888a(callback);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0308h
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0322f fVar;
            if (menu instanceof C0322f) {
                fVar = (C0322f) menu;
            } else {
                fVar = null;
            }
            if (i == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.mo1416c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (fVar != null) {
                fVar.mo1416c(false);
            }
            return onPreparePanel;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0308h, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            PanelFeatureState a = AppCompatDelegateImpl.this.mo831a(0, true);
            if (a == null || a.f670j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a.f670j, i);
            }
        }
    }

    /* renamed from: a */
    private boolean m775a(PanelFeatureState panelFeatureState) {
        panelFeatureState.mo871a(mo850o());
        panelFeatureState.f667g = new C0255l(panelFeatureState.f672l);
        panelFeatureState.f663c = 81;
        return true;
    }

    /* renamed from: c */
    private AbstractC0248f m783c(Context context) {
        if (this.f629W == null) {
            this.f629W = new C0250g(C0273j.m1003a(context));
        }
        return this.f629W;
    }

    /* renamed from: j */
    private void m789j(int i) {
        this.f652t = (1 << i) | this.f652t;
        if (!this.f651s) {
            ViewCompat.m4046a(this.f635c.getDecorView(), this.f631Y);
            this.f651s = true;
        }
    }

    /* renamed from: k */
    private int m790k(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return SmEvents.EVENT_NR;
        }
    }

    /* renamed from: b */
    private void m777b(View view) {
        boolean z;
        int i;
        if ((ViewCompat.m4107v(view) & 8192) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = ContextCompat.getColor(this.f634b, R.color.abc_decor_view_status_guard_light);
        } else {
            i = ContextCompat.getColor(this.f634b, R.color.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(i);
    }

    /* renamed from: c */
    private boolean m784c(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.f669i != null) {
            panelFeatureState.f668h = panelFeatureState.f669i;
            return true;
        } else if (panelFeatureState.f670j == null) {
            return false;
        } else {
            if (this.f611E == null) {
                this.f611E = new C0256m();
            }
            panelFeatureState.f668h = (View) panelFeatureState.mo870a(this.f611E);
            if (panelFeatureState.f668h != null) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo844f(int i) {
        if (i == 108) {
            ActionBar a = mo801a();
            if (a != null) {
                a.mo710f(false);
            }
        } else if (i == 0) {
            PanelFeatureState a2 = mo831a(i, true);
            if (a2.f675o) {
                mo835a(a2, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    public class C0244c implements AbstractC0297b.AbstractC0298a {

        /* renamed from: b */
        private AbstractC0297b.AbstractC0298a f686b;

        @Override // androidx.appcompat.view.AbstractC0297b.AbstractC0298a
        /* renamed from: a */
        public void mo884a(AbstractC0297b bVar) {
            this.f686b.mo884a(bVar);
            if (AppCompatDelegateImpl.this.f641i != null) {
                AppCompatDelegateImpl.this.f635c.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f642j);
            }
            if (AppCompatDelegateImpl.this.f640h != null) {
                AppCompatDelegateImpl.this.mo858u();
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.f643k = ViewCompat.m4103r(appCompatDelegateImpl.f640h).mo4723a(BitmapDescriptorFactory.HUE_RED);
                AppCompatDelegateImpl.this.f643k.mo4727a(new C0929z() {
                    /* class androidx.appcompat.app.AppCompatDelegateImpl.C0244c.C02451 */

                    @Override // androidx.core.view.C0929z, androidx.core.view.AbstractC0928y
                    /* renamed from: b */
                    public void mo869b(View view) {
                        AppCompatDelegateImpl.this.f640h.setVisibility(8);
                        if (AppCompatDelegateImpl.this.f641i != null) {
                            AppCompatDelegateImpl.this.f641i.dismiss();
                        } else if (AppCompatDelegateImpl.this.f640h.getParent() instanceof View) {
                            ViewCompat.m4108w((View) AppCompatDelegateImpl.this.f640h.getParent());
                        }
                        AppCompatDelegateImpl.this.f640h.removeAllViews();
                        AppCompatDelegateImpl.this.f643k.mo4727a((AbstractC0928y) null);
                        AppCompatDelegateImpl.this.f643k = null;
                        ViewCompat.m4108w(AppCompatDelegateImpl.this.f644l);
                    }
                });
            }
            if (AppCompatDelegateImpl.this.f636d != null) {
                AppCompatDelegateImpl.this.f636d.onSupportActionModeFinished(AppCompatDelegateImpl.this.f639g);
            }
            AppCompatDelegateImpl.this.f639g = null;
            ViewCompat.m4108w(AppCompatDelegateImpl.this.f644l);
        }

        public C0244c(AbstractC0297b.AbstractC0298a aVar) {
            this.f686b = aVar;
        }

        @Override // androidx.appcompat.view.AbstractC0297b.AbstractC0298a
        /* renamed from: a */
        public boolean mo885a(AbstractC0297b bVar, Menu menu) {
            return this.f686b.mo885a(bVar, menu);
        }

        @Override // androidx.appcompat.view.AbstractC0297b.AbstractC0298a
        /* renamed from: a */
        public boolean mo886a(AbstractC0297b bVar, MenuItem menuItem) {
            return this.f686b.mo886a(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.AbstractC0297b.AbstractC0298a
        /* renamed from: b */
        public boolean mo887b(AbstractC0297b bVar, Menu menu) {
            ViewCompat.m4108w(AppCompatDelegateImpl.this.f644l);
            return this.f686b.mo887b(bVar, menu);
        }
    }

    /* renamed from: c */
    private boolean m785c(boolean z) {
        if (this.f650r) {
            return false;
        }
        int F = m766F();
        boolean b = m780b(mo828a(this.f634b, F), z);
        if (F == 0) {
            m783c(this.f634b).mo902d();
        } else {
            AbstractC0248f fVar = this.f629W;
            if (fVar != null) {
                fVar.mo903e();
            }
        }
        if (F == 3) {
            m786d(this.f634b).mo902d();
        } else {
            AbstractC0248f fVar2 = this.f630X;
            if (fVar2 != null) {
                fVar2.mo903e();
            }
        }
        return b;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: d */
    public boolean mo820d(int i) {
        int k = m790k(i);
        if (this.f649q && k == 108) {
            return false;
        }
        if (this.f645m && k == 1) {
            this.f645m = false;
        }
        if (k == 1) {
            m765E();
            this.f649q = true;
            return true;
        } else if (k == 2) {
            m765E();
            this.f616J = true;
            return true;
        } else if (k == 5) {
            m765E();
            this.f617K = true;
            return true;
        } else if (k == 10) {
            m765E();
            this.f647o = true;
            return true;
        } else if (k == 108) {
            m765E();
            this.f645m = true;
            return true;
        } else if (k != 109) {
            return this.f635c.requestFeature(k);
        } else {
            m765E();
            this.f646n = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo847i(int i) {
        PanelFeatureState a;
        PanelFeatureState a2 = mo831a(i, true);
        if (a2.f670j != null) {
            Bundle bundle = new Bundle();
            a2.f670j.mo1415c(bundle);
            if (bundle.size() > 0) {
                a2.f679s = bundle;
            }
            a2.f670j.mo1432h();
            a2.f670j.clear();
        }
        a2.f678r = true;
        a2.f677q = true;
        if ((i == 108 || i == 0) && this.f609C != null && (a = mo831a(0, false)) != null) {
            a.f673m = false;
            m782b(a, (KeyEvent) null);
        }
    }

    /* renamed from: a */
    private void m772a(Window window) {
        if (this.f635c == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0246d)) {
                C0246d dVar = new C0246d(callback);
                this.f607A = dVar;
                window.setCallback(dVar);
                C0427af a = C0427af.m1777a(this.f634b, (AttributeSet) null, f603w);
                Drawable b = a.mo2481b(0);
                if (b != null) {
                    window.setBackgroundDrawable(b);
                }
                a.mo2482b();
                this.f635c = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: b */
    public static void m778b(AppCompatDelegateImpl appCompatDelegateImpl) {
        try {
            ViewGroup viewGroup = appCompatDelegateImpl.f644l;
            if (viewGroup != null && ((ContentFrameLayout) viewGroup.findViewById(16908290)) == null) {
                StringBuilder sb = new StringBuilder("start fix ContentFrameLayoutNPE  \n");
                Window window = appCompatDelegateImpl.f635c;
                Field a = C26254af.m95001a(Class.forName("com.android.internal.policy.PhoneWindow"), "mContentParent");
                a.setAccessible(true);
                ViewGroup viewGroup2 = (ViewGroup) a.get(window);
                ViewGroup viewGroup3 = (ViewGroup) window.findViewById(16908290);
                sb.append("android.R.id.content is16908290  \n");
                sb.append("Window.ID_ANDROID_CONTENT is 16908290  \n");
                sb.append(" PhoneWindow contentParent id is " + viewGroup2.getId() + "  \n");
                if (viewGroup3 == null) {
                    sb.append(" windowContentView is null  \n");
                    if (viewGroup.getParent() == viewGroup2) {
                        viewGroup2.removeView(viewGroup);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                        sb.append(" fix NPE success  \n");
                    }
                    window.setContentView(viewGroup);
                }
                com.ss.android.lark.log.Log.m165387e("ContentFrameLayoutNPE", (Throwable) new Exception(sb.toString()), true);
            }
        } catch (Throwable th) {
            com.ss.android.lark.log.Log.m165383e("ContentFrameLayoutNPE", th.getMessage());
        }
        appCompatDelegateImpl.mo854q();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: c */
    public void mo817c(int i) {
        m761A();
        ViewGroup viewGroup = (ViewGroup) this.f644l.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f634b).inflate(i, viewGroup);
        this.f607A.mo1199a().onContentChanged();
    }

    /* renamed from: b */
    private void m779b(boolean z) {
        AbstractC0458n nVar = this.f609C;
        if (nVar == null || !nVar.mo1709e() || (ViewConfiguration.get(this.f634b).hasPermanentMenuKey() && !this.f609C.mo1712g())) {
            PanelFeatureState a = mo831a(0, true);
            a.f677q = true;
            mo835a(a, false);
            m773a(a, (KeyEvent) null);
            return;
        }
        Window.Callback n = mo849n();
        if (this.f609C.mo1710f() && z) {
            this.f609C.mo1720i();
            if (!this.f650r) {
                n.onPanelClosed(108, mo831a(0, true).f670j);
            }
        } else if (n != null && !this.f650r) {
            if (this.f651s && (this.f652t & 1) != 0) {
                this.f635c.getDecorView().removeCallbacks(this.f631Y);
                this.f631Y.run();
            }
            PanelFeatureState a2 = mo831a(0, true);
            if (a2.f670j != null && !a2.f678r && n.onPreparePanel(0, a2.f669i, a2.f670j)) {
                n.onMenuOpened(108, a2.f670j);
                this.f609C.mo1719h();
            }
        }
    }

    /* renamed from: b */
    private boolean m781b(PanelFeatureState panelFeatureState) {
        Context context = this.f634b;
        if ((panelFeatureState.f661a == 0 || panelFeatureState.f661a == 108) && this.f609C != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(theme2);
                context = contextThemeWrapper;
            }
        }
        C0322f fVar = new C0322f(context);
        fVar.mo1390a(this);
        panelFeatureState.mo872a(fVar);
        return true;
    }

    /* renamed from: a */
    private boolean m774a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f635c.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.m4015I((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    private static class C0254k {
        /* renamed from: a */
        static void m891a(android.view.ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    AppCompatDelegateImpl(Activity activity, AppCompatCallback appCompatCallback) {
        this(activity, null, appCompatCallback, activity);
    }

    AppCompatDelegateImpl(Dialog dialog, AppCompatCallback appCompatCallback) {
        this(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    /* renamed from: d */
    private boolean m787d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState a = mo831a(i, true);
        if (!a.f675o) {
            return m782b(a, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m780b(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f634b
            r1 = 0
            android.content.res.Configuration r0 = r6.m768a(r0, r7, r1)
            boolean r2 = r6.m767G()
            android.content.Context r3 = r6.f634b
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.f622P
            if (r8 == 0) goto L_0x0047
            boolean r8 = androidx.appcompat.app.AppCompatDelegateImpl.f604x
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.f623Q
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f633a
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f633a
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.ActivityCompat.recreate(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.m771a(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f633a
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            r8.onNightModeChanged(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m780b(int, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m788e(int r4, android.view.KeyEvent r5) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m788e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    private static Configuration m769a(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            if (configuration.fontScale != configuration2.fontScale) {
                configuration3.fontScale = configuration2.fontScale;
            }
            if (configuration.mcc != configuration2.mcc) {
                configuration3.mcc = configuration2.mcc;
            }
            if (configuration.mnc != configuration2.mnc) {
                configuration3.mnc = configuration2.mnc;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                C0252i.m889a(configuration, configuration2, configuration3);
            } else if (!C0843d.m3987a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            if (configuration.touchscreen != configuration2.touchscreen) {
                configuration3.touchscreen = configuration2.touchscreen;
            }
            if (configuration.keyboard != configuration2.keyboard) {
                configuration3.keyboard = configuration2.keyboard;
            }
            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                configuration3.keyboardHidden = configuration2.keyboardHidden;
            }
            if (configuration.navigation != configuration2.navigation) {
                configuration3.navigation = configuration2.navigation;
            }
            if (configuration.navigationHidden != configuration2.navigationHidden) {
                configuration3.navigationHidden = configuration2.navigationHidden;
            }
            if (configuration.orientation != configuration2.orientation) {
                configuration3.orientation = configuration2.orientation;
            }
            if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                configuration3.screenLayout |= configuration2.screenLayout & 15;
            }
            if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                configuration3.screenLayout |= configuration2.screenLayout & 192;
            }
            if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                configuration3.screenLayout |= configuration2.screenLayout & 48;
            }
            if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                configuration3.screenLayout |= configuration2.screenLayout & 768;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                C0253j.m890a(configuration, configuration2, configuration3);
            }
            if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                configuration3.uiMode |= configuration2.uiMode & 15;
            }
            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                configuration3.uiMode |= configuration2.uiMode & 48;
            }
            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                configuration3.screenWidthDp = configuration2.screenWidthDp;
            }
            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                configuration3.screenHeightDp = configuration2.screenHeightDp;
            }
            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                C0251h.m888a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo843c(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & SmActions.ACTION_ONTHECALL_EXIT) == 0) {
                z = false;
            }
            this.f621O = z;
        } else if (i == 82) {
            m787d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m773a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        if (!panelFeatureState.f675o && !this.f650r) {
            if (panelFeatureState.f661a == 0) {
                if ((this.f634b.getResources().getConfiguration().screenLayout & 15) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            Window.Callback n = mo849n();
            if (n == null || n.onMenuOpened(panelFeatureState.f661a, panelFeatureState.f670j)) {
                WindowManager windowManager = (WindowManager) this.f634b.getSystemService("window");
                if (windowManager != null && m782b(panelFeatureState, keyEvent)) {
                    if (panelFeatureState.f667g == null || panelFeatureState.f677q) {
                        if (panelFeatureState.f667g == null) {
                            if (!m775a(panelFeatureState) || panelFeatureState.f667g == null) {
                                return;
                            }
                        } else if (panelFeatureState.f677q && panelFeatureState.f667g.getChildCount() > 0) {
                            panelFeatureState.f667g.removeAllViews();
                        }
                        if (!m784c(panelFeatureState) || !panelFeatureState.mo873a()) {
                            panelFeatureState.f677q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f668h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        panelFeatureState.f667g.setBackgroundResource(panelFeatureState.f662b);
                        ViewParent parent = panelFeatureState.f668h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(panelFeatureState.f668h);
                        }
                        panelFeatureState.f667g.addView(panelFeatureState.f668h, layoutParams2);
                        if (!panelFeatureState.f668h.hasFocus()) {
                            panelFeatureState.f668h.requestFocus();
                        }
                    } else if (!(panelFeatureState.f669i == null || (layoutParams = panelFeatureState.f669i.getLayoutParams()) == null || layoutParams.width != -1)) {
                        i = -1;
                        panelFeatureState.f674n = false;
                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f664d, panelFeatureState.f665e, 1002, 8519680, -3);
                        layoutParams3.gravity = panelFeatureState.f663c;
                        layoutParams3.windowAnimations = panelFeatureState.f666f;
                        windowManager.addView(panelFeatureState.f667g, layoutParams3);
                        panelFeatureState.f675o = true;
                        return;
                    }
                    i = -2;
                    panelFeatureState.f674n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f664d, panelFeatureState.f665e, 1002, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.f663c;
                    layoutParams32.windowAnimations = panelFeatureState.f666f;
                    windowManager.addView(panelFeatureState.f667g, layoutParams32);
                    panelFeatureState.f675o = true;
                    return;
                }
                return;
            }
            mo835a(panelFeatureState, true);
        }
    }

    /* renamed from: b */
    private boolean m782b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z2;
        AbstractC0458n nVar;
        AbstractC0458n nVar2;
        AbstractC0458n nVar3;
        if (this.f650r) {
            return false;
        }
        if (panelFeatureState.f673m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f620N;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            mo835a(panelFeatureState2, false);
        }
        Window.Callback n = mo849n();
        if (n != null) {
            panelFeatureState.f669i = n.onCreatePanelView(panelFeatureState.f661a);
        }
        if (panelFeatureState.f661a == 0 || panelFeatureState.f661a == 108) {
            z = true;
        } else {
            z = false;
        }
        if (z && (nVar3 = this.f609C) != null) {
            nVar3.mo1721j();
        }
        if (panelFeatureState.f669i == null && (!z || !(mo848m() instanceof C0266h))) {
            if (panelFeatureState.f670j == null || panelFeatureState.f678r) {
                if (panelFeatureState.f670j == null && (!m781b(panelFeatureState) || panelFeatureState.f670j == null)) {
                    return false;
                }
                if (z && this.f609C != null) {
                    if (this.f610D == null) {
                        this.f610D = new C0243b();
                    }
                    this.f609C.mo1701a(panelFeatureState.f670j, this.f610D);
                }
                panelFeatureState.f670j.mo1432h();
                if (!n.onCreatePanelMenu(panelFeatureState.f661a, panelFeatureState.f670j)) {
                    panelFeatureState.mo872a((C0322f) null);
                    if (z && (nVar2 = this.f609C) != null) {
                        nVar2.mo1701a(null, this.f610D);
                    }
                    return false;
                }
                panelFeatureState.f678r = false;
            }
            panelFeatureState.f670j.mo1432h();
            if (panelFeatureState.f679s != null) {
                panelFeatureState.f670j.mo1423d(panelFeatureState.f679s);
                panelFeatureState.f679s = null;
            }
            if (!n.onPreparePanel(0, panelFeatureState.f669i, panelFeatureState.f670j)) {
                if (z && (nVar = this.f609C) != null) {
                    nVar.mo1701a(null, this.f610D);
                }
                panelFeatureState.f670j.mo1434i();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            panelFeatureState.f676p = z2;
            panelFeatureState.f670j.setQwertyMode(panelFeatureState.f676p);
            panelFeatureState.f670j.mo1434i();
        }
        panelFeatureState.f673m = true;
        panelFeatureState.f674n = false;
        this.f620N = panelFeatureState;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    public static class C0251h {
        /* renamed from: a */
        static void m888a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if (configuration.densityDpi != configuration2.densityDpi) {
                configuration3.densityDpi = configuration2.densityDpi;
            }
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    public static class C0252i {
        /* renamed from: a */
        static void m889a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    public static class C0253j {
        /* renamed from: a */
        static void m890a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    /* renamed from: a */
    private Configuration m768a(Context context, int i, Configuration configuration) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: a */
    private void m771a(int i, boolean z, Configuration configuration) {
        Resources resources = this.f634b.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            C0265g.m967a(resources);
        }
        int i2 = this.f626T;
        if (i2 != 0) {
            this.f634b.setTheme(i2);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f634b.getTheme().applyStyle(this.f626T, true);
            }
        }
        if (z) {
            Object obj = this.f633a;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f624R) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo830a(view, str, context, attributeSet);
    }

    private AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        SimpleArrayMap<String, Integer> simpleArrayMap;
        Integer num;
        AppCompatActivity D;
        this.f612F = true;
        this.f625S = -100;
        this.f631Y = new Runnable() {
            /* class androidx.appcompat.app.AppCompatDelegateImpl.RunnableC02342 */

            public void run() {
                if ((AppCompatDelegateImpl.this.f652t & 1) != 0) {
                    AppCompatDelegateImpl.this.mo847i(0);
                }
                if ((AppCompatDelegateImpl.this.f652t & 4096) != 0) {
                    AppCompatDelegateImpl.this.mo847i(108);
                }
                AppCompatDelegateImpl.this.f651s = false;
                AppCompatDelegateImpl.this.f652t = 0;
            }
        };
        this.f634b = context;
        this.f636d = appCompatCallback;
        this.f633a = obj;
        if (this.f625S == -100 && (obj instanceof Dialog) && (D = m764D()) != null) {
            this.f625S = D.getDelegate().mo827k();
        }
        if (this.f625S == -100 && (num = (simpleArrayMap = f601u).get(obj.getClass().getName())) != null) {
            this.f625S = num.intValue();
            simpleArrayMap.remove(obj.getClass().getName());
        }
        if (window != null) {
            m772a(window);
        }
        C0445f.m1908a();
    }
}
