package com.huawei.hms.site;

import android.app.assist.AssistContent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

/* renamed from: com.huawei.hms.site.o */
public class ActivityC23764o extends AppCompatActivity {

    /* renamed from: a */
    public static final String f58839a = "o";

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return super.dispatchKeyEvent(keyEvent);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("dispatchKeyEvent exception : "), f58839a, null, true);
            return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("dispatchTouchEvent exception : "), f58839a, null, true);
            return false;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public <T extends View> T findViewById(int i) {
        try {
            return (T) getWindow().findViewById(i);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("findViewById exception : "), f58839a, null, true);
            return null;
        }
    }

    public void finish() {
        try {
            super.finish();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("finish exception : "), f58839a, null, true);
        }
    }

    public void finishAffinity() {
        try {
            super.finishAffinity();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("finishAffinity: "), f58839a, null, true);
        }
    }

    public ComponentName getCallingActivity() {
        try {
            return super.getCallingActivity();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("getCallingActivity: "), f58839a, null, true);
            return null;
        }
    }

    public String getCallingPackage() {
        try {
            return super.getCallingPackage();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("getCallingPackage exception : "), f58839a, null, true);
            return null;
        }
    }

    public Uri getReferrer() {
        try {
            return super.getReferrer();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("getReferrer: "), f58839a, null, true);
            return null;
        }
    }

    @Override // android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.app.Activity
    public Object getSystemService(String str) {
        try {
            return super.getSystemService(str);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("finishAffinity: "), f58839a, null, true);
            return null;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            super.onActivityResult(i, i2, new C23766q(intent));
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onActivityResult exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onBackPressed exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onConfigurationChanged exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onCreate exception : "), f58839a, null, true);
        }
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        try {
            super.onCreate(bundle, persistableBundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onCreate exception : "), f58839a, null, true);
        }
    }

    public CharSequence onCreateDescription() {
        try {
            return super.onCreateDescription();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onCreateDescription exception : "), f58839a, null, true);
            return null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onDestroy exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            return super.onKeyDown(i, keyEvent);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onKeyDown exception : "), f58839a, null, true);
            return false;
        }
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        try {
            return super.onKeyLongPress(i, keyEvent);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onKeyLongPress exception : "), f58839a, null, true);
            return false;
        }
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        try {
            return super.onKeyMultiple(i, i2, keyEvent);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onKeyMultiple exception : "), f58839a, null, true);
            return false;
        }
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        try {
            return super.onKeyShortcut(i, keyEvent);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onKeyShortcut exception : "), f58839a, null, true);
            return false;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            return super.onKeyUp(i, keyEvent);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onKeyUp exception : "), f58839a, null, true);
            return false;
        }
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        try {
            super.onMultiWindowModeChanged(z, configuration);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onMultiWindowModeChanged exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        try {
            super.onNewIntent(intent);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onNewIntent exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onPause exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public void onPostCreate(Bundle bundle) {
        try {
            super.onPostCreate(bundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onPostCreate exception : "), f58839a, null, true);
        }
    }

    public void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        try {
            super.onPostCreate(bundle, persistableBundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onPostCreate exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onPostResume() {
        try {
            super.onPostResume();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onPostResume exception : "), f58839a, null, true);
        }
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        try {
            super.onProvideAssistContent(assistContent);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onProvideAssistContent exception : "), f58839a, null, true);
        }
    }

    public void onProvideAssistData(Bundle bundle) {
        try {
            super.onProvideAssistData(bundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onProvideAssistData exception : "), f58839a, null, true);
        }
    }

    public Uri onProvideReferrer() {
        try {
            return super.onProvideReferrer();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onProvideReferrer: "), f58839a, null, true);
            return null;
        }
    }

    public void onRestart() {
        try {
            super.onRestart();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onRestart exception : "), f58839a, null, true);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        try {
            super.onRestoreInstanceState(bundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onRestoreInstanceState exception : "), f58839a, null, true);
        }
    }

    public void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        try {
            super.onRestoreInstanceState(bundle, persistableBundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onRestoreInstanceState exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onResume exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onSaveInstanceState exception : "), f58839a, null, true);
        }
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        try {
            super.onSaveInstanceState(bundle, persistableBundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onSaveInstanceState exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        try {
            super.onStart();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onStart exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onStateNotSaved() {
        try {
            super.onStateNotSaved();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onStateNotSaved exception : "), f58839a, null, true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        try {
            super.onStop();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onStop exception : "), f58839a, null, true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onKeyShortcut exception : "), f58839a, null, true);
            return false;
        }
    }

    public void onUserLeaveHint() {
        try {
            super.onUserLeaveHint();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("onUserLeaveHint exception : "), f58839a, null, true);
        }
    }

    public void recreate() {
        try {
            super.recreate();
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("recreate: "), f58839a, null, true);
        }
    }

    public void setIntent(Intent intent) {
        try {
            super.setIntent(new C23766q(intent));
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("setIntent: "), f58839a, null, true);
        }
    }

    public boolean showAssist(Bundle bundle) {
        try {
            return super.showAssist(bundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("showAssist exception : "), f58839a, null, true);
            return false;
        }
    }

    public void startActivities(Intent[] intentArr) {
        try {
            super.startActivities(intentArr);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("startActivities: "), f58839a, null, true);
        }
    }

    public void startActivities(Intent[] intentArr, Bundle bundle) {
        try {
            super.startActivities(intentArr, bundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("startActivities: "), f58839a, null, true);
        }
    }

    public void startActivity(Intent intent) {
        try {
            super.startActivity(new C23766q(intent));
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("startActivity: "), f58839a, null, true);
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        try {
            super.startActivity(new C23766q(intent), bundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("startActivity: "), f58839a, null, true);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void startActivityForResult(Intent intent, int i) {
        try {
            super.startActivityForResult(new C23766q(intent), i);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("startActivity: "), f58839a, null, true);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        try {
            super.startActivityForResult(new C23766q(intent), i, bundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("startActivity: "), f58839a, null, true);
        }
    }

    public boolean startActivityIfNeeded(Intent intent, int i) {
        try {
            return super.startActivityIfNeeded(intent, i);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("startActivityIfNeeded: "), f58839a, null, true);
            return false;
        }
    }

    public boolean startActivityIfNeeded(Intent intent, int i, Bundle bundle) {
        try {
            return super.startActivityIfNeeded(intent, i, bundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("startActivityIfNeeded: "), f58839a, null, true);
            return false;
        }
    }

    public boolean startNextMatchingActivity(Intent intent) {
        try {
            return super.startNextMatchingActivity(intent);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("startNextMatchingActivity: "), f58839a, null, true);
            return false;
        }
    }

    public boolean startNextMatchingActivity(Intent intent, Bundle bundle) {
        try {
            return super.startNextMatchingActivity(intent, bundle);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("startNextMatchingActivity: "), f58839a, null, true);
            return false;
        }
    }

    public Intent getIntent() {
        try {
            return new C23766q(super.getIntent());
        } catch (Exception e) {
            String str = f58839a;
            StringBuilder a = C23738a.m86922a("getIntent: ");
            a.append(e.getMessage());
            C23761m.m86934a(str, a.toString(), null, true);
            return new C23766q(new Intent());
        }
    }
}
