package net.sqlcipher;

public class CursorWrapper extends android.database.CursorWrapper implements Cursor {
    private final Cursor mCursor;

    public Cursor getWrappedCursor() {
        return this.mCursor;
    }

    public CursorWrapper(Cursor cursor) {
        super(cursor);
        this.mCursor = cursor;
    }

    @Override // net.sqlcipher.Cursor
    public int getType(int i) {
        return this.mCursor.getType(i);
    }
}
