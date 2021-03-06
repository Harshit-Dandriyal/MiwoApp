/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    ArrayList<Word> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("two", "2", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three", "3", R.drawable.number_three,R.raw.number_three));
        words.add(new Word("four", "4", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five", "5", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six", "6", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven", "7", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight", "8", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine", "9", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten", "10", R.drawable.number_ten, R.raw.number_ten));
        CustomAdapter itemsAdapter = new CustomAdapter(this, words,R.color.category_numbers);

        public void setOnClick(AdapterView.)
        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(itemsAdapter);

    }

}
