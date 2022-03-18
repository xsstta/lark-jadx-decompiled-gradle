package com.bytedance.apm.block.p136a;

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

/* renamed from: com.bytedance.apm.block.a.i */
public abstract class AbstractWindow$CallbackC2862i implements Window.Callback {

    /* renamed from: b */
    protected Window.Callback f9138b;

    public void onAttachedToWindow() {
        this.f9138b.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f9138b.onContentChanged();
    }

    public void onDetachedFromWindow() {
        this.f9138b.onDetachedFromWindow();
    }

    public boolean onSearchRequested() {
        return this.f9138b.onSearchRequested();
    }

    public AbstractWindow$CallbackC2862i(Window.Callback callback) {
        this.f9138b = callback;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f9138b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f9138b.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f9138b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f9138b.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f9138b.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f9138b.onActionModeStarted(actionMode);
    }

    public View onCreatePanelView(int i) {
        return this.f9138b.onCreatePanelView(i);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f9138b.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f9138b.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f9138b.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f9138b.onSearchRequested(searchEvent);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f9138b.onCreatePanelMenu(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f9138b.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f9138b.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f9138b.onPanelClosed(i, menu);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f9138b.onWindowStartingActionMode(callback, i);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f9138b.onPreparePanel(i, view, menu);
    }
}
