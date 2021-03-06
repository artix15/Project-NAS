package com.example.moham.zaker.Adapters;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;

import com.example.moham.zaker.Data.MyDBManager;
import com.example.moham.zaker.R;

public class WordListAdapter extends ResourceCursorAdapter {

    public WordListAdapter(Context context, Cursor cursor) {
        super(context, R.layout.word_entry_layout, cursor);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Get widgets
        TextView textTitle = view.findViewById(R.id.word);
        TextView textContent = view.findViewById(R.id.trans);

        // the word to the Word found in the database
        String word = cursor.getString(cursor.getColumnIndex(MyDBManager.COLUMN_WORD));
        textTitle.setText(word);

        // the translation to the Translation found in the database
        String translation = cursor.getString(cursor.getColumnIndex(MyDBManager.COLUMN_TRANSLATION));
        textContent.setText(translation);

    }
}
