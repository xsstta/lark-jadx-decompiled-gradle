package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.app.C0729b;
import androidx.navigation.Navigator;
import com.larksuite.suite.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Navigator.Name("activity")
/* renamed from: androidx.navigation.b */
public class C1243b extends Navigator<C1244a> {

    /* renamed from: a */
    private Context f4482a;

    /* renamed from: b */
    private Activity f4483b;

    /* renamed from: androidx.navigation.b$a */
    public static class C1244a extends NavDestination {

        /* renamed from: a */
        private Intent f4484a;

        /* renamed from: b */
        private String f4485b;

        /* access modifiers changed from: package-private */
        @Override // androidx.navigation.NavDestination
        /* renamed from: e */
        public boolean mo6251e() {
            return false;
        }

        /* renamed from: a */
        public final Intent mo6273a() {
            return this.f4484a;
        }

        /* renamed from: d */
        public final String mo6281d() {
            return this.f4485b;
        }

        /* renamed from: b */
        public final ComponentName mo6277b() {
            Intent intent = this.f4484a;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        /* renamed from: c */
        public final String mo6280c() {
            Intent intent = this.f4484a;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        @Override // androidx.navigation.NavDestination
        public String toString() {
            ComponentName b = mo6277b();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (b != null) {
                sb.append(" class=");
                sb.append(b.getClassName());
            } else {
                String c = mo6280c();
                if (c != null) {
                    sb.append(" action=");
                    sb.append(c);
                }
            }
            return sb.toString();
        }

        public C1244a(Navigator<? extends C1244a> navigator) {
            super(navigator);
        }

        /* renamed from: c */
        public final C1244a mo6279c(String str) {
            this.f4485b = str;
            return this;
        }

        /* renamed from: a */
        public final C1244a mo6274a(ComponentName componentName) {
            if (this.f4484a == null) {
                this.f4484a = new Intent();
            }
            this.f4484a.setComponent(componentName);
            return this;
        }

        /* renamed from: b */
        public final C1244a mo6278b(String str) {
            if (this.f4484a == null) {
                this.f4484a = new Intent();
            }
            this.f4484a.setAction(str);
            return this;
        }

        /* renamed from: a */
        public final C1244a mo6275a(Uri uri) {
            if (this.f4484a == null) {
                this.f4484a = new Intent();
            }
            this.f4484a.setData(uri);
            return this;
        }

        /* renamed from: a */
        public final C1244a mo6276a(String str) {
            if (this.f4484a == null) {
                this.f4484a = new Intent();
            }
            this.f4484a.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.NavDestination
        /* renamed from: a */
        public void mo6245a(Context context, AttributeSet attributeSet) {
            super.mo6245a(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{16842755, R.attr.action, R.attr.data, R.attr.dataPattern, R.attr.targetPackage});
            String string = obtainAttributes.getString(4);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            mo6276a(string);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                mo6274a(new ComponentName(context, string2));
            }
            mo6278b(obtainAttributes.getString(1));
            String string3 = obtainAttributes.getString(2);
            if (string3 != null) {
                mo6275a(Uri.parse(string3));
            }
            mo6279c(obtainAttributes.getString(3));
            obtainAttributes.recycle();
        }
    }

    /* renamed from: androidx.navigation.b$b */
    public static final class C1245b implements Navigator.AbstractC1241a {

        /* renamed from: a */
        private final int f4486a;

        /* renamed from: b */
        private final C0729b f4487b;

        /* renamed from: a */
        public int mo6282a() {
            return this.f4486a;
        }

        /* renamed from: b */
        public C0729b mo6283b() {
            return this.f4487b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo6270a() {
        return this.f4482a;
    }

    /* renamed from: b */
    public C1244a mo6267d() {
        return new C1244a(this);
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: c */
    public boolean mo6266c() {
        Activity activity = this.f4483b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    public C1243b(Context context) {
        this.f4482a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f4483b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    /* renamed from: a */
    public NavDestination mo6264a(C1244a aVar, Bundle bundle, C1275p pVar, Navigator.AbstractC1241a aVar2) {
        Intent intent;
        int intExtra;
        if (aVar.mo6273a() != null) {
            Intent intent2 = new Intent(aVar.mo6273a());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String d = aVar.mo6281d();
                if (!TextUtils.isEmpty(d)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(d);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + d);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z = aVar2 instanceof C1245b;
            if (z) {
                intent2.addFlags(((C1245b) aVar2).mo6282a());
            }
            if (!(this.f4482a instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (pVar != null && pVar.mo6382a()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f4483b;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar.mo6254h());
            Resources resources = mo6270a().getResources();
            if (pVar != null) {
                int f = pVar.mo6388f();
                int g = pVar.mo6389g();
                if ((f <= 0 || !resources.getResourceTypeName(f).equals("animator")) && (g <= 0 || !resources.getResourceTypeName(g).equals("animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", f);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", g);
                } else {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(f) + " and popExit resource " + resources.getResourceName(g) + "when launching " + aVar);
                }
            }
            if (z) {
                C0729b b = ((C1245b) aVar2).mo6283b();
                if (b != null) {
                    ActivityCompat.startActivity(this.f4482a, intent2, b.mo4236a());
                } else {
                    this.f4482a.startActivity(intent2);
                }
            } else {
                this.f4482a.startActivity(intent2);
            }
            if (pVar == null || this.f4483b == null) {
                return null;
            }
            int d2 = pVar.mo6385d();
            int e = pVar.mo6386e();
            if ((d2 > 0 && resources.getResourceTypeName(d2).equals("animator")) || (e > 0 && resources.getResourceTypeName(e).equals("animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(d2) + " and exit resource " + resources.getResourceName(e) + "when launching " + aVar);
                return null;
            } else if (d2 < 0 && e < 0) {
                return null;
            } else {
                this.f4483b.overridePendingTransition(Math.max(d2, 0), Math.max(e, 0));
                return null;
            }
        } else {
            throw new IllegalStateException("Destination " + aVar.mo6254h() + " does not have an Intent set.");
        }
    }
}
