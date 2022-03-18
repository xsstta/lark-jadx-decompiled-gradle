package com.ss.android.videoshop.context;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.ss.android.videoshop.context.b */
public class Window$CallbackC64140b implements Window.Callback {

    /* renamed from: a */
    private Window.Callback f161979a;

    /* renamed from: a */
    public Window.Callback mo222105a() {
        return this.f161979a;
    }

    public void onAttachedToWindow() {
        this.f161979a.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f161979a.onContentChanged();
    }

    public void onDetachedFromWindow() {
        this.f161979a.onDetachedFromWindow();
    }

    public boolean onSearchRequested() {
        return this.f161979a.onSearchRequested();
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f161979a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f161979a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f161979a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f161979a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f161979a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f161979a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f161979a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f161979a.onActionModeStarted(actionMode);
    }

    public View onCreatePanelView(int i) {
        return this.f161979a.onCreatePanelView(i);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f161979a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f161979a.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f161979a.onWindowStartingActionMode(callback);
    }

    public Window$CallbackC64140b(Window.Callback callback) {
        if (callback != null) {
            this.f161979a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.f161979a.onSearchRequested(searchEvent);
        }
        return false;
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f161979a.onCreatePanelMenu(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f161979a.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f161979a.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f161979a.onPanelClosed(i, menu);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.f161979a.onWindowStartingActionMode(callback, i);
        }
        return null;
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f161979a.onPreparePanel(i, view, menu);
    }
}
