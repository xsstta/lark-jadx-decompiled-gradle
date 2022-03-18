package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: androidx.appcompat.view.h */
public class Window$CallbackC0308h implements Window.Callback {

    /* renamed from: b */
    final Window.Callback f937b;

    /* renamed from: a */
    public final Window.Callback mo1199a() {
        return this.f937b;
    }

    public void onAttachedToWindow() {
        this.f937b.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f937b.onContentChanged();
    }

    public void onDetachedFromWindow() {
        this.f937b.onDetachedFromWindow();
    }

    public boolean onSearchRequested() {
        return this.f937b.onSearchRequested();
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f937b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f937b.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f937b.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f937b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f937b.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f937b.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f937b.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f937b.onActionModeStarted(actionMode);
    }

    public View onCreatePanelView(int i) {
        return this.f937b.onCreatePanelView(i);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f937b.onPointerCaptureChanged(z);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f937b.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f937b.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f937b.onWindowStartingActionMode(callback);
    }

    public Window$CallbackC0308h(Window.Callback callback) {
        if (callback != null) {
            this.f937b = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f937b.onSearchRequested(searchEvent);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f937b.onCreatePanelMenu(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f937b.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f937b.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f937b.onPanelClosed(i, menu);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f937b.onWindowStartingActionMode(callback, i);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f937b.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f937b.onProvideKeyboardShortcuts(list, menu, i);
    }
}
